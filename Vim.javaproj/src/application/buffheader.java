package application;

public class buffheader {
	private buffblock bh_first;
	private buffblock bh_curr;
	private int bh_index;
	private int bh_space;
	
	public buffheader(buffblock bh_first, buffblock bh_curr, int bh_index, int bh_space) {
		setBh_first(bh_first);
		setBh_curr(bh_curr);
		setBh_index(bh_index);
		setBh_space(bh_space);
	}
	public buffheader() {
	}
	
	public void free_buff() {
		buffblock_T p = new buffblock_T();
		buffblock_T np = new buffblock_T();
		buffblock generatedB_next = p.getB_next();
		for (p = generatedB_next; p != ((Object)0); p = np) {
			np = generatedB_next;
			ModernizedCProgram.vim_free(p);
		}
		buffblock generatedBh_first = this.getBh_first();
		generatedBh_first.setB_next(((Object)0/*
		 * Return the contents of a buffer as a single string.
		 * K_SPECIAL and CSI in the returned string are escaped.
		 */));
	}
	public Object get_buffcont(int dozero) {
		long_u count = /* count == zero is not an error */0;
		char_u p = ((Object)0);
		char_u p2 = new char_u();
		char_u str = new char_u();
		buffblock_T bp = new buffblock_T();
		Object generatedB_str = bp.getB_str();
		buffblock generatedB_next = bp.getB_next();
		for (bp = generatedB_next; bp != ((Object)0); bp = generatedB_next) {
			count += (long_u)/*Error: Function owner not recognized*/strlen((byte)(generatedB_str));
		}
		if ((count || dozero) && (p = ModernizedCProgram.alloc(count + 1)) != ((Object)0)) {
			p2 = p;
			for (bp = generatedB_next; bp != ((Object)0); bp = generatedB_next) {
				for (str = generatedB_str; str; /*Error: Unsupported expression*/) {
					p2++ = str++;
				}
			}
			p2 = (byte)'\000';
		} 
		return (p/*
		 * Return the contents of the record buffer as a single string
		 * and clear the record buffer.
		 * K_SPECIAL and CSI in the returned string are escaped.
		 */);
	}
	public void add_buff(Object s, long slen) {
		/* length of "s" or -1 */buffblock_T p = new buffblock_T();
		long_u len = new long_u();
		if (slen < 0) {
			slen = (long)/*Error: Function owner not recognized*/strlen((byte)(s));
		} 
		if (slen == /* don't add empty strings */0) {
			return /*Error: Unsupported expression*/;
		} 
		buffblock generatedBh_first = this.getBh_first();
		buffblock generatedB_next = generatedBh_first.getB_next();
		buffblock generatedBh_curr = this.getBh_curr();
		int generatedBh_index = this.getBh_index();
		Object generatedB_str = generatedB_next.getB_str();
		if (generatedB_next == ((Object)/* first add to list */0)) {
			this.setBh_space(0);
			this.setBh_curr((generatedBh_first));
		}  else if (generatedBh_curr == ((Object)/* buffer has already been read */0)) {
			ModernizedCProgram.iemsg(((byte)("E222: Add to read buffer")));
			return /*Error: Unsupported expression*/;
		}  else if (generatedBh_index != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedB_str), (byte)(generatedB_str + generatedBh_index), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(generatedB_str + generatedBh_index)) + 1));
		} 
		this.setBh_index(0);
		int generatedBh_space = this.getBh_space();
		if (generatedBh_space >= (int)slen) {
			len = (long_u)/*Error: Function owner not recognized*/strlen((byte)(generatedB_str));
			ModernizedCProgram.vim_strncpy(generatedB_str + len, s, (size_t)slen);
			generatedBh_space -= slen;
		} else {
				if (slen < 20) {
					len = 20;
				} else {
						len = slen;
				} 
				p = ModernizedCProgram.alloc(((size_t)generatedB_str) + len + 1);
				if (p == ((Object)0)) {
					return /*Error: Unsupported expression*/;
				} 
				this.setBh_space((int)(len - slen));
				ModernizedCProgram.vim_strncpy(generatedB_str, s, (size_t)slen);
				p.setB_next(generatedB_next);
				generatedBh_curr.setB_next(p);
				this.setBh_curr(p);
		} 
		return /*Error: Unsupported expression*/;/*
		 * Add number "n" to buffer "buf".
		 */
	}
	public void add_num_buff(long n) {
		char_u[] number = new char_u();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)number, "%ld", n);
		buf.add_buff(number, --1024/*
		 * Add character 'c' to buffer "buf".
		 * Translates special keys, NUL, CSI, K_SPECIAL and multibyte characters.
		 */);
	}
	public void add_char_buff(int c) {
		char_u[] bytes = new char_u();
		int len;
		int i;
		char_u[] temp = new char_u();
		if (((c) < 0)) {
			len = 1;
		} else {
				len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(c, bytes);
		} 
		for (i = 0; i < len; ++i) {
			if (!((c) < 0)) {
				c = bytes[i];
			} 
			if (((c) < 0) || c == (true) || c == (byte)'\000') {
				temp[0] = (/* translate special key code into three byte sequence */true);
				temp[1] = ((c) == (true) ? 254 : (c) == (byte)'\000' ? 255 : ((-(c)) & -1024));
				temp[2] = (((c) == (true) || (c) == (byte)'\000') ? ((byte)'X') : (((int)(-(c)) >> 8) & -1024));
				temp[3] = (byte)'\000'/* Translate a CSI to a CSI - KS_EXTRA - KE_CSI sequence */;
			} else {
					temp[0] = c;
					temp[1] = (byte)'\000';
			} 
			buf.add_buff(temp, --1024);
		}
	}
	// remapping flags
	public int read_readbuf(int advance) {
		char_u c = new char_u();
		buffblock_T curr = new buffblock_T();
		buffblock generatedBh_first = this.getBh_first();
		buffblock generatedB_next = generatedBh_first.getB_next();
		if (generatedB_next == ((Object)/* buffer is empty */0)) {
			return (byte)'\000';
		} 
		curr = generatedB_next;
		Object generatedB_str = curr.getB_str();
		int generatedBh_index = this.getBh_index();
		c = generatedB_str[generatedBh_index];
		if (advance) {
			if (generatedB_str[++generatedBh_index] == (byte)'\000') {
				generatedBh_first.setB_next(generatedB_next);
				ModernizedCProgram.vim_free(curr);
				this.setBh_index(0);
			} 
		} 
		return c/*
		 * Prepare the read buffers for reading (if they contain something).
		 */;
	}
	public buffblock getBh_first() {
		return bh_first;
	}
	public void setBh_first(buffblock newBh_first) {
		bh_first = newBh_first;
	}
	public buffblock getBh_curr() {
		return bh_curr;
	}
	public void setBh_curr(buffblock newBh_curr) {
		bh_curr = newBh_curr;
	}
	public int getBh_index() {
		return bh_index;
	}
	public void setBh_index(int newBh_index) {
		bh_index = newBh_index;
	}
	public int getBh_space() {
		return bh_space;
	}
	public void setBh_space(int newBh_space) {
		bh_space = newBh_space;
	}
}
/*
 * structure used to store one block of the stuff/redo/recording buffers
 */
