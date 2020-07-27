package application;

public class fragment {
	private long leading;
	private long trailing;
	private long oldpos;
	private long oldlines;
	private long newpos;
	private long newlines;
	private Object[] patch;
	private int free_patch;
	private int rejected;
	private int size;
	private int linenr;
	private fragment next;
	
	public fragment(long leading, long trailing, long oldpos, long oldlines, long newpos, long newlines, Object[] patch, int free_patch, int rejected, int size, int linenr, fragment next) {
		setLeading(leading);
		setTrailing(trailing);
		setOldpos(oldpos);
		setOldlines(oldlines);
		setNewpos(newpos);
		setNewlines(newlines);
		setPatch(patch);
		setFree_patch(free_patch);
		setRejected(rejected);
		setSize(size);
		setLinenr(linenr);
		setNext(next);
	}
	public fragment() {
	}
	
	public void free_fragment_list() {
		while (ModernizedCProgram.list) {
			fragment next = ModernizedCProgram.list.getNext();
			if (ModernizedCProgram.list.getFree_patch()) {
				ModernizedCProgram.free((byte)ModernizedCProgram.list.getPatch());
			} 
			ModernizedCProgram.free(ModernizedCProgram.list);
			ModernizedCProgram.list = next;
		}
	}
	public void recount_diff(Object line, int size) {
		int oldlines = 0;
		int newlines = 0;
		int ret = 0;
		if (size < 1) {
			ModernizedCProgram.warning("recount: ignore empty hunk");
			return /*Error: Unsupported expression*/;
		} 
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			int len = ModernizedCProgram.linelen(line, size);
			size -= ModernizedCProgram.len;
			line += ModernizedCProgram.len;
			if (size < 1) {
				break;
			} 
			switch (line) {
			case (byte)'+':
					newlines++;
					continue;
			case (byte)' ':
			case (byte)'d':
					ret = size < 5 || !ModernizedCProgram.starts_with(line, "diff ");
					break;
			case (byte)'\n':
					newlines++;
			case (byte)'\\':
					continue;
			case (byte)'@':
					ret = size < 3 || !ModernizedCProgram.starts_with(line, "@@ ");
					break;
			case /* fall through */(byte)'-':
					oldlines++;
					continue;
			default:
					ret = -1;
					break;
			}
			if (ret) {
				ModernizedCProgram.warning(ModernizedCProgram._("recount: unexpected line: %.*s"), (int)ModernizedCProgram.linelen(line, size), line);
				return /*Error: Unsupported expression*/;
			} 
			break;
		}
		this.setOldlines(oldlines);
		this.setNewlines(newlines/*
		 * Parse a unified diff fragment header of the
		 * form "@@ -a,b +c,d @@"
		 */);
	}
	public int parse_fragment_header(Object[] line, int len) {
		int offset;
		if (!len || line[len - 1] != (byte)'\n') {
			return -1;
		} 
		long generatedOldpos = this.getOldpos();
		long generatedOldlines = this.getOldlines();
		offset = ModernizedCProgram.parse_range(line, len, 4, " +", generatedOldpos, generatedOldlines);
		long generatedNewpos = this.getNewpos();
		long generatedNewlines = this.getNewlines();
		offset = ModernizedCProgram.parse_range(line, len, offset, " @@", generatedNewpos, generatedNewlines);
		return offset/*
		 * Find file diff header
		 *
		 * Returns:
		 *  -1 if no header was found
		 *  -128 in case of error
		 *   the size of the header in bytes (called "offset") otherwise
		 */;
	}
	public fragment parse_binary_hunk(apply_state state, Byte buf_p, Long sz_p, Integer status_p, Integer used_p) {
		int llen;
		int used;
		long size = sz_p;
		byte buffer = buf_p;
		int patch_method;
		long origlen;
		byte data = ((Object)0);
		int hunk_size = 0;
		fragment frag = new fragment();
		llen = ModernizedCProgram.linelen(buffer, size);
		used = llen;
		status_p = 0;
		if (ModernizedCProgram.starts_with(buffer, "delta ")) {
			patch_method = 1;
			origlen = /*Error: Function owner not recognized*/strtoul(buffer + 6, ((Object)0), 10);
		}  else if (ModernizedCProgram.starts_with(buffer, "literal ")) {
			patch_method = 2;
			origlen = /*Error: Function owner not recognized*/strtoul(buffer + 8, ((Object)0), 10);
		} else {
				return ((Object)0);
		} 
		int generatedLinenr = state.getLinenr();
		generatedLinenr++;
		buffer += llen;
		while (1) {
			int byte_length;
			int max_byte_length;
			int newsize;
			llen = ModernizedCProgram.linelen(buffer, size);
			used += llen;
			generatedLinenr++;
			if (llen == 1) {
				/* consume the blank line */buffer++;
				size--;
				break;
			} 
			if ((llen < 7) || (llen - 2) % 5) {
				;
			} 
			max_byte_length = (llen - 2) / 5 * 4;
			byte_length = buffer;
			if ((byte)'A' <= byte_length && byte_length <= (byte)'Z') {
				byte_length = byte_length - (byte)'A' + 1;
			}  else if ((byte)'a' <= byte_length && byte_length <= (byte)'z') {
				byte_length = byte_length - (byte)'a' + 27;
			} else {
					;
			} 
			if (max_byte_length < byte_length || byte_length <= max_byte_length - 4) {
				;
			} 
			newsize = hunk_size + byte_length;
			data = ModernizedCProgram.xrealloc(data, newsize);
			if (ModernizedCProgram.decode_85(data + hunk_size, buffer + 1, byte_length)) {
				;
			} 
			hunk_size = newsize;
			buffer += llen;
			size -= llen;
		}
		frag = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		frag.setPatch(ModernizedCProgram.inflate_it(data, hunk_size, origlen));
		frag.setFree_patch(1);
		Object[] generatedPatch = frag.getPatch();
		if (!generatedPatch) {
			;
		} 
		ModernizedCProgram.free(data);
		frag.setSize(origlen);
		buf_p = buffer;
		sz_p = size;
		used_p = used;
		frag.setLeading(patch_method);
		return frag;
		status_p = -1;
		();
		return ((Object)0/*
		 * Returns:
		 *   -1 in case of error,
		 *   the length of the parsed binary patch otherwise
		 */);
	}
	public long getLeading() {
		return leading;
	}
	public void setLeading(long newLeading) {
		leading = newLeading;
	}
	public long getTrailing() {
		return trailing;
	}
	public void setTrailing(long newTrailing) {
		trailing = newTrailing;
	}
	public long getOldpos() {
		return oldpos;
	}
	public void setOldpos(long newOldpos) {
		oldpos = newOldpos;
	}
	public long getOldlines() {
		return oldlines;
	}
	public void setOldlines(long newOldlines) {
		oldlines = newOldlines;
	}
	public long getNewpos() {
		return newpos;
	}
	public void setNewpos(long newNewpos) {
		newpos = newNewpos;
	}
	public long getNewlines() {
		return newlines;
	}
	public void setNewlines(long newNewlines) {
		newlines = newNewlines;
	}
	public Object[] getPatch() {
		return patch;
	}
	public void setPatch(Object[] newPatch) {
		patch = newPatch;
	}
	public int getFree_patch() {
		return free_patch;
	}
	public void setFree_patch(int newFree_patch) {
		free_patch = newFree_patch;
	}
	public int getRejected() {
		return rejected;
	}
	public void setRejected(int newRejected) {
		rejected = newRejected;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getLinenr() {
		return linenr;
	}
	public void setLinenr(int newLinenr) {
		linenr = newLinenr;
	}
	public fragment getNext() {
		return next;
	}
	public void setNext(fragment newNext) {
		next = newNext;
	}
}
/*
 * When dealing with a binary patch, we reuse "leading" field
 * to store the type of the binary hunk, either deflated "delta"
 * or deflated "literal".
 */
/*
	 * Expect a line that begins with binary patch method ("literal"
	 * or "delta"), followed by the length of data before deflating.
	 * a sequence of 'length-byte' followed by base-85 encoded data
	 * should follow, terminated by a newline.
	 *
	 * Each 5-byte sequence of base-85 encodes up to 4 bytes,
	 * and we would limit the patch line to 66 characters,
	 * so one line can fit up to 13 groups that would decode
	 * to 52 bytes max.  The length byte 'A'-'Z' corresponds
	 * to 1-26 bytes, and 'a'-'z' corresponds to 27-52 bytes.
	 */
