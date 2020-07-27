package application;

/*
 * Submodule entry containing the information about a certain submodule
 * in a certain revision.
 */
public class submodule {
	private Object path;
	private Object name;
	private Object url;
	private int fetch_recurse;
	private Object ignore;
	private Object branch;
	private submodule_update_strategy update_strategy;
	private object_id gitmodules_oid;
	private int recommend_shallow;
	
	public submodule(Object path, Object name, Object url, int fetch_recurse, Object ignore, Object branch, submodule_update_strategy update_strategy, object_id gitmodules_oid, int recommend_shallow) {
		setPath(path);
		setName(name);
		setUrl(url);
		setFetch_recurse(fetch_recurse);
		setIgnore(ignore);
		setBranch(branch);
		setUpdate_strategy(update_strategy);
		setGitmodules_oid(gitmodules_oid);
		setRecommend_shallow(recommend_shallow);
	}
	public submodule() {
	}
	
	public submodule cache_lookup_name(submodule_cache cache, Object gitmodules_oid, Object name) {
		submodule_entry entry = new submodule_entry();
		int hash = ModernizedCProgram.hash_oid_string(gitmodules_oid, name);
		submodule_entry key = new submodule_entry();
		submodule key_config = new submodule();
		object_id generatedGitmodules_oid = key_config.getGitmodules_oid();
		generatedGitmodules_oid.oidcpy(gitmodules_oid);
		key_config.setName(name);
		hashmap_entry generatedEnt = key.getEnt();
		generatedEnt.hashmap_entry_init(hash);
		key.setConfig(key_config);
		hashmap generatedFor_name = cache.getFor_name();
		hashmap_entry hashmap_entry = new hashmap_entry();
		entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedFor_name, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
		submodule generatedConfig = entry.getConfig();
		if (entry) {
			return generatedConfig;
		} 
		return ((Object)0);
	}
	public submodule lookup_or_create_by_name(submodule_cache cache, Object gitmodules_oid, Object name) {
		submodule submodule = new submodule();
		strbuf name_buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		submodule submodule = new submodule();
		submodule = submodule.cache_lookup_name(cache, gitmodules_oid, name);
		if (submodule) {
			return submodule;
		} 
		submodule = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		name_buf.strbuf_addstr(name);
		submodule.setName(name_buf.strbuf_detach(((Object)0)));
		submodule.setPath(((Object)0));
		submodule.setUrl(((Object)0));
		submodule_update_strategy generatedUpdate_strategy = submodule.getUpdate_strategy();
		generatedUpdate_strategy.setType(submodule_update_type.SM_UPDATE_UNSPECIFIED);
		generatedUpdate_strategy.setCommand(((Object)0));
		submodule.setFetch_recurse(.RECURSE_SUBMODULES_NONE);
		submodule.setIgnore(((Object)0));
		submodule.setBranch(((Object)0));
		submodule.setRecommend_shallow(-1);
		object_id generatedGitmodules_oid = submodule.getGitmodules_oid();
		generatedGitmodules_oid.oidcpy(gitmodules_oid);
		ModernizedCProgram.cache_add(cache, submodule);
		return submodule;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public int getFetch_recurse() {
		return fetch_recurse;
	}
	public void setFetch_recurse(int newFetch_recurse) {
		fetch_recurse = newFetch_recurse;
	}
	public Object getIgnore() {
		return ignore;
	}
	public void setIgnore(Object newIgnore) {
		ignore = newIgnore;
	}
	public Object getBranch() {
		return branch;
	}
	public void setBranch(Object newBranch) {
		branch = newBranch;
	}
	public submodule_update_strategy getUpdate_strategy() {
		return update_strategy;
	}
	public void setUpdate_strategy(submodule_update_strategy newUpdate_strategy) {
		update_strategy = newUpdate_strategy;
	}
	public object_id getGitmodules_oid() {
		return gitmodules_oid;
	}
	public void setGitmodules_oid(object_id newGitmodules_oid) {
		gitmodules_oid = newGitmodules_oid;
	}
	public int getRecommend_shallow() {
		return recommend_shallow;
	}
	public void setRecommend_shallow(int newRecommend_shallow) {
		recommend_shallow = newRecommend_shallow;
	}
}
