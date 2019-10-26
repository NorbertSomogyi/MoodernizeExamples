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
public class s_diffdata {
	private long nrec;
	private Object ha;
	private Long rindex;
	private Byte rchg;
	
	public s_diffdata(long nrec, Object ha, Long rindex, Byte rchg) {
		setNrec(nrec);
		setHa(ha);
		setRindex(rindex);
		setRchg(rchg);
	}
	public s_diffdata() {
	}
	
	public long getNrec() {
		return nrec;
	}
	public void setNrec(long newNrec) {
		nrec = newNrec;
	}
	public Object getHa() {
		return ha;
	}
	public void setHa(Object newHa) {
		ha = newHa;
	}
	public Long getRindex() {
		return rindex;
	}
	public void setRindex(Long newRindex) {
		rindex = newRindex;
	}
	public Byte getRchg() {
		return rchg;
	}
	public void setRchg(Byte newRchg) {
		rchg = newRchg;
	}
}
