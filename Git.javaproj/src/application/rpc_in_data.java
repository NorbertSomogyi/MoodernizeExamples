package application;

public class rpc_in_data {
	private rpc_state rpc;
	private active_request_slot slot;
	
	public rpc_in_data(rpc_state rpc, active_request_slot slot) {
		setRpc(rpc);
		setSlot(slot);
	}
	public rpc_in_data() {
	}
	
	public rpc_state getRpc() {
		return rpc;
	}
	public void setRpc(rpc_state newRpc) {
		rpc = newRpc;
	}
	public active_request_slot getSlot() {
		return slot;
	}
	public void setSlot(active_request_slot newSlot) {
		slot = newSlot;
	}
}
