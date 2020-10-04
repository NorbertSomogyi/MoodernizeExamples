package application;

public class archive_handle_t {
	private int ah_flags;
	private int src_fd;
	private Object accept;
	private Object reject;
	private Object passed;
	private file_header_t file_header;
	private Object offset;
	
	public archive_handle_t(int ah_flags, int src_fd, Object accept, Object reject, Object passed, file_header_t file_header, Object offset) {
		setAh_flags(ah_flags);
		setSrc_fd(src_fd);
		setAccept(accept);
		setReject(reject);
		setPassed(passed);
		setFile_header(file_header);
		setOffset(offset);
	}
	public archive_handle_t() {
	}
	
	/* vi: set sw=4 ts=4: */
	/*
	 * Copyright (C) 2002 by Glenn McGrath
	 *
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	/* Accept any non-null name, its not really a filter at all */
	public byte filter_accept_all() {
		file_header_t generatedFile_header = this.getFile_header();
		Byte generatedName = generatedFile_header.getName();
		if (generatedName) {
			return 0;
		} 
		return 1;
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Copyright (C) 2002 by Glenn McGrath
	 *
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	/*
	 * Accept names that are in the accept list, ignoring reject list.
	 */
	public byte filter_accept_list() {
		Object generatedAccept = this.getAccept();
		file_header_t generatedFile_header = this.getFile_header();
		Byte generatedName = generatedFile_header.getName();
		if (ModernizedCProgram.find_list_entry(generatedAccept, generatedName)) {
			return 0;
		} 
		return 1;
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	public archive_handle_t init_handle() {
		archive_handle_t archive_handle = new archive_handle_t();
		archive_handle = /*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, /* Initialize default values */1);
		archive_handle.setFile_header(/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1));
		archive_handle.setAction_header(ModernizedCProgram.header_skip);
		archive_handle.setAction_data(ModernizedCProgram.data_skip);
		archive_handle.setFilter(ModernizedCProgram.filter_accept_all);
		archive_handle.setSeek(ModernizedCProgram.seek_by_jump);
		return archive_handle;
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	public void data_extract_all() {
		file_header_t generatedFile_header = this.getFile_header();
		file_header_t file_header = generatedFile_header;
		int dst_fd;
		int res;
		/* setfscreatecon is 4 syscalls, avoid if possible */
		int generatedAh_flags = this.getAh_flags();
		Byte generatedName = file_header.getName();
		if (generatedAh_flags & (1 << 1)) {
			Byte slash = /*Error: Function owner not recognized*/strrchr(generatedName, (byte)'/');
			if (slash) {
				slash = (byte)'\0';
				(null).SHCreateDirectoryExU((null), generatedName);
				slash = (byte)'/';
			} 
		} 
		Object generatedMode = file_header.getMode();
		Byte generatedLink_target = file_header.getLink_target();
		Object generatedSize = file_header.getSize();
		Object generatedSt_mtime = existing_sb.getSt_mtime();
		Object generatedMtime = file_header.getMtime();
		if (generatedAh_flags & (1 << 2)) {
			if (!(((generatedMode) & -1024) == /* Remove the entry if it exists */-1024/* Is it hardlink?
						 * We encode hard links as regular files of size 0 with a symlink */)) {
				if ((((generatedMode) & -1024) == -1024) && generatedLink_target && generatedSize == 0/* Ugly special case:
								 * tar cf t.tar hardlink1 hardlink2 hardlink1
								 * results in this tarball structure:
								 * hardlink1
								 * hardlink2 -> hardlink1
								 * hardlink1 -> hardlink1 <== !!!
								 */) {
					if (/*Error: Function owner not recognized*/strcmp(generatedLink_target, generatedName) == 0) {
						;
					} 
				} 
				if (/*Error: Function owner not recognized*/_unlink(generatedName) == -/* Proceed with deleting */1 && (/*Error: Function owner not recognized*/_errno()) != 2) {
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't remove old file %s", generatedName);
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't remove old file %s", generatedName);
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
					} while (0);
				} 
			} 
		}  else if (generatedAh_flags & (1 << 4/* Remove the existing entry if its older than the extracted entry */)) {
			stat existing_sb = new stat();
			if (/*Error: Function owner not recognized*/stat(generatedName, existing_sb) == -1) {
				if ((/*Error: Function owner not recognized*/_errno()) != 2) {
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't stat old file");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't stat old file");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
					} while (0);
				} 
			}  else if (generatedSt_mtime >= generatedMtime) {
				if (!(generatedAh_flags & (1 << 3)) && !(((generatedMode) & -1024) == -1024)) {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: %s not created: newer or same age file exists", generatedName);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: %s not created: newer or same age file exists", generatedName);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
				} 
				archive_handle.data_skip();
				;
			}  else if ((/*Error: Function owner not recognized*/_unlink(generatedName) == -1) && ((/*Error: Function owner not recognized*/_errno()) != 21)) {
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't remove old file %s", generatedName);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't remove old file %s", generatedName);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
				} while (0);
			} 
		} 
		if ((((generatedMode) & -1024) == /* Handle hard links separately
			 * We encode hard links as regular files of size 0 with a symlink */-1024) && generatedLink_target && generatedSize == 0) {
			res = ModernizedCProgram.link(generatedLink_target, generatedName);
			if ((res == -1) && !(generatedAh_flags & (1 << 3))) {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't create %slink from %s to %s", "hard", generatedName, generatedLink_target);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't create %slink from %s to %s", "hard", generatedName, generatedLink_target);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0);
			} 
			;
		} 
		Object generatedDevice = file_header.getDevice();
		switch (generatedMode & /* Create the filesystem entry */-1024) {
		case -1024/* Regular file */:
				{ 
					Byte dst_name;
					int flags = 1 | -1024 | -1024;
					if (generatedAh_flags & (1 << 8)) {
						flags = 1 | -1024 | -1024;
					} 
					dst_name = generatedName;
					if (/*Error: Function owner not recognized*/_sopen_s(dst_fd, dst_name, flags, -1024, generatedMode) != /* rpm-style temp file name */0) {
						do {
							do {
								if (ModernizedCProgram.bled_printf != (null)) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't open file %s", dst_name);
								} else {
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't open file %s", dst_name);
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
								} 
							} while (0);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
						} while (0);
					} 
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: Not implemented");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: Not implemented");
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_close(dst_fd);
					break;
				}
		case -1024:
		case -1024:
		case -1024:
		case -1024:
				res = ModernizedCProgram._mkdirU(generatedName);
				if ((res == -1) && ((/*Error: Function owner not recognized*/_errno()) != /* btw, Linux doesn't return this */21) && ((/*Error: Function owner not recognized*/_errno()) != 17) && !(generatedAh_flags & (1 << 3))) {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't make dir %s", generatedName);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't make dir %s", generatedName);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
				} 
				break;
		case -1024/* Symlink */:
				res = ModernizedCProgram.symlink(generatedLink_target, generatedName);
				if ((res == -1) && !(generatedAh_flags & (1 << 3))) {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't create %slink from %s to %s", "sym", generatedName, generatedLink_target);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't create %slink from %s to %s", "sym", generatedName, generatedLink_target);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
				} 
				break;
		case -1024:
				res = ModernizedCProgram.mknod(generatedName, generatedMode, generatedDevice);
				if ((res == -1) && !(generatedAh_flags & (1 << 3))) {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: can't create node %s", generatedName);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: can't create node %s", generatedName);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
				} 
				break;
		default:
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: unrecognized file type");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: unrecognized file type");
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
				} while (0);
		}
		Object generatedUid = file_header.getUid();
		Object generatedGid = file_header.getGid();
		if (!(((generatedMode) & -1024) == -1024)) {
			if (!(generatedAh_flags & (1 << 5))) {
				uid_t uid = generatedUid;
				gid_t gid = generatedGid;
				ModernizedCProgram.chown(generatedName, uid, /* GNU tar 1.15.1 uses chown, not lchown */gid/* uclibc has no lchmod, glibc is even stranger -
						 * it has lchmod which seems to do nothing!
						 * so we use chmod... */);
			} 
			if (!(generatedAh_flags & (1 << 6))) {
				(Object)/*Error: Function owner not recognized*/_chmod(generatedName, generatedMode);
			} 
			if (generatedAh_flags & (1 << 0)) {
				timeval[] t = new timeval();
				t[1].setTv_sec(t[0].setTv_sec((long)generatedMtime));
				t[1].setTv_usec(t[0].setTv_usec(0));
				ModernizedCProgram.utimes(generatedName, t);
			} 
		} 
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	public void data_align(int boundary) {
		Object generatedOffset = this.getOffset();
		int skip_amount = (boundary - (generatedOffset % boundary)) % boundary;
		int generatedSrc_fd = this.getSrc_fd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSrc_fd, skip_amount);
		generatedOffset += skip_amount;
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	public void data_skip() {
		int generatedSrc_fd = this.getSrc_fd();
		file_header_t generatedFile_header = this.getFile_header();
		Object generatedSize = generatedFile_header.getSize();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSrc_fd, generatedSize);
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Copyright (C) 2002 by Glenn McGrath
	 *
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	/*
	 * Accept names that are in the accept list and not in the reject list
	 */
	public byte filter_accept_reject_list() {
		Byte key;
		llist_t reject_entry = new llist_t();
		llist_t accept_entry = new llist_t();
		file_header_t generatedFile_header = this.getFile_header();
		Byte generatedName = generatedFile_header.getName();
		key = generatedName;
		Object generatedReject = this.getReject();
		reject_entry = ModernizedCProgram.find_list_entry2(generatedReject, /* If the key is in a reject list fail */key);
		if (reject_entry) {
			return 1;
		} 
		Object generatedAccept = this.getAccept();
		if (generatedAccept) {
			accept_entry = ModernizedCProgram.find_list_entry2(generatedAccept, key);
			if (!accept_entry) {
				return 1;
			} 
		} 
		return /* Accepted */0;
	}
	public int getAh_flags() {
		return ah_flags;
	}
	public void setAh_flags(int newAh_flags) {
		ah_flags = newAh_flags;
	}
	public int getSrc_fd() {
		return src_fd;
	}
	public void setSrc_fd(int newSrc_fd) {
		src_fd = newSrc_fd;
	}
	public Object getAccept() {
		return accept;
	}
	public void setAccept(Object newAccept) {
		accept = newAccept;
	}
	public Object getReject() {
		return reject;
	}
	public void setReject(Object newReject) {
		reject = newReject;
	}
	public Object getPassed() {
		return passed;
	}
	public void setPassed(Object newPassed) {
		passed = newPassed;
	}
	public file_header_t getFile_header() {
		return file_header;
	}
	public void setFile_header(file_header_t newFile_header) {
		file_header = newFile_header;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
}
/* Flags. 1st since it is most used member */
