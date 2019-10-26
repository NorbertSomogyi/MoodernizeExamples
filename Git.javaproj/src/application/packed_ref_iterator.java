package application;

/*
 * An iterator over a snapshot of a `packed-refs` file.
 */
public class packed_ref_iterator {
	private ref_iterator base;
	private snapshot snapshot;
	private Object pos;
	private Object eof;
	private object_id oid;
	private object_id peeled;
	private strbuf refname_buf;
	private int flags;
	
	public packed_ref_iterator(ref_iterator base, snapshot snapshot, Object pos, Object eof, object_id oid, object_id peeled, strbuf refname_buf, int flags) {
		setBase(base);
		setSnapshot(snapshot);
		setPos(pos);
		setEof(eof);
		setOid(oid);
		setPeeled(peeled);
		setRefname_buf(refname_buf);
		setFlags(flags);
	}
	public packed_ref_iterator() {
	}
	
	public int next_record() {
		Object generatedPos = this.getPos();
		byte p = generatedPos;
		byte eol;
		strbuf generatedRefname_buf = this.getRefname_buf();
		generatedRefname_buf.strbuf_setlen(0);
		Object generatedEof = this.getEof();
		if (generatedPos == generatedEof) {
			return -1;
		} 
		ref_iterator generatedBase = this.getBase();
		generatedBase.setFlags(-1024);
		object_id generatedOid = this.getOid();
		snapshot generatedSnapshot = this.getSnapshot();
		packed_ref_store generatedRefs = generatedSnapshot.getRefs();
		Byte generatedPath = generatedRefs.getPath();
		if (generatedEof - p < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 2 || generatedOid.parse_oid_hex(p, p) || !((ModernizedCProgram.sane_ctype[(byte)(p++)] & (true)) != 0)) {
			ModernizedCProgram.die_invalid_line(generatedPath, generatedPos, generatedEof - generatedPos);
		} 
		eol = .memchr(p, (byte)'\n', generatedEof - p);
		if (!eol) {
			ModernizedCProgram.die_unterminated_line(generatedPath, generatedPos, generatedEof - generatedPos);
		} 
		generatedRefname_buf.strbuf_add(p, eol - p);
		byte generatedBuf = generatedRefname_buf.getBuf();
		generatedBase.setRefname(generatedBuf);
		Object generatedRefname = generatedBase.getRefname();
		int generatedFlags = generatedBase.getFlags();
		if (ModernizedCProgram.check_refname_format(generatedRefname, 1)) {
			if (!ModernizedCProgram.refname_is_safe(generatedRefname)) {
				ModernizedCProgram.die("packed refname is dangerous: %s", generatedRefname);
			} 
			generatedOid.oidclr();
			generatedFlags |=  -1024 | -1024;
		} 
		 generatedPeeled = generatedSnapshot.getPeeled();
		if (generatedPeeled == .PEELED_FULLY || (generatedPeeled == .PEELED_TAGS && ModernizedCProgram.starts_with(generatedRefname, "refs/tags/"))) {
			generatedFlags |=  -1024;
		} 
		this.setPos(eol + 1);
		if (generatedPos < generatedEof && generatedPos == (byte)'^') {
			p = generatedPos + 1;
			if (generatedEof - p < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 1 || generatedPeeled.parse_oid_hex(p, p) || p++ != (byte)'\n') {
				ModernizedCProgram.die_invalid_line(generatedPath, generatedPos, generatedEof - generatedPos);
			} 
			this.setPos(p/*
					 * Regardless of what the file header said, we
					 * definitely know the value of *this* reference. But
					 * we suppress it if the reference is broken:
					 */);
			if ((generatedFlags & -1024)) {
				generatedPeeled.oidclr();
				generatedFlags &=  ~-1024;
			} else {
					generatedFlags |=  -1024;
			} 
		} else {
				generatedPeeled.oidclr();
		} 
		return 0;
	}
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
	public snapshot getSnapshot() {
		return snapshot;
	}
	public void setSnapshot(snapshot newSnapshot) {
		snapshot = newSnapshot;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getEof() {
		return eof;
	}
	public void setEof(Object newEof) {
		eof = newEof;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public object_id getPeeled() {
		return peeled;
	}
	public void setPeeled(object_id newPeeled) {
		peeled = newPeeled;
	}
	public strbuf getRefname_buf() {
		return refname_buf;
	}
	public void setRefname_buf(strbuf newRefname_buf) {
		refname_buf = newRefname_buf;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
