package application;

public class ext2_inode_cache_ent {
	private Object ino;
	private ext2_inode inode;
	
	public ext2_inode_cache_ent(Object ino, ext2_inode inode) {
		setIno(ino);
		setInode(inode);
	}
	public ext2_inode_cache_ent() {
	}
	
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public ext2_inode getInode() {
		return inode;
	}
	public void setInode(ext2_inode newInode) {
		inode = newInode;
	}
}
