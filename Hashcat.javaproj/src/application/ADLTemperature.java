package application;

public class ADLTemperature {
	private int iSize;
	private int iTemperature;
	
	public ADLTemperature(int iSize, int iTemperature) {
		setISize(iSize);
		setITemperature(iTemperature);
	}
	public ADLTemperature() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getITemperature() {
		return iTemperature;
	}
	public void setITemperature(int newITemperature) {
		iTemperature = newITemperature;
	}
}
