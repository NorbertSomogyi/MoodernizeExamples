package application;

/* Sorted list of non-overlapping intervals of East Asian Ambiguous
 * characters, generated with ../runtime/tools/unicode.vim. */
/* Sorted list of non-overlapping intervals of all Emoji characters,
 * based on http://unicode.org/emoji/charts/emoji-list.html */
public class interval {
	private long first;
	private long last;
	
	public interval(long first, long last) {
		setFirst(first);
		setLast(last);
	}
	public interval() {
	}
	
	public int intable(Object size, int c) {
		int mid;
		int bot;
		int top;
		if (c < table[0].getFirst()) {
			return 0;
		} 
		bot = /* binary search in table */0;
		top = (int)(size /  - 1);
		while (top >= bot) {
			mid = (bot + top) / 2;
			if (table[mid].getLast() < c) {
				bot = mid + 1;
			}  else if (table[mid].getFirst() > c) {
				top = mid - 1;
			} else {
					return 1;
			} 
		}
		return 0;
	}
	public long getFirst() {
		return first;
	}
	public void setFirst(long newFirst) {
		first = newFirst;
	}
	public long getLast() {
		return last;
	}
	public void setLast(long newLast) {
		last = newLast;
	}
}
