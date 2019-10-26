package application;

/*
 * link.c --- create links in a ext2fs directory
 *
 * Copyright (C) 1993, 1994 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class link_struct {
	private Object fs;
	private Object name;
	private int namelen;
	private Object inode;
	private int flags;
	private int done;
	private int blocksize;
	private Object err;
	private ext2_super_block sb;
	
	public link_struct(Object fs, Object name, int namelen, Object inode, int flags, int done, int blocksize, Object err, ext2_super_block sb) {
		setFs(fs);
		setName(name);
		setNamelen(namelen);
		setInode(inode);
		setFlags(flags);
		setDone(done);
		setBlocksize(blocksize);
		setErr(err);
		setSb(sb);
	}
	public link_struct() {
	}
	
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getNamelen() {
		return namelen;
	}
	public void setNamelen(int newNamelen) {
		namelen = newNamelen;
	}
	public Object getInode() {
		return inode;
	}
	public void setInode(Object newInode) {
		inode = newInode;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int newDone) {
		done = newDone;
	}
	public int getBlocksize() {
		return blocksize;
	}
	public void setBlocksize(int newBlocksize) {
		blocksize = newBlocksize;
	}
	public Object getErr() {
		return err;
	}
	public void setErr(Object newErr) {
		err = newErr;
	}
	public ext2_super_block getSb() {
		return sb;
	}
	public void setSb(ext2_super_block newSb) {
		sb = newSb;
	}
}
