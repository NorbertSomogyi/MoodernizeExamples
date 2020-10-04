package application;

public class zip2 {
	private Object type;
	private Object mode;
	private Object magic;
	private Object salt_len;
	private Object[] salt_buf;
	private Object verify_bytes;
	private Object compress_length;
	private Object data_len;
	private Object[] data_buf;
	private Object auth_len;
	private Object[] auth_buf;
	
	public zip2(Object type, Object mode, Object magic, Object salt_len, Object[] salt_buf, Object verify_bytes, Object compress_length, Object data_len, Object[] data_buf, Object auth_len, Object[] auth_buf) {
		setType(type);
		setMode(mode);
		setMagic(magic);
		setSalt_len(salt_len);
		setSalt_buf(salt_buf);
		setVerify_bytes(verify_bytes);
		setCompress_length(compress_length);
		setData_len(data_len);
		setData_buf(data_buf);
		setAuth_len(auth_len);
		setAuth_buf(auth_buf);
	}
	public zip2() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(Object newSalt_len) {
		salt_len = newSalt_len;
	}
	public Object[] getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object[] newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getVerify_bytes() {
		return verify_bytes;
	}
	public void setVerify_bytes(Object newVerify_bytes) {
		verify_bytes = newVerify_bytes;
	}
	public Object getCompress_length() {
		return compress_length;
	}
	public void setCompress_length(Object newCompress_length) {
		compress_length = newCompress_length;
	}
	public Object getData_len() {
		return data_len;
	}
	public void setData_len(Object newData_len) {
		data_len = newData_len;
	}
	public Object[] getData_buf() {
		return data_buf;
	}
	public void setData_buf(Object[] newData_buf) {
		data_buf = newData_buf;
	}
	public Object getAuth_len() {
		return auth_len;
	}
	public void setAuth_len(Object newAuth_len) {
		auth_len = newAuth_len;
	}
	public Object[] getAuth_buf() {
		return auth_buf;
	}
	public void setAuth_buf(Object[] newAuth_buf) {
		auth_buf = newAuth_buf;
	}
}
