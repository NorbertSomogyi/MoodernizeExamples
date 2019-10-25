package application;

public class curl_hash_iterator {
	private Object hash;
	private int slot_index;
	private Object current_element;
	
	public curl_hash_iterator(Object hash, int slot_index, Object current_element) {
		setHash(hash);
		setSlot_index(slot_index);
		setCurrent_element(current_element);
	}
	public curl_hash_iterator() {
	}
	
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public int getSlot_index() {
		return slot_index;
	}
	public void setSlot_index(int newSlot_index) {
		slot_index = newSlot_index;
	}
	public Object getCurrent_element() {
		return current_element;
	}
	public void setCurrent_element(Object newCurrent_element) {
		current_element = newCurrent_element;
	}
}
