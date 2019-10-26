package application;

/* Lines lost from parent */
/* Coalesce new lines into base by finding LCS */
public class lline {
	private lline next;
	private lline prev;
	private int len;
	private long parent_map;
	private Object line;
	
	public lline(lline next, lline prev, int len, long parent_map, Object line) {
		setNext(next);
		setPrev(prev);
		setLen(len);
		setParent_map(parent_map);
		setLine(line);
	}
	public lline() {
	}
	
	public lline coalesce_lines(int lenbase, lline newline, int lennew, long parent, long flags) {
		int lcs;
		coalesce_direction directions;
		lline baseend = new lline();
		lline newend = ((Object)0);
		int i;
		int j;
		int origbaselen = lenbase;
		if (newline == ((Object)0)) {
			return base;
		} 
		if (base == ((Object)0)) {
			lenbase = lennew;
			return newline/*
				 * Coalesce new lines into base by finding the LCS
				 * - Create the table to run dynamic programming
				 * - Compute the LCS
				 * - Then reverse read the direction structure:
				 *   - If we have MATCH, assign parent to base flag, and consume
				 *   both baseend and newend
				 *   - Else if we have BASE, consume baseend
				 *   - Else if we have NEW, insert newend lline into base and
				 *   consume newend
				 */;
		} 
		lcs = ModernizedCProgram.xcalloc(ModernizedCProgram.st_add(origbaselen, 1), );
		directions = ModernizedCProgram.xcalloc(ModernizedCProgram.st_add(origbaselen, 1), );
		for (i = 0; i < origbaselen + 1; i++) {
			lcs[i] = ModernizedCProgram.xcalloc(ModernizedCProgram.st_add(lennew, 1), );
			directions[i] = ModernizedCProgram.xcalloc(ModernizedCProgram.st_add(lennew, 1), );
			directions[i][0] = coalesce_direction.BASE;
		}
		for (j = 1; j < lennew + 1; j++) {
			directions[0][j] = coalesce_direction.NEW;
		}
		Object generatedLine = baseend.getLine();
		int generatedLen = baseend.getLen();
		lline generatedNext = newend.getNext();
		for (; i < origbaselen + 1; i++) {
			for (; j < lennew + 1; j++) {
				if (ModernizedCProgram.match_string_spaces(generatedLine, generatedLen, generatedLine, generatedLen, flags)) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
					directions[i][j] = coalesce_direction.MATCH;
				}  else if (lcs[i][j - 1] >= lcs[i - 1][j]) {
					lcs[i][j] = lcs[i][j - 1];
					directions[i][j] = coalesce_direction.NEW;
				} else {
						lcs[i][j] = lcs[i - 1][j];
						directions[i][j] = coalesce_direction.BASE;
				} 
				if (generatedNext) {
					newend = generatedNext;
				} 
			}
			if (generatedNext) {
				baseend = generatedNext;
			} 
		}
		for (i = 0; i < origbaselen + 1; i++) {
			ModernizedCProgram.free(lcs[i]);
		}
		ModernizedCProgram.free(lcs);
		/* At this point, baseend and newend point to the end of each lists */i--;
		j--;
		long generatedParent_map = baseend.getParent_map();
		lline generatedPrev = baseend.getPrev();
		while (i != 0 || j != 0) {
			if (directions[i][j] == coalesce_direction.MATCH) {
				generatedParent_map |=  1 << parent;
				baseend = generatedPrev;
				newend = generatedPrev;
				i--;
				j--;
			}  else if (directions[i][j] == coalesce_direction.NEW) {
				lline lline = new lline();
				lline = newend;
				if (generatedPrev) {
					generatedPrev.setNext(generatedNext);
				} else {
						newline = generatedNext;
				} 
				if (generatedNext) {
					generatedNext.setPrev(generatedPrev);
				} 
				newend = generatedPrev;
				j--;
				if (/* Add lline to base list */baseend) {
					lline.setNext(generatedNext);
					lline.setPrev(baseend);
					if (generatedPrev) {
						generatedPrev.setNext(lline);
					} 
				} else {
						lline.setNext(base);
						base = lline;
				} 
				(lenbase)++;
				if (generatedNext) {
					generatedNext.setPrev(lline);
				} 
			} else {
					baseend = generatedPrev;
					i--;
			} 
		}
		newend = newline;
		while (newend) {
			lline lline = newend;
			newend = generatedNext;
			ModernizedCProgram.free(lline);
		}
		for (i = 0; i < origbaselen + 1; i++) {
			ModernizedCProgram.free(directions[i]);
		}
		ModernizedCProgram.free(directions);
		return base;
	}
	public lline getNext() {
		return next;
	}
	public void setNext(lline newNext) {
		next = newNext;
	}
	public lline getPrev() {
		return prev;
	}
	public void setPrev(lline newPrev) {
		prev = newPrev;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public long getParent_map() {
		return parent_map;
	}
	public void setParent_map(long newParent_map) {
		parent_map = newParent_map;
	}
	public Object getLine() {
		return line;
	}
	public void setLine(Object newLine) {
		line = newLine;
	}
}
