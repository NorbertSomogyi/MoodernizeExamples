package application;

/**
 * Author......: See docs/credits.txt
 * License.....: MIT
 */
public class extra_info_straight {
	private Object pos;
	private Object fp;
	private Object rule_pos_prev;
	private Object rule_pos;
	private Object base_buf;
	private Object base_len;
	private Object out_buf;
	private Object out_len;
	
	public extra_info_straight(Object pos, Object fp, Object rule_pos_prev, Object rule_pos, Object base_buf, Object base_len, Object out_buf, Object out_len) {
		setPos(pos);
		setFp(fp);
		setRule_pos_prev(rule_pos_prev);
		setRule_pos(rule_pos);
		setBase_buf(base_buf);
		setBase_len(base_len);
		setOut_buf(out_buf);
		setOut_len(out_len);
	}
	public extra_info_straight() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getFp() {
		return fp;
	}
	public void setFp(Object newFp) {
		fp = newFp;
	}
	public Object getRule_pos_prev() {
		return rule_pos_prev;
	}
	public void setRule_pos_prev(Object newRule_pos_prev) {
		rule_pos_prev = newRule_pos_prev;
	}
	public Object getRule_pos() {
		return rule_pos;
	}
	public void setRule_pos(Object newRule_pos) {
		rule_pos = newRule_pos;
	}
	public Object getBase_buf() {
		return base_buf;
	}
	public void setBase_buf(Object newBase_buf) {
		base_buf = newBase_buf;
	}
	public Object getBase_len() {
		return base_len;
	}
	public void setBase_len(Object newBase_len) {
		base_len = newBase_len;
	}
	public Object getOut_buf() {
		return out_buf;
	}
	public void setOut_buf(Object newOut_buf) {
		out_buf = newOut_buf;
	}
	public Object getOut_len() {
		return out_len;
	}
	public void setOut_len(Object newOut_len) {
		out_len = newOut_len;
	}
}
