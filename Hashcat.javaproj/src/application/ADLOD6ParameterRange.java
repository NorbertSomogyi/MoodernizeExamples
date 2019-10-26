package application;

public class ADLOD6ParameterRange {
	private int iMin;
	private int iMax;
	private int iStep;
	
	public ADLOD6ParameterRange(int iMin, int iMax, int iStep) {
		setIMin(iMin);
		setIMax(iMax);
		setIStep(iStep);
	}
	public ADLOD6ParameterRange() {
	}
	
	public int getIMin() {
		return iMin;
	}
	public void setIMin(int newIMin) {
		iMin = newIMin;
	}
	public int getIMax() {
		return iMax;
	}
	public void setIMax(int newIMax) {
		iMax = newIMax;
	}
	public int getIStep() {
		return iStep;
	}
	public void setIStep(int newIStep) {
		iStep = newIStep;
	}
}
