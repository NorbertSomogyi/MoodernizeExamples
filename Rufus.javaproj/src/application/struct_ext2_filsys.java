package application;

/*
 * ext2fs.h --- ext2fs
 *
 * Copyright (C) 1993, 1994, 1995, 1996 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
/*
 * Non-GNU C compilers won't necessarily understand inline
 */
/*
 * Where the master copy of the superblock is located, and how big
 * superblocks are supposed to be.  We define SUPERBLOCK_SIZE because
 * the size of the superblock structure is not necessarily trustworthy
 * (some versions have the padding set up so that the superblock is
 * 1032 bytes long).
 */
/*
 * The last ext2fs revision level that this version of the library is
 * able to support.
 */
/* EXT2_FLAT_INCLUDES */
public class struct_ext2_filsys {
	private Object magic;
	private Object io;
	private int flags;
	private Byte device_name;
	private ext2_super_block super;
	private int blocksize;
	private int fragsize;
	private Object group_desc_count;
	private long desc_blocks;
	private opaque_ext2_group_desc group_desc;
	private int inode_blocks_per_group;
	private Object inode_map;
	private Object block_map;
	private Object get_blocks;
	private Object check_directory;
	private Object write_bitmaps;
	private Object read_inode;
	private Object write_inode;
	private Object badblocks;
	private Object dblist;
	private Object stride;
	private ext2_super_block orig_super;
	private ext2_image_hdr image_header;
	private Object umask;
	private Object now;
	private int cluster_ratio_bits;
	private Object default_bitmap_type;
	private Object pad;
	private Object[] reserved;
	private Object priv_data;
	private ext2_inode_cache icache;
	private Object image_io;
	private Object get_alloc_block;
	private Object get_alloc_block2;
	private Object block_alloc_stats;
	private Object mmp_buf;
	private Object mmp_cmp;
	private int mmp_fd;
	private long mmp_last_written;
	private ext2fs_progress_ops progress_ops;
	private Object csum_seed;
	private Object journal_io;
	private Byte journal_name;
	private Object new_range;
	private Object block_alloc_stats_range;
	private ext2fs_hashmap block_sha_map;
	private Object encoding;
	
