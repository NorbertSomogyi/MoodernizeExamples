package application;

public class bitmap_test_data {
	private bitmap_index bitmap_git;
	private bitmap base;
	private progress prg;
	private Object seen;
	
	public bitmap_test_data(bitmap_index bitmap_git, bitmap base, progress prg, Object seen) {
		setBitmap_git(bitmap_git);
		setBase(base);
		setPrg(prg);
		setSeen(seen);
	}
	public bitmap_test_data() {
	}
	
	public bitmap_index getBitmap_git() {
		return bitmap_git;
	}
	public void setBitmap_git(bitmap_index newBitmap_git) {
		bitmap_git = newBitmap_git;
	}
	public bitmap getBase() {
		return base;
	}
	public void setBase(bitmap newBase) {
		base = newBase;
	}
	public progress getPrg() {
		return prg;
	}
	public void setPrg(progress newPrg) {
		prg = newPrg;
	}
	public Object getSeen() {
		return seen;
	}
	public void setSeen(Object newSeen) {
		seen = newSeen;
	}
}
