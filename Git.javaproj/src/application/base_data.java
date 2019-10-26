package application;

public class base_data {
	private base_data base;
	private base_data child;
	private object_entry obj;
	private Object data;
	private long size;
	private int ref_first;
	private int ref_last;
	private int ofs_first;
	private int ofs_last;
	
	public base_data(base_data base, base_data child, object_entry obj, Object data, long size, int ref_first, int ref_last, int ofs_first, int ofs_last) {
		setBase(base);
		setChild(child);
		setObj(obj);
		setData(data);
		setSize(size);
		setRef_first(ref_first);
		setRef_last(ref_last);
		setOfs_first(ofs_first);
		setOfs_last(ofs_last);
	}
	public base_data() {
	}
	
	public base_data alloc_base_data() {
		base_data base = ModernizedCProgram.xcalloc(1, );
		base.setRef_last(-1);
		base.setOfs_last(-1);
		return base;
	}
	public void free_base_data() {
		Object generatedData = this.getData();
		thread_local thread_local = new thread_local();
		long generatedSize = this.getSize();
		if (generatedData) {
			do {
				ModernizedCProgram.free(generatedData);
				(generatedData) = ((Object)0);
			} while (0);
			thread_local.get_thread_data().getBase_cache_used() -= generatedSize;
		} 
	}
	public void prune_base_data() {
		base_data b = new base_data();
		thread_local thread_local = new thread_local();
		thread_local data = thread_local.get_thread_data();
		Object generatedBase_cache_used = data.getBase_cache_used();
		Object generatedData = b.getData();
		base_data generatedChild = b.getChild();
		base_data generatedBase_cache = data.getBase_cache();
		for (b = generatedBase_cache; generatedBase_cache_used > ModernizedCProgram.delta_base_cache_limit && b; b = generatedChild) {
			if (generatedData && b != retain) {
				b.free_base_data();
			} 
		}
	}
	public void link_base_data(base_data c) {
		thread_local thread_local = new thread_local();
		if (base) {
			this.setChild(c);
		} else {
				thread_local.get_thread_data().setBase_cache(c);
		} 
		c.setBase(base);
		c.setChild(((Object)0));
		Object generatedData = c.getData();
		long generatedSize = c.getSize();
		if (generatedData) {
			thread_local.get_thread_data().getBase_cache_used() += generatedSize;
		} 
		c.prune_base_data();
	}
	public void unlink_base_data() {
		base_data generatedBase = this.getBase();
		base_data base = generatedBase;
		thread_local thread_local = new thread_local();
		if (base) {
			base.setChild(((Object)0));
		} else {
				thread_local.get_thread_data().setBase_cache(((Object)0));
		} 
		c.free_base_data();
	}
	public Object get_base_data() {
		Object generatedData = this.getData();
		object_entry generatedObj = this.getObj();
		Object generatedType = generatedObj.getType();
		base_data generatedBase = this.getBase();
		Object generatedSize = obj.getSize();
		thread_local thread_local = new thread_local();
		pack_idx_entry generatedIdx = obj.getIdx();
		Object generatedOffset = generatedIdx.getOffset();
		if (!generatedData) {
			object_entry obj = generatedObj;
			base_data delta = ((Object)0);
			int delta_nr = 0;
			int delta_alloc = 0;
			while (ModernizedCProgram.is_delta_type(generatedType) && !generatedData) {
				do {
					if ((delta_nr + 1) > delta_alloc) {
						if ((((delta_alloc) + 16) * 3 / 2) < (delta_nr + 1)) {
							delta_alloc = (delta_nr + 1);
						} else {
								delta_alloc = (((delta_alloc) + 16) * 3 / 2);
						} 
						(delta) = ModernizedCProgram.xrealloc((delta), ModernizedCProgram.st_mult(, (delta_alloc)));
					} 
				} while (0);
				delta[delta_nr++] = c;
				c = generatedBase;
			}
			if (!delta_nr) {
				this.setData(obj.get_data_from_pack());
				this.setSize(generatedSize);
				thread_local.get_thread_data().getBase_cache_used() += generatedSize;
				c.prune_base_data();
			} 
			for (; delta_nr > 0; delta_nr--) {
				Object base;
				Object raw;
				c = delta[delta_nr - 1];
				obj = generatedObj;
				base = generatedBase.get_base_data();
				raw = obj.get_data_from_pack();
				this.setData(ModernizedCProgram.patch_delta(base, generatedSize, raw, generatedSize, generatedSize));
				ModernizedCProgram.free(raw);
				if (!generatedData) {
					ModernizedCProgram.bad_object(generatedOffset, ModernizedCProgram._("failed to apply delta"));
				} 
				thread_local.get_thread_data().getBase_cache_used() += generatedSize;
				c.prune_base_data();
			}
			ModernizedCProgram.free(delta);
		} 
		return generatedData;
	}
	public base_data find_unresolved_deltas_1(base_data prev_base) {
		int generatedRef_last = this.getRef_last();
		int generatedOfs_last = this.getOfs_last();
		object_entry generatedObj = this.getObj();
		pack_idx_entry generatedIdx = generatedObj.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		int generatedRef_first = this.getRef_first();
		Object generatedOffset = generatedIdx.getOffset();
		int generatedOfs_first = this.getOfs_first();
		Object generatedData = this.getData();
		if (generatedRef_last == -1 && generatedOfs_last == -1) {
			ModernizedCProgram.find_ref_delta_children(generatedOid, generatedRef_first, generatedRef_last, object_type.OBJ_REF_DELTA);
			ModernizedCProgram.find_ofs_delta_children(generatedOffset, generatedOfs_first, generatedOfs_last, object_type.OBJ_OFS_DELTA);
			if (generatedRef_last == -1 && generatedOfs_last == -1) {
				ModernizedCProgram.free(generatedData);
				return ((Object)0);
			} 
			prev_base.link_base_data(base);
		} 
		base_data base_data = new base_data();
		Object generatedReal_type = child.getReal_type();
		if (generatedRef_first <= generatedRef_last) {
			object_entry child = ModernizedCProgram.objects + ModernizedCProgram.ref_deltas[generatedRef_first].getObj_no();
			base_data result = base_data.alloc_base_data();
			if (!ModernizedCProgram.compare_and_swap_type(generatedReal_type, object_type.OBJ_REF_DELTA, generatedReal_type)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\index-pack.c", 1006, "child->real_type != OBJ_REF_DELTA");
			} 
			ModernizedCProgram.resolve_delta(child, base, result);
			if (generatedRef_first == generatedRef_last && generatedOfs_last == -1) {
				base.free_base_data();
			} 
			generatedRef_first++;
			return result;
		} 
		if (generatedOfs_first <= generatedOfs_last) {
			object_entry child = ModernizedCProgram.objects + ModernizedCProgram.ofs_deltas[generatedOfs_first].getObj_no();
			base_data result = base_data.alloc_base_data();
			((generatedReal_type == object_type.OBJ_OFS_DELTA) ? (Object)0 : ._assert("child->real_type == OBJ_OFS_DELTA", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\index-pack.c", 1020));
			child.setReal_type(generatedReal_type);
			ModernizedCProgram.resolve_delta(child, base, result);
			if (generatedOfs_first == generatedOfs_last) {
				base.free_base_data();
			} 
			generatedOfs_first++;
			return result;
		} 
		base.unlink_base_data();
		return ((Object)0);
	}
	public void find_unresolved_deltas() {
		base_data new_base = new base_data();
		base_data prev_base = ((Object)0);
		base_data generatedBase = this.getBase();
		for (; ; ) {
			new_base = base.find_unresolved_deltas_1(prev_base);
			if (new_base) {
				prev_base = base;
				base = new_base;
			} else {
					ModernizedCProgram.free(base);
					base = prev_base;
					if (!base) {
						return ;
					} 
					prev_base = generatedBase;
			} 
		}
	}
	public base_data getBase() {
		return base;
	}
	public void setBase(base_data newBase) {
		base = newBase;
	}
	public base_data getChild() {
		return child;
	}
	public void setChild(base_data newChild) {
		child = newChild;
	}
	public object_entry getObj() {
		return obj;
	}
	public void setObj(object_entry newObj) {
		obj = newObj;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public int getRef_first() {
		return ref_first;
	}
	public void setRef_first(int newRef_first) {
		ref_first = newRef_first;
	}
	public int getRef_last() {
		return ref_last;
	}
	public void setRef_last(int newRef_last) {
		ref_last = newRef_last;
	}
	public int getOfs_first() {
		return ofs_first;
	}
	public void setOfs_first(int newOfs_first) {
		ofs_first = newOfs_first;
	}
	public int getOfs_last() {
		return ofs_last;
	}
	public void setOfs_last(int newOfs_last) {
		ofs_last = newOfs_last;
	}
}
