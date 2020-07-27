package application;

/*----- incremental advanced APIs -----*/
/*
 * It's okay for the caller to consume argv/argc in the usual way.
 * Other fields of that structure are private to parse-options and should not
 * be modified in any way.
 */
public class parse_opt_ctx_t {
	private Object[][] argv;
	private Object out;
	private int argc;
	private int cpidx;
	private int total;
	private Object[] opt;
	private int flags;
	private Object prefix;
	private Object[][] alias_groups;
	private option updated_options;
	
	public parse_opt_ctx_t(Object[][] argv, Object out, int argc, int cpidx, int total, Object[] opt, int flags, Object prefix, Object[][] alias_groups, option updated_options) {
		setArgv(argv);
		setOut(out);
		setArgc(argc);
		setCpidx(cpidx);
		setTotal(total);
		setOpt(opt);
		setFlags(flags);
		setPrefix(prefix);
		setAlias_groups(alias_groups);
		setUpdated_options(updated_options);
	}
	public parse_opt_ctx_t() {
	}
	
	public parse_opt_result parse_opt_unknown_cb(Object opt, Object arg, int unset) {
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options-cb.c", 231, "option callback does not expect an argument");
			} 
		} while (0);
		return parse_opt_result.PARSE_OPT_UNKNOWN/**
		 * Recreates the command-line option in the strbuf.
		 */;
	}
	public parse_opt_result get_arg(Object opt, int flags, Object arg) {
		Object[] generatedOpt = this.getOpt();
		int generatedArgc = this.getArgc();
		Object[][] generatedArgv = this.getArgv();
		if (generatedOpt) {
			arg = generatedOpt;
			this.setOpt(((Object)0));
		}  else if (generatedArgc == 1 && (opt.getFlags() & parse_opt_option_flags.PARSE_OPT_LASTARG_DEFAULT)) {
			arg = (byte)opt.getDefval();
		}  else if (generatedArgc > 1) {
			generatedArgc--;
			arg = ++generatedArgv;
		} else {
				return ();
		} 
		return 0;
	}
	public parse_opt_result parse_short_opt(Object options) {
		option all_opts = options;
		option numopt = ((Object)0);
		Object[] generatedOpt = this.getOpt();
		for (; options.getType() != parse_opt_type.OPTION_END; options++) {
			if (options.getShort_name() == generatedOpt) {
				this.setOpt(generatedOpt[1] ? generatedOpt + 1 : ((Object)0));
				return ModernizedCProgram.get_value(p, options, all_opts, 1/*
						 * Handle the numerical option later, explicit one-digit
						 * options take precedence over it.
						 */);
			} 
			if (options.getType() == parse_opt_type.OPTION_NUMBER) {
				numopt = options;
			} 
		}
		if (numopt && ((ModernizedCProgram.sane_ctype[(byte)(generatedOpt)] & (true)) != 0)) {
			size_t len = 1;
			byte arg;
			int rc;
			while (((ModernizedCProgram.sane_ctype[(byte)(generatedOpt[ModernizedCProgram.len])] & (true)) != 0)) {
				ModernizedCProgram.len++;
			}
			arg = ModernizedCProgram.xmemdupz(generatedOpt, ModernizedCProgram.len);
			this.setOpt(generatedOpt[ModernizedCProgram.len] ? generatedOpt + ModernizedCProgram.len : ((Object)0));
			if (numopt.getCallback()) {
				ModernizedCProgram.rc = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(numopt, arg, 0) ? (true) : 0;
			} else {
					ModernizedCProgram.rc = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p, numopt, arg, 0);
			} 
			ModernizedCProgram.free(arg);
			return ModernizedCProgram.rc;
		} 
		return parse_opt_result.PARSE_OPT_UNKNOWN;
	}
	public int is_alias(Object one_opt, Object another_opt) {
		byte group;
		if (!ModernizedCProgram.ctx.getAlias_groups()) {
			return 0;
		} 
		if (!one_opt.getLong_name() || !another_opt.getLong_name()) {
			return 0;
		} 
		for (group = ModernizedCProgram.ctx.getAlias_groups(); group; group += 3) {
			if (ModernizedCProgram.has_string(one_opt.getLong_name(), /* it and other are from the same family? */group) && ModernizedCProgram.has_string(another_opt.getLong_name(), group)) {
				return 1;
			} 
		}
		return 0;
	}
	public parse_opt_result parse_long_opt(Object arg, Object options) {
		option all_opts = options;
		byte arg_end = ModernizedCProgram.gitstrchrnul(arg, (byte)'=');
		option abbrev_option = ((Object)0);
		option ambiguous_option = ((Object)0);
		int abbrev_flags = 0;
		int ambiguous_flags = 0;
		if (ModernizedCProgram.disallow_abbreviated_options && (ambiguous_option || abbrev_option)) {
			ModernizedCProgram.die("disallowed abbreviated or ambiguous option '%.*s'", (int)(arg_end - arg), arg);
		} 
		if (ambiguous_option) {
			();
			return parse_opt_result.PARSE_OPT_HELP;
		} 
		if (abbrev_option) {
			return ModernizedCProgram.get_value(p, abbrev_option, all_opts, abbrev_flags);
		} 
		return parse_opt_result.PARSE_OPT_UNKNOWN;
	}
	public int parse_nodash_opt(Object[] arg, Object options) {
		option all_opts = options;
		for (; options.getType() != parse_opt_type.OPTION_END; options++) {
			if (!(options.getFlags() & parse_opt_option_flags.PARSE_OPT_NODASH)) {
				continue;
			} 
			if (options.getShort_name() == arg[0] && arg[1] == (byte)'\0') {
				return ModernizedCProgram.get_value(p, options, all_opts, 1);
			} 
		}
		return -2;
	}
	public void parse_options_start_1(int argc, Object argv, Object prefix, Object options, int flags) {
		ModernizedCProgram.ctx.setArgc(argc);
		ModernizedCProgram.ctx.setArgv(argv);
		if (!(flags & parse_opt_flags.PARSE_OPT_ONE_SHOT)) {
			ModernizedCProgram.ctx.getArgc()--;
			ModernizedCProgram.ctx.getArgv()++;
		} 
		ModernizedCProgram.ctx.setTotal(ModernizedCProgram.ctx.getArgc());
		ModernizedCProgram.ctx.setOut(argv);
		ModernizedCProgram.ctx.setPrefix(prefix);
		ModernizedCProgram.ctx.setCpidx(((flags & parse_opt_flags.PARSE_OPT_KEEP_ARGV0) != 0));
		ModernizedCProgram.ctx.setFlags(flags);
		if ((flags & parse_opt_flags.PARSE_OPT_KEEP_UNKNOWN) && (flags & parse_opt_flags.PARSE_OPT_STOP_AT_NON_OPTION) && !(flags & parse_opt_flags.PARSE_OPT_ONE_SHOT)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options.c", 516, "STOP_AT_NON_OPTION and KEEP_UNKNOWN don't go together");
		} 
		if ((flags & parse_opt_flags.PARSE_OPT_ONE_SHOT) && (flags & parse_opt_flags.PARSE_OPT_KEEP_ARGV0)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\parse-options.c", 519, "Can't keep argv0 if you don't have it");
		} 
		ModernizedCProgram.parse_options_check(options);
	}
	public void parse_options_start(int argc, Object argv, Object prefix, Object options, int flags) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.ctx, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.ctx.parse_options_start_1(argc, argv, prefix, options, flags);
	}
	public int parse_options_step(Object options, Object usagestr) {
		int internal_help = !(ModernizedCProgram.ctx.getFlags() & parse_opt_flags.PARSE_OPT_NO_INTERNAL_HELP);
		ModernizedCProgram.ctx.setOpt(((Object)/* we must reset ->opt, unknown short option leave it dangling */0));
		return parse_opt_result.PARSE_OPT_DONE;
	}
	public int parse_options_end() {
		if (ModernizedCProgram.ctx.getFlags() & parse_opt_flags.PARSE_OPT_ONE_SHOT) {
			return ModernizedCProgram.ctx.getTotal() - ModernizedCProgram.ctx.getArgc();
		} 
		ModernizedCProgram.move_array((ModernizedCProgram.ctx.getOut() + ModernizedCProgram.ctx.getCpidx()), (ModernizedCProgram.ctx.getArgv()), (ModernizedCProgram.ctx.getArgc()), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		ModernizedCProgram.ctx.getOut()[ModernizedCProgram.ctx.getCpidx() + ModernizedCProgram.ctx.getArgc()] = ((Object)0);
		return ModernizedCProgram.ctx.getCpidx() + ModernizedCProgram.ctx.getArgc();
	}
	public int usage_with_options_internal(Object usagestr, Object opts, int full, int err) {
		FILE outfile = err ? (_iob[2]) : (_iob[1]);
		int need_newline;
		if (!usagestr) {
			return parse_opt_result.PARSE_OPT_HELP;
		} 
		if (!err && ModernizedCProgram.ctx && ModernizedCProgram.ctx.getFlags() & parse_opt_option_flags.PARSE_OPT_SHELL_EVAL) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(outfile, "cat <<\\EOF\n");
		} 
		outfile.fprintf_ln(ModernizedCProgram._("usage: %s"), ModernizedCProgram._(usagestr++));
		while (usagestr && usagestr/*
				 * TRANSLATORS: the colon here should align with the
				 * one in "usage: %s" translation.
				 */) {
			outfile.fprintf_ln(ModernizedCProgram._("   or: %s"), ModernizedCProgram._(usagestr++));
		}
		while (usagestr) {
			if (usagestr) {
				outfile.fprintf_ln(ModernizedCProgram._("    %s"), ModernizedCProgram._(usagestr));
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', outfile);
			} 
			usagestr++;
		}
		need_newline = 1;
		for (; opts.getType() != parse_opt_type.OPTION_END; opts++) {
			size_t pos = new size_t();
			int pad;
			if (opts.getType() == parse_opt_type.OPTION_GROUP) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', outfile);
				need_newline = 0;
				if (opts.getHelp()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(outfile, "%s\n", ModernizedCProgram._(opts.getHelp()));
				} 
				continue;
			} 
			if (!full && (opts.getFlags() & parse_opt_option_flags.PARSE_OPT_HIDDEN)) {
				continue;
			} 
			if (need_newline) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', outfile);
				need_newline = 0;
			} 
			pos = /*Error: Function owner not recognized*/fprintf(outfile, "    ");
			if (opts.getShort_name()) {
				if (opts.getFlags() & parse_opt_option_flags.PARSE_OPT_NODASH) {
					pos += /*Error: Function owner not recognized*/fprintf(outfile, "%c", opts.getShort_name());
				} else {
						pos += /*Error: Function owner not recognized*/fprintf(outfile, "-%c", opts.getShort_name());
				} 
			} 
			if (opts.getLong_name() && opts.getShort_name()) {
				pos += /*Error: Function owner not recognized*/fprintf(outfile, ", ");
			} 
			if (opts.getLong_name()) {
				pos += /*Error: Function owner not recognized*/fprintf(outfile, "--%s", opts.getLong_name());
			} 
			if (opts.getType() == parse_opt_type.OPTION_NUMBER) {
				pos += outfile.utf8_fprintf(ModernizedCProgram._("-NUM"));
			} 
			if ((opts.getFlags() & parse_opt_option_flags.PARSE_OPT_LITERAL_ARGHELP) || !(opts.getFlags() & parse_opt_option_flags.PARSE_OPT_NOARG)) {
				pos += outfile.usage_argh(opts);
			} 
			if (pos <= 24) {
				pad = 24 - pos;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', outfile);
					pad = 24;
			} 
			if (opts.getType() == parse_opt_type.OPTION_ALIAS) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(outfile, "%*s", pad + 2, "");
				outfile.fprintf_ln(ModernizedCProgram._("alias of --%s"), (byte)opts.getValue());
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(outfile, "%*s%s\n", pad + 2, "", ModernizedCProgram._(opts.getHelp()));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', outfile);
		if (!err && ModernizedCProgram.ctx && ModernizedCProgram.ctx.getFlags() & parse_opt_option_flags.PARSE_OPT_SHELL_EVAL) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("EOF\n", outfile);
		} 
		return parse_opt_result.PARSE_OPT_HELP;
	}
	public parse_opt_result option_read_message(Object opt, Object arg_not_used, int unset) {
		strbuf buf = opt.getValue();
		byte arg;
		do {
			if ((arg_not_used)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\merge.c", 130, "option callback does not expect an argument");
			} 
		} while (0);
		if (unset) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\merge.c", 132, "-F cannot be negated");
		} 
		if (ModernizedCProgram.ctx.getOpt()) {
			arg = ModernizedCProgram.ctx.getOpt();
			ModernizedCProgram.ctx.setOpt(((Object)0));
		}  else if (ModernizedCProgram.ctx.getArgc() > 1) {
			ModernizedCProgram.ctx.getArgc()--;
			arg = ++ModernizedCProgram.ctx.getArgv();
		} else {
				return ();
		} 
		Object generatedLen = buf.getLen();
		if (generatedLen) {
			buf.strbuf_addch((byte)'\n');
		} 
		if (ModernizedCProgram.ctx.getPrefix() && !ModernizedCProgram.is_absolute_path(arg)) {
			arg = ModernizedCProgram.prefix_filename(ModernizedCProgram.ctx.getPrefix(), arg);
		} 
		if (buf.strbuf_read_file(arg, 0) < 0) {
			return ();
		} 
		ModernizedCProgram.have_message = 1;
		return 0;
	}
	public parse_opt_result cacheinfo_callback(Object opt, Object arg, int unset) {
		object_id oid = new object_id();
		int mode;
		byte path;
		do {
			if ((unset)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 859, "option callback does not expect negation");
			} 
		} while (0);
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 860, "option callback does not expect an argument");
			} 
		} while (0);
		if (!oid.parse_new_style_cacheinfo(ModernizedCProgram.ctx.getArgv()[1], mode, path)) {
			if (ModernizedCProgram.add_cacheinfo(mode, oid, path, 0)) {
				ModernizedCProgram.die("git update-index: --cacheinfo cannot add %s", path);
			} 
			ModernizedCProgram.ctx.getArgv()++;
			ModernizedCProgram.ctx.getArgc()--;
			return 0;
		} 
		if (ModernizedCProgram.ctx.getArgc() <= 3) {
			return ();
		} 
		if (ModernizedCProgram.strtoul_ui(++ModernizedCProgram.ctx.getArgv(), 8, mode) || oid.get_oid_hex(++ModernizedCProgram.ctx.getArgv()) || ModernizedCProgram.add_cacheinfo(mode, oid, ++ModernizedCProgram.ctx.getArgv(), 0)) {
			ModernizedCProgram.die("git update-index: --cacheinfo cannot add %s", ModernizedCProgram.ctx.getArgv());
		} 
		ModernizedCProgram.ctx.getArgc() -= 3;
		return 0;
	}
	public parse_opt_result stdin_cacheinfo_callback(Object opt, Object arg, int unset) {
		int nul_term_line = opt.getValue();
		do {
			if ((unset)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 885, "option callback does not expect negation");
			} 
		} while (0);
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 886, "option callback does not expect an argument");
			} 
		} while (0);
		if (ModernizedCProgram.ctx.getArgc() != 1) {
			return ();
		} 
		ModernizedCProgram.allow_add = ModernizedCProgram.allow_replace = ModernizedCProgram.allow_remove = 1;
		ModernizedCProgram.read_index_info(nul_term_line);
		return 0;
	}
	public parse_opt_result stdin_callback(Object opt, Object arg, int unset) {
		int read_from_stdin = opt.getValue();
		do {
			if ((unset)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 901, "option callback does not expect negation");
			} 
		} while (0);
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 902, "option callback does not expect an argument");
			} 
		} while (0);
		if (ModernizedCProgram.ctx.getArgc() != 1) {
			return ();
		} 
		read_from_stdin = 1;
		return 0;
	}
	public parse_opt_result unresolve_callback(Object opt, Object arg, int unset) {
		int has_errors = opt.getValue();
		byte prefix = ModernizedCProgram.startup_info.getPrefix();
		do {
			if ((unset)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 917, "option callback does not expect negation");
			} 
		} while (0);
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 918, "option callback does not expect an argument");
			} 
		} while (0);
		has_errors = ModernizedCProgram.do_unresolve(ModernizedCProgram.ctx.getArgc(), ModernizedCProgram.ctx.getArgv(), prefix, prefix ? /*Error: Function owner not recognized*/strlen(prefix) : 0);
		if (has_errors) {
			(ModernizedCProgram.the_index.getCache_changed()) = 0;
		} 
		ModernizedCProgram.ctx.getArgv() += ModernizedCProgram.ctx.getArgc() - 1;
		ModernizedCProgram.ctx.setArgc(1);
		return 0;
	}
	public parse_opt_result reupdate_callback(Object opt, Object arg, int unset) {
		int has_errors = opt.getValue();
		byte prefix = ModernizedCProgram.startup_info.getPrefix();
		do {
			if ((unset)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 938, "option callback does not expect negation");
			} 
		} while (0);
		do {
			if ((arg)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\update-index.c", 939, "option callback does not expect an argument");
			} 
		} while (0);
		ModernizedCProgram.setup_work_tree();
		has_errors = ModernizedCProgram.do_reupdate(ModernizedCProgram.ctx.getArgc(), ModernizedCProgram.ctx.getArgv(), prefix);
		if (has_errors) {
			(ModernizedCProgram.the_index.getCache_changed()) = 0;
		} 
		ModernizedCProgram.ctx.getArgv() += ModernizedCProgram.ctx.getArgc() - 1;
		ModernizedCProgram.ctx.setArgc(1);
		return 0;
	}
	public Object[][] getArgv() {
		return argv;
	}
	public void setArgv(Object[][] newArgv) {
		argv = newArgv;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public int getArgc() {
		return argc;
	}
	public void setArgc(int newArgc) {
		argc = newArgc;
	}
	public int getCpidx() {
		return cpidx;
	}
	public void setCpidx(int newCpidx) {
		cpidx = newCpidx;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int newTotal) {
		total = newTotal;
	}
	public Object[] getOpt() {
		return opt;
	}
	public void setOpt(Object[] newOpt) {
		opt = newOpt;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public Object[][] getAlias_groups() {
		return alias_groups;
	}
	public void setAlias_groups(Object[][] newAlias_groups) {
		alias_groups = newAlias_groups;
	}
	public option getUpdated_options() {
		return updated_options;
	}
	public void setUpdated_options(option newUpdated_options) {
		updated_options = newUpdated_options;
	}
}
