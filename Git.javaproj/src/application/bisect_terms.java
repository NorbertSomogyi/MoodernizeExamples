package application;

public class bisect_terms {
	private Byte term_good;
	private Byte term_bad;
	
	public bisect_terms(Byte term_good, Byte term_bad) {
		setTerm_good(term_good);
		setTerm_bad(term_bad);
	}
	public bisect_terms() {
	}
	
	public void free_terms() {
		Byte generatedTerm_good = this.getTerm_good();
		do {
			ModernizedCProgram.free(generatedTerm_good);
			(generatedTerm_good) = ((Object)0);
		} while (0);
		Byte generatedTerm_bad = this.getTerm_bad();
		do {
			ModernizedCProgram.free(generatedTerm_bad);
			(generatedTerm_bad) = ((Object)0);
		} while (0);
	}
	public void set_terms(Object bad, Object good) {
		Byte generatedTerm_good = this.getTerm_good();
		ModernizedCProgram.free((Object)generatedTerm_good);
		this.setTerm_good(ModernizedCProgram.xstrdup(good));
		Byte generatedTerm_bad = this.getTerm_bad();
		ModernizedCProgram.free((Object)generatedTerm_bad);
		this.setTerm_bad(ModernizedCProgram.xstrdup(bad));
	}
	public int check_and_set_terms(Object cmd) {
		int has_term_file = !ModernizedCProgram.is_empty_or_missing_file(ModernizedCProgram.git_path_bisect_terms());
		if (ModernizedCProgram.one_of(cmd, "skip", "start", "terms", ((Object)0))) {
			return 0;
		} 
		Byte generatedTerm_bad = this.getTerm_bad();
		Byte generatedTerm_good = this.getTerm_good();
		if (has_term_file && .strcmp(cmd, generatedTerm_bad) && .strcmp(cmd, generatedTerm_good)) {
			return ();
		} 
		if (!has_term_file) {
			if (ModernizedCProgram.one_of(cmd, "bad", "good", ((Object)0))) {
				terms.set_terms("bad", "good");
				return ModernizedCProgram.write_terms(generatedTerm_bad, generatedTerm_good);
			} 
			if (ModernizedCProgram.one_of(cmd, "new", "old", ((Object)0))) {
				terms.set_terms("new", "old");
				return ModernizedCProgram.write_terms(generatedTerm_bad, generatedTerm_good);
			} 
		} 
		return 0;
	}
	public int get_terms() {
		strbuf str = new strbuf(, , );
		FILE fp = ((Object)0);
		int res = 0;
		fp = .fopen(ModernizedCProgram.git_path_bisect_terms(), "r");
		if (!fp) {
			res = -1;
			;
		} 
		terms.free_terms();
		ModernizedCProgram.strbuf_getline_lf(str, fp);
		this.setTerm_bad(str.strbuf_detach(((Object)0)));
		ModernizedCProgram.strbuf_getline_lf(str, fp);
		this.setTerm_good(str.strbuf_detach(((Object)0)));
		str.strbuf_release();
		return res;
	}
	public int bisect_terms(Object option) {
		if (terms.get_terms()) {
			return ();
		} 
		Byte generatedTerm_good = this.getTerm_good();
		Byte generatedTerm_bad = this.getTerm_bad();
		if (option == ((Object)0)) {
			.printf(ModernizedCProgram._("Your current terms are %s for the old state\nand %s for the new state.\n"), generatedTerm_good, generatedTerm_bad);
			return 0;
		} 
		if (ModernizedCProgram.one_of(option, "--term-good", "--term-old", ((Object)0))) {
			.printf("%s\n", generatedTerm_good);
		}  else if (ModernizedCProgram.one_of(option, "--term-bad", "--term-new", ((Object)0))) {
			.printf("%s\n", generatedTerm_bad);
		} else {
				return ();
		} 
		return 0;
	}
	public int bisect_start(int no_checkout, Object argv, int argc) {
		int i;
		int has_double_dash = 0;
		int must_write_terms = 0;
		int bad_seen = 0;
		int flags;
		int pathspec_pos;
		int retval = 0;
		string_list revs = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		string_list states = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		strbuf start_head = new strbuf(, , );
		strbuf bisect_names = new strbuf(, , );
		object_id head_oid = new object_id();
		object_id oid = new object_id();
		byte head;
		if (ModernizedCProgram.is_bare_repository()) {
			no_checkout = 1/*
				 * Check for one bad and then some good revisions
				 */;
		} 
		for (i = 0; i < argc; i++) {
			if (!.strcmp(argv[i], "--")) {
				has_double_dash = 1;
				break;
			} 
		}
		Byte generatedTerm_good = this.getTerm_good();
		Byte generatedTerm_bad = this.getTerm_bad();
		for (i = 0; i < argc; i++) {
			byte arg = argv[i];
			if (!.strcmp(argv[i], "--")) {
				break;
			}  else if (!.strcmp(arg, "--no-checkout")) {
				no_checkout = 1;
			}  else if (!.strcmp(arg, "--term-good") || !.strcmp(arg, "--term-old")) {
				must_write_terms = 1;
				ModernizedCProgram.free((Object)generatedTerm_good);
				this.setTerm_good(ModernizedCProgram.xstrdup(argv[++i]));
			}  else if (ModernizedCProgram.skip_prefix(arg, "--term-good=", arg) || ModernizedCProgram.skip_prefix(arg, "--term-old=", arg)) {
				must_write_terms = 1;
				ModernizedCProgram.free((Object)generatedTerm_good);
				this.setTerm_good(ModernizedCProgram.xstrdup(arg));
			}  else if (!.strcmp(arg, "--term-bad") || !.strcmp(arg, "--term-new")) {
				must_write_terms = 1;
				ModernizedCProgram.free((Object)generatedTerm_bad);
				this.setTerm_bad(ModernizedCProgram.xstrdup(argv[++i]));
			}  else if (ModernizedCProgram.skip_prefix(arg, "--term-bad=", arg) || ModernizedCProgram.skip_prefix(arg, "--term-new=", arg)) {
				must_write_terms = 1;
				ModernizedCProgram.free((Object)generatedTerm_bad);
				this.setTerm_bad(ModernizedCProgram.xstrdup(arg));
			}  else if (ModernizedCProgram.starts_with(arg, "--") && !ModernizedCProgram.one_of(arg, "--term-good", "--term-bad", ((Object)0))) {
				return ();
			} else {
					byte commit_id = ModernizedCProgram.xstrfmt("%s^{commit}", arg);
					if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, commit_id, oid) && has_double_dash) {
						ModernizedCProgram.die(ModernizedCProgram._("'%s' does not appear to be a valid revision"), arg);
					} 
					revs.string_list_append(ModernizedCProgram.oid_to_hex(oid));
					ModernizedCProgram.free(commit_id);
			} 
		}
		pathspec_pos = i/*
			 * The user ran "git bisect start <sha1> <sha1>", hence did not
			 * explicitly specify the terms, but we are already starting to
			 * set references named with the default terms, and won't be able
			 * to change afterwards.
			 */;
		int generatedNr = revs.getNr();
		if (generatedNr) {
			must_write_terms = 1;
		} 
		for (i = 0; i < generatedNr; i++) {
			if (bad_seen) {
				states.string_list_append(generatedTerm_good);
			} else {
					bad_seen = 1;
					states.string_list_append(generatedTerm_bad);
			} 
		}
		head = head_oid.resolve_ref_unsafe("HEAD", 0, /*
			 * Verify HEAD
			 */flags);
		if (!head) {
			if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head_oid)) {
				return ();
			} 
		} 
		byte generatedBuf = start_head.getBuf();
		Object generatedArgv = argv.getArgv();
		if (!ModernizedCProgram.is_empty_or_missing_file(ModernizedCProgram.git_path_bisect_start())) {
			start_head.strbuf_read_file(ModernizedCProgram.git_path_bisect_start(), /* Reset to the rev from where we started */0);
			start_head.strbuf_trim();
			if (!no_checkout) {
				argv_array argv = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
				argv.argv_array_pushl("checkout", generatedBuf, "--", ((Object)0));
				if (ModernizedCProgram.run_command_v_opt(generatedArgv, 2)) {
					retval = ();
					;
				} 
			} 
		} else {
				if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, head, /* Get the rev from where we start. */head_oid) && !ModernizedCProgram.starts_with(head, "refs/heads/")) {
					start_head.strbuf_setlen(0);
					start_head.strbuf_addstr(ModernizedCProgram.oid_to_hex(head_oid));
				}  else if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, head, head_oid) && ModernizedCProgram.skip_prefix(head, "refs/heads/", head/*
							 * This error message should only be triggered by
							 * cogito usage, and cogito users should understand
							 * it relates to cg-seek.
							 */)) {
					if (!ModernizedCProgram.is_empty_or_missing_file(ModernizedCProgram.git_path_head_name())) {
						return ();
					} 
					start_head.strbuf_addstr(head);
				} else {
						return ();
				} 
		} 
		if (ModernizedCProgram.bisect_clean_state()) {
			return -1/*
				 * In case of mistaken revs or checkout error, or signals received,
				 * "bisect_auto_next" below may exit or misbehave.
				 * We have to trap this to be able to clean up using
				 * "bisect_clean_state".
				 */;
		} 
		ModernizedCProgram.write_file(ModernizedCProgram.git_path_bisect_start(), "%s\n", generatedBuf);
		if (no_checkout) {
			if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, oid) < 0) {
				retval = ();
				;
			} 
			if (ModernizedCProgram.update_ref(((Object)0), "BISECT_HEAD", oid, ((Object)0), 0, action_on_err.UPDATE_REFS_MSG_ON_ERR)) {
				retval = -1;
				;
			} 
		} 
		if (pathspec_pos < argc - 1) {
			bisect_names.sq_quote_argv(argv + pathspec_pos);
		} 
		ModernizedCProgram.write_file(ModernizedCProgram.git_path_bisect_names(), "%s\n", generatedBuf);
		string_list_item generatedItems = states.getItems();
		for (i = 0; i < generatedNr; i++) {
			if (ModernizedCProgram.bisect_write(generatedItems[i].getString(), generatedItems[i].getString(), terms, 1)) {
				retval = -1;
				;
			} 
		}
		if (must_write_terms && ModernizedCProgram.write_terms(generatedTerm_bad, generatedTerm_good)) {
			retval = -1;
			;
		} 
		retval = ModernizedCProgram.bisect_append_log_quoted(argv);
		if (retval) {
			retval = -1;
		} 
		states.string_list_clear(0);
		start_head.strbuf_release();
		bisect_names.strbuf_release();
		return retval;
	}
	public Byte getTerm_good() {
		return term_good;
	}
	public void setTerm_good(Byte newTerm_good) {
		term_good = newTerm_good;
	}
	public Byte getTerm_bad() {
		return term_bad;
	}
	public void setTerm_bad(Byte newTerm_bad) {
		term_bad = newTerm_bad;
	}
}
