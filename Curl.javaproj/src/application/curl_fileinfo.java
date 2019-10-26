package application;

/* Information about a single file, used when doing FTP wildcard matching */
public class curl_fileinfo {
	private Byte filename;
	private  filetype;
	private Object time;
	private int perm;
	private int uid;
	private int gid;
	private Object size;
	private long hardlinks;
	private  strings;
	private int flags;
	private Byte b_data;
	private Object b_size;
	private Object b_used;
	
	public curl_fileinfo(Byte filename,  filetype, Object time, int perm, int uid, int gid, Object size, long hardlinks,  strings, int flags, Byte b_data, Object b_size, Object b_used) {
		setFilename(filename);
		setFiletype(filetype);
		setTime(time);
		setPerm(perm);
		setUid(uid);
		setGid(gid);
		setSize(size);
		setHardlinks(hardlinks);
		setStrings(strings);
		setFlags(flags);
		setB_data(b_data);
		setB_size(b_size);
		setB_used(b_used);
	}
	public curl_fileinfo() {
	}
	
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public  getFiletype() {
		return filetype;
	}
	public void setFiletype( newFiletype) {
		filetype = newFiletype;
	}
	public Object getTime() {
		return time;
	}
	public void setTime(Object newTime) {
		time = newTime;
	}
	public int getPerm() {
		return perm;
	}
	public void setPerm(int newPerm) {
		perm = newPerm;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int newUid) {
		uid = newUid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int newGid) {
		gid = newGid;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public long getHardlinks() {
		return hardlinks;
	}
	public void setHardlinks(long newHardlinks) {
		hardlinks = newHardlinks;
	}
	public  getStrings() {
		return strings;
	}
	public void setStrings( newStrings) {
		strings = newStrings;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Byte getB_data() {
		return b_data;
	}
	public void setB_data(Byte newB_data) {
		b_data = newB_data;
	}
	public Object getB_size() {
		return b_size;
	}
	public void setB_size(Object newB_size) {
		b_size = newB_size;
	}
	public Object getB_used() {
		return b_used;
	}
	public void setB_used(Object newB_used) {
		b_used = newB_used;
	}
}
