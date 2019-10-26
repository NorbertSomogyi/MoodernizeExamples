package application;

/*
 * Data structures used by the directory indexing feature
 *
 * Note: all of the multibyte integer fields are little endian.
 */
/*
 * Note: dx_root_info is laid out so that if it should somehow get
 * overlaid by a dirent the two low bits of the hash version will be
 * zero.  Therefore, the hash version mod 4 should never be 0.
 * Sincerely, the paranoia department.
 */
public class ext2_dx_root_info {
	private Object reserved_zero;
	private Object hash_version;
	private Object info_length;
	private Object indirect_levels;
	private Object unused_flags;
	
	public ext2_dx_root_info(Object reserved_zero, Object hash_version, Object info_length, Object indirect_levels, Object unused_flags) {
		setReserved_zero(reserved_zero);
		setHash_version(hash_version);
		setInfo_length(info_length);
		setIndirect_levels(indirect_levels);
		setUnused_flags(unused_flags);
	}
	public ext2_dx_root_info() {
	}
	
	public Object getReserved_zero() {
		return reserved_zero;
	}
	public void setReserved_zero(Object newReserved_zero) {
		reserved_zero = newReserved_zero;
	}
	public Object getHash_version() {
		return hash_version;
	}
	public void setHash_version(Object newHash_version) {
		hash_version = newHash_version;
	}
	public Object getInfo_length() {
		return info_length;
	}
	public void setInfo_length(Object newInfo_length) {
		info_length = newInfo_length;
	}
	public Object getIndirect_levels() {
		return indirect_levels;
	}
	public void setIndirect_levels(Object newIndirect_levels) {
		indirect_levels = newIndirect_levels;
	}
	public Object getUnused_flags() {
		return unused_flags;
	}
	public void setUnused_flags(Object newUnused_flags) {
		unused_flags = newUnused_flags;
	}
}
