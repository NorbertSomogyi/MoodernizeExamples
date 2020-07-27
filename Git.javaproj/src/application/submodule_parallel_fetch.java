package application;

public class submodule_parallel_fetch {
	private int count;
	private argv_array args;
	private repository r;
	private Object prefix;
	private int command_line_option;
	private int default_option;
	private int quiet;
	private int result;
	private string_list changed_submodule_names;
	private fetch_task[][] oid_fetch_tasks;
	private int oid_fetch_tasks_nr;
	private int oid_fetch_tasks_alloc;
	
	public submodule_parallel_fetch(int count, argv_array args, repository r, Object prefix, int command_line_option, int default_option, int quiet, int result, string_list changed_submodule_names, fetch_task[][] oid_fetch_tasks, int oid_fetch_tasks_nr, int oid_fetch_tasks_alloc) {
		setCount(count);
		setArgs(args);
		setR(r);
		setPrefix(prefix);
		setCommand_line_option(command_line_option);
		setDefault_option(default_option);
		setQuiet(quiet);
		setResult(result);
		setChanged_submodule_names(changed_submodule_names);
		setOid_fetch_tasks(oid_fetch_tasks);
		setOid_fetch_tasks_nr(oid_fetch_tasks_nr);
		setOid_fetch_tasks_alloc(oid_fetch_tasks_alloc);
	}
	public submodule_parallel_fetch() {
	}
	
	public int get_fetch_recurse_config(Object submodule) {
		int generatedCommand_line_option = this.getCommand_line_option();
		if (generatedCommand_line_option != .RECURSE_SUBMODULES_DEFAULT) {
			return generatedCommand_line_option;
		} 
		repository generatedR = this.getR();
		if (submodule) {
			byte key;
			byte value;
			int fetch_recurse = submodule.getFetch_recurse();
			ModernizedCProgram.key = ModernizedCProgram.xstrfmt("submodule.%s.fetchRecurseSubmodules", submodule.getName());
			if (!/*Error: Function owner not recognized*/repo_config_get_string_const(generatedR, ModernizedCProgram.key, value)) {
				fetch_recurse = ModernizedCProgram.parse_fetch_recurse_submodules_arg(ModernizedCProgram.key, value);
			} 
			ModernizedCProgram.free(ModernizedCProgram.key);
			if (fetch_recurse != .RECURSE_SUBMODULES_NONE) {
				return /* local config overrules everything except commandline */fetch_recurse;
			} 
		} 
		int generatedDefault_option = this.getDefault_option();
		return generatedDefault_option;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public argv_array getArgs() {
		return args;
	}
	public void setArgs(argv_array newArgs) {
		args = newArgs;
	}
	public repository getR() {
		return r;
	}
	public void setR(repository newR) {
		r = newR;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getCommand_line_option() {
		return command_line_option;
	}
	public void setCommand_line_option(int newCommand_line_option) {
		command_line_option = newCommand_line_option;
	}
	public int getDefault_option() {
		return default_option;
	}
	public void setDefault_option(int newDefault_option) {
		default_option = newDefault_option;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int newResult) {
		result = newResult;
	}
	public string_list getChanged_submodule_names() {
		return changed_submodule_names;
	}
	public void setChanged_submodule_names(string_list newChanged_submodule_names) {
		changed_submodule_names = newChanged_submodule_names;
	}
	public fetch_task[][] getOid_fetch_tasks() {
		return oid_fetch_tasks;
	}
	public void setOid_fetch_tasks(fetch_task[][] newOid_fetch_tasks) {
		oid_fetch_tasks = newOid_fetch_tasks;
	}
	public int getOid_fetch_tasks_nr() {
		return oid_fetch_tasks_nr;
	}
	public void setOid_fetch_tasks_nr(int newOid_fetch_tasks_nr) {
		oid_fetch_tasks_nr = newOid_fetch_tasks_nr;
	}
	public int getOid_fetch_tasks_alloc() {
		return oid_fetch_tasks_alloc;
	}
	public void setOid_fetch_tasks_alloc(int newOid_fetch_tasks_alloc) {
		oid_fetch_tasks_alloc = newOid_fetch_tasks_alloc;
	}
}
