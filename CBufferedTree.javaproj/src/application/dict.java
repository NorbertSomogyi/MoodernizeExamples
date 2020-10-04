package application;

public class dict {
	private dictType type;
	private Object privdata;
	private Object[] ht;
	private int rehashidx;
	private int iterators;
	
	public dict(dictType type, Object privdata, Object[] ht, int rehashidx, int iterators) {
		setType(type);
		setPrivdata(privdata);
		setHt(ht);
		setRehashidx(rehashidx);
		setIterators(iterators);
	}
	public dict() {
	}
	
	public void redis_add(int times) {
		int i;
		sds key = new sds();
		sds val = new sds();
		byte[] buf = new byte[20];
		for (i = 0; i < times; ++i) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "key%d", i);
			key = ModernizedCProgram.sdsnew(buf);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "val%d", i);
			val = ModernizedCProgram.sdsnew(buf);
			((d.dictAdd(key, val) == 0) ? null : /*Error: Function owner not recognized*/_assert("dictAdd(d, key, val) == DICT_OK", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 55));
		}
	}
	public void redis_fetch(int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/srand(1992);
		for (i = 0; i < times; ++i) {
			j = /*Error: Function owner not recognized*/rand() % times;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			((d.dictFetchValue(key)) ? null : /*Error: Function owner not recognized*/_assert("dictFetchValue(d, key)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 115));
			ModernizedCProgram.sdsfree(key);
		}
	}
	public void redis_del(int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/srand(1992);
		for (i = 0; i < times; ++i) {
			j = /*Error: Function owner not recognized*/rand() % times;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			d.dictDelete(key);
			ModernizedCProgram.sdsfree(key);
		}
	}
	/* Create a new hash table */
	public dict dictCreate(dictType type, Object privDataPtr) {
		dict d = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		ModernizedCProgram._dictInit(d, type, privDataPtr);
		return d;
	}
	/* Resize the table to the minimal size that contains all the elements,
	 * but with the invariant of a USED/BUCKETS ratio near to <= 1 */
	public int dictResize() {
		int minimal;
		int generatedRehashidx = (d).getRehashidx();
		if (!ModernizedCProgram.dict_can_resize || (generatedRehashidx != -1)) {
			return 1;
		} 
		Object[] generatedHt = this.getHt();
		minimal = generatedHt[0].getUsed();
		if (minimal < 4) {
			minimal = 4;
		} 
		return d.dictExpand(minimal);
	}
	/* Expand or create the hash table */
	public int dictExpand(long size) {
		/* the new hash table */dictht n = new dictht();
		long realsize = ModernizedCProgram._dictNextPower(size);
		int generatedRehashidx = (d).getRehashidx();
		Object[] generatedHt = this.getHt();
		if ((generatedRehashidx != -1) || generatedHt[0].getUsed() > /* the size is invalid if it is smaller than the number of
		     * elements already inside the hash table */size) {
			return 1;
		} 
		n.setSize(/* Allocate the new hash table and initialize all pointers to NULL */realsize);
		n.setSizemask(realsize - 1);
		n.setTable(/*Error: Function owner not recognized*/malloc(realsize * /*Error: Unsupported expression*/));
		n.setUsed(0);
		if (generatedHt[0].getTable() == (null)) {
			generatedHt[0] = n;
			return 0;
		} 
		generatedHt[1] = /* Prepare a second hash table for incremental rehashing */n;
		this.setRehashidx(0);
		return 0/* Performs N steps of incremental rehashing. Returns 1 if there are still
		 * keys to move from the old to the new hash table, otherwise 0 is returned.
		 * Note that a rehashing step consists in moving a bucket (that may have more
		 * thank one key as we use chaining) from the old to the new hash table. */;
	}
	public int dictRehash(int n) {
		int generatedRehashidx = (d).getRehashidx();
		if (!(generatedRehashidx != -1)) {
			return 0;
		} 
		Object[] generatedHt = this.getHt();
		dictEntry generatedNext = de.getNext();
		Object generatedKey = de.getKey();
		while (n--) {
			dictEntry de = new dictEntry();
			dictEntry nextde = new dictEntry();
			if (generatedHt[0].getUsed() == /* Check if we already rehashed the whole table... */0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedHt[0].getTable());
				generatedHt[0] = generatedHt[1];
				generatedHt[1]._dictReset();
				this.setRehashidx(-1);
				return 0;
			} 
			((generatedHt[0].getSize() > (int)generatedRehashidx) ? null : /*Error: Function owner not recognized*/_assert("d->ht[0].size > (unsigned)d->rehashidx", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\redis-dict.c", /* Note that rehashidx can't overflow as we are sure there are more
			         * elements because ht[0].used != 0 */257));
			while (generatedHt[0].getTable()[generatedRehashidx] == (null)) {
				generatedRehashidx++;
			}
			de = generatedHt[0].getTable()[generatedRehashidx];
			while (/* Move all the keys in this bucket from the old to the new hash HT */de) {
				int h;
				nextde = generatedNext;
				h = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedKey) & generatedHt[1].getSizemask();
				de.setNext(generatedHt[1].getTable()[h]);
				generatedHt[1].getTable()[h] = de;
				generatedHt[0].getUsed()--;
				generatedHt[1].getUsed()++;
				de = nextde;
			}
			generatedHt[0].getTable()[generatedRehashidx] = (null);
			generatedRehashidx++;
		}
		return 1;
	}
	/* Rehash for an amount of time between ms milliseconds and ms+1 milliseconds */
	public int dictRehashMilliseconds(int ms) {
		long start = ModernizedCProgram.timeInMilliseconds();
		int rehashes = 0;
		while (d.dictRehash(100)) {
			rehashes += 100;
			if (ModernizedCProgram.timeInMilliseconds() - start > ms) {
				break;
			} 
		}
		return rehashes/* This function performs just a step of rehashing, and only if there are
		 * no safe iterators bound to our hash table. When we have iterators in the
		 * middle of a rehashing we can't mess with the two hash tables otherwise
		 * some element can be missed or duplicated.
		 *
		 * This function is called by common lookup or update operations in the
		 * dictionary so that the hash table automatically migrates from H1 to H2
		 * while it is actively used. */;
	}
	public void _dictRehashStep() {
		int generatedIterators = this.getIterators();
		if (generatedIterators == 0) {
			d.dictRehash(1);
		} 
	}
	/* Add an element to the target hash table */
	public int dictAdd(Object key, Object val) {
		dictEntry dictEntry = new dictEntry();
		dictEntry entry = dictEntry.dictAddRaw(d, key);
		if (!entry) {
			return 1;
		} 
		dictType generatedType = (d).getType();
		Object generatedValDup = generatedType.getValDup();
		Object generatedPrivdata = (d).getPrivdata();
		 generatedV = entry.getV();
		do {
			if (generatedValDup) {
				generatedV.setVal(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, val));
			} else {
					generatedV.setVal((val));
			} 
		} while (0);
		return 0/* Low level add. This function adds the entry but instead of setting
		 * a value returns the dictEntry structure to the user, that will make
		 * sure to fill the value field as he wishes.
		 *
		 * This function is also directly exposed to the user API to be called
		 * mainly in order to store non-pointers inside the hash value, example:
		 *
		 * entry = dictAddRaw(dict,mykey);
		 * if (entry != NULL) dictSetSignedIntegerVal(entry,1000);
		 *
		 * Return values:
		 *
		 * If key already exists NULL is returned.
		 * If key was added, the hash entry is returned to be manipulated by the caller.
		 */;
	}
	public int dictReplace(Object key, Object val) {
		dictEntry entry = new dictEntry();
		dictEntry auxentry = new dictEntry();
		if (d.dictAdd(key, val) == /* Try to add the element. If the key
		     * does not exists dictAdd will suceed. */0) {
			return 1;
		} 
		dictEntry dictEntry = new dictEntry();
		entry = dictEntry.dictFind(d, /* It already exists, get the entry */key/* Set the new value and free the old one. Note that it is important
		     * to do that in this order, as the value may just be exactly the same
		     * as the previous one. In this context, think to reference counting,
		     * you want to increment (set), and then decrement (free), and not the
		     * reverse. */);
		auxentry = entry;
		dictType generatedType = (d).getType();
		Object generatedValDup = generatedType.getValDup();
		Object generatedPrivdata = (d).getPrivdata();
		 generatedV = entry.getV();
		do {
			if (generatedValDup) {
				generatedV.setVal(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, val));
			} else {
					generatedV.setVal((val));
			} 
		} while (0);
		Object generatedValDestructor = generatedType.getValDestructor();
		Object generatedVal = generatedV.getVal();
		if (generatedValDestructor) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, generatedVal);
		} 
		return 0/* dictReplaceRaw() is simply a version of dictAddRaw() that always
		 * returns the hash entry of the specified key, even if the key already
		 * exists and can't be added (in that case the entry of the already
		 * existing key is returned.)
		 *
		 * See dictAddRaw() for more information. */;
	}
	/* Search and remove an element */
	public int dictGenericDelete(Object key, int nofree) {
		int h;
		int idx;
		dictEntry he = new dictEntry();
		dictEntry prevHe = new dictEntry();
		int table;
		Object[] generatedHt = this.getHt();
		if (generatedHt[0].getSize() == 0) {
			return /* d->ht[0].table is NULL */1;
		} 
		int generatedRehashidx = (d).getRehashidx();
		if ((generatedRehashidx != -1)) {
			d._dictRehashStep();
		} 
		h = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(key);
		dictType generatedType = (d).getType();
		Object generatedKeyCompare = generatedType.getKeyCompare();
		Object generatedPrivdata = (d).getPrivdata();
		Object generatedKey = he.getKey();
		dictEntry generatedNext = he.getNext();
		Object generatedKeyDestructor = generatedType.getKeyDestructor();
		Object generatedValDestructor = generatedType.getValDestructor();
		 generatedV = (he).getV();
		Object generatedVal = generatedV.getVal();
		for (table = 0; table <= 1; table++) {
			idx = h & generatedHt[table].getSizemask();
			he = generatedHt[table].getTable()[idx];
			prevHe = (null);
			while (he) {
				if (((generatedKeyCompare) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, key, generatedKey) : (key) == (generatedKey))) {
					if (/* Unlink the element from the list */prevHe) {
						prevHe.setNext(generatedNext);
					} else {
							generatedHt[table].getTable()[idx] = generatedNext;
					} 
					if (!nofree) {
						if (generatedKeyDestructor) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, generatedKey);
						} 
						if (generatedValDestructor) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, generatedVal);
						} 
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(he);
					generatedHt[table].getUsed()--;
					return 0;
				} 
				prevHe = he;
				he = generatedNext;
			}
			if (!(generatedRehashidx != -1)) {
				break;
			} 
		}
		return /* not found */1;
	}
	public int dictDelete(Object key) {
		return ht.dictGenericDelete(key, 0);
	}
	public int dictDeleteNoFree(Object key) {
		return ht.dictGenericDelete(key, 1);
	}
	/* Clear & Release the hash table */
	public void dictRelease() {
		Object[] generatedHt = this.getHt();
		ModernizedCProgram._dictClear(d, generatedHt[0]);
		ModernizedCProgram._dictClear(d, generatedHt[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(d);
	}
	public Object dictFetchValue(Object key) {
		dictEntry he = new dictEntry();
		dictEntry dictEntry = new dictEntry();
		he = dictEntry.dictFind(d, key);
		 generatedV = (he).getV();
		Object generatedVal = generatedV.getVal();
		return he ? (generatedVal) : (null);
	}
	/* Expand the hash table if needed */
	public int _dictExpandIfNeeded() {
		int generatedRehashidx = (d).getRehashidx();
		if ((generatedRehashidx != -1)) {
			return /* Incremental rehashing already in progress. Return. */0;
		} 
		Object[] generatedHt = this.getHt();
		if (generatedHt[0].getSize() == 0) {
			return d.dictExpand(/* If the hash table is empty expand it to the initial size. */4/* If we reached the 1:1 ratio, and we are allowed to resize the hash
			     * table (global setting) or we should avoid it but the ratio between
			     * elements/buckets is over the "safe" threshold, we resize doubling
			     * the number of buckets. */);
		} 
		if (generatedHt[0].getUsed() >= generatedHt[0].getSize() && (ModernizedCProgram.dict_can_resize || generatedHt[0].getUsed() / generatedHt[0].getSize() > ModernizedCProgram.dict_force_resize_ratio)) {
			return d.dictExpand(generatedHt[0].getUsed() * 2);
		} 
		return 0;
	}
	public int _dictKeyIndex(Object key) {
		int h;
		int idx;
		int table;
		dictEntry he = new dictEntry();
		if (d._dictExpandIfNeeded() == /* Expand the hash table if needed */1) {
			return -1;
		} 
		h = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/* Compute the key hash value */key);
		Object[] generatedHt = this.getHt();
		dictType generatedType = (d).getType();
		Object generatedKeyCompare = generatedType.getKeyCompare();
		Object generatedPrivdata = (d).getPrivdata();
		Object generatedKey = he.getKey();
		dictEntry generatedNext = he.getNext();
		int generatedRehashidx = (d).getRehashidx();
		for (table = 0; table <= 1; table++) {
			idx = h & generatedHt[table].getSizemask();
			he = generatedHt[table].getTable()[/* Search if this slot does not already contain the given key */idx];
			while (he) {
				if (((generatedKeyCompare) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, key, generatedKey) : (key) == (generatedKey))) {
					return -1;
				} 
				he = generatedNext;
			}
			if (!(generatedRehashidx != -1)) {
				break;
			} 
		}
		return idx;
	}
	public void dictEmpty() {
		Object[] generatedHt = this.getHt();
		ModernizedCProgram._dictClear(d, generatedHt[0]);
		ModernizedCProgram._dictClear(d, generatedHt[1]);
		this.setRehashidx(-1);
		this.setIterators(0);
	}
	public dictType getType() {
		return type;
	}
	public void setType(dictType newType) {
		type = newType;
	}
	public Object getPrivdata() {
		return privdata;
	}
	public void setPrivdata(Object newPrivdata) {
		privdata = newPrivdata;
	}
	public Object[] getHt() {
		return ht;
	}
	public void setHt(Object[] newHt) {
		ht = newHt;
	}
	public int getRehashidx() {
		return rehashidx;
	}
	public void setRehashidx(int newRehashidx) {
		rehashidx = newRehashidx;
	}
	public int getIterators() {
		return iterators;
	}
	public void setIterators(int newIterators) {
		iterators = newIterators;
	}
}
