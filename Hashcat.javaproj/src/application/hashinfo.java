package application;

public class hashinfo {
	private user user;
	private Byte orighash;
	private split split;
	
	public hashinfo(user user, Byte orighash, split split) {
		setUser(user);
		setOrighash(orighash);
		setSplit(split);
	}
	public hashinfo() {
	}
	
	public user getUser() {
		return user;
	}
	public void setUser(user newUser) {
		user = newUser;
	}
	public Byte getOrighash() {
		return orighash;
	}
	public void setOrighash(Byte newOrighash) {
		orighash = newOrighash;
	}
	public split getSplit() {
		return split;
	}
	public void setSplit(split newSplit) {
		split = newSplit;
	}
}
