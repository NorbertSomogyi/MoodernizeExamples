package application;

/*
 * Copyright (C) 2016 Eistec AB
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup  sys_vfs Virtual File System (VFS) layer
 * @ingroup   sys
 * @brief     Provides an interface for accessing files and directories from
 *            different devices and file systems
 *
 * This layer is modeled as a mix between POSIX syscalls (e.g. open) and the
 * Linux VFS layer implementation, with major reductions in the feature set, in
 * order to fit the resource constrained platforms that RIOT targets.
 *
 * The overall design goals are:
 * - Provide implementations for all newlib "file" syscalls
 * - Keep it simple, do not add every possible file operation from Linux VFS.
 * - Easy to map existing file system implementations for resource constrained systems onto the VFS layer API
 * - Avoid keeping a central `enum` of all file system drivers that has to be kept up to date with external packages etc.
 * - Use POSIX `<errno.h>` numbers as negative return codes for errors, avoid the global `errno` variable.
 * - Only absolute paths to files (no per-process working directory)
 * - No dynamic memory allocation
 *
 *
 * The API should be easy to understand for users who are familiar with the
 * POSIX file functions (open, close, read, write, fstat, lseek etc.)
 *
 * The VFS layer keeps track of mounted file systems and open files, the
 * `vfs_open` function searches the array of mounted file systems and dispatches
 * the call to the file system instance with the longest matching mount point prefix.
 * Subsequent calls to `vfs_read`, `vfs_write`, etc will do a look up in the
 * table of open files and dispatch the call to the correct file system driver
 * for handling.
 *
 * `vfs_mount` takes a string containing the mount point, a file system driver
 * specification (`struct file_system`), and an opaque pointer that only the FS
 * driver knows how to use, which can be used to keep driver parameters in order
 * to allow dynamic handling of multiple devices.
 *
 * @todo VFS layer reference counting and locking for open files and
 *       simultaneous access.
 *
 * @{
 * @file
 * @brief   VFS layer API declarations
 * @author  Joakim Nohlgård <joakim.nohlgard@eistec.se>
 */
/* The stdatomic.h in GCC gives compilation errors with C++
 * see: https://gcc.gnu.org/bugzilla/show_bug.cgi?id=60932
 */
/* Make atomic_int available without namespace specifier */
/* for atomic_int */
/* for struct stat */
/* for off_t etc. */
/* for struct statvfs */
/* restrict is a C99 keyword, not valid in C++, but GCC and Clang have the
 * __restrict__ extension keyword which can be used instead */
/* If the above is not supported by the compiler, you can replace it with an
 * empty definition instead: */
/* #define restrict */
/**
 * @brief Maximum number of simultaneous open files
 */
/**
 * @brief Maximum number of simultaneous open files
 */
/**
 * @brief Size of buffer space in vfs_DIR
 *
 * This space is needed to avoid dynamic memory allocations for some file
 * systems where a single pointer is not enough space for its directory stream
 * state, e.g. SPIFFS.
 *
 * Guidelines:
 *
 * SPIFFS requires a sizeof(spiffs_DIR) (6-16 bytes, depending on target
 * platform and configuration) buffer for its DIR struct.
 *
 * @attention File system developers: If your file system requires a buffer for
 * DIR streams that is larger than a single pointer or @c int variable, ensure
 * that you have a preprocessor check in your header file (so that it is
 * impossible to attempt to mount the file system without running into a
 * compiler error):
 *
 * @attention @code
 * #if VFS_DIR_BUFFER_SIZE < 123
 * #error VFS_DIR_BUFFER_SIZE is too small, at least 123 bytes is required
 * #endif
 * @endcode
 *
 * @attention Put the check in the public header file (.h), do not put the check in the
 * implementation (.c) file.
 */
/**
 * @brief Size of buffer space in vfs_DIR
 *
 * This space is needed to avoid dynamic memory allocations for some file
 * systems where a single pointer is not enough space for its directory stream
 * state, e.g. SPIFFS.
 *
 * Guidelines:
 *
 * SPIFFS requires a sizeof(spiffs_DIR) (6-16 bytes, depending on target
 * platform and configuration) buffer for its DIR struct.
 *
 * @attention File system developers: If your file system requires a buffer for
 * DIR streams that is larger than a single pointer or @c int variable, ensure
 * that you have a preprocessor check in your header file (so that it is
 * impossible to attempt to mount the file system without running into a
 * compiler error):
 *
 * @attention @code
 * #if VFS_DIR_BUFFER_SIZE < 123
 * #error VFS_DIR_BUFFER_SIZE is too small, at least 123 bytes is required
 * #endif
 * @endcode
 *
 * @attention Put the check in the public header file (.h), do not put the check in the
 * implementation (.c) file.
 */
