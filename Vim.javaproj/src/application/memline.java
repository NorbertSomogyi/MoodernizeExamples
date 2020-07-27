package application;

/*
 * the memline structure holds all the information about a memline
 */
public class memline {
	private Object ml_line_count;
	private memfile ml_mfp;
	private int ml_flags;
	private info_pointer[] ml_stack;
	private int ml_stack_top;
	private int ml_stack_size;
	private Object ml_line_lnum;
	private Object ml_line_ptr;
	private Object ml_line_len;
	private block_hdr ml_locked;
	private Object ml_locked_low;
	private Object ml_locked_high;
	private int ml_locked_lineadd;
	
	public memline(Object ml_line_count, memfile ml_mfp, int ml_flags, info_pointer[] ml_stack, int ml_stack_top, int ml_stack_size, Object ml_line_lnum, Object ml_line_ptr, Object ml_line_len, block_hdr ml_locked, Object ml_locked_low, Object ml_locked_high, int ml_locked_lineadd) {
		setMl_line_count(ml_line_count);
		setMl_mfp(ml_mfp);
		setMl_flags(ml_flags);
		setMl_stack(ml_stack);
		setMl_stack_top(ml_stack_top);
		setMl_stack_size(ml_stack_size);
		setMl_line_lnum(ml_line_lnum);
		setMl_line_ptr(ml_line_ptr);
		setMl_line_len(ml_line_len);
		setMl_locked(ml_locked);
		setMl_locked_low(ml_locked_low);
		setMl_locked_high(ml_locked_high);
		setMl_locked_lineadd(ml_locked_lineadd);
	}
	public memline() {
	}
	
	public Object getMl_line_count() {
		return ml_line_count;
	}
	public void setMl_line_count(Object newMl_line_count) {
		ml_line_count = newMl_line_count;
	}
	public memfile getMl_mfp() {
		return ml_mfp;
	}
	public void setMl_mfp(memfile newMl_mfp) {
		ml_mfp = newMl_mfp;
	}
	public int getMl_flags() {
		return ml_flags;
	}
	public void setMl_flags(int newMl_flags) {
		ml_flags = newMl_flags;
	}
	public info_pointer[] getMl_stack() {
		return ml_stack;
	}
	public void setMl_stack(info_pointer[] newMl_stack) {
		ml_stack = newMl_stack;
	}
	public int getMl_stack_top() {
		return ml_stack_top;
	}
	public void setMl_stack_top(int newMl_stack_top) {
		ml_stack_top = newMl_stack_top;
	}
	public int getMl_stack_size() {
		return ml_stack_size;
	}
	public void setMl_stack_size(int newMl_stack_size) {
		ml_stack_size = newMl_stack_size;
	}
	public Object getMl_line_lnum() {
		return ml_line_lnum;
	}
	public void setMl_line_lnum(Object newMl_line_lnum) {
		ml_line_lnum = newMl_line_lnum;
	}
	public Object getMl_line_ptr() {
		return ml_line_ptr;
	}
	public void setMl_line_ptr(Object newMl_line_ptr) {
		ml_line_ptr = newMl_line_ptr;
	}
	public Object getMl_line_len() {
		return ml_line_len;
	}
	public void setMl_line_len(Object newMl_line_len) {
		ml_line_len = newMl_line_len;
	}
	public block_hdr getMl_locked() {
		return ml_locked;
	}
	public void setMl_locked(block_hdr newMl_locked) {
		ml_locked = newMl_locked;
	}
	public Object getMl_locked_low() {
		return ml_locked_low;
	}
	public void setMl_locked_low(Object newMl_locked_low) {
		ml_locked_low = newMl_locked_low;
	}
	public Object getMl_locked_high() {
		return ml_locked_high;
	}
	public void setMl_locked_high(Object newMl_locked_high) {
		ml_locked_high = newMl_locked_high;
	}
	public int getMl_locked_lineadd() {
		return ml_locked_lineadd;
	}
	public void setMl_locked_lineadd(int newMl_locked_lineadd) {
		ml_locked_lineadd = newMl_locked_lineadd;
	}
}
