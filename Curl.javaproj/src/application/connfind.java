package application;

public class connfind {
	private Object tofind;
	private  found;
	
	public connfind(Object tofind,  found) {
		setTofind(tofind);
		setFound(found);
	}
	public connfind() {
	}
	
	public Object getTofind() {
		return tofind;
	}
	public void setTofind(Object newTofind) {
		tofind = newTofind;
	}
	public  getFound() {
		return found;
	}
	public void setFound( newFound) {
		found = newFound;
	}
}
