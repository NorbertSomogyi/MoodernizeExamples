package application;

public class mf_hashtab_S {
	private Object mht_mask;
	private Object mht_count;
	private mf_hashitem_S mht_buckets;
	private Object mht_small_buckets;
	private byte mht_fixed;
	
	public mf_hashtab_S(Object mht_mask, Object mht_count, mf_hashitem_S mht_buckets, Object mht_small_buckets, byte mht_fixed) {
		setMht_mask(mht_mask);
		setMht_count(mht_count);
		setMht_buckets(mht_buckets);
		setMht_small_buckets(mht_small_buckets);
		setMht_fixed(mht_fixed);
	}
	public mf_hashtab_S() {
	}
	
	/*
	 * The number of buckets in the hashtable is increased by a factor of
	 * MHT_GROWTH_FACTOR when the average number of items per bucket
	 * exceeds 2 ^ MHT_LOG_LOAD_FACTOR.
	 */
	/* must be a power of two */
	/*
	 * Initialize an empty hash table.
	 */
	public void mf_hash_init() {
		.memset((mht), (false), ());
		Object generatedMht_small_buckets = this.getMht_small_buckets();
		this.setMht_buckets(generatedMht_small_buckets);
		this.setMht_mask(64 - 1/*
		 * Free the array of a hash table.  Does not free the items it contains!
		 * The hash table must not be used again without another mf_hash_init() call.
		 */);
	}
	public void mf_hash_free() {
		mf_hashitem_S generatedMht_buckets = this.getMht_buckets();
		Object generatedMht_small_buckets = this.getMht_small_buckets();
		if (generatedMht_buckets != generatedMht_small_buckets) {
			ModernizedCProgram.vim_free(generatedMht_buckets);
		} 
	}
	public void mf_hash_free_all() {
		long_u idx = new long_u();
		mf_hashitem_T mhi = new mf_hashitem_T();
		mf_hashitem_T next = new mf_hashitem_T();
		Object generatedMht_mask = this.getMht_mask();
		mf_hashitem_S generatedMhi_next = mhi.getMhi_next();
		mf_hashitem_S generatedMht_buckets = this.getMht_buckets();
		for (idx = 0; idx <= generatedMht_mask; idx++) {
			for (mhi = generatedMht_buckets[idx]; mhi != ((Object)0); mhi = next) {
				next = generatedMhi_next;
				ModernizedCProgram.vim_free(mhi);
			}
		}
		mht/*
		 * Find "key" in hashtable "mht".
		 * Returns a pointer to a mf_hashitem_T or NULL if the item was not found.
		 */.mf_hash_free();
	}
	public int mf_hash_grow() {
		long_u i = new long_u();
		long_u j = new long_u();
		int shift;
		mf_hashitem_T mhi = new mf_hashitem_T();
		mf_hashitem_T[] tails = new mf_hashitem_T();
		mf_hashitem_T buckets = new mf_hashitem_T();
		size_t size = new size_t();
		Object generatedMht_mask = this.getMht_mask();
		size = (generatedMht_mask + 1) * 2 * ;
		buckets = ModernizedCProgram.lalloc_clear(size, 0);
		if (buckets == ((Object)0)) {
			return 0;
		} 
		shift = 0;
		while ((generatedMht_mask >> shift) != 0) {
			shift++;
		}
		Object generatedMhi_key = mhi.getMhi_key();
		mf_hashitem_S generatedMhi_next = mhi.getMhi_next();
		mf_hashitem_S generatedMht_buckets = this.getMht_buckets();
		for (i = 0; i <= generatedMht_mask; i/*
			 * Traverse the items in the i-th original bucket and move them into
			 * MHT_GROWTH_FACTOR new buckets, preserving their relative order
			 * within each new bucket.  Preserving the order is important because
			 * mf_get() tries to keep most recently used items at the front of
			 * each bucket.
			 *
			 * Here we strongly rely on the fact the hashes are computed modulo
			 * a power of two.
			 */++) {
			.memset((tails), (false), ());
			for (mhi = generatedMht_buckets[i]; mhi != ((Object)0); mhi = generatedMhi_next) {
				j = (generatedMhi_key >> shift) & (2 - 1);
				if (tails[j] == ((Object)0)) {
					buckets[i + (j << shift)] = mhi;
					tails[j] = mhi;
					mhi.setMhi_prev(((Object)0));
				} else {
						tails[j].setMhi_next(mhi);
						mhi.setMhi_prev(tails[j]);
						tails[j] = mhi;
				} 
			}
			for (j = 0; j < 2; j++) {
				if (tails[j] != ((Object)0)) {
					tails[j].setMhi_next(((Object)0));
				} 
			}
		}
		Object generatedMht_small_buckets = this.getMht_small_buckets();
		if (generatedMht_buckets != generatedMht_small_buckets) {
			ModernizedCProgram.vim_free(generatedMht_buckets);
		} 
		this.setMht_buckets(buckets);
		this.setMht_mask((generatedMht_mask + 1) * 2 - 1);
		return 1;
	}
	/*
	 * The functions for using a memfile:
	 *
	 * mf_open()	    open a new or existing memfile
	 * mf_open_file()   open a swap file for an existing memfile
	 * mf_close()	    close (and delete) a memfile
	 * mf_new()	    create a new block in a memfile and lock it
	 * mf_get()	    get an existing block and lock it
	 * mf_put()	    unlock a block, may be marked for writing
	 * mf_free()	    remove a block
	 * mf_sync()	    sync changed parts of memfile to disk
	 * mf_release_all() release as much memory as possible
	 * mf_trans_del()   may translate negative to positive block number
	 * mf_fullname()    make file name full path (use before first :cd)
	 */
	public Object getMht_mask() {
		return mht_mask;
	}
	public void setMht_mask(Object newMht_mask) {
		mht_mask = newMht_mask;
	}
	public Object getMht_count() {
		return mht_count;
	}
	public void setMht_count(Object newMht_count) {
		mht_count = newMht_count;
	}
	public mf_hashitem_S getMht_buckets() {
		return mht_buckets;
	}
	public void setMht_buckets(mf_hashitem_S newMht_buckets) {
		mht_buckets = newMht_buckets;
	}
	public Object getMht_small_buckets() {
		return mht_small_buckets;
	}
	public void setMht_small_buckets(Object newMht_small_buckets) {
		mht_small_buckets = newMht_small_buckets;
	}
	public byte getMht_fixed() {
		return mht_fixed;
	}
	public void setMht_fixed(byte newMht_fixed) {
		mht_fixed = newMht_fixed;
	}
}
