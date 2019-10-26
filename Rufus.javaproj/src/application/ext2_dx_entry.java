package application;

/* reserved for userspace lib */
public class ext2_dx_entry {
	private Object hash;
	private Object block;
	
	public ext2_dx_entry(Object hash, Object block) {
		setHash(hash);
		setBlock(block);
	}
	public ext2_dx_entry() {
	}
	
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getBlock() {
		return block;
	}
	public void setBlock(Object newBlock) {
		block = newBlock;
	}
}
