package application;

/**< signature word; either 'SP', 'CE', 'ER', 'RR',
                          'PX', 'PN', 'SL', 'NM', 'CL', 'PL', 'TF', or 
                          'ZF' */
/**< length of system-user area - 44 for PX
                          20 for PN, 5+strlen(text) for SL, 21 for 
                          SF, etc. */
/**< version number - value 1 */
/**< system-use-sharing protocol - not
                          strictly part of Rock Ridge */
/**< system-use extension packet - not
                           strictly part of Rock Ridge */
/**< system-use -  strictly part of Rock Ridge */
/**< Rock Ridge POSIX file attributes */
/**< Rock Ridge POSIX device number */
/**< Rock Ridge symbolic link */
/**< Rock Ridge alternate name */
/**< Rock Ridge child link */
/**< Rock Ridge parent link */
/**< Rock Ridge timestamp(s) for a file */
/**< If true, field has been set and  is valid. 
                               Otherwise remaning fields are meaningless. */
/**< If true date format is a iso9660_ltime_t. 
                               Otherwise date is iso9660_dtime_t */
public class iso_rock_statbuf_s {
	private Object b3_rock;
	private Object st_mode;
	private Object st_nlinks;
	private Object st_uid;
	private Object st_gid;
	private Object s_rock_offset;
	private int i_symlink;
	private int i_symlink_max;
	private Byte psz_symlink;
	private Object create;
	private Object modify;
	private Object access;
	private Object attributes;
	private Object backup;
	private Object expiration;
	private Object effective;
	private Object i_rdev;
	
	public iso_rock_statbuf_s(Object b3_rock, Object st_mode, Object st_nlinks, Object st_uid, Object st_gid, Object s_rock_offset, int i_symlink, int i_symlink_max, Byte psz_symlink, Object create, Object modify, Object access, Object attributes, Object backup, Object expiration, Object effective, Object i_rdev) {
		setB3_rock(b3_rock);
		setSt_mode(st_mode);
		setSt_nlinks(st_nlinks);
		setSt_uid(st_uid);
		setSt_gid(st_gid);
		setS_rock_offset(s_rock_offset);
		setI_symlink(i_symlink);
		setI_symlink_max(i_symlink_max);
		setPsz_symlink(psz_symlink);
		setCreate(create);
		setModify(modify);
		setAccess(access);
		setAttributes(attributes);
		setBackup(backup);
		setExpiration(expiration);
		setEffective(effective);
		setI_rdev(i_rdev);
	}
	public iso_rock_statbuf_s() {
	}
	
	public Object getB3_rock() {
		return b3_rock;
	}
	public void setB3_rock(Object newB3_rock) {
		b3_rock = newB3_rock;
	}
	public Object getSt_mode() {
		return st_mode;
	}
	public void setSt_mode(Object newSt_mode) {
		st_mode = newSt_mode;
	}
	public Object getSt_nlinks() {
		return st_nlinks;
	}
	public void setSt_nlinks(Object newSt_nlinks) {
		st_nlinks = newSt_nlinks;
	}
	public Object getSt_uid() {
		return st_uid;
	}
	public void setSt_uid(Object newSt_uid) {
		st_uid = newSt_uid;
	}
	public Object getSt_gid() {
		return st_gid;
	}
	public void setSt_gid(Object newSt_gid) {
		st_gid = newSt_gid;
	}
	public Object getS_rock_offset() {
		return s_rock_offset;
	}
	public void setS_rock_offset(Object newS_rock_offset) {
		s_rock_offset = newS_rock_offset;
	}
	public int getI_symlink() {
		return i_symlink;
	}
	public void setI_symlink(int newI_symlink) {
		i_symlink = newI_symlink;
	}
	public int getI_symlink_max() {
		return i_symlink_max;
	}
	public void setI_symlink_max(int newI_symlink_max) {
		i_symlink_max = newI_symlink_max;
	}
	public Byte getPsz_symlink() {
		return psz_symlink;
	}
	public void setPsz_symlink(Byte newPsz_symlink) {
		psz_symlink = newPsz_symlink;
	}
	public Object getCreate() {
		return create;
	}
	public void setCreate(Object newCreate) {
		create = newCreate;
	}
	public Object getModify() {
		return modify;
	}
	public void setModify(Object newModify) {
		modify = newModify;
	}
	public Object getAccess() {
		return access;
	}
	public void setAccess(Object newAccess) {
		access = newAccess;
	}
	public Object getAttributes() {
		return attributes;
	}
	public void setAttributes(Object newAttributes) {
		attributes = newAttributes;
	}
	public Object getBackup() {
		return backup;
	}
	public void setBackup(Object newBackup) {
		backup = newBackup;
	}
	public Object getExpiration() {
		return expiration;
	}
	public void setExpiration(Object newExpiration) {
		expiration = newExpiration;
	}
	public Object getEffective() {
		return effective;
	}
	public void setEffective(Object newEffective) {
		effective = newEffective;
	}
	public Object getI_rdev() {
		return i_rdev;
	}
	public void setI_rdev(Object newI_rdev) {
		i_rdev = newI_rdev;
	}
}
