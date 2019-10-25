package application;

public class speedcount {
	private Object dl;
	private Object ul;
	private timeval stamp;
	
	public speedcount(Object dl, Object ul, timeval stamp) {
		setDl(dl);
		setUl(ul);
		setStamp(stamp);
	}
	public speedcount() {
	}
	
	public Object getDl() {
		return dl;
	}
	public void setDl(Object newDl) {
		dl = newDl;
	}
	public Object getUl() {
		return ul;
	}
	public void setUl(Object newUl) {
		ul = newUl;
	}
	public timeval getStamp() {
		return stamp;
	}
	public void setStamp(timeval newStamp) {
		stamp = newStamp;
	}
}
