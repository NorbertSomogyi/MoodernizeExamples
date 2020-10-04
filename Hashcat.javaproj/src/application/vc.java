package application;

public class vc {
	private Object[] salt_buf;
	private Object[] data_buf;
	private Object[] keyfile_buf;
	private Object signature;
	private Object[] keyboard_layout_mapping_buf;
	private int keyboard_layout_mapping_cnt;
	private int pim_multi;
	private int pim_start;
	private int pim_stop;
	
	public vc(Object[] salt_buf, Object[] data_buf, Object[] keyfile_buf, Object signature, Object[] keyboard_layout_mapping_buf, int keyboard_layout_mapping_cnt, int pim_multi, int pim_start, int pim_stop) {
		setSalt_buf(salt_buf);
		setData_buf(data_buf);
		setKeyfile_buf(keyfile_buf);
		setSignature(signature);
		setKeyboard_layout_mapping_buf(keyboard_layout_mapping_buf);
		setKeyboard_layout_mapping_cnt(keyboard_layout_mapping_cnt);
		setPim_multi(pim_multi);
		setPim_start(pim_start);
		setPim_stop(pim_stop);
	}
	public vc() {
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
	public int getPim_multi() {
		return pim_multi;
	}
	public void setPim_multi(int newPim_multi) {
		pim_multi = newPim_multi;
	}
	public int getPim_start() {
		return pim_start;
	}
	public void setPim_start(int newPim_start) {
		pim_start = newPim_start;
	}
	public int getPim_stop() {
		return pim_stop;
	}
	public void setPim_stop(int newPim_stop) {
		pim_stop = newPim_stop;
	}
}
