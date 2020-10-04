package application;

public class extra_info_combi {
	private Object pos;
	private Object base_fp;
	private Object combs_fp;
	private Object comb_pos_prev;
	private Object comb_pos;
	private Byte scratch_buf;
	private Object[] base_buf;
	private Object base_len;
	private Object[] out_buf;
	private Object out_len;
	
	public extra_info_combi(Object pos, Object base_fp, Object combs_fp, Object comb_pos_prev, Object comb_pos, Byte scratch_buf, Object[] base_buf, Object base_len, Object[] out_buf, Object out_len) {
		setPos(pos);
		setBase_fp(base_fp);
		setCombs_fp(combs_fp);
		setComb_pos_prev(comb_pos_prev);
		setComb_pos(comb_pos);
		setScratch_buf(scratch_buf);
		setBase_buf(base_buf);
		setBase_len(base_len);
		setOut_buf(out_buf);
		setOut_len(out_len);
	}
	public extra_info_combi() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getBase_fp() {
		return base_fp;
	}
	public void setBase_fp(Object newBase_fp) {
		base_fp = newBase_fp;
	}
	public Object getCombs_fp() {
		return combs_fp;
	}
	public void setCombs_fp(Object newCombs_fp) {
		combs_fp = newCombs_fp;
	}
	public Object getComb_pos_prev() {
		return comb_pos_prev;
	}
	public void setComb_pos_prev(Object newComb_pos_prev) {
		comb_pos_prev = newComb_pos_prev;
	}
	public Object getComb_pos() {
		return comb_pos;
	}
	public void setComb_pos(Object newComb_pos) {
		comb_pos = newComb_pos;
	}
	public Byte getScratch_buf() {
		return scratch_buf;
	}
	public void setScratch_buf(Byte newScratch_buf) {
		scratch_buf = newScratch_buf;
	}
	public Object[] getBase_buf() {
		return base_buf;
	}
	public void setBase_buf(Object[] newBase_buf) {
		base_buf = newBase_buf;
	}
	public Object getBase_len() {
		return base_len;
	}
	public void setBase_len(Object newBase_len) {
		base_len = newBase_len;
	}
	public Object[] getOut_buf() {
		return out_buf;
	}
	public void setOut_buf(Object[] newOut_buf) {
		out_buf = newOut_buf;
	}
	public Object getOut_len() {
		return out_len;
	}
	public void setOut_len(Object newOut_len) {
		out_len = newOut_len;
	}
}
