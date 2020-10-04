package application;

/*
 * inline_data.c --- data in inode
 *
 * Copyright (C) 2012 Zheng Liu <wenqing.lz@taobao.com>
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU library
 * General Public License, version 2.
 * %End-Header%
 */
/* for PATH_MAX */
public class ext2_inline_data {
	private Object fs;
	private Object ino;
	private Object ea_size;
	private Object ea_data;
	
	public ext2_inline_data(Object fs, Object ino, Object ea_size, Object ea_data) {
		setFs(fs);
		setIno(ino);
		setEa_size(ea_size);
		setEa_data(ea_data);
	}
	public ext2_inline_data() {
	}
	
	public Object ext2fs_inline_data_ea_set() {
		ext2_xattr_handle handle = new ext2_xattr_handle();
		 retval = new ();
		Object generatedFs = this.getFs();
		Object generatedIno = this.getIno();
		retval = handle.ext2fs_xattrs_open(generatedFs, generatedIno);
		if (retval) {
			return retval;
		} 
		retval = handle.ext2fs_xattrs_read();
		if (retval) {
			;
		} 
		Object generatedEa_data = this.getEa_data();
		Object generatedEa_size = this.getEa_size();
		retval = handle.ext2fs_xattr_set("system.data", generatedEa_data, generatedEa_size);
		return retval;
	}
	public Object ext2fs_inline_data_ea_get() {
		ext2_xattr_handle handle = new ext2_xattr_handle();
		 retval = new ();
		this.setEa_size(0);
		this.setEa_data(0);
		Object generatedFs = this.getFs();
		Object generatedIno = this.getIno();
		retval = handle.ext2fs_xattrs_open(generatedFs, generatedIno);
		if (retval) {
			return retval;
		} 
		retval = handle.ext2fs_xattrs_read();
		if (retval) {
			;
		} 
		Object generatedEa_data = this.getEa_data();
		Object generatedEa_size = this.getEa_size();
		retval = handle.ext2fs_xattr_get("system.data", (Object)generatedEa_data, generatedEa_size);
		if (retval == EXT2_ET_EA_KEY_NOT_FOUND) {
			this.setEa_size(0);
			this.setEa_data((null));
			retval = 0;
		}  else if (retval) {
			;
		} 
		return retval;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public Object getEa_size() {
		return ea_size;
	}
	public void setEa_size(Object newEa_size) {
		ea_size = newEa_size;
	}
	public Object getEa_data() {
		return ea_data;
	}
	public void setEa_data(Object newEa_data) {
		ea_data = newEa_data;
	}
}
