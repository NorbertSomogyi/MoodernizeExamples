package application;

public class commit_graph {
	private int graph_fd;
	private Object data;
	private Object data_len;
	private byte hash_len;
	private byte num_chunks;
	private Object num_commits;
	private object_id oid;
	private Byte filename;
	private Object obj_dir;
	private Object num_commits_in_base;
	private commit_graph base_graph;
	private Object chunk_oid_fanout;
	private Object chunk_oid_lookup;
	private Object chunk_commit_data;
	private Object chunk_extra_edges;
	private Object chunk_base_graphs;
	
	public commit_graph(int graph_fd, Object data, Object data_len, byte hash_len, byte num_chunks, Object num_commits, object_id oid, Byte filename, Object obj_dir, Object num_commits_in_base, commit_graph base_graph, Object chunk_oid_fanout, Object chunk_oid_lookup, Object chunk_commit_data, Object chunk_extra_edges, Object chunk_base_graphs) {
		setGraph_fd(graph_fd);
		setData(data);
		setData_len(data_len);
		setHash_len(hash_len);
		setNum_chunks(num_chunks);
		setNum_commits(num_commits);
		setOid(oid);
		setFilename(filename);
		setObj_dir(obj_dir);
		setNum_commits_in_base(num_commits_in_base);
		setBase_graph(base_graph);
		setChunk_oid_fanout(chunk_oid_fanout);
		setChunk_oid_lookup(chunk_oid_lookup);
		setChunk_commit_data(chunk_commit_data);
		setChunk_extra_edges(chunk_extra_edges);
		setChunk_base_graphs(chunk_base_graphs);
	}
	public commit_graph() {
	}
	
	public int getGraph_fd() {
		return graph_fd;
	}
	public void setGraph_fd(int newGraph_fd) {
		graph_fd = newGraph_fd;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getData_len() {
		return data_len;
	}
	public void setData_len(Object newData_len) {
		data_len = newData_len;
	}
	public byte getHash_len() {
		return hash_len;
	}
	public void setHash_len(byte newHash_len) {
		hash_len = newHash_len;
	}
	public byte getNum_chunks() {
		return num_chunks;
	}
	public void setNum_chunks(byte newNum_chunks) {
		num_chunks = newNum_chunks;
	}
	public Object getNum_commits() {
		return num_commits;
	}
	public void setNum_commits(Object newNum_commits) {
		num_commits = newNum_commits;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public Object getObj_dir() {
		return obj_dir;
	}
	public void setObj_dir(Object newObj_dir) {
		obj_dir = newObj_dir;
	}
	public Object getNum_commits_in_base() {
		return num_commits_in_base;
	}
	public void setNum_commits_in_base(Object newNum_commits_in_base) {
		num_commits_in_base = newNum_commits_in_base;
	}
	public commit_graph getBase_graph() {
		return base_graph;
	}
	public void setBase_graph(commit_graph newBase_graph) {
		base_graph = newBase_graph;
	}
	public Object getChunk_oid_fanout() {
		return chunk_oid_fanout;
	}
	public void setChunk_oid_fanout(Object newChunk_oid_fanout) {
		chunk_oid_fanout = newChunk_oid_fanout;
	}
	public Object getChunk_oid_lookup() {
		return chunk_oid_lookup;
	}
	public void setChunk_oid_lookup(Object newChunk_oid_lookup) {
		chunk_oid_lookup = newChunk_oid_lookup;
	}
	public Object getChunk_commit_data() {
		return chunk_commit_data;
	}
	public void setChunk_commit_data(Object newChunk_commit_data) {
		chunk_commit_data = newChunk_commit_data;
	}
	public Object getChunk_extra_edges() {
		return chunk_extra_edges;
	}
	public void setChunk_extra_edges(Object newChunk_extra_edges) {
		chunk_extra_edges = newChunk_extra_edges;
	}
	public Object getChunk_base_graphs() {
		return chunk_base_graphs;
	}
	public void setChunk_base_graphs(Object newChunk_base_graphs) {
		chunk_base_graphs = newChunk_base_graphs;
	}
}
/*
 * Return 1 if and only if the repository has a commit-graph
 * file and generation numbers are computed in that file.
 */
