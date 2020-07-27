package application;

public class ISeqInStream {
	private Object Read;
	
	public ISeqInStream(Object Read) {
		setRead(Read);
	}
	public ISeqInStream() {
	}
	
	/* XzIn.c - Xz input
	2018-07-04 : Igor Pavlov : Public domain */
	/*
	#define XZ_FOOTER_SIG_CHECK(p) (memcmp((p), XZ_FOOTER_SIG, XZ_FOOTER_SIG_SIZE) == 0)
	*/
	public Object Xz_ReadHeader(Object p) {
		Byte[] sig = new Byte();
		{ 
			int __result__ = (ModernizedCProgram.SeqInStream_Read2(inStream, sig, (6 + 2 + 4), 17));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		if (/*Error: Function owner not recognized*/memcmp(sig, ModernizedCProgram.XZ_SIG, 6) != 0) {
			return 17;
		} 
		return ModernizedCProgram.Xz_ParseHeader(p, sig);
	}
	public Object FullRead(Object data, Object processedSize) {
		size_t size = processedSize;
		processedSize = 0;
		while (size != 0) {
			size_t cur = size;
			SRes res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(stream, data, cur);
			processedSize += cur;
			data += cur;
			size -= cur;
			{ 
				int __result__ = (res);
				if (__result__ != 0) {
					return __result__;
				} 
			}
			;
			if (cur == 0) {
				return 0;
			} 
		}
		return 0;
		size_t size = processedSize;
		processedSize = 0;
		while (size != 0) {
			size_t cur = size;
			SRes res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(stream, data, cur);
			processedSize += cur;
			data += cur;
			size -= cur;
			{ 
				int __result__ = (res);
				if (__result__ != 0) {
					return __result__;
				} 
			}
			;
			if (cur == 0) {
				return 0;
			} 
		}
		return 0/*
		  ThreadFunc2() returns:
		  SZ_OK           - in all normal cases (even for stream error or memory allocation error)
		  SZ_ERROR_THREAD - in case of failure in system synch function
		*/;
	}
	public Object LzmaEnc_PrepareForLzma2(Object pp, Object keepWindowSize, Object alloc, Object allocBig) {
		CLzmaEnc p = (CLzmaEnc)pp;
		Object generatedMatchFinderBase = p.getMatchFinderBase();
		generatedMatchFinderBase.setStream(inStream);
		p.setNeedInit(1);
		return p.LzmaEnc_AllocAndInit(keepWindowSize, alloc, allocBig);
	}
	/* ---------- Read from CLzma2DecMtHandle Interface ---------- */
	public Object Lzma2DecMt_Init(Object pp, Object prop, Object props, Object outDataSize, int finishMode) {
		CLzma2DecMt p = (CLzma2DecMt)pp;
		if (prop > 40) {
			return 4;
		} 
		p.setProp(prop);
		p.setProps(props);
		p.setInStream(inStream);
		p.setOutSize(0);
		p.setOutSize_Defined(0);
		if (outDataSize) {
			p.setOutSize_Defined(1);
			p.setOutSize(outDataSize);
		} 
		p.setFinishMode(finishMode);
		p.setOutProcessed(0);
		p.setInProcessed(0);
		p.setInPos(0);
		p.setInLim(0);
		return p.Lzma2Dec_Prepare_ST();
	}
	public Object getRead() {
		return Read;
	}
	public void setRead(Object newRead) {
		Read = newRead;
	}
}
