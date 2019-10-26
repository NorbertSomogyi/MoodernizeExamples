package application;

public class packed_transaction_backend_data {
	private int own_lock;
	private string_list updates;
	
	public packed_transaction_backend_data(int own_lock, string_list updates) {
		setOwn_lock(own_lock);
		setUpdates(updates);
	}
	public packed_transaction_backend_data() {
	}
	
	public int getOwn_lock() {
		return own_lock;
	}
	public void setOwn_lock(int newOwn_lock) {
		own_lock = newOwn_lock;
	}
	public string_list getUpdates() {
		return updates;
	}
	public void setUpdates(string_list newUpdates) {
		updates = newUpdates;
	}
}
/* True iff the transaction owns the packed-refs lock. */
