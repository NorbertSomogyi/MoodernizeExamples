package application;

/* Hash Tables Implementation.
 *
 * This file implements in-memory hash tables with insert/del/replace/find/
 * get-random-element operations. Hash tables will auto-resize if needed
 * tables of power of two in size are used, collisions are handled by
 * chaining. See the source code for more information... :)
 *
 * Copyright (c) 2006-2012, Salvatore Sanfilippo <antirez at gmail dot com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   * Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of Redis nor the names of its contributors may be used
 *     to endorse or promote products derived from this software without
 *     specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
/* Unused arguments generate annoying warnings... */
public class dictEntry {
	private Object key;
	private  v;
	private dictEntry next;
	
	public dictEntry(Object key,  v, dictEntry next) {
		setKey(key);
		setV(v);
		setNext(next);
	}
	public dictEntry() {
	}
	
	public dictEntry dictAddRaw(dict d, Object key) {
		int index;
		dictEntry entry = new dictEntry();
		dictht ht = new dictht();
		int generatedRehashidx = (d).getRehashidx();
		if ((generatedRehashidx != -1)) {
			d._dictRehashStep();
		} 
		if ((index = d._dictKeyIndex(key)) == -/* Get the index of the new element, or -1 if
		     * the element already exists. */1) {
			return ((Object)0);
		} 
		Object generatedHt = d.getHt();
		ht = (generatedRehashidx != -1) ? generatedHt[1] : generatedHt[/* Allocate the memory and store the new entry */0];
		entry = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		dictEntry[][] generatedTable = ht.getTable();
		entry.setNext(generatedTable[index]);
		generatedTable[index] = entry;
		long generatedUsed = ht.getUsed();
		generatedUsed++;
		dictType generatedType = (d).getType();
		Object generatedKeyDup = generatedType.getKeyDup();
		Object generatedPrivdata = (d).getPrivdata();
		do {
			if (generatedKeyDup) {
				entry.setKey(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, key));
			} else {
					entry.setKey((key));
			} 
		} while (/* Set the hash entry fields. */0);
		return entry/* Add an element, discarding the old if the key already exists.
		 * Return 1 if the key was added from scratch, 0 if there was already an
		 * element with such key and dictReplace() just performed a value update
		 * operation. */;
	}
	public dictEntry dictReplaceRaw(dict d, Object key) {
		dictEntry dictEntry = new dictEntry();
		dictEntry entry = dictEntry.dictFind(d, key);
		dictEntry dictEntry = new dictEntry();
		return entry ? entry : dictEntry.dictAddRaw(d, key);
	}
	public dictEntry dictFind(dict d, Object key) {
		dictEntry he = new dictEntry();
		int h;
		int idx;
		int table;
		Object generatedHt = d.getHt();
		if (generatedHt[0].getSize() == 0) {
			return ((Object)/* We don't have a table at all */0);
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
		for (table = 0; table <= 1; table++) {
			idx = h & generatedHt[table].getSizemask();
			he = generatedHt[table].getTable()[idx];
			while (he) {
				if (((generatedKeyCompare) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, key, generatedKey) : (key) == (generatedKey))) {
					return he;
				} 
				he = generatedNext;
			}
			if (!(generatedRehashidx != -1)) {
				return ((Object)0);
			} 
		}
		return ((Object)0);
	}
	public dictEntry dictNext(dictIterator iter) {
		dictEntry generatedEntry = iter.getEntry();
		dict generatedD = iter.getD();
		Object generatedHt = generatedD.getHt();
		int generatedTable = iter.getTable();
		int generatedSafe = iter.getSafe();
		int generatedIndex = iter.getIndex();
		int generatedIterators = generatedD.getIterators();
		long generatedSize = ht.getSize();
		int generatedRehashidx = (generatedD).getRehashidx();
		dictEntry generatedNextEntry = iter.getNextEntry();
		dictEntry generatedNext = generatedEntry.getNext();
		while (1) {
			if (generatedEntry == ((Object)0)) {
				dictht ht = generatedHt[generatedTable];
				if (generatedSafe && generatedIndex == -1 && generatedTable == 0) {
					generatedIterators++;
				} 
				generatedIndex++;
				if (generatedIndex >= (int)generatedSize) {
					if ((generatedRehashidx != -1) && generatedTable == 0) {
						generatedTable++;
						iter.setIndex(0);
						ht = generatedHt[1];
					} else {
							break;
					} 
				} 
				iter.setEntry(generatedTable[generatedIndex]);
			} else {
					iter.setEntry(generatedNextEntry);
			} 
			if (generatedEntry) {
				iter.setNextEntry(generatedNext);
				return generatedEntry;
			} 
		}
		return ((Object)0);
	}
	/* Return a random entry from the hash table. Useful to
	 * implement randomized algorithms */
	public dictEntry dictGetRandomKey(dict d) {
		dictEntry he = new dictEntry();
		dictEntry orighe = new dictEntry();
		int h;
		int listlen;
		int listele;
		Object generatedHt = (d).getHt();
		if ((generatedHt[0].getUsed() + generatedHt[1].getUsed()) == 0) {
			return ((Object)0);
		} 
		int generatedRehashidx = (d).getRehashidx();
		if ((generatedRehashidx != -1)) {
			d._dictRehashStep();
		} 
		if ((generatedRehashidx != -1)) {
			do {
				h = 1220 % (generatedHt[0].getSize() + generatedHt[1].getSize());
				he = (h >= generatedHt[0].getSize()) ? generatedHt[1].getTable()[h - generatedHt[0].getSize()] : generatedHt[0].getTable()[h];
			} while (he == ((Object)0));
		} else {
				do {
					h = 1220 & generatedHt[0].getSizemask();
					he = generatedHt[0].getTable()[h];
				} while (he == ((Object)0/* Now we found a non empty bucket, but it is a linked
				     * list and we need to get a random element from the list.
				     * The only sane way to do so is counting the elements and
				     * select a random index. */));
		} 
		listlen = 0;
		orighe = he;
		dictEntry generatedNext = he.getNext();
		while (he) {
			he = generatedNext;
			listlen++;
		}
		listele = 1220 % listlen;
		he = orighe;
		while (listele--) {
			he = generatedNext;
		}
		return he/* ------------------------- private functions ------------------------------ */;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public  getV() {
		return v;
	}
	public void setV( newV) {
		v = newV;
	}
	public dictEntry getNext() {
		return next;
	}
	public void setNext(dictEntry newNext) {
		next = newNext;
	}
}
