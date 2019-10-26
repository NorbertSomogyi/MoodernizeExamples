package application;

/*
 * Removes a hashmap entry matching the specified key. If the hashmap contains
 * duplicate entries equal to the specified key, only one of them will be
 * removed. Returns the removed entry, or NULL if not found.
 *
 * Argument explanation is the same as in `hashmap_get`.
 */
/* Returns the next hashmap_entry, or NULL if there are no more entries. */
/* Initializes the iterator and returns the first entry, if any. */
public class hashmap_entry {
	private hashmap_entry next;
	private int hash;
	
	public hashmap_entry(hashmap_entry next, int hash) {
		setNext(next);
		setHash(hash);
	}
	public hashmap_entry() {
	}
	
	public hashmap_entry find_entry_ptr(Object map, Object key, Object keydata) {
		hashmap_entry e = map.getTable()[ModernizedCProgram.bucket(map, key)];
		hashmap_entry generatedNext = (e).getNext();
		while (e && !ModernizedCProgram.entry_equals(map, e, key, keydata)) {
			e = generatedNext;
		}
		return e;
	}
	public hashmap_entry hashmap_get(Object map, Object key, Object keydata) {
		hashmap_entry hashmap_entry = new hashmap_entry();
		return hashmap_entry.find_entry_ptr(map, key, keydata);
	}
	public hashmap_entry hashmap_get_next(Object map, Object entry) {
		hashmap_entry e = entry.getNext();
		hashmap_entry generatedNext = e.getNext();
		for (; e; e = generatedNext) {
			if (ModernizedCProgram.entry_equals(map, entry, e, ((Object)0))) {
				return e;
			} 
		}
		return ((Object)0);
	}
	public hashmap_entry hashmap_remove(hashmap map, Object key, Object keydata) {
		hashmap_entry old = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry e = hashmap_entry.find_entry_ptr(map, key, keydata);
		if (!e) {
			return ((Object)0);
		} 
		old = /* remove existing entry */e;
		hashmap_entry generatedNext = old.getNext();
		e = generatedNext;
		old.setNext(((Object)0));
		int generatedDo_count_items = map.getDo_count_items();
		int generatedPrivate_size = map.getPrivate_size();
		int generatedShrink_at = map.getShrink_at();
		int generatedTablesize = map.getTablesize();
		if (generatedDo_count_items) {
			generatedPrivate_size--;
			if (generatedPrivate_size < generatedShrink_at) {
				map.rehash(generatedTablesize >> 2);
			} 
		} 
		return old;
	}
	public hashmap_entry hashmap_put(hashmap map) {
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry old = hashmap_entry.hashmap_remove(map, entry, ((Object)0));
		ModernizedCProgram.hashmap_add(map, entry);
		return old;
	}
	public hashmap_entry hashmap_iter_next(hashmap_iter iter) {
		hashmap_entry generatedNext = iter.getNext();
		hashmap_entry current = generatedNext;
		int generatedTablepos = iter.getTablepos();
		hashmap generatedMap = iter.getMap();
		int generatedTablesize = generatedMap.getTablesize();
		hashmap_entry generatedTable = generatedMap.getTable();
		for (; ; ) {
			if (current) {
				iter.setNext(generatedNext);
				return current;
			} 
			if (generatedTablepos >= generatedTablesize) {
				return ((Object)0);
			} 
			current = generatedTable[generatedTablepos++];
		}
	}
	/* hashmap_entry functions */
	/*
	 * Initializes a hashmap_entry structure.
	 *
	 * `entry` points to the entry to initialize.
	 * `hash` is the hash code of the entry.
	 *
	 * The hashmap_entry structure does not hold references to external resources,
	 * and it is safe to just discard it once you are done with it (i.e. if
	 * your structure was allocated with xmalloc(), you can just free(3) it,
	 * and if it is on stack, you can just let it go out of scope).
	 */
	public void hashmap_entry_init(int hash) {
		this.setHash(hash);
		this.setNext(((Object)0/*
		 * Return the number of items in the map.
		 */));
	}
	public hashmap_entry hashmap_get_from_hash(Object map, int hash, Object keydata) {
		hashmap_entry key = new hashmap_entry();
		key.hashmap_entry_init(hash);
		hashmap_entry hashmap_entry = new hashmap_entry();
		return hashmap_entry.hashmap_get(map, key, keydata/*
		 * Returns the next equal hashmap entry, or NULL if not found. This can be
		 * used to iterate over duplicate entries (see `hashmap_add`).
		 *
		 * `map` is the hashmap structure.
		 * `entry` is the hashmap_entry to start the search from, obtained via a previous
		 * call to `hashmap_get` or `hashmap_get_next`.
		 */);
	}
	public hashmap_entry hashmap_iter_first(hashmap map, hashmap_iter iter) {
		ModernizedCProgram.hashmap_iter_init(map, iter);
		hashmap_entry hashmap_entry = new hashmap_entry();
		return hashmap_entry.hashmap_iter_next(iter/*
		 * returns the first entry in @map using @iter, where the entry is of
		 * @type (e.g. "struct foo") and @member is the name of the
		 * "struct hashmap_entry" in @type
		 */);
	}
	public hashmap_entry getNext() {
		return next;
	}
	public void setNext(hashmap_entry newNext) {
		next = newNext;
	}
	public int getHash() {
		return hash;
	}
	public void setHash(int newHash) {
		hash = newHash;
	}
}
/*
	 * next points to the next entry in case of collisions (i.e. if
	 * multiple entries map to the same bucket)
	 */
/*
 * struct hashmap is the hash table structure. Members can be used as follows,
 * but should not be modified directly.
 */
/*
 * Returns the hashmap entry for the specified hash code and key data,
 * or NULL if not found.
 *
 * `map` is the hashmap structure.
 * `hash` is the hash code of the entry to look up.
 *
 * If an entry with matching hash code is found, `keydata` is passed to
 * `hashmap_cmp_fn` to decide whether the entry matches the key. The
 * `entry_or_key` parameter of `hashmap_cmp_fn` points to a hashmap_entry
 * structure that should not be used in the comparison.
 */
/*
 * Adds a hashmap entry. This allows to add duplicate entries (i.e.
 * separate values with the same key according to hashmap_cmp_fn).
 *
 * `map` is the hashmap structure.
 * `entry` is the entry to add.
 */
/*
 * Adds or replaces a hashmap entry contained within @keyvar,
 * where @keyvar is a pointer to a struct containing a
 * "struct hashmap_entry" @member.
 *
 * Returns the replaced pointer which is of the same type as @keyvar,
 * or NULL if not found.
 */
/*
 * Removes a hashmap entry contained within @keyvar,
 * where @keyvar is a pointer to a struct containing a
 * "struct hashmap_entry" @member.
 *
 * See `hashmap_get` for an explanation of @keydata
 *
 * Returns the replaced pointer which is of the same type as @keyvar,
 * or NULL if not found.
 */
