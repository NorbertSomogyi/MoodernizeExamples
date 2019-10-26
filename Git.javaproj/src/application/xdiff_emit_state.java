package application;

public class xdiff_emit_state {
	private Object hunk_fn;
	private Object line_fn;
	private Object consume_callback_data;
	private strbuf remainder;
	
	public xdiff_emit_state(Object hunk_fn, Object line_fn, Object consume_callback_data, strbuf remainder) {
		setHunk_fn(hunk_fn);
		setLine_fn(line_fn);
		setConsume_callback_data(consume_callback_data);
		setRemainder(remainder);
	}
	public xdiff_emit_state() {
	}
	
	public Object getHunk_fn() {
		return hunk_fn;
	}
	public void setHunk_fn(Object newHunk_fn) {
		hunk_fn = newHunk_fn;
	}
	public Object getLine_fn() {
		return line_fn;
	}
	public void setLine_fn(Object newLine_fn) {
		line_fn = newLine_fn;
	}
	public Object getConsume_callback_data() {
		return consume_callback_data;
	}
	public void setConsume_callback_data(Object newConsume_callback_data) {
		consume_callback_data = newConsume_callback_data;
	}
	public strbuf getRemainder() {
		return remainder;
	}
	public void setRemainder(strbuf newRemainder) {
		remainder = newRemainder;
	}
}
