package application;

public class rtmp_common {
	private byte service;
	private Byte server;
	private Byte key;
	private Byte output;
	
	public rtmp_common(byte service, Byte server, Byte key, Byte output) {
		setService(service);
		setServer(server);
		setKey(key);
		setOutput(output);
	}
	public rtmp_common() {
	}
	
	public byte getService() {
		return service;
	}
	public void setService(byte newService) {
		service = newService;
	}
	public Byte getServer() {
		return server;
	}
	public void setServer(Byte newServer) {
		server = newServer;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getOutput() {
		return output;
	}
	public void setOutput(Byte newOutput) {
		output = newOutput;
	}
}
