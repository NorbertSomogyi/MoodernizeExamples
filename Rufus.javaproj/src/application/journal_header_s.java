package application;

/*
 * Descriptor block types:
 */
/*
 * Standard header for all descriptor blocks:
 */
public class journal_header_s {
	private Object h_magic;
	private Object h_blocktype;
	private Object h_sequence;
	
	public journal_header_s(Object h_magic, Object h_blocktype, Object h_sequence) {
		setH_magic(h_magic);
		setH_blocktype(h_blocktype);
		setH_sequence(h_sequence);
	}
	public journal_header_s() {
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
}
