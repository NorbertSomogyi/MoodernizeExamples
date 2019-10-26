package application;

public class cram_md5 {
	private Object user;
	
	public cram_md5(Object user) {
		setUser(user);
	}
	public cram_md5() {
	}
	
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
}
