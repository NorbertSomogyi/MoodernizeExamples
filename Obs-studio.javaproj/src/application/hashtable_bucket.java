package application;

public class hashtable_bucket {
	private hashtable_list first;
	private hashtable_list last;
	
	public hashtable_bucket(hashtable_list first, hashtable_list last) {
		setFirst(first);
		setLast(last);
	}
	public hashtable_bucket() {
	}
	
	public hashtable_list getFirst() {
		return first;
	}
	public void setFirst(hashtable_list newFirst) {
		first = newFirst;
	}
	public hashtable_list getLast() {
		return last;
	}
	public void setLast(hashtable_list newLast) {
		last = newLast;
	}
}
