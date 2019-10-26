package application;

public class VTermEncoding {
	private Object init;
	private Object decode;
	
	public VTermEncoding(Object init, Object decode) {
		setInit(init);
		setDecode(decode);
	}
	public VTermEncoding() {
	}
	
	// init
	public void init_utf8(Object data_) {
		UTF8DecoderData data = data_;
		data.setBytes_remaining(0);
		data.setBytes_total(0);
	}
	// decode
	public void decode_utf8(Object data_, Object cp, int cpi, int cplen, Object bytes, Object pos, Object bytelen) {
		UTF8DecoderData data = data_;
		int generatedBytes_remaining = data.getBytes_remaining();
		int generatedThis_cp = data.getThis_cp();
		int generatedBytes_total = data.getBytes_total();
		for (; pos < bytelen && cpi < cplen; (pos)++) {
			byte c = bytes[pos];
			if (c < -1024) {
				return ;
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					data.setBytes_remaining(0);
					cp[(cpi)++] = -1024;
					if (cpi >= cplen) {
						break;
					} 
				} 
				cp[(cpi)++] = c;
			}  else if (c == -1024) {
				return ;
			}  else if (c >= -1024 && c < -1024) {
				if (!generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
					continue;
				} 
				generatedThis_cp <<=  6;
				generatedThis_cp |=  c & -1024;
				generatedBytes_remaining--;
				if (!generatedBytes_remaining) {
					switch (generatedBytes_total) {
					case 5:
							if (generatedThis_cp < -1024) {
								data.setThis_cp(-1024);
							} 
							break;
					case 2:
							if (generatedThis_cp < -1024) {
								data.setThis_cp(-1024);
							} 
							break;
					case 4:
							if (generatedThis_cp < -1024) {
								data.setThis_cp(-1024);
							} 
							break;
					case 3:
							if (generatedThis_cp < -1024) {
								data.setThis_cp(-1024);
							} 
							break;
					case 6:
							if (generatedThis_cp < -1024) {
								data.setThis_cp(-1024);
							} 
							break;
					}
					if ((generatedThis_cp >= -1024 && generatedThis_cp <= -1024) || generatedThis_cp == -1024 || generatedThis_cp == -1024) {
						data.setThis_cp(-1024);
					} 
					cp[(cpi)++] = generatedThis_cp;
				} 
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
				} 
				data.setThis_cp(c & -1024);
				data.setBytes_total(2);
				data.setBytes_remaining(1);
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
				} 
				data.setThis_cp(c & -1024);
				data.setBytes_total(3);
				data.setBytes_remaining(2);
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
				} 
				data.setThis_cp(c & -1024);
				data.setBytes_total(4);
				data.setBytes_remaining(3);
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
				} 
				data.setThis_cp(c & -1024);
				data.setBytes_total(5);
				data.setBytes_remaining(4);
			}  else if (c >= -1024 && c < -1024) {
				if (generatedBytes_remaining) {
					cp[(cpi)++] = -1024;
				} 
				data.setThis_cp(c & -1024);
				data.setBytes_total(6);
				data.setBytes_remaining(5);
			} else {
					cp[(cpi)++] = -1024;
			} 
		}
	}
	// init
	// decode
	public void decode_usascii(Object data, Object cp, int cpi, int cplen, Object bytes, Object pos, Object bytelen) {
		int is_gr = bytes[pos] & -1024;
		for (; pos < bytelen && cpi < cplen; (pos)++) {
			byte c = bytes[pos] ^ is_gr;
			if (c < -1024 || c == -1024 || c >= -1024) {
				return ;
			} 
			cp[(cpi)++] = c;
		}
	}
	public void decode_table(Object data, Object cp, int cpi, int cplen, Object bytes, Object pos, Object bytelen) {
		StaticTableEncoding table = (StaticTableEncoding)enc;
		int is_gr = bytes[pos] & -1024;
		Object generatedChars = table.getChars();
		for (; pos < bytelen && cpi < cplen; (pos)++) {
			byte c = bytes[pos] ^ is_gr;
			if (c < -1024 || c == -1024 || c >= -1024) {
				return ;
			} 
			if (generatedChars[c]) {
				cp[(cpi)++] = generatedChars[c];
			} else {
					cp[(cpi)++] = c;
			} 
		}
	}
	// This ought to be INTERNAL but isn't because it's used by unit testing
	public VTermEncoding vterm_lookup_encoding( type, byte designation) {
		int i;
		for (i = 0; encodings[i].getDesignation(); i++) {
			if (encodings[i].getType() == type && encodings[i].getDesignation() == designation) {
				return encodings[i].getEnc();
			} 
		}
		return ((Object)0);
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getDecode() {
		return decode;
	}
	public void setDecode(Object newDecode) {
		decode = newDecode;
	}
}
