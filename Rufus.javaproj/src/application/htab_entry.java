package application;

/* Hash tables */
public class htab_entry {
	private Object used;
	private Byte str;
	private Object data;
	
	public htab_entry(Object used, Byte str, Object data) {
		setUsed(used);
		setStr(str);
		setData(data);
	}
	public htab_entry() {
	}
	
	public Object getUsed() {
		return used;
	}
	public void setUsed(Object newUsed) {
		used = newUsed;
	}
	public Byte getStr() {
		return str;
	}
	public void setStr(Byte newStr) {
		str = newStr;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
