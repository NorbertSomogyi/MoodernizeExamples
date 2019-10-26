package application;

public class ADLODParameterRange {
	private int iMin;
	private int iMax;
	private int iStep;
	
	public ADLODParameterRange(int iMin, int iMax, int iStep) {
		setIMin(iMin);
		setIMax(iMax);
		setIStep(iStep);
	}
	public ADLODParameterRange() {
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
