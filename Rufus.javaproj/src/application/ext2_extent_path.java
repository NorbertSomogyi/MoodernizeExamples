package application;

public class ext2_extent_path {
	private Object magic;
	private int leaf_height;
	private Object lblk;
	
	public ext2_extent_path(Object magic, int leaf_height, Object lblk) {
		setMagic(magic);
		setLeaf_height(leaf_height);
		setLblk(lblk);
	}
	public ext2_extent_path() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public int getLeaf_height() {
		return leaf_height;
	}
	public void setLeaf_height(int newLeaf_height) {
		leaf_height = newLeaf_height;
	}
	public Object getLblk() {
		return lblk;
	}
	public void setLblk(Object newLblk) {
		lblk = newLblk;
	}
}
