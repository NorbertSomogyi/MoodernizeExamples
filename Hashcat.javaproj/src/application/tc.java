package application;

public class tc {
	private Object[] salt_buf;
	private Object[] data_buf;
	private Object[] keyfile_buf;
	private Object signature;
	private Object[] keyboard_layout_mapping_buf;
	private int keyboard_layout_mapping_cnt;
	
	public tc(Object[] salt_buf, Object[] data_buf, Object[] keyfile_buf, Object signature, Object[] keyboard_layout_mapping_buf, int keyboard_layout_mapping_cnt) {
		setSalt_buf(salt_buf);
		setData_buf(data_buf);
		setKeyfile_buf(keyfile_buf);
		setSignature(signature);
		setKeyboard_layout_mapping_buf(keyboard_layout_mapping_buf);
		setKeyboard_layout_mapping_cnt(keyboard_layout_mapping_cnt);
	}
	public tc() {
	}
	
	public Object[] getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object[] newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object[] getData_buf() {
		return data_buf;
	}
	public void setData_buf(Object[] newData_buf) {
		data_buf = newData_buf;
	}
	public Object[] getKeyfile_buf() {
		return keyfile_buf;
	}
	public void setKeyfile_buf(Object[] newKeyfile_buf) {
		keyfile_buf = newKeyfile_buf;
	}
	public Object getSignature() {
		return signature;
	}
	public void setSignature(Object newSignature) {
		signature = newSignature;
	}
	public Object[] getKeyboard_layout_mapping_buf() {
		return keyboard_layout_mapping_buf;
	}
	public void setKeyboard_layout_mapping_buf(Object[] newKeyboard_layout_mapping_buf) {
		keyboard_layout_mapping_buf = newKeyboard_layout_mapping_buf;
	}
	public int getKeyboard_layout_mapping_cnt() {
		return keyboard_layout_mapping_cnt;
	}
	public void setKeyboard_layout_mapping_cnt(int newKeyboard_layout_mapping_cnt) {
		keyboard_layout_mapping_cnt = newKeyboard_layout_mapping_cnt;
	}
}
