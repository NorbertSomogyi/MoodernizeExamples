package application;

/* Tail of revoke block, for checksumming */
public class journal_revoke_tail {
	private Object r_checksum;
	
	public journal_revoke_tail(Object r_checksum) {
		setR_checksum(r_checksum);
	}
	public journal_revoke_tail() {
	}
	
	public Object getR_checksum() {
		return r_checksum;
	}
	public void setR_checksum(Object newR_checksum) {
		r_checksum = newR_checksum;
	}
}
