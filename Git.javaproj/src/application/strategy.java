package application;

/*
 * Builtin "git merge"
 *
 * Copyright (c) 2008 Miklos Vajna <vmiklos@frugalware.org>
 *
 * Based on git-merge.sh by Junio C Hamano.
 */
public class strategy {
	private Object name;
	private int attr;
	
	public strategy(Object name, int attr) {
		setName(name);
		setAttr(attr);
	}
	public strategy() {
	}
	
	public strategy get_strategy(Object name) {
		int i;
		strategy ret = new strategy();
		cmdnames main_cmds = new cmdnames();
		cmdnames other_cmds = new cmdnames();
		int loaded;
		if (!name) {
			return ((Object)0);
		} 
		for (i = 0; i < ( /  + ( - 1)); i++) {
			if (!.strcmp(name, ModernizedCProgram.all_strategy[i].getName())) {
				return ModernizedCProgram.all_strategy[i];
			} 
		}
		int generatedCnt = main_cmds.getCnt();
		cmdname generatedNames = main_cmds.getNames();
		Object generatedName = ent.getName();
		Object generatedLen = ent.getLen();
		if (!loaded) {
			cmdnames not_strategies = new cmdnames();
			loaded = 1;
			.memset(not_strategies, 0, );
			.load_command_list("git-merge-", main_cmds, other_cmds);
			for (i = 0; i < generatedCnt; i++) {
				int j;
				int found = 0;
				cmdname ent = generatedNames[i];
				for (j = 0; j < ( /  + ( - 1)); j++) {
					if (!.strncmp(generatedName, generatedName, generatedLen) && !generatedName[generatedLen]) {
						found = 1;
					} 
				}
				if (!found) {
					.add_cmdname(not_strategies, generatedName, generatedLen);
				} 
			}
			.exclude_cmds(main_cmds, not_strategies);
		} 
		if (!.is_in_cmdlist(main_cmds, name) && !.is_in_cmdlist(other_cmds, name)) {
			.fprintf((_iob[2]), ModernizedCProgram._("Could not find merge strategy '%s'.\n"), name);
			.fprintf((_iob[2]), ModernizedCProgram._("Available strategies are:"));
			for (i = 0; i < generatedCnt; i++) {
				.fprintf((_iob[2]), " %s", generatedName);
			}
			.fprintf((_iob[2]), ".\n");
			if (generatedCnt) {
				.fprintf((_iob[2]), ModernizedCProgram._("Available custom strategies are:"));
				for (i = 0; i < generatedCnt; i++) {
					.fprintf((_iob[2]), " %s", generatedName);
				}
				.fprintf((_iob[2]), ".\n");
			} 
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\merge.c", 198, (true)));
		} 
		ret = ModernizedCProgram.xcalloc(1, );
		ret.setName(ModernizedCProgram.xstrdup(name));
		ret.setAttr((1 << 3));
		return ret;
	}
	public void append_strategy() {
		do {
			if ((ModernizedCProgram.use_strategies_nr + 1) > ModernizedCProgram.use_strategies_alloc) {
				if ((((ModernizedCProgram.use_strategies_alloc) + 16) * 3 / 2) < (ModernizedCProgram.use_strategies_nr + 1)) {
					ModernizedCProgram.use_strategies_alloc = (ModernizedCProgram.use_strategies_nr + 1);
				} else {
						ModernizedCProgram.use_strategies_alloc = (((ModernizedCProgram.use_strategies_alloc) + 16) * 3 / 2);
				} 
				(ModernizedCProgram.use_strategies) = ModernizedCProgram.xrealloc((ModernizedCProgram.use_strategies), ModernizedCProgram.st_mult(, (ModernizedCProgram.use_strategies_alloc)));
			} 
		} while (0);
		ModernizedCProgram.use_strategies[ModernizedCProgram.use_strategies_nr++] = s;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getAttr() {
		return attr;
	}
	public void setAttr(int newAttr) {
		attr = newAttr;
	}
}
