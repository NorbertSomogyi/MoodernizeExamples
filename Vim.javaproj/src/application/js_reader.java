package application;

// >=
// <
// <=
// =~
// !~
/*
 * Structure used for reading in json_decode().
 */
public class js_reader {
	private Object[] js_buf;
	private Object js_end;
	private int js_used;
	private Object js_fill;
	private Object js_cookie;
	private int js_cookie_arg;
	
	public js_reader(Object[] js_buf, Object js_end, int js_used, Object js_fill, Object js_cookie, int js_cookie_arg) {
		setJs_buf(js_buf);
		setJs_end(js_end);
		setJs_used(js_used);
		setJs_fill(js_fill);
		setJs_cookie(js_cookie);
		setJs_cookie_arg(js_cookie_arg);
	}
	public js_reader() {
	}
	
	public void fill_numbuflen() {
		Object generatedJs_fill = this.getJs_fill();
		Object generatedJs_end = this.getJs_end();
		Object[] generatedJs_buf = this.getJs_buf();
		int generatedJs_used = this.getJs_used();
		if (generatedJs_fill != ((Object)0) && (int)(generatedJs_end - generatedJs_buf) - generatedJs_used < 65) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(reader)) {
				this.setJs_end(generatedJs_buf + /*Error: Function owner not recognized*/strlen((byte)(generatedJs_buf)));
			} 
		} 
	}
	public void json_skip_white() {
		int c;
		Object[] generatedJs_buf = this.getJs_buf();
		int generatedJs_used = this.getJs_used();
		Object generatedJs_fill = this.getJs_fill();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			c = generatedJs_buf[generatedJs_used];
			if (generatedJs_fill != ((Object)0) && c == (byte)'\000') {
				if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(reader)) {
					this.setJs_end(generatedJs_buf + /*Error: Function owner not recognized*/strlen((byte)(generatedJs_buf)));
					continue;
				} 
			} 
			if (c == (byte)'\000' || c > (byte)' ') {
				break;
			} 
			++generatedJs_used;
		}
		reader.fill_numbuflen();
	}
	/* We find the end once, to avoid calling strlen() many times. */
	/*
	 * Decode the JSON from "reader" to find the end of the message.
	 * "options" can be JSON_JS or zero.
	 * This is only used for testing.
	 * Return FAIL if the message has a decoding error.
	 * Return MAYBE if the message is truncated, need to read more.
	 * This only works reliable if the message contains an object, array or
	 * string.  A number might be truncated without knowing.
	 * Does not advance the reader.
	 */
	public int json_find_end(int options) {
		int generatedJs_used = this.getJs_used();
		int used_save = generatedJs_used;
		int ret;
		Object[] generatedJs_buf = this.getJs_buf();
		this.setJs_end(generatedJs_buf + /*Error: Function owner not recognized*/strlen((byte)(generatedJs_buf)));
		reader.json_skip_white();
		ret = ModernizedCProgram.json_decode_item(reader, ((Object)0), options);
		this.setJs_used(used_save);
		return ret/*
		 * "js_decode()" function
		 */;
	}
	public int fill_from_cookie() {
		Object generatedJs_cookie = this.getJs_cookie();
		this.setJs_buf(generatedJs_cookie);
		return 1/*
		 * Test json_find_end with an incomplete array, calling the fill function.
		 */;
	}
	public Object[] getJs_buf() {
		return js_buf;
	}
	public void setJs_buf(Object[] newJs_buf) {
		js_buf = newJs_buf;
	}
	public Object getJs_end() {
		return js_end;
	}
	public void setJs_end(Object newJs_end) {
		js_end = newJs_end;
	}
	public int getJs_used() {
		return js_used;
	}
	public void setJs_used(int newJs_used) {
		js_used = newJs_used;
	}
	public Object getJs_fill() {
		return js_fill;
	}
	public void setJs_fill(Object newJs_fill) {
		js_fill = newJs_fill;
	}
	public Object getJs_cookie() {
		return js_cookie;
	}
	public void setJs_cookie(Object newJs_cookie) {
		js_cookie = newJs_cookie;
	}
	public int getJs_cookie_arg() {
		return js_cookie_arg;
	}
	public void setJs_cookie_arg(int newJs_cookie_arg) {
		js_cookie_arg = newJs_cookie_arg;
	}
}
// Maximum number of commands from + or -c arguments.
// values for "window_layout"
// "-o" horizontally split windows
