package application;

public class tree_content {
	private int entry_capacity;
	private int entry_count;
	private int delta_depth;
	private Object entries;
	
	public tree_content(int entry_capacity, int entry_count, int delta_depth, Object entries) {
		setEntry_capacity(entry_capacity);
		setEntry_count(entry_count);
		setDelta_depth(delta_depth);
		setEntries(entries);
	}
	public tree_content() {
	}
	
	public tree_content new_tree_content(int cnt) {
		avail_tree_content f = new avail_tree_content();
		avail_tree_content l = ((Object)0);
		tree_content t = new tree_content();
		int hc = ModernizedCProgram.hc_entries(cnt);
		int generatedEntry_capacity = f.getEntry_capacity();
		for (f = ModernizedCProgram.avail_tree_table[hc]; f; ) {
			if (generatedEntry_capacity >= cnt) {
				break;
			} 
		}
		avail_tree_content generatedNext_avail = f.getNext_avail();
		Object generatedEntries = t.getEntries();
		if (f) {
			if (l) {
				l.setNext_avail(generatedNext_avail);
			} else {
					ModernizedCProgram.avail_tree_table[hc] = generatedNext_avail;
			} 
		} else {
				cnt = cnt & 7 ? ((cnt / 8) + 1) * 8 : cnt;
				f = ModernizedCProgram.fi_mem_pool.mem_pool_alloc(/*Error: sizeof expression not supported yet*/ + /*Error: sizeof expression not supported yet*/ * cnt);
				f.setEntry_capacity(cnt);
		} 
		t = (tree_content)f;
		t.setEntry_count(0);
		t.setDelta_depth(0);
		return t;
	}
	public void release_tree_content() {
		avail_tree_content f = (avail_tree_content)t;
		int generatedEntry_capacity = f.getEntry_capacity();
		int hc = ModernizedCProgram.hc_entries(generatedEntry_capacity);
		f.setNext_avail(ModernizedCProgram.avail_tree_table[hc]);
		ModernizedCProgram.avail_tree_table[hc] = f;
	}
	public void release_tree_content_recursive() {
		int i;
		int generatedEntry_count = this.getEntry_count();
		Object generatedEntries = this.getEntries();
		for (i = 0; i < generatedEntry_count; i++) {
			generatedEntries[i].release_tree_entry();
		}
		t.release_tree_content();
	}
	public tree_content grow_tree_content(int amt) {
		int generatedEntry_count = this.getEntry_count();
		tree_content tree_content = new tree_content();
		tree_content r = tree_content.new_tree_content(generatedEntry_count + amt);
		r.setEntry_count(generatedEntry_count);
		int generatedDelta_depth = this.getDelta_depth();
		r.setDelta_depth(generatedDelta_depth);
		Object generatedEntries = r.getEntries();
		ModernizedCProgram.copy_array((generatedEntries), (generatedEntries), (generatedEntry_count), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		t.release_tree_content();
		return r;
	}
	public tree_content dup_tree_content() {
		tree_content d = new tree_content();
		tree_entry a = new tree_entry();
		tree_entry b = new tree_entry();
		int i;
		if (!s) {
			return ((Object)0);
		} 
		int generatedEntry_count = this.getEntry_count();
		tree_content tree_content = new tree_content();
		d = tree_content.new_tree_content(generatedEntry_count);
		Object generatedEntries = this.getEntries();
		tree_entry tree_entry = new tree_entry();
		tree_content generatedTree = a.getTree();
		Object generatedVersions = b.getVersions();
		for (i = 0; i < generatedEntry_count; i++) {
			a = generatedEntries[i];
			b = tree_entry.new_tree_entry();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(b, a, /*Error: sizeof expression not supported yet*/);
			if (generatedTree && ModernizedCProgram.is_null_oid(generatedVersions[1].getOid())) {
				b.setTree(generatedTree.dup_tree_content());
			} else {
					b.setTree(((Object)0));
			} 
			generatedEntries[i] = b;
		}
		d.setEntry_count(generatedEntry_count);
		int generatedDelta_depth = this.getDelta_depth();
		d.setDelta_depth(generatedDelta_depth);
		return d;
	}
	public int getEntry_capacity() {
		return entry_capacity;
	}
	public void setEntry_capacity(int newEntry_capacity) {
		entry_capacity = newEntry_capacity;
	}
	public int getEntry_count() {
		return entry_count;
	}
	public void setEntry_count(int newEntry_count) {
		entry_count = newEntry_count;
	}
	public int getDelta_depth() {
		return delta_depth;
	}
	public void setDelta_depth(int newDelta_depth) {
		delta_depth = newDelta_depth;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
}
