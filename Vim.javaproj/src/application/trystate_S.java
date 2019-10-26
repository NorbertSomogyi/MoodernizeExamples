package application;

// When trying changed soundfold words it becomes slow when trying more than
// two changes.  With less then two changes it's slightly faster but we miss a
// few good suggestions.  In rare cases we need to try three of four changes.
// maximum score for first try
// maximum score for second try
// maximum score for third try
// big difference
// accept any score
// for spell_edit_score_limit()
// for spell_edit_score_limit() we need to know the minimum value of
// SCORE_ICASE, SCORE_SWAP, SCORE_DEL, SCORE_SIMILAR and SCORE_INS
// At start of node check for NUL bytes (goodword
// ends); if badword ends there is a match, otherwise
// try splitting word.
// try without prefix
// Undo splitting.
// Past NUL bytes at start of the node.
// Use each byte of the node.
// Delete a byte from the bad word.
// Prepare for inserting bytes.
// Insert a byte in the bad word.
// Swap two bytes.
// Undo swap two characters.
// Swap two characters over three.
// Undo Swap two characters over three.
// Undo rotate three characters left
// Undo rotate three characters right
// Prepare for using REP items.
// Use matching REP items from the .aff file.
// Undo a REP item replacement.
// End of this node.
/*
 * Struct to keep the state at each level in suggest_try_change().
 */
public class trystate_S {
	private  ts_state;
	private int ts_score;
	private Object ts_arridx;
	private int ts_curi;
	private Object ts_fidx;
	private Object ts_fidxtry;
	private Object ts_twordlen;
	private Object ts_prefixdepth;
	private Object ts_flags;
	private Object ts_tcharlen;
	private Object ts_tcharidx;
	private Object ts_isdiff;
	private Object ts_fcharstart;
	private Object ts_prewordlen;
	private Object ts_splitoff;
	private Object ts_splitfidx;
	private Object ts_complen;
	private Object ts_compsplit;
	private Object ts_save_badflags;
	private Object ts_delidx;
	
	public trystate_S( ts_state, int ts_score, Object ts_arridx, int ts_curi, Object ts_fidx, Object ts_fidxtry, Object ts_twordlen, Object ts_prefixdepth, Object ts_flags, Object ts_tcharlen, Object ts_tcharidx, Object ts_isdiff, Object ts_fcharstart, Object ts_prewordlen, Object ts_splitoff, Object ts_splitfidx, Object ts_complen, Object ts_compsplit, Object ts_save_badflags, Object ts_delidx) {
		setTs_state(ts_state);
		setTs_score(ts_score);
		setTs_arridx(ts_arridx);
		setTs_curi(ts_curi);
		setTs_fidx(ts_fidx);
		setTs_fidxtry(ts_fidxtry);
		setTs_twordlen(ts_twordlen);
		setTs_prefixdepth(ts_prefixdepth);
		setTs_flags(ts_flags);
		setTs_tcharlen(ts_tcharlen);
		setTs_tcharidx(ts_tcharidx);
		setTs_isdiff(ts_isdiff);
		setTs_fcharstart(ts_fcharstart);
		setTs_prewordlen(ts_prewordlen);
		setTs_splitoff(ts_splitoff);
		setTs_splitfidx(ts_splitfidx);
		setTs_complen(ts_complen);
		setTs_compsplit(ts_compsplit);
		setTs_save_badflags(ts_save_badflags);
		setTs_delidx(ts_delidx);
	}
	public trystate_S() {
	}
	
