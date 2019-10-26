package application;

public class netntlm {
	private int user_len;
	private int domain_len;
	private int srvchall_len;
	private int clichall_len;
	private Object userdomain_buf;
	private Object chall_buf;
	
	public netntlm(int user_len, int domain_len, int srvchall_len, int clichall_len, Object userdomain_buf, Object chall_buf) {
		setUser_len(user_len);
		setDomain_len(domain_len);
		setSrvchall_len(srvchall_len);
		setClichall_len(clichall_len);
		setUserdomain_buf(userdomain_buf);
		setChall_buf(chall_buf);
	}
	public netntlm() {
	}
	
	public int getUser_len() {
		return user_len;
	}
	public void setUser_len(int newUser_len) {
		user_len = newUser_len;
	}
	public int getDomain_len() {
		return domain_len;
	}
	public void setDomain_len(int newDomain_len) {
		domain_len = newDomain_len;
	}
	public int getSrvchall_len() {
		return srvchall_len;
	}
	public void setSrvchall_len(int newSrvchall_len) {
		srvchall_len = newSrvchall_len;
	}
	public int getClichall_len() {
		return clichall_len;
	}
	public void setClichall_len(int newClichall_len) {
		clichall_len = newClichall_len;
	}
	public Object getUserdomain_buf() {
		return userdomain_buf;
	}
	public void setUserdomain_buf(Object newUserdomain_buf) {
		userdomain_buf = newUserdomain_buf;
	}
	public Object getChall_buf() {
		return chall_buf;
	}
	public void setChall_buf(Object newChall_buf) {
		chall_buf = newChall_buf;
	}
}
