package application;

public class ondisk_cache_entry {
	private cache_time ctime;
	private cache_time mtime;
	private Object dev;
	private Object ino;
	private Object mode;
	private Object uid;
	private Object gid;
	private Object size;
	private Object data;
	private Object name;
	
	public ondisk_cache_entry(cache_time ctime, cache_time mtime, Object dev, Object ino, Object mode, Object uid, Object gid, Object size, Object data, Object name) {
		setCtime(ctime);
		setMtime(mtime);
		setDev(dev);
		setIno(ino);
		setMode(mode);
		setUid(uid);
		setGid(gid);
		setSize(size);
		setData(data);
		setName(name);
	}
	public ondisk_cache_entry() {
	}
	
	public cache_time getCtime() {
		return ctime;
	}
	public void setCtime(cache_time newCtime) {
		ctime = newCtime;
	}
	public cache_time getMtime() {
		return mtime;
	}
	public void setMtime(cache_time newMtime) {
		mtime = newMtime;
	}
	public Object getDev() {
		return dev;
	}
	public void setDev(Object newDev) {
		dev = newDev;
	}
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public Object getUid() {
		return uid;
	}
	public void setUid(Object newUid) {
		uid = newUid;
	}
	public Object getGid() {
		return gid;
	}
	public void setGid(Object newGid) {
		gid = newGid;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
