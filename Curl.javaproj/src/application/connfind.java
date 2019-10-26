package application;

public class connfind {
	private connectdata tofind;
	private  found;
	
	public connfind(connectdata tofind,  found) {
		setTofind(tofind);
		setFound(found);
	}
	public connfind() {
	}
	
	public connectdata getTofind() {
		return tofind;
	}
	public void setTofind(connectdata newTofind) {
		tofind = newTofind;
	}
	public  getFound() {
		return found;
	}
	public void setFound( newFound) {
		found = newFound;
	}
}
