package application;

/*
 * Idea here is very simple.
 *
 * Almost all data we are interested in are text, but sometimes we have
 * to deal with binary data.  So we cut them into chunks delimited by
 * LF byte, or 64-byte sequence, whichever comes first, and hash them.
 *
 * For those chunks, if the source buffer has more instances of it
 * than the destination buffer, that means the difference are the
 * number of bytes not copied from source to destination.  If the
 * counts are the same, everything was copied from source to
 * destination.  If the destination has more, everything was copied,
 * and destination added more.
 *
 * We are doing an approximation so we do not really have to waste
 * memory by actually storing the sequence.  We just hash them into
 * somewhere around 2^16 hashbuckets and count the occurrences.
 */
/* Wild guess at the initial hash size */
/* We leave more room in smaller hash but do not let it
 * grow to have unused hole too much.
 */
/* A prime rather carefully chosen between 2^16..2^17, so that
 * HASHBASE < INITIAL_FREE(17).  We want to keep the maximum hashtable
 * size under the current 2<<17 maximum, which can hold this many
 * different values before overflowing to hashtable of size 2<<18.
 */
public class spanhash {
	private int hashval;
	private int cnt;
	
	public spanhash(int hashval, int cnt) {
		setHashval(hashval);
		setCnt(cnt);
	}
	public spanhash() {
	}
	
	public int getHashval() {
		return hashval;
	}
	public void setHashval(int newHashval) {
		hashval = newHashval;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int newCnt) {
		cnt = newCnt;
	}
}
