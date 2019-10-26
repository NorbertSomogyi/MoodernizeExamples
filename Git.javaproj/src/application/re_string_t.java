package application;

public class re_string_t {
	private Object raw_mbs;
	private Byte mbs;
	private int raw_mbs_idx;
	private int valid_len;
	private int valid_raw_len;
	private int bufs_len;
	private int cur_idx;
	private int raw_len;
	private int len;
	private int raw_stop;
	private int stop;
	private int tip_context;
	private Object trans;
	private Object word_char;
	private byte icase;
	private byte is_utf8;
	private byte map_notascii;
	private byte mbs_allocated;
	private byte offsets_needed;
	private byte newline_anchor;
	private byte word_ops_used;
	private int mb_cur_max;
	
	public re_string_t(Object raw_mbs, Byte mbs, int raw_mbs_idx, int valid_len, int valid_raw_len, int bufs_len, int cur_idx, int raw_len, int len, int raw_stop, int stop, int tip_context, Object trans, Object word_char, byte icase, byte is_utf8, byte map_notascii, byte mbs_allocated, byte offsets_needed, byte newline_anchor, byte word_ops_used, int mb_cur_max) {
		setRaw_mbs(raw_mbs);
		setMbs(mbs);
		setRaw_mbs_idx(raw_mbs_idx);
		setValid_len(valid_len);
		setValid_raw_len(valid_raw_len);
		setBufs_len(bufs_len);
		setCur_idx(cur_idx);
		setRaw_len(raw_len);
		setLen(len);
		setRaw_stop(raw_stop);
		setStop(stop);
		setTip_context(tip_context);
		setTrans(trans);
		setWord_char(word_char);
		setIcase(icase);
		setIs_utf8(is_utf8);
		setMap_notascii(map_notascii);
		setMbs_allocated(mbs_allocated);
		setOffsets_needed(offsets_needed);
		setNewline_anchor(newline_anchor);
		setWord_ops_used(word_ops_used);
		setMb_cur_max(mb_cur_max);
	}
	public re_string_t() {
	}
	
	public Object getRaw_mbs() {
		return raw_mbs;
	}
	public void setRaw_mbs(Object newRaw_mbs) {
		raw_mbs = newRaw_mbs;
	}
	public Byte getMbs() {
		return mbs;
	}
	public void setMbs(Byte newMbs) {
		mbs = newMbs;
	}
	public int getRaw_mbs_idx() {
		return raw_mbs_idx;
	}
	public void setRaw_mbs_idx(int newRaw_mbs_idx) {
		raw_mbs_idx = newRaw_mbs_idx;
	}
	public int getValid_len() {
		return valid_len;
	}
	public void setValid_len(int newValid_len) {
		valid_len = newValid_len;
	}
	public int getValid_raw_len() {
		return valid_raw_len;
	}
	public void setValid_raw_len(int newValid_raw_len) {
		valid_raw_len = newValid_raw_len;
	}
	public int getBufs_len() {
		return bufs_len;
	}
	public void setBufs_len(int newBufs_len) {
		bufs_len = newBufs_len;
	}
	public int getCur_idx() {
		return cur_idx;
	}
	public void setCur_idx(int newCur_idx) {
		cur_idx = newCur_idx;
	}
	public int getRaw_len() {
		return raw_len;
	}
	public void setRaw_len(int newRaw_len) {
		raw_len = newRaw_len;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getRaw_stop() {
		return raw_stop;
	}
	public void setRaw_stop(int newRaw_stop) {
		raw_stop = newRaw_stop;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int newStop) {
		stop = newStop;
	}
	public int getTip_context() {
		return tip_context;
	}
	public void setTip_context(int newTip_context) {
		tip_context = newTip_context;
	}
	public Object getTrans() {
		return trans;
	}
	public void setTrans(Object newTrans) {
		trans = newTrans;
	}
	public Object getWord_char() {
		return word_char;
	}
	public void setWord_char(Object newWord_char) {
		word_char = newWord_char;
	}
	public byte getIcase() {
		return icase;
	}
	public void setIcase(byte newIcase) {
		icase = newIcase;
	}
	public byte getIs_utf8() {
		return is_utf8;
	}
	public void setIs_utf8(byte newIs_utf8) {
		is_utf8 = newIs_utf8;
	}
	public byte getMap_notascii() {
		return map_notascii;
	}
	public void setMap_notascii(byte newMap_notascii) {
		map_notascii = newMap_notascii;
	}
	public byte getMbs_allocated() {
		return mbs_allocated;
	}
	public void setMbs_allocated(byte newMbs_allocated) {
		mbs_allocated = newMbs_allocated;
	}
	public byte getOffsets_needed() {
		return offsets_needed;
	}
	public void setOffsets_needed(byte newOffsets_needed) {
		offsets_needed = newOffsets_needed;
	}
	public byte getNewline_anchor() {
		return newline_anchor;
	}
	public void setNewline_anchor(byte newNewline_anchor) {
		newline_anchor = newNewline_anchor;
	}
	public byte getWord_ops_used() {
		return word_ops_used;
	}
	public void setWord_ops_used(byte newWord_ops_used) {
		word_ops_used = newWord_ops_used;
	}
	public int getMb_cur_max() {
		return mb_cur_max;
	}
	public void setMb_cur_max(int newMb_cur_max) {
		mb_cur_max = newMb_cur_max;
	}
}
/* Indicate the raw buffer which is the original string passed as an
     argument of regexec(), re_search(), etc..  */
