package application;

/*
 * read_bb --- read the bad blocks inode
 *
 * Copyright (C) 1994 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class read_bb_record {
	private Object bb_list;
	private Object err;
	
	public read_bb_record(Object bb_list, Object err) {
		setBb_list(bb_list);
		setErr(err);
	}
	public read_bb_record() {
	}
	
	public Object getBb_list() {
		return bb_list;
	}
	public void setBb_list(Object newBb_list) {
		bb_list = newBb_list;
	}
	public Object getErr() {
		return err;
	}
	public void setErr(Object newErr) {
		err = newErr;
	}
}
