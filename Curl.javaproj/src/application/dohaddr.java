package application;

public class dohaddr {
	private int type;
	private  ip;
	
	public dohaddr(int type,  ip) {
		setType(type);
		setIp(ip);
	}
	public dohaddr() {
	}
	
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public  getIp() {
		return ip;
	}
	public void setIp( newIp) {
		ip = newIp;
	}
}
