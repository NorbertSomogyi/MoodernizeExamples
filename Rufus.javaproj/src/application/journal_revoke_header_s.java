package application;

public class journal_revoke_header_s {
	private journal_header_s r_header;
	private int r_count;
	
	public journal_revoke_header_s(journal_header_s r_header, int r_count) {
		setR_header(r_header);
		setR_count(r_count);
	}
	public journal_revoke_header_s() {
	}
	
	public journal_header_s getR_header() {
		return r_header;
	}
	public void setR_header(journal_header_s newR_header) {
		r_header = newR_header;
	}
	public int getR_count() {
		return r_count;
	}
	public void setR_count(int newR_count) {
		r_count = newR_count;
	}
}
