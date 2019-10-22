package application;

// ========================== Public API ==========================
// ================================================================
// ========================== Set Type Area =======================
// ================================================================
public class bftree {
	private node[] root;
	private bftree_opts[] opts;
	private Object height;
	private int is_migrated;
	private Object del_payload_count;
	private Object put_payload_count;
	
	public bftree(node[] root, bftree_opts[] opts, Object height, int is_migrated, Object del_payload_count, Object put_payload_count) {
		setRoot(root);
		setOpts(opts);
		setHeight(height);
		setIs_migrated(is_migrated);
		setDel_payload_count(del_payload_count);
		setPut_payload_count(put_payload_count);
	}
	public bftree() {
	}
	
	public bftree[] bftree_add(bftree[] tree, int times) {
		int i;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		bftree bftree = new bftree();
		for (i = 0; i < times; ++i) {
			.snprintf(buf, 20, "key%d", i);
			key = ModernizedCProgram.sdsnew(buf);
			.snprintf(buf, 20, "val%d", i);
			val = ModernizedCProgram.sdsnew(buf);
			((bftree.bftree_put(tree, key, val) == 0) ? (Object)0 : ._assert("bftree_put(tree, key, val) == BF_OK", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 81));
		}
		return tree;
	}
	public void bftree_fetch(bftree[] tree, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		bftree bftree = new bftree();
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			((bftree.bftree_get(tree, key)) ? (Object)0 : ._assert("bftree_get(tree, key)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\performance.c", 98));
			ModernizedCProgram.sdsfree(key);
		}
	}
	public void bftree_delele(bftree[] tree, int times) {
		int i;
		int j;
		byte[] buf = new byte[20];
		sds key = new sds();
		sds val = new sds();
		.srand(1992);
		bftree bftree = new bftree();
		for (i = 0; i < times; ++i) {
			j = .rand() % times;
			.snprintf(buf, 20, "key%d", j);
			key = ModernizedCProgram.sdsnew(buf);
			bftree.bftree_del(tree, key);
		}
	}
	public bftree[] bftree_create(bftree_opts[] opts) {
		node[] root = new node();
		bftree tree = new bftree();
		tree = .malloc();
		node node = new node();
		root = node.node_create(((Object)0));
		tree.setRoot(root);
		tree.setHeight(1);
		tree.setOpts(opts);
		tree.setIs_migrated(0);
		tree.setDel_payload_count(tree.setPut_payload_count(0));
		Object[] generatedKey_destructor = opts.getKey_destructor();
		Object[] generatedVal_destructor = opts.getVal_destructor();
		((generatedKey_destructor && generatedVal_destructor) ? (Object)0 : ._assert("opts->key_destructor && opts->val_destructor", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\CBufferedTree\\src\\buffered_tree.c", 448));
		return tree;
	}
	public void bftree_free(bftree[] tree) {
		node[] generatedRoot = tree.getRoot();
		ModernizedCProgram.bftree_free_node(tree, generatedRoot);
		.free(tree);
	}
	public int bftree_put(bftree[] tree, Object[] key, Object[] val) {
		payload[] new_payload = new payload();
		uint32_t idx = new uint32_t();
		if (!tree || !key) {
			return (true);
		} 
		payload payload = new payload();
		new_payload = payload.payload_create(key, val, payload_type.Put);
		bftree_opts[] generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node[] generatedRoot = tree.getRoot();
		Object[] generatedKey = new_payload.getKey();
		node node = new node();
		idx = node.find_container(generatedKey_compare, generatedRoot, generatedKey, 0);
		container container = new container();
		container.container_insert(tree, generatedRoot, idx, new_payload);
		return 0;
	}
	public Object[] bftree_get(bftree[] tree, Object[] key) {
		uint32_t idx = new uint32_t();
		payload[] r = new payload();
		if (!tree || !key) {
			return ((Object)0);
		} 
		bftree_opts[] generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node[] generatedRoot = tree.getRoot();
		node node = new node();
		idx = node.find_container(generatedKey_compare, generatedRoot, key, 0);
		payload payload = new payload();
		r = payload.container_get(tree, generatedRoot, idx, key);
		Object[] generatedVal = r.getVal();
		if (r) {
			return generatedVal;
		} 
		return ((Object)0);
	}
	public int bftree_del(bftree[] tree, Object[] key) {
		uint32_t idx = new uint32_t();
		payload[] new_payload = new payload();
		if (!tree || !key) {
			return (true);
		} 
		payload payload = new payload();
		new_payload = payload.payload_create(key, ((Object)0), payload_type.Del);
		bftree_opts[] generatedOpts = tree.getOpts();
		Object generatedKey_compare = generatedOpts.getKey_compare();
		node[] generatedRoot = tree.getRoot();
		Object[] generatedKey = new_payload.getKey();
		node node = new node();
		idx = node.find_container(generatedKey_compare, generatedRoot, generatedKey, 0);
		container container = new container();
		container.container_insert(tree, generatedRoot, idx, new_payload);
		return 0;
	}
	public int bftree_count(bftree[] tree) {
		bftree_iterator[] iter = new bftree_iterator();
		int count;
		count = 0;
		bftree_iterator bftree_iterator = new bftree_iterator();
		iter = bftree_iterator.bftree_get_iterator(tree);
		payload payload = new payload();
		while (payload.bftree_next(iter) != ((Object)0)) {
			count++;
		}
		bftree_iterator bftree_iterator = new bftree_iterator();
		bftree_iterator.bftree_free_iterator(iter);
		return count;// ================================================================
	}
	public bftree[] bftmap_create() {
		bftree bftree = new bftree();
		return bftree.bftree_create(ModernizedCProgram.map_opt);
	}
	public void bftmap_free(bftree[] tree) {
		bftree bftree = new bftree();
		bftree.bftree_free(tree);
	}
	public int bftmap_put(bftree[] tree, byte[] key, Object key_len, Object[] val) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		return bftree.bftree_put(tree, s, val);
	}
	public Object[] bftmap_get(bftree[] tree, byte[] key, Object key_len) {
		if (!key || !key_len) {
			return ((Object)0);
		} 
		Object[] r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		r = bftree.bftree_get(tree, s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public int bftmap_del(bftree[] tree, byte[] key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		return bftree.bftree_del(tree, s);// ================================================================
	}
	public bftree[] bftset_create() {
		bftree bftree = new bftree();
		return bftree.bftree_create(ModernizedCProgram.map_opt);
	}
	public void bftset_free(bftree[] tree) {
		bftree bftree = new bftree();
		bftree.bftree_free(tree);
	}
	public int bftset_put(bftree[] tree, byte[] key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		return bftree.bftree_put(tree, s, ((Object)0));
	}
	public Object[] bftset_get(bftree[] tree, byte[] key, Object key_len) {
		if (!key || !key_len) {
			return ((Object)0);
		} 
		Object[] r;
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		r = bftree.bftree_get(tree, s);
		ModernizedCProgram.wstr_free(s);
		return r;
	}
	public int bftset_del(bftree[] tree, byte[] key, Object key_len) {
		if (!key || !key_len) {
			return (true);
		} 
		wstr s = ModernizedCProgram.wstr_newlen(key, key_len);
		bftree bftree = new bftree();
		return bftree.bftree_del(tree, s);
	}
	public node[] getRoot() {
		return root;
	}
	public void setRoot(node[] newRoot) {
		root = newRoot;
	}
	public bftree_opts[] getOpts() {
		return opts;
	}
	public void setOpts(bftree_opts[] newOpts) {
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