/**
 * @brief Size of buffer space in vfs_file_t
 *
 * Same as with VFS_DIR_BUFFER_SIZE some file systems (e.g. FatFs) require more space
 * to store data about their files.
 *
 *
 * Guidelines are same as with VFS_DIR_BUFFER_SIZE, so add the following snippet
 * to your fs header:
 *
 * @attention @code
 * #if VFS_FILE_BUFFER_SIZE < 123
 * #error VFS_FILE_BUFFER_SIZE is too small, at least 123 bytes is required
 * #endif
 * @endcode
 *
 * @attention Put the check in the public header file (.h), do not put the check in the
 * implementation (.c) file.
 */
/**
 * @brief Size of buffer space in vfs_file_t
 *
 * Same as with VFS_DIR_BUFFER_SIZE some file systems (e.g. FatFs) require more space
 * to store data about their files.
 *
 *
 * Guidelines are same as with VFS_DIR_BUFFER_SIZE, so add the following snippet
 * to your fs header:
 *
 * @attention @code
 * #if VFS_FILE_BUFFER_SIZE < 123
 * #error VFS_FILE_BUFFER_SIZE is too small, at least 123 bytes is required
 * #endif
 * @endcode
 *
 * @attention Put the check in the public header file (.h), do not put the check in the
 * implementation (.c) file.
 */
/**
 * @brief Maximum length of the name in a @c vfs_dirent_t (not including terminating null)
 *
 * Maximum number of bytes in a filename (not including terminating null).
 *
 * Similar to the POSIX macro NAME_MAX
 */
/**
 * @brief Maximum length of the name in a @c vfs_dirent_t (not including terminating null)
 *
 * Maximum number of bytes in a filename (not including terminating null).
 *
 * Similar to the POSIX macro NAME_MAX
 */
/**
 * @brief Used with vfs_bind to bind to any available fd number
 */
/* Forward declarations */
/**
 * @brief struct @c vfs_file_ops typedef
 */
public class vfs_file_ops {
	private Object close;
	private Object fcntl;
	private Object fstat;
	private Object lseek;
	private Object open;
	private Object read;
	private Object write;
	
	public vfs_file_ops(Object close, Object fcntl, Object fstat, Object lseek, Object open, Object read, Object write) {
		setClose(close);
		setFcntl(fcntl);
		setFstat(fstat);
		setLseek(lseek);
		setOpen(open);
		setRead(read);
		setWrite(write);
	}
	public vfs_file_ops() {
	}
	
	public Object getClose() {
		return close;
	}
	public void setClose(Object newClose) {
		close = newClose;
	}
	public Object getFcntl() {
		return fcntl;
	}
	public void setFcntl(Object newFcntl) {
		fcntl = newFcntl;
	}
	public Object getFstat() {
		return fstat;
	}
	public void setFstat(Object newFstat) {
		fstat = newFstat;
	}
	public Object getLseek() {
		return lseek;
	}
	public void setLseek(Object newLseek) {
		lseek = newLseek;
	}
	public Object getOpen() {
		return open;
	}
	public void setOpen(Object newOpen) {
		open = newOpen;
	}
	public Object getRead() {
		return read;
	}
	public void setRead(Object newRead) {
		read = newRead;
	}
	public Object getWrite() {
		return write;
	}
	public void setWrite(Object newWrite) {
		write = newWrite;
	}
}
/**
 * @brief struct @c vfs_dir_ops typedef
 */
/**
     * @brief Close an open file
     *
     * This function must perform any necessary clean ups and flush any internal
     * buffers in the file system driver.
     *
     * If an error occurs, the file will still be considered closed by the VFS
     * layer. Therefore, the proper clean up must still be performed by the file
     * system driver before returning any error code.
     *
     * @note This implementation does not consider @c -EINTR a special return code,
     * the file is still considered closed.
     *
     * @param[in]  filp     pointer to open file
     *
     * @return 0 on success
     * @return <0 on error, the file is considered closed anyway
     */
