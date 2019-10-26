package application;

public class keyboard_layout_mapping {
	private Object src_char;
	private int src_len;
	private Object dst_char;
	private int dst_len;
	
	public keyboard_layout_mapping(Object src_char, int src_len, Object dst_char, int dst_len) {
		setSrc_char(src_char);
		setSrc_len(src_len);
		setDst_char(dst_char);
		setDst_len(dst_len);
	}
	public keyboard_layout_mapping() {
	}
	
	public boolean initialize_keyboard_layout_mapping(Object filename, int keyboard_layout_mapping_cnt) {
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen(filename, "r") == 0) {
			return 0;
		} 
		byte line_buf = (byte)ModernizedCProgram.hcmalloc(-1024);
		int maps_cnt = 0;
		Object generatedLen_min = token.getLen_min();
		Object generatedLen_max = token.getLen_max();
		Object generatedSep = token.getSep();
		Object generatedAttr = token.getAttr();
		Object generatedBuf = token.getBuf();
		Object generatedLen = token.getLen();
		while (!fp.hc_feof()) {
			size_t line_len = fp.fgetl(line_buf, -1024);
			if (line_len == 0) {
				continue;
			} 
			token_t token = new token_t();
			token.setToken_cnt(2);
			generatedLen_min[0] = 1;
			generatedLen_max[0] = 4;
			generatedSep[0] = -1024;
			generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			generatedLen_min[1] = 0;
			generatedLen_max[1] = 4;
			generatedSep[1] = -1024;
			generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			if (token.input_tokenizer((u8)line_buf, (int)line_len) != parser_rc.PARSER_OK) {
				fp.hc_fclose();
				ModernizedCProgram.hcfree(line_buf);
				return 0;
			} 
			.memcpy(keyboard_layout_mapping[maps_cnt].getSrc_char(), generatedBuf[0], generatedLen[0]);
			.memcpy(keyboard_layout_mapping[maps_cnt].getDst_char(), generatedBuf[1], generatedLen[1]);
			keyboard_layout_mapping[maps_cnt].setSrc_len(generatedLen[0]);
			keyboard_layout_mapping[maps_cnt].setDst_len(generatedLen[1]);
			if (maps_cnt == 256) {
				fp.hc_fclose();
				ModernizedCProgram.hcfree(line_buf);
				return 0;
			} 
			maps_cnt++;
		}
		keyboard_layout_mapping_cnt = maps_cnt;
		fp.hc_fclose();
		ModernizedCProgram.hcfree(line_buf)// we need to sort this by length to ensure the largest blocks come first in mapping;// we need to sort this by length to ensure the largest blocks come first in mapping
		.qsort(keyboard_layout_mapping, maps_cnt, , sort_by_src_len);
		return 1;
	}
	public Object getSrc_char() {
		return src_char;
	}
	public void setSrc_char(Object newSrc_char) {
		src_char = newSrc_char;
	}
	public int getSrc_len() {
		return src_len;
	}
	public void setSrc_len(int newSrc_len) {
		src_len = newSrc_len;
	}
	public Object getDst_char() {
		return dst_char;
	}
	public void setDst_char(Object newDst_char) {
		dst_char = newDst_char;
	}
	public int getDst_len() {
		return dst_len;
	}
	public void setDst_len(int newDst_len) {
		dst_len = newDst_len;
	}
}
