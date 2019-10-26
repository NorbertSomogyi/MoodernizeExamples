package application;

public class rtmp_custom {
	private Byte server;
	private Byte key;
	private Object use_auth;
	private Byte username;
	private Byte password;
	
	public rtmp_custom(Byte server, Byte key, Object use_auth, Byte username, Byte password) {
		setServer(server);
		setKey(key);
		setUse_auth(use_auth);
		setUsername(username);
		setPassword(password);
	}
	public rtmp_custom() {
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
	public Object getUse_auth() {
		return use_auth;
	}
	public void setUse_auth(Object newUse_auth) {
		use_auth = newUse_auth;
	}
	public Byte getUsername() {
		return username;
	}
	public void setUsername(Byte newUsername) {
		username = newUsername;
	}
	public Byte getPassword() {
		return password;
	}
	public void setPassword(Byte newPassword) {
		password = newPassword;
	}
}
