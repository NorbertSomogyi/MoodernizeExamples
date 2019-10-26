package application;

/*
 * blkmap64_rb.c --- Simple rb-tree implementation for bitmaps
 *
 * (C)2010 Red Hat, Inc., Lukas Czerner <lczerner@redhat.com>
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Public
 * License.
 * %End-Header%
 */
public class bmap_rb_extent {
	private rb_node node;
	private Object start;
	private Object count;
	
	public bmap_rb_extent(rb_node node, Object start, Object count) {
		setNode(node);
		setStart(start);
		setCount(count);
	}
	public bmap_rb_extent() {
	}
	
	public bmap_rb_extent node_to_extent(rb_node node) {
		return (bmap_rb_extent)node;
	}
	public void rb_get_new_extent(int start, int count) {
		bmap_rb_extent new_ext = new bmap_rb_extent();
		int retval;
		retval = ModernizedCProgram.ext2fs_get_mem(, new_ext);
		if (retval) {
			.abort();
		} 
		new_ext.setStart(start);
		new_ext.setCount(count);
		ext = new_ext;
	}
	/* #define DEBUG_RB */
	public rb_node getNode() {
		return node;
	}
	public void setNode(rb_node newNode) {
		node = newNode;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
}
/*
	 * This depends on the fact the struct rb_node is at the
	 * beginning of the bmap_rb_extent structure.  We use this
	 * instead of the ext2fs_rb_entry macro because it causes gcc
	 * -Wall to generate a huge amount of noise.
	 */
