package application;

/*
 * The sub-process API makes it possible to run background sub-processes
 * for the entire lifetime of a Git invocation. If Git needs to communicate
 * with an external process multiple times, then this can reduces the process
 * invocation overhead. Git and the sub-process communicate through stdin and
 * stdout.
 *
 * The sub-processes are kept in a hashmap by command name and looked up
 * via the subprocess_find_entry function.  If an existing instance can not
 * be found then a new process should be created and started.  When the
 * parent git command terminates, all sub-processes are also terminated.
 *
 * This API is based on the run-command API.
 */
/* data structures */
/* Members should not be accessed directly. */
/* Find a subprocess in the subprocess hashmap. */
public class subprocess_entry {
	private hashmap_entry ent;
	private Object cmd;
	private child_process process;
	
	public subprocess_entry(hashmap_entry ent, Object cmd, child_process process) {
		setEnt(ent);
		setCmd(cmd);
		setProcess(process);
	}
	public subprocess_entry() {
	}
	
	public int start_multi_file_filter_fn() {
		int[] versions = new int[]{2, 0};
		subprocess_capability[] capabilities = new subprocess_capability[]{new subprocess_capability("clean", (-1024 << 0)), new subprocess_capability("smudge", (-1024 << 1)), new subprocess_capability("delay", (-1024 << 2)), new subprocess_capability(((Object)0), 0)};
		cmd2process entry = (cmd2process)subprocess;
		int generatedSupported_capabilities = entry.getSupported_capabilities();
		return ModernizedCProgram.subprocess_handshake(subprocess, "git-filter", versions, ((Object)0), capabilities, generatedSupported_capabilities);
	}
	public subprocess_entry subprocess_find_entry(hashmap hashmap, Object cmd) {
		subprocess_entry key = new subprocess_entry();
		hashmap_entry generatedEnt = key.getEnt();
		generatedEnt.hashmap_entry_init(ModernizedCProgram.strhash(cmd));
		key.setCmd(cmd);
		hashmap_entry hashmap_entry = new hashmap_entry();
		return ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(hashmap, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public child_process getProcess() {
		return process;
	}
	public void setProcess(child_process newProcess) {
		process = newProcess;
	}
}
/* subprocess helper functions */
