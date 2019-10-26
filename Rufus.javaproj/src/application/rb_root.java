package application;

public class rb_root {
	private rb_node rb_node;
	
	public rb_root(rb_node rb_node) {
		setRb_node(rb_node);
	}
	public rb_root() {
	}
	
	public int ext2fs_rb_empty_root() {
		rb_node generatedRb_node = this.getRb_node();
		return generatedRb_node == ((Object)0);
	}
	public void rb_free_tree() {
		bmap_rb_extent ext = new bmap_rb_extent();
		rb_node node = new rb_node();
		rb_node next = new rb_node();
		bmap_rb_extent bmap_rb_extent = new bmap_rb_extent();
		rb_node rb_node = new rb_node();
		for (node = rb_node.ext2fs_rb_first(root); node; node = next) {
			next = node.ext2fs_rb_next();
			ext = bmap_rb_extent.node_to_extent(node);
			ModernizedCProgram.ext2fs_rb_erase(node, root);
			ModernizedCProgram.ext2fs_free_mem(ext);
		}
	}
	public void rb_truncate(Object new_max) {
		bmap_rb_extent ext = new bmap_rb_extent();
		rb_node node = new rb_node();
		rb_node rb_node = new rb_node();
		node = rb_node.ext2fs_rb_last(root);
		bmap_rb_extent bmap_rb_extent = new bmap_rb_extent();
		Object generatedStart = ext.getStart();
		Object generatedCount = ext.getCount();
		while (node) {
			ext = bmap_rb_extent.node_to_extent(node);
			if ((generatedStart + generatedCount - 1) <= new_max) {
				break;
			}  else if (generatedStart > new_max) {
				ModernizedCProgram.ext2fs_rb_erase(node, root);
				ModernizedCProgram.ext2fs_free_mem(ext);
				node = rb_node.ext2fs_rb_last(root);
				continue;
			} else {
					ext.setCount(new_max - generatedStart + 1);
			} 
		}
	}
	public rb_node getRb_node() {
		return rb_node;
	}
	public void setRb_node(rb_node newRb_node) {
		rb_node = newRb_node;
	}
}
