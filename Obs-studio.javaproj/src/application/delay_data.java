package application;

public class delay_data {
	private delay_msg msg;
	private Object ts;
	private encoder_packet packet;
	
	public delay_data(delay_msg msg, Object ts, encoder_packet packet) {
		setMsg(msg);
		setTs(ts);
		setPacket(packet);
	}
	public delay_data() {
	}
	
	public delay_msg getMsg() {
		return msg;
	}
	public void setMsg(delay_msg newMsg) {
		msg = newMsg;
	}
	public Object getTs() {
		return ts;
	}
	public void setTs(Object newTs) {
		ts = newTs;
	}
	public encoder_packet getPacket() {
		return packet;
	}
	public void setPacket(encoder_packet newPacket) {
		packet = newPacket;
	}
}
