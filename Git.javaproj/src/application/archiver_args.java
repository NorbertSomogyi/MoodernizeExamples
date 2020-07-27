package application;

public class archiver_args {
	private repository repo;
	private Object base;
	private Object baselen;
	private tree tree;
	private Object commit_oid;
	private Object commit;
	private Object time;
	private pathspec pathspec;
	private int verbose;
	private int worktree_attributes;
	private int convert;
	private int compression_level;
	
	public archiver_args(repository repo, Object base, Object baselen, tree tree, Object commit_oid, Object commit, Object time, pathspec pathspec, int verbose, int worktree_attributes, int convert, int compression_level) {
		setRepo(repo);
		setBase(base);
		setBaselen(baselen);
		setTree(tree);
		setCommit_oid(commit_oid);
		setCommit(commit);
		setTime(time);
		setPathspec(pathspec);
		setVerbose(verbose);
		setWorktree_attributes(worktree_attributes);
		setConvert(convert);
		setCompression_level(compression_level);
	}
	public archiver_args() {
	}
	
	public int write_archive_entries(Object write_entry) {
		archiver_context context = new archiver_context();
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc t = new tree_desc();
		int err;
		if (ModernizedCProgram.args.getBaselen() > 0 && ModernizedCProgram.args.getBase()[ModernizedCProgram.args.getBaselen() - 1] == (byte)'/') {
			size_t len = ModernizedCProgram.args.getBaselen();
			while (ModernizedCProgram.len > 1 && ModernizedCProgram.args.getBase()[ModernizedCProgram.len - 2] == (byte)'/') {
				ModernizedCProgram.len--;
			}
			if (ModernizedCProgram.args.getVerbose()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%.*s\n", (int)ModernizedCProgram.len, ModernizedCProgram.args.getBase());
			} 
			err = ModernizedCProgram.args.write_entry(ModernizedCProgram.args.getTree().getObject().getOid(), ModernizedCProgram.args.getBase(), ModernizedCProgram.len, 40777);
			if (err) {
				return err;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(context, 0, /*Error: sizeof expression not supported yet*/);
		context.setArgs(ModernizedCProgram.args);
		context.setWrite_entry(write_entry/*
			 * Setup index and instruct attr to read index only
			 */);
		if (!ModernizedCProgram.args.getWorktree_attributes()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
			opts.setIndex_only(1);
			opts.setHead_idx(-1);
			opts.setSrc_index(ModernizedCProgram.args.getRepo().getIndex());
			opts.setDst_index(ModernizedCProgram.args.getRepo().getIndex());
			opts.setFn(ModernizedCProgram.oneway_merge);
			t.init_tree_desc(ModernizedCProgram.args.getTree().getBuffer(), ModernizedCProgram.args.getTree().getSize());
			if (ModernizedCProgram.unpack_trees(1, t, opts)) {
				return -1;
			} 
			ModernizedCProgram.git_attr_set_direction(git_attr_direction.GIT_ATTR_INDEX);
		} 
		err = ModernizedCProgram.read_tree_recursive(ModernizedCProgram.args.getRepo(), ModernizedCProgram.args.getTree(), "", 0, 0, ModernizedCProgram.args.getPathspec(), queue_or_write_archive_entry, context);
		if (err == 1) {
			err = 0;
		} 
		directory generatedBottom = context.getBottom();
		directory generatedUp = generatedBottom.getUp();
		while (generatedBottom) {
			directory next = generatedUp;
			ModernizedCProgram.free(generatedBottom);
			context.setBottom(next);
		}
		return err;
	}
	public int path_exists(Object path) {
		byte[] paths = new byte[]{path, ((Object)0)};
		path_exists_context ctx = new path_exists_context();
		int ret;
		ctx.setArgs(ModernizedCProgram.args);
		pathspec generatedPathspec = ctx.getPathspec();
		generatedPathspec.parse_pathspec(0, 0, "", paths);
		generatedPathspec.setRecursive(1);
		ret = ModernizedCProgram.read_tree_recursive(ModernizedCProgram.args.getRepo(), ModernizedCProgram.args.getTree(), "", 0, 0, generatedPathspec, reject_entry, ctx);
		generatedPathspec.clear_pathspec();
		return ret != 0;
	}
	public void parse_pathspec_arg(Object pathspec) {
		pathspec generatedPathspec = this.getPathspec();
		generatedPathspec.parse_pathspec(0, (1 << 1), "", pathspec);
		generatedPathspec.setRecursive(1);
		if (pathspec) {
			while (pathspec) {
				if (pathspec && !ar_args.path_exists(pathspec)) {
					ModernizedCProgram.die(ModernizedCProgram._("pathspec '%s' did not match any files"), pathspec);
				} 
				pathspec++;
			}
		} 
	}
	public void parse_treeish_arg(Object[][] argv, Object prefix, int remote) {
		byte name = argv[0];
		object_id commit_oid = new object_id();
		time_t archive_time = new time_t();
		tree tree = new tree();
		commit commit = new commit();
		object_id oid = new object_id();
		if (remote && !/* Remotes are only allowed to fetch actual refs */ModernizedCProgram.remote_allow_unreachable) {
			byte ref = ((Object)0);
			byte colon = ModernizedCProgram.gitstrchrnul(name, (byte)':');
			int refnamelen = colon - name;
			if (!oid.dwim_ref(name, refnamelen, ref)) {
				ModernizedCProgram.die(ModernizedCProgram._("no such ref: %.*s"), refnamelen, name);
			} 
			ModernizedCProgram.free(ref);
		} 
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, name, oid)) {
			ModernizedCProgram.die(ModernizedCProgram._("not a valid object name: %s"), name);
		} 
		repository generatedRepo = this.getRepo();
		commit = /*Error: Function owner not recognized*/lookup_commit_reference_gently(generatedRepo, oid, 1);
		if (commit) {
			commit_oid = commit.getObject().getOid();
			archive_time = commit.getDate();
		} else {
				commit_oid = ((Object)0);
				archive_time = /*Error: Function owner not recognized*/time(((Object)0));
		} 
		tree tree = new tree();
		tree = tree.parse_tree_indirect(oid);
		if (tree == ((Object)0)) {
			ModernizedCProgram.die(ModernizedCProgram._("not a tree object: %s"), ModernizedCProgram.oid_to_hex(oid));
		} 
		object generatedObject = tree.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (prefix) {
			object_id tree_oid = new object_id();
			int mode;
			int err;
			ModernizedCProgram.err = ModernizedCProgram.get_tree_entry(generatedRepo, generatedOid, prefix, tree_oid, mode);
			if (ModernizedCProgram.err || !(((mode) & -1024) == -1024)) {
				ModernizedCProgram.die(ModernizedCProgram._("current working directory is untracked"));
			} 
			tree = tree.parse_tree_indirect(tree_oid);
		} 
		this.setTree(tree);
		this.setCommit_oid(commit_oid);
		this.setCommit(commit);
		this.setTime(archive_time);
	}
	public int parse_archive_args(int argc, Object argv, Object ar, Object name_hint, int is_remote) {
		byte format = ((Object)0);
		byte base = ((Object)0);
		byte remote = ((Object)0);
		byte exec = ((Object)0);
		byte output = ((Object)0);
		int compression_level = -1;
		int verbose = 0;
		int i;
		int list = 0;
		int worktree_attributes = 0;
		option[] opts = new option[]{new option(parse_opt_type.OPTION_GROUP, 0, ((Object)0), ((Object)0), ((Object)0), ("")), new option(parse_opt_type.OPTION_STRING, (false), ("format"), (format), (("fmt")), (("archive format")), (false)), new option(parse_opt_type.OPTION_STRING, (false), ("prefix"), (base), (("prefix")), (("prepend prefix to each pathname in the archive")), (false)), new option(parse_opt_type.OPTION_STRING, ((byte)'o'), ("output"), (output), (("file")), (("write the archive to this file")), (false)), new option(parse_opt_type.OPTION_SET_INT, (false), ("worktree-attributes"), (worktree_attributes), ((Object)0), (("read .gitattributes in working directory")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_COUNTUP, ((byte)'v'), ("verbose"), ((verbose)), ((Object)0), ((("report archived files on stderr"))), parse_opt_option_flags.PARSE_OPT_NOARG | (false)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'0'), (((Object)0)), (compression_level), ((Object)0), (("store only")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG), ((Object)0), (false)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'1'), (((Object)0)), (compression_level), ((Object)0), (("compress faster")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'2'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'3'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'4'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'5'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'6'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'7'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'8'), (((Object)0)), (compression_level), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'9'), (((Object)0)), (compression_level), ((Object)0), (("compress better")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG), ((Object)0), (true)), new option(parse_opt_type.OPTION_GROUP, 0, ((Object)0), ((Object)0), ((Object)0), ("")), new option(parse_opt_type.OPTION_SET_INT, ((byte)'l'), ("list"), (list), ((Object)0), (("list supported archive formats")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_GROUP, 0, ((Object)0), ((Object)0), ((Object)0), ("")), new option(parse_opt_type.OPTION_STRING, (false), ("remote"), (remote), (("repo")), (("retrieve the archive from remote repository <repo>")), (false)), new option(parse_opt_type.OPTION_STRING, (false), ("exec"), (exec), (("command")), (("path to the remote git-upload-archive command")), (false)), new option(parse_opt_type.OPTION_END)};
		argc = ModernizedCProgram.parse_options(argc, argv, ((Object)0), opts, ModernizedCProgram.archive_usage, 0);
		if (remote) {
			ModernizedCProgram.die(ModernizedCProgram._("Unexpected option --remote"));
		} 
		if (exec) {
			ModernizedCProgram.die(ModernizedCProgram._("Option --exec can only be used together with --remote"));
		} 
		if (output) {
			ModernizedCProgram.die(ModernizedCProgram._("Unexpected option --output"));
		} 
		if (!base) {
			base = "";
		} 
		if (list) {
			for (i = 0; i < ModernizedCProgram.nr_archivers; i++) {
				if (!is_remote || ModernizedCProgram.archivers[i].getFlags() & 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", ModernizedCProgram.archivers[i].getName());
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\archive.c", 502, (false)));
		} 
		if (!format && name_hint) {
			format = ModernizedCProgram.archive_format_from_filename(name_hint);
		} 
		if (!format) {
			format = "tar";
		} 
		if (argc < /* We need at least one parameter -- tree-ish */1) {
			ModernizedCProgram.usage_with_options(ModernizedCProgram.archive_usage, opts);
		} 
		ar = ModernizedCProgram.lookup_archiver(format);
		if (!ar || (is_remote && !((ar).getFlags() & 2))) {
			ModernizedCProgram.die(ModernizedCProgram._("Unknown archive format '%s'"), format);
		} 
		ModernizedCProgram.args.setCompression_level(Z_DEFAULT_COMPRESSION);
		if (compression_level != -1) {
			if ((ar).getFlags() & 1) {
				ModernizedCProgram.args.setCompression_level(compression_level);
			} else {
					ModernizedCProgram.die(ModernizedCProgram._("Argument not supported for format '%s': -%d"), format, compression_level);
			} 
		} 
		ModernizedCProgram.args.setVerbose(verbose);
		ModernizedCProgram.args.setBase(base);
		ModernizedCProgram.args.setBaselen(/*Error: Function owner not recognized*/strlen(base));
		ModernizedCProgram.args.setWorktree_attributes(worktree_attributes);
		return argc;
	}
	public void write_extended_header(Object oid, Object buffer, long size) {
		ustar_header header = new ustar_header();
		int mode;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(header, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedTypeflag = header.getTypeflag();
		generatedTypeflag = (byte)'x';
		mode = 100666;
		Object generatedName = header.getName();
		ModernizedCProgram.xsnprintf(generatedName, /*Error: sizeof expression not supported yet*/, "%s.paxheader", ModernizedCProgram.oid_to_hex(oid));
		ModernizedCProgram.prepare_header(ModernizedCProgram.args, header, mode, size);
		ModernizedCProgram.write_blocked(header, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.write_blocked(buffer, size);
	}
	public int write_tar_entry(Object oid, Object path, Object pathlen, int mode) {
		ustar_header header = new ustar_header();
		strbuf ext_header = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int old_mode = mode;
		long size;
		long size_in_header;
		Object buffer;
		int err = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(header, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedTypeflag = header.getTypeflag();
		if ((((mode) & -1024) == -1024) || (((mode) & -1024) == 160000)) {
			generatedTypeflag = (byte)'5';
			mode = (mode | 777) & ~ModernizedCProgram.tar_umask;
		}  else if (/*Error: Function owner not recognized*/S_ISLNK(mode)) {
			generatedTypeflag = (byte)'2';
			mode |=  777;
		}  else if ((((mode) & -1024) == -1024)) {
			generatedTypeflag = (byte)'0';
			mode = (mode | ((mode & 100) ? 777 : 666)) & ~ModernizedCProgram.tar_umask;
		} else {
				return ();
		} 
		Object generatedName = header.getName();
		Object generatedPrefix = header.getPrefix();
		if (pathlen > /*Error: sizeof expression not supported yet*/) {
			size_t plen = ModernizedCProgram.get_path_prefix(path, pathlen, /*Error: sizeof expression not supported yet*/);
			size_t rest = pathlen - plen - 1;
			if (plen > 0 && rest <= /*Error: sizeof expression not supported yet*/) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPrefix, path, plen);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path + plen + 1, rest);
			} else {
					ModernizedCProgram.xsnprintf(generatedName, /*Error: sizeof expression not supported yet*/, "%s.data", ModernizedCProgram.oid_to_hex(oid));
					ext_header.strbuf_append_ext_header("path", path, pathlen);
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path, pathlen);
		} 
		if ((((mode) & -1024) == -1024) && !ModernizedCProgram.args.getConvert() && ModernizedCProgram.args.getRepo().oid_object_info(oid, size) == object_type.OBJ_BLOB && size > ModernizedCProgram.big_file_threshold) {
			buffer = ((Object)0);
		}  else if (/*Error: Function owner not recognized*/S_ISLNK(mode) || (((mode) & -1024) == -1024)) {
			object_type type;
			buffer = ModernizedCProgram.object_file_to_archive(ModernizedCProgram.args, path, oid, old_mode, object_type.type, size);
			if (!buffer) {
				return ();
			} 
		} else {
				buffer = ((Object)0);
				size = 0;
		} 
		Object generatedLinkname = header.getLinkname();
		if (/*Error: Function owner not recognized*/S_ISLNK(mode)) {
			if (size > /*Error: sizeof expression not supported yet*/) {
				ModernizedCProgram.xsnprintf(generatedLinkname, /*Error: sizeof expression not supported yet*/, "see %s.paxheader", ModernizedCProgram.oid_to_hex(oid));
				ext_header.strbuf_append_ext_header("linkpath", buffer, size);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedLinkname, buffer, size);
			} 
		} 
		size_in_header = size;
		if ((((mode) & -1024) == -1024) && size > -1024) {
			size_in_header = 0;
			ext_header.strbuf_append_ext_header_uint("size", size);
		} 
		ModernizedCProgram.prepare_header(ModernizedCProgram.args, header, mode, size_in_header);
		Object generatedLen = ext_header.getLen();
		byte[] generatedBuf = ext_header.getBuf();
		if (generatedLen > 0) {
			ModernizedCProgram.args.write_extended_header(oid, generatedBuf, generatedLen);
		} 
		ext_header.strbuf_release();
		ModernizedCProgram.write_blocked(header, /*Error: sizeof expression not supported yet*/);
		if ((((mode) & -1024) == -1024) && size > 0) {
			if (buffer) {
				ModernizedCProgram.write_blocked(buffer, size);
			} else {
					err = ModernizedCProgram.stream_blocked(oid);
			} 
		} 
		ModernizedCProgram.free(buffer);
		return err;
	}
	public void write_global_extended_header() {
		object_id oid = ModernizedCProgram.args.getCommit_oid();
		strbuf ext_header = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ustar_header header = new ustar_header();
		int mode;
		if (oid) {
			ext_header.strbuf_append_ext_header("comment", ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.the_repository.getHash_algo().getHexsz());
		} 
		if (ModernizedCProgram.args.getTime() > -1024) {
			ext_header.strbuf_append_ext_header_uint("mtime", ModernizedCProgram.args.getTime());
			ModernizedCProgram.args.setTime(-1024);
		} 
		Object generatedLen = ext_header.getLen();
		if (!generatedLen) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(header, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedTypeflag = header.getTypeflag();
		generatedTypeflag = (byte)'g';
		mode = 100666;
		Object generatedName = header.getName();
		ModernizedCProgram.xsnprintf(generatedName, /*Error: sizeof expression not supported yet*/, "pax_global_header");
		ModernizedCProgram.prepare_header(ModernizedCProgram.args, header, mode, generatedLen);
		ModernizedCProgram.write_blocked(header, /*Error: sizeof expression not supported yet*/);
		byte[] generatedBuf = ext_header.getBuf();
		ModernizedCProgram.write_blocked(generatedBuf, generatedLen);
		ext_header.strbuf_release();
	}
	public int write_tar_archive(Object ar) {
		int err = 0;
		ModernizedCProgram.args.write_global_extended_header();
		err = ModernizedCProgram.args.write_archive_entries(write_tar_entry);
		if (!err) {
			ModernizedCProgram.write_trailer();
		} 
		return err;
	}
	public int write_tar_filter_archive(Object ar) {
		strbuf cmd = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		child_process filter = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		byte[] argv = new byte[2];
		int r;
		if (!ar.getData()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\archive-tar.c", 452, "tar-filter archiver called with no filter defined");
		} 
		cmd.strbuf_addstr(ar.getData());
		if (ModernizedCProgram.args.getCompression_level() >= 0) {
			cmd.strbuf_addf(" -%d", ModernizedCProgram.args.getCompression_level());
		} 
		byte[] generatedBuf = cmd.getBuf();
		argv[0] = generatedBuf;
		argv[1] = ((Object)0);
		filter.setArgv(argv);
		filter.setUse_shell(1);
		filter.setIn(-1);
		if (filter.start_command() < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to start '%s' filter"), argv[0]);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(1);
		int generatedIn = filter.getIn();
		if (/*Error: Function owner not recognized*/dup2(generatedIn, 1) < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to redirect descriptor"));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedIn);
		r = ModernizedCProgram.args.write_tar_archive(ar);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(1);
		if (filter.finish_command() != 0) {
			ModernizedCProgram.die(ModernizedCProgram._("'%s' filter reported error"), argv[0]);
		} 
		cmd.strbuf_release();
		return r;
	}
	public int write_zip_entry(Object oid, Object path, Object pathlen, int mode) {
		zip_local_header header = new zip_local_header();
		uintmax_t offset = ModernizedCProgram.zip_offset;
		zip_extra_mtime extra = new zip_extra_mtime();
		zip64_extra extra64 = new zip64_extra();
		size_t header_extra_size = ((size_t)((zip_extra_mtime)0).get_end());
		int need_zip64_extra = 0;
		long attr2;
		long compressed_size;
		long crc;
		int method;
		byte out;
		Object deflated = ((Object)0);
		Object buffer;
		git_istream stream = ((Object)0);
		long flags = 0;
		long size;
		int is_binary = -1;
		byte path_without_prefix = path + ModernizedCProgram.args.getBaselen();
		int creator_version = 0;
		int version_needed = 10;
		size_t zip_dir_extra_size = ((size_t)((zip_extra_mtime)0).get_end());
		size_t zip64_dir_extra_payload_size = 0;
		crc = /*Error: Function owner not recognized*/crc32(0, ((Object)0), 0);
		if (!ModernizedCProgram.has_only_ascii(path)) {
			if (ModernizedCProgram.is_utf8(path)) {
				flags |=  (1 << 11);
			} else {
					ModernizedCProgram.warning(ModernizedCProgram._("path is not valid UTF-8: %s"), path);
			} 
		} 
		if (pathlen > -1024) {
			return ();
		} 
		git_istream git_istream = new git_istream();
		if ((((mode) & -1024) == -1024) || (((mode) & -1024) == 160000)) {
			method = 0;
			attr2 = 16;
			out = ((Object)0);
			size = 0;
			compressed_size = 0;
			buffer = ((Object)0);
		}  else if ((((mode) & -1024) == -1024) || /*Error: Function owner not recognized*/S_ISLNK(mode)) {
			object_type type = ModernizedCProgram.args.getRepo().oid_object_info(oid, size);
			method = 0;
			attr2 = /*Error: Function owner not recognized*/S_ISLNK(mode) ? ((mode | 777) << 16) : (mode & 111) ? ((mode) << 16) : 0;
			if (/*Error: Function owner not recognized*/S_ISLNK(mode) || (mode & 111)) {
				creator_version = -1024;
			} 
			if ((((mode) & -1024) == -1024) && ModernizedCProgram.args.getCompression_level() != 0 && size > 0) {
				method = 8;
			} 
			if ((((mode) & -1024) == -1024) && object_type.type == object_type.OBJ_BLOB && !ModernizedCProgram.args.getConvert() && size > ModernizedCProgram.big_file_threshold) {
				stream = git_istream.open_istream(oid, object_type.type, size, ((Object)0));
				if (!stream) {
					return ();
				} 
				flags |=  (1 << 3);
				out = buffer = ((Object)0);
			} else {
					buffer = ModernizedCProgram.object_file_to_archive(ModernizedCProgram.args, path, oid, mode, object_type.type, size);
					if (!buffer) {
						return ();
					} 
					crc = /*Error: Function owner not recognized*/crc32(crc, buffer, size);
					is_binary = ModernizedCProgram.args.getRepo().getIndex().entry_is_binary(path_without_prefix, buffer, size);
					out = buffer;
			} 
			compressed_size = (method == 0) ? size : 0;
		} else {
				return ();
		} 
		if (creator_version > ModernizedCProgram.max_creator_version) {
			ModernizedCProgram.max_creator_version = creator_version;
		} 
		if (buffer && method == 8) {
			out = deflated = ModernizedCProgram.zlib_deflate_raw(buffer, size, ModernizedCProgram.args.getCompression_level(), compressed_size);
			if (!out || compressed_size >= size) {
				out = buffer;
				method = 0;
				compressed_size = size;
			} 
		} 
		Object generatedMagic = extra.getMagic();
		ModernizedCProgram.copy_le16(generatedMagic, -1024);
		Object generatedExtra_size = extra.getExtra_size();
		ModernizedCProgram.copy_le16(generatedExtra_size, (((size_t)((zip_extra_mtime)0).get_end()) - ((size_t)((zip_extra_mtime)0).getFlags())));
		Object generatedFlags = extra.getFlags();
		generatedFlags[0] = /* just mtime */1;
		Object generatedMtime = extra.getMtime();
		ModernizedCProgram.copy_le32(generatedMtime, ModernizedCProgram.args.getTime());
		if (size > -1024 || compressed_size > -1024) {
			need_zip64_extra = 1;
		} 
		if (stream && size > -1024) {
			need_zip64_extra = 1;
		} 
		if (need_zip64_extra) {
			version_needed = 45;
		} 
		ModernizedCProgram.copy_le32(generatedMagic, -1024);
		Object generatedVersion = header.getVersion();
		ModernizedCProgram.copy_le16(generatedVersion, version_needed);
		ModernizedCProgram.copy_le16(generatedFlags, flags);
		Object generatedCompression_method = header.getCompression_method();
		ModernizedCProgram.copy_le16(generatedCompression_method, method);
		ModernizedCProgram.copy_le16(generatedMtime, ModernizedCProgram.zip_time);
		Object generatedMdate = header.getMdate();
		ModernizedCProgram.copy_le16(generatedMdate, ModernizedCProgram.zip_date);
		if (need_zip64_extra) {
			header.set_zip_header_data_desc(-1024, -1024, crc);
			header_extra_size += ((size_t)((zip64_extra)0).get_end());
		} else {
				header.set_zip_header_data_desc(size, compressed_size, crc);
		} 
		Object generatedFilename_length = header.getFilename_length();
		ModernizedCProgram.copy_le16(generatedFilename_length, pathlen);
		Object generatedExtra_length = header.getExtra_length();
		ModernizedCProgram.copy_le16(generatedExtra_length, header_extra_size);
		ModernizedCProgram.write_or_die(1, header, ((size_t)((zip_local_header)0).get_end()));
		ModernizedCProgram.zip_offset += ((size_t)((zip_local_header)0).get_end());
		ModernizedCProgram.write_or_die(1, path, pathlen);
		ModernizedCProgram.zip_offset += pathlen;
		ModernizedCProgram.write_or_die(1, extra, ((size_t)((zip_extra_mtime)0).get_end()));
		ModernizedCProgram.zip_offset += ((size_t)((zip_extra_mtime)0).get_end());
		Object generatedSize = extra64.getSize();
		Object generatedCompressed_size = extra64.getCompressed_size();
		if (need_zip64_extra) {
			ModernizedCProgram.copy_le16(generatedMagic, -1024);
			ModernizedCProgram.copy_le16(generatedExtra_size, (((size_t)((zip64_extra)0).get_end()) - ((size_t)((zip64_extra)0).getSize())));
			ModernizedCProgram.copy_le64(generatedSize, size);
			ModernizedCProgram.copy_le64(generatedCompressed_size, compressed_size);
			ModernizedCProgram.write_or_die(1, extra64, ((size_t)((zip64_extra)0).get_end()));
			ModernizedCProgram.zip_offset += ((size_t)((zip64_extra)0).get_end());
		} 
		Byte generatedNext_out = zstream.getNext_out();
		if (stream && method == 0) {
			byte[] buf = new byte[(1024 * 16)];
			ssize_t readlen = new ssize_t();
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				readlen = stream.read_istream(ModernizedCProgram.buf, /*Error: sizeof expression not supported yet*/);
				if (readlen <= 0) {
					break;
				} 
				crc = /*Error: Function owner not recognized*/crc32(crc, ModernizedCProgram.buf, readlen);
				if (is_binary == -1) {
					is_binary = ModernizedCProgram.args.getRepo().getIndex().entry_is_binary(path_without_prefix, ModernizedCProgram.buf, readlen);
				} 
				ModernizedCProgram.write_or_die(1, ModernizedCProgram.buf, readlen);
			}
			stream.close_istream();
			if (readlen) {
				return readlen;
			} 
			compressed_size = size;
			ModernizedCProgram.zip_offset += compressed_size;
			ModernizedCProgram.write_zip_data_desc(size, compressed_size, crc);
		}  else if (stream && method == 8) {
			byte[] buf = new byte[(1024 * 16)];
			ssize_t readlen = new ssize_t();
			git_zstream zstream = new git_zstream();
			int result;
			size_t out_len = new size_t();
			byte[] compressed = new byte[(1024 * 16) * 2];
			zstream.git_deflate_init_raw(ModernizedCProgram.args.getCompression_level());
			compressed_size = 0;
			zstream.setNext_out(compressed);
			zstream.setAvail_out(/*Error: sizeof expression not supported yet*/);
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				readlen = stream.read_istream(ModernizedCProgram.buf, /*Error: sizeof expression not supported yet*/);
				if (readlen <= 0) {
					break;
				} 
				crc = /*Error: Function owner not recognized*/crc32(crc, ModernizedCProgram.buf, readlen);
				if (is_binary == -1) {
					is_binary = ModernizedCProgram.args.getRepo().getIndex().entry_is_binary(path_without_prefix, ModernizedCProgram.buf, readlen);
				} 
				zstream.setNext_in(ModernizedCProgram.buf);
				zstream.setAvail_in(readlen);
				result = zstream.git_deflate(0);
				if (result != Z_OK) {
					ModernizedCProgram.die(ModernizedCProgram._("deflate error (%d)"), result);
				} 
				out_len = generatedNext_out - compressed;
				if (out_len > 0) {
					ModernizedCProgram.write_or_die(1, compressed, out_len);
					compressed_size += out_len;
					zstream.setNext_out(compressed);
					zstream.setAvail_out(/*Error: sizeof expression not supported yet*/);
				} 
			}
			stream.close_istream();
			if (readlen) {
				return readlen;
			} 
			zstream.setNext_in(ModernizedCProgram.buf);
			zstream.setAvail_in(0);
			result = zstream.git_deflate(Z_FINISH);
			if (result != Z_STREAM_END) {
				ModernizedCProgram.die("deflate error (%d)", result);
			} 
			zstream.git_deflate_end();
			out_len = generatedNext_out - compressed;
			ModernizedCProgram.write_or_die(1, compressed, out_len);
			compressed_size += out_len;
			ModernizedCProgram.zip_offset += compressed_size;
			ModernizedCProgram.write_zip_data_desc(size, compressed_size, crc);
		}  else if (compressed_size > 0) {
			ModernizedCProgram.write_or_die(1, out, compressed_size);
			ModernizedCProgram.zip_offset += compressed_size;
		} 
		ModernizedCProgram.free(deflated);
		ModernizedCProgram.free(buffer);
		if (compressed_size > -1024 || size > -1024 || offset > -1024) {
			if (compressed_size >= -1024) {
				zip64_dir_extra_payload_size += 8;
			} 
			if (size >= -1024) {
				zip64_dir_extra_payload_size += 8;
			} 
			if (offset >= -1024) {
				zip64_dir_extra_payload_size += 8;
			} 
			zip_dir_extra_size += 2 + 2 + zip64_dir_extra_payload_size;
		} 
		ModernizedCProgram.zip_dir.strbuf_add_le(4, /* magic */-1024);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, creator_version);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, version_needed);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, flags);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, method);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, ModernizedCProgram.zip_time);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, ModernizedCProgram.zip_date);
		ModernizedCProgram.zip_dir.strbuf_add_le(4, crc);
		ModernizedCProgram.zip_dir.strbuf_add_le(4, ModernizedCProgram.clamp32(compressed_size));
		ModernizedCProgram.zip_dir.strbuf_add_le(4, ModernizedCProgram.clamp32(size));
		ModernizedCProgram.zip_dir.strbuf_add_le(2, pathlen);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, zip_dir_extra_size);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, /* comment length */0);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, /* disk */0);
		ModernizedCProgram.zip_dir.strbuf_add_le(2, !is_binary);
		ModernizedCProgram.zip_dir.strbuf_add_le(4, attr2);
		ModernizedCProgram.zip_dir.strbuf_add_le(4, ModernizedCProgram.clamp32(offset));
		ModernizedCProgram.zip_dir.strbuf_add(path, pathlen);
		ModernizedCProgram.zip_dir.strbuf_add(extra, ((size_t)((zip_extra_mtime)0).get_end()));
		if (zip64_dir_extra_payload_size) {
			ModernizedCProgram.zip_dir.strbuf_add_le(2, /* magic */-1024);
			ModernizedCProgram.zip_dir.strbuf_add_le(2, zip64_dir_extra_payload_size);
			if (size >= -1024) {
				ModernizedCProgram.zip_dir.strbuf_add_le(8, size);
			} 
			if (compressed_size >= -1024) {
				ModernizedCProgram.zip_dir.strbuf_add_le(8, compressed_size);
			} 
			if (offset >= -1024) {
				ModernizedCProgram.zip_dir.strbuf_add_le(8, offset);
			} 
		} 
		ModernizedCProgram.zip_dir_entries++;
		return 0;
	}
	public int write_zip_archive(Object ar) {
		int err;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config(archive_zip_config, ((Object)0));
		ModernizedCProgram.dos_time(ModernizedCProgram.args.getTime(), ModernizedCProgram.zip_date, ModernizedCProgram.zip_time);
		ModernizedCProgram.zip_dir.strbuf_init(0);
		err = ModernizedCProgram.args.write_archive_entries(write_zip_entry);
		if (!err) {
			ModernizedCProgram.write_zip_trailer(ModernizedCProgram.args.getCommit_oid());
		} 
		ModernizedCProgram.zip_dir.strbuf_release();
		return err;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getBase() {
		return base;
	}
	public void setBase(Object newBase) {
		base = newBase;
	}
	public Object getBaselen() {
		return baselen;
	}
	public void setBaselen(Object newBaselen) {
		baselen = newBaselen;
	}
	public tree getTree() {
		return tree;
	}
	public void setTree(tree newTree) {
		tree = newTree;
	}
	public Object getCommit_oid() {
		return commit_oid;
	}
	public void setCommit_oid(Object newCommit_oid) {
		commit_oid = newCommit_oid;
	}
	public Object getCommit() {
		return commit;
	}
	public void setCommit(Object newCommit) {
		commit = newCommit;
	}
	public Object getTime() {
		return time;
	}
	public void setTime(Object newTime) {
		time = newTime;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getWorktree_attributes() {
		return worktree_attributes;
	}
	public void setWorktree_attributes(int newWorktree_attributes) {
		worktree_attributes = newWorktree_attributes;
	}
	public int getConvert() {
		return convert;
	}
	public void setConvert(int newConvert) {
		convert = newConvert;
	}
	public int getCompression_level() {
		return compression_level;
	}
	public void setCompression_level(int newCompression_level) {
		compression_level = newCompression_level;
	}
}
