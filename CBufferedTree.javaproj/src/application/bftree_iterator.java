package application;

public class bftree_iterator {
	private Object tree;
	private Object next;
	private int closed;
	
	public bftree_iterator(Object tree, Object next, int closed) {
		setTree(tree);
		setNext(next);
		setClosed(closed);
	}
	public bftree_iterator() {
	}
	
	public Object getTree() {
		return tree;
	}
	public void setTree(Object newTree) {
		tree = newTree;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int newClosed) {
		closed = newClosed;
	}
}
