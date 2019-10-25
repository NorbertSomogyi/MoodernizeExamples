package application;

// ========================== Public API ==========================
// ================================================================
// ========================== Set Type Area =======================
// ================================================================
public class bftree {
	private Object root;
	private Object opts;
	private Object height;
	private int is_migrated;
	private Object del_payload_count;
	private Object put_payload_count;
	
	public bftree(Object root, Object opts, Object height, int is_migrated, Object del_payload_count, Object put_payload_count) {
		setRoot(root);
		setOpts(opts);
		setHeight(height);
		setIs_migrated(is_migrated);
		setDel_payload_count(del_payload_count);
		setPut_payload_count(put_payload_count);
	}
	public bftree() {
	}
	
	public Object getRoot() {
		return root;
	}
	public void setRoot(Object newRoot) {
		root = newRoot;
	}
	public Object getOpts() {
		return opts;
	}
	public void setOpts(Object newOpts) {
		opts = newOpts;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public int getIs_migrated() {
		return is_migrated;
	}
	public void setIs_migrated(int newIs_migrated) {
		is_migrated = newIs_migrated;
	}
	public Object getDel_payload_count() {
		return del_payload_count;
	}
	public void setDel_payload_count(Object newDel_payload_count) {
		del_payload_count = newDel_payload_count;
	}
	public Object getPut_payload_count() {
		return put_payload_count;
	}
	public void setPut_payload_count(Object newPut_payload_count) {
		put_payload_count = newPut_payload_count;
	}
}
