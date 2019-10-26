package application;

public class s_xdchange {
	private s_xdchange next;
	private long i1;
	private long i2;
	private long chg1;
	private long chg2;
	private int ignore;
	
	public s_xdchange(s_xdchange next, long i1, long i2, long chg1, long chg2, int ignore) {
		setNext(next);
		setI1(i1);
		setI2(i2);
		setChg1(chg1);
		setChg2(chg2);
		setIgnore(ignore);
	}
	public s_xdchange() {
	}
	
	public s_xdchange xdl_add_change(long i1, long i2, long chg1, long chg2) {
		xdchange_t xch = new xdchange_t();
		if (!(xch = (xdchange_t)ModernizedCProgram.lalloc((), 1))) {
			return ((Object)0);
		} 
		xch.setNext(xscr);
		xch.setI1(i1);
		xch.setI2(i2);
		xch.setChg1(chg1);
		xch.setChg2(chg2);
		xch.setIgnore(0);
		return xch;
	}
	public void xdl_free_script() {
		xdchange_t xch = new xdchange_t();
		s_xdchange generatedNext = this.getNext();
		while ((xch = xscr) != ((Object)0)) {
			xscr = generatedNext;
			ModernizedCProgram.vim_free(xch);
		}
	}
	public s_xdchange xdl_get_hunk(Object xecfg) {
		xdchange_t xch = new xdchange_t();
		xdchange_t xchp = new xdchange_t();
		xdchange_t lxch = new xdchange_t();
		long max_common = 2 * xecfg.getCtxlen() + xecfg.getInterhunkctxlen();
		long max_ignorable = xecfg.getCtxlen();
		long ignored = /* number of ignored blank lines */0;
		int generatedIgnore = xchp.getIgnore();
		s_xdchange generatedNext = xchp.getNext();
		long generatedI1 = xch.getI1();
		long generatedChg1 = xchp.getChg1();
		for (xchp = xscr; xchp && generatedIgnore; xchp = generatedNext) {
			xch = generatedNext;
			if (xch == ((Object)0) || generatedI1 - (generatedI1 + generatedChg1) >= max_ignorable) {
				xscr = xch;
			} 
		}
		if (xscr == ((Object)0)) {
			return ((Object)0);
		} 
		lxch = xscr;
		long generatedChg2 = xch.getChg2();
		for (; xch; ) {
			long distance = generatedI1 - (generatedI1 + generatedChg1);
			if (distance > max_common) {
				break;
			} 
			if (distance < max_ignorable && (!generatedIgnore || lxch == xchp)) {
				lxch = xch;
				ignored = 0;
			}  else if (distance < max_ignorable && generatedIgnore) {
				ignored += generatedChg2;
			}  else if (lxch != xchp && generatedI1 + (long)ignored - (generatedI1 + generatedChg1) > max_common) {
				break;
			}  else if (!generatedIgnore) {
				lxch = xch;
				ignored = 0;
			} else {
					ignored += generatedChg2;
			} 
		}
		return lxch;
	}
	public s_xdchange getNext() {
		return next;
	}
	public void setNext(s_xdchange newNext) {
		next = newNext;
	}
	public long getI1() {
		return i1;
	}
	public void setI1(long newI1) {
		i1 = newI1;
	}
	public long getI2() {
		return i2;
	}
	public void setI2(long newI2) {
		i2 = newI2;
	}
	public long getChg1() {
		return chg1;
	}
	public void setChg1(long newChg1) {
		chg1 = newChg1;
	}
	public long getChg2() {
		return chg2;
	}
	public void setChg2(long newChg2) {
		chg2 = newChg2;
	}
	public int getIgnore() {
		return ignore;
	}
	public void setIgnore(int newIgnore) {
		ignore = newIgnore;
	}
}
