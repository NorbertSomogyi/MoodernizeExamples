package application;

/*
  Red Black Trees
  (C) 1999  Andrea Arcangeli <andrea@suse.de>

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA

  linux/include/linux/rbtree.h

  To use rbtrees you'll have to implement your own insert and search cores.
  This will avoid us to use callbacks and to drop dramatically performances.
  I know it's not the cleaner way,  but in C (not in C++) to get
  performances and genericity...

  Some example of insert and search follows here. The search is a plain
  normal search over an ordered tree. The insert instead must be implemented
  in two steps: First, the code must insert the element in order as a red leaf
  in the tree, and then the support library function rb_insert_color() must
  be called. Such function will do the not trivial work to rebalance the
  rbtree, if necessary.

-----------------------------------------------------------------------
static inline struct page * rb_search_page_cache(struct inode * inode,
						 unsigned long offset)
{
	struct rb_node * n = inode->i_rb_page_cache.rb_node;
	struct page * page;

	while (n)
	{
		page = rb_entry(n, struct page, rb_page_cache);

		if (offset < page->offset)
			n = n->rb_left;
		else if (offset > page->offset)
			n = n->rb_right;
		else
			return page;
	}
	return NULL;
}

static inline struct page * __rb_insert_page_cache(struct inode * inode,
						   unsigned long offset,
						   struct rb_node * node)
{
	struct rb_node ** p = &inode->i_rb_page_cache.rb_node;
	struct rb_node * parent = NULL;
	struct page * page;

	while (*p)
	{
		parent = *p;
		page = rb_entry(parent, struct page, rb_page_cache);

		if (offset < page->offset)
			p = &(*p)->rb_left;
		else if (offset > page->offset)
			p = &(*p)->rb_right;
		else
			return page;
	}

	rb_link_node(node, parent, p);

	return NULL;
}

static inline struct page * rb_insert_page_cache(struct inode * inode,
						 unsigned long offset,
						 struct rb_node * node)
{
	struct page * ret;
	if ((ret = __rb_insert_page_cache(inode, offset, node)))
		goto out;
	rb_insert_color(node, &inode->i_rb_page_cache);
 out:
	return ret;
}
-----------------------------------------------------------------------
*/
/* Find logical next and previous nodes in a tree */
public class rb_node {
	private Object rb_parent_color;
	private rb_node rb_right;
	private rb_node rb_left;
	
	public rb_node(Object rb_parent_color, rb_node rb_right, rb_node rb_left) {
		setRb_parent_color(rb_parent_color);
		setRb_right(rb_right);
		setRb_left(rb_left);
	}
	public rb_node() {
	}
	
