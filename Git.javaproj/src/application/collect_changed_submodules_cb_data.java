package application;

public class collect_changed_submodules_cb_data {
	private repository repo;
	private string_list changed;
	private Object commit_oid;
	
	public collect_changed_submodules_cb_data(repository repo, string_list changed, Object commit_oid) {
		setRepo(repo);
		setChanged(changed);
		setCommit_oid(commit_oid);
	}
	public collect_changed_submodules_cb_data() {
	}
	
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public string_list getChanged() {
		return changed;
	}
	public void setChanged(string_list newChanged) {
		changed = newChanged;
	}
	public Object getCommit_oid() {
		return commit_oid;
	}
	public void setCommit_oid(Object newCommit_oid) {
		commit_oid = newCommit_oid;
	}
}
