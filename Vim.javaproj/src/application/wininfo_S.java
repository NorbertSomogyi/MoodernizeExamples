package application;

/*
 * Window info stored with a buffer.
 *
 * Two types of info are kept for a buffer which are associated with a
 * specific window:
 * 1. Each window can have a different line number associated with a buffer.
 * 2. The window-local options for a buffer work in a similar way.
 * The window-info is kept in a list at b_wininfo.  It is kept in
 * most-recently-used order.
 */
public class wininfo_S {
	private wininfo_S wi_next;
	private wininfo_S wi_prev;
	private window_S wi_win;
	private  wi_fpos;
	private int wi_optset;
	private  wi_opt;
	
	public wininfo_S(wininfo_S wi_next, wininfo_S wi_prev, window_S wi_win,  wi_fpos, int wi_optset,  wi_opt) {
		setWi_next(wi_next);
		setWi_prev(wi_prev);
		setWi_win(wi_win);
		setWi_fpos(wi_fpos);
		setWi_optset(wi_optset);
		setWi_opt(wi_opt);
	}
	public wininfo_S() {
	}
	
	public int wininfo_other_tab_diff() {
		win_T wp = new win_T();
		 generatedWi_opt = this.getWi_opt();
		Object generatedWo_diff = generatedWi_opt.getWo_diff();
		window_S generatedWi_win = this.getWi_win();
		window_S generatedW_next = wp.getW_next();
		if (generatedWo_diff) {
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedWi_win == wp) {
					return 0;
				} 
			}
			return 1;
		} 
		return 0/*
		 * Find info for the current window in buffer "buf".
		 * If not found, return the info for the most recently used window.
		 * When "skip_diff_buffer" is TRUE avoid windows with 'diff' set that is in
		 * another tab page.
		 * Returns NULL when there isn't any info.
		 */;
	}
	public wininfo_S find_wininfo(file_buffer buf, int skip_diff_buffer) {
		wininfo_T wip = new wininfo_T();
		window_S generatedWi_win = wip.getWi_win();
		wininfo_S generatedWi_next = wip.getWi_next();
		wininfo_S generatedB_wininfo = buf.getB_wininfo();
		for (wip = generatedB_wininfo; wip != ((Object)0); wip = generatedWi_next) {
			if (generatedWi_win == ModernizedCProgram.curwin && (!skip_diff_buffer || !wip.wininfo_other_tab_diff())) {
				break;
			} 
		}
		if (wip == ((Object)/* If no wininfo for curwin, use the first in the list (that doesn't have
		     * 'diff' set and is in another tab page). */0)) {
			if (skip_diff_buffer) {
				for (wip = generatedB_wininfo; wip != ((Object)0); wip = generatedWi_next) {
					if (!wip.wininfo_other_tab_diff()) {
						break;
					} 
				}
			} else {
					wip = generatedB_wininfo;
			} 
		} 
		return wip/*
		 * Reset the local window options to the values last used in this window.
		 * If the buffer wasn't used in this window before, use the values from
		 * the most recently used window.  If the values were never set, use the
		 * global values for the window.
		 */;
	}
	public wininfo_S getWi_next() {
		return wi_next;
	}
	public void setWi_next(wininfo_S newWi_next) {
		wi_next = newWi_next;
	}
	public wininfo_S getWi_prev() {
		return wi_prev;
	}
	public void setWi_prev(wininfo_S newWi_prev) {
		wi_prev = newWi_prev;
	}
	public window_S getWi_win() {
		return wi_win;
	}
	public void setWi_win(window_S newWi_win) {
		wi_win = newWi_win;
	}
	public  getWi_fpos() {
		return wi_fpos;
	}
	public void setWi_fpos( newWi_fpos) {
		wi_fpos = newWi_fpos;
	}
	public int getWi_optset() {
		return wi_optset;
	}
	public void setWi_optset(int newWi_optset) {
		wi_optset = newWi_optset;
	}
	public  getWi_opt() {
		return wi_opt;
	}
	public void setWi_opt( newWi_opt) {
		wi_opt = newWi_opt;
	}
}
