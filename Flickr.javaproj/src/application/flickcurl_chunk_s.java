package application;

public class flickcurl_chunk_s {
	private Object content;
	private Object size;
	private Object prev;
	
	public flickcurl_chunk_s(Object content, Object size, Object prev) {
		setContent(content);
		setSize(size);
		setPrev(prev);
	}
	public flickcurl_chunk_s() {
	}
	
	public Object getContent() {
		return content;
	}
	public void setContent(Object newContent) {
		content = newContent;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
}
