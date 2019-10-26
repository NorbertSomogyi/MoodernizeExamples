package application;

public class suffix_match {
	private int conf_pos;
	private int start;
	private int len;
	
	public suffix_match(int conf_pos, int start, int len) {
		setConf_pos(conf_pos);
		setStart(start);
		setLen(len);
	}
	public suffix_match() {
	}
	
	public void find_better_matching_suffix(Object tagname, Object suffix, int suffix_len, int start, int conf_pos) {
		int generatedLen = this.getLen();
		int generatedStart = this.getStart();
		int end = generatedLen < suffix_len ? generatedStart : generatedStart - 1;
		int i;
		for (i = start; i <= end; i++) {
			if (ModernizedCProgram.starts_with(tagname + i, suffix)) {
				this.setConf_pos(conf_pos);
				this.setStart(i);
				this.setLen(suffix_len);
				break;
			} 
		}
	}
	public int getConf_pos() {
		return conf_pos;
	}
	public void setConf_pos(int newConf_pos) {
		conf_pos = newConf_pos;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int newStart) {
		start = newStart;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
}
/*
	 * A better match either starts earlier or starts at the same offset
	 * but is longer.
	 */
