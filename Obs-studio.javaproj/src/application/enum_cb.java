package application;

public class enum_cb {
	private Object cb;
	private Object data;
	private int cont;
	
	public enum_cb(Object cb, Object data, int cont) {
		setCb(cb);
		setData(data);
		setCont(cont);
	}
	public enum_cb() {
	}
	
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int newCont) {
		cont = newCont;
	}
}
