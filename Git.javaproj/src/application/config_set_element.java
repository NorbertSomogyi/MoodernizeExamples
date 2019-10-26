package application;

public class config_set_element {
	private hashmap_entry ent;
	private Byte key;
	private string_list value_list;
	
	public config_set_element(hashmap_entry ent, Byte key, string_list value_list) {
		setEnt(ent);
		setKey(key);
		setValue_list(value_list);
	}
	public config_set_element() {
	}
	
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public string_list getValue_list() {
		return value_list;
	}
	public void setValue_list(string_list newValue_list) {
		value_list = newValue_list;
	}
}
