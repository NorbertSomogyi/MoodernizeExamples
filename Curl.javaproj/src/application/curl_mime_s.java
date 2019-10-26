package application;

/* A mime multipart. */
public class curl_mime_s {
	private Curl_easy easy;
	private Object parent;
	private Object firstpart;
	private Object lastpart;
	private Object boundary;
	private  state;
	
	public curl_mime_s(Curl_easy easy, Object parent, Object firstpart, Object lastpart, Object boundary,  state) {
		setEasy(easy);
		setParent(parent);
		setFirstpart(firstpart);
		setLastpart(lastpart);
		setBoundary(boundary);
		setState(state);
	}
	public curl_mime_s() {
	}
	
	public Curl_easy getEasy() {
		return easy;
	}
	public void setEasy(Curl_easy newEasy) {
		easy = newEasy;
	}
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
	public Object getFirstpart() {
		return firstpart;
	}
	public void setFirstpart(Object newFirstpart) {
		firstpart = newFirstpart;
	}
	public Object getLastpart() {
		return lastpart;
	}
	public void setLastpart(Object newLastpart) {
		lastpart = newLastpart;
	}
	public Object getBoundary() {
		return boundary;
	}
	public void setBoundary(Object newBoundary) {
		boundary = newBoundary;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
}
