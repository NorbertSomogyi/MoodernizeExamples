package application;

// there is only one
// structure used by block_prep, op_delete and op_yank for blockwise operators
// also op_change, op_shift, op_insert, op_replace - AKelly
public class block_def {
	private int startspaces;
	private int endspaces;
	private int textlen;
	private Object textstart;
	private Object textcol;
	private Object start_vcol;
	private Object end_vcol;
	private int is_short;
	private int is_MAX;
	private int is_oneChar;
	private int pre_whitesp;
	private int pre_whitesp_c;
	private Object end_char_vcols;
	private Object start_char_vcols;
	
	public block_def(int startspaces, int endspaces, int textlen, Object textstart, Object textcol, Object start_vcol, Object end_vcol, int is_short, int is_MAX, int is_oneChar, int pre_whitesp, int pre_whitesp_c, Object end_char_vcols, Object start_char_vcols) {
		setStartspaces(startspaces);
		setEndspaces(endspaces);
		setTextlen(textlen);
		setTextstart(textstart);
		setTextcol(textcol);
		setStart_vcol(start_vcol);
		setEnd_vcol(end_vcol);
		setIs_short(is_short);
		setIs_MAX(is_MAX);
		setIs_oneChar(is_oneChar);
		setPre_whitesp(pre_whitesp);
		setPre_whitesp_c(pre_whitesp_c);
		setEnd_char_vcols(end_char_vcols);
		setStart_char_vcols(start_char_vcols);
	}
	public block_def() {
	}
	
	public int yank_copy_line(long y_idx) {
		char_u pnew = new char_u();
		int generatedStartspaces = this.getStartspaces();
		int generatedEndspaces = this.getEndspaces();
		int generatedTextlen = this.getTextlen();
		if ((pnew = ModernizedCProgram.alloc(generatedStartspaces + generatedEndspaces + generatedTextlen + 1)) == ((Object)0)) {
			return 0;
		} 
		ModernizedCProgram.y_current.getY_array()[y_idx] = pnew;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((pnew), ((byte)' '), ((size_t)generatedStartspaces));
		pnew += generatedStartspaces;
		Object generatedTextstart = this.getTextstart();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(pnew), (byte)(generatedTextstart), (size_t)((size_t)generatedTextlen));
		pnew += generatedTextlen;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((pnew), ((byte)' '), ((size_t)generatedEndspaces));
		pnew += generatedEndspaces;
		pnew = (byte)'\000';
		return 1/*
		 * Make a copy of the y_current register to register "reg".
		 */;
	}
	public int getStartspaces() {
		return startspaces;
	}
	public void setStartspaces(int newStartspaces) {
		startspaces = newStartspaces;
	}
	public int getEndspaces() {
		return endspaces;
	}
	public void setEndspaces(int newEndspaces) {
		endspaces = newEndspaces;
	}
	public int getTextlen() {
		return textlen;
	}
	public void setTextlen(int newTextlen) {
		textlen = newTextlen;
	}
	public Object getTextstart() {
		return textstart;
	}
	public void setTextstart(Object newTextstart) {
		textstart = newTextstart;
	}
	public Object getTextcol() {
		return textcol;
	}
	public void setTextcol(Object newTextcol) {
		textcol = newTextcol;
	}
	public Object getStart_vcol() {
		return start_vcol;
	}
	public void setStart_vcol(Object newStart_vcol) {
		start_vcol = newStart_vcol;
	}
	public Object getEnd_vcol() {
		return end_vcol;
	}
	public void setEnd_vcol(Object newEnd_vcol) {
		end_vcol = newEnd_vcol;
	}
	public int getIs_short() {
		return is_short;
	}
	public void setIs_short(int newIs_short) {
		is_short = newIs_short;
	}
	public int getIs_MAX() {
		return is_MAX;
	}
	public void setIs_MAX(int newIs_MAX) {
		is_MAX = newIs_MAX;
	}
	public int getIs_oneChar() {
		return is_oneChar;
	}
	public void setIs_oneChar(int newIs_oneChar) {
		is_oneChar = newIs_oneChar;
	}
	public int getPre_whitesp() {
		return pre_whitesp;
	}
	public void setPre_whitesp(int newPre_whitesp) {
		pre_whitesp = newPre_whitesp;
	}
	public int getPre_whitesp_c() {
		return pre_whitesp_c;
	}
	public void setPre_whitesp_c(int newPre_whitesp_c) {
		pre_whitesp_c = newPre_whitesp_c;
	}
	public Object getEnd_char_vcols() {
		return end_char_vcols;
	}
	public void setEnd_char_vcols(Object newEnd_char_vcols) {
		end_char_vcols = newEnd_char_vcols;
	}
	public Object getStart_char_vcols() {
		return start_char_vcols;
	}
	public void setStart_char_vcols(Object newStart_char_vcols) {
		start_char_vcols = newStart_char_vcols;
	}
}
