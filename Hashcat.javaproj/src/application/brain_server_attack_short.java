package application;

public class brain_server_attack_short {
	private Object offset;
	private Object length;
	private int client_idx;
	
	public brain_server_attack_short(Object offset, Object length, int client_idx) {
		setOffset(offset);
		setLength(length);
		setClient_idx(client_idx);
	}
	public brain_server_attack_short() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public int getClient_idx() {
		return client_idx;
	}
	public void setClient_idx(int newClient_idx) {
		client_idx = newClient_idx;
	}
}
