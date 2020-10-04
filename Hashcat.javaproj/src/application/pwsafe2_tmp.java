package application;

public class pwsafe2_tmp {
	private Object[] digest;
	private Object[] P;
	private Object[] S0;
	private Object[] S1;
	private Object[] S2;
	private Object[] S3;
	
	public pwsafe2_tmp(Object[] digest, Object[] P, Object[] S0, Object[] S1, Object[] S2, Object[] S3) {
		setDigest(digest);
		setP(P);
		setS0(S0);
		setS1(S1);
		setS2(S2);
		setS3(S3);
	}
	public pwsafe2_tmp() {
	}
	
	public Object[] getDigest() {
		return digest;
	}
	public void setDigest(Object[] newDigest) {
		digest = newDigest;
	}
	public Object[] getP() {
		return P;
	}
	public void setP(Object[] newP) {
		P = newP;
	}
	public Object[] getS0() {
		return S0;
	}
	public void setS0(Object[] newS0) {
		S0 = newS0;
	}
	public Object[] getS1() {
		return S1;
	}
	public void setS1(Object[] newS1) {
		S1 = newS1;
	}
	public Object[] getS2() {
		return S2;
	}
	public void setS2(Object[] newS2) {
		S2 = newS2;
	}
	public Object[] getS3() {
		return S3;
	}
	public void setS3(Object[] newS3) {
		S3 = newS3;
	}
}
