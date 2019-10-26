package application;

/* handle for a GUI fontset */
/* handle for a GUI font */
/* handle for a GUI fontset */
/* handle for a GUI font */
/* handle for a GUI fontset */
// Use spawn when GUI is starting.
// Uncomment the next definition if you want to use the `:gui` command on
// Windows.  It uses `:mksession` to inherit the session from vim.exe to
// gvim.exe.  So, it doesn't work perfectly. (EXPERIMENTAL)
//# define EXPERIMENTAL_GUI_CMD
public class Gui {
	private int in_focus;
	private int in_use;
	private int starting;
	private int shell_created;
	private int dying;
	private int dofork;
	private int dragged_sb;
	private Object dragged_wp;
	private int pointer_hidden;
	private int col;
	private int row;
	private int cursor_col;
	private int cursor_row;
	private byte cursor_is_valid;
	private int num_cols;
	private int num_rows;
	private int scroll_region_top;
	private int scroll_region_bot;
	private int scroll_region_left;
	private int scroll_region_right;
	private int highlight_mask;
	private int scrollbar_width;
	private int scrollbar_height;
	private int left_sbar_x;
	private int right_sbar_x;
	private GuiScrollbar bottom_sbar;
	private Object which_scrollbars;
	private int prev_wrap;
	private int char_width;
	private int char_height;
	private int char_ascent;
	private int border_width;
	private int border_offset;
	private Object norm_font;
	private Object bold_font;
	private Object ital_font;
	private Object boldital_font;
	private Object wide_font;
	private Object wide_bold_font;
	private Object wide_ital_font;
	private Object wide_boldital_font;
	private Object back_pixel;
	private Object norm_pixel;
	private Object def_back_pixel;
	private Object def_norm_pixel;
	
	public Gui(int in_focus, int in_use, int starting, int shell_created, int dying, int dofork, int dragged_sb, Object dragged_wp, int pointer_hidden, int col, int row, int cursor_col, int cursor_row, byte cursor_is_valid, int num_cols, int num_rows, int scroll_region_top, int scroll_region_bot, int scroll_region_left, int scroll_region_right, int highlight_mask, int scrollbar_width, int scrollbar_height, int left_sbar_x, int right_sbar_x, GuiScrollbar bottom_sbar, Object which_scrollbars, int prev_wrap, int char_width, int char_height, int char_ascent, int border_width, int border_offset, Object norm_font, Object bold_font, Object ital_font, Object boldital_font, Object wide_font, Object wide_bold_font, Object wide_ital_font, Object wide_boldital_font, Object back_pixel, Object norm_pixel, Object def_back_pixel, Object def_norm_pixel) {
		setIn_focus(in_focus);
		setIn_use(in_use);
		setStarting(starting);
		setShell_created(shell_created);
		setDying(dying);
		setDofork(dofork);
		setDragged_sb(dragged_sb);
		setDragged_wp(dragged_wp);
		setPointer_hidden(pointer_hidden);
		setCol(col);
		setRow(row);
		setCursor_col(cursor_col);
		setCursor_row(cursor_row);
		setCursor_is_valid(cursor_is_valid);
		setNum_cols(num_cols);
		setNum_rows(num_rows);
		setScroll_region_top(scroll_region_top);
		setScroll_region_bot(scroll_region_bot);
		setScroll_region_left(scroll_region_left);
		setScroll_region_right(scroll_region_right);
		setHighlight_mask(highlight_mask);
		setScrollbar_width(scrollbar_width);
		setScrollbar_height(scrollbar_height);
		setLeft_sbar_x(left_sbar_x);
		setRight_sbar_x(right_sbar_x);
		setBottom_sbar(bottom_sbar);
		setWhich_scrollbars(which_scrollbars);
		setPrev_wrap(prev_wrap);
		setChar_width(char_width);
		setChar_height(char_height);
		setChar_ascent(char_ascent);
		setBorder_width(border_width);
		setBorder_offset(border_offset);
		setNorm_font(norm_font);
		setBold_font(bold_font);
		setItal_font(ital_font);
		setBoldital_font(boldital_font);
		setWide_font(wide_font);
		setWide_bold_font(wide_bold_font);
		setWide_ital_font(wide_ital_font);
		setWide_boldital_font(wide_boldital_font);
		setBack_pixel(back_pixel);
		setNorm_pixel(norm_pixel);
		setDef_back_pixel(def_back_pixel);
		setDef_norm_pixel(def_norm_pixel);
	}
	public Gui() {
	}
	
