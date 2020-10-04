package application;

public class ADLDisplayInfo {
	private ADLDisplayID displayID;
	private int iDisplayControllerIndex;
	private Object[] strDisplayName;
	private Object[] strDisplayManufacturerName;
	private int iDisplayType;
	private int iDisplayOutputType;
	private int iDisplayConnector;
	private int iDisplayInfoMask;
	private int iDisplayInfoValue;
	
	public ADLDisplayInfo(ADLDisplayID displayID, int iDisplayControllerIndex, Object[] strDisplayName, Object[] strDisplayManufacturerName, int iDisplayType, int iDisplayOutputType, int iDisplayConnector, int iDisplayInfoMask, int iDisplayInfoValue) {
		setDisplayID(displayID);
		setIDisplayControllerIndex(iDisplayControllerIndex);
		setStrDisplayName(strDisplayName);
		setStrDisplayManufacturerName(strDisplayManufacturerName);
		setIDisplayType(iDisplayType);
		setIDisplayOutputType(iDisplayOutputType);
		setIDisplayConnector(iDisplayConnector);
		setIDisplayInfoMask(iDisplayInfoMask);
		setIDisplayInfoValue(iDisplayInfoValue);
	}
	public ADLDisplayInfo() {
	}
	
	public ADLDisplayID getDisplayID() {
		return displayID;
	}
	public void setDisplayID(ADLDisplayID newDisplayID) {
		displayID = newDisplayID;
	}
	public int getIDisplayControllerIndex() {
		return iDisplayControllerIndex;
	}
	public void setIDisplayControllerIndex(int newIDisplayControllerIndex) {
		iDisplayControllerIndex = newIDisplayControllerIndex;
	}
	public Object[] getStrDisplayName() {
		return strDisplayName;
	}
	public void setStrDisplayName(Object[] newStrDisplayName) {
		strDisplayName = newStrDisplayName;
	}
	public Object[] getStrDisplayManufacturerName() {
		return strDisplayManufacturerName;
	}
	public void setStrDisplayManufacturerName(Object[] newStrDisplayManufacturerName) {
		strDisplayManufacturerName = newStrDisplayManufacturerName;
	}
	public int getIDisplayType() {
		return iDisplayType;
	}
	public void setIDisplayType(int newIDisplayType) {
		iDisplayType = newIDisplayType;
	}
	public int getIDisplayOutputType() {
		return iDisplayOutputType;
	}
	public void setIDisplayOutputType(int newIDisplayOutputType) {
		iDisplayOutputType = newIDisplayOutputType;
	}
	public int getIDisplayConnector() {
		return iDisplayConnector;
	}
	public void setIDisplayConnector(int newIDisplayConnector) {
		iDisplayConnector = newIDisplayConnector;
	}
	public int getIDisplayInfoMask() {
		return iDisplayInfoMask;
	}
	public void setIDisplayInfoMask(int newIDisplayInfoMask) {
		iDisplayInfoMask = newIDisplayInfoMask;
	}
	public int getIDisplayInfoValue() {
		return iDisplayInfoValue;
	}
	public void setIDisplayInfoValue(int newIDisplayInfoValue) {
		iDisplayInfoValue = newIDisplayInfoValue;
	}
}
