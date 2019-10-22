package application;

public class bftree_iterator {
	private bftree[] tree;
	private payload[] next;
	private int closed;
	
	public bftree_iterator(bftree[] tree, payload[] next, int closed) {
		setTree(tree);
		setNext(next);
		setClosed(closed);
	}
	public bftree_iterator() {
	}
	
	public bftree_iterator[] bftree_get_iterator(bftree[] tree) {
		bftree_iterator iter = new bftree_iterator();
		iter = .malloc();
		iter.setTree(tree);
		iter.setNext(((Object)0));
		iter.setClosed(0);
		return iter;
	}
	public void bftree_free_iterator(bftree_iterator[] iter) {
		.free(iter);
	}
	public bftree[] getTree() {
		return tree;
	}
	public void setTree(bftree[] newTree) {
		tree = newTree;
	}
	public payload[] getNext() {
		return next;
	}
	public void setNext(payload[] newNext) {
		next = newNext;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int newClosed) {
		closed = newClosed;
	}
}
