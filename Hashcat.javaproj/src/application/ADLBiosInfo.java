package application;

public class ADLBiosInfo {
	private Object[] strPartNumber;
	private Object[] strVersion;
	private Object[] strDate;
	
	public ADLBiosInfo(Object[] strPartNumber, Object[] strVersion, Object[] strDate) {
		setStrPartNumber(strPartNumber);
		setStrVersion(strVersion);
		setStrDate(strDate);
	}
	public ADLBiosInfo() {
	}
	
	public Object[] getStrPartNumber() {
		return strPartNumber;
	}
	public void setStrPartNumber(Object[] newStrPartNumber) {
		strPartNumber = newStrPartNumber;
	}
	public Object[] getStrVersion() {
		return strVersion;
	}
	public void setStrVersion(Object[] newStrVersion) {
		strVersion = newStrVersion;
	}
	public Object[] getStrDate() {
		return strDate;
	}
	public void setStrDate(Object[] newStrDate) {
		strDate = newStrDate;
	}
}
