package application;

// Heck if we're gonna use WinSock just for htonl and friends
public class journal_s {
	private long j_flags;
	private int j_errno;
	private buffer_head j_sb_buffer;
	private journal_superblock_s j_superblock;
	private int j_format_version;
	private long j_head;
	private long j_tail;
	private long j_free;
	private long j_first;
	private long j_last;
	private Object j_dev;
	private Object j_fs_dev;
	private int j_blocksize;
	private int j_blk_offset;
	private int j_maxlen;
	private inode j_inode;
	private Object j_tail_sequence;
	private Object j_transaction_sequence;
	private Object j_uuid;
	private jbd2_revoke_table_s j_revoke;
	private Object j_revoke_table;
	private Object j_failed_commit;
	private Object j_csum_seed;
	
	public journal_s(long j_flags, int j_errno, buffer_head j_sb_buffer, journal_superblock_s j_superblock, int j_format_version, long j_head, long j_tail, long j_free, long j_first, long j_last, Object j_dev, Object j_fs_dev, int j_blocksize, int j_blk_offset, int j_maxlen, inode j_inode, Object j_tail_sequence, Object j_transaction_sequence, Object j_uuid, jbd2_revoke_table_s j_revoke, Object j_revoke_table, Object j_failed_commit, Object j_csum_seed) {
		setJ_flags(j_flags);
		setJ_errno(j_errno);
		setJ_sb_buffer(j_sb_buffer);
		setJ_superblock(j_superblock);
		setJ_format_version(j_format_version);
		setJ_head(j_head);
		setJ_tail(j_tail);
		setJ_free(j_free);
		setJ_first(j_first);
		setJ_last(j_last);
		setJ_dev(j_dev);
		setJ_fs_dev(j_fs_dev);
		setJ_blocksize(j_blocksize);
		setJ_blk_offset(j_blk_offset);
		setJ_maxlen(j_maxlen);
		setJ_inode(j_inode);
		setJ_tail_sequence(j_tail_sequence);
		setJ_transaction_sequence(j_transaction_sequence);
		setJ_uuid(j_uuid);
		setJ_revoke(j_revoke);
		setJ_revoke_table(j_revoke_table);
		setJ_failed_commit(j_failed_commit);
		setJ_csum_seed(j_csum_seed);
	}
	public journal_s() {
	}
	
