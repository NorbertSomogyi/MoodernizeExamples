package application;

/*
 *  LibXDiff by Davide Libenzi ( File Differential Library )
 *  Copyright (C) 2003-2006 Davide Libenzi, Johannes E. Schindelin
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, see
 *  <http://www.gnu.org/licenses/>.
 *
 *  Davide Libenzi <davidel@xmailserver.org>
 *
 */
public class s_xdmerge {
	private s_xdmerge next;
	private int mode;
	private long i1;
	private long i2;
	private long chg1;
	private long chg2;
	private long i0;
	private long chg0;
	
	public s_xdmerge(s_xdmerge next, int mode, long i1, long i2, long chg1, long chg2, long i0, long chg0) {
		setNext(next);
		setMode(mode);
		setI1(i1);
		setI2(i2);
		setChg1(chg1);
		setChg2(chg2);
		setI0(i0);
		setChg0(chg0);
	}
	public s_xdmerge() {
	}
	
	public int xdl_append_merge(int mode, long i0, long chg0, long i1, long chg1, long i2, long chg2) {
		xdmerge_t m = merge;
		long generatedI1 = m.getI1();
		long generatedChg1 = m.getChg1();
		long generatedI2 = m.getI2();
		long generatedChg2 = m.getChg2();
		int generatedMode = m.getMode();
		long generatedI0 = m.getI0();
		if (m && (i1 <= generatedI1 + generatedChg1 || i2 <= generatedI2 + generatedChg2)) {
			if (mode != generatedMode) {
				m.setMode(0);
			} 
			m.setChg0(i0 + chg0 - generatedI0);
			m.setChg1(i1 + chg1 - generatedI1);
			m.setChg2(i2 + chg2 - generatedI2);
		} else {
				m = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
				if (!m) {
					return -1;
				} 
				m.setNext(((Object)0));
				m.setMode(mode);
				m.setI0(i0);
				m.setChg0(chg0);
				m.setI1(i1);
				m.setChg1(chg1);
				m.setI2(i2);
				m.setChg2(chg2);
				if (merge) {
					(merge).setNext(m);
				} 
				merge = m;
		} 
		return 0;
	}
	public int xdl_cleanup_merge() {
		int count = 0;
		xdmerge_t next_c = new xdmerge_t();
		int generatedMode = this.getMode();
		s_xdmerge generatedNext = this.getNext();
		for (; c; c = /* were there conflicts? */next_c) {
			if (generatedMode == 0) {
				count++;
			} 
			next_c = generatedNext;
			ModernizedCProgram.free(c);
		}
		return count;
	}
	public void xdl_merge_two_conflicts() {
		s_xdmerge generatedNext = this.getNext();
		xdmerge_t next_m = generatedNext;
		long generatedI1 = next_m.getI1();
		long generatedChg1 = next_m.getChg1();
		this.setChg1(generatedI1 + generatedChg1 - generatedI1);
		long generatedI2 = next_m.getI2();
		long generatedChg2 = next_m.getChg2();
		this.setChg2(generatedI2 + generatedChg2 - generatedI2);
		this.setNext(generatedNext);
		ModernizedCProgram.free(next_m/*
		 * If there are less than 3 non-conflicting lines between conflicts,
		 * it appears simpler -- because it takes up less (or as many) lines --
		 * if the lines are moved into the conflicts.
		 */);
	}
	public s_xdmerge getNext() {
		return next;
	}
	public void setNext(s_xdmerge newNext) {
		next = newNext;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public long getI1() {
		return i1;
	}
	public void setI1(long newI1) {
		i1 = newI1;
	}
	public long getI2() {
		return i2;
	}
	public void setI2(long newI2) {
		i2 = newI2;
	}
	public long getChg1() {
		return chg1;
	}
	public void setChg1(long newChg1) {
		chg1 = newChg1;
	}
	public long getChg2() {
		return chg2;
	}
	public void setChg2(long newChg2) {
		chg2 = newChg2;
	}
	public long getI0() {
		return i0;
	}
	public void setI0(long newI0) {
		i0 = newI0;
	}
	public long getChg0() {
		return chg0;
	}
	public void setChg0(long newChg0) {
		chg0 = newChg0;
	}
}
/*
	 * 0 = conflict,
	 * 1 = no conflict, take first,
	 * 2 = no conflict, take second.
	 * 3 = no conflict, take both.
	 */
