package application;

/*
 * Copyright (C) 2016 Eistec AB
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @file
 * @brief   POSIX compatible sys/statvfs.h definitions
 * @author  Joakim Nohlgård <joakim.nohlgard@eistec.se>
 */
/* If building on native we need to use the system libraries instead */
/* without the GCC pragma above #include_next will trigger a pedantic error */
/* for fsblkcnt_t, fsfilcnt_t */
/* newlib support for fsblkcnt_t was only recently added to the newlib git
 * repository, commit f3e587d30a9f65d0c6551ad14095300f6e81672e, 15 apr 2016.
 * Will be included in release 2.5.0, around new year 2016/2017.
 * We provide the below workaround if the used tool chain is too old. */
/* for statvfs() */
/* Default to 32 bit file sizes on newlib platforms */
/**
 * @brief File system information
 */
public class statvfs {
	private long f_bsize;
	private long f_frsize;
	private Object f_blocks;
	private Object f_bfree;
	private Object f_bavail;
	private Object f_files;
	private Object f_ffree;
	private Object f_favail;
	private long f_fsid;
	private long f_flag;
	private long f_namemax;
	
	public statvfs(long f_bsize, long f_frsize, Object f_blocks, Object f_bfree, Object f_bavail, Object f_files, Object f_ffree, Object f_favail, long f_fsid, long f_flag, long f_namemax) {
		setF_bsize(f_bsize);
		setF_frsize(f_frsize);
		setF_blocks(f_blocks);
		setF_bfree(f_bfree);
		setF_bavail(f_bavail);
		setF_files(f_files);
		setF_ffree(f_ffree);
		setF_favail(f_favail);
		setF_fsid(f_fsid);
		setF_flag(f_flag);
		setF_namemax(f_namemax);
	}
	public statvfs() {
	}
	
	public long getF_bsize() {
		return f_bsize;
	}
	public void setF_bsize(long newF_bsize) {
		f_bsize = newF_bsize;
	}
	public long getF_frsize() {
		return f_frsize;
	}
	public void setF_frsize(long newF_frsize) {
		f_frsize = newF_frsize;
	}
	public Object getF_blocks() {
		return f_blocks;
	}
	public void setF_blocks(Object newF_blocks) {
		f_blocks = newF_blocks;
	}
	public Object getF_bfree() {
		return f_bfree;
	}
	public void setF_bfree(Object newF_bfree) {
		f_bfree = newF_bfree;
	}
	public Object getF_bavail() {
		return f_bavail;
	}
	public void setF_bavail(Object newF_bavail) {
		f_bavail = newF_bavail;
	}
	public Object getF_files() {
		return f_files;
	}
	public void setF_files(Object newF_files) {
		f_files = newF_files;
	}
	public Object getF_ffree() {
		return f_ffree;
	}
	public void setF_ffree(Object newF_ffree) {
		f_ffree = newF_ffree;
	}
	public Object getF_favail() {
		return f_favail;
	}
	public void setF_favail(Object newF_favail) {
		f_favail = newF_favail;
	}
	public long getF_fsid() {
		return f_fsid;
	}
	public void setF_fsid(long newF_fsid) {
		f_fsid = newF_fsid;
	}
	public long getF_flag() {
		return f_flag;
	}
	public void setF_flag(long newF_flag) {
		f_flag = newF_flag;
	}
	public long getF_namemax() {
		return f_namemax;
	}
	public void setF_namemax(long newF_namemax) {
		f_namemax = newF_namemax;
	}
}
