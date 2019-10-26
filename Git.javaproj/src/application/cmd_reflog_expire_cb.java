package application;

public class cmd_reflog_expire_cb {
	private rev_info revs;
	private int stalefix;
	private Object expire_total;
	private Object expire_unreachable;
	private int recno;
	
	public cmd_reflog_expire_cb(rev_info revs, int stalefix, Object expire_total, Object expire_unreachable, int recno) {
		setRevs(revs);
		setStalefix(stalefix);
		setExpire_total(expire_total);
		setExpire_unreachable(expire_unreachable);
		setRecno(recno);
	}
	public cmd_reflog_expire_cb() {
	}
	
	public void set_reflog_expiry_param(int slot, Object ref) {
		reflog_expire_cfg ent = new reflog_expire_cfg();
		if (slot == (1 | 2)) {
			return ;
		} 
		Object generatedPattern = ent.getPattern();
		Object generatedExpire_total = ent.getExpire_total();
		Object generatedExpire_unreachable = ent.getExpire_unreachable();
		reflog_expire_cfg generatedNext = ent.getNext();
		for (ent = reflog_expire_cfg; ent; ent = generatedNext) {
			if (!ModernizedCProgram.wildmatch(generatedPattern, ref, 0)) {
				if (!(slot & 1)) {
					this.setExpire_total(generatedExpire_total);
				} 
				if (!(slot & 2)) {
					this.setExpire_unreachable(generatedExpire_unreachable);
				} 
				return ;
			} 
		}
		if (!.strcmp(ref, /*
			 * If unconfigured, make stash never expire
			 */"refs/stash")) {
			if (!(slot & 1)) {
				this.setExpire_total(0);
			} 
			if (!(slot & 2)) {
				this.setExpire_unreachable(0);
			} 
			return ;
		} 
		if (!(slot & /* Nothing matched -- use the default value */1)) {
			this.setExpire_total(ModernizedCProgram.default_reflog_expire);
		} 
		if (!(slot & 2)) {
			this.setExpire_unreachable(ModernizedCProgram.default_reflog_expire_unreachable);
		} 
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public int getStalefix() {
		return stalefix;
	}
	public void setStalefix(int newStalefix) {
		stalefix = newStalefix;
	}
	public Object getExpire_total() {
		return expire_total;
	}
	public void setExpire_total(Object newExpire_total) {
		expire_total = newExpire_total;
	}
	public Object getExpire_unreachable() {
		return expire_unreachable;
	}
	public void setExpire_unreachable(Object newExpire_unreachable) {
		expire_unreachable = newExpire_unreachable;
	}
	public int getRecno() {
		return recno;
	}
	public void setRecno(int newRecno) {
		recno = newRecno;
	}
}
