package application;

public class dir_state {
	private Object tree;
	private long size;
	private object_id oid;
	
	public dir_state(Object tree, long size, object_id oid) {
		setTree(tree);
		setSize(size);
		setOid(oid);
	}
	public dir_state() {
	}
	
	public Object getTree() {
		return tree;
	}
	public void setTree(Object newTree) {
		tree = newTree;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
