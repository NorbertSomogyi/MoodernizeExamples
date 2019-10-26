package application;

public class bitmap_show_data {
	private bitmap_index bitmap_git;
	private bitmap base;
	
	public bitmap_show_data(bitmap_index bitmap_git, bitmap base) {
		setBitmap_git(bitmap_git);
		setBase(base);
	}
	public bitmap_show_data() {
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
}
