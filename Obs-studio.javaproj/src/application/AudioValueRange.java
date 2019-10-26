package application;

public class AudioValueRange {
	private Object mMinimum;
	private Object mMaximum;
	
	public AudioValueRange(Object mMinimum, Object mMaximum) {
		setMMinimum(mMinimum);
		setMMaximum(mMaximum);
	}
	public AudioValueRange() {
	}
	
	public Object getMMinimum() {
		return mMinimum;
	}
	public void setMMinimum(Object newMMinimum) {
		mMinimum = newMMinimum;
	}
	public Object getMMaximum() {
		return mMaximum;
	}
	public void setMMaximum(Object newMMaximum) {
		mMaximum = newMMaximum;
	}
}
