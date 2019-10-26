package application;

public class mask_ctx {
	private boolean enabled;
	private  mp_sys;
	private  mp_usr;
	private Object bfs_cnt;
	private  css_buf;
	private Object css_cnt;
	private  root_table_buf;
	private  markov_table_buf;
	private  root_css_buf;
	private  markov_css_buf;
	private boolean mask_from_file;
	private Byte masks;
	private Object masks_pos;
	private Object masks_cnt;
	private Object masks_avail;
	private Byte mask;
	private mf mfs;
	
	public mask_ctx(boolean enabled,  mp_sys,  mp_usr, Object bfs_cnt,  css_buf, Object css_cnt,  root_table_buf,  markov_table_buf,  root_css_buf,  markov_css_buf, boolean mask_from_file, Byte masks, Object masks_pos, Object masks_cnt, Object masks_avail, Byte mask, mf mfs) {
		setEnabled(enabled);
		setMp_sys(mp_sys);
		setMp_usr(mp_usr);
		setBfs_cnt(bfs_cnt);
		setCss_buf(css_buf);
		setCss_cnt(css_cnt);
		setRoot_table_buf(root_table_buf);
		setMarkov_table_buf(markov_table_buf);
		setRoot_css_buf(root_css_buf);
		setMarkov_css_buf(markov_css_buf);
		setMask_from_file(mask_from_file);
		setMasks(masks);
		setMasks_pos(masks_pos);
		setMasks_cnt(masks_cnt);
		setMasks_avail(masks_avail);
		setMask(mask);
		setMfs(mfs);
	}
	public mask_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public  getMp_sys() {
		return mp_sys;
	}
	public void setMp_sys( newMp_sys) {
		mp_sys = newMp_sys;
	}
	public  getMp_usr() {
		return mp_usr;
	}
	public void setMp_usr( newMp_usr) {
		mp_usr = newMp_usr;
	}
	public Object getBfs_cnt() {
		return bfs_cnt;
	}
	public void setBfs_cnt(Object newBfs_cnt) {
		bfs_cnt = newBfs_cnt;
	}
	public  getCss_buf() {
		return css_buf;
	}
	public void setCss_buf( newCss_buf) {
		css_buf = newCss_buf;
	}
	public Object getCss_cnt() {
		return css_cnt;
	}
	public void setCss_cnt(Object newCss_cnt) {
		css_cnt = newCss_cnt;
	}
	public  getRoot_table_buf() {
		return root_table_buf;
	}
	public void setRoot_table_buf( newRoot_table_buf) {
		root_table_buf = newRoot_table_buf;
	}
	public  getMarkov_table_buf() {
		return markov_table_buf;
	}
	public void setMarkov_table_buf( newMarkov_table_buf) {
		markov_table_buf = newMarkov_table_buf;
	}
	public  getRoot_css_buf() {
		return root_css_buf;
	}
	public void setRoot_css_buf( newRoot_css_buf) {
		root_css_buf = newRoot_css_buf;
	}
	public  getMarkov_css_buf() {
		return markov_css_buf;
	}
	public void setMarkov_css_buf( newMarkov_css_buf) {
		markov_css_buf = newMarkov_css_buf;
	}
	public boolean getMask_from_file() {
		return mask_from_file;
	}
	public void setMask_from_file(boolean newMask_from_file) {
		mask_from_file = newMask_from_file;
	}
	public Byte getMasks() {
		return masks;
	}
	public void setMasks(Byte newMasks) {
		masks = newMasks;
	}
	public Object getMasks_pos() {
		return masks_pos;
	}
	public void setMasks_pos(Object newMasks_pos) {
		masks_pos = newMasks_pos;
	}
	public Object getMasks_cnt() {
		return masks_cnt;
	}
	public void setMasks_cnt(Object newMasks_cnt) {
		masks_cnt = newMasks_cnt;
	}
	public Object getMasks_avail() {
		return masks_avail;
	}
	public void setMasks_avail(Object newMasks_avail) {
		masks_avail = newMasks_avail;
	}
	public Byte getMask() {
		return mask;
	}
	public void setMask(Byte newMask) {
		mask = newMask;
	}
	public mf getMfs() {
		return mfs;
	}
	public void setMfs(mf newMfs) {
		mfs = newMfs;
	}
}
