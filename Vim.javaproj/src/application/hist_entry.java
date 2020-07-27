package application;

public class hist_entry {
	private int hisnum;
	private int viminfo;
	private Object[] hisstr;
	private Object time_set;
	
	public hist_entry(int hisnum, int viminfo, Object[] hisstr, Object time_set) {
		setHisnum(hisnum);
		setViminfo(viminfo);
		setHisstr(hisstr);
		setTime_set(time_set);
	}
	public hist_entry() {
	}
	
	public hist_entry get_histentry(int hist_type) {
		return ModernizedCProgram.history[hist_type];
	}
	public void set_histentry(int hist_type) {
		ModernizedCProgram.history[hist_type] = entry;
	}
	public void clear_hist_entry() {
		this.setHisnum(0);
		this.setViminfo(0);
		this.setHisstr(((Object)0));
		this.setTime_set(0/*
		 * Check if command line 'str' is already in history.
		 * If 'move_to_front' is TRUE, matching entry is moved to end of history.
		 */);
	}
	public int getHisnum() {
		return hisnum;
	}
	public void setHisnum(int newHisnum) {
		hisnum = newHisnum;
	}
	public int getViminfo() {
		return viminfo;
	}
	public void setViminfo(int newViminfo) {
		viminfo = newViminfo;
	}
	public Object[] getHisstr() {
		return hisstr;
	}
	public void setHisstr(Object[] newHisstr) {
		hisstr = newHisstr;
	}
	public Object getTime_set() {
		return time_set;
	}
	public void setTime_set(Object newTime_set) {
		time_set = newTime_set;
	}
}