	public int getIn_focus() {
		return in_focus;
	}
	public void setIn_focus(int newIn_focus) {
		in_focus = newIn_focus;
	}
	public int getIn_use() {
		return in_use;
	}
	public void setIn_use(int newIn_use) {
		in_use = newIn_use;
	}
	public int getStarting() {
		return starting;
	}
	public void setStarting(int newStarting) {
		starting = newStarting;
	}
	public int getShell_created() {
		return shell_created;
	}
	public void setShell_created(int newShell_created) {
		shell_created = newShell_created;
	}
	public int getDying() {
		return dying;
	}
	public void setDying(int newDying) {
		dying = newDying;
	}
	public int getDofork() {
		return dofork;
	}
	public void setDofork(int newDofork) {
		dofork = newDofork;
	}
	public int getDragged_sb() {
		return dragged_sb;
	}
	public void setDragged_sb(int newDragged_sb) {
		dragged_sb = newDragged_sb;
	}
	public Object getDragged_wp() {
		return dragged_wp;
	}
	public void setDragged_wp(Object newDragged_wp) {
		dragged_wp = newDragged_wp;
	}
	public int getPointer_hidden() {
		return pointer_hidden;
	}
	public void setPointer_hidden(int newPointer_hidden) {
		pointer_hidden = newPointer_hidden;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int newCol) {
		col = newCol;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int newRow) {
		row = newRow;
	}
	public int getCursor_col() {
		return cursor_col;
	}
	public void setCursor_col(int newCursor_col) {
		cursor_col = newCursor_col;
	}
	public int getCursor_row() {
		return cursor_row;
	}
	public void setCursor_row(int newCursor_row) {
		cursor_row = newCursor_row;
	}
	public byte getCursor_is_valid() {
		return cursor_is_valid;
	}
	public void setCursor_is_valid(byte newCursor_is_valid) {
		cursor_is_valid = newCursor_is_valid;
	}
	public int getNum_cols() {
		return num_cols;
	}
	public void setNum_cols(int newNum_cols) {
		num_cols = newNum_cols;
	}
	public int getNum_rows() {
		return num_rows;
	}
	public void setNum_rows(int newNum_rows) {
		num_rows = newNum_rows;
	}
	public int getScroll_region_top() {
		return scroll_region_top;
	}
	public void setScroll_region_top(int newScroll_region_top) {
		scroll_region_top = newScroll_region_top;
	}
	public int getScroll_region_bot() {
		return scroll_region_bot;
	}
	public void setScroll_region_bot(int newScroll_region_bot) {
		scroll_region_bot = newScroll_region_bot;
	}
	public int getScroll_region_left() {
		return scroll_region_left;
	}
	public void setScroll_region_left(int newScroll_region_left) {
		scroll_region_left = newScroll_region_left;
	}
	public int getScroll_region_right() {
		return scroll_region_right;
	}
	public void setScroll_region_right(int newScroll_region_right) {
		scroll_region_right = newScroll_region_right;
	}
	public int getHighlight_mask() {
		return highlight_mask;
	}
	public void setHighlight_mask(int newHighlight_mask) {
		highlight_mask = newHighlight_mask;
	}
	public int getScrollbar_width() {
		return scrollbar_width;
	}
	public void setScrollbar_width(int newScrollbar_width) {
		scrollbar_width = newScrollbar_width;
	}
	public int getScrollbar_height() {
		return scrollbar_height;
	}
	public void setScrollbar_height(int newScrollbar_height) {
		scrollbar_height = newScrollbar_height;
	}
	public int getLeft_sbar_x() {
		return left_sbar_x;
	}
	public void setLeft_sbar_x(int newLeft_sbar_x) {
		left_sbar_x = newLeft_sbar_x;
	}
	public int getRight_sbar_x() {
		return right_sbar_x;
	}
	public void setRight_sbar_x(int newRight_sbar_x) {
		right_sbar_x = newRight_sbar_x;
	}
	public GuiScrollbar getBottom_sbar() {
		return bottom_sbar;
	}
	public void setBottom_sbar(GuiScrollbar newBottom_sbar) {
		bottom_sbar = newBottom_sbar;
	}
	public Object getWhich_scrollbars() {
		return which_scrollbars;
	}
	public void setWhich_scrollbars(Object newWhich_scrollbars) {
		which_scrollbars = newWhich_scrollbars;
	}
	public int getPrev_wrap() {
		return prev_wrap;
	}
	public void setPrev_wrap(int newPrev_wrap) {
		prev_wrap = newPrev_wrap;
	}
	public int getChar_width() {
		return char_width;
	}
	public void setChar_width(int newChar_width) {
		char_width = newChar_width;
	}
	public int getChar_height() {
		return char_height;
	}
	public void setChar_height(int newChar_height) {
		char_height = newChar_height;
	}
	public int getChar_ascent() {
		return char_ascent;
	}
	public void setChar_ascent(int newChar_ascent) {
		char_ascent = newChar_ascent;
	}
	public int getBorder_width() {
		return border_width;
	}
	public void setBorder_width(int newBorder_width) {
		border_width = newBorder_width;
	}
	public int getBorder_offset() {
		return border_offset;
	}
	public void setBorder_offset(int newBorder_offset) {
		border_offset = newBorder_offset;
	}
	public Object getNorm_font() {
		return norm_font;
	}
	public void setNorm_font(Object newNorm_font) {
		norm_font = newNorm_font;
	}
	public Object getBold_font() {
		return bold_font;
	}
	public void setBold_font(Object newBold_font) {
		bold_font = newBold_font;
	}
	public Object getItal_font() {
		return ital_font;
	}
	public void setItal_font(Object newItal_font) {
		ital_font = newItal_font;
	}
	public Object getBoldital_font() {
		return boldital_font;
	}
	public void setBoldital_font(Object newBoldital_font) {
		boldital_font = newBoldital_font;
	}
	public Object getWide_font() {
		return wide_font;
	}
	public void setWide_font(Object newWide_font) {
		wide_font = newWide_font;
	}
	public Object getWide_bold_font() {
		return wide_bold_font;
	}
	public void setWide_bold_font(Object newWide_bold_font) {
		wide_bold_font = newWide_bold_font;
	}
	public Object getWide_ital_font() {
		return wide_ital_font;
	}
	public void setWide_ital_font(Object newWide_ital_font) {
		wide_ital_font = newWide_ital_font;
	}
	public Object getWide_boldital_font() {
		return wide_boldital_font;
	}
	public void setWide_boldital_font(Object newWide_boldital_font) {
		wide_boldital_font = newWide_boldital_font;
	}
	public Object getBack_pixel() {
		return back_pixel;
	}
	public void setBack_pixel(Object newBack_pixel) {
		back_pixel = newBack_pixel;
	}
	public Object getNorm_pixel() {
		return norm_pixel;
	}
	public void setNorm_pixel(Object newNorm_pixel) {
		norm_pixel = newNorm_pixel;
	}
	public Object getDef_back_pixel() {
		return def_back_pixel;
	}
	public void setDef_back_pixel(Object newDef_back_pixel) {
		def_back_pixel = newDef_back_pixel;
	}
	public Object getDef_norm_pixel() {
		return def_norm_pixel;
	}
	public void setDef_norm_pixel(Object newDef_norm_pixel) {
		def_norm_pixel = newDef_norm_pixel;
	}
}
