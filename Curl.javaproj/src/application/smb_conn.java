package application;

public class smb_conn {
	private smb_conn_state state;
	private Object user;
	private Object domain;
	private Object share;
	private Object challenge;
	private int session_key;
	private int uid;
	private Object recv_buf;
	private Object upload_size;
	private Object send_size;
	private Object sent;
	private Object got;
	
	public smb_conn(smb_conn_state state, Object user, Object domain, Object share, Object challenge, int session_key, int uid, Object recv_buf, Object upload_size, Object send_size, Object sent, Object got) {
		setState(state);
		setUser(user);
		setDomain(domain);
		setShare(share);
		setChallenge(challenge);
		setSession_key(session_key);
		setUid(uid);
		setRecv_buf(recv_buf);
		setUpload_size(upload_size);
		setSend_size(send_size);
		setSent(sent);
		setGot(got);
	}
	public smb_conn() {
	}
	
	public smb_conn_state getState() {
		return state;
	}
	public void setState(smb_conn_state newState) {
		state = newState;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getDomain() {
		return domain;
	}
	public void setDomain(Object newDomain) {
		domain = newDomain;
	}
	public Object getShare() {
		return share;
	}
	public void setShare(Object newShare) {
		share = newShare;
	}
	public Object getChallenge() {
		return challenge;
	}
	public void setChallenge(Object newChallenge) {
		challenge = newChallenge;
	}
	public int getSession_key() {
		return session_key;
	}
	public void setSession_key(int newSession_key) {
		session_key = newSession_key;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int newUid) {
		uid = newUid;
	}
	public Object getRecv_buf() {
		return recv_buf;
	}
	public void setRecv_buf(Object newRecv_buf) {
		recv_buf = newRecv_buf;
	}
	public Object getUpload_size() {
		return upload_size;
	}
	public void setUpload_size(Object newUpload_size) {
		upload_size = newUpload_size;
	}
	public Object getSend_size() {
		return send_size;
	}
	public void setSend_size(Object newSend_size) {
		send_size = newSend_size;
	}
	public Object getSent() {
		return sent;
	}
	public void setSent(Object newSent) {
		sent = newSent;
	}
	public Object getGot() {
		return got;
	}
	public void setGot(Object newGot) {
		got = newGot;
	}
}
