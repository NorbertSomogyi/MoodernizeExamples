package application;

public class line_log_data {
	private line_log_data next;
	private Byte path;
	private byte status;
	private range_set ranges;
	private int arg_alloc;
	private int arg_nr;
	private Object args;
	private diff_filepair pair;
	private diff_ranges diff;
	
	public line_log_data(line_log_data next, Byte path, byte status, range_set ranges, int arg_alloc, int arg_nr, Object args, diff_filepair pair, diff_ranges diff) {
		setNext(next);
		setPath(path);
		setStatus(status);
		setRanges(ranges);
		setArg_alloc(arg_alloc);
		setArg_nr(arg_nr);
		setArgs(args);
		setPair(pair);
		setDiff(diff);
	}
	public line_log_data() {
	}
	
	public void line_log_data_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(r, 0, /*Error: Unsupported expression*/);
		range_set generatedRanges = this.getRanges();
		generatedRanges.range_set_init(0);
	}
	public void line_log_data_clear() {
		range_set generatedRanges = this.getRanges();
		generatedRanges.range_set_release();
		diff_filepair generatedPair = this.getPair();
		if (generatedPair) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filepair(generatedPair);
		} 
	}
	public void free_line_log_data() {
		line_log_data generatedNext = this.getNext();
		while (r) {
			line_log_data next = generatedNext;
			r.line_log_data_clear();
			ModernizedCProgram.free(r);
			r = next;
		}
	}
	public line_log_data search_line_log_data(Object path, line_log_data insertion_point) {
		line_log_data p = ModernizedCProgram.list;
		if (insertion_point) {
			insertion_point = ((Object)0);
		} 
		Byte generatedPath = p.getPath();
		line_log_data generatedNext = p.getNext();
		while (p) {
			int cmp = /*Error: Function owner not recognized*/strcmp(generatedPath, path);
			if (!cmp) {
				return p;
			} 
			if (insertion_point && cmp < 0) {
				insertion_point = p;
			} 
			p = generatedNext;
		}
		return ((Object)0/*
		 * Note: takes ownership of 'path', which happens to be what the only
		 * caller needs.
		 */);
	}
	public void line_log_data_insert(Byte path, long begin, long end) {
		line_log_data ip = new line_log_data();
		line_log_data p = ModernizedCProgram.list.search_line_log_data(path, ip);
		range_set generatedRanges = p.getRanges();
		if (p) {
			generatedRanges.range_set_append_unsafe(begin, end);
			ModernizedCProgram.free(path);
			return /*Error: Unsupported expression*/;
		} 
		p = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		p.setPath(path);
		generatedRanges.range_set_append(begin, end);
		line_log_data generatedNext = ip.getNext();
		if (ip) {
			p.setNext(generatedNext);
			ip.setNext(p);
		} else {
				p.setNext(ModernizedCProgram.list);
				ModernizedCProgram.list = p;
		} 
	}
	public line_log_data parse_lines(repository r, commit commit, Object prefix, string_list args) {
		long lines = 0;
		long ends = ((Object)0);
		nth_line_cb cb_data = new nth_line_cb();
		string_list_item item = new string_list_item();
		line_log_data ranges = ((Object)0);
		line_log_data p = new line_log_data();
		string_list_item[] generatedItems = (args).getItems();
		int generatedNr = (args).getNr();
		byte[] generatedString = item.getString();
		index_state generatedIndex = r.getIndex();
		range_set generatedRanges = p.getRanges();
		range[] generatedRanges = generatedRanges.getRanges();
		for (item = generatedItems; item && item < generatedItems + generatedNr; ++item) {
			byte name_part;
			byte range_part;
			byte full_name;
			diff_filespec spec = new diff_filespec();
			long begin = 0;
			long end = 0;
			long anchor;
			name_part = generatedIndex.skip_range_arg(generatedString);
			if (!name_part || name_part != (byte)':' || !name_part[1]) {
				ModernizedCProgram.die("-L argument not 'start,end:file' or ':funcname:file': %s", generatedString);
			} 
			range_part = ModernizedCProgram.xstrndup(generatedString, name_part - generatedString);
			name_part++;
			full_name = ModernizedCProgram.prefix_path(prefix, prefix ? /*Error: Function owner not recognized*/strlen(prefix) : 0, name_part);
			spec = /*Error: Function owner not recognized*/alloc_filespec(full_name);
			ModernizedCProgram.fill_blob_sha1(r, commit, spec);
			ModernizedCProgram.fill_line_ends(r, spec, lines, ends);
			cb_data.setSpec(spec);
			cb_data.setLines(lines);
			cb_data.setLine_ends(ends);
			p = ranges.search_line_log_data(full_name, ((Object)0));
			if (p && generatedNr) {
				anchor = generatedRanges[generatedNr - 1].getEnd() + 1;
			} else {
					anchor = 1;
			} 
			if (generatedIndex.parse_range_arg(range_part, nth_line, cb_data, lines, anchor, begin, end, full_name)) {
				ModernizedCProgram.die("malformed -L argument '%s'", range_part);
			} 
			if ((!lines && (begin || end)) || lines < begin) {
				ModernizedCProgram.die("file %s has only %lu lines", name_part, lines);
			} 
			if (begin < 1) {
				begin = 1;
			} 
			if (end < 1 || lines < end) {
				end = lines;
			} 
			begin--;
			ranges.line_log_data_insert(full_name, begin, end);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_filespec(spec);
			do {
				ModernizedCProgram.free(ends);
				(ends) = ((Object)0);
			} while (0);
		}
		line_log_data generatedNext = p.getNext();
		for (p = ranges; p; p = generatedNext) {
			generatedRanges.sort_and_merge_range_set();
		}
		return ranges;
	}
	public line_log_data line_log_data_copy_one() {
		line_log_data ret = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		((r) ? (Object)0 : /*Error: Function owner not recognized*/_assert("r", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 628));
		ret.line_log_data_init();
		range_set generatedRanges = ret.getRanges();
		generatedRanges.range_set_copy(generatedRanges);
		Byte generatedPath = this.getPath();
		ret.setPath(ModernizedCProgram.xstrdup(generatedPath));
		return ret;
	}
	public line_log_data line_log_data_copy() {
		line_log_data ret = ((Object)0);
		line_log_data tmp = ((Object)0);
		line_log_data prev = ((Object)0);
		((r) ? (Object)0 : /*Error: Function owner not recognized*/_assert("r", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 643));
		ret = tmp = prev = r.line_log_data_copy_one();
		line_log_data generatedNext = this.getNext();
		r = generatedNext;
		while (r) {
			tmp = r.line_log_data_copy_one();
			prev.setNext(tmp);
			prev = tmp;
			r = generatedNext;
		}
		return ret;
	}
	public line_log_data line_log_data_merge(line_log_data b) {
		line_log_data head = ((Object)0);
		line_log_data pp = head;
		Byte generatedPath = this.getPath();
		line_log_data generatedNext = this.getNext();
		range_set generatedRanges = d.getRanges();
		while (a || b) {
			line_log_data src = new line_log_data();
			line_log_data src2 = ((Object)0);
			line_log_data d = new line_log_data();
			int cmp;
			if (!a) {
				cmp = 1;
			}  else if (!b) {
				cmp = -1;
			} else {
					cmp = /*Error: Function owner not recognized*/strcmp(generatedPath, generatedPath);
			} 
			if (cmp < 0) {
				src = a;
				a = generatedNext;
			}  else if (cmp == 0) {
				src = a;
				a = generatedNext;
				src2 = b;
				b = generatedNext;
			} else {
					src = b;
					b = generatedNext;
			} 
			d = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
			d.line_log_data_init();
			d.setPath(ModernizedCProgram.xstrdup(generatedPath));
			pp = d;
			pp = generatedNext;
			if (src2) {
				generatedRanges.range_set_union(generatedRanges, generatedRanges);
			} else {
					generatedRanges.range_set_copy(generatedRanges);
			} 
		}
		return head;
	}
	public line_log_data lookup_line_range(rev_info revs, commit commit) {
		line_log_data ret = ((Object)0);
		line_log_data d = new line_log_data();
		decoration generatedLine_log_data = revs.getLine_log_data();
		object generatedObject = commit.getObject();
		ret = generatedLine_log_data.lookup_decoration(generatedObject);
		range_set generatedRanges = d.getRanges();
		line_log_data generatedNext = d.getNext();
		for (d = ret; d; d = generatedNext) {
			generatedRanges.range_set_check_invariants();
		}
		return ret;
	}
	public void filter_diffs_for_paths(int keep_deletions) {
		int i;
		diff_queue_struct outq = new diff_queue_struct();
		do {
			(outq).setQueue(((Object)0));
			(outq).setNr((outq).setAlloc(0));
		} while (0);
		diff_filespec generatedTwo = p.getTwo();
		int generatedMode = (generatedTwo).getMode();
		Byte generatedPath = rg.getPath();
		line_log_data generatedNext = rg.getNext();
		for (i = 0; i < ModernizedCProgram.diff_queued_diff.getNr(); i++) {
			diff_filepair p = ModernizedCProgram.diff_queued_diff.getQueue()[i];
			line_log_data rg = ((Object)0);
			if (!((generatedMode) != 0)) {
				if (keep_deletions) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, p);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filepair(p);
				} 
				continue;
			} 
			for (rg = range; rg; rg = generatedNext) {
				if (!/*Error: Function owner not recognized*/strcmp(generatedPath, generatedPath)) {
					break;
				} 
			}
			if (rg) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, p);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filepair(p);
			} 
		}
		ModernizedCProgram.free(ModernizedCProgram.diff_queued_diff.getQueue());
		ModernizedCProgram.diff_queued_diff = outq;
	}
	public line_log_data getNext() {
		return next;
	}
	public void setNext(line_log_data newNext) {
		next = newNext;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte newStatus) {
		status = newStatus;
	}
	public range_set getRanges() {
		return ranges;
	}
	public void setRanges(range_set newRanges) {
		ranges = newRanges;
	}
	public int getArg_alloc() {
		return arg_alloc;
	}
	public void setArg_alloc(int newArg_alloc) {
		arg_alloc = newArg_alloc;
	}
	public int getArg_nr() {
		return arg_nr;
	}
	public void setArg_nr(int newArg_nr) {
		arg_nr = newArg_nr;
	}
	public Object getArgs() {
		return args;
	}
	public void setArgs(Object newArgs) {
		args = newArgs;
	}
	public diff_filepair getPair() {
		return pair;
	}
	public void setPair(diff_filepair newPair) {
		pair = newPair;
	}
	public diff_ranges getDiff() {
		return diff;
	}
	public void setDiff(diff_ranges newDiff) {
		diff = newDiff;
	}
}
