package application;

public class ModernizedCProgram {
	public static int key_compare_func;
	public static bftree bftree_create = new bftree();
	public static Object bftree_free;
	public static int bftree_put;
	public static Object bftree_get;
	public static int bftree_del;
	public static int bftree_count;
	public static bftree_iterator bftree_get_iterator = new bftree_iterator();
	public static payload bftree_next = new payload();
	public static Object bftree_free_iterator;
	public static dictType sdsdict_type = new dictType(/* hash function */dictSdsHash, (null), (null), /* key compare */dictSdsKeyCompare, /* key destructor */dictSdsDestructor, /* val destructor */dictSdsDestructor);
	public static bftree bftmap_create = new bftree();
	public static Object bftmap_free;
	public static int bftmap_put;
	public static Object bftmap_get;
	public static int bftmap_del;
	public static int dict_can_resize = /* Hash Tables Implementation.
	 *
	 * This file implements in memory hash tables with insert/del/replace/find/
	 * get-random-element operations. Hash tables will auto resize if needed
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
	 *//* Using dictEnableResize() / dictDisableResize() we make possible to
	 * enable/disable resizing of the hash table as needed. This is very important
	 * for Redis, as we use copy-on-write and don't want to move too much memory
	 * around when there is a child performing saving operations.
	 *
	 * Note that even when dict_can_resize is set to 0, not all resizes are
	 * prevented: an hash table is still allowed to grow if the ratio between
	 * the number of elements and the buckets > dict_force_resize_ratio. */1;
	public static int dict_force_resize_ratio = 5/* -------------------------- private prototypes ---------------------------- */;
	public static int _dictExpandIfNeeded;
	public static long _dictNextPower;
	public static int _dictKeyIndex;
	public static int _dictInit;
	public static uint32_t dict_hash_function_seed = 5381;
	public static dict dictCreate = new dict();
	public static int dictExpand;
	public static int dictAdd;
	public static dictEntry dictAddRaw = new dictEntry();
	public static int dictReplace;
	public static dictEntry dictReplaceRaw = new dictEntry();
	public static int dictDelete;
	public static int dictDeleteNoFree;
	public static Object dictRelease;
	public static dictEntry dictFind = new dictEntry();
	public static Object dictFetchValue;
	public static int dictResize;
	public static dictIterator dictGetIterator = new dictIterator();
	public static dictIterator dictGetSafeIterator = new dictIterator();
	public static dictEntry dictNext = new dictEntry();
	public static Object dictReleaseIterator;
	public static dictEntry dictGetRandomKey = new dictEntry();
	public static Object dictPrintStats;
	public static int dictGenHashFunction;
	public static int dictGenCaseHashFunction;
	public static Object dictEmpty;
	public static Object dictEnableResize;
	public static Object dictDisableResize;
	public static int dictRehash;
	public static int dictRehashMilliseconds;
	public static Object dictSetHashFunctionSeed;
	public static int dictGetHashFunctionSeed;
	public static dictType dictTypeHeapStringCopyKey = new dictType();
	public static dictType dictTypeHeapStrings = new dictType();
	public static dictType dictTypeHeapStringCopyKeyValue = new dictType();
	public static bftree bftset_create = new bftree();
	public static Object bftset_free;
	public static int bftset_put;
	public static Object bftset_get;
	public static int bftset_del;
	public static Byte sds;
	public static sds sdsnewlen = new sds();
	public static sds sdsnew = new sds();
	public static sds sdsempty = new sds();
	public static size_t sdslen = new size_t();
	public static sds sdsdup = new sds();
	public static Object sdsfree;
	public static size_t sdsavail = new size_t();
	public static sds sdsgrowzero = new sds();
	public static sds sdscatlen = new sds();
	public static sds sdscat = new sds();
	public static sds sdscatsds = new sds();
	public static sds sdscpylen = new sds();
	public static sds sdscpy = new sds();
	public static sds sdscatvprintf = new sds();
	public static sds sdscatprintf = new sds();
	public static sds sdstrim = new sds();
	public static sds sdsrange = new sds();
	public static Object sdsupdatelen;
	public static Object sdsclear;
	public static int sdscmp;
	public static sds sdssplitlen = new sds();
	public static Object sdsfreesplitres;
	public static Object sdstolower;
	public static Object sdstoupper;
	public static sds sdsfromlonglong = new sds();
	public static sds sdscatrepr = new sds();
	public static sds sdssplitargs = new sds();
	public static sds sdsmapchars = new sds();
	public static sds sdsMakeRoomFor = new sds();
	public static Object sdsIncrLen;
	public static sds sdsRemoveFreeSpace = new sds();
	public static size_t sdsAllocSize = new size_t();
	public static container container_insert = new container();
	public static Object bftree_node_print;
	public static Object validate_containers;
	public static Byte wstr;
	public static bftree_opts map_opt = new bftree_opts((null), (null), wstr_keycompare, (Object)wstr_free, free);
	
	
	public static void bftree_iter_set_del(bftree_iterator iter, payload payload) {
		payload.setType(payload_type.Del);
	}
	public static void bftree_iter_set_val(bftree_iterator iter, payload payload, Object val) {
		payload.setVal(val);
	}
	public static int dictSdsHash(Object key) {
		return ModernizedCProgram.dictGenHashFunction((byte)key, ModernizedCProgram.sdslen((byte)key));
	}
	public static void dictSdsDestructor(Object privdata, Object val) {
		ModernizedCProgram.sdsfree(val);
	}
	public static int dictSdsKeyCompare(Object privdata, Object key1, Object key2) {
		int l1;
		int l2;
		((Object)privdata);
		l1 = ModernizedCProgram.sdslen((sds)key1);
		l2 = ModernizedCProgram.sdslen((sds)key2);
		if (l1 != l2) {
			return 0;
		} 
		return /*Error: Function owner not recognized*/memcmp(key1, key2, l1) == 0;
	}
	public static int bftreeSdsKeyCompare(Object key1, Object key2) {
		int l1;
		int l2;
		l1 = ModernizedCProgram.sdslen((sds)key1);
		l2 = ModernizedCProgram.sdslen((sds)key2);
		if (l1 != l2) {
			return l1 < l2 ? -1 : 1;
		} 
		return /*Error: Function owner not recognized*/memcmp(key1, key2, l1);
	}
	public static int main(int argc, Object argv) {
		timeval start = new timeval();
		timeval end = new timeval();
		double elapsed;
		dict d = new dict();
		bftree tree = new bftree();
		int times = 500;
		bftree_opts opt = new bftree_opts((null), (null), bftreeSdsKeyCompare, (Object)ModernizedCProgram.sdsfree, (Object)ModernizedCProgram.sdsfree);
		bftree bftree = new bftree();
		tree = bftree.bftree_create(opt);
		dict dict = new dict();
		d = dict.dictCreate(ModernizedCProgram.sdsdict_type, (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		d.redis_add(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		Object generatedTv_sec = end.getTv_sec();
		Object generatedTv_usec = end.getTv_usec();
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("redis add %d elements seconds: %f\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		tree = tree.bftree_add(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("bftree add %d elements seconds: %f\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		d.redis_fetch(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("redis get %d elements seconds: %f\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		tree.bftree_fetch(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("bftree get %d elements seconds: %f\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		d.redis_del(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("redis delete %d elements seconds: %f\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(start, (null));
		tree.bftree_delele(times);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(end, (null));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		System.out.println("bftree delete %d elements seconds: %f\n");
		tree.bftree_free();
		d.dictRelease();
		return 0;
	}
	/* Thomas Wang's 32 bit Mix Function */
	public static int dictIntHashFunction(int key) {
		key += ~(key << 15);
		key ^=  (key >> 10);
		key += (key << 3);
		key ^=  (key >> 6);
		key += ~(key << 11);
		key ^=  (key >> 16);
		return key;
	}
	/* Identity hash function for integer keys */
	public static int dictIdentityHashFunction(int key) {
		return key;
	}
	public static void dictSetHashFunctionSeed(Object seed) {
		ModernizedCProgram.dict_hash_function_seed = seed;
	}
	public static Object dictGetHashFunctionSeed() {
		return ModernizedCProgram.dict_hash_function_seed/* MurmurHash2, by Austin Appleby
		 * Note - This code makes a few assumptions about how your machine behaves -
		 * 1. We can read a 4-byte value from any address without crashing
		 * 2. sizeof(int) == 4
		 *
		 * And it has a few limitations -
		 *
		 * 1. It will not work incrementally.
		 * 2. It will not produce the same results on little-endian and big-endian
		 *    machines.
		 */;
	}
	public static int dictGenHashFunction(Object key, int len) {
		uint32_t seed = ModernizedCProgram.dict_hash_function_seed;
		uint32_t m = -1024;
		int r = 24;
		uint32_t h = seed ^ /* Initialize the hash to a 'random' value */len;
		byte[] data = (byte)/* Mix 4 bytes at a time into the hash */key;
		while (len >= 4) {
			uint32_t k = (uint32_t)data;
			k *= m;
			k ^=  k >> r;
			k *= m;
			h *= m;
			h ^=  k;
			data += 4;
			len -= 4;
		}
		switch (/* Handle the last few bytes of the input array  */len) {
		case 2:
				h ^=  data[1] << 8;
		case 3:
				h ^=  data[2] << 16;
		case 1:
				h ^=  data[0];
				h *= m;
		}
		;
		h ^=  h >> /* Do a few final mixes of the hash to ensure the last few
		     * bytes are well-incorporated. */13;
		h *= m;
		h ^=  h >> 15;
		return (int)h;
	}
	/* 'm' and 'r' are mixing constants generated offline.
	     They're not really 'magic', they just happen to work well.  */
	/* And a case insensitive hash function (based on djb hash) */
	public static int dictGenCaseHashFunction(Object buf, int len) {
		int hash = (int)ModernizedCProgram.dict_hash_function_seed;
		while (len--) {
			hash = ((hash << 5) + hash) + (/*Error: Function owner not recognized*/tolower(/* hash * 33 + c */buf++));
		}
		return hash/* ----------------------------- API implementation ------------------------- */;
	}
	/* Initialize the hash table */
	public static int _dictInit(dict d, dictType type, Object privDataPtr) {
		Object[] generatedHt = d.getHt();
		generatedHt[0]._dictReset();
		generatedHt[1]._dictReset();
		d.setType(type);
		d.setPrivdata(privDataPtr);
		d.setRehashidx(-1);
		d.setIterators(0);
		return 0;
	}
	/* -------------------------- hash functions -------------------------------- */
	public static int timeInMilliseconds() {
		timeval tv = new timeval();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(tv, (null));
		Object generatedTv_sec = tv.getTv_sec();
		Object generatedTv_usec = tv.getTv_usec();
		return (((long)generatedTv_sec) * 1000) + (generatedTv_usec / 1000);
	}
	/* Destroy an entire dictionary */
	public static int _dictClear(dict d, dictht ht) {
		long i;
		long generatedSize = ht.getSize();
		long generatedUsed = ht.getUsed();
		dictEntry[][] generatedTable = ht.getTable();
		dictEntry generatedNext = he.getNext();
		dictType generatedType = (d).getType();
		Object generatedKeyDestructor = generatedType.getKeyDestructor();
		Object generatedPrivdata = (d).getPrivdata();
		Object generatedKey = (he).getKey();
		Object generatedValDestructor = generatedType.getValDestructor();
		 generatedV = (he).getV();
		Object generatedVal = generatedV.getVal();
		for (i = 0; i < generatedSize && generatedUsed > 0; /* Free all the elements */i++) {
			dictEntry he = new dictEntry();
			dictEntry nextHe = new dictEntry();
			if ((he = generatedTable[i]) == (null)) {
				continue;
			} 
			while (he) {
				nextHe = generatedNext;
				if (generatedKeyDestructor) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, generatedKey);
				} 
				if (generatedValDestructor) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPrivdata, generatedVal);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(he);
				generatedUsed--;
				he = nextHe;
			}
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedTable);
		/* Re-initialize the table */ht._dictReset();
		return /* never fails */0;
	}
	/* Our hash table capability is a power of two */
	public static long _dictNextPower(long size) {
		long i = 4;
		if (size >= -1024) {
			return -1024;
		} 
		while (1) {
			if (i >= size) {
				return i;
			} 
			i *= 2/* Returns the index of a free slot that can be populated with
			 * an hash entry for the given 'key'.
			 * If the key already exists, -1 is returned.
			 *
			 * Note that if we are in the process of rehashing the hash table, the
			 * index is always returned in the context of the second (new) hash table. */;
		}
	}
	public static void dictEnableResize() {
		ModernizedCProgram.dict_can_resize = 1;
	}
	public static void dictDisableResize() {
		ModernizedCProgram.dict_can_resize = 0/* The following is code that we don't use for Redis currently, but that is part
		of the library. */;
	}
	/* ----------------------- Debugging ------------------------*/
	/* For each hash entry on this slot... */
	/* ----------------------- StringCopy Hash Table Type ------------------------*/
	/* hash function */
	/* key dup */
	/* val dup */
	/* key compare */
	/* key destructor */
	/* val destructor */
	/* This is like StringCopy but does not auto-duplicate the key.
	 * It's used for intepreter's shared strings. */
	/* hash function */
	/* key dup */
	/* val dup */
	/* key compare */
	/* key destructor */
	/* val destructor */
	/* This is like StringCopy but also automatically handle dynamic
	 * allocated C strings as values. */
	/* hash function */
	/* key dup */
	/* val dup */
	/* key compare */
	/* key destructor */
	/* val destructor */
	public static void bftmap_example() {
		bftree tree = new bftree();
		int i;
		int len;
		byte[] buf = new byte[100];
		Byte val;
		bftree_iterator iter = new bftree_iterator();
		int count;
		bftree bftree = new bftree();
		tree = bftree.bftmap_create();
		for (i = 0; i < 1000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			val = /*Error: Function owner not recognized*/malloc(100);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(val, 100, "val%d", i);
			tree.bftmap_put(buf, len, val);
		}
		((tree.bftree_count() == 1000) ? null : /*Error: Function owner not recognized*/_assert("bftree_count(tree) == 1000", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\bftree_example.c", 25));
		count = 0;
		bftree_iterator bftree_iterator = new bftree_iterator();
		iter = bftree_iterator.bftree_get_iterator(tree);
		payload payload = new payload();
		while (payload.bftree_next(iter) != (null)) {
			count++;
		}
		iter.bftree_free_iterator();
		((count == 1000) ? null : /*Error: Function owner not recognized*/_assert("count == 1000", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\bftree_example.c", 32));
		for (i = 0; i < 10000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			tree.bftmap_del(buf, len);
		}
		for (i = 0; i < 1000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			tree.bftmap_get(buf, len);
		}
		tree.bftmap_free();
	}
	public static void bftset_example() {
		bftree tree = new bftree();
		int i;
		int len;
		byte[] buf = new byte[100];
		Byte val;
		bftree bftree = new bftree();
		tree = bftree.bftset_create();
		for (i = 0; i < 10000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			val = /*Error: Function owner not recognized*/malloc(100);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(val, 100, "val%d", i);
			tree.bftset_put(buf, len);
		}
		for (i = 0; i < 10000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			tree.bftset_del(buf, len);
		}
		for (i = 0; i < 10000; i++) {
			len = /*Error: Function owner not recognized*/snprintf(buf, 100, "key%d", i);
			tree.bftset_get(buf, len);
		}
		tree.bftmap_free();
	}
	/* SDSLib, A C dynamic strings library
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
	public static Object sdsnewlen(Object init, Object initlen) {
		sdshdr sh = new sdshdr();
		if (init) {
			sh = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ + initlen + 1);
		} else {
				sh = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ + initlen + 1);
		} 
		if (sh == (null)) {
			return (null);
		} 
		sh.setLen(initlen);
		sh.setFree(0);
		Object[] generatedBuf = sh.getBuf();
		if (initlen && init) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuf, init, initlen);
		} 
		generatedBuf[initlen] = (byte)'\0';
		return (byte)generatedBuf;
	}
	public static Object sdsempty() {
		return ModernizedCProgram.sdsnewlen("", 0);
	}
	public static Object sdsnew(Object init) {
		size_t initlen = (init == (null)) ? 0 : string.length();
		return ModernizedCProgram.sdsnewlen(init, initlen);
	}
	public static Object sdsdup(Object s) {
		return ModernizedCProgram.sdsnewlen(s, ModernizedCProgram.sdslen(s));
	}
	public static void sdsfree(Object s) {
		if (s == (null)) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s - /*Error: Unsupported expression*/);
	}
	public static void sdsupdatelen(Object s) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int reallen = string.length();
		int generatedFree = sh.getFree();
		int generatedLen = sh.getLen();
		generatedFree += (generatedLen - reallen);
		sh.setLen(reallen);
	}
	public static void sdsclear(Object s) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedFree = sh.getFree();
		int generatedLen = sh.getLen();
		generatedFree += generatedLen;
		sh.setLen(0);
		Object[] generatedBuf = sh.getBuf();
		generatedBuf[0] = (byte)'\0'/* Enlarge the free space at the end of the sds string so that the caller
		 * is sure that after calling this function can overwrite up to addlen
		 * bytes after the end of the string, plus one more byte for nul term.
		 *
		 * Note: this does not change the *size* of the sds string as returned
		 * by sdslen(), but only the free buffer space we have. */;
	}
	public static Object sdsMakeRoomFor(Object s, Object addlen) {
		sdshdr sh = new sdshdr();
		sdshdr newsh = new sdshdr();
		size_t free = ModernizedCProgram.sdsavail(s);
		size_t len = new size_t();
		size_t newlen = new size_t();
		if (free >= addlen) {
			return s;
		} 
		len = ModernizedCProgram.sdslen(s);
		sh = (Object)(s - (/*Error: Unsupported expression*/));
		newlen = (len + addlen);
		if (newlen < (1024 * 1024)) {
			newlen *= 2;
		} else {
				newlen += (1024 * 1024);
		} 
		newsh = /*Error: Function owner not recognized*/realloc(sh, /*Error: Unsupported expression*/ + newlen + 1);
		if (newsh == (null)) {
			return (null);
		} 
		newsh.setFree(newlen - len);
		Object[] generatedBuf = newsh.getBuf();
		return generatedBuf;
	}
	public static Object sdsRemoveFreeSpace(Object s) {
		sdshdr sh = new sdshdr();
		sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedLen = sh.getLen();
		sh = /*Error: Function owner not recognized*/realloc(sh, /*Error: Unsupported expression*/ + generatedLen + 1);
		sh.setFree(0);
		Object[] generatedBuf = sh.getBuf();
		return generatedBuf;
	}
	public static Object sdsAllocSize(Object s) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedLen = sh.getLen();
		int generatedFree = sh.getFree();
		return /*Error: sizeof expression not supported yet*/ + generatedLen + generatedFree + 1/* Increment the sds length and decrements the left free space at the
		 * end of the string accordingly to 'incr'. Also set the null term
		 * in the new end of the string.
		 *
		 * This function is used in order to fix the string length after the
		 * user calls sdsMakeRoomFor(), writes something after the end of
		 * the current string, and finally needs to set the new length.
		 *
		 * Note: it is possible to use a negative increment in order to
		 * right-trim the string.
		 *
		 * Using sdsIncrLen() and sdsMakeRoomFor() it is possible to mount the
		 * following schema to cat bytes coming from the kernel to the end of an
		 * sds string new things without copying into an intermediate buffer:
		 *
		 * oldlen = sdslen(s);
		 * s = sdsMakeRoomFor(s, BUFFER_SIZE);
		 * nread = read(fd, s+oldlen, BUFFER_SIZE);
		 * ... check for nread <= 0 and handle it ...
		 * sdsIncrLen(s, nhread);
		 */;
	}
	public static void sdsIncrLen(Object s, int incr) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedFree = sh.getFree();
		((generatedFree >= incr) ? null : /*Error: Function owner not recognized*/_assert("sh->free >= incr", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\sds.c", 155));
		int generatedLen = sh.getLen();
		generatedLen += incr;
		generatedFree -= incr;
		((generatedFree >= 0) ? null : /*Error: Function owner not recognized*/_assert("sh->free >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\sds.c", 158));
		s[generatedLen] = (byte)'\0';
	}
	/* Grow the sds to have the specified length. Bytes that were not part of
	 * the original length of the sds will be set to zero. */
	public static Object sdsgrowzero(Object s, Object len) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedLen = sh.getLen();
		size_t totlen = new size_t();
		size_t curlen = generatedLen;
		if (len <= curlen) {
			return s;
		} 
		s = ModernizedCProgram.sdsMakeRoomFor(s, len - curlen);
		if (s == (null)) {
			return (null);
		} 
		sh = (Object)(s - (/*Error: Unsupported expression*//* Make sure added region doesn't contain garbage */));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(s + curlen, 0, (len - curlen + /* also set trailing \0 byte */1));
		int generatedFree = sh.getFree();
		totlen = generatedLen + generatedFree;
		sh.setLen(len);
		sh.setFree(totlen - generatedLen);
		return s;
	}
	public static Object sdscatlen(Object s, Object t, Object len) {
		sdshdr sh = new sdshdr();
		size_t curlen = ModernizedCProgram.sdslen(s);
		s = ModernizedCProgram.sdsMakeRoomFor(s, len);
		if (s == (null)) {
			return (null);
		} 
		sh = (Object)(s - (/*Error: Unsupported expression*/));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(s + curlen, t, len);
		sh.setLen(curlen + len);
		int generatedFree = sh.getFree();
		sh.setFree(generatedFree - len);
		s[curlen + len] = (byte)'\0';
		return s;
	}
	public static Object sdscat(Object s, Object t) {
		return ModernizedCProgram.sdscatlen(s, t, string.length());
	}
	public static Object sdscatsds(Object s, Object t) {
		return ModernizedCProgram.sdscatlen(s, t, ModernizedCProgram.sdslen(t));
	}
	public static Object sdscpylen(Object s, Object t, Object len) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedFree = sh.getFree();
		int generatedLen = sh.getLen();
		size_t totlen = generatedFree + generatedLen;
		if (totlen < len) {
			s = ModernizedCProgram.sdsMakeRoomFor(s, len - generatedLen);
			if (s == (null)) {
				return (null);
			} 
			sh = (Object)(s - (/*Error: Unsupported expression*/));
			totlen = generatedFree + generatedLen;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(s, t, len);
		s[len] = (byte)'\0';
		sh.setLen(len);
		sh.setFree(totlen - len);
		return s;
	}
	public static Object sdscpy(Object s, Object t) {
		return ModernizedCProgram.sdscpylen(s, t, string.length());
	}
	public static Object sdscatvprintf(Object s, Object fmt, Object ap) {
		va_list cpy = new va_list();
		byte[] buf;
		Byte t;
		size_t buflen = 16;
		while (1) {
			buf = /*Error: Function owner not recognized*/malloc(buflen);
			if (buf == (null)) {
				return (null);
			} 
			buf[buflen - 2] = (byte)'\0';
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_copy(cpy, ap);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vsnprintf(buf, buflen, fmt, cpy);
			if (buf[buflen - 2] != (byte)'\0') {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
				buflen *= 2;
				continue;
			} 
			break;
		}
		t = ModernizedCProgram.sdscat(s, buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
		return t;
	}
	public static Object sdscatprintf(Object s, Object fmt) {
		va_list ap = new va_list();
		Byte t;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		t = ModernizedCProgram.sdscatvprintf(s, fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		return t;
	}
	public static Object sdstrim(Object s, Object cset) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		Byte start;
		Byte end;
		Byte sp;
		Byte ep;
		size_t len = new size_t();
		sp = start = s;
		ep = end = s + ModernizedCProgram.sdslen(s) - 1;
		while (sp <= end && string.indexOf(sp)) {
			sp++;
		}
		while (ep > start && string.indexOf(ep)) {
			ep--;
		}
		len = (sp > ep) ? 0 : ((ep - sp) + 1);
		Object[] generatedBuf = sh.getBuf();
		if (generatedBuf != sp) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBuf, sp, len);
		} 
		generatedBuf[len] = (byte)'\0';
		int generatedFree = sh.getFree();
		int generatedLen = sh.getLen();
		sh.setFree(generatedFree + (generatedLen - len));
		sh.setLen(len);
		return s;
	}
	public static Object sdsrange(Object s, int start, int end) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		size_t newlen = new size_t();
		size_t len = ModernizedCProgram.sdslen(s);
		if (len == 0) {
			return s;
		} 
		if (start < 0) {
			start = len + start;
			if (start < 0) {
				start = 0;
			} 
		} 
		if (end < 0) {
			end = len + end;
			if (end < 0) {
				end = 0;
			} 
		} 
		newlen = (start > end) ? 0 : (end - start) + 1;
		if (newlen != 0) {
			if (start >= (int)len) {
				newlen = 0;
			}  else if (end >= (int)len) {
				end = len - 1;
				newlen = (start > end) ? 0 : (end - start) + 1;
			} 
		} else {
				start = 0;
		} 
		Object[] generatedBuf = sh.getBuf();
		if (start && newlen) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBuf, generatedBuf + start, newlen);
		} 
		generatedBuf[newlen] = 0;
		int generatedFree = sh.getFree();
		int generatedLen = sh.getLen();
		sh.setFree(generatedFree + (generatedLen - newlen));
		sh.setLen(newlen);
		return s;
	}
	public static void sdstolower(Object s) {
		int len = ModernizedCProgram.sdslen(s);
		int j;
		for (j = 0; j < len; j++) {
			s[j] = /*Error: Function owner not recognized*/tolower(s[j]);
		}
	}
	public static void sdstoupper(Object s) {
		int len = ModernizedCProgram.sdslen(s);
		int j;
		for (j = 0; j < len; j++) {
			s[j] = /*Error: Function owner not recognized*/toupper(s[j]);
		}
	}
	public static int sdscmp(Object s1, Object s2) {
		size_t l1 = new size_t();
		size_t l2 = new size_t();
		size_t minlen = new size_t();
		int cmp;
		l1 = ModernizedCProgram.sdslen(s1);
		l2 = ModernizedCProgram.sdslen(s2);
		minlen = (l1 < l2) ? l1 : l2;
		cmp = /*Error: Function owner not recognized*/memcmp(s1, s2, minlen);
		if (cmp == 0) {
			return l1 - l2;
		} 
		return cmp/* Split 's' with separator in 'sep'. An array
		 * of sds strings is returned. *count will be set
		 * by reference to the number of tokens returned.
		 *
		 * On out of memory, zero length string, zero length
		 * separator, NULL is returned.
		 *
		 * Note that 'sep' is able to split a string using
		 * a multi-character separator. For example
		 * sdssplit("foo_-_bar","_-_"); will return two
		 * elements "foo" and "bar".
		 *
		 * This version of the function is binary-safe but
		 * requires length arguments. sdssplit() is just the
		 * same function but for zero-terminated strings.
		 */;
	}
	public static Object sdssplitlen(Object s, int len, Object[] sep, int seplen, Integer count) {
		int elements = 0;
		int slots = 5;
		int start = 0;
		int j;
		sds[] tokens = new sds();
		if (seplen < 1 || len < 0) {
			return (null);
		} 
		tokens = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ * slots);
		if (tokens == (null)) {
			return (null);
		} 
		if (len == 0) {
			count = 0;
			return tokens;
		} 
		for (j = 0; j < (len - (seplen - 1)); j++) {
			if (slots < elements + /* make sure there is room for the next element and the final one */2) {
				sds newtokens = new sds();
				slots *= 2;
				newtokens = /*Error: Function owner not recognized*/realloc(tokens, /*Error: Unsupported expression*/ * slots);
				if (newtokens == (null)) {
					;
				} 
				tokens = newtokens;
			} 
			if ((seplen == 1 && (s + j) == sep[0]) || (/*Error: Function owner not recognized*/memcmp(s + j, sep, seplen) == /* search the separator */0)) {
				tokens[elements] = ModernizedCProgram.sdsnewlen(s + start, j - start);
				if (tokens[elements] == (null)) {
					;
				} 
				elements++;
				start = j + seplen;
				j = j + seplen - /* skip the separator */1;
			} 
		}
		tokens[elements] = ModernizedCProgram.sdsnewlen(s + start, len - /* Add the final element. We are sure there is room in the tokens array. */start);
		if (tokens[elements] == (null)) {
			;
		} 
		elements++;
		count = elements;
		return tokens;
	}
	public static void sdsfreesplitres(Object[] tokens, int count) {
		if (!tokens) {
			return /*Error: Unsupported expression*/;
		} 
		while (count--) {
			ModernizedCProgram.sdsfree(tokens[count]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tokens);
	}
	public static Object sdsfromlonglong(int value) {
		byte[] buf = new byte[32];
		Byte p;
		long v;
		v = (value < 0) ? -value : value;
		p = buf + /* point to the last character */31;
		do {
			p-- = (byte)'0' + (v % 10);
			v /= 10;
		} while (v);
		if (value < 0) {
			p-- = (byte)'-';
		} 
		p++;
		return ModernizedCProgram.sdsnewlen(p, 32 - (p - buf));
	}
	public static Object sdscatrepr(Object s, Object p, Object len) {
		s = ModernizedCProgram.sdscatlen(s, "\"", 1);
		while (len--) {
			switch (p) {
			case (byte)'"':
					s = ModernizedCProgram.sdscatprintf(s, "\\%c", p);
					break;
			case (byte)'\n':
					s = ModernizedCProgram.sdscatlen(s, "\\n", 2);
					break;
			case (byte)'\\':
			case (byte)'\b':
					s = ModernizedCProgram.sdscatlen(s, "\\b", 2);
					break;
			case (byte)'\r':
					s = ModernizedCProgram.sdscatlen(s, "\\r", 2);
					break;
			case (byte)'\a':
					s = ModernizedCProgram.sdscatlen(s, "\\a", 2);
					break;
			case (byte)'\t':
					s = ModernizedCProgram.sdscatlen(s, "\\t", 2);
					break;
			default:
					if (/*Error: Function owner not recognized*/isprint(p)) {
						s = ModernizedCProgram.sdscatprintf(s, "%c", p);
					} else {
							s = ModernizedCProgram.sdscatprintf(s, "\\x%02x", (byte)p);
					} 
					break;
			}
			p++;
		}
		return ModernizedCProgram.sdscatlen(s, "\"", 1);
	}
	/* Helper function for sdssplitargs() that returns non zero if 'c'
	 * is a valid hex digit. */
	public static int is_hex_digit(byte c) {
		return (c >= (byte)'0' && c <= (byte)'9') || (c >= (byte)'a' && c <= (byte)'f') || (c >= (byte)'A' && c <= (byte)'F');
	}
	/* Helper function for sdssplitargs() that converts an hex digit into an
	 * integer from 0 to 15 */
	public static int hex_digit_to_int(byte c) {
		switch (c) {
		case (byte)'B':
				return 11;
		case (byte)'9':
				return 9;
		case (byte)'8':
				return 8;
		case (byte)'1':
				return 1;
		case (byte)'6':
				return 6;
		case (byte)'C':
				return 12;
		case (byte)'f':
		case (byte)'3':
				return 3;
		case (byte)'a':
		case (byte)'e':
		case (byte)'c':
		case (byte)'D':
				return 13;
		case (byte)'F':
				return 15;
		case (byte)'5':
				return 5;
		case (byte)'E':
				return 14;
		case (byte)'4':
				return 4;
		case (byte)'7':
				return 7;
		case (byte)'2':
				return 2;
		case (byte)'b':
		case (byte)'d':
		case (byte)'0':
				return 0;
		case (byte)'A':
				return 10;
		default:
				return 0/* Split a line into arguments, where every argument can be in the
				 * following programming-language REPL-alike form:
				 *
				 * foo bar "newline are supported\n" and "\xff\x00otherstuff"
				 *
				 * The number of arguments is stored into *argc, and an array
				 * of sds is returned.
				 *
				 * The caller should free the resulting array of sds strings with
				 * sdsfreesplitres().
				 *
				 * Note that sdscatrepr() is able to convert back a string into
				 * a quoted string in the same format sdssplitargs() is able to parse.
				 *
				 * The function returns the allocated tokens on success, even when the
				 * input string is empty, or NULL if the input contains unbalanced
				 * quotes or closed quotes followed by non space characters
				 * as in: "foo"bar or "foo'
				 */;
		}
	}
	public static Object sdssplitargs(Object line, Integer argc) {
		Byte p = line;
		Byte current = (null);
		byte[][] vector = (null);
		argc = 0;
		while (1) {
			while (p && /*Error: Function owner not recognized*/isspace(p)) {
				/* skip blanks */p++;
			}
			if (p) {
				int inq = /* get a token *//* set to 1 if we are in "quotes" */0;
				int insq = /* set to 1 if we are in 'single quotes' */0;
				int done = 0;
				if (current == (null)) {
					current = ModernizedCProgram.sdsempty();
				} 
				while (!done) {
					if (inq) {
						if (p == (byte)'\\' && (p + 1) == (byte)'x' && ModernizedCProgram.is_hex_digit((p + 2)) && ModernizedCProgram.is_hex_digit((p + 3))) {
							byte byte;
							byte = (ModernizedCProgram.hex_digit_to_int((p + 2)) * 16) + ModernizedCProgram.hex_digit_to_int((p + 3));
							current = ModernizedCProgram.sdscatlen(current, (byte)byte, 1);
							p += 3;
						}  else if (p == (byte)'\\' && (p + 1)) {
							byte c;
							p++;
							switch (p) {
							case (byte)'r':
									c = (byte)'\r';
									break;
							case (byte)'a':
									c = (byte)'\a';
									break;
							case (byte)'t':
									c = (byte)'\t';
									break;
							case (byte)'b':
									c = (byte)'\b';
									break;
							case (byte)'n':
									c = (byte)'\n';
									break;
							default:
									c = p;
									break;
							}
							current = ModernizedCProgram.sdscatlen(current, c, 1);
						}  else if (p == (byte)'"'/* closing quote must be followed by a space or
						                         * nothing at all. */) {
							if ((p + 1) && !/*Error: Function owner not recognized*/isspace((p + 1))) {
								;
							} 
							done = 1;
						}  else if (!p/* unterminated quotes */) {
							;
						} else {
								current = ModernizedCProgram.sdscatlen(current, p, 1);
						} 
					}  else if (insq) {
						if (p == (byte)'\\' && (p + 1) == (byte)'\'') {
							p++;
							current = ModernizedCProgram.sdscatlen(current, "'", 1);
						}  else if (p == (byte)'\''/* closing quote must be followed by a space or
						                         * nothing at all. */) {
							if ((p + 1) && !/*Error: Function owner not recognized*/isspace((p + 1))) {
								;
							} 
							done = 1;
						}  else if (!p/* unterminated quotes */) {
							;
						} else {
								current = ModernizedCProgram.sdscatlen(current, p, 1);
						} 
					} else {
							switch (p) {
							case (byte)'"':
									inq = 1;
									break;
							case (byte)'\r':
							case (byte)'\0':
									done = 1;
									break;
							case (byte)'\n':
							case (byte)'\'':
									insq = 1;
									break;
							case (byte)'\t':
							case (byte)' ':
							default:
									current = ModernizedCProgram.sdscatlen(current, p, 1);
									break;
							}
					} 
					if (p) {
						p++;
					} 
				}
				vector = /*Error: Function owner not recognized*/realloc(vector, ((argc) + 1) * /*Error: Unsupported expression*//* add the token to the vector */);
				vector[argc] = current;
				(argc)++;
				current = (null);
			} else {
					if (vector == (null)) {
						vector = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*//* Even on empty input string return something not NULL. */);
					} 
					return vector;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(vector);
		if (current) {
			ModernizedCProgram.sdsfree(current);
		} 
		argc = 0;
		return (null);
	}
	public static Object sdsmapchars(Object s, Object[] from, Object[] to, Object setlen) {
		size_t j = new size_t();
		size_t i = new size_t();
		size_t l = ModernizedCProgram.sdslen(s);
		for (j = 0; j < l; j++) {
			for (i = 0; i < setlen; i++) {
				if (s[j] == from[i]) {
					s[j] = to[i];
					break;
				} 
			}
		}
		return s;
	}
	public static Object sdslen(Object s) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedLen = sh.getLen();
		return generatedLen;
	}
	public static Object sdsavail(Object s) {
		sdshdr sh = (Object)(s - (/*Error: Unsupported expression*/));
		int generatedFree = sh.getFree();
		return generatedFree;
	}
	public static void payload_free(bftree tree, payload payload, int nofree) {
		Object generatedKey = payload.getKey();
		bftree_opts generatedOpts = tree.getOpts();
		Object generatedKey_destructor = generatedOpts.getKey_destructor();
		if (generatedKey && generatedKey_destructor) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedKey);
		} 
		Object generatedVal = payload.getVal();
		Object generatedVal_destructor = generatedOpts.getVal_destructor();
		if (generatedVal && generatedVal_destructor && !nofree) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedVal);
		} 
		payload_type generatedType = payload.getType();
		Object generatedPut_payload_count = tree.getPut_payload_count();
		Object generatedDel_payload_count = tree.getDel_payload_count();
		if (generatedType == payload_type.Put) {
			generatedPut_payload_count--;
		} else {
				generatedDel_payload_count--;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(payload);
	}
	public static void payload_replace(bftree tree, payload older, payload newer) {
		Object temp;
		Object generatedVal = older.getVal();
		temp = generatedVal;
		older.setVal(generatedVal);
		newer.setVal(temp);
		payload_type generatedType = newer.getType();
		older.setType(generatedType);
		ModernizedCProgram.payload_free(tree, newer, 0);
	}
	public static void container_free(bftree tree, container container) {
		payload curr = new payload();
		payload next = new payload();
		payload generatedPayload_first = container.getPayload_first();
		curr = generatedPayload_first;
		payload generatedNext = curr.getNext();
		while (curr) {
			next = generatedNext;
			ModernizedCProgram.payload_free(tree, curr, 0);
			curr = next;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(container);
	}
	public static void node_free(bftree tree, node node) {
		int i;
		container container = new container();
		Object generatedContainer_size = node.getContainer_size();
		container[][] generatedContainers = node.getContainers();
		for (i = 0; i < generatedContainer_size; i++) {
			container = generatedContainers[i];
			ModernizedCProgram.container_free(tree, container);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedContainers);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(node);
	}
	public static void bftree_free_node(bftree tree, node node) {
		int i;
		container container = new container();
		Object generatedContainer_size = node.getContainer_size();
		container[][] generatedContainers = node.getContainers();
		node generatedChild = container.getChild();
		for (i = 0; i < generatedContainer_size; i++) {
			container = generatedContainers[i];
			if (generatedChild) {
				ModernizedCProgram.bftree_free_node(tree, generatedChild);
			} 
		}
		ModernizedCProgram.node_free(tree, node);
	}
	public static void push_to_child(bftree tree, node node, container container) {
		payload curr_payload = new payload();
		payload next_payload = new payload();
		uint32_t child_container = new uint32_t();
		uint32_t push_count = new uint32_t();
		key_compare_func compare = new key_compare_func();
		bftree_opts generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		compare = generatedKey_compare;
		payload generatedPayload_first = container.getPayload_first();
		payload generatedNext = generatedPayload_first.getNext();
		curr_payload = generatedNext;
		child_container = 0;
		Object generatedPayload_size = container.getPayload_size();
		push_count = generatedPayload_size / 2;
		generatedPayload_size -= push_count;
		node generatedChild = container.getChild();
		Object generatedKey = curr_payload.getKey();
		container container = new container();
		while (push_count--) {
			next_payload = generatedNext;
			generatedPayload_first.setNext(next_payload);
			child_container = generatedChild.find_container(compare, generatedKey, child_container);
			container.container_insert(tree, generatedChild, child_container, curr_payload);
			curr_payload = next_payload;
		}
	}
	public static void order_container_payload(bftree tree, node node, Object migrated_idx, Object import_idx) {
		payload separator = new payload();
		payload curr = new payload();
		key_compare_func compare = new key_compare_func();
		int is_equal;
		container left = new container();
		container right = new container();
		container[][] generatedContainers = node.getContainers();
		left = generatedContainers[migrated_idx];
		right = generatedContainers[import_idx];
		bftree_opts generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		compare = generatedKey_compare;
		payload generatedPayload_first = left.getPayload_first();
		Object generatedKey = generatedPayload_first.getKey();
		separator = generatedPayload_first.get_payload(compare, generatedKey, is_equal);
		payload generatedNext = prev.getNext();
		Object generatedPayload_size = left.getPayload_size();
		if (is_equal) {
			payload prev = new payload();
			prev = generatedPayload_first;
			while (generatedNext != separator) {
				prev = generatedNext;
			}
			ModernizedCProgram.payload_replace(tree, generatedPayload_first, separator);
			separator = prev;
			generatedPayload_size--;
		} 
		// TODO need optimize
		container container = new container();
		if (separator) {
			curr = generatedNext;
			separator.setNext((null));
			tree.setIs_migrated(1);
			while (curr) {
				generatedPayload_size--;
				container.container_insert(tree, node, import_idx, curr);
				curr = generatedNext;
			}
			tree.setIs_migrated(0);
		} 
	}
	public static Object wstr_newlen(Object init, Object init_len) {
		wstrhd sh = new wstrhd();
		sh = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ + init_len + 1);
		if (sh == (null)) {
			return (null);
		} 
		Object[] generatedBuf = sh.getBuf();
		if (init) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuf, init, init_len);
			sh.setLen(init_len);
		} else {
				sh.setLen(0);
		} 
		Object generatedLen = sh.getLen();
		generatedBuf[generatedLen] = (byte)'\0';
		return (wstr)(generatedBuf);
	}
	public static void wstr_free(Object s) {
		if (s == (null)) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s - /*Error: Unsupported expression*/);
	}
	public static Object wstrlen(Object s) {
		wstrhd hd = (wstrhd)(s - /*Error: Unsupported expression*/);
		Object generatedLen = hd.getLen();
		return generatedLen;
	}
	public static int wstr_keycompare(Object key1, Object key2) {
		size_t l1 = new size_t();
		size_t l2 = new size_t();
		l1 = ModernizedCProgram.wstrlen((wstr)key1);
		l2 = ModernizedCProgram.wstrlen((wstr)key2);
		if (l1 != l2) {
			return l1 < l2 ? -1 : 1;
		} 
		return /*Error: Function owner not recognized*/memcmp(key1, key2, l1);
	}
}
