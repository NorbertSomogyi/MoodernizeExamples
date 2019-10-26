package application;

/* Item for a hashtable.  "hi_key" can be one of three values:
 * NULL:	   Never been used
 * HI_KEY_REMOVED: Entry was removed
 * Otherwise:	   Used item, pointer to the actual key; this usually is
 *		   inside the item, subtract an offset to locate the item.
 *		   This reduces the size of hashitem by 1/3.
 */
public class hashitem_S {
	private Object hi_hash;
	private Object hi_key;
	
	public hashitem_S(Object hi_hash, Object hi_key) {
		setHi_hash(hi_hash);
		setHi_key(hi_key);
	}
	public hashitem_S() {
	}
	
	// The global text property types.
	// The last used text property type ID.
	public hashitem_S find_prop_hi(Object name, file_buffer buf) {
		hashtab_T ht = new hashtab_T();
		hashitem_T hi = new hashitem_T();
		if (name == (byte)'\000') {
			return ((Object)0);
		} 
		Object generatedB_proptypes = buf.getB_proptypes();
		if (buf == ((Object)0)) {
			ht = ModernizedCProgram.global_proptypes;
		} else {
				ht = generatedB_proptypes;
		} 
		if (ht == ((Object)0)) {
			return ((Object)0);
		} 
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_find(ht, name);
		Object generatedHi_key = (hi).getHi_key();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			return ((Object)0);
		} 
		return hi/*
		 * Like find_prop_hi() but return the property type.
		 */;
	}
	public hashitem_S hash_find(hashtable_S ht, Object key) {
		hashitem_S hashitem_S = new hashitem_S();
		return hashitem_S.hash_lookup(ht, key, ModernizedCProgram.hash_hash(key/*
		 * Like hash_find(), but caller computes "hash".
		 */));
	}
	public hashitem_S hash_lookup(hashtable_S ht, Object key, Object hash) {
		hash_T perturb = new hash_T();
		hashitem_T freeitem = new hashitem_T();
		hashitem_T hi = new hashitem_T();
		int idx;
		Object generatedHt_mask = ht.getHt_mask();
		idx = (int)(hash & generatedHt_mask);
		hashitem_S generatedHt_array = ht.getHt_array();
		hi = generatedHt_array[idx];
		Object generatedHi_key = hi.getHi_key();
		if (generatedHi_key == ((Object)0)) {
			return hi;
		} 
		Object generatedHi_hash = hi.getHi_hash();
		if (generatedHi_key == ModernizedCProgram.hash_removed) {
			freeitem = hi;
		}  else if (generatedHi_hash == hash && .strcmp((byte)(generatedHi_key), (byte)(key)) == 0) {
			return hi;
		} else {
				freeitem = ((Object)0/*
				     * Need to search through the table to find the key.  The algorithm
				     * to step through the table starts with large steps, gradually becoming
				     * smaller down to (1/4 table size + 1).  This means it goes through all
				     * table entries in the end.
				     * When we run into a NULL key it's clear that the key isn't there.
				     * Return the first available slot found (can be a slot of a removed
				     * item).
				     */);
		} 
		for (perturb = hash; ; perturb >>=  5) {
			idx = (int)((idx << -1024) + idx + perturb + /* count a "miss" for hashtab lookup */-1024);
			hi = generatedHt_array[idx & generatedHt_mask];
			if (generatedHi_key == ((Object)0)) {
				return freeitem == ((Object)0) ? hi : freeitem;
			} 
			if (generatedHi_hash == hash && generatedHi_key != ModernizedCProgram.hash_removed && .strcmp((byte)(generatedHi_key), (byte)(key)) == 0) {
				return hi;
			} 
			if (generatedHi_key == ModernizedCProgram.hash_removed && freeitem == ((Object)0)) {
				freeitem = hi/*
				 * Print the efficiency of hashtable lookups.
				 * Useful when trying different hash algorithms.
				 * Called when exiting.
				 */;
			} 
		}
	}
	public hashitem_S find_hi_in_scoped_ht(Object name, hashtable_S pht) {
		funccall_T old_current_funccal = ModernizedCProgram.current_funccal;
		hashtab_T ht = new hashtab_T();
		hashitem_T hi = ((Object)0);
		char_u varname = new char_u();
		if (ModernizedCProgram.current_funccal == ((Object)0) || ModernizedCProgram.current_funccal.getFunc().getUf_scoped() == ((Object)0)) {
			return ((Object)0);
		} 
		ModernizedCProgram.current_funccal = ModernizedCProgram.current_funccal.getFunc().getUf_scoped();
		hashtable_S hashtable_S = new hashtable_S();
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		while (ModernizedCProgram.current_funccal != ((Object)0)) {
			ht = hashtable_S.find_var_ht(name, varname);
			if (ht != ((Object)0) && varname != (byte)'\000') {
				hi = hashitem_S.hash_find(ht, varname);
				if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
					pht = ht;
					break;
				} 
			} 
			if (ModernizedCProgram.current_funccal == ModernizedCProgram.current_funccal.getFunc().getUf_scoped()) {
				break;
			} 
			ModernizedCProgram.current_funccal = ModernizedCProgram.current_funccal.getFunc().getUf_scoped();
		}
		ModernizedCProgram.current_funccal = old_current_funccal;
		return hi/*
		 * Search variable in parent scope.
		 */;
	}
	public Object getHi_hash() {
		return hi_hash;
	}
	public void setHi_hash(Object newHi_hash) {
		hi_hash = newHi_hash;
	}
	public Object getHi_key() {
		return hi_key;
	}
	public void setHi_key(Object newHi_key) {
		hi_key = newHi_key;
	}
}
