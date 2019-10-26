package application;

public class pstoken {
	private Object salt_buf;
	private Object salt_len;
	private Object pc_digest;
	private Object pc_offset;
	
	public pstoken(Object salt_buf, Object salt_len, Object pc_digest, Object pc_offset) {
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
		setPc_digest(pc_digest);
		setPc_offset(pc_offset);
	}
	public pstoken() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(Object newSalt_len) {
		salt_len = newSalt_len;
	}
	public Object getPc_digest() {
		return pc_digest;
	}
	public void setPc_digest(Object newPc_digest) {
		pc_digest = newPc_digest;
	}
	public Object getPc_offset() {
		return pc_offset;
	}
	public void setPc_offset(Object newPc_offset) {
		pc_offset = newPc_offset;
	}
}
