package application;

public class flickcurl_chunk_s {
	private Byte content;
	private Object size;
	private flickcurl_chunk_s prev;
	
	public flickcurl_chunk_s(Byte content, Object size, flickcurl_chunk_s prev) {
		setContent(content);
		setSize(size);
		setPrev(prev);
	}
	public flickcurl_chunk_s() {
	}
	
	public Byte getContent() {
		return content;
	}
	public void setContent(Byte newContent) {
		content = newContent;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public flickcurl_chunk_s getPrev() {
		return prev;
	}
	public void setPrev(flickcurl_chunk_s newPrev) {
		prev = newPrev;
	}
}
