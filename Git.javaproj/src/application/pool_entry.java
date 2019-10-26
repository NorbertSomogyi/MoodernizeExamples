package application;

public class pool_entry {
	private hashmap_entry ent;
	private Object len;
	private Object data;
	
	public pool_entry(hashmap_entry ent, Object len, Object data) {
		setEnt(ent);
		setLen(len);
		setData(data);
	}
	public pool_entry() {
	}
	
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
