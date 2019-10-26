package application;

/* Pending fetches by OIDs */
public class fetch_task {
	private repository repo;
	private Object sub;
	private int free_sub;
	private oid_array commits;
	
	public fetch_task(repository repo, Object sub, int free_sub, oid_array commits) {
		setRepo(repo);
		setSub(sub);
		setFree_sub(free_sub);
		setCommits(commits);
	}
	public fetch_task() {
	}
	
	public fetch_task fetch_task_create(repository r, Object path) {
		fetch_task task = ModernizedCProgram.xmalloc();
		.memset(task, 0, );
		task.setSub(r.submodule_from_path(ModernizedCProgram.null_oid, path));
		Object generatedSub = task.getSub();
		if (!generatedSub) {
			task.setSub(ModernizedCProgram.get_non_gitmodules_submodule(path));
			if (!generatedSub) {
				ModernizedCProgram.free(task);
				return ((Object)0);
			} 
			task.setFree_sub(1);
		} 
		return task;
	}
	public void fetch_task_release() {
		int generatedFree_sub = this.getFree_sub();
		Object generatedSub = this.getSub();
		if (generatedFree_sub) {
			ModernizedCProgram.free((Object)generatedSub);
		} 
		this.setFree_sub(0);
		this.setSub(((Object)0));
		repository generatedRepo = this.getRepo();
		if (generatedRepo) {
			generatedRepo.repo_clear();
		} 
		do {
			ModernizedCProgram.free(generatedRepo);
			(generatedRepo) = ((Object)0);
		} while (0);
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getSub() {
		return sub;
	}
	public void setSub(Object newSub) {
		sub = newSub;
	}
	public int getFree_sub() {
		return free_sub;
	}
	public void setFree_sub(int newFree_sub) {
		free_sub = newFree_sub;
	}
	public oid_array getCommits() {
		return commits;
	}
	public void setCommits(oid_array newCommits) {
		commits = newCommits;
	}
}
