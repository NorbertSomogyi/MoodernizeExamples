package application;

/* individual pieces of the URL */
public class urlpieces {
	private Object scheme;
	private Object hostname;
	private Object port;
	private Object user;
	private Object password;
	private Object options;
	private Object path;
	private Object query;
	
	public urlpieces(Object scheme, Object hostname, Object port, Object user, Object password, Object options, Object path, Object query) {
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
	
	public Object getScheme() {
		return scheme;
	}
	public void setScheme(Object newScheme) {
		scheme = newScheme;
	}
	public Object getHostname() {
		return hostname;
	}
	public void setHostname(Object newHostname) {
		hostname = newHostname;
	}
	public Object getPort() {
		return port;
	}
	public void setPort(Object newPort) {
		port = newPort;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object newPassword) {
		password = newPassword;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object newOptions) {
		options = newOptions;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getQuery() {
		return query;
	}
	public void setQuery(Object newQuery) {
		query = newQuery;
	}
}
