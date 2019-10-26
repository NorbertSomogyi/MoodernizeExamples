package application;

public class fetch_pack_args {
	private Object uploadpack;
	private int unpacklimit;
	private int depth;
	private Object deepen_since;
	private Object deepen_not;
	private list_objects_filter_options filter_options;
	private Object server_options;
	private Object negotiation_tips;
	private int deepen_relative;
	private int quiet;
	private int keep_pack;
	private int lock_pack;
	private int use_thin_pack;
	private int fetch_all;
	private int stdin_refs;
	private int diag_url;
	private int verbose;
	private int no_progress;
	private int include_tag;
	private int stateless_rpc;
	private int check_self_contained_and_connected;
	private int self_contained_and_connected;
	private int cloning;
	private int update_shallow;
	private int deepen;
	private int from_promisor;
	private int no_dependents;
	private int connectivity_checked;
	
	public fetch_pack_args(Object uploadpack, int unpacklimit, int depth, Object deepen_since, Object deepen_not, list_objects_filter_options filter_options, Object server_options, Object negotiation_tips, int deepen_relative, int quiet, int keep_pack, int lock_pack, int use_thin_pack, int fetch_all, int stdin_refs, int diag_url, int verbose, int no_progress, int include_tag, int stateless_rpc, int check_self_contained_and_connected, int self_contained_and_connected, int cloning, int update_shallow, int deepen, int from_promisor, int no_dependents, int connectivity_checked) {
		setUploadpack(uploadpack);
		setUnpacklimit(unpacklimit);
		setDepth(depth);
		setDeepen_since(deepen_since);
		setDeepen_not(deepen_not);
		setFilter_options(filter_options);
		setServer_options(server_options);
		setNegotiation_tips(negotiation_tips);
		setDeepen_relative(deepen_relative);
		setQuiet(quiet);
		setKeep_pack(keep_pack);
		setLock_pack(lock_pack);
		setUse_thin_pack(use_thin_pack);
		setFetch_all(fetch_all);
		setStdin_refs(stdin_refs);
		setDiag_url(diag_url);
		setVerbose(verbose);
		setNo_progress(no_progress);
		setInclude_tag(include_tag);
		setStateless_rpc(stateless_rpc);
		setCheck_self_contained_and_connected(check_self_contained_and_connected);
		setSelf_contained_and_connected(self_contained_and_connected);
		setCloning(cloning);
		setUpdate_shallow(update_shallow);
		setDeepen(deepen);
		setFrom_promisor(from_promisor);
		setNo_dependents(no_dependents);
		setConnectivity_checked(connectivity_checked);
	}
	public fetch_pack_args() {
	}
	
	public Object getUploadpack() {
		return uploadpack;
	}
	public void setUploadpack(Object newUploadpack) {
		uploadpack = newUploadpack;
	}
	public int getUnpacklimit() {
		return unpacklimit;
	}
	public void setUnpacklimit(int newUnpacklimit) {
		unpacklimit = newUnpacklimit;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public Object getDeepen_since() {
		return deepen_since;
	}
	public void setDeepen_since(Object newDeepen_since) {
		deepen_since = newDeepen_since;
	}
	public Object getDeepen_not() {
		return deepen_not;
	}
	public void setDeepen_not(Object newDeepen_not) {
		deepen_not = newDeepen_not;
	}
	public list_objects_filter_options getFilter_options() {
		return filter_options;
	}
	public void setFilter_options(list_objects_filter_options newFilter_options) {
		filter_options = newFilter_options;
	}
	public Object getServer_options() {
		return server_options;
	}
	public void setServer_options(Object newServer_options) {
		server_options = newServer_options;
	}
	public Object getNegotiation_tips() {
		return negotiation_tips;
	}
	public void setNegotiation_tips(Object newNegotiation_tips) {
		negotiation_tips = newNegotiation_tips;
	}
	public int getDeepen_relative() {
		return deepen_relative;
	}
	public void setDeepen_relative(int newDeepen_relative) {
		deepen_relative = newDeepen_relative;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getKeep_pack() {
		return keep_pack;
	}
	public void setKeep_pack(int newKeep_pack) {
		keep_pack = newKeep_pack;
	}
	public int getLock_pack() {
		return lock_pack;
	}
	public void setLock_pack(int newLock_pack) {
		lock_pack = newLock_pack;
	}
	public int getUse_thin_pack() {
		return use_thin_pack;
	}
	public void setUse_thin_pack(int newUse_thin_pack) {
		use_thin_pack = newUse_thin_pack;
	}
	public int getFetch_all() {
		return fetch_all;
	}
	public void setFetch_all(int newFetch_all) {
		fetch_all = newFetch_all;
	}
	public int getStdin_refs() {
		return stdin_refs;
	}
	public void setStdin_refs(int newStdin_refs) {
		stdin_refs = newStdin_refs;
	}
	public int getDiag_url() {
		return diag_url;
	}
	public void setDiag_url(int newDiag_url) {
		diag_url = newDiag_url;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getNo_progress() {
		return no_progress;
	}
	public void setNo_progress(int newNo_progress) {
		no_progress = newNo_progress;
	}
	public int getInclude_tag() {
		return include_tag;
	}
	public void setInclude_tag(int newInclude_tag) {
		include_tag = newInclude_tag;
	}
	public int getStateless_rpc() {
		return stateless_rpc;
	}
	public void setStateless_rpc(int newStateless_rpc) {
		stateless_rpc = newStateless_rpc;
	}
	public int getCheck_self_contained_and_connected() {
		return check_self_contained_and_connected;
	}
	public void setCheck_self_contained_and_connected(int newCheck_self_contained_and_connected) {
		check_self_contained_and_connected = newCheck_self_contained_and_connected;
	}
	public int getSelf_contained_and_connected() {
		return self_contained_and_connected;
	}
	public void setSelf_contained_and_connected(int newSelf_contained_and_connected) {
		self_contained_and_connected = newSelf_contained_and_connected;
	}
	public int getCloning() {
		return cloning;
	}
	public void setCloning(int newCloning) {
		cloning = newCloning;
	}
	public int getUpdate_shallow() {
		return update_shallow;
	}
	public void setUpdate_shallow(int newUpdate_shallow) {
		update_shallow = newUpdate_shallow;
	}
	public int getDeepen() {
		return deepen;
	}
	public void setDeepen(int newDeepen) {
		deepen = newDeepen;
	}
	public int getFrom_promisor() {
		return from_promisor;
	}
	public void setFrom_promisor(int newFrom_promisor) {
		from_promisor = newFrom_promisor;
	}
	public int getNo_dependents() {
		return no_dependents;
	}
	public void setNo_dependents(int newNo_dependents) {
		no_dependents = newNo_dependents;
	}
	public int getConnectivity_checked() {
		return connectivity_checked;
	}
	public void setConnectivity_checked(int newConnectivity_checked) {
		connectivity_checked = newConnectivity_checked;
	}
}
