package application;

public class ff_packet_list {
	private ff_packet packet;
	private ff_packet_list next;
	
	public ff_packet_list(ff_packet packet, ff_packet_list next) {
		setPacket(packet);
		setNext(next);
	}
	public ff_packet_list() {
	}
	
	public ff_packet getPacket() {
		return packet;
	}
	public void setPacket(ff_packet newPacket) {
		packet = newPacket;
	}
	public ff_packet_list getNext() {
		return next;
	}
	public void setNext(ff_packet_list newNext) {
		next = newNext;
	}
}
