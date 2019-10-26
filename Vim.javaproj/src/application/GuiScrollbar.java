package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved		by Bram Moolenaar
 *				Motif support by Robert Webb
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 */
/* undef MIN and MAX because Intrinsic.h redefines them anyway */
// Needed when generating prototypes, since FEAT_GUI is always defined then.
/*# include <Memory.h>*/
/*# include <TextEdit.h>*/
/*
# include <ToolUtils.h>
# include <SegLoad.h>*/
/*
 * On some systems scrolling needs to be done right away instead of in the
 * main loop.
 */
/*
 * GUIs that support dropping files on a running Vim.
 */
/*
 * This define makes menus always use a fontset.
 * We're not sure if this code always works, thus it can be disabled.
 */
/*
 * These macros convert between character row/column and pixel coordinates.
 * TEXT_X   - Convert character column into X pixel coord for drawing strings.
 * TEXT_Y   - Convert character row into Y pixel coord for drawing strings.
 * FILL_X   - Convert character column into X pixel coord for filling the area
 *		under the character.
 * FILL_Y   - Convert character row into Y pixel coord for filling the area
 *		under the character.
 * X_2_COL  - Convert X pixel coord into character column.
 * Y_2_ROW  - Convert Y pixel coord into character row.
 */
/* Indices for arrays of scrollbars */
/* Orientations for scrollbars */
/* Default size of scrollbar */
/* Default height of the menu bar */
/* figure it out at runtime */
/* Flags for gui_mch_outstr_nowrap() */
/* wrap cursor at end of line */
/* invert the characters */
/* drawing cursor */
/* drawing transparent cursor */
/* don't clear selection */
/* Flags for gui_mch_draw_string() */
/* draw with transparent bg */
/* draw bold text */
/* draw underline text */
/* draw undercurl text */
/* draw italic text */
/* drawing block cursor (win32) */
/* strikethrough */
/* For our own tearoff menu item */
/* length of above string */
/* for the toolbar */
/* room above+below buttons for MSWindows */
/* use no_console_input() to check if there
				   is no console input possible */
public class GuiScrollbar {
	private long ident;
	private Object wp;
	private int type;
	private long value;
	private long size;
	private long max;
	private int top;
	private int height;
	private int width;
	private int status_height;
	
	public GuiScrollbar(long ident, Object wp, int type, long value, long size, long max, int top, int height, int width, int status_height) {
		setIdent(ident);
		setWp(wp);
		setType(type);
		setValue(value);
		setSize(size);
		setMax(max);
		setTop(top);
		setHeight(height);
		setWidth(width);
		setStatus_height(status_height);
	}
	public GuiScrollbar() {
	}
	
	public long getIdent() {
		return ident;
	}
	public void setIdent(long newIdent) {
		ident = newIdent;
	}
	public Object getWp() {
		return wp;
	}
	public void setWp(Object newWp) {
		wp = newWp;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long newValue) {
		value = newValue;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public long getMax() {
		return max;
	}
	public void setMax(long newMax) {
		max = newMax;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int newTop) {
		top = newTop;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getStatus_height() {
		return status_height;
	}
	public void setStatus_height(int newStatus_height) {
		status_height = newStatus_height;
	}
}
