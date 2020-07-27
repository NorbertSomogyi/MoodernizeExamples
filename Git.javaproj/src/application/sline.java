package application;

/* Lines surviving in the merge result */
public class sline {
	private lline lost;
	private int lenlost;
	private plost plost;
	private Byte bol;
	private int len;
	private long flag;
	private long[] p_lno;
	
	public sline(lline lost, int lenlost, plost plost, Byte bol, int len, long flag, long[] p_lno) {
		setLost(lost);
		setLenlost(lenlost);
		setPlost(plost);
		setBol(bol);
		setLen(len);
		setFlag(flag);
		setP_lno(p_lno);
	}
	public sline() {
	}
	
	public void append_lost(int n, Object[] line, int len) {
		lline lline = new lline();
		long this_mask = (-1024 << n);
		if (line[len - 1] == (byte)'\n') {
			len--;
		} 
		Object generatedLine = (lline).getLine();
		do {
			size_t flex_array_len_ = (len);
			(lline) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedLine, (line), flex_array_len_);
		} while (0);
		lline.setLen(len);
		lline.setNext(((Object)0));
		plost generatedPlost = this.getPlost();
		lline generatedLost_tail = generatedPlost.getLost_tail();
		lline.setPrev(generatedLost_tail);
		lline generatedPrev = lline.getPrev();
		if (generatedPrev) {
			generatedPrev.setNext(lline);
		} else {
				generatedPlost.setLost_head(lline);
		} 
		generatedPlost.setLost_tail(lline);
		int generatedLen = generatedPlost.getLen();
		generatedLen++;
		lline.setParent_map(this_mask);
	}
	public int interesting(long all_mask) {
		long generatedFlag = this.getFlag();
		lline generatedLost = this.getLost();
		return ((generatedFlag & all_mask) || generatedLost);
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		while (ModernizedCProgram.list) {
			commit commit = ModernizedCProgram.list.getItem();
			ModernizedCProgram.list = ModernizedCProgram.list.getNext();
			if (generatedFlags & 1) {
				continue;
			} 
			return commit;
		}
		return ((Object)0);
	}
	/* If some parents lost lines here, or if we have added to
		 * some parent, it is interesting.
		 */
	public long adjust_hunk_tail(long all_mask, long hunk_begin, long i) {
		if ((hunk_begin + 1 <= i) && !(sline[i - 1].getFlag() & all_mask)) {
			i--;
		} 
		return i;
	}
	/* i points at the first uninteresting line.  If the last line
		 * of the hunk was interesting only because it has some
		 * deletion, then it is not all that interesting for the
		 * purpose of giving trailing context lines.  This is because
		 * we output '-' line and then unmodified sline[i-1] itself in
		 * that case which gives us one extra context line.
		 */
	public long find_next(long mark, long i, long cnt, int look_for_uninteresting) {
		while (i <= cnt) {
			if (look_for_uninteresting ? !(sline[i].getFlag() & mark) : (sline[i].getFlag() & mark)) {
				return i;
			} else {
					i++;
			} 
		}
		return i;
		while (cp) {
			if (cp == (byte)'%'/*
						 * %( is the start of an atom;
						 * %% is a quoted per-cent.
						 */) {
				if (cp[1] == (byte)'(') {
					return cp;
				}  else if (cp[1] == (byte)'%') {
					/* skip over two % */cp/* otherwise this is a singleton, literal % */++;
				} 
			} 
			cp++;
		}
		return ((Object)0/*
		 * Make sure the format string is well formed, and parse out
		 * the used atoms.
		 */);
	}
	/* We have examined up to i-1 and are about to look at i.
		 * Find next interesting or uninteresting line.  Here,
		 * "interesting" does not mean interesting(), but marked by
		 * the give_context() function below (i.e. it includes context
		 * lines that are not interesting to interesting() function
		 * that are surrounded by interesting() ones.
		 */
	public int give_context(long cnt, int num_parent) {
		long all_mask = (-1024 << num_parent) - 1;
		long mark = (-1024 << num_parent);
		long no_pre_delete = (-1024 << num_parent);
		long i;
		/* Two groups of interesting lines may have a short gap of
			 * uninteresting lines.  Connect such groups to give them a
			 * bit of context.
			 *
			 * We first start from what the interesting() function says,
			 * and mark them with "mark", and paint context lines with the
			 * mark.  So interesting() would still say false for such context
			 * lines but they are treated as "interesting" in the end.
			 */
		i = sline.find_next(mark, 0, cnt, 0);
		if (cnt < i) {
			return 0;
		} 
		return 1;
	}
	public int make_hunks(long cnt, int num_parent, int dense) {
		long all_mask = (-1024 << num_parent) - 1;
		long mark = (-1024 << num_parent);
		long i;
		int has_interesting = 0;
		for (i = 0; i <= cnt; i++) {
			if (sline[i].interesting(all_mask)) {
				sline[i].getFlag() |=  mark;
			} else {
					sline[i].getFlag() &=  ~mark;
			} 
		}
		if (!dense) {
			return sline.give_context(cnt, num_parent/* Look at each hunk, and if we have changes from only one
				 * parent, or the changes are the same from all but one
				 * parent, mark that uninteresting.
				 */);
		} 
		i = 0;
		long generatedParent_map = ll.getParent_map();
		lline generatedNext = ll.getNext();
		while (i <= cnt) {
			long j;
			long hunk_begin;
			long hunk_end;
			long same_diff;
			while (i <= cnt && !(sline[i].getFlag() & mark)) {
				i++;
			}
			if (cnt < i) {
				break;
			} 
			hunk_begin = i;
			for (j = i + 1; j <= cnt; j++) {
				if (!(sline[j].getFlag() & mark/* Look beyond the end to see if there
								 * is an interesting line after this
								 * hunk within context span.
								 */)) {
					long la;
					int contin = 0;
					la = sline.adjust_hunk_tail(all_mask, hunk_begin, j);
					la = (la + ModernizedCProgram.context < cnt + 1) ? (la + ModernizedCProgram.context) : cnt + 1;
					while (la && j <= --la) {
						if (sline[la].getFlag() & mark) {
							contin = 1;
							break;
						} 
					}
					if (!contin) {
						break;
					} 
					j = la;
				} 
			}
			hunk_end = j/* [i..hunk_end) are interesting.  Now is it really
					 * interesting?  We check if there are only two versions
					 * and the result matches one of them.  That is, we look
					 * at:
					 *   (+) line, which records lines added to which parents;
					 *       this line appears in the result.
					 *   (-) line, which records from what parents the line
					 *       was removed; this line does not appear in the result.
					 * then check the set of parents the result has difference
					 * from, from all lines.  If there are lines that has
					 * different set of parents that the result has differences
					 * from, that means we have more than two versions.
					 *
					 * Even when we have only two versions, if the result does
					 * not match any of the parents, the it should be considered
					 * interesting.  In such a case, we would have all '+' line.
					 * After passing the above "two versions" test, that would
					 * appear as "the same set of parents" to be "all parents".
					 */;
			same_diff = 0;
			has_interesting = 0;
			for (j = i; j < hunk_end && !has_interesting; j++) {
				long this_diff = sline[j].getFlag() & all_mask;
				lline ll = sline[j].getLost();
				if (this_diff/* This has some changes.  Is it the
								 * same as others?
								 */) {
					if (!same_diff) {
						same_diff = this_diff;
					}  else if (same_diff != this_diff) {
						has_interesting = 1;
						break;
					} 
				} 
				while (ll && !has_interesting/* Lost this line from these parents;
								 * who are they?  Are they the same?
								 */) {
					this_diff = generatedParent_map;
					if (!same_diff) {
						same_diff = this_diff;
					}  else if (same_diff != this_diff) {
						has_interesting = 1;
					} 
					ll = generatedNext;
				}
			}
			if (!has_interesting && same_diff != all_mask) {
				for (j = hunk_begin; j < hunk_end; /* This hunk is not that interesting after all */j++) {
					sline[j].getFlag() &=  ~mark;
				}
			} 
			i = hunk_end;
		}
		has_interesting = sline.give_context(cnt, num_parent);
		return has_interesting;
	}
	public void show_parent_lno(long l0, long l1, int n, long null_context) {
		l0 = sline[l0].getP_lno()[n];
		l1 = sline[l1].getP_lno()[n];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" -%lu,%lu", l0, l1 - l0 - null_context);
	}
	public void dump_sline(Object line_prefix, long cnt, int num_parent, int use_color, int result_deleted) {
		long mark = (-1024 << num_parent);
		long no_pre_delete = (-1024 << num_parent);
		int i;
		long lno = 0;
		byte c_frag = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_FRAGINFO);
		byte c_func = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_FUNCINFO);
		byte c_new = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_FILE_NEW);
		byte c_old = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_FILE_OLD);
		byte c_context = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_CONTEXT);
		byte c_reset = /*Error: Function owner not recognized*/diff_get_color(use_color, color_diff.DIFF_RESET);
		if (result_deleted) {
			return /*Error: Unsupported expression*/;
		} 
		long generatedFlag = sl.getFlag();
		lline generatedLost = sl.getLost();
		long generatedParent_map = ll.getParent_map();
		Object generatedLine = ll.getLine();
		lline generatedNext = ll.getNext();
		Byte generatedBol = sl.getBol();
		int generatedLen = sl.getLen();
		while (1) {
			long hunk_end;
			long rlines;
			byte hunk_comment = ((Object)0);
			long null_context = 0;
			while (lno <= cnt && !(sline[lno].getFlag() & mark)) {
				if (ModernizedCProgram.hunk_comment_line(sline[lno].getBol())) {
					hunk_comment = sline[lno].getBol();
				} 
				lno++;
			}
			if (cnt < lno) {
				break;
			} else {
					for (hunk_end = lno + 1; hunk_end <= cnt; hunk_end++) {
						if (!(sline[hunk_end].getFlag() & mark)) {
							break;
						} 
					}
			} 
			rlines = hunk_end - lno;
			if (cnt < hunk_end) {
				/* pointing at the last delete hunk */rlines--;
			} 
			if (!ModernizedCProgram.context/*
						 * Even when running with --unified=0, all
						 * lines in the hunk needs to be processed in
						 * the loop below in order to show the
						 * deletion recorded in lost_head.  However,
						 * we do not want to show the resulting line
						 * with all blank context markers in such a
						 * case.  Compensate.
						 */) {
				long j;
				for (j = lno; j < hunk_end; j++) {
					if (!(sline[j].getFlag() & (mark - 1))) {
						null_context++;
					} 
				}
				rlines -= null_context;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s%s", line_prefix, c_frag);
			for (i = 0; i <= num_parent; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar(ModernizedCProgram.combine_marker);
			}
			for (i = 0; i < num_parent; i++) {
				sline.show_parent_lno(lno, hunk_end, i, null_context);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" +%lu,%lu ", lno + 1, rlines);
			for (i = 0; i <= num_parent; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar(ModernizedCProgram.combine_marker);
			}
			if (hunk_comment) {
				int comment_end = 0;
				for (i = 0; i < 40; i++) {
					int ch = hunk_comment[i] & -1024;
					if (!ch || ch == (byte)'\n') {
						break;
					} 
					if (!((ModernizedCProgram.sane_ctype[(byte)(ch)] & (true)) != 0)) {
						comment_end = i;
					} 
				}
				if (comment_end) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s%s %s%s", c_reset, c_context, c_reset, c_func);
				} 
				for (i = 0; i < comment_end; i++) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar(hunk_comment[i]);
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", c_reset);
			while (lno < hunk_end) {
				lline ll = new lline();
				int j;
				long p_mask;
				sline sl = sline[lno++];
				ll = (generatedFlag & no_pre_delete) ? ((Object)0) : generatedLost;
				while (ll) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s%s", line_prefix, c_old);
					for (j = 0; j < num_parent; j++) {
						if (generatedParent_map & (-1024 << j)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'-');
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)' ');
						} 
					}
					ModernizedCProgram.show_line_to_eol(generatedLine, -1, c_reset);
					ll = generatedNext;
				}
				if (cnt < lno) {
					break;
				} 
				p_mask = 1;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(line_prefix, (_iob[1]));
				if (!(generatedFlag & (mark - 1/*
								 * This sline was here to hang the
								 * lost lines in front of it.
								 */))) {
					if (!ModernizedCProgram.context) {
						continue;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(c_context, (_iob[1]));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(c_new, (_iob[1]));
				} 
				for (j = 0; j < num_parent; j++) {
					if (p_mask & generatedFlag) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'+');
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)' ');
					} 
					p_mask <<=  1;
				}
				ModernizedCProgram.show_line_to_eol(generatedBol, generatedLen, c_reset);
			}
		}
	}
	public void reuse_combine_diff(long cnt, int i, int j) {
		long lno;
		long imask;
		long jmask;
		imask = (-1024 << i);
		jmask = (-1024 << j);
		lline generatedLost = this.getLost();
		long[] generatedP_lno = this.getP_lno();
		long generatedParent_map = ll.getParent_map();
		lline generatedNext = ll.getNext();
		long generatedFlag = this.getFlag();
		for (lno = 0; lno <= cnt; lno++) {
			lline ll = generatedLost;
			generatedP_lno[i] = generatedP_lno[j];
			while (ll) {
				if (generatedParent_map & jmask) {
					generatedParent_map |=  imask;
				} 
				ll = generatedNext;
			}
			if (generatedFlag & jmask) {
				generatedFlag |=  imask;
			} 
			sline++;
		}
		generatedP_lno[i] = generatedP_lno[/* the overall size of the file (sline[cnt]) */j];
	}
	/* We have already examined parent j and we know parent i
		 * and parent j are the same, so reuse the combined result
		 * of parent j for parent i.
		 */
	public lline getLost() {
		return lost;
	}
	public void setLost(lline newLost) {
		lost = newLost;
	}
	public int getLenlost() {
		return lenlost;
	}
	public void setLenlost(int newLenlost) {
		lenlost = newLenlost;
	}
	public plost getPlost() {
		return plost;
	}
	public void setPlost(plost newPlost) {
		plost = newPlost;
	}
	public Byte getBol() {
		return bol;
	}
	public void setBol(Byte newBol) {
		bol = newBol;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public long getFlag() {
		return flag;
	}
	public void setFlag(long newFlag) {
		flag = newFlag;
	}
	public long[] getP_lno() {
		return p_lno;
	}
	public void setP_lno(long[] newP_lno) {
		p_lno = newP_lno;
	}
}
/* Accumulated and coalesced lost lines */
