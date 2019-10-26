package application;

/* other error while reading spell file */
/*
 * Structure used in "b_langp", filled from 'spelllang'.
 */
public class langp_S {
	private slang_S lp_slang;
	private slang_S lp_sallang;
	private slang_S lp_replang;
	private int lp_region;
	
	public langp_S(slang_S lp_slang, slang_S lp_sallang, slang_S lp_replang, int lp_region) {
		setLp_slang(lp_slang);
		setLp_sallang(lp_sallang);
		setLp_replang(lp_replang);
		setLp_region(lp_region);
	}
	public langp_S() {
	}
	
	public slang_S getLp_slang() {
		return lp_slang;
	}
	public void setLp_slang(slang_S newLp_slang) {
		lp_slang = newLp_slang;
	}
	public slang_S getLp_sallang() {
		return lp_sallang;
	}
	public void setLp_sallang(slang_S newLp_sallang) {
		lp_sallang = newLp_sallang;
	}
	public slang_S getLp_replang() {
		return lp_replang;
	}
	public void setLp_replang(slang_S newLp_replang) {
		lp_replang = newLp_replang;
	}
	public int getLp_region() {
		return lp_region;
	}
	public void setLp_region(int newLp_region) {
		lp_region = newLp_region;
	}
}
