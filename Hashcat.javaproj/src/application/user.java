package application;

/**
 * structs
 */
public class user {
	private Byte user_name;
	private Object user_len;
	
	public user(Byte user_name, Object user_len) {
		setUser_name(user_name);
		setUser_len(user_len);
	}
	public user() {
	}
	
	public Byte getUser_name() {
		return user_name;
	}
	public void setUser_name(Byte newUser_name) {
		user_name = newUser_name;
	}
	public Object getUser_len() {
		return user_len;
	}
	public void setUser_len(Object newUser_len) {
		user_len = newUser_len;
	}
}
