package application;

/* Tail of descriptor block, for checksumming */
public class journal_block_tail {
	private Object t_checksum;
	
	public journal_block_tail(Object t_checksum) {
		setT_checksum(t_checksum);
	}
	public journal_block_tail() {
	}
	
	public Object getT_checksum() {
		return t_checksum;
	}
	public void setT_checksum(Object newT_checksum) {
		t_checksum = newT_checksum;
	}
}
