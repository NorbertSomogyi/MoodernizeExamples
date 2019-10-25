package application;

public class ModernizedCProgram {
	public static bftree bftmap_create = new bftree();
	public static Object bftmap_free;
	public static int bftmap_put;
	public static Object bftmap_get;
	public static int bftmap_del;
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
	public static container container_insert = new container();
	public static Object bftree_node_print;
	public static Object validate_containers;
	public static byte wstr;
	public static bftree_opts map_opt = new bftree_opts(((Object)0), ((Object)0), wstr_keycompare, (Object)wstr_free, free);
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
	public static dictType sdsdict_type = new dictType(/* hash function */dictSdsHash, ((Object)/* key dup */0), ((Object)/* val dup */0), /* key compare */dictSdsKeyCompare, /* key destructor */dictSdsDestructor, /* val destructor */dictSdsDestructor);
	public static bftree bftset_create = new bftree();
	public static Object bftset_free;
	public static int bftset_put;
	public static Object bftset_get;
	public static int bftset_del;
	public static byte sds;
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
	
	
	public static void bftmap_example() {
		bftree tree = new bftree();
		int i;
		int len;
		byte[] buf = new byte[100];
		byte val;
		bftree_iterator iter = new bftree_iterator();
		int count;
		tree = ModernizedCProgram.bftmap_create();
		for (i = 0; i < 1000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			val = .malloc(100);
			.snprintf(val, 100, "val%d", i);
			ModernizedCProgram.bftmap_put(tree, buf, len, val);
		}
		((ModernizedCProgram.bftree_count(tree) == 1000) ? (Object)0 : ._assert("bftree_count(tree) == 1000", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\bftree_example.c", 25));
		count = 0;
		iter = ModernizedCProgram.bftree_get_iterator(tree);
		while (ModernizedCProgram.bftree_next(iter) != ((Object)0)) {
			count++;
		}
		ModernizedCProgram.bftree_free_iterator(iter);
		((count == 1000) ? (Object)0 : ._assert("count == 1000", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\bftree_example.c", 32));
		for (i = 0; i < 10000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			ModernizedCProgram.bftmap_del(tree, buf, len);
		}
		for (i = 0; i < 1000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			ModernizedCProgram.bftmap_get(tree, buf, len);
		}
		ModernizedCProgram.bftmap_free(tree);
	}
	public static void bftset_example() {
		bftree tree = new bftree();
		int i;
		int len;
		byte[] buf = new byte[100];
		byte val;
		tree = ModernizedCProgram.bftset_create();
		for (i = 0; i < 10000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			val = .malloc(100);
			.snprintf(val, 100, "val%d", i);
			ModernizedCProgram.bftset_put(tree, buf, len);
		}
		for (i = 0; i < 10000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			ModernizedCProgram.bftset_del(tree, buf, len);
		}
		for (i = 0; i < 10000; i++) {
			len = .snprintf(buf, 100, "key%d", i);
			ModernizedCProgram.bftset_get(tree, buf, len);
		}
		ModernizedCProgram.bftmap_free(tree);
	}
	public static Object payload_create(Object key, Object val, payload_type type) {
		payload payload = new payload();
		payload = .malloc();
		payload.setKey(key);
		payload.setVal(val);
		payload.setNext(((Object)0));
		payload.setType(payload_type.type);
		return payload;
	}
	public static void payload_free(Object tree, Object payload, int nofree) {
		if (payload.getKey() && tree.getOpts().getKey_destructor()) {
			.UNRECOGNIZEDFUNCTIONNAME(payload.getKey());
		} 
		if (payload.getVal() && tree.getOpts().getVal_destructor() && !nofree) {
			.UNRECOGNIZEDFUNCTIONNAME(payload.getVal());
		} 
		if (payload.getType() == payload_type.Put) {
			tree.getPut_payload_count()--;
		} else {
				tree.getDel_payload_count()--;
		} 
		.free(payload);
	}
	public static void payload_replace(Object tree, Object older, Object newer) {
		Object temp;
		temp = older.getVal();
		older.setVal(newer.getVal());
		newer.setVal(temp);
		older.setType(newer.getType());
		ModernizedCProgram.payload_free(tree, newer, 0);
	}
	public static Object container_create() {
		container container = new container();
		container = .malloc();
		container.setPayload_first(((Object)0));
		container.setPayload_size(0);
		container.setChild(((Object)0));
		return container;
	}
	public static void container_free(Object tree, Object container) {
		payload curr = new payload();
		payload next = new payload();
		curr = container.getPayload_first();
		while (curr) {
			next = curr.getNext();
			ModernizedCProgram.payload_free(tree, curr, 0);
			curr = next;
		}
		.free(container);
	}
	public static void insert_after_container(Object node, Object container, Object container_idx) {
		if (node.getContainer_size() == node.getContainer_count()) {
			node.setContainers(.realloc(node.getContainers(),  * node.getContainer_count() * 2));
			node.getContainer_count() *= 2;
		} 
		if (node.getContainer_size() == 0) {
			node.getContainers()[node.getContainer_size()++] = container;
		} else {
				.memmove(node.getContainers()[container_idx + 2], node.getContainers()[container_idx + 1], (node.getContainer_size() - container_idx - 1) * );
				node.getContainers()[container_idx + 1] = container;
				node.getContainer_size()++;
		} 
	}
	public static Object node_create(Object parent_node) {
		node node = new node();
		node = .malloc();
		node.setParent(parent_node);
		node.setContainers(.malloc( * 16));
		node.setContainer_count(16);
		node.setContainer_size(0);
		return node;
	}
	public static void node_free(Object tree, Object node) {
		int i;
		container container = new container();
		for (i = 0; i < node.getContainer_size(); i++) {
			container = node.getContainers()[i];
			ModernizedCProgram.container_free(tree, container);
		}
		.free(node.getContainers());
		.free(node);
	}
	public static void bftree_free_node(Object tree, Object node) {
		int i;
		container container = new container();
		for (i = 0; i < node.getContainer_size(); i++) {
			container = node.getContainers()[i];
			if (container.getChild()) {
				ModernizedCProgram.bftree_free_node(tree, container.getChild());
			} 
		}
		ModernizedCProgram.node_free(tree, node);
	}
	public static Object find_container(Object compare, Object node, Object key, Object start_container) {
		int left;
		int right;
		int middle;
		int result;
		int compared;
		container containers = new container();
		left = start_container;
		right = node.getContainer_size() - 1;
		containers = node.getContainers();
		compared = 0;
		while (left <= right) {
			middle = (left + right) / 2;
			compared = .compare(key, containers[middle].getPayload_first().getKey());
			if (compared < 0) {
				right = middle - 1;
			}  else if (compared > 0) {
				left = middle + 1;
			} else {
					right = middle;
					break;
			} 
		}
		if (compared > 0) {
			result = left - 1;
		}  else if (compared < 0) {
			result = right;
		} else {
				result = right;
		} 
		if (result == 0) {
			return 0;
		} 
		return right - 1;
	}
	public static Object remove_container(Object node, Object idx) {
		container removed = new container();
		removed = node.getContainers()[idx];
		.memmove(node.getContainers()[idx], node.getContainers()[idx + 1], (node.getContainer_size() - idx - 1) * );
		node.getContainer_size()--;
		return removed;
	}
	public static Object get_payload(Object compare, Object payload_start, Object key, Object is_equal) {
		payload curr_payload = new payload();
		payload prev_payload = new payload();
		int compared;
		prev_payload = ((Object)0);
		curr_payload = payload_start;
		is_equal = 0;
		while (curr_payload) {
			compared = .compare(key, curr_payload.getKey());
			if (compared <= 0) {
				if (compared == 0) {
					is_equal = 1;
					return curr_payload;
				} 
				return prev_payload;
			} 
			prev_payload = curr_payload;
			curr_payload = curr_payload.getNext();
		}
		return prev_payload;
	}
	public static void push_to_child(Object tree, Object node, Object container) {
		payload curr_payload = new payload();
		payload next_payload = new payload();
		uint32_t child_container = new uint32_t();
		uint32_t push_count = new uint32_t();
		key_compare_func compare = new key_compare_func();
		compare = tree.getOpts().getKey_compare();
		curr_payload = container.getPayload_first().getNext();
		child_container = 0;
		push_count = container.getPayload_size() / 2;
		container.getPayload_size() -= push_count;
		while (push_count--) {
			next_payload = curr_payload.getNext();
			container.getPayload_first().setNext(next_payload);
			child_container = ModernizedCProgram.find_container(compare, container.getChild(), curr_payload.getKey(), child_container);
			ModernizedCProgram.container_insert(tree, container.getChild(), child_container, curr_payload);
			curr_payload = next_payload;
		}
	}
	public static void order_container_payload(Object tree, Object node, Object migrated_idx, Object import_idx) {
		payload separator = new payload();
		payload curr = new payload();
		key_compare_func compare = new key_compare_func();
		int is_equal;
		container left = new container();
		container right = new container();
		left = node.getContainers()[migrated_idx];
		right = node.getContainers()[import_idx];
		compare = tree.getOpts().getKey_compare();
		separator = ModernizedCProgram.get_payload(compare, left.getPayload_first(), right.getPayload_first().getKey(), is_equal);
		if (is_equal) {
			payload prev = new payload();
			prev = left.getPayload_first();
			while (prev.getNext() != separator) {
				prev = prev.getNext();
			}
			ModernizedCProgram.payload_replace(tree, right.getPayload_first(), separator);
			separator = prev;
			left.getPayload_size()--;
		} 
		// TODO need optimize
		if (separator) {
			curr = separator.getNext();
			separator.setNext(((Object)0));
			tree.setIs_migrated(1);
			while (curr) {
				left.getPayload_size()--;
				ModernizedCProgram.container_insert(tree, node, import_idx, curr);
				curr = curr.getNext();
			}
			tree.setIs_migrated(0);
		} 
	}
	public static void try_split_node(Object tree, Object node) {
		uint32_t middle_container_idx = new uint32_t();
		uint32_t parent_container_idx = new uint32_t();
		int i;
		node new_node = new node();
		node new_root = new node();
		container container = new container();
		container new_node_first_container = new container();
		if (node.getContainer_size() < 16) {
			return ;
		} 
		// the number of container in this node is full
		middle_container_idx = node.getContainer_size() / 2;
		new_node = ModernizedCProgram.node_create(node.getParent());
		new_node_first_container = node.getContainers()[middle_container_idx];
		new_node_first_container.setChild(new_node);
		for (i = middle_container_idx + 1; i < node.getContainer_size(); ++i) {
			container = node.getContainers()[i];
			ModernizedCProgram.insert_after_container(new_node, container, i - middle_container_idx - 2);
		}
		node.getContainer_size() -= (i - middle_container_idx);
		if (node == tree.getRoot()) {
			new_root = ModernizedCProgram.node_create(((Object)0));
			tree.setRoot(new_root);
			tree.getHeight()++;
			node.setParent(new_root);
			new_node.setParent(new_root);
			container = ModernizedCProgram.remove_container(node, 0);
			container.setChild(node);
			ModernizedCProgram.insert_after_container(new_root, container, 0);
			ModernizedCProgram.insert_after_container(new_root, new_node_first_container, 0);
		} else {
				parent_container_idx = ModernizedCProgram.find_container(tree.getOpts().getKey_compare(), node.getParent(), new_node_first_container.getPayload_first().getKey(), 0);
				ModernizedCProgram.insert_after_container(node.getParent(), new_node_first_container, parent_container_idx);
				ModernizedCProgram.order_container_payload(tree, node.getParent(), parent_container_idx, parent_container_idx + 1);
				ModernizedCProgram.try_split_node(tree, node.getParent());
		} 
		// produce new root
	}
	public static void split_container(Object tree, Object node, Object container_idx) {
		uint32_t half_count = new uint32_t();
		uint32_t i = new uint32_t();
		container new_container = new container();
		container target = new container();
		payload payload = new payload();
		new_container = ModernizedCProgram.container_create();
		ModernizedCProgram.insert_after_container(node, new_container, container_idx);
		target = node.getContainers()[container_idx];
		half_count = target.getPayload_size() / 2;
		payload = target.getPayload_first();
		for (i = 0; i < half_count - 1; ++i) {
			payload = payload.getNext();
		}
		new_container.setPayload_first(payload.getNext());
		payload.setNext(((Object)0));
		new_container.setPayload_size(target.getPayload_size() - half_count);
		target.setPayload_size(half_count);
		ModernizedCProgram.try_split_node(tree, node);
	}
	public static Object container_insert(Object tree, Object node, Object container_idx, Object new_payload) {
		payload curr_payload = new payload();
		container target = new container();
		int is_equal;
		key_compare_func compare = new key_compare_func();
		compare = tree.getOpts().getKey_compare();
		if (container_idx >= node.getContainer_size()) {
			target = ModernizedCProgram.container_create();
			ModernizedCProgram.insert_after_container(node, target, 0);
		} else {
				target = node.getContainers()[container_idx];
		} 
		curr_payload = ModernizedCProgram.get_payload(tree.getOpts().getKey_compare(), target.getPayload_first(), new_payload.getKey(), is_equal);
		if (is_equal) {
			ModernizedCProgram.payload_replace(tree, curr_payload, new_payload);
		} else {
				if (curr_payload) {
					new_payload.setNext(curr_payload.getNext());
					curr_payload.setNext(new_payload);
				} else {
						new_payload.setNext(target.getPayload_first());
						target.setPayload_first(new_payload);
				} 
				target.getPayload_size()++;
		} 
		// exist same key, swap value of payload
		if (target.getPayload_size() > 100 && tree.getIs_migrated()) {
			if (target.getChild()) {
				ModernizedCProgram.push_to_child(tree, node, target);
			} else {
					ModernizedCProgram.split_container(tree, node, container_idx);
			} 
		} 
		return target;
	}
	public static Object container_get(Object tree, Object node, Object container_idx, Object key) {
		payload curr_payload = new payload();
		container container = new container();
		int compare;
		int is_equal;
		if (container_idx >= node.getContainer_size()) {
			return ((Object)0);
		} 
		compare = tree.getOpts().getKey_compare();
		container = node.getContainers()[container_idx];
		curr_payload = ModernizedCProgram.get_payload(compare, container.getPayload_first(), key, is_equal);
		if (is_equal) {
			if (curr_payload.getType() == payload_type.Put) {
				return curr_payload;
			} 
			return ((Object)0);
		} 
		if (container.getChild()) {
			container_idx = ModernizedCProgram.find_container(compare, container.getChild(), key, 0);
			return ModernizedCProgram.container_get(tree, container.getChild(), container_idx, key);
		} 
		return ((Object)0);// ================================================================
	}
	public static Object bftree_create(Object opts) {
		node root = new node();
		bftree tree = new bftree();
		tree = .malloc();
		root = ModernizedCProgram.node_create(((Object)0));
		tree.setRoot(root);
		tree.setHeight(1);
		tree.setOpts(opts);
		tree.setIs_migrated(0);
		tree.setDel_payload_count(tree.setPut_payload_count(0));
		((opts.getKey_destructor() && opts.getVal_destructor()) ? (Object)0 : ._assert("opts->key_destructor && opts->val_destructor", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 448));
		return tree;
	}
	public static void bftree_free(Object tree) {
		ModernizedCProgram.bftree_free_node(tree, tree.getRoot());
		.free(tree);
	}
	public static int bftree_put(Object tree, Object key, Object val) {
		payload new_payload = new payload();
		uint32_t idx = new uint32_t();
		if (!tree || !key) {
			return (true);
		} 
		new_payload = ModernizedCProgram.payload_create(key, val, payload_type.Put);
		idx = ModernizedCProgram.find_container(tree.getOpts().getKey_compare(), tree.getRoot(), new_payload.getKey(), 0);
		ModernizedCProgram.container_insert(tree, tree.getRoot(), idx, new_payload);
		return 0;
	}
	public static Object bftree_get(Object tree, Object key) {
		uint32_t idx = new uint32_t();
		payload r = new payload();
		if (!tree || !key) {
			return ((Object)0);
		} 
		idx = ModernizedCProgram.find_container(tree.getOpts().getKey_compare(), tree.getRoot(), key, 0);
		r = ModernizedCProgram.container_get(tree, tree.getRoot(), idx, key);
		if (r) {
			return r.getVal();
		} 
		return ((Object)0);
	}
	public static int bftree_del(Object tree, Object key) {
		uint32_t idx = new uint32_t();
		payload new_payload = new payload();
		if (!tree || !key) {
			return (true);
		} 
		new_payload = ModernizedCProgram.payload_create(key, ((Object)0), payload_type.Del);
		idx = ModernizedCProgram.find_container(tree.getOpts().getKey_compare(), tree.getRoot(), new_payload.getKey(), 0);
		ModernizedCProgram.container_insert(tree, tree.getRoot(), idx, new_payload);
		return 0;
	}
	public static Object bftree_get_iterator(Object tree) {
		bftree_iterator iter = new bftree_iterator();
		iter = .malloc();
		iter.setTree(tree);
		iter.setNext(((Object)0));
		iter.setClosed(0);
		return iter;
	}
	public static Object bftree_next(Object iter) {
		bftree tree = new bftree();
		container container = new container();
		node node = new node();
		payload curr = new payload();
		payload next = new payload();
		payload min = new payload();
		uint32_t idx = new uint32_t();
		key_compare_func key_compare = new key_compare_func();
		int is_equal;
		if (iter.getClosed()) {
			return ((Object)0);
		} 
		tree = iter.getTree();
		key_compare = tree.getOpts().getKey_compare();
		if (!iter.getNext()) {
			if (tree.getRoot().getContainer_size() == 0) {
				return ((Object)0);
			} 
			iter.setNext(tree.getRoot().getContainers()[0].getPayload_first());
		} 
		curr = iter.getNext();
		min = ((Object)0);
		node = tree.getRoot();
		do {
			idx = ModernizedCProgram.find_container(key_compare, node, curr.getKey(), 0);
			container = node.getContainers()[idx];
			next = ModernizedCProgram.get_payload(key_compare, container.getPayload_first(), curr.getKey(), is_equal);
			if (!next) {
				next = container.getPayload_first();
			} else {
					next = next.getNext();
			} 
			if (next) {
				if (!min) {
					min = next;
				}  else if (.key_compare(next.getKey(), min.getKey()) < 0) {
					min = next;
				} 
			} 
			node = container.getChild();
		} while (node);
		iter.setNext(min);
		if (!min) {
			iter.setClosed(1);
		} 
		return curr;
	}
	public static void bftree_free_iterator(Object iter) {
		.free(iter);
	}
	public static int bftree_count(Object tree) {
		bftree_iterator iter = new bftree_iterator();
		int count;
		count = 0;
		iter = ModernizedCProgram.bftree_get_iterator(tree);
		while (ModernizedCProgram.bftree_next(iter) != ((Object)0)) {
			count++;
		}
		ModernizedCProgram.bftree_free_iterator(iter);
		return count;// ================================================================
	}
	// ========================== Debug Area ==========================
	// ================================================================
	public static void validate_containers(Object node, Object compare) {
		int i;
		payload curr = new payload();
		payload prev = new payload();
		for (i = 0; i < node.getContainer_size(); i++) {
			prev = node.getContainers()[i].getPayload_first();
			curr = prev.getNext();
			while (curr) {
				((.compare(prev.getKey(), curr.getKey()) < 0) ? (Object)0 : ._assert("compare(prev->key, curr->key) < 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 601));
				prev = curr;
				curr = curr.getNext();
			}
			if (i == 0) {
				continue;
			} 
			((.compare(node.getContainers()[i - 1].getPayload_first().getKey(), node.getContainers()[i].getPayload_first().getKey()) < 0) ? (Object)0 : ._assert("compare(node->containers[i-1]->payload_first->key, node->containers[i]->payload_first->key) < 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 608));
		}
	}
	public static void bftree_node_print(Object node) {
		int i;
		payload payload = new payload();
		for (i = 0; i < node.getContainer_size(); ++i) {
			.printf("container%d %d %s\t", i, node.getContainers()[i].getPayload_size(), node.getContainers()[i].getPayload_first().getKey());
			payload = node.getContainers()[i].getPayload_first();
			while (payload) {
				.printf("%s => %s ", payload.getKey(), payload.getVal());
				payload = payload.getNext();
			}
			.printf("\n");
		}
		.printf("\n")// ================================================================// ========================== Map Type Area =======================;// ================================================================// ========================== Map Type Area =======================
	}
	public static Object wstr_newlen(Object init, Object init_len) {
		wstrhd sh = new wstrhd();
		sh = .malloc( + init_len + 1);
		if (sh == ((Object)0)) {
			return ((Object)0);
		} 
		if (init) {
			.memcpy(sh.getBuf(), init, init_len);
			sh.setLen(init_len);
		} else {
				sh.setLen(0);
		} 
		sh.getBuf()[sh.getLen()] = (byte)'\0';
		return (wstr)(sh.getBuf());
	}
	public static void wstr_free(Object s) {
		if (s == ((Object)0)) {
			return ;
		} 
		.free(s - );
	}
	public static Object wstrlen(Object s) {
		wstrhd hd = (wstrhd)(s - );
		return hd.getLen();
	}
	public static int wstr_keycompare(Object key1, Object key2) {
		size_t l1 = new size_t();
		size_t l2 = new size_t();
		l1 = ModernizedCProgram.wstrlen((wstr)key1);
		l2 = ModernizedCProgram.wstrlen((wstr)key2);
		if (l1 != l2) {
			return l1 < l2 ? -1 : 1;
		} 
		return .memcmp(key1, key2, l1);
	}
	public static Object bftmap_create() {
		return ModernizedCProgram.bftree_create(ModernizedCProgram.map_opt);
	}
	public static void bftmap_free(Object tree) {
		ModernizedCProgram.bftree_free(tree);
	}
	public static int bftmap_put(Object tree, Object key, Object key_len, Object val) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return ModernizedCProgram.bftree_put(tree, s, val);
	}
	public static Object bftmap_get(Object tree, Object key, Object key_len) {
		if (!key || !key_len) {
			return ((Object)0);
		} 
		Object r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		r = ModernizedCProgram.bftree_get(tree, s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public static int bftmap_del(Object tree, Object key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return ModernizedCProgram.bftree_del(tree, s);// ================================================================
	}
	public static Object bftset_create() {
		return ModernizedCProgram.bftree_create(ModernizedCProgram.map_opt);
	}
	public static void bftset_free(Object tree) {
		ModernizedCProgram.bftree_free(tree);
	}
	public static int bftset_put(Object tree, Object key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return ModernizedCProgram.bftree_put(tree, s, ((Object)0));
	}
	public static Object bftset_get(Object tree, Object key, Object key_len) {
		if (!key || !key_len) {
			return ((Object)0);
		} 
		Object r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		r = ModernizedCProgram.bftree_get(tree, s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public static int bftset_del(Object tree, Object key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return ModernizedCProgram.bftree_del(tree, s);
	}
	public static void bftree_iter_set_del(Object iter, Object payload) {
		payload.setType(payload_type.Del);
	}
	public static void bftree_iter_set_val(Object iter, Object payload, Object val) {
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
		return .memcmp(key1, key2, l1) == 0;
	}
	public static void redis_add(Object d, int times) {
		int i;
		sds key = new sds();
		sds val = new sds();
		byte[] buf = new byte[20];
		for (i = 0; i < times; ++i) {
			.snprintf(buf, 20, "key%d", i);
			key = ModernizedCProgram.sdsnew(buf);
			.snprintf(buf, 20, "val%d", i);
			val = ModernizedCProgram.sdsnew(buf);
			((ModernizedCProgram.dictAdd(d, key, val) == 0) ? (Object)0 : ._assert("dictAdd(d, key, val) == DICT_OK", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 55));
		}
	}
	public static int bftreeSdsKeyCompare(Object key1, Object key2) {
		int l1;
		int l2;
		l1 = ModernizedCProgram.sdslen((sds)key1);
		l2 = ModernizedCProgram.sdslen((sds)key2);
		if (l1 != l2) {
			return l1 < l2 ? -1 : 1;
		} 
		return .memcmp(key1, key2, l1);
	}
	public static Object bftree_add(Object tree, int times) {
		int i;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		for (i = 0; i < times; ++i) {
			.snprintf(buf, 20, "key%d", i);
			key = ModernizedCProgram.sdsnew(buf);
			.snprintf(buf, 20, "val%d", i);
			val = ModernizedCProgram.sdsnew(buf);
			((ModernizedCProgram.bftree_put(tree, key, val) == 0) ? (Object)0 : ._assert("bftree_put(tree, key, val) == BF_OK", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 81));
		}
		return tree;
	}
	public static void bftree_fetch(Object tree, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			((ModernizedCProgram.bftree_get(tree, key)) ? (Object)0 : ._assert("bftree_get(tree, key)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 98));
			ModernizedCProgram.sdsfree(key);
		}
	}
	public static void redis_fetch(Object d, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			((ModernizedCProgram.dictFetchValue(d, key)) ? (Object)0 : ._assert("dictFetchValue(d, key)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 115));
			ModernizedCProgram.sdsfree(key);
		}
	}
	public static void redis_del(Object d, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			ModernizedCProgram.dictDelete(d, key);
			ModernizedCProgram.sdsfree(key);
		}
	}
	public static void bftree_delele(Object tree, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			ModernizedCProgram.bftree_del(tree, key);
		}
	}
	public static int main(int argc, Object argv) {
		timeval start = new timeval();
		timeval end = new timeval();
		double elapsed;
		dict d = new dict();
		bftree tree = new bftree();
		int times = 500;
		bftree_opts opt = new bftree_opts(((Object)0), ((Object)0), bftreeSdsKeyCompare, (Object)ModernizedCProgram.sdsfree, (Object)ModernizedCProgram.sdsfree);
		tree = ModernizedCProgram.bftree_create(opt);
		d = ModernizedCProgram.dictCreate(ModernizedCProgram.sdsdict_type, ((Object)0));
		.gettimeofday(start, ((Object)0));
		ModernizedCProgram.redis_add(d, times);
		.gettimeofday(end, ((Object)0));
		Object generatedTv_sec = end.getTv_sec();
		Object generatedTv_usec = end.getTv_usec();
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("redis add %d elements seconds: %f\n", times, elapsed);
		.gettimeofday(start, ((Object)0));
		tree = ModernizedCProgram.bftree_add(tree, times);
		.gettimeofday(end, ((Object)0));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("bftree add %d elements seconds: %f\n", times, elapsed);
		.gettimeofday(start, ((Object)0));
		ModernizedCProgram.redis_fetch(d, times);
		.gettimeofday(end, ((Object)0));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("redis get %d elements seconds: %f\n", times, elapsed);
		.gettimeofday(start, ((Object)0));
		ModernizedCProgram.bftree_fetch(tree, times);
		.gettimeofday(end, ((Object)0));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("bftree get %d elements seconds: %f\n", times, elapsed);
		.gettimeofday(start, ((Object)0));
		ModernizedCProgram.redis_del(d, times);
		.gettimeofday(end, ((Object)0));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("redis delete %d elements seconds: %f\n", times, elapsed);
		.gettimeofday(start, ((Object)0));
		ModernizedCProgram.bftree_delele(tree, times);
		.gettimeofday(end, ((Object)0));
		elapsed = ((generatedTv_sec - generatedTv_sec) + ((double)(generatedTv_usec - generatedTv_usec)) / 1000000);
		.printf("bftree delete %d elements seconds: %f\n", times, elapsed);
		ModernizedCProgram.bftree_free(tree);
		ModernizedCProgram.dictRelease(d);
		return 0;
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
			sh = .malloc( + initlen + 1);
		} else {
				sh = .malloc( + initlen + 1);
		} 
		if (sh == ((Object)0)) {
			return ((Object)0);
		} 
		sh.setLen(initlen);
		sh.setFree(0);
		if (initlen && init) {
			.memcpy(sh.getBuf(), init, initlen);
		} 
		sh.getBuf()[initlen] = (byte)'\0';
		return (byte)sh.getBuf();
	}
	public static Object sdsempty() {
		return ModernizedCProgram.sdsnewlen("", 0);
	}
	public static Object sdsnew(Object init) {
		size_t initlen = (init == ((Object)0)) ? 0 : .strlen(init);
		return ModernizedCProgram.sdsnewlen(init, initlen);
	}
	public static Object sdsdup(Object s) {
		return ModernizedCProgram.sdsnewlen(s, ModernizedCProgram.sdslen(s));
	}
	public static void sdsfree(Object s) {
		if (s == ((Object)0)) {
			return ;
		} 
		.free(s - );
	}
	public static void sdsupdatelen(Object s) {
		sdshdr sh = (Object)(s - ());
		int reallen = .strlen(s);
		sh.getFree() += (sh.getLen() - reallen);
		sh.setLen(reallen);
	}
	public static void sdsclear(Object s) {
		sdshdr sh = (Object)(s - ());
		sh.getFree() += sh.getLen();
		sh.setLen(0);
		sh.getBuf()[0] = (byte)'\0'/* Enlarge the free space at the end of the sds string so that the caller
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
		sh = (Object)(s - ());
		newlen = (len + addlen);
		if (newlen < (1024 * 1024)) {
			newlen *= 2;
		} else {
				newlen += (1024 * 1024);
		} 
		newsh = .realloc(sh,  + newlen + 1);
		if (newsh == ((Object)0)) {
			return ((Object)0);
		} 
		newsh.setFree(newlen - len);
		return newsh.getBuf();
	}
	public static Object sdsRemoveFreeSpace(Object s) {
		sdshdr sh = new sdshdr();
		sh = (Object)(s - ());
		sh = .realloc(sh,  + sh.getLen() + 1);
		sh.setFree(0);
		return sh.getBuf();
	}
	public static Object sdsAllocSize(Object s) {
		sdshdr sh = (Object)(s - ());
		return  + sh.getLen() + sh.getFree() + 1/* Increment the sds length and decrements the left free space at the
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
		sdshdr sh = (Object)(s - ());
		((sh.getFree() >= incr) ? (Object)0 : ._assert("sh->free >= incr", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\sds.c", 155));
		sh.getLen() += incr;
		sh.getFree() -= incr;
		((sh.getFree() >= 0) ? (Object)0 : ._assert("sh->free >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\sds.c", 158));
		s[sh.getLen()] = (byte)'\0';
	}
	/* Grow the sds to have the specified length. Bytes that were not part of
	 * the original length of the sds will be set to zero. */
	public static Object sdsgrowzero(Object s, Object len) {
		sdshdr sh = (Object)(s - ());
		size_t totlen = new size_t();
		size_t curlen = sh.getLen();
		if (len <= curlen) {
			return s;
		} 
		s = ModernizedCProgram.sdsMakeRoomFor(s, len - curlen);
		if (s == ((Object)0)) {
			return ((Object)0);
		} 
		sh = (Object)(s - (/* Make sure added region doesn't contain garbage */));
		.memset(s + curlen, 0, (len - curlen + /* also set trailing \0 byte */1));
		totlen = sh.getLen() + sh.getFree();
		sh.setLen(len);
		sh.setFree(totlen - sh.getLen());
		return s;
	}
	public static Object sdscatlen(Object s, Object t, Object len) {
		sdshdr sh = new sdshdr();
		size_t curlen = ModernizedCProgram.sdslen(s);
		s = ModernizedCProgram.sdsMakeRoomFor(s, len);
		if (s == ((Object)0)) {
			return ((Object)0);
		} 
		sh = (Object)(s - ());
		.memcpy(s + curlen, t, len);
		sh.setLen(curlen + len);
		sh.setFree(sh.getFree() - len);
		s[curlen + len] = (byte)'\0';
		return s;
	}
	public static Object sdscat(Object s, Object t) {
		return ModernizedCProgram.sdscatlen(s, t, .strlen(t));
	}
	public static Object sdscatsds(Object s, Object t) {
		return ModernizedCProgram.sdscatlen(s, t, ModernizedCProgram.sdslen(t));
	}
	public static Object sdscpylen(Object s, Object t, Object len) {
		sdshdr sh = (Object)(s - ());
		size_t totlen = sh.getFree() + sh.getLen();
		if (totlen < len) {
			s = ModernizedCProgram.sdsMakeRoomFor(s, len - sh.getLen());
			if (s == ((Object)0)) {
				return ((Object)0);
			} 
			sh = (Object)(s - ());
			totlen = sh.getFree() + sh.getLen();
		} 
		.memcpy(s, t, len);
		s[len] = (byte)'\0';
		sh.setLen(len);
		sh.setFree(totlen - len);
		return s;
	}
	public static Object sdscpy(Object s, Object t) {
		return ModernizedCProgram.sdscpylen(s, t, .strlen(t));
	}
	public static Object sdscatvprintf(Object s, Object fmt, Object ap) {
		va_list cpy = new va_list();
		byte buf;
		byte t;
		size_t buflen = 16;
		while (1) {
			buf = .malloc(buflen);
			if (buf == ((Object)0)) {
				return ((Object)0);
			} 
			buf[buflen - 2] = (byte)'\0';
			.__builtin_va_copy(cpy, ap);
			.vsnprintf(buf, buflen, fmt, cpy);
			if (buf[buflen - 2] != (byte)'\0') {
				.free(buf);
				buflen *= 2;
				continue;
			} 
			break;
		}
		t = ModernizedCProgram.sdscat(s, buf);
		.free(buf);
		return t;
	}
	public static Object sdscatprintf(Object s, Object fmt) {
		va_list ap = new va_list();
		byte t;
		.__builtin_va_start(ap, fmt);
		t = ModernizedCProgram.sdscatvprintf(s, fmt, ap);
		.__builtin_va_end(ap);
		return t;
	}
	public static Object sdstrim(Object s, Object cset) {
		sdshdr sh = (Object)(s - ());
		byte start;
		byte end;
		byte sp;
		byte ep;
		size_t len = new size_t();
		sp = start = s;
		ep = end = s + ModernizedCProgram.sdslen(s) - 1;
		while (sp <= end && .strchr(cset, sp)) {
			sp++;
		}
		while (ep > start && .strchr(cset, ep)) {
			ep--;
		}
		len = (sp > ep) ? 0 : ((ep - sp) + 1);
		if (sh.getBuf() != sp) {
			.memmove(sh.getBuf(), sp, len);
		} 
		sh.getBuf()[len] = (byte)'\0';
		sh.setFree(sh.getFree() + (sh.getLen() - len));
		sh.setLen(len);
		return s;
	}
	public static Object sdsrange(Object s, int start, int end) {
		sdshdr sh = (Object)(s - ());
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
		if (start && newlen) {
			.memmove(sh.getBuf(), sh.getBuf() + start, newlen);
		} 
		sh.getBuf()[newlen] = 0;
		sh.setFree(sh.getFree() + (sh.getLen() - newlen));
		sh.setLen(newlen);
		return s;
	}
	public static void sdstolower(Object s) {
		int len = ModernizedCProgram.sdslen(s);
		int j;
		for (j = 0; j < len; j++) {
			s[j] = .tolower(s[j]);
		}
	}
	public static void sdstoupper(Object s) {
		int len = ModernizedCProgram.sdslen(s);
		int j;
		for (j = 0; j < len; j++) {
			s[j] = .toupper(s[j]);
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
		cmp = .memcmp(s1, s2, minlen);
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
	public static Object sdssplitlen(Object s, int len, Object sep, int seplen, Object count) {
		int elements = 0;
		int slots = 5;
		int start = 0;
		int j;
		sds tokens = new sds();
		if (seplen < 1 || len < 0) {
			return ((Object)0);
		} 
		tokens = .malloc( * slots);
		if (tokens == ((Object)0)) {
			return ((Object)0);
		} 
		if (len == 0) {
			count = 0;
			return tokens;
		} 
		for (j = 0; j < (len - (seplen - 1)); j++) {
			if (slots < elements + /* make sure there is room for the next element and the final one */2) {
				sds newtokens = new sds();
				slots *= 2;
				newtokens = .realloc(tokens,  * slots);
				if (newtokens == ((Object)0)) {
					;
				} 
				tokens = newtokens;
			} 
			if ((seplen == 1 && (s + j) == sep[0]) || (.memcmp(s + j, sep, seplen) == /* search the separator */0)) {
				tokens[elements] = ModernizedCProgram.sdsnewlen(s + start, j - start);
				if (tokens[elements] == ((Object)0)) {
					;
				} 
				elements++;
				start = j + seplen;
				j = j + seplen - /* skip the separator */1;
			} 
		}
		tokens[elements] = ModernizedCProgram.sdsnewlen(s + start, len - /* Add the final element. We are sure there is room in the tokens array. */start);
		if (tokens[elements] == ((Object)0)) {
			;
		} 
		elements++;
		count = elements;
		return tokens;
	}
	public static void sdsfreesplitres(Object tokens, int count) {
		if (!tokens) {
			return ;
		} 
		while (count--) {
			ModernizedCProgram.sdsfree(tokens[count]);
		}
		.free(tokens);
	}
	public static Object sdsfromlonglong(int value) {
		byte[] buf = new byte[32];
		byte p;
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
			case (byte)'\t':
					s = ModernizedCProgram.sdscatlen(s, "\\t", 2);
					break;
			case (byte)'\n':
					s = ModernizedCProgram.sdscatlen(s, "\\n", 2);
					break;
			case (byte)'\r':
					s = ModernizedCProgram.sdscatlen(s, "\\r", 2);
					break;
			case (byte)'"':
					s = ModernizedCProgram.sdscatprintf(s, "\\%c", p);
					break;
			case (byte)'\\':
			case (byte)'\a':
					s = ModernizedCProgram.sdscatlen(s, "\\a", 2);
					break;
			case (byte)'\b':
					s = ModernizedCProgram.sdscatlen(s, "\\b", 2);
					break;
			default:
					if (.isprint(p)) {
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
		case (byte)'F':
				return 15;
		case (byte)'c':
		case (byte)'e':
		case (byte)'0':
				return 0;
		case (byte)'B':
				return 11;
		case (byte)'4':
				return 4;
		case (byte)'7':
				return 7;
		case (byte)'b':
		case (byte)'9':
				return 9;
		case (byte)'2':
				return 2;
		case (byte)'A':
				return 10;
		case (byte)'3':
				return 3;
		case (byte)'8':
				return 8;
		case (byte)'d':
		case (byte)'C':
				return 12;
		case (byte)'E':
				return 14;
		case (byte)'6':
				return 6;
		case (byte)'5':
				return 5;
		case (byte)'D':
				return 13;
		case (byte)'f':
		case (byte)'1':
				return 1;
		case (byte)'a':
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
	public static Object sdssplitargs(Object line, Object argc) {
		byte p = line;
		byte current = ((Object)0);
		byte vector = ((Object)0);
		argc = 0;
		while (1) {
			while (p && .isspace(p)) {
				/* skip blanks */p++;
			}
			if (p) {
				int inq = /* get a token *//* set to 1 if we are in "quotes" */0;
				int insq = /* set to 1 if we are in 'single quotes' */0;
				int done = 0;
				if (current == ((Object)0)) {
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
							case (byte)'b':
									c = (byte)'\b';
									break;
							case (byte)'a':
									c = (byte)'\a';
									break;
							case (byte)'n':
									c = (byte)'\n';
									break;
							case (byte)'t':
									c = (byte)'\t';
									break;
							default:
									c = p;
									break;
							}
							current = ModernizedCProgram.sdscatlen(current, c, 1);
						}  else if (p == (byte)'"'/* closing quote must be followed by a space or
						                         * nothing at all. */) {
							if ((p + 1) && !.isspace((p + 1))) {
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
							if ((p + 1) && !.isspace((p + 1))) {
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
							case (byte)'\t':
							case (byte)' ':
							case (byte)'\r':
							case (byte)'\0':
									done = 1;
									break;
							case (byte)'\n':
							case (byte)'"':
									inq = 1;
									break;
							case (byte)'\'':
									insq = 1;
									break;
							default:
									current = ModernizedCProgram.sdscatlen(current, p, 1);
									break;
							}
					} 
					if (p) {
						p++;
					} 
				}
				vector = .realloc(vector, ((argc) + 1) * /* add the token to the vector */);
				vector[argc] = current;
				(argc)++;
				current = ((Object)0);
			} else {
					if (vector == ((Object)0)) {
						vector = .malloc(/* Even on empty input string return something not NULL. */);
					} 
					return vector;
			} 
		}
		.free(vector);
		if (current) {
			ModernizedCProgram.sdsfree(current);
		} 
		argc = 0;
		return ((Object)0/* Modify the string substituting all the occurrences of the set of
		 * characters specified in the 'from' string to the corresponding character
		 * in the 'to' array.
		 *
		 * For instance: sdsmapchars(mystring, "ho", "01", 2)
		 * will have the effect of turning the string "hello" into "0ell1".
		 *
		 * The function returns the sds string pointer, that is always the same
		 * as the input pointer since no resize is needed. */);
	}
	public static Object sdsmapchars(Object s, Object from, Object to, Object setlen) {
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
		sdshdr sh = (Object)(s - ());
		return sh.getLen();
	}
	public static Object sdsavail(Object s) {
		sdshdr sh = (Object)(s - ());
		return sh.getFree();
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
		byte data = (byte)/* Mix 4 bytes at a time into the hash */key;
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
		case 1:
				h ^=  data[0];
				h *= m;
		case 3:
				h ^=  data[2] << 16;
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
			hash = ((hash << 5) + hash) + (.tolower(/* hash * 33 + c */buf++));
		}
		return hash/* ----------------------------- API implementation ------------------------- */;
	}
	/* Reset a hash table already initialized with ht_init().
	 * NOTE: This function should only be called by ht_destroy(). */
	public static void _dictReset(Object ht) {
		ht.setTable(((Object)0));
		ht.setSize(0);
		ht.setSizemask(0);
		ht.setUsed(0);
	}
	/* Create a new hash table */
	public static Object dictCreate(Object type, Object privDataPtr) {
		dict d = .malloc();
		ModernizedCProgram._dictInit(d, type, privDataPtr);
		return d;
	}
	/* Initialize the hash table */
	public static int _dictInit(Object d, Object type, Object privDataPtr) {
		ModernizedCProgram._dictReset(d.getHt()[0]);
		ModernizedCProgram._dictReset(d.getHt()[1]);
		d.setType(type);
		d.setPrivdata(privDataPtr);
		d.setRehashidx(-1);
		d.setIterators(0);
		return 0;
	}
	/* -------------------------- hash functions -------------------------------- */
	/* Resize the table to the minimal size that contains all the elements,
	 * but with the invariant of a USED/BUCKETS ratio near to <= 1 */
	public static int dictResize(Object d) {
		int minimal;
		if (!ModernizedCProgram.dict_can_resize || ((d).getRehashidx() != -1)) {
			return 1;
		} 
		minimal = d.getHt()[0].getUsed();
		if (minimal < 4) {
			minimal = 4;
		} 
		return ModernizedCProgram.dictExpand(d, minimal);
	}
	/* Expand or create the hash table */
	public static int dictExpand(Object d, long size) {
		/* the new hash table */dictht n = new dictht();
		long realsize = ModernizedCProgram._dictNextPower(size);
		if (((d).getRehashidx() != -1) || d.getHt()[0].getUsed() > /* the size is invalid if it is smaller than the number of
		     * elements already inside the hash table */size) {
			return 1;
		} 
		n.setSize(/* Allocate the new hash table and initialize all pointers to NULL */realsize);
		n.setSizemask(realsize - 1);
		n.setTable(.malloc(realsize * ));
		n.setUsed(0);
		if (d.getHt()[0].getTable() == ((Object)/* Is this the first initialization? If so it's not really a rehashing
		     * we just set the first hash table so that it can accept keys. */0)) {
			d.getHt()[0] = n;
			return 0;
		} 
		d.getHt()[1] = /* Prepare a second hash table for incremental rehashing */n;
		d.setRehashidx(0);
		return 0/* Performs N steps of incremental rehashing. Returns 1 if there are still
		 * keys to move from the old to the new hash table, otherwise 0 is returned.
		 * Note that a rehashing step consists in moving a bucket (that may have more
		 * thank one key as we use chaining) from the old to the new hash table. */;
	}
	public static int dictRehash(Object d, int n) {
		if (!((d).getRehashidx() != -1)) {
			return 0;
		} 
		while (n--) {
			dictEntry de = new dictEntry();
			dictEntry nextde = new dictEntry();
			if (d.getHt()[0].getUsed() == /* Check if we already rehashed the whole table... */0) {
				.free(d.getHt()[0].getTable());
				d.getHt()[0] = d.getHt()[1];
				ModernizedCProgram._dictReset(d.getHt()[1]);
				d.setRehashidx(-1);
				return 0;
			} 
			((d.getHt()[0].getSize() > (int)d.getRehashidx()) ? (Object)0 : ._assert("d->ht[0].size > (unsigned)d->rehashidx", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\redis-dict.c", /* Note that rehashidx can't overflow as we are sure there are more
			         * elements because ht[0].used != 0 */257));
			while (d.getHt()[0].getTable()[d.getRehashidx()] == ((Object)0)) {
				d.getRehashidx()++;
			}
			de = d.getHt()[0].getTable()[d.getRehashidx()];
			while (/* Move all the keys in this bucket from the old to the new hash HT */de) {
				int h;
				nextde = de.getNext();
				h = .UNRECOGNIZEDFUNCTIONNAME(de.getKey()) & d.getHt()[1].getSizemask();
				de.setNext(d.getHt()[1].getTable()[h]);
				d.getHt()[1].getTable()[h] = de;
				d.getHt()[0].getUsed()--;
				d.getHt()[1].getUsed()++;
				de = nextde;
			}
			d.getHt()[0].getTable()[d.getRehashidx()] = ((Object)0);
			d.getRehashidx()++;
		}
		return 1;
	}
	public static int timeInMilliseconds() {
		timeval tv = new timeval();
		.gettimeofday(tv, ((Object)0));
		Object generatedTv_sec = tv.getTv_sec();
		Object generatedTv_usec = tv.getTv_usec();
		return (((long)generatedTv_sec) * 1000) + (generatedTv_usec / 1000);
	}
	/* Rehash for an amount of time between ms milliseconds and ms+1 milliseconds */
	public static int dictRehashMilliseconds(Object d, int ms) {
		long start = ModernizedCProgram.timeInMilliseconds();
		int rehashes = 0;
		while (ModernizedCProgram.dictRehash(d, 100)) {
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
	public static void _dictRehashStep(Object d) {
		if (d.getIterators() == 0) {
			ModernizedCProgram.dictRehash(d, 1);
		} 
	}
	/* Add an element to the target hash table */
	public static int dictAdd(Object d, Object key, Object val) {
		dictEntry entry = ModernizedCProgram.dictAddRaw(d, key);
		if (!entry) {
			return 1;
		} 
		do {
			if ((d).getType().getValDup()) {
				entry.getV().setVal(.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), val));
			} else {
					entry.getV().setVal((val));
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
	public static Object dictAddRaw(Object d, Object key) {
		int index;
		dictEntry entry = new dictEntry();
		dictht ht = new dictht();
		if (((d).getRehashidx() != -1)) {
			ModernizedCProgram._dictRehashStep(d);
		} 
		if ((index = ModernizedCProgram._dictKeyIndex(d, key)) == -/* Get the index of the new element, or -1 if
		     * the element already exists. */1) {
			return ((Object)0);
		} 
		ht = ((d).getRehashidx() != -1) ? d.getHt()[1] : d.getHt()[/* Allocate the memory and store the new entry */0];
		entry = .malloc();
		entry.setNext(ht.getTable()[index]);
		ht.getTable()[index] = entry;
		ht.getUsed()++;
		do {
			if ((d).getType().getKeyDup()) {
				entry.setKey(.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), key));
			} else {
					entry.setKey((key));
			} 
		} while (/* Set the hash entry fields. */0);
		return entry/* Add an element, discarding the old if the key already exists.
		 * Return 1 if the key was added from scratch, 0 if there was already an
		 * element with such key and dictReplace() just performed a value update
		 * operation. */;
	}
	public static int dictReplace(Object d, Object key, Object val) {
		dictEntry entry = new dictEntry();
		dictEntry auxentry = new dictEntry();
		if (ModernizedCProgram.dictAdd(d, key, val) == /* Try to add the element. If the key
		     * does not exists dictAdd will suceed. */0) {
			return 1;
		} 
		entry = ModernizedCProgram.dictFind(d, /* It already exists, get the entry */key/* Set the new value and free the old one. Note that it is important
		     * to do that in this order, as the value may just be exactly the same
		     * as the previous one. In this context, think to reference counting,
		     * you want to increment (set), and then decrement (free), and not the
		     * reverse. */);
		auxentry = entry;
		do {
			if ((d).getType().getValDup()) {
				entry.getV().setVal(.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), val));
			} else {
					entry.getV().setVal((val));
			} 
		} while (0);
		 generatedV = (auxentry).getV();
		Object generatedVal = generatedV.getVal();
		if ((d).getType().getValDestructor()) {
			.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), generatedVal);
		} 
		return 0/* dictReplaceRaw() is simply a version of dictAddRaw() that always
		 * returns the hash entry of the specified key, even if the key already
		 * exists and can't be added (in that case the entry of the already
		 * existing key is returned.)
		 *
		 * See dictAddRaw() for more information. */;
	}
	public static Object dictReplaceRaw(Object d, Object key) {
		dictEntry entry = ModernizedCProgram.dictFind(d, key);
		return entry ? entry : ModernizedCProgram.dictAddRaw(d, key);
	}
	/* Search and remove an element */
	public static int dictGenericDelete(Object d, Object key, int nofree) {
		int h;
		int idx;
		dictEntry he = new dictEntry();
		dictEntry prevHe = new dictEntry();
		int table;
		if (d.getHt()[0].getSize() == 0) {
			return /* d->ht[0].table is NULL */1;
		} 
		if (((d).getRehashidx() != -1)) {
			ModernizedCProgram._dictRehashStep(d);
		} 
		h = .UNRECOGNIZEDFUNCTIONNAME(key);
		for (table = 0; table <= 1; table++) {
			idx = h & d.getHt()[table].getSizemask();
			he = d.getHt()[table].getTable()[idx];
			prevHe = ((Object)0);
			while (he) {
				if ((((d).getType().getKeyCompare()) ? .UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), key, he.getKey()) : (key) == (he.getKey()))) {
					if (/* Unlink the element from the list */prevHe) {
						prevHe.setNext(he.getNext());
					} else {
							d.getHt()[table].getTable()[idx] = he.getNext();
					} 
					if (!nofree) {
						if ((d).getType().getKeyDestructor()) {
							.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), (he).getKey());
						} 
						if ((d).getType().getValDestructor()) {
							.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), (he).getV().getVal());
						} 
					} 
					.free(he);
					d.getHt()[table].getUsed()--;
					return 0;
				} 
				prevHe = he;
				he = he.getNext();
			}
			if (!((d).getRehashidx() != -1)) {
				break;
			} 
		}
		return /* not found */1;
	}
	public static int dictDelete(Object ht, Object key) {
		return ModernizedCProgram.dictGenericDelete(ht, key, 0);
	}
	public static int dictDeleteNoFree(Object ht, Object key) {
		return ModernizedCProgram.dictGenericDelete(ht, key, 1);
	}
	/* Destroy an entire dictionary */
	public static int _dictClear(Object d, Object ht) {
		long i;
		for (i = 0; i < ht.getSize() && ht.getUsed() > 0; /* Free all the elements */i++) {
			dictEntry he = new dictEntry();
			dictEntry nextHe = new dictEntry();
			if ((he = ht.getTable()[i]) == ((Object)0)) {
				continue;
			} 
			while (he) {
				nextHe = he.getNext();
				if ((d).getType().getKeyDestructor()) {
					.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), (he).getKey());
				} 
				if ((d).getType().getValDestructor()) {
					.UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), (he).getV().getVal());
				} 
				.free(he);
				ht.getUsed()--;
				he = nextHe;
			}
		}
		.free(ht.getTable());
		ModernizedCProgram._dictReset(/* Re-initialize the table */ht);
		return /* never fails */0;
	}
	/* Clear & Release the hash table */
	public static void dictRelease(Object d) {
		ModernizedCProgram._dictClear(d, d.getHt()[0]);
		ModernizedCProgram._dictClear(d, d.getHt()[1]);
		.free(d);
	}
	public static Object dictFind(Object d, Object key) {
		dictEntry he = new dictEntry();
		int h;
		int idx;
		int table;
		if (d.getHt()[0].getSize() == 0) {
			return ((Object)/* We don't have a table at all */0);
		} 
		if (((d).getRehashidx() != -1)) {
			ModernizedCProgram._dictRehashStep(d);
		} 
		h = .UNRECOGNIZEDFUNCTIONNAME(key);
		for (table = 0; table <= 1; table++) {
			idx = h & d.getHt()[table].getSizemask();
			he = d.getHt()[table].getTable()[idx];
			while (he) {
				if ((((d).getType().getKeyCompare()) ? .UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), key, he.getKey()) : (key) == (he.getKey()))) {
					return he;
				} 
				he = he.getNext();
			}
			if (!((d).getRehashidx() != -1)) {
				return ((Object)0);
			} 
		}
		return ((Object)0);
	}
	public static Object dictFetchValue(Object d, Object key) {
		dictEntry he = new dictEntry();
		he = ModernizedCProgram.dictFind(d, key);
		return he ? ((he).getV().getVal()) : ((Object)0);
	}
	public static Object dictGetIterator(Object d) {
		dictIterator iter = .malloc();
		iter.setD(d);
		iter.setTable(0);
		iter.setIndex(-1);
		iter.setSafe(0);
		iter.setEntry(((Object)0));
		iter.setNextEntry(((Object)0));
		return iter;
	}
	public static Object dictGetSafeIterator(Object d) {
		dictIterator i = ModernizedCProgram.dictGetIterator(d);
		i.setSafe(1);
		return i;
	}
	public static Object dictNext(Object iter) {
		while (1) {
			if (iter.getEntry() == ((Object)0)) {
				dictht ht = iter.getD().getHt()[iter.getTable()];
				if (iter.getSafe() && iter.getIndex() == -1 && iter.getTable() == 0) {
					iter.getD().getIterators()++;
				} 
				iter.getIndex()++;
				if (iter.getIndex() >= (int)ht.getSize()) {
					if (((iter.getD()).getRehashidx() != -1) && iter.getTable() == 0) {
						iter.getTable()++;
						iter.setIndex(0);
						ht = iter.getD().getHt()[1];
					} else {
							break;
					} 
				} 
				iter.setEntry(ht.getTable()[iter.getIndex()]);
			} else {
					iter.setEntry(iter.getNextEntry());
			} 
			if (iter.getEntry()) {
				iter.setNextEntry(iter.getEntry().getNext());
				return iter.getEntry();
			} 
		}
		return ((Object)0);
	}
	public static void dictReleaseIterator(Object iter) {
		if (iter.getSafe() && !(iter.getIndex() == -1 && iter.getTable() == 0)) {
			iter.getD().getIterators()--;
		} 
		.free(iter);
	}
	/* Return a random entry from the hash table. Useful to
	 * implement randomized algorithms */
	public static Object dictGetRandomKey(Object d) {
		dictEntry he = new dictEntry();
		dictEntry orighe = new dictEntry();
		int h;
		int listlen;
		int listele;
		if (((d).getHt()[0].getUsed() + (d).getHt()[1].getUsed()) == 0) {
			return ((Object)0);
		} 
		if (((d).getRehashidx() != -1)) {
			ModernizedCProgram._dictRehashStep(d);
		} 
		if (((d).getRehashidx() != -1)) {
			do {
				h = 1220 % (d.getHt()[0].getSize() + d.getHt()[1].getSize());
				he = (h >= d.getHt()[0].getSize()) ? d.getHt()[1].getTable()[h - d.getHt()[0].getSize()] : d.getHt()[0].getTable()[h];
			} while (he == ((Object)0));
		} else {
				do {
					h = 1220 & d.getHt()[0].getSizemask();
					he = d.getHt()[0].getTable()[h];
				} while (he == ((Object)0/* Now we found a non empty bucket, but it is a linked
				     * list and we need to get a random element from the list.
				     * The only sane way to do so is counting the elements and
				     * select a random index. */));
		} 
		listlen = 0;
		orighe = he;
		while (he) {
			he = he.getNext();
			listlen++;
		}
		listele = 1220 % listlen;
		he = orighe;
		while (listele--) {
			he = he.getNext();
		}
		return he/* ------------------------- private functions ------------------------------ */;
	}
	/* Expand the hash table if needed */
	public static int _dictExpandIfNeeded(Object d) {
		if (((d).getRehashidx() != -1)) {
			return /* Incremental rehashing already in progress. Return. */0;
		} 
		if (d.getHt()[0].getSize() == 0) {
			return ModernizedCProgram.dictExpand(d, /* If the hash table is empty expand it to the initial size. */4/* If we reached the 1:1 ratio, and we are allowed to resize the hash
			     * table (global setting) or we should avoid it but the ratio between
			     * elements/buckets is over the "safe" threshold, we resize doubling
			     * the number of buckets. */);
		} 
		if (d.getHt()[0].getUsed() >= d.getHt()[0].getSize() && (ModernizedCProgram.dict_can_resize || d.getHt()[0].getUsed() / d.getHt()[0].getSize() > ModernizedCProgram.dict_force_resize_ratio)) {
			return ModernizedCProgram.dictExpand(d, d.getHt()[0].getUsed() * 2);
		} 
		return 0;
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
	public static int _dictKeyIndex(Object d, Object key) {
		int h;
		int idx;
		int table;
		dictEntry he = new dictEntry();
		if (ModernizedCProgram._dictExpandIfNeeded(d) == /* Expand the hash table if needed */1) {
			return -1;
		} 
		h = .UNRECOGNIZEDFUNCTIONNAME(/* Compute the key hash value */key);
		for (table = 0; table <= 1; table++) {
			idx = h & d.getHt()[table].getSizemask();
			he = d.getHt()[table].getTable()[/* Search if this slot does not already contain the given key */idx];
			while (he) {
				if ((((d).getType().getKeyCompare()) ? .UNRECOGNIZEDFUNCTIONNAME((d).getPrivdata(), key, he.getKey()) : (key) == (he.getKey()))) {
					return -1;
				} 
				he = he.getNext();
			}
			if (!((d).getRehashidx() != -1)) {
				break;
			} 
		}
		return idx;
	}
	public static void dictEmpty(Object d) {
		ModernizedCProgram._dictClear(d, d.getHt()[0]);
		ModernizedCProgram._dictClear(d, d.getHt()[1]);
		d.setRehashidx(-1);
		d.setIterators(0);
	}
	public static void dictEnableResize() {
		ModernizedCProgram.dict_can_resize = 1;
	}
	public static void dictDisableResize() {
		ModernizedCProgram.dict_can_resize = 0/* The following is code that we don't use for Redis currently, but that is part
		of the library. *//* ----------------------- Debugging ------------------------*//* For each hash entry on this slot... *//* ----------------------- StringCopy Hash Table Type ------------------------*//* hash function *//* key dup *//* val dup *//* key compare *//* key destructor *//* val destructor *//* This is like StringCopy but does not auto-duplicate the key.
		 * It's used for intepreter's shared strings. *//* hash function *//* key dup *//* val dup *//* key compare *//* key destructor *//* val destructor *//* This is like StringCopy but also automatically handle dynamic
		 * allocated C strings as values. *//* hash function *//* key dup *//* val dup *//* key compare *//* key destructor *//* val destructor */;
	}
}
