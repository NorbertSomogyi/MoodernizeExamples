package application;

public class ext2_extent_handle {
	private Object magic;
	private Object fs;
	private Object ino;
	private ext2_inode inode;
	private ext2_inode inodebuf;
	private int type;
	private int level;
	private int max_depth;
	private int max_paths;
	private extent_path[] path;
	
	public ext2_extent_handle(Object magic, Object fs, Object ino, ext2_inode inode, ext2_inode inodebuf, int type, int level, int max_depth, int max_paths, extent_path[] path) {
		setMagic(magic);
		setFs(fs);
		setIno(ino);
		setInode(inode);
		setInodebuf(inodebuf);
		setType(type);
		setLevel(level);
		setMax_depth(max_depth);
		setMax_paths(max_paths);
		setPath(path);
	}
	public ext2_extent_handle() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
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
	public ext2_inode getInodebuf() {
		return inodebuf;
	}
	public void setInodebuf(ext2_inode newInodebuf) {
		inodebuf = newInodebuf;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public int getMax_depth() {
		return max_depth;
	}
	public void setMax_depth(int newMax_depth) {
		max_depth = newMax_depth;
	}
	public int getMax_paths() {
		return max_paths;
	}
	public void setMax_paths(int newMax_paths) {
		max_paths = newMax_paths;
	}
	public extent_path[] getPath() {
		return path;
	}
	public void setPath(extent_path[] newPath) {
		path = newPath;
	}
}
