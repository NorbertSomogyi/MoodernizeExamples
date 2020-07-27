package application;

/*
 * Branch/Call/Jump (BCJ) filter decoders
 *
 * Authors: Lasse Collin <lasse.collin@tukaani.org>
 *          Igor Pavlov <http://7-zip.org/>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/*
 * The rest of the file is inside this ifdef. It makes things a little more
 * convenient when building without support for any BCJ filters.
 */
public class xz_dec_bcj {
	private  type;
	private xz_ret ret;
	private boolean single_call;
	private Object pos;
	private Object x86_prev_mask;
	private Object out;
	private Object out_pos;
	private Object out_size;
	private  temp;
	
	public xz_dec_bcj( type, xz_ret ret, boolean single_call, Object pos, Object x86_prev_mask, Object out, Object out_pos, Object out_size,  temp) {
		setType(type);
		setRet(ret);
		setSingle_call(single_call);
		setPos(pos);
		setX86_prev_mask(x86_prev_mask);
		setOut(out);
		setOut_pos(out_pos);
		setOut_size(out_size);
		setTemp(temp);
	}
	public xz_dec_bcj() {
	}
	
	public Object bcj_x86(Object[] buf, Object size) {
		boolean[] mask_to_allowed_status = new boolean[]{true, true, true, false, true, false, false, false};
		uint8_t[] mask_to_bit_num = new uint8_t[]{0, 1, 2, 2, 3, 3, 3, 3};
		size_t i = new size_t();
		size_t prev_pos = (size_t)-1;
		Object generatedX86_prev_mask = this.getX86_prev_mask();
		uint32_t prev_mask = generatedX86_prev_mask;
		uint32_t src = new uint32_t();
		uint32_t dest = new uint32_t();
		uint32_t j = new uint32_t();
		uint8_t b = new uint8_t();
		if (size <= 4) {
			return 0;
		} 
		size -= 4;
		Object generatedPos = this.getPos();
		for (i = 0; i < size; ++i) {
			if ((buf[i] & -1024) != -1024) {
				continue;
			} 
			prev_pos = i - prev_pos;
			if (prev_pos > 3) {
				prev_mask = 0;
			} else {
					prev_mask = (prev_mask << (prev_pos - 1)) & 7;
					if (prev_mask != 0) {
						b = buf[i + 4 - mask_to_bit_num[prev_mask]];
						if (!mask_to_allowed_status[prev_mask] || ModernizedCProgram.bcj_x86_test_msbyte(b)) {
							prev_pos = i;
							prev_mask = (prev_mask << 1) | 1;
							continue;
						} 
					} 
			} 
			prev_pos = i;
			if (ModernizedCProgram.bcj_x86_test_msbyte(buf[i + 4])) {
				src = ModernizedCProgram.get_unaligned_le32(buf + i + 1);
				while (1) {
					dest = src - (generatedPos + (uint32_t)i + 5);
					if (prev_mask == 0) {
						break;
					} 
					j = mask_to_bit_num[prev_mask] * 8;
					b = (uint8_t)(dest >> (24 - j));
					if (!ModernizedCProgram.bcj_x86_test_msbyte(b)) {
						break;
					} 
					src = dest ^ (((uint32_t)1 << (32 - j)) - 1);
				}
				dest &=  -1024;
				dest |=  (uint32_t)0 - (dest & -1024);
				ModernizedCProgram.put_unaligned_le32(dest, buf + i + 1);
				i += 4;
			} else {
					prev_mask = (prev_mask << 1) | 1;
			} 
		}
		prev_pos = i - prev_pos;
		this.setX86_prev_mask(prev_pos > 3 ? 0 : prev_mask << (prev_pos - 1));
		return i;
	}
	/* Instruction normalized with bit_res for easier manipulation */
	/*
	 * Apply the selected BCJ filter. Update *pos and s->pos to match the amount
	 * of data that got filtered.
	 *
	 * NOTE: This is implemented as a switch statement to avoid using function
	 * pointers, which could be problematic in the kernel boot code, which must
	 * avoid pointers to static data (at least on x86).
	 */
	public void bcj_apply(Object buf, Object pos, Object size) {
		size_t filtered = new size_t();
		buf += pos;
		size -= pos;
		 generatedType = this.getType();
		switch (generatedType) {
		case .BCJ_X86:
				filtered = s.bcj_x86(buf, size);
				break;
		default:
				filtered = /* Never reached but silence compiler warnings. */0;
				break;
		}
		pos += filtered;
		Object generatedPos = this.getPos();
		generatedPos += (uint32_t)filtered/*
		 * Flush pending filtered data from temp to the output buffer.
		 * Move the remaining mixture of possibly filtered and unfiltered
		 * data to the beginning of temp.
		 */;
	}
	public xz_dec_bcj xz_dec_bcj_create(boolean single_call) {
		xz_dec_bcj s = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		if (s != ((Object)0)) {
			s.setSingle_call(single_call);
		} 
		return s;
	}
	public xz_ret xz_dec_bcj_reset(Object id) {
		switch (id) {
		case .BCJ_X86:
				break;
		default:
				return /* Unsupported Filter ID */xz_ret.XZ_OPTIONS_ERROR;
		}
		this.setType(id);
		this.setRet(xz_ret.XZ_OK);
		this.setPos(0);
		this.setX86_prev_mask(0);
		 generatedTemp = this.getTemp();
		generatedTemp.setFiltered(0);
		generatedTemp.setSize(0);
		return xz_ret.XZ_OK;
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public xz_ret getRet() {
		return ret;
	}
	public void setRet(xz_ret newRet) {
		ret = newRet;
	}
	public boolean getSingle_call() {
		return single_call;
	}
	public void setSingle_call(boolean newSingle_call) {
		single_call = newSingle_call;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getX86_prev_mask() {
		return x86_prev_mask;
	}
	public void setX86_prev_mask(Object newX86_prev_mask) {
		x86_prev_mask = newX86_prev_mask;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public Object getOut_pos() {
		return out_pos;
	}
	public void setOut_pos(Object newOut_pos) {
		out_pos = newOut_pos;
	}
	public Object getOut_size() {
		return out_size;
	}
	public void setOut_size(Object newOut_size) {
		out_size = newOut_size;
	}
	public  getTemp() {
		return temp;
	}
	public void setTemp( newTemp) {
		temp = newTemp;
	}
}
/* Type of the BCJ filter being used */
/*
	 * The local variables take a little bit stack space, but it's less
	 * than what LZMA2 decoder takes, so it doesn't make sense to reduce
	 * stack usage here without doing that for the LZMA2 decoder too.
	 */
/* Loop counters */
/* Instruction slot (0, 1, or 2) in the 128-bit instruction word */
/* Bitwise offset of the instruction indicated by slot */
/* bit_pos split into byte and bit parts */
/* Address part of an instruction */
/* Mask used to detect which instructions to convert */
/* 41-bit instruction stored somewhere in the lowest 48 bits */
