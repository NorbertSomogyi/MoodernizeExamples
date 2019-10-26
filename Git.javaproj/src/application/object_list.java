package application;

public class object_list {
	private object item;
	private object_list next;
	
	public object_list(object item, object_list next) {
		setItem(item);
		setNext(next);
	}
	public object_list() {
	}
	
	public object_list add_one_object(object obj) {
		object_list entry = ModernizedCProgram.xmalloc();
		entry.setItem(obj);
		entry.setNext(p);
		p = entry;
		object_list generatedNext = entry.getNext();
		return generatedNext;
	}
	public object_list process_blob(blob blob) {
		object generatedObject = blob.getObject();
		object obj = generatedObject;
		int generatedFlags = obj.getFlags();
		generatedFlags |=  (-1024 << 16);
		if (generatedFlags & ((-1024 << 1) | (-1024 << 0))) {
			return p;
		} 
		generatedFlags |=  (-1024 << 0);
		return p.add_one_object(obj);
		object generatedObject = blob.getObject();
		object obj = generatedObject;
		size_t pathlen = new size_t();
		list_objects_filter_result r;
		if (!ModernizedCProgram.ctx.getRevs().getBlob_objects()) {
			return ;
		} 
		if (!obj) {
			ModernizedCProgram.die("bad blob object");
		} 
		int generatedFlags = obj.getFlags();
		if (generatedFlags & ((-1024 << 1) | (-1024 << 0))) {
			return ;
		} 
		object_id generatedOid = obj.getOid();
		if (ModernizedCProgram.ctx.getRevs().getExclude_promisor_objects() && !ModernizedCProgram.the_repository.repo_has_object_file(generatedOid) && ModernizedCProgram.is_promisor_object(generatedOid)) {
			return ;
		} 
		pathlen = ModernizedCProgram.path.getLen();
		ModernizedCProgram.path.strbuf_addstr(name);
		list_objects_filter_result.r = ModernizedCProgram.list_objects_filter__filter_object(ModernizedCProgram.ctx.getRevs().getRepo(), list_objects_filter_situation.LOFS_BLOB, obj, ModernizedCProgram.path.getBuf(), ModernizedCProgram.path.getBuf()[pathlen], ModernizedCProgram.ctx.getFilter());
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_MARK_SEEN) {
			generatedFlags |=  (-1024 << 0);
		} 
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_DO_SHOW) {
			.UNRECOGNIZEDFUNCTIONNAME(obj, ModernizedCProgram.path.getBuf(), ModernizedCProgram.ctx.getShow_data());
		} 
		ModernizedCProgram.path.strbuf_setlen(pathlen/*
		 * Processing a gitlink entry currently does nothing, since
		 * we do not recurse into the subproject.
		 *
		 * We *could* eventually add a flag that actually does that,
		 * which would involve:
		 *  - is the subproject actually checked out?
		 *  - if so, see if the subproject has already been added
		 *    to the alternates list, and add it if not.
		 *  - process the commit (or tag) the gitlink points to
		 *    recursively.
		 *
		 * However, it's unclear whether there is really ever any
		 * reason to see superprojects and subprojects as such a
		 * "unified" object pool (potentially resulting in a totally
		 * humongous pack - avoiding which was the whole point of
		 * having gitlinks in the first place!).
		 *
		 * So for now, there is just a note that we *could* follow
		 * the link, and how to do it. Whether it necessarily makes
		 * any sense what-so-ever to ever do that is another issue.
		 */);
	}
	public object_list process_tree(tree tree) {
		Object generatedObject = tree.getObject();
		object obj = generatedObject;
		tree_desc desc = new tree_desc();
		name_entry entry = new name_entry();
		int generatedFlags = obj.getFlags();
		generatedFlags |=  (-1024 << 16);
		if (generatedFlags & ((-1024 << 1) | (-1024 << 0))) {
			return p;
		} 
		object_id generatedOid = obj.getOid();
		if (tree.parse_tree() < 0) {
			ModernizedCProgram.die("bad tree object %s", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		generatedFlags |=  (-1024 << 0);
		p = p.add_one_object(obj);
		Object generatedBuffer = tree.getBuffer();
		Object generatedSize = tree.getSize();
		desc.init_tree_desc(generatedBuffer, generatedSize);
		tree tree = new tree();
		blob blob = new blob();
		int generatedMode = entry.getMode();
		while (ModernizedCProgram.tree_entry(desc, entry)) {
			switch (ModernizedCProgram.object_type(generatedMode)) {
			case object_type.OBJ_BLOB:
					p = p.process_blob(blob.lookup_blob(ModernizedCProgram.the_repository, generatedOid));
					break;
			case object_type.OBJ_TREE:
					p = p.process_tree(tree.lookup_tree(ModernizedCProgram.the_repository, generatedOid));
					break;
			default:
					break;
			}
		}
		tree.free_tree_buffer();
		return p;
		tree_desc desc = new tree_desc();
		name_entry entry = new name_entry();
		if (tree.parse_tree()) {
			return -1;
		} 
		Object generatedBuffer = tree.getBuffer();
		Object generatedSize = tree.getSize();
		desc.init_tree_desc(generatedBuffer, generatedSize);
		int generatedMode = entry.getMode();
		object_id generatedOid = entry.getOid();
		tree tree = new tree();
		Object generatedObject = tree.getObject();
		blob blob = new blob();
		while (ModernizedCProgram.tree_entry(desc, entry)) {
			object obj = ((Object)0);
			if ((((generatedMode) & -1024) == /* submodule commits are not stored in the superproject */160000)) {
				continue;
			} 
			if ((((generatedMode) & -1024) == -1024)) {
				tree tree = tree.lookup_tree(ModernizedCProgram.the_repository, generatedOid);
				if (tree) {
					obj = generatedObject;
				} 
			} else {
					blob blob = blob.lookup_blob(ModernizedCProgram.the_repository, generatedOid);
					if (blob) {
						obj = generatedObject;
					} 
			} 
			if (!obj || ModernizedCProgram.process(walker, obj)) {
				return -1;
			} 
		}
		tree.free_tree_buffer();
		return 0/* Remember to update object flag allocation in object.h */;
		Object generatedObject = tree.getObject();
		object obj = generatedObject;
		rev_info revs = ModernizedCProgram.ctx.getRevs();
		Object generatedLen = base.getLen();
		int baselen = generatedLen;
		list_objects_filter_result r;
		int failed_parse;
		int generatedTree_objects = revs.getTree_objects();
		if (!generatedTree_objects) {
			return ;
		} 
		if (!obj) {
			ModernizedCProgram.die("bad tree object");
		} 
		int generatedFlags = obj.getFlags();
		if (generatedFlags & ((-1024 << 1) | (-1024 << 0))) {
			return ;
		} 
		failed_parse = tree.parse_tree_gently(1);
		int generatedIgnore_missing_links = revs.getIgnore_missing_links();
		int generatedExclude_promisor_objects = revs.getExclude_promisor_objects();
		object_id generatedOid = obj.getOid();
		int generatedDo_not_die_on_missing_tree = revs.getDo_not_die_on_missing_tree();
		if (failed_parse) {
			if (generatedIgnore_missing_links) {
				return ;
			} 
			if (generatedExclude_promisor_objects && ModernizedCProgram.is_promisor_object(generatedOid)) {
				return ;
			} 
			if (!generatedDo_not_die_on_missing_tree) {
				ModernizedCProgram.die("bad tree object %s", ModernizedCProgram.oid_to_hex(generatedOid));
			} 
		} 
		base.strbuf_addstr(name);
		byte generatedBuf = base.getBuf();
		list_objects_filter_result.r = ModernizedCProgram.list_objects_filter__filter_object(ModernizedCProgram.ctx.getRevs().getRepo(), list_objects_filter_situation.LOFS_BEGIN_TREE, obj, generatedBuf, generatedBuf[baselen], ModernizedCProgram.ctx.getFilter());
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_MARK_SEEN) {
			generatedFlags |=  (-1024 << 0);
		} 
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_DO_SHOW) {
			.UNRECOGNIZEDFUNCTIONNAME(obj, generatedBuf, ModernizedCProgram.ctx.getShow_data());
		} 
		if (generatedLen) {
			base.strbuf_addch((byte)'/');
		} 
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_SKIP_TREE) {
			do {
				if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
					ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects.c", 199, "Skipping contents of tree %s...\n", generatedBuf);
				} 
			} while (0);
		}  else if (!failed_parse) {
			ModernizedCProgram.process_tree_contents(ModernizedCProgram.ctx, tree, base);
		} 
		list_objects_filter_result.r = ModernizedCProgram.list_objects_filter__filter_object(ModernizedCProgram.ctx.getRevs().getRepo(), list_objects_filter_situation.LOFS_END_TREE, obj, generatedBuf, generatedBuf[baselen], ModernizedCProgram.ctx.getFilter());
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_MARK_SEEN) {
			generatedFlags |=  (-1024 << 0);
		} 
		if (list_objects_filter_result.r & list_objects_filter_result.LOFR_DO_SHOW) {
			.UNRECOGNIZEDFUNCTIONNAME(obj, generatedBuf, ModernizedCProgram.ctx.getShow_data());
		} 
		base.strbuf_setlen(baselen);
		tree.free_tree_buffer();
	}
	public object_list object_list_insert(object item) {
		object_list new_list = ModernizedCProgram.xmalloc();
		new_list.setItem(item);
		new_list.setNext(list_p);
		list_p = new_list;
		return new_list;
	}
	public object getItem() {
		return item;
	}
	public void setItem(object newItem) {
		item = newItem;
	}
	public object_list getNext() {
		return next;
	}
	public void setNext(object_list newNext) {
		next = newNext;
	}
}
