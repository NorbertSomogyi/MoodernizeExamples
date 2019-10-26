package application;

public class serve_options {
	private int advertise_capabilities;
	private int stateless_rpc;
	
	public serve_options(int advertise_capabilities, int stateless_rpc) {
		setAdvertise_capabilities(advertise_capabilities);
		setStateless_rpc(stateless_rpc);
	}
	public serve_options() {
	}
	
	public int getAdvertise_capabilities() {
		return advertise_capabilities;
	}
	public void setAdvertise_capabilities(int newAdvertise_capabilities) {
		advertise_capabilities = newAdvertise_capabilities;
	}
	public int getStateless_rpc() {
		return stateless_rpc;
	}
	public void setStateless_rpc(int newStateless_rpc) {
		stateless_rpc = newStateless_rpc;
	}
}
