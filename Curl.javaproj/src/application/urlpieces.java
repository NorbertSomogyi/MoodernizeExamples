package application;

/* individual pieces of the URL */
public class urlpieces {
	private Byte scheme;
	private Byte hostname;
	private Byte port;
	private Byte user;
	private Byte password;
	private Byte options;
	private Byte path;
	private Byte query;
	
	public urlpieces(Byte scheme, Byte hostname, Byte port, Byte user, Byte password, Byte options, Byte path, Byte query) {
		setScheme(scheme);
		setHostname(hostname);
		setPort(port);
		setUser(user);
		setPassword(password);
		setOptions(options);
		setPath(path);
		setQuery(query);
	}
	public urlpieces() {
	}
	
	public Byte getScheme() {
		return scheme;
	}
	public void setScheme(Byte newScheme) {
		scheme = newScheme;
	}
	public Byte getHostname() {
		return hostname;
	}
	public void setHostname(Byte newHostname) {
		hostname = newHostname;
	}
	public Byte getPort() {
		return port;
	}
	public void setPort(Byte newPort) {
		port = newPort;
	}
	public Byte getUser() {
		return user;
	}
	public void setUser(Byte newUser) {
		user = newUser;
	}
	public Byte getPassword() {
		return password;
	}
	public void setPassword(Byte newPassword) {
		password = newPassword;
	}
	public Byte getOptions() {
		return options;
	}
	public void setOptions(Byte newOptions) {
		options = newOptions;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getQuery() {
		return query;
	}
	public void setQuery(Byte newQuery) {
		query = newQuery;
	}
}
