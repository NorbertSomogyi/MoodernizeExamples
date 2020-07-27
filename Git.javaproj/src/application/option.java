package application;

public class option {
	private parse_opt_type type;
	private int short_name;
	private Object long_name;
	private Object value;
	private Object argh;
	private Object help;
	private int flags;
	private Object callback;
	private Object defval;
	private Object ll_callback;
	private Object extra;
	
	public option(parse_opt_type type, int short_name, Object long_name, Object value, Object argh, Object help, int flags, Object callback, Object defval, Object ll_callback, Object extra) {
		setType(type);
		setShort_name(short_name);
		setLong_name(long_name);
		setValue(value);
		setArgh(argh);
		setHelp(help);
		setFlags(flags);
		setCallback(callback);
		setDefval(defval);
		setLl_callback(ll_callback);
		setExtra(extra);
	}
	public option() {
	}
	
	public option parse_options_dup(Object o) {
		option opts = new option();
		int nr = 0;
		while (o && o.getType() != parse_opt_type.OPTION_END) {
			nr++;
			o++;
		}
		(opts) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nr + 1)));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(opts, o - nr, /*Error: sizeof expression not supported yet*/ * nr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts + nr, 0, /*Error: sizeof expression not supported yet*/);
		opts[nr].setType(parse_opt_type.OPTION_END);
		return opts;
	}
	public option parse_options_concat(option[] b) {
		option ret = new option();
		size_t i = new size_t();
		size_t a_len = 0;
		size_t b_len = 0;
		for (i = 0; a[i].getType() != parse_opt_type.OPTION_END; i++) {
			a_len++;
		}
		for (i = 0; b[i].getType() != parse_opt_type.OPTION_END; i++) {
			b_len++;
		}
		(ret) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.st_add(ModernizedCProgram.st_add((a_len), (b_len)), (true)))));
		for (i = 0; i < a_len; i++) {
			ret[i] = a[i];
		}
		for (i = 0; i < b_len; i++) {
			ret[a_len + i] = b[i];
		}
		ret[a_len + b_len] = b[/* final OPTION_END */b_len];
		return ret;
	}
	public option preprocess_options(parse_opt_ctx_t ctx, Object[] options) {
		option newopt = new option();
		int i;
		int nr;
		int alias;
		int nr_aliases = 0;
		for (nr = 0; options[nr].getType() != parse_opt_type.OPTION_END; nr++) {
			if (options[nr].getType() == parse_opt_type.OPTION_ALIAS) {
				nr_aliases++;
			} 
		}
		if (!nr_aliases) {
			return ((Object)0);
		} 
		(newopt) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nr + 1)));
		ModernizedCProgram.copy_array((newopt), (options), (nr + 1), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		Object[][] generatedAlias_groups = ctx.getAlias_groups();
		(generatedAlias_groups) = ModernizedCProgram.xcalloc((3 * (nr_aliases + 1)), /*Error: sizeof expression not supported yet*/);
		;
		for (; i < nr; i++) {
			int short_name;
			byte long_name;
			byte source;
			int j;
			if (newopt[i].getType() != parse_opt_type.OPTION_ALIAS) {
				continue;
			} 
			short_name = newopt[i].getShort_name();
			long_name = newopt[i].getLong_name();
			source = newopt[i].getValue();
			if (!long_name) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options.c", 664, "An alias must have long option name");
			} 
			for (j = 0; j < nr; j++) {
				byte name = options[j].getLong_name();
				if (!name || /*Error: Function owner not recognized*/strcmp(name, source)) {
					continue;
				} 
				if (options[j].getType() == parse_opt_type.OPTION_ALIAS) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options.c", 673, "No please. Nested aliases are not supported."/*
								 * NEEDSWORK: this is a bit inconsistent because
								 * usage_with_options() on the original options[] will print
								 * help string as "alias of %s" but "git cmd -h" will
								 * print the original help string.
								 */);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(newopt + i, options + j, /*Error: sizeof expression not supported yet*/);
				newopt[i].setShort_name(short_name);
				newopt[i].setLong_name(long_name);
				break;
			}
			if (j == nr) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options.c", 689, "could not find source option '%s' of alias '%s'", source, newopt[i].getLong_name());
			} 
			generatedAlias_groups[alias * 3 + 0] = newopt[i].getLong_name();
			generatedAlias_groups[alias * 3 + 1] = options[j].getLong_name();
			generatedAlias_groups[alias * 3 + 2] = ((Object)0);
			alias++;
		}
		return newopt;
	}
	public option add_common_options(checkout_opts opts) {
		int generatedQuiet = opts.getQuiet();
		int generatedShow_progress = opts.getShow_progress();
		int generatedMerge = opts.getMerge();
		Byte generatedConflict_style = opts.getConflict_style();
		option[] options = new option[]{new option(parse_opt_type.OPTION_COUNTUP, ((byte)'q'), ("quiet"), ((generatedQuiet)), ((Object)0), ((("suppress progress reporting"))), parse_opt_option_flags.PARSE_OPT_NOARG | (false)), new option(parse_opt_type.OPTION_CALLBACK, 0, "recurse-submodules", ((Object)0), "checkout", "control recursive updating of submodules", parse_opt_option_flags.PARSE_OPT_OPTARG, ModernizedCProgram.option_parse_recurse_submodules_worktree_updater), new option(parse_opt_type.OPTION_SET_INT, (false), ("progress"), (generatedShow_progress), ((Object)0), (("force progress reporting")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'m'), ("merge"), (generatedMerge), ((Object)0), (("perform a 3-way merge with the new branch")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_STRING, (false), ("conflict"), (generatedConflict_style), (("style")), (("conflict style (merge or diff3)")), (false)), new option(parse_opt_type.OPTION_END)};
		option newopts = prevopts.parse_options_concat(options);
		ModernizedCProgram.free(prevopts);
		return newopts;
	}
	public option add_common_switch_branch_options(checkout_opts opts) {
		int generatedForce_detach = opts.getForce_detach();
		branch_track generatedTrack = opts.getTrack();
		int generatedForce = opts.getForce();
		Object generatedNew_orphan_branch = opts.getNew_orphan_branch();
		int generatedOverwrite_ignore = opts.getOverwrite_ignore();
		int generatedIgnore_other_worktrees = opts.getIgnore_other_worktrees();
		option[] options = new option[]{new option(parse_opt_type.OPTION_SET_INT, ((byte)'d'), ("detach"), (generatedForce_detach), ((Object)0), (("detach HEAD at named commit")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'t'), ("track"), (generatedTrack), ((Object)0), (("set upstream info for new branch")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (branch_track.BRANCH_TRACK_EXPLICIT)), new option(parse_opt_type.OPTION_COUNTUP, ((byte)'f'), ("force"), ((generatedForce)), ((Object)0), ((("force checkout (throw away local modifications)"))), parse_opt_option_flags.PARSE_OPT_NOARG | ((parse_opt_option_flags.PARSE_OPT_NOCOMPLETE))), new option(parse_opt_type.OPTION_STRING, (false), ("orphan"), (generatedNew_orphan_branch), (("new-branch")), (("new unparented branch")), (false)), new option(parse_opt_type.OPTION_SET_INT, (false), ("overwrite-ignore"), (generatedOverwrite_ignore), ((Object)0), (("update ignored files (default)")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NOCOMPLETE), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("ignore-other-worktrees"), (generatedIgnore_other_worktrees), ((Object)0), (("do not check if another worktree is holding the given ref")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_END)};
		option newopts = prevopts.parse_options_concat(options);
		ModernizedCProgram.free(prevopts);
		return newopts;
	}
	public option add_checkout_path_options(checkout_opts opts) {
		int generatedWriteout_stage = opts.getWriteout_stage();
		int generatedPatch_mode = opts.getPatch_mode();
		int generatedIgnore_skipworktree = opts.getIgnore_skipworktree();
		option[] options = new option[]{new option(parse_opt_type.OPTION_SET_INT, ((byte)'2'), ("ours"), (generatedWriteout_stage), ((Object)0), (("checkout our version for unmerged files")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'3'), ("theirs"), (generatedWriteout_stage), ((Object)0), (("checkout their version for unmerged files")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'p'), ("patch"), (generatedPatch_mode), ((Object)0), (("select hunks interactively")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("ignore-skip-worktree-bits"), (generatedIgnore_skipworktree), ((Object)0), (("do not limit pathspecs to sparse entries only")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_END)};
		option newopts = prevopts.parse_options_concat(options);
		ModernizedCProgram.free(prevopts);
		return newopts;
	}
	public parse_opt_type getType() {
		return type;
	}
	public void setType(parse_opt_type newType) {
		type = newType;
	}
	public int getShort_name() {
		return short_name;
	}
	public void setShort_name(int newShort_name) {
		short_name = newShort_name;
	}
	public Object getLong_name() {
		return long_name;
	}
	public void setLong_name(Object newLong_name) {
		long_name = newLong_name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public Object getArgh() {
		return argh;
	}
	public void setArgh(Object newArgh) {
		argh = newArgh;
	}
	public Object getHelp() {
		return help;
	}
	public void setHelp(Object newHelp) {
		help = newHelp;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getDefval() {
		return defval;
	}
	public void setDefval(Object newDefval) {
		defval = newDefval;
	}
	public Object getLl_callback() {
		return ll_callback;
	}
	public void setLl_callback(Object newLl_callback) {
		ll_callback = newLl_callback;
	}
	public Object getExtra() {
		return extra;
	}
	public void setExtra(Object newExtra) {
		extra = newExtra;
	}
}
/*
 * `type`::
 *   holds the type of the option, you must have an OPTION_END last in your
 *   array.
 *
 * `short_name`::
 *   the character to use as a short option name, '\0' if none.
 *
 * `long_name`::
 *   the long option name, without the leading dashes, NULL if none.
 *
 * `value`::
 *   stores pointers to the values to be filled.
 *
 * `argh`::
 *   token to explain the kind of argument this option wants. Keep it
 *   homogeneous across the repository. Should be wrapped by N_() for
 *   translation.
 *
 * `help`::
 *   the short help associated to what the option does.
 *   Must never be NULL (except for OPTION_END).
 *   OPTION_GROUP uses this pointer to store the group header.
 *   Should be wrapped by N_() for translation.
 *
 * `flags`::
 *   mask of parse_opt_option_flags.
 *   PARSE_OPT_OPTARG: says that the argument is optional (not for BOOLEANs)
 *   PARSE_OPT_NOARG: says that this option does not take an argument
 *   PARSE_OPT_NONEG: says that this option cannot be negated
 *   PARSE_OPT_HIDDEN: this option is skipped in the default usage, and
 *                     shown only in the full usage.
 *   PARSE_OPT_LASTARG_DEFAULT: says that this option will take the default
 *				value if no argument is given when the option
 *				is last on the command line. If the option is
 *				not last it will require an argument.
 *				Should not be used with PARSE_OPT_OPTARG.
 *   PARSE_OPT_NODASH: this option doesn't start with a dash.
 *   PARSE_OPT_LITERAL_ARGHELP: says that argh shouldn't be enclosed in brackets
 *				(i.e. '<argh>') in the help message.
 *				Useful for options with multiple parameters.
 *   PARSE_OPT_NOCOMPLETE: by default all visible options are completable
 *			   by git-completion.bash. This option suppresses that.
 *   PARSE_OPT_COMP_ARG: this option forces to git-completion.bash to
 *			 complete an option as --name= not --name even if
 *			 the option takes optional argument.
 *
 * `callback`::
 *   pointer to the callback to use for OPTION_CALLBACK
 *
 * `defval`::
 *   default value to fill (*->value) with for PARSE_OPT_OPTARG.
 *   OPTION_{BIT,SET_INT} store the {mask,integer} to put in the value when met.
 *   CALLBACKS can use it like they want.
 *
 * `ll_callback`::
 *   pointer to the callback to use for OPTION_LOWLEVEL_CALLBACK
 *
 */
