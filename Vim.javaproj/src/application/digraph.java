package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * digraph.c: code for digraphs
 */
public class digraph {
	private Object char1;
	private Object char2;
	private Object result;
	
	public digraph(Object char1, Object char2, Object result) {
		setChar1(char1);
		setChar2(char2);
		setResult(result);
	}
	public digraph() {
	}
	
	public void printdigraph(Object previous) {
		char_u[] buf = new char_u();
		char_u p = new char_u();
		int list_width;
		if ((ModernizedCProgram.dy_flags & -1024) || has_mbyte) {
			list_width = 13;
		} else {
				list_width = 11;
		} 
		Object generatedResult = this.getResult();
		Object generatedChar1 = this.getChar1();
		Object generatedChar2 = this.getChar2();
		if (generatedResult != 0) {
			if (previous != ((Object)0)) {
				int i;
				for (i = 0; header_table[i].getDg_header() != ((Object)0); ++i) {
					if (previous < header_table[i].getDg_start() && generatedResult >= header_table[i].getDg_start() && generatedResult < header_table[i + 1].getDg_start()) {
						ModernizedCProgram.digraph_header(((byte)(header_table[i].getDg_header())));
						break;
					} 
				}
				previous = generatedResult;
			} 
			if (ModernizedCProgram.msg_col > Columns - list_width) {
				ModernizedCProgram.msg_putchar((byte)'\n');
			} 
			if (ModernizedCProgram.msg_col) {
				while (ModernizedCProgram.msg_col % list_width != 0) {
					ModernizedCProgram.msg_putchar((byte)' ');
				}
			} 
			p = buf;
			p++ = generatedChar1;
			p++ = generatedChar2;
			p++ = (byte)' ';
			p = (byte)'\000';
			ModernizedCProgram.msg_outtrans(buf);
			p = buf;
			if (has_mbyte) {
				if (enc_utf8 && ModernizedCProgram.utf_iscomposing(generatedResult)) {
					p++ = (byte)' ';
				} 
				p += .UNRECOGNIZEDFUNCTIONNAME(generatedResult, p);
			} else {
					p++ = (char_u)generatedResult;
			} 
			p = (byte)'\000';
			ModernizedCProgram.msg_outtrans_attr(buf, ModernizedCProgram.highlight_attr[(int)(.HLF_8)]);
			p = buf;
			if (ModernizedCProgram.char2cells(generatedResult) == 1) {
				p++ = (byte)' ';
			} 
			ModernizedCProgram.vim_snprintf((byte)p,  - (p - buf), " %3d", generatedResult);
			ModernizedCProgram.msg_outtrans(buf/* FEAT_DIGRAPHS */);
		} 
	}
	// ¡ Vim 5.x compatible
	// ¢ Vim 5.x compatible
	// £ Vim 5.x compatible
	// ¤ Vim 5.x compatible
	// ¥ Vim 5.x compatible
	// ¦ Vim 5.x compatible
	// © Vim 5.x compatible
	// ¬ Vim 5.x compatible
	// ¯ Vim 5.x compatible
	// ° Vim 5.x compatible
	// ² Vim 5.x compatible
	// ³ Vim 5.x compatible
	// ¶ Vim 5.x compatible
	// · Vim 5.x compatible
	// ¹ Vim 5.x compatible
	// ¿ Vim 5.x compatible
	// À Vim 5.x compatible
	// Â Vim 5.x compatible
	// Ã Vim 5.x compatible
	// Ä Vim 5.x compatible
	// Å Vim 5.x compatible
	// È Vim 5.x compatible
	// Ê Vim 5.x compatible
	// Ë Vim 5.x compatible
	// Ì Vim 5.x compatible
	// Î Vim 5.x compatible
	// �? Vim 5.x compatible
	// Ñ Vim 5.x compatible
	// Ò Vim 5.x compatible
	// Ô Vim 5.x compatible
	// Õ Vim 5.x compatible
	// × Vim 5.x compatible
	// Ù Vim 5.x compatible
	// Û Vim 5.x compatible
	// Þ Vim 5.x compatible
	// à Vim 5.x compatible
	// â Vim 5.x compatible
	// ã Vim 5.x compatible
	// ä Vim 5.x compatible
	// å Vim 5.x compatible
	// è Vim 5.x compatible
	// ê Vim 5.x compatible
	// ë Vim 5.x compatible
	// ì Vim 5.x compatible
	// î Vim 5.x compatible
	// ñ Vim 5.x compatible
	// ò Vim 5.x compatible
	// ô Vim 5.x compatible
	// õ Vim 5.x compatible
	// ù Vim 5.x compatible
	// û Vim 5.x compatible
	// x XX  Vim 5.x compatible
	public Object getChar1() {
		return char1;
	}
	public void setChar1(Object newChar1) {
		char1 = newChar1;
	}
	public Object getChar2() {
		return char2;
	}
	public void setChar2(Object newChar2) {
		char2 = newChar2;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
}
