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
	
	public void bundle_destroy() {
		if (!cb_ptr) {
			return /*Error: Unsupported expression*/;
		} 
		curl_llist generatedConn_list = this.getConn_list();
		generatedConn_list.Curl_llist_destroy(((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(cb_ptr);
	}
	public connectbundle Curl_conncache_find_bundle(connectdata conn, conncache connc, Object hostp) {
		connectbundle bundle = ((Object)0);
		Curl_easy generatedData = conn.getData();
		Curl_share generatedShare = (generatedData).getShare();
		if (generatedShare) {
			(generatedData).Curl_share_lock(CURL_LOCK_DATA_CONNECT, CURL_LOCK_ACCESS_SINGLE);
		} 
		curl_hash generatedHash = connc.getHash();
		if (connc) {
			byte[] key = new byte[128];
			conn.hashkey(key, /*Error: sizeof expression not supported yet*/, hostp);
			bundle = generatedHash.Curl_hash_pick(key, /*Error: Function owner not recognized*/strlen(key));
		} 
		return bundle;
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
