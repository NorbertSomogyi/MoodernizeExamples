package application;

public class submodule_update_clone {
	private int current;
	private module_list list;
	private int warn_if_uninitialized;
	private submodule_update_strategy update;
	private int progress;
	private int quiet;
	private int recommend_shallow;
	private string_list references;
	private int dissociate;
	private Object depth;
	private Object recursive_prefix;
	private Object prefix;
	private update_clone_data update_clone;
	private int update_clone_nr;
	private int update_clone_alloc;
	private int quickstop;
	private Object failed_clones;
	private int failed_clones_nr;
	private int failed_clones_alloc;
	private int max_jobs;
	
	public submodule_update_clone(int current, module_list list, int warn_if_uninitialized, submodule_update_strategy update, int progress, int quiet, int recommend_shallow, string_list references, int dissociate, Object depth, Object recursive_prefix, Object prefix, update_clone_data update_clone, int update_clone_nr, int update_clone_alloc, int quickstop, Object failed_clones, int failed_clones_nr, int failed_clones_alloc, int max_jobs) {
		setCurrent(current);
		setList(list);
		setWarn_if_uninitialized(warn_if_uninitialized);
		setUpdate(update);
		setProgress(progress);
		setQuiet(quiet);
		setRecommend_shallow(recommend_shallow);
		setReferences(references);
		setDissociate(dissociate);
		setDepth(depth);
		setRecursive_prefix(recursive_prefix);
		setPrefix(prefix);
		setUpdate_clone(update_clone);
		setUpdate_clone_nr(update_clone_nr);
		setUpdate_clone_alloc(update_clone_alloc);
		setQuickstop(quickstop);
		setFailed_clones(failed_clones);
		setFailed_clones_nr(failed_clones_nr);
		setFailed_clones_alloc(failed_clones_alloc);
		setMax_jobs(max_jobs);
	}
	public submodule_update_clone() {
	}
	
	public int update_submodules() {
		int i;
		int generatedMax_jobs = this.getMax_jobs();
		ModernizedCProgram.run_processes_parallel_tr2(generatedMax_jobs, update_clone_get_next_task, update_clone_start_failure, update_clone_task_finished, suc, "submodule", "parallel/update"/*
			 * We saved the output and put it out all at once now.
			 * That means:
			 * - the listener does not have to interleave their (checkout)
			 *   work with our fetching.  The writes involved in a
			 *   checkout involve more straightforward sequential I/O.
			 * - the listener can avoid doing any work if fetching failed.
			 */);
		int generatedQuickstop = this.getQuickstop();
		if (generatedQuickstop) {
			return 1;
		} 
		int generatedUpdate_clone_nr = this.getUpdate_clone_nr();
		update_clone_data generatedUpdate_clone = this.getUpdate_clone();
		for (i = 0; i < generatedUpdate_clone_nr; i++) {
			generatedUpdate_clone[i].update_submodule();
		}
		return 0;
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		cp.setGit_cmd(1);
		cp.setNo_stdin(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_pushl("submodule", "update", "--recursive", "--checkout", ((Object)0));
		generatedArgs.argv_push_verbosity();
		return cp/**
		 * Runs git-merge, returning its exit status.
		 */.run_command();
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int newCurrent) {
		current = newCurrent;
	}
	public module_list getList() {
		return list;
	}
	public void setList(module_list newList) {
		list = newList;
	}
	public int getWarn_if_uninitialized() {
		return warn_if_uninitialized;
	}
	public void setWarn_if_uninitialized(int newWarn_if_uninitialized) {
		warn_if_uninitialized = newWarn_if_uninitialized;
	}
	public submodule_update_strategy getUpdate() {
		return update;
	}
	public void setUpdate(submodule_update_strategy newUpdate) {
		update = newUpdate;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getRecommend_shallow() {
		return recommend_shallow;
	}
	public void setRecommend_shallow(int newRecommend_shallow) {
		recommend_shallow = newRecommend_shallow;
	}
	public string_list getReferences() {
		return references;
	}
	public void setReferences(string_list newReferences) {
		references = newReferences;
	}
	public int getDissociate() {
		return dissociate;
	}
	public void setDissociate(int newDissociate) {
		dissociate = newDissociate;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
	public Object getRecursive_prefix() {
		return recursive_prefix;
	}
	public void setRecursive_prefix(Object newRecursive_prefix) {
		recursive_prefix = newRecursive_prefix;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public update_clone_data getUpdate_clone() {
		return update_clone;
	}
	public void setUpdate_clone(update_clone_data newUpdate_clone) {
		update_clone = newUpdate_clone;
	}
	public int getUpdate_clone_nr() {
		return update_clone_nr;
	}
	public void setUpdate_clone_nr(int newUpdate_clone_nr) {
		update_clone_nr = newUpdate_clone_nr;
	}
	public int getUpdate_clone_alloc() {
		return update_clone_alloc;
	}
	public void setUpdate_clone_alloc(int newUpdate_clone_alloc) {
		update_clone_alloc = newUpdate_clone_alloc;
	}
	public int getQuickstop() {
		return quickstop;
	}
	public void setQuickstop(int newQuickstop) {
		quickstop = newQuickstop;
	}
	public Object getFailed_clones() {
		return failed_clones;
	}
	public void setFailed_clones(Object newFailed_clones) {
		failed_clones = newFailed_clones;
	}
	public int getFailed_clones_nr() {
		return failed_clones_nr;
	}
	public void setFailed_clones_nr(int newFailed_clones_nr) {
		failed_clones_nr = newFailed_clones_nr;
	}
	public int getFailed_clones_alloc() {
		return failed_clones_alloc;
	}
	public void setFailed_clones_alloc(int newFailed_clones_alloc) {
		failed_clones_alloc = newFailed_clones_alloc;
	}
	public int getMax_jobs() {
		return max_jobs;
	}
	public void setMax_jobs(int newMax_jobs) {
		max_jobs = newMax_jobs;
	}
}
/* index into 'list', the list of submodules to look into for cloning */
