package application;

/* Contains the handle to a sub archive */
/* bits in ah_flags */
/* POSIX tar Header Block, from POSIX 1003.1-1990  */
/* byte offset */
public class tar_header_t {
	private Object[] name;
	private Object[] mode;
	private Object[] uid;
	private Object[] gid;
	private Object[] size;
	private Object[] mtime;
	private Object[] chksum;
	private byte typeflag;
	private Object[] linkname;
	private Object[] magic;
	private Object[] uname;
	private Object[] gname;
	private Object[] devmajor;
	private Object[] devminor;
	private Object[] prefix;
	private Object[] padding;
	
	public tar_header_t(Object[] name, Object[] mode, Object[] uid, Object[] gid, Object[] size, Object[] mtime, Object[] chksum, byte typeflag, Object[] linkname, Object[] magic, Object[] uname, Object[] gname, Object[] devmajor, Object[] devminor, Object[] prefix, Object[] padding) {
		setName(name);
		setMode(mode);
		setUid(uid);
		setGid(gid);
		setSize(size);
		setMtime(mtime);
		setChksum(chksum);
		setTypeflag(typeflag);
		setLinkname(linkname);
		setMagic(magic);
		setUname(uname);
		setGname(gname);
		setDevmajor(devmajor);
		setDevminor(devminor);
		setPrefix(prefix);
		setPadding(padding);
	}
	public tar_header_t() {
	}
	
	public Object[] getName() {
		return name;
	}
	public void setName(Object[] newName) {
		name = newName;
	}
	public Object[] getMode() {
		return mode;
	}
	public void setMode(Object[] newMode) {
		mode = newMode;
	}
	public Object[] getUid() {
		return uid;
	}
	public void setUid(Object[] newUid) {
		uid = newUid;
	}
	public Object[] getGid() {
		return gid;
	}
	public void setGid(Object[] newGid) {
		gid = newGid;
	}
	public Object[] getSize() {
		return size;
	}
	public void setSize(Object[] newSize) {
		size = newSize;
	}
	public Object[] getMtime() {
		return mtime;
	}
	public void setMtime(Object[] newMtime) {
		mtime = newMtime;
	}
	public Object[] getChksum() {
		return chksum;
	}
	public void setChksum(Object[] newChksum) {
		chksum = newChksum;
	}
	public byte getTypeflag() {
		return typeflag;
	}
	public void setTypeflag(byte newTypeflag) {
		typeflag = newTypeflag;
	}
	public Object[] getLinkname() {
		return linkname;
	}
	public void setLinkname(Object[] newLinkname) {
		linkname = newLinkname;
	}
	public Object[] getMagic() {
		return magic;
	}
	public void setMagic(Object[] newMagic) {
		magic = newMagic;
	}
	public Object[] getUname() {
		return uname;
	}
	public void setUname(Object[] newUname) {
		uname = newUname;
	}
	public Object[] getGname() {
		return gname;
	}
	public void setGname(Object[] newGname) {
		gname = newGname;
	}
	public Object[] getDevmajor() {
		return devmajor;
	}
	public void setDevmajor(Object[] newDevmajor) {
		devmajor = newDevmajor;
	}
	public Object[] getDevminor() {
		return devminor;
	}
	public void setDevminor(Object[] newDevminor) {
		devminor = newDevminor;
	}
	public Object[] getPrefix() {
		return prefix;
	}
	public void setPrefix(Object[] newPrefix) {
		prefix = newPrefix;
	}
	public Object[] getPadding() {
		return padding;
	}
	public void setPadding(Object[] newPadding) {
		padding = newPadding;
	}
}
