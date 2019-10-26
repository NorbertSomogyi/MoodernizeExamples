package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 */
/*
 * Keycode definitions for special keys.
 *
 * Any special key code sequences are replaced by these codes.
 */
/*
 * For MSDOS some keys produce codes larger than 0xff. They are split into two
 * chars, the first one is K_NUL (same value used in term.h).
 */
/* for MSDOS: special key follows */
/*
 * K_SPECIAL is the first byte of a special key code and is always followed by
 * two bytes.
 * The second byte can have any value. ASCII is used for normal termcap
 * entries, 0x80 and higher for special keys, see below.
 * The third byte is guaranteed to be between 0x02 and 0x7f.
 */
/*
 * Positive characters are "normal" characters.
 * Negative characters are special key codes.  Only characters below -0x200
 * are used to so that the absolute value can't be mistaken for a single-byte
 * character.
 */
/*
 * Characters 0x0100 - 0x01ff have a special meaning for abbreviations.
 * Multi-byte characters also have ABBR_OFF added, thus are above 0x0200.
 */
/*
 * NUL cannot be in the input string, therefore it is replaced by
 *	K_SPECIAL   KS_ZERO	KE_FILLER
 */
/*
 * K_SPECIAL cannot be in the input string, therefore it is replaced by
 *	K_SPECIAL   KS_SPECIAL	KE_FILLER
 */
/*
 * KS_EXTRA is used for keys that have no termcap name
 *	K_SPECIAL   KS_EXTRA	KE_xxx
 */
/*
 * KS_MODIFIER is used when a modifier is given for a (special) key
 *	K_SPECIAL   KS_MODIFIER	bitmask
 */
/*
 * These are used for the GUI
 *	K_SPECIAL   KS_xxx	KE_FILLER
 */
/*
 * These are used for DEC mouse
 */
/*
 * Used for switching Select mode back on after a mapping or menu.
 */
/*
 * Used for tearing off a menu.
 */
/* Used for JSB term mouse. */
/* Used a termcap entry that produces a normal character. */
/* Used for the qnx pterm mouse. */
/* Used for click in a tab pages label. */
/* Used for menu in a tab pages line. */
/* Used for the urxvt mouse. */
/* Used for the sgr mouse. */
/* Used for the GPM mouse. */
/*
 * Filler used after KS_SPECIAL and others
 */
/*
 * translation of three byte code "K_SPECIAL a b" into int "K_xxx" and back
 */
/*
 * get second or third byte when translating special key code into three bytes
 */
/*
 * get single int code from second byte after K_SPECIAL
 */
/*
 * Codes for keys that do not have a termcap name.
 * The numbers are fixed to make sure that recorded key sequences remain valid.
 * Add new entries at the end, not halfway.
 *
 * K_SPECIAL KS_EXTRA KE_xxx
 */
public enum key_extra {
	KE_NAME, 
	KE_S_UP, 
	KE_S_DOWN, 
	KE_S_F1, 
	KE_S_F2, 
	KE_S_F3, 
	KE_S_F4, 
	KE_S_F5, 
	KE_S_F6, 
	KE_S_F7, 
	KE_S_F8, 
	KE_S_F9, 
	KE_S_F10, 
	KE_S_F11, 
	KE_S_F12, 
	KE_S_F13, 
	KE_S_F14, 
	KE_S_F15, 
	KE_S_F16, 
	KE_S_F17, 
	KE_S_F18, 
	KE_S_F19, 
	KE_S_F20, 
	KE_S_F21, 
	KE_S_F22, 
	KE_S_F23, 
	KE_S_F24, 
	KE_S_F25, 
	KE_S_F26, 
	KE_S_F27, 
	KE_S_F28, 
	KE_S_F29, 
	KE_S_F30, 
	KE_S_F31, 
	KE_S_F32, 
	KE_S_F33, 
	KE_S_F34, 
	KE_S_F35, 
	KE_S_F36, 
	KE_S_F37, 
	KE_MOUSE, 
	KE_LEFTMOUSE, 
	KE_LEFTDRAG, 
	KE_LEFTRELEASE, 
	KE_MIDDLEMOUSE, 
	KE_MIDDLEDRAG, 
	KE_MIDDLERELEASE, 
	KE_RIGHTMOUSE, 
	KE_RIGHTDRAG, 
	KE_RIGHTRELEASE, 
	KE_IGNORE, 
	KE_TAB, 
	KE_S_TAB_OLD, 
	KE_SNIFF_UNUSED, 
	KE_XF1, 
	KE_XF2, 
	KE_XF3, 
	KE_XF4, 
	KE_XEND, 
	KE_ZEND, 
	KE_XHOME, 
	KE_ZHOME, 
	KE_XUP, 
	KE_XDOWN, 
	KE_XLEFT, 
	KE_XRIGHT, 
	KE_LEFTMOUSE_NM, 
	KE_LEFTRELEASE_NM, 
	KE_S_XF1, 
	KE_S_XF2, 
	KE_S_XF3, 
	KE_S_XF4, 
	KE_MOUSEDOWN, 
	KE_MOUSEUP, 
	KE_MOUSELEFT, 
	KE_MOUSERIGHT, 
	KE_KINS, 
	KE_KDEL, 
	KE_CSI, 
	KE_SNR, 
	KE_PLUG, 
	KE_CMDWIN, 
	KE_C_LEFT, 
	KE_C_RIGHT, 
	KE_C_HOME, 
	KE_C_END, 
	KE_X1MOUSE, 
	KE_X1DRAG, 
	KE_X1RELEASE, 
	KE_X2MOUSE, 
	KE_X2DRAG, 
	KE_X2RELEASE, 
	KE_DROP, 
	KE_CURSORHOLD, 
	KE_NOP, 
	KE_FOCUSGAINED, 
	KE_FOCUSLOST, 
	KE_MOUSEMOVE, 
	KE_CANCEL
}
