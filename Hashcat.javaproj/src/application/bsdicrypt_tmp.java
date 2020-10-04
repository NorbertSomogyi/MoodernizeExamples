package application;

public class bsdicrypt_tmp {
	private Object[] Kc;
	private Object[] Kd;
	private Object[] iv;
	
	public bsdicrypt_tmp(Object[] Kc, Object[] Kd, Object[] iv) {
		setKc(Kc);
		setKd(Kd);
		setIv(iv);
	}
	public bsdicrypt_tmp() {
	}
	
	public Object[] getKc() {
		return Kc;
	}
	public void setKc(Object[] newKc) {
		Kc = newKc;
	}
	public Object[] getKd() {
		return Kd;
	}
	public void setKd(Object[] newKd) {
		Kd = newKd;
	}
	public Object[] getIv() {
		return iv;
	}
	public void setIv(Object[] newIv) {
		iv = newIv;
	}
}
