package application;

public class ext3_extent_idx {
	private Object ei_block;
	private Object ei_leaf;
	private Object ei_leaf_hi;
	private Object ei_unused;
	
	public ext3_extent_idx(Object ei_block, Object ei_leaf, Object ei_leaf_hi, Object ei_unused) {
		setEi_block(ei_block);
		setEi_leaf(ei_leaf);
		setEi_leaf_hi(ei_leaf_hi);
		setEi_unused(ei_unused);
	}
	public ext3_extent_idx() {
	}
	
	public Object getEi_block() {
		return ei_block;
	}
	public void setEi_block(Object newEi_block) {
		ei_block = newEi_block;
	}
	public Object getEi_leaf() {
		return ei_leaf;
	}
	public void setEi_leaf(Object newEi_leaf) {
		ei_leaf = newEi_leaf;
	}
	public Object getEi_leaf_hi() {
		return ei_leaf_hi;
	}
	public void setEi_leaf_hi(Object newEi_leaf_hi) {
		ei_leaf_hi = newEi_leaf_hi;
	}
	public Object getEi_unused() {
		return ei_unused;
	}
	public void setEi_unused(Object newEi_unused) {
		ei_unused = newEi_unused;
	}
}