	public void ext2fs_rb_set_parent(rb_node p) {
		Object generatedRb_parent_color = this.getRb_parent_color();
		this.setRb_parent_color((generatedRb_parent_color & 3) | (uintptr_t)p);
	}
	public void ext2fs_rb_set_color(int color) {
		Object generatedRb_parent_color = this.getRb_parent_color();
		this.setRb_parent_color((generatedRb_parent_color & ~1) | color);
	}
	public int ext2fs_rb_empty_node() {
		Object generatedRb_parent_color = (node).getRb_parent_color();
		return ((rb_node)(generatedRb_parent_color & ~3)) == node;
	}
	public void ext2fs_rb_clear_node() {
		node.ext2fs_rb_set_parent(node);
	}
	public void ext2fs_rb_link_node(rb_node parent, rb_node rb_link) {
		this.setRb_parent_color((uintptr_t)parent);
		this.setRb_left(this.setRb_right(((Object)0)));
		rb_link = node/* _LINUX_RBTREE_H */;
	}
	public void ext2fs_rb_augment_path(Object func, Object data) {
		rb_node parent = new rb_node();
		Object generatedRb_parent_color = (node).getRb_parent_color();
		parent = ((rb_node)(generatedRb_parent_color & ~3));
		if (!parent) {
			return /*Error: Unsupported expression*/;
		} 
		rb_node generatedRb_left = parent.getRb_left();
		rb_node generatedRb_right = parent.getRb_right();
		if (node == generatedRb_left && generatedRb_right) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/func(generatedRb_right, data);
		}  else if (generatedRb_left) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/func(generatedRb_left, data);
		} 
		node = parent;
		/*
		 * after inserting @node into the tree, update the tree to account for
		 * both the new entry and any damage done by rebalance
		 */;/*
		 * after inserting @node into the tree, update the tree to account for
		 * both the new entry and any damage done by rebalance
		 */
	}
	public void ext2fs_rb_augment_insert(Object func, Object data) {
		rb_node generatedRb_left = this.getRb_left();
		rb_node generatedRb_right = this.getRb_right();
		if (generatedRb_left) {
			node = generatedRb_left;
		}  else if (generatedRb_right) {
			node = generatedRb_right;
		} 
		node.ext2fs_rb_augment_path(func, data/*
		 * before removing the node, find the deepest node on the rebalance path
		 * that will still be there after @node gets removed
		 */);
	}
	public rb_node ext2fs_rb_augment_erase_begin() {
		rb_node deepest = new rb_node();
		rb_node generatedRb_right = this.getRb_right();
		rb_node generatedRb_left = this.getRb_left();
		Object generatedRb_parent_color = (node).getRb_parent_color();
		if (!generatedRb_right && !generatedRb_left) {
			deepest = ((rb_node)(generatedRb_parent_color & ~3));
		}  else if (!generatedRb_right) {
			deepest = generatedRb_left;
		}  else if (!generatedRb_left) {
			deepest = generatedRb_right;
		} else {
				deepest = node.ext2fs_rb_next();
				if (!deepest) {
					return ((Object)0);
				} 
				if (generatedRb_right) {
					deepest = generatedRb_right;
				}  else if (((rb_node)(generatedRb_parent_color & ~3)) != node) {
					deepest = ((rb_node)(generatedRb_parent_color & ~3));
				} 
		} 
		return deepest/*
		 * after removal, update the tree to account for the removed entry
		 * and any rebalance damage.
		 */;
	}
	public void ext2fs_rb_augment_erase_end(Object func, Object data) {
		if (node) {
			node.ext2fs_rb_augment_path(func, data/*
			 * This function returns the first node (in sort order) of the tree.
			 */);
		} 
	}
	public rb_node ext2fs_rb_first(Object root) {
		rb_node n = new rb_node();
		n = root.getRb_node();
		if (!n) {
			return ((Object)0);
		} 
		rb_node generatedRb_left = n.getRb_left();
		while (generatedRb_left) {
			n = generatedRb_left;
		}
		return n;
	}
	public rb_node ext2fs_rb_last(Object root) {
		rb_node n = new rb_node();
		n = root.getRb_node();
		if (!n) {
			return ((Object)0);
		} 
		rb_node generatedRb_right = n.getRb_right();
		while (generatedRb_right) {
			n = generatedRb_right;
		}
		return n;
	}
	public rb_node ext2fs_rb_next() {
		rb_node parent = new rb_node();
		Object generatedRb_parent_color = (node).getRb_parent_color();
		if (((rb_node)(generatedRb_parent_color & ~3)) == node) {
			return ((Object)0);
		} 
		rb_node generatedRb_right = this.getRb_right();
		rb_node generatedRb_left = this.getRb_left();
		if (generatedRb_right) {
			node = generatedRb_right;
			while (generatedRb_left) {
				node = generatedRb_left;
			}
			return (rb_node)node/* No right-hand children.  Everything down and left is
				   smaller than us, so any 'next' node must be in the general
				   direction of our parent. Go up the tree; any time the
				   ancestor is a right-hand child of its parent, keep going
				   up. First time it's a left-hand child of its parent, said
				   parent is our 'next' node. */;
		} 
		while ((parent = ((rb_node)(generatedRb_parent_color & ~3))) && node == generatedRb_right) {
			node = parent;
		}
		return parent;
	}
	public rb_node ext2fs_rb_prev() {
		rb_node parent = new rb_node();
		Object generatedRb_parent_color = (node).getRb_parent_color();
		if (((rb_node)(generatedRb_parent_color & ~3)) == node) {
			return ((Object)0);
		} 
		rb_node generatedRb_left = this.getRb_left();
		rb_node generatedRb_right = this.getRb_right();
		if (generatedRb_left) {
			node = generatedRb_left;
			while (generatedRb_right) {
				node = generatedRb_right;
			}
			return (rb_node)node;
		} 
		while ((parent = ((rb_node)(generatedRb_parent_color & ~3))) && node == generatedRb_left) {
			node = parent;
		}
		return parent;
	}
	public Object getRb_parent_color() {
		return rb_parent_color;
	}
	public void setRb_parent_color(Object newRb_parent_color) {
		rb_parent_color = newRb_parent_color;
	}
	public rb_node getRb_right() {
		return rb_right;
	}
	public void setRb_right(rb_node newRb_right) {
		rb_right = newRb_right;
	}
	public rb_node getRb_left() {
		return rb_left;
	}
	public void setRb_left(rb_node newRb_left) {
		rb_left = newRb_left;
	}
}
/* The alignment might seem pointless, but allegedly CRIS needs it */
