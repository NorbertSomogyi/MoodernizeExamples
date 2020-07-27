package application;

public class s_xdfile {
	private s_chastore rcha;
	private long nrec;
	private int hbits;
	private s_xrecord rhash;
	private long dstart;
	private long dend;
	private s_xrecord[][] recs;
	private byte[] rchg;
	private long[] rindex;
	private long nreff;
	private Long ha;
	
	public s_xdfile(s_chastore rcha, long nrec, int hbits, s_xrecord rhash, long dstart, long dend, s_xrecord[][] recs, byte[] rchg, long[] rindex, long nreff, Long ha) {
		setRcha(rcha);
		setNrec(nrec);
		setHbits(hbits);
		setRhash(rhash);
		setDstart(dstart);
		setDend(dend);
		setRecs(recs);
		setRchg(rchg);
		setRindex(rindex);
		setNreff(nreff);
		setHa(ha);
	}
	public s_xdfile() {
	}
	
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
	public long xdl_get_rec(long ri, Object rec) {
		s_xrecord[][] generatedRecs = this.getRecs();
		rec = generatedRecs[ri].getPtr();
		return generatedRecs[ri].getSize();
	}
	public int xdl_change_compact(s_xdfile xdfo, long flags) {
		xdlgroup g = new xdlgroup();
		xdlgroup go = new xdlgroup();
		long earliest_end;
		long end_matching_other;
		long groupsize;
		ModernizedCProgram.group_init(xdf, g);
		ModernizedCProgram.group_init(xdfo, go);
		long generatedEnd = g.getEnd();
		long generatedStart = g.getStart();
		int generatedEffective_indent = score.getEffective_indent();
		int generatedPenalty = score.getPenalty();
		if (!ModernizedCProgram.group_next(xdfo, go)) {
			ModernizedCProgram.xdl_bug("group sync broken at end of file");
		} 
		return 0;
	}
	public void xdl_free_ctx() {
		s_xrecord generatedRhash = this.getRhash();
		ModernizedCProgram.vim_free(generatedRhash);
		long[] generatedRindex = this.getRindex();
		ModernizedCProgram.vim_free(generatedRindex);
		byte[] generatedRchg = this.getRchg();
		ModernizedCProgram.vim_free(generatedRchg - 1);
		Long generatedHa = this.getHa();
		ModernizedCProgram.vim_free(generatedHa);
		s_xrecord[][] generatedRecs = this.getRecs();
		ModernizedCProgram.vim_free(generatedRecs);
		s_chastore generatedRcha = this.getRcha();
		generatedRcha.xdl_cha_free();
	}
	/*
	 * Early trim initial and terminal matching records.
	 */
	public int xdl_trim_ends(s_xdfile xdf2) {
		long i;
		long lim;
		xrecord_t recs1 = new xrecord_t();
		xrecord_t recs2 = new xrecord_t();
		s_xrecord[][] generatedRecs = this.getRecs();
		recs1 = generatedRecs;
		recs2 = generatedRecs;
		long generatedHa = (recs1).getHa();
		for (; i < lim; ) {
			if (generatedHa != generatedHa) {
				break;
			} 
		}
		this.setDstart(xdf2.setDstart(i));
		long generatedNrec = this.getNrec();
		recs1 = generatedRecs + generatedNrec - 1;
		recs2 = generatedRecs + generatedNrec - 1;
		for (; i < lim; ) {
			if (generatedHa != generatedHa) {
				break;
			} 
		}
		this.setDend(generatedNrec - i - 1);
		xdf2.setDend(generatedNrec - i - 1);
		return 0;
	}
	public s_chastore getRcha() {
		return rcha;
	}
	public void setRcha(s_chastore newRcha) {
		rcha = newRcha;
	}
	public long getNrec() {
		return nrec;
	}
	public void setNrec(long newNrec) {
		nrec = newNrec;
	}
	public int getHbits() {
		return hbits;
	}
	public void setHbits(int newHbits) {
		hbits = newHbits;
	}
	public s_xrecord getRhash() {
		return rhash;
	}
	public void setRhash(s_xrecord newRhash) {
		rhash = newRhash;
	}
	public long getDstart() {
		return dstart;
	}
	public void setDstart(long newDstart) {
		dstart = newDstart;
	}
	public long getDend() {
		return dend;
	}
	public void setDend(long newDend) {
		dend = newDend;
	}
	public s_xrecord[][] getRecs() {
		return recs;
	}
	public void setRecs(s_xrecord[][] newRecs) {
		recs = newRecs;
	}
	public byte[] getRchg() {
		return rchg;
	}
	public void setRchg(byte[] newRchg) {
		rchg = newRchg;
	}
	public long[] getRindex() {
		return rindex;
	}
	public void setRindex(long[] newRindex) {
		rindex = newRindex;
	}
	public long getNreff() {
		return nreff;
	}
	public void setNreff(long newNreff) {
		nreff = newNreff;
	}
	public Long getHa() {
		return ha;
	}
	public void setHa(Long newHa) {
		ha = newHa;
	}
}
