package application;

public class attr_stack {
	private attr_stack prev;
	private Byte origin;
	private Object originlen;
	private int num_matches;
	private int alloc;
	private match_attr[][] attrs;
	
	public attr_stack(attr_stack prev, Byte origin, Object originlen, int num_matches, int alloc, match_attr[][] attrs) {
		setPrev(prev);
		setOrigin(origin);
		setOriginlen(originlen);
		setNum_matches(num_matches);
		setAlloc(alloc);
		setAttrs(attrs);
	}
	public attr_stack() {
	}
	
	public void attr_stack_free() {
		int i;
		Byte generatedOrigin = this.getOrigin();
		ModernizedCProgram.free(generatedOrigin);
		int generatedNum_matches = this.getNum_matches();
		match_attr[][] generatedAttrs = this.getAttrs();
		int generatedNum_attr = a.getNum_attr();
		Object generatedState = a.getState();
		for (i = 0; i < generatedNum_matches; i++) {
			match_attr a = generatedAttrs[i];
			int j;
			for (j = 0; j < generatedNum_attr; j++) {
				byte setto = generatedState[j].getSetto();
				if (setto == ModernizedCProgram.git_attr__true || setto == ModernizedCProgram.git_attr__false || setto == ((Object)0) || setto == ModernizedCProgram.git_attr__unknown) {
					;
				} else {
						ModernizedCProgram.free((byte)setto);
				} 
			}
			ModernizedCProgram.free(a);
		}
		ModernizedCProgram.free(generatedAttrs);
		ModernizedCProgram.free(e);
	}
	public void drop_attr_stack() {
		attr_stack generatedPrev = elem.getPrev();
		while (stack) {
			attr_stack elem = stack;
			stack = generatedPrev;
			elem.attr_stack_free();
		}
	}
	public void handle_attr_line(Object line, Object src, int lineno, int macro_ok) {
		match_attr a = new match_attr();
		match_attr match_attr = new match_attr();
		a = match_attr.parse_attr_line(line, src, lineno, macro_ok);
		if (!a) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedNum_matches = this.getNum_matches();
		int generatedAlloc = this.getAlloc();
		match_attr[][] generatedAttrs = this.getAttrs();
		do {
			if ((generatedNum_matches + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNum_matches + 1)) {
					this.setAlloc((generatedNum_matches + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedAttrs) = ModernizedCProgram.xrealloc((generatedAttrs), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
			} 
		} while (0);
		generatedAttrs[generatedNum_matches++] = a;
	}
	public attr_stack read_attr_from_array(Object list) {
		attr_stack res = new attr_stack();
		byte line;
		int lineno = 0;
		res = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		while ((line = (list++)) != ((Object)0)) {
			res.handle_attr_line(line, "[builtin]", ++lineno, 1);
		}
		return res/*
		 * Callers into the attribute system assume there is a single, system-wide
		 * global state where attributes are read from and when the state is flipped by
		 * calling git_attr_set_direction(), the stack frames that have been
		 * constructed need to be discarded so so that subsequent calls into the
		 * attribute system will lazily read from the right place.  Since changing
		 * direction causes a global paradigm shift, it should not ever be called while
		 * another thread could potentially be calling into the attribute system.
		 */;
	}
	public attr_stack read_attr_from_file(Object path, int macro_ok) {
		FILE fp = ModernizedCProgram.fopen_or_warn(path, "r");
		attr_stack res = new attr_stack();
		byte[] buf = new byte[2048];
		int lineno = 0;
		if (!fp) {
			return ((Object)0);
		} 
		res = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		while (/*Error: Function owner not recognized*/fgets(buf, /*Error: sizeof expression not supported yet*/, fp)) {
			byte bufp = buf;
			if (!lineno) {
				ModernizedCProgram.skip_utf8_bom(bufp, /*Error: Function owner not recognized*/strlen(bufp));
			} 
			res.handle_attr_line(bufp, path, ++lineno, macro_ok);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
		return res;
	}
	public attr_stack read_attr_from_index(Object istate, Object path, int macro_ok) {
		attr_stack res = new attr_stack();
		byte buf;
		byte sp;
		int lineno = 0;
		if (!istate) {
			return ((Object)0);
		} 
		buf = ModernizedCProgram.read_blob_data_from_index(istate, path, ((Object)0));
		if (!buf) {
			return ((Object)0);
		} 
		res = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		for (sp = buf; sp; /*Error: Unsupported expression*/) {
			byte ep;
			int more;
			ep = ModernizedCProgram.gitstrchrnul(sp, (byte)'\n');
			more = (ep == (byte)'\n');
			ep = (byte)'\0';
			res.handle_attr_line(sp, path, ++lineno, macro_ok);
			sp = ep + more;
		}
		ModernizedCProgram.free(buf);
		return res;
	}
	public attr_stack read_attr(Object istate, Object path, int macro_ok) {
		attr_stack res = ((Object)0);
		attr_stack attr_stack = new attr_stack();
		attr_stack attr_stack = new attr_stack();
		if (git_attr_direction.direction == git_attr_direction.GIT_ATTR_INDEX) {
			res = attr_stack.read_attr_from_index(istate, path, macro_ok);
		}  else if (!ModernizedCProgram.is_bare_repository()) {
			if (git_attr_direction.direction == git_attr_direction.GIT_ATTR_CHECKOUT) {
				res = attr_stack.read_attr_from_index(istate, path, macro_ok);
				if (!res) {
					res = attr_stack.read_attr_from_file(path, macro_ok);
				} 
			}  else if (git_attr_direction.direction == git_attr_direction.GIT_ATTR_CHECKIN) {
				res = attr_stack.read_attr_from_file(path, macro_ok);
				if (!res/*
								 * There is no checked out .gitattributes file
								 * there, but we might have it in the index.
								 * We allow operation in a sparsely checked out
								 * work tree, so read from it.
								 */) {
					res = attr_stack.read_attr_from_index(istate, path, macro_ok);
				} 
			} 
		} 
		if (!res) {
			res = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		} 
		return res;
	}
	public void push_stack(attr_stack elem, Byte origin, Object originlen) {
		if (elem) {
			elem.setOrigin(origin);
			if (origin) {
				elem.setOriginlen(originlen);
			} 
			elem.setPrev(attr_stack_p);
			attr_stack_p = elem;
		} 
	}
	public void bootstrap_attr_stack(Object istate) {
		attr_stack e = new attr_stack();
		if (stack) {
			return /*Error: Unsupported expression*/;
		} 
		attr_stack attr_stack = new attr_stack();
		e = attr_stack.read_attr_from_array(/* builtin frame */ModernizedCProgram.builtin_attr);
		stack.push_stack(e, ((Object)0), 0);
		attr_stack attr_stack = new attr_stack();
		if (ModernizedCProgram.git_attr_system()) {
			e = attr_stack.read_attr_from_file(ModernizedCProgram.git_etc_gitattributes(), 1);
			stack.push_stack(e, ((Object)0), 0);
		} 
		if (ModernizedCProgram.get_home_gitattributes()) {
			e = attr_stack.read_attr_from_file(ModernizedCProgram.get_home_gitattributes(), 1);
			stack.push_stack(e, ((Object)0), 0);
		} 
		attr_stack attr_stack = new attr_stack();
		e = attr_stack.read_attr(istate, ".gitattributes", /* root directory */1);
		stack.push_stack(e, ModernizedCProgram.xstrdup(""), 0);
		if (ModernizedCProgram.startup_info.getHave_repository()) {
			e = attr_stack.read_attr_from_file(ModernizedCProgram.git_path_info_attributes(), 1);
		} else {
				e = ((Object)0);
		} 
		if (!e) {
			e = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		} 
		stack.push_stack(e, ((Object)0), 0);
	}
	public void prepare_attr_stack(Object istate, Object[] path, int dirlen) {
		attr_stack info = new attr_stack();
		strbuf pathbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		stack/*
			 * Pop the "info" one that is always at the top of the stack.
			 */.bootstrap_attr_stack(istate);
		info = stack;
		attr_stack generatedPrev = info.getPrev();
		stack = generatedPrev;
		Byte generatedOrigin = (stack).getOrigin();
		Object generatedOriginlen = (stack).getOriginlen();
		while (generatedOrigin) {
			int namelen = generatedOriginlen;
			attr_stack elem = new attr_stack();
			elem = stack;
			if (namelen <= dirlen && !/*Error: Function owner not recognized*/strncmp(generatedOrigin, path, namelen) && (!namelen || path[namelen] == (byte)'/')) {
				break;
			} 
			do {
				;
			} while (0);
			stack = generatedPrev;
			elem/*
				 * bootstrap_attr_stack() should have added, and the
				 * above loop should have stopped before popping, the
				 * root element whose attr_stack->origin is set to an
				 * empty string.
				 */.attr_stack_free();
		}
		((generatedOrigin) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(*stack)->origin", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\attr.c", 949));
		pathbuf.strbuf_addstr(generatedOrigin);
		Object generatedLen = pathbuf.getLen();
		byte[] generatedBuf = pathbuf.getBuf();
		attr_stack attr_stack = new attr_stack();
		while (generatedLen < /* Build up to the directory 'path' is in */dirlen) {
			size_t len = generatedLen;
			attr_stack next = new attr_stack();
			byte origin;
			if (ModernizedCProgram.len < dirlen && ModernizedCProgram.git_is_dir_sep(path[/* Skip path-separator */ModernizedCProgram.len])) {
				ModernizedCProgram.len++;
			} 
			while (ModernizedCProgram.len < dirlen && !ModernizedCProgram.git_is_dir_sep(path[/* Find the end of the next component */ModernizedCProgram.len])) {
				ModernizedCProgram.len++;
			}
			if (generatedLen > 0) {
				pathbuf.strbuf_addch((byte)'/');
			} 
			pathbuf.strbuf_add(path + generatedLen, (ModernizedCProgram.len - generatedLen));
			pathbuf.strbuf_addf("/%s", ".gitattributes");
			next = attr_stack.read_attr(istate, generatedBuf, 0);
			pathbuf.strbuf_setlen(/* reset the pathbuf to not include "/.gitattributes" */ModernizedCProgram.len);
			origin = ModernizedCProgram.xstrdup(generatedBuf);
			stack.push_stack(next, origin, ModernizedCProgram.len);
		}
		stack.push_stack(info, ((Object)0), /*
			 * Finally push the "info" one at the top of the stack.
			 */0);
		pathbuf.strbuf_release();
	}
	public attr_stack getPrev() {
		return prev;
	}
	public void setPrev(attr_stack newPrev) {
		prev = newPrev;
	}
	public Byte getOrigin() {
		return origin;
	}
	public void setOrigin(Byte newOrigin) {
		origin = newOrigin;
	}
	public Object getOriginlen() {
		return originlen;
	}
	public void setOriginlen(Object newOriginlen) {
		originlen = newOriginlen;
	}
	public int getNum_matches() {
		return num_matches;
	}
	public void setNum_matches(int newNum_matches) {
		num_matches = newNum_matches;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public match_attr[][] getAttrs() {
		return attrs;
	}
	public void setAttrs(match_attr[][] newAttrs) {
		attrs = newAttrs;
	}
}
