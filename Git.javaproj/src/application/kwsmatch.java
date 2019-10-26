package application;

/* This file has been copied from commit e7ac713d^ in the GNU grep git
 * repository. A few small changes have been made to adapt the code to
 * Git.
 */
/* kwset.h - header declaring the keyword set library.
   Copyright (C) 1989, 1998, 2005 Free Software Foundation, Inc.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>. */
/* Written August 1989 by Mike Haertel.
   The author may be reached (Email) at the address mike@ai.mit.edu,
   or (US mail) as Mike Haertel c/o Free Software Foundation. */
public class kwsmatch {
	private int index;
	private Object offset;
	private Object size;
	
	public kwsmatch(int index, Object offset, Object size) {
		setIndex(index);
		setOffset(offset);
		setSize(size);
	}
	public kwsmatch() {
	}
	
	/* Hairy multiple string search. */
	public Object cwexec(Object kws, Object text, Object len) {
		kwset kwset = new kwset();
		trie next = new trie();
		trie trie = new trie();
		trie accept = new trie();
		byte beg;
		byte lim;
		byte mch;
		byte lmch;
		byte c;
		byte delta;
		int d;
		byte end;
		byte qlim;
		tree tree = new tree();
		byte trans;
		accept = ((Object)0);
		kwset = (kwset)/* Initialize register copies and look for easy ways out. */kws;
		if (len < kwset.getMind()) {
			return -1;
		} 
		next = kwset.getNext();
		delta = kwset.getDelta();
		trans = kwset.getTrans();
		lim = text + len;
		end = text;
		if ((d = kwset.getMind()) != 0) {
			mch = ((Object)0);
		} else {
				;
				;
		} 
		if (len >= 4 * kwset.getMind()) {
			qlim = lim - 4 * kwset.getMind();
		} else {
				qlim = ((Object)0);
		} 
		while (lim - end >= d) {
			if (qlim && end <= qlim) {
				end += d - 1;
				while ((d = delta[c = end]) && end < qlim) {
					end += d;
					end += delta[((byte)(end))];
					end += delta[((byte)(end))];
				}
				++end;
			} else {
					d = delta[c = (end += d)[-1]];
			} 
			if (d) {
				continue;
			} 
			beg = end - 1;
			trie = next[c];
			if (trie.getAccepting()) {
				mch = beg;
				accept = trie;
			} 
			d = trie.getShift();
			while (beg > text) {
				c = trans ? trans[((byte)(--beg))] : --beg;
				tree = trie.getLinks();
				while (tree && c != tree.getLabel()) {
					if (c < tree.getLabel()) {
						tree = tree.getLlink();
					} else {
							tree = tree.getRlink();
					} 
				}
				if (tree) {
					trie = tree.getTrie();
					if (trie.getAccepting()) {
						mch = beg;
						accept = trie;
					} 
				} else {
						break;
				} 
				d = trie.getShift();
			}
			if (mch) {
				;
			} 
		}
		return -1;
		lmch = ((Object)0);
		d = 1;
		while (lim - end >= d) {
			if ((d = delta[c = (end += d)[-1]]) != 0) {
				continue;
			} 
			beg = end - 1;
			if (!(trie = next[c])) {
				d = 1;
				continue;
			} 
			if (trie.getAccepting() && beg <= mch) {
				lmch = beg;
				accept = trie;
			} 
			d = trie.getShift();
			while (beg > text) {
				c = trans ? trans[((byte)(--beg))] : --beg;
				tree = trie.getLinks();
				while (tree && c != tree.getLabel()) {
					if (c < tree.getLabel()) {
						tree = tree.getLlink();
					} else {
							tree = tree.getRlink();
					} 
				}
				if (tree) {
					trie = tree.getTrie();
					if (trie.getAccepting() && beg <= mch) {
						lmch = beg;
						accept = trie;
					} 
				} else {
						break;
				} 
				d = trie.getShift();
			}
			if (lmch) {
				mch = lmch;
				;
			} 
			if (!d) {
				d = 1;
			} 
		}
		Object generatedOffset = this.getOffset();
		Object generatedSize = this.getSize();
		if (kwsmatch) {
			this.setIndex(accept.getAccepting() / 2);
			generatedOffset[0] = mch - text;
			generatedSize[0] = accept.getDepth();
		} 
		return mch - text/* Search through the given text for a match of any member of the
		   given keyword set.  Return a pointer to the first character of
		   the matching substring, or NULL if no match is found.  If FOUNDLEN
		   is non-NULL store in the referenced location the length of the
		   matching substring.  Similarly, if FOUNDIDX is non-NULL, store
		   in the referenced location the index number of the particular
		   keyword matched. */;
	}
	public Object kwsexec(Object kws, Object text, Object size) {
		kwset kwset = (kwset)kws;
		Object generatedOffset = this.getOffset();
		Object generatedSize = this.getSize();
		if (kwset.getWords() == 1 && kwset.getTrans() == ((Object)0)) {
			size_t ret = ModernizedCProgram.bmexec(kws, text, size);
			if (kwsmatch != ((Object)0) && ret != (size_t)-1) {
				this.setIndex(0);
				generatedOffset[0] = ret;
				generatedSize[0] = kwset.getMind();
			} 
			return ret;
		} else {
				return kwsmatch.cwexec(kws, text, size);
		} 
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
