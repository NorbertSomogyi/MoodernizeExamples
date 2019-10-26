package application;

/**
 * Structs needed for ME only mode.
 */
public class _NV_ENC_MVECTOR {
	private Object mvx;
	private Object mvy;
	
	public _NV_ENC_MVECTOR(Object mvx, Object mvy) {
		setMvx(mvx);
		setMvy(mvy);
	}
	public _NV_ENC_MVECTOR() {
	}
	
	public Object getMvx() {
		return mvx;
	}
	public void setMvx(Object newMvx) {
		mvx = newMvx;
	}
	public Object getMvy() {
		return mvy;
	}
	public void setMvy(Object newMvy) {
		mvy = newMvy;
	}
}
