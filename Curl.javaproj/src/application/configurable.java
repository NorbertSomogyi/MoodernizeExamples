package application;

/* no auth */
/* CONNECT */
public class configurable {
	private byte version;
	private byte nmethods_min;
	private byte nmethods_max;
	private byte responseversion;
	private byte responsemethod;
	private byte reqcmd;
	private byte connectrep;
	private int port;
	private Object addr;
	private Object user;
	private Object password;
	
	public configurable(byte version, byte nmethods_min, byte nmethods_max, byte responseversion, byte responsemethod, byte reqcmd, byte connectrep, int port, Object addr, Object user, Object password) {
		setVersion(version);
		setNmethods_min(nmethods_min);
		setNmethods_max(nmethods_max);
		setResponseversion(responseversion);
		setResponsemethod(responsemethod);
		setReqcmd(reqcmd);
		setConnectrep(connectrep);
		setPort(port);
		setAddr(addr);
		setUser(user);
		setPassword(password);
	}
	public configurable() {
	}
	
	public byte getVersion() {
		return version;
	}
	public void setVersion(byte newVersion) {
		version = newVersion;
	}
	public byte getNmethods_min() {
		return nmethods_min;
	}
	public void setNmethods_min(byte newNmethods_min) {
		nmethods_min = newNmethods_min;
	}
	public byte getNmethods_max() {
		return nmethods_max;
	}
	public void setNmethods_max(byte newNmethods_max) {
		nmethods_max = newNmethods_max;
	}
	public byte getResponseversion() {
		return responseversion;
	}
	public void setResponseversion(byte newResponseversion) {
		responseversion = newResponseversion;
	}
	public byte getResponsemethod() {
		return responsemethod;
	}
	public void setResponsemethod(byte newResponsemethod) {
		responsemethod = newResponsemethod;
	}
	public byte getReqcmd() {
		return reqcmd;
	}
	public void setReqcmd(byte newReqcmd) {
		reqcmd = newReqcmd;
	}
	public byte getConnectrep() {
		return connectrep;
	}
	public void setConnectrep(byte newConnectrep) {
		connectrep = newConnectrep;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object newPassword) {
		password = newPassword;
	}
}
