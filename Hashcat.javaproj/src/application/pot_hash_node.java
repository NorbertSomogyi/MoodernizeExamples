package application;

// this is a linked list structure of all the hashes with the same "key" (hash or hash + salt)
public class pot_hash_node {
	private hash hash_buf;
	private pot_hash_node next;
	
	public pot_hash_node(hash hash_buf, pot_hash_node next) {
		setHash_buf(hash_buf);
		setNext(next);
	}
	public pot_hash_node() {
	}
	
	public hash getHash_buf() {
		return hash_buf;
	}
	public void setHash_buf(hash newHash_buf) {
		hash_buf = newHash_buf;
	}
	public pot_hash_node getNext() {
		return next;
	}
	public void setNext(pot_hash_node newNext) {
		next = newNext;
	}
}
// Attention: this is only used when --show and --username are used together
