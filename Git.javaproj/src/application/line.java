package application;

public class line {
	private Object len;
	private int hash;
	private int flag;
	
	public line(Object len, int hash, int flag) {
		setLen(len);
		setHash(hash);
		setFlag(flag);
	}
	public line() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public int getHash() {
		return hash;
	}
	public void setHash(int newHash) {
		hash = newHash;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int newFlag) {
		flag = newFlag;
	}
}
