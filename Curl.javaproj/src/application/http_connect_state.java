package application;

/* struct for HTTP CONNECT state data */
/* for HTTP CONNECT */
public class http_connect_state {
	private Object connect_buffer;
	private int perline;
	private int keepon;
	private Object line_start;
	private Object ptr;
	private Object cl;
	private  tunnel_state;
	private Object chunked_encoding;
	private Object close_connection;
	
	public http_connect_state(Object connect_buffer, int perline, int keepon, Object line_start, Object ptr, Object cl,  tunnel_state, Object chunked_encoding, Object close_connection) {
		setConnect_buffer(connect_buffer);
		setPerline(perline);
		setKeepon(keepon);
		setLine_start(line_start);
		setPtr(ptr);
		setCl(cl);
		setTunnel_state(tunnel_state);
		setChunked_encoding(chunked_encoding);
		setClose_connection(close_connection);
	}
	public http_connect_state() {
	}
	
	public Object getConnect_buffer() {
		return connect_buffer;
	}
	public void setConnect_buffer(Object newConnect_buffer) {
		connect_buffer = newConnect_buffer;
	}
	public int getPerline() {
		return perline;
	}
	public void setPerline(int newPerline) {
		perline = newPerline;
	}
	public int getKeepon() {
		return keepon;
	}
	public void setKeepon(int newKeepon) {
		keepon = newKeepon;
	}
	public Object getLine_start() {
		return line_start;
	}
	public void setLine_start(Object newLine_start) {
		line_start = newLine_start;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getCl() {
		return cl;
	}
	public void setCl(Object newCl) {
		cl = newCl;
	}
	public  getTunnel_state() {
		return tunnel_state;
	}
	public void setTunnel_state( newTunnel_state) {
		tunnel_state = newTunnel_state;
	}
	public Object getChunked_encoding() {
		return chunked_encoding;
	}
	public void setChunked_encoding(Object newChunked_encoding) {
		chunked_encoding = newChunked_encoding;
	}
	public Object getClose_connection() {
		return close_connection;
	}
	public void setClose_connection(Object newClose_connection) {
		close_connection = newClose_connection;
	}
}
