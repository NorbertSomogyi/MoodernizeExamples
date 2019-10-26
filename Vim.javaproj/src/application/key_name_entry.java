package application;

public class key_name_entry {
	private int key;
	private Object name;
	
	public key_name_entry(int key, Object name) {
		setKey(key);
		setName(name);
	}
	public key_name_entry() {
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int newKey) {
		key = newKey;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
