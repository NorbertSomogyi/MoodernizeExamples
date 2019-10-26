package application;

public class lzma_dec {
	private Object rep0;
	private Object rep1;
	private Object rep2;
	private Object rep3;
	private lzma_state state;
	private Object len;
	private Object lc;
	private Object literal_pos_mask;
	private Object pos_mask;
	private Object is_match;
	private Object is_rep;
	private Object is_rep0;
	private Object is_rep1;
	private Object is_rep2;
	private Object is_rep0_long;
	private Object dist_slot;
	private Object dist_special;
	private Object dist_align;
	private lzma_len_dec match_len_dec;
	private lzma_len_dec rep_len_dec;
	private Object literal;
	
	public lzma_dec(Object rep0, Object rep1, Object rep2, Object rep3, lzma_state state, Object len, Object lc, Object literal_pos_mask, Object pos_mask, Object is_match, Object is_rep, Object is_rep0, Object is_rep1, Object is_rep2, Object is_rep0_long, Object dist_slot, Object dist_special, Object dist_align, lzma_len_dec match_len_dec, lzma_len_dec rep_len_dec, Object literal) {
		setRep0(rep0);
		setRep1(rep1);
		setRep2(rep2);
		setRep3(rep3);
		setState(state);
		setLen(len);
		setLc(lc);
		setLiteral_pos_mask(literal_pos_mask);
		setPos_mask(pos_mask);
		setIs_match(is_match);
		setIs_rep(is_rep);
		setIs_rep0(is_rep0);
		setIs_rep1(is_rep1);
		setIs_rep2(is_rep2);
		setIs_rep0_long(is_rep0_long);
		setDist_slot(dist_slot);
		setDist_special(dist_special);
		setDist_align(dist_align);
		setMatch_len_dec(match_len_dec);
		setRep_len_dec(rep_len_dec);
		setLiteral(literal);
	}
	public lzma_dec() {
	}
	
	public Object getRep0() {
		return rep0;
	}
	public void setRep0(Object newRep0) {
		rep0 = newRep0;
	}
	public Object getRep1() {
		return rep1;
	}
	public void setRep1(Object newRep1) {
		rep1 = newRep1;
	}
	public Object getRep2() {
		return rep2;
	}
	public void setRep2(Object newRep2) {
		rep2 = newRep2;
	}
	public Object getRep3() {
		return rep3;
	}
	public void setRep3(Object newRep3) {
		rep3 = newRep3;
	}
	public lzma_state getState() {
		return state;
	}
	public void setState(lzma_state newState) {
		state = newState;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getLc() {
		return lc;
	}
	public void setLc(Object newLc) {
		lc = newLc;
	}
	public Object getLiteral_pos_mask() {
		return literal_pos_mask;
	}
	public void setLiteral_pos_mask(Object newLiteral_pos_mask) {
		literal_pos_mask = newLiteral_pos_mask;
	}
	public Object getPos_mask() {
		return pos_mask;
	}
	public void setPos_mask(Object newPos_mask) {
		pos_mask = newPos_mask;
	}
	public Object getIs_match() {
		return is_match;
	}
	public void setIs_match(Object newIs_match) {
		is_match = newIs_match;
	}
	public Object getIs_rep() {
		return is_rep;
	}
	public void setIs_rep(Object newIs_rep) {
		is_rep = newIs_rep;
	}
	public Object getIs_rep0() {
		return is_rep0;
	}
	public void setIs_rep0(Object newIs_rep0) {
		is_rep0 = newIs_rep0;
	}
	public Object getIs_rep1() {
		return is_rep1;
	}
	public void setIs_rep1(Object newIs_rep1) {
		is_rep1 = newIs_rep1;
	}
	public Object getIs_rep2() {
		return is_rep2;
	}
	public void setIs_rep2(Object newIs_rep2) {
		is_rep2 = newIs_rep2;
	}
	public Object getIs_rep0_long() {
		return is_rep0_long;
	}
	public void setIs_rep0_long(Object newIs_rep0_long) {
		is_rep0_long = newIs_rep0_long;
	}
	public Object getDist_slot() {
		return dist_slot;
	}
	public void setDist_slot(Object newDist_slot) {
		dist_slot = newDist_slot;
	}
	public Object getDist_special() {
		return dist_special;
	}
	public void setDist_special(Object newDist_special) {
		dist_special = newDist_special;
	}
	public Object getDist_align() {
		return dist_align;
	}
	public void setDist_align(Object newDist_align) {
		dist_align = newDist_align;
	}
	public lzma_len_dec getMatch_len_dec() {
		return match_len_dec;
	}
	public void setMatch_len_dec(lzma_len_dec newMatch_len_dec) {
		match_len_dec = newMatch_len_dec;
	}
	public lzma_len_dec getRep_len_dec() {
		return rep_len_dec;
	}
	public void setRep_len_dec(lzma_len_dec newRep_len_dec) {
		rep_len_dec = newRep_len_dec;
	}
	public Object getLiteral() {
		return literal;
	}
	public void setLiteral(Object newLiteral) {
		literal = newLiteral;
	}
}
/* Distances of latest four matches */
/*
	 * Temporary buffer which holds small number of input bytes between
	 * decoder calls. See lzma2_lzma() for details.
	 */
