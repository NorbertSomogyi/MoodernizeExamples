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
 * bufwrite.c: functions for writing a buffer
 */
// for struct utimbuf
// size of emergency write buffer
/*
 * Structure to pass arguments from buf_write() to buf_write_bytes().
 */
public class bw_info {
	private int bw_fd;
	private Object bw_buf;
	private int bw_len;
	private int bw_flags;
	private file_buffer bw_buffer;
	private Object bw_rest;
	private int bw_restlen;
	private int bw_first;
	private Object bw_conv_buf;
	private Object bw_conv_buflen;
	private int bw_conv_error;
	private Object bw_conv_error_lnum;
	private Object bw_start_lnum;
	
	public bw_info(int bw_fd, Object bw_buf, int bw_len, int bw_flags, file_buffer bw_buffer, Object bw_rest, int bw_restlen, int bw_first, Object bw_conv_buf, Object bw_conv_buflen, int bw_conv_error, Object bw_conv_error_lnum, Object bw_start_lnum) {
		setBw_fd(bw_fd);
		setBw_buf(bw_buf);
		setBw_len(bw_len);
		setBw_flags(bw_flags);
		setBw_buffer(bw_buffer);
		setBw_rest(bw_rest);
		setBw_restlen(bw_restlen);
		setBw_first(bw_first);
		setBw_conv_buf(bw_conv_buf);
		setBw_conv_buflen(bw_conv_buflen);
		setBw_conv_error(bw_conv_error);
		setBw_conv_error_lnum(bw_conv_error_lnum);
		setBw_start_lnum(bw_start_lnum);
	}
	public bw_info() {
	}
	
