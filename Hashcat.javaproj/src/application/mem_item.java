package application;

/* infcover.c -- test zlib's inflate routines with full code coverage
 * Copyright (C) 2011, 2016 Mark Adler
 * For conditions of distribution and use, see copyright notice in zlib.h
 */
/* to use, do: ./configure --cover && make cover */
/* get definition of internal structure so we can mess with it (see pull()),
   and so we can call inflate_trees() (see cover5()) */
/* -- memory tracking routines -- */
/*
   These memory tracking routines are provided to zlib and track all of zlib's
   allocations and deallocations, check for LIFO operations, keep a current
   and high water mark of total bytes requested, optionally set a limit on the
   total memory that can be allocated, and when done check for memory leaks.

   They are used as follows:

   z_stream strm;
   mem_setup(&strm)         initializes the memory tracking and sets the
                            zalloc, zfree, and opaque members of strm to use
                            memory tracking for all zlib operations on strm
   mem_limit(&strm, limit)  sets a limit on the total bytes requested -- a
                            request that exceeds this limit will result in an
                            allocation failure (returns NULL) -- setting the
                            limit to zero means no limit, which is the default
                            after mem_setup()
   mem_used(&strm, "msg")   prints to stderr "msg" and the total bytes used
   mem_high(&strm, "msg")   prints to stderr "msg" and the high water mark
   mem_done(&strm, "msg")   ends memory tracking, releases all allocations
                            for the tracking as well as leaked zlib blocks, if
                            any.  If there was anything unusual, such as leaked
                            blocks, non-FIFO frees, or frees of addresses not
                            allocated, then "msg" and information about the
                            problem is printed to stderr.  If everything is
                            normal, nothing is printed. mem_done resets the
                            strm members to Z_NULL to use the default memory
                            allocation routines on the next zlib initialization
                            using strm.
 */
/* these items are strung together in a linked list, one for each allocation */
/* pointer to next item in list, or NULL */
/* pointer to first item in list, or NULL */
public class mem_item {
	private Object ptr;
	private Object size;
	private mem_item next;
	
	public mem_item(Object ptr, Object size, mem_item next) {
		setPtr(ptr);
		setSize(size);
		setNext(next);
	}
	public mem_item() {
	}
	
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public mem_item getNext() {
		return next;
	}
	public void setNext(mem_item newNext) {
		next = newNext;
	}
}
