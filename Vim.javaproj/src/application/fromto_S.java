package application;

/* already compounded word, COMPOUNDROOT */
/* no compounding before this word */
/* no compounding after this word */
/* flags for <pflags> */
/* rare prefix */
/* prefix is not combining */
/* to-upper prefix */
/* prefix with COMPOUNDPERMITFLAG */
/* prefix with COMPOUNDFORBIDFLAG */
/* Flags for postponed prefixes in "sl_pidxs".  Must be above affixID (one
 * byte) and prefcondnr (two bytes). */
/* rare postponed prefix */
/* non-combining postponed prefix */
/* to-upper postponed prefix */
/* postponed prefix with
						  * COMPOUNDPERMITFLAG */
/* postponed prefix with
						  * COMPOUNDFORBIDFLAG */
/* flags for <compoptions> */
/* CHECKCOMPOUNDDUP */
/* CHECKCOMPOUNDREP */
/* CHECKCOMPOUNDCASE */
/* CHECKCOMPOUNDTRIPLE */
/* Info from "REP", "REPSAL" and "SAL" entries in ".aff" file used in si_rep,
 * si_repsal, sl_rep, and si_sal.  Not for sl_sal!
 * One replacement: from "ft_from" to "ft_to". */
public class fromto_S {
	private Object ft_from;
	private Object ft_to;
	
	public fromto_S(Object ft_from, Object ft_to) {
		setFt_from(ft_from);
		setFt_to(ft_to);
	}
	public fromto_S() {
	}
	
	public Object getFt_from() {
		return ft_from;
	}
	public void setFt_from(Object newFt_from) {
		ft_from = newFt_from;
	}
	public Object getFt_to() {
		return ft_to;
	}
	public void setFt_to(Object newFt_to) {
		ft_to = newFt_to;
	}
}
