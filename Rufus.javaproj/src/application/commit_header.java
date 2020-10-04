package application;

public class commit_header {
	private Object h_magic;
	private Object h_blocktype;
	private Object h_sequence;
	private byte h_chksum_type;
	private byte h_chksum_size;
	private Object[] h_padding;
	private Object[] h_chksum;
	private Object h_commit_sec;
	private Object h_commit_nsec;
	
	public commit_header(Object h_magic, Object h_blocktype, Object h_sequence, byte h_chksum_type, byte h_chksum_size, Object[] h_padding, Object[] h_chksum, Object h_commit_sec, Object h_commit_nsec) {
		setH_magic(h_magic);
		setH_blocktype(h_blocktype);
		setH_sequence(h_sequence);
		setH_chksum_type(h_chksum_type);
		setH_chksum_size(h_chksum_size);
		setH_padding(h_padding);
		setH_chksum(h_chksum);
		setH_commit_sec(h_commit_sec);
		setH_commit_nsec(h_commit_nsec);
	}
	public commit_header() {
	}
	
	public Object getH_magic() {
		return h_magic;
	}
	public void setH_magic(Object newH_magic) {
		h_magic = newH_magic;
	}
	public Object getH_blocktype() {
		return h_blocktype;
	}
	public void setH_blocktype(Object newH_blocktype) {
		h_blocktype = newH_blocktype;
	}
	public Object getH_sequence() {
		return h_sequence;
	}
	public void setH_sequence(Object newH_sequence) {
		h_sequence = newH_sequence;
	}
	public byte getH_chksum_type() {
		return h_chksum_type;
	}
	public void setH_chksum_type(byte newH_chksum_type) {
		h_chksum_type = newH_chksum_type;
	}
	public byte getH_chksum_size() {
		return h_chksum_size;
	}
	public void setH_chksum_size(byte newH_chksum_size) {
		h_chksum_size = newH_chksum_size;
	}
	public Object[] getH_padding() {
		return h_padding;
	}
	public void setH_padding(Object[] newH_padding) {
		h_padding = newH_padding;
	}
	public Object[] getH_chksum() {
		return h_chksum;
	}
	public void setH_chksum(Object[] newH_chksum) {
		h_chksum = newH_chksum;
	}
	public Object getH_commit_sec() {
		return h_commit_sec;
	}
	public void setH_commit_sec(Object newH_commit_sec) {
		h_commit_sec = newH_commit_sec;
	}
	public Object getH_commit_nsec() {
		return h_commit_nsec;
	}
	public void setH_commit_nsec(Object newH_commit_nsec) {
		h_commit_nsec = newH_commit_nsec;
	}
}
