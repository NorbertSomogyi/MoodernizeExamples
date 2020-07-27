package application;

public class tftp_packet {
	private byte[] data;
	
	public tftp_packet(byte[] data) {
		setData(data);
	}
	public tftp_packet() {
	}
	
	public void setpacketevent(int num) {
		byte[] generatedData = this.getData();
		generatedData[0] = (byte)(num >> 8);
		generatedData[1] = (byte)(num & -1024);
	}
	public void setpacketblock(int num) {
		byte[] generatedData = this.getData();
		generatedData[2] = (byte)(num >> 8);
		generatedData[3] = (byte)(num & -1024);
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] newData) {
		data = newData;
	}
}
