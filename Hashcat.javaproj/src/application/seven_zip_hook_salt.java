package application;

public class seven_zip_hook_salt {
	private Object iv_buf;
	private Object iv_len;
	private Object salt_buf;
	private Object salt_len;
	private Object crc;
	private Object crc_len;
	private Object data_type;
	private Object data_buf;
	private Object data_len;
	private Object unpack_size;
	private Object coder_attributes;
	private Object coder_attributes_len;
	private int aes_len;
	
	public seven_zip_hook_salt(Object iv_buf, Object iv_len, Object salt_buf, Object salt_len, Object crc, Object crc_len, Object data_type, Object data_buf, Object data_len, Object unpack_size, Object coder_attributes, Object coder_attributes_len, int aes_len) {
		setIv_buf(iv_buf);
		setIv_len(iv_len);
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
		setCrc(crc);
		setCrc_len(crc_len);
		setData_type(data_type);
		setData_buf(data_buf);
		setData_len(data_len);
		setUnpack_size(unpack_size);
		setCoder_attributes(coder_attributes);
		setCoder_attributes_len(coder_attributes_len);
		setAes_len(aes_len);
	}
	public seven_zip_hook_salt() {
	}
	
	public Object getIv_buf() {
		return iv_buf;
	}
	public void setIv_buf(Object newIv_buf) {
		iv_buf = newIv_buf;
	}
	public Object getIv_len() {
		return iv_len;
	}
	public void setIv_len(Object newIv_len) {
		iv_len = newIv_len;
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
	public Object getCrc() {
		return crc;
	}
	public void setCrc(Object newCrc) {
		crc = newCrc;
	}
	public Object getCrc_len() {
		return crc_len;
	}
	public void setCrc_len(Object newCrc_len) {
		crc_len = newCrc_len;
	}
	public Object getData_type() {
		return data_type;
	}
	public void setData_type(Object newData_type) {
		data_type = newData_type;
	}
	public Object getData_buf() {
		return data_buf;
	}
	public void setData_buf(Object newData_buf) {
		data_buf = newData_buf;
	}
	public Object getData_len() {
		return data_len;
	}
	public void setData_len(Object newData_len) {
		data_len = newData_len;
	}
	public Object getUnpack_size() {
		return unpack_size;
	}
	public void setUnpack_size(Object newUnpack_size) {
		unpack_size = newUnpack_size;
	}
	public Object getCoder_attributes() {
		return coder_attributes;
	}
	public void setCoder_attributes(Object newCoder_attributes) {
		coder_attributes = newCoder_attributes;
	}
	public Object getCoder_attributes_len() {
		return coder_attributes_len;
	}
	public void setCoder_attributes_len(Object newCoder_attributes_len) {
		coder_attributes_len = newCoder_attributes_len;
	}
	public int getAes_len() {
		return aes_len;
	}
	public void setAes_len(int newAes_len) {
		aes_len = newAes_len;
	}
}
