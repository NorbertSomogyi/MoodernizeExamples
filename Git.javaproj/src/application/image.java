package application;

/*
 * This represents a "file", which is an array of "lines".
 */
public class image {
	private Byte buf;
	private Object len;
	private Object nr;
	private Object alloc;
	private line line_allocated;
	private line line;
	
	public image(Byte buf, Object len, Object nr, Object alloc, line line_allocated, line line) {
		setBuf(buf);
		setLen(len);
		setNr(nr);
		setAlloc(alloc);
		setLine_allocated(line_allocated);
		setLine(line);
	}
	public image() {
	}
	
	public void add_line_info(Object bol, Object len, int flag) {
		Object generatedNr = this.getNr();
		Object generatedAlloc = this.getAlloc();
		line generatedLine_allocated = this.getLine_allocated();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					this.setAlloc((generatedNr + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedLine_allocated) = ModernizedCProgram.xrealloc((generatedLine_allocated), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		generatedLine_allocated[generatedNr].setLen(len);
		generatedLine_allocated[generatedNr].setHash(ModernizedCProgram.hash_line(bol, len));
		generatedLine_allocated[generatedNr].setFlag(flag);
		generatedNr++;
	}
	public void prepare_image(Byte buf, Object len, int prepare_linetable) {
		byte cp;
		byte ep;
		.memset(image, 0, );
		this.setBuf(buf);
		this.setLen(len);
		if (!prepare_linetable) {
			return ;
		} 
		Byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		ep = generatedBuf + generatedLen;
		cp = generatedBuf;
		while (cp < ep) {
			byte next;
			for (next = cp; next < ep && next != (byte)'\n'; next++) {
				;
			}
			if (next < ep) {
				next++;
			} 
			image.add_line_info(cp, next - cp, 0);
			cp = next;
		}
		line generatedLine_allocated = this.getLine_allocated();
		this.setLine(generatedLine_allocated);
	}
	public void clear_image() {
		Byte generatedBuf = this.getBuf();
		ModernizedCProgram.free(generatedBuf);
		line generatedLine_allocated = this.getLine_allocated();
		ModernizedCProgram.free(generatedLine_allocated);
		.memset(image, 0, );
	}
	public void update_pre_post_images(image postimage, Byte buf, Object len, Object postlen) {
		int i;
		int ctx;
		int reduced;
		byte new_buf;
		byte old_buf;
		byte fixed;
		image fixed_preimage = new image();
		/*
			 * Update the preimage with whitespace fixes.  Note that we
			 * are not losing preimage->buf -- apply_one_fragment() will
			 * free "oldlines".
			 */
		fixed_preimage.prepare_image(buf, len, 1);
		Object generatedNr = fixed_preimage.getNr();
		((postlen ? generatedNr == generatedNr : generatedNr <= generatedNr) ? (Object)0 : ._assert("postlen ? fixed_preimage.nr == preimage->nr : fixed_preimage.nr <= preimage->nr", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\apply.c", 2307));
		line generatedLine = this.getLine();
		for (i = 0; i < generatedNr; i++) {
			generatedLine[i].setFlag(generatedLine[i].getFlag());
		}
		line generatedLine_allocated = this.getLine_allocated();
		ModernizedCProgram.free(generatedLine_allocated);
		preimage = fixed_preimage/*
			 * Adjust the common context lines in postimage. This can be
			 * done in-place when we are shrinking it with whitespace
			 * fixing, but needs a new buffer when ignoring whitespace or
			 * expanding leading tabs to spaces.
			 *
			 * We trust the caller to tell us if the update can be done
			 * in place (postlen==0) or not.
			 */;
		Byte generatedBuf = postimage.getBuf();
		old_buf = generatedBuf;
		if (postlen) {
			new_buf = postimage.setBuf(ModernizedCProgram.xmalloc(postlen));
		} else {
				new_buf = old_buf;
		} 
		fixed = generatedBuf;
		for (i = reduced = ctx = 0; i < generatedNr; i++) {
			size_t l_len = generatedLine[i].getLen();
			if (!(generatedLine[i].getFlag() & 1)) {
				.memmove(new_buf, old_buf, /* an added line -- no counterparts in preimage */l_len);
				old_buf += l_len;
				new_buf += l_len;
				continue;
			} 
			old_buf += /* a common context -- skip it in the original postimage */l_len;
			while (ctx < generatedNr && !(generatedLine[ctx].getFlag() & 1)) {
				fixed += generatedLine[ctx].getLen();
				ctx/*
						 * preimage is expected to run out, if the caller
						 * fixed addition of trailing blank lines.
						 */++;
			}
			if (generatedNr <= ctx) {
				reduced++;
				continue;
			} 
			l_len = generatedLine[ctx].getLen();
			.memcpy(new_buf, fixed, l_len);
			new_buf += l_len;
			fixed += l_len;
			generatedLine[i].setLen(l_len);
			ctx++;
		}
		Object generatedLen = postimage.getLen();
		if (postlen ? postlen < new_buf - generatedBuf : generatedLen < new_buf - generatedBuf) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\apply.c", 2371, "caller miscounted postlen: asked %d, orig = %d, used = %d", (int)postlen, (int)generatedLen, (int)(new_buf - generatedBuf));
		} 
		postimage.setLen(new_buf - generatedBuf);
		generatedNr -= reduced;
	}
	public int line_by_line_fuzzy_match(image preimage, image postimage, long current, int current_lno, int preimage_limit) {
		int i;
		size_t imgoff = 0;
		size_t preoff = 0;
		Object generatedLen = postimage.getLen();
		size_t postlen = generatedLen;
		size_t extra_chars = new size_t();
		byte buf;
		byte preimage_eof;
		byte preimage_end;
		strbuf fixed = new strbuf();
		byte fixed_buf;
		size_t fixed_len = new size_t();
		Byte generatedBuf = this.getBuf();
		line generatedLine = preimage.getLine();
		for (i = 0; i < preimage_limit; i++) {
			size_t prelen = generatedLen;
			size_t imglen = generatedLen;
			if (!ModernizedCProgram.fuzzy_matchlines(generatedBuf + current + imgoff, imglen, generatedBuf + preoff, prelen)) {
				return 0;
			} 
			if (generatedLine[i].getFlag() & 1) {
				postlen += imglen - prelen;
			} 
			imgoff += imglen;
			preoff += prelen/*
				 * Ok, the preimage matches with whitespace fuzz.
				 *
				 * imgoff now holds the true length of the target that
				 * matches the preimage before the end of the file.
				 *
				 * Count the number of characters in the preimage that fall
				 * beyond the end of the file and make sure that all of them
				 * are whitespace characters. (This can only happen if
				 * we are removing blank lines at the end of the file.)
				 */;
		}
		buf = preimage_eof = generatedBuf + preoff;
		Object generatedNr = preimage.getNr();
		for (; i < generatedNr; i++) {
			preoff += generatedLen;
		}
		preimage_end = generatedBuf + preoff;
		for (; buf < preimage_end; buf++) {
			if (!((ModernizedCProgram.sane_ctype[(byte)(buf)] & (true)) != 0)) {
				return 0/*
					 * Update the preimage and the common postimage context
					 * lines to use the same whitespace as the target.
					 * If whitespace is missing in the target (i.e.
					 * if the preimage extends beyond the end of the file),
					 * use the whitespace from the preimage.
					 */;
			} 
		}
		extra_chars = preimage_end - preimage_eof;
		fixed.strbuf_init(imgoff + extra_chars);
		fixed.strbuf_add(generatedBuf + current, imgoff);
		fixed.strbuf_add(preimage_eof, extra_chars);
		fixed_buf = fixed.strbuf_detach(fixed_len);
		preimage.update_pre_post_images(postimage, fixed_buf, fixed_len, postlen);
		return 1;
	}
	public void remove_first_line() {
		Byte generatedBuf = this.getBuf();
		line generatedLine = this.getLine();
		generatedBuf += generatedLine[0].getLen();
		Object generatedLen = this.getLen();
		generatedLen -= generatedLen;
		generatedLine++;
		Object generatedNr = this.getNr();
		generatedNr--;
	}
	public void remove_last_line() {
		Object generatedLen = this.getLen();
		generatedLen -= generatedLen;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public line getLine_allocated() {
		return line_allocated;
	}
	public void setLine_allocated(line newLine_allocated) {
		line_allocated = newLine_allocated;
	}
	public line getLine() {
		return line;
	}
	public void setLine(line newLine) {
		line = newLine;
	}
}
/*
	 * remove the copy of preimage at offset in img
	 * and replace it with postimage
	 */
