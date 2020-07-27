package application;

public class attr_check {
	private int nr;
	private int alloc;
	private attr_check_item[] items;
	private int all_attrs_nr;
	private all_attrs_item[] all_attrs;
	private attr_stack stack;
	
	public attr_check(int nr, int alloc, attr_check_item[] items, int all_attrs_nr, all_attrs_item[] all_attrs, attr_stack stack) {
		setNr(nr);
		setAlloc(alloc);
		setItems(items);
		setAll_attrs_nr(all_attrs_nr);
		setAll_attrs(all_attrs);
		setStack(stack);
	}
	public attr_check() {
	}
	
	public attr_check load_merge_attributes() {
		attr_check attr_check = new attr_check();
		if (!ModernizedCProgram.merge_attributes) {
			ModernizedCProgram.merge_attributes = attr_check.attr_check_initl("merge", "conflict-marker-size", ((Object)0));
		} 
		return ModernizedCProgram.merge_attributes;
	}
	public void check_vector_add() {
		ModernizedCProgram.vector_lock();
		Object generatedNr = check_vector.getNr();
		Object generatedAlloc = check_vector.getAlloc();
		attr_check[][] generatedChecks = check_vector.getChecks();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					check_vector.setAlloc((generatedNr + 1));
				} else {
						check_vector.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedChecks) = ModernizedCProgram.xrealloc((generatedChecks), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
			} 
		} while (0);
		generatedChecks[generatedNr++] = c;
		ModernizedCProgram.vector_unlock();
	}
	public void check_vector_remove() {
		int i;
		ModernizedCProgram.vector_lock();
		Object generatedNr = check_vector.getNr();
		attr_check[][] generatedChecks = check_vector.getChecks();
		for (i = 0; i < generatedNr; /* Find entry */i++) {
			if (generatedChecks[i] == ModernizedCProgram.check) {
				break;
			} 
		}
		if (i >= generatedNr) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\attr.c", 533, "no entry found");
		} 
		for (; i < generatedNr - 1; /* shift entries over */i++) {
			generatedChecks[i] = generatedChecks[i + 1];
		}
		generatedNr--;
		ModernizedCProgram.vector_unlock();
	}
	public attr_check attr_check_alloc() {
		attr_check c = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		/* save pointer to the check struct */c.check_vector_add();
		return c;
	}
	public attr_check attr_check_initl(Object one) {
		attr_check check = new attr_check();
		int cnt;
		va_list params = new va_list();
		byte param;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(params, one);
		for (cnt = 1; (param = (int)params) != ((Object)0); cnt++) {
			;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(params);
		attr_check attr_check = new attr_check();
		check = attr_check.attr_check_alloc();
		check.setNr(cnt);
		check.setAlloc(cnt);
		check.setItems(ModernizedCProgram.xcalloc(cnt, /*Error: Unsupported expression*/));
		attr_check_item[] generatedItems = check.getItems();
		generatedItems[0].setAttr(ModernizedCProgram.git_attr(one));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(params, one);
		int generatedNr = check.getNr();
		for (cnt = 1; cnt < generatedNr; cnt++) {
			git_attr attr = new git_attr();
			param = (int)params;
			if (!param) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\attr.c", 592, "counted %d != ended at %d", generatedNr, cnt);
			} 
			ModernizedCProgram.attr = ModernizedCProgram.git_attr(param);
			if (!ModernizedCProgram.attr) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\attr.c", 595, "%s: not a valid attribute name", param);
			} 
			generatedItems[cnt].setAttr(ModernizedCProgram.attr);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(params);
		return check;
	}
	public attr_check attr_check_dup(Object check) {
		attr_check ret = new attr_check();
		if (!check) {
			return ((Object)0);
		} 
		attr_check attr_check = new attr_check();
		ret = attr_check.attr_check_alloc();
		ret.setNr(check.getNr());
		ret.setAlloc(check.getAlloc());
		attr_check_item[] generatedItems = ret.getItems();
		int generatedNr = ret.getNr();
		(generatedItems) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedNr)));
		ModernizedCProgram.copy_array((generatedItems), (generatedItems), (generatedNr), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		return ret;
	}
	public void attr_check_reset() {
		ModernizedCProgram.check.setNr(0);
	}
	public void attr_check_clear() {
		do {
			ModernizedCProgram.free(ModernizedCProgram.check.getItems());
			(ModernizedCProgram.check.getItems()) = ((Object)0);
		} while (0);
		ModernizedCProgram.check.setAlloc(0);
		ModernizedCProgram.check.setNr(0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.check.getAll_attrs());
			(ModernizedCProgram.check.getAll_attrs()) = ((Object)0);
		} while (0);
		ModernizedCProgram.check.setAll_attrs_nr(0);
		ModernizedCProgram.check.getStack().drop_attr_stack();
	}
	public void attr_check_free() {
		if (ModernizedCProgram.check) {
			/* Remove check from the check vector */ModernizedCProgram.check.check_vector_remove();
			ModernizedCProgram.check.attr_check_clear();
			ModernizedCProgram.free(ModernizedCProgram.check);
		} 
	}
	/*
	 * Collect attributes for path into the array pointed to by check->all_attrs.
	 * If check->check_nr is non-zero, only attributes in check[] are collected.
	 * Otherwise all attributes are collected.
	 */
	public void collect_some_attrs(Object istate, Object path) {
		int pathlen;
		int rem;
		int dirlen;
		byte cp;
		byte last_slash = ((Object)0);
		int basename_offset;
		for (cp = path; cp; cp++) {
			if (cp == (byte)'/' && cp[1]) {
				last_slash = cp;
			} 
		}
		pathlen = cp - path;
		if (last_slash) {
			basename_offset = last_slash + 1 - path;
			dirlen = last_slash - path;
		} else {
				basename_offset = 0;
				dirlen = 0;
		} 
		ModernizedCProgram.check.getStack().prepare_attr_stack(istate, path, dirlen);
		ModernizedCProgram.all_attrs_init(ModernizedCProgram.g_attr_hashmap, ModernizedCProgram.check);
		ModernizedCProgram.check.getAll_attrs().determine_macros(ModernizedCProgram.check.getStack());
		rem = ModernizedCProgram.check.getAll_attrs_nr();
		ModernizedCProgram.fill(path, pathlen, basename_offset, ModernizedCProgram.check.getStack(), ModernizedCProgram.check.getAll_attrs(), rem);
	}
	public void git_check_attr(Object istate, Object path) {
		int i;
		ModernizedCProgram.check.collect_some_attrs(istate, path);
		for (i = 0; i < ModernizedCProgram.check.getNr(); i++) {
			size_t n = ModernizedCProgram.check.getItems()[i].getAttr().getAttr_nr();
			byte value = ModernizedCProgram.check.getAll_attrs()[n].getValue();
			if (value == ModernizedCProgram.git_attr__unknown) {
				value = ((Object)0);
			} 
			ModernizedCProgram.check.getItems()[i].setValue(value);
		}
	}
	public void git_all_attrs(Object istate, Object path) {
		int i;
		ModernizedCProgram.check.attr_check_reset();
		ModernizedCProgram.check.collect_some_attrs(istate, path);
		attr_check_item attr_check_item = new attr_check_item();
		for (i = 0; i < ModernizedCProgram.check.getAll_attrs_nr(); i++) {
			byte name = ModernizedCProgram.check.getAll_attrs()[i].getAttr().getName();
			byte value = ModernizedCProgram.check.getAll_attrs()[i].getValue();
			attr_check_item item = new attr_check_item();
			if (value == ((Object)0) || value == ModernizedCProgram.git_attr__unknown) {
				continue;
			} 
			item = attr_check_item.attr_check_append(ModernizedCProgram.check, ModernizedCProgram.git_attr(name));
			item.setValue(value);
		}
	}
	public void output_attr(Object file) {
		int j;
		int cnt = ModernizedCProgram.check.getNr();
		for (j = 0; j < cnt; j++) {
			byte value = ModernizedCProgram.check.getItems()[j].getValue();
			if (((value) == ModernizedCProgram.git_attr__true)) {
				value = "set";
			}  else if (((value) == ModernizedCProgram.git_attr__false)) {
				value = "unset";
			}  else if (((value) == ((Object)0))) {
				value = "unspecified";
			} 
			if (ModernizedCProgram.nul_term_line) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(/* path */"%s%c%s%c%s%c"/* attrname */, file, /* attrvalue */0, ModernizedCProgram.git_attr_name(ModernizedCProgram.check.getItems()[j].getAttr()), 0, value, 0);
			} else {
					ModernizedCProgram.quote_c_style(file, ((Object)0), (_iob[1]), 0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(": %s: %s\n", ModernizedCProgram.git_attr_name(ModernizedCProgram.check.getItems()[j].getAttr()), value);
			} 
		}
	}
	public void check_attr(Object prefix, int collect_all, Object file) {
		byte full_path = ModernizedCProgram.prefix_path(prefix, prefix ? /*Error: Function owner not recognized*/strlen(prefix) : 0, file);
		if (collect_all) {
			ModernizedCProgram.check.git_all_attrs(ModernizedCProgram.the_index, full_path);
		} else {
				ModernizedCProgram.check.git_check_attr(ModernizedCProgram.the_index, full_path);
		} 
		ModernizedCProgram.check.output_attr(file);
		ModernizedCProgram.free(full_path);
	}
	public void check_attr_stdin_paths(Object prefix, int collect_all) {
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf unquoted = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf_getline_fn getline_fn = new strbuf_getline_fn();
		getline_fn = ModernizedCProgram.nul_term_line ? ModernizedCProgram.strbuf_getline_nul : ModernizedCProgram.strbuf_getline_lf;
		byte[] generatedBuf = buf.getBuf();
		while (/*Error: Function owner not recognized*/getline_fn(buf, (_iob[0])) != (true)) {
			if (!ModernizedCProgram.nul_term_line && generatedBuf[0] == (byte)'"') {
				unquoted.strbuf_setlen(0);
				if (unquoted.unquote_c_style(generatedBuf, ((Object)0))) {
					ModernizedCProgram.die("line is badly quoted");
				} 
				buf.strbuf_swap(unquoted);
			} 
			ModernizedCProgram.check.check_attr(prefix, collect_all, generatedBuf);
			(_iob[1]).maybe_flush_or_die("attribute to stdout");
		}
		buf.strbuf_release();
		unquoted.strbuf_release();
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public attr_check_item[] getItems() {
		return items;
	}
	public void setItems(attr_check_item[] newItems) {
		items = newItems;
	}
	public int getAll_attrs_nr() {
		return all_attrs_nr;
	}
	public void setAll_attrs_nr(int newAll_attrs_nr) {
		all_attrs_nr = newAll_attrs_nr;
	}
	public all_attrs_item[] getAll_attrs() {
		return all_attrs;
	}
	public void setAll_attrs(all_attrs_item[] newAll_attrs) {
		all_attrs = newAll_attrs;
	}
	public attr_stack getStack() {
		return stack;
	}
	public void setStack(attr_stack newStack) {
		stack = newStack;
	}
}
/*
 * Retrieve all attributes that apply to the specified path.
 * check holds the attributes and their values.
 */
