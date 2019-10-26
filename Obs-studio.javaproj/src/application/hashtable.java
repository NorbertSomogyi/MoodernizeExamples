package application;

public class hashtable {
	private Object size;
	private hashtable_bucket buckets;
	private Object order;
	private hashtable_list list;
	private hashtable_list ordered_list;
	
	public hashtable(Object size, hashtable_bucket buckets, Object order, hashtable_list list, hashtable_list ordered_list) {
		setSize(size);
		setBuckets(buckets);
		setOrder(order);
		setList(list);
		setOrdered_list(ordered_list);
	}
	public hashtable() {
	}
	
	/* returns 0 on success, -1 if key was not found */
	public int hashtable_do_del(Object key, Object hash) {
		pair_t pair = new pair_t();
		bucket_t bucket = new bucket_t();
		size_t index = new size_t();
		Object generatedOrder = this.getOrder();
		index = hash & (((size_t)1 << (generatedOrder)) - 1);
		hashtable_bucket generatedBuckets = this.getBuckets();
		bucket = generatedBuckets[index];
		hashtable_pair hashtable_pair = new hashtable_pair();
		pair = hashtable_pair.hashtable_find_pair(hashtable, bucket, key, hash);
		if (!pair) {
			return -1;
		} 
		hashtable_list generatedList = pair.getList();
		hashtable_list generatedFirst = bucket.getFirst();
		hashtable_list generatedLast = bucket.getLast();
		hashtable_list generatedNext = generatedList.getNext();
		hashtable_list generatedPrev = generatedList.getPrev();
		if (generatedList == generatedFirst && generatedList == generatedLast) {
			bucket.setFirst(bucket.setLast(generatedList));
		}  else if (generatedList == generatedFirst) {
			bucket.setFirst(generatedNext);
		}  else if (generatedList == generatedLast) {
			bucket.setLast(generatedPrev);
		} 
		generatedList.list_remove();
		hashtable_list generatedOrdered_list = pair.getOrdered_list();
		generatedOrdered_list.list_remove();
		json_t generatedValue = pair.getValue();
		generatedValue.json_decref();
		ModernizedCProgram.jsonp_free(pair);
		Object generatedSize = this.getSize();
		generatedSize--;
		return 0;
	}
	public void hashtable_do_clear() {
		list_t list = new list_t();
		list_t next = new list_t();
		pair_t pair = new pair_t();
		hashtable_list generatedList = this.getList();
		hashtable_list generatedNext = list.getNext();
		json_t generatedValue = pair.getValue();
		for (list = generatedNext; list != generatedList; list = next) {
			next = generatedNext;
			pair = ((pair_t)((byte)list - ((size_t)generatedList)));
			generatedValue.json_decref();
			ModernizedCProgram.jsonp_free(pair);
		}
	}
	public int hashtable_do_rehash() {
		list_t list = new list_t();
		list_t next = new list_t();
		pair_t pair = new pair_t();
		size_t i = new size_t();
		size_t index = new size_t();
		size_t new_size = new size_t();
		size_t new_order = new size_t();
		hashtable_bucket new_buckets = new hashtable_bucket();
		Object generatedOrder = this.getOrder();
		new_order = generatedOrder + 1;
		new_size = ((size_t)1 << (new_order));
		new_buckets = ModernizedCProgram.jsonp_malloc(new_size * );
		if (!new_buckets) {
			return -1;
		} 
		hashtable_bucket generatedBuckets = this.getBuckets();
		ModernizedCProgram.jsonp_free(generatedBuckets);
		this.setBuckets(new_buckets);
		this.setOrder(new_order);
		hashtable_list generatedList = this.getList();
		for (i = 0; i < ((size_t)1 << (generatedOrder)); i++) {
			generatedBuckets[i].setFirst(generatedBuckets[i].setLast(generatedList));
		}
		hashtable_list generatedNext = generatedList.getNext();
		list = generatedNext;
		generatedList.list_init();
		Object generatedHash = pair.getHash();
		for (; list != generatedList; list = next) {
			next = generatedNext;
			pair = ((pair_t)((byte)list - ((size_t)generatedList)));
			index = generatedHash % new_size;
			ModernizedCProgram.insert_to_bucket(hashtable, generatedBuckets[index], generatedList);
		}
		return 0;
	}
	public int hashtable_init() {
		size_t i = new size_t();
		this.setSize(0);
		this.setOrder(3);
		Object generatedOrder = this.getOrder();
		this.setBuckets(ModernizedCProgram.jsonp_malloc(((size_t)1 << (generatedOrder)) * ));
		hashtable_bucket generatedBuckets = this.getBuckets();
		if (!generatedBuckets) {
			return -1;
		} 
		hashtable_list generatedList = this.getList();
		generatedList.list_init();
		hashtable_list generatedOrdered_list = this.getOrdered_list();
		generatedOrdered_list.list_init();
		for (i = 0; i < ((size_t)1 << (generatedOrder)); i++) {
			generatedBuckets[i].setFirst(generatedBuckets[i].setLast(generatedList));
		}
		return 0;
	}
	public void hashtable_close() {
		hashtable.hashtable_do_clear();
		hashtable_bucket generatedBuckets = this.getBuckets();
		ModernizedCProgram.jsonp_free(generatedBuckets);
	}
	public Object hashtable_get(Object key) {
		pair_t pair = new pair_t();
		size_t hash = new size_t();
		bucket_t bucket = new bucket_t();
		hash = ((size_t)ModernizedCProgram.hashlittle((key), .strlen(key), ModernizedCProgram.hashtable_seed));
		hashtable_bucket generatedBuckets = this.getBuckets();
		Object generatedOrder = this.getOrder();
		bucket = generatedBuckets[hash & (((size_t)1 << (generatedOrder)) - 1)];
		hashtable_pair hashtable_pair = new hashtable_pair();
		pair = hashtable_pair.hashtable_find_pair(hashtable, bucket, key, hash);
		if (!pair) {
			return ((Object)0);
		} 
		json_t generatedValue = pair.getValue();
		return generatedValue;
	}
	public int hashtable_del(Object key) {
		size_t hash = ((size_t)ModernizedCProgram.hashlittle((key), .strlen(key), ModernizedCProgram.hashtable_seed));
		return hashtable.hashtable_do_del(key, hash);
	}
	public void hashtable_clear() {
		size_t i = new size_t();
		hashtable.hashtable_do_clear();
		Object generatedOrder = this.getOrder();
		hashtable_list generatedList = this.getList();
		hashtable_bucket generatedBuckets = this.getBuckets();
		for (i = 0; i < ((size_t)1 << (generatedOrder)); i++) {
			generatedBuckets[i].setFirst(generatedBuckets[i].setLast(generatedList));
		}
		generatedList.list_init();
		hashtable_list generatedOrdered_list = this.getOrdered_list();
		generatedOrdered_list.list_init();
		this.setSize(0);
	}
	public Object hashtable_iter() {
		hashtable_list generatedOrdered_list = this.getOrdered_list();
		return hashtable.hashtable_iter_next(generatedOrdered_list);
	}
	public Object hashtable_iter_at(Object key) {
		pair_t pair = new pair_t();
		size_t hash = new size_t();
		bucket_t bucket = new bucket_t();
		hash = ((size_t)ModernizedCProgram.hashlittle((key), .strlen(key), ModernizedCProgram.hashtable_seed));
		hashtable_bucket generatedBuckets = this.getBuckets();
		Object generatedOrder = this.getOrder();
		bucket = generatedBuckets[hash & (((size_t)1 << (generatedOrder)) - 1)];
		hashtable_pair hashtable_pair = new hashtable_pair();
		pair = hashtable_pair.hashtable_find_pair(hashtable, bucket, key, hash);
		if (!pair) {
			return ((Object)0);
		} 
		hashtable_list generatedOrdered_list = pair.getOrdered_list();
		return generatedOrdered_list;
	}
	public Object hashtable_iter_next(Object iter) {
		list_t list = (list_t)iter;
		hashtable_list generatedNext = list.getNext();
		hashtable_list generatedOrdered_list = this.getOrdered_list();
		if (generatedNext == generatedOrdered_list) {
			return ((Object)0);
		} 
		return generatedNext;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public hashtable_bucket getBuckets() {
		return buckets;
	}
	public void setBuckets(hashtable_bucket newBuckets) {
		buckets = newBuckets;
	}
	public Object getOrder() {
		return order;
	}
	public void setOrder(Object newOrder) {
		order = newOrder;
	}
	public hashtable_list getList() {
		return list;
	}
	public void setList(hashtable_list newList) {
		list = newList;
	}
	public hashtable_list getOrdered_list() {
		return ordered_list;
	}
	public void setOrdered_list(hashtable_list newOrdered_list) {
		ordered_list = newOrdered_list;
	}
}
