package application;

public class _IO_STATUS_BLOCK {
	private  u;
	private Object Information;
	
	public _IO_STATUS_BLOCK( u, Object Information) {
		setU(u);
		setInformation(Information);
	}
	public _IO_STATUS_BLOCK() {
	}
	
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
	public Object getInformation() {
		return Information;
	}
	public void setInformation(Object newInformation) {
		Information = newInformation;
	}
}
