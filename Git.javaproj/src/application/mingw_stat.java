package application;

public class mingw_stat {
	private Object st_dev;
	private Object st_ino;
	private Object st_mode;
	private int st_nlink;
	private int st_uid;
	private int st_gid;
	private Object st_rdev;
	private Object st_size;
	private timespec st_atim;
	private timespec st_mtim;
	private timespec st_ctim;
	
	public mingw_stat(Object st_dev, Object st_ino, Object st_mode, int st_nlink, int st_uid, int st_gid, Object st_rdev, Object st_size, timespec st_atim, timespec st_mtim, timespec st_ctim) {
		setSt_dev(st_dev);
		setSt_ino(st_ino);
		setSt_mode(st_mode);
		setSt_nlink(st_nlink);
		setSt_uid(st_uid);
		setSt_gid(st_gid);
		setSt_rdev(st_rdev);
		setSt_size(st_size);
		setSt_atim(st_atim);
		setSt_mtim(st_mtim);
		setSt_ctim(st_ctim);
	}
	public mingw_stat() {
	}
	
	public Object getSt_dev() {
		return st_dev;
	}
	public void setSt_dev(Object newSt_dev) {
		st_dev = newSt_dev;
	}
	public Object getSt_ino() {
		return st_ino;
	}
	public void setSt_ino(Object newSt_ino) {
		st_ino = newSt_ino;
	}
	public Object getSt_mode() {
		return st_mode;
	}
	public void setSt_mode(Object newSt_mode) {
		st_mode = newSt_mode;
	}
	public int getSt_nlink() {
		return st_nlink;
	}
	public void setSt_nlink(int newSt_nlink) {
		st_nlink = newSt_nlink;
	}
	public int getSt_uid() {
		return st_uid;
	}
	public void setSt_uid(int newSt_uid) {
		st_uid = newSt_uid;
	}
	public int getSt_gid() {
		return st_gid;
	}
	public void setSt_gid(int newSt_gid) {
		st_gid = newSt_gid;
	}
	public Object getSt_rdev() {
		return st_rdev;
	}
	public void setSt_rdev(Object newSt_rdev) {
		st_rdev = newSt_rdev;
	}
	public Object getSt_size() {
		return st_size;
	}
	public void setSt_size(Object newSt_size) {
		st_size = newSt_size;
	}
	public timespec getSt_atim() {
		return st_atim;
	}
	public void setSt_atim(timespec newSt_atim) {
		st_atim = newSt_atim;
	}
	public timespec getSt_mtim() {
		return st_mtim;
	}
	public void setSt_mtim(timespec newSt_mtim) {
		st_mtim = newSt_mtim;
	}
	public timespec getSt_ctim() {
		return st_ctim;
	}
	public void setSt_ctim(timespec newSt_ctim) {
		st_ctim = newSt_ctim;
	}
}
