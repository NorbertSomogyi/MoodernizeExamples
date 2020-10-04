package application;

public class keepass_tmp {
	private Object[] tmp_digest;
	
	public keepass_tmp(Object[] tmp_digest) {
		setTmp_digest(tmp_digest);
	}
	public keepass_tmp() {
	}
	
	public Object[] getTmp_digest() {
		return tmp_digest;
	}
	public void setTmp_digest(Object[] newTmp_digest) {
		tmp_digest = newTmp_digest;
	}
}
