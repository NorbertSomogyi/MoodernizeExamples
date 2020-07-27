package application;

///////////////////////////////////////////////////////////////////////////////
//
/// \file       lz_decoder.c
/// \brief      LZ out window
///
//  Authors:    Igor Pavlov
//              Lasse Collin
//
//  This file has been put into the public domain.
//  You can do whatever you want with this file.
//
///////////////////////////////////////////////////////////////////////////////
// liblzma supports multiple LZ77-based filters. The LZ part is shared
// between these filters. The LZ code takes care of dictionary handling
// and passing the data between filters in the chain. The filter-specific
// part decodes from the input buffer to the dictionary.
public class lzma_coder_s {
	private  dict;
	private  lz;
	private lzma_next_coder_s next;
	private boolean next_finished;
	private boolean this_finished;
	private  temp;
	
	public lzma_coder_s( dict,  lz, lzma_next_coder_s next, boolean next_finished, boolean this_finished,  temp) {
		setDict(dict);
		setLz(lz);
		setNext(next);
		setNext_finished(next_finished);
		setThis_finished(this_finished);
		setTemp(temp);
	}
	public lzma_coder_s() {
	}
	
	public void lz_decoder_reset() {
		 generatedDict = this.getDict();
		generatedDict.setPos(0);
		generatedDict.setFull(0);
		Object generatedBuf = generatedDict.getBuf();
		Object generatedSize = generatedDict.getSize();
		generatedBuf[generatedSize - 1] = (byte)'\0';
		generatedDict.setNeed_reset(0);
		return /*Error: Unsupported expression*/;
	}
	public Object decode_buffer(Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size) {
		 generatedDict = this.getDict();
		Object generatedPos = generatedDict.getPos();
		Object generatedSize = generatedDict.getSize();
		 generatedLz = this.getLz();
		Object generatedCoder = generatedLz.getCoder();
		Object generatedBuf = generatedDict.getBuf();
		Object generatedNeed_reset = generatedDict.getNeed_reset();
		while (1) {
			if (generatedPos == generatedSize) {
				generatedDict.setPos(0);
			} 
			size_t dict_start = generatedPos;
			generatedDict.setLimit(generatedPos + ((out_size - out_pos) < (generatedSize - generatedPos) ? (out_size - out_pos) : (generatedSize - generatedPos)));
			 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, generatedDict, in, in_pos, in_size);
			size_t copy_size = generatedPos - dict_start;
			((copy_size <= out_size - out_pos) ? (Object)0 : /*Error: Function owner not recognized*/_assert("copy_size <= out_size - *out_pos", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_decoder.c", 96));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out + out_pos, generatedBuf + dict_start, copy_size);
			out_pos += copy_size;
			if (generatedNeed_reset) {
				coder.lz_decoder_reset();
				if (ret != LZMA_OK || out_pos == out_size) {
					return ret;
				} 
			} else {
					if (ret != LZMA_OK || out_pos == out_size || generatedPos < generatedSize) {
						return ret;
					} 
			} 
		}// Wrap the dictionary if needed.
		Object generatedDistance = this.getDistance();
		size_t distance = generatedDistance;
		Object generatedHistory = this.getHistory();
		Object generatedPos = this.getPos();
		for (size_t i = 0;
		 i < size; ++i) {
			buffer[i] += generatedHistory[(distance + generatedPos) & -1024];
			generatedHistory[generatedPos-- & -1024] = buffer[i];
		}
	}
	public Object lz_decode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedCode = generatedNext.getCode();
		if (generatedCode == ((Object)0)) {
			return coder.decode_buffer(in, in_pos, in_size, out, out_pos, out_size);
		} 
		boolean generatedNext_finished = this.getNext_finished();
		 generatedTemp = this.getTemp();
		Object generatedPos = generatedTemp.getPos();
		Object generatedSize = generatedTemp.getSize();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedBuffer = generatedTemp.getBuffer();
		boolean generatedThis_finished = this.getThis_finished();
		// We aren't the last coder in the chain, we need to decode// our input to a temporary buffer.while (out_pos < out_size) {
			if (!generatedNext_finished && generatedPos == generatedSize) {
				generatedTemp.setPos(0);
				generatedTemp.setSize(0);
				 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, generatedBuffer, generatedSize, 4096, action);
				if (ret == LZMA_STREAM_END) {
					this.setNext_finished(1);
				}  else if (ret != LZMA_OK || generatedSize == 0) {
					return ret;
				} 
			} 
			if (generatedThis_finished) {
				if (generatedSize != 0) {
					return LZMA_DATA_ERROR;
				} 
				if (generatedNext_finished) {
					return LZMA_STREAM_END;
				} 
				return LZMA_OK;
			} 
			 ret = coder.decode_buffer(generatedBuffer, generatedPos, generatedSize, out, out_pos, out_size);
			if (ret == LZMA_STREAM_END) {
				this.setThis_finished(1);
			}  else if (ret != LZMA_OK) {
				return ret;
			}  else if (generatedNext_finished && out_pos < out_size) {
				return LZMA_DATA_ERROR;
			} 
		}// Fill the temporary buffer if it is empty.
		return LZMA_OK;
	}
	public void lz_decoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		 generatedDict = this.getDict();
		Object generatedBuf = generatedDict.getBuf();
		ModernizedCProgram.lzma_free(generatedBuf, allocator);
		 generatedLz = this.getLz();
		Object generatedEnd = generatedLz.getEnd();
		Object generatedCoder = generatedLz.getCoder();
		if (generatedEnd != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator);
		} else {
				ModernizedCProgram.lzma_free(generatedCoder, allocator);
		} 
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public void lzma_lz_decoder_uncompressed(Object uncompressed_size) {
		 generatedLz = this.getLz();
		Object generatedCoder = generatedLz.getCoder();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, uncompressed_size);
	}
	public Object delta_decode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedCode = generatedNext.getCode();
		((generatedCode != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->next.code != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\delta_decoder.c", 35));
		size_t out_start = out_pos;
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
		coder.decode_buffer(out + out_start, out_pos - out_start);
		return ret;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       delta_encoder.c
	/// \brief      Delta filter encoder
	//
	//  Author:     Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	/// Copies and encodes the data at the same time. This is used when Delta
	/// is the first filter in the chain (and thus the last filter in the
	/// encoder's filter stack).
	public void copy_and_encode(Object[] in, Object[] out, Object size) {
		Object generatedDistance = this.getDistance();
		size_t distance = generatedDistance;
		Object generatedHistory = this.getHistory();
		Object generatedPos = this.getPos();
		for (size_t i = 0;
		 i < size; ++i) {
			uint8_t tmp = generatedHistory[(distance + generatedPos) & -1024];
			generatedHistory[generatedPos-- & -1024] = in[i];
			out[i] = in[i] - tmp;
		}
	}
	/// Encodes the data in place. This is used when we are the last filter
	/// in the chain (and thus non-last filter in the encoder's filter stack).
	public void encode_in_place(Object[] buffer, Object size) {
		Object generatedDistance = this.getDistance();
		size_t distance = generatedDistance;
		Object generatedHistory = this.getHistory();
		Object generatedPos = this.getPos();
		for (size_t i = 0;
		 i < size; ++i) {
			uint8_t tmp = generatedHistory[(distance + generatedPos) & -1024];
			generatedHistory[generatedPos-- & -1024] = buffer[i];
			buffer[i] -= tmp;
		}
	}
	public Object delta_encode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		 ret = new ();
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedCode = generatedNext.getCode();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		if (generatedCode == ((Object)0)) {
			size_t in_avail = in_size - in_pos;
			size_t out_avail = out_size - out_pos;
			size_t size = ((in_avail) < (out_avail) ? (in_avail) : (out_avail));
			coder.copy_and_encode(in + in_pos, out + out_pos, size);
			in_pos += size;
			out_pos += size;
			ret = action != LZMA_RUN && in_pos == in_size ? LZMA_STREAM_END : LZMA_OK;
		} else {
				size_t out_start = out_pos;
				ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
				coder.encode_in_place(out + out_start, out_pos - out_start);
		} 
		return ret;
	}
	public Object delta_encoder_update(Object allocator, Object filters_null, Object reversed_filters) {
		lzma_next_coder_s generatedNext = this.getNext();
		// Delta doesn't and will never support changing the options in// the middle of encoding. If the app tries to change them, we// simply ignore them.return generatedNext.lzma_next_filter_update(allocator, reversed_filters + 1);
	}
	public Object auto_decode(Object allocator, Object[] in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedMemlimit = this.getMemlimit();
		Object generatedFlags = this.getFlags();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedSequence = this.getSequence();
		switch (generatedSequence) {
		case .SEQ_CODE:
				{ 
					 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
					if (ret != LZMA_STREAM_END || (generatedFlags & LZMA_CONCATENATED) == 0) {
						return ret;
					} 
					this.setSequence(.SEQ_FINISH);
				}
		case .SEQ_FINISH:
				if (in_pos < in_size) {
					return LZMA_DATA_ERROR;
				} 
				return action == LZMA_FINISH ? LZMA_STREAM_END : LZMA_OK;
		case .SEQ_INIT:
				if (in_pos >= in_size) {
					return LZMA_OK;
				} 
				this.setSequence(.SEQ_CODE);
				if (in[in_pos] == -1024) {
					do {
						 ret_ = (generatedNext.lzma_stream_decoder_init(allocator, generatedMemlimit, generatedFlags));
						if (ret_ != LZMA_OK) {
							return ret_;
						} 
					} while (0);
				} else {
						do {
							 ret_ = (generatedNext.lzma_alone_decoder_init(allocator, generatedMemlimit, 1));
							if (ret_ != LZMA_OK) {
								return ret_;
							} 
						} while (0);
						if (generatedFlags & LZMA_TELL_NO_CHECK) {
							return LZMA_NO_CHECK;
						} 
						if (generatedFlags & LZMA_TELL_ANY_CHECK) {
							return LZMA_GET_CHECK;
						} 
				} 
		default:
				((false) ? (Object)0 : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\auto_decoder.c", 96));
				return LZMA_PROG_ERROR;
		}
	}
	public void auto_decoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object auto_decoder_memconfig(Object memusage, Object old_memlimit, Object new_memlimit) {
		 ret = new ();
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedMemconfig = generatedNext.getMemconfig();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedMemlimit = this.getMemlimit();
		if (generatedMemconfig != ((Object)0)) {
			ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, memusage, old_memlimit, new_memlimit);
			((old_memlimit == generatedMemlimit) ? (Object)0 : /*Error: Function owner not recognized*/_assert("*old_memlimit == coder->memlimit", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\auto_decoder.c", 129));
		} else {
				memusage = (-1024 << 15);
				old_memlimit = generatedMemlimit;
				ret = LZMA_OK;
		} 
		if (ret == LZMA_OK && new_memlimit != 0) {
			this.setMemlimit(new_memlimit);
		} 
		return ret;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       delta_common.c
	/// \brief      Common stuff for Delta encoder and decoder
	//
	//  Author:     Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	public void delta_coder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object alone_encode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedHeader = this.getHeader();
		Object generatedHeader_pos = this.getHeader_pos();
		lzma_next_coder_s generatedNext = this.getNext();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedSequence = this.getSequence();
		while (out_pos < out_size) {
			switch (generatedSequence) {
			case .SEQ_HEADER:
					ModernizedCProgram.lzma_bufcpy(generatedHeader, generatedHeader_pos, (1 + 4 + 8), out, out_pos, out_size);
					if (generatedHeader_pos < (1 + 4 + 8)) {
						return LZMA_OK;
					} 
					this.setSequence(.SEQ_CODE);
					break;
			case .SEQ_CODE:
					return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
			default:
					((false) ? (Object)0 : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\alone_encoder.c", 59));
					return LZMA_PROG_ERROR;
			}
		}
		return LZMA_OK;
	}
	public void alone_encoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object stream_decoder_reset(Object allocator) {
		Object generatedIndex_hash = this.getIndex_hash();
		// Initialize the Index hash used to verify the Index.// Initialize the Index hash used to verify the Index.this.setIndex_hash(ModernizedCProgram.lzma_index_hash_init(generatedIndex_hash, allocator));
		if (generatedIndex_hash == ((Object)0)) {
			return LZMA_MEM_ERROR;
		} 
		// Reset the rest of the variables.// Reset the rest of the variables.this.setSequence(.SEQ_STREAM_HEADER);
		this.setPos(0);
		return LZMA_OK;
	}
	public Object stream_decode(Object allocator, Object[] in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedBuffer = this.getBuffer();
		Object generatedPos = this.getPos();
		Object generatedStream_flags = this.getStream_flags();
		Object generatedFirst_stream = this.getFirst_stream();
		Object generatedBlock_options = this.getBlock_options();
		Object generatedTell_no_check = this.getTell_no_check();
		Object generatedTell_unsupported_check = this.getTell_unsupported_check();
		Object generatedTell_any_check = this.getTell_any_check();
		Object generatedMemlimit = this.getMemlimit();
		Object generatedBlock_decoder = this.getBlock_decoder();
		Object generatedIndex_hash = this.getIndex_hash();
		Object generatedConcatenated = this.getConcatenated();
		Object generatedSequence = this.getSequence();
		// When decoding the actual Block, it may be able to produce more// output even if we don't give it any new input.while (1) {
			switch (generatedSequence) {
			case .SEQ_STREAM_HEADER:
					{ 
						ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, generatedBuffer, generatedPos, LZMA_STREAM_HEADER_SIZE);
						if (generatedPos < LZMA_STREAM_HEADER_SIZE) {
							return LZMA_OK;
						} 
						this.setPos(0);
						 ret = ModernizedCProgram.lzma_stream_header_decode(generatedStream_flags, generatedBuffer);
						if (ret != LZMA_OK) {
							return ret == LZMA_FORMAT_ERROR && !generatedFirst_stream ? LZMA_DATA_ERROR : ret;
						} 
						this.setFirst_stream(0);
						generatedBlock_options.setCheck(generatedStream_flags.getCheck());
						this.setSequence(.SEQ_BLOCK_HEADER);
						if (generatedTell_no_check && generatedStream_flags.getCheck() == LZMA_CHECK_NONE) {
							return LZMA_NO_CHECK;
						} 
						if (generatedTell_unsupported_check && !ModernizedCProgram.lzma_check_is_supported(generatedStream_flags.getCheck())) {
							return LZMA_UNSUPPORTED_CHECK;
						} 
						if (generatedTell_any_check) {
							return LZMA_GET_CHECK;
						} 
					}
			case .SEQ_INDEX:
					{ 
						if (in_pos >= in_size) {
							return LZMA_OK;
						} 
						 ret = ModernizedCProgram.lzma_index_hash_decode(generatedIndex_hash, in, in_pos, in_size);
						if (ret != LZMA_STREAM_END) {
							return ret;
						} 
						this.setSequence(.SEQ_STREAM_FOOTER);
					}
			case .SEQ_STREAM_FOOTER:
					{ 
						ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, generatedBuffer, generatedPos, LZMA_STREAM_HEADER_SIZE);
						if (generatedPos < LZMA_STREAM_HEADER_SIZE) {
							return LZMA_OK;
						} 
						this.setPos(0);
						 footer_flags = new ();
						 ret = ModernizedCProgram.lzma_stream_footer_decode(footer_flags, generatedBuffer);
						if (ret != LZMA_OK) {
							return ret == LZMA_FORMAT_ERROR ? LZMA_DATA_ERROR : ret;
						} 
						if (ModernizedCProgram.lzma_index_hash_size(generatedIndex_hash) != footer_flags.getBackward_size()) {
							return LZMA_DATA_ERROR;
						} 
						do {
							 ret_ = (ModernizedCProgram.lzma_stream_flags_compare(generatedStream_flags, footer_flags));
							if (ret_ != LZMA_OK) {
								return ret_;
							} 
						} while (0);
						if (!generatedConcatenated) {
							return LZMA_STREAM_END;
						} 
						this.setSequence(.SEQ_STREAM_PADDING);
					}
			case .SEQ_BLOCK_HEADER:
					{ 
						if (in_pos >= in_size) {
							return LZMA_OK;
						} 
						if (generatedPos == 0) {
							if (in[in_pos] == -1024) {
								this.setSequence(.SEQ_INDEX);
								break;
							} 
							generatedBlock_options.setHeader_size(/*Error: Function owner not recognized*/lzma_block_header_size_decode(in[in_pos]));
						} 
						ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, generatedBuffer, generatedPos, generatedBlock_options.getHeader_size());
						if (generatedPos < generatedBlock_options.getHeader_size()) {
							return LZMA_OK;
						} 
						this.setPos(0);
						generatedBlock_options.setVersion(0);
						[] filters = new ();
						generatedBlock_options.setFilters(filters);
						do {
							 ret_ = (ModernizedCProgram.lzma_block_header_decode(generatedBlock_options, allocator, generatedBuffer));
							if (ret_ != LZMA_OK) {
								return ret_;
							} 
						} while (0);
						uint64_t memusage = ModernizedCProgram.lzma_raw_decoder_memusage(filters);
						 ret = new ();
						if (memusage == -1024) {
							ret = LZMA_OPTIONS_ERROR;
						} else {
								this.setMemusage(memusage);
								if (memusage > generatedMemlimit) {
									ret = LZMA_MEMLIMIT_ERROR;
								} else {
										ret = generatedBlock_decoder.lzma_block_decoder_init(allocator, generatedBlock_options);
								} 
						} 
						for (size_t i = 0;
						 i < LZMA_FILTERS_MAX; ++i) {
							ModernizedCProgram.lzma_free(filters[i].getOptions(), allocator);
						}
						generatedBlock_options.setFilters(((Object)0));
						if (ret != LZMA_OK) {
							return ret;
						} 
						this.setSequence(.SEQ_BLOCK);
					}
			case .SEQ_STREAM_PADDING:
					((generatedConcatenated) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->concatenated", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\stream_decoder.c", 322));
					while (1) {
						if (in_pos >= in_size) {
							if (action != LZMA_FINISH) {
								return LZMA_OK;
							} 
							return generatedPos == 0 ? LZMA_STREAM_END : LZMA_DATA_ERROR;
						} 
						if (in[in_pos] != -1024) {
							break;
						} 
						++in_pos;
						this.setPos((generatedPos + 1) & 3);
					}
					if (generatedPos != 0) {
						++in_pos;
						return LZMA_DATA_ERROR;
					} 
					do {
						 ret_ = (coder.stream_decoder_reset(allocator));
						if (ret_ != LZMA_OK) {
							return ret_;
						} 
					} while (0);
					break;
			case .SEQ_BLOCK:
					{ 
						 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedBlock_decoder.getCoder(), allocator, in, in_pos, in_size, out, out_pos, out_size, action);
						if (ret != LZMA_STREAM_END) {
							return ret;
						} 
						do {
							 ret_ = (ModernizedCProgram.lzma_index_hash_append(generatedIndex_hash, ModernizedCProgram.lzma_block_unpadded_size(generatedBlock_options), generatedBlock_options.getUncompressed_size()));
							if (ret_ != LZMA_OK) {
								return ret_;
							} 
						} while (0);
						this.setSequence(.SEQ_BLOCK_HEADER);
						break;
					}
			default:
					((false) ? (Object)0 : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\stream_decoder.c", 360));
					return LZMA_PROG_ERROR;
			}
		}
	}
	public void stream_decoder_end(Object allocator) {
		Object generatedBlock_decoder = this.getBlock_decoder();
		generatedBlock_decoder.lzma_next_end(allocator);
		Object generatedIndex_hash = this.getIndex_hash();
		ModernizedCProgram.lzma_index_hash_end(generatedIndex_hash, allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object stream_decoder_memconfig(Object memusage, Object old_memlimit, Object new_memlimit) {
		Object generatedMemusage = this.getMemusage();
		memusage = generatedMemusage;
		Object generatedMemlimit = this.getMemlimit();
		old_memlimit = generatedMemlimit;
		if (new_memlimit != 0) {
			if (new_memlimit < generatedMemusage) {
				return LZMA_MEMLIMIT_ERROR;
			} 
			this.setMemlimit(new_memlimit);
		} 
		return LZMA_OK;
	}
	public Object index_encode(Object allocator, Object in, Object in_pos, Object in_size, Object[] out, Object out_pos, Object out_size, Object action) {
		// Position where to start calculating CRC32. The idea is that we// need to call lzma_crc32() only once per call to index_encode().size_t out_start = out_pos;
		// Return value to use if we return at the end of this function.// We use "goto out" to jump out of the while-switch construct
		// instead of returning directly, because that way we don't need// to copypaste the lzma_crc32() call to many places. ret = LZMA_OK;
		Object generatedIndex = this.getIndex();
		Object generatedPos = this.getPos();
		Object generatedIter = this.getIter();
		Object generatedSequence = this.getSequence();
		Object generatedCrc32 = this.getCrc32();
		while (out_pos < out_size) {
			switch (generatedSequence) {
			case .SEQ_COUNT:
					{ 
						 count = ModernizedCProgram.lzma_index_block_count(generatedIndex);
						ret = ModernizedCProgram.lzma_vli_encode(count, generatedPos, out, out_pos, out_size);
						if (ret != LZMA_STREAM_END) {
							;
						} 
						ret = LZMA_OK;
						this.setPos(0);
						this.setSequence(.SEQ_NEXT);
						break;
					}
			case .SEQ_PADDING:
					if (generatedPos > 0) {
						--generatedPos;
						out[(out_pos)++] = -1024;
						break;
					} 
					this.setCrc32(ModernizedCProgram.lzma_crc32(out + out_start, out_pos - out_start, generatedCrc32));
					this.setSequence(.SEQ_CRC32);
			case .SEQ_UNCOMPRESSED:
					{ 
						 size = generatedSequence == .SEQ_UNPADDED ? generatedIter.getBlock().getUnpadded_size() : generatedIter.getBlock().getUncompressed_size();
						ret = ModernizedCProgram.lzma_vli_encode(size, generatedPos, out, out_pos, out_size);
						if (ret != LZMA_STREAM_END) {
							;
						} 
						ret = LZMA_OK;
						this.setPos(0);
						++generatedSequence;
						break;
					}
			case .SEQ_INDICATOR:
					out[out_pos] = -1024;
					++out_pos;
					this.setSequence(.SEQ_COUNT);
					break;
			case .SEQ_UNPADDED:
			case .SEQ_CRC32:
					do {
						if (out_pos == out_size) {
							return LZMA_OK;
						} 
						out[out_pos] = (generatedCrc32 >> (generatedPos * 8)) & -1024;
						++out_pos;
					} while (++generatedPos < 4);
					return LZMA_STREAM_END;
			case .SEQ_NEXT:
					if (generatedIter.lzma_index_iter_next(.LZMA_INDEX_ITER_BLOCK)) {
						this.setPos(ModernizedCProgram.lzma_index_padding_size(generatedIndex));
						((generatedPos <= 3) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->pos <= 3", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index_encoder.c", 89));
						this.setSequence(.SEQ_PADDING);
						break;
					} 
					this.setSequence(.SEQ_UNPADDED);
			default:
					((false) ? (Object)0 : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index_encoder.c", 148));
					return LZMA_PROG_ERROR;
			}
		}
		return ret;
	}
	public void index_encoder_end(Object allocator) {
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public void index_encoder_reset(Object i) {
		Object generatedIter = this.getIter();
		generatedIter.lzma_index_iter_init(i);
		this.setSequence(.SEQ_INDICATOR);
		this.setIndex(i);
		this.setPos(0);
		this.setCrc32(0);
		return /*Error: Unsupported expression*/;
	}
	// Match //
	///////////
	public void match(Object pos_state, Object distance, Object len) {
		Object generatedState = this.getState();
		this.setState(((generatedState) < 7 ? .STATE_LIT_MATCH : .STATE_NONLIT_MATCH));
		Object generatedRc = this.getRc();
		Object generatedMatch_len_encoder = this.getMatch_len_encoder();
		Object generatedFast_mode = this.getFast_mode();
		generatedRc.length(generatedMatch_len_encoder, pos_state, len, generatedFast_mode);
		uint32_t pos_slot = ModernizedCProgram.get_pos_slot(distance);
		uint32_t len_to_pos_state = ((len) < 4 + 2 ? (len) - 2 : 4 - 1);
		Object generatedPos_slot = this.getPos_slot();
		generatedRc.rc_bittree(generatedPos_slot[len_to_pos_state], 6, pos_slot);
		Object generatedPos_special = this.getPos_special();
		Object generatedPos_align = this.getPos_align();
		Object generatedAlign_price_count = this.getAlign_price_count();
		if (pos_slot >= 4) {
			uint32_t footer_bits = (pos_slot >> 1) - 1;
			uint32_t base = (2 | (pos_slot & 1)) << footer_bits;
			uint32_t pos_reduced = distance - base;
			if (pos_slot < 14) {
				generatedRc.rc_bittree_reverse(generatedPos_special + base - pos_slot - 1, footer_bits, pos_reduced);
			} else {
					generatedRc.rc_direct(pos_reduced >> 4, footer_bits - 4);
					generatedRc.rc_bittree_reverse(generatedPos_align, 4, pos_reduced & ((1 << 4) - 1));
					++generatedAlign_price_count;
			} 
		} 
		Object generatedReps = this.getReps();
		generatedReps[3] = generatedReps[2];
		generatedReps[2] = generatedReps[1];
		generatedReps[1] = generatedReps[0];
		generatedReps[0] = distance;
		Object generatedMatch_price_count = this.getMatch_price_count();
		++generatedMatch_price_count////////////////////;////////////////////
	}
	// Repeated match //
	////////////////////
	public void rep_match(Object pos_state, Object rep, Object len) {
		Object generatedRc = this.getRc();
		Object generatedIs_rep0 = this.getIs_rep0();
		Object generatedState = this.getState();
		Object generatedIs_rep0_long = this.getIs_rep0_long();
		Object generatedReps = this.getReps();
		Object generatedIs_rep1 = this.getIs_rep1();
		Object generatedIs_rep2 = this.getIs_rep2();
		if (rep == 0) {
			generatedRc.rc_bit(generatedIs_rep0[generatedState], 0);
			generatedRc.rc_bit(generatedIs_rep0_long[generatedState][pos_state], len != 1);
		} else {
				uint32_t distance = generatedReps[rep];
				generatedRc.rc_bit(generatedIs_rep0[generatedState], 1);
				if (rep == 1) {
					generatedRc.rc_bit(generatedIs_rep1[generatedState], 0);
				} else {
						generatedRc.rc_bit(generatedIs_rep1[generatedState], 1);
						generatedRc.rc_bit(generatedIs_rep2[generatedState], rep - 2);
						if (rep == 3) {
							generatedReps[3] = generatedReps[2];
						} 
						generatedReps[2] = generatedReps[1];
				} 
				generatedReps[1] = generatedReps[0];
				generatedReps[0] = distance;
		} 
		Object generatedRep_len_encoder = this.getRep_len_encoder();
		Object generatedFast_mode = this.getFast_mode();
		if (len == 1) {
			this.setState(((generatedState) < 7 ? .STATE_LIT_SHORTREP : .STATE_NONLIT_REP));
		} else {
				generatedRc.length(generatedRep_len_encoder, pos_state, len, generatedFast_mode);
				this.setState(((generatedState) < 7 ? .STATE_LIT_LONGREP : .STATE_NONLIT_REP));
		} 
	}
	public void encode_eopm(Object position) {
		Object generatedPos_mask = this.getPos_mask();
		uint32_t pos_state = position & generatedPos_mask;
		Object generatedRc = this.getRc();
		Object generatedIs_match = this.getIs_match();
		Object generatedState = this.getState();
		generatedRc.rc_bit(generatedIs_match[generatedState][pos_state], 1);
		Object generatedIs_rep = this.getIs_rep();
		generatedRc.rc_bit(generatedIs_rep[generatedState], 0);
		coder.match(pos_state, -1024, 2)/// Number of bytes that a single encoding loop in lzma_lzma_encode() can/// consume from the dictionary. This limit comes from lzma_lzma_optimum();/// Number of bytes that a single encoding loop in lzma_lzma_encode() can/// consume from the dictionary. This limit comes from lzma_lzma_optimum()
	}
	public Object lzma_lzma_encoder_reset(Object options) {
		if (!ModernizedCProgram.is_options_valid(options)) {
			return LZMA_OPTIONS_ERROR;
		} 
		this.setPos_mask((-1024 << options.getPb()) - 1);
		this.setLiteral_context_bits(options.getLc());
		this.setLiteral_pos_mask((-1024 << options.getLp()) - 1);
		Object generatedRc = this.getRc();
		// Range coder// Range codergeneratedRc.rc_reset();
		// State// Statethis.setState(.STATE_LIT_LIT);
		Object generatedReps = this.getReps();
		for (size_t i = 0;
		 i < 4; ++i) {
			generatedReps[i] = 0;
		}
		Object generatedLiteral = this.getLiteral();
		ModernizedCProgram.literal_init(generatedLiteral, options.getLc(), options.getLp());
		Object generatedPos_mask = this.getPos_mask();
		Object generatedIs_match = this.getIs_match();
		Object generatedIs_rep0_long = this.getIs_rep0_long();
		Object generatedIs_rep = this.getIs_rep();
		Object generatedIs_rep0 = this.getIs_rep0();
		Object generatedIs_rep1 = this.getIs_rep1();
		Object generatedIs_rep2 = this.getIs_rep2();
		// Bit encodersfor (size_t i = 0;
		 i < 12; ++i) {
			for (size_t j = 0;
			 j <= generatedPos_mask; ++j) {
				generatedIs_match[i][j] = (-1024 << 11) >> 1;
				generatedIs_rep0_long[i][j] = (-1024 << 11) >> 1;
			}
			generatedIs_rep[i] = (-1024 << 11) >> 1;
			generatedIs_rep0[i] = (-1024 << 11) >> 1;
			generatedIs_rep1[i] = (-1024 << 11) >> 1;
			generatedIs_rep2[i] = (-1024 << 11) >> 1;
		}
		Object generatedPos_special = this.getPos_special();
		for (size_t i = 0;
		 i < (1 << (14 / 2)) - 14; ++i) {
			generatedPos_special[i] = (-1024 << 11) >> 1;
		}
		Object generatedPos_slot = this.getPos_slot();
		// Bit tree encodersfor (size_t i = 0;
		 i < 4; ++i) {
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedPos_slot[i])[bt_i] = (-1024 << 11) >> 1;
			}
		}
		Object generatedPos_align = this.getPos_align();
		for (uint32_t bt_i = 0;
		 bt_i < (1 << (true)); ++bt_i) {
			(generatedPos_align)[bt_i] = (-1024 << 11) >> 1;
		}
		Object generatedMatch_len_encoder = this.getMatch_len_encoder();
		Object generatedFast_mode = this.getFast_mode();
		// Length encoders// Length encodersgeneratedMatch_len_encoder.length_encoder_reset(-1024 << options.getPb(), generatedFast_mode);
		Object generatedRep_len_encoder = this.getRep_len_encoder();
		generatedRep_len_encoder.length_encoder_reset(-1024 << options.getPb(), generatedFast_mode)// least every OPTS (a few thousand) possible price count increments.//;// least every OPTS (a few thousand) possible price count increments.//
		// By resetting price counts to UINT32_MAX / 2, we make sure that the// price tables will be initialized before they will be used (since// the value is definitely big enough), and that it is OK to increment// price counts without risk of integer overflow (since UINT32_MAX / 2// is small enough). The current code doesn't increment price counts// before initializing price tables, but it maybe done in future if// we add support for saving the state between LZMA2 chunks.// By resetting price counts to UINT32_MAX / 2, we make sure that the// price tables will be initialized before they will be used (since// the value is definitely big enough), and that it is OK to increment// price counts without risk of integer overflow (since UINT32_MAX / 2// is small enough). The current code doesn't increment price counts// before initializing price tables, but it maybe done in future if// we add support for saving the state between LZMA2 chunks.this.setMatch_price_count(-1024 / 2);
		this.setAlign_price_count(-1024 / 2);
		this.setOpts_end_index(0);
		this.setOpts_current_index(0);
		return LZMA_OK;
	}
	public void lzma2_decoder_end(Object allocator) {
		Object generatedLzma = this.getLzma();
		((generatedLzma.getEnd() == ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->lzma.end == NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_decoder.c", 214));
		ModernizedCProgram.lzma_free(generatedLzma.getCoder(), allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public void lzma_decoder_uncompressed(Object uncompressed_size) {
		this.setUncompressed_size(uncompressed_size/*
		extern void
		lzma_lzma_decoder_uncompressed(void *coder_ptr, lzma_vli uncompressed_size)
		{
			// This is hack.
			(*(lzma_coder **)(coder))->uncompressed_size = uncompressed_size;
		}
		*/);
	}
	public void lzma_decoder_reset(Object opt) {
		 options = opt;
		// NOTE: We assume that lc/lp/pb are valid since they were// successfully decoded with lzma_lzma_decode_properties().
		// Calculate pos_mask. We don't need pos_bits as is for anything.// Calculate pos_mask. We don't need pos_bits as is for anything.this.setPos_mask((-1024 << options.getPb()) - 1);
		Object generatedLiteral = this.getLiteral();
		// Initialize the literal decoder.// Initialize the literal decoder.ModernizedCProgram.literal_init(generatedLiteral, options.getLc(), options.getLp());
		this.setLiteral_context_bits(options.getLc());
		this.setLiteral_pos_mask((-1024 << options.getLp()) - 1);
		// State// Statethis.setState(.STATE_LIT_LIT);
		this.setRep0(0);
		this.setRep1(0);
		this.setRep2(0);
		this.setRep3(0);
		this.setPos_mask((-1024 << options.getPb()) - 1);
		Object generatedRc = this.getRc();
		// Range decoderdo {
			(generatedRc).setRange(-1024);
			(generatedRc).setCode(0);
			(generatedRc).setInit_bytes_left(5);
		} while (0);
		Object generatedPos_mask = this.getPos_mask();
		Object generatedIs_match = this.getIs_match();
		Object generatedIs_rep0_long = this.getIs_rep0_long();
		Object generatedIs_rep = this.getIs_rep();
		Object generatedIs_rep0 = this.getIs_rep0();
		Object generatedIs_rep1 = this.getIs_rep1();
		Object generatedIs_rep2 = this.getIs_rep2();
		// Bit and bittree decodersfor (uint32_t i = 0;
		 i < 12; ++i) {
			for (uint32_t j = 0;
			 j <= generatedPos_mask; ++j) {
				generatedIs_match[i][j] = (-1024 << 11) >> 1;
				generatedIs_rep0_long[i][j] = (-1024 << 11) >> 1;
			}
			generatedIs_rep[i] = (-1024 << 11) >> 1;
			generatedIs_rep0[i] = (-1024 << 11) >> 1;
			generatedIs_rep1[i] = (-1024 << 11) >> 1;
			generatedIs_rep2[i] = (-1024 << 11) >> 1;
		}
		Object generatedPos_slot = this.getPos_slot();
		for (uint32_t i = 0;
		 i < 4; ++i) {
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedPos_slot[i])[bt_i] = (-1024 << 11) >> 1;
			}
		}
		Object generatedPos_special = this.getPos_special();
		for (uint32_t i = 0;
		 i < (1 << (14 / 2)) - 14; ++i) {
			generatedPos_special[i] = (-1024 << 11) >> 1;
		}
		Object generatedPos_align = this.getPos_align();
		for (uint32_t bt_i = 0;
		 bt_i < (1 << (true)); ++bt_i) {
			(generatedPos_align)[bt_i] = (-1024 << 11) >> 1;
		}
		// Len decoders (also bit/bittree)uint32_t num_pos_states = -1024 << options.getPb();
		Object generatedMatch_len_decoder = this.getMatch_len_decoder();
		generatedMatch_len_decoder.setChoice((-1024 << 11) >> 1);
		generatedMatch_len_decoder.setChoice2((-1024 << 11) >> 1);
		Object generatedRep_len_decoder = this.getRep_len_decoder();
		generatedRep_len_decoder.setChoice((-1024 << 11) >> 1);
		generatedRep_len_decoder.setChoice2((-1024 << 11) >> 1);
		for (uint32_t pos_state = 0;
		 pos_state < num_pos_states; ++pos_state) {
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedMatch_len_decoder.getLow()[pos_state])[bt_i] = (-1024 << 11) >> 1;
			}
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedMatch_len_decoder.getMid()[pos_state])[bt_i] = (-1024 << 11) >> 1;
			}
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedRep_len_decoder.getLow()[pos_state])[bt_i] = (-1024 << 11) >> 1;
			}
			for (uint32_t bt_i = 0;
			 bt_i < (1 << (true)); ++bt_i) {
				(generatedRep_len_decoder.getMid()[pos_state])[bt_i] = (-1024 << 11) >> 1;
			}
		}
		for (uint32_t bt_i = 0;
		 bt_i < (1 << (true)); ++bt_i) {
			(generatedMatch_len_decoder.getHigh())[bt_i] = (-1024 << 11) >> 1;
		}
		for (uint32_t bt_i = 0;
		 bt_i < (1 << (true)); ++bt_i) {
			(generatedRep_len_decoder.getHigh())[bt_i] = (-1024 << 11) >> 1;
		}
		this.setSequence(.SEQ_IS_MATCH);
		this.setProbs(((Object)0));
		this.setSymbol(0);
		this.setLimit(0);
		this.setOffset(0);
		this.setLen(0);
		return /*Error: Unsupported expression*/;
	}
	public Object alone_decode(Object allocator, Object[] in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedSequence = this.getSequence();
		Object generatedOptions = this.getOptions();
		Object generatedPos = this.getPos();
		Object generatedPicky = this.getPicky();
		Object generatedUncompressed_size = this.getUncompressed_size();
		Object generatedMemusage = this.getMemusage();
		Object generatedMemlimit = this.getMemlimit();
		lzma_next_coder_s generatedNext = this.getNext();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		while (out_pos < out_size && (generatedSequence == .SEQ_CODE || in_pos < in_size)) {
			switch (generatedSequence) {
			case .SEQ_CODER_INIT:
					{ 
						if (generatedMemusage > generatedMemlimit) {
							return LZMA_MEMLIMIT_ERROR;
						} 
						lzma_filter_info[] filters = new lzma_filter_info[]{new lzma_filter_info(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/), new lzma_filter_info(/*Error: Invalid initializer*/)};
						 ret = generatedNext.lzma_next_filter_init(allocator, filters);
						if (ret != LZMA_OK) {
							return ret;
						} 
						generatedCoder.lzma_lz_decoder_uncompressed(generatedUncompressed_size);
						this.setSequence(.SEQ_CODE);
						break;
					}
			case .SEQ_PROPERTIES:
					if (ModernizedCProgram.lzma_lzma_lclppb_decode(generatedOptions, in[in_pos])) {
						return LZMA_FORMAT_ERROR;
					} 
					this.setSequence(.SEQ_DICTIONARY_SIZE);
					++in_pos;
					break;
			case .SEQ_CODE:
					{ 
						return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
					}
			case .SEQ_DICTIONARY_SIZE:
					generatedOptions.getDict_size() |=  (size_t)(in[in_pos]) << (generatedPos * 8);
					if (++generatedPos == 4) {
						if (generatedPicky && generatedOptions.getDict_size() != -1024) {
							uint32_t d = generatedOptions.getDict_size() - 1;
							d |=  d >> 2;
							d |=  d >> 3;
							d |=  d >> 4;
							d |=  d >> 8;
							d |=  d >> 16;
							++d;
							if (d != generatedOptions.getDict_size()) {
								return LZMA_FORMAT_ERROR;
							} 
						} 
						this.setPos(0);
						this.setSequence(.SEQ_UNCOMPRESSED_SIZE);
					} 
					++in_pos;
					break;
			case .SEQ_UNCOMPRESSED_SIZE:
					generatedUncompressed_size |=  /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(in[in_pos]) << (generatedPos * 8);
					++in_pos;
					if (++generatedPos < 8) {
						break;
					} 
					if (generatedPicky && generatedUncompressed_size != LZMA_VLI_UNKNOWN && generatedUncompressed_size >= (/*Error: Function owner not recognized*/LZMA_VLI_C(1) << 38)) {
						return LZMA_FORMAT_ERROR;
					} 
					this.setMemusage(ModernizedCProgram.lzma_lzma_decoder_memusage(generatedOptions) + (-1024 << 15));
					this.setPos(0);
					this.setSequence(.SEQ_CODER_INIT);
			default:
					return LZMA_PROG_ERROR;
			}
		}
		return LZMA_OK;
	}
	public void alone_decoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object alone_decoder_memconfig(Object memusage, Object old_memlimit, Object new_memlimit) {
		Object generatedMemusage = this.getMemusage();
		memusage = generatedMemusage;
		Object generatedMemlimit = this.getMemlimit();
		old_memlimit = generatedMemlimit;
		if (new_memlimit != 0) {
			if (new_memlimit < generatedMemusage) {
				return LZMA_MEMLIMIT_ERROR;
			} 
			this.setMemlimit(new_memlimit);
		} 
		return LZMA_OK;
	}
	///////////////////////////////////////////////////////////////////////////////
	//
	/// \file       simple_coder.c
	/// \brief      Wrapper for simple filters
	///
	/// Simple filters don't change the size of the data i.e. number of bytes
	/// in equals the number of bytes out.
	//
	//  Author:     Lasse Collin
	//
	//  This file has been put into the public domain.
	//  You can do whatever you want with this file.
	//
	///////////////////////////////////////////////////////////////////////////////
	/// Copied or encodes/decodes more data to out[].
	public Object copy_or_code(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedEnd_was_reached = this.getEnd_was_reached();
		((!generatedEnd_was_reached) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!coder->end_was_reached", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 26));
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedCode = generatedNext.getCode();
		Object generatedIs_encoder = this.getIs_encoder();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		if (generatedCode == ((Object)0)) {
			ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, out, out_pos, out_size);
			if (generatedIs_encoder && action == LZMA_FINISH && in_pos == in_size) {
				this.setEnd_was_reached(1);
			} 
		} else {
				 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
				if (ret == LZMA_STREAM_END) {
					((!generatedIs_encoder || action == LZMA_FINISH) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!coder->is_encoder || action == LZMA_FINISH", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 45));
					this.setEnd_was_reached(1);
				}  else if (ret != LZMA_OK) {
					return ret;
				} 
		} 
		return LZMA_OK;
	}
	public Object call_filter(Object buffer, Object size) {
		Object generatedSimple = this.getSimple();
		Object generatedNow_pos = this.getNow_pos();
		Object generatedIs_encoder = this.getIs_encoder();
		size_t filtered = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSimple, generatedNow_pos, generatedIs_encoder, buffer, size);
		generatedNow_pos += filtered;
		return filtered;
	}
	public Object simple_code(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		// TODO: Add partial support for LZMA_SYNC_FLUSH. We can support it// in cases when the filter is able to filter everything. With most// simple filters it can be done at offset that is a multiple of 2,// 4, or 16. With x86 filter, it needs good luck, and thus cannot// be made to work predictably.if (action == LZMA_SYNC_FLUSH) {
			return LZMA_OPTIONS_ERROR;
		} 
		Object generatedPos = this.getPos();
		Object generatedFiltered = this.getFiltered();
		Object generatedBuffer = this.getBuffer();
		Object generatedEnd_was_reached = this.getEnd_was_reached();
		Object generatedSize = this.getSize();
		// Flush already filtered data from coder->buffer[] to out[].if (generatedPos < generatedFiltered) {
			ModernizedCProgram.lzma_bufcpy(generatedBuffer, generatedPos, generatedFiltered, out, out_pos, out_size);
			if (generatedPos < generatedFiltered) {
				return LZMA_OK;
			} 
			if (generatedEnd_was_reached) {
				((generatedFiltered == generatedSize) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->filtered == coder->size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 93));
				return LZMA_STREAM_END;
			} 
		} 
		// If we get here, there is no filtered data left in the buffer.// If we get here, there is no filtered data left in the buffer.this.setFiltered(0);
		((!generatedEnd_was_reached) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!coder->end_was_reached", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 101))// If there is more output space left than there is unfiltered data// in coder->buffer[], flush coder->buffer[] to out[], and copy/code;// If there is more output space left than there is unfiltered data// in coder->buffer[], flush coder->buffer[] to out[], and copy/code
		// more data to out[] hopefully filling it completely. Then filter// the data in out[]. This step is where most of the data gets// filtered if the buffer sizes used by the application are reasonable.size_t out_avail = out_size - out_pos;
		size_t buf_avail = generatedSize - generatedPos;
		Object generatedAllocated = this.getAllocated();
		if (out_avail > buf_avail || buf_avail == 0) {
			size_t out_start = out_pos;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out + out_pos, generatedBuffer + generatedPos, buf_avail);
			out_pos += buf_avail;
			{ 
				 ret = coder.copy_or_code(allocator, in, in_pos, in_size, out, out_pos, out_size, action);
				((ret != LZMA_STREAM_END) ? (Object)0 : /*Error: Function owner not recognized*/_assert("ret != LZMA_STREAM_END", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 127));
				if (ret != LZMA_OK) {
					return ret;
				} 
			}
			size_t size = out_pos - out_start;
			size_t filtered = coder.call_filter(out + out_start, size);
			size_t unfiltered = size - filtered;
			((unfiltered <= generatedAllocated / 2) ? (Object)0 : /*Error: Function owner not recognized*/_assert("unfiltered <= coder->allocated / 2", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 138));
			this.setPos(0);
			this.setSize(unfiltered);
			if (generatedEnd_was_reached) {
				this.setSize(0);
			}  else if (unfiltered > 0) {
				out_pos -= unfiltered;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer, out + out_pos, unfiltered);
			} 
		}  else if (generatedPos > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBuffer, generatedBuffer + generatedPos, buf_avail);
			generatedSize -= generatedPos;
			this.setPos(0);
		} 
		// Store the old position so that we know from which byte
		((generatedPos == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->pos == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 162))// If coder->buffer[] isn't empty, try to fill it by copying/decoding// more data. Then filter coder->buffer[] and copy the successfully;// If coder->buffer[] isn't empty, try to fill it by copying/decoding// more data. Then filter coder->buffer[] and copy the successfully
		// filtered data to out[]. It is probable, that some filtered and// unfiltered data will be left to coder->buffer[].if (generatedSize > 0) {
			{ 
				 ret = coder.copy_or_code(allocator, in, in_pos, in_size, generatedBuffer, generatedSize, generatedAllocated, action);
				((ret != LZMA_STREAM_END) ? (Object)0 : /*Error: Function owner not recognized*/_assert("ret != LZMA_STREAM_END", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\simple_coder.c", 174));
				if (ret != LZMA_OK) {
					return ret;
				} 
			}
			this.setFiltered(coder.call_filter(generatedBuffer, generatedSize));
			if (generatedEnd_was_reached) {
				this.setFiltered(generatedSize);
			} 
			ModernizedCProgram.lzma_bufcpy(generatedBuffer, generatedPos, generatedFiltered, out, out_pos, out_size);
		} 
		// Check if we got everything done.if (generatedEnd_was_reached && generatedPos == generatedSize) {
			return LZMA_STREAM_END;
		} 
		return LZMA_OK;
	}
	public void simple_coder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		Object generatedSimple = this.getSimple();
		ModernizedCProgram.lzma_free(generatedSimple, allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object simple_coder_update(Object allocator, Object filters_null, Object reversed_filters) {
		lzma_next_coder_s generatedNext = this.getNext();
		// No update support, just call the next filter in the chain.return generatedNext.lzma_next_filter_update(allocator, reversed_filters + 1);
	}
	public Object block_encoder_init(Object allocator) {
		Object generatedBlock_options = this.getBlock_options();
		// initialized, it is a good idea to do it here, because this way// we catch if someone gave us Filter ID that cannot be used in// Blocks/Streams.// initialized, it is a good idea to do it here, because this way// we catch if someone gave us Filter ID that cannot be used in// Blocks/Streams.generatedBlock_options.setCompressed_size(LZMA_VLI_UNKNOWN);
		generatedBlock_options.setUncompressed_size(LZMA_VLI_UNKNOWN);
		do {
			 ret_ = (ModernizedCProgram.lzma_block_header_size(generatedBlock_options));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		Object generatedBlock_encoder = this.getBlock_encoder();
		// Initialize the actual Block encoder.return generatedBlock_encoder.lzma_block_encoder_init(allocator, generatedBlock_options);
	}
	// Prepare the Block options. Even though Block encoder doesn't need
	// compressed_size, uncompressed_size, and header_size to be
	public Object stream_encode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedBuffer = this.getBuffer();
		Object generatedBuffer_pos = this.getBuffer_pos();
		Object generatedBuffer_size = this.getBuffer_size();
		Object generatedSequence = this.getSequence();
		Object generatedIndex_encoder = this.getIndex_encoder();
		Object generatedIndex = this.getIndex();
		Object generatedBlock_encoder_is_initialized = this.getBlock_encoder_is_initialized();
		Object generatedBlock_options = this.getBlock_options();
		Object generatedBlock_encoder = this.getBlock_encoder();
		// Main loopwhile (out_pos < out_size) {
			switch (generatedSequence) {
			case .SEQ_STREAM_HEADER:
			case .SEQ_BLOCK_ENCODE:
					{ 
						[] convert = new []{LZMA_RUN, LZMA_SYNC_FLUSH, LZMA_FINISH, LZMA_FINISH};
						 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedBlock_encoder.getCoder(), allocator, in, in_pos, in_size, out, out_pos, out_size, convert[action]);
						if (ret != LZMA_STREAM_END || action == LZMA_SYNC_FLUSH) {
							return ret;
						} 
						 unpadded_size = ModernizedCProgram.lzma_block_unpadded_size(generatedBlock_options);
						((unpadded_size != 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("unpadded_size != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\stream_encoder.c", 167));
						do {
							 ret_ = (generatedIndex.lzma_index_append(allocator, unpadded_size, generatedBlock_options.getUncompressed_size()));
							if (ret_ != LZMA_OK) {
								return ret_;
							} 
						} while (0);
						this.setSequence(.SEQ_BLOCK_INIT);
						break;
					}
			case .SEQ_INDEX_ENCODE:
					{ 
						 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedIndex_encoder.getCoder(), allocator, ((Object)0), ((Object)0), 0, out, out_pos, out_size, LZMA_RUN);
						if (ret != LZMA_STREAM_END) {
							return ret;
						} 
						 stream_flags = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
						if (ModernizedCProgram.lzma_stream_footer_encode(stream_flags, generatedBuffer) != LZMA_OK) {
							return LZMA_PROG_ERROR;
						} 
						this.setBuffer_size(LZMA_STREAM_HEADER_SIZE);
						this.setSequence(.SEQ_STREAM_FOOTER);
						break;
					}
			case .SEQ_STREAM_FOOTER:
					ModernizedCProgram.lzma_bufcpy(generatedBuffer, generatedBuffer_pos, generatedBuffer_size, out, out_pos, out_size);
					if (generatedBuffer_pos < generatedBuffer_size) {
						return LZMA_OK;
					} 
					if (generatedSequence == .SEQ_STREAM_FOOTER) {
						return LZMA_STREAM_END;
					} 
					this.setBuffer_pos(0);
					++generatedSequence;
					break;
			case .SEQ_BLOCK_INIT:
					{ 
						if (in_pos == in_size) {
							if (action != LZMA_FINISH) {
								return action == LZMA_RUN ? LZMA_OK : LZMA_STREAM_END;
							} 
							do {
								 ret_ = (generatedIndex_encoder.lzma_index_encoder_init(allocator, generatedIndex));
								if (ret_ != LZMA_OK) {
									return ret_;
								} 
							} while (0);
							this.setSequence(.SEQ_INDEX_ENCODE);
							break;
						} 
						if (!generatedBlock_encoder_is_initialized) {
							do {
								 ret_ = (coder.block_encoder_init(allocator));
								if (ret_ != LZMA_OK) {
									return ret_;
								} 
							} while (0);
						} 
						this.setBlock_encoder_is_initialized(0);
						if (ModernizedCProgram.lzma_block_header_encode(generatedBlock_options, generatedBuffer) != LZMA_OK) {
							return LZMA_PROG_ERROR;
						} 
						this.setBuffer_size(generatedBlock_options.getHeader_size());
						this.setSequence(.SEQ_BLOCK_HEADER);
						break;
					}
			case .SEQ_BLOCK_HEADER:
			default:
					((false) ? (Object)0 : /*Error: Function owner not recognized*/_assert("0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\stream_encoder.c", 203));
					return LZMA_PROG_ERROR;
			}
		}
		return LZMA_OK;
	}
	public void stream_encoder_end(Object allocator) {
		Object generatedBlock_encoder = this.getBlock_encoder();
		generatedBlock_encoder.lzma_next_end(allocator);
		Object generatedIndex_encoder = this.getIndex_encoder();
		generatedIndex_encoder.lzma_next_end(allocator);
		Object generatedIndex = this.getIndex();
		generatedIndex.lzma_index_end(allocator);
		Object generatedFilters = this.getFilters();
		for (size_t i = 0;
		 generatedFilters[i].getId() != LZMA_VLI_UNKNOWN; ++i) {
			ModernizedCProgram.lzma_free(generatedFilters[i].getOptions(), allocator);
		}
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object stream_encoder_update(Object allocator, Object filters, Object reversed_filters) {
		Object generatedSequence = this.getSequence();
		Object generatedBlock_options = this.getBlock_options();
		Object generatedFilters = this.getFilters();
		Object generatedBlock_encoder = this.getBlock_encoder();
		if (generatedSequence <= .SEQ_BLOCK_INIT) {
			this.setBlock_encoder_is_initialized(0);
			generatedBlock_options.setFilters(()(filters));
			 ret = coder.block_encoder_init(allocator);
			generatedBlock_options.setFilters(generatedFilters);
			if (ret != LZMA_OK) {
				return ret;
			} 
			this.setBlock_encoder_is_initialized(1);
		}  else if (generatedSequence <= .SEQ_BLOCK_ENCODE) {
			do {
				 ret_ = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedBlock_encoder.getCoder(), allocator, filters, reversed_filters));
				if (ret_ != LZMA_OK) {
					return ret_;
				} 
			} while (0);
		} else {
				return LZMA_PROG_ERROR;
		} 
		// There is no incomplete Block waiting to be finished,// thus we can change the whole filter chain. Start by
		// Free the copy of the old chain and make a copy of the new chain.for (size_t i = 0;
		 generatedFilters[i].getId() != LZMA_VLI_UNKNOWN; ++i) {
			ModernizedCProgram.lzma_free(generatedFilters[i].getOptions(), allocator);
		}
		return ModernizedCProgram.lzma_filters_copy(filters, generatedFilters, allocator);
	}
	public void lzma2_header_lzma() {
		Object generatedUncompressed_size = this.getUncompressed_size();
		((generatedUncompressed_size > 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->uncompressed_size > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 57));
		((generatedUncompressed_size <= (-1024 << 21)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->uncompressed_size <= LZMA2_UNCOMPRESSED_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 58));
		Object generatedCompressed_size = this.getCompressed_size();
		((generatedCompressed_size > 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->compressed_size > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 59));
		((generatedCompressed_size <= (-1024 << 16)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->compressed_size <= LZMA2_CHUNK_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 60));
		size_t pos = new size_t();
		Object generatedNeed_properties = this.getNeed_properties();
		Object generatedNeed_dictionary_reset = this.getNeed_dictionary_reset();
		Object generatedBuf = this.getBuf();
		Object generatedNeed_state_reset = this.getNeed_state_reset();
		if (generatedNeed_properties) {
			pos = 0;
			if (generatedNeed_dictionary_reset) {
				generatedBuf[pos] = -1024 + (3 << 5);
			} else {
					generatedBuf[pos] = -1024 + (2 << 5);
			} 
		} else {
				pos = 1;
				if (generatedNeed_state_reset) {
					generatedBuf[pos] = -1024 + (1 << 5);
				} else {
						generatedBuf[pos] = -1024;
				} 
		} 
		// Set the start position for copying.// Set the start position for copying.this.setBuf_pos(pos);
		// Uncompressed sizesize_t size = generatedUncompressed_size - 1;
		generatedBuf[pos++] += size >> 16;
		generatedBuf[pos++] = (size >> 8) & -1024;
		generatedBuf[pos++] = size & -1024;
		// Compressed size// Compressed sizesize = generatedCompressed_size - 1;
		generatedBuf[pos++] = size >> 8;
		generatedBuf[pos++] = size & -1024;
		Object generatedOpt_cur = this.getOpt_cur();
		// Properties, if neededif (generatedNeed_properties) {
			ModernizedCProgram.lzma_lzma_lclppb_encode(generatedOpt_cur, generatedBuf + pos);
		} 
		this.setNeed_properties(0);
		this.setNeed_state_reset(0);
		this.setNeed_dictionary_reset(0)// The copying code uses coder->compressed_size to indicate the end;// The copying code uses coder->compressed_size to indicate the end
		// of coder->buf[], so we need add the maximum size of the header here.// of coder->buf[], so we need add the maximum size of the header here.generatedCompressed_size += 6;
		return /*Error: Unsupported expression*/;
	}
	public void lzma2_header_uncompressed() {
		Object generatedUncompressed_size = this.getUncompressed_size();
		((generatedUncompressed_size > 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->uncompressed_size > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 113));
		((generatedUncompressed_size <= (-1024 << 16)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->uncompressed_size <= LZMA2_CHUNK_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_encoder.c", 114))// If this is the first chunk, we need to include dictionary;// If this is the first chunk, we need to include dictionary
		Object generatedNeed_dictionary_reset = this.getNeed_dictionary_reset();
		Object generatedBuf = this.getBuf();
		// reset indicator.if (generatedNeed_dictionary_reset) {
			generatedBuf[0] = 1;
		} else {
				generatedBuf[0] = 2;
		} 
		this.setNeed_dictionary_reset(0);
		// "Compressed" size// "Compressed" sizegeneratedBuf[1] = (generatedUncompressed_size - 1) >> 8;
		generatedBuf[2] = (generatedUncompressed_size - 1) & -1024;
		// Set the start position for copying.// Set the start position for copying.this.setBuf_pos(0);
		return /*Error: Unsupported expression*/;
	}
	public void lzma2_encoder_end(Object allocator) {
		Object generatedLzma = this.getLzma();
		ModernizedCProgram.lzma_free(generatedLzma, allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object lzma2_encoder_options_update(Object filter) {
		Object generatedSequence = this.getSequence();
		// This is the case at the beginning of the raw stream and right// after LZMA_SYNC_FLUSH.if (filter.getOptions() == ((Object)0) || generatedSequence != .SEQ_INIT) {
			return LZMA_PROG_ERROR;
		} 
		// only lc/lp/pb can be changed. opt = filter.getOptions();
		Object generatedOpt_cur = this.getOpt_cur();
		if (generatedOpt_cur.getLc() != opt.getLc() || generatedOpt_cur.getLp() != opt.getLp() || generatedOpt_cur.getPb() != opt.getPb()) {
			if (opt.getLc() > LZMA_LCLP_MAX || opt.getLp() > LZMA_LCLP_MAX || opt.getLc() + opt.getLp() > LZMA_LCLP_MAX || opt.getPb() > LZMA_PB_MAX) {
				return LZMA_OPTIONS_ERROR;
			} 
			generatedOpt_cur.setLc(opt.getLc());
			generatedOpt_cur.setLp(opt.getLp());
			generatedOpt_cur.setPb(opt.getPb());
			this.setNeed_properties(1);
			this.setNeed_state_reset(1);
		} 
		return LZMA_OK;
	}
	// New options can be set only when there is no incomplete chunk.
	public void fill_distances_prices() {
		Object generatedPos_slot_prices = this.getPos_slot_prices();
		Object generatedDist_table_size = this.getDist_table_size();
		Object generatedPos_slot = this.getPos_slot();
		Object generatedDistances_prices = this.getDistances_prices();
		for (uint32_t len_to_pos_state = 0;
		 len_to_pos_state < 4; ++len_to_pos_state) {
			uint32_t pos_slot_prices = generatedPos_slot_prices[len_to_pos_state];
			for (uint32_t pos_slot = 0;
			 pos_slot < generatedDist_table_size; ++pos_slot) {
				pos_slot_prices[pos_slot] = ModernizedCProgram.rc_bittree_price(generatedPos_slot[len_to_pos_state], 6, pos_slot);
			}
			for (uint32_t pos_slot = 14;
			 pos_slot < generatedDist_table_size; ++pos_slot) {
				pos_slot_prices[pos_slot] += ModernizedCProgram.rc_direct_price(((pos_slot >> 1) - 1) - 4);
			}
			for (uint32_t i = 0;
			 i < 4; ++i) {
				generatedDistances_prices[len_to_pos_state][i] = pos_slot_prices[i];
			}
		}
		Object generatedPos_special = this.getPos_special();
		// Distances in the range [4, 127] depend on pos_slot and pos_special.// We do this in a loop separate from the above loop to avoid// redundant calls to get_pos_slot().for (uint32_t i = 4;
		 i < (1 << (14 / 2)); ++i) {
			uint32_t pos_slot = ModernizedCProgram.get_pos_slot(i);
			uint32_t footer_bits = ((pos_slot >> 1) - 1);
			uint32_t base = (2 | (pos_slot & 1)) << footer_bits;
			uint32_t price = ModernizedCProgram.rc_bittree_reverse_price(generatedPos_special + base - pos_slot - 1, footer_bits, i - base);
			for (uint32_t len_to_pos_state = 0;
			 len_to_pos_state < 4; ++len_to_pos_state) {
				generatedDistances_prices[len_to_pos_state][i] = price + generatedPos_slot_prices[len_to_pos_state][pos_slot];
			}
		}
		this.setMatch_price_count(0);
		return /*Error: Unsupported expression*/;
	}
	public void fill_align_prices() {
		Object generatedAlign_prices = this.getAlign_prices();
		Object generatedPos_align = this.getPos_align();
		for (uint32_t i = 0;
		 i < (1 << 4); ++i) {
			generatedAlign_prices[i] = ModernizedCProgram.rc_bittree_reverse_price(generatedPos_align, 4, i);
		}
		this.setAlign_price_count(0);
		return /*Error: Unsupported expression*/;/////////////
	}
	public void backward(Object len_res, Object back_res, Object cur) {
		this.setOpts_end_index(cur);
		Object generatedOpts = this.getOpts();
		uint32_t pos_mem = generatedOpts[cur].getPos_prev();
		uint32_t back_mem = generatedOpts[cur].getBack_prev();
		do {
			if (generatedOpts[cur].getPrev_1_is_literal()) {
				generatedOpts[pos_mem].make_literal();
				generatedOpts[pos_mem].setPos_prev(pos_mem - 1);
				if (generatedOpts[cur].getPrev_2()) {
					generatedOpts[pos_mem - 1].setPrev_1_is_literal(0);
					generatedOpts[pos_mem - 1].setPos_prev(generatedOpts[cur].getPos_prev_2());
					generatedOpts[pos_mem - 1].setBack_prev(generatedOpts[cur].getBack_prev_2());
				} 
			} 
			uint32_t pos_prev = pos_mem;
			uint32_t back_cur = back_mem;
			back_mem = generatedOpts[pos_prev].getBack_prev();
			pos_mem = generatedOpts[pos_prev].getPos_prev();
			generatedOpts[pos_prev].setBack_prev(back_cur);
			generatedOpts[pos_prev].setPos_prev(cur);
			cur = pos_prev;
		} while (cur != 0);
		this.setOpts_current_index(generatedOpts[0].getPos_prev());
		len_res = generatedOpts[0].getPos_prev();
		back_res = generatedOpts[0].getBack_prev();
		return /*Error: Unsupported expression*/;//////////
	}
	public Object helper2(Object[] reps, Object[] buf, Object len_end, Object position, Object cur, Object nice_len, Object buf_avail_full) {
		Object generatedMatches_count = this.getMatches_count();
		uint32_t matches_count = generatedMatches_count;
		Object generatedLongest_match_length = this.getLongest_match_length();
		uint32_t new_len = generatedLongest_match_length;
		Object generatedOpts = this.getOpts();
		uint32_t pos_prev = generatedOpts[cur].getPos_prev();
		lzma_lzma_state state = new lzma_lzma_state();
		if (generatedOpts[cur].getPrev_1_is_literal()) {
			--pos_prev;
			if (generatedOpts[cur].getPrev_2()) {
				state = generatedOpts[generatedOpts[cur].getPos_prev_2()].getState();
				if (generatedOpts[cur].getBack_prev_2() < 4) {
					state = ((state) < 7 ? .STATE_LIT_LONGREP : .STATE_NONLIT_REP);
				} else {
						state = ((state) < 7 ? .STATE_LIT_MATCH : .STATE_NONLIT_MATCH);
				} 
			} else {
					state = generatedOpts[pos_prev].getState();
			} 
			state = ((state) <= .STATE_SHORTREP_LIT_LIT ? .STATE_LIT_LIT : ((state) <= .STATE_LIT_SHORTREP ? (state) - 3 : (state) - 6));
		} else {
				state = generatedOpts[pos_prev].getState();
		} 
		if (pos_prev == cur - 1) {
			if (((generatedOpts[cur]).getBack_prev() == 0)) {
				state = ((state) < 7 ? .STATE_LIT_SHORTREP : .STATE_NONLIT_REP);
			} else {
					state = ((state) <= .STATE_SHORTREP_LIT_LIT ? .STATE_LIT_LIT : ((state) <= .STATE_LIT_SHORTREP ? (state) - 3 : (state) - 6));
			} 
		} else {
				uint32_t pos = new uint32_t();
				if (generatedOpts[cur].getPrev_1_is_literal() && generatedOpts[cur].getPrev_2()) {
					pos_prev = generatedOpts[cur].getPos_prev_2();
					pos = generatedOpts[cur].getBack_prev_2();
					state = ((state) < 7 ? .STATE_LIT_LONGREP : .STATE_NONLIT_REP);
				} else {
						pos = generatedOpts[cur].getBack_prev();
						if (pos < 4) {
							state = ((state) < 7 ? .STATE_LIT_LONGREP : .STATE_NONLIT_REP);
						} else {
								state = ((state) < 7 ? .STATE_LIT_MATCH : .STATE_NONLIT_MATCH);
						} 
				} 
				if (pos < 4) {
					reps[0] = generatedOpts[pos_prev].getBacks()[pos];
					uint32_t i = new uint32_t();
					for (i = 1; i <= pos; ++i) {
						reps[i] = generatedOpts[pos_prev].getBacks()[i - 1];
					}
					for (; i < 4; ++i) {
						reps[i] = generatedOpts[pos_prev].getBacks()[i];
					}
				} else {
						reps[0] = pos - 4;
						for (uint32_t i = 1;
						 i < 4; ++i) {
							reps[i] = generatedOpts[pos_prev].getBacks()[i - 1];
						}
				} 
		} 
		generatedOpts[cur].setState(state);
		for (uint32_t i = 0;
		 i < 4; ++i) {
			generatedOpts[cur].getBacks()[i] = reps[i];
		}
		uint32_t cur_price = generatedOpts[cur].getPrice();
		uint8_t current_byte = buf;
		uint8_t match_byte = (buf - reps[0] - 1);
		Object generatedPos_mask = this.getPos_mask();
		uint32_t pos_state = position & generatedPos_mask;
		Object generatedIs_match = this.getIs_match();
		uint32_t cur_and_1_price = cur_price + ModernizedCProgram.rc_bit_0_price(generatedIs_match[state][pos_state]) + ModernizedCProgram.get_literal_price(coder, position, buf[-1], !((state) < 7), match_byte, current_byte);
		boolean next_is_literal = false;
		if (cur_and_1_price < generatedOpts[cur + 1].getPrice()) {
			generatedOpts[cur + 1].setPrice(cur_and_1_price);
			generatedOpts[cur + 1].setPos_prev(cur);
			generatedOpts[cur + 1].make_literal();
			next_is_literal = true;
		} 
		uint32_t match_price = cur_price + ModernizedCProgram.rc_bit_1_price(generatedIs_match[state][pos_state]);
		Object generatedIs_rep = this.getIs_rep();
		uint32_t rep_match_price = match_price + ModernizedCProgram.rc_bit_1_price(generatedIs_rep[state]);
		if (match_byte == current_byte && !(generatedOpts[cur + 1].getPos_prev() < cur && generatedOpts[cur + 1].getBack_prev() == 0)) {
			uint32_t short_rep_price = rep_match_price + ModernizedCProgram.get_short_rep_price(coder, state, pos_state);
			if (short_rep_price <= generatedOpts[cur + 1].getPrice()) {
				generatedOpts[cur + 1].setPrice(short_rep_price);
				generatedOpts[cur + 1].setPos_prev(cur);
				generatedOpts[cur + 1].make_short_rep();
				next_is_literal = true;
			} 
		} 
		if (buf_avail_full < 2) {
			return len_end;
		} 
		uint32_t buf_avail = ((buf_avail_full) < (nice_len) ? (buf_avail_full) : (nice_len));
		// speed optimizationif (!next_is_literal && match_byte != current_byte) {
			uint8_t buf_back = buf - reps[0] - 1;
			uint32_t limit = ((buf_avail_full) < (nice_len + 1) ? (buf_avail_full) : (nice_len + 1));
			uint32_t len_test = 1;
			while (len_test < limit && buf[len_test] == buf_back[len_test]) {
				++len_test;
			}
			--len_test;
			if (len_test >= 2) {
				lzma_lzma_state state_2 = state;
				state_2 = ((state_2) <= .STATE_SHORTREP_LIT_LIT ? .STATE_LIT_LIT : ((state_2) <= .STATE_LIT_SHORTREP ? (state_2) - 3 : (state_2) - 6));
				uint32_t pos_state_next = (position + 1) & generatedPos_mask;
				uint32_t next_rep_match_price = cur_and_1_price + ModernizedCProgram.rc_bit_1_price(generatedIs_match[state_2][pos_state_next]) + ModernizedCProgram.rc_bit_1_price(generatedIs_rep[state_2]);
				uint32_t offset = cur + 1 + len_test;
				while (len_end < offset) {
					generatedOpts[++len_end].setPrice((-1024 << 30));
				}
				uint32_t cur_and_len_price = next_rep_match_price + ModernizedCProgram.get_rep_price(coder, 0, len_test, state_2, pos_state_next);
				if (cur_and_len_price < generatedOpts[offset].getPrice()) {
					generatedOpts[offset].setPrice(cur_and_len_price);
					generatedOpts[offset].setPos_prev(cur + 1);
					generatedOpts[offset].setBack_prev(0);
					generatedOpts[offset].setPrev_1_is_literal(1);
					generatedOpts[offset].setPrev_2(0);
				} 
			} 
		} 
		// try literal + rep0
		// speed optimizationuint32_t start_len = 2;
		Object generatedRep_len_encoder = this.getRep_len_encoder();
		for (uint32_t rep_index = 0;
		 rep_index < 4; ++rep_index) {
			uint8_t buf_back = buf - reps[rep_index] - 1;
			if (((buf)[0] != (buf_back)[0] || (buf)[1] != (buf_back)[1])) {
				continue;
			} 
			uint32_t len_test = new uint32_t();
			for (len_test = 2; len_test < buf_avail && buf[len_test] == buf_back[len_test]; ++len_test) {
				;
			}
			while (len_end < cur + len_test) {
				generatedOpts[++len_end].setPrice((-1024 << 30));
			}
			uint32_t len_test_temp = len_test;
			uint32_t price = rep_match_price + ModernizedCProgram.get_pure_rep_price(coder, rep_index, state, pos_state);
			do {
				uint32_t cur_and_len_price = price + ModernizedCProgram.get_len_price(generatedRep_len_encoder, len_test, pos_state);
				if (cur_and_len_price < generatedOpts[cur + len_test].getPrice()) {
					generatedOpts[cur + len_test].setPrice(cur_and_len_price);
					generatedOpts[cur + len_test].setPos_prev(cur);
					generatedOpts[cur + len_test].setBack_prev(rep_index);
					generatedOpts[cur + len_test].setPrev_1_is_literal(0);
				} 
			} while (--len_test >= 2);
			len_test = len_test_temp;
			if (rep_index == 0) {
				start_len = len_test + 1;
			} 
			uint32_t len_test_2 = len_test + 1;
			uint32_t limit = ((buf_avail_full) < (len_test_2 + nice_len) ? (buf_avail_full) : (len_test_2 + nice_len));
			for (; len_test_2 < limit && buf[len_test_2] == buf_back[len_test_2]; ++len_test_2) {
				;
			}
			len_test_2 -= len_test + 1;
			if (len_test_2 >= 2) {
				lzma_lzma_state state_2 = state;
				state_2 = ((state_2) < 7 ? .STATE_LIT_LONGREP : .STATE_NONLIT_REP);
				uint32_t pos_state_next = (position + len_test) & generatedPos_mask;
				uint32_t cur_and_len_literal_price = price + ModernizedCProgram.get_len_price(generatedRep_len_encoder, len_test, pos_state) + ModernizedCProgram.rc_bit_0_price(generatedIs_match[state_2][pos_state_next]) + ModernizedCProgram.get_literal_price(coder, position + len_test, buf[len_test - 1], 1, buf_back[len_test], buf[len_test]);
				state_2 = ((state_2) <= .STATE_SHORTREP_LIT_LIT ? .STATE_LIT_LIT : ((state_2) <= .STATE_LIT_SHORTREP ? (state_2) - 3 : (state_2) - 6));
				pos_state_next = (position + len_test + 1) & generatedPos_mask;
				uint32_t next_rep_match_price = cur_and_len_literal_price + ModernizedCProgram.rc_bit_1_price(generatedIs_match[state_2][pos_state_next]) + ModernizedCProgram.rc_bit_1_price(generatedIs_rep[state_2]);
				uint32_t offset = cur + len_test + 1 + len_test_2;
				while (len_end < offset) {
					generatedOpts[++len_end].setPrice((-1024 << 30));
				}
				uint32_t cur_and_len_price = next_rep_match_price + ModernizedCProgram.get_rep_price(coder, 0, len_test_2, state_2, pos_state_next);
				if (cur_and_len_price < generatedOpts[offset].getPrice()) {
					generatedOpts[offset].setPrice(cur_and_len_price);
					generatedOpts[offset].setPos_prev(cur + len_test + 1);
					generatedOpts[offset].setBack_prev(0);
					generatedOpts[offset].setPrev_1_is_literal(1);
					generatedOpts[offset].setPrev_2(1);
					generatedOpts[offset].setPos_prev_2(cur);
					generatedOpts[offset].setBack_prev_2(rep_index);
				} 
			} 
		}
		Object generatedMatches = this.getMatches();
		//for (uint32_t len_test = 2; len_test <= new_len; ++len_test)if (new_len > buf_avail) {
			new_len = buf_avail;
			matches_count = 0;
			while (new_len > generatedMatches[matches_count].getLen()) {
				++matches_count;
			}
			generatedMatches[matches_count++].setLen(new_len);
		} 
		if (new_len >= start_len) {
			uint32_t normal_match_price = match_price + ModernizedCProgram.rc_bit_0_price(generatedIs_rep[state]);
			while (len_end < cur + new_len) {
				generatedOpts[++len_end].setPrice((-1024 << 30));
			}
			uint32_t i = 0;
			while (start_len > generatedMatches[i].getLen()) {
				++i;
			}
			for (uint32_t len_test = start_len;
			 /*Error: Unsupported expression*/; ++len_test) {
				uint32_t cur_back = generatedMatches[i].getDist();
				uint32_t cur_and_len_price = normal_match_price + ModernizedCProgram.get_pos_len_price(coder, cur_back, len_test, pos_state);
				if (cur_and_len_price < generatedOpts[cur + len_test].getPrice()) {
					generatedOpts[cur + len_test].setPrice(cur_and_len_price);
					generatedOpts[cur + len_test].setPos_prev(cur);
					generatedOpts[cur + len_test].setBack_prev(cur_back + 4);
					generatedOpts[cur + len_test].setPrev_1_is_literal(0);
				} 
				if (len_test == generatedMatches[i].getLen()) {
					uint8_t buf_back = buf - cur_back - 1;
					uint32_t len_test_2 = len_test + 1;
					uint32_t limit = ((buf_avail_full) < (len_test_2 + nice_len) ? (buf_avail_full) : (len_test_2 + nice_len));
					for (; len_test_2 < limit && buf[len_test_2] == buf_back[len_test_2]; ++len_test_2) {
						;
					}
					len_test_2 -= len_test + 1;
					if (len_test_2 >= 2) {
						lzma_lzma_state state_2 = state;
						state_2 = ((state_2) < 7 ? .STATE_LIT_MATCH : .STATE_NONLIT_MATCH);
						uint32_t pos_state_next = (position + len_test) & generatedPos_mask;
						uint32_t cur_and_len_literal_price = cur_and_len_price + ModernizedCProgram.rc_bit_0_price(generatedIs_match[state_2][pos_state_next]) + ModernizedCProgram.get_literal_price(coder, position + len_test, buf[len_test - 1], 1, buf_back[len_test], buf[len_test]);
						state_2 = ((state_2) <= .STATE_SHORTREP_LIT_LIT ? .STATE_LIT_LIT : ((state_2) <= .STATE_LIT_SHORTREP ? (state_2) - 3 : (state_2) - 6));
						pos_state_next = (pos_state_next + 1) & generatedPos_mask;
						uint32_t next_rep_match_price = cur_and_len_literal_price + ModernizedCProgram.rc_bit_1_price(generatedIs_match[state_2][pos_state_next]) + ModernizedCProgram.rc_bit_1_price(generatedIs_rep[state_2]);
						uint32_t offset = cur + len_test + 1 + len_test_2;
						while (len_end < offset) {
							generatedOpts[++len_end].setPrice((-1024 << 30));
						}
						cur_and_len_price = next_rep_match_price + ModernizedCProgram.get_rep_price(coder, 0, len_test_2, state_2, pos_state_next);
						if (cur_and_len_price < generatedOpts[offset].getPrice()) {
							generatedOpts[offset].setPrice(cur_and_len_price);
							generatedOpts[offset].setPos_prev(cur + len_test + 1);
							generatedOpts[offset].setBack_prev(0);
							generatedOpts[offset].setPrev_1_is_literal(1);
							generatedOpts[offset].setPrev_2(1);
							generatedOpts[offset].setPos_prev_2(cur);
							generatedOpts[offset].setBack_prev_2(cur_back + 4);
						} 
					} 
					if (++i == matches_count) {
						break;
					} 
				} 
			}
		} 
		return len_end;
	}
	public Object block_decode(Object allocator, Object[] in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		lzma_next_coder_s generatedNext = this.getNext();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedCompressed_size = this.getCompressed_size();
		Object generatedCompressed_limit = this.getCompressed_limit();
		Object generatedUncompressed_size = this.getUncompressed_size();
		Object generatedCheck = this.getCheck();
		Object generatedBlock = this.getBlock();
		Object generatedCheck_pos = this.getCheck_pos();
		Object generatedSequence = this.getSequence();
		switch (generatedSequence) {
		case .SEQ_CODE:
				{ 
					size_t in_start = in_pos;
					size_t out_start = out_pos;
					 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
					size_t in_used = in_pos - in_start;
					size_t out_used = out_pos - out_start;
					if (ModernizedCProgram.update_size(generatedCompressed_size, in_used, generatedCompressed_limit) || ModernizedCProgram.update_size(generatedUncompressed_size, out_used, generatedUncompressed_size)) {
						return LZMA_DATA_ERROR;
					} 
					ModernizedCProgram.lzma_check_update(generatedCheck, generatedCheck, out + out_start, out_used);
					if (ret != LZMA_STREAM_END) {
						return ret;
					} 
					if (!ModernizedCProgram.is_size_valid(generatedCompressed_size, generatedCompressed_size) || !ModernizedCProgram.is_size_valid(generatedUncompressed_size, generatedUncompressed_size)) {
						return LZMA_DATA_ERROR;
					} 
					generatedBlock.setCompressed_size(generatedCompressed_size);
					generatedBlock.setUncompressed_size(generatedUncompressed_size);
					this.setSequence(.SEQ_PADDING);
				}
		case .SEQ_CHECK:
				{ 
					size_t check_size = ModernizedCProgram.lzma_check_size(generatedCheck);
					ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, generatedBlock.getRaw_check(), generatedCheck_pos, check_size);
					if (generatedCheck_pos < check_size) {
						return LZMA_OK;
					} 
					if (ModernizedCProgram.lzma_check_is_supported(generatedCheck) && /*Error: Function owner not recognized*/memcmp(generatedBlock.getRaw_check(), generatedCheck.getBuffer().getU8(), check_size) != 0) {
						return LZMA_DATA_ERROR;
					} 
					return LZMA_STREAM_END;
				}
		case .SEQ_PADDING:
				while (generatedCompressed_size & 3) {
					if (in_pos >= in_size) {
						return LZMA_OK;
					} 
					++generatedCompressed_size;
					if (in[(in_pos)++] != -1024) {
						return LZMA_DATA_ERROR;
					} 
				}
				if (generatedCheck == .LZMA_CHECK_NONE) {
					return LZMA_STREAM_END;
				} 
				ModernizedCProgram.lzma_check_finish(generatedCheck, generatedCheck);
				this.setSequence(.SEQ_CHECK);
		}
		return LZMA_PROG_ERROR;
	}
	public void block_decoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object block_encode(Object allocator, Object in, Object in_pos, Object in_size, Object[] out, Object out_pos, Object out_size, Object action) {
		Object generatedUncompressed_size = this.getUncompressed_size();
		// Check that our amount of input stays in proper limits.if (LZMA_VLI_MAX - generatedUncompressed_size < in_size - in_pos) {
			return LZMA_DATA_ERROR;
		} 
		lzma_next_coder_s generatedNext = this.getNext();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		Object generatedCompressed_size = this.getCompressed_size();
		Object generatedCheck = this.getCheck();
		Object generatedBlock = this.getBlock();
		Object generatedPos = this.getPos();
		Object generatedSequence = this.getSequence();
		switch (generatedSequence) {
		case .SEQ_PADDING:
				while (generatedCompressed_size & 3) {
					if (out_pos >= out_size) {
						return LZMA_OK;
					} 
					out[out_pos] = -1024;
					++out_pos;
					++generatedCompressed_size;
				}
				if (generatedCheck == .LZMA_CHECK_NONE) {
					return LZMA_STREAM_END;
				} 
				ModernizedCProgram.lzma_check_finish(generatedCheck, generatedCheck);
				this.setSequence(.SEQ_CHECK);
		case .SEQ_CODE:
				{ 
					size_t in_start = in_pos;
					size_t out_start = out_pos;
					 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, out, out_pos, out_size, action);
					size_t in_used = in_pos - in_start;
					size_t out_used = out_pos - out_start;
					if (((LZMA_VLI_MAX - LZMA_BLOCK_HEADER_SIZE_MAX - 64) & ~/*Error: Function owner not recognized*/LZMA_VLI_C(3)) - generatedCompressed_size < out_used) {
						return LZMA_DATA_ERROR;
					} 
					generatedCompressed_size += out_used;
					generatedUncompressed_size += in_used;
					ModernizedCProgram.lzma_check_update(generatedCheck, generatedCheck, in + in_start, in_used);
					if (ret != LZMA_STREAM_END || action == LZMA_SYNC_FLUSH) {
						return ret;
					} 
					((in_pos == in_size) ? (Object)0 : /*Error: Function owner not recognized*/_assert("*in_pos == in_size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\block_encoder.c", 84));
					((action == LZMA_FINISH) ? (Object)0 : /*Error: Function owner not recognized*/_assert("action == LZMA_FINISH", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\block_encoder.c", 85));
					generatedBlock.setCompressed_size(generatedCompressed_size);
					generatedBlock.setUncompressed_size(generatedUncompressed_size);
					this.setSequence(.SEQ_PADDING);
				}
		case .SEQ_CHECK:
				{ 
					size_t check_size = ModernizedCProgram.lzma_check_size(generatedCheck);
					ModernizedCProgram.lzma_bufcpy(generatedCheck.getBuffer().getU8(), generatedPos, check_size, out, out_pos, out_size);
					if (generatedPos < check_size) {
						return LZMA_OK;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBlock.getRaw_check(), generatedCheck.getBuffer().getU8(), check_size);
					return LZMA_STREAM_END;
				}
		}
		return LZMA_PROG_ERROR;
	}
	public void block_encoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object block_encoder_update(Object allocator, Object filters, Object reversed_filters) {
		Object generatedSequence = this.getSequence();
		if (generatedSequence != .SEQ_CODE) {
			return LZMA_PROG_ERROR;
		} 
		lzma_next_coder_s generatedNext = this.getNext();
		return generatedNext.lzma_next_filter_update(allocator, reversed_filters);
	}
	/// Otherwise we call the next filter in the chain to process in[] and
	/// write its output to mf->buffer.
	///
	/// This function must not be called once it has returned LZMA_STREAM_END.
	///
	public Object fill_window(Object allocator, Object in, Object in_pos, Object in_size, Object action) {
		Object generatedMf = this.getMf();
		((generatedMf.getRead_pos() <= generatedMf.getWrite_pos()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->mf.read_pos <= coder->mf.write_pos", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 82));
		// Move the sliding window if needed.if (generatedMf.getRead_pos() >= generatedMf.getSize() - generatedMf.getKeep_size_after()) {
			generatedMf.move_window();
		} 
		// (which I find cleanest), but we need size_t here when filling// the history window.size_t write_pos = generatedMf.getWrite_pos();
		 ret = new ();
		lzma_next_coder_s generatedNext = this.getNext();
		Object generatedCode = generatedNext.getCode();
		lzma_coder_s generatedCoder = generatedNext.getCoder();
		if (generatedCode == ((Object)0)) {
			ModernizedCProgram.lzma_bufcpy(in, in_pos, in_size, generatedMf.getBuffer(), write_pos, generatedMf.getSize());
			ret = action != LZMA_RUN && in_pos == in_size ? LZMA_STREAM_END : LZMA_OK;
		} else {
				ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, in, in_pos, in_size, generatedMf.getBuffer(), write_pos, generatedMf.getSize(), action);
		} 
		// Not using a filter, simply memcpy() as much as possible.
		generatedMf.setWrite_pos(write_pos)// If end of stream has been reached or flushing completed, we allow// the encoder to process all the input (that is, read_pos is allowed;// If end of stream has been reached or flushing completed, we allow// the encoder to process all the input (that is, read_pos is allowed
		// to reach write_pos). Otherwise we keep keep_size_after bytes// available as prebuffer.if (ret == LZMA_STREAM_END) {
			((in_pos == in_size) ? (Object)0 : /*Error: Function owner not recognized*/_assert("*in_pos == in_size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 115));
			ret = LZMA_OK;
			generatedMf.setAction(action);
			generatedMf.setRead_limit(generatedMf.getWrite_pos());
		}  else if (generatedMf.getWrite_pos() > generatedMf.getKeep_size_after()) {
			generatedMf.setRead_limit(generatedMf.getWrite_pos() - generatedMf.getKeep_size_after());
		} 
		// Restart the match finder after finished LZMA_SYNC_FLUSH.if (generatedMf.getPending() > 0 && generatedMf.getRead_pos() < generatedMf.getRead_limit()) {
			size_t pending = generatedMf.getPending();
			generatedMf.setPending(0);
			((generatedMf.getRead_pos() >= pending) ? (Object)0 : /*Error: Function owner not recognized*/_assert("coder->mf.read_pos >= pending", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 138));
			generatedMf.getRead_pos() -= pending;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMf, pending);
		} 
		return ret;
	}
	public Object lz_encode(Object allocator, Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size, Object action) {
		Object generatedMf = this.getMf();
		 generatedLz = this.getLz();
		Object generatedCoder = generatedLz.getCoder();
		while (out_pos < out_size && (in_pos < in_size || action != LZMA_RUN)) {
			if (generatedMf.getAction() == LZMA_RUN && generatedMf.getRead_pos() >= generatedMf.getRead_limit()) {
				do {
					 ret_ = (coder.fill_window(allocator, in, in_pos, in_size, action));
					if (ret_ != LZMA_OK) {
						return ret_;
					} 
				} while (0);
			} 
			 ret = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, generatedMf, out, out_pos, out_size);
			if (ret != LZMA_OK) {
				generatedMf.setAction(LZMA_RUN);
				return ret;
			} 
		}
		return LZMA_OK;
	}
	public void lz_encoder_end(Object allocator) {
		lzma_next_coder_s generatedNext = this.getNext();
		generatedNext.lzma_next_end(allocator);
		Object generatedMf = this.getMf();
		ModernizedCProgram.lzma_free(generatedMf.getHash(), allocator);
		ModernizedCProgram.lzma_free(generatedMf.getBuffer(), allocator);
		 generatedLz = this.getLz();
		Object generatedEnd = generatedLz.getEnd();
		Object generatedCoder = generatedLz.getCoder();
		if (generatedEnd != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator);
		} else {
				ModernizedCProgram.lzma_free(generatedCoder, allocator);
		} 
		ModernizedCProgram.lzma_free(coder, allocator);
		return /*Error: Unsupported expression*/;
	}
	public Object lz_encoder_update(Object allocator, Object filters_null, Object reversed_filters) {
		 generatedLz = this.getLz();
		Object generatedOptions_update = generatedLz.getOptions_update();
		if (generatedOptions_update == ((Object)0)) {
			return LZMA_PROG_ERROR;
		} 
		Object generatedCoder = generatedLz.getCoder();
		do {
			 ret_ = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, reversed_filters));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		lzma_next_coder_s generatedNext = this.getNext();
		return generatedNext.lzma_next_filter_update(allocator, reversed_filters + 1);
	}
	public  getDict() {
		return dict;
	}
	public void setDict( newDict) {
		dict = newDict;
	}
	public  getLz() {
		return lz;
	}
	public void setLz( newLz) {
		lz = newLz;
	}
	public lzma_next_coder_s getNext() {
		return next;
	}
	public void setNext(lzma_next_coder_s newNext) {
		next = newNext;
	}
	public boolean getNext_finished() {
		return next_finished;
	}
	public void setNext_finished(boolean newNext_finished) {
		next_finished = newNext_finished;
	}
	public boolean getThis_finished() {
		return this_finished;
	}
	public void setThis_finished(boolean newThis_finished) {
		this_finished = newThis_finished;
	}
	public  getTemp() {
		return temp;
	}
	public void setTemp( newTemp) {
		temp = newTemp;
	}
}
/// Dictionary (history buffer)
