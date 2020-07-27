package application;

public class mf_hashitem_S {
	private mf_hashitem_S mhi_next;
	private mf_hashitem_S mhi_prev;
	private Object mhi_key;
	
	public mf_hashitem_S(mf_hashitem_S mhi_next, mf_hashitem_S mhi_prev, Object mhi_key) {
		setMhi_next(mhi_next);
		setMhi_prev(mhi_prev);
		setMhi_key(mhi_key);
	}
	public mf_hashitem_S() {
	}
	
	public mf_hashitem_S mf_hash_find(mf_hashtab_S mht, Object key) {
		mf_hashitem_T mhi = new mf_hashitem_T();
		mf_hashitem_S[][] generatedMht_buckets = mht.getMht_buckets();
		Object generatedMht_mask = mht.getMht_mask();
		mhi = generatedMht_buckets[key & generatedMht_mask];
		Object generatedMhi_key = mhi.getMhi_key();
		mf_hashitem_S generatedMhi_next = mhi.getMhi_next();
		while (mhi != ((Object)0) && generatedMhi_key != key) {
			mhi = generatedMhi_next;
		}
		return mhi/*
		 * Add item "mhi" to hashtable "mht".
		 * "mhi" must not be NULL.
		 */;
	}
	public mf_hashitem_S getMhi_next() {
		return mhi_next;
	}
	public void setMhi_next(mf_hashitem_S newMhi_next) {
		mhi_next = newMhi_next;
	}
	public mf_hashitem_S getMhi_prev() {
		return mhi_prev;
	}
	public void setMhi_prev(mf_hashitem_S newMhi_prev) {
		mhi_prev = newMhi_prev;
	}
	public Object getMhi_key() {
		return mhi_key;
	}
	public void setMhi_key(Object newMhi_key) {
		mhi_key = newMhi_key;
	}
}
