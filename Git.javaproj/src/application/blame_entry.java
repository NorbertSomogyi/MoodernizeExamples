package application;

/* linked list of blames */
public class blame_entry {
	private blame_entry next;
	private int lno;
	private int num_lines;
	private blame_origin suspect;
	private int s_lno;
	private int score;
	private int ignored;
	private int unblamable;
	
	public blame_entry(blame_entry next, int lno, int num_lines, blame_origin suspect, int s_lno, int score, int ignored, int unblamable) {
		setNext(next);
		setLno(lno);
		setNum_lines(num_lines);
		setSuspect(suspect);
		setS_lno(s_lno);
		setScore(score);
		setIgnored(ignored);
		setUnblamable(unblamable);
	}
	public blame_entry() {
	}
	
	public blame_entry blame_merge(blame_entry list2) {
		blame_entry p1 = list1;
		blame_entry p2 = list2;
		blame_entry tail = list1;
		if (!p1) {
			return p2;
		} 
		if (!p2) {
			return p1;
		} 
		int generatedS_lno = p1.getS_lno();
		blame_entry generatedNext = p1.getNext();
		if (generatedS_lno <= generatedS_lno) {
			do {
				tail = generatedNext;
				if ((p1 = tail) == ((Object)0)) {
					tail = p2;
					return list1;
				} 
			} while (generatedS_lno <= generatedS_lno);
		} 
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			tail = p2;
			do {
				tail = generatedNext;
				if ((p2 = tail) == ((Object)0)) {
					tail = p1;
					return list1;
				} 
			} while (generatedS_lno > generatedS_lno);
			tail = p1;
			do {
				tail = generatedNext;
				if ((p1 = tail) == ((Object)0)) {
					tail = p2;
					return list1;
				} 
			} while (generatedS_lno <= generatedS_lno);
		}
	}
	public void add_blame_entry(Object src) {
		blame_entry e = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(e, src, /*Error: sizeof expression not supported yet*/);
		blame_origin generatedSuspect = e.getSuspect();
		generatedSuspect.blame_origin_incref();
		e.setNext(queue);
		queue = e;
		blame_entry generatedNext = e.getNext();
		queue = generatedNext;
	}
	public void dup_entry(blame_entry dst, blame_entry src) {
		blame_origin generatedSuspect = src.getSuspect();
		generatedSuspect.blame_origin_incref();
		generatedSuspect.blame_origin_decref();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, src, /*Error: sizeof expression not supported yet*/);
		dst.setNext(queue);
		queue = dst;
		blame_entry generatedNext = dst.getNext();
		queue = generatedNext;
	}
	public void split_blame(blame_entry unblamed, blame_entry[] split, blame_entry e) {
		if (split[0].getSuspect() && split[2].getSuspect()) {
			unblamed.dup_entry(e, split[/* The first part (reuse storage for the existing entry e) */0]);
			unblamed.add_blame_entry(split[/* The last part -- me */2]);
			blamed.add_blame_entry(split[/* ... and the middle part -- parent */1]);
		}  else if (!split[0].getSuspect() && !split[2].getSuspect()) {
			blamed.dup_entry(e, split[1]);
		}  else if (split[0].getSuspect()) {
			unblamed.dup_entry(e, split[/* me and then parent */0]);
			blamed.add_blame_entry(split[1]);
		} else {
				blamed.dup_entry(e, split[/* parent and then me */1]);
				unblamed.add_blame_entry(split[2/*
				 * After splitting the blame, the origins used by the
				 * on-stack blame_entry should lose one refcnt each.
				 */]);
		} 
	}
	public void decref_split() {
		int i;
		for (i = 0; i < 3; i++) {
			split[i].getSuspect().blame_origin_decref();
		}
	}
	public blame_entry reverse_blame(blame_entry tail) {
		blame_entry generatedNext = this.getNext();
		while (head) {
			blame_entry next = generatedNext;
			this.setNext(tail);
			tail = head;
			head = next;
		}
		return tail/*
		 * Splits a blame entry into two entries at 'len' lines.  The original 'e'
		 * consists of len lines, i.e. [e->lno, e->lno + len), and the second part,
		 * which is returned, consists of the remainder: [e->lno + len, e->lno +
		 * e->num_lines).  The caller needs to sort out the reference counting for the
		 * new entry's suspect.
		 */;
	}
	public blame_entry split_blame_at(int len, blame_origin new_suspect) {
		blame_entry n = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		n.setSuspect(new_suspect);
		int generatedIgnored = this.getIgnored();
		n.setIgnored(generatedIgnored);
		int generatedUnblamable = this.getUnblamable();
		n.setUnblamable(generatedUnblamable);
		int generatedLno = this.getLno();
		n.setLno(generatedLno + len);
		int generatedS_lno = this.getS_lno();
		n.setS_lno(generatedS_lno + len);
		int generatedNum_lines = this.getNum_lines();
		n.setNum_lines(generatedNum_lines - len);
		this.setNum_lines(len);
		this.setScore(0);
		return n;
	}
	public blame_entry filter_small(blame_scoreboard sb, blame_entry source, int score_min) {
		blame_entry p = source;
		blame_entry oldsmall = small;
		blame_entry generatedNext = p.getNext();
		while (p) {
			if (ModernizedCProgram.blame_entry_score(sb, p) <= score_min) {
				small = p;
				small = generatedNext;
				p = small;
			} else {
					source = p;
					source = generatedNext;
					p = source;
			} 
		}
		small = oldsmall;
		source = ((Object)0);
		return small/*
		 * See if lines currently target is suspected for can be attributed to
		 * parent.
		 */;
	}
	public blame_entry blame_entry_prepend(long start, long end, blame_origin o) {
		blame_entry new_head = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		new_head.setLno(start);
		new_head.setNum_lines(end - start);
		new_head.setSuspect(o);
		new_head.setS_lno(start);
		new_head.setNext(head);
		o.blame_origin_incref();
		return new_head;
	}
	public blame_entry getNext() {
		return next;
	}
	public void setNext(blame_entry newNext) {
		next = newNext;
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int newLno) {
		lno = newLno;
	}
	public int getNum_lines() {
		return num_lines;
	}
	public void setNum_lines(int newNum_lines) {
		num_lines = newNum_lines;
	}
	public blame_origin getSuspect() {
		return suspect;
	}
	public void setSuspect(blame_origin newSuspect) {
		suspect = newSuspect;
	}
	public int getS_lno() {
		return s_lno;
	}
	public void setS_lno(int newS_lno) {
		s_lno = newS_lno;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int newScore) {
		score = newScore;
	}
	public int getIgnored() {
		return ignored;
	}
	public void setIgnored(int newIgnored) {
		ignored = newIgnored;
	}
	public int getUnblamable() {
		return unblamable;
	}
	public void setUnblamable(int newUnblamable) {
		unblamable = newUnblamable;
	}
}
/* the first line of this group in the final image;
	 * internally all line numbers are 0 based.
	 */
