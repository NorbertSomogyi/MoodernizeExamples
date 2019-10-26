package application;

/* The OS usually guarantees only one guard page at the bottom of the stack,
   and a page size can be as small as 4096 bytes.  So we cannot safely
   allocate anything larger than 4096 bytes.  Also care for the possibility
   of a few compiler-allocated temporary stack slots.  */
/* alloca is implemented with malloc, so just use malloc.  */
/* SunOS 4.1.x realloc doesn't accept null pointers: pre-Standard C. Sigh. */
public class bin_tree_t {
	private bin_tree_t parent;
	private bin_tree_t left;
	private bin_tree_t right;
	private bin_tree_t first;
	private bin_tree_t next;
	private  token;
	private int node_idx;
	
	public bin_tree_t(bin_tree_t parent, bin_tree_t left, bin_tree_t right, bin_tree_t first, bin_tree_t next,  token, int node_idx) {
		setParent(parent);
		setLeft(left);
		setRight(right);
		setFirst(first);
		setNext(next);
		setToken(token);
		setNode_idx(node_idx);
	}
	public bin_tree_t() {
	}
	
	public bin_tree_t getParent() {
		return parent;
	}
	public void setParent(bin_tree_t newParent) {
		parent = newParent;
	}
	public bin_tree_t getLeft() {
		return left;
	}
	public void setLeft(bin_tree_t newLeft) {
		left = newLeft;
	}
	public bin_tree_t getRight() {
		return right;
	}
	public void setRight(bin_tree_t newRight) {
		right = newRight;
	}
	public bin_tree_t getFirst() {
		return first;
	}
	public void setFirst(bin_tree_t newFirst) {
		first = newFirst;
	}
	public bin_tree_t getNext() {
		return next;
	}
	public void setNext(bin_tree_t newNext) {
		next = newNext;
	}
	public  getToken() {
		return token;
	}
	public void setToken( newToken) {
		token = newToken;
	}
	public int getNode_idx() {
		return node_idx;
	}
	public void setNode_idx(int newNode_idx) {
		node_idx = newNode_idx;
	}
}
