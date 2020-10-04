package application;

public class bftree_iterator {
	private bftree tree;
	private payload next;
	private int closed;
	
	public bftree_iterator(bftree tree, payload next, int closed) {
		setTree(tree);
		setNext(next);
		setClosed(closed);
	}
	public bftree_iterator() {
	}
	
	public bftree_iterator bftree_get_iterator(bftree tree) {
		bftree_iterator iter = new bftree_iterator();
		iter = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		iter.setTree(tree);
		iter.setNext((null));
		iter.setClosed(0);
		return iter;
	}
	public void bftree_free_iterator() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(iter);
	}
	public bftree getTree() {
		return tree;
	}
	public void setTree(bftree newTree) {
		tree = newTree;
	}
	public payload getNext() {
		return next;
	}
	public void setNext(payload newNext) {
		next = newNext;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int newClosed) {
		closed = newClosed;
	}
}
