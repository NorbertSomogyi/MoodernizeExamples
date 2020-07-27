package application;

public class tuning_db {
	private boolean enabled;
	private tuning_db_alias[] alias_buf;
	private int alias_cnt;
	private tuning_db_entry[] entry_buf;
	private int entry_cnt;
	
	public tuning_db(boolean enabled, tuning_db_alias[] alias_buf, int alias_cnt, tuning_db_entry[] entry_buf, int entry_cnt) {
		setEnabled(enabled);
		setAlias_buf(alias_buf);
		setAlias_cnt(alias_cnt);
		setEntry_buf(entry_buf);
		setEntry_cnt(entry_cnt);
	}
	public tuning_db() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public tuning_db_alias[] getAlias_buf() {
		return alias_buf;
	}
	public void setAlias_buf(tuning_db_alias[] newAlias_buf) {
		alias_buf = newAlias_buf;
	}
	public int getAlias_cnt() {
		return alias_cnt;
	}
	public void setAlias_cnt(int newAlias_cnt) {
		alias_cnt = newAlias_cnt;
	}
	public tuning_db_entry[] getEntry_buf() {
		return entry_buf;
	}
	public void setEntry_buf(tuning_db_entry[] newEntry_buf) {
		entry_buf = newEntry_buf;
	}
	public int getEntry_cnt() {
		return entry_cnt;
	}
	public void setEntry_cnt(int newEntry_cnt) {
		entry_cnt = newEntry_cnt;
	}
}
