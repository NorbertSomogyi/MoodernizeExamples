package application;

public class BUG_tar_header {
	private Object[] c;
	
	public BUG_tar_header(Object[] c) {
		setC(c);
	}
	public BUG_tar_header() {
	}
	
	public Object[] getC() {
		return c;
	}
	public void setC(Object[] newC) {
		c = newC;
	}
}
