package application;

/* Access Control List Entry */
public class ext2_acl_entry {
	private Object acle_size;
	private Object acle_perms;
	private Object acle_type;
	private Object acle_tag;
	private Object acle_pad1;
	private Object acle_next;
	
	public ext2_acl_entry(Object acle_size, Object acle_perms, Object acle_type, Object acle_tag, Object acle_pad1, Object acle_next) {
		setAcle_size(acle_size);
		setAcle_perms(acle_perms);
		setAcle_type(acle_type);
		setAcle_tag(acle_tag);
		setAcle_pad1(acle_pad1);
		setAcle_next(acle_next);
	}
	public ext2_acl_entry() {
	}
	
	public Object getAcle_size() {
		return acle_size;
	}
	public void setAcle_size(Object newAcle_size) {
		acle_size = newAcle_size;
	}
	public Object getAcle_perms() {
		return acle_perms;
	}
	public void setAcle_perms(Object newAcle_perms) {
		acle_perms = newAcle_perms;
	}
	public Object getAcle_type() {
		return acle_type;
	}
	public void setAcle_type(Object newAcle_type) {
		acle_type = newAcle_type;
	}
	public Object getAcle_tag() {
		return acle_tag;
	}
	public void setAcle_tag(Object newAcle_tag) {
		acle_tag = newAcle_tag;
	}
	public Object getAcle_pad1() {
		return acle_pad1;
	}
	public void setAcle_pad1(Object newAcle_pad1) {
		acle_pad1 = newAcle_pad1;
	}
	public Object getAcle_next() {
		return acle_next;
	}
	public void setAcle_next(Object newAcle_next) {
		acle_next = newAcle_next;
	}
}
