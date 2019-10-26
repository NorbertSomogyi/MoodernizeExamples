package application;

public class git_transport_data {
	private git_transport_options options;
	private child_process conn;
	private Object fd;
	private int got_remote_heads;
	private protocol_version version;
	private oid_array extra_have;
	private oid_array shallow;
	
	public git_transport_data(git_transport_options options, child_process conn, Object fd, int got_remote_heads, protocol_version version, oid_array extra_have, oid_array shallow) {
		setOptions(options);
		setConn(conn);
		setFd(fd);
		setGot_remote_heads(got_remote_heads);
		setVersion(version);
		setExtra_have(extra_have);
		setShallow(shallow);
	}
	public git_transport_data() {
	}
	
	public git_transport_options getOptions() {
		return options;
	}
	public void setOptions(git_transport_options newOptions) {
		options = newOptions;
	}
	public child_process getConn() {
		return conn;
	}
	public void setConn(child_process newConn) {
		conn = newConn;
	}
	public Object getFd() {
		return fd;
	}
	public void setFd(Object newFd) {
		fd = newFd;
	}
	public int getGot_remote_heads() {
		return got_remote_heads;
	}
	public void setGot_remote_heads(int newGot_remote_heads) {
		got_remote_heads = newGot_remote_heads;
	}
	public protocol_version getVersion() {
		return version;
	}
	public void setVersion(protocol_version newVersion) {
		version = newVersion;
	}
	public oid_array getExtra_have() {
		return extra_have;
	}
	public void setExtra_have(oid_array newExtra_have) {
		extra_have = newExtra_have;
	}
	public oid_array getShallow() {
		return shallow;
	}
	public void setShallow(oid_array newShallow) {
		shallow = newShallow;
	}
}
