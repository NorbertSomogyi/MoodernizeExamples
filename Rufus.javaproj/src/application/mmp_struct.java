package application;

/*
 * Constants for ext4's extended time encoding
 */
/*
 * This structure is used for multiple mount protection. It is written
 * into the block number saved in the s_mmp_block field in the superblock.
 * Programs that check MMP should assume that if SEQ_FSCK (or any unknown
 * code above SEQ_MAX) is present then it is NOT safe to use the filesystem,
 * regardless of how old the timestamp is.
 *
 * The timestamp in the MMP structure will be updated by e2fsck at some
 * arbitrary intervals (start of passes, after every few groups of inodes
 * in pass1 and pass1b).  There is no guarantee that e2fsck is updating
 * the MMP block in a timely manner, and the updates it does are purely
 * for the convenience of the sysadmin and not for automatic validation.
 *
 * Note: Only the mmp_seq value is used to determine whether the MMP block
 *	is being updated.  The mmp_time, mmp_nodename, and mmp_bdevname
 *	fields are only for informational purposes for the administrator,
 *	due to clock skew between nodes and hostname HA service takeover.
 */
/* ASCII for MMP */
/* mmp_seq value for clean unmount */
/* mmp_seq value when being fscked */
/* maximum valid mmp_seq value */
/* Not endian-annotated; it's swapped at read/write time */
public class mmp_struct {
	private Object mmp_magic;
	private Object mmp_seq;
	private Object mmp_time;
	private Object mmp_nodename;
	private Object mmp_bdevname;
	private Object mmp_check_interval;
	private Object mmp_pad1;
	private Object mmp_pad2;
	private Object mmp_checksum;
	
	public mmp_struct(Object mmp_magic, Object mmp_seq, Object mmp_time, Object mmp_nodename, Object mmp_bdevname, Object mmp_check_interval, Object mmp_pad1, Object mmp_pad2, Object mmp_checksum) {
		setMmp_magic(mmp_magic);
		setMmp_seq(mmp_seq);
		setMmp_time(mmp_time);
		setMmp_nodename(mmp_nodename);
		setMmp_bdevname(mmp_bdevname);
		setMmp_check_interval(mmp_check_interval);
		setMmp_pad1(mmp_pad1);
		setMmp_pad2(mmp_pad2);
		setMmp_checksum(mmp_checksum);
	}
	public mmp_struct() {
	}
	
	public Object ext2fs_mmp_csum(Object fs) {
		int offset = ((size_t)((mmp_struct)0).getMmp_checksum());
		return ModernizedCProgram.ext2fs_crc32c_le(fs.getCsum_seed(), (byte)mmp, offset);
	}
	public int ext2fs_mmp_csum_verify(Object fs) {
		 calculated = new ();
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 1;
		} 
		calculated = mmp.ext2fs_mmp_csum(fs);
		Object generatedMmp_checksum = this.getMmp_checksum();
		return .ext2fs_le32_to_cpu(generatedMmp_checksum) == calculated;
	}
	public Object ext2fs_mmp_csum_set(Object fs) {
		 crc = new ();
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 0;
		} 
		crc = mmp.ext2fs_mmp_csum(fs);
		this.setMmp_checksum(.ext2fs_cpu_to_le32(crc));
		return 0;
	}
	public Object getMmp_magic() {
		return mmp_magic;
	}
	public void setMmp_magic(Object newMmp_magic) {
		mmp_magic = newMmp_magic;
	}
	public Object getMmp_seq() {
		return mmp_seq;
	}
	public void setMmp_seq(Object newMmp_seq) {
		mmp_seq = newMmp_seq;
	}
	public Object getMmp_time() {
		return mmp_time;
	}
	public void setMmp_time(Object newMmp_time) {
		mmp_time = newMmp_time;
	}
	public Object getMmp_nodename() {
		return mmp_nodename;
	}
	public void setMmp_nodename(Object newMmp_nodename) {
		mmp_nodename = newMmp_nodename;
	}
	public Object getMmp_bdevname() {
		return mmp_bdevname;
	}
	public void setMmp_bdevname(Object newMmp_bdevname) {
		mmp_bdevname = newMmp_bdevname;
	}
	public Object getMmp_check_interval() {
		return mmp_check_interval;
	}
	public void setMmp_check_interval(Object newMmp_check_interval) {
		mmp_check_interval = newMmp_check_interval;
	}
	public Object getMmp_pad1() {
		return mmp_pad1;
	}
	public void setMmp_pad1(Object newMmp_pad1) {
		mmp_pad1 = newMmp_pad1;
	}
	public Object getMmp_pad2() {
		return mmp_pad2;
	}
	public void setMmp_pad2(Object newMmp_pad2) {
		mmp_pad2 = newMmp_pad2;
	}
	public Object getMmp_checksum() {
		return mmp_checksum;
	}
	public void setMmp_checksum(Object newMmp_checksum) {
		mmp_checksum = newMmp_checksum;
	}
}
