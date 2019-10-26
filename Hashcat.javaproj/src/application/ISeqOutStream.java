package application;

public class ISeqOutStream {
	private Object Write;
	
	public ISeqOutStream(Object Write) {
		setWrite(Write);
	}
	public ISeqOutStream() {
	}
	
	/* XzEnc.c -- Xz Encode
	2019-02-02 : Igor Pavlov : Public domain */
	// #define _7ZIP_ST
	/* max pack size for LZMA2 block + check-64bytrs: */
	public Object WriteBytes(Object buf, Object size) {
		return (.UNRECOGNIZEDFUNCTIONNAME(s, buf, size) == size) ? 0 : 9;
	}
	public Object WriteBytesUpdateCrc(Object buf, Object size, Object crc) {
		crc = ModernizedCProgram.CrcUpdate(crc, buf, size);
		return s.WriteBytes(buf, size);
	}
	public Object Xz_WriteHeader(Object f) {
		UInt32 crc = new UInt32();
		Byte[] header = new Byte();
		.memcpy(header, ModernizedCProgram.XZ_SIG, 6);
		header[6] = (Byte)(f >> 8);
		header[6 + 1] = (Byte)(f & -1024);
		crc = ModernizedCProgram.CrcCalc(header + 6, 2);
		{ 
			(UInt32)(header + 6 + 2) = (crc);
		}
		;
		return s.WriteBytes(header, (6 + 2 + 4));
	}
	public Object XzBlock_WriteHeader(Object p) {
		Byte[] header = new Byte();
		int pos = 1;
		int numFilters;
		int i;
		header[pos++] = p.getFlags();
		if ((((p).getFlags() & (1 << 6)) != 0)) {
			pos += ModernizedCProgram.Xz_WriteVarInt(header + pos, p.getPackSize());
		} 
		if ((((p).getFlags() & (1 << 7)) != 0)) {
			pos += ModernizedCProgram.Xz_WriteVarInt(header + pos, p.getUnpackSize());
		} 
		numFilters = (((p).getFlags() & 3) + 1);
		for (i = 0; i < numFilters; i++) {
			CXzFilter f = p.getFilters()[i];
			pos += ModernizedCProgram.Xz_WriteVarInt(header + pos, f.getId());
			pos += ModernizedCProgram.Xz_WriteVarInt(header + pos, f.getPropsSize());
			.memcpy(header + pos, f.getProps(), f.getPropsSize());
			pos += f.getPropsSize();
		}
		while ((pos & 3) != 0) {
			header[pos++] = 0;
		}
		header[0] = (Byte)(pos >> 2);
		{ 
			(UInt32)(header + pos) = (ModernizedCProgram.CrcCalc(header, pos));
		}
		;
		return s.WriteBytes(header, pos + 4);
	}
	public Object XzEncIndex_WriteFooter(Object p, Object flags) {
		Byte[] buf = new Byte();
		UInt64 globalPos = new UInt64();
		UInt32 crc = -1024;
		int pos = 1 + ModernizedCProgram.Xz_WriteVarInt(buf + 1, p.getNumBlocks());
		globalPos = pos;
		buf[0] = 0;
		{ 
			int __result__ = (s.WriteBytesUpdateCrc(buf, pos, crc));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		{ 
			int __result__ = (s.WriteBytesUpdateCrc(p.getBlocks(), p.getSize(), crc));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		globalPos += p.getSize();
		pos = ((4 - ((int)(globalPos) & 3)) & 3);
		buf[1] = 0;
		buf[2] = 0;
		buf[3] = 0;
		globalPos += pos;
		crc = ModernizedCProgram.CrcUpdate(crc, buf + 4 - pos, pos);
		{ 
			(UInt32)(buf + 4) = (((crc) ^ -1024));
		}
		;
		{ 
			(UInt32)(buf + 8 + 4) = ((UInt32)(globalPos >> 2));
		}
		;
		buf[8 + 8] = (Byte)(flags >> 8);
		buf[8 + 9] = (Byte)(flags & -1024);
		{ 
			(UInt32)(buf + 8) = (ModernizedCProgram.CrcCalc(buf + 8 + 4, 6));
		}
		;
		buf[8 + 10] = (byte)'Y';
		buf[8 + 11] = (byte)'Z';
		return s.WriteBytes(buf + 4 - pos, pos + 4 + 12);
	}
	public Object Xz_EncodeEmpty() {
		SRes res = new SRes();
		CXzEncIndex xzIndex = new CXzEncIndex();
		xzIndex.XzEncIndex_Construct();
		res = outStream.Xz_WriteHeader((CXzStreamFlags)0);
		if (res == 0) {
			res = outStream.XzEncIndex_WriteFooter(xzIndex, (CXzStreamFlags)0);
		} 
		// g_Alloc// g_AllocxzIndex.XzEncIndex_Free(((Object)0));
		return res;
	}
	public Object getWrite() {
		return Write;
	}
	public void setWrite(Object newWrite) {
		Write = newWrite;
	}
}
