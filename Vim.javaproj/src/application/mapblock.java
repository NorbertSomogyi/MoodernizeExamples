package application;

/*
 * Structure used for mappings and abbreviations.
 */
public class mapblock {
	private mapblock m_next;
	private Object[] m_keys;
	private Object m_str;
	private Object m_orig_str;
	private int m_keylen;
	private int m_mode;
	private int m_simplified;
	private int m_noremap;
	private byte m_silent;
	private byte m_nowait;
	
	public mapblock(mapblock m_next, Object[] m_keys, Object m_str, Object m_orig_str, int m_keylen, int m_mode, int m_simplified, int m_noremap, byte m_silent, byte m_nowait) {
		setM_next(m_next);
		setM_keys(m_keys);
		setM_str(m_str);
		setM_orig_str(m_orig_str);
		setM_keylen(m_keylen);
		setM_mode(m_mode);
		setM_simplified(m_simplified);
		setM_noremap(m_noremap);
		setM_silent(m_silent);
		setM_nowait(m_nowait);
	}
	public mapblock() {
	}
	
	// first entry in abbrlist
	/*
	 * Get the start of the hashed map list for "state" and first character "c".
	 */
	public mapblock get_maphash_list(int state, int c) {
		return ModernizedCProgram.maphash[(((state) & (-1024 + -1024 + -1024 + -1024 + -1024)) ? (c) : ((c) ^ -1024/*
		 * Get the buffer-local hashed map list for "state" and first character "c".
		 */))];
	}
	public mapblock get_buf_maphash_list(int state, int c) {
		Object generatedB_maphash = curbuf.getB_maphash();
		return generatedB_maphash[(((state) & (-1024 + -1024 + -1024 + -1024 + -1024)) ? (c) : ((c) ^ -1024))];
	}
	public void map_free() {
		mapblock_T mp = new mapblock_T();
		mp = mpp;
		Object[] generatedM_keys = mp.getM_keys();
		ModernizedCProgram.vim_free(generatedM_keys);
		Object generatedM_str = mp.getM_str();
		ModernizedCProgram.vim_free(generatedM_str);
		Object generatedM_orig_str = mp.getM_orig_str();
		ModernizedCProgram.vim_free(generatedM_orig_str);
		mapblock generatedM_next = mp.getM_next();
		mpp = generatedM_next;
		ModernizedCProgram.vim_free(mp/*
		 * Return characters to represent the map mode in an allocated string.
		 * Returns NULL when out of memory.
		 */);
	}
	public void showmap(int local) {
		// TRUE for buffer-local mapint len = 1;
		char_u mapchars = new char_u();
		Object[] generatedM_keys = this.getM_keys();
		Object generatedM_str = this.getM_str();
		if (ModernizedCProgram.message_filtered(generatedM_keys) && ModernizedCProgram.message_filtered(generatedM_str)) {
			return /*Error: Unsupported expression*/;
		} 
		if (msg_didout || msg_silent != 0) {
			ModernizedCProgram.msg_putchar((byte)'\n');
			if (got_int) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		int generatedM_mode = this.getM_mode();
		mapchars = ModernizedCProgram.map_mode_to_chars(generatedM_mode);
		if (mapchars != ((Object)0)) {
			ModernizedCProgram.msg_puts((byte)mapchars);
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(mapchars));
			ModernizedCProgram.vim_free(mapchars);
		} 
		while (++len <= 3) {
			ModernizedCProgram.msg_putchar((byte)' ');
		}
		// Display the LHS.  Get length of what we write.// Display the LHS.  Get length of what we write.len = ModernizedCProgram.msg_outtrans_special(generatedM_keys, 1, 0);
		do {
			ModernizedCProgram.msg_putchar((byte)' ');
			++len;
		} while (len < 12);
		int generatedM_noremap = this.getM_noremap();
		if (generatedM_noremap == -1) {
			ModernizedCProgram.msg_puts_attr("*", ModernizedCProgram.highlight_attr[(int)(.HLF_8)]);
		}  else if (generatedM_noremap == -2) {
			ModernizedCProgram.msg_puts_attr("&", ModernizedCProgram.highlight_attr[(int)(.HLF_8)]);
		} else {
				ModernizedCProgram.msg_putchar((byte)' ');
		} 
		if (local) {
			ModernizedCProgram.msg_putchar((byte)'@');
		} else {
				ModernizedCProgram.msg_putchar((byte)' ');
		} 
		// the rhs, and not M-x etc, TRUE gets both -- webbif (generatedM_str == (byte)'\000') {
			ModernizedCProgram.msg_puts_attr("<Nop>", ModernizedCProgram.highlight_attr[(int)(.HLF_8)]);
		} else {
				char_u s = ModernizedCProgram.vim_strsave(generatedM_str);
				if (s != ((Object)0)) {
					ModernizedCProgram.vim_unescape_csi(s);
					ModernizedCProgram.msg_outtrans_special(s, 0, 0);
					ModernizedCProgram.vim_free(s);
				} 
		} 
		Object generatedM_script_ctx = this.getM_script_ctx();
		if (ModernizedCProgram.p_verbose > 0) {
			generatedM_script_ctx.last_set_msg();
		} 
		// show one line at a time// show one line at a timeModernizedCProgram.out_flush();
	}
	public Object check_map(Object keys, int mode, int exact, int ign_mod, int abbr, Integer local_ptr) {
		// do abbreviations// return: pointer to mapblock or NULL// return: buffer-local mapping or NULLint hash;
		int len;
		int minlen;
		mapblock_T mp = new mapblock_T();
		char_u s = new char_u();
		int local;
		ModernizedCProgram.validate_maphash();
		len = (int)/*Error: Function owner not recognized*/strlen((byte)(keys));
		mapblock generatedB_first_abbr = curbuf.getB_first_abbr();
		Object generatedB_maphash = curbuf.getB_maphash();
		int generatedM_mode = mp.getM_mode();
		int generatedM_keylen = mp.getM_keylen();
		Object[] generatedM_keys = mp.getM_keys();
		Object generatedM_str = mp.getM_str();
		mapblock generatedM_next = mp.getM_next();
		for (local = 1; local >= 0; --local) {
			for (hash = 0; hash < 256; ++hash) {
				if (abbr) {
					if (hash > 0) {
						break;
					} 
					if (local) {
						mp = generatedB_first_abbr;
					} else {
							mp = ModernizedCProgram.first_abbr;
					} 
				}  else if (local) {
					mp = generatedB_maphash[hash];
				} else {
						mp = ModernizedCProgram.maphash[hash];
				} 
				for (; mp != ((Object)0); mp = generatedM_next) {
					if ((generatedM_mode & mode) && (!exact || generatedM_keylen == len)) {
						if (len > generatedM_keylen) {
							minlen = generatedM_keylen;
						} else {
								minlen = len;
						} 
						s = generatedM_keys;
						if (ign_mod && s[0] == (true) && s[1] == 252 && s[2] != (byte)'\000') {
							s += 3;
							if (len > generatedM_keylen - 3) {
								minlen = generatedM_keylen - 3;
							} 
						} 
						if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)(keys), (size_t)(minlen)) == 0) {
							if (mp_ptr != ((Object)0)) {
								mp_ptr = mp;
							} 
							if (local_ptr != ((Object)0)) {
								local_ptr = local;
							} 
							return generatedM_str;
						} 
					} 
				}
			}
		}// loop over all hash lists
		return ((Object)0);
	}
	// require exact match
	// ignore preceding modifier
	public mapblock getM_next() {
		return m_next;
	}
	public void setM_next(mapblock newM_next) {
		m_next = newM_next;
	}
	public Object[] getM_keys() {
		return m_keys;
	}
	public void setM_keys(Object[] newM_keys) {
		m_keys = newM_keys;
	}
	public Object getM_str() {
		return m_str;
	}
	public void setM_str(Object newM_str) {
		m_str = newM_str;
	}
	public Object getM_orig_str() {
		return m_orig_str;
	}
	public void setM_orig_str(Object newM_orig_str) {
		m_orig_str = newM_orig_str;
	}
	public int getM_keylen() {
		return m_keylen;
	}
	public void setM_keylen(int newM_keylen) {
		m_keylen = newM_keylen;
	}
	public int getM_mode() {
		return m_mode;
	}
	public void setM_mode(int newM_mode) {
		m_mode = newM_mode;
	}
	public int getM_simplified() {
		return m_simplified;
	}
	public void setM_simplified(int newM_simplified) {
		m_simplified = newM_simplified;
	}
	public int getM_noremap() {
		return m_noremap;
	}
	public void setM_noremap(int newM_noremap) {
		m_noremap = newM_noremap;
	}
	public byte getM_silent() {
		return m_silent;
	}
	public void setM_silent(byte newM_silent) {
		m_silent = newM_silent;
	}
	public byte getM_nowait() {
		return m_nowait;
	}
	public void setM_nowait(byte newM_nowait) {
		m_nowait = newM_nowait;
	}
}
