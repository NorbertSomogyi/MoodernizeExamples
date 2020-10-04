package application;

public class xz_dec {
	private  sequence;
	private Object pos;
	private Object vli;
	private Object in_start;
	private Object out_start;
	private Object crc32;
	private xz_check check_type;
	private xz_mode mode;
	private boolean allow_buf_error;
	private  block_header;
	private  block;
	private  index;
	private  temp;
	private xz_dec_lzma2 lzma2;
	private xz_dec_bcj bcj;
	private boolean bcj_active;
	
	public xz_dec( sequence, Object pos, Object vli, Object in_start, Object out_start, Object crc32, xz_check check_type, xz_mode mode, boolean allow_buf_error,  block_header,  block,  index,  temp, xz_dec_lzma2 lzma2, xz_dec_bcj bcj, boolean bcj_active) {
		setSequence(sequence);
		setPos(pos);
		setVli(vli);
		setIn_start(in_start);
		setOut_start(out_start);
		setCrc32(crc32);
		setCheck_type(check_type);
		setMode(mode);
		setAllow_buf_error(allow_buf_error);
		setBlock_header(block_header);
		setBlock(block);
		setIndex(index);
		setTemp(temp);
		setLzma2(lzma2);
		setBcj(bcj);
		setBcj_active(bcj_active);
	}
	public xz_dec() {
	}
	