	public int buf_write_bytes() {
		int wlen;
		Object generatedBw_buf = this.getBw_buf();
		// data to writechar_u buf = generatedBw_buf;
		int generatedBw_len = this.getBw_len();
		// length of dataint len = generatedBw_len;
		int generatedBw_flags = this.getBw_flags();
		// extra flagsint flags = generatedBw_flags;
		Object generatedBw_conv_buf = this.getBw_conv_buf();
		int generatedBw_restlen = this.getBw_restlen();
		Object generatedBw_rest = this.getBw_rest();
		int generatedBw_conv_error = this.getBw_conv_error();
		Object generatedBw_start_lnum = this.getBw_start_lnum();
		Object generatedBw_conv_buflen = this.getBw_conv_buflen();
		// Skip conversion when writing the crypt magic number or the BOM.if (!(flags & -1024)) {
			char_u p = new char_u();
			int c;
			int n;
			if (flags & -1024) {
				p = generatedBw_conv_buf;
				for (wlen = 0; wlen < len; ++wlen) {
					p += ModernizedCProgram.utf_char2bytes(buf[wlen], p);
				}
				buf = generatedBw_conv_buf;
				len = (int)(p - generatedBw_conv_buf);
			}  else if (flags & (-1024 | -1024 | -1024 | -1024)) {
				if (flags & -1024) {
					p = buf;
				} else {
						p = generatedBw_conv_buf;
				} 
				for (wlen = 0; wlen < len; wlen += n) {
					if (wlen == 0 && generatedBw_restlen != 0) {
						int l;
						ModernizedCProgram.l = 30 - generatedBw_restlen;
						if (ModernizedCProgram.l > len) {
							ModernizedCProgram.l = len;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedBw_rest + generatedBw_restlen), (byte)(buf), (size_t)((size_t)ModernizedCProgram.l));
						n = ModernizedCProgram.utf_ptr2len_len(generatedBw_rest, generatedBw_restlen + ModernizedCProgram.l);
						if (n > generatedBw_restlen + len) {
							if (generatedBw_restlen + len > 30) {
								return 0;
							} 
							generatedBw_restlen += len;
							break;
						} 
						if (n > 1) {
							c = ModernizedCProgram.utf_ptr2char(generatedBw_rest);
						} else {
								c = generatedBw_rest[0];
						} 
						if (n >= generatedBw_restlen) {
							n -= generatedBw_restlen;
							this.setBw_restlen(0);
						} else {
								generatedBw_restlen -= n;
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedBw_rest), (byte)(generatedBw_rest + n), (size_t)((size_t)generatedBw_restlen));
								n = 0;
						} 
					} else {
							n = ModernizedCProgram.utf_ptr2len_len(buf + wlen, len - wlen);
							if (n > len - wlen) {
								if (len - wlen > 30) {
									return 0;
								} 
								this.setBw_restlen(len - wlen);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedBw_rest), (byte)(buf + wlen), (size_t)((size_t)generatedBw_restlen));
								break;
							} 
							if (n > 1) {
								c = ModernizedCProgram.utf_ptr2char(buf + wlen);
							} else {
									c = buf[wlen];
							} 
					} 
					if (ModernizedCProgram.ucs2bytes(c, p, flags) && !generatedBw_conv_error) {
						this.setBw_conv_error(1);
						this.setBw_conv_error_lnum(generatedBw_start_lnum);
					} 
					if (c == (byte)'\012') {
						++generatedBw_start_lnum;
					} 
				}
				if (flags & -1024) {
					len = (int)(p - buf);
				} else {
						buf = generatedBw_conv_buf;
						len = (int)(p - generatedBw_conv_buf);
				} 
			}  else if (flags & -1024) {
				char_u from = new char_u();
				size_t fromlen = new size_t();
				char_u to = new char_u();
				int u8c;
				BOOL bad = 0;
				int needed;
				if (generatedBw_restlen > 0) {
					fromlen = len + generatedBw_restlen;
					from = generatedBw_conv_buf + generatedBw_conv_buflen - fromlen;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(from), (byte)(generatedBw_rest), (size_t)((size_t)generatedBw_restlen));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(from + generatedBw_restlen), (byte)(buf), (size_t)((size_t)len));
				} else {
						from = buf;
						fromlen = len;
				} 
				to = generatedBw_conv_buf;
				if (enc_utf8) {
					while (fromlen > 0) {
						n = (int)ModernizedCProgram.utf_ptr2len_len(from, (int)fromlen);
						if (n > (int)fromlen) {
							break;
						} 
						u8c = ModernizedCProgram.utf_ptr2char(from);
						to++ = (u8c & -1024);
						to++ = (u8c >> 8);
						fromlen -= n;
						from += n;
					}
					if (fromlen > 30) {
						this.setBw_conv_error(1);
						return 0;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedBw_rest), (byte)(from), (size_t)(fromlen));
					this.setBw_restlen((int)fromlen);
				} else {
						this.setBw_restlen(0);
						needed = /*Error: Function owner not recognized*/MultiByteToWideChar(enc_codepage, 8, (LPCSTR)from, (int)fromlen, ((Object)0), 0);
						if (needed == 0) {
							needed = /*Error: Function owner not recognized*/MultiByteToWideChar(enc_codepage, 8, (LPCSTR)from, (int)fromlen - 1, ((Object)0), 0);
							if (needed == 0) {
								this.setBw_conv_error(1);
								return 0;
							} 
							generatedBw_rest[0] = from[fromlen - 1];
							this.setBw_restlen(1);
						} 
						needed = /*Error: Function owner not recognized*/MultiByteToWideChar(enc_codepage, 8, (LPCSTR)from, (int)(fromlen - generatedBw_restlen), (LPWSTR)to, needed);
						if (needed == 0) {
							this.setBw_conv_error(1);
							return 0;
						} 
						to += needed * 2;
				} 
				fromlen = to - generatedBw_conv_buf;
				buf = to;
				if ((((flags) >> 16) & -1024) == 65001) {
					for (from = generatedBw_conv_buf; fromlen > 1; fromlen -= 2) {
						u8c = from++;
						u8c += (from++ << 8);
						to += ModernizedCProgram.utf_char2bytes(u8c, to);
						if (to + 6 >= generatedBw_conv_buf + generatedBw_conv_buflen) {
							this.setBw_conv_error(1);
							return 0;
						} 
					}
					len = (int)(to - buf);
				} else {
						len = /*Error: Function owner not recognized*/WideCharToMultiByte((((flags) >> 16) & -1024), 0, (LPCWSTR)generatedBw_conv_buf, (int)fromlen / /*Error: Unsupported expression*/, (LPSTR)to, (int)(generatedBw_conv_buflen - fromlen), 0, bad);
						if (bad) {
							this.setBw_conv_error(1);
							return 0;
						} 
				} 
			} 
		} 
		int generatedBw_fd = this.getBw_fd();
		// Convert UTF-8 or latin1 to Apple MacRoman.// Need to concatenate the remainder of the previous call and// the bytes of the current call.  Use the end of the// conversion buffer for this.// Convert with iconv().// Need to concatenate the remainder of the previous call and// the bytes of the current call.  Use the end of the// conversion buffer for this.// output the initial shift state sequence// There is a bug in iconv() on Linux (which appears to be// wide-spread) which sets "to" to NULL and messes up "tolen".// If iconv() has an error or there is not enough room, fail.// copy remainder to ip->bw_rest[] to be used for the next call.if (generatedBw_fd < 0) {
			return 1;
		} 
		// Only checking conversion, which is OK if we get here.
		file_buffer generatedBw_buffer = this.getBw_buffer();
		Object generatedB_cryptstate = generatedBw_buffer.getB_cryptstate();
		if (flags & -1024) {
			generatedB_cryptstate.crypt_encode_inplace(buf, len);
		} 
		// Encrypt the data. Do it in-place if possible, otherwise use an// allocated buffer.
		wlen = ModernizedCProgram.write_eintr(generatedBw_fd, buf, len);
		return (wlen < len) ? 0 : 1/*
		 * Check modification time of file, before writing to it.
		 * The size isn't checked, because using a tool like "gzip" takes care of
		 * using the same timestamp but can't set the size.
		 */;
	}
	public int getBw_fd() {
		return bw_fd;
	}
	public void setBw_fd(int newBw_fd) {
		bw_fd = newBw_fd;
	}
	public Object getBw_buf() {
		return bw_buf;
	}
	public void setBw_buf(Object newBw_buf) {
		bw_buf = newBw_buf;
	}
	public int getBw_len() {
		return bw_len;
	}
	public void setBw_len(int newBw_len) {
		bw_len = newBw_len;
	}
	public int getBw_flags() {
		return bw_flags;
	}
	public void setBw_flags(int newBw_flags) {
		bw_flags = newBw_flags;
	}
	public file_buffer getBw_buffer() {
		return bw_buffer;
	}
	public void setBw_buffer(file_buffer newBw_buffer) {
		bw_buffer = newBw_buffer;
	}
	public Object getBw_rest() {
		return bw_rest;
	}
	public void setBw_rest(Object newBw_rest) {
		bw_rest = newBw_rest;
	}
	public int getBw_restlen() {
		return bw_restlen;
	}
	public void setBw_restlen(int newBw_restlen) {
		bw_restlen = newBw_restlen;
	}
	public int getBw_first() {
		return bw_first;
	}
	public void setBw_first(int newBw_first) {
		bw_first = newBw_first;
	}
	public Object getBw_conv_buf() {
		return bw_conv_buf;
	}
	public void setBw_conv_buf(Object newBw_conv_buf) {
		bw_conv_buf = newBw_conv_buf;
	}
	public Object getBw_conv_buflen() {
		return bw_conv_buflen;
	}
	public void setBw_conv_buflen(Object newBw_conv_buflen) {
		bw_conv_buflen = newBw_conv_buflen;
	}
	public int getBw_conv_error() {
		return bw_conv_error;
	}
	public void setBw_conv_error(int newBw_conv_error) {
		bw_conv_error = newBw_conv_error;
	}
	public Object getBw_conv_error_lnum() {
		return bw_conv_error_lnum;
	}
	public void setBw_conv_error_lnum(Object newBw_conv_error_lnum) {
		bw_conv_error_lnum = newBw_conv_error_lnum;
	}
	public Object getBw_start_lnum() {
		return bw_start_lnum;
	}
	public void setBw_start_lnum(Object newBw_start_lnum) {
		bw_start_lnum = newBw_start_lnum;
	}
}
