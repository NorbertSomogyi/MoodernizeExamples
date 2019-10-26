package application;

/*
 * untgz.c -- Display contents and extract files from a gzip'd TAR file
 *
 * written by Pedro A. Aranda Gutierrez <paag@tid.es>
 * adaptation to Unix by Jean-loup Gailly <jloup@gzip.org>
 * various fixes by Cosmin Truta <cosmint@cs.ubbcluj.ro>
 */
/* values used in typeflag field */
/* regular file */
/* regular file */
/* link */
/* reserved */
/* character special */
/* block special */
/* directory */
/* FIFO special */
/* reserved */
/* GNU tar extensions */
/* file names from dumped directory */
/* long link name */
/* long file name */
/* continuation of file from another volume */
/* file name that does not fit into main hdr */
/* sparse file */
/* tape/volume header */
/* tar header */
public class tar_header {
	private Object name;
	private Object mode;
	private Object uid;
	private Object gid;
	private Object size;
	private Object mtime;
	private Object chksum;
	private byte typeflag;
	private Object linkname;
	private Object magic;
	private Object version;
	private Object uname;
	private Object gname;
	private Object devmajor;
	private Object devminor;
	private Object prefix;
	
	public tar_header(Object name, Object mode, Object uid, Object gid, Object size, Object mtime, Object chksum, byte typeflag, Object linkname, Object magic, Object version, Object uname, Object gname, Object devmajor, Object devminor, Object prefix) {
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
		setVersion(version);
		setUname(uname);
		setGname(gname);
		setDevmajor(devmajor);
		setDevminor(devminor);
		setPrefix(prefix);
	}
	public tar_header() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
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
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object getChksum() {
		return chksum;
	}
	public void setChksum(Object newChksum) {
		chksum = newChksum;
	}
	public byte getTypeflag() {
		return typeflag;
	}
	public void setTypeflag(byte newTypeflag) {
		typeflag = newTypeflag;
	}
	public Object getLinkname() {
		return linkname;
	}
	public void setLinkname(Object newLinkname) {
		linkname = newLinkname;
	}
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getUname() {
		return uname;
	}
	public void setUname(Object newUname) {
		uname = newUname;
	}
	public Object getGname() {
		return gname;
	}
	public void setGname(Object newGname) {
		gname = newGname;
	}
	public Object getDevmajor() {
		return devmajor;
	}
	public void setDevmajor(Object newDevmajor) {
		devmajor = newDevmajor;
	}
	public Object getDevminor() {
		return devminor;
	}
	public void setDevminor(Object newDevminor) {
		devminor = newDevminor;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
}
