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
public class s_chanode {
	private s_chanode next;
	private long icurr;
	
	public s_chanode(s_chanode next, long icurr) {
		setNext(next);
		setIcurr(icurr);
	}
	public s_chanode() {
	}
	
	public s_chanode getNext() {
		return next;
	}
	public void setNext(s_chanode newNext) {
		next = newNext;
	}
	public long getIcurr() {
		return icurr;
	}
	public void setIcurr(long newIcurr) {
		icurr = newIcurr;
	}
}
