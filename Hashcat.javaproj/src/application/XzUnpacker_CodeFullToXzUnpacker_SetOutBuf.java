package application;

public class XzUnpacker_CodeFullToXzUnpacker_SetOutBuf {
	
	
	private static Object XzUnpacker_CodeFull(Object dest, Object destLen, Object src, Object srcLen,  finishMode,  status) {
		p.XzUnpacker_Init();
		p.XzUnpacker_SetOutBuf(dest, destLen);
		return p.XzUnpacker_Code((null), destLen, src, srcLen, 1, finishMode, status);
	}
	public static void XzUnpacker_Init() {
		this.setState(.XZ_STATE_STREAM_HEADER);
		this.setPos(0);
		this.setNumStartedStreams(0);
		this.setNumFinishedStreams(0);
		this.setNumTotalBlocks(0);
		this.setPadSize(0);
		this.setDecodeOnlyOneBlock(0);
		this.setParseMode(0);
		this.setDecodeToStreamSignature(0)// p->outBuf = NULL;;// p->outBuf = NULL;
		// p->outBufSize = 0;// p->outBufSize = 0;this.setOutDataWritten(0);
	}
	public static void XzUnpacker_SetOutBuf(Object outBuf, Object outBufSize) {
		this.setOutBuf(outBuf);
		this.setOutBufSize(outBufSize);
	}
}
