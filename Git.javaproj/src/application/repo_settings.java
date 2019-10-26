package application;

public class repo_settings {
	private int initialized;
	private int core_commit_graph;
	private int gc_write_commit_graph;
	private int fetch_write_commit_graph;
	private int index_version;
	private untracked_cache_setting core_untracked_cache;
	private int pack_use_sparse;
	private fetch_negotiation_setting fetch_negotiation_algorithm;
	
	public repo_settings(int initialized, int core_commit_graph, int gc_write_commit_graph, int fetch_write_commit_graph, int index_version, untracked_cache_setting core_untracked_cache, int pack_use_sparse, fetch_negotiation_setting fetch_negotiation_algorithm) {
		setInitialized(initialized);
		setCore_commit_graph(core_commit_graph);
		setGc_write_commit_graph(gc_write_commit_graph);
		setFetch_write_commit_graph(fetch_write_commit_graph);
		setIndex_version(index_version);
		setCore_untracked_cache(core_untracked_cache);
		setPack_use_sparse(pack_use_sparse);
		setFetch_negotiation_algorithm(fetch_negotiation_algorithm);
	}
	public repo_settings() {
	}
	
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getCore_commit_graph() {
		return core_commit_graph;
	}
	public void setCore_commit_graph(int newCore_commit_graph) {
		core_commit_graph = newCore_commit_graph;
	}
	public int getGc_write_commit_graph() {
		return gc_write_commit_graph;
	}
	public void setGc_write_commit_graph(int newGc_write_commit_graph) {
		gc_write_commit_graph = newGc_write_commit_graph;
	}
	public int getFetch_write_commit_graph() {
		return fetch_write_commit_graph;
	}
	public void setFetch_write_commit_graph(int newFetch_write_commit_graph) {
		fetch_write_commit_graph = newFetch_write_commit_graph;
	}
	public int getIndex_version() {
		return index_version;
	}
	public void setIndex_version(int newIndex_version) {
		index_version = newIndex_version;
	}
	public untracked_cache_setting getCore_untracked_cache() {
		return core_untracked_cache;
	}
	public void setCore_untracked_cache(untracked_cache_setting newCore_untracked_cache) {
		core_untracked_cache = newCore_untracked_cache;
	}
	public int getPack_use_sparse() {
		return pack_use_sparse;
	}
	public void setPack_use_sparse(int newPack_use_sparse) {
		pack_use_sparse = newPack_use_sparse;
	}
	public fetch_negotiation_setting getFetch_negotiation_algorithm() {
		return fetch_negotiation_algorithm;
	}
	public void setFetch_negotiation_algorithm(fetch_negotiation_setting newFetch_negotiation_algorithm) {
		fetch_negotiation_algorithm = newFetch_negotiation_algorithm;
	}
}
/* Subsystems */
/*
	 * Repository's config which contains key-value pairs from the usual
	 * set of config files (i.e. repo specific .git/config, user wide
	 * ~/.gitconfig, XDG config file and the global /etc/gitconfig)
	 */
