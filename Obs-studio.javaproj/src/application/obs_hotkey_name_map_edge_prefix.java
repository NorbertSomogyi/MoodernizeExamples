package application;

public class obs_hotkey_name_map_edge_prefix {
	private Object prefix_len;
	private Byte prefix;
	
	public obs_hotkey_name_map_edge_prefix(Object prefix_len, Byte prefix) {
		setPrefix_len(prefix_len);
		setPrefix(prefix);
	}
	public obs_hotkey_name_map_edge_prefix() {
	}
	
	public Object getPrefix_len() {
		return prefix_len;
	}
	public void setPrefix_len(Object newPrefix_len) {
		prefix_len = newPrefix_len;
	}
	public Byte getPrefix() {
		return prefix;
	}
	public void setPrefix(Byte newPrefix) {
		prefix = newPrefix;
	}
}
