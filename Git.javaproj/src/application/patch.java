package application;

public class patch {
	private Byte new_name;
	private Byte old_name;
	private Byte def_name;
	private int old_mode;
	private int new_mode;
	private int is_new;
	private int is_delete;
	private int rejected;
	private int ws_rule;
	private int lines_added;
	private int lines_deleted;
	private int score;
	private int extension_linenr;
	private int is_toplevel_relative;
	private int inaccurate_eof;
	private int is_binary;
	private int is_copy;
	private int is_rename;
	private int recount;
	private int conflicted_threeway;
	private int direct_to_threeway;
	private int crlf_in_old;
	private fragment fragments;
	private Byte result;
	private Object resultsize;
	private Object old_oid_prefix;
	private Object new_oid_prefix;
	private patch next;
	private Object threeway_stage;
	
	public patch(Byte new_name, Byte old_name, Byte def_name, int old_mode, int new_mode, int is_new, int is_delete, int rejected, int ws_rule, int lines_added, int lines_deleted, int score, int extension_linenr, int is_toplevel_relative, int inaccurate_eof, int is_binary, int is_copy, int is_rename, int recount, int conflicted_threeway, int direct_to_threeway, int crlf_in_old, fragment fragments, Byte result, Object resultsize, Object old_oid_prefix, Object new_oid_prefix, patch next, Object threeway_stage) {
		setNew_name(new_name);
		setOld_name(old_name);
		setDef_name(def_name);
		setOld_mode(old_mode);
		setNew_mode(new_mode);
		setIs_new(is_new);
		setIs_delete(is_delete);
		setRejected(rejected);
		setWs_rule(ws_rule);
		setLines_added(lines_added);
		setLines_deleted(lines_deleted);
		setScore(score);
		setExtension_linenr(extension_linenr);
		setIs_toplevel_relative(is_toplevel_relative);
		setInaccurate_eof(inaccurate_eof);
		setIs_binary(is_binary);
		setIs_copy(is_copy);
		setIs_rename(is_rename);
		setRecount(recount);
		setConflicted_threeway(conflicted_threeway);
		setDirect_to_threeway(direct_to_threeway);
		setCrlf_in_old(crlf_in_old);
		setFragments(fragments);
		setResult(result);
		setResultsize(resultsize);
		setOld_oid_prefix(old_oid_prefix);
		setNew_oid_prefix(new_oid_prefix);
		setNext(next);
		setThreeway_stage(threeway_stage);
	}
	public patch() {
	}
	