	/*
	 * Go one level deeper in the tree.
	 */
	public void go_deeper(int depth, int score_add) {
		ModernizedCProgram.stack[depth + 1] = ModernizedCProgram.stack[depth];
		ModernizedCProgram.stack[depth + 1].setTs_state(.STATE_START);
		ModernizedCProgram.stack[depth + 1].setTs_score(ModernizedCProgram.stack[depth].getTs_score() + score_add);
		// start just after length byte// start just after length byteModernizedCProgram.stack[depth + 1].setTs_curi(1);
		ModernizedCProgram.stack[depth + 1].setTs_flags(0/*
		 * "fword" is a good word with case folded.  Find the matching keep-case
		 * words and put it in "kword".
		 * Theoretically there could be several keep-case words that result in the
		 * same case-folded word, but we only find one...
		 */);
	}
	public  getTs_state() {
		return ts_state;
	}
	public void setTs_state( newTs_state) {
		ts_state = newTs_state;
	}
	public int getTs_score() {
		return ts_score;
	}
	public void setTs_score(int newTs_score) {
		ts_score = newTs_score;
	}
	public Object getTs_arridx() {
		return ts_arridx;
	}
	public void setTs_arridx(Object newTs_arridx) {
		ts_arridx = newTs_arridx;
	}
	public int getTs_curi() {
		return ts_curi;
	}
	public void setTs_curi(int newTs_curi) {
		ts_curi = newTs_curi;
	}
	public Object getTs_fidx() {
		return ts_fidx;
	}
	public void setTs_fidx(Object newTs_fidx) {
		ts_fidx = newTs_fidx;
	}
	public Object getTs_fidxtry() {
		return ts_fidxtry;
	}
	public void setTs_fidxtry(Object newTs_fidxtry) {
		ts_fidxtry = newTs_fidxtry;
	}
	public Object getTs_twordlen() {
		return ts_twordlen;
	}
	public void setTs_twordlen(Object newTs_twordlen) {
		ts_twordlen = newTs_twordlen;
	}
	public Object getTs_prefixdepth() {
		return ts_prefixdepth;
	}
	public void setTs_prefixdepth(Object newTs_prefixdepth) {
		ts_prefixdepth = newTs_prefixdepth;
	}
	public Object getTs_flags() {
		return ts_flags;
	}
	public void setTs_flags(Object newTs_flags) {
		ts_flags = newTs_flags;
	}
	public Object getTs_tcharlen() {
		return ts_tcharlen;
	}
	public void setTs_tcharlen(Object newTs_tcharlen) {
		ts_tcharlen = newTs_tcharlen;
	}
	public Object getTs_tcharidx() {
		return ts_tcharidx;
	}
	public void setTs_tcharidx(Object newTs_tcharidx) {
		ts_tcharidx = newTs_tcharidx;
	}
	public Object getTs_isdiff() {
		return ts_isdiff;
	}
	public void setTs_isdiff(Object newTs_isdiff) {
		ts_isdiff = newTs_isdiff;
	}
	public Object getTs_fcharstart() {
		return ts_fcharstart;
	}
	public void setTs_fcharstart(Object newTs_fcharstart) {
		ts_fcharstart = newTs_fcharstart;
	}
	public Object getTs_prewordlen() {
		return ts_prewordlen;
	}
	public void setTs_prewordlen(Object newTs_prewordlen) {
		ts_prewordlen = newTs_prewordlen;
	}
	public Object getTs_splitoff() {
		return ts_splitoff;
	}
	public void setTs_splitoff(Object newTs_splitoff) {
		ts_splitoff = newTs_splitoff;
	}
	public Object getTs_splitfidx() {
		return ts_splitfidx;
	}
	public void setTs_splitfidx(Object newTs_splitfidx) {
		ts_splitfidx = newTs_splitfidx;
	}
	public Object getTs_complen() {
		return ts_complen;
	}
	public void setTs_complen(Object newTs_complen) {
		ts_complen = newTs_complen;
	}
	public Object getTs_compsplit() {
		return ts_compsplit;
	}
	public void setTs_compsplit(Object newTs_compsplit) {
		ts_compsplit = newTs_compsplit;
	}
	public Object getTs_save_badflags() {
		return ts_save_badflags;
	}
	public void setTs_save_badflags(Object newTs_save_badflags) {
		ts_save_badflags = newTs_save_badflags;
	}
	public Object getTs_delidx() {
		return ts_delidx;
	}
	public void setTs_delidx(Object newTs_delidx) {
		ts_delidx = newTs_delidx;
	}
}