	public int jfs_has_feature_checksum() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_compat = generatedJ_superblock.getS_feature_compat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_compat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_checksum() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_compat = generatedJ_superblock.getS_feature_compat();
		generatedS_feature_compat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_checksum() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_compat = generatedJ_superblock.getS_feature_compat();
		generatedS_feature_compat &=  ~.ext2fs_cpu_to_be32(/* (defined(E2FSCK_INCLUDE_INLINE_FUNCS) || !defined(NO_INLINE_FUNCS)) */-1024);
	}
	public int jfs_has_feature_revoke() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_incompat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_revoke() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_revoke() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat &=  ~.ext2fs_cpu_to_be32(-1024);
	}
	public int jfs_has_feature_64bit() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_incompat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_64bit() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_64bit() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat &=  ~.ext2fs_cpu_to_be32(-1024);
	}
	public int jfs_has_feature_async_commit() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_incompat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_async_commit() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_async_commit() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat &=  ~.ext2fs_cpu_to_be32(-1024);
	}
	public int jfs_has_feature_csum2() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_incompat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_csum2() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_csum2() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat &=  ~.ext2fs_cpu_to_be32(-1024);
	}
	public int jfs_has_feature_csum3() {
		int generatedJ_format_version = (j).getJ_format_version();
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		return (generatedJ_format_version >= 2 && (generatedS_feature_incompat & .ext2fs_cpu_to_be32(-1024)) != 0);
	}
	public void jfs_set_feature_csum3() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat |=  .ext2fs_cpu_to_be32(-1024);
	}
	public void jfs_clear_feature_csum3() {
		journal_superblock_s generatedJ_superblock = (j).getJ_superblock();
		Object generatedS_feature_incompat = generatedJ_superblock.getS_feature_incompat();
		generatedS_feature_incompat &=  ~.ext2fs_cpu_to_be32(-1024/*
		 * helper functions to deal with 32 or 64bit block numbers.
		 */);
	}
	public Object journal_tag_bytes() {
		 sz = new ();
		if (journal.jfs_has_feature_csum3()) {
			return ;
		} 
		sz = ;
		if (journal.jfs_has_feature_csum2()) {
			sz += ;
		} 
		if (journal.jfs_has_feature_64bit()) {
			return sz;
		} 
		return sz - ;
	}
	public int journal_has_csum_v2or3() {
		if (journal.jfs_has_feature_csum2() || journal.jfs_has_feature_csum3()) {
			return 1;
		} 
		return 0/* Comparison functions for transaction IDs: perform comparisons using
		 * modulo arithmetic so that they work over sequence number wraps. */;
	}
	public long getJ_flags() {
		return j_flags;
	}
	public void setJ_flags(long newJ_flags) {
		j_flags = newJ_flags;
	}
	public int getJ_errno() {
		return j_errno;
	}
	public void setJ_errno(int newJ_errno) {
		j_errno = newJ_errno;
	}
	public buffer_head getJ_sb_buffer() {
		return j_sb_buffer;
	}
	public void setJ_sb_buffer(buffer_head newJ_sb_buffer) {
		j_sb_buffer = newJ_sb_buffer;
	}
	public journal_superblock_s getJ_superblock() {
		return j_superblock;
	}
	public void setJ_superblock(journal_superblock_s newJ_superblock) {
		j_superblock = newJ_superblock;
	}
	public int getJ_format_version() {
		return j_format_version;
	}
	public void setJ_format_version(int newJ_format_version) {
		j_format_version = newJ_format_version;
	}
	public long getJ_head() {
		return j_head;
	}
	public void setJ_head(long newJ_head) {
		j_head = newJ_head;
	}
	public long getJ_tail() {
		return j_tail;
	}
	public void setJ_tail(long newJ_tail) {
		j_tail = newJ_tail;
	}
	public long getJ_free() {
		return j_free;
	}
	public void setJ_free(long newJ_free) {
		j_free = newJ_free;
	}
	public long getJ_first() {
		return j_first;
	}
	public void setJ_first(long newJ_first) {
		j_first = newJ_first;
	}
	public long getJ_last() {
		return j_last;
	}
	public void setJ_last(long newJ_last) {
		j_last = newJ_last;
	}
	public Object getJ_dev() {
		return j_dev;
	}
	public void setJ_dev(Object newJ_dev) {
		j_dev = newJ_dev;
	}
	public Object getJ_fs_dev() {
		return j_fs_dev;
	}
	public void setJ_fs_dev(Object newJ_fs_dev) {
		j_fs_dev = newJ_fs_dev;
	}
	public int getJ_blocksize() {
		return j_blocksize;
	}
	public void setJ_blocksize(int newJ_blocksize) {
		j_blocksize = newJ_blocksize;
	}
	public int getJ_blk_offset() {
		return j_blk_offset;
	}
	public void setJ_blk_offset(int newJ_blk_offset) {
		j_blk_offset = newJ_blk_offset;
	}
	public int getJ_maxlen() {
		return j_maxlen;
	}
	public void setJ_maxlen(int newJ_maxlen) {
		j_maxlen = newJ_maxlen;
	}
	public inode getJ_inode() {
		return j_inode;
	}
	public void setJ_inode(inode newJ_inode) {
		j_inode = newJ_inode;
	}
	public Object getJ_tail_sequence() {
		return j_tail_sequence;
	}
	public void setJ_tail_sequence(Object newJ_tail_sequence) {
		j_tail_sequence = newJ_tail_sequence;
	}
	public Object getJ_transaction_sequence() {
		return j_transaction_sequence;
	}
	public void setJ_transaction_sequence(Object newJ_transaction_sequence) {
		j_transaction_sequence = newJ_transaction_sequence;
	}
	public Object getJ_uuid() {
		return j_uuid;
	}
	public void setJ_uuid(Object newJ_uuid) {
		j_uuid = newJ_uuid;
	}
	public jbd2_revoke_table_s getJ_revoke() {
		return j_revoke;
	}
	public void setJ_revoke(jbd2_revoke_table_s newJ_revoke) {
		j_revoke = newJ_revoke;
	}
	public Object getJ_revoke_table() {
		return j_revoke_table;
	}
	public void setJ_revoke_table(Object newJ_revoke_table) {
		j_revoke_table = newJ_revoke_table;
	}
	public Object getJ_failed_commit() {
		return j_failed_commit;
	}
	public void setJ_failed_commit(Object newJ_failed_commit) {
		j_failed_commit = newJ_failed_commit;
	}
	public Object getJ_csum_seed() {
		return j_csum_seed;
	}
	public void setJ_csum_seed(Object newJ_csum_seed) {
		j_csum_seed = newJ_csum_seed;
	}
}
