package application;

public class stream_filter {
	private stream_filter_vtbl vtbl;
	
	public stream_filter(stream_filter_vtbl vtbl) {
		setVtbl(vtbl);
	}
	public stream_filter() {
	}
	
	public int null_filter_fn(Object input, Object isize_p, Byte output, Object osize_p) {
		size_t count = new size_t();
		if (!input) {
			return /* we do not keep any states */0;
		} 
		count = isize_p;
		if (osize_p < count) {
			count = osize_p;
		} 
		if (count) {
			.memmove(output, input, count);
			isize_p -= count;
			osize_p -= count;
		} 
		return 0;
	}
	public void null_free_fn() {
		/* nothing -- null instances are shared */;
	}
	public int is_null_stream_filter() {
		return ModernizedCProgram.filter == ModernizedCProgram.null_filter_singleton/*
		 * LF-to-CRLF filter
		 */;
	}
	public int lf_to_crlf_filter_fn(Object input, Object isize_p, Byte output, Object osize_p) {
		size_t count = new size_t();
		size_t o = 0;
		lf_to_crlf_filter lf_to_crlf = (lf_to_crlf_filter)ModernizedCProgram.filter/*
			 * We may be holding onto the CR to see if it is followed by a
			 * LF, in which case we would need to go to the main loop.
			 * Otherwise, just emit it to the output stream.
			 */;
		int generatedHas_held = lf_to_crlf.getHas_held();
		byte generatedHeld = lf_to_crlf.getHeld();
		if (generatedHas_held && (generatedHeld != (byte)'\r' || !input)) {
			output[o++] = generatedHeld;
			lf_to_crlf.setHas_held(0);
		} 
		if (!/* We are told to drain */input) {
			osize_p -= o;
			return 0;
		} 
		count = isize_p;
		if (count || generatedHas_held) {
			size_t i = new size_t();
			int was_cr = 0;
			if (generatedHas_held) {
				was_cr = 1;
				lf_to_crlf.setHas_held(0);
			} 
			for (i = 0; o < osize_p && i < count; i++) {
				byte ch = input[i];
				if (ch == (byte)'\n') {
					output[o++] = (byte)'\r';
				}  else if (was_cr/*
								 * Previous round saw CR and it is not followed
								 * by a LF; emit the CR before processing the
								 * current character.
								 */) {
					output[o++] = (byte)'\r'/*
								 * We may have consumed the last output slot,
								 * in which case we need to break out of this
								 * loop; hold the current character before
								 * returning.
								 */;
				} 
				if (osize_p <= o) {
					lf_to_crlf.setHas_held(1);
					lf_to_crlf.setHeld(ch);
					continue;
				} 
				if (ch == (byte)'\r') {
					was_cr = 1;
					continue;
				} 
				was_cr = 0;
				output[o++] = ch;
			}
			osize_p -= o;
			isize_p -= i;
			if (!generatedHas_held && was_cr) {
				lf_to_crlf.setHas_held(1);
				lf_to_crlf.setHeld((byte)'\r');
			} 
		} 
		return 0;
	}
	public void lf_to_crlf_free_fn() {
		ModernizedCProgram.free(ModernizedCProgram.filter);
	}
	public stream_filter lf_to_crlf_filter() {
		lf_to_crlf_filter lf_to_crlf = ModernizedCProgram.xcalloc(1, );
		stream_filter generatedFilter = lf_to_crlf.getFilter();
		generatedFilter.setVtbl(ModernizedCProgram.lf_to_crlf_vtbl);
		return (stream_filter)lf_to_crlf/*
		 * Cascade filter
		 */;
	}
	public int cascade_filter_fn(Object input, Object isize_p, Byte output, Object osize_p) {
		cascade_filter cas = (cascade_filter)ModernizedCProgram.filter;
		size_t filled = 0;
		size_t sz = osize_p;
		size_t to_feed = new size_t();
		size_t remaining = new size_t();
		/*
			 * input -- (one) --> buf -- (two) --> output
			 */
		int generatedPtr = cas.getPtr();
		int generatedEnd = cas.getEnd();
		stream_filter generatedTwo = cas.getTwo();
		Object generatedBuf = cas.getBuf();
		stream_filter generatedOne = cas.getOne();
		while (filled < sz) {
			remaining = sz - filled;
			if (generatedPtr < generatedEnd) {
				to_feed = generatedEnd - generatedPtr;
				if (generatedTwo.stream_filter(generatedBuf + generatedPtr, to_feed, output + filled, remaining)) {
					return -1;
				} 
				generatedPtr += (generatedEnd - generatedPtr) - to_feed;
				filled = sz - remaining;
				continue;
			} 
			to_feed = input ? isize_p : /* feed one from upstream and have it emit into our buffer */0;
			if (input && !to_feed) {
				break;
			} 
			remaining = ;
			if (generatedOne.stream_filter(input, to_feed, generatedBuf, remaining)) {
				return -1;
			} 
			cas.setEnd( - remaining);
			cas.setPtr(0);
			if (input) {
				size_t fed = isize_p - to_feed;
				isize_p -= fed;
				input += fed;
			} 
			if (input || generatedEnd) {
				continue;
			} 
			to_feed = /* tell two to drain; we have nothing more to give it */0;
			remaining = sz - filled;
			if (generatedTwo.stream_filter(((Object)0), to_feed, output + filled, remaining)) {
				return -1;
			} 
			if (remaining == (sz - filled)) {
				break;
			} 
			filled = sz - remaining;
		}
		osize_p -= filled;
		return 0;
	}
	public void cascade_free_fn() {
		cascade_filter cas = (cascade_filter)ModernizedCProgram.filter;
		stream_filter generatedOne = cas.getOne();
		generatedOne.free_stream_filter();
		stream_filter generatedTwo = cas.getTwo();
		generatedTwo.free_stream_filter();
		ModernizedCProgram.free(ModernizedCProgram.filter);
	}
	public stream_filter cascade_filter(stream_filter two) {
		cascade_filter cascade = new cascade_filter();
		if (!one || one.is_null_stream_filter()) {
			return two;
		} 
		if (!two || two.is_null_stream_filter()) {
			return one;
		} 
		cascade = ModernizedCProgram.xmalloc();
		cascade.setOne(one);
		cascade.setTwo(two);
		cascade.setEnd(cascade.setPtr(0));
		stream_filter generatedFilter = cascade.getFilter();
		generatedFilter.setVtbl(ModernizedCProgram.cascade_vtbl);
		return (stream_filter)cascade/*
		 * ident filter
		 */;
	}
	public int ident_filter_fn(Object input, Object isize_p, Byte output, Object osize_p) {
		ident_filter ident = (ident_filter)ModernizedCProgram.filter;
		byte[] head = "$Id";
		strbuf generatedLeft = ident.getLeft();
		int generatedState = ident.getState();
		if (!input) {
			switch (generatedState) {
			case (/* fallthrough */true):
					ident.ident_drain(output, osize_p);
			case (/* fallthrough */true):
			default:
					generatedLeft.strbuf_add(head, generatedState);
			}
			return 0;
		} 
		byte generatedBuf = generatedLeft.getBuf();
		Object generatedIdent = ident.getIdent();
		while (isize_p || (generatedState == (true))) {
			int ch;
			if (generatedState == (true)) {
				ident.ident_drain(output, osize_p);
				if (!osize_p) {
					break;
				} 
				continue;
			} 
			ch = (input++);
			(isize_p)--;
			if (generatedState == (true/*
						 * Skipping until '$' or LF, but keeping them
						 * in case it is a foreign ident.
						 */)) {
				generatedLeft.strbuf_addch(ch);
				if (ch != (byte)'\n' && ch != (byte)'$') {
					continue;
				} 
				if (ch == (byte)'$' && !ModernizedCProgram.is_foreign_ident(generatedBuf)) {
					generatedLeft.strbuf_setlen( - 1);
					generatedLeft.strbuf_addstr(generatedIdent);
				} 
				ident.setState((true));
				continue;
			} 
			if (generatedState <  && head[generatedState] == ch) {
				generatedState++;
				continue;
			} 
			if (generatedState) {
				generatedLeft.strbuf_add(head, generatedState);
			} 
			if (generatedState ==  - 1) {
				if (ch != (byte)':' && ch != (byte)'$') {
					generatedLeft.strbuf_addch(ch);
					ident.setState(0);
					continue;
				} 
				if (ch == (byte)':') {
					generatedLeft.strbuf_addch(ch);
					ident.setState((true));
				} else {
						generatedLeft.strbuf_addstr(generatedIdent);
						ident.setState((true));
				} 
				continue;
			} 
			generatedLeft.strbuf_addch(ch);
			ident.setState((true));
		}
		return 0;
	}
	public void ident_free_fn() {
		ident_filter ident = (ident_filter)ModernizedCProgram.filter;
		strbuf generatedLeft = ident.getLeft();
		generatedLeft.strbuf_release();
		ModernizedCProgram.free(ModernizedCProgram.filter);
	}
	public stream_filter ident_filter(Object oid) {
		ident_filter ident = ModernizedCProgram.xmalloc();
		Object generatedIdent = ident.getIdent();
		ModernizedCProgram.xsnprintf(generatedIdent, , ": %s $", ModernizedCProgram.oid_to_hex(oid));
		strbuf generatedLeft = ident.getLeft();
		generatedLeft.strbuf_init(0);
		stream_filter generatedFilter = ident.getFilter();
		generatedFilter.setVtbl(ModernizedCProgram.ident_vtbl);
		ident.setState(0);
		return (stream_filter)ident/*
		 * Return an appropriately constructed filter for the path, or NULL if
		 * the contents cannot be filtered without reading the whole thing
		 * in-core.
		 *
		 * Note that you would be crazy to set CRLF, smuge/clean or ident to a
		 * large binary blob you would want us not to slurp into the memory!
		 */;
	}
	public stream_filter get_stream_filter(Object istate, Object path, Object oid) {
		conv_attrs ca = new conv_attrs();
		stream_filter filter = ((Object)0);
		ca.convert_attrs(istate, path);
		convert_driver generatedDrv = ca.getDrv();
		Object generatedProcess = generatedDrv.getProcess();
		Object generatedSmudge = generatedDrv.getSmudge();
		Object generatedClean = generatedDrv.getClean();
		if (generatedDrv && (generatedProcess || generatedSmudge || generatedClean)) {
			return ((Object)0);
		} 
		Object generatedWorking_tree_encoding = ca.getWorking_tree_encoding();
		if (generatedWorking_tree_encoding) {
			return ((Object)0);
		} 
		crlf_action generatedCrlf_action = ca.getCrlf_action();
		if (generatedCrlf_action == crlf_action.CRLF_AUTO || generatedCrlf_action == crlf_action.CRLF_AUTO_CRLF) {
			return ((Object)0);
		} 
		int generatedIdent = ca.getIdent();
		stream_filter stream_filter = new stream_filter();
		if (generatedIdent) {
			filter = stream_filter.ident_filter(oid);
		} 
		stream_filter stream_filter = new stream_filter();
		if (ModernizedCProgram.output_eol(generatedCrlf_action) == eol.EOL_CRLF) {
			filter = filter.cascade_filter(stream_filter.lf_to_crlf_filter());
		} else {
				filter = filter.cascade_filter(ModernizedCProgram.null_filter_singleton);
		} 
		return filter;
	}
	public void free_stream_filter() {
		.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.filter);
	}
	public int stream_filter(Object input, Object isize_p, Byte output, Object osize_p) {
		return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.filter, input, isize_p, output, osize_p);
	}
	public int stream_blob_to_fd(int fd, Object oid, int can_seek) {
		git_istream st = new git_istream();
		object_type type;
		long sz;
		ssize_t kept = 0;
		int result = -1;
		git_istream git_istream = new git_istream();
		st = git_istream.open_istream(oid, object_type.type, sz, ModernizedCProgram.filter);
		if (!st) {
			if (ModernizedCProgram.filter) {
				ModernizedCProgram.filter.free_stream_filter();
			} 
			return result;
		} 
		if (object_type.type != object_type.OBJ_BLOB) {
			;
		} 
		for (; ; ) {
			byte[] buf = new byte[1024 * 16];
			ssize_t wrote = new ssize_t();
			ssize_t holeto = new ssize_t();
			ssize_t readlen = st.read_istream(ModernizedCProgram.buf, );
			if (readlen < 0) {
				;
			} 
			if (!readlen) {
				break;
			} 
			if (can_seek &&  == readlen) {
				for (holeto = 0; holeto < readlen; holeto++) {
					if (ModernizedCProgram.buf[holeto]) {
						break;
					} 
				}
				if (readlen == holeto) {
					kept += holeto;
					continue;
				} 
			} 
			if (kept && .lseek(fd, kept, 1) == (off_t)-1) {
				;
			} else {
					kept = 0;
			} 
			wrote = ModernizedCProgram.write_in_full(fd, ModernizedCProgram.buf, readlen);
			if (wrote < 0) {
				;
			} 
		}
		if (kept && (.lseek(fd, kept - 1, 1) == (off_t)-1 || ModernizedCProgram.xwrite(fd, "", 1) != 1)) {
			;
		} 
		result = 0;
		return result;
	}
	public stream_filter_vtbl getVtbl() {
		return vtbl;
	}
	public void setVtbl(stream_filter_vtbl newVtbl) {
		vtbl = newVtbl;
	}
}
