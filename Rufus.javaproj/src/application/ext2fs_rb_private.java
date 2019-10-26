package application;

public class ext2fs_rb_private {
	private rb_root root;
	private bmap_rb_extent wcursor;
	private bmap_rb_extent rcursor;
	private bmap_rb_extent rcursor_next;
	
	public ext2fs_rb_private(rb_root root, bmap_rb_extent wcursor, bmap_rb_extent rcursor, bmap_rb_extent rcursor_next) {
		setRoot(root);
		setWcursor(wcursor);
		setRcursor(rcursor);
		setRcursor_next(rcursor_next);
	}
	public ext2fs_rb_private() {
	}
	
	public int rb_test_bit(Object bit) {
		bmap_rb_extent rcursor = new bmap_rb_extent();
		bmap_rb_extent next_ext = ((Object)0);
		rb_node parent = ((Object)0);
		rb_node next = new rb_node();
		rb_root generatedRoot = this.getRoot();
		rb_node generatedRb_node = generatedRoot.getRb_node();
		rb_node n = generatedRb_node;
		bmap_rb_extent ext = new bmap_rb_extent();
		bmap_rb_extent generatedRcursor = this.getRcursor();
		rcursor = generatedRcursor;
		if (!rcursor) {
			;
		} 
		Object generatedStart = rcursor.getStart();
		Object generatedCount = rcursor.getCount();
		if (bit >= generatedStart && bit < generatedStart + generatedCount) {
			return 1;
		} 
		bmap_rb_extent generatedRcursor_next = this.getRcursor_next();
		next_ext = generatedRcursor_next;
		rb_node generatedNode = rcursor.getNode();
		bmap_rb_extent bmap_rb_extent = new bmap_rb_extent();
		if (!next_ext) {
			next = generatedNode.ext2fs_rb_next();
			if (next) {
				next_ext = bmap_rb_extent.node_to_extent(next);
			} 
			this.setRcursor_next(next_ext);
		} 
		if (next_ext) {
			if ((bit >= generatedStart + generatedCount) && (bit < generatedStart)) {
				return 0;
			} 
		} 
		this.setRcursor(((Object)0));
		this.setRcursor_next(((Object)0));
		bmap_rb_extent generatedWcursor = this.getWcursor();
		rcursor = generatedWcursor;
		if (!rcursor) {
			;
		} 
		if (bit >= generatedStart && bit < generatedStart + generatedCount) {
			return 1;
		} 
		return 0;
	}
	public int rb_insert_extent(Object start, Object count) {
		rb_root generatedRoot = this.getRoot();
		rb_root root = generatedRoot;
		rb_node generatedRb_node = root.getRb_node();
		rb_node parent = ((Object)0);
		rb_node n = generatedRb_node;
		rb_node new_node = new rb_node();
		rb_node node = new rb_node();
		rb_node next = new rb_node();
		bmap_rb_extent new_ext = new bmap_rb_extent();
		bmap_rb_extent ext = new bmap_rb_extent();
		int retval = 0;
		if (count == 0) {
			return 0;
		} 
		this.setRcursor_next(((Object)0));
		bmap_rb_extent generatedWcursor = this.getWcursor();
		ext = generatedWcursor;
		Object generatedStart = ext.getStart();
		Object generatedCount = ext.getCount();
		if (ext) {
			if (start >= generatedStart && start <= (generatedStart + generatedCount)) {
				;
			} 
		} 
		bmap_rb_extent bmap_rb_extent = new bmap_rb_extent();
		rb_node generatedRb_left = (n).getRb_left();
		rb_node generatedRb_right = (n).getRb_right();
		new_ext.rb_get_new_extent(start, count);
		rb_node generatedNode = new_ext.getNode();
		new_node = generatedNode;
		new_node.ext2fs_rb_link_node(parent, n);
		ModernizedCProgram.ext2fs_rb_insert_color(new_node, root);
		this.setWcursor(new_ext);
		node = new_node.ext2fs_rb_prev();
		if (node) {
			ext = bmap_rb_extent.node_to_extent(node);
			if ((generatedStart + generatedCount) == start) {
				start = generatedStart;
				count += generatedCount;
				ModernizedCProgram.ext2fs_rb_erase(node, root);
				ModernizedCProgram.rb_free_extent(bp, ext);
			} 
		} 
		new_ext.setStart(start);
		new_ext.setCount(count);
		return retval;
	}
	public int rb_remove_extent(Object start, Object count) {
		rb_root generatedRoot = this.getRoot();
		rb_root root = generatedRoot;
		rb_node generatedRb_node = root.getRb_node();
		rb_node parent = ((Object)0);
		rb_node n = generatedRb_node;
		rb_node node = new rb_node();
		bmap_rb_extent ext = new bmap_rb_extent();
		 new_start = new ();
		 new_count = new ();
		int retval = 0;
		if (root.ext2fs_rb_empty_root()) {
			return 0;
		} 
		bmap_rb_extent bmap_rb_extent = new bmap_rb_extent();
		Object generatedStart = ext.getStart();
		rb_node generatedRb_left = (n).getRb_left();
		Object generatedCount = ext.getCount();
		rb_node generatedRb_right = (n).getRb_right();
		rb_node generatedNode = ext.getNode();
		while (n) {
			parent = n;
			ext = bmap_rb_extent.node_to_extent(parent);
			if (start < generatedStart) {
				n = generatedRb_left;
				continue;
			}  else if (start >= (generatedStart + generatedCount)) {
				n = generatedRb_right;
				continue;
			} 
			if ((start > generatedStart) && (start + count) < (generatedStart + generatedCount)) {
				new_start = start + /* We have to split extent into two */count;
				new_count = (generatedStart + generatedCount) - new_start;
				ext.setCount(start - generatedStart);
				bp.rb_insert_extent(new_start, new_count);
				return 1;
			} 
			if ((start + count) >= (generatedStart + generatedCount)) {
				ext.setCount(start - generatedStart);
				retval = 1;
			} 
			if (0 == generatedCount) {
				parent = generatedNode.ext2fs_rb_next();
				ModernizedCProgram.ext2fs_rb_erase(generatedNode, root);
				ModernizedCProgram.rb_free_extent(bp, ext);
				break;
			} 
			if (start == generatedStart) {
				generatedStart += count;
				generatedCount -= count;
				return 1;
			} 
		}
		for (; parent != ((Object)0); parent = /* See if we should delete or truncate extent on the right */node) {
			node = parent.ext2fs_rb_next();
			ext = bmap_rb_extent.node_to_extent(parent);
			if ((generatedStart + generatedCount) <= start) {
				continue;
			} 
			if ((start + count) < generatedStart) {
				break;
			} 
			if ((start + count) >= (generatedStart + generatedCount)) {
				ModernizedCProgram.ext2fs_rb_erase(parent, root);
				ModernizedCProgram.rb_free_extent(bp, ext);
				retval = 1;
				continue;
			} else {
					generatedCount -= ((start + count) - generatedStart);
					ext.setStart(start + count);
					retval = 1;
					break;
			} 
		}
		return retval;
	}
	public rb_root getRoot() {
		return root;
	}
	public void setRoot(rb_root newRoot) {
		root = newRoot;
	}
	public bmap_rb_extent getWcursor() {
		return wcursor;
	}
	public void setWcursor(bmap_rb_extent newWcursor) {
		wcursor = newWcursor;
	}
	public bmap_rb_extent getRcursor() {
		return rcursor;
	}
	public void setRcursor(bmap_rb_extent newRcursor) {
		rcursor = newRcursor;
	}
	public bmap_rb_extent getRcursor_next() {
		return rcursor_next;
	}
	public void setRcursor_next(bmap_rb_extent newRcursor_next) {
		rcursor_next = newRcursor_next;
	}
}
