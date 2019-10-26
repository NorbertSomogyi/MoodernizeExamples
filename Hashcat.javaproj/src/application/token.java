package application;

public class token {
	private int token_cnt;
	private int signatures_cnt;
	private Object signatures_buf;
	private Object sep;
	private Object buf;
	private Object len;
	private Object len_min;
	private Object len_max;
	private Object attr;
	private Object opt_buf;
	private int opt_len;
	
	public token(int token_cnt, int signatures_cnt, Object signatures_buf, Object sep, Object buf, Object len, Object len_min, Object len_max, Object attr, Object opt_buf, int opt_len) {
		setToken_cnt(token_cnt);
		setSignatures_cnt(signatures_cnt);
		setSignatures_buf(signatures_buf);
		setSep(sep);
		setBuf(buf);
		setLen(len);
		setLen_min(len_min);
		setLen_max(len_max);
		setAttr(attr);
		setOpt_buf(opt_buf);
		setOpt_len(opt_len);
	}
	public token() {
	}
	
	public int input_tokenizer(Object input_buf, Object input_len) {
		int len_left = input_len;
		Object generatedBuf = this.getBuf();
		generatedBuf[0] = input_buf;
		int token_idx;
		int generatedToken_cnt = this.getToken_cnt();
		Object generatedAttr = this.getAttr();
		Object generatedLen = this.getLen();
		Object generatedSep = this.getSep();
		for (token_idx = 0; token_idx < generatedToken_cnt - 1; token_idx++) {
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_FIXED_LENGTH) {
				int len = generatedLen[token_idx];
				if (len_left < len) {
					return (parser_rc.PARSER_TOKEN_LENGTH);
				} 
				generatedBuf[token_idx + 1] = generatedBuf[token_idx] + len;
				len_left -= len;
			} else {
					if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS) {
						int len = ModernizedCProgram.rounds_count_length((byte)generatedBuf[token_idx], len_left);
						this.setOpt_buf(generatedBuf[token_idx]);
						this.setOpt_len(len);
						if (len > 0) {
							generatedBuf[token_idx] += len + 1;
							len_left -= len + 1;
						} 
					} 
					u8 next_pos = (u8).strchr((byte)generatedBuf[token_idx], generatedSep[token_idx]);
					if (next_pos == ((Object)0)) {
						return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
					} 
					int len = next_pos - generatedBuf[token_idx];
					generatedLen[token_idx] = len;
					generatedBuf[token_idx + 1] = next_pos + 1;
					len_left -= len + 1;
			} 
		}
		if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_FIXED_LENGTH) {
			int len = generatedLen[token_idx];
			if (len_left != len) {
				return (parser_rc.PARSER_TOKEN_LENGTH);
			} 
		} else {
				generatedLen[token_idx] = len_left;
		} 
		int generatedSignatures_cnt = this.getSignatures_cnt();
		Object generatedSignatures_buf = this.getSignatures_buf();
		Object generatedLen_min = this.getLen_min();
		Object generatedLen_max = this.getLen_max();
		// verify datafor (token_idx = 0; token_idx < generatedToken_cnt; token_idx++) {
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_SIGNATURE) {
				boolean matched = false;
				for (int signature_idx = 0;
				 signature_idx < generatedSignatures_cnt; signature_idx++) {
					if (.memcmp(generatedBuf[token_idx], generatedSignatures_buf[signature_idx], generatedLen[token_idx]) == 0) {
						matched = true;
					} 
				}
				if (matched == false) {
					return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_LENGTH) {
				if (generatedLen[token_idx] < generatedLen_min[token_idx]) {
					return (parser_rc.PARSER_TOKEN_LENGTH);
				} 
				if (generatedLen[token_idx] > generatedLen_max[token_idx]) {
					return (parser_rc.PARSER_TOKEN_LENGTH);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_DIGIT) {
				if (ModernizedCProgram.is_valid_digit_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_FLOAT) {
				if (ModernizedCProgram.is_valid_float_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_HEX) {
				if (ModernizedCProgram.is_valid_hex_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_BASE64A) {
				if (ModernizedCProgram.is_valid_base64a_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_BASE64B) {
				if (ModernizedCProgram.is_valid_base64b_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
			if (generatedAttr[token_idx] & token_attr.TOKEN_ATTR_VERIFY_BASE64C) {
				if (ModernizedCProgram.is_valid_base64c_string(generatedBuf[token_idx], generatedLen[token_idx]) == 0) {
					return (parser_rc.PARSER_TOKEN_ENCODING);
				} 
			} 
		}
		return parser_rc.PARSER_OK;
	}
	public int getToken_cnt() {
		return token_cnt;
	}
	public void setToken_cnt(int newToken_cnt) {
		token_cnt = newToken_cnt;
	}
	public int getSignatures_cnt() {
		return signatures_cnt;
	}
	public void setSignatures_cnt(int newSignatures_cnt) {
		signatures_cnt = newSignatures_cnt;
	}
	public Object getSignatures_buf() {
		return signatures_buf;
	}
	public void setSignatures_buf(Object newSignatures_buf) {
		signatures_buf = newSignatures_buf;
	}
	public Object getSep() {
		return sep;
	}
	public void setSep(Object newSep) {
		sep = newSep;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getLen_min() {
		return len_min;
	}
	public void setLen_min(Object newLen_min) {
		len_min = newLen_min;
	}
	public Object getLen_max() {
		return len_max;
	}
	public void setLen_max(Object newLen_max) {
		len_max = newLen_max;
	}
	public Object getAttr() {
		return attr;
	}
	public void setAttr(Object newAttr) {
		attr = newAttr;
	}
	public Object getOpt_buf() {
		return opt_buf;
	}
	public void setOpt_buf(Object newOpt_buf) {
		opt_buf = newOpt_buf;
	}
	public int getOpt_len() {
		return opt_len;
	}
	public void setOpt_len(int newOpt_len) {
		opt_len = newOpt_len;
	}
}
