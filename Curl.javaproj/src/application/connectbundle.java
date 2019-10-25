package application;

/* initial value */
/* return the correct bundle, to a host or a proxy */
public class connectbundle {
	private int multiuse;
	private Object num_connections;
	private curl_llist conn_list;
	
	public connectbundle(int multiuse, Object num_connections, curl_llist conn_list) {
		setMultiuse(multiuse);
		setNum_connections(num_connections);
		setConn_list(conn_list);
	}
	public connectbundle() {
	}
	
	public int getMultiuse() {
		return multiuse;
	}
	public void setMultiuse(int newMultiuse) {
		multiuse = newMultiuse;
	}
	public Object getNum_connections() {
		return num_connections;
	}
	public void setNum_connections(Object newNum_connections) {
		num_connections = newNum_connections;
	}
	public curl_llist getConn_list() {
		return conn_list;
	}
	public void setConn_list(curl_llist newConn_list) {
		conn_list = newConn_list;
	}
}
