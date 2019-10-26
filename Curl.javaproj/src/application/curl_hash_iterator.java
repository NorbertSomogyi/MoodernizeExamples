package application;

public class curl_hash_iterator {
	private curl_hash hash;
	private int slot_index;
	private curl_llist_element current_element;
	
	public curl_hash_iterator(curl_hash hash, int slot_index, curl_llist_element current_element) {
		setHash(hash);
		setSlot_index(slot_index);
		setCurrent_element(current_element);
	}
	public curl_hash_iterator() {
	}
	
	public curl_hash getHash() {
		return hash;
	}
	public void setHash(curl_hash newHash) {
		hash = newHash;
	}
	public int getSlot_index() {
		return slot_index;
	}
	public void setSlot_index(int newSlot_index) {
		slot_index = newSlot_index;
	}
	public curl_llist_element getCurrent_element() {
		return current_element;
	}
	public void setCurrent_element(curl_llist_element newCurrent_element) {
		current_element = newCurrent_element;
	}
}
