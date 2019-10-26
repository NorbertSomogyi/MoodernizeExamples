package application;

public class encoder_callback {
	private Object sent_first_packet;
	private Object new_packet;
	private Object param;
	
	public encoder_callback(Object sent_first_packet, Object new_packet, Object param) {
		setSent_first_packet(sent_first_packet);
		setNew_packet(new_packet);
		setParam(param);
	}
	public encoder_callback() {
	}
	
	public Object getSent_first_packet() {
		return sent_first_packet;
	}
	public void setSent_first_packet(Object newSent_first_packet) {
		sent_first_packet = newSent_first_packet;
	}
	public Object getNew_packet() {
		return new_packet;
	}
	public void setNew_packet(Object newNew_packet) {
		new_packet = newNew_packet;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
