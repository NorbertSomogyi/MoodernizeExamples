package application;

public class reflog_info {
	private object_id ooid;
	private object_id noid;
	private Byte email;
	private Object timestamp;
	private int tz;
	private Byte message;
	
	public reflog_info(object_id ooid, object_id noid, Byte email, Object timestamp, int tz, Byte message) {
		setOoid(ooid);
		setNoid(noid);
		setEmail(email);
		setTimestamp(timestamp);
		setTz(tz);
		setMessage(message);
	}
	public reflog_info() {
	}
	
	public object_id getOoid() {
		return ooid;
	}
	public void setOoid(object_id newOoid) {
		ooid = newOoid;
	}
	public object_id getNoid() {
		return noid;
	}
	public void setNoid(object_id newNoid) {
		noid = newNoid;
	}
	public Byte getEmail() {
		return email;
	}
	public void setEmail(Byte newEmail) {
		email = newEmail;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public int getTz() {
		return tz;
	}
	public void setTz(int newTz) {
		tz = newTz;
	}
	public Byte getMessage() {
		return message;
	}
	public void setMessage(Byte newMessage) {
		message = newMessage;
	}
}
