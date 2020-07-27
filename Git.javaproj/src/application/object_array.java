package application;

public class object_array {
	private int nr;
	private int alloc;
	private object_array_entry[] objects;
	
	public object_array(int nr, int alloc, object_array_entry[] objects) {
		setNr(nr);
		setAlloc(alloc);
		setObjects(objects);
	}
	public object_array() {
	}
	
	public void object_array_filter(Object want, Object cb_data) {
		int generatedNr = this.getNr();
		int nr = generatedNr;
		int src;
		int dst;
		object_array_entry[] generatedObjects = this.getObjects();
		object_array_entry objects = generatedObjects;
		for (src = dst = 0; src < nr; src++) {
			if (/*Error: Function owner not recognized*/want(objects[src], cb_data)) {
				if (src != dst) {
					objects[dst] = objects[src];
				} 
				dst++;
			} else {
					objects[src].object_array_release_entry();
			} 
		}
		this.setNr(dst);
	}
	public void object_array_clear() {
		int i;
		int generatedNr = this.getNr();
		object_array_entry[] generatedObjects = this.getObjects();
		for (i = 0; i < generatedNr; i++) {
			generatedObjects[i].object_array_release_entry();
		}
		do {
			ModernizedCProgram.free(generatedObjects);
			(generatedObjects) = ((Object)0);
		} while (0);
		this.setNr(this.setAlloc(0/*
		 * Return true iff array already contains an entry with name.
		 */));
	}
	public int contains_name(Object name) {
		int generatedNr = this.getNr();
		int nr = generatedNr;
		int i;
		object_array_entry[] generatedObjects = this.getObjects();
		object_array_entry object = generatedObjects;
		Byte generatedName = object.getName();
		for (i = 0; i < nr; ) {
			if (!/*Error: Function owner not recognized*/strcmp(generatedName, name)) {
				return 1;
			} 
		}
		return 0;
	}
	public void object_array_remove_duplicates() {
		int generatedNr = this.getNr();
		int nr = generatedNr;
		int src;
		object_array_entry[] generatedObjects = this.getObjects();
		object_array_entry objects = generatedObjects;
		this.setNr(0);
		for (src = 0; src < nr; src++) {
			if (!array.contains_name(objects[src].getName())) {
				if (src != generatedNr) {
					objects[generatedNr] = objects[src];
				} 
				generatedNr++;
			} else {
					objects[src].object_array_release_entry();
			} 
		}
	}
	public int can_all_from_reach_with_flag(int with_flag, int assign_flag, Object min_commit_date, Object min_generation) {
		commit list = ((Object)0);
		int i;
		int nr_commits;
		int result = 1;
		(list) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.from.getNr())));
		nr_commits = 0;
		int generatedFlags = from_one.getFlags();
		int generatedType = from_one.getType();
		for (i = 0; i < ModernizedCProgram.from.getNr(); i++) {
			object from_one = ModernizedCProgram.from.getObjects()[i].getItem();
			if (!from_one || generatedFlags & assign_flag) {
				continue;
			} 
			from_one = /*Error: Function owner not recognized*/deref_tag(ModernizedCProgram.the_repository, from_one, "a from object", 0);
			if (!from_one || generatedType != object_type.OBJ_COMMIT/*
						 * no way to tell if this is reachable by
						 * looking at the ancestry chain alone, so
						 * leave a note to ourselves not to worry about
						 * this object anymore.
						 */) {
				generatedFlags |=  assign_flag;
				continue;
			} 
			list[nr_commits] = (commit)from_one;
			if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, list[nr_commits]) || list[nr_commits].getGeneration() < min_generation) {
				result = 0;
				;
			} 
			nr_commits++;
		}
		ModernizedCProgram.sane_qsort((list), (nr_commits), /*Error: sizeof expression not supported yet*/, compare_commits_by_gen);
		commit generatedItem = parent.getItem();
		Object generatedDate = generatedItem.getDate();
		Object generatedGeneration = generatedItem.getGeneration();
		commit_list generatedNext = parent.getNext();
		commit_list generatedParents = generatedItem.getParents();
		for (i = 0; i < nr_commits; i++) {
			commit_list stack = ((Object)/* DFS from list[i] */0);
			generatedFlags |=  assign_flag;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(list[i], stack);
			while (stack) {
				commit_list parent = new commit_list();
				if (generatedFlags & (with_flag | (-1024 << 19))) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pop_commit(stack);
					if (stack) {
						generatedFlags |=  (-1024 << 19);
					} 
					continue;
				} 
				for (parent = generatedParents; parent; parent = generatedNext) {
					if (generatedFlags & (with_flag | (-1024 << 19))) {
						generatedFlags |=  (-1024 << 19);
					} 
					if (!(generatedFlags & assign_flag)) {
						generatedFlags |=  assign_flag;
						if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, generatedItem) || generatedDate < min_commit_date || generatedGeneration < min_generation) {
							continue;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(generatedItem, stack);
						break;
					} 
				}
				if (!parent) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pop_commit(stack);
				} 
			}
			if (!(generatedFlags & (with_flag | (-1024 << 19)))) {
				result = 0;
				;
			} 
		}
		ModernizedCProgram.free(list);
		for (i = 0; i < ModernizedCProgram.from.getNr(); i++) {
			generatedFlags &=  ~assign_flag;
		}
		return result;
	}
	public void gc_boundary() {
		int generatedNr = this.getNr();
		int generatedAlloc = this.getAlloc();
		if (generatedNr == generatedAlloc) {
			array.object_array_filter(entry_unshown, ((Object)0));
		} 
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
	public object_array_entry[] getObjects() {
		return objects;
	}
	public void setObjects(object_array_entry[] newObjects) {
		objects = newObjects;
	}
}
