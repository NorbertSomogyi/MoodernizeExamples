package application;

public class alternates_request {
	private walker walker;
	private Object base;
	private strbuf url;
	private strbuf buffer;
	private active_request_slot slot;
	private int http_specific;
	
	public alternates_request(walker walker, Object base, strbuf url, strbuf buffer, active_request_slot slot, int http_specific) {
		setWalker(walker);
		setBase(base);
		setUrl(url);
		setBuffer(buffer);
		setSlot(slot);
		setHttp_specific(http_specific);
	}
	public alternates_request() {
	}
	
	public walker getWalker() {
		return walker;
	}
	public void setWalker(walker newWalker) {
		walker = newWalker;
	}
	public Object getBase() {
		return base;
	}
	public void setBase(Object newBase) {
		base = newBase;
	}
	public strbuf getUrl() {
		return url;
	}
	public void setUrl(strbuf newUrl) {
		url = newUrl;
	}
	public strbuf getBuffer() {
		return buffer;
	}
	public void setBuffer(strbuf newBuffer) {
		buffer = newBuffer;
	}
	public active_request_slot getSlot() {
		return slot;
	}
	public void setSlot(active_request_slot newSlot) {
		slot = newSlot;
	}
	public int getHttp_specific() {
		return http_specific;
	}
	public void setHttp_specific(int newHttp_specific) {
		http_specific = newHttp_specific;
	}
}
