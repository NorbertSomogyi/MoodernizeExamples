package application;

/* Manipulate the contents of extended attribute regions */
public class ext2_xattr {
	private Byte name;
	private Object value;
	private int value_len;
	private Object ea_ino;
	
	public ext2_xattr(Byte name, Object value, int value_len, Object ea_ino) {
		setName(name);
		setValue(value);
		setValue_len(value_len);
		setEa_ino(ea_ino);
	}
	public ext2_xattr() {
	}
	
	public Object write_xattrs_to_buffer(Object fs, int count, Object entries_start, int storage_size, int value_offset_correction, int write_hash) {
		ext2_xattr x = new ext2_xattr();
		ext2_ext_attr_entry e = entries_start;
		Byte end = (byte)entries_start + storage_size;
		Byte shortname;
		int value_size;
		int idx;
		int ret;
		 err = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(entries_start, 0, storage_size);
		Byte generatedName = x.getName();
		int generatedValue_len = x.getValue_len();
		Object generatedEa_ino = x.getEa_ino();
		Object generatedE_name_len = e.getE_name_len();
		Object generatedValue = x.getValue();
		Object generatedE_value_size = e.getE_value_size();
		Object generatedE_hash = e.getE_hash();
		for (x = attrs; x < attrs + count; x++) {
			shortname = generatedName;
			ret = ModernizedCProgram.find_ea_index(generatedName, shortname, idx);
			value_size = ((generatedValue_len + ((int)1 << 2) - 1) / ((int)1 << 2)) * ((int)1 << 2);
			e.setE_name_len(/*Error: Function owner not recognized*/strlen(/* Fill out e appropriately */shortname));
			e.setE_name_index((ret ? idx : 0));
			e.setE_value_size(generatedValue_len);
			e.setE_value_inum(generatedEa_ino);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)e + /*Error: sizeof expression not supported yet*/, shortname, generatedE_name_len);
			if (generatedEa_ino) {
				e.setE_value_offs(0);
			} else {
					end -= value_size;
					e.setE_value_offs(end - (byte)entries_start + value_offset_correction);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(end, generatedValue, generatedE_value_size);
			} 
			if (write_hash || generatedEa_ino) {
				err = e.ext2fs_ext_attr_hash_entry2(fs, generatedEa_ino ? 0 : end, generatedE_hash);
				if (err) {
					return err;
				} 
			} else {
					e.setE_hash(0);
			} 
			e = ((ext2_ext_attr_entry)((byte)(e) + (((generatedE_name_len) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1))));
			()e = 0;
		}
		return 0;
	}
	public Object xattr_update_entry(Object fs, Object name, Object value, Object value_len, int in_inode) {
		 ea_ino = 0;
		Object new_value = (null);
		Byte new_name = (null);
		int name_len;
		 ret = new ();
		Byte generatedName = this.getName();
		if (!generatedName) {
			name_len = /*Error: Function owner not recognized*/strlen(name);
			ret = ModernizedCProgram.ext2fs_get_mem(name_len + 1, new_name);
			if (ret) {
				;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_name, name, name_len + 1);
		} 
		ret = ModernizedCProgram.ext2fs_get_mem(value_len, new_value);
		if (ret) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_value, value, value_len);
		if (in_inode) {
			ret = ModernizedCProgram.xattr_create_ea_inode(fs, value, value_len, ea_ino);
			if (ret) {
				;
			} 
		} 
		Object generatedEa_ino = this.getEa_ino();
		if (generatedEa_ino) {
			ret = ModernizedCProgram.xattr_inode_dec_ref(fs, generatedEa_ino);
			if (ret) {
				;
			} 
		} 
		if (!generatedName) {
			this.setName(new_name);
		} 
		Object generatedValue = this.getValue();
		if (generatedValue) {
			ModernizedCProgram.ext2fs_free_mem(generatedValue);
		} 
		this.setValue(new_value);
		this.setValue_len(value_len);
		this.setEa_ino(ea_ino);
		return 0;
		if (new_value) {
			ModernizedCProgram.ext2fs_free_mem(new_value);
		} 
		if (ea_ino) {
			ModernizedCProgram.xattr_inode_dec_ref(fs, ea_ino);
		} 
		return ret;
	}
	public int xattr_find_position(int count, Object name) {
		ext2_xattr x = new ext2_xattr();
		int i;
		Byte shortname;
		Byte x_shortname;
		int name_idx;
		int x_name_idx;
		int shortname_len;
		int x_shortname_len;
		ModernizedCProgram.find_ea_index(name, shortname, name_idx);
		shortname_len = /*Error: Function owner not recognized*/strlen(shortname);
		Byte generatedName = x.getName();
		for (; i < count; ) {
			ModernizedCProgram.find_ea_index(generatedName, x_shortname, x_name_idx);
			if (name_idx < x_name_idx) {
				break;
			} 
			if (name_idx > x_name_idx) {
				continue;
			} 
			x_shortname_len = /*Error: Function owner not recognized*/strlen(x_shortname);
			if (shortname_len < x_shortname_len) {
				break;
			} 
			if (shortname_len > x_shortname_len) {
				continue;
			} 
			if (/*Error: Function owner not recognized*/memcmp(shortname, x_shortname, shortname_len) <= 0) {
				break;
			} 
		}
		return i;
	}
	public int space_used(int count) {
		int total = 0;
		ext2_xattr x = new ext2_xattr();
		Byte shortname;
		int i;
		int len;
		int name_idx;
		Byte generatedName = x.getName();
		Object generatedEa_ino = x.getEa_ino();
		int generatedValue_len = x.getValue_len();
		for (; i < count; ) {
			ModernizedCProgram.find_ea_index(generatedName, shortname, name_idx);
			len = /*Error: Function owner not recognized*/strlen(shortname);
			total += (((len) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1));
			if (!generatedEa_ino) {
				total += (((generatedValue_len) + (((int)1 << 2) - 1)) & ~(((int)1 << 2) - 1));
			} 
		}
		return total/*
		 * The minimum size of EA value when you start storing it in an external inode
		 * size of block - size of header - size of 1 entry - 4 null bytes
		 */;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public int getValue_len() {
		return value_len;
	}
	public void setValue_len(int newValue_len) {
		value_len = newValue_len;
	}
	public Object getEa_ino() {
		return ea_ino;
	}
	public void setEa_ino(Object newEa_ino) {
		ea_ino = newEa_ino;
	}
}
