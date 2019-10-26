package application;

/* Remember to update object flag allocation in object.h */
public class handle_one_ref_cb {
	private repository repo;
	private commit_list list;
	
	public handle_one_ref_cb(repository repo, commit_list list) {
		setRepo(repo);
		setList(list);
	}
	public handle_one_ref_cb() {
	}
	
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public commit_list getList() {
		return list;
	}
	public void setList(commit_list newList) {
		list = newList;
	}
}
