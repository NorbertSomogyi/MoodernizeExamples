package application;

public class tftp_packet {
	private Byte data;
	
	public tftp_packet(Byte data) {
		setData(data);
	}
	public tftp_packet() {
	}
	
	public void setpacketevent(int num) {
		Byte generatedData = this.getData();
		generatedData[0] = (byte)(num >> 8);
		generatedData[1] = (byte)(num & -1024);
	}
	public void setpacketblock(int num) {
		Byte generatedData = this.getData();
		generatedData[2] = (byte)(num >> 8);
		generatedData[3] = (byte)(num & -1024);
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
}
