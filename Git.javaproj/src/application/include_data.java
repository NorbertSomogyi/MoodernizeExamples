package application;

public class include_data {
	private bitmap_index bitmap_git;
	private bitmap base;
	private bitmap seen;
	
	public include_data(bitmap_index bitmap_git, bitmap base, bitmap seen) {
		setBitmap_git(bitmap_git);
		setBase(base);
		setSeen(seen);
	}
	public include_data() {
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
	public bitmap getSeen() {
		return seen;
	}
	public void setSeen(bitmap newSeen) {
		seen = newSeen;
	}
}
