package application;

/*
 *  LibXDiff by Davide Libenzi ( File Differential Library )
 *  Copyright (C) 2003  Davide Libenzi
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
public class s_xdlclass {
	private s_xdlclass next;
	private long ha;
	private Object line;
	private long size;
	private long idx;
	private long len1;
	private long len2;
	
	public s_xdlclass(s_xdlclass next, long ha, Object line, long size, long idx, long len1, long len2) {
		setNext(next);
		setHa(ha);
		setLine(line);
		setSize(size);
		setIdx(idx);
		setLen1(len1);
		setLen2(len2);
	}
	public s_xdlclass() {
	}
	
	public s_xdlclass getNext() {
		return next;
	}
	public void setNext(s_xdlclass newNext) {
		next = newNext;
	}
	public long getHa() {
		return ha;
	}
	public void setHa(long newHa) {
		ha = newHa;
	}
	public Object getLine() {
		return line;
	}
	public void setLine(Object newLine) {
		line = newLine;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public long getIdx() {
		return idx;
	}
	public void setIdx(long newIdx) {
		idx = newIdx;
	}
	public long getLen1() {
		return len1;
	}
	public void setLen1(long newLen1) {
		len1 = newLen1;
	}
	public long getLen2() {
		return len2;
	}
	public void setLen2(long newLen2) {
		len2 = newLen2;
	}
}
