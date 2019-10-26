package application;

public class brain_server_client_options {
	private brain_server_dbs brain_server_dbs;
	private int client_idx;
	private int client_fd;
	private Byte auth_password;
	private Object session_whitelist_buf;
	private int session_whitelist_cnt;
	
	public brain_server_client_options(brain_server_dbs brain_server_dbs, int client_idx, int client_fd, Byte auth_password, Object session_whitelist_buf, int session_whitelist_cnt) {
		setBrain_server_dbs(brain_server_dbs);
		setClient_idx(client_idx);
		setClient_fd(client_fd);
		setAuth_password(auth_password);
		setSession_whitelist_buf(session_whitelist_buf);
		setSession_whitelist_cnt(session_whitelist_cnt);
	}
	public brain_server_client_options() {
	}
	
	public brain_server_dbs getBrain_server_dbs() {
		return brain_server_dbs;
	}
	public void setBrain_server_dbs(brain_server_dbs newBrain_server_dbs) {
		brain_server_dbs = newBrain_server_dbs;
	}
	public int getClient_idx() {
		return client_idx;
	}
	public void setClient_idx(int newClient_idx) {
		client_idx = newClient_idx;
	}
	public int getClient_fd() {
		return client_fd;
	}
	public void setClient_fd(int newClient_fd) {
		client_fd = newClient_fd;
	}
	public Byte getAuth_password() {
		return auth_password;
	}
	public void setAuth_password(Byte newAuth_password) {
		auth_password = newAuth_password;
	}
	public Object getSession_whitelist_buf() {
		return session_whitelist_buf;
	}
	public void setSession_whitelist_buf(Object newSession_whitelist_buf) {
		session_whitelist_buf = newSession_whitelist_buf;
	}
	public int getSession_whitelist_cnt() {
		return session_whitelist_cnt;
	}
	public void setSession_whitelist_cnt(int newSession_whitelist_cnt) {
		session_whitelist_cnt = newSession_whitelist_cnt;
	}
}
