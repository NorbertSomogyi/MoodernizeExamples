package application;

public class RTMPPacket {
	private Object m_headerType;
	private Object m_packetType;
	private Object m_hasAbsTimestamp;
	private int m_nChannel;
	private Object m_nTimeStamp;
	private Object m_nInfoField2;
	private Object m_nBodySize;
	private Object m_nBytesRead;
	private RTMPChunk m_chunk;
	private Byte m_body;
	
	public RTMPPacket(Object m_headerType, Object m_packetType, Object m_hasAbsTimestamp, int m_nChannel, Object m_nTimeStamp, Object m_nInfoField2, Object m_nBodySize, Object m_nBytesRead, RTMPChunk m_chunk, Byte m_body) {
		setM_headerType(m_headerType);
		setM_packetType(m_packetType);
		setM_hasAbsTimestamp(m_hasAbsTimestamp);
		setM_nChannel(m_nChannel);
		setM_nTimeStamp(m_nTimeStamp);
		setM_nInfoField2(m_nInfoField2);
		setM_nBodySize(m_nBodySize);
		setM_nBytesRead(m_nBytesRead);
		setM_chunk(m_chunk);
		setM_body(m_body);
	}
	public RTMPPacket() {
	}
	
	public void RTMPPacket_Reset() {
		this.setM_headerType(0);
		this.setM_packetType(0);
		this.setM_nChannel(0);
		this.setM_nTimeStamp(0);
		this.setM_nInfoField2(0);
		this.setM_hasAbsTimestamp(0);
		this.setM_nBodySize(0);
		this.setM_nBytesRead(0);
	}
	public int RTMPPacket_Alloc(Object nSize) {
		byte ptr;
		ptr = .calloc(1, nSize + 18);
		if (!ptr) {
			return 0;
		} 
		this.setM_body(ptr + 18);
		this.setM_nBytesRead(0);
		return 1;
	}
	public void RTMPPacket_Free() {
		Byte generatedM_body = this.getM_body();
		if (generatedM_body) {
			.free(generatedM_body - 18);
			this.setM_body(((Object)0));
		} 
	}
	public void RTMPPacket_Dump() {
		Object generatedM_packetType = this.getM_packetType();
		int generatedM_nChannel = this.getM_nChannel();
		Object generatedM_nTimeStamp = this.getM_nTimeStamp();
		Object generatedM_nInfoField2 = this.getM_nInfoField2();
		Object generatedM_nBodySize = this.getM_nBodySize();
		Byte generatedM_body = this.getM_body();
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "RTMP PACKET: packet type: 0x%02x. channel: 0x%02x. info 1: %d info 2: %d. Body size: %u. body: 0x%02x", generatedM_packetType, generatedM_nChannel, generatedM_nTimeStamp, generatedM_nInfoField2, generatedM_nBodySize, generatedM_body ? (byte)generatedM_body[0] : 0);
	}
	public Object getM_headerType() {
		return m_headerType;
	}
	public void setM_headerType(Object newM_headerType) {
		m_headerType = newM_headerType;
	}
	public Object getM_packetType() {
		return m_packetType;
	}
	public void setM_packetType(Object newM_packetType) {
		m_packetType = newM_packetType;
	}
	public Object getM_hasAbsTimestamp() {
		return m_hasAbsTimestamp;
	}
	public void setM_hasAbsTimestamp(Object newM_hasAbsTimestamp) {
		m_hasAbsTimestamp = newM_hasAbsTimestamp;
	}
	public int getM_nChannel() {
		return m_nChannel;
	}
	public void setM_nChannel(int newM_nChannel) {
		m_nChannel = newM_nChannel;
	}
	public Object getM_nTimeStamp() {
		return m_nTimeStamp;
	}
	public void setM_nTimeStamp(Object newM_nTimeStamp) {
		m_nTimeStamp = newM_nTimeStamp;
	}
	public Object getM_nInfoField2() {
		return m_nInfoField2;
	}
	public void setM_nInfoField2(Object newM_nInfoField2) {
		m_nInfoField2 = newM_nInfoField2;
	}
	public Object getM_nBodySize() {
		return m_nBodySize;
	}
	public void setM_nBodySize(Object newM_nBodySize) {
		m_nBodySize = newM_nBodySize;
	}
	public Object getM_nBytesRead() {
		return m_nBytesRead;
	}
	public void setM_nBytesRead(Object newM_nBytesRead) {
		m_nBytesRead = newM_nBytesRead;
	}
	public RTMPChunk getM_chunk() {
		return m_chunk;
	}
	public void setM_chunk(RTMPChunk newM_chunk) {
		m_chunk = newM_chunk;
	}
	public Byte getM_body() {
		return m_body;
	}
	public void setM_body(Byte newM_body) {
		m_body = newM_body;
	}
}
