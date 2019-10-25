package application;

public class metalink_resource {
	private Object next;
	private Object url;
	
	public metalink_resource(Object next, Object url) {
		setNext(next);
		setUrl(url);
	}
	public metalink_resource() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
}
