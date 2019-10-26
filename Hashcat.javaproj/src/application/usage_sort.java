package application;

public class usage_sort {
	private Object hash_mode;
	private Byte hash_name;
	private Object hash_category;
	
	public usage_sort(Object hash_mode, Byte hash_name, Object hash_category) {
		setHash_mode(hash_mode);
		setHash_name(hash_name);
		setHash_category(hash_category);
	}
	public usage_sort() {
	}
	
	public Object getHash_mode() {
		return hash_mode;
	}
	public void setHash_mode(Object newHash_mode) {
		hash_mode = newHash_mode;
	}
	public Byte getHash_name() {
		return hash_name;
	}
	public void setHash_name(Byte newHash_name) {
		hash_name = newHash_name;
	}
	public Object getHash_category() {
		return hash_category;
	}
	public void setHash_category(Object newHash_category) {
		hash_category = newHash_category;
	}
}
