package application;

public class refresh_params {
	private int flags;
	private Integer has_errors;
	
	public refresh_params(int flags, Integer has_errors) {
		setFlags(flags);
		setHas_errors(has_errors);
	}
	public refresh_params() {
	}
	
	public int refresh(int flag) {
		ModernizedCProgram.setup_work_tree();
		ModernizedCProgram.the_repository.repo_read_index();
		Integer generatedHas_errors = this.getHas_errors();
		int generatedFlags = this.getFlags();
		generatedHas_errors |=  ModernizedCProgram.the_index.refresh_index((generatedFlags | flag), ((Object)0), ((Object)0), ((Object)0));
		return 0;
		byte seen;
		int i;
		seen = ModernizedCProgram.xcalloc(ModernizedCProgram.pathspec.getNr(), 1);
		ModernizedCProgram.the_index.refresh_index(ModernizedCProgram.verbose ? -1024 : -1024, ModernizedCProgram.pathspec, seen, ModernizedCProgram._("Unstaged changes after refreshing the index:"));
		for (i = 0; i < ModernizedCProgram.pathspec.getNr(); i++) {
			if (!seen[i]) {
				ModernizedCProgram.die(ModernizedCProgram._("pathspec '%s' did not match any files"), ModernizedCProgram.pathspec.getItems()[i].getMatch());
			} 
		}
		ModernizedCProgram.free(seen);
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Integer getHas_errors() {
		return has_errors;
	}
	public void setHas_errors(Integer newHas_errors) {
		has_errors = newHas_errors;
	}
}
