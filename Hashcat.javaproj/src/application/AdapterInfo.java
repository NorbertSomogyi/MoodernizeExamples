package application;

/**
 * Author......: See docs/credits.txt
 * License.....: MIT
 */
// _WIN
/**
 * Declarations from adl_sdk.h and subheaders
 */
public class AdapterInfo {
	private int iSize;
	private int iAdapterIndex;
	private Object strUDID;
	private int iBusNumber;
	private int iDeviceNumber;
	private int iFunctionNumber;
	private int iVendorID;
	private Object strAdapterName;
	private Object strDisplayName;
	private int iPresent;
	private int iExist;
	private Object strDriverPath;
	private Object strDriverPathExt;
	private Object strPNPString;
	private int iOSDisplayIndex;
	
	public AdapterInfo(int iSize, int iAdapterIndex, Object strUDID, int iBusNumber, int iDeviceNumber, int iFunctionNumber, int iVendorID, Object strAdapterName, Object strDisplayName, int iPresent, int iExist, Object strDriverPath, Object strDriverPathExt, Object strPNPString, int iOSDisplayIndex) {
		setISize(iSize);
		setIAdapterIndex(iAdapterIndex);
		setStrUDID(strUDID);
		setIBusNumber(iBusNumber);
		setIDeviceNumber(iDeviceNumber);
		setIFunctionNumber(iFunctionNumber);
		setIVendorID(iVendorID);
		setStrAdapterName(strAdapterName);
		setStrDisplayName(strDisplayName);
		setIPresent(iPresent);
		setIExist(iExist);
		setStrDriverPath(strDriverPath);
		setStrDriverPathExt(strDriverPathExt);
		setStrPNPString(strPNPString);
		setIOSDisplayIndex(iOSDisplayIndex);
	}
	public AdapterInfo() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getIAdapterIndex() {
		return iAdapterIndex;
	}
	public void setIAdapterIndex(int newIAdapterIndex) {
		iAdapterIndex = newIAdapterIndex;
	}
	public Object getStrUDID() {
		return strUDID;
	}
	public void setStrUDID(Object newStrUDID) {
		strUDID = newStrUDID;
	}
	public int getIBusNumber() {
		return iBusNumber;
	}
	public void setIBusNumber(int newIBusNumber) {
		iBusNumber = newIBusNumber;
	}
	public int getIDeviceNumber() {
		return iDeviceNumber;
	}
	public void setIDeviceNumber(int newIDeviceNumber) {
		iDeviceNumber = newIDeviceNumber;
	}
	public int getIFunctionNumber() {
		return iFunctionNumber;
	}
	public void setIFunctionNumber(int newIFunctionNumber) {
		iFunctionNumber = newIFunctionNumber;
	}
	public int getIVendorID() {
		return iVendorID;
	}
	public void setIVendorID(int newIVendorID) {
		iVendorID = newIVendorID;
	}
	public Object getStrAdapterName() {
		return strAdapterName;
	}
	public void setStrAdapterName(Object newStrAdapterName) {
		strAdapterName = newStrAdapterName;
	}
	public Object getStrDisplayName() {
		return strDisplayName;
	}
	public void setStrDisplayName(Object newStrDisplayName) {
		strDisplayName = newStrDisplayName;
	}
	public int getIPresent() {
		return iPresent;
	}
	public void setIPresent(int newIPresent) {
		iPresent = newIPresent;
	}
	public int getIExist() {
		return iExist;
	}
	public void setIExist(int newIExist) {
		iExist = newIExist;
	}
	public Object getStrDriverPath() {
		return strDriverPath;
	}
	public void setStrDriverPath(Object newStrDriverPath) {
		strDriverPath = newStrDriverPath;
	}
	public Object getStrDriverPathExt() {
		return strDriverPathExt;
	}
	public void setStrDriverPathExt(Object newStrDriverPathExt) {
		strDriverPathExt = newStrDriverPathExt;
	}
	public Object getStrPNPString() {
		return strPNPString;
	}
	public void setStrPNPString(Object newStrPNPString) {
		strPNPString = newStrPNPString;
	}
	public int getIOSDisplayIndex() {
		return iOSDisplayIndex;
	}
	public void setIOSDisplayIndex(int newIOSDisplayIndex) {
		iOSDisplayIndex = newIOSDisplayIndex;
	}
}
