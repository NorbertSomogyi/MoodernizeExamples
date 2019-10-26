package application;

// used for BEHIND and NOBEHIND matching
public class regbehind_S {
	private  save_after;
	private  save_behind;
	private int save_need_clear_subexpr;
	private Object save_start;
	private Object save_end;
	
	public regbehind_S( save_after,  save_behind, int save_need_clear_subexpr, Object save_start, Object save_end) {
		setSave_after(save_after);
		setSave_behind(save_behind);
		setSave_need_clear_subexpr(save_need_clear_subexpr);
		setSave_start(save_start);
		setSave_end(save_end);
	}
	public regbehind_S() {
	}
	
	public void save_subexpr() {
		int i;
		// When "rex.need_clear_subexpr" is set we don't need to save the values,
		// only remember that this flag needs to be set again when restoring.// only remember that this flag needs to be set again when restoring.this.setSave_need_clear_subexpr(ModernizedCProgram.rex.getNeed_clear_subexpr());
		Object generatedSave_start = this.getSave_start();
		Object generatedSave_end = this.getSave_end();
		if (!ModernizedCProgram.rex.getNeed_clear_subexpr()) {
			for (i = 0; i < NSUBEXP; ++i) {
				if (REG_MULTI) {
					generatedSave_start[i].getSe_u().setPos(ModernizedCProgram.rex.getReg_startpos()[i]);
					generatedSave_end[i].getSe_u().setPos(ModernizedCProgram.rex.getReg_endpos()[i]);
				} else {
						generatedSave_start[i].getSe_u().setPtr(ModernizedCProgram.rex.getReg_startp()[i]);
						generatedSave_end[i].getSe_u().setPtr(ModernizedCProgram.rex.getReg_endp()[i]);
				} 
			}
		} 
	}
	/*
	 * Restore the subexpr from "bp".
	 */
	public void restore_subexpr() {
		int i;
		int generatedSave_need_clear_subexpr = this.getSave_need_clear_subexpr();
		// Only need to restore saved values when they are not to be cleared.// Only need to restore saved values when they are not to be cleared.ModernizedCProgram.rex.setNeed_clear_subexpr(generatedSave_need_clear_subexpr);
		Object generatedSave_start = this.getSave_start();
		Object generatedSave_end = this.getSave_end();
		if (!ModernizedCProgram.rex.getNeed_clear_subexpr()) {
			for (i = 0; i < NSUBEXP; ++i) {
				if (REG_MULTI) {
					ModernizedCProgram.rex.getReg_startpos()[i] = generatedSave_start[i].getSe_u().getPos();
					ModernizedCProgram.rex.getReg_endpos()[i] = generatedSave_end[i].getSe_u().getPos();
				} else {
						ModernizedCProgram.rex.getReg_startp()[i] = generatedSave_start[i].getSe_u().getPtr();
						ModernizedCProgram.rex.getReg_endp()[i] = generatedSave_end[i].getSe_u().getPtr();
				} 
			}
		} 
	}
	// Current node.
	// timeout limit or NULL
	// flag set on timeout or NULL
	// Next node.
	// one of the RA_ values:
	// Make "regstack" and "backpos" empty.  They are allocated and freed in
	// bt_regexec_both() to reduce malloc()/free() calls.
	// Repeat until "regstack" is empty.
	// Some patterns may take a long time to match, e.g., "\([a-z]\+\)\+Q".
	// Allow interrupting them with CTRL-C.
	// Repeat for items that can be matched sequentially, without using the
	// regstack.
	// Check for timeout once in a 100 times to avoid overhead.
	// Check for character class with NL added.
	// We're not at the beginning of the file when below the first
	// line where we started, not at the start of the line or we
	// didn't start at the first line of the buffer.
	// Check if the buffer is in a window and compare the
	// rex.reg_win->w_cursor position to the match position.
	// Compare the mark position to the match position.
	// mark doesn't exist
	// mark isn't set in reg_buf
	// \<word; rex.input points to w
	// Can't match at end of line
	// Get class of current and previous char (if it exists).
	// not on a word at all
	// previous char is in same word
	// word\>; rex.input points after d
	// Can't match at start of line
	// Get class of current and previous char (if it exists).
	// Matched with EOW
	// ANY does not match new lines.
	// Inline the first byte, for speed.
	// match empty string always works; happens when "~" is
	// empty.
	// matched a single byte above
	// Need to match first byte again for multi-byte.
	// Check for following composing character, unless %C
	// follows (skips over all composing chars).
	// raaron: This code makes a composing character get
	// ignored, which is the correct behavior (sometimes)
	// for voweled Hebrew texts.
	// Safety check (just in case 'encoding' was changed since
	// compiling the program).
	// When only a composing char is given match at any
	// position where that composing char appears.
	// Include all following composing chars.
	// Skip composing characters.
	// When we run into BACK we need to check if we don't keep
	// looping without matching any input.  The second and later
	// times a BACK is encountered it fails if the input is still
	// at the same position as the previous time.
	// The positions are stored in "backpos" and found by the
	// current value of "scan", the position in the RE program.
	// First time at this BACK, make room to store the pos.
	// get "ga_data" again, it may have changed
	// Still at same position as last time, fail.
	// Match start: \zs
	// \(
	// We simply continue and handle the result when done.
	// \%(
	// \) after \%(
	// We simply continue and handle the result when done.
	// We simply continue and handle the result when done.
	// Match end: \ze
	// \)
	// We simply continue and handle the result when done.
	// \) after \z(
	// We simply continue and handle the result when done.
	// Single-line regexp
	// Backref was not set: Match an empty string.
	public  getSave_after() {
		return save_after;
	}
	public void setSave_after( newSave_after) {
		save_after = newSave_after;
	}
	public  getSave_behind() {
		return save_behind;
	}
	public void setSave_behind( newSave_behind) {
		save_behind = newSave_behind;
	}
	public int getSave_need_clear_subexpr() {
		return save_need_clear_subexpr;
	}
	public void setSave_need_clear_subexpr(int newSave_need_clear_subexpr) {
		save_need_clear_subexpr = newSave_need_clear_subexpr;
	}
	public Object getSave_start() {
		return save_start;
	}
	public void setSave_start(Object newSave_start) {
		save_start = newSave_start;
	}
	public Object getSave_end() {
		return save_end;
	}
	public void setSave_end(Object newSave_end) {
		save_end = newSave_end;
	}
}
