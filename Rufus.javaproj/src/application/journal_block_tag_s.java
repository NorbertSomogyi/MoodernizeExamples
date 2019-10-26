package application;

public class journal_block_tag_s {
	private Object t_blocknr;
	private Object t_checksum;
	private Object t_flags;
	private Object t_blocknr_high;
	
	public journal_block_tag_s(Object t_blocknr, Object t_checksum, Object t_flags, Object t_blocknr_high) {
		setT_blocknr(t_blocknr);
		setT_checksum(t_checksum);
		setT_flags(t_flags);
		setT_blocknr_high(t_blocknr_high);
	}
	public journal_block_tag_s() {
	}
	
	public Object getT_blocknr() {
		return t_blocknr;
	}
	public void setT_blocknr(Object newT_blocknr) {
		t_blocknr = newT_blocknr;
	}
	public Object getT_checksum() {
		return t_checksum;
	}
	public void setT_checksum(Object newT_checksum) {
		t_checksum = newT_checksum;
	}
	public Object getT_flags() {
		return t_flags;
	}
	public void setT_flags(Object newT_flags) {
		t_flags = newT_flags;
	}
	public Object getT_blocknr_high() {
		return t_blocknr_high;
	}
	public void setT_blocknr_high(Object newT_blocknr_high) {
		t_blocknr_high = newT_blocknr_high;
	}
}
