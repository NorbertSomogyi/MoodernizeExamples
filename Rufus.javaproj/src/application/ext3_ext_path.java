package application;

public class ext3_ext_path {
	private Object p_block;
	private Object p_depth;
	private ext3_extent p_ext;
	private ext3_extent_idx p_idx;
	private ext3_extent_header p_hdr;
	private buffer_head p_bh;
	
	public ext3_ext_path(Object p_block, Object p_depth, ext3_extent p_ext, ext3_extent_idx p_idx, ext3_extent_header p_hdr, buffer_head p_bh) {
		setP_block(p_block);
		setP_depth(p_depth);
		setP_ext(p_ext);
		setP_idx(p_idx);
		setP_hdr(p_hdr);
		setP_bh(p_bh);
	}
	public ext3_ext_path() {
	}
	
	public Object getP_block() {
		return p_block;
	}
	public void setP_block(Object newP_block) {
		p_block = newP_block;
	}
	public Object getP_depth() {
		return p_depth;
	}
	public void setP_depth(Object newP_depth) {
		p_depth = newP_depth;
	}
	public ext3_extent getP_ext() {
		return p_ext;
	}
	public void setP_ext(ext3_extent newP_ext) {
		p_ext = newP_ext;
	}
	public ext3_extent_idx getP_idx() {
		return p_idx;
	}
	public void setP_idx(ext3_extent_idx newP_idx) {
		p_idx = newP_idx;
	}
	public ext3_extent_header getP_hdr() {
		return p_hdr;
	}
	public void setP_hdr(ext3_extent_header newP_hdr) {
		p_hdr = newP_hdr;
	}
	public buffer_head getP_bh() {
		return p_bh;
	}
	public void setP_bh(buffer_head newP_bh) {
		p_bh = newP_bh;
	}
}
