package application;

public class apple_secure_notes {
	private Object Z_PK;
	private Object ZCRYPTOITERATIONCOUNT;
	private Object[] ZCRYPTOSALT;
	private Object[] ZCRYPTOWRAPPEDKEY;
	
	public apple_secure_notes(Object Z_PK, Object ZCRYPTOITERATIONCOUNT, Object[] ZCRYPTOSALT, Object[] ZCRYPTOWRAPPEDKEY) {
		setZ_PK(Z_PK);
		setZCRYPTOITERATIONCOUNT(ZCRYPTOITERATIONCOUNT);
		setZCRYPTOSALT(ZCRYPTOSALT);
		setZCRYPTOWRAPPEDKEY(ZCRYPTOWRAPPEDKEY);
	}
	public apple_secure_notes() {
	}
	
	public Object getZ_PK() {
		return Z_PK;
	}
	public void setZ_PK(Object newZ_PK) {
		Z_PK = newZ_PK;
	}
	public Object getZCRYPTOITERATIONCOUNT() {
		return ZCRYPTOITERATIONCOUNT;
	}
	public void setZCRYPTOITERATIONCOUNT(Object newZCRYPTOITERATIONCOUNT) {
		ZCRYPTOITERATIONCOUNT = newZCRYPTOITERATIONCOUNT;
	}
	public Object[] getZCRYPTOSALT() {
		return ZCRYPTOSALT;
	}
	public void setZCRYPTOSALT(Object[] newZCRYPTOSALT) {
		ZCRYPTOSALT = newZCRYPTOSALT;
	}
	public Object[] getZCRYPTOWRAPPEDKEY() {
		return ZCRYPTOWRAPPEDKEY;
	}
	public void setZCRYPTOWRAPPEDKEY(Object[] newZCRYPTOWRAPPEDKEY) {
		ZCRYPTOWRAPPEDKEY = newZCRYPTOWRAPPEDKEY;
	}
}
