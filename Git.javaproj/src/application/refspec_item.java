package application;

public class refspec_item {
	private int force;
	private int pattern;
	private int matching;
	private int exact_sha1;
	private Byte src;
	private Byte dst;
	
	public refspec_item(int force, int pattern, int matching, int exact_sha1, Byte src, Byte dst) {
		setForce(force);
		setPattern(pattern);
		setMatching(matching);
		setExact_sha1(exact_sha1);
		setSrc(src);
		setDst(dst);
	}
	public refspec_item() {
	}
	
	public int parse_refspec(Object refspec, int fetch) {
		size_t llen = new size_t();
		int is_glob;
		byte lhs;
		byte rhs;
		int flags;
		is_glob = 0;
		lhs = refspec;
		if (lhs == (byte)'+') {
			this.setForce(1);
			lhs++;
		} 
		rhs = /*Error: Function owner not recognized*/strrchr(lhs, (byte)':'/*
			 * Before going on, special case ":" (or "+:") as a refspec
			 * for pushing matching refs.
			 */);
		if (!fetch && rhs == lhs && rhs[1] == (byte)'\0') {
			this.setMatching(1);
			return 1;
		} 
		if (rhs) {
			size_t rlen = /*Error: Function owner not recognized*/strlen(++rhs);
			is_glob = (1 <= rlen && /*Error: Function owner not recognized*/strchr(rhs, (byte)'*'));
			this.setDst(ModernizedCProgram.xstrndup(rhs, rlen));
		} else {
				this.setDst(((Object)0));
		} 
		llen = (rhs ? (rhs - lhs - 1) : /*Error: Function owner not recognized*/strlen(lhs));
		if (1 <= llen && /*Error: Function owner not recognized*/memchr(lhs, (byte)'*', llen)) {
			if ((rhs && !is_glob) || (!rhs && fetch)) {
				return 0;
			} 
			is_glob = 1;
		}  else if (rhs && is_glob) {
			return 0;
		} 
		this.setPattern(is_glob);
		this.setSrc(ModernizedCProgram.xstrndup(lhs, llen));
		flags = 1 | (is_glob ? 2 : 0);
		Byte generatedSrc = this.getSrc();
		Byte generatedDst = this.getDst();
		if (fetch) {
			object_id unused = new object_id();
			if (!generatedSrc) {
				;
			}  else if (llen == ModernizedCProgram.the_repository.getHash_algo().getHexsz() && !unused.get_oid_hex(generatedSrc)) {
				this.setExact_sha1(/* ok */1);
			}  else if (!ModernizedCProgram.check_refname_format(generatedSrc, flags)) {
				;
			} else {
					return 0;
			} 
			if (!generatedDst) {
				;
			}  else if (!generatedDst) {
				;
			}  else if (!ModernizedCProgram.check_refname_format(generatedDst, flags)) {
				;
			} else {
					return 0/*
							 * LHS
							 * - empty is allowed; it means delete.
							 * - when wildcarded, it must be a valid looking ref.
							 * - otherwise, it must be an extended SHA-1, but
							 *   there is no existing way to validate this.
							 */;
			} 
		} else {
				if (!generatedSrc) {
					;
				}  else if (is_glob) {
					if (ModernizedCProgram.check_refname_format(generatedSrc, flags)) {
						return 0;
					} 
				} else {
						;
				} 
				if (!generatedDst) {
					if (ModernizedCProgram.check_refname_format(generatedSrc, flags)) {
						return 0;
					} 
				}  else if (!generatedDst) {
					return 0;
				} else {
						if (ModernizedCProgram.check_refname_format(generatedDst, flags)) {
							return 0;
						} 
				} 
		} 
		return 1;
	}
	public int refspec_item_init(Object refspec, int fetch) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(item, 0, /*Error: sizeof expression not supported yet*/);
		return item.parse_refspec(refspec, fetch);
	}
	public void refspec_item_init_or_die(Object refspec, int fetch) {
		if (!item.refspec_item_init(refspec, fetch)) {
			ModernizedCProgram.die(ModernizedCProgram._("invalid refspec '%s'"), refspec);
		} 
	}
	public void refspec_item_clear() {
		Byte generatedSrc = this.getSrc();
		do {
			ModernizedCProgram.free(generatedSrc);
			(generatedSrc) = ((Object)0);
		} while (0);
		Byte generatedDst = this.getDst();
		do {
			ModernizedCProgram.free(generatedDst);
			(generatedDst) = ((Object)0);
		} while (0);
		this.setForce(0);
		this.setPattern(0);
		this.setMatching(0);
		this.setExact_sha1(0);
	}
	public int getForce() {
		return force;
	}
	public void setForce(int newForce) {
		force = newForce;
	}
	public int getPattern() {
		return pattern;
	}
	public void setPattern(int newPattern) {
		pattern = newPattern;
	}
	public int getMatching() {
		return matching;
	}
	public void setMatching(int newMatching) {
		matching = newMatching;
	}
	public int getExact_sha1() {
		return exact_sha1;
	}
	public void setExact_sha1(int newExact_sha1) {
		exact_sha1 = newExact_sha1;
	}
	public Byte getSrc() {
		return src;
	}
	public void setSrc(Byte newSrc) {
		src = newSrc;
	}
	public Byte getDst() {
		return dst;
	}
	public void setDst(Byte newDst) {
		dst = newDst;
	}
}
