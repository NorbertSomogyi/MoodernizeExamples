package application;

public class bitmapped_commit {
	private commit commit;
	private ewah_bitmap bitmap;
	private ewah_bitmap write_as;
	private int flags;
	private int xor_offset;
	private Object commit_pos;
	
	public bitmapped_commit(commit commit, ewah_bitmap bitmap, ewah_bitmap write_as, int flags, int xor_offset, Object commit_pos) {
		setCommit(commit);
		setBitmap(bitmap);
		setWrite_as(write_as);
		setFlags(flags);
		setXor_offset(xor_offset);
		setCommit_pos(commit_pos);
	}
	public bitmapped_commit() {
	}
	
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public ewah_bitmap getBitmap() {
		return bitmap;
	}
	public void setBitmap(ewah_bitmap newBitmap) {
		bitmap = newBitmap;
	}
	public ewah_bitmap getWrite_as() {
		return write_as;
	}
	public void setWrite_as(ewah_bitmap newWrite_as) {
		write_as = newWrite_as;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getXor_offset() {
		return xor_offset;
	}
	public void setXor_offset(int newXor_offset) {
		xor_offset = newXor_offset;
	}
	public Object getCommit_pos() {
		return commit_pos;
	}
	public void setCommit_pos(Object newCommit_pos) {
		commit_pos = newCommit_pos;
	}
}
