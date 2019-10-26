package application;

public class files_transaction_backend_data {
	private ref_transaction packed_transaction;
	private int packed_refs_locked;
	
	public files_transaction_backend_data(ref_transaction packed_transaction, int packed_refs_locked) {
		setPacked_transaction(packed_transaction);
		setPacked_refs_locked(packed_refs_locked);
	}
	public files_transaction_backend_data() {
	}
	
	public ref_transaction getPacked_transaction() {
		return packed_transaction;
	}
	public void setPacked_transaction(ref_transaction newPacked_transaction) {
		packed_transaction = newPacked_transaction;
	}
	public int getPacked_refs_locked() {
		return packed_refs_locked;
	}
	public void setPacked_refs_locked(int newPacked_refs_locked) {
		packed_refs_locked = newPacked_refs_locked;
	}
}
