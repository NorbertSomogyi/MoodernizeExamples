package application;

///////////////////////////////////////////////////////////////////////////////
//
/// \file       index.c
/// \brief      Handling of .xz Indexes and some other Stream information
//
//  Author:     Lasse Collin
//
//  This file has been put into the public domain.
//  You can do whatever you want with this file.
//
///////////////////////////////////////////////////////////////////////////////
/// \brief      How many Records to allocate at once
///
/// This should be big enough to avoid making lots of tiny allocations
/// but small enough to avoid too much unused memory at once.
/// \brief      How many Records can be allocated at once at maximum
/// \brief      Base structure for index_stream and index_group structures
public class index_tree_node_s {
	private Object uncompressed_base;
	private Object compressed_base;
	private index_tree_node_s parent;
	private index_tree_node_s left;
	private index_tree_node_s right;
	
	public index_tree_node_s(Object uncompressed_base, Object compressed_base, index_tree_node_s parent, index_tree_node_s left, index_tree_node_s right) {
		setUncompressed_base(uncompressed_base);
		setCompressed_base(compressed_base);
		setParent(parent);
		setLeft(left);
		setRight(right);
	}
	public index_tree_node_s() {
	}
	
	/// Helper for index_tree_end()
	public void index_tree_node_end(Object allocator, Object free_func) {
		index_tree_node_s generatedLeft = this.getLeft();
		// The tree won't ever be very huge, so recursion should be fine.// 20 levels in the tree is likely quite a lot already in practice.if (generatedLeft != ((Object)0)) {
			generatedLeft.index_tree_node_end(allocator, free_func);
		} 
		index_tree_node_s generatedRight = this.getRight();
		if (generatedRight != ((Object)0)) {
			generatedRight.index_tree_node_end(allocator, free_func);
		} 
		if (free_func != ((Object)0)) {
			.free_func(node, allocator);
		} 
		ModernizedCProgram.lzma_free(node, allocator);
		return ;/// Free the meory allocated for a tree. If free_func is not NULL,
	}
	public Object getUncompressed_base() {
		return uncompressed_base;
	}
	public void setUncompressed_base(Object newUncompressed_base) {
		uncompressed_base = newUncompressed_base;
	}
	public Object getCompressed_base() {
		return compressed_base;
	}
	public void setCompressed_base(Object newCompressed_base) {
		compressed_base = newCompressed_base;
	}
	public index_tree_node_s getParent() {
		return parent;
	}
	public void setParent(index_tree_node_s newParent) {
		parent = newParent;
	}
	public index_tree_node_s getLeft() {
		return left;
	}
	public void setLeft(index_tree_node_s newLeft) {
		left = newLeft;
	}
	public index_tree_node_s getRight() {
		return right;
	}
	public void setRight(index_tree_node_s newRight) {
		right = newRight;
	}
}
/// Uncompressed start offset of this Stream (relative to the
/// beginning of the file) or Block (relative to the beginning
