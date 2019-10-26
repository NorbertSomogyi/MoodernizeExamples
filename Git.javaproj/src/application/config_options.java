package application;

public class config_options {
	private int respect_includes;
	private int ignore_repo;
	private int ignore_worktree;
	private int ignore_cmdline;
	private int system_gently;
	private Object commondir;
	private Object git_dir;
	private Object event_fn;
	private Object event_fn_data;
	private config_error_action error_action;
	
	public config_options(int respect_includes, int ignore_repo, int ignore_worktree, int ignore_cmdline, int system_gently, Object commondir, Object git_dir, Object event_fn, Object event_fn_data, config_error_action error_action) {
		setRespect_includes(respect_includes);
		setIgnore_repo(ignore_repo);
		setIgnore_worktree(ignore_worktree);
		setIgnore_cmdline(ignore_cmdline);
		setSystem_gently(system_gently);
		setCommondir(commondir);
		setGit_dir(git_dir);
		setEvent_fn(event_fn);
		setEvent_fn_data(event_fn_data);
		setError_action(error_action);
	}
	public config_options() {
	}
	
	public int getRespect_includes() {
		return respect_includes;
	}
	public void setRespect_includes(int newRespect_includes) {
		respect_includes = newRespect_includes;
	}
	public int getIgnore_repo() {
		return ignore_repo;
	}
	public void setIgnore_repo(int newIgnore_repo) {
		ignore_repo = newIgnore_repo;
	}
	public int getIgnore_worktree() {
		return ignore_worktree;
	}
	public void setIgnore_worktree(int newIgnore_worktree) {
		ignore_worktree = newIgnore_worktree;
	}
	public int getIgnore_cmdline() {
		return ignore_cmdline;
	}
	public void setIgnore_cmdline(int newIgnore_cmdline) {
		ignore_cmdline = newIgnore_cmdline;
	}
	public int getSystem_gently() {
		return system_gently;
	}
	public void setSystem_gently(int newSystem_gently) {
		system_gently = newSystem_gently;
	}
	public Object getCommondir() {
		return commondir;
	}
	public void setCommondir(Object newCommondir) {
		commondir = newCommondir;
	}
	public Object getGit_dir() {
		return git_dir;
	}
	public void setGit_dir(Object newGit_dir) {
		git_dir = newGit_dir;
	}
	public Object getEvent_fn() {
		return event_fn;
	}
	public void setEvent_fn(Object newEvent_fn) {
		event_fn = newEvent_fn;
	}
	public Object getEvent_fn_data() {
		return event_fn_data;
	}
	public void setEvent_fn_data(Object newEvent_fn_data) {
		event_fn_data = newEvent_fn_data;
	}
	public config_error_action getError_action() {
		return error_action;
	}
	public void setError_action(config_error_action newError_action) {
		error_action = newError_action;
	}
}
