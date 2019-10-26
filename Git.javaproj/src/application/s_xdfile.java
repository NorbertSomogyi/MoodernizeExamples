package application;

public class s_xdfile {
	private s_chastore rcha;
	private long nrec;
	private int hbits;
	private s_xrecord rhash;
	private long dstart;
	private long dend;
	private s_xrecord recs;
	private Byte rchg;
	private Long rindex;
	private long nreff;
	private Long ha;
	
	public s_xdfile(s_chastore rcha, long nrec, int hbits, s_xrecord rhash, long dstart, long dend, s_xrecord recs, Byte rchg, Long rindex, long nreff, Long ha) {
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
		ModernizedCProgram.free(generatedRhash);
		Long generatedRindex = this.getRindex();
		ModernizedCProgram.free(generatedRindex);
		Byte generatedRchg = this.getRchg();
		ModernizedCProgram.free(generatedRchg - 1);
		Long generatedHa = this.getHa();
		ModernizedCProgram.free(generatedHa);
		s_xrecord generatedRecs = this.getRecs();
		ModernizedCProgram.free(generatedRecs);
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
		s_xrecord generatedRecs = this.getRecs();
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
		s_xrecord generatedRecs = this.getRecs();
		rec = generatedRecs[ri].getPtr();
		return generatedRecs[ri].getSize();
	}
	public long match_func_rec(Object xecfg, long ri, Byte buf, long sz) {
		byte rec;
		long len = xdf.xdl_get_rec(ri, rec);
		if (!xecfg.getFind_func()) {
			return ModernizedCProgram.def_ff(rec, len, buf, sz, xecfg.getFind_func_priv());
		} 
		return .UNRECOGNIZEDFUNCTIONNAME(rec, len, buf, sz, xecfg.getFind_func_priv());
	}
	public int is_func_rec(Object xecfg, long ri) {
		byte[] dummy = new byte[1];
		return xdf.match_func_rec(xecfg, ri, dummy, ) >= 0;
	}
	public int is_empty_rec(long ri) {
		byte rec;
		long len = xdf.xdl_get_rec(ri, rec);
		while (len > 0 && (((ModernizedCProgram.sane_ctype[(byte)((byte)(rec))] & (true)) != 0))) {
			rec++;
			len--;
		}
		return !len;
	}
	public int is_eol_crlf(int i) {
		long size;
		if (i < ModernizedCProgram.file.getNrec() - 1) {
			return (size = ModernizedCProgram.file.getRecs()[i].getSize()) > /* All lines before the last *must* end in LF */1 && ModernizedCProgram.file.getRecs()[i].getPtr()[size - 2] == (byte)'\r';
		} 
		if (!ModernizedCProgram.file.getNrec()) {
			return -/* Cannot determine eol style from empty file */1;
		} 
		if ((size = ModernizedCProgram.file.getRecs()[i].getSize()) && ModernizedCProgram.file.getRecs()[i].getPtr()[size - 1] == (byte)'\n') {
			return size > /* Last line; ends in LF; Is it CR/LF? */1 && ModernizedCProgram.file.getRecs()[i].getPtr()[size - 2] == (byte)'\r';
		} 
		if (!i) {
			return -/* The only line has no eol */1;
		} 
		return (size = ModernizedCProgram.file.getRecs()[i - 1].getSize()) > /* Determine eol from second-to-last line */1 && ModernizedCProgram.file.getRecs()[i - 1].getPtr()[size - 2] == (byte)'\r';
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
	public s_xrecord getRecs() {
		return recs;
	}
	public void setRecs(s_xrecord newRecs) {
		recs = newRecs;
	}
	public Byte getRchg() {
		return rchg;
	}
	public void setRchg(Byte newRchg) {
		rchg = newRchg;
	}
	public Long getRindex() {
		return rindex;
	}
	public void setRindex(Long newRindex) {
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
