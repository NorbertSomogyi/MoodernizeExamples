package application;

public class notes_rewrite_cfg {
	private notes_tree[][] trees;
	private Object cmd;
	private int enabled;
	private Object combine;
	private string_list refs;
	private int refs_from_env;
	private int mode_from_env;
	
	public notes_rewrite_cfg(notes_tree[][] trees, Object cmd, int enabled, Object combine, string_list refs, int refs_from_env, int mode_from_env) {
		setTrees(trees);
		setCmd(cmd);
		setEnabled(enabled);
		setCombine(combine);
		setRefs(refs);
		setRefs_from_env(refs_from_env);
		setMode_from_env(mode_from_env);
	}
	public notes_rewrite_cfg() {
	}
	
	public notes_rewrite_cfg init_copy_notes_for_rewrite(Object cmd) {
		notes_rewrite_cfg c = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		byte rewrite_mode_env = /*Error: Function owner not recognized*/getenv("GIT_NOTES_REWRITE_MODE");
		byte rewrite_refs_env = /*Error: Function owner not recognized*/getenv("GIT_NOTES_REWRITE_REF");
		c.setCmd(cmd);
		c.setEnabled(1);
		c.setCombine(ModernizedCProgram.combine_notes_concatenate);
		c.setRefs(ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/));
		string_list generatedRefs = c.getRefs();
		generatedRefs.setStrdup_strings(1);
		c.setRefs_from_env(0);
		c.setMode_from_env(0);
		Object generatedCombine = c.getCombine();
		if (rewrite_mode_env) {
			c.setMode_from_env(1);
			c.setCombine(ModernizedCProgram.parse_combine_notes_fn(rewrite_mode_env));
			if (!generatedCombine) {
				();
			} 
		} 
		if (rewrite_refs_env) {
			c.setRefs_from_env(1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/string_list_add_refs_from_colon_sep(generatedRefs, rewrite_refs_env);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config(notes_rewrite_config, c);
		int generatedEnabled = c.getEnabled();
		int generatedNr = generatedRefs.getNr();
		if (!generatedEnabled || !generatedNr) {
			generatedRefs.string_list_clear(0);
			ModernizedCProgram.free(generatedRefs);
			ModernizedCProgram.free(c);
			return ((Object)0);
		} 
		c.setTrees(/*Error: Function owner not recognized*/load_notes_trees(generatedRefs, 2));
		generatedRefs.string_list_clear(0);
		ModernizedCProgram.free(generatedRefs);
		return c;
	}
	public int copy_note_for_rewrite(Object from_obj, Object to_obj) {
		int ret = 0;
		int i;
		notes_tree[][] generatedTrees = this.getTrees();
		Object generatedCombine = this.getCombine();
		for (i = 0; generatedTrees[i]; i++) {
			ret = /*Error: Function owner not recognized*/copy_note(generatedTrees[i], from_obj, to_obj, 1, generatedCombine) || ret;
		}
		return ret;
	}
	public notes_tree[][] getTrees() {
		return trees;
	}
	public void setTrees(notes_tree[][] newTrees) {
		trees = newTrees;
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int newEnabled) {
		enabled = newEnabled;
	}
	public Object getCombine() {
		return combine;
	}
	public void setCombine(Object newCombine) {
		combine = newCombine;
	}
	public string_list getRefs() {
		return refs;
	}
	public void setRefs(string_list newRefs) {
		refs = newRefs;
	}
	public int getRefs_from_env() {
		return refs_from_env;
	}
	public void setRefs_from_env(int newRefs_from_env) {
		refs_from_env = newRefs_from_env;
	}
	public int getMode_from_env() {
		return mode_from_env;
	}
	public void setMode_from_env(int newMode_from_env) {
		mode_from_env = newMode_from_env;
	}
}
