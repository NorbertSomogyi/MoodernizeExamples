package application;

public class dict {
	private Object type;
	private Object privdata;
	private Object ht;
	private int rehashidx;
	private int iterators;
	
	public dict(Object type, Object privdata, Object ht, int rehashidx, int iterators) {
		setType(type);
		setPrivdata(privdata);
		setHt(ht);
		setRehashidx(rehashidx);
		setIterators(iterators);
	}
	public dict() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getPrivdata() {
		return privdata;
	}
	public void setPrivdata(Object newPrivdata) {
		privdata = newPrivdata;
	}
	public Object getHt() {
		return ht;
	}
	public void setHt(Object newHt) {
		ht = newHt;
	}
	public int getRehashidx() {
		return rehashidx;
	}
	public void setRehashidx(int newRehashidx) {
		rehashidx = newRehashidx;
	}
	public int getIterators() {
		return iterators;
	}
	public void setIterators(int newIterators) {
		iterators = newIterators;
	}
}