	public struct_ext2_filsys(Object magic, Object io, int flags, Byte device_name, ext2_super_block super, int blocksize, int fragsize, Object group_desc_count, long desc_blocks, opaque_ext2_group_desc group_desc, int inode_blocks_per_group, Object inode_map, Object block_map, Object get_blocks, Object check_directory, Object write_bitmaps, Object read_inode, Object write_inode, Object badblocks, Object dblist, Object stride, ext2_super_block orig_super, ext2_image_hdr image_header, Object umask, Object now, int cluster_ratio_bits, Object default_bitmap_type, Object pad, Object[] reserved, Object priv_data, ext2_inode_cache icache, Object image_io, Object get_alloc_block, Object get_alloc_block2, Object block_alloc_stats, Object mmp_buf, Object mmp_cmp, int mmp_fd, long mmp_last_written, ext2fs_progress_ops progress_ops, Object csum_seed, Object journal_io, Byte journal_name, Object new_range, Object block_alloc_stats_range, ext2fs_hashmap block_sha_map, Object encoding) {
		setMagic(magic);
		setIo(io);
		setFlags(flags);
		setDevice_name(device_name);
		setSuper(super);
		setBlocksize(blocksize);
		setFragsize(fragsize);
		setGroup_desc_count(group_desc_count);
		setDesc_blocks(desc_blocks);
		setGroup_desc(group_desc);
		setInode_blocks_per_group(inode_blocks_per_group);
		setInode_map(inode_map);
		setBlock_map(block_map);
		setGet_blocks(get_blocks);
		setCheck_directory(check_directory);
		setWrite_bitmaps(write_bitmaps);
		setRead_inode(read_inode);
		setWrite_inode(write_inode);
		setBadblocks(badblocks);
		setDblist(dblist);
		setStride(stride);
		setOrig_super(orig_super);
		setImage_header(image_header);
		setUmask(umask);
		setNow(now);
		setCluster_ratio_bits(cluster_ratio_bits);
		setDefault_bitmap_type(default_bitmap_type);
		setPad(pad);
		setReserved(reserved);
		setPriv_data(priv_data);
		setIcache(icache);
		setImage_io(image_io);
		setGet_alloc_block(get_alloc_block);
		setGet_alloc_block2(get_alloc_block2);
		setBlock_alloc_stats(block_alloc_stats);
		setMmp_buf(mmp_buf);
		setMmp_cmp(mmp_cmp);
		setMmp_fd(mmp_fd);
		setMmp_last_written(mmp_last_written);
		setProgress_ops(progress_ops);
		setCsum_seed(csum_seed);
		setJournal_io(journal_io);
		setJournal_name(journal_name);
		setNew_range(new_range);
		setBlock_alloc_stats_range(block_alloc_stats_range);
		setBlock_sha_map(block_sha_map);
		setEncoding(encoding);
	}
	public struct_ext2_filsys() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getIo() {
		return io;
	}
	public void setIo(Object newIo) {
		io = newIo;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Byte getDevice_name() {
		return device_name;
	}
	public void setDevice_name(Byte newDevice_name) {
		device_name = newDevice_name;
	}
	public ext2_super_block getSuper() {
		return super;
	}
	public void setSuper(ext2_super_block newSuper) {
		super = newSuper;
	}
	public int getBlocksize() {
		return blocksize;
	}
	public void setBlocksize(int newBlocksize) {
		blocksize = newBlocksize;
	}
	public int getFragsize() {
		return fragsize;
	}
	public void setFragsize(int newFragsize) {
		fragsize = newFragsize;
	}
	public Object getGroup_desc_count() {
		return group_desc_count;
	}
	public void setGroup_desc_count(Object newGroup_desc_count) {
		group_desc_count = newGroup_desc_count;
	}
	public long getDesc_blocks() {
		return desc_blocks;
	}
	public void setDesc_blocks(long newDesc_blocks) {
		desc_blocks = newDesc_blocks;
	}
	public opaque_ext2_group_desc getGroup_desc() {
		return group_desc;
	}
	public void setGroup_desc(opaque_ext2_group_desc newGroup_desc) {
		group_desc = newGroup_desc;
	}
	public int getInode_blocks_per_group() {
		return inode_blocks_per_group;
	}
	public void setInode_blocks_per_group(int newInode_blocks_per_group) {
		inode_blocks_per_group = newInode_blocks_per_group;
	}
	public Object getInode_map() {
		return inode_map;
	}
	public void setInode_map(Object newInode_map) {
		inode_map = newInode_map;
	}
	public Object getBlock_map() {
		return block_map;
	}
	public void setBlock_map(Object newBlock_map) {
		block_map = newBlock_map;
	}
	public Object getGet_blocks() {
		return get_blocks;
	}
	public void setGet_blocks(Object newGet_blocks) {
		get_blocks = newGet_blocks;
	}
	public Object getCheck_directory() {
		return check_directory;
	}
	public void setCheck_directory(Object newCheck_directory) {
		check_directory = newCheck_directory;
	}
	public Object getWrite_bitmaps() {
		return write_bitmaps;
	}
	public void setWrite_bitmaps(Object newWrite_bitmaps) {
		write_bitmaps = newWrite_bitmaps;
	}
	public Object getRead_inode() {
		return read_inode;
	}
	public void setRead_inode(Object newRead_inode) {
		read_inode = newRead_inode;
	}
	public Object getWrite_inode() {
		return write_inode;
	}
	public void setWrite_inode(Object newWrite_inode) {
		write_inode = newWrite_inode;
	}
	public Object getBadblocks() {
		return badblocks;
	}
	public void setBadblocks(Object newBadblocks) {
		badblocks = newBadblocks;
	}
	public Object getDblist() {
		return dblist;
	}
	public void setDblist(Object newDblist) {
		dblist = newDblist;
	}
	public Object getStride() {
		return stride;
	}
	public void setStride(Object newStride) {
		stride = newStride;
	}
	public ext2_super_block getOrig_super() {
		return orig_super;
	}
	public void setOrig_super(ext2_super_block newOrig_super) {
		orig_super = newOrig_super;
	}
	public ext2_image_hdr getImage_header() {
		return image_header;
	}
	public void setImage_header(ext2_image_hdr newImage_header) {
		image_header = newImage_header;
	}
	public Object getUmask() {
		return umask;
	}
	public void setUmask(Object newUmask) {
		umask = newUmask;
	}
	public Object getNow() {
		return now;
	}
	public void setNow(Object newNow) {
		now = newNow;
	}
	public int getCluster_ratio_bits() {
		return cluster_ratio_bits;
	}
	public void setCluster_ratio_bits(int newCluster_ratio_bits) {
		cluster_ratio_bits = newCluster_ratio_bits;
	}
	public Object getDefault_bitmap_type() {
		return default_bitmap_type;
	}
	public void setDefault_bitmap_type(Object newDefault_bitmap_type) {
		default_bitmap_type = newDefault_bitmap_type;
	}
	public Object getPad() {
		return pad;
	}
	public void setPad(Object newPad) {
		pad = newPad;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
	public Object getPriv_data() {
		return priv_data;
	}
	public void setPriv_data(Object newPriv_data) {
		priv_data = newPriv_data;
	}
	public ext2_inode_cache getIcache() {
		return icache;
	}
	public void setIcache(ext2_inode_cache newIcache) {
		icache = newIcache;
	}
	public Object getImage_io() {
		return image_io;
	}
	public void setImage_io(Object newImage_io) {
		image_io = newImage_io;
	}
	public Object getGet_alloc_block() {
		return get_alloc_block;
	}
	public void setGet_alloc_block(Object newGet_alloc_block) {
		get_alloc_block = newGet_alloc_block;
	}
	public Object getGet_alloc_block2() {
		return get_alloc_block2;
	}
	public void setGet_alloc_block2(Object newGet_alloc_block2) {
		get_alloc_block2 = newGet_alloc_block2;
	}
	public Object getBlock_alloc_stats() {
		return block_alloc_stats;
	}
	public void setBlock_alloc_stats(Object newBlock_alloc_stats) {
		block_alloc_stats = newBlock_alloc_stats;
	}
	public Object getMmp_buf() {
		return mmp_buf;
	}
	public void setMmp_buf(Object newMmp_buf) {
		mmp_buf = newMmp_buf;
	}
	public Object getMmp_cmp() {
		return mmp_cmp;
	}
	public void setMmp_cmp(Object newMmp_cmp) {
		mmp_cmp = newMmp_cmp;
	}
	public int getMmp_fd() {
		return mmp_fd;
	}
	public void setMmp_fd(int newMmp_fd) {
		mmp_fd = newMmp_fd;
	}
	public long getMmp_last_written() {
		return mmp_last_written;
	}
	public void setMmp_last_written(long newMmp_last_written) {
		mmp_last_written = newMmp_last_written;
	}
	public ext2fs_progress_ops getProgress_ops() {
		return progress_ops;
	}
	public void setProgress_ops(ext2fs_progress_ops newProgress_ops) {
		progress_ops = newProgress_ops;
	}
	public Object getCsum_seed() {
		return csum_seed;
	}
	public void setCsum_seed(Object newCsum_seed) {
		csum_seed = newCsum_seed;
	}
	public Object getJournal_io() {
		return journal_io;
	}
	public void setJournal_io(Object newJournal_io) {
		journal_io = newJournal_io;
	}
	public Byte getJournal_name() {
		return journal_name;
	}
	public void setJournal_name(Byte newJournal_name) {
		journal_name = newJournal_name;
	}
	public Object getNew_range() {
		return new_range;
	}
	public void setNew_range(Object newNew_range) {
		new_range = newNew_range;
	}
	public Object getBlock_alloc_stats_range() {
		return block_alloc_stats_range;
	}
	public void setBlock_alloc_stats_range(Object newBlock_alloc_stats_range) {
		block_alloc_stats_range = newBlock_alloc_stats_range;
	}
	public ext2fs_hashmap getBlock_sha_map() {
		return block_sha_map;
	}
	public void setBlock_sha_map(ext2fs_hashmap newBlock_sha_map) {
		block_sha_map = newBlock_sha_map;
	}
	public Object getEncoding() {
		return encoding;
	}
	public void setEncoding(Object newEncoding) {
		encoding = newEncoding;
	}
}
