package application;

public class list_item {
	private Byte name;
	private Object disabled;
	private Byte str;
	private int ll;
	private double d;
	
	public list_item(Byte name, Object disabled, Byte str, int ll, double d) {
		setName(name);
		setDisabled(disabled);
		setStr(str);
		setLl(ll);
		setD(d);
	}
	public list_item() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getDisabled() {
		return disabled;
	}
	public void setDisabled(Object newDisabled) {
		disabled = newDisabled;
	}
	public Byte getStr() {
		return str;
	}
	public void setStr(Byte newStr) {
		str = newStr;
	}
	public int getLl() {
		return ll;
	}
	public void setLl(int newLl) {
		ll = newLl;
	}
	public double getD() {
		return d;
	}
	public void setD(double newD) {
		d = newD;
	}
}
