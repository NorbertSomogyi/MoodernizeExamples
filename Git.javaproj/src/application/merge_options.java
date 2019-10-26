package application;

public class merge_options {
	private repository repo;
	private Object ancestor;
	private Object branch1;
	private Object branch2;
	private int detect_renames;
	private  detect_directory_renames;
	private int rename_limit;
	private int rename_score;
	private int show_rename_progress;
	private long xdl_opts;
	private  recursive_variant;
	private int verbosity;
	private int buffer_output;
	private strbuf obuf;
	private Object subtree_shift;
	private int renormalize;
	private merge_options_internal priv;
	
	public merge_options(repository repo, Object ancestor, Object branch1, Object branch2, int detect_renames,  detect_directory_renames, int rename_limit, int rename_score, int show_rename_progress, long xdl_opts,  recursive_variant, int verbosity, int buffer_output, strbuf obuf, Object subtree_shift, int renormalize, merge_options_internal priv) {
		setRepo(repo);
		setAncestor(ancestor);
		setBranch1(branch1);
		setBranch2(branch2);
		setDetect_renames(detect_renames);
		setDetect_directory_renames(detect_directory_renames);
		setRename_limit(rename_limit);
		setRename_score(rename_score);
		setShow_rename_progress(show_rename_progress);
		setXdl_opts(xdl_opts);
		setRecursive_variant(recursive_variant);
		setVerbosity(verbosity);
		setBuffer_output(buffer_output);
		setObuf(obuf);
		setSubtree_shift(subtree_shift);
		setRenormalize(renormalize);
		setPriv(priv);
	}
	public merge_options() {
	}
	
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getAncestor() {
		return ancestor;
	}
	public void setAncestor(Object newAncestor) {
		ancestor = newAncestor;
	}
	public Object getBranch1() {
		return branch1;
	}
	public void setBranch1(Object newBranch1) {
		branch1 = newBranch1;
	}
	public Object getBranch2() {
		return branch2;
	}
	public void setBranch2(Object newBranch2) {
		branch2 = newBranch2;
	}
	public int getDetect_renames() {
		return detect_renames;
	}
	public void setDetect_renames(int newDetect_renames) {
		detect_renames = newDetect_renames;
	}
	public  getDetect_directory_renames() {
		return detect_directory_renames;
	}
	public void setDetect_directory_renames( newDetect_directory_renames) {
		detect_directory_renames = newDetect_directory_renames;
	}
	public int getRename_limit() {
		return rename_limit;
	}
	public void setRename_limit(int newRename_limit) {
		rename_limit = newRename_limit;
	}
	public int getRename_score() {
		return rename_score;
	}
	public void setRename_score(int newRename_score) {
		rename_score = newRename_score;
	}
	public int getShow_rename_progress() {
		return show_rename_progress;
	}
	public void setShow_rename_progress(int newShow_rename_progress) {
		show_rename_progress = newShow_rename_progress;
	}
	public long getXdl_opts() {
		return xdl_opts;
	}
	public void setXdl_opts(long newXdl_opts) {
		xdl_opts = newXdl_opts;
	}
	public  getRecursive_variant() {
		return recursive_variant;
	}
	public void setRecursive_variant( newRecursive_variant) {
		recursive_variant = newRecursive_variant;
	}
	public int getVerbosity() {
		return verbosity;
	}
	public void setVerbosity(int newVerbosity) {
		verbosity = newVerbosity;
	}
	public int getBuffer_output() {
		return buffer_output;
	}
	public void setBuffer_output(int newBuffer_output) {
		buffer_output = newBuffer_output;
	}
	public strbuf getObuf() {
		return obuf;
	}
	public void setObuf(strbuf newObuf) {
		obuf = newObuf;
	}
	public Object getSubtree_shift() {
		return subtree_shift;
	}
	public void setSubtree_shift(Object newSubtree_shift) {
		subtree_shift = newSubtree_shift;
	}
	public int getRenormalize() {
		return renormalize;
	}
	public void setRenormalize(int newRenormalize) {
		renormalize = newRenormalize;
	}
	public merge_options_internal getPriv() {
		return priv;
	}
	public void setPriv(merge_options_internal newPriv) {
		priv = newPriv;
	}
}
