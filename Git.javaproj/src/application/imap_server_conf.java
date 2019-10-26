package application;

public class imap_server_conf {
	private Byte name;
	private Byte tunnel;
	private Byte host;
	private int port;
	private Byte folder;
	private Byte user;
	private Byte pass;
	private int use_ssl;
	private int ssl_verify;
	private int use_html;
	private Byte auth_method;
	
	public imap_server_conf(Byte name, Byte tunnel, Byte host, int port, Byte folder, Byte user, Byte pass, int use_ssl, int ssl_verify, int use_html, Byte auth_method) {
		setName(name);
		setTunnel(tunnel);
		setHost(host);
		setPort(port);
		setFolder(folder);
		setUser(user);
		setPass(pass);
		setUse_ssl(use_ssl);
		setSsl_verify(ssl_verify);
		setUse_html(use_html);
		setAuth_method(auth_method);
	}
	public imap_server_conf() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getTunnel() {
		return tunnel;
	}
	public void setTunnel(Byte newTunnel) {
		tunnel = newTunnel;
	}
	public Byte getHost() {
		return host;
	}
	public void setHost(Byte newHost) {
		host = newHost;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Byte getFolder() {
		return folder;
	}
	public void setFolder(Byte newFolder) {
		folder = newFolder;
	}
	public Byte getUser() {
		return user;
	}
	public void setUser(Byte newUser) {
		user = newUser;
	}
	public Byte getPass() {
		return pass;
	}
	public void setPass(Byte newPass) {
		pass = newPass;
	}
	public int getUse_ssl() {
		return use_ssl;
	}
	public void setUse_ssl(int newUse_ssl) {
		use_ssl = newUse_ssl;
	}
	public int getSsl_verify() {
		return ssl_verify;
	}
	public void setSsl_verify(int newSsl_verify) {
		ssl_verify = newSsl_verify;
	}
	public int getUse_html() {
		return use_html;
	}
	public void setUse_html(int newUse_html) {
		use_html = newUse_html;
	}
	public Byte getAuth_method() {
		return auth_method;
	}
	public void setAuth_method(Byte newAuth_method) {
		auth_method = newAuth_method;
	}
}
