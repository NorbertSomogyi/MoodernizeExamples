package application;

public class file_header_t {
	private Byte name;
	private Byte link_target;
	private Object size;
	private Object uid;
	private Object gid;
	private Object mode;
	private Object mtime;
	private Object device;
	
	public file_header_t(Byte name, Byte link_target, Object size, Object uid, Object gid, Object mode, Object mtime, Object device) {
		setName(name);
		setLink_target(link_target);
		setSize(size);
		setUid(uid);
		setGid(gid);
		setMode(mode);
		setMtime(mtime);
		setDevice(device);
	}
	public file_header_t() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getLink_target() {
		return link_target;
	}
	public void setLink_target(Byte newLink_target) {
		link_target = newLink_target;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
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
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
}
