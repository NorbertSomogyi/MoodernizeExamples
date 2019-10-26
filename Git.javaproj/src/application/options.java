package application;

public class options {
	private int verbosity;
	private long depth;
	private Byte deepen_since;
	private string_list deepen_not;
	private string_list push_options;
	private Byte filter;
	private int progress;
	private int check_self_contained_and_connected;
	private int cloning;
	private int update_shallow;
	private int followtags;
	private int dry_run;
	private int thin;
	private int push_cert;
	private int deepen_relative;
	private int from_promisor;
	private int no_dependents;
	private int atomic;
	
	public options(int verbosity, long depth, Byte deepen_since, string_list deepen_not, string_list push_options, Byte filter, int progress, int check_self_contained_and_connected, int cloning, int update_shallow, int followtags, int dry_run, int thin, int push_cert, int deepen_relative, int from_promisor, int no_dependents, int atomic) {
		setVerbosity(verbosity);
		setDepth(depth);
		setDeepen_since(deepen_since);
		setDeepen_not(deepen_not);
		setPush_options(push_options);
		setFilter(filter);
		setProgress(progress);
		setCheck_self_contained_and_connected(check_self_contained_and_connected);
		setCloning(cloning);
		setUpdate_shallow(update_shallow);
		setFollowtags(followtags);
		setDry_run(dry_run);
		setThin(thin);
		setPush_cert(push_cert);
		setDeepen_relative(deepen_relative);
		setFrom_promisor(from_promisor);
		setNo_dependents(no_dependents);
		setAtomic(atomic);
	}
	public options() {
	}
	
	public int getVerbosity() {
		return verbosity;
	}
	public void setVerbosity(int newVerbosity) {
		verbosity = newVerbosity;
	}
	public long getDepth() {
		return depth;
	}
	public void setDepth(long newDepth) {
		depth = newDepth;
	}
	public Byte getDeepen_since() {
		return deepen_since;
	}
	public void setDeepen_since(Byte newDeepen_since) {
		deepen_since = newDeepen_since;
	}
	public string_list getDeepen_not() {
		return deepen_not;
	}
	public void setDeepen_not(string_list newDeepen_not) {
		deepen_not = newDeepen_not;
	}
	public string_list getPush_options() {
		return push_options;
	}
	public void setPush_options(string_list newPush_options) {
		push_options = newPush_options;
	}
	public Byte getFilter() {
		return filter;
	}
	public void setFilter(Byte newFilter) {
		filter = newFilter;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
	public int getCheck_self_contained_and_connected() {
		return check_self_contained_and_connected;
	}
	public void setCheck_self_contained_and_connected(int newCheck_self_contained_and_connected) {
		check_self_contained_and_connected = newCheck_self_contained_and_connected;
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
	public int getFollowtags() {
		return followtags;
	}
	public void setFollowtags(int newFollowtags) {
		followtags = newFollowtags;
	}
	public int getDry_run() {
		return dry_run;
	}
	public void setDry_run(int newDry_run) {
		dry_run = newDry_run;
	}
	public int getThin() {
		return thin;
	}
	public void setThin(int newThin) {
		thin = newThin;
	}
	public int getPush_cert() {
		return push_cert;
	}
	public void setPush_cert(int newPush_cert) {
		push_cert = newPush_cert;
	}
	public int getDeepen_relative() {
		return deepen_relative;
	}
	public void setDeepen_relative(int newDeepen_relative) {
		deepen_relative = newDeepen_relative;
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
	public int getAtomic() {
		return atomic;
	}
	public void setAtomic(int newAtomic) {
		atomic = newAtomic;
	}
}
