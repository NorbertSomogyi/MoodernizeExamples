package application;

public class upload_pack_options {
	private int stateless_rpc;
	private int advertise_refs;
	private int timeout;
	private int daemon_mode;
	
	public upload_pack_options(int stateless_rpc, int advertise_refs, int timeout, int daemon_mode) {
		setStateless_rpc(stateless_rpc);
		setAdvertise_refs(advertise_refs);
		setTimeout(timeout);
		setDaemon_mode(daemon_mode);
	}
	public upload_pack_options() {
	}
	
	public int getStateless_rpc() {
		return stateless_rpc;
	}
	public void setStateless_rpc(int newStateless_rpc) {
		stateless_rpc = newStateless_rpc;
	}
	public int getAdvertise_refs() {
		return advertise_refs;
	}
	public void setAdvertise_refs(int newAdvertise_refs) {
		advertise_refs = newAdvertise_refs;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int newTimeout) {
		timeout = newTimeout;
	}
	public int getDaemon_mode() {
		return daemon_mode;
	}
	public void setDaemon_mode(int newDaemon_mode) {
		daemon_mode = newDaemon_mode;
	}
}
