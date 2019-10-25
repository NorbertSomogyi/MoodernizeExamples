package application;

/*
 * Specific protocol handler.
 */
/* Connection's protocol handler */
/* The protocol first given */
public class Curl_handler {
	private Object scheme;
	private Object setup_connection;
	private Object do_it;
	private Object done;
	private Object do_more;
	private Object connect_it;
	private Object connecting;
	private Object doing;
	private Object proto_getsock;
	private Object doing_getsock;
	private Object domore_getsock;
	private Object perform_getsock;
	private Object disconnect;
	private Object readwrite;
	private Object connection_check;
	private long defport;
	private int protocol;
	private int flags;
	
	public Curl_handler(Object scheme, Object setup_connection, Object do_it, Object done, Object do_more, Object connect_it, Object connecting, Object doing, Object proto_getsock, Object doing_getsock, Object domore_getsock, Object perform_getsock, Object disconnect, Object readwrite, Object connection_check, long defport, int protocol, int flags) {
		setScheme(scheme);
		setSetup_connection(setup_connection);
		setDo_it(do_it);
		setDone(done);
		setDo_more(do_more);
		setConnect_it(connect_it);
		setConnecting(connecting);
		setDoing(doing);
		setProto_getsock(proto_getsock);
		setDoing_getsock(doing_getsock);
		setDomore_getsock(domore_getsock);
		setPerform_getsock(perform_getsock);
		setDisconnect(disconnect);
		setReadwrite(readwrite);
		setConnection_check(connection_check);
		setDefport(defport);
		setProtocol(protocol);
		setFlags(flags);
	}
	public Curl_handler() {
	}
	
	public Object getScheme() {
		return scheme;
	}
	public void setScheme(Object newScheme) {
		scheme = newScheme;
	}
	public Object getSetup_connection() {
		return setup_connection;
	}
	public void setSetup_connection(Object newSetup_connection) {
		setup_connection = newSetup_connection;
	}
	public Object getDo_it() {
		return do_it;
	}
	public void setDo_it(Object newDo_it) {
		do_it = newDo_it;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
	public Object getDo_more() {
		return do_more;
	}
	public void setDo_more(Object newDo_more) {
		do_more = newDo_more;
	}
	public Object getConnect_it() {
		return connect_it;
	}
	public void setConnect_it(Object newConnect_it) {
		connect_it = newConnect_it;
	}
	public Object getConnecting() {
		return connecting;
	}
	public void setConnecting(Object newConnecting) {
		connecting = newConnecting;
	}
	public Object getDoing() {
		return doing;
	}
	public void setDoing(Object newDoing) {
		doing = newDoing;
	}
	public Object getProto_getsock() {
		return proto_getsock;
	}
	public void setProto_getsock(Object newProto_getsock) {
		proto_getsock = newProto_getsock;
	}
	public Object getDoing_getsock() {
		return doing_getsock;
	}
	public void setDoing_getsock(Object newDoing_getsock) {
		doing_getsock = newDoing_getsock;
	}
	public Object getDomore_getsock() {
		return domore_getsock;
	}
	public void setDomore_getsock(Object newDomore_getsock) {
		domore_getsock = newDomore_getsock;
	}
	public Object getPerform_getsock() {
		return perform_getsock;
	}
	public void setPerform_getsock(Object newPerform_getsock) {
		perform_getsock = newPerform_getsock;
	}
	public Object getDisconnect() {
		return disconnect;
	}
	public void setDisconnect(Object newDisconnect) {
		disconnect = newDisconnect;
	}
	public Object getReadwrite() {
		return readwrite;
	}
	public void setReadwrite(Object newReadwrite) {
		readwrite = newReadwrite;
	}
	public Object getConnection_check() {
		return connection_check;
	}
	public void setConnection_check(Object newConnection_check) {
		connection_check = newConnection_check;
	}
	public long getDefport() {
		return defport;
	}
	public void setDefport(long newDefport) {
		defport = newDefport;
	}
	public int getProtocol() {
		return protocol;
	}
	public void setProtocol(int newProtocol) {
		protocol = newProtocol;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
