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
 *
 * term.c: functions for controlling the terminal
 *
 * primitive termcap support for Amiga and Win32 included
 *
 * NOTE: padding and variable substitution is not performed,
 * when compiling without HAVE_TGETENT, we use tputs() and tgoto() dummies.
 */
/*
 * Some systems have a prototype for tgetstr() with (char *) instead of
 * (char **). This define removes that prototype. We include our own prototype
 * below.
 */
/* seems to be required for some Linux */
/*
 * A few linux systems define outfuntype in termcap.h to be used as the third
 * argument for tputs().
 */
/*
 * Here are the builtin termcap entries.  They are not stored as complete
 * structures with all entries, as such a structure is too big.
 *
 * The entries are compact, therefore they normally are included even when
 * HAVE_TGETENT is defined. When HAVE_TGETENT is defined, the builtin entries
 * can be accessed with "builtin_amiga", "builtin_ansi", "builtin_debug", etc.
 *
 * Each termcap is a list of builtin_term structures. It always starts with
 * KS_NAME, which separates the entries.  See parse_builtin_tcap() for all
 * details.
 * bt_entry is either a KS_xxx code (>= 0), or a K_xxx code.
 *
 * Entries marked with "guessed" may be wrong.
 */
/* The blink flag from the blinking-cursor mode response */
// set background color
// set foreground color
// colors
// terminator
public class builtin_term {
	private int bt_entry;
	private Byte bt_string;
	
	public builtin_term(int bt_entry, Byte bt_string) {
		setBt_entry(bt_entry);
		setBt_string(bt_string);
	}
	public builtin_term() {
	}
	
	public builtin_term find_builtin_term(Object term) {
		builtin_term p = new builtin_term();
		p = ModernizedCProgram.builtin_termcaps;
		Byte generatedBt_string = p.getBt_string();
		int generatedBt_entry = p.getBt_entry();
		while (generatedBt_string != ((Object)0)) {
			if (generatedBt_entry == (int)SpecialKey.KS_NAME) {
				if (.strcmp((byte)(term), (byte)(generatedBt_string)) == 0) {
					return p;
				} 
			} 
			++p;
		}
		return p/*
		 * Parsing of the builtin termcap entries.
		 * Caller should check if 'name' is a valid builtin term.
		 * The terminal's name is not set, as this is already done in termcapinit().
		 */;
	}
	public builtin_term find_first_tcap(Object name, int code) {
		builtin_term p = new builtin_term();
		Byte generatedBt_string = p.getBt_string();
		int generatedBt_entry = p.getBt_entry();
		builtin_term builtin_term = new builtin_term();
		for (p = builtin_term.find_builtin_term(name); generatedBt_string != ((Object)0); ++p) {
			if (generatedBt_entry == code) {
				return p;
			} 
		}
		return ((Object)0/*
		 * For Win32 console: replace the sequence immediately after termguicolors.
		 */);
	}
	public int getBt_entry() {
		return bt_entry;
	}
	public void setBt_entry(int newBt_entry) {
		bt_entry = newBt_entry;
	}
	public Byte getBt_string() {
		return bt_string;
	}
	public void setBt_string(Byte newBt_string) {
		bt_string = newBt_string;
	}
}
/*
 * GUI pseudo term-cap.
 */
/* attributes switched on with 'h', off with * 'H' */
/* HL_ALL */
/* HL_INVERSE */
/* HL_BOLD */
/* HL_STANDOUT */
// clear to end of line
// add new blank line
// add number of new blank lines
// add number of new blank lines
// delete line
// delete number of lines
// delete number of lines
// clear screen
// clear to end of display
// cursor invisible
// cursor visible
// normal
// reverse: black on lightgray
// bold: white on black
// standout: white on blue
// standout end
// standout: high intensity
// standout end
// italic: blue text on yellow
// italic end
// underscore: cyan text on red
// underscore end
// allow 16 colors
// set background color
// set foreground color
// set background color
// set foreground color
// save to move cur in reverse mode
// cursor motion
// cursor motion
// visual bell
// put terminal in termcap mode
// out of termcap mode
// scroll region
// scroll region
// Note: cursor key sequences for application cursor mode are omitted,
// because they interfere with typed commands: <Esc>OA.
// These sequences starting with <Esc> O may interfere with what the user
// is typing.  Remove these if that bothers you.
