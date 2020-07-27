package application;

public class ext2_xattr_handle {
	private Object magic;
	private Object fs;
	private ext2_xattr[] attrs;
	private int capacity;
	private int count;
	private int ibody_count;
	private Object ino;
	private int flags;
	
	public ext2_xattr_handle(Object magic, Object fs, ext2_xattr[] attrs, int capacity, int count, int ibody_count, Object ino, int flags) {
		setMagic(magic);
		setFs(fs);
		setAttrs(attrs);
		setCapacity(capacity);
		setCount(count);
		setIbody_count(ibody_count);
		setIno(ino);
		setFlags(flags);
	}
	public ext2_xattr_handle() {
	}
	
	public Object ext2fs_xattrs_expand(int expandby) {
		ext2_xattr new_attrs = new ext2_xattr();
		 err = new ();
		int generatedCapacity = this.getCapacity();
		err = ModernizedCProgram.ext2fs_get_arrayzero(generatedCapacity + expandby, /*Error: Unsupported expression*/, new_attrs);
		if (err) {
			return err;
		} 
		ext2_xattr[] generatedAttrs = this.getAttrs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_attrs, generatedAttrs, generatedCapacity * /*Error: Unsupported expression*/);
		ModernizedCProgram.ext2fs_free_mem(generatedAttrs);
		generatedCapacity += expandby;
		this.setAttrs(new_attrs);
		return 0;
	}
	public Object ext2fs_xattrs_write() {
		Object generatedFs = this.getFs();
		ext2_filsys fs = generatedFs;
		int inode_size = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		ext2_inode_large inode = new ext2_inode_large();
		byte start;
		byte block_buf = ((Object)0);
		ext2_ext_attr_header header = new ext2_ext_attr_header();
		 ea_inode_magic = new ();
		 blk = new ();
		int storage_size;
		int i;
		 err = new ();
		Object generatedMagic = (handle).getMagic();
		if (!(handle) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		i = inode_size;
		if (i < /*Error: sizeof expression not supported yet*/) {
			i = /*Error: sizeof expression not supported yet*/;
		} 
		err = ModernizedCProgram.ext2fs_get_memzero(i, inode);
		if (err) {
			return err;
		} 
		Object generatedIno = this.getIno();
		ext2_inode ext2_inode = new ext2_inode();
		err = ext2_inode.EXT2_INODE(inode).ext2fs_read_inode_full(fs, generatedIno, inode_size);
		if (err) {
			;
		} 
		Object generatedI_extra_isize = inode.getI_extra_isize();
		if (generatedI_extra_isize == /* If extra_isize isn't set, we need to set it now */0 && inode_size > 128) {
			byte p = (byte)inode;
			size_t extra = fs.getSuper().getS_want_extra_isize();
			if (extra == 0) {
				extra = /*Error: Unsupported expression*/;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(p + 128, 0, extra);
			inode.setI_extra_isize(extra);
		} 
		if (generatedI_extra_isize & 3) {
			err = EXT2_ET_INODE_CORRUPTED;
			;
		} 
		if (generatedI_extra_isize < /*Error: sizeof expression not supported yet*/ || inode_size <= 128 + generatedI_extra_isize + /*Error: Unsupported expression*/) {
			;
		} 
		ea_inode_magic = /* Write the inode EA */-1024;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(((byte)inode) + 128 + generatedI_extra_isize, ea_inode_magic, /*Error: Unsupported expression*/);
		storage_size = inode_size - 128 - generatedI_extra_isize - /*Error: Unsupported expression*/;
		start = ((byte)inode) + 128 + generatedI_extra_isize + /*Error: Unsupported expression*/;
		ext2_xattr[] generatedAttrs = this.getAttrs();
		int generatedIbody_count = this.getIbody_count();
		err = generatedAttrs.write_xattrs_to_buffer(fs, generatedIbody_count, start, storage_size, 0, 0);
		if (err) {
			;
		} 
		err = ModernizedCProgram.ext2fs_get_memzero(fs.getBlocksize(), /* Write the EA block */block_buf);
		if (err) {
			;
		} 
		storage_size = fs.getBlocksize() - /*Error: Unsupported expression*/;
		start = block_buf + /*Error: Unsupported expression*/;
		int generatedCount = this.getCount();
		err = generatedAttrs + generatedIbody_count.write_xattrs_to_buffer(fs, generatedCount - generatedIbody_count, start, storage_size, start - block_buf, 1);
		if (err) {
			;
		} 
		header = (ext2_ext_attr_header)/* Write a header on the EA block */block_buf;
		header.setH_magic(-1024);
		header.setH_refcount(1);
		header.setH_blocks(1);
		err = /* Get a new block for writing */inode.prep_ea_block_for_write(fs, generatedIno);
		if (err) {
			;
		} 
		blk = ModernizedCProgram.ext2fs_file_acl_block(fs, ext2_inode.EXT2_INODE(/* Finally, write the new EA block */inode));
		err = ModernizedCProgram.ext2fs_write_ext_attr3(fs, blk, block_buf, generatedIno);
		if (err) {
			;
		} 
		if (!block_buf && blk) {
			err = /* xattrs shrunk, free the block */inode.ext2fs_free_ext_attr(fs, generatedIno);
			if (err) {
				;
			} 
		} 
		err = ext2_inode.EXT2_INODE(/* Write the inode */inode).ext2fs_write_inode_full(fs, generatedIno, inode_size);
		if (err) {
			;
		} 
		return err;
	}
	public void xattrs_free_keys() {
		ext2_xattr[] generatedAttrs = this.getAttrs();
		ext2_xattr a = generatedAttrs;
		int i;
		int generatedCapacity = this.getCapacity();
		for (i = 0; i < generatedCapacity; i++) {
			if (a[i].getName()) {
				ModernizedCProgram.ext2fs_free_mem(a[i].getName());
			} 
			if (a[i].getValue()) {
				ModernizedCProgram.ext2fs_free_mem(a[i].getValue());
			} 
		}
		this.setCount(0);
		this.setIbody_count(0);
	}
	public Object ext2fs_xattrs_read() {
		ext2_inode_large inode = new ext2_inode_large();
		ext2_ext_attr_header header = new ext2_ext_attr_header();
		 ea_inode_magic = new ();
		int storage_size;
		byte start;
		byte block_buf = ((Object)0);
		 blk = new ();
		size_t i = new size_t();
		 err = new ();
		Object generatedMagic = (handle).getMagic();
		if (!(handle) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		Object generatedFs = this.getFs();
		i = (((generatedFs.getSuper()).getS_rev_level() == 0) ? 128 : (generatedFs.getSuper()).getS_inode_size());
		if (i < /*Error: sizeof expression not supported yet*/) {
			i = /*Error: sizeof expression not supported yet*/;
		} 
		err = ModernizedCProgram.ext2fs_get_memzero(i, inode);
		if (err) {
			return err;
		} 
		Object generatedIno = this.getIno();
		err = (ext2_inode)inode.ext2fs_read_inode_full(generatedFs, generatedIno, (((generatedFs.getSuper()).getS_rev_level() == 0) ? 128 : (generatedFs.getSuper()).getS_inode_size()));
		if (err) {
			;
		} 
		handle.xattrs_free_keys();
		Object generatedI_extra_isize = inode.getI_extra_isize();
		if (generatedI_extra_isize < /*Error: sizeof expression not supported yet*/ || (((generatedFs.getSuper()).getS_rev_level() == 0) ? 128 : (generatedFs.getSuper()).getS_inode_size()) <= 128 + generatedI_extra_isize + /*Error: Unsupported expression*/) {
			;
		} 
		if (generatedI_extra_isize & 3) {
			err = EXT2_ET_INODE_CORRUPTED;
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ea_inode_magic, ((byte)inode) + /* Look for EA in the inode */128 + generatedI_extra_isize, /*Error: Unsupported expression*/);
		int generatedCount = this.getCount();
		if (ea_inode_magic == -1024) {
			storage_size = (((generatedFs.getSuper()).getS_rev_level() == 0) ? 128 : (generatedFs.getSuper()).getS_inode_size()) - 128 - generatedI_extra_isize - /*Error: Unsupported expression*/;
			start = ((byte)inode) + 128 + generatedI_extra_isize + /*Error: Unsupported expression*/;
			err = ModernizedCProgram.read_xattrs_from_buffer(handle, inode, (ext2_ext_attr_entry)start, storage_size, start);
			if (err) {
				;
			} 
			this.setIbody_count(generatedCount);
		} 
		Object generatedH_magic = header.getH_magic();
		if (blk != 0) {
			if ((blk < generatedFs.getSuper().getS_first_data_block()) || (blk >= generatedFs.getSuper().ext2fs_blocks_count())) {
				err = EXT2_ET_BAD_EA_BLOCK_NUM;
				;
			} 
			err = ModernizedCProgram.ext2fs_get_mem(generatedFs.getBlocksize(), block_buf);
			if (err) {
				;
			} 
			err = ModernizedCProgram.ext2fs_read_ext_attr3(generatedFs, blk, block_buf, generatedIno);
			if (err) {
				;
			} 
			header = (ext2_ext_attr_header)/* We only know how to deal with v2 EA blocks */block_buf;
			if (generatedH_magic != -1024) {
				err = EXT2_ET_BAD_EA_HEADER;
				;
			} 
			storage_size = generatedFs.getBlocksize() - /*Error: Unsupported expression*/;
			start = block_buf + /*Error: Unsupported expression*/;
			err = ModernizedCProgram.read_xattrs_from_buffer(handle, inode, (ext2_ext_attr_entry)start, storage_size, block_buf);
			if (err) {
				;
			} 
			ModernizedCProgram.ext2fs_free_mem(block_buf);
		} 
		ModernizedCProgram.ext2fs_free_mem(block_buf);
		ModernizedCProgram.ext2fs_free_mem(inode);
		return 0;
		return err;
	}
	public Object ext2fs_xattrs_iterate(Object func, Object data) {
		ext2_xattr x = new ext2_xattr();
		int dirty = 0;
		int ret;
		Object generatedMagic = (h).getMagic();
		if (!(h) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		ext2_xattr[] generatedAttrs = this.getAttrs();
		int generatedCount = this.getCount();
		Byte generatedName = x.getName();
		Object generatedValue = x.getValue();
		int generatedValue_len = x.getValue_len();
		for (x = generatedAttrs; x < generatedAttrs + generatedCount; x++) {
			ret = /*Error: Function owner not recognized*/func(generatedName, generatedValue, generatedValue_len, data);
			if (ret & 2) {
				dirty = 1;
			} 
			if (ret & 1) {
				break;
			} 
		}
		if (dirty) {
			return h.ext2fs_xattrs_write();
		} 
		return 0;
	}
	public Object ext2fs_xattr_get(Object key, Object value, Object value_len) {
		ext2_xattr x = new ext2_xattr();
		byte val;
		 err = new ();
		Object generatedMagic = (h).getMagic();
		if (!(h) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		ext2_xattr[] generatedAttrs = this.getAttrs();
		int generatedCount = this.getCount();
		Byte generatedName = x.getName();
		int generatedFlags = this.getFlags();
		Object generatedValue = x.getValue();
		int generatedValue_len = x.getValue_len();
		for (x = generatedAttrs; x < generatedAttrs + generatedCount; x++) {
			if (/*Error: Function owner not recognized*/strcmp(generatedName, key)) {
				continue;
			} 
			if (!(generatedFlags & -1024) && ((/*Error: Function owner not recognized*/strcmp(key, "system.posix_acl_default") == 0) || (/*Error: Function owner not recognized*/strcmp(key, "system.posix_acl_access") == 0))) {
				err = ModernizedCProgram.convert_disk_buffer_to_posix_acl(generatedValue, generatedValue_len, value, value_len);
				return err;
			} else {
					err = ModernizedCProgram.ext2fs_get_mem(generatedValue_len, val);
					if (err) {
						return err;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(val, generatedValue, generatedValue_len);
					value = val;
					value_len = generatedValue_len;
					return 0;
			} 
		}
		return EXT2_ET_EA_KEY_NOT_FOUND;
	}
	public Object xattr_array_update(Object name, Object value, Object value_len, int ibody_free, int block_free, int old_idx, int in_inode) {
		ext2_xattr tmp = new ext2_xattr();
		int add_to_ibody;
		int needed;
		int name_len;
		int name_idx;
		byte shortname;
		int new_idx;
		int ret;
		ModernizedCProgram.find_ea_index(name, shortname, name_idx);
		name_len = /*Error: Function owner not recognized*/strlen(shortname);
		needed = (((name_len) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1));
		if (!in_inode) {
			needed += (((value_len) + (((int)1 << 2) - 1)) & ~(((int)1 << 2) - 1));
		} 
		int generatedIbody_count = this.getIbody_count();
		ext2_xattr[] generatedAttrs = this.getAttrs();
		if (old_idx >= 0 && old_idx < generatedIbody_count) {
			ibody_free += (((name_len) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1));
			if (!generatedAttrs[old_idx].getEa_ino()) {
				ibody_free += (((generatedAttrs[old_idx].getValue_len()) + (((int)1 << 2) - 1)) & ~(((int)1 << 2) - 1));
			} 
		} 
		Object generatedFs = this.getFs();
		if (needed <= ibody_free) {
			if (old_idx < 0) {
				new_idx = generatedIbody_count;
				add_to_ibody = 1;
				;
			} 
			ret = generatedAttrs[old_idx].xattr_update_entry(generatedFs, /* Update the existing entry. */name, value, value_len, in_inode);
			if (ret) {
				return ret;
			} 
			if (generatedIbody_count <= old_idx) {
				tmp = generatedAttrs[/* Move entry from block to the end of ibody. */old_idx];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedAttrs + generatedIbody_count + 1, generatedAttrs + generatedIbody_count, (old_idx - generatedIbody_count) * /*Error: sizeof expression not supported yet*/);
				generatedAttrs[generatedIbody_count] = tmp;
				generatedIbody_count++;
			} 
			return 0;
		} 
		if (generatedIbody_count <= old_idx) {
			block_free += (((name_len) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1));
			if (!generatedAttrs[old_idx].getEa_ino()) {
				block_free += (((generatedAttrs[old_idx].getValue_len()) + (((int)1 << 2) - 1)) & ~(((int)1 << 2) - 1));
			} 
		} 
		if (needed > block_free) {
			return EXT2_ET_EA_NO_SPACE;
		} 
		int generatedCount = this.getCount();
		if (old_idx >= 0) {
			ret = generatedAttrs[old_idx].xattr_update_entry(generatedFs, /* Update the existing entry. */name, value, value_len, in_inode);
			if (ret) {
				return ret;
			} 
			if (old_idx < generatedIbody_count) {
				new_idx = generatedAttrs + generatedIbody_count.xattr_find_position(generatedCount - generatedIbody_count, name);
				new_idx += generatedIbody_count - 1;
				tmp = generatedAttrs[old_idx];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedAttrs + old_idx, generatedAttrs + old_idx + 1, (new_idx - old_idx) * /*Error: sizeof expression not supported yet*/);
				generatedAttrs[new_idx] = tmp;
				generatedIbody_count--;
			} 
			return 0;
		} 
		new_idx = generatedAttrs + generatedIbody_count.xattr_find_position(generatedCount - generatedIbody_count, name);
		new_idx += generatedIbody_count;
		add_to_ibody = 0;
		ret = generatedAttrs[generatedCount].xattr_update_entry(generatedFs, name, value, value_len, in_inode);
		if (ret) {
			return ret;
		} 
		tmp = generatedAttrs[generatedCount];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedAttrs + new_idx + 1, generatedAttrs + new_idx, (generatedCount - new_idx) * /*Error: sizeof expression not supported yet*/);
		generatedAttrs[new_idx] = tmp;
		if (add_to_ibody) {
			generatedIbody_count++;
		} 
		generatedCount++;
		return 0;
	}
	public Object ext2fs_xattr_set(Object name, Object value, Object value_len) {
		Object generatedFs = this.getFs();
		ext2_filsys fs = generatedFs;
		int inode_size = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		ext2_inode_large inode = ((Object)0);
		ext2_xattr x = new ext2_xattr();
		byte new_value;
		int ibody_free;
		int block_free;
		int in_inode = 0;
		int old_idx = -1;
		int extra_isize;
		 ret = new ();
		Object generatedMagic = (h).getMagic();
		if (!(h) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		ret = ModernizedCProgram.ext2fs_get_mem(value_len, new_value);
		if (ret) {
			return ret;
		} 
		int generatedFlags = this.getFlags();
		if (!(generatedFlags & -1024) && ((/*Error: Function owner not recognized*/strcmp(name, "system.posix_acl_default") == 0) || (/*Error: Function owner not recognized*/strcmp(name, "system.posix_acl_access") == 0))) {
			ret = ModernizedCProgram.convert_posix_acl_to_disk_buffer(value, value_len, new_value, value_len);
			if (ret) {
				;
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_value, value, value_len);
		} 
		ext2_xattr[] generatedAttrs = this.getAttrs();
		int generatedCount = this.getCount();
		Byte generatedName = x.getName();
		Object generatedEa_ino = x.getEa_ino();
		int generatedValue_len = x.getValue_len();
		Object generatedValue = x.getValue();
		for (x = generatedAttrs; x < generatedAttrs + generatedCount; /* Imitate kernel behavior by skipping update if value is the same. */x++) {
			if (!/*Error: Function owner not recognized*/strcmp(generatedName, name)) {
				if (!generatedEa_ino && generatedValue_len == value_len && !/*Error: Function owner not recognized*/memcmp(generatedValue, new_value, value_len)) {
					ret = 0;
					;
				} 
				old_idx = x - generatedAttrs;
				break;
			} 
		}
		ret = ModernizedCProgram.ext2fs_get_memzero(inode_size, inode);
		if (ret) {
			;
		} 
		Object generatedIno = this.getIno();
		ret = (ext2_inode)inode.ext2fs_read_inode_full(fs, generatedIno, inode_size);
		if (ret) {
			;
		} 
		Object generatedI_extra_isize = inode.getI_extra_isize();
		int generatedIbody_count = this.getIbody_count();
		if (inode_size > 128) {
			extra_isize = generatedI_extra_isize;
			if (extra_isize == 0) {
				extra_isize = fs.getSuper().getS_want_extra_isize();
				if (extra_isize == 0) {
					extra_isize = /*Error: Unsupported expression*/;
				} 
			} 
			ibody_free = inode_size - 128;
			ibody_free -= extra_isize;
			ibody_free -= /*Error: Unsupported expression*/ * /* Extended attribute magic and final null entry. */2;
			ibody_free -= generatedAttrs.space_used(generatedIbody_count);
		} else {
				ibody_free = 0;
		} 
		if (/*Error: Function owner not recognized*/strcmp(name, "system.data") == /* Inline data can only go to ibody. */0) {
			if (generatedIbody_count <= old_idx) {
				ret = EXT2_ET_FILESYSTEM_CORRUPTED;
				;
			} 
			ret = h.xattr_array_update(name, new_value, value_len, ibody_free, 0, /* block_free */old_idx, /* in_inode */0);
			if (ret) {
				;
			} 
			;
		} 
		block_free = fs.getBlocksize();
		block_free -= /*Error: Unsupported expression*/;
		block_free -= /*Error: Unsupported expression*//* Final null entry. */;
		block_free -= generatedAttrs + generatedIbody_count.space_used(generatedCount - generatedIbody_count);
		if (fs.getSuper().ext2fs_has_feature_ea_inode() && value_len > ((fs.getBlocksize()) - (((true) + (((int)1 << 2) - 1) + /*Error: Unsupported expression*/) & ~(((int)1 << 2) - 1)) - /*Error: Unsupported expression*/ - 4)) {
			in_inode = 1;
		} 
		ret = h.xattr_array_update(name, new_value, value_len, ibody_free, block_free, old_idx, in_inode);
		if (ret == EXT2_ET_EA_NO_SPACE && !in_inode && fs.getSuper().ext2fs_has_feature_ea_inode()) {
			ret = h.xattr_array_update(name, new_value, value_len, ibody_free, block_free, old_idx, /* in_inode */1);
		} 
		if (ret) {
			;
		} 
		ModernizedCProgram.ext2fs_free_mem(new_value);
		return ret;
	}
	public Object ext2fs_xattr_remove(Object key) {
		ext2_xattr x = new ext2_xattr();
		ext2_xattr[] generatedAttrs = this.getAttrs();
		int generatedCount = this.getCount();
		ext2_xattr end = generatedAttrs + generatedCount;
		Object generatedMagic = (handle).getMagic();
		if (!(handle) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		Byte generatedName = x.getName();
		Object generatedValue = x.getValue();
		Object generatedEa_ino = x.getEa_ino();
		Object generatedFs = this.getFs();
		int generatedIbody_count = this.getIbody_count();
		for (x = generatedAttrs; x < end; x++) {
			if (/*Error: Function owner not recognized*/strcmp(generatedName, key) == 0) {
				ModernizedCProgram.ext2fs_free_mem(generatedName);
				ModernizedCProgram.ext2fs_free_mem(generatedValue);
				if (generatedEa_ino) {
					ModernizedCProgram.xattr_inode_dec_ref(generatedFs, generatedEa_ino);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(x, x + 1, (end - x - 1) * /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(end - 1, 0, /*Error: sizeof expression not supported yet*/);
				if (x < generatedAttrs + generatedIbody_count) {
					generatedIbody_count--;
				} 
				generatedCount--;
				return handle.ext2fs_xattrs_write();
			} 
		}
		return /* no key found, success! */0;
	}
	public Object ext2fs_xattrs_open(Object fs, Object ino) {
		ext2_xattr_handle h = new ext2_xattr_handle();
		 err = new ();
		if (!fs.getSuper().ext2fs_has_feature_xattr() && !fs.getSuper().ext2fs_has_feature_inline_data()) {
			return EXT2_ET_MISSING_EA_FEATURE;
		} 
		err = ModernizedCProgram.ext2fs_get_memzero(/*Error: sizeof expression not supported yet*/, h);
		if (err) {
			return err;
		} 
		h.setMagic(EXT2_ET_MAGIC_EA_HANDLE);
		h.setCapacity(4);
		int generatedCapacity = h.getCapacity();
		ext2_xattr[] generatedAttrs = h.getAttrs();
		err = ModernizedCProgram.ext2fs_get_arrayzero(generatedCapacity, /*Error: Unsupported expression*/, generatedAttrs);
		if (err) {
			ModernizedCProgram.ext2fs_free_mem(h);
			return err;
		} 
		h.setCount(0);
		h.setIno(ino);
		h.setFs(fs);
		handle = h;
		return 0;
	}
	public Object ext2fs_xattrs_close() {
		ext2_xattr_handle h = handle;
		Object generatedMagic = (h).getMagic();
		if (!(h) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		h.xattrs_free_keys();
		ext2_xattr[] generatedAttrs = h.getAttrs();
		ModernizedCProgram.ext2fs_free_mem(generatedAttrs);
		ModernizedCProgram.ext2fs_free_mem(handle);
		return 0;
	}
	public Object ext2fs_xattrs_count(Object count) {
		Object generatedMagic = (handle).getMagic();
		if (!(handle) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		int generatedCount = this.getCount();
		count = generatedCount;
		return 0;
	}
	public Object ext2fs_xattrs_flags(Integer new_flags, Integer old_flags) {
		Object generatedMagic = (handle).getMagic();
		if (!(handle) || generatedMagic != (EXT2_ET_MAGIC_EA_HANDLE)) {
			return (EXT2_ET_MAGIC_EA_HANDLE);
		} 
		int generatedFlags = this.getFlags();
		if (old_flags) {
			old_flags = generatedFlags;
		} 
		if (new_flags) {
			this.setFlags(new_flags);
		} 
		return 0;
	}
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public ext2_xattr[] getAttrs() {
		return attrs;
	}
	public void setAttrs(ext2_xattr[] newAttrs) {
		attrs = newAttrs;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int newCapacity) {
		capacity = newCapacity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getIbody_count() {
		return ibody_count;
	}
	public void setIbody_count(int newIbody_count) {
		ibody_count = newIbody_count;
	}
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
