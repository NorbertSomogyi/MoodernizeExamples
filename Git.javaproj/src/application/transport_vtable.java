package application;

public class transport_vtable {
	private Object set_option;
	private Object get_refs_list;
	private Object fetch;
	private Object push_refs;
	private Object connect;
	private Object disconnect;
	
	public transport_vtable(Object set_option, Object get_refs_list, Object fetch, Object push_refs, Object connect, Object disconnect) {
		setSet_option(set_option);
		setGet_refs_list(get_refs_list);
		setFetch(fetch);
		setPush_refs(push_refs);
		setConnect(connect);
		setDisconnect(disconnect);
	}
	public transport_vtable() {
	}
	
	public Object getSet_option() {
		return set_option;
	}
	public void setSet_option(Object newSet_option) {
		set_option = newSet_option;
	}
	public Object getGet_refs_list() {
		return get_refs_list;
	}
	public void setGet_refs_list(Object newGet_refs_list) {
		get_refs_list = newGet_refs_list;
	}
	public Object getFetch() {
		return fetch;
	}
	public void setFetch(Object newFetch) {
		fetch = newFetch;
	}
	public Object getPush_refs() {
		return push_refs;
	}
	public void setPush_refs(Object newPush_refs) {
		push_refs = newPush_refs;
	}
	public Object getConnect() {
		return connect;
	}
	public void setConnect(Object newConnect) {
		connect = newConnect;
	}
	public Object getDisconnect() {
		return disconnect;
	}
	public void setDisconnect(Object newDisconnect) {
		disconnect = newDisconnect;
	}
}
/**
	 * Returns 0 if successful, positive if the option is not
	 * recognized or is inapplicable, and negative if the option
	 * is applicable but the value is invalid.
	 **/
