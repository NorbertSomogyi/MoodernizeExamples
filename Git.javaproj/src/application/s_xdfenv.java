package application;

public class s_xdfenv {
	private s_xdfile xdf1;
	private s_xdfile xdf2;
	
	public s_xdfenv(s_xdfile xdf1, s_xdfile xdf2) {
		setXdf1(xdf1);
		setXdf2(xdf2);
	}
	public s_xdfenv() {
	}
	
	public int fall_back_to_classic_diff(Object xpp, int line1, int count1, int line2, int count2) {
		xpparam_t xpparam = new xpparam_t();
		xpparam.setFlags(xpp.getFlags() & ~((1 << 14) | (1 << 15)));
		return env.xdl_fall_back_diff(xpparam, line1, count1, line2, count2);
		xpparam_t xpp = new xpparam_t();
		Object generatedXpp = map.getXpp();
		xpp.setFlags(generatedXpp.getFlags() & ~((1 << 14) | (1 << 15)));
		Object generatedEnv = map.getEnv();
		return generatedEnv.xdl_fall_back_diff(xpp, line1, count1, line2, count2/*
		 * Recursively find the longest common sequence of unique lines,
		 * and if none was found, ask xdl_do_diff() to do the job.
		 *
		 * This function assumes that env was prepared with xdl_prepare_env().
		 */);
	}
	public int histogram_diff(Object xpp, int line1, int count1, int line2, int count2) {
		region lcs = new region();
		int lcs_found;
		int result;
		if (count1 <= 0 && count2 <= 0) {
			return 0;
		} 
		if ((line1 + count1 - 1) >= -1024) {
			return -1;
		} 
		s_xdfile generatedXdf2 = this.getXdf2();
		byte[] generatedRchg = generatedXdf2.getRchg();
		if (!count1) {
			while (count2--) {
				generatedRchg[line2++ - 1] = 1;
			}
			return 0;
		}  else if (!count2) {
			while (count1--) {
				generatedRchg[line1++ - 1] = 1;
			}
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(lcs, 0, /*Error: sizeof expression not supported yet*/);
		lcs_found = ModernizedCProgram.find_lcs(xpp, env, lcs, line1, count1, line2, count2);
		int generatedBegin1 = lcs.getBegin1();
		int generatedBegin2 = lcs.getBegin2();
		int generatedEnd1 = lcs.getEnd1();
		int generatedEnd2 = lcs.getEnd2();
		if (lcs_found < 0) {
			;
		}  else if (lcs_found) {
			result = env.fall_back_to_classic_diff(xpp, line1, count1, line2, count2);
		} else {
				if (generatedBegin1 == 0 && generatedBegin2 == 0) {
					while (count1--) {
						generatedRchg[line1++ - 1] = 1;
					}
					while (count2--) {
						generatedRchg[line2++ - 1] = 1;
					}
					result = 0;
				} else {
						result = env.histogram_diff(xpp, line1, generatedBegin1 - line1, line2, generatedBegin2 - line2);
						if (result) {
							;
						} 
						count1 = (line1 + count1 - 1) - generatedEnd1;
						line1 = generatedEnd1 + 1;
						count2 = (line2 + count2 - 1) - generatedEnd2;
						line2 = generatedEnd2 + 1;
						;
				} 
		} 
	}
	public int xdl_merge_cmp_lines(int i1, s_xdfenv xe2, int i2, int line_count, long flags) {
		int i;
		s_xdfile generatedXdf2 = this.getXdf2();
		s_xrecord[][] generatedRecs = generatedXdf2.getRecs();
		xrecord_t rec1 = generatedRecs + i1;
		xrecord_t rec2 = generatedRecs + i2;
		for (i = 0; i < line_count; i++) {
			int result = ModernizedCProgram.xdl_recmatch(rec1[i].getPtr(), rec1[i].getSize(), rec2[i].getPtr(), rec2[i].getSize(), flags);
			if (!result) {
				return -1;
			} 
		}
		return 0;
	}
	public int xdl_recs_copy_0(int use_orig, int i, int count, int needs_cr, int add_nl, byte[] dest) {
		xrecord_t recs = new xrecord_t();
		int size = 0;
		s_xdfile generatedXdf1 = this.getXdf1();
		s_xrecord[][] generatedRecs = generatedXdf1.getRecs();
		recs = (use_orig ? generatedRecs : generatedRecs) + i;
		if (count < 1) {
			return 0;
		} 
		for (i = 0; i < count; size += recs[i++].getSize()) {
			if (dest) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dest + size, recs[i].getPtr(), recs[i].getSize());
			} 
		}
		if (add_nl) {
			i = recs[count - 1].getSize();
			if (i == 0 || recs[count - 1].getPtr()[i - 1] != (byte)'\n') {
				if (needs_cr) {
					if (dest) {
						dest[size] = (byte)'\r';
					} 
					size++;
				} 
				if (dest) {
					dest[size] = (byte)'\n';
				} 
				size++;
			} 
		} 
		return size;
	}
	public int xdl_recs_copy(int i, int count, int needs_cr, int add_nl, Byte dest) {
		return xe.xdl_recs_copy_0(0, i, count, needs_cr, add_nl, dest);
	}
	public int xdl_orig_copy(int i, int count, int needs_cr, int add_nl, Byte dest) {
		return xe.xdl_recs_copy_0(1, i, count, needs_cr, add_nl, dest/*
		 * Returns 1 if the i'th line ends in CR/LF (if it is the last line and
		 * has no eol, the preceding line, if any), 0 if it ends in LF-only, and
		 * -1 if the line ending cannot be determined.
		 */);
	}
	public int lines_contain_alnum(int i, int chg) {
		s_xdfile generatedXdf2 = this.getXdf2();
		s_xrecord[][] generatedRecs = generatedXdf2.getRecs();
		for (; chg; ) {
			if (ModernizedCProgram.line_contains_alnum(generatedRecs[i].getPtr(), generatedRecs[i].getSize())) {
				return 1;
			} 
		}
		return 0/*
		 * This function merges m and m->next, marking everything between those hunks
		 * as conflicting, too.
		 */;
	}
	public void xdl_free_env() {
		s_xdfile generatedXdf2 = this.getXdf2();
		generatedXdf2.xdl_free_ctx();
		s_xdfile generatedXdf1 = this.getXdf1();
		generatedXdf1.xdl_free_ctx();
	}
	public int xdl_fall_back_diff(Object xpp, int line1, int count1, int line2, int count2) {
		mmfile_t subfile1 = new mmfile_t();
		mmfile_t subfile2 = new mmfile_t();
		xdfenv_t env = new xdfenv_t();
		s_xdfile generatedXdf1 = this.getXdf1();
		s_xrecord[][] generatedRecs = generatedXdf1.getRecs();
		subfile1.setPtr((byte)generatedRecs[line1 - 1].getPtr());
		Byte generatedPtr = subfile1.getPtr();
		subfile1.setSize(generatedRecs[line1 + count1 - 2].getPtr() + generatedRecs[line1 + count1 - 2].getSize() - generatedPtr);
		subfile2.setPtr((byte)generatedPtr);
		subfile2.setSize(generatedPtr + generatedRecs[line2 + count2 - 2].getSize() - generatedPtr);
		if (ModernizedCProgram.xdl_do_diff(subfile1, subfile2, xpp, env) < 0) {
			return -1;
		} 
		byte[] generatedRchg = generatedXdf1.getRchg();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedRchg + line1 - 1, generatedRchg, count1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedRchg + line2 - 1, generatedRchg, count2);
		env.xdl_free_env();
		return 0;
	}
	/*
		 * This probably does not work outside Git, since
		 * we have a very simple mmfile structure.
		 *
		 * Note: ideally, we would reuse the prepared environment, but
		 * the libxdiff interface does not (yet) allow for diffing only
		 * ranges of lines instead of the whole files.
		 */
	public s_xdfile getXdf1() {
		return xdf1;
	}
	public void setXdf1(s_xdfile newXdf1) {
		xdf1 = newXdf1;
	}
	public s_xdfile getXdf2() {
		return xdf2;
	}
	public void setXdf2(s_xdfile newXdf2) {
		xdf2 = newXdf2;
	}
}
