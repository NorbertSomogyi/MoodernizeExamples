package application;

public class straight_ctx {
	private boolean enabled;
	private Object kernel_rules_cnt;
	private  kernel_rules_buf;
	private Byte dicts;
	private Object dicts_pos;
	private Object dicts_cnt;
	private Object dicts_avail;
	private Byte dict;
	
	public straight_ctx(boolean enabled, Object kernel_rules_cnt,  kernel_rules_buf, Byte dicts, Object dicts_pos, Object dicts_cnt, Object dicts_avail, Byte dict) {
		setEnabled(enabled);
		setKernel_rules_cnt(kernel_rules_cnt);
		setKernel_rules_buf(kernel_rules_buf);
		setDicts(dicts);
		setDicts_pos(dicts_pos);
		setDicts_cnt(dicts_cnt);
		setDicts_avail(dicts_avail);
		setDict(dict);
	}
	public straight_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Object getKernel_rules_cnt() {
		return kernel_rules_cnt;
	}
	public void setKernel_rules_cnt(Object newKernel_rules_cnt) {
		kernel_rules_cnt = newKernel_rules_cnt;
	}
	public  getKernel_rules_buf() {
		return kernel_rules_buf;
	}
	public void setKernel_rules_buf( newKernel_rules_buf) {
		kernel_rules_buf = newKernel_rules_buf;
	}
	public Byte getDicts() {
		return dicts;
	}
	public void setDicts(Byte newDicts) {
		dicts = newDicts;
	}
	public Object getDicts_pos() {
		return dicts_pos;
	}
	public void setDicts_pos(Object newDicts_pos) {
		dicts_pos = newDicts_pos;
	}
	public Object getDicts_cnt() {
		return dicts_cnt;
	}
	public void setDicts_cnt(Object newDicts_cnt) {
		dicts_cnt = newDicts_cnt;
	}
	public Object getDicts_avail() {
		return dicts_avail;
	}
	public void setDicts_avail(Object newDicts_avail) {
		dicts_avail = newDicts_avail;
	}
	public Byte getDict() {
		return dict;
	}
	public void setDict(Byte newDict) {
		dict = newDict;
	}
}
