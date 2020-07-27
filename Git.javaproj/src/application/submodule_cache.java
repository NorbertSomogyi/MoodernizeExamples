package application;

/*
 * submodule cache lookup structure
 * There is one shared set of 'struct submodule' entries which can be
 * looked up by their sha1 blob id of the .gitmodules file and either
 * using path or name as key.
 * for_path stores submodule entries with path as key
 * for_name stores submodule entries with name as key
 */
public class submodule_cache {
	private hashmap for_path;
	private hashmap for_name;
	private int initialized;
	private int gitmodules_read;
	
	public submodule_cache(hashmap for_path, hashmap for_name, int initialized, int gitmodules_read) {
		setFor_path(for_path);
		setFor_name(for_name);
		setInitialized(initialized);
		setGitmodules_read(gitmodules_read);
	}
	public submodule_cache() {
	}
	
	public submodule_cache submodule_cache_alloc() {
		return ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
	}
	public void submodule_cache_init() {
		hashmap generatedFor_path = this.getFor_path();
		generatedFor_path.hashmap_init(config_path_cmp, ((Object)0), 0);
		hashmap generatedFor_name = this.getFor_name();
		generatedFor_name.hashmap_init(config_name_cmp, ((Object)0), 0);
		this.setInitialized(1);
	}
	public void submodule_cache_clear() {
		hashmap_iter iter = new hashmap_iter();
		submodule_entry entry = new submodule_entry();
		int generatedInitialized = this.getInitialized();
		if (!generatedInitialized) {
			return /*Error: Unsupported expression*/;
		} 
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap generatedFor_name = this.getFor_name();
		hashmap_entry hashmap_entry = new hashmap_entry();
		for (entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_first(generatedFor_name, iter), ((size_t)((int)0).getEnt())); entry; entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_next(iter), ((size_t)((int)0).getEnt()))) {
			/* member name */entry.free_one_config();
		}
		hashmap generatedFor_path = this.getFor_path();
		generatedFor_path.hashmap_free_(((size_t)((submodule_entry)0).getEnt()));
		;
		generatedFor_name.hashmap_free_(((size_t)((submodule_entry)0).getEnt()));
		;
		this.setInitialized(0);
		this.setGitmodules_read(0);
	}
	public void submodule_cache_free() {
		cache.submodule_cache_clear();
		ModernizedCProgram.free(cache);
	}
	public Object cache_lookup_path(Object gitmodules_oid, Object path) {
		submodule_entry entry = new submodule_entry();
		int hash = ModernizedCProgram.hash_oid_string(gitmodules_oid, path);
		submodule_entry key = new submodule_entry();
		submodule key_config = new submodule();
		object_id generatedGitmodules_oid = key_config.getGitmodules_oid();
		generatedGitmodules_oid.oidcpy(gitmodules_oid);
		key_config.setPath(path);
		hashmap_entry generatedEnt = key.getEnt();
		generatedEnt.hashmap_entry_init(hash);
		key.setConfig(key_config);
		hashmap generatedFor_path = this.getFor_path();
		hashmap_entry hashmap_entry = new hashmap_entry();
		entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedFor_path, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
		submodule generatedConfig = entry.getConfig();
		if (entry) {
			return generatedConfig;
		} 
		return ((Object)0);
	}
	public Object config_from(Object treeish_name, Object key, lookup_type lookup_type) {
		strbuf rev = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		long config_size;
		byte config = ((Object)0);
		object_id oid = new object_id();
		object_type type;
		submodule submodule = ((Object)0);
		parse_config_parameter parameter = new parse_config_parameter();
		/*
			 * If any parameter except the cache is a NULL pointer just
			 * return the first submodule. Can be used to check whether
			 * there are any submodules parsed.
			 */
		hashmap generatedFor_name = this.getFor_name();
		hashmap_entry hashmap_entry = new hashmap_entry();
		submodule generatedConfig = entry.getConfig();
		if (!treeish_name || !key) {
			hashmap_iter iter = new hashmap_iter();
			submodule_entry entry = new submodule_entry();
			entry = (submodule_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_first(generatedFor_name, iter), ((size_t)((submodule_entry)0).getEnt()));
			if (!/* member name */entry) {
				return ((Object)0);
			} 
			return generatedConfig;
		} 
		if (!ModernizedCProgram.gitmodule_oid_from_commit(treeish_name, oid, rev)) {
			;
		} 
		submodule submodule = new submodule();
		switch (lookup_type.lookup_type) {
		case lookup_type.lookup_path:
				submodule = cache.cache_lookup_path(oid, key);
				break;
		case lookup_type.lookup_name:
				submodule = submodule.cache_lookup_name(cache, oid, key);
				break;
		}
		if (submodule) {
			;
		} 
		config = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, config_size);
		if (!config || object_type.type != object_type.OBJ_BLOB) {
			;
		} 
		parameter.setCache(/* fill the submodule config into the cache */cache);
		parameter.setTreeish_name(treeish_name);
		parameter.setGitmodules_oid(oid);
		parameter.setOverwrite(0);
		byte[] generatedBuf = rev.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_from_mem(parse_config, config_origin_type.CONFIG_ORIGIN_SUBMODULE_BLOB, generatedBuf, config, config_size, parameter, ((Object)0));
		rev.strbuf_release();
		ModernizedCProgram.free(config);
		switch (lookup_type.lookup_type) {
		case lookup_type.lookup_path:
				return cache.cache_lookup_path(oid, key);
		case lookup_type.lookup_name:
				return submodule.cache_lookup_name(cache, oid, key);
		default:
				return ((Object)0);
		}
		ModernizedCProgram.free(config);
		return submodule;
	}
	public hashmap getFor_path() {
		return for_path;
	}
	public void setFor_path(hashmap newFor_path) {
		for_path = newFor_path;
	}
	public hashmap getFor_name() {
		return for_name;
	}
	public void setFor_name(hashmap newFor_name) {
		for_name = newFor_name;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getGitmodules_read() {
		return gitmodules_read;
	}
	public void setGitmodules_read(int newGitmodules_read) {
		gitmodules_read = newGitmodules_read;
	}
}
