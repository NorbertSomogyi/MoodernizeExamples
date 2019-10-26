package application;

public class config_set {
	private hashmap config_hash;
	private int hash_initialized;
	private configset_list list;
	
	public config_set(hashmap config_hash, int hash_initialized, configset_list list) {
		setConfig_hash(config_hash);
		setHash_initialized(hash_initialized);
		setList(list);
	}
	public config_set() {
	}
	
	public hashmap getConfig_hash() {
		return config_hash;
	}
	public void setConfig_hash(hashmap newConfig_hash) {
		config_hash = newConfig_hash;
	}
	public int getHash_initialized() {
		return hash_initialized;
	}
	public void setHash_initialized(int newHash_initialized) {
		hash_initialized = newHash_initialized;
	}
	public configset_list getList() {
		return list;
	}
	public void setList(configset_list newList) {
		list = newList;
	}
}
