package application;

public class expand {
	private int xp_context;
	private Object[] xp_pattern;
	private int xp_pattern_len;
	private int xp_backslash;
	private int xp_shell;
	private int xp_numfiles;
	private Object[][] xp_files;
	private Object xp_line;
	private int xp_col;
	
	public expand(int xp_context, Object[] xp_pattern, int xp_pattern_len, int xp_backslash, int xp_shell, int xp_numfiles, Object[][] xp_files, Object xp_line, int xp_col) {
		setXp_context(xp_context);
		setXp_pattern(xp_pattern);
		setXp_pattern_len(xp_pattern_len);
		setXp_backslash(xp_backslash);
		setXp_shell(xp_shell);
		setXp_numfiles(xp_numfiles);
		setXp_files(xp_files);
		setXp_line(xp_line);
		setXp_col(xp_col);
	}
	public expand() {
	}
	
	/*
	 * Function given to ExpandGeneric() to obtain an environment variable name.
	 */
	public Object get_env_name(int idx) {
		char_u[] name = new char_u();
		char_u str = new char_u();
		int n;
		str = (char_u)(/*Error: Function owner not recognized*/__p__environ())[idx];
		if (str == ((Object)0)) {
			return ((Object)0);
		} 
		for (n = 0; n < 100 - 1; ++n) {
			if (str[n] == (byte)'=' || str[n] == (byte)'\000') {
				break;
			} 
			name[n] = str[n];
		}
		name[n] = (byte)'\000';
		return name/*
		 * Add a user name to the list of users in ga_users.
		 * Do nothing if user name is NULL or empty.
		 */;
	}
	/*
	     * No environ[] on the Amiga.
	     */
	// is a valid remote user name using getpwnam() and if it is, add it to
	// the list of user names.
	/*
	 * Function given to ExpandGeneric() to obtain an user names.
	 */
	public Object get_users(int idx) {
		ModernizedCProgram.init_users();
		if (idx < ModernizedCProgram.ga_users.getGa_len()) {
			return ((char_u)ModernizedCProgram.ga_users.getGa_data())[idx];
		} 
		return ((Object)0/*
		 * Check whether name matches a user name. Return:
		 * 0 if name does not match any user name.
		 * 1 if name partially matches the beginning of a user name.
		 * 2 is name fully matches a user name.
		 */);
	}
	public Object get_sign_name(int idx) {
		switch (.expand_what) {
		case .EXP_LIST:
				{ 
					byte[] list_arg = new byte[]{"group=", "file=", "buffer=", ((Object)0)};
					return (char_u)list_arg[idx];
				}
		case .EXP_UNPLACE:
				{ 
					byte[] unplace_arg = new byte[]{"group=", "file=", "buffer=", ((Object)0)};
					return (char_u)unplace_arg[idx];
				}
		case .EXP_SIGN_NAMES:
				return ModernizedCProgram.get_nth_sign_name(idx);
		case .EXP_SIGN_GROUPS:
				return ModernizedCProgram.get_nth_sign_group_name(idx);
		case .EXP_SUBCMD:
				return (char_u)ModernizedCProgram.cmds[idx];
		case .EXP_DEFINE:
				{ 
					byte[] define_arg = new byte[]{"icon=", "linehl=", "text=", "texthl=", ((Object)0)};
					return (char_u)define_arg[idx];
				}
		case .EXP_PLACE:
				{ 
					byte[] place_arg = new byte[]{"line=", "name=", "group=", "priority=", "file=", "buffer=", ((Object)0)};
					return (char_u)place_arg[idx];
				}
		default:
				return ((Object)0/*
				 * Handle command line completion for :sign command.
				 */);
		}
	}
	public void set_context_in_sign_cmd(Object arg) {
		char_u p = new char_u();
		char_u end_subcmd = new char_u();
		char_u last = new char_u();
		int cmd_idx;
		char_u begin_subcmd_args = new char_u();
		// Default: expand subcommands.// Default: expand subcommands.this.setXp_context(34);
		.expand_what = .EXP_SUBCMD;
		this.setXp_pattern(arg);
		end_subcmd = ModernizedCProgram.skiptowhite(arg);
		if (end_subcmd == (byte)'\000') {
			return /*Error: Unsupported expression*/;
		} 
		// expand subcmd name
		cmd_idx = ModernizedCProgram.sign_cmd_idx(arg, end_subcmd)// :sign {subcmd} {subcmd_args};// :sign {subcmd} {subcmd_args}
		//		      |//		      begin_subcmd_args//		      |//		      begin_subcmd_argsbegin_subcmd_args = ModernizedCProgram.skipwhite(end_subcmd)// expand last argument of subcmd// :sign define {name} {args}...;// expand last argument of subcmd// :sign define {name} {args}...
		//		    |//		    p// Loop until reaching last argument.//		    |//		    p// Loop until reaching last argument.p = begin_subcmd_args;
		do {
			p = ModernizedCProgram.skipwhite(p);
			last = p;
			p = ModernizedCProgram.skiptowhite(p);
		} while (p != (byte)'\000');
		p = ModernizedCProgram.vim_strchr(last, (byte)'=')// :sign define {name} {args}... {last}=;// :sign define {name} {args}... {last}=
		//				     |	   |//				  last	   pif (p == ((Object)0)) {
			this.setXp_pattern(last);
			switch (cmd_idx) {
			case 2:
			case 0:
					.expand_what = .EXP_DEFINE;
					break;
			case 1:
					.expand_what = .EXP_SIGN_NAMES;
					break;
			case 5:
			case 3:
					if (((int)(begin_subcmd_args) - (byte)'0' < 10)) {
						.expand_what = .EXP_PLACE;
					} else {
							.expand_what = .EXP_LIST;
					} 
					break;
			case 4:
					.expand_what = .EXP_UNPLACE;
					break;
			default:
					this.setXp_context(0);
			}
		} else {
				this.setXp_pattern(p + 1);
				switch (cmd_idx) {
				case 5:
						if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("group"), (size_t)(true)) == 0) {
							.expand_what = .EXP_SIGN_GROUPS;
						}  else if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("file"), (size_t)(true)) == 0) {
							this.setXp_context(9);
						} else {
								this.setXp_context(0);
						} 
						break;
				case 0:
						if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("texthl"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("linehl"), (size_t)(true)) == 0) {
							this.setXp_context(13);
						}  else if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("icon"), (size_t)(true)) == 0) {
							this.setXp_context(2);
						} else {
								this.setXp_context(0);
						} 
						break;
				case 3:
						if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("name"), (size_t)(true)) == 0) {
							.expand_what = .EXP_SIGN_NAMES;
						}  else if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("group"), (size_t)(true)) == 0) {
							.expand_what = .EXP_SIGN_GROUPS;
						}  else if (/*Error: Function owner not recognized*/strncmp((byte)(last), (byte)("file"), (size_t)(true)) == 0) {
							this.setXp_context(9);
						} else {
								this.setXp_context(0);
						} 
						break;
				case 4:
				default:
						this.setXp_context(0/*
						 * Define a sign using the attributes in 'dict'. Returns 0 on success and -1 on
						 * failure.
						 */);
				}
		} 
	}
	public void set_context_for_expression(Object arg, CMD_index cmdidx) {
		int got_eq = 0;
		int c;
		char_u p = new char_u();
		if (cmdidx == CMD_index.CMD_let) {
			this.setXp_context(15);
			if (ModernizedCProgram.vim_strpbrk(arg, (char_u)"\"'+-*/%.=!?~|&$([<>,#") == ((Object)0)) {
				for (p = arg + /*Error: Function owner not recognized*/strlen((byte)(arg)); p >= /* ":let var1 var2 ...": find last space. */arg; /*Error: Unsupported expression*/) {
					this.setXp_pattern(p);
					p -= has_mbyte ? (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(arg, p - 1) + 1) : 1;
					if (((p) == (byte)' ' || (p) == (byte)'\t')) {
						break;
					} 
				}
				return /*Error: Unsupported expression*/;
			} 
		} else {
				this.setXp_context(cmdidx == CMD_index.CMD_call ? 18 : 20);
		} 
		Object[] generatedXp_pattern = this.getXp_pattern();
		int generatedXp_context = this.getXp_context();
		while ((this.setXp_pattern(ModernizedCProgram.vim_strpbrk(arg, (char_u)"\"'+-*/%.=!?~|&$([<>,#"))) != ((Object)0)) {
			c = generatedXp_pattern;
			if (c == (byte)'&') {
				c = generatedXp_pattern[1];
				if (c == (byte)'&') {
					++generatedXp_pattern;
					this.setXp_context(cmdidx != CMD_index.CMD_let || got_eq ? 20 : 0);
				}  else if (c != (byte)' ') {
					this.setXp_context(4);
					if ((c == (byte)'l' || c == (byte)'g') && generatedXp_pattern[2] == (byte)':') {
						generatedXp_pattern += 2;
					} 
				} 
			}  else if (c == (byte)'$') {
				this.setXp_context(/* environment variable */26);
			}  else if (c == (byte)'=') {
				got_eq = 1;
				this.setXp_context(20);
			}  else if (c == (byte)'#' && generatedXp_context == 20) {
				break;
			}  else if ((c == (byte)'<' || c == (byte)'#') && generatedXp_context == 18 && ModernizedCProgram.vim_strchr(generatedXp_pattern, (byte)'(') == ((Object)0)) {
				break;
			}  else if (cmdidx != CMD_index.CMD_let || got_eq) {
				if (c == /* string */(byte)'"') {
					while ((c = ++generatedXp_pattern) != (byte)'\000' && c != (byte)'"') {
						if (c == (byte)'\\' && generatedXp_pattern[1] != (byte)'\000') {
							++generatedXp_pattern;
						} 
					}
					this.setXp_context(0);
				}  else if (c == /* literal string */(byte)'\'') {
					while ((c = ++generatedXp_pattern) != (byte)'\000' && c != /* Trick: '' is like stopping and starting a literal string. */(byte)'\'') {
						;
					}
					this.setXp_context(0);
				}  else if (c == (byte)'|') {
					if (generatedXp_pattern[1] == (byte)'|') {
						++generatedXp_pattern;
						this.setXp_context(20);
					} else {
							this.setXp_context(1);
					} 
				} else {
						this.setXp_context(20);
				} 
			} else {
					this.setXp_context(/* Doesn't look like something valid, expand as an expression
						     * anyway. */20);
			} 
			arg = generatedXp_pattern;
			if (arg != (byte)'\000') {
				while ((c = ++arg) != (byte)'\000' && (c == (byte)' ' || c == (byte)'\t')) {
					;
				}
			} 
		}
		this.setXp_pattern(arg/*
		 * Return TRUE if "pat" matches "text".
		 * Does not use 'cpo' and always uses 'magic'.
		 */);
	}
	public void set_context_in_set_cmd(Object arg, int opt_flags) {
		/* OPT_GLOBAL and/or OPT_LOCAL */int nextchar;
		long_u flags = /* init for GCC */0;
		int opt_idx = /* init for GCC */0;
		char_u p = new char_u();
		char_u s = new char_u();
		int is_term_option = 0;
		int key;
		ModernizedCProgram.expand_option_flags = opt_flags;
		this.setXp_context(4);
		if (arg == (byte)'\000') {
			this.setXp_pattern(arg);
			return /*Error: Unsupported expression*/;
		} 
		p = arg + /*Error: Function owner not recognized*/strlen((byte)(arg)) - 1;
		if (p == (byte)' ' && (p - 1) != (byte)'\\') {
			this.setXp_pattern(p + 1);
			return /*Error: Unsupported expression*/;
		} 
		while (p > arg) {
			s = p;
			if (p == (byte)' ' || p == /* count number of backslashes before ' ' or ',' */(byte)',') {
				while (s > arg && (s - 1) == (byte)'\\') {
					--s;
				}
			} 
			if (p == (byte)' ' && ((p - s) & 1) == /* break at a space with an even number of backslashes */0) {
				++p;
				break;
			} 
			--p;
		}
		if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("no"), (size_t)(true)) == 0 && /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("novice"), (size_t)(true)) != 0) {
			this.setXp_context(5);
			p += 2;
		} 
		if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("inv"), (size_t)(true)) == 0) {
			this.setXp_context(5);
			p += 3;
		} 
		this.setXp_pattern(arg = p);
		if (arg == (byte)'<') {
			while (p != (byte)'>') {
				if (p++ == /* expand terminal option name */(byte)'\000') {
					return /*Error: Unsupported expression*/;
				} 
			}
			key = ModernizedCProgram.get_special_key_code(arg + 1);
			if (key == /* unknown name */0) {
				this.setXp_context(0);
				return /*Error: Unsupported expression*/;
			} 
			nextchar = ++p;
			is_term_option = 1;
			ModernizedCProgram.expand_option_name[2] = ((-(key)) & -1024);
			ModernizedCProgram.expand_option_name[3] = (((int)(-(key)) >> 8) & -1024);
		} else {
				if (p[0] == (byte)'t' && p[1] == (byte)'_') {
					p += 2;
					if (p != (byte)'\000') {
						++p;
					} 
					if (p == (byte)'\000') {
						return /*Error: Unsupported expression*/;
					} 
					nextchar = ++p;
					is_term_option = 1;
					ModernizedCProgram.expand_option_name[2] = p[-2];
					ModernizedCProgram.expand_option_name[3] = p[-1];
				} else {
						while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10)) || p == (byte)'_' || p == /* Allow * wildcard */(byte)'*') {
							p++;
						}
						if (p == (byte)'\000') {
							return /*Error: Unsupported expression*/;
						} 
						nextchar = p;
						p = (byte)'\000';
						opt_idx = ModernizedCProgram.findoption(arg);
						p = nextchar;
						if (opt_idx == -1 || ModernizedCProgram.options[opt_idx].getVar() == ((Object)0)) {
							this.setXp_context(0);
							return /*Error: Unsupported expression*/;
						} 
						flags = ModernizedCProgram.options[opt_idx].getFlags();
						if (flags & -1024) {
							this.setXp_context(0);
							return /*Error: Unsupported expression*/;
						} 
				} 
		} 
		if ((nextchar == (byte)'-' || nextchar == (byte)'+' || nextchar == (byte)'^') && p[1] == /* handle "-=" and "+=" */(byte)'=') {
			++p;
			nextchar = (byte)'=';
		} 
		int generatedXp_context = this.getXp_context();
		if ((nextchar != (byte)'=' && nextchar != (byte)':') || generatedXp_context == 5) {
			this.setXp_context((true));
			return /*Error: Unsupported expression*/;
		} 
		if (generatedXp_context != 5 && p[1] == (byte)'\000') {
			this.setXp_context(7);
			if (is_term_option) {
				ModernizedCProgram.expand_option_idx = -1;
			} else {
					ModernizedCProgram.expand_option_idx = opt_idx;
			} 
			this.setXp_pattern(p + 1);
			return /*Error: Unsupported expression*/;
		} 
		this.setXp_context(0);
		if (is_term_option || (flags & -1024)) {
			return /*Error: Unsupported expression*/;
		} 
		this.setXp_pattern(p + 1);
		if (flags & -1024) {
			p = ModernizedCProgram.options[opt_idx].getVar();
			if (p == (char_u)ModernizedCProgram.p_bdir || p == (char_u)ModernizedCProgram.p_dir || p == (char_u)ModernizedCProgram.p_path || p == (char_u)ModernizedCProgram.p_pp || p == (char_u)ModernizedCProgram.p_rtp || p == (char_u)p_cdpath || p == (char_u)p_vdir) {
				this.setXp_context(3);
				if (p == (char_u)ModernizedCProgram.p_path || p == (char_u)p_cdpath) {
					this.setXp_backslash(2);
				} else {
						this.setXp_backslash(1);
				} 
			} else {
					this.setXp_context(2);
					if (p == (char_u)/* for 'tags' need three backslashes for a space */ModernizedCProgram.p_tags) {
						this.setXp_backslash(2);
					} else {
							this.setXp_backslash(1);
					} 
			} 
		} 
		Object[] generatedXp_pattern = this.getXp_pattern();
		int generatedXp_backslash = this.getXp_backslash();
		for (p = arg + /*Error: Function owner not recognized*/strlen((byte)(arg)) - 1; p > generatedXp_pattern; --/* For an option that is a list of file names, find the start of the
		     * last file name. */p) {
			if (p == (byte)' ' || p == /* count number of backslashes before ' ' or ',' */(byte)',') {
				s = p;
				while (s > generatedXp_pattern && (s - 1) == (byte)'\\') {
					--s;
				}
				if ((p == (byte)' ' && (generatedXp_backslash == 2 && (p - s) < 3)) || (p == (byte)',' && (flags & -1024) && ((p - s) & 1) == 0)) {
					this.setXp_pattern(p + 1);
					break;
				} 
			} 
			if (ModernizedCProgram.options[opt_idx].getVar() == (char_u)/* for 'spellsuggest' start at "file:" */p_sps && /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("file:"), (size_t)(true)) == 0) {
				this.setXp_pattern(p + 5);
				break;
			} 
		}
		return /*Error: Unsupported expression*/;
	}
	public Object set_context_in_map_cmd(Object cmd, Object arg, int forceit, int isabbrev, int isunmap, CMD_index cmdidx) {
		// TRUE if abbreviation// TRUE if unmap/unabbrev commandif (forceit && cmdidx != CMD_index.CMD_map && cmdidx != CMD_index.CMD_unmap) {
			this.setXp_context(0);
		} else {
				if (isunmap) {
					ModernizedCProgram.expand_mapmodes = ModernizedCProgram.get_map_mode(cmd, forceit || isabbrev);
				} else {
						ModernizedCProgram.expand_mapmodes = -1024 + -1024;
						if (!isabbrev) {
							ModernizedCProgram.expand_mapmodes += -1024 + -1024 + -1024 + -1024;
						} 
				} 
				ModernizedCProgram.expand_isabbrev = isabbrev;
				this.setXp_context(16);
				ModernizedCProgram.expand_buffer = 0;
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<buffer>"), (size_t)(true)) == 0) {
						ModernizedCProgram.expand_buffer = 1;
						arg = ModernizedCProgram.skipwhite(arg + 8);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<unique>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 8);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<nowait>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 8);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<silent>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 8);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<special>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 9);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<script>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 8);
						continue;
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<expr>"), (size_t)(true)) == 0) {
						arg = ModernizedCProgram.skipwhite(arg + 6);
						continue;
					} 
					break;
				}
				this.setXp_pattern(arg);
		} 
		return ((Object)0/*
		 * Find all mapping/abbreviation names that match regexp "regmatch"'.
		 * For command line expansion of ":[un]map" and ":[un]abbrev" in all modes.
		 * Return OK if matches found, FAIL otherwise.
		 */);
	}
	// TRUE if '!' given
	public Object set_context_in_user_cmd(Object arg_in) {
		char_u arg = arg_in;
		char_u p = new char_u();
		// Check for attributeswhile (arg == (byte)'-') {
			arg++;
			p = ModernizedCProgram.skiptowhite(arg);
			if (p == (byte)'\000') {
				p = ModernizedCProgram.vim_strchr(arg, (byte)'=');
				if (p == ((Object)0)) {
					this.setXp_context(23);
					this.setXp_pattern(arg);
					return ((Object)0);
				} 
				if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("complete"), (size_t)(p - arg)) == 0) {
					this.setXp_context(25);
					this.setXp_pattern(p + 1);
					return ((Object)0);
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("nargs"), (size_t)(p - arg)) == 0) {
					this.setXp_context(24);
					this.setXp_pattern(p + 1);
					return ((Object)0);
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("addr"), (size_t)(p - arg)) == 0) {
					this.setXp_context(44);
					this.setXp_pattern(p + 1);
					return ((Object)0);
				} 
				return ((Object)0);
			} 
			arg = ModernizedCProgram.skipwhite(p);
		}
		// After the attributes comes the new command name// After the attributes comes the new command namep = ModernizedCProgram.skiptowhite(arg);
		if (p == (byte)'\000') {
			this.setXp_context(22);
			this.setXp_pattern(arg);
			return ((Object)0);
		} 
		// And finally comes a normal commandreturn ModernizedCProgram.skipwhite(p);
	}
	public Object get_user_commands(int idx) {
		file_buffer generatedW_buffer = prevwin.getW_buffer();
		// In cmdwin, the alternative buffer should be used.buf_T buf = (cmdwin_type != 0 && ModernizedCProgram.get_cmdline_type() == (byte)'\000') ? generatedW_buffer : curbuf;
		growarray generatedB_ucmds = buf.getB_ucmds();
		int generatedGa_len = generatedB_ucmds.getGa_len();
		Object generatedGa_data = (generatedB_ucmds).getGa_data();
		if (idx < generatedGa_len) {
			return (((ucmd_T)(generatedGa_data))[idx]).getUc_name();
		} 
		idx -= generatedGa_len;
		if (idx < generatedGa_len) {
			return (((ucmd_T)(generatedGa_data))[idx]).getUc_name();
		} 
		return ((Object)0/*
		 * Function given to ExpandGeneric() to obtain the list of user address type
		 * names.
		 */);
	}
	public Object get_user_cmd_addr_type(int idx) {
		return (char_u)addr_type_complete[idx].getName();
	}
	public Object get_user_cmd_flags(int idx) {
		byte[] user_cmd_flags = new byte[]{"addr", "bang", "bar", "buffer", "complete", "count", "nargs", "range", "register"};
		if (idx >= (int)(/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/)) {
			return ((Object)0);
		} 
		return (char_u)user_cmd_flags[idx/*
		 * Function given to ExpandGeneric() to obtain the list of values for -nargs.
		 */];
	}
	public Object get_user_cmd_nargs(int idx) {
		byte[] user_cmd_nargs = new byte[]{"0", "1", "*", "?", "+"};
		if (idx >= (int)(/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/)) {
			return ((Object)0);
		} 
		return (char_u)user_cmd_nargs[idx/*
		 * Function given to ExpandGeneric() to obtain the list of values for
		 * -complete.
		 */];
	}
	public Object get_user_cmd_complete(int idx) {
		return (char_u)command_complete[idx].getName();
	}
	public void ExpandEscape(Object[] str, int numfiles, Object[][] files, int options) {
		int i;
		char_u p = new char_u();
		// May change home directory back to "~"if (options & -1024) {
			ModernizedCProgram.tilde_replace(str, numfiles, files);
		} 
		int generatedXp_context = this.getXp_context();
		int generatedXp_backslash = this.getXp_backslash();
		if (options & -1024) {
			if (generatedXp_context == 2 || generatedXp_context == 38 || generatedXp_context == 32 || generatedXp_context == 9 || generatedXp_context == 3) {
				for (i = 0; i < numfiles; ++i) {
					if (generatedXp_backslash == 2) {
						p = ModernizedCProgram.vim_strsave_escaped(files[i], (char_u)" ");
						if (p != ((Object)0)) {
							ModernizedCProgram.vim_free(files[i]);
							files[i] = p;
							p = ModernizedCProgram.vim_strsave_escaped(files[i], (char_u)" ");
							if (p != ((Object)0)) {
								ModernizedCProgram.vim_free(files[i]);
								files[i] = p;
							} 
						} 
					} 
					p = ModernizedCProgram.vim_strsave_fnameescape(files[i], 0);
					if (p != ((Object)0)) {
						ModernizedCProgram.vim_free(files[i]);
						files[i] = p;
					} 
					if (str[0] == (byte)'\\' && str[1] == (byte)'~' && files[i][0] == (byte)'~') {
						ModernizedCProgram.escape_fname(files[i]);
					} 
				}
				this.setXp_backslash(0);
				if (files[0] == (byte)'+') {
					ModernizedCProgram.escape_fname(files[0]);
				} 
			}  else if (generatedXp_context == 6) {
				for (i = 0; i < numfiles; ++i) {
					p = ModernizedCProgram.vim_strsave_escaped(files[i], (char_u)"\\|\"");
					if (p != ((Object)0)) {
						ModernizedCProgram.vim_free(files[i]);
						files[i] = p;
					} 
				}
			} 
		} 
	}
	/*
	 * Return FAIL if this is not an appropriate context in which to do
	 * completion of anything, return OK if it is (even if there are no matches).
	 * For the caller, this means that the character is just passed through like a
	 * normal character (instead of being expanded).  This allows :s/^I^D etc.
	 */
	public int nextwild(int type, int options, int escape) {
		// extra options for ExpandOne()// if TRUE, escape the returned matchescmdline_info_T ccline = ModernizedCProgram.get_cmdline_info();
		int i;
		int j;
		char_u p1 = new char_u();
		char_u p2 = new char_u();
		int difflen;
		int v;
		int generatedXp_numfiles = this.getXp_numfiles();
		if (generatedXp_numfiles == -1) {
			xp.set_expand_context();
			ModernizedCProgram.cmd_showtail = xp.expand_showtail();
		} 
		int generatedXp_context = this.getXp_context();
		if (generatedXp_context == (true)) {
			ModernizedCProgram.beep_flush();
			return 1;
		} 
		if (generatedXp_context == 0) {
			return 0;
		} 
		// show that we are busy// show that we are busyModernizedCProgram.msg_puts("...");
		ModernizedCProgram.out_flush();
		Object[] generatedXp_pattern = this.getXp_pattern();
		Object generatedCmdbuff = ccline.getCmdbuff();
		i = (int)(generatedXp_pattern - generatedCmdbuff);
		Object generatedCmdpos = ccline.getCmdpos();
		this.setXp_pattern_len(generatedCmdpos - i);
		int generatedXp_pattern_len = this.getXp_pattern_len();
		if (type == 4 || type == 5) {
			p2 = xp.ExpandOne(((Object)0), ((Object)0), 0, type);
		} else {
				if ((p1 = ModernizedCProgram.addstar(generatedXp_pattern, generatedXp_pattern_len, generatedXp_context)) == ((Object)0)) {
					p2 = ((Object)0);
				} else {
						int use_options = options | -1024 | -1024 | -1024;
						if (escape) {
							use_options |=  -1024;
						} 
						if (ModernizedCProgram.p_wic) {
							use_options += -1024;
						} 
						p2 = xp.ExpandOne(p1, ModernizedCProgram.vim_strnsave(generatedCmdbuff[i], generatedXp_pattern_len), use_options, type);
						ModernizedCProgram.vim_free(p1);
						if (p2 != ((Object)0) && type == 7) {
							for (j = 0; j < generatedXp_pattern_len; ++j) {
								if (generatedCmdbuff[i + j] == (byte)'*' || generatedCmdbuff[i + j] == (byte)'?') {
									break;
								} 
							}
							if ((int)/*Error: Function owner not recognized*/strlen((byte)(p2)) < j) {
								do {
									if ((p2) != ((Object)0)) {
										ModernizedCProgram.vim_free(p2);
										(p2) = ((Object)0);
									} 
								} while (0);
							} 
						} 
				} 
		} 
		Object generatedCmdlen = ccline.getCmdlen();
		Object generatedCmdbufflen = ccline.getCmdbufflen();
		if (p2 != ((Object)0) && !got_int) {
			difflen = (int)/*Error: Function owner not recognized*/strlen((byte)(p2)) - generatedXp_pattern_len;
			if (generatedCmdlen + difflen + 4 > generatedCmdbufflen) {
				v = ModernizedCProgram.realloc_cmdbuff(generatedCmdlen + difflen + 4);
				this.setXp_pattern(generatedCmdbuff + i);
			} else {
					v = 1;
			} 
			if (v == 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedCmdbuff[generatedCmdpos + difflen]), (byte)(generatedCmdbuff[generatedCmdpos]), (size_t)((size_t)(generatedCmdlen - generatedCmdpos + 1)));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedCmdbuff[i]), (byte)(p2), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(p2))));
				generatedCmdlen += difflen;
				generatedCmdpos += difflen;
			} 
		} 
		ModernizedCProgram.vim_free(p2);
		ModernizedCProgram.redrawcmd();
		ModernizedCProgram.cursorcmd()// When expanding a ":map" command and no matches are found, assume that;// When expanding a ":map" command and no matches are found, assume that
		// the key is supposed to be inserted literallyif (generatedXp_context == 16 && p2 == ((Object)0)) {
			return 0;
		} 
		if (generatedXp_numfiles <= 0 && p2 == ((Object)0)) {
			ModernizedCProgram.beep_flush();
		}  else if (generatedXp_numfiles == 1) {
			(Object)xp.ExpandOne(((Object)0), ((Object)0), 0, 1);
		} 
		return 1/*
		 * Do wildcard expansion on the string 'str'.
		 * Chars that should not be expanded must be preceded with a backslash.
		 * Return a pointer to allocated memory containing the new string.
		 * Return NULL for failure.
		 *
		 * "orig" is the originally expanded string, copied to allocated memory.  It
		 * should either be kept in orig_save or freed.  When "mode" is WILD_NEXT or
		 * WILD_PREV "orig" should be NULL.
		 *
		 * Results are cached in xp->xp_files and xp->xp_numfiles, except when "mode"
		 * is WILD_EXPAND_FREE or WILD_ALL.
		 *
		 * mode = WILD_FREE:	    just free previously expanded matches
		 * mode = WILD_EXPAND_FREE: normal expansion, do not keep matches
		 * mode = WILD_EXPAND_KEEP: normal expansion, keep matches
		 * mode = WILD_NEXT:	    use next match in multiple match, wrap to first
		 * mode = WILD_PREV:	    use previous match in multiple match, wrap to first
		 * mode = WILD_ALL:	    return all matches concatenated
		 * mode = WILD_LONGEST:	    return longest matched part
		 * mode = WILD_ALL_KEEP:    get all matches, keep matches
		 *
		 * options = WILD_LIST_NOTFOUND:    list entries without a match
		 * options = WILD_HOME_REPLACE:	    do home_replace() for buffer names
		 * options = WILD_USE_NL:	    Use '\n' for WILD_ALL
		 * options = WILD_NO_BEEP:	    Don't beep for multiple matches
		 * options = WILD_ADD_SLASH:	    add a slash after directory names
		 * options = WILD_KEEP_ALL:	    don't remove 'wildignore' entries
		 * options = WILD_SILENT:	    don't print warning messages
		 * options = WILD_ESCAPE:	    put backslash before special chars
		 * options = WILD_ICASE:	    ignore case for files
		 *
		 * The variables xp->xp_context and xp->xp_backslash must have been set!
		 */;
	}
	public Object ExpandOne(Object str, Object orig, int options, int mode) {
		char_u ss = ((Object)0);
		int findex;
		// kept value of origchar_u orig_save = ((Object)0);
		int orig_saved = 0;
		int i;
		long_u len = new long_u();
		// number without matching suffixint non_suf_match;
		int generatedXp_numfiles = this.getXp_numfiles();
		Object[][] generatedXp_files = this.getXp_files();
		// first handle the case of using an old matchif (mode == 4 || mode == 5) {
			if (generatedXp_numfiles > 0) {
				if (mode == 5) {
					if (findex == -1) {
						findex = generatedXp_numfiles;
					} 
					--findex;
				} else {
						++findex;
				} 
				if (findex < 0) {
					if (orig_save == ((Object)0)) {
						findex = generatedXp_numfiles - 1;
					} else {
							findex = -1;
					} 
				} 
				if (findex >= generatedXp_numfiles) {
					if (orig_save == ((Object)0)) {
						findex = 0;
					} else {
							findex = -1;
					} 
				} 
				if (p_wmnu) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_redr_status_matches(xp, generatedXp_numfiles, generatedXp_files, findex, ModernizedCProgram.cmd_showtail);
				} 
				if (findex == -1) {
					return ModernizedCProgram.vim_strsave(orig_save);
				} 
				return ModernizedCProgram.vim_strsave(generatedXp_files[findex]);
			} else {
					return ((Object)0);
			} 
		} 
		// free old namesif (generatedXp_numfiles != -1 && mode != 6 && mode != 7) {
			ModernizedCProgram.FreeWild(generatedXp_numfiles, generatedXp_files);
			this.setXp_numfiles(-1);
			do {
				if ((orig_save) != ((Object)0)) {
					ModernizedCProgram.vim_free(orig_save);
					(orig_save) = ((Object)0);
				} 
			} while (0);
		} 
		findex = 0;
		// only release file nameif (mode == 1) {
			return ((Object)0);
		} 
		int generatedXp_context = this.getXp_context();
		if (generatedXp_numfiles == -1) {
			ModernizedCProgram.vim_free(orig_save);
			orig_save = orig;
			orig_saved = 1;
			if (xp.ExpandFromContext(str, generatedXp_numfiles, generatedXp_files, options) == 0) {
				if (!(options & -1024) && (options & -1024)) {
					ModernizedCProgram.semsg(((byte)(e_nomatch2)), str);
				} 
			}  else if (generatedXp_numfiles == 0) {
				if (!(options & -1024)) {
					ModernizedCProgram.semsg(((byte)(e_nomatch2)), str);
				} 
			} else {
					xp.ExpandEscape(str, generatedXp_numfiles, generatedXp_files, options);
					if (mode != 6 && mode != 8 && mode != 7) {
						if (generatedXp_numfiles) {
							non_suf_match = generatedXp_numfiles;
						} else {
								non_suf_match = 1;
						} 
						if ((generatedXp_context == 2 || generatedXp_context == 3) && generatedXp_numfiles > 1) {
							non_suf_match = 0;
							for (i = 0; i < 2; ++i) {
								if (ModernizedCProgram.match_suffix(generatedXp_files[i])) {
									++non_suf_match;
								} 
							}
						} 
						if (non_suf_match != 1) {
							if (!(options & -1024)) {
								ModernizedCProgram.emsg(((byte)(e_toomany)));
							}  else if (!(options & -1024)) {
								ModernizedCProgram.beep_flush();
							} 
						} 
						if (!(non_suf_match != 1 && mode == 2)) {
							ss = ModernizedCProgram.vim_strsave(generatedXp_files[0]);
						} 
					} 
			} 
		} 
		// Find longest common partif (mode == 7 && generatedXp_numfiles > 0) {
			int mb_len = 1;
			int c0;
			int ci;
			for (len = 0; generatedXp_files[0][len]; len += mb_len) {
				if (has_mbyte) {
					mb_len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedXp_files[0][len]);
					c0 = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedXp_files[0][len]);
				} else {
						c0 = generatedXp_files[0][len];
				} 
				for (i = 1; i < generatedXp_numfiles; ++i) {
					if (has_mbyte) {
						ci = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedXp_files[i][len]);
					} else {
							ci = generatedXp_files[i][len];
					} 
					if (ModernizedCProgram.p_fic && (generatedXp_context == 3 || generatedXp_context == 2 || generatedXp_context == 32 || generatedXp_context == 9)) {
						if (ModernizedCProgram.vim_tolower(c0) != ModernizedCProgram.vim_tolower(ci)) {
							break;
						} 
					}  else if (c0 != ci) {
						break;
					} 
				}
				if (i < generatedXp_numfiles) {
					if (!(options & -1024)) {
						ModernizedCProgram.vim_beep(-1024);
					} 
					break;
				} 
			}
			ss = ModernizedCProgram.alloc(len + 1);
			if (ss) {
				ModernizedCProgram.vim_strncpy(ss, generatedXp_files[0], (size_t)len);
			} 
			findex = -1;
		} 
		// Concatenate all matching namesif (mode == 6 && generatedXp_numfiles > 0) {
			len = 0;
			for (i = 0; i < generatedXp_numfiles; ++i) {
				len += (long_u)/*Error: Function owner not recognized*/strlen((byte)(generatedXp_files[i])) + 1;
			}
			ss = ModernizedCProgram.alloc(len);
			if (ss != ((Object)0)) {
				ss = (byte)'\000';
				for (i = 0; i < generatedXp_numfiles; ++i) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ss), (byte)(generatedXp_files[i]));
					if (i != generatedXp_numfiles - 1) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ss), (byte)((options & -1024) ? "\n" : " "));
					} 
				}
			} 
		} 
		if (mode == 2 || mode == 6) {
			xp.ExpandCleanup();
		} 
		// Free "orig" if it wasn't stored in "orig_save".if (!orig_saved) {
			ModernizedCProgram.vim_free(orig);
		} 
		return ss/*
		 * Prepare an expand structure for use.
		 */;
	}
	// allocated copy of original of expanded string
	public void ExpandInit() {
		this.setXp_pattern(((Object)0));
		this.setXp_pattern_len(0);
		this.setXp_backslash(0);
		this.setXp_numfiles(-1);
		this.setXp_files(((Object)0));
		this.setXp_arg(((Object)0));
		this.setXp_line(((Object)0/*
		 * Cleanup an expand structure after use.
		 */));
	}
	public void ExpandCleanup() {
		int generatedXp_numfiles = this.getXp_numfiles();
		Object[][] generatedXp_files = this.getXp_files();
		if (generatedXp_numfiles >= 0) {
			ModernizedCProgram.FreeWild(generatedXp_numfiles, generatedXp_files);
			this.setXp_numfiles(-1/*
			 * Show all matches for completion on the command line.
			 * Returns EXPAND_NOTHING when the character that triggered expansion should
			 * be inserted like a normal character.
			 */);
		} 
	}
	public int showmatches(int wildmenu) {
		cmdline_info_T ccline = ModernizedCProgram.get_cmdline_info();
		int num_files;
		char_u files_found = new char_u();
		int i;
		int j;
		int k;
		int maxlen;
		int lines;
		int columns;
		char_u p = new char_u();
		int lastlen;
		int attr;
		int showtail;
		int generatedXp_numfiles = this.getXp_numfiles();
		Object generatedCmdbuff = ccline.getCmdbuff();
		Object generatedCmdpos = ccline.getCmdpos();
		Object[][] generatedXp_files = this.getXp_files();
		if (generatedXp_numfiles == -1) {
			xp.set_expand_context();
			i = xp.expand_cmdline(generatedCmdbuff, generatedCmdpos, num_files, files_found);
			showtail = xp.expand_showtail();
			if (i != (true)) {
				return i;
			} 
		} else {
				num_files = generatedXp_numfiles;
				files_found = generatedXp_files;
				showtail = ModernizedCProgram.cmd_showtail;
		} 
		if (!wildmenu) {
			msg_didany = 0;
			ModernizedCProgram.msg_start();
			ModernizedCProgram.msg_putchar((byte)'\n');
			ModernizedCProgram.out_flush();
			ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
			msg_didany = 0;
			ModernizedCProgram.msg_start();
		} 
		int generatedXp_context = this.getXp_context();
		if (got_int) {
			got_int = 0;
		}  else if (wildmenu) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_redr_status_matches(xp, num_files, files_found, -1, showtail);
		} else {
				maxlen = 0;
				for (i = 0; i < num_files; ++i) {
					if (!showtail && (generatedXp_context == 2 || generatedXp_context == 32 || generatedXp_context == 9)) {
						((Object)0).home_replace(files_found[i], ModernizedCProgram.NameBuff, 1024, 1);
						j = ModernizedCProgram.vim_strsize(ModernizedCProgram.NameBuff);
					} else {
							j = ModernizedCProgram.vim_strsize((showtail ? ModernizedCProgram.sm_gettail(files_found[i]) : files_found[i]));
					} 
					if (j > maxlen) {
						maxlen = j;
					} 
				}
				if (generatedXp_context == 17) {
					lines = num_files;
				} else {
						maxlen += 2;
						columns = ((int)Columns + 2) / maxlen;
						if (columns < 1) {
							columns = 1;
						} 
						lines = (num_files + columns - 1) / columns;
				} 
				attr = ModernizedCProgram.highlight_attr[(int)(.HLF_D)];
				if (generatedXp_context == 17) {
					ModernizedCProgram.msg_puts_attr(((byte)("tagname")), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
					ModernizedCProgram.msg_clr_eos();
					ModernizedCProgram.msg_advance(maxlen - 3);
					ModernizedCProgram.msg_puts_attr(((byte)(" kind file\n")), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
				} 
				for (i = 0; i < lines; ++i) {
					lastlen = 999;
					for (k = i; k < num_files; k += lines) {
						if (generatedXp_context == 17) {
							ModernizedCProgram.msg_outtrans_attr(files_found[k], ModernizedCProgram.highlight_attr[(int)(.HLF_D)]);
							p = files_found[k] + /*Error: Function owner not recognized*/strlen((byte)(files_found[k])) + 1;
							ModernizedCProgram.msg_advance(maxlen + 1);
							ModernizedCProgram.msg_puts((byte)p);
							ModernizedCProgram.msg_advance(maxlen + 3);
							ModernizedCProgram.msg_outtrans_long_attr(p + 2, ModernizedCProgram.highlight_attr[(int)(.HLF_D)]);
							break;
						} 
						for (j = maxlen - lastlen; --j >= 0; /*Error: Unsupported expression*/) {
							ModernizedCProgram.msg_putchar((byte)' ');
						}
						if (generatedXp_context == 2 || generatedXp_context == 32 || generatedXp_context == 9) {
							if (generatedXp_numfiles != -1) {
								char_u halved_slash = new char_u();
								char_u exp_path = new char_u();
								char_u path = new char_u();
								exp_path = ModernizedCProgram.expand_env_save_opt(files_found[k], 1);
								path = exp_path != ((Object)0) ? exp_path : files_found[k];
								halved_slash = ModernizedCProgram.backslash_halve_save(path);
								j = ModernizedCProgram.mch_isdir(halved_slash != ((Object)0) ? halved_slash : files_found[k]);
								ModernizedCProgram.vim_free(exp_path);
								if (halved_slash != path) {
									ModernizedCProgram.vim_free(halved_slash);
								} 
							} else {
									j = ModernizedCProgram.mch_isdir(files_found[k]);
							} 
							if (showtail) {
								p = (showtail ? ModernizedCProgram.sm_gettail(files_found[k]) : files_found[k]);
							} else {
									((Object)0).home_replace(files_found[k], ModernizedCProgram.NameBuff, 1024, 1);
									p = ModernizedCProgram.NameBuff;
							} 
						} else {
								j = 0;
								p = (showtail ? ModernizedCProgram.sm_gettail(files_found[k]) : files_found[k]);
						} 
						lastlen = ModernizedCProgram.msg_outtrans_attr(p, j ? attr : 0);
					}
					if (ModernizedCProgram.msg_col > 0) {
						ModernizedCProgram.msg_clr_eos();
						ModernizedCProgram.msg_putchar((byte)'\n');
					} 
					ModernizedCProgram.out_flush();
					if (got_int) {
						got_int = 0;
						break;
					} 
				}
				ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
		} 
		if (generatedXp_numfiles == -1) {
			ModernizedCProgram.FreeWild(num_files, files_found);
		} 
		return (true/*
		 * Private gettail for showmatches() (and win_redr_status_matches()):
		 * Find tail of file name path, but ignore trailing "/".
		 */);
	}
	public int expand_showtail() {
		char_u s = new char_u();
		char_u end = new char_u();
		int generatedXp_context = this.getXp_context();
		// When not completing file names a "/" may mean something different.if (generatedXp_context != 2 && generatedXp_context != 32 && generatedXp_context != 3) {
			return 0;
		} 
		Object[] generatedXp_pattern = this.getXp_pattern();
		end = ModernizedCProgram.gettail(generatedXp_pattern);
		// there is no path separatorif (end == generatedXp_pattern) {
			return 0;
		} 
		for (s = generatedXp_pattern; s < end; s++) {
			if (ModernizedCProgram.rem_backslash(s)) {
				++s;
			}  else if (ModernizedCProgram.vim_strchr((char_u)"*?[", s) != ((Object)0)) {
				return 0;
			} 
		}// Skip escaped wildcards.  Only when the backslash is not a path
		return 1/*
		 * Prepare a string for expansion.
		 * When expanding file names: The string will be used with expand_wildcards().
		 * Copy "fname[len]" into allocated memory and add a '*' at the end.
		 * When expanding other names: The string will be used with regcomp().  Copy
		 * the name into allocated memory and prepend "^".
		 */;
	}
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * cmdexpand.c: functions for command-line completion
	 */
	// Only show path tail in lists ?
	public void set_expand_context() {
		cmdline_info_T ccline = ModernizedCProgram.get_cmdline_info();
		Object generatedCmdfirstc = ccline.getCmdfirstc();
		Object generatedInput_fn = ccline.getInput_fn();
		// only expansion for ':', '>' and '=' command-linesif (generatedCmdfirstc != (byte)':' && generatedCmdfirstc != (byte)'>' && generatedCmdfirstc != (byte)'=' && !generatedInput_fn) {
			this.setXp_context(0);
			return /*Error: Unsupported expression*/;
		} 
		Object generatedCmdbuff = ccline.getCmdbuff();
		Object generatedCmdlen = ccline.getCmdlen();
		Object generatedCmdpos = ccline.getCmdpos();
		xp.set_cmd_context(generatedCmdbuff, generatedCmdlen, generatedCmdpos, 1/*
		 * This is all pretty much copied from do_one_cmd(), with all the extra stuff
		 * we don't need/want deleted.	Maybe this could be done better if we didn't
		 * repeat all this stuff.  The only problem is that they may not stay
		 * perfectly compatible with each other, but then the command line syntax
		 * probably won't change that much -- webb.
		 */);
	}
	public Object set_one_cmd_context(Object buff) {
		// buffer for command stringchar_u p = new char_u();
		char_u cmd = new char_u();
		char_u arg = new char_u();
		int len = 0;
		exarg_T ea = new exarg_T();
		int compl = 0;
		int delim;
		int forceit = 0;
		// filter instead of file nameint usefilter = 0;
		xp.ExpandInit();
		this.setXp_pattern(buff);
		// Default until we get past command// Default until we get past commandthis.setXp_context(1);
		ea.setArgt(0);
		// 1. skip comment lines and leading space, colons or barsfor (cmd = buff; ModernizedCProgram.vim_strchr((char_u)" \t:|", cmd) != ((Object)0); cmd++) {
			;
		}
		this.setXp_pattern(cmd);
		if (cmd == (byte)'\000') {
			return ((Object)0);
		} 
		// ignore comment linesif (cmd == (byte)'"') {
			this.setXp_context(0);
			return ((Object)0);
		} 
		int generatedXp_context = this.getXp_context();
		// 3. Skip over the range to find the command.// 3. Skip over the range to find the command.cmd = ModernizedCProgram.skip_range(cmd, generatedXp_context);
		this.setXp_pattern(cmd);
		if (cmd == (byte)'\000') {
			return ((Object)0);
		} 
		if (cmd == (byte)'"') {
			this.setXp_context(0);
			return ((Object)0);
		} 
		if (cmd == (byte)'|' || cmd == (byte)'\n') {
			return cmd + 1;
		} 
		// - the 'k' command can directly be followed by any character, but//   do accept "keepmarks", "keepalt" and "keepjumps".// - the 's' command can be followed directly by 'c', 'g', 'i', 'I' or 'r'if (cmd == (byte)'k' && cmd[1] != (byte)'e') {
			ea.setCmdidx(CMD_index.CMD_k);
			p = cmd + 1;
		} else {
				p = cmd;
				while ((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || p == (byte)'*') {
					++p;
				}
				if (((int)(cmd[0]) - (byte)'A' < 26)) {
					while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10)) || p == (byte)'*') {
						++p;
					}
				} 
				if (cmd[0] == (byte)'p' && cmd[1] == (byte)'y' && p == cmd + 2 && p == (byte)'3') {
					++p;
					while ((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || p == (byte)'*') {
						++p;
					}
				} 
				if (p == cmd && ModernizedCProgram.vim_strchr((char_u)"@*!=><&~#", p) != ((Object)0)) {
					++p;
				} 
				len = (int)(p - cmd);
				if (len == 0) {
					this.setXp_context((true));
					return ((Object)0);
				} 
				ea.setCmdidx(ModernizedCProgram.excmd_get_cmdidx(cmd, len));
				if (cmd[0] >= (byte)'A' && cmd[0] <= (byte)'Z') {
					while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10)) || p == (byte)'*') {
						++p;
					}
				} 
		} 
		// If the cursor is touching the command, and it ends in an alpha-numeric// character, complete the command name.if (p == (byte)'\000' && ((((int)(p[-1]) - (byte)'A' < 26) || ((int)(p[-1]) - (byte)'a' < 26)) || ((int)(p[-1]) - (byte)'0' < 10))) {
			return ((Object)0);
		} 
		CMD_index generatedCmdidx = ea.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_SIZE) {
			if (cmd == (byte)'s' && ModernizedCProgram.vim_strchr((char_u)"cgriI", cmd[1]) != ((Object)0)) {
				ea.setCmdidx(CMD_index.CMD_substitute);
				p = cmd + 1;
			}  else if (cmd[0] >= (byte)'A' && cmd[0] <= (byte)'Z') {
				ea.setCmd(cmd);
				p = ModernizedCProgram.find_ucmd(ea, p, ((Object)0), xp, compl);
				if (p == ((Object)0)) {
					ea.setCmdidx(CMD_index.CMD_SIZE);
				} 
			} 
		} 
		if (generatedCmdidx == CMD_index.CMD_SIZE) {
			this.setXp_context((true));
			return ((Object)0);
		} 
		// Default now that we're past command// Default now that we're past commandthis.setXp_context(0);
		// forced commandsif (p == (byte)'!') {
			forceit = 1;
			++p;
		} 
		// 6. parse argumentsif (!((int)(generatedCmdidx) < 0)) {
			ea.setArgt(ModernizedCProgram.excmd_get_argt(generatedCmdidx));
		} 
		arg = ModernizedCProgram.skipwhite(p);
		if (generatedCmdidx == CMD_index.CMD_write || generatedCmdidx == CMD_index.CMD_update) {
			if (arg == (byte)'>') {
				if (++arg == (byte)'>') {
					++arg;
				} 
				arg = ModernizedCProgram.skipwhite(arg);
			}  else if (arg == (byte)'!' && generatedCmdidx == CMD_index.CMD_write) {
				++arg;
				usefilter = 1;
			} 
		} 
		if (generatedCmdidx == CMD_index.CMD_read) {
			usefilter = forceit;
			if (arg == (byte)'!') {
				++arg;
				usefilter = 1;
			} 
		} 
		if (generatedCmdidx == CMD_index.CMD_lshift || generatedCmdidx == CMD_index.CMD_rshift) {
			while (arg == cmd) {
				++arg;
			}
			arg = ModernizedCProgram.skipwhite(arg);
		} 
		long generatedArgt = ea.getArgt();
		// Does command allow "+command"?if ((generatedArgt & -1024) && !usefilter && arg == (byte)'+') {
			p = arg + 1;
			arg = ModernizedCProgram.skip_cmd_arg(arg, 0);
			if (arg == (byte)'\000') {
				return p;
			} 
			arg = ModernizedCProgram.skipwhite(arg);
		} 
		// Check for '|' to separate commands and '"' to start comments.// Don't do this for ":read !cmd" and ":write !cmd".if ((generatedArgt & -1024) && !usefilter) {
			p = arg;
			if (generatedCmdidx == CMD_index.CMD_redir && p[0] == (byte)'@' && p[1] == (byte)'"') {
				p += 2;
			} 
			while (p) {
				if (p == 22) {
					if (p[1] != (byte)'\000') {
						++p;
					} 
				}  else if ((p == (byte)'"' && !(generatedArgt & -1024)) || p == (byte)'|' || p == (byte)'\n') {
					if ((p - 1) != (byte)'\\') {
						if (p == (byte)'|' || p == (byte)'\n') {
							return p + 1;
						} 
						return ((Object)0);
					} 
				} 
				p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
			}
		} 
		if (!(generatedArgt & -1024) && arg != (byte)'\000' && ModernizedCProgram.vim_strchr((char_u)"|\"", arg) == ((Object)0)) {
			return ((Object)0);
		} 
		// Find start of last argument (argument just before cursor):// Find start of last argument (argument just before cursor):p = buff;
		this.setXp_pattern(p);
		len = (int)/*Error: Function owner not recognized*/strlen((byte)(buff));
		while (p && p < buff + len) {
			if (p == (byte)' ' || p == (byte)'\011') {
				this.setXp_pattern(++p);
			} else {
					if (p == (byte)'\\' && (p + 1) != (byte)'\000') {
						++p;
					} 
					p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
			} 
		}
		Object[] generatedXp_pattern = this.getXp_pattern();
		if (generatedArgt & -1024) {
			int c;
			int in_quote = 0;
			char_u bow = ((Object)0);
			this.setXp_pattern(ModernizedCProgram.skipwhite(arg));
			p = generatedXp_pattern;
			while (p != (byte)'\000') {
				if (has_mbyte) {
					c = /*Error: Function owner not recognized*/mb_ptr2char(p);
				} else {
						c = p;
				} 
				if (c == (byte)'\\' && p[1] != (byte)'\000') {
					++p;
				}  else if (c == (byte)'`') {
					if (!in_quote) {
						this.setXp_pattern(p);
						bow = p + 1;
					} 
					in_quote = !in_quote;
				}  else if (c == (byte)'|' || c == (byte)'\n' || c == (byte)'"' || (((c) == (byte)' ' || (c) == (byte)'\t') && (!(generatedArgt & -1024) || usefilter))) {
					len = 0;
					while (p != (byte)'\000') {
						if (has_mbyte) {
							c = /*Error: Function owner not recognized*/mb_ptr2char(p);
						} else {
								c = p;
						} 
						if (c == (byte)'`' || ModernizedCProgram.vim_isfilec_or_wc(c)) {
							break;
						} 
						if (has_mbyte) {
							len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
						} else {
								len = 1;
						} 
						p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
					}
					if (in_quote) {
						bow = p;
					} else {
							this.setXp_pattern(p);
					} 
					p -= len;
				} 
				p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
			}
			if (bow != ((Object)0) && in_quote) {
				this.setXp_pattern(bow);
			} 
			this.setXp_context(2);
			if (usefilter || generatedCmdidx == CMD_index.CMD_bang || generatedCmdidx == CMD_index.CMD_terminal) {
				if (generatedXp_pattern == ModernizedCProgram.skipwhite(arg)) {
					this.setXp_context(32);
				} 
			} 
			if (generatedXp_pattern == (byte)'$' || generatedXp_pattern == (byte)'%') {
				for (p = generatedXp_pattern + 1; p != (byte)'\000'; ++p) {
					if (!ModernizedCProgram.vim_isIDc(p)) {
						break;
					} 
				}
				if (p == (byte)'\000') {
					this.setXp_context(26);
					++generatedXp_pattern;
					if (compl != 30 && compl != 31) {
						compl = 26;
					} 
				} 
			} 
			if (generatedXp_pattern == (byte)'~') {
				for (p = generatedXp_pattern + 1; p != (byte)'\000' && p != (byte)'/'; ++p) {
					;
				}
				if (p == (byte)'\000' && p > generatedXp_pattern + 1 && ModernizedCProgram.match_user(generatedXp_pattern + 1) >= 1) {
					this.setXp_context(42);
					++generatedXp_pattern;
				} 
			} 
		} 
		// 6. Switch on command name.switch (generatedCmdidx) {
		case CMD_index.CMD_keepalt:
		case CMD_index.CMD_noremap:
		case CMD_index.CMD_unmap:
		case CMD_index.CMD_vmap:
		case CMD_index.CMD_lgetexpr:
				xp.set_context_for_expression(arg, generatedCmdidx);
				break;
		case CMD_index.CMD_bunload:
				while ((this.setXp_pattern(ModernizedCProgram.vim_strchr(arg, (byte)' '))) != ((Object)0)) {
					arg = generatedXp_pattern + 1;
				}
		case CMD_index.CMD_filter:
				if (arg != (byte)'\000') {
					arg = ModernizedCProgram.skip_vimgrep_pat(arg, ((Object)0), ((Object)0));
				} 
				if (arg == ((Object)0) || arg == (byte)'\000') {
					this.setXp_context(0);
					return ((Object)0);
				} 
				return ModernizedCProgram.skipwhite(arg);
		case CMD_index.CMD_dsearch:
		case CMD_index.CMD_menu:
		case CMD_index.CMD_tlunmenu:
		case CMD_index.CMD_lmap:
		case CMD_index.CMD_setlocal:
				xp.set_context_in_set_cmd(arg, 4);
				break;
		case CMD_index.CMD_syntax:
				xp.set_context_in_syntax_cmd(arg);
				break;
		case CMD_index.CMD_USER_BUF:
				if (compl != 0) {
					if (!(generatedArgt & -1024)) {
						if (compl == 11) {
							return xp.set_context_in_menu_cmd(cmd, arg, forceit);
						} 
						if (compl == 1) {
							return arg;
						} 
						if (compl == 16) {
							return xp.set_context_in_map_cmd((char_u)"map", arg, forceit, 0, 0, CMD_index.CMD_map);
						} 
						p = arg;
						while (p) {
							if (p == (byte)' ') {
								arg = p + 1;
							}  else if (p == (byte)'\\' && (p + 1) != (byte)'\000') {
								++p;
							} 
							p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
						}
						this.setXp_pattern(arg);
					} 
					this.setXp_context(compl);
				} 
				break;
		case CMD_index.CMD_smap:
		case CMD_index.CMD_noremenu:
		case CMD_index.CMD_lfdo:
		case CMD_index.CMD_language:
				p = ModernizedCProgram.skiptowhite(arg);
				if (p == (byte)'\000') {
					this.setXp_context(27);
					this.setXp_pattern(arg);
				} else {
						if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("messages"), (size_t)(p - arg)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("ctype"), (size_t)(p - arg)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("time"), (size_t)(p - arg)) == 0) {
							this.setXp_context(40);
							this.setXp_pattern(ModernizedCProgram.skipwhite(p));
						} else {
								this.setXp_context(0);
						} 
				} 
				break;
		case CMD_index.CMD_nmenu:
		case CMD_index.CMD_iunabbrev:
				return xp.set_context_in_map_cmd(cmd, arg, forceit, 1, 1, generatedCmdidx);
		case CMD_index.CMD_topleft:
		case CMD_index.CMD_keeppatterns:
		case CMD_index.CMD_keepmarks:
		case CMD_index.CMD_djump:
		case CMD_index.CMD_noswapfile:
		case CMD_index.CMD_return:
		case CMD_index.CMD_sign:
				xp.set_context_in_sign_cmd(arg);
				break;
		case CMD_index.CMD_while:
		case CMD_index.CMD_setglobal:
				xp.set_context_in_set_cmd(arg, 2);
				break;
		case CMD_index.CMD_echoerr:
		case CMD_index.CMD_bwipeout:
		case CMD_index.CMD_vmapclear:
		case CMD_index.CMD_aboveleft:
		case CMD_index.CMD_windo:
				return arg;
		case CMD_index.CMD_xmapclear:
				this.setXp_context(47);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_tselect:
		case CMD_index.CMD_tchdir:
		case CMD_index.CMD_stag:
		case CMD_index.CMD_and:
		case CMD_index.CMD_checktime:
				this.setXp_context(9);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_inoremap:
		case CMD_index.CMD_sfind:
		case CMD_index.CMD_cd:
		case CMD_index.CMD_lmapclear:
		case CMD_index.CMD_chdir:
		case CMD_index.CMD_tlnoremenu:
		case CMD_index.CMD_ilist:
		case CMD_index.CMD_cmap:
		case CMD_index.CMD_cmapclear:
		case CMD_index.CMD_debug:
		case CMD_index.CMD_inoreabbrev:
				return xp.set_context_in_map_cmd(cmd, arg, forceit, 1, 0, generatedCmdidx);
		case CMD_index.CMD_ltag:
		case CMD_index.CMD_tab:
		case CMD_index.CMD_omenu:
		case CMD_index.CMD_bufdo:
		case CMD_index.CMD_map:
		case CMD_index.CMD_echomsg:
		case CMD_index.CMD_nmap:
		case CMD_index.CMD_messages:
				this.setXp_context(46);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_iabbrev:
		case CMD_index.CMD_echohl:
				xp.set_context_in_echohl_cmd(arg);
				break;
		case CMD_index.CMD_cnoreabbrev:
		case CMD_index.CMD_tunmenu:
		case CMD_index.CMD_ldo:
		case CMD_index.CMD_nnoremap:
		case CMD_index.CMD_for:
		case CMD_index.CMD_botright:
		case CMD_index.CMD_nunmenu:
		case CMD_index.CMD_tabfind:
				if (generatedXp_context == 2) {
					this.setXp_context(38);
				} 
				break;
		case CMD_index.CMD_echo:
		case CMD_index.CMD_laddexpr:
		case CMD_index.CMD_lcd:
		case CMD_index.CMD_ptselect:
		case CMD_index.CMD_anoremenu:
		case CMD_index.CMD_imap:
		case CMD_index.CMD_unlet:
				while ((this.setXp_pattern(ModernizedCProgram.vim_strchr(arg, (byte)' '))) != ((Object)0)) {
					arg = generatedXp_pattern + 1;
				}
				this.setXp_context(15);
				this.setXp_pattern(arg);
				if (generatedXp_pattern == (byte)'$') {
					this.setXp_context(26);
					++generatedXp_pattern;
				} 
				break;
		case CMD_index.CMD_ounmap:
		case CMD_index.CMD_hide:
		case CMD_index.CMD_lunmap:
		case CMD_index.CMD_caddexpr:
		case CMD_index.CMD_ownsyntax:
				this.setXp_context(39);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_tmapclear:
		case CMD_index.CMD_leftabove:
		case CMD_index.CMD_cnoremap:
		case CMD_index.CMD_behave:
				this.setXp_context(36);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_autocmd:
				return xp.set_context_in_autocmd(arg, 0);
		case CMD_index.CMD_packadd:
				this.setXp_context(45);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_nunmap:
		case CMD_index.CMD_unabbreviate:
		case CMD_index.CMD_delcommand:
				this.setXp_context(22);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_cunmenu:
		case CMD_index.CMD_emenu:
				return xp.set_context_in_menu_cmd(cmd, arg, forceit);
		case CMD_index.CMD_xunmap:
				return xp.set_context_in_map_cmd(cmd, arg, forceit, 0, 1, generatedCmdidx);
		case CMD_index.CMD_lchdir:
				if (generatedXp_context == 2) {
					this.setXp_context(3);
				} 
				break;
		case CMD_index.CMD_isplit:
		case CMD_index.CMD_highlight:
				xp.set_context_in_highlight_cmd(arg);
				break;
		case CMD_index.CMD_let:
		case CMD_index.CMD_vunmenu:
		case CMD_index.CMD_argdo:
		case CMD_index.CMD_cabbrev:
		case CMD_index.CMD_imenu:
		case CMD_index.CMD_tag:
		case CMD_index.CMD_doautocmd:
		case CMD_index.CMD_echon:
		case CMD_index.CMD_function:
		case CMD_index.CMD_cgetexpr:
		case CMD_index.CMD_sandbox:
		case CMD_index.CMD_if:
		case CMD_index.CMD_nmapclear:
		case CMD_index.CMD_browse:
		case CMD_index.CMD_set:
				xp.set_context_in_set_cmd(arg, 0);
				break;
		case CMD_index.CMD_vnoremenu:
		case CMD_index.CMD_profile:
				xp.set_context_in_profile_cmd(arg);
				break;
		case CMD_index.CMD_xnoremap:
				return xp.set_context_in_map_cmd(cmd, arg, forceit, 0, 0, generatedCmdidx);
		case CMD_index.CMD_vnoremap:
		case CMD_index.CMD_psearch:
		case CMD_index.CMD_delfunction:
				this.setXp_context(19);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_cmenu:
		case CMD_index.CMD_tjump:
		case CMD_index.CMD_inoremenu:
		case CMD_index.CMD_tunmap:
		case CMD_index.CMD_global:
		case CMD_index.CMD_ounmenu:
		case CMD_index.CMD_cnoremenu:
		case CMD_index.CMD_xmap:
		case CMD_index.CMD_ijump:
		case CMD_index.CMD_imapclear:
		case CMD_index.CMD_iunmap:
		case CMD_index.CMD_USER:
		case CMD_index.CMD_augroup:
				this.setXp_context(14);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_dlist:
		case CMD_index.CMD_isearch:
		case CMD_index.CMD_tnoremap:
		case CMD_index.CMD_popup:
		case CMD_index.CMD_setfiletype:
				this.setXp_context(37);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_tcd:
		case CMD_index.CMD_verbose:
		case CMD_index.CMD_call:
		case CMD_index.CMD_tmap:
		case CMD_index.CMD_command:
				return xp.set_context_in_user_cmd(arg);
		case CMD_index.CMD_elseif:
		case CMD_index.CMD_find:
		case CMD_index.CMD_amenu:
		case CMD_index.CMD_vertical:
		case CMD_index.CMD_nnoremenu:
		case CMD_index.CMD_iunmenu:
		case CMD_index.CMD_folddoclosed:
		case CMD_index.CMD_belowright:
		case CMD_index.CMD_confirm:
		case CMD_index.CMD_omapclear:
		case CMD_index.CMD_syntime:
				this.setXp_context(43);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_cfdo:
		case CMD_index.CMD_lnoremap:
		case CMD_index.CMD_stjump:
		case CMD_index.CMD_colorscheme:
				this.setXp_context(28);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_sbuffer:
		case CMD_index.CMD_lexpr:
		case CMD_index.CMD_buffer:
		case CMD_index.CMD_aunmenu:
		case CMD_index.CMD_help:
				this.setXp_context(8);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_cunmap:
		case CMD_index.CMD_execute:
		case CMD_index.CMD_abbreviate:
		case CMD_index.CMD_ptag:
		case CMD_index.CMD_tabdo:
		case CMD_index.CMD_match:
				if (arg == (byte)'\000' || !ModernizedCProgram.ends_excmd(arg)) {
					xp.set_context_in_echohl_cmd(arg);
					arg = ModernizedCProgram.skipwhite(ModernizedCProgram.skiptowhite(arg));
					if (arg != (byte)'\000') {
						this.setXp_context(0);
						arg = ModernizedCProgram.skip_regexp(arg + 1, arg, ModernizedCProgram.p_magic, ((Object)0));
					} 
				} 
				return ModernizedCProgram.find_nextcmd(arg);
		case CMD_index.CMD_silent:
		case CMD_index.CMD_history:
				this.setXp_context(41);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_substitute:
				delim = arg;
				if (delim) {
					++arg;
					arg = ModernizedCProgram.skip_regexp(arg, delim, ModernizedCProgram.p_magic, ((Object)0));
				} 
				while (arg[0] != (byte)'\000' && arg[0] != delim) {
					if (arg[0] == (byte)'\\' && arg[1] != (byte)'\000') {
						++arg;
					} 
					++arg;
				}
				if (arg[0] != (byte)'\000') {
					++arg;
				} 
				while (arg[0] && ModernizedCProgram.vim_strchr((char_u)"|\"#", arg[0]) == ((Object)0)) {
					++arg;
				}
				if (arg[0] != (byte)'\000') {
					return arg;
				} 
				break;
		case CMD_index.CMD_dsplit:
				arg = ModernizedCProgram.skipwhite(ModernizedCProgram.skipdigits(arg));
				if (arg == (byte)'/') {
					for (++arg; arg && arg != (byte)'/'; arg++) {
						if (arg == (byte)'\\' && arg[1] != (byte)'\000') {
							arg++;
						} 
					}
					if (arg) {
						arg = ModernizedCProgram.skipwhite(arg + 1);
						if (arg && ModernizedCProgram.vim_strchr((char_u)"|\"\n", arg) == ((Object)0)) {
							this.setXp_context(0);
						} else {
								return arg;
						} 
					} 
				} 
				break;
		case CMD_index.CMD_argdelete:
				while ((this.setXp_pattern(ModernizedCProgram.vim_strchr(arg, (byte)' '))) != ((Object)0)) {
					arg = generatedXp_pattern + 1;
				}
				this.setXp_context(48);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_sunmap:
		case CMD_index.CMD_cunabbrev:
		case CMD_index.CMD_omap:
		case CMD_index.CMD_ptjump:
				if (ModernizedCProgram.p_wop != (byte)'\000') {
					this.setXp_context(17);
				} else {
						this.setXp_context(6);
				} 
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_cexpr:
		case CMD_index.CMD_vunmap:
		case CMD_index.CMD_onoremenu:
		case CMD_index.CMD_compiler:
				this.setXp_context(29);
				this.setXp_pattern(arg);
				break;
		case CMD_index.CMD_mapclear:
		case CMD_index.CMD_noreabbrev:
		case CMD_index.CMD_stselect:
		case CMD_index.CMD_smapclear:
		case CMD_index.CMD_snoremap:
		case CMD_index.CMD_tmenu:
		case CMD_index.CMD_noautocmd:
		case CMD_index.CMD_vglobal:
				delim = arg;
				if (delim) {
					++arg;
				} 
				while (arg[0] != (byte)'\000' && arg[0] != delim) {
					if (arg[0] == (byte)'\\' && arg[1] != (byte)'\000') {
						++arg;
					} 
					++arg;
				}
				if (arg[0] != (byte)'\000') {
					return arg + 1;
				} 
				break;
		case CMD_index.CMD_cdo:
		case CMD_index.CMD_bdelete:
		case CMD_index.CMD_vmenu:
		case CMD_index.CMD_unmenu:
		case CMD_index.CMD_rightbelow:
		case CMD_index.CMD_tearoff:
		case CMD_index.CMD_lockmarks:
		case CMD_index.CMD_doautoall:
				return xp.set_context_in_autocmd(arg, 1);
		case CMD_index.CMD_onoremap:
		case CMD_index.CMD_tlmenu:
		case CMD_index.CMD_keepjumps:
		case CMD_index.CMD_folddoopen:
		default:
				break;
		}
		return ((Object)0);
	}
	public void set_cmd_context(Object[] str, int len, int col, int use_ccline) {
		// position of cursor// use ccline for infocmdline_info_T ccline = ModernizedCProgram.get_cmdline_info();
		int old_char = (byte)'\000';
		char_u nextcomm = new char_u();
		// Avoid a UMR warning from Purify, only save the character if it has been
		// written before.if (col < len) {
			old_char = str[col];
		} 
		str[col] = (byte)'\000';
		nextcomm = str;
		Object generatedCmdfirstc = ccline.getCmdfirstc();
		Object generatedInput_fn = ccline.getInput_fn();
		Object generatedXp_context = ccline.getXp_context();
		Object generatedCmdbuff = ccline.getCmdbuff();
		Object generatedXp_arg = ccline.getXp_arg();
		if (use_ccline && generatedCmdfirstc == (byte)'=') {
			xp.set_context_for_expression(str, CMD_index.CMD_SIZE);
		}  else if (use_ccline && generatedInput_fn) {
			this.setXp_context(generatedXp_context);
			this.setXp_pattern(generatedCmdbuff);
			this.setXp_arg(generatedXp_arg);
		} else {
				while (nextcomm != ((Object)0)) {
					nextcomm = xp.set_one_cmd_context(nextcomm);
				}
		} 
		// easily.// easily.this.setXp_line(str);
		this.setXp_col(col);
		str[col] = old_char/*
		 * Expand the command line "str" from context "xp".
		 * "xp" must have been set by set_cmd_context().
		 * xp->xp_pattern points into "str", to where the text that is to be expanded
		 * starts.
		 * Returns EXPAND_UNSUCCESSFUL when there is something illegal before the
		 * cursor.
		 * Returns EXPAND_NOTHING when there is nothing to expand, might insert the
		 * key that triggered expansion literally.
		 * Returns EXPAND_OK otherwise.
		 */;
	}
	// start of command line
	// length of command line (excl. NUL)
	public int expand_cmdline(Object str, int col, Integer matchcount, Object matches) {
		// return: nr of matches// return: array of pointers to matcheschar_u file_str = ((Object)0);
		int options = -1024 | -1024;
		int generatedXp_context = this.getXp_context();
		if (generatedXp_context == (true)) {
			ModernizedCProgram.beep_flush();
			return (true);
		} 
		if (generatedXp_context == 0) {
			return 0;
		} 
		Object[] generatedXp_pattern = this.getXp_pattern();
		// add star to file name, or convert to regexp if not exp. files.// add star to file name, or convert to regexp if not exp. files.this.setXp_pattern_len((int)(str + col - generatedXp_pattern));
		int generatedXp_pattern_len = this.getXp_pattern_len();
		file_str = ModernizedCProgram.addstar(generatedXp_pattern, generatedXp_pattern_len, generatedXp_context);
		if (file_str == ((Object)0)) {
			return (true);
		} 
		if (ModernizedCProgram.p_wic) {
			options += -1024;
		} 
		// find all files that match the descriptionif (xp.ExpandFromContext(file_str, matchcount, matches, options) == 0) {
			matchcount = 0;
			matches = ((Object)0);
		} 
		ModernizedCProgram.vim_free(file_str);
		return (true/*
		 * Cleanup matches for help tags:
		 * Remove "@ab" if the top of 'helplang' is "ab" and the language of the first
		 * tag matches it.  Otherwise remove "@en" if "en" is the only language.
		 */);
	}
	// start of command line
	// position of cursor
	/*
	 * Function given to ExpandGeneric() to obtain the possible arguments of the
	 * ":behave {mswin,xterm}" command.
	 */
	public Object get_behave_arg(int idx) {
		if (idx == 0) {
			return (char_u)"mswin";
		} 
		if (idx == 1) {
			return (char_u)"xterm";
		} 
		return ((Object)0/*
		 * Function given to ExpandGeneric() to obtain the possible arguments of the
		 * ":messages {clear}" command.
		 */);
	}
	public Object get_messages_arg(int idx) {
		if (idx == 0) {
			return (char_u)"clear";
		} 
		return ((Object)0);
	}
	public Object get_mapclear_arg(int idx) {
		if (idx == 0) {
			return (char_u)"<buffer>";
		} 
		return ((Object)0/*
		 * Do the expansion based on xp->xp_context and "pat".
		 */);
	}
	public int ExpandFromContext(Object[] pat, Integer num_file, Object file, int options) {
		// WILD_ flagsregmatch_T regmatch = new regmatch_T();
		int ret;
		int flags;
		// include directories// include directoriesflags = -1024;
		if (options & -1024) {
			flags |=  -1024;
		} 
		if (options & -1024) {
			flags |=  -1024;
		} 
		if (options & -1024) {
			flags |=  -1024;
		} 
		if (options & -1024) {
			flags |=  -1024;
		} 
		if (options & -1024) {
			flags |=  -1024;
		} 
		if (options & -1024) {
			flags |=  -1024;
		} 
		int generatedXp_context = this.getXp_context();
		int generatedXp_backslash = this.getXp_backslash();
		if (generatedXp_context == 2 || generatedXp_context == 3 || generatedXp_context == 38) {
			int free_pat = 0;
			int i;
			if (generatedXp_backslash != 0) {
				free_pat = 1;
				pat = ModernizedCProgram.vim_strsave(pat);
				for (i = 0; pat[i]; ++i) {
					if (pat[i] == (byte)'\\') {
						if (generatedXp_backslash == 2 && pat[i + 1] == (byte)'\\' && pat[i + 2] == (byte)'\\' && pat[i + 3] == (byte)' ') {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((pat + i)), (byte)((pat + i + 3)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(pat + i + 3)) + 1));
						} 
						if (generatedXp_backslash == 1 && pat[i + 1] == (byte)' ') {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((pat + i)), (byte)((pat + i + 1)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(pat + i + 1)) + 1));
						} 
					} 
				}
			} 
			if (generatedXp_context == 2) {
				flags |=  -1024;
			}  else if (generatedXp_context == 38) {
				flags |=  (-1024 | -1024);
			} else {
					flags = (flags | -1024) & ~-1024;
			} 
			if (options & -1024) {
				flags |=  -1024;
			} 
			ret = ModernizedCProgram.expand_wildcards_eval(pat, num_file, file, flags);
			if (free_pat) {
				ModernizedCProgram.vim_free(pat);
			} 
			if (p_csl[0] != (byte)'\000' && (options & -1024) == 0) {
				int i;
				for (i = 0; i < num_file; ++i) {
					char_u ptr = (file)[i];
					while (ptr != (byte)'\000') {
						if (p_csl[0] == (byte)'s' && ptr == (byte)'\\') {
							ptr = (byte)'/';
						}  else if (p_csl[0] == (byte)'b' && ptr == (byte)'/') {
							ptr = (byte)'\\';
						} 
						ptr += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr);
					}
				}
			} 
			return ret;
		} 
		file = (char_u)"";
		num_file = 0;
		if (generatedXp_context == 8) {
			if (ModernizedCProgram.find_help_tags(pat == (byte)'\000' ? (char_u)"help" : pat, num_file, file, 0) == 1) {
				ModernizedCProgram.cleanup_help_tags(num_file, file);
				return 1;
			} 
			return 0;
		} 
		// With an empty argument we would get all the help tags, which is
		if (generatedXp_context == 32) {
			return ModernizedCProgram.expand_shellcmd(pat, num_file, file, flags);
		} 
		if (generatedXp_context == 7) {
			return ModernizedCProgram.ExpandOldSetting(num_file, file);
		} 
		if (generatedXp_context == 9) {
			return ModernizedCProgram.ExpandBufnames(pat, num_file, file, options);
		} 
		if (generatedXp_context == 6 || generatedXp_context == 17) {
			return ModernizedCProgram.expand_tags(generatedXp_context == 6, pat, num_file, file);
		} 
		if (generatedXp_context == 28) {
			byte[] directories = new byte[]{"colors", ((Object)0)};
			return ModernizedCProgram.ExpandRTDir(pat, -1024 + -1024, num_file, file, directories);
		} 
		if (generatedXp_context == 29) {
			byte[] directories = new byte[]{"compiler", ((Object)0)};
			return ModernizedCProgram.ExpandRTDir(pat, 0, num_file, file, directories);
		} 
		if (generatedXp_context == 39) {
			byte[] directories = new byte[]{"syntax", ((Object)0)};
			return ModernizedCProgram.ExpandRTDir(pat, 0, num_file, file, directories);
		} 
		if (generatedXp_context == 37) {
			byte[] directories = new byte[]{"syntax", "indent", "ftplugin", ((Object)0)};
			return ModernizedCProgram.ExpandRTDir(pat, 0, num_file, file, directories);
		} 
		if (generatedXp_context == 31) {
			return xp.ExpandUserList(num_file, file);
		} 
		if (generatedXp_context == 45) {
			return ModernizedCProgram.ExpandPackAddDir(pat, num_file, file);
		} 
		regprog regprog = new regprog();
		regmatch.setRegprog(regprog.vim_regcomp(pat, ModernizedCProgram.p_magic ? 1 : 0));
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedRegprog == ((Object)0)) {
			return 0;
		} 
		// set ignore-case according to p_ic, p_scs and pat// set ignore-case according to p_ic, p_scs and patregmatch.setRm_ic(ModernizedCProgram.ignorecase(pat));
		if (generatedXp_context == 4 || generatedXp_context == 5) {
			ret = ModernizedCProgram.ExpandSettings(xp, regmatch, num_file, file);
		}  else if (generatedXp_context == 16) {
			ret = regmatch.ExpandMappings(num_file, file);
		}  else if (generatedXp_context == 30) {
			ret = ModernizedCProgram.ExpandUserDefined(xp, regmatch, num_file, file);
		} else {
				Object[] tab = new Object[]{{1, get_command_name, 0, 1}, {36, get_behave_arg, 1, 1}, {47, get_mapclear_arg, 1, 1}, {46, get_messages_arg, 1, 1}, {41, get_history_arg, 1, 1}, {22, get_user_commands, 0, 1}, {44, get_user_cmd_addr_type, 0, 1}, {23, get_user_cmd_flags, 0, 1}, {24, get_user_cmd_nargs, 0, 1}, {25, get_user_cmd_complete, 0, 1}, {15, get_user_var_name, 0, 1}, {18, get_function_name, 0, 1}, {19, get_user_func_name, 0, 1}, {20, get_expr_name, 0, 1}, {11, get_menu_name, 0, 1}, {21, get_menu_names, 0, 1}, {12, get_syntax_name, 1, 1}, {43, get_syntime_arg, 1, 1}, {13, get_highlight_name, 1, 1}, {10, get_event_name, 1, 1}, {14, get_augroup_name, 1, 1}, {34, get_sign_name, 1, 1}, {35, get_profile_name, 1, 1}, {27, get_lang_arg, 1, 0}, {40, get_locales, 1, 0}, {26, get_env_name, 1, 1}, {42, get_users, 1, 0}, {48, get_arglist_name, 1, 0}};
				int i;
				ret = 0;
				for (i = 0; i < (int)(/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/); ++i) {
					if (generatedXp_context == tab[i].getContext()) {
						if (tab[i].getIc()) {
							regmatch.setRm_ic(1);
						} 
						ret = ModernizedCProgram.ExpandGeneric(xp, regmatch, num_file, file, tab[i].getFunc(), tab[i].getEscaped());
						break;
					} 
				}
		} 
		generatedRegprog.vim_regfree();
		return ret/*
		 * Expand a list of names.
		 *
		 * Generic function for command line completion.  It calls a function to
		 * obtain strings, one by one.	The strings are matched against a regexp
		 * program.  Matching strings are copied into an array, which is returned.
		 *
		 * Returns OK when no problems encountered, FAIL for error (out of memory).
		 */;
	}
	public Object call_user_expand_func(Object user_expand_func, Integer num_file, Object file) {
		cmdline_info_T ccline = ModernizedCProgram.get_cmdline_info();
		int keep = 0;
		typval_T[] args = new typval_T();
		sctx_T save_current_sctx = current_sctx;
		char_u pat = ((Object)0);
		Object ret;
		Object generatedXp_arg = this.getXp_arg();
		Object generatedXp_line = this.getXp_line();
		if (generatedXp_arg == ((Object)0) || generatedXp_arg[0] == (byte)'\0' || generatedXp_line == ((Object)0)) {
			return ((Object)0);
		} 
		num_file = 0;
		file = ((Object)0);
		Object generatedCmdbuff = ccline.getCmdbuff();
		Object generatedCmdlen = ccline.getCmdlen();
		if (generatedCmdbuff != ((Object)0)) {
			keep = generatedCmdbuff[generatedCmdlen];
			generatedCmdbuff[generatedCmdlen] = 0;
		} 
		Object[] generatedXp_pattern = this.getXp_pattern();
		int generatedXp_pattern_len = this.getXp_pattern_len();
		pat = ModernizedCProgram.vim_strnsave(generatedXp_pattern, generatedXp_pattern_len);
		args[0].setV_type(.VAR_STRING);
		args[0].getVval().setV_string(pat);
		args[1].setV_type(.VAR_STRING);
		args[1].getVval().setV_string(generatedXp_line);
		args[2].setV_type(.VAR_NUMBER);
		int generatedXp_col = this.getXp_col();
		args[2].getVval().setV_number(generatedXp_col);
		args[3].setV_type(.VAR_UNKNOWN);
		Object generatedXp_script_ctx = this.getXp_script_ctx();
		current_sctx = generatedXp_script_ctx;
		ret = /*Error: Function owner not recognized*/user_expand_func(generatedXp_arg, 3, args);
		current_sctx = save_current_sctx;
		if (generatedCmdbuff != ((Object)0)) {
			generatedCmdbuff[generatedCmdlen] = keep;
		} 
		ModernizedCProgram.vim_free(pat);
		return ret/*
		 * Expand names with a function defined by the user.
		 */;
	}
	public int ExpandUserList(Integer num_file, Object file) {
		list_T retlist = new list_T();
		listitem_T li = new listitem_T();
		garray_T ga = new garray_T();
		retlist = xp.call_user_expand_func(call_func_retlist, num_file, file);
		if (retlist == ((Object)0)) {
			return 0;
		} 
		ga.ga_init2((int)/*Error: Unsupported expression*/, 3)// Loop over the items in the list.;// Loop over the items in the list.
		 generatedLi_tv = li.getLi_tv();
		Object generatedV_type = generatedLi_tv.getV_type();
		Object generatedVval = generatedLi_tv.getVval();
		Object generatedGa_data = ga.getGa_data();
		int generatedGa_len = ga.getGa_len();
		listitem_S generatedLi_next = li.getLi_next();
		listitem_S generatedLv_first = retlist.getLv_first();
		for (li = generatedLv_first; li != ((Object)0); li = generatedLi_next) {
			if (generatedV_type != .VAR_STRING || generatedVval.getV_string() == ((Object)0)) {
				continue;
			} 
			if (ga.ga_grow(1) == 0) {
				break;
			} 
			((char_u)generatedGa_data)[generatedGa_len] = ModernizedCProgram.vim_strsave(generatedVval.getV_string());
			++generatedGa_len;
		}
		retlist.list_unref();
		file = generatedGa_data;
		num_file = generatedGa_len;
		return 1/*
		 * Expand "file" for all comma-separated directories in "path".
		 * Adds the matches to "ga".  Caller must init "ga".
		 */;
	}
	// expand :profile sub-commands
	// expand :profile func {funcname}
	public Object get_profile_name(int idx) {
		switch (.pexpand_what) {
		case .PEXP_SUBCMD:
				return (char_u)ModernizedCProgram.pexpand_cmds[idx];
		default:
				return ((Object)0/*
				 * Handle command line completion for :profile command.
				 */);
		}
	}
	public void set_context_in_profile_cmd(Object arg) {
		char_u end_subcmd = new char_u();
		// Default: expand subcommands.// Default: expand subcommands.this.setXp_context(35);
		.pexpand_what = .PEXP_SUBCMD;
		this.setXp_pattern(arg);
		end_subcmd = ModernizedCProgram.skiptowhite(arg);
		if (end_subcmd == (byte)'\000') {
			return /*Error: Unsupported expression*/;
		} 
		if (end_subcmd - arg == 5 && /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("start"), (size_t)(true)) == 0) {
			this.setXp_context(2);
			this.setXp_pattern(ModernizedCProgram.skipwhite(end_subcmd));
			return /*Error: Unsupported expression*/;
		} 
		// TODO: expand function names after "func"// TODO: expand function names after "func"this.setXp_context(0);
	}
	public void set_context_in_highlight_cmd(Object[] arg) {
		char_u p = new char_u();
		// Default: expand group names// Default: expand group namesthis.setXp_context(13);
		this.setXp_pattern(arg);
		include_link = 2;
		include_default = 1;
		Object[] generatedXp_pattern = this.getXp_pattern();
		// (part of) subcommand already typedif (arg != (byte)'\000') {
			p = ModernizedCProgram.skiptowhite(arg);
			if (p != (byte)'\000') {
				include_default = 0;
				if (/*Error: Function owner not recognized*/strncmp((byte)("default"), (byte)(arg), (size_t)(p - arg)) == 0) {
					arg = ModernizedCProgram.skipwhite(p);
					this.setXp_pattern(arg);
					p = ModernizedCProgram.skiptowhite(arg);
				} 
				if (p != (byte)'\000') {
					include_link = 0;
					if (arg[1] == (byte)'i' && arg[0] == (byte)'N') {
						ModernizedCProgram.highlight_list();
					} 
					if (/*Error: Function owner not recognized*/strncmp((byte)("link"), (byte)(arg), (size_t)(p - arg)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)("clear"), (byte)(arg), (size_t)(p - arg)) == 0) {
						this.setXp_pattern(ModernizedCProgram.skipwhite(p));
						p = ModernizedCProgram.skiptowhite(generatedXp_pattern);
						if (p != (byte)'\000') {
							this.setXp_pattern(ModernizedCProgram.skipwhite(p));
							p = ModernizedCProgram.skiptowhite(generatedXp_pattern);
						} 
					} 
					if (p != (byte)'\000') {
						this.setXp_context(0);
					} 
				} 
			} 
		} 
	}
	public Object get_highlight_name(int idx) {
		return xp.get_highlight_name_ext(idx, 1/*
		 * Obtain a highlight group name.
		 * When "skip_cleared" is TRUE don't return a cleared entry.
		 */);
	}
	public Object get_highlight_name_ext(int idx, int skip_cleared) {
		if (idx < 0) {
			return ((Object)0);
		} 
		// cleared.if (skip_cleared && idx < ModernizedCProgram.highlight_ga.getGa_len() && ((hl_group_T)((ModernizedCProgram.highlight_ga.getGa_data())))[idx].getSg_cleared()) {
			return (char_u)"";
		} 
		if (idx == ModernizedCProgram.highlight_ga.getGa_len() && include_none != 0) {
			return (char_u)"none";
		} 
		if (idx == ModernizedCProgram.highlight_ga.getGa_len() + include_none && include_default != 0) {
			return (char_u)"default";
		} 
		if (idx == ModernizedCProgram.highlight_ga.getGa_len() + include_none + include_default && include_link != 0) {
			return (char_u)"link";
		} 
		if (idx == ModernizedCProgram.highlight_ga.getGa_len() + include_none + include_default + 1 && include_link != 0) {
			return (char_u)"clear";
		} 
		if (idx >= ModernizedCProgram.highlight_ga.getGa_len()) {
			return ((Object)0);
		} 
		return ((hl_group_T)((ModernizedCProgram.highlight_ga.getGa_data())))[idx].getSg_name();
	}
	public Object get_augroup_name(int idx) {
		// add "END" add the endif (idx == ModernizedCProgram.augroups.getGa_len()) {
			return (char_u)"END";
		} 
		// end of listif (idx >= ModernizedCProgram.augroups.getGa_len()) {
			return ((Object)0);
		} 
		if ((((char_u)ModernizedCProgram.augroups.getGa_data())[idx]) == ((Object)0) || (((char_u)ModernizedCProgram.augroups.getGa_data())[idx]) == ModernizedCProgram.get_deleted_augroup()) {
			return (char_u)"";
		} 
		// skip deleted entries
		// return a namereturn (((char_u)ModernizedCProgram.augroups.getGa_data())[idx]);
	}
	public Object set_context_in_autocmd(Object[] arg, int doautocmd) {
		// TRUE for :doauto*, FALSE for :autocmdchar_u p = new char_u();
		int group;
		// check for a group name, skip it if present// check for a group name, skip it if presentModernizedCProgram.include_groups = 0;
		p = arg;
		group = ModernizedCProgram.au_get_grouparg(arg);
		if (group == -2) {
			return ((Object)0);
		} 
		if (arg == (byte)'\000' && group != -3 && !((arg[-1]) == (byte)' ' || (arg[-1]) == (byte)'\t')) {
			arg = p;
			group = -3;
		} 
		// skip over event namefor (p = arg; p != (byte)'\000' && !((p) == (byte)' ' || (p) == (byte)'\t'); ++p) {
			if (p == (byte)',') {
				arg = p + 1;
			} 
		}
		if (p == (byte)'\000') {
			if (group == -3) {
				ModernizedCProgram.include_groups = 1;
			} 
			this.setXp_context(10);
			this.setXp_pattern(arg);
			return ((Object)0);
		} 
		// skip over pattern// skip over patternarg = ModernizedCProgram.skipwhite(p);
		while (arg && (!((arg) == (byte)' ' || (arg) == (byte)'\t') || arg[-1] == (byte)'\\')) {
			arg++;
		}
		if (arg) {
			return arg;
		} 
		if (doautocmd) {
			this.setXp_context(2);
		} else {
				this.setXp_context(0);
		} 
		return ((Object)0/*
		 * Function given to ExpandGeneric() to obtain the list of event names.
		 */);
	}
	public Object get_event_name(int idx) {
		// First list group names, if wantedif (idx < ModernizedCProgram.augroups.getGa_len()) {
			if (!ModernizedCProgram.include_groups || (((char_u)ModernizedCProgram.augroups.getGa_data())[idx]) == ((Object)0) || (((char_u)ModernizedCProgram.augroups.getGa_data())[idx]) == ModernizedCProgram.get_deleted_augroup()) {
				return (char_u)"";
			} 
			return (((char_u)ModernizedCProgram.augroups.getGa_data())[idx]);
		} 
		return (char_u)event_names[idx - ModernizedCProgram.augroups.getGa_len()].getName();
	}
	public void set_context_in_echohl_cmd(Object arg) {
		this.setXp_context(13);
		this.setXp_pattern(arg);
		include_none = 1/*
		 * Handle command line completion for :syntax command.
		 */;
	}
	public void set_context_in_syntax_cmd(Object arg) {
		char_u p = new char_u();
		this.setXp_context(/* Default: expand subcommands */12);
		.expand_what = .EXP_SUBCMD;
		this.setXp_pattern(arg);
		include_link = 0;
		include_default = 0;
		Object[] generatedXp_pattern = this.getXp_pattern();
		if (arg != /* (part of) subcommand already typed */(byte)'\000') {
			p = ModernizedCProgram.skiptowhite(arg);
			if (p != /* past first word */(byte)'\000') {
				this.setXp_pattern(ModernizedCProgram.skipwhite(p));
				if (ModernizedCProgram.skiptowhite(generatedXp_pattern) != (byte)'\000') {
					this.setXp_context(0);
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("case"), (size_t)(p - arg)) == 0) {
					.expand_what = .EXP_CASE;
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("spell"), (size_t)(p - arg)) == 0) {
					.expand_what = .EXP_SPELL;
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("sync"), (size_t)(p - arg)) == 0) {
					.expand_what = .EXP_SYNC;
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("keyword"), (size_t)(p - arg)) == 0 || ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("region"), (size_t)(p - arg)) == 0 || ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("match"), (size_t)(p - arg)) == 0 || ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("list"), (size_t)(p - arg)) == 0) {
					this.setXp_context(13);
				} else {
						this.setXp_context(0/*
						 * Function given to ExpandGeneric() to obtain the list syntax names for
						 * expansion.
						 */);
				} 
			} 
		} 
	}
	public Object get_syntax_name(int idx) {
		switch (.expand_what) {
		case .EXP_SPELL:
				{ 
					byte[] spell_args = new byte[]{"toplevel", "notoplevel", "default", ((Object)0)};
					return (char_u)spell_args[idx];
				}
		case .EXP_SUBCMD:
				return (char_u)ModernizedCProgram.subcommands[idx].getName();
		case .EXP_SYNC:
				{ 
					byte[] sync_args = new byte[]{"ccomment", "clear", "fromstart", "linebreaks=", "linecont", "lines=", "match", "maxlines=", "minlines=", "region", ((Object)0)};
					return (char_u)sync_args[idx];
				}
		case .EXP_CASE:
				{ 
					byte[] case_args = new byte[]{"match", "ignore", ((Object)0)};
					return (char_u)case_args[idx];
				}
		}
		return ((Object)0/*
		 * Function called for expression evaluation: get syntax ID at file position.
		 */);
	}
	public Object get_syntime_arg(int idx) {
		switch (idx) {
		case 2:
				return (char_u)"clear";
		case 0:
				return (char_u)"on";
		case 3:
				return (char_u)"report";
		case 1:
				return (char_u)"off";
		}
		return ((Object)0);
	}
	public Object set_context_in_menu_cmd(Object[] cmd, Object[] arg, int forceit) {
		char_u after_dot = new char_u();
		char_u p = new char_u();
		char_u path_name = ((Object)0);
		char_u name = new char_u();
		int unmenu;
		vimmenu_T menu = new vimmenu_T();
		int expand_menus;
		this.setXp_context((true));
		for (p = arg; p; ++/* Check for priority numbers, enable and disable */p) {
			if (!((int)(p) - (byte)'0' < 10) && p != (byte)'.') {
				break;
			} 
		}
		if (!((p) == (byte)' ' || (p) == (byte)'\t')) {
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("enable"), (size_t)(true)) == 0 && (arg[6] == (byte)'\000' || ((arg[6]) == (byte)' ' || (arg[6]) == (byte)'\t'))) {
				p = arg + 6;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("disable"), (size_t)(true)) == 0 && (arg[7] == (byte)'\000' || ((arg[7]) == (byte)' ' || (arg[7]) == (byte)'\t'))) {
				p = arg + 7;
			} else {
					p = arg;
			} 
		} 
		while (p != (byte)'\000' && ((p) == (byte)' ' || (p) == (byte)'\t')) {
			++p;
		}
		arg = after_dot = p;
		for (; p && !((p) == (byte)' ' || (p) == (byte)'\t'); ++p) {
			if ((p == (byte)'\\' || p == 22) && p[1] != (byte)'\000') {
				p++;
			}  else if (p == (byte)'.') {
				after_dot = p + 1;
			} 
		}
		expand_menus = !((cmd == (byte)'t' && cmd[1] == (byte)'e') || cmd == /* ":tearoff" and ":popup" only use menus, not entries */(byte)'p');
		ModernizedCProgram.expand_emenu = (cmd == (byte)'e');
		if (expand_menus && ((p) == (byte)' ' || (p) == (byte)'\t')) {
			return ((Object)/* TODO: check for next command? */0);
		} 
		Object generatedChildren = menu.getChildren();
		Object generatedModes = menu.getModes();
		Object generatedNext = menu.getNext();
		if (p == /* Complete the menu name */(byte)'\000') {
			int try_alt_menu = 1/*
				 * With :unmenu, you only want to match menus for the appropriate mode.
				 * With :menu though you might want to add a menu with the same name as
				 * one in another mode, so match menus from other modes too.
				 */;
			ModernizedCProgram.expand_modes = ModernizedCProgram.get_menu_cmd_modes(cmd, forceit, ((Object)0), unmenu);
			if (!unmenu) {
				ModernizedCProgram.expand_modes = ((1 << 7) - 1);
			} 
			menu = root_menu;
			if (after_dot != arg) {
				path_name = ModernizedCProgram.alloc(after_dot - arg);
				if (path_name == ((Object)0)) {
					return ((Object)0);
				} 
				ModernizedCProgram.vim_strncpy(path_name, arg, after_dot - arg - 1);
			} 
			name = path_name;
			while (name != ((Object)0) && name) {
				p = ModernizedCProgram.menu_name_skip(name);
				while (menu != ((Object)0)) {
					if (menu.menu_name_equal(name)) {
						if ((p != (byte)'\000' && generatedChildren == ((Object)/* Found menu */0)) || ((generatedModes & ModernizedCProgram.expand_modes) == -1024/*
									 * Menu path continues, but we have reached a leaf.
									 * Or menu exists only in another mode.
									 */)) {
							ModernizedCProgram.vim_free(path_name);
							return ((Object)0);
						} 
						break;
					} 
					menu = generatedNext;
					if (menu == ((Object)0) && try_alt_menu) {
						menu = ModernizedCProgram.curwin.getW_winbar();
						try_alt_menu = 0;
					} 
				}
				if (menu == ((Object)0)) {
					ModernizedCProgram.vim_free(/* No menu found with the name we were looking for */path_name);
					return ((Object)0);
				} 
				name = p;
				menu = generatedChildren;
				try_alt_menu = 0;
			}
			ModernizedCProgram.vim_free(path_name);
			this.setXp_context(expand_menus ? 21 : 11);
			this.setXp_pattern(after_dot);
			ModernizedCProgram.expand_menu = menu;
			if (ModernizedCProgram.expand_menu == root_menu) {
				ModernizedCProgram.expand_menu_alt = ModernizedCProgram.curwin.getW_winbar();
			} else {
					ModernizedCProgram.expand_menu_alt = ((Object)0);
			} 
		} else {
				this.setXp_context(/* We're in the mapping part */0);
		} 
		return ((Object)0/*
		 * Function given to ExpandGeneric() to obtain the list of (sub)menus (not
		 * entries).
		 */);
	}
	public Object get_menu_name(int idx) {
		vimmenu_T menu = ((Object)0);
		int did_alt_menu = 0;
		char_u str = new char_u();
		int should_advance = 0;
		if (idx == /* first call: start at first item */0) {
			menu = ModernizedCProgram.expand_menu;
			did_alt_menu = 0;
			should_advance = 0;
		} 
		Object generatedDname = menu.getDname();
		Object generatedChildren = menu.getChildren();
		Object generatedNext = menu.getNext();
		while (menu != ((Object)0) && (ModernizedCProgram.menu_is_hidden(generatedDname) || ModernizedCProgram.menu_is_separator(generatedDname) || ModernizedCProgram.menu_is_tearoff(generatedDname) || generatedChildren == ((Object)0))) {
			menu = generatedNext;
			if (menu == ((Object)0) && !did_alt_menu) {
				menu = ModernizedCProgram.expand_menu_alt;
				did_alt_menu = 1;
			} 
		}
		if (menu == ((Object)/* at end of linked list */0)) {
			return ((Object)0);
		} 
		Object generatedModes = menu.getModes();
		Object generatedEn_dname = menu.getEn_dname();
		if (generatedModes & ModernizedCProgram.expand_modes) {
			if (should_advance) {
				str = generatedEn_dname;
			} else {
					str = generatedDname;
					if (generatedEn_dname == ((Object)0)) {
						should_advance = 1;
					} 
			} 
		} else {
				str = (char_u)"";
		} 
		if (should_advance) {
			menu = generatedNext;
			if (menu == ((Object)0) && !did_alt_menu) {
				menu = ModernizedCProgram.expand_menu_alt;
				did_alt_menu = 1;
			} 
		} 
		should_advance = !should_advance;
		return str/*
		 * Function given to ExpandGeneric() to obtain the list of menus and menu
		 * entries.
		 */;
	}
	public Object get_menu_names(int idx) {
		vimmenu_T menu = ((Object)0);
		int did_alt_menu = 0;
		char_u[] tbuffer = new char_u();
		char_u str = new char_u();
		int should_advance = 0;
		if (idx == /* first call: start at first item */0) {
			menu = ModernizedCProgram.expand_menu;
			did_alt_menu = 0;
			should_advance = 0;
		} 
		Object generatedDname = menu.getDname();
		Object generatedNext = menu.getNext();
		while (menu != ((Object)/* Skip Browse-style entries, popup menus and separators. */0) && (ModernizedCProgram.menu_is_hidden(generatedDname) || (ModernizedCProgram.expand_emenu && ModernizedCProgram.menu_is_separator(generatedDname)) || ModernizedCProgram.menu_is_tearoff(generatedDname) || generatedDname[/*Error: Function owner not recognized*/strlen((byte)(generatedDname)) - 1] == (byte)'.')) {
			menu = generatedNext;
			if (menu == ((Object)0) && !did_alt_menu) {
				menu = ModernizedCProgram.expand_menu_alt;
				did_alt_menu = 1;
			} 
		}
		if (menu == ((Object)/* at end of linked list */0)) {
			return ((Object)0);
		} 
		Object generatedModes = menu.getModes();
		Object generatedChildren = menu.getChildren();
		Object generatedEn_dname = menu.getEn_dname();
		if (generatedModes & ModernizedCProgram.expand_modes) {
			if (generatedChildren != ((Object)0)) {
				if (should_advance) {
					ModernizedCProgram.vim_strncpy(tbuffer, generatedEn_dname, 256 - 2);
				} else {
						ModernizedCProgram.vim_strncpy(tbuffer, generatedDname, 256 - 2);
						if (generatedEn_dname == ((Object)0)) {
							should_advance = 1;
						} 
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(tbuffer), (byte)(/* hack on menu separators:  use a 'magic' char for the separator
					     * so that '.' in names gets escaped properly */"\001"));
				str = tbuffer;
			} else {
					if (should_advance) {
						str = generatedEn_dname;
					} else {
							str = generatedDname;
							if (generatedEn_dname == ((Object)0)) {
								should_advance = 1;
							} 
					} 
			} 
		} else {
				str = (char_u)"";
		} 
		if (should_advance) {
			menu = generatedNext;
			if (menu == ((Object)0) && !did_alt_menu) {
				menu = ModernizedCProgram.expand_menu_alt;
				did_alt_menu = 1;
			} 
		} 
		should_advance = !should_advance;
		return str/*
		 * Skip over this element of the menu path and return the start of the next
		 * element.  Any \ and ^Vs are removed from the current element.
		 * "name" may be modified.
		 */;
	}
	public Object get_user_var_name(int idx) {
		long_u gdone = new long_u();
		long_u bdone = new long_u();
		long_u wdone = new long_u();
		long_u tdone = new long_u();
		int vidx;
		hashitem_T hi = new hashitem_T();
		hashtab_T ht = new hashtab_T();
		if (idx == 0) {
			gdone = bdone = wdone = vidx = 0;
			tdone = 0;
		} 
		Object generatedHi_key = (hi).getHi_key();
		Object[] generatedXp_pattern = this.getXp_pattern();
		// Global variablesif (gdone < ModernizedCProgram.globvardict.getDv_hashtab().getHt_used()) {
			if (gdone++ == 0) {
				hi = ModernizedCProgram.globvardict.getDv_hashtab().getHt_array();
			} else {
					++hi;
			} 
			while ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				++hi;
			}
			if (/*Error: Function owner not recognized*/strncmp((byte)("g:"), (byte)(generatedXp_pattern), (size_t)(true)) == 0) {
				return ModernizedCProgram.cat_prefix_varname((byte)'g', generatedHi_key);
			} 
			return generatedHi_key;
		} 
		Object generatedB_vars = curbuf.getB_vars();
		// b: variables// b: variablesht = generatedB_vars.getDv_hashtab();
		Object generatedHt_used = ht.getHt_used();
		hashitem_S[] generatedHt_array = ht.getHt_array();
		if (bdone < generatedHt_used) {
			if (bdone++ == 0) {
				hi = generatedHt_array;
			} else {
					++hi;
			} 
			while ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				++hi;
			}
			return ModernizedCProgram.cat_prefix_varname((byte)'b', generatedHi_key);
		} 
		// w: variables// w: variablesht = ModernizedCProgram.curwin.getW_vars().getDv_hashtab();
		if (wdone < generatedHt_used) {
			if (wdone++ == 0) {
				hi = generatedHt_array;
			} else {
					++hi;
			} 
			while ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				++hi;
			}
			return ModernizedCProgram.cat_prefix_varname((byte)'w', generatedHi_key);
		} 
		// t: variables// t: variablesht = ModernizedCProgram.curtab.getTp_vars().getDv_hashtab();
		if (tdone < generatedHt_used) {
			if (tdone++ == 0) {
				hi = generatedHt_array;
			} else {
					++hi;
			} 
			while ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				++hi;
			}
			return ModernizedCProgram.cat_prefix_varname((byte)'t', generatedHi_key);
		} 
		// v: variablesif (vidx < 93) {
			return ModernizedCProgram.cat_prefix_varname((byte)'v', (char_u)vimvars[vidx++].getVv_name());
		} 
		do {
			if ((ModernizedCProgram.varnamebuf) != ((Object)0)) {
				ModernizedCProgram.vim_free(ModernizedCProgram.varnamebuf);
				(ModernizedCProgram.varnamebuf) = ((Object)0);
			} 
		} while (0);
		ModernizedCProgram.varnamebuflen = 0;
		return ((Object)0);
	}
	public Object get_command_name(int idx) {
		if (idx >= (int)CMD_index.CMD_SIZE) {
			return ModernizedCProgram.get_user_command_name(idx);
		} 
		return cmdnames[idx].getCmd_name();
	}
	public Object get_arglist_name(int idx) {
		if (idx >= ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
			return ((Object)0);
		} 
		return ((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[idx/*
		 * Get the file name for an argument list entry.
		 */].alist_name();
	}
	public Object get_history_arg(int idx) {
		char_u[] compl = new char_u[]{(byte)'\000', (byte)'\000'};
		byte short_names = ":=@>?/";
		int short_names_count = (int)/*Error: Function owner not recognized*/strlen((byte)(short_names));
		int history_name_count = /*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/ - 1;
		if (idx < short_names_count) {
			compl[0] = (char_u)short_names[idx];
			return compl;
		} 
		if (idx < short_names_count + history_name_count) {
			return (char_u)ModernizedCProgram.history_names[idx - short_names_count];
		} 
		if (idx == short_names_count + history_name_count) {
			return (char_u)"all";
		} 
		return ((Object)0/*
		 * init_history() - Initialize the command line history.
		 * Also used to re-allocate the history when the size changes.
		 */);
	}
	/*
	 * Function given to ExpandGeneric() to obtain the list of user defined
	 * function names.
	 */
	public Object get_user_func_name(int idx) {
		long_u done = new long_u();
		hashitem_T hi = new hashitem_T();
		ufunc_T fp = new ufunc_T();
		if (idx == 0) {
			done = 0;
			hi = ModernizedCProgram.func_hashtab.getHt_array();
		} 
		Object generatedHi_key = (hi).getHi_key();
		Object generatedUf_flags = fp.getUf_flags();
		Object generatedUf_name = fp.getUf_name();
		int generatedXp_context = this.getXp_context();
		Object generatedUf_varargs = fp.getUf_varargs();
		Object generatedUf_args = fp.getUf_args();
		if (done < ModernizedCProgram.func_hashtab.getHt_used()) {
			if (done++ > 0) {
				++hi;
			} 
			while ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				++hi;
			}
			fp = ((ufunc_T)((generatedHi_key) - ((size_t)((ufunc_T)0).getUf_name())));
			if ((generatedUf_flags & -1024) || /*Error: Function owner not recognized*/strncmp((byte)(generatedUf_name), (byte)("<lambda>"), (size_t)(true)) == 0) {
				return (char_u)/* don't show dict and lambda functions */"";
			} 
			if (/*Error: Function owner not recognized*/strlen((byte)(generatedUf_name)) + 4 >= (1024 + 1)) {
				return generatedUf_name;
			} 
			fp.cat_func_name(ModernizedCProgram.IObuff);
			if (generatedXp_context != 19) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)("("));
				if (!generatedUf_varargs && generatedUf_args.getGa_len() == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(")"));
				} 
			} 
			return ModernizedCProgram.IObuff;
		} 
		return ((Object)0/*
		 * ":delfunction {name}"
		 */);
	}
	/*
	 * Function given to ExpandGeneric() to obtain the possible arguments of the
	 * ":language" command.
	 */
	public Object get_lang_arg(int idx) {
		if (idx == 0) {
			return (char_u)"messages";
		} 
		if (idx == 1) {
			return (char_u)"ctype";
		} 
		if (idx == 2) {
			return (char_u)"time";
		} 
		ModernizedCProgram.init_locales();
		if (ModernizedCProgram.locales == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.locales[idx - 3/*
		 * Function given to ExpandGeneric() to obtain the available locales.
		 */];
	}
	public Object get_locales(int idx) {
		ModernizedCProgram.init_locales();
		if (ModernizedCProgram.locales == ((Object)0)) {
			return ((Object)0);
		} 
		return ModernizedCProgram.locales[idx];
	}
	public Object get_function_name(int idx) {
		int intidx = -1;
		char_u name = new char_u();
		if (idx == 0) {
			intidx = -1;
		} 
		if (intidx < 0) {
			name = xp.get_user_func_name(idx);
			if (name != ((Object)0)) {
				return name;
			} 
		} 
		if (++intidx < (int)(/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.IObuff), (byte)(ModernizedCProgram.global_functions[intidx].getF_name()));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)("("));
			if (ModernizedCProgram.global_functions[intidx].getF_max_argc() == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(")"));
			} 
			return ModernizedCProgram.IObuff;
		} 
		return ((Object)0/*
		 * Function given to ExpandGeneric() to obtain the list of internal or
		 * user defined variable or function names.
		 */);
	}
	public Object get_expr_name(int idx) {
		int intidx = -1;
		char_u name = new char_u();
		if (idx == 0) {
			intidx = -1;
		} 
		if (intidx < 0) {
			name = xp.get_function_name(idx);
			if (name != ((Object)0)) {
				return name;
			} 
		} 
		return xp.get_user_var_name(++intidx/*
		 * Find internal function "name" in table "global_functions".
		 * Return index, or -1 if not found
		 */);
	}
	public int getXp_context() {
		return xp_context;
	}
	public void setXp_context(int newXp_context) {
		xp_context = newXp_context;
	}
	public Object[] getXp_pattern() {
		return xp_pattern;
	}
	public void setXp_pattern(Object[] newXp_pattern) {
		xp_pattern = newXp_pattern;
	}
	public int getXp_pattern_len() {
		return xp_pattern_len;
	}
	public void setXp_pattern_len(int newXp_pattern_len) {
		xp_pattern_len = newXp_pattern_len;
	}
	public int getXp_backslash() {
		return xp_backslash;
	}
	public void setXp_backslash(int newXp_backslash) {
		xp_backslash = newXp_backslash;
	}
	public int getXp_shell() {
		return xp_shell;
	}
	public void setXp_shell(int newXp_shell) {
		xp_shell = newXp_shell;
	}
	public int getXp_numfiles() {
		return xp_numfiles;
	}
	public void setXp_numfiles(int newXp_numfiles) {
		xp_numfiles = newXp_numfiles;
	}
	public Object[][] getXp_files() {
		return xp_files;
	}
	public void setXp_files(Object[][] newXp_files) {
		xp_files = newXp_files;
	}
	public Object getXp_line() {
		return xp_line;
	}
	public void setXp_line(Object newXp_line) {
		xp_line = newXp_line;
	}
	public int getXp_col() {
		return xp_col;
	}
	public void setXp_col(int newXp_col) {
		xp_col = newXp_col;
	}
}
