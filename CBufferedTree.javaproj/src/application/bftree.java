package application;

// ========================== Public API ==========================
// ================================================================
// ========================== Set Type Area =======================
// ================================================================
public class bftree {
	private node root;
	private bftree_opts opts;
	private Object height;
	private int is_migrated;
	private Object del_payload_count;
	private Object put_payload_count;
	
	public bftree(node root, bftree_opts opts, Object height, int is_migrated, Object del_payload_count, Object put_payload_count) {
		setRoot(root);
		setOpts(opts);
		setHeight(height);
		setIs_migrated(is_migrated);
		setDel_payload_count(del_payload_count);
		setPut_payload_count(put_payload_count);
	}
	public bftree() {
	}
	
	public bftree bftree_add(int times) {
		int i;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		for (i = 0; i < times; ++i) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "key%d", i);
			key = ModernizedCProgram.sdsnew(buf);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf, 20, "val%d", i);
			val = ModernizedCProgram.sdsnew(buf);
			((tree.bftree_put(key, val) == 0) ? null : /*Error: Function owner not recognized*/_assert("bftree_put(tree, key, val) == BF_OK", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 81));
		}
		return tree;
	}
	public void bftree_fetch(int times) {
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
			((tree.bftree_get(key)) ? null : /*Error: Function owner not recognized*/_assert("bftree_get(tree, key)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 98));
			ModernizedCProgram.sdsfree(key);
		}
	}
	public void bftree_delele(int times) {
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
			tree.bftree_del(key);
		}
	}
	public bftree bftree_create(bftree_opts opts) {
		node root = new node();
		bftree tree = new bftree();
		tree = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		root = (null).node_create();
		tree.setRoot(root);
		tree.setHeight(1);
		tree.setOpts(opts);
		tree.setIs_migrated(0);
		tree.setDel_payload_count(tree.setPut_payload_count(0));
		Object generatedKey_destructor = opts.getKey_destructor();
		Object generatedVal_destructor = opts.getVal_destructor();
		((generatedKey_destructor && generatedVal_destructor) ? null : /*Error: Function owner not recognized*/_assert("opts->key_destructor && opts->val_destructor", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 448));
		return tree;
	}
	public void bftree_free() {
		node generatedRoot = this.getRoot();
		ModernizedCProgram.bftree_free_node(tree, generatedRoot);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(tree);
	}
	public int bftree_put(Object key, Object val) {
		payload new_payload = new payload();
		uint32_t idx = new uint32_t();
		if (!tree || !key) {
			return (true);
		} 
		payload payload = new payload();
		new_payload = payload.payload_create(key, val, payload_type.Put);
		bftree_opts generatedOpts = this.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node generatedRoot = this.getRoot();
		Object generatedKey = new_payload.getKey();
		idx = generatedRoot.find_container(generatedKey_compare, generatedKey, 0);
		container container = new container();
		container.container_insert(tree, generatedRoot, idx, new_payload);
		return 0;
	}
	public Object bftree_get(Object key) {
		uint32_t idx = new uint32_t();
		payload r = new payload();
		if (!tree || !key) {
			return (null);
		} 
		bftree_opts generatedOpts = this.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node generatedRoot = this.getRoot();
		idx = generatedRoot.find_container(generatedKey_compare, key, 0);
		payload payload = new payload();
		r = payload.container_get(tree, generatedRoot, idx, key);
		Object generatedVal = r.getVal();
		if (r) {
			return generatedVal;
		} 
		return (null);
	}
	public int bftree_del(Object key) {
		uint32_t idx = new uint32_t();
		payload new_payload = new payload();
		if (!tree || !key) {
			return (true);
		} 
		payload payload = new payload();
		new_payload = payload.payload_create(key, (null), payload_type.Del);
		bftree_opts generatedOpts = this.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node generatedRoot = this.getRoot();
		Object generatedKey = new_payload.getKey();
		idx = generatedRoot.find_container(generatedKey_compare, generatedKey, 0);
		container container = new container();
		container.container_insert(tree, generatedRoot, idx, new_payload);
		return 0;
	}
	public int bftree_count() {
		bftree_iterator iter = new bftree_iterator();
		int count;
		count = 0;
		bftree_iterator bftree_iterator = new bftree_iterator();
		iter = bftree_iterator.bftree_get_iterator(tree);
		payload payload = new payload();
		while (payload.bftree_next(iter) != (null)) {
			count++;
		}
		iter.bftree_free_iterator();
		return count;// ================================================================
	}
	public bftree bftmap_create() {
		bftree bftree = new bftree();
		return bftree.bftree_create(ModernizedCProgram.map_opt);
	}
	public void bftmap_free() {
		tree.bftree_free();
	}
	public int bftmap_put(Byte key, Object key_len, Object val) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return tree.bftree_put(s, val);
	}
	public Object bftmap_get(Byte key, Object key_len) {
		if (!key || !key_len) {
			return (null);
		} 
		Object r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		r = tree.bftree_get(s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public int bftmap_del(Byte key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return tree.bftree_del(s);// ================================================================
	}
	public bftree bftset_create() {
		bftree bftree = new bftree();
		return bftree.bftree_create(ModernizedCProgram.map_opt);
	}
	public void bftset_free() {
		tree.bftree_free();
	}
	public int bftset_put(Byte key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return tree.bftree_put(s, (null));
	}
	public Object bftset_get(Byte key, Object key_len) {
		if (!key || !key_len) {
			return (null);
		} 
		Object r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		r = tree.bftree_get(s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public int bftset_del(Byte key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		return tree.bftree_del(s);
	}
	public node getRoot() {
		return root;
	}
	public void setRoot(node newRoot) {
		root = newRoot;
	}
	public bftree_opts getOpts() {
		return opts;
	}
	public void setOpts(bftree_opts newOpts) {
		opts = newOpts;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public int getIs_migrated() {
		return is_migrated;
	}
	public void setIs_migrated(int newIs_migrated) {
		is_migrated = newIs_migrated;
	}
	public Object getDel_payload_count() {
		return del_payload_count;
	}
	public void setDel_payload_count(Object newDel_payload_count) {
		del_payload_count = newDel_payload_count;
	}
	public Object getPut_payload_count() {
		return put_payload_count;
	}
	public void setPut_payload_count(Object newPut_payload_count) {
		put_payload_count = newPut_payload_count;
	}
}
