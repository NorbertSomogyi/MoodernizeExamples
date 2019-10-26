package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/* for debugging */
/* #define CHECK(c, s)	do { if (c) emsg((s)); } while (0) */
/**/
/*
 * memline.c: Contains the functions for appending, deleting and changing the
 * text lines. The memfile functions are used to store the information in
 * blocks of memory, backed up by a file. The structure of the information is
 * a tree.  The root of the tree is a pointer block. The leaves of the tree
 * are data blocks. In between may be several layers of pointer blocks,
 * forming branches.
 *
 * Three types of blocks are used:
 * - Block nr 0 contains information for recovery
 * - Pointer blocks contain list of pointers to other blocks.
 * - Data blocks contain the actual text.
 *
 * Block nr 0 contains the block0 structure (see below).
 *
 * Block nr 1 is the first pointer block. It is the root of the tree.
 * Other pointer blocks are branches.
 *
 *  If a line is too big to fit in a single page, the block containing that
 *  line is made big enough to hold the line. It may span several pages.
 *  Otherwise all blocks are one page.
 *
 *  A data block that was filled when starting to edit a file and was not
 *  changed since then, can have a negative block number. This means that it
 *  has not yet been assigned a place in the file. When recovering, the lines
 *  in this data block can be read from the original file. When the block is
 *  changed (lines appended/deleted/changed) or when it is flushed it gets a
 *  positive number. Use mf_trans_del() to get the new number, before calling
 *  mf_get().
 */
/* it's in os_unix.h for Unix */
/* for Open() and Close() */
/* contents of the first block */
/*
 * Restrict the numbers to 32 bits, otherwise most compilers will complain.
 * This won't detect a 64 bit machine that only swaps a byte in the top 32
 * bits, but that is crazy anyway.
 */
/*
 * Block zero holds all info about the swap file.
 *
 * NOTE: DEFINITION OF BLOCK 0 SHOULD NOT CHANGE! It would make all existing
 * swap files unusable!
 *
 * If size of block0 changes anyway, adjust MIN_SWAP_PAGE_SIZE in vim.h!!
 *
 * This block is built up of single bytes, to make it portable across
 * different machines. b0_magic_* is used to check the byte order and size of
 * variables, because the rest of the swap file is not portable.
 */
public class block0 {
	private Object b0_id;
	private Object b0_version;
	private Object b0_page_size;
	private Object b0_mtime;
	private Object b0_ino;
	private Object b0_pid;
	private Object b0_uname;
	private Object b0_hname;
	private Object b0_fname;
	private long b0_magic_long;
	private int b0_magic_int;
	private int b0_magic_short;
	private Object b0_magic_char;
	
	public block0(Object b0_id, Object b0_version, Object b0_page_size, Object b0_mtime, Object b0_ino, Object b0_pid, Object b0_uname, Object b0_hname, Object b0_fname, long b0_magic_long, int b0_magic_int, int b0_magic_short, Object b0_magic_char) {
		setB0_id(b0_id);
		setB0_version(b0_version);
		setB0_page_size(b0_page_size);
		setB0_mtime(b0_mtime);
		setB0_ino(b0_ino);
		setB0_pid(b0_pid);
		setB0_uname(b0_uname);
		setB0_hname(b0_hname);
		setB0_fname(b0_fname);
		setB0_magic_long(b0_magic_long);
		setB0_magic_int(b0_magic_int);
		setB0_magic_short(b0_magic_short);
		setB0_magic_char(b0_magic_char);
	}
	public block0() {
	}
	
