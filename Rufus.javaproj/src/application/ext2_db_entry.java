package application;

/* Ye Olde 32-bit version */
public class ext2_db_entry {
	private Object ino;
	private Object blk;
	private int blockcnt;
	
	public ext2_db_entry(Object ino, Object blk, int blockcnt) {
		setIno(ino);
		setBlk(blk);
		setBlockcnt(blockcnt);
	}
	public ext2_db_entry() {
	}
	
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public Object getBlk() {
		return blk;
	}
	public void setBlk(Object newBlk) {
		blk = newBlk;
	}
	public int getBlockcnt() {
		return blockcnt;
	}
	public void setBlockcnt(int newBlockcnt) {
		blockcnt = newBlockcnt;
	}
}
