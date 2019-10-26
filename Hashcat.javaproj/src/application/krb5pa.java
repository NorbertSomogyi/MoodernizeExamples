package application;

public class krb5pa {
	private Object user;
	private Object realm;
	private Object salt;
	private Object timestamp;
	private Object checksum;
	
	public krb5pa(Object user, Object realm, Object salt, Object timestamp, Object checksum) {
		setUser(user);
		setRealm(realm);
		setSalt(salt);
		setTimestamp(timestamp);
		setChecksum(checksum);
	}
	public krb5pa() {
	}
	
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getRealm() {
		return realm;
	}
	public void setRealm(Object newRealm) {
		realm = newRealm;
	}
	public Object getSalt() {
		return salt;
	}
	public void setSalt(Object newSalt) {
		salt = newSalt;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
}
