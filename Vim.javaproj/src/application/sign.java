package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * sign.c: functions for managing signs
 */
/*
 * Struct to hold the sign properties.
 */
public class sign {
	private sign sn_next;
	private int sn_typenr;
	private Object sn_name;
	private Object sn_icon;
	private Object sn_text;
	private int sn_line_hl;
	private int sn_text_hl;
	
	public sign(sign sn_next, int sn_typenr, Object sn_name, Object sn_icon, Object sn_text, int sn_line_hl, int sn_text_hl) {
		setSn_next(sn_next);
		setSn_typenr(sn_typenr);
		setSn_name(sn_name);
		setSn_icon(sn_icon);
		setSn_text(sn_text);
		setSn_line_hl(sn_line_hl);
		setSn_text_hl(sn_text_hl);
	}
	public sign() {
	}
	
	public sign find_sign_by_typenr(int typenr) {
		sign_T sp = new sign_T();
		int generatedSn_typenr = sp.getSn_typenr();
		sign generatedSn_next = sp.getSn_next();
		for (sp = ModernizedCProgram.first_sign; sp != ((Object)0); sp = generatedSn_next) {
			if (generatedSn_typenr == typenr) {
				return sp;
			} 
		}
		return ((Object)0/*
		 * Get the name of a sign by its typenr.
		 */);
	}
	public sign sign_find(Object name) {
		sign_T sp = new sign_T();
		if (sp_prev != ((Object)0)) {
			sp_prev = ((Object)0);
		} 
		Object generatedSn_name = sp.getSn_name();
		sign generatedSn_next = sp.getSn_next();
		for (sp = ModernizedCProgram.first_sign; sp != ((Object)0); sp = generatedSn_next) {
			if (.strcmp((byte)(generatedSn_name), (byte)(name)) == 0) {
				break;
			} 
			if (sp_prev != ((Object)0)) {
				sp_prev = sp;
			} 
		}
		return sp/*
		 * Allocate a new sign
		 */;
	}
	public sign alloc_new_sign(Object name) {
		sign_T sp = new sign_T();
		sign_T lp = new sign_T();
		int start = ModernizedCProgram.next_sign_typenr;
		// Allocate a new sign.// Allocate a new sign.sp = ModernizedCProgram.alloc_clear_id(, .aid_sign_define_by_name);
		if (sp == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedSn_typenr = lp.getSn_typenr();
		sign generatedSn_next = lp.getSn_next();
		// This only happens after wrapping around.  Hopefully// another one got deleted and we can use its number.for (lp = ModernizedCProgram.first_sign; lp != ((Object)0); ) {
			if (generatedSn_typenr == ModernizedCProgram.next_sign_typenr) {
				++ModernizedCProgram.next_sign_typenr;
				if (ModernizedCProgram.next_sign_typenr == 65535) {
					ModernizedCProgram.next_sign_typenr = 1;
				} 
				if (ModernizedCProgram.next_sign_typenr == start) {
					ModernizedCProgram.vim_free(sp);
					ModernizedCProgram.emsg(((byte)("E612: Too many signs defined")));
					return ((Object)0);
				} 
				lp = ModernizedCProgram.first_sign;
				continue;
			} 
			lp = generatedSn_next;
		}
		sp.setSn_typenr(ModernizedCProgram.next_sign_typenr);
		if (++ModernizedCProgram.next_sign_typenr == 65535) {
			ModernizedCProgram.next_sign_typenr = 1;
		} 
		sp.setSn_name(ModernizedCProgram.vim_strsave(name));
		Object generatedSn_name = sp.getSn_name();
		// out of memoryif (generatedSn_name == ((Object)0)) {
			ModernizedCProgram.vim_free(sp);
			return ((Object)0);
		} 
		return sp/*
		 * Initialize the icon information for a new sign
		 */;
	}
	public void sign_define_init_icon(Object icon) {
		ModernizedCProgram.vim_free(ModernizedCProgram.sp.getSn_icon());
		ModernizedCProgram.sp.setSn_icon(ModernizedCProgram.vim_strsave(icon));
		ModernizedCProgram.backslash_halve(ModernizedCProgram.sp.getSn_icon());
	}
	/*
	 * Initialize the text for a new sign
	 */
	public int sign_define_init_text(Object text) {
		char_u s = new char_u();
		char_u endp = new char_u();
		int cells;
		int len;
		endp = text + (int).strlen((byte)(text));
		// Remove backslashes so that it is possible to use a space.for (s = text; s + 1 < endp; ++s) {
			if (s == (byte)'\\') {
				.memmove((byte)((s)), (byte)((s + 1)), (size_t)(.strlen((byte)(s + 1)) + 1));
				--endp;
			} 
		}
		// Count cells and check for non-printable charsif (has_mbyte) {
			cells = 0;
			for (s = text; s < endp; s += .UNRECOGNIZEDFUNCTIONNAME(s)) {
				if (!ModernizedCProgram.vim_isprintc(.UNRECOGNIZEDFUNCTIONNAME(s))) {
					break;
				} 
				cells += .UNRECOGNIZEDFUNCTIONNAME(s);
			}
		} else {
				for (s = text; s < endp; ++s) {
					if (!ModernizedCProgram.vim_isprintc(s)) {
						break;
					} 
				}
				cells = (int)(s - text);
		} 
		// Currently sign text must be one or two display cellsif (s != endp || cells < 1 || cells > 2) {
			ModernizedCProgram.semsg(((byte)("E239: Invalid sign text: %s")), text);
			return 0;
		} 
		ModernizedCProgram.vim_free(ModernizedCProgram.sp.getSn_text())// Allocate one byte more if we need to pad up;// Allocate one byte more if we need to pad up
		// with a space.// with a space.len = (int)(endp - text + ((cells == 1) ? 1 : 0));
		ModernizedCProgram.sp.setSn_text(ModernizedCProgram.vim_strnsave(text, len));
		// For single character sign text, pad with a space.if (ModernizedCProgram.sp.getSn_text() != ((Object)0) && cells == 1) {
			.strcpy((byte)(ModernizedCProgram.sp.getSn_text() + len - 1), (byte)(" "));
		} 
		return 1/*
		 * Define a new sign or update an existing sign
		 */;
	}
	/*
	 * List one sign.
	 */
	public void sign_list_defined() {
		char_u p = new char_u();
		ModernizedCProgram.smsg("sign %s", ModernizedCProgram.sp.getSn_name());
		if (ModernizedCProgram.sp.getSn_icon() != ((Object)0)) {
			ModernizedCProgram.msg_puts(" icon=");
			ModernizedCProgram.msg_outtrans(ModernizedCProgram.sp.getSn_icon());
			ModernizedCProgram.msg_puts(((byte)(" (not supported)")));
		} 
		if (ModernizedCProgram.sp.getSn_text() != ((Object)0)) {
			ModernizedCProgram.msg_puts(" text=");
			ModernizedCProgram.msg_outtrans(ModernizedCProgram.sp.getSn_text());
		} 
		if (ModernizedCProgram.sp.getSn_line_hl() > 0) {
			ModernizedCProgram.msg_puts(" linehl=");
			p = ((Object)0).get_highlight_name_ext(ModernizedCProgram.sp.getSn_line_hl() - 1, 0);
			if (p == ((Object)0)) {
				ModernizedCProgram.msg_puts("NONE");
			} else {
					ModernizedCProgram.msg_puts((byte)p);
			} 
		} 
		if (ModernizedCProgram.sp.getSn_text_hl() > 0) {
			ModernizedCProgram.msg_puts(" texthl=");
			p = ((Object)0).get_highlight_name_ext(ModernizedCProgram.sp.getSn_text_hl() - 1, 0);
			if (p == ((Object)0)) {
				ModernizedCProgram.msg_puts("NONE");
			} else {
					ModernizedCProgram.msg_puts((byte)p/*
					 * Undefine a sign and free its memory.
					 */);
			} 
		} 
	}
	public void sign_undefine(sign sp_prev) {
		ModernizedCProgram.vim_free(ModernizedCProgram.sp.getSn_name());
		ModernizedCProgram.vim_free(ModernizedCProgram.sp.getSn_icon());
		ModernizedCProgram.vim_free(ModernizedCProgram.sp.getSn_text());
		if (sp_prev == ((Object)0)) {
			ModernizedCProgram.first_sign = ModernizedCProgram.sp.getSn_next();
		} else {
				sp_prev.setSn_next(ModernizedCProgram.sp.getSn_next());
		} 
		ModernizedCProgram.vim_free(ModernizedCProgram.sp)// the attribute which may have a sign;// the attribute which may have a sign
	}
	public sign getSn_next() {
		return sn_next;
	}
	public void setSn_next(sign newSn_next) {
		sn_next = newSn_next;
	}
	public int getSn_typenr() {
		return sn_typenr;
	}
	public void setSn_typenr(int newSn_typenr) {
		sn_typenr = newSn_typenr;
	}
	public Object getSn_name() {
		return sn_name;
	}
	public void setSn_name(Object newSn_name) {
		sn_name = newSn_name;
	}
	public Object getSn_icon() {
		return sn_icon;
	}
	public void setSn_icon(Object newSn_icon) {
		sn_icon = newSn_icon;
	}
	public Object getSn_text() {
		return sn_text;
	}
	public void setSn_text(Object newSn_text) {
		sn_text = newSn_text;
	}
	public int getSn_line_hl() {
		return sn_line_hl;
	}
	public void setSn_line_hl(int newSn_line_hl) {
		sn_line_hl = newSn_line_hl;
	}
	public int getSn_text_hl() {
		return sn_text_hl;
	}
	public void setSn_text_hl(int newSn_text_hl) {
		sn_text_hl = newSn_text_hl;
	}
}