	public xz_ret dec_vli(Object[] in, Object in_pos, Object in_size) {
		uint8_t byte = new uint8_t();
		Object generatedPos = this.getPos();
		if (generatedPos == 0) {
			this.setVli(0);
		} 
		Object generatedVli = this.getVli();
		while (in_pos < in_size) {
			byte = in[in_pos];
			++in_pos;
			generatedVli |=  (vli_type)(byte & -1024) << generatedPos;
			if ((byte & -1024) == 0) {
				if (byte == 0 && generatedPos != /* Don't allow non-minimal encodings. */0) {
					return xz_ret.XZ_DATA_ERROR;
				} 
				this.setPos(0);
				return xz_ret.XZ_STREAM_END;
			} 
			generatedPos += 7;
			if (generatedPos == 7 * (/*Error: Unsupported expression*/ * 8 / 7)) {
				return xz_ret.XZ_DATA_ERROR;
			} 
		}
		return xz_ret.XZ_OK/*
		 * Decode the Compressed Data field from a Block. Update and validate
		 * the observed compressed and uncompressed sizes of the Block so that
		 * they don't exceed the values possibly stored in the Block Header
		 * (validation assumes that no integer overflow occurs, since vli_type
		 * is normally uint64_t). Update the CRC32 if presence of the CRC32
		 * field was indicated in Stream Header.
		 *
		 * Once the decoding is finished, validate that the observed sizes match
		 * the sizes possibly stored in the Block Header. Update the hash and
		 * Block count, which are later used to validate the Index field.
		 */;
	}
	/* Update the Index size and the CRC32 value. */
	public void index_update(Object b) {
		Object generatedIn_start = this.getIn_start();
		size_t in_used = b.getIn_pos() - generatedIn_start;
		 generatedIndex = this.getIndex();
		Object generatedSize = generatedIndex.getSize();
		generatedSize += in_used;
		Object generatedCrc32 = this.getCrc32();
		this.setCrc32(ModernizedCProgram.xz_crc32(b.getIn() + generatedIn_start, in_used, generatedCrc32));
	}
	public xz_ret dec_stream_header() {
		 generatedTemp = this.getTemp();
		Object generatedBuf = generatedTemp.getBuf();
		if (!(/*Error: Function owner not recognized*/memcmp(generatedBuf, "\xFD7zXZ", 6) == 0)) {
			return xz_ret.XZ_FORMAT_ERROR;
		} 
		if (ModernizedCProgram.xz_crc32(generatedBuf + 6, 2, 0) != ModernizedCProgram.get_unaligned_le32(generatedBuf + 6 + 2)) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		if (generatedBuf[6] != 0) {
			return xz_ret.XZ_OPTIONS_ERROR/*
				 * Of integrity checks, we support only none (Check ID = 0) and
				 * CRC32 (Check ID = 1). However, if XZ_DEC_ANY_CHECK is defined,
				 * we will accept other check types too, but then the check won't
				 * be verified and a warning (XZ_UNSUPPORTED_CHECK) will be given.
				 */;
		} 
		this.setCheck_type(generatedBuf[6 + 1]);
		xz_check generatedCheck_type = this.getCheck_type();
		if (generatedCheck_type > xz_check.XZ_CHECK_CRC32) {
			return xz_ret.XZ_OPTIONS_ERROR;
		} 
		return xz_ret.XZ_OK;
	}
	public xz_ret dec_stream_footer() {
		 generatedTemp = this.getTemp();
		Object generatedBuf = generatedTemp.getBuf();
		if (!(/*Error: Function owner not recognized*/memcmp(generatedBuf + 10, "YZ", 2) == 0)) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		if (ModernizedCProgram.xz_crc32(generatedBuf + 4, 6, 0) != ModernizedCProgram.get_unaligned_le32(generatedBuf)) {
			return xz_ret.XZ_DATA_ERROR/*
				 * Validate Backward Size. Note that we never added the size of the
				 * Index CRC32 field to s->index.size, thus we use s->index.size / 4
				 * instead of s->index.size / 4 - 1.
				 */;
		} 
		 generatedIndex = this.getIndex();
		Object generatedSize = generatedIndex.getSize();
		if ((generatedSize >> 2) != ModernizedCProgram.get_unaligned_le32(generatedBuf + 4)) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		xz_check generatedCheck_type = this.getCheck_type();
		if (generatedBuf[8] != 0 || generatedBuf[9] != generatedCheck_type) {
			return xz_ret.XZ_DATA_ERROR/*
				 * Use XZ_STREAM_END instead of XZ_OK to be more convenient
				 * for the caller.
				 */;
		} 
		return xz_ret.XZ_STREAM_END;
	}
	public xz_ret dec_block_header() {
		xz_ret ret;
		/*
			 * Validate the CRC32. We know that the temp buffer is at least
			 * eight bytes so this is safe.
			 */
		 generatedTemp = this.getTemp();
		Object generatedSize = generatedTemp.getSize();
		generatedSize -= 4;
		Object generatedBuf = generatedTemp.getBuf();
		if (ModernizedCProgram.xz_crc32(generatedBuf, generatedSize, 0) != ModernizedCProgram.get_unaligned_le32(generatedBuf + generatedSize)) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		generatedTemp.setPos(2/*
			 * Catch unsupported Block Flags. We support only one or two filters
			 * in the chain, so we catch that with the same test.
			 */);
		if (generatedBuf[1] & -1024) {
			return xz_ret.XZ_OPTIONS_ERROR;
		} 
		Object generatedPos = generatedTemp.getPos();
		Object generatedVli = this.getVli();
		 generatedBlock_header = this.getBlock_header();
		if (generatedBuf[1] & /* Compressed Size */-1024) {
			if (s.dec_vli(generatedBuf, generatedPos, generatedSize) != xz_ret.XZ_STREAM_END) {
				return xz_ret.XZ_DATA_ERROR;
			} 
			generatedBlock_header.setCompressed(generatedVli);
		} else {
				generatedBlock_header.setCompressed(((vli_type)-1));
		} 
		if (generatedBuf[1] & /* Uncompressed Size */-1024) {
			if (s.dec_vli(generatedBuf, generatedPos, generatedSize) != xz_ret.XZ_STREAM_END) {
				return xz_ret.XZ_DATA_ERROR;
			} 
			generatedBlock_header.setUncompressed(generatedVli);
		} else {
				generatedBlock_header.setUncompressed(((vli_type)-1));
		} 
		this.setBcj_active(generatedBuf[1] & /* If there are two filters, the first one must be a BCJ filter. */-1024);
		boolean generatedBcj_active = this.getBcj_active();
		xz_dec_bcj generatedBcj = this.getBcj();
		if (generatedBcj_active) {
			if (generatedSize - generatedPos < 2) {
				return xz_ret.XZ_OPTIONS_ERROR;
			} 
			xz_ret.ret = generatedBcj.xz_dec_bcj_reset(generatedBuf[generatedPos++]);
			if (xz_ret.ret != xz_ret.XZ_OK) {
				return xz_ret.ret/*
						 * We don't support custom start offset,
						 * so Size of Properties must be zero.
						 */;
			} 
			if (generatedBuf[generatedPos++] != -1024) {
				return xz_ret.XZ_OPTIONS_ERROR;
			} 
		} 
		if (generatedSize - generatedPos < /* Valid Filter Flags always take at least two bytes. */2) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		if (generatedBuf[generatedPos++] != /* Filter ID = LZMA2 */-1024) {
			return xz_ret.XZ_OPTIONS_ERROR;
		} 
		if (generatedBuf[generatedPos++] != /* Size of Properties = 1-byte Filter Properties */-1024) {
			return xz_ret.XZ_OPTIONS_ERROR;
		} 
		if (generatedSize - generatedPos < /* Filter Properties contains LZMA2 dictionary size. */1) {
			return xz_ret.XZ_DATA_ERROR;
		} 
		xz_dec_lzma2 generatedLzma2 = this.getLzma2();
		xz_ret.ret = generatedLzma2.xz_dec_lzma2_reset(generatedBuf[generatedPos++]);
		if (xz_ret.ret != xz_ret.XZ_OK) {
			return xz_ret.ret;
		} 
		while (generatedPos < generatedSize) {
			if (generatedBuf[generatedPos++] != -1024) {
				return xz_ret.XZ_OPTIONS_ERROR;
			} 
		}
		generatedTemp.setPos(0);
		 generatedBlock = this.getBlock();
		generatedBlock.setCompressed(0);
		generatedBlock.setUncompressed(0);
		return xz_ret.XZ_OK;
	}
	public xz_dec xz_dec_init(xz_mode mode, Object dict_max) {
		xz_dec s = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		if (s == (null)) {
			return (null);
		} 
		s.setMode(xz_mode.mode);
		xz_dec_bcj xz_dec_bcj = new xz_dec_bcj();
		s.setBcj(xz_dec_bcj.xz_dec_bcj_create(((xz_mode.mode) == xz_mode.XZ_SINGLE)));
		xz_dec_bcj generatedBcj = s.getBcj();
		if (generatedBcj == (null)) {
			;
		} 
		xz_dec_lzma2 xz_dec_lzma2 = new xz_dec_lzma2();
		s.setLzma2(xz_dec_lzma2.xz_dec_lzma2_create(xz_mode.mode, dict_max));
		xz_dec_lzma2 generatedLzma2 = s.getLzma2();
		if (generatedLzma2 == (null)) {
			;
		} 
		s.xz_dec_reset();
		return s;
		return (null);
	}
	public void xz_dec_reset() {
		this.setSequence(.SEQ_STREAM_HEADER);
		this.setAllow_buf_error(0);
		this.setPos(0);
		this.setCrc32(0);
		 generatedBlock = this.getBlock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedBlock, 0, /*Error: sizeof expression not supported yet*/);
		 generatedIndex = this.getIndex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedIndex, 0, /*Error: sizeof expression not supported yet*/);
		 generatedTemp = this.getTemp();
		generatedTemp.setPos(0);
		generatedTemp.setSize(12);
	}
	public void xz_dec_end() {
		xz_dec_lzma2 generatedLzma2 = this.getLzma2();
		xz_dec_bcj generatedBcj = this.getBcj();
		if (s != (null)) {
			generatedLzma2.xz_dec_lzma2_end();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedBcj);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
		} 
	}
	public  getSequence() {
		return sequence;
	}
	public void setSequence( newSequence) {
		sequence = newSequence;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getVli() {
		return vli;
	}
	public void setVli(Object newVli) {
		vli = newVli;
	}
	public Object getIn_start() {
		return in_start;
	}
	public void setIn_start(Object newIn_start) {
		in_start = newIn_start;
	}
	public Object getOut_start() {
		return out_start;
	}
	public void setOut_start(Object newOut_start) {
		out_start = newOut_start;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public xz_check getCheck_type() {
		return check_type;
	}
	public void setCheck_type(xz_check newCheck_type) {
		check_type = newCheck_type;
	}
	public xz_mode getMode() {
		return mode;
	}
	public void setMode(xz_mode newMode) {
		mode = newMode;
	}
	public boolean getAllow_buf_error() {
		return allow_buf_error;
	}
	public void setAllow_buf_error(boolean newAllow_buf_error) {
		allow_buf_error = newAllow_buf_error;
	}
	public  getBlock_header() {
		return block_header;
	}
	public void setBlock_header( newBlock_header) {
		block_header = newBlock_header;
	}
	public  getBlock() {
		return block;
	}
	public void setBlock( newBlock) {
		block = newBlock;
	}
	public  getIndex() {
		return index;
	}
	public void setIndex( newIndex) {
		index = newIndex;
	}
	public  getTemp() {
		return temp;
	}
	public void setTemp( newTemp) {
		temp = newTemp;
	}
	public xz_dec_lzma2 getLzma2() {
		return lzma2;
	}
	public void setLzma2(xz_dec_lzma2 newLzma2) {
		lzma2 = newLzma2;
	}
	public xz_dec_bcj getBcj() {
		return bcj;
	}
	public void setBcj(xz_dec_bcj newBcj) {
		bcj = newBcj;
	}
	public boolean getBcj_active() {
		return bcj_active;
	}
	public void setBcj_active(boolean newBcj_active) {
		bcj_active = newBcj_active;
	}
}
/* Position in dec_main() */
