package application;

/*
 * bmap64.h --- 64-bit bitmap structure
 *
 * Copyright (C) 2007, 2008 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Public
 * License.
 * %End-Header%
 */
public class ext2_bmap_statistics {
	private int type;
	private timeval created;
	
	public ext2_bmap_statistics(int type, timeval created) {
		setType(type);
		setCreated(created);
	}
	public ext2_bmap_statistics() {
	}
	
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public timeval getCreated() {
		return created;
	}
	public void setCreated(timeval newCreated) {
		created = newCreated;
	}
}
