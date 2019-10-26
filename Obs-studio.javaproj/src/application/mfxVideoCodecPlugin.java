package application;

public class mfxVideoCodecPlugin {
	private Object Query;
	private Object QueryIOSurf;
	private Object Init;
	private Object Reset;
	private Object Close;
	private Object GetVideoParam;
	private Object EncodeFrameSubmit;
	private Object DecodeHeader;
	private Object GetPayload;
	private Object DecodeFrameSubmit;
	private Object VPPFrameSubmit;
	private Object VPPFrameSubmitEx;
	private Object ENCFrameSubmit;
	private Object reserved1;
	private Object reserved2;
	
	public mfxVideoCodecPlugin(Object Query, Object QueryIOSurf, Object Init, Object Reset, Object Close, Object GetVideoParam, Object EncodeFrameSubmit, Object DecodeHeader, Object GetPayload, Object DecodeFrameSubmit, Object VPPFrameSubmit, Object VPPFrameSubmitEx, Object ENCFrameSubmit, Object reserved1, Object reserved2) {
		setQuery(Query);
		setQueryIOSurf(QueryIOSurf);
		setInit(Init);
		setReset(Reset);
		setClose(Close);
		setGetVideoParam(GetVideoParam);
		setEncodeFrameSubmit(EncodeFrameSubmit);
		setDecodeHeader(DecodeHeader);
		setGetPayload(GetPayload);
		setDecodeFrameSubmit(DecodeFrameSubmit);
		setVPPFrameSubmit(VPPFrameSubmit);
		setVPPFrameSubmitEx(VPPFrameSubmitEx);
		setENCFrameSubmit(ENCFrameSubmit);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public mfxVideoCodecPlugin() {
	}
	
	public Object getQuery() {
		return Query;
	}
	public void setQuery(Object newQuery) {
		Query = newQuery;
	}
	public Object getQueryIOSurf() {
		return QueryIOSurf;
	}
	public void setQueryIOSurf(Object newQueryIOSurf) {
		QueryIOSurf = newQueryIOSurf;
	}
	public Object getInit() {
		return Init;
	}
	public void setInit(Object newInit) {
		Init = newInit;
	}
	public Object getReset() {
		return Reset;
	}
	public void setReset(Object newReset) {
		Reset = newReset;
	}
	public Object getClose() {
		return Close;
	}
	public void setClose(Object newClose) {
		Close = newClose;
	}
	public Object getGetVideoParam() {
		return GetVideoParam;
	}
	public void setGetVideoParam(Object newGetVideoParam) {
		GetVideoParam = newGetVideoParam;
	}
	public Object getEncodeFrameSubmit() {
		return EncodeFrameSubmit;
	}
	public void setEncodeFrameSubmit(Object newEncodeFrameSubmit) {
		EncodeFrameSubmit = newEncodeFrameSubmit;
	}
	public Object getDecodeHeader() {
		return DecodeHeader;
	}
	public void setDecodeHeader(Object newDecodeHeader) {
		DecodeHeader = newDecodeHeader;
	}
	public Object getGetPayload() {
		return GetPayload;
	}
	public void setGetPayload(Object newGetPayload) {
		GetPayload = newGetPayload;
	}
	public Object getDecodeFrameSubmit() {
		return DecodeFrameSubmit;
	}
	public void setDecodeFrameSubmit(Object newDecodeFrameSubmit) {
		DecodeFrameSubmit = newDecodeFrameSubmit;
	}
	public Object getVPPFrameSubmit() {
		return VPPFrameSubmit;
	}
	public void setVPPFrameSubmit(Object newVPPFrameSubmit) {
		VPPFrameSubmit = newVPPFrameSubmit;
	}
	public Object getVPPFrameSubmitEx() {
		return VPPFrameSubmitEx;
	}
	public void setVPPFrameSubmitEx(Object newVPPFrameSubmitEx) {
		VPPFrameSubmitEx = newVPPFrameSubmitEx;
	}
	public Object getENCFrameSubmit() {
		return ENCFrameSubmit;
	}
	public void setENCFrameSubmit(Object newENCFrameSubmit) {
		ENCFrameSubmit = newENCFrameSubmit;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
