package application;

/* state for read() wrapper */
public class RTMP_READ {
	private Byte buf;
	private Byte bufpos;
	private int buflen;
	private Object timestamp;
	private Object dataType;
	private Object flags;
	private Object status;
	private Object initialFrameType;
	private Object nResumeTS;
	private Byte metaHeader;
	private Byte initialFrame;
	private Object nMetaHeaderSize;
	private Object nInitialFrameSize;
	private Object nIgnoredFrameCounter;
	private Object nIgnoredFlvFrameCounter;
	
	public RTMP_READ(Byte buf, Byte bufpos, int buflen, Object timestamp, Object dataType, Object flags, Object status, Object initialFrameType, Object nResumeTS, Byte metaHeader, Byte initialFrame, Object nMetaHeaderSize, Object nInitialFrameSize, Object nIgnoredFrameCounter, Object nIgnoredFlvFrameCounter) {
		setBuf(buf);
		setBufpos(bufpos);
		setBuflen(buflen);
		setTimestamp(timestamp);
		setDataType(dataType);
		setFlags(flags);
		setStatus(status);
		setInitialFrameType(initialFrameType);
		setNResumeTS(nResumeTS);
		setMetaHeader(metaHeader);
		setInitialFrame(initialFrame);
		setNMetaHeaderSize(nMetaHeaderSize);
		setNInitialFrameSize(nInitialFrameSize);
		setNIgnoredFrameCounter(nIgnoredFrameCounter);
		setNIgnoredFlvFrameCounter(nIgnoredFlvFrameCounter);
	}
	public RTMP_READ() {
	}
	
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Byte getBufpos() {
		return bufpos;
	}
	public void setBufpos(Byte newBufpos) {
		bufpos = newBufpos;
	}
	public int getBuflen() {
		return buflen;
	}
	public void setBuflen(int newBuflen) {
		buflen = newBuflen;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public Object getDataType() {
		return dataType;
	}
	public void setDataType(Object newDataType) {
		dataType = newDataType;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object newStatus) {
		status = newStatus;
	}
	public Object getInitialFrameType() {
		return initialFrameType;
	}
	public void setInitialFrameType(Object newInitialFrameType) {
		initialFrameType = newInitialFrameType;
	}
	public Object getNResumeTS() {
		return nResumeTS;
	}
	public void setNResumeTS(Object newNResumeTS) {
		nResumeTS = newNResumeTS;
	}
	public Byte getMetaHeader() {
		return metaHeader;
	}
	public void setMetaHeader(Byte newMetaHeader) {
		metaHeader = newMetaHeader;
	}
	public Byte getInitialFrame() {
		return initialFrame;
	}
	public void setInitialFrame(Byte newInitialFrame) {
		initialFrame = newInitialFrame;
	}
	public Object getNMetaHeaderSize() {
		return nMetaHeaderSize;
	}
	public void setNMetaHeaderSize(Object newNMetaHeaderSize) {
		nMetaHeaderSize = newNMetaHeaderSize;
	}
	public Object getNInitialFrameSize() {
		return nInitialFrameSize;
	}
	public void setNInitialFrameSize(Object newNInitialFrameSize) {
		nInitialFrameSize = newNInitialFrameSize;
	}
	public Object getNIgnoredFrameCounter() {
		return nIgnoredFrameCounter;
	}
	public void setNIgnoredFrameCounter(Object newNIgnoredFrameCounter) {
		nIgnoredFrameCounter = newNIgnoredFrameCounter;
	}
	public Object getNIgnoredFlvFrameCounter() {
		return nIgnoredFlvFrameCounter;
	}
	public void setNIgnoredFlvFrameCounter(Object newNIgnoredFlvFrameCounter) {
		nIgnoredFlvFrameCounter = newNIgnoredFlvFrameCounter;
	}
}
