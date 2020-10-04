package application;

public class cloudkey {
	private Object data_len;
	private Object[] data_buf;
	
	public cloudkey(Object data_len, Object[] data_buf) {
		setData_len(data_len);
		setData_buf(data_buf);
	}
	public cloudkey() {
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
}
