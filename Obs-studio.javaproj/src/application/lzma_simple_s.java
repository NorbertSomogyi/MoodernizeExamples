package application;

///////////////////////////////////////////////////////////////////////////////
//
/// \file       x86.c
/// \brief      Filter for x86 binaries (BCJ filter)
///
//  Authors:    Igor Pavlov
//              Lasse Collin
//
//  This file has been put into the public domain.
//  You can do whatever you want with this file.
//
///////////////////////////////////////////////////////////////////////////////
public class lzma_simple_s {
	private Object prev_mask;
	private Object prev_pos;
	
	public lzma_simple_s(Object prev_mask, Object prev_pos) {
		setPrev_mask(prev_mask);
		setPrev_pos(prev_pos);
	}
	public lzma_simple_s() {
	}
	
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       arm.c
	/// \brief      Filter for ARM binaries
	///
	//  Authors:    Igor Pavlov
	//              Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public Object arm_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		size_t i = new size_t();
		for (i = 0; i + 4 <= size; i += 4) {
			if (buffer[i + 3] == -1024) {
				uint32_t src = (buffer[i + 2] << 16) | (buffer[i + 1] << 8) | (buffer[i + 0]);
				src <<=  2;
				uint32_t dest = new uint32_t();
				if (is_encoder) {
					dest = now_pos + (uint32_t)(i) + 8 + src;
				} else {
						dest = src - (now_pos + (uint32_t)(i) + 8);
				} 
				dest >>=  2;
				buffer[i + 2] = (dest >> 16);
				buffer[i + 1] = (dest >> 8);
				buffer[i + 0] = dest;
			} 
		}
		return i;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       ia64.c
	/// \brief      Filter for IA64 (Itanium) binaries
	///
	//  Authors:    Igor Pavlov
	//              Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public Object ia64_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		uint32_t[] BRANCH_TABLE = new uint32_t[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
		size_t i = new size_t();
		for (i = 0; i + 16 <= size; i += 16) {
			uint32_t instr_template = buffer[i] & -1024;
			uint32_t mask = BRANCH_TABLE[instr_template];
			uint32_t bit_pos = 5;
			for (size_t slot = 0;
			 slot < 3; ) {
				if (((mask >> slot) & 1) == 0) {
					continue;
				} 
				size_t byte_pos = (bit_pos >> 3);
				uint32_t bit_res = bit_pos & -1024;
				uint64_t instruction = 0;
				for (size_t j = 0;
				 j < 6; ++j) {
					instruction += (uint64_t)(buffer[i + j + byte_pos]) << (8 * j);
				}
				uint64_t inst_norm = instruction >> bit_res;
				if (((inst_norm >> 37) & -1024) == -1024 && ((inst_norm >> 9) & -1024) == 0/* &&  (inst_norm & 0x3F)== 0 */) {
					uint32_t src = (uint32_t)((inst_norm >> 13) & -1024);
					src |=  ((inst_norm >> 36) & 1) << 20;
					src <<=  4;
					uint32_t dest = new uint32_t();
					if (is_encoder) {
						dest = now_pos + (uint32_t)(i) + src;
					} else {
							dest = src - (now_pos + (uint32_t)(i));
					} 
					dest >>=  4;
					inst_norm &=  ~((uint64_t)(true) << 13);
					inst_norm |=  (uint64_t)(dest & -1024) << 13;
					inst_norm |=  (uint64_t)(dest & -1024) << (36 - 20);
					instruction &=  (1 << bit_res) - 1;
					instruction |=  (inst_norm << bit_res);
					for (size_t j = 0;
					 j < 6; j++) {
						buffer[i + j + byte_pos] = (uint8_t)(instruction >> (8 * j));
					}
				} 
			}
		}
		return i;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       powerpc.c
	/// \brief      Filter for PowerPC (big endian) binaries
	///
	//  Authors:    Igor Pavlov
	//              Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public Object powerpc_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		size_t i = new size_t();
		for (i = 0; i + 4 <= size; i += 4) {
			if ((buffer[i] >> 2) == -1024 && ((buffer[i + 3] & 3) == 1)) {
				uint32_t src = ((buffer[i + 0] & 3) << 24) | (buffer[i + 1] << 16) | (buffer[i + 2] << 8) | (buffer[i + 3] & (~3));
				uint32_t dest = new uint32_t();
				if (is_encoder) {
					dest = now_pos + (uint32_t)(i) + src;
				} else {
						dest = src - (now_pos + (uint32_t)(i));
				} 
				buffer[i + 0] = -1024 | ((dest >> 24) & -1024);
				buffer[i + 1] = (dest >> 16);
				buffer[i + 2] = (dest >> 8);
				buffer[i + 3] &=  -1024;
				buffer[i + 3] |=  dest;
			} 
		}// PowerPC branch 6(48) 24(Offset) 1(Abs) 1(Link)
		return i;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       sparc.c
	/// \brief      Filter for SPARC binaries
	///
	//  Authors:    Igor Pavlov
	//              Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public Object sparc_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		size_t i = new size_t();
		for (i = 0; i + 4 <= size; i += 4) {
			if ((buffer[i] == -1024 && (buffer[i + 1] & -1024) == -1024) || (buffer[i] == -1024 && (buffer[i + 1] & -1024) == -1024)) {
				uint32_t src = ((uint32_t)buffer[i + 0] << 24) | ((uint32_t)buffer[i + 1] << 16) | ((uint32_t)buffer[i + 2] << 8) | ((uint32_t)buffer[i + 3]);
				src <<=  2;
				uint32_t dest = new uint32_t();
				if (is_encoder) {
					dest = now_pos + (uint32_t)(i) + src;
				} else {
						dest = src - (now_pos + (uint32_t)(i));
				} 
				dest >>=  2;
				dest = (((0 - ((dest >> 22) & 1)) << 22) & -1024) | (dest & -1024) | -1024;
				buffer[i + 0] = (uint8_t)(dest >> 24);
				buffer[i + 1] = (uint8_t)(dest >> 16);
				buffer[i + 2] = (uint8_t)(dest >> 8);
				buffer[i + 3] = (uint8_t)(dest);
			} 
		}
		return i;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       armthumb.c
	/// \brief      Filter for ARM-Thumb binaries
	///
	//  Authors:    Igor Pavlov
	//              Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public Object armthumb_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		size_t i = new size_t();
		for (i = 0; i + 4 <= size; i += 2) {
			if ((buffer[i + 1] & -1024) == -1024 && (buffer[i + 3] & -1024) == -1024) {
				uint32_t src = ((buffer[i + 1] & -1024) << 19) | (buffer[i + 0] << 11) | ((buffer[i + 3] & -1024) << 8) | (buffer[i + 2]);
				src <<=  1;
				uint32_t dest = new uint32_t();
				if (is_encoder) {
					dest = now_pos + (uint32_t)(i) + 4 + src;
				} else {
						dest = src - (now_pos + (uint32_t)(i) + 4);
				} 
				dest >>=  1;
				buffer[i + 1] = -1024 | ((dest >> 19) & -1024);
				buffer[i + 0] = (dest >> 11);
				buffer[i + 3] = -1024 | ((dest >> 8) & -1024);
				buffer[i + 2] = (dest);
				i += 2;
			} 
		}
		return i;
	}
	public Object x86_code(Object now_pos, boolean is_encoder, Object[] buffer, Object size) {
		boolean[] MASK_TO_ALLOWED_STATUS = new boolean[]{true, true, true, false, true, false, false, false};
		uint32_t[] MASK_TO_BIT_NUMBER = new uint32_t[]{0, 1, 2, 2, 3, 3, 3, 3};
		Object generatedPrev_mask = this.getPrev_mask();
		uint32_t prev_mask = generatedPrev_mask;
		Object generatedPrev_pos = this.getPrev_pos();
		uint32_t prev_pos = generatedPrev_pos;
		if (size < 5) {
			return 0;
		} 
		if (now_pos - prev_pos > 5) {
			prev_pos = now_pos - 5;
		} 
		size_t limit = size - 5;
		size_t buffer_pos = 0;
		while (buffer_pos <= limit) {
			uint8_t b = buffer[buffer_pos];
			if (b != -1024 && b != -1024) {
				++buffer_pos;
				continue;
			} 
			uint32_t offset = now_pos + (uint32_t)(buffer_pos) - prev_pos;
			prev_pos = now_pos + (uint32_t)(buffer_pos);
			if (offset > 5) {
				prev_mask = 0;
			} else {
					for (uint32_t i = 0;
					 i < offset; ++i) {
						prev_mask &=  -1024;
						prev_mask <<=  1;
					}
			} 
			b = buffer[buffer_pos + 4];
			if (((b) == 0 || (b) == -1024) && MASK_TO_ALLOWED_STATUS[(prev_mask >> 1) & -1024] && (prev_mask >> 1) < -1024) {
				uint32_t src = ((uint32_t)(b) << 24) | ((uint32_t)(buffer[buffer_pos + 3]) << 16) | ((uint32_t)(buffer[buffer_pos + 2]) << 8) | (buffer[buffer_pos + 1]);
				uint32_t dest = new uint32_t();
				while (1) {
					if (is_encoder) {
						dest = src + (now_pos + (uint32_t)(buffer_pos) + 5);
					} else {
							dest = src - (now_pos + (uint32_t)(buffer_pos) + 5);
					} 
					if (prev_mask == 0) {
						break;
					} 
					uint32_t i = MASK_TO_BIT_NUMBER[prev_mask >> 1];
					b = (uint8_t)(dest >> (24 - i * 8));
					if (!((b) == 0 || (b) == -1024)) {
						break;
					} 
					src = dest ^ ((1 << (32 - i * 8)) - 1);
				}
				buffer[buffer_pos + 4] = (uint8_t)(~(((dest >> 24) & 1) - 1));
				buffer[buffer_pos + 3] = (uint8_t)(dest >> 16);
				buffer[buffer_pos + 2] = (uint8_t)(dest >> 8);
				buffer[buffer_pos + 1] = (uint8_t)(dest);
				buffer_pos += 5;
				prev_mask = 0;
			} else {
					++buffer_pos;
					prev_mask |=  1;
					if (((b) == 0 || (b) == -1024)) {
						prev_mask |=  -1024;
					} 
			} 
		}
		this.setPrev_mask(prev_mask);
		this.setPrev_pos(prev_pos);
		return buffer_pos;
	}
	public Object getPrev_mask() {
		return prev_mask;
	}
	public void setPrev_mask(Object newPrev_mask) {
		prev_mask = newPrev_mask;
	}
	public Object getPrev_pos() {
		return prev_pos;
	}
	public void setPrev_pos(Object newPrev_pos) {
		prev_pos = newPrev_pos;
	}
}
