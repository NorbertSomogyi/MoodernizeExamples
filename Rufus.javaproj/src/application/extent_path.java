package application;

/*
 * extent.c --- routines to implement extents support
 *
 * Copyright (C) 2007 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
/*
 * Definitions to be dropped in lib/ext2fs/ext2fs.h
 */
/*
 * Private definitions
 */
public class extent_path {
	private Byte buf;
	private int entries;
	private int max_entries;
	private int left;
	private int visit_num;
	private int flags;
	private Object end_blk;
	private Object curr;
	
	public extent_path(Byte buf, int entries, int max_entries, int left, int visit_num, int flags, Object end_blk, Object curr) {
		setBuf(buf);
		setEntries(entries);
		setMax_entries(max_entries);
		setLeft(left);
		setVisit_num(visit_num);
		setFlags(flags);
		setEnd_blk(end_blk);
		setCurr(curr);
	}
	public extent_path() {
	}
	
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public int getEntries() {
		return entries;
	}
	public void setEntries(int newEntries) {
		entries = newEntries;
	}
	public int getMax_entries() {
		return max_entries;
	}
	public void setMax_entries(int newMax_entries) {
		max_entries = newMax_entries;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int newLeft) {
		left = newLeft;
	}
	public int getVisit_num() {
		return visit_num;
	}
	public void setVisit_num(int newVisit_num) {
		visit_num = newVisit_num;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getEnd_blk() {
		return end_blk;
	}
	public void setEnd_blk(Object newEnd_blk) {
		end_blk = newEnd_blk;
	}
	public Object getCurr() {
		return curr;
	}
	public void setCurr(Object newCurr) {
		curr = newCurr;
	}
}
