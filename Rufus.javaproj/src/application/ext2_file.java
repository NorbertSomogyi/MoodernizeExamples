package application;

/*
 * fileio.c --- Simple file I/O routines
 *
 * Copyright (C) 1997 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class ext2_file {
	private Object magic;
	private Object fs;
	private Object ino;
	private ext2_inode inode;
	private int flags;
	private Object pos;
	private Object blockno;
	private Object physblock;
	private Byte buf;
	
	public ext2_file(Object magic, Object fs, Object ino, ext2_inode inode, int flags, Object pos, Object blockno, Object physblock, Byte buf) {
		setMagic(magic);
		setFs(fs);
		setIno(ino);
		setInode(inode);
		setFlags(flags);
		setPos(pos);
		setBlockno(blockno);
		setPhysblock(physblock);
		setBuf(buf);
	}
	public ext2_file() {
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
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public ext2_inode getInode() {
		return inode;
	}
	public void setInode(ext2_inode newInode) {
		inode = newInode;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getBlockno() {
		return blockno;
	}
	public void setBlockno(Object newBlockno) {
		blockno = newBlockno;
	}
	public Object getPhysblock() {
		return physblock;
	}
	public void setPhysblock(Object newPhysblock) {
		physblock = newPhysblock;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
}
