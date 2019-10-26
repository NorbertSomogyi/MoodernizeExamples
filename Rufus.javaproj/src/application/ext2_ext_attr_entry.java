package application;

public class ext2_ext_attr_entry {
	private Object e_name_len;
	private Object e_name_index;
	private Object e_value_offs;
	private Object e_value_inum;
	private Object e_value_size;
	private Object e_hash;
	
	public ext2_ext_attr_entry(Object e_name_len, Object e_name_index, Object e_value_offs, Object e_value_inum, Object e_value_size, Object e_hash) {
		setE_name_len(e_name_len);
		setE_name_index(e_name_index);
		setE_value_offs(e_value_offs);
		setE_value_inum(e_value_inum);
		setE_value_size(e_value_size);
		setE_hash(e_hash);
	}
	public ext2_ext_attr_entry() {
	}
	
	/*
	 * ext2_xattr_hash_entry()
	 *
	 * Compute the hash of an extended attribute.
	 */
	public Object ext2fs_ext_attr_hash_entry(Object data) {
		 hash = 0;
		byte name = ((byte)entry) + ;
		int n;
		Object generatedE_name_len = this.getE_name_len();
		for (n = 0; n < generatedE_name_len; n++) {
			hash = (hash << 5) ^ (hash >> (8 *  - 5)) ^ name++;
		}
		Object generatedE_value_inum = this.getE_value_inum();
		Object generatedE_value_size = this.getE_value_size();
		if (generatedE_value_inum == 0 && generatedE_value_size != /* The hash needs to be calculated on the data in little-endian. */0) {
			 value = ()data;
			for (n = (generatedE_value_size + (((int)1 << 2) - 1)) >> 2; n; n--) {
				hash = (hash << 16) ^ (hash >> (8 *  - 16)) ^ .ext2fs_le32_to_cpu(value++);
			}
		} 
		return hash/*
		 * ext2fs_ext_attr_hash_entry2()
		 *
		 * Compute the hash of an extended attribute.
		 * This version of the function supports hashing entries that reference
		 * external inodes (ea_inode feature).
		 */;
	}
	public Object ext2fs_ext_attr_hash_entry2(Object fs, Object data, Object hash) {
		hash = entry.ext2fs_ext_attr_hash_entry(data);
		Object generatedE_value_inum = this.getE_value_inum();
		if (generatedE_value_inum) {
			 ea_inode_hash = new ();
			 retval = new ();
			retval = ModernizedCProgram.read_ea_inode_hash(fs, generatedE_value_inum, ea_inode_hash);
			if (retval) {
				return retval;
			} 
			hash = (hash << 16) ^ (hash >> (8 *  - 16)) ^ ea_inode_hash;
		} 
		return 0;
	}
	public Object getE_name_len() {
		return e_name_len;
	}
	public void setE_name_len(Object newE_name_len) {
		e_name_len = newE_name_len;
	}
	public Object getE_name_index() {
		return e_name_index;
	}
	public void setE_name_index(Object newE_name_index) {
		e_name_index = newE_name_index;
	}
	public Object getE_value_offs() {
		return e_value_offs;
	}
	public void setE_value_offs(Object newE_value_offs) {
		e_value_offs = newE_value_offs;
	}
	public Object getE_value_inum() {
		return e_value_inum;
	}
	public void setE_value_inum(Object newE_value_inum) {
		e_value_inum = newE_value_inum;
	}
	public Object getE_value_size() {
		return e_value_size;
	}
	public void setE_value_size(Object newE_value_size) {
		e_value_size = newE_value_size;
	}
	public Object getE_hash() {
		return e_hash;
	}
	public void setE_hash(Object newE_hash) {
		e_hash = newE_hash;
	}
}
