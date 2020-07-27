package application;

public class memfile {
	private Object mf_fname;
	private Object mf_ffname;
	private int mf_fd;
	private int mf_flags;
	private int mf_reopen;
	private block_hdr mf_free_first;
	private block_hdr mf_used_first;
	private block_hdr mf_used_last;
	private int mf_used_count;
	private int mf_used_count_max;
	private mf_hashtab_S mf_hash;
	private mf_hashtab_S mf_trans;
	private Object mf_blocknr_max;
	private Object mf_blocknr_min;
	private Object mf_neg_count;
	private Object mf_infile_count;
	private int mf_page_size;
	private int mf_dirty;
	
	public memfile(Object mf_fname, Object mf_ffname, int mf_fd, int mf_flags, int mf_reopen, block_hdr mf_free_first, block_hdr mf_used_first, block_hdr mf_used_last, int mf_used_count, int mf_used_count_max, mf_hashtab_S mf_hash, mf_hashtab_S mf_trans, Object mf_blocknr_max, Object mf_blocknr_min, Object mf_neg_count, Object mf_infile_count, int mf_page_size, int mf_dirty) {
		setMf_fname(mf_fname);
		setMf_ffname(mf_ffname);
		setMf_fd(mf_fd);
		setMf_flags(mf_flags);
		setMf_reopen(mf_reopen);
		setMf_free_first(mf_free_first);
		setMf_used_first(mf_used_first);
		setMf_used_last(mf_used_last);
		setMf_used_count(mf_used_count);
		setMf_used_count_max(mf_used_count_max);
		setMf_hash(mf_hash);
		setMf_trans(mf_trans);
		setMf_blocknr_max(mf_blocknr_max);
		setMf_blocknr_min(mf_blocknr_min);
		setMf_neg_count(mf_neg_count);
		setMf_infile_count(mf_infile_count);
		setMf_page_size(mf_page_size);
		setMf_dirty(mf_dirty);
	}
	public memfile() {
	}
	
