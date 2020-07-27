package application;

public class reflog_expire_cfg {
	private reflog_expire_cfg next;
	private Object expire_total;
	private Object expire_unreachable;
	private Object pattern;
	
	public reflog_expire_cfg(reflog_expire_cfg next, Object expire_total, Object expire_unreachable, Object pattern) {
		setNext(next);
		setExpire_total(expire_total);
		setExpire_unreachable(expire_unreachable);
		setPattern(pattern);
	}
	public reflog_expire_cfg() {
	}
	
	public reflog_expire_cfg find_cfg_ent(Object pattern, Object len) {
		reflog_expire_cfg ent = new reflog_expire_cfg();
		if (!reflog_expire_cfg_tail) {
			reflog_expire_cfg_tail = reflog_expire_cfg;
		} 
		Object generatedPattern = ent.getPattern();
		reflog_expire_cfg generatedNext = ent.getNext();
		for (ent = reflog_expire_cfg; ent; ent = generatedNext) {
			if (!/*Error: Function owner not recognized*/strncmp(generatedPattern, pattern, len) && generatedPattern[len] == (byte)'\0') {
				return ent;
			} 
		}
		do {
			size_t flex_array_len_ = (len);
			(ent) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedPattern, (pattern), flex_array_len_);
		} while (0);
		reflog_expire_cfg_tail = ent;
		reflog_expire_cfg_tail = (generatedNext);
		return ent/* expiry timer slot */;
	}
	public reflog_expire_cfg getNext() {
		return next;
	}
	public void setNext(reflog_expire_cfg newNext) {
		next = newNext;
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
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
}
