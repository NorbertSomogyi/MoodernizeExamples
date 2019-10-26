package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved    by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * arabic.c: functions for Arabic language
 *
 * Author: Nadim Shaikli & Isam Bayazidi
 * Farsi support and restructuring to make adding new letters easier by Ali
 * Gholami Rudi.  Further work by Ameretat Reith.
 */
/*
 * Sorted list of unicode Arabic characters.  Each entry holds the
 * presentation forms of a letter.
 *
 * Arabic characters are categorized into following types:
 *
 * Isolated	- iso-8859-6 form
 * Initial	- unicode form-B start
 * Medial	- unicode form-B middle
 * Final	- unicode form-B final
 * Stand-Alone	- unicode form-B isolated
 */
// Unicode values for Arabic characters.
/*
 * Find the struct achar pointer to the given Arabic char.
 * Returns NULL if not found.
 */
public class achar {
	private int c;
	private int isolated;
	private int initial;
	private int medial;
	private int final;
	
	public achar(int c, int isolated, int initial, int medial, int final) {
		setC(c);
		setIsolated(isolated);
		setInitial(initial);
		setMedial(medial);
		setFinal(final);
	}
	public achar() {
	}
	
	public achar find_achar(int c) {
		int h;
		int m;
		int l;
		// using binary search to find c// using binary search to find ch = ( / );
		l = 0;
		while (l < h) {
			m = (h + l) / 2;
			if (achars[m].getC() == (int)c) {
				return achars[m];
			} 
			if ((int)c < achars[m].getC()) {
				h = m;
			} else {
					l = m + 1;
			} 
		}
		return ((Object)0/*
		 * Change shape - from Combination (2 char) to an Isolated
		 */);
	}
	public int getC() {
		return c;
	}
	public void setC(int newC) {
		c = newC;
	}
	public int getIsolated() {
		return isolated;
	}
	public void setIsolated(int newIsolated) {
		isolated = newIsolated;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int newInitial) {
		initial = newInitial;
	}
	public int getMedial() {
		return medial;
	}
	public void setMedial(int newMedial) {
		medial = newMedial;
	}
	public int getFinal() {
		return final;
	}
	public void setFinal(int newFinal) {
		final = newFinal;
	}
}
