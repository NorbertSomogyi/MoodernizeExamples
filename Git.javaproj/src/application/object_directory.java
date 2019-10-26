package application;

public class object_directory {
	private object_directory next;
	private Object loose_objects_subdir_seen;
	private Object loose_objects_cache;
	private Byte path;
	
	public object_directory(object_directory next, Object loose_objects_subdir_seen, Object loose_objects_cache, Byte path) {
		setNext(next);
		setLoose_objects_subdir_seen(loose_objects_subdir_seen);
		setLoose_objects_cache(loose_objects_cache);
		setPath(path);
	}
	public object_directory() {
	}
	
	public int add_possible_reference_from_superproject(Object sas_cb) {
		submodule_alternate_setup sas = sas_cb;
		size_t len = new size_t();
		/*
			 * If the alternate object store is another repository, try the
			 * standard layout with .git/(modules/<name>)+/objects
			 */
		Byte generatedPath = this.getPath();
		Object generatedSubmodule_name = sas.getSubmodule_name();
		byte generatedBuf = sb.getBuf();
		string_list generatedReference = sas.getReference();
		SUBMODULE_ALTERNATE_ERROR_MODE generatedError_mode = sas.getError_mode();
		if (ModernizedCProgram.strip_suffix(generatedPath, "/objects", len)) {
			byte sm_alternate;
			strbuf sb = new strbuf(, , );
			strbuf err = new strbuf(, , );
			sb.strbuf_add(generatedPath, len/*
					 * We need to end the new path with '/' to mark it as a dir,
					 * otherwise a submodule name containing '/' will be broken
					 * as the last part of a missing submodule reference would
					 * be taken as a file name.
					 */);
			sb.strbuf_addf("/modules/%s/", generatedSubmodule_name);
			sm_alternate = ModernizedCProgram.err.compute_alternate_path(generatedBuf);
			if (sm_alternate) {
				generatedReference.string_list_append(ModernizedCProgram.xstrdup(generatedBuf));
				ModernizedCProgram.free(sm_alternate);
			} else {
					switch (generatedError_mode) {
					case SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_IGNORE:
							;
					case SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_DIE:
							ModernizedCProgram.die(ModernizedCProgram._("submodule '%s' cannot add alternate: %s"), generatedSubmodule_name, generatedBuf);
					case SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_INFO:
							(_iob[2]).fprintf_ln(ModernizedCProgram._("submodule '%s' cannot add alternate: %s"), generatedSubmodule_name, generatedBuf);
					}
			} 
			sb.strbuf_release();
		} 
		return 0;
	}
	public int print_alternate(Object data) {
		.printf("alternate: ");
		Byte generatedPath = this.getPath();
		ModernizedCProgram.quote_c_style(generatedPath, ((Object)0), (_iob[1]), 0);
		.putchar((byte)'\n');
		return 0;
	}
	public void free_object_directory() {
		Byte generatedPath = this.getPath();
		ModernizedCProgram.free(generatedPath);
		odb.odb_clear_loose_cache();
		ModernizedCProgram.free(odb);
	}
	public int refs_from_alternate_cb(Object data) {
		strbuf path = new strbuf(, , );
		size_t base_len = new size_t();
		alternate_refs_data cb = data;
		Byte generatedPath = this.getPath();
		if (!path.strbuf_realpath(generatedPath, 0)) {
			;
		} 
		if (!path.strbuf_strip_suffix("/objects")) {
			;
		} 
		Object generatedLen = path.getLen();
		base_len = generatedLen;
		path.strbuf_addstr(/* Is this a git repository with refs? */"/refs");
		byte generatedBuf = path.getBuf();
		if (!ModernizedCProgram.is_directory(generatedBuf)) {
			;
		} 
		path.strbuf_setlen(base_len);
		Object generatedFn = cb.getFn();
		Object generatedData = cb.getData();
		ModernizedCProgram.read_alternate_refs(generatedBuf, generatedFn, generatedData);
		return 0;
	}
	public int check_and_freshen_odb(Object oid, int freshen) {
		strbuf path = new strbuf(, , );
		ModernizedCProgram.odb_loose_path(odb, path, oid);
		byte generatedBuf = path.getBuf();
		return ModernizedCProgram.check_and_freshen_file(generatedBuf, freshen);
	}
	public void odb_clear_loose_cache() {
		int i;
		Object generatedLoose_objects_cache = this.getLoose_objects_cache();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			generatedLoose_objects_cache[i].oid_array_clear();
		}
		Object generatedLoose_objects_subdir_seen = this.getLoose_objects_subdir_seen();
		.memset(generatedLoose_objects_subdir_seen, 0, );
	}
	public object_directory getNext() {
		return next;
	}
	public void setNext(object_directory newNext) {
		next = newNext;
	}
	public Object getLoose_objects_subdir_seen() {
		return loose_objects_subdir_seen;
	}
	public void setLoose_objects_subdir_seen(Object newLoose_objects_subdir_seen) {
		loose_objects_subdir_seen = newLoose_objects_subdir_seen;
	}
	public Object getLoose_objects_cache() {
		return loose_objects_cache;
	}
	public void setLoose_objects_cache(Object newLoose_objects_cache) {
		loose_objects_cache = newLoose_objects_cache;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
}
/*
	 * Used to store the results of readdir(3) calls when we are OK
	 * sacrificing accuracy due to races for speed. That includes
	 * object existence with OBJECT_INFO_QUICK, as well as
	 * our search for unique abbreviated hashes. Don't use it for tasks
	 * requiring greater accuracy!
	 *
	 * Be sure to call odb_load_loose_cache() before using.
	 */
