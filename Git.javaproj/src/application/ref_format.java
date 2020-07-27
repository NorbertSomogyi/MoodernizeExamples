package application;

public class ref_format {
	private Object format;
	private int quote_style;
	private int use_color;
	private int need_color_reset_at_eol;
	
	public ref_format(Object format, int quote_style, int use_color, int need_color_reset_at_eol) {
		setFormat(format);
		setQuote_style(quote_style);
		setUse_color(use_color);
		setNeed_color_reset_at_eol(need_color_reset_at_eol);
	}
	public ref_format() {
	}
	
	public int verify_ref_format() {
		byte cp;
		byte sp;
		this.setNeed_color_reset_at_eol(0);
		Object generatedFormat = this.getFormat();
		for (cp = generatedFormat; cp && (sp = cp.find_next()); /*Error: Unsupported expression*/) {
			strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			byte color;
			byte ep = /*Error: Function owner not recognized*/strchr(sp, (byte)')');
			int at;
			if (!ep) {
				return ();
			} 
			at = /* sp points at "%(" and ep points at the closing ")" */ModernizedCProgram.err.parse_ref_filter_atom(format, sp + 2, ep);
			if (at < 0) {
				ModernizedCProgram.die("%s", ModernizedCProgram.err.getBuf());
			} 
			cp = ep + 1;
			if (ModernizedCProgram.skip_prefix(used_atom[at].getName(), "color:", color)) {
				this.setNeed_color_reset_at_eol(!!/*Error: Function owner not recognized*/strcmp(color, "reset"));
			} 
			ModernizedCProgram.err.strbuf_release();
		}
		int generatedNeed_color_reset_at_eol = this.getNeed_color_reset_at_eol();
		int generatedUse_color = this.getUse_color();
		if (generatedNeed_color_reset_at_eol && !ModernizedCProgram.want_color_fd(1, (generatedUse_color))) {
			this.setNeed_color_reset_at_eol(0);
		} 
		return 0;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public int getQuote_style() {
		return quote_style;
	}
	public void setQuote_style(int newQuote_style) {
		quote_style = newQuote_style;
	}
	public int getUse_color() {
		return use_color;
	}
	public void setUse_color(int newUse_color) {
		use_color = newUse_color;
	}
	public int getNeed_color_reset_at_eol() {
		return need_color_reset_at_eol;
	}
	public void setNeed_color_reset_at_eol(int newNeed_color_reset_at_eol) {
		need_color_reset_at_eol = newNeed_color_reset_at_eol;
	}
}
/*
	 * Set these to define the format; make sure you call
	 * verify_ref_format() afterwards to finalize.
	 */
/*
 * Push a single ref onto the array; this can be used to construct your own
 * ref_array without using filter_refs().
 */
