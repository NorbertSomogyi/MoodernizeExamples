package application;

public class raw_object_store {
	private object_directory odb;
	private object_directory odb_tail;
	private int loaded_alternates;
	private Byte alternate_db;
	private oidmap replace_map;
	private commit_graph commit_graph;
	private int commit_graph_attempted;
	private multi_pack_index multi_pack_index;
	private packed_git packed_git;
	private list_head packed_git_mru;
	private long approximate_object_count;
	private int approximate_object_count_valid;
	private int packed_git_initialized;
	
	public raw_object_store(object_directory odb, object_directory odb_tail, int loaded_alternates, Byte alternate_db, oidmap replace_map, commit_graph commit_graph, int commit_graph_attempted, multi_pack_index multi_pack_index, packed_git packed_git, list_head packed_git_mru, long approximate_object_count, int approximate_object_count_valid, int packed_git_initialized) {
		setOdb(odb);
		setOdb_tail(odb_tail);
		setLoaded_alternates(loaded_alternates);
		setAlternate_db(alternate_db);
		setReplace_map(replace_map);
		setCommit_graph(commit_graph);
		setCommit_graph_attempted(commit_graph_attempted);
		setMulti_pack_index(multi_pack_index);
		setPacked_git(packed_git);
		setPacked_git_mru(packed_git_mru);
		setApproximate_object_count(approximate_object_count);
		setApproximate_object_count_valid(approximate_object_count_valid);
		setPacked_git_initialized(packed_git_initialized);
	}
	public raw_object_store() {
	}
	
	public raw_object_store raw_object_store_new() {
		raw_object_store o = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(o, 0, /*Error: sizeof expression not supported yet*/);
		list_head generatedPacked_git_mru = o.getPacked_git_mru();
		(generatedPacked_git_mru).setNext((generatedPacked_git_mru).setPrev((generatedPacked_git_mru)));
		return o;
	}
	public void free_object_directories() {
		object_directory generatedOdb = this.getOdb();
		object_directory generatedNext = generatedOdb.getNext();
		while (generatedOdb) {
			object_directory next = new object_directory();
			next = generatedNext;
			generatedOdb.free_object_directory();
			this.setOdb(next);
		}
	}
	public void raw_object_store_clear() {
		Byte generatedAlternate_db = this.getAlternate_db();
		do {
			ModernizedCProgram.free(generatedAlternate_db);
			(generatedAlternate_db) = ((Object)0);
		} while (0);
		oidmap generatedReplace_map = this.getReplace_map();
		generatedReplace_map.oidmap_free(1);
		do {
			ModernizedCProgram.free(generatedReplace_map);
			(generatedReplace_map) = ((Object)0);
		} while (0);
		commit_graph generatedCommit_graph = this.getCommit_graph();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_commit_graph(generatedCommit_graph);
		this.setCommit_graph(((Object)0));
		this.setCommit_graph_attempted(0);
		o.free_object_directories();
		this.setOdb_tail(((Object)0));
		this.setLoaded_alternates(0);
		list_head generatedPacked_git_mru = this.getPacked_git_mru();
		(generatedPacked_git_mru).setNext((generatedPacked_git_mru).setPrev((generatedPacked_git_mru)));
		o.close_object_store();
		this.setPacked_git(((Object)0));
	}
	public void close_object_store() {
		packed_git p = new packed_git();
		int generatedDo_not_close = p.getDo_not_close();
		packed_git generatedNext = p.getNext();
		packed_git generatedPacked_git = this.getPacked_git();
		for (p = generatedPacked_git; p; p = generatedNext) {
			if (generatedDo_not_close) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packfile.c", 339, "want to close pack marked 'do-not-close'");
			} else {
					p.close_pack();
			} 
		}
		multi_pack_index generatedMulti_pack_index = this.getMulti_pack_index();
		if (generatedMulti_pack_index) {
			generatedMulti_pack_index.close_midx();
			this.setMulti_pack_index(((Object)0));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close_commit_graph(o);
	}
	public object_directory getOdb() {
		return odb;
	}
	public void setOdb(object_directory newOdb) {
		odb = newOdb;
	}
	public object_directory getOdb_tail() {
		return odb_tail;
	}
	public void setOdb_tail(object_directory newOdb_tail) {
		odb_tail = newOdb_tail;
	}
	public int getLoaded_alternates() {
		return loaded_alternates;
	}
	public void setLoaded_alternates(int newLoaded_alternates) {
		loaded_alternates = newLoaded_alternates;
	}
	public Byte getAlternate_db() {
		return alternate_db;
	}
	public void setAlternate_db(Byte newAlternate_db) {
		alternate_db = newAlternate_db;
	}
	public oidmap getReplace_map() {
		return replace_map;
	}
	public void setReplace_map(oidmap newReplace_map) {
		replace_map = newReplace_map;
	}
	public commit_graph getCommit_graph() {
		return commit_graph;
	}
	public void setCommit_graph(commit_graph newCommit_graph) {
		commit_graph = newCommit_graph;
	}
	public int getCommit_graph_attempted() {
		return commit_graph_attempted;
	}
	public void setCommit_graph_attempted(int newCommit_graph_attempted) {
		commit_graph_attempted = newCommit_graph_attempted;
	}
	public multi_pack_index getMulti_pack_index() {
		return multi_pack_index;
	}
	public void setMulti_pack_index(multi_pack_index newMulti_pack_index) {
		multi_pack_index = newMulti_pack_index;
	}
	public packed_git getPacked_git() {
		return packed_git;
	}
	public void setPacked_git(packed_git newPacked_git) {
		packed_git = newPacked_git;
	}
	public list_head getPacked_git_mru() {
		return packed_git_mru;
	}
	public void setPacked_git_mru(list_head newPacked_git_mru) {
		packed_git_mru = newPacked_git_mru;
	}
	public long getApproximate_object_count() {
		return approximate_object_count;
	}
	public void setApproximate_object_count(long newApproximate_object_count) {
		approximate_object_count = newApproximate_object_count;
	}
	public int getApproximate_object_count_valid() {
		return approximate_object_count_valid;
	}
	public void setApproximate_object_count_valid(int newApproximate_object_count_valid) {
		approximate_object_count_valid = newApproximate_object_count_valid;
	}
	public int getPacked_git_initialized() {
		return packed_git_initialized;
	}
	public void setPacked_git_initialized(int newPacked_git_initialized) {
		packed_git_initialized = newPacked_git_initialized;
	}
}
/*
	 * Set of all object directories; the main directory is first (and
	 * cannot be NULL after initialization). Subsequent directories are
	 * alternates.
	 */
