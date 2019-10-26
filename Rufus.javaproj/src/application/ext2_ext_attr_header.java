package application;

/*
  File: linux/ext2_ext_attr.h

  On-disk format of extended attributes for the ext2 filesystem.

  (C) 2000 Andreas Gruenbacher, <a.gruenbacher@computer.org>
*/
/* Magic value in attribute blocks */
/* Maximum number of references to one attribute block */
public class ext2_ext_attr_header {
	private Object h_magic;
	private Object h_refcount;
	private Object h_blocks;
	private Object h_hash;
	private Object h_checksum;
	private Object h_reserved;
	
	public ext2_ext_attr_header(Object h_magic, Object h_refcount, Object h_blocks, Object h_hash, Object h_checksum, Object h_reserved) {
		setH_magic(h_magic);
		setH_refcount(h_refcount);
		setH_blocks(h_blocks);
		setH_hash(h_hash);
		setH_checksum(h_checksum);
		setH_reserved(h_reserved);
	}
	public ext2_ext_attr_header() {
	}
	
	public Object check_ext_attr_header() {
		Object generatedH_magic = this.getH_magic();
		Object generatedH_blocks = this.getH_blocks();
		if ((generatedH_magic != -1024 && generatedH_magic != -1024) || generatedH_blocks != 1) {
			return EXT2_ET_BAD_EA_HEADER;
		} 
		return 0;
	}
	public Object getH_magic() {
		return h_magic;
	}
	public void setH_magic(Object newH_magic) {
		h_magic = newH_magic;
	}
	public Object getH_refcount() {
		return h_refcount;
	}
	public void setH_refcount(Object newH_refcount) {
		h_refcount = newH_refcount;
	}
	public Object getH_blocks() {
		return h_blocks;
	}
	public void setH_blocks(Object newH_blocks) {
		h_blocks = newH_blocks;
	}
	public Object getH_hash() {
		return h_hash;
	}
	public void setH_hash(Object newH_hash) {
		h_hash = newH_hash;
	}
	public Object getH_checksum() {
		return h_checksum;
	}
	public void setH_checksum(Object newH_checksum) {
		h_checksum = newH_checksum;
	}
	public Object getH_reserved() {
		return h_reserved;
	}
	public void setH_reserved(Object newH_reserved) {
		h_reserved = newH_reserved;
	}
}