	public void free_patch() {
		fragment generatedFragments = this.getFragments();
		generatedFragments.free_fragment_list();
		Byte generatedDef_name = this.getDef_name();
		ModernizedCProgram.free(generatedDef_name);
		Byte generatedOld_name = this.getOld_name();
		ModernizedCProgram.free(generatedOld_name);
		Byte generatedNew_name = this.getNew_name();
		ModernizedCProgram.free(generatedNew_name);
		Byte generatedResult = this.getResult();
		ModernizedCProgram.free(generatedResult);
		ModernizedCProgram.free(patch);
	}
	public void free_patch_list() {
		while (ModernizedCProgram.list) {
			patch next = ModernizedCProgram.list.getNext();
			ModernizedCProgram.list.free_patch();
			ModernizedCProgram.list = next/*
			 * A line in a file, len-bytes long (includes the terminating LF,
			 * except for an incomplete line at the end if the file ends with
			 * one), and its contents hashes to 'hash'.
			 */;
		}
	}
	public int check_header_line(int linenr) {
		int generatedIs_delete = this.getIs_delete();
		int generatedIs_new = this.getIs_new();
		int generatedIs_rename = this.getIs_rename();
		int generatedIs_copy = this.getIs_copy();
		int extensions = (generatedIs_delete == 1) + (generatedIs_new == 1) + (generatedIs_rename == 1) + (generatedIs_copy == 1);
		if (extensions > 1) {
			return ();
		} 
		int generatedExtension_linenr = this.getExtension_linenr();
		if (extensions && !generatedExtension_linenr) {
			this.setExtension_linenr(linenr);
		} 
		return 0;
	}
	public void check_old_for_crlf(Object[] line, int len) {
		int generatedWs_rule = this.getWs_rule();
		if (len >= 2 && line[len - 1] == (byte)'\n' && line[len - 2] == (byte)'\r') {
			generatedWs_rule |=  1000;
			this.setCrlf_in_old(1/*
			 * Parse a unified diff. Note that this really needs to parse each
			 * fragment separately, since the only way to know the difference
			 * between a "---" that is part of a patch, and a "---" that starts
			 * the next patch is to look at the line counts..
			 */);
		} 
	}
	public int metadata_changes() {
		int generatedIs_rename = this.getIs_rename();
		int generatedIs_copy = this.getIs_copy();
		int generatedIs_new = this.getIs_new();
		int generatedIs_delete = this.getIs_delete();
		int generatedOld_mode = this.getOld_mode();
		int generatedNew_mode = this.getNew_mode();
		return generatedIs_rename > 0 || generatedIs_copy > 0 || generatedIs_new > 0 || generatedIs_delete || (generatedOld_mode && generatedNew_mode && generatedOld_mode != generatedNew_mode);
	}
	public void reverse_patches() {
		fragment generatedFragments = this.getFragments();
		Byte generatedNew_name = this.getNew_name();
		Byte generatedOld_name = this.getOld_name();
		int generatedNew_mode = this.getNew_mode();
		int generatedOld_mode = this.getOld_mode();
		int generatedIs_new = this.getIs_new();
		int generatedIs_delete = this.getIs_delete();
		int generatedLines_added = this.getLines_added();
		int generatedLines_deleted = this.getLines_deleted();
		Object generatedOld_oid_prefix = this.getOld_oid_prefix();
		Object generatedNew_oid_prefix = this.getNew_oid_prefix();
		long generatedNewpos = frag.getNewpos();
		long generatedOldpos = frag.getOldpos();
		long generatedNewlines = frag.getNewlines();
		long generatedOldlines = frag.getOldlines();
		fragment generatedNext = frag.getNext();
		for (; p; p = generatedNext) {
			fragment frag = generatedFragments;
			do {
				Object _swap_a_ptr = (generatedNew_name);
				Object _swap_b_ptr = (generatedOld_name);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (generatedNew_mode);
				Object _swap_b_ptr = (generatedOld_mode);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (generatedIs_new);
				Object _swap_b_ptr = (generatedIs_delete);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (generatedLines_added);
				Object _swap_b_ptr = (generatedLines_deleted);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (generatedOld_oid_prefix);
				Object _swap_b_ptr = (generatedNew_oid_prefix);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			for (; frag; frag = generatedNext) {
				do {
					Object _swap_a_ptr = (generatedNewpos);
					Object _swap_b_ptr = (generatedOldpos);
					byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
				} while (0);
				do {
					Object _swap_a_ptr = (generatedNewlines);
					Object _swap_b_ptr = (generatedOldlines);
					byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
				} while (0);
			}
		}
	}
	public patch in_fn_table(apply_state state, Object name) {
		string_list_item item = new string_list_item();
		if (name == ((Object)0)) {
			return ((Object)0);
		} 
		string_list generatedFn_table = state.getFn_table();
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_lookup(generatedFn_table, name);
		Object generatedUtil = item.getUtil();
		if (item != ((Object)0)) {
			return (patch)generatedUtil;
		} 
		return ((Object)0/*
		 * item->util in the filename table records the status of the path.
		 * Usually it points at a patch (whose result records the contents
		 * of it after applying it), but it could be PATH_WAS_DELETED for a
		 * path that a previously applied patch has already removed, or
		 * PATH_TO_BE_DELETED for a path that a later patch would remove.
		 *
		 * The latter is needed to deal with a case where two paths A and B
		 * are swapped by first renaming A to B and then renaming B to A;
		 * moving A to B should not be prevented due to presence of B as we
		 * will remove it in a later patch.
		 */);
	}
	public int to_be_deleted() {
		return patch == ((patch)-2);
	}
	public int was_deleted() {
		return patch == ((patch)-1);
	}
	public patch previous_patch(apply_state state, Integer gone) {
		patch previous = new patch();
		gone = 0;
		int generatedIs_copy = this.getIs_copy();
		int generatedIs_rename = this.getIs_rename();
		if (generatedIs_copy || generatedIs_rename) {
			return ((Object)/* "git" patches do not depend on the order */0);
		} 
		Byte generatedOld_name = this.getOld_name();
		patch patch = new patch();
		previous = patch.in_fn_table(state, generatedOld_name);
		if (!previous) {
			return ((Object)0);
		} 
		if (previous.to_be_deleted()) {
			return ((Object)/* the deletion hasn't happened yet */0);
		} 
		if (previous.was_deleted()) {
			gone = 1;
		} 
		return previous;
	}
	public int check_unsafe_path() {
		byte old_name = ((Object)0);
		byte new_name = ((Object)0);
		int generatedIs_delete = this.getIs_delete();
		Byte generatedOld_name = this.getOld_name();
		int generatedIs_new = this.getIs_new();
		int generatedIs_copy = this.getIs_copy();
		if (generatedIs_delete) {
			old_name = generatedOld_name;
		}  else if (!generatedIs_new && !generatedIs_copy) {
			old_name = generatedOld_name;
		} 
		Byte generatedNew_name = this.getNew_name();
		if (!generatedIs_delete) {
			new_name = generatedNew_name;
		} 
		int generatedOld_mode = this.getOld_mode();
		if (old_name && !ModernizedCProgram.verify_path(old_name, generatedOld_mode)) {
			return ();
		} 
		int generatedNew_mode = this.getNew_mode();
		if (new_name && !ModernizedCProgram.verify_path(new_name, generatedNew_mode)) {
			return ();
		} 
		return 0/*
		 * Check and apply the patch in-core; leave the result in patch->result
		 * for the caller to write it out to the final destination.
		 */;
	}
	public void show_mode_change(int show_name) {
		int generatedOld_mode = this.getOld_mode();
		int generatedNew_mode = this.getNew_mode();
		Byte generatedNew_name = this.getNew_name();
		if (generatedOld_mode && generatedNew_mode && generatedOld_mode != generatedNew_mode) {
			if (show_name) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" mode change %06o => %06o %s\n", generatedOld_mode, generatedNew_mode, generatedNew_name);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" mode change %06o => %06o\n", generatedOld_mode, generatedNew_mode);
			} 
		} 
	}
	public void show_rename_copy() {
		int generatedIs_rename = this.getIs_rename();
		byte renamecopy = generatedIs_rename ? "rename" : "copy";
		byte old_name;
		byte new_name;
		Byte generatedOld_name = this.getOld_name();
		old_name = generatedOld_name;
		Byte generatedNew_name = this.getNew_name();
		new_name = generatedNew_name;
		while (1) {
			byte slash_old;
			byte slash_new;
			slash_old = /*Error: Function owner not recognized*/strchr(old_name, (byte)'/');
			slash_new = /*Error: Function owner not recognized*/strchr(new_name, (byte)'/');
			if (!slash_old || !slash_new || slash_old - old_name != slash_new - new_name || /*Error: Function owner not recognized*/memcmp(old_name, new_name, slash_new - new_name)) {
				break;
			} 
			old_name = slash_old + 1;
			new_name = slash_new + 1/* p->old_name thru old_name is the common prefix, and old_name and new_name
				 * through the end of names are renames
				 */;
		}
		int generatedScore = this.getScore();
		if (old_name != generatedOld_name) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" %s %.*s{%s => %s} (%d%%)\n", renamecopy, (int)(old_name - generatedOld_name), generatedOld_name, old_name, new_name, generatedScore);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" %s %s => %s (%d%%)\n", renamecopy, generatedOld_name, generatedNew_name, generatedScore);
		} 
		p.show_mode_change(0);
	}
	public void summary_patch_list() {
		patch p = new patch();
		int generatedIs_new = p.getIs_new();
		int generatedNew_mode = p.getNew_mode();
		Byte generatedNew_name = p.getNew_name();
		int generatedIs_delete = p.getIs_delete();
		int generatedOld_mode = p.getOld_mode();
		Byte generatedOld_name = p.getOld_name();
		int generatedIs_rename = p.getIs_rename();
		int generatedIs_copy = p.getIs_copy();
		int generatedScore = p.getScore();
		patch generatedNext = p.getNext();
		for (p = patch; p; p = generatedNext) {
			if (generatedIs_new) {
				ModernizedCProgram.show_file_mode_name("create", generatedNew_mode, generatedNew_name);
			}  else if (generatedIs_delete) {
				ModernizedCProgram.show_file_mode_name("delete", generatedOld_mode, generatedOld_name);
			} else {
					if (generatedIs_rename || generatedIs_copy) {
						p.show_rename_copy();
					} else {
							if (generatedScore) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" rewrite %s (%d%%)\n", generatedNew_name, generatedScore);
								p.show_mode_change(0);
							} else {
									p.show_mode_change(1);
							} 
					} 
			} 
		}
	}
	public Byte getNew_name() {
		return new_name;
	}
	public void setNew_name(Byte newNew_name) {
		new_name = newNew_name;
	}
	public Byte getOld_name() {
		return old_name;
	}
	public void setOld_name(Byte newOld_name) {
		old_name = newOld_name;
	}
	public Byte getDef_name() {
		return def_name;
	}
	public void setDef_name(Byte newDef_name) {
		def_name = newDef_name;
	}
	public int getOld_mode() {
		return old_mode;
	}
	public void setOld_mode(int newOld_mode) {
		old_mode = newOld_mode;
	}
	public int getNew_mode() {
		return new_mode;
	}
	public void setNew_mode(int newNew_mode) {
		new_mode = newNew_mode;
	}
	public int getIs_new() {
		return is_new;
	}
	public void setIs_new(int newIs_new) {
		is_new = newIs_new;
	}
	public int getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(int newIs_delete) {
		is_delete = newIs_delete;
	}
	public int getRejected() {
		return rejected;
	}
	public void setRejected(int newRejected) {
		rejected = newRejected;
	}
	public int getWs_rule() {
		return ws_rule;
	}
	public void setWs_rule(int newWs_rule) {
		ws_rule = newWs_rule;
	}
	public int getLines_added() {
		return lines_added;
	}
	public void setLines_added(int newLines_added) {
		lines_added = newLines_added;
	}
	public int getLines_deleted() {
		return lines_deleted;
	}
	public void setLines_deleted(int newLines_deleted) {
		lines_deleted = newLines_deleted;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int newScore) {
		score = newScore;
	}
	public int getExtension_linenr() {
		return extension_linenr;
	}
	public void setExtension_linenr(int newExtension_linenr) {
		extension_linenr = newExtension_linenr;
	}
	public int getIs_toplevel_relative() {
		return is_toplevel_relative;
	}
	public void setIs_toplevel_relative(int newIs_toplevel_relative) {
		is_toplevel_relative = newIs_toplevel_relative;
	}
	public int getInaccurate_eof() {
		return inaccurate_eof;
	}
	public void setInaccurate_eof(int newInaccurate_eof) {
		inaccurate_eof = newInaccurate_eof;
	}
	public int getIs_binary() {
		return is_binary;
	}
	public void setIs_binary(int newIs_binary) {
		is_binary = newIs_binary;
	}
	public int getIs_copy() {
		return is_copy;
	}
	public void setIs_copy(int newIs_copy) {
		is_copy = newIs_copy;
	}
	public int getIs_rename() {
		return is_rename;
	}
	public void setIs_rename(int newIs_rename) {
		is_rename = newIs_rename;
	}
	public int getRecount() {
		return recount;
	}
	public void setRecount(int newRecount) {
		recount = newRecount;
	}
	public int getConflicted_threeway() {
		return conflicted_threeway;
	}
	public void setConflicted_threeway(int newConflicted_threeway) {
		conflicted_threeway = newConflicted_threeway;
	}
	public int getDirect_to_threeway() {
		return direct_to_threeway;
	}
	public void setDirect_to_threeway(int newDirect_to_threeway) {
		direct_to_threeway = newDirect_to_threeway;
	}
	public int getCrlf_in_old() {
		return crlf_in_old;
	}
	public void setCrlf_in_old(int newCrlf_in_old) {
		crlf_in_old = newCrlf_in_old;
	}
	public fragment getFragments() {
		return fragments;
	}
	public void setFragments(fragment newFragments) {
		fragments = newFragments;
	}
	public Byte getResult() {
		return result;
	}
	public void setResult(Byte newResult) {
		result = newResult;
	}
	public Object getResultsize() {
		return resultsize;
	}
	public void setResultsize(Object newResultsize) {
		resultsize = newResultsize;
	}
	public Object getOld_oid_prefix() {
		return old_oid_prefix;
	}
	public void setOld_oid_prefix(Object newOld_oid_prefix) {
		old_oid_prefix = newOld_oid_prefix;
	}
	public Object getNew_oid_prefix() {
		return new_oid_prefix;
	}
	public void setNew_oid_prefix(Object newNew_oid_prefix) {
		new_oid_prefix = newNew_oid_prefix;
	}
	public patch getNext() {
		return next;
	}
	public void setNext(patch newNext) {
		next = newNext;
	}
	public Object getThreeway_stage() {
		return threeway_stage;
	}
	public void setThreeway_stage(Object newThreeway_stage) {
		threeway_stage = newThreeway_stage;
	}
}
/*
 * Some aspects of the apply behavior are controlled by the following
 * bits in the "options" parameter passed to apply_all_patches().
 */
