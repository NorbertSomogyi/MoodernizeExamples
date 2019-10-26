package application;

/*
 * Structure defining text properties.  These stick with the text.
 * When stored in memline they are after the text, ml_line_len is larger than
 * STRLEN(ml_line_ptr) + 1.
 */
public class textprop_S {
	private Object tp_col;
	private Object tp_len;
	private int tp_id;
	private int tp_type;
	private int tp_flags;
	
	public textprop_S(Object tp_col, Object tp_len, int tp_id, int tp_type, int tp_flags) {
		setTp_col(tp_col);
		setTp_len(tp_len);
		setTp_id(tp_id);
		setTp_type(tp_type);
		setTp_flags(tp_flags);
	}
	public textprop_S() {
	}
	
	public void adjust_props_for_join(Object lnum, int prop_length, long col, int removed) {
		int proplen;
		char_u props = new char_u();
		int ri;
		int wi = 0;
		proplen = curbuf.get_text_props(lnum, props, 0);
		Object generatedTp_col = cp.getTp_col();
		Object generatedTp_len = cp.getTp_len();
		if (proplen > 0) {
			prop_line = (textprop_T)ModernizedCProgram.alloc( * (proplen));
			if (prop_line != ((Object)0)) {
				for (ri = 0; ri < proplen; ++ri) {
					textprop_T cp = prop_line + wi;
					.memmove((byte)(cp), (byte)(props + ri * ), (size_t)());
					if (generatedTp_col + generatedTp_len > removed) {
						if (generatedTp_col > removed) {
							generatedTp_col += col;
						} else {
								generatedTp_len -= removed - generatedTp_col;
								cp.setTp_col(col);
						} 
						++wi;
					} 
				}
			} 
			prop_length = wi/*
			 * After joining lines: concatenate the text and the properties of all joined
			 * lines into one line and replace the line.
			 */;
		} 
	}
	public void join_prop_lines(Object lnum, Object newp, Integer prop_lengths, int count) {
		size_t proplen = 0;
		size_t oldproplen = new size_t();
		char_u props = new char_u();
		int i;
		size_t len = new size_t();
		char_u line = new char_u();
		size_t l = new size_t();
		for (i = 0; i < count - 1; ++i) {
			proplen += prop_lengths[i];
		}
		if (proplen == 0) {
			ModernizedCProgram.ml_replace(lnum, newp, 0);
			return ;
		} 
		// get existing properties of the joined line// get existing properties of the joined lineoldproplen = curbuf.get_text_props(lnum, props, 0);
		len = .strlen((byte)(newp)) + 1;
		line = ModernizedCProgram.alloc(len + (oldproplen + proplen) * );
		if (line == ((Object)0)) {
			return ;
		} 
		.memmove((byte)(line), (byte)(newp), (size_t)(len));
		if (oldproplen > 0) {
			l = oldproplen * ;
			.memmove((byte)(line + len), (byte)(props), (size_t)(l));
			len += l;
		} 
		for (i = 0; i < count - 1; ++i) {
			if (prop_lines[i] != ((Object)0)) {
				l = prop_lengths[i] * ;
				.memmove((byte)(line + len), (byte)(prop_lines[i]), (size_t)(l));
				len += l;
				ModernizedCProgram.vim_free(prop_lines[i]);
			} 
		}
		ModernizedCProgram.ml_replace_len(lnum, line, (colnr_T)len, 1, 0);
		ModernizedCProgram.vim_free(newp);
		ModernizedCProgram.vim_free(prop_lines);
		ModernizedCProgram.vim_free(prop_lengths)// FEAT_TEXT_PROP;// FEAT_TEXT_PROP
	}
	public Object getTp_col() {
		return tp_col;
	}
	public void setTp_col(Object newTp_col) {
		tp_col = newTp_col;
	}
	public Object getTp_len() {
		return tp_len;
	}
	public void setTp_len(Object newTp_len) {
		tp_len = newTp_len;
	}
	public int getTp_id() {
		return tp_id;
	}
	public void setTp_id(int newTp_id) {
		tp_id = newTp_id;
	}
	public int getTp_type() {
		return tp_type;
	}
	public void setTp_type(int newTp_type) {
		tp_type = newTp_type;
	}
	public int getTp_flags() {
		return tp_flags;
	}
	public void setTp_flags(int newTp_flags) {
		tp_flags = newTp_flags;
	}
}
