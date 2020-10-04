package application;

public class tacacs_plus {
	private Object[] session_buf;
	private Object[] ct_data_buf;
	private Object ct_data_len;
	private Object[] sequence_buf;
	
	public tacacs_plus(Object[] session_buf, Object[] ct_data_buf, Object ct_data_len, Object[] sequence_buf) {
		setSession_buf(session_buf);
		setCt_data_buf(ct_data_buf);
		setCt_data_len(ct_data_len);
		setSequence_buf(sequence_buf);
	}
	public tacacs_plus() {
	}
	
	public Object[] getSession_buf() {
		return session_buf;
	}
	public void setSession_buf(Object[] newSession_buf) {
		session_buf = newSession_buf;
	}
	public Object[] getCt_data_buf() {
		return ct_data_buf;
	}
	public void setCt_data_buf(Object[] newCt_data_buf) {
		ct_data_buf = newCt_data_buf;
	}
	public Object getCt_data_len() {
		return ct_data_len;
	}
	public void setCt_data_len(Object newCt_data_len) {
		ct_data_len = newCt_data_len;
	}
	public Object[] getSequence_buf() {
		return sequence_buf;
	}
	public void setSequence_buf(Object[] newSequence_buf) {
		sequence_buf = newSequence_buf;
	}
}
