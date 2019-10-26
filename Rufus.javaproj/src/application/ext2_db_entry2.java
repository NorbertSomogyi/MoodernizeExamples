package application;

/*
 * ext2_dblist structure and abstractions (see dblist.c)
 */
public class ext2_db_entry2 {
	private Object ino;
	private Object blk;
	private Object blockcnt;
	
	public ext2_db_entry2(Object ino, Object blk, Object blockcnt) {
		setIno(ino);
		setBlk(blk);
		setBlockcnt(blockcnt);
	}
	public ext2_db_entry2() {
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
	public Object getBlockcnt() {
		return blockcnt;
	}
	public void setBlockcnt(Object newBlockcnt) {
		blockcnt = newBlockcnt;
	}
}
