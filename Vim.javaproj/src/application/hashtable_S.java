package application;

// Initial size for a hashtable.  Our items are relatively small and growing
// is expensive, thus use 16 as a start.  Must be a power of 2.
// This allows for storing 10 items (2/3 of 16) before a resize is needed.
public class hashtable_S {
	private Object ht_mask;
	private Object ht_used;
	private Object ht_filled;
	private int ht_locked;
	private int ht_error;
	private hashitem_S ht_array;
	private Object ht_smallarray;
	
	public hashtable_S(Object ht_mask, Object ht_used, Object ht_filled, int ht_locked, int ht_error, hashitem_S ht_array, Object ht_smallarray) {
		setHt_mask(ht_mask);
		setHt_used(ht_used);
		setHt_filled(ht_filled);
		setHt_locked(ht_locked);
		setHt_error(ht_error);
		setHt_array(ht_array);
		setHt_smallarray(ht_smallarray);
	}
	public hashtable_S() {
	}
	
	public void clear_ht_prop_types() {
		long todo;
		hashitem_T hi = new hashitem_T();
		if (ht == ((Object)0)) {
			return ;
		} 
		Object generatedHt_used = this.getHt_used();
		todo = (long)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				proptype_T prop = ((proptype_T)((generatedHi_key) - ((size_t)((proptype_T)0).getPt_name())));
				ModernizedCProgram.vim_free(prop);
				--todo;
			} 
		}
		ht.hash_clear();
		ModernizedCProgram.vim_free(ht/*
		 * Free all global property types.
		 */);
	}
	/*
	 * Initialize an empty hash table.
	 */
	public void hash_init() {
		.memset((ht), (false), (/* This zeroes all "ht_" entries and all the "hi_key" in "ht_smallarray". */));
		Object generatedHt_smallarray = this.getHt_smallarray();
		this.setHt_array(generatedHt_smallarray);
		this.setHt_mask(16 - 1/*
		 * Free the array of a hash table.  Does not free the items it contains!
		 * If "ht" is not freed then you should call hash_init() next!
		 */);
	}
	public void hash_clear() {
		hashitem_S generatedHt_array = this.getHt_array();
		Object generatedHt_smallarray = this.getHt_smallarray();
		if (generatedHt_array != generatedHt_smallarray) {
			ModernizedCProgram.vim_free(generatedHt_array);
		} 
	}
	public void hash_clear_all(int off) {
		long todo;
		hashitem_T hi = new hashitem_T();
		Object generatedHt_used = this.getHt_used();
		todo = (long)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				ModernizedCProgram.vim_free(generatedHi_key - off);
				--todo;
			} 
		}
		ht/*
		 * Find "key" in hashtable "ht".  "key" must not be NULL.
		 * Always returns a pointer to a hashitem.  If the item was not found then
		 * HASHITEM_EMPTY() is TRUE.  The pointer is then the place where the key
		 * would be added.
		 * WARNING: The returned pointer becomes invalid when the hashtable is changed
		 * (adding, setting or removing an item)!
		 */.hash_clear();
	}
	/*
	 * Add item with key "key" to hashtable "ht".
	 * Returns FAIL when out of memory or the key is already present.
	 */
	public int hash_add(Object key) {
		hash_T hash = ModernizedCProgram.hash_hash(key);
		hashitem_T hi = new hashitem_T();
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_lookup(ht, key, hash);
		Object generatedHi_key = (hi).getHi_key();
		if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			ModernizedCProgram.internal_error("hash_add()");
			return 0;
		} 
		return ModernizedCProgram.hash_add_item(ht, hi, key, hash/*
		 * Add item "hi" with "key" to hashtable "ht".  "key" must not be NULL and
		 * "hi" must have been obtained with hash_lookup() and point to an empty item.
		 * "hi" is invalid after this!
		 * Returns OK or FAIL (out of memory).
		 */);
	}
	public void hash_lock() {
		int generatedHt_locked = this.getHt_locked();
		++generatedHt_locked;
	}
	public void hash_lock_size(int size) {
		(Object)ht.hash_may_resize(size);
		int generatedHt_locked = this.getHt_locked();
		++generatedHt_locked;
	}
	public void hash_unlock() {
		int generatedHt_locked = this.getHt_locked();
		--generatedHt_locked;
		(Object)ht.hash_may_resize(0/*
		 * Shrink a hashtable when there is too much empty space.
		 * Grow a hashtable when there is not enough empty space.
		 * Returns OK or FAIL (out of memory).
		 */);
	}
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * hashtab.c: Handling of a hashtable with Vim-specific properties.
	 *
	 * Each item in a hashtable has a NUL terminated string key.  A key can appear
	 * only once in the table.
	 *
	 * A hash number is computed from the key for quick lookup.  When the hashes
	 * of two different keys point to the same entry an algorithm is used to
	 * iterate over other entries in the table until the right one is found.
	 * To make the iteration work removed keys are different from entries where a
	 * key was never present.
	 *
	 * The mechanism has been partly based on how Python Dictionaries are
	 * implemented.  The algorithm is from Knuth Vol. 3, Sec. 6.4.
	 *
	 * The hashtable grows to accommodate more entries when needed.  At least 1/3
	 * of the entries is empty to keep the lookup efficient (at the cost of extra
	 * memory).
	 */
	/* extra checks for table consistency  and statistics */
	/* count number of hashtab lookups */
	/* count number of "misses" */
	/* Magic value for algorithm that walks through the array. */
	public int hash_may_resize(int minitems) {
		hashitem_T[] temparray = new hashitem_T();
		hashitem_T oldarray = new hashitem_T();
		hashitem_T newarray = new hashitem_T();
		hashitem_T olditem = new hashitem_T();
		hashitem_T newitem = new hashitem_T();
		int newi;
		int todo;
		long_u oldsize = new long_u();
		long_u newsize = new long_u();
		long_u minsize = new long_u();
		long_u newmask = new long_u();
		hash_T perturb = new hash_T();
		int generatedHt_locked = this.getHt_locked();
		if (generatedHt_locked > /* Don't resize a locked table. */0) {
			return 1;
		} 
		Object generatedHt_filled = this.getHt_filled();
		hashitem_S generatedHt_array = this.getHt_array();
		Object generatedHt_smallarray = this.getHt_smallarray();
		Object generatedHt_mask = this.getHt_mask();
		Object generatedHt_used = this.getHt_used();
		if (minitems == 0) {
			if (generatedHt_filled < 16 - /* Return quickly for small tables with at least two NULL items.  NULL
				 * items are required for the lookup to decide a key isn't there. */1 && generatedHt_array == generatedHt_smallarray) {
				return 1/*
					 * Grow or refill the array when it's more than 2/3 full (including
					 * removed items, so that they get cleaned up).
					 * Shrink the array when it's less than 1/5 full.  When growing it is
					 * at least 1/4 full (avoids repeated grow-shrink operations)
					 */;
			} 
			oldsize = generatedHt_mask + 1;
			if (generatedHt_filled * 3 < oldsize * 2 && generatedHt_used > oldsize / 5) {
				return 1;
			} 
			if (generatedHt_used > 1000) {
				minsize = generatedHt_used * /* it's big, don't make too much room */2;
			} else {
					minsize = generatedHt_used * /* make plenty of room */4;
			} 
		} else {
				if ((long_u)minitems < generatedHt_used) {
					minitems = (int)generatedHt_used;
				} 
				minsize = (minitems * 3 + 1) / 2;
		} 
		newsize = 16;
		while (newsize < minsize) {
			newsize <<=  /* make sure it's always a power of 2 */1;
			if (newsize == 0) {
				return /* overflow */0;
			} 
		}
		if (newsize == 16) {
			newarray = generatedHt_smallarray;
			if (generatedHt_array == newarray/* Moving from ht_smallarray to ht_smallarray!  Happens when there
				     * are many removed items.  Copy the items to be able to clean up
				     * removed items. */) {
				.memmove((byte)(temparray), (byte)(newarray), (size_t)());
				oldarray = temparray;
			} else {
					oldarray = generatedHt_array;
			} 
		} else {
				newarray = (hashitem_T)ModernizedCProgram.alloc( * (/* Allocate an array. */newsize));
				if (newarray == ((Object)0/* Out of memory.  When there are NULL items still return OK.
					     * Otherwise set ht_error, because lookup may result in a hang if
					     * we add another item. */)) {
					if (generatedHt_filled < generatedHt_mask) {
						return 1;
					} 
					this.setHt_error(1);
					return 0;
				} 
				oldarray = generatedHt_array;
		} 
		.memset((newarray), (false), ((size_t)( * newsize/*
		     * Move all the items from the old array to the new one, placing them in
		     * the right spot.  The new array won't have any removed items, thus this
		     * is also a cleanup action.
		     */)));
		newmask = newsize - 1;
		todo = (int)generatedHt_used;
		Object generatedHi_key = (olditem).getHi_key();
		Object generatedHi_hash = olditem.getHi_hash();
		for (olditem = oldarray; todo > 0; ++olditem) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed/*
				     * The algorithm to find the spot to add the item is identical to
				     * the algorithm to find an item in hash_lookup().  But we only
				     * need to search for a NULL key, thus it's simpler.
				     */)) {
				newi = (int)(generatedHi_hash & newmask);
				newitem = newarray[newi];
				if (generatedHi_key != ((Object)0)) {
					for (perturb = generatedHi_hash; ; perturb >>=  5) {
						newi = (int)((newi << -1024) + newi + perturb + -1024);
						newitem = newarray[newi & newmask];
						if (generatedHi_key == ((Object)0)) {
							break;
						} 
					}
				} 
				newitem = olditem;
				--todo;
			} 
		}
		if (generatedHt_array != generatedHt_smallarray) {
			ModernizedCProgram.vim_free(generatedHt_array);
		} 
		this.setHt_array(newarray);
		this.setHt_mask(newmask);
		this.setHt_filled(generatedHt_used);
		this.setHt_error(0);
		return 1/*
		 * Get the hash number for a key.
		 * If you think you know a better hash function: Compile with HT_DEBUG set and
		 * run a script that uses hashtables a lot.  Vim will then print statistics
		 * when exiting.  Try that with the current hash algorithm and yours.  The
		 * lower the percentage the better.
		 */;
	}
	/* currently not used */
	/* currently not used */
	/*
	 * Create an empty hash table.
	 * Returns NULL when out of memory.
	 */
	public hashtable_S func_tbl_get() {
		return ModernizedCProgram.func_hashtab/*
		 * Get function arguments.
		 */;
	}
	public hashtable_S get_funccal_local_ht() {
		if (ModernizedCProgram.current_funccal == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.get_funccal().getL_vars().getDv_hashtab();
	}
	public hashtable_S get_funccal_args_ht() {
		if (ModernizedCProgram.current_funccal == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.get_funccal().getL_avars().getDv_hashtab();
	}
	public void list_hashtable_vars(Byte prefix, int empty, Integer first) {
		hashitem_T hi = new hashitem_T();
		dictitem_T di = new dictitem_T();
		int todo;
		char_u[] buf = new char_u();
		Object generatedHt_used = this.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		Object generatedDi_key = di.getDi_key();
		 generatedDi_tv = di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedVval = generatedDi_tv.getVval();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0 && !got_int; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				di = ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
				ModernizedCProgram.vim_strncpy((char_u)buf, (char_u)prefix, (1024 + 1) - 1);
				ModernizedCProgram.vim_strcat((char_u)buf, generatedDi_key, (1024 + 1));
				if (ModernizedCProgram.message_filtered(buf)) {
					continue;
				} 
				if (empty || generatedV_type != .VAR_STRING || generatedVval.getV_string() != ((Object)0)) {
					di.list_one_var(prefix, first);
				} 
			} 
		}
	}
	public hashtable_S get_globvar_ht() {
		return ModernizedCProgram.globvardict.getDv_hashtab();
	}
	public hashtable_S find_var_ht(Object name, Object varname) {
		hashitem_T hi = new hashitem_T();
		hashtab_T ht = new hashtab_T();
		if (name[0] == (byte)'\000') {
			return ((Object)0);
		} 
		Object generatedSc_version = current_sctx.getSc_version();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		hashtable_S hashtable_S = new hashtable_S();
		if (name[1] != (byte)':') {
			if (name[0] == (byte)':' || name[0] == (byte)'#') {
				return ((Object)0);
			} 
			varname = name;
			if (generatedSc_version < 3) {
				hi = hashitem_S.hash_find(ModernizedCProgram.compat_hashtab, name);
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					return ModernizedCProgram.compat_hashtab;
				} 
			} 
			ht = hashtable_S.get_funccal_local_ht();
			if (ht == ((Object)0)) {
				return ModernizedCProgram.globvardict.getDv_hashtab();
			} 
			return ht;
		} 
		varname = name + 2;
		// global variableif (name == (byte)'g') {
			return ModernizedCProgram.globvardict.getDv_hashtab();
		} 
		if (ModernizedCProgram.vim_strchr(name + 2, (byte)':') != ((Object)0) || ModernizedCProgram.vim_strchr(name + 2, (byte)'#') != ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedB_vars = curbuf.getB_vars();
		// buffer variableif (name == (byte)'b') {
			return generatedB_vars.getDv_hashtab();
		} 
		// window variableif (name == (byte)'w') {
			return ModernizedCProgram.curwin.getW_vars().getDv_hashtab();
		} 
		// tab page variableif (name == (byte)'t') {
			return ModernizedCProgram.curtab.getTp_vars().getDv_hashtab();
		} 
		// v: variableif (name == (byte)'v') {
			return ModernizedCProgram.vimvardict.getDv_hashtab();
		} 
		hashtable_S hashtable_S = new hashtable_S();
		// a: function argumentif (name == (byte)'a') {
			return hashtable_S.get_funccal_args_ht();
		} 
		// l: local function variableif (name == (byte)'l') {
			return hashtable_S.get_funccal_local_ht();
		} 
		Object generatedSc_sid = current_sctx.getSc_sid();
		// script variableif (name == (byte)'s' && generatedSc_sid > 0 && generatedSc_sid <= ModernizedCProgram.ga_scripts.getGa_len()) {
			return ((((scriptvar_T)ModernizedCProgram.ga_scripts.getGa_data())[(generatedSc_sid) - 1]).getSv_dict().getDv_hashtab());
		} 
		return ((Object)0/*
		 * Get the string value of a (global/local) variable.
		 * Note: see tv_get_string() for how long the pointer remains valid.
		 * Returns NULL when it doesn't exist.
		 */);
	}
	public void vars_clear() {
		ht.vars_clear_ext(1/*
		 * Like vars_clear(), but only free the value if "free_val" is TRUE.
		 */);
	}
	public void vars_clear_ext(int free_val) {
		int todo;
		hashitem_T hi = new hashitem_T();
		dictitem_T v = new dictitem_T();
		ht.hash_lock();
		Object generatedHt_used = this.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		 generatedDi_tv = v.getDi_tv();
		Object generatedDi_flags = v.getDi_flags();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				v = ((dictitem_T)(generatedHi_key - ((size_t)((dictitem_T)0).getDi_key())));
				if (free_val) {
					generatedDi_tv.clear_tv();
				} 
				if (generatedDi_flags & 16) {
					ModernizedCProgram.vim_free(v);
				} 
			} 
		}
		ht.hash_clear();
		this.setHt_used(0/*
		 * Delete a variable from hashtab "ht" at item "hi".
		 * Clear the variable value and free the dictitem.
		 */);
	}
	public int syn_list_keywords(int id, int did_header, int attr) {
		/* header has already been printed */int outlen;
		hashitem_T hi = new hashitem_T();
		keyentry_T kp = new keyentry_T();
		int todo;
		int prev_contained = 0;
		int prev_next_list = ((Object)0);
		int prev_cont_in_list = ((Object)0);
		int prev_skipnl = 0;
		int prev_skipwhite = 0;
		int prev_skipempty = 0/*
		     * Unfortunately, this list of keywords is not sorted on alphabet but on
		     * hash value...
		     */;
		Object generatedHt_used = this.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		Object generatedK_syn = kp.getK_syn();
		Object generatedFlags = kp.getFlags();
		Object generatedNext_list = kp.getNext_list();
		Object generatedKeyword = kp.getKeyword();
		Object generatedKe_next = kp.getKe_next();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0 && !got_int; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				for (kp = ((keyentry_T)((generatedHi_key) - (generatedKeyword - (char_u)ModernizedCProgram.dumkey))); kp != ((Object)0) && !got_int; kp = generatedKe_next) {
					if (generatedK_syn.getId() == id) {
						if (prev_contained != (generatedFlags & -1024) || prev_skipnl != (generatedFlags & -1024) || prev_skipwhite != (generatedFlags & -1024) || prev_skipempty != (generatedFlags & -1024) || prev_cont_in_list != generatedK_syn.getCont_in_list() || prev_next_list != generatedNext_list) {
							outlen = 9999;
						} else {
								outlen = (int).strlen((byte)(generatedKeyword));
						} 
						if (ModernizedCProgram.syn_list_header(did_header, outlen, /* output "contained" and "nextgroup" on each line */id)) {
							prev_contained = 0;
							prev_next_list = ((Object)0);
							prev_cont_in_list = ((Object)0);
							prev_skipnl = 0;
							prev_skipwhite = 0;
							prev_skipempty = 0;
						} 
						did_header = 1;
						if (prev_contained != (generatedFlags & -1024)) {
							ModernizedCProgram.msg_puts_attr("contained", attr);
							ModernizedCProgram.msg_putchar((byte)' ');
							prev_contained = (generatedFlags & -1024);
						} 
						if (generatedK_syn.getCont_in_list() != prev_cont_in_list) {
							ModernizedCProgram.put_id_list((char_u)"containedin", generatedK_syn.getCont_in_list(), attr);
							ModernizedCProgram.msg_putchar((byte)' ');
							prev_cont_in_list = generatedK_syn.getCont_in_list();
						} 
						if (generatedNext_list != prev_next_list) {
							ModernizedCProgram.put_id_list((char_u)"nextgroup", generatedNext_list, attr);
							ModernizedCProgram.msg_putchar((byte)' ');
							prev_next_list = generatedNext_list;
							if (generatedFlags & -1024) {
								ModernizedCProgram.msg_puts_attr("skipnl", attr);
								ModernizedCProgram.msg_putchar((byte)' ');
								prev_skipnl = (generatedFlags & -1024);
							} 
							if (generatedFlags & -1024) {
								ModernizedCProgram.msg_puts_attr("skipwhite", attr);
								ModernizedCProgram.msg_putchar((byte)' ');
								prev_skipwhite = (generatedFlags & -1024);
							} 
							if (generatedFlags & -1024) {
								ModernizedCProgram.msg_puts_attr("skipempty", attr);
								ModernizedCProgram.msg_putchar((byte)' ');
								prev_skipempty = (generatedFlags & -1024);
							} 
						} 
						ModernizedCProgram.msg_outtrans(generatedKeyword);
					} 
				}
			} 
		}
		return did_header;
	}
	public void syn_clear_keyword(int id) {
		hashitem_T hi = new hashitem_T();
		keyentry_T kp = new keyentry_T();
		keyentry_T kp_prev = new keyentry_T();
		keyentry_T kp_next = new keyentry_T();
		int todo;
		ht.hash_lock();
		Object generatedHt_used = this.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		Object generatedK_syn = kp.getK_syn();
		Object generatedKe_next = kp.getKe_next();
		Object generatedKeyword = (kp_next).getKeyword();
		Object generatedNext_list = kp.getNext_list();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				kp_prev = ((Object)0);
				for (kp = ((keyentry_T)((generatedHi_key) - (generatedKeyword - (char_u)ModernizedCProgram.dumkey))); kp != ((Object)0); ) {
					if (generatedK_syn.getId() == id) {
						kp_next = generatedKe_next;
						if (kp_prev == ((Object)0)) {
							if (kp_next == ((Object)0)) {
								ModernizedCProgram.hash_remove(ht, hi);
							} else {
									hi.setHi_key((generatedKeyword));
							} 
						} else {
								kp_prev.setKe_next(kp_next);
						} 
						ModernizedCProgram.vim_free(generatedNext_list);
						ModernizedCProgram.vim_free(generatedK_syn.getCont_in_list());
						ModernizedCProgram.vim_free(kp);
						kp = kp_next;
					} else {
							kp_prev = kp;
							kp = generatedKe_next;
					} 
				}
			} 
		}
		ht/*
		 * Clear a whole keyword table.
		 */.hash_unlock();
	}
	public void clear_keywtab() {
		hashitem_T hi = new hashitem_T();
		int todo;
		keyentry_T kp = new keyentry_T();
		keyentry_T kp_next = new keyentry_T();
		Object generatedHt_used = this.getHt_used();
		todo = (int)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		Object generatedKe_next = kp.getKe_next();
		Object generatedNext_list = kp.getNext_list();
		Object generatedK_syn = kp.getK_syn();
		hashitem_S generatedHt_array = this.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				--todo;
				for (kp = ((keyentry_T)((generatedHi_key) - (ModernizedCProgram.dumkey.getKeyword() - (char_u)ModernizedCProgram.dumkey))); kp != ((Object)0); kp = kp_next) {
					kp_next = generatedKe_next;
					ModernizedCProgram.vim_free(generatedNext_list);
					ModernizedCProgram.vim_free(generatedK_syn.getCont_in_list());
					ModernizedCProgram.vim_free(kp);
				}
			} 
		}
		ht.hash_clear();
		ht/*
		 * Add a keyword to the list of keywords.
		 */.hash_init();
	}
	public Object getHt_mask() {
		return ht_mask;
	}
	public void setHt_mask(Object newHt_mask) {
		ht_mask = newHt_mask;
	}
	public Object getHt_used() {
		return ht_used;
	}
	public void setHt_used(Object newHt_used) {
		ht_used = newHt_used;
	}
	public Object getHt_filled() {
		return ht_filled;
	}
	public void setHt_filled(Object newHt_filled) {
		ht_filled = newHt_filled;
	}
	public int getHt_locked() {
		return ht_locked;
	}
	public void setHt_locked(int newHt_locked) {
		ht_locked = newHt_locked;
	}
	public int getHt_error() {
		return ht_error;
	}
	public void setHt_error(int newHt_error) {
		ht_error = newHt_error;
	}
	public hashitem_S getHt_array() {
		return ht_array;
	}
	public void setHt_array(hashitem_S newHt_array) {
		ht_array = newHt_array;
	}
	public Object getHt_smallarray() {
		return ht_smallarray;
	}
	public void setHt_smallarray(Object newHt_smallarray) {
		ht_smallarray = newHt_smallarray;
	}
}
