package application;

public class metalink_resource {
	private metalink_resource next;
	private Byte url;
	
	public metalink_resource(metalink_resource next, Byte url) {
		setNext(next);
		setUrl(url);
	}
	public metalink_resource() {
	}
	
	public metalink_resource getNext() {
		return next;
	}
	public void setNext(metalink_resource newNext) {
		next = newNext;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
}
