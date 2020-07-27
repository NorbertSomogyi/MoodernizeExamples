package application;

public class ICompressProgress {
	private Object Progress;
	
	public ICompressProgress(Object Progress) {
		setProgress(Progress);
	}
	public ICompressProgress() {
	}
	
	public Object Progress(Object inSize, Object outSize) {
		return (p && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p, inSize, outSize) != 0) ? 10 : 0/* ---------- Lzma2 ---------- */;
	}
	public Object LzmaEnc_MemEncode(Object pp, Object dest, Object destLen, Object src, Object srcLen, int writeEndMark, Object alloc, Object allocBig) {
		SRes res = new SRes();
		CLzmaEnc p = (CLzmaEnc)pp;
		CLzmaEnc_SeqOutStreamBuf outStream = new CLzmaEnc_SeqOutStreamBuf();
		Object generatedVt = outStream.getVt();
		generatedVt.setWrite(SeqOutStreamBuf_Write);
		outStream.setData(dest);
		outStream.setRem(destLen);
		outStream.setOverflow(0);
		p.setWriteEndMark(writeEndMark);
		Object generatedRc = p.getRc();
		generatedRc.setOutStream(generatedVt);
		res = ModernizedCProgram.LzmaEnc_MemPrepare(pp, src, srcLen, 0, alloc, allocBig);
		Object generatedNowPos64 = p.getNowPos64();
		if (res == 0) {
			res = ModernizedCProgram.LzmaEnc_Encode2(p, progress);
			if (res == 0 && generatedNowPos64 != srcLen) {
				res = 11;
			} 
		} 
		Object generatedRem = outStream.getRem();
		destLen -= generatedRem;
		Object generatedOverflow = outStream.getOverflow();
		if (generatedOverflow) {
			return 7;
		} 
		return res;
	}
	public Object LzmaEncode(Object dest, Object destLen, Object src, Object srcLen, Object props, Object propsEncoded, Object propsSize, int writeEndMark, Object alloc, Object allocBig) {
		CLzmaEnc p = (CLzmaEnc)ModernizedCProgram.LzmaEnc_Create(alloc);
		SRes res = new SRes();
		if (!p) {
			return 2;
		} 
		res = ModernizedCProgram.LzmaEnc_SetProps(p, props);
		if (res == 0) {
			res = ModernizedCProgram.LzmaEnc_WriteProperties(p, propsEncoded, propsSize);
			if (res == 0) {
				res = progress.LzmaEnc_MemEncode(p, dest, destLen, src, srcLen, writeEndMark, alloc, allocBig);
			} 
		} 
		ModernizedCProgram.LzmaEnc_Destroy(p, alloc, allocBig);
		return res;
	}
	public Object getProgress() {
		return Progress;
	}
	public void setProgress(Object newProgress) {
		Progress = newProgress;
	}
}
