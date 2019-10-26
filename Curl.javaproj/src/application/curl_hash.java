package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* Hash function prototype */
/*
   Comparator function prototype. Compares two keys.
*/
public class curl_hash {
	private curl_llist table;
	private Object hash_func;
	private Object comp_func;
	private Object dtor;
	private int slots;
	private Object size;
	
	public curl_hash(curl_llist table, Object hash_func, Object comp_func, Object dtor, int slots, Object size) {
		setTable(table);
		setHash_func(hash_func);
		setComp_func(comp_func);
		setDtor(dtor);
		setSlots(slots);
		setSize(size);
	}
	public curl_hash() {
	}
	
	public int Curl_hash_init(int slots, Object hfunc, Object comparator, Object dtor) {
		if (!slots || !hfunc || !comparator || !dtor) {
			return /* failure */1;
		} 
		this.setHash_func(hfunc);
		this.setComp_func(comparator);
		this.setDtor(dtor);
		this.setSize(0);
		this.setSlots(slots);
		this.setTable(.Curl_cmalloc(slots * ));
		curl_llist generatedTable = this.getTable();
		if (generatedTable) {
			int i;
			for (i = 0; i < slots; ++i) {
				generatedTable[i].Curl_llist_init((curl_llist_dtor)hash_element_dtor);
			}
			return /* fine */0;
		} 
		this.setSlots(0);
		return /* failure */1;
	}
	public Object Curl_hash_add(Object key, Object key_len, Object p) {
		curl_hash_element he = new curl_hash_element();
		curl_llist_element le = new curl_llist_element();
		curl_llist generatedTable = this.getTable();
		int generatedSlots = this.getSlots();
		curl_llist l = generatedTable[.UNRECOGNIZEDFUNCTIONNAME(key, key_len, generatedSlots)];
		Object generatedPtr = le.getPtr();
		Object generatedKey = he.getKey();
		Object generatedKey_len = he.getKey_len();
		Object generatedSize = this.getSize();
		curl_llist_element generatedNext = le.getNext();
		curl_llist_element generatedHead = l.getHead();
		for (le = generatedHead; le; le = generatedNext) {
			he = (curl_hash_element)generatedPtr;
			if (.UNRECOGNIZEDFUNCTIONNAME(generatedKey, generatedKey_len, key, key_len)) {
				ModernizedCProgram.Curl_llist_remove(l, le, (Object)h);
				--generatedSize;
				break;
			} 
		}
		curl_hash_element curl_hash_element = new curl_hash_element();
		he = curl_hash_element.mk_hash_element(key, key_len, p);
		curl_llist_element generatedTail = l.getTail();
		curl_llist_element generatedList = he.getList();
		if (he) {
			ModernizedCProgram.Curl_llist_insert_next(l, generatedTail, he, generatedList);
			++generatedSize;
			return /* return the new entry */p;
		} 
		return ((Object)/* failure */0/* Remove the identified hash entry.
		 * Returns non-zero on failure.
		 *
		 * @unittest: 1603
		 */);
	}
	public int Curl_hash_delete(Object key, Object key_len) {
		curl_llist_element le = new curl_llist_element();
		curl_llist generatedTable = this.getTable();
		int generatedSlots = this.getSlots();
		curl_llist l = generatedTable[.UNRECOGNIZEDFUNCTIONNAME(key, key_len, generatedSlots)];
		Object generatedPtr = le.getPtr();
		Object generatedKey = he.getKey();
		Object generatedKey_len = he.getKey_len();
		Object generatedSize = this.getSize();
		curl_llist_element generatedNext = le.getNext();
		curl_llist_element generatedHead = l.getHead();
		for (le = generatedHead; le; le = generatedNext) {
			curl_hash_element he = generatedPtr;
			if (.UNRECOGNIZEDFUNCTIONNAME(generatedKey, generatedKey_len, key, key_len)) {
				ModernizedCProgram.Curl_llist_remove(l, le, (Object)h);
				--generatedSize;
				return 0;
			} 
		}
		return 1/* Retrieves a hash element.
		 *
		 * @unittest: 1603
		 */;
	}
	public Object Curl_hash_pick(Object key, Object key_len) {
		curl_llist_element le = new curl_llist_element();
		curl_llist l = new curl_llist();
		curl_llist generatedTable = this.getTable();
		int generatedSlots = this.getSlots();
		Object generatedPtr = le.getPtr();
		Object generatedKey = he.getKey();
		Object generatedKey_len = he.getKey_len();
		curl_llist_element generatedNext = le.getNext();
		curl_llist_element generatedHead = l.getHead();
		if (h) {
			l = generatedTable[.UNRECOGNIZEDFUNCTIONNAME(key, key_len, generatedSlots)];
			for (le = generatedHead; le; le = generatedNext) {
				curl_hash_element he = generatedPtr;
				if (.UNRECOGNIZEDFUNCTIONNAME(generatedKey, generatedKey_len, key, key_len)) {
					return generatedPtr;
				} 
			}
		} 
		return ((Object)0);
	}
	/* Destroys all the entries in the given hash and resets its attributes,
	 * prepping the given hash for [static|dynamic] deallocation.
	 *
	 * @unittest: 1305
	 * @unittest: 1602
	 * @unittest: 1603
	 */
	public void Curl_hash_destroy() {
		int i;
		int generatedSlots = this.getSlots();
		curl_llist generatedTable = this.getTable();
		for (i = 0; i < generatedSlots; ++i) {
			generatedTable[i].Curl_llist_destroy((Object)h);
		}
		do {
			.Curl_cfree((generatedTable));
			(generatedTable) = ((Object)0);
		} while (0);
		this.setSize(0);
		this.setSlots(0/* Removes all the entries in the given hash.
		 *
		 * @unittest: 1602
		 */);
	}
	public void Curl_hash_clean() {
		h.Curl_hash_clean_with_criterium(((Object)0), ((Object)0));
	}
	/* Cleans all entries that pass the comp function criteria. */
	public void Curl_hash_clean_with_criterium(Object user, Object comp) {
		curl_llist_element le = new curl_llist_element();
		curl_llist_element lnext = new curl_llist_element();
		curl_llist list = new curl_llist();
		int i;
		if (!h) {
			return ;
		} 
		int generatedSlots = this.getSlots();
		curl_llist generatedTable = this.getTable();
		curl_llist_element generatedHead = list.getHead();
		Object generatedPtr = le.getPtr();
		curl_llist_element generatedNext = le.getNext();
		Object generatedSize = this.getSize();
		for (i = 0; i < generatedSlots; ++i) {
			list = generatedTable[i];
			le = generatedHead;
			while (le) {
				curl_hash_element he = generatedPtr;
				lnext = generatedNext;
				if (comp == ((Object)0) || .comp(user, generatedPtr)) {
					ModernizedCProgram.Curl_llist_remove(list, le, (Object)h);
					--generatedSize;
				} 
				le = lnext;
			}
		}
	}
	public int sh_init(int hashsize) {
		return hash.Curl_hash_init(hashsize, hash_fd, fd_key_compare, sh_freeentry/*
		 * multi_addmsg()
		 *
		 * Called when a transfer is completed. Adds the given msg pointer to
		 * the list kept in the multi handle.
		 */);
	}
	public void hostcache_prune(long cache_timeout, Object now) {
		hostcache_prune_data user = new hostcache_prune_data();
		user.setCache_timeout(cache_timeout);
		user.setNow(now);
		hostcache.Curl_hash_clean_with_criterium((Object)user, hostcache_timestamp_remove/*
		 * Library-wide function for pruning the DNS cache. This function takes and
		 * returns the appropriate locks.
		 */);
	}
	/*
	 * Curl_mk_dnscache() inits a new DNS cache and returns success/failure.
	 */
	public int Curl_mk_dnscache() {
		return hash.Curl_hash_init(7, ModernizedCProgram.Curl_hash_str, ModernizedCProgram.Curl_str_key_compare, ModernizedCProgram.freednsentry/*
		 * Curl_hostcache_clean()
		 *
		 * This _can_ be called with 'data' == NULL but then of course no locking
		 * can be done!
		 */);
	}
	public curl_llist getTable() {
		return table;
	}
	public void setTable(curl_llist newTable) {
		table = newTable;
	}
	public Object getHash_func() {
		return hash_func;
	}
	public void setHash_func(Object newHash_func) {
		hash_func = newHash_func;
	}
	public Object getComp_func() {
		return comp_func;
	}
	public void setComp_func(Object newComp_func) {
		comp_func = newComp_func;
	}
	public Object getDtor() {
		return dtor;
	}
	public void setDtor(Object newDtor) {
		dtor = newDtor;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int newSlots) {
		slots = newSlots;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
