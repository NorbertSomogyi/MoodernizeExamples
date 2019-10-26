package application;

////////////////////////////////////////////////////////////////////////////////
public class dtvcc_packet_t {
	private int sequence_number;
	private int packet_size;
	private int serice_number;
	
	public dtvcc_packet_t(int sequence_number, int packet_size, int serice_number) {
		setSequence_number(sequence_number);
		setPacket_size(packet_size);
		setSerice_number(serice_number);
	}
	public dtvcc_packet_t() {
	}
	
	public dtvcc_packet_t dtvcc_packet_start(Object cc_data1, Object cc_data2) {
		int packet_size = cc_data1 & -1024;
		packet_size = (0 == packet_size) ? 64 * 8 - 1 : (packet_size * 8 - 1);
		int packet_size_bytes = dtvcc_packet_t * dvtcc = .malloc( + packet_size * 2 - 1);
		dvtcc.setPacket_size(packet_size);
		dvtcc.setService_number(DVTCC_SERVICE_NUMBER_UNKNOWN);
	}
	public void dtvcc_packet_data(Object cc_data1, Object cc_data2) {
		Object generatedDtvcc_packet_t = this.getDtvcc_packet_t();
	}
	public int getSequence_number() {
		return sequence_number;
	}
	public void setSequence_number(int newSequence_number) {
		sequence_number = newSequence_number;
	}
	public int getPacket_size() {
		return packet_size;
	}
	public void setPacket_size(int newPacket_size) {
		packet_size = newPacket_size;
	}
	public int getSerice_number() {
		return serice_number;
	}
	public void setSerice_number(int newSerice_number) {
		serice_number = newSerice_number;
	}
}
