package application;

/* An individual foreground or background color. */
public class color {
	private  type;
	private byte value;
	private byte red;
	private byte green;
	private byte blue;
	
	public color( type, byte value, byte red, byte green, byte blue) {
		setType(type);
		setValue(value);
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	public color() {
	}
	
	public int parse_color(Object name, int len) {
		/* Positions in array must match ANSI color codes */byte[] color_names = new byte[]{"black", "red", "green", "yellow", "blue", "magenta", "cyan", "white"};
		byte end;
		int i;
		long val;
		if (ModernizedCProgram.match_word(name, len, /* First try the special word "normal"... */"normal")) {
			this.setType(.COLOR_NORMAL);
			return 0;
		} 
		byte generatedRed = this.getRed();
		byte generatedGreen = this.getGreen();
		byte generatedBlue = this.getBlue();
		if (len == 7 && name[0] == /* Try a 24-bit RGB value */(byte)'#') {
			if (!ModernizedCProgram.get_hex_color(name + 1, generatedRed) && !ModernizedCProgram.get_hex_color(name + 3, generatedGreen) && !ModernizedCProgram.get_hex_color(name + 5, generatedBlue)) {
				this.setType(.COLOR_RGB);
				return 0;
			} 
		} 
		for (i = 0; i < ( /  + ( - 1)); /* Then pick from our human-readable color names... */i++) {
			if (ModernizedCProgram.match_word(name, len, color_names[i])) {
				this.setType(.COLOR_ANSI);
				this.setValue(i);
				return 0;
			} 
		}
		val = .strtol(name, end, /* And finally try a literal 256-color-mode number */10);
		if (end - name == len/*
				 * Allow "-1" as an alias for "normal", but other negative
				 * numbers are bogus.
				 */) {
			if (val < -1) {
				;
			}  else if (val < 0) {
				this.setType(.COLOR_NORMAL);
				return 0;
			}  else if (val < /* Rewrite low numbers as more-portable standard colors. */8) {
				this.setType(.COLOR_ANSI);
				this.setValue(val);
				return 0;
			}  else if (val < 256) {
				this.setType(.COLOR_256);
				this.setValue(val);
				return 0;
			} 
		} 
		return -1;
		byte rest = placeholder;
		byte basic_color = ((Object)0);
		Object generatedPretty_ctx = c.getPretty_ctx();
		if (placeholder[1] == (byte)'(') {
			byte begin = placeholder + 2;
			byte end = .strchr(begin, (byte)')');
			byte[] color = new byte[75];
			if (!end) {
				return 0;
			} 
			if (ModernizedCProgram.skip_prefix(begin, "auto,", begin)) {
				if (!ModernizedCProgram.want_color_fd(1, (generatedPretty_ctx.getColor()))) {
					return end - placeholder + 1;
				} 
			}  else if (ModernizedCProgram.skip_prefix(begin, "always,", begin/* nothing to do; we do not respect want_color at all */)) {
			} else {
					if (!ModernizedCProgram.want_color_fd(1, (generatedPretty_ctx.getColor()))) {
						return end - placeholder + 1;
					} 
			} 
			if (ModernizedCProgram.color_parse_mem(begin, end - begin, color) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to parse --pretty format"));
			} 
			sb.strbuf_addstr(color);
			return end - placeholder + 1/*
				 * We handle things like "%C(red)" above; for historical reasons, there
				 * are a few colors that can be specified without parentheses (and
				 * they cannot support things like "auto" or "always" at all).
				 */;
		} 
		if (ModernizedCProgram.skip_prefix(placeholder + 1, "red", rest)) {
			basic_color = "\033[31m";
		}  else if (ModernizedCProgram.skip_prefix(placeholder + 1, "green", rest)) {
			basic_color = "\033[32m";
		}  else if (ModernizedCProgram.skip_prefix(placeholder + 1, "blue", rest)) {
			basic_color = "\033[34m";
		}  else if (ModernizedCProgram.skip_prefix(placeholder + 1, "reset", rest)) {
			basic_color = "\033[m";
		} 
		if (basic_color && ModernizedCProgram.want_color_fd(1, (generatedPretty_ctx.getColor()))) {
			sb.strbuf_addstr(basic_color);
		} 
		return rest - placeholder;
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public byte getValue() {
		return value;
	}
	public void setValue(byte newValue) {
		value = newValue;
	}
	public byte getRed() {
		return red;
	}
	public void setRed(byte newRed) {
		red = newRed;
	}
	public byte getGreen() {
		return green;
	}
	public void setGreen(byte newGreen) {
		green = newGreen;
	}
	public byte getBlue() {
		return blue;
	}
	public void setBlue(byte newBlue) {
		blue = newBlue;
	}
}
