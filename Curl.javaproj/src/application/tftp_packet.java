package application;

public class tftp_packet {
	private Object data;
	
	public tftp_packet(Object data) {
		setData(data);
	}
	public tftp_packet() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
