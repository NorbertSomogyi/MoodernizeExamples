package application;

/*      RTMP_PACKET_TYPE_...                0x15 */
public class RTMPChunk {
	private int c_headerSize;
	private int c_chunkSize;
	private Byte c_chunk;
	private Object c_header;
	
	public RTMPChunk(int c_headerSize, int c_chunkSize, Byte c_chunk, Object c_header) {
		setC_headerSize(c_headerSize);
		setC_chunkSize(c_chunkSize);
		setC_chunk(c_chunk);
		setC_header(c_header);
	}
	public RTMPChunk() {
	}
	
	public int getC_headerSize() {
		return c_headerSize;
	}
	public void setC_headerSize(int newC_headerSize) {
		c_headerSize = newC_headerSize;
	}
	public int getC_chunkSize() {
		return c_chunkSize;
	}
	public void setC_chunkSize(int newC_chunkSize) {
		c_chunkSize = newC_chunkSize;
	}
	public Byte getC_chunk() {
		return c_chunk;
	}
	public void setC_chunk(Byte newC_chunk) {
		c_chunk = newC_chunk;
	}
	public Object getC_header() {
		return c_header;
	}
	public void setC_header(Object newC_header) {
		c_header = newC_header;
	}
}
