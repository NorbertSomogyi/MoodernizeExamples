package application;

/*
 * lookup.c --- ext2fs directory lookup operations
 *
 * Copyright (C) 1993, 1994, 1994, 1995 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class lookup_struct {
	private Object name;
	private int len;
	private Object inode;
	private int found;
	
	public lookup_struct(Object name, int len, Object inode, int found) {
		setName(name);
		setLen(len);
		setInode(inode);
		setFound(found);
	}
	public lookup_struct() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Object getInode() {
		return inode;
	}
	public void setInode(Object newInode) {
		inode = newInode;
	}
	public int getFound() {
		return found;
	}
	public void setFound(int newFound) {
		found = newFound;
	}
}
