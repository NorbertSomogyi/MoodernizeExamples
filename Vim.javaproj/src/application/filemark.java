package application;

// only used for cterm.bg_rgb and cterm.fg_rgb: use cterm color
/*
 * marks: positions in a file
 * (a normal mark is a lnum/col pair, the same as a file position)
 */
// (Note: for EBCDIC there are more than 26, because there are gaps in the
// alphabet coding.  To minimize changes to the code, I decided to just
// increase the number of possible marks.
// max. # of named marks
// marks 0-9
// max. # of marks in jump list
// max. # of tags in tag stack
public class filemark {
	private  mark;
	private int fnum;
	
	public filemark( mark, int fnum) {
		setMark(mark);
		setFnum(fnum);
	}
	public filemark() {
	}
	
	public Object fm_getname(int lead_len) {
		int generatedFnum = this.getFnum();
		int generatedB_fnum = curbuf.getB_fnum();
		 generatedMark = this.getMark();
		if (generatedFnum == generatedB_fnum) {
			return (generatedMark).mark_line(lead_len);
		} 
		return ModernizedCProgram.buflist_nr2name(generatedFnum, 0, 1/*
		 * Return the line at mark "mp".  Truncate to fit in window.
		 * The returned string has been allocated.
		 */);
	}
	public  getMark() {
		return mark;
	}
	public void setMark( newMark) {
		mark = newMark;
	}
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int newFnum) {
		fnum = newFnum;
	}
}