	public int ml_check_b0_id() {
		Object generatedB0_id = this.getB0_id();
		if (generatedB0_id[0] != (byte)'b' || (generatedB0_id[1] != (byte)'0' && generatedB0_id[1] != (byte)'c' && generatedB0_id[1] != (byte)'C' && generatedB0_id[1] != (byte)'d')) {
			return 0;
		} 
		return 1/*
		 * Update the timestamp or the B0_SAME_DIR flag of the .swp file.
		 */;
	}
	public int b0_magic_wrong() {
		long generatedB0_magic_long = this.getB0_magic_long();
		int generatedB0_magic_int = this.getB0_magic_int();
		int generatedB0_magic_short = this.getB0_magic_short();
		Object generatedB0_magic_char = this.getB0_magic_char();
		return (generatedB0_magic_long != (long)-1024 || generatedB0_magic_int != (int)-1024 || generatedB0_magic_short != (int)-1024 || generatedB0_magic_char != -1024/*
		 * Compare current file name with file name from swap file.
		 * Try to use inode numbers when possible.
		 * Return non-zero when files are different.
		 *
		 * When comparing file names a few things have to be taken into consideration:
		 * - When working over a network the full path of a file depends on the host.
		 *   We check the inode number if possible.  It is not 100% reliable though,
		 *   because the device number cannot be used over a network.
		 * - When a file does not exist yet (editing a new file) there is no inode
		 *   number.
		 * - The file name in a swap file may not be valid on the current host.  The
		 *   "~user" form is used whenever possible to avoid this.
		 *
		 * This is getting complicated, let's make a table:
		 *
		 *		ino_c  ino_s  fname_c  fname_s	differ =
		 *
		 * both files exist -> compare inode numbers:
		 *		!= 0   != 0	X	 X	ino_c != ino_s
		 *
		 * inode number(s) unknown, file names available -> compare file names
		 *		== 0	X	OK	 OK	fname_c != fname_s
		 *		 X     == 0	OK	 OK	fname_c != fname_s
		 *
		 * current file doesn't exist, file for swap file exist, file name(s) not
		 * available -> probably different
		 *		== 0   != 0    FAIL	 X	TRUE
		 *		== 0   != 0	X	FAIL	TRUE
		 *
		 * current file exists, inode for swap unknown, file name(s) not
		 * available -> probably different
		 *		!= 0   == 0    FAIL	 X	TRUE
		 *		!= 0   == 0	X	FAIL	TRUE
		 *
		 * current file doesn't exist, inode for swap unknown, one file name not
		 * available -> probably different
		 *		== 0   == 0    FAIL	 OK	TRUE
		 *		== 0   == 0	OK	FAIL	TRUE
		 *
		 * current file doesn't exist, inode for swap unknown, both file names not
		 * available -> compare file names
		 *		== 0   == 0    FAIL	FAIL	fname_c != fname_s
		 *
		 * Note that when the ino_t is 64 bits, only the last 32 will be used.  This
		 * can't be changed without making the block 0 incompatible with 32 bit
		 * versions.
		 */);
	}
	public Object getB0_id() {
		return b0_id;
	}
	public void setB0_id(Object newB0_id) {
		b0_id = newB0_id;
	}
	public Object getB0_version() {
		return b0_version;
	}
	public void setB0_version(Object newB0_version) {
		b0_version = newB0_version;
	}
	public Object getB0_page_size() {
		return b0_page_size;
	}
	public void setB0_page_size(Object newB0_page_size) {
		b0_page_size = newB0_page_size;
	}
	public Object getB0_mtime() {
		return b0_mtime;
	}
	public void setB0_mtime(Object newB0_mtime) {
		b0_mtime = newB0_mtime;
	}
	public Object getB0_ino() {
		return b0_ino;
	}
	public void setB0_ino(Object newB0_ino) {
		b0_ino = newB0_ino;
	}
	public Object getB0_pid() {
		return b0_pid;
	}
	public void setB0_pid(Object newB0_pid) {
		b0_pid = newB0_pid;
	}
	public Object getB0_uname() {
		return b0_uname;
	}
	public void setB0_uname(Object newB0_uname) {
		b0_uname = newB0_uname;
	}
	public Object getB0_hname() {
		return b0_hname;
	}
	public void setB0_hname(Object newB0_hname) {
		b0_hname = newB0_hname;
	}
	public Object getB0_fname() {
		return b0_fname;
	}
	public void setB0_fname(Object newB0_fname) {
		b0_fname = newB0_fname;
	}
	public long getB0_magic_long() {
		return b0_magic_long;
	}
	public void setB0_magic_long(long newB0_magic_long) {
		b0_magic_long = newB0_magic_long;
	}
	public int getB0_magic_int() {
		return b0_magic_int;
	}
	public void setB0_magic_int(int newB0_magic_int) {
		b0_magic_int = newB0_magic_int;
	}
	public int getB0_magic_short() {
		return b0_magic_short;
	}
	public void setB0_magic_short(int newB0_magic_short) {
		b0_magic_short = newB0_magic_short;
	}
	public Object getB0_magic_char() {
		return b0_magic_char;
	}
	public void setB0_magic_char(Object newB0_magic_char) {
		b0_magic_char = newB0_magic_char;
	}
}
