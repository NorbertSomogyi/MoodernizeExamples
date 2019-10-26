package application;

public class mfxAudioCodecPlugin {
	private Object Query;
	private Object QueryIOSize;
	private Object Init;
	private Object Reset;
	private Object Close;
	private Object GetAudioParam;
	private Object EncodeFrameSubmit;
	private Object DecodeHeader;
	private Object DecodeFrameSubmit;
	private Object reserved1;
	private Object reserved2;
	
	public mfxAudioCodecPlugin(Object Query, Object QueryIOSize, Object Init, Object Reset, Object Close, Object GetAudioParam, Object EncodeFrameSubmit, Object DecodeHeader, Object DecodeFrameSubmit, Object reserved1, Object reserved2) {
		setQuery(Query);
		setQueryIOSize(QueryIOSize);
		setInit(Init);
		setReset(Reset);
		setClose(Close);
		setGetAudioParam(GetAudioParam);
		setEncodeFrameSubmit(EncodeFrameSubmit);
		setDecodeHeader(DecodeHeader);
		setDecodeFrameSubmit(DecodeFrameSubmit);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public mfxAudioCodecPlugin() {
	}
	
	public Object getQuery() {
		return Query;
	}
	public void setQuery(Object newQuery) {
		Query = newQuery;
	}
	public Object getQueryIOSize() {
		return QueryIOSize;
	}
	public void setQueryIOSize(Object newQueryIOSize) {
		QueryIOSize = newQueryIOSize;
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
	public Object getGetAudioParam() {
		return GetAudioParam;
	}
	public void setGetAudioParam(Object newGetAudioParam) {
		GetAudioParam = newGetAudioParam;
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
	public Object getDecodeFrameSubmit() {
		return DecodeFrameSubmit;
	}
	public void setDecodeFrameSubmit(Object newDecodeFrameSubmit) {
		DecodeFrameSubmit = newDecodeFrameSubmit;
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
