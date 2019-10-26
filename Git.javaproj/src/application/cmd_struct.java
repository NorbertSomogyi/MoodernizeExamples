package application;

/*
 * require working tree to be present -- anything uses this needs
 * RUN_SETUP for reading from the configuration file.
 */
/* parse-options is not used */
public class cmd_struct {
	private Object cmd;
	private Object fn;
	private int option;
	
	public cmd_struct(Object cmd, Object fn, int option) {
		setCmd(cmd);
		setFn(fn);
		setOption(option);
	}
	public cmd_struct() {
	}
	
	public int run_builtin(int argc, Object argv) {
		int status;
		int help;
		stat st = new stat();
		byte prefix;
		prefix = ((Object)0);
		help = argc == 2 && !.strcmp(argv[1], "-h");
		int generatedOption = this.getOption();
		Object generatedCmd = this.getCmd();
		if (!help) {
			if (generatedOption & (1 << 0)) {
				prefix = ModernizedCProgram.setup_git_directory();
			}  else if (generatedOption & (1 << 1)) {
				int nongit_ok;
				prefix = ModernizedCProgram.setup_git_directory_gently(nongit_ok);
			} 
			if (ModernizedCProgram.use_pager == -1 && generatedOption & ((1 << 0) | (1 << 1)) && !(generatedOption & (1 << 5))) {
				ModernizedCProgram.use_pager = ModernizedCProgram.check_pager_config(generatedCmd);
			} 
			if (ModernizedCProgram.use_pager == -1 && generatedOption & (1 << 2)) {
				ModernizedCProgram.use_pager = 1;
			} 
			if ((generatedOption & ((1 << 0) | (1 << 1))) && ModernizedCProgram.startup_info.getHave_repository()) {
				ModernizedCProgram.trace_repo_setup(prefix);
			} 
		} 
		ModernizedCProgram.commit_pager_choice();
		if (!help && ModernizedCProgram.get_super_prefix()) {
			if (!(generatedOption & (1 << 4))) {
				ModernizedCProgram.die(ModernizedCProgram._("%s doesn't support --super-prefix"), generatedCmd);
			} 
		} 
		if (!help && generatedOption & (1 << 3)) {
			ModernizedCProgram.setup_work_tree();
		} 
		do {
			if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
				ModernizedCProgram.trace_argv_printf_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\git.c", 439, argv, "trace: built-in: git");
			} 
		} while (0);
		ModernizedCProgram.trace2_cmd_name_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\git.c", 440, (generatedCmd));
		ModernizedCProgram.trace2_cmd_list_config_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\git.c", 441);
		ModernizedCProgram.validate_cache_entries(ModernizedCProgram.the_repository.getIndex());
		status = .UNRECOGNIZEDFUNCTIONNAME(argc, argv, prefix);
		ModernizedCProgram.validate_cache_entries(ModernizedCProgram.the_repository.getIndex());
		if (status) {
			return status;
		} 
		if (.fstat((((_iob[1])).get_file()), /* Somebody closed stdout? */st)) {
			return 0;
		} 
		Object generatedSt_mode = st.getSt_mode();
		if ((((generatedSt_mode) & -1024) == -1024) || .S_ISSOCK(generatedSt_mode)) {
			return 0;
		} 
		if (.fflush((_iob[/* Check for ENOSPC and EIO errors.. */1]))) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("write failure on standard output"));
		} 
		if ((((_iob[1])).get_flag() & -1024)) {
			ModernizedCProgram.die(ModernizedCProgram._("unknown write failure on standard output"));
		} 
		if (.fclose((_iob[1]))) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("close failed on standard output"));
		} 
		return 0;
	}
	public cmd_struct get_builtin(Object s) {
		int i;
		Object generatedCmd = p.getCmd();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			cmd_struct p = ModernizedCProgram.commands + i;
			if (!.strcmp(s, generatedCmd)) {
				return p;
			} 
		}
		return ((Object)0);
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int newOption) {
		option = newOption;
	}
}
