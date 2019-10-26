package application;

public class push_info {
	private Byte dest;
	private int forced;
	private  status;
	
	public push_info(Byte dest, int forced,  status) {
		setDest(dest);
		setForced(forced);
		setStatus(status);
	}
	public push_info() {
	}
	
	public Byte getDest() {
		return dest;
	}
	public void setDest(Byte newDest) {
		dest = newDest;
	}
	public int getForced() {
		return forced;
	}
	public void setForced(int newForced) {
		forced = newForced;
	}
	public  getStatus() {
		return status;
	}
	public void setStatus( newStatus) {
		status = newStatus;
	}
}
