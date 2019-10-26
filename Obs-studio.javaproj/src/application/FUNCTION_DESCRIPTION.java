package application;

// Library's module handle
// Declare assignment operator and copy constructor to prevent occasional assignment
// declare comparison operator
// bool operator == (const mfxVersion &one, const mfxVersion &two)
// bool operator < (const mfxVersion &one, const mfxVersion &two)
// bool operator <= (const mfxVersion &one, const mfxVersion &two)
//
// declare a table with functions descriptions
//
public class FUNCTION_DESCRIPTION {
	private Object pName;
	private  apiVersion;
	
	public FUNCTION_DESCRIPTION(Object pName,  apiVersion) {
		setPName(pName);
		setApiVersion(apiVersion);
	}
	public FUNCTION_DESCRIPTION() {
	}
	
	public Object getPName() {
		return pName;
	}
	public void setPName(Object newPName) {
		pName = newPName;
	}
	public  getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion( newApiVersion) {
		apiVersion = newApiVersion;
	}
}
