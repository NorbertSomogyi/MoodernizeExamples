package application;

public class tree_desc_skip {
	private tree_desc_skip prev;
	private Object ptr;
	
	public tree_desc_skip(tree_desc_skip prev, Object ptr) {
		setPrev(prev);
		setPtr(ptr);
	}
	public tree_desc_skip() {
	}
	
	public tree_desc_skip getPrev() {
		return prev;
	}
	public void setPrev(tree_desc_skip newPrev) {
		prev = newPrev;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
}
