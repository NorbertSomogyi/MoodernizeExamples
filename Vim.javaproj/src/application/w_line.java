package application;

/*
 * Structure to cache info for displayed lines in w_lines[].
 * Each logical line has one entry.
 * The entry tells how the logical line is currently displayed in the window.
 * This is updated when displaying the window.
 * When the display is changed (e.g., when clearing the screen) w_lines_valid
 * is changed to exclude invalid entries.
 * When making changes to the buffer, wl_valid is reset to indicate wl_size
 * may not reflect what is actually in the buffer.  When wl_valid is FALSE,
 * the entries can only be used to count the number of displayed lines used.
 * wl_lnum and wl_lastlnum are invalid too.
 */
public class w_line {
	private Object wl_lnum;
	private Object wl_size;
	private byte wl_valid;
	
	public w_line(Object wl_lnum, Object wl_size, byte wl_valid) {
		setWl_lnum(wl_lnum);
		setWl_size(wl_size);
		setWl_valid(wl_valid);
	}
	public w_line() {
	}
	
	public Object getWl_lnum() {
		return wl_lnum;
	}
	public void setWl_lnum(Object newWl_lnum) {
		wl_lnum = newWl_lnum;
	}
	public Object getWl_size() {
		return wl_size;
	}
	public void setWl_size(Object newWl_size) {
		wl_size = newWl_size;
	}
	public byte getWl_valid() {
		return wl_valid;
	}
	public void setWl_valid(byte newWl_valid) {
		wl_valid = newWl_valid;
	}
}
