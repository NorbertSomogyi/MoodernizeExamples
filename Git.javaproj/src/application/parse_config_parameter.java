package application;

public class parse_config_parameter {
	private submodule_cache cache;
	private Object treeish_name;
	private Object gitmodules_oid;
	private int overwrite;
	
	public parse_config_parameter(submodule_cache cache, Object treeish_name, Object gitmodules_oid, int overwrite) {
		setCache(cache);
		setTreeish_name(treeish_name);
		setGitmodules_oid(gitmodules_oid);
		setOverwrite(overwrite);
	}
	public parse_config_parameter() {
	}
	
	public submodule_cache getCache() {
		return cache;
	}
	public void setCache(submodule_cache newCache) {
		cache = newCache;
	}
	public Object getTreeish_name() {
		return treeish_name;
	}
	public void setTreeish_name(Object newTreeish_name) {
		treeish_name = newTreeish_name;
	}
	public Object getGitmodules_oid() {
		return gitmodules_oid;
	}
	public void setGitmodules_oid(Object newGitmodules_oid) {
		gitmodules_oid = newGitmodules_oid;
	}
	public int getOverwrite() {
		return overwrite;
	}
	public void setOverwrite(int newOverwrite) {
		overwrite = newOverwrite;
	}
}
