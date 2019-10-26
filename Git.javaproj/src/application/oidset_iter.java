package application;

public class oidset_iter {
	private  set;
	private Object iter;
	
	public oidset_iter( set, Object iter) {
		setSet(set);
		setIter(iter);
	}
	public oidset_iter() {
	}
	
	public  getSet() {
		return set;
	}
	public void setSet( newSet) {
		set = newSet;
	}
	public Object getIter() {
		return iter;
	}
	public void setIter(Object newIter) {
		iter = newIter;
	}
}
