package application;

public class dictstat_ctx {
	private boolean enabled;
	private Byte filename;
	private dictstat base;
	private Object cnt;
	
	public dictstat_ctx(boolean enabled, Byte filename, dictstat base, Object cnt) {
		setEnabled(enabled);
		setFilename(filename);
		setBase(base);
		setCnt(cnt);
	}
	public dictstat_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public dictstat getBase() {
		return base;
	}
	public void setBase(dictstat newBase) {
		base = newBase;
	}
	public Object getCnt() {
		return cnt;
	}
	public void setCnt(Object newCnt) {
		cnt = newCnt;
	}
}
