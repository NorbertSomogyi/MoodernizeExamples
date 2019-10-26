package application;

/*
 * Info used to pass info about a fold from the fold-detection code to the
 * code that displays the foldcolumn.
 */
public class foldinfo {
	private int fi_level;
	private int fi_lnum;
	private int fi_low_level;
	
	public foldinfo(int fi_level, int fi_lnum, int fi_low_level) {
		setFi_level(fi_level);
		setFi_lnum(fi_lnum);
		setFi_low_level(fi_low_level);
	}
	public foldinfo() {
	}
	
	public int getFi_level() {
		return fi_level;
	}
	public void setFi_level(int newFi_level) {
		fi_level = newFi_level;
	}
	public int getFi_lnum() {
		return fi_lnum;
	}
	public void setFi_lnum(int newFi_lnum) {
		fi_lnum = newFi_lnum;
	}
	public int getFi_low_level() {
		return fi_low_level;
	}
	public void setFi_low_level(int newFi_low_level) {
		fi_low_level = newFi_low_level;
	}
}
