package application;

public class entry {
	private long hash;
	private long line1;
	private long line2;
	private entry next;
	private entry previous;
	private int anchor;
	
	public entry(long hash, long line1, long line2, entry next, entry previous, int anchor) {
		setHash(hash);
		setLine1(line1);
		setLine2(line2);
		setNext(next);
		setPrevious(previous);
		setAnchor(anchor);
	}
	public entry() {
	}
	
	public int binary_search(int longest, entry entry) {
		int left = -1;
		int right = longest;
		long generatedLine2 = entry.getLine2();
		while (left + 1 < right) {
			int middle = left + (right - left) / 2;
			if (sequence[middle].getLine2() > generatedLine2) {
				right = middle;
			} else {
					left = middle;
			} 
		}
		return /* return the index in "sequence", _not_ the sequence length */left/*
		 * The idea is to start with the list of common unique lines sorted by
		 * the order in file1.  For each of these pairs, the longest (partial)
		 * sequence whose last element's line2 is smaller is determined.
		 *
		 * For efficiency, the sequences are kept in a list containing exactly one
		 * item per sequence length: the sequence with the smallest last
		 * element (in terms of line2).
		 */;
	}
	public entry find_longest_common_sequence(hashmap map) {
		int generatedNr = map.getNr();
		entry sequence = (entry)ModernizedCProgram.lalloc((generatedNr * /*Error: Unsupported expression*/), 1);
		int longest = 0;
		int i;
		entry entry = new entry();
		/*
			 * If not -1, this entry in sequence must never be overridden.
			 * Therefore, overriding entries before this has no effect, so
			 * do not do that either.
			 */
		int anchor_i = -1;
		entry generatedFirst = map.getFirst();
		if (sequence == ((Object)/* Added to silence Coverity. */0)) {
			return generatedFirst;
		} 
		long generatedLine2 = entry.getLine2();
		int generatedAnchor = entry.getAnchor();
		entry generatedNext = entry.getNext();
		for (entry = generatedFirst; entry; entry = generatedNext) {
			if (!generatedLine2 || generatedLine2 == -1024) {
				continue;
			} 
			i = sequence.binary_search(longest, entry);
			entry.setPrevious(i < 0 ? ((Object)0) : sequence[i]);
			++i;
			if (i <= anchor_i) {
				continue;
			} 
			sequence[i] = entry;
			if (generatedAnchor) {
				anchor_i = i;
				longest = anchor_i + 1;
			}  else if (i == longest) {
				longest++;
			} 
		}
		if (!/* No common unique lines were found */longest) {
			ModernizedCProgram.vim_free(sequence);
			return ((Object)0);
		} 
		entry = sequence[longest - /* Iterate starting at the last element, adjusting the "next" members */1];
		entry.setNext(((Object)0));
		entry generatedPrevious = entry.getPrevious();
		while (generatedPrevious) {
			generatedPrevious.setNext(entry);
			entry = generatedPrevious;
		}
		ModernizedCProgram.vim_free(sequence);
		return entry;
	}
	public long getHash() {
		return hash;
	}
	public void setHash(long newHash) {
		hash = newHash;
	}
	public long getLine1() {
		return line1;
	}
	public void setLine1(long newLine1) {
		line1 = newLine1;
	}
	public long getLine2() {
		return line2;
	}
	public void setLine2(long newLine2) {
		line2 = newLine2;
	}
	public entry getNext() {
		return next;
	}
	public void setNext(entry newNext) {
		next = newNext;
	}
	public entry getPrevious() {
		return previous;
	}
	public void setPrevious(entry newPrevious) {
		previous = newPrevious;
	}
	public int getAnchor() {
		return anchor;
	}
	public void setAnchor(int newAnchor) {
		anchor = newAnchor;
	}
}
/*
		 * If 1, this entry can serve as an anchor. See
		 * Documentation/diff-options.txt for more information.
		 */