	public Object ml_encrypt_data(Object data, Object offset, int size) {
		DATA_BL dp = (DATA_BL)data;
		char_u head_end = new char_u();
		char_u text_start = new char_u();
		char_u new_data = new char_u();
		int text_len;
		cryptstate_T state = new cryptstate_T();
		Object generatedDb_id = dp.getDb_id();
		if (generatedDb_id != (((byte)'d' << 8) + (byte)'a')) {
			return data;
		} 
		state = mfp.ml_crypt_prepare(offset, 0);
		if (state == ((Object)0)) {
			return data;
		} 
		new_data = ModernizedCProgram.alloc(size);
		if (new_data == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedDb_index = dp.getDb_index();
		Object generatedDb_line_count = dp.getDb_line_count();
		head_end = (char_u)(generatedDb_index[generatedDb_line_count]);
		int generatedDb_txt_start = dp.getDb_txt_start();
		text_start = (char_u)dp + generatedDb_txt_start;
		text_len = size - generatedDb_txt_start;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(new_data), (byte)(dp), (size_t)(head_end - (char_u)/* Copy the header and the text. */dp));
		state.crypt_encode(text_start, text_len, new_data + generatedDb_txt_start);
		state.crypt_free_state();
		if (head_end < /* Clear the gap. */text_start) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((new_data + (head_end - data)), (false), (text_start - head_end));
		} 
		return new_data/*
		 * Decrypt the text in "data" if it points to an encrypted data block.
		 */;
	}
	public void ml_decrypt_data(Object data, Object offset, int size) {
		DATA_BL dp = (DATA_BL)data;
		char_u head_end = new char_u();
		char_u text_start = new char_u();
		int text_len;
		cryptstate_T state = new cryptstate_T();
		Object generatedDb_id = dp.getDb_id();
		Object generatedDb_index = dp.getDb_index();
		Object generatedDb_line_count = dp.getDb_line_count();
		int generatedDb_txt_start = dp.getDb_txt_start();
		int generatedDb_txt_end = dp.getDb_txt_end();
		if (generatedDb_id == (((byte)'d' << 8) + (byte)'a')) {
			head_end = (char_u)(generatedDb_index[generatedDb_line_count]);
			text_start = (char_u)dp + generatedDb_txt_start;
			text_len = generatedDb_txt_end - generatedDb_txt_start;
			if (head_end > text_start || generatedDb_txt_start > size || generatedDb_txt_end > size) {
				return /*Error: Unsupported expression*/;
			} 
			state = mfp.ml_crypt_prepare(offset, 1);
			if (state != ((Object)0)) {
				state.crypt_decode_inplace(text_start, /* Decrypt the text in place. */text_len);
				state/*
				 * Prepare for encryption/decryption, using the key, seed and offset.
				 * Return an allocated cryptstate_T *.
				 */.crypt_free_state();
			} 
		} 
	}
	public  ml_crypt_prepare(Object offset, int reading) {
		Object generatedMf_buffer = this.getMf_buffer();
		buf_T buf = generatedMf_buffer;
		char_u[] salt = new char_u();
		int method_nr;
		char_u key = new char_u();
		char_u seed = new char_u();
		Object generatedMf_old_key = this.getMf_old_key();
		Object generatedMf_old_cm = this.getMf_old_cm();
		Object generatedMf_old_seed = this.getMf_old_seed();
		Object generatedB_p_key = buf.getB_p_key();
		Object generatedMf_seed = this.getMf_seed();
		if (reading && generatedMf_old_key != ((Object)0)) {
			method_nr = generatedMf_old_cm;
			key = generatedMf_old_key;
			seed = generatedMf_old_seed;
		} else {
				method_nr = buf.crypt_get_method_nr();
				key = generatedB_p_key;
				seed = generatedMf_seed;
		} 
		if (key == (byte)'\000') {
			return ((Object)0);
		} 
		if (method_nr == 0) {
			ModernizedCProgram.vim_snprintf((byte)salt, /*Error: sizeof expression not supported yet*/, "%s%ld", key, (long)/* For PKzip: Append the offset to the key, so that we use a different
				 * key for every block. */offset);
			return ModernizedCProgram.crypt_create(method_nr, salt, ((Object)0), 0, ((Object)0), 0);
		} 
		ModernizedCProgram.vim_snprintf((byte)salt, /*Error: sizeof expression not supported yet*/, "%ld", (long)/* Using blowfish or better: add salt and seed. We use the byte offset
		     * of the block for the salt. */offset);
		return ModernizedCProgram.crypt_create(method_nr, key, salt, (int)/*Error: Function owner not recognized*/strlen((byte)(salt)), seed, 8);
	}
	/*
	 * Open an existing or new memory block file.
	 *
	 *  fname:	name of file to use (NULL means no file at all)
	 *		Note: fname must have been allocated, it is not copied!
	 *			If opening the file fails, fname is freed.
	 *  flags:	flags for open() call
	 *
	 *  If fname != NULL and file cannot be opened, fail.
	 *
	 * return value: identifier for this memory block file.
	 */
	public memfile mf_open(Object fname, int flags) {
		memfile_T mfp = new memfile_T();
		off_T size = new off_T();
		if ((mfp = (memfile_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/)) == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedMf_fd = mfp.getMf_fd();
		if (fname == ((Object)/* no file for this memfile, use memory only */0)) {
			mfp.setMf_fname(((Object)0));
			mfp.setMf_ffname(((Object)0));
			mfp.setMf_fd(-1);
		} else {
				mfp.mf_do_open(fname, /* try to open the file */flags);
				if (generatedMf_fd < /* if the file cannot be opened, return here */0) {
					ModernizedCProgram.vim_free(mfp);
					return ((Object)0);
				} 
		} 
		mfp.setMf_free_first(((Object)/* free list is empty */0));
		mfp.setMf_used_first(((Object)/* used list is empty */0));
		mfp.setMf_used_last(((Object)0));
		mfp.setMf_dirty(0);
		mfp.setMf_used_count(0);
		mf_hashtab_S generatedMf_hash = mfp.getMf_hash();
		generatedMf_hash.mf_hash_init();
		mf_hashtab_S generatedMf_trans = mfp.getMf_trans();
		generatedMf_trans.mf_hash_init();
		mfp.setMf_page_size(4096);
		mfp.setMf_old_key(((Object)0/*
		     * Try to set the page size equal to the block size of the device.
		     * Speeds up I/O a lot.
		     * When recovering, the actual block size will be retrieved from block 0
		     * in ml_recover().  The size used here may be wrong, therefore
		     * mf_blocknr_max must be rounded up.
		     */));
		int generatedMf_page_size = mfp.getMf_page_size();
		if (generatedMf_fd < 0 || (flags & (-1024 | -1024)) || (size = /*Error: Function owner not recognized*/lseek64(generatedMf_fd, (off_T)-1024, 2)) <= 0) {
			mfp.setMf_blocknr_max(/* no file or empty file */0);
		} else {
				mfp.setMf_blocknr_max((blocknr_T)((size + generatedMf_page_size - 1) / generatedMf_page_size));
		} 
		mfp.setMf_blocknr_min(-1);
		mfp.setMf_neg_count(0);
		Object generatedMf_blocknr_max = mfp.getMf_blocknr_max();
		mfp.setMf_infile_count(generatedMf_blocknr_max);
		int generatedMf_used_count_max = mfp.getMf_used_count_max();
		{ 
			int shift = 10;
			int page_size = generatedMf_page_size;
			while (shift > 0 && (page_size & 1) == 0) {
				page_size = page_size >> 1;
				--shift;
			}
			mfp.setMf_used_count_max((ModernizedCProgram.p_mm << shift) / page_size);
			if (generatedMf_used_count_max < 10) {
				mfp.setMf_used_count_max(10);
			} 
		}
		return mfp/*
		 * Open a file for an existing memfile.  Used when updatecount set from 0 to
		 * some value.
		 * If the file already exists, this fails.
		 * "fname" is the name of file to use (NULL means no file at all)
		 * Note: "fname" must have been allocated, it is not copied!  If opening the
		 * file fails, "fname" is freed.
		 *
		 * return value: FAIL if file could not be opened, OK otherwise
		 */;
	}
	public int mf_open_file(Object fname) {
		mfp.mf_do_open(fname, 2 | -1024 | /* try to open the file */-1024);
		int generatedMf_fd = this.getMf_fd();
		if (generatedMf_fd < 0) {
			return 0;
		} 
		this.setMf_dirty(1);
		return 1/*
		 * Close a memory file and delete the associated file if 'del_file' is TRUE.
		 */;
	}
	public void mf_close(int del_file) {
		bhdr_T hp = new bhdr_T();
		bhdr_T nextp = new bhdr_T();
		if (mfp == ((Object)/* safety check */0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedMf_fd = this.getMf_fd();
		if (generatedMf_fd >= 0) {
			if (/*Error: Function owner not recognized*/close(generatedMf_fd) < 0) {
				ModernizedCProgram.emsg(((byte)(e_swapclose)));
			} 
		} 
		Object generatedMf_fname = this.getMf_fname();
		if (del_file && generatedMf_fname != ((Object)0)) {
			ModernizedCProgram.mch_remove(generatedMf_fname);
		} 
		int generatedBh_page_count = hp.getBh_page_count();
		int generatedMf_page_size = this.getMf_page_size();
		block_hdr generatedBh_next = hp.getBh_next();
		block_hdr generatedMf_used_first = this.getMf_used_first();
		for (hp = generatedMf_used_first; hp != ((Object)0); hp = /* free entries in used list */nextp) {
			ModernizedCProgram.total_mem_used -= generatedBh_page_count * generatedMf_page_size;
			nextp = generatedBh_next;
			hp.mf_free_bhdr();
		}
		block_hdr generatedMf_free_first = this.getMf_free_first();
		block_hdr block_hdr = new block_hdr();
		while (generatedMf_free_first != ((Object)/* free entries in free list */0)) {
			ModernizedCProgram.vim_free(block_hdr.mf_rem_free(mfp));
		}
		mf_hashtab_S generatedMf_hash = this.getMf_hash();
		generatedMf_hash.mf_hash_free();
		mf_hashtab_S generatedMf_trans = this.getMf_trans();
		generatedMf_trans.mf_hash_free_all();
		ModernizedCProgram.vim_free(generatedMf_fname);
		Object generatedMf_ffname = this.getMf_ffname();
		ModernizedCProgram.vim_free(generatedMf_ffname);
		ModernizedCProgram.vim_free(mfp/*
		 * Close the swap file for a memfile.  Used when 'swapfile' is reset.
		 */);
	}
	public void mf_new_page_size(int new_size) {
		int generatedMf_page_size = this.getMf_page_size();
		ModernizedCProgram.total_mem_used += new_size - generatedMf_page_size;
		this.setMf_page_size(new_size/*
		 * get a new block
		 *
		 *   negative: TRUE if negative block number desired (data block)
		 */);
	}
	/*
	 * Sync the memory file *mfp to disk.
	 * Flags:
	 *  MFS_ALL	If not given, blocks with negative numbers are not synced,
	 *		even when they are dirty!
	 *  MFS_STOP	Stop syncing when a character becomes available, but sync at
	 *		least one block.
	 *  MFS_FLUSH	Make sure buffers are flushed to disk, so they will survive a
	 *		system crash.
	 *  MFS_ZERO	Only write block 0.
	 *
	 * Return FAIL for failure, OK otherwise
	 */
	public int mf_sync(int flags) {
		int status;
		bhdr_T hp = new bhdr_T();
		int got_int_save = got_int;
		int generatedMf_fd = this.getMf_fd();
		if (generatedMf_fd < /* there is no file, nothing to do */0) {
			this.setMf_dirty(0);
			return 0;
		} 
		got_int = /* Only a CTRL-C while writing will break us here, not one typed
		     * previously. */0/*
		     * sync from last to first (may reduce the probability of an inconsistent
		     * file) If a write fails, it is very likely caused by a full filesystem.
		     * Then we only try to write blocks within the existing file. If that also
		     * fails then we give up.
		     */;
		status = 1;
		mf_hashitem_S generatedBh_hashitem = hp.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		byte generatedBh_flags = hp.getBh_flags();
		Object generatedMf_infile_count = this.getMf_infile_count();
		block_hdr generatedBh_prev = hp.getBh_prev();
		block_hdr generatedMf_used_last = this.getMf_used_last();
		for (hp = generatedMf_used_last; hp != ((Object)0); hp = generatedBh_prev) {
			if (((flags & 1) || generatedMhi_key >= 0) && (generatedBh_flags & 1) && (status == 1 || (generatedMhi_key >= 0 && generatedMhi_key < generatedMf_infile_count))) {
				if ((flags & 8) && generatedMhi_key != 0) {
					continue;
				} 
				if (ModernizedCProgram.mf_write(mfp, hp) == 0) {
					if (status == /* double error: quit syncing */0) {
						break;
					} 
					status = 0;
				} 
				if (flags & 2) {
					if (ModernizedCProgram.ui_char_avail()) {
						break;
					} 
				} else {
						ModernizedCProgram.ui_breakcheck();
				} 
				if (got_int) {
					break;
				} 
			} 
		}
		if (hp == ((Object)0) || status == 0) {
			this.setMf_dirty(0);
		} 
		if ((flags & 4) && ModernizedCProgram.p_sws != (byte)'\000'/*
			 * most Unixes have the very useful fsync() function, just what we need.
			 *//* OpenNT is strictly POSIX (Benzinger) *//* Tandem/Himalaya NSK-OSS doesn't have sync() */) {
			if (/*Error: Function owner not recognized*/_commit(generatedMf_fd)) {
				status = 0;
			} 
		} 
		/* Have function (in libnix at least),
			     * but ain't got no prototype anywhere. *//* assume Manx *//* Have function (in libnix at least),
			     * but ain't got no prototype anywhere. *//* assume Manx */got_int |=  /* AMIGA */got_int_save;
		return status/*
		 * For all blocks in memory file *mfp that have a positive block number set
		 * the dirty flag.  These are blocks that need to be written to a newly
		 * created swapfile.
		 */;
	}
	public void mf_set_dirty() {
		bhdr_T hp = new bhdr_T();
		mf_hashitem_S generatedBh_hashitem = hp.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		byte generatedBh_flags = hp.getBh_flags();
		block_hdr generatedBh_prev = hp.getBh_prev();
		block_hdr generatedMf_used_last = this.getMf_used_last();
		for (hp = generatedMf_used_last; hp != ((Object)0); hp = generatedBh_prev) {
			if (generatedMhi_key > 0) {
				generatedBh_flags |=  1;
			} 
		}
		this.setMf_dirty(1/*
		 * insert block *hp in front of hashlist of memfile *mfp
		 */);
	}
	public Object mf_trans_del(Object old_nr) {
		NR_TRANS np = new NR_TRANS();
		blocknr_T new_bnum = new blocknr_T();
		mf_hashtab_S generatedMf_trans = this.getMf_trans();
		mf_hashitem_S mf_hashitem_S = new mf_hashitem_S();
		np = (NR_TRANS)mf_hashitem_S.mf_hash_find(generatedMf_trans, old_nr);
		if (np == ((Object)/* not found */0)) {
			return old_nr;
		} 
		Object generatedMf_neg_count = this.getMf_neg_count();
		generatedMf_neg_count--;
		Object generatedNt_new_bnum = np.getNt_new_bnum();
		new_bnum = generatedNt_new_bnum;
		ModernizedCProgram.mf_hash_rem_item(generatedMf_trans, (mf_hashitem_T)/* remove entry from the trans list */np);
		ModernizedCProgram.vim_free(np);
		return new_bnum/*
		 * Set mfp->mf_ffname according to mfp->mf_fname and some other things.
		 * Only called when creating or renaming the swapfile.	Either way it's a new
		 * name so we must work out the full path name.
		 */;
	}
	public void mf_set_ffname() {
		Object generatedMf_fname = this.getMf_fname();
		this.setMf_ffname(ModernizedCProgram.FullName_save(generatedMf_fname, 0/*
		 * Make the name of the file used for the memfile a full path.
		 * Used before doing a :cd
		 */));
	}
	public void mf_fullname() {
		Object generatedMf_fname = this.getMf_fname();
		Object generatedMf_ffname = this.getMf_ffname();
		if (mfp != ((Object)0) && generatedMf_fname != ((Object)0) && generatedMf_ffname != ((Object)0)) {
			ModernizedCProgram.vim_free(generatedMf_fname);
			this.setMf_fname(generatedMf_ffname);
			this.setMf_ffname(((Object)0/*
			 * return TRUE if there are any translations pending for 'mfp'
			 */));
		} 
	}
	public int mf_need_trans() {
		Object generatedMf_fname = this.getMf_fname();
		Object generatedMf_neg_count = this.getMf_neg_count();
		return (generatedMf_fname != ((Object)0) && generatedMf_neg_count > 0/*
		 * Open a swap file for a memfile.
		 * The "fname" must be in allocated memory, and is consumed (also when an
		 * error occurs).
		 */);
	}
	public void mf_do_open(Object fname, int flags) {
		this.setMf_fname(fname/*
		     * Get the full path name before the open, because this is
		     * not possible after the open on the Amiga.
		     * fname cannot be NameBuff, because it must have been allocated.
		     */);
		mfp/*
		     * A ":!cd e:xxx" may change the directory without us knowing, use the
		     * full pathname always.  Careful: This frees fname!
		     */.mf_set_ffname();
		mfp/*
		     * Extra security check: When creating a swap file it really shouldn't
		     * exist yet.  If there is a symbolic link, this is most likely an attack.
		     */.mf_fullname();
		Object generatedMf_fname = this.getMf_fname();
		{ 
			flags |=  0 | /*
				 * try to open the file
				 */0/* Prevent handle inheritance that cause problems with Cscope
				 * (swap file may not be deleted if cscope connection was open after
				 * the file) */;
			flags |=  -1024;
			this.setMf_flags(flags);
			this.setMf_fd(ModernizedCProgram.mch_open(((byte)generatedMf_fname), (flags), -1024 | -1024));
		}
		int generatedMf_fd = this.getMf_fd();
		Object generatedMf_ffname = this.getMf_ffname();
		if (generatedMf_fd < /*
		     * If the file cannot be opened, use memory only
		     */0) {
			do {
				if ((generatedMf_fname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedMf_fname);
					(generatedMf_fname) = ((Object)0);
				} 
			} while (0);
			do {
				if ((generatedMf_ffname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedMf_ffname);
					(generatedMf_ffname) = ((Object)0);
				} 
			} while (0);
		} else {
				ModernizedCProgram.mch_hide(generatedMf_fname);
		} 
	}
	/* flags for open() */
	public Object getMf_fname() {
		return mf_fname;
	}
	public void setMf_fname(Object newMf_fname) {
		mf_fname = newMf_fname;
	}
	public Object getMf_ffname() {
		return mf_ffname;
	}
	public void setMf_ffname(Object newMf_ffname) {
		mf_ffname = newMf_ffname;
	}
	public int getMf_fd() {
		return mf_fd;
	}
	public void setMf_fd(int newMf_fd) {
		mf_fd = newMf_fd;
	}
	public int getMf_flags() {
		return mf_flags;
	}
	public void setMf_flags(int newMf_flags) {
		mf_flags = newMf_flags;
	}
	public int getMf_reopen() {
		return mf_reopen;
	}
	public void setMf_reopen(int newMf_reopen) {
		mf_reopen = newMf_reopen;
	}
	public block_hdr getMf_free_first() {
		return mf_free_first;
	}
	public void setMf_free_first(block_hdr newMf_free_first) {
		mf_free_first = newMf_free_first;
	}
	public block_hdr getMf_used_first() {
		return mf_used_first;
	}
	public void setMf_used_first(block_hdr newMf_used_first) {
		mf_used_first = newMf_used_first;
	}
	public block_hdr getMf_used_last() {
		return mf_used_last;
	}
	public void setMf_used_last(block_hdr newMf_used_last) {
		mf_used_last = newMf_used_last;
	}
	public int getMf_used_count() {
		return mf_used_count;
	}
	public void setMf_used_count(int newMf_used_count) {
		mf_used_count = newMf_used_count;
	}
	public int getMf_used_count_max() {
		return mf_used_count_max;
	}
	public void setMf_used_count_max(int newMf_used_count_max) {
		mf_used_count_max = newMf_used_count_max;
	}
	public mf_hashtab_S getMf_hash() {
		return mf_hash;
	}
	public void setMf_hash(mf_hashtab_S newMf_hash) {
		mf_hash = newMf_hash;
	}
	public mf_hashtab_S getMf_trans() {
		return mf_trans;
	}
	public void setMf_trans(mf_hashtab_S newMf_trans) {
		mf_trans = newMf_trans;
	}
	public Object getMf_blocknr_max() {
		return mf_blocknr_max;
	}
	public void setMf_blocknr_max(Object newMf_blocknr_max) {
		mf_blocknr_max = newMf_blocknr_max;
	}
	public Object getMf_blocknr_min() {
		return mf_blocknr_min;
	}
	public void setMf_blocknr_min(Object newMf_blocknr_min) {
		mf_blocknr_min = newMf_blocknr_min;
	}
	public Object getMf_neg_count() {
		return mf_neg_count;
	}
	public void setMf_neg_count(Object newMf_neg_count) {
		mf_neg_count = newMf_neg_count;
	}
	public Object getMf_infile_count() {
		return mf_infile_count;
	}
	public void setMf_infile_count(Object newMf_infile_count) {
		mf_infile_count = newMf_infile_count;
	}
	public int getMf_page_size() {
		return mf_page_size;
	}
	public void setMf_page_size(int newMf_page_size) {
		mf_page_size = newMf_page_size;
	}
	public int getMf_dirty() {
		return mf_dirty;
	}
	public void setMf_dirty(int newMf_dirty) {
		mf_dirty = newMf_dirty;
	}
}
/*
 * mf_hashtab_T is a chained hashtable with blocknr_T key and arbitrary
 * structures as items.  This is an intrusive data structure: we require
 * that items begin with mf_hashitem_T which contains the key and linked
 * list pointers.  List of items in each bucket is doubly-linked.
 */
