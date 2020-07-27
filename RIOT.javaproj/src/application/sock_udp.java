package application;

public class sock_udp {
	private gnrc_sock_reg reg;
	private Object local;
	private Object remote;
	private Object flags;
	
	public sock_udp(gnrc_sock_reg reg, Object local, Object remote, Object flags) {
		setReg(reg);
		setLocal(local);
		setRemote(remote);
		setFlags(flags);
	}
	public sock_udp() {
	}
	
	public gnrc_sock_reg getReg() {
		return reg;
	}
	public void setReg(gnrc_sock_reg newReg) {
		reg = newReg;
	}
	public Object getLocal() {
		return local;
	}
	public void setLocal(Object newLocal) {
		local = newLocal;
	}
	public Object getRemote() {
		return remote;
	}
	public void setRemote(Object newRemote) {
		remote = newRemote;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
}
