package application;

public class collect_diff_cbdata {
	private diff_ranges diff;
	
	public collect_diff_cbdata(diff_ranges diff) {
		setDiff(diff);
	}
	public collect_diff_cbdata() {
	}
	
	public diff_ranges getDiff() {
		return diff;
	}
	public void setDiff(diff_ranges newDiff) {
		diff = newDiff;
	}
}
