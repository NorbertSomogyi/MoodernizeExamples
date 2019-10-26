package application;

/*
 *  LibXDiff by Davide Libenzi ( File Differential Library )
 *  Copyright (C) 2003	Davide Libenzi
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
public class s_xdpsplit {
	private long i1;
	private long i2;
	private int min_lo;
	private int min_hi;
	
	public s_xdpsplit(long i1, long i2, int min_lo, int min_hi) {
		setI1(i1);
		setI2(i2);
		setMin_lo(min_lo);
		setMin_hi(min_hi);
	}
	public s_xdpsplit() {
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
	public int getMin_lo() {
		return min_lo;
	}
	public void setMin_lo(int newMin_lo) {
		min_lo = newMin_lo;
	}
	public int getMin_hi() {
		return min_hi;
	}
	public void setMin_hi(int newMin_hi) {
		min_hi = newMin_hi;
	}
}
