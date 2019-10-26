package application;

public class path_cache {
	private Object cherry_pick_head;
	private Object revert_head;
	private Object squash_msg;
	private Object merge_msg;
	private Object merge_rr;
	private Object merge_mode;
	private Object merge_head;
	private Object fetch_head;
	private Object shallow;
	
	public path_cache(Object cherry_pick_head, Object revert_head, Object squash_msg, Object merge_msg, Object merge_rr, Object merge_mode, Object merge_head, Object fetch_head, Object shallow) {
		setCherry_pick_head(cherry_pick_head);
		setRevert_head(revert_head);
		setSquash_msg(squash_msg);
		setMerge_msg(merge_msg);
		setMerge_rr(merge_rr);
		setMerge_mode(merge_mode);
		setMerge_head(merge_head);
		setFetch_head(fetch_head);
		setShallow(shallow);
	}
	public path_cache() {
	}
	
	public Object getCherry_pick_head() {
		return cherry_pick_head;
	}
	public void setCherry_pick_head(Object newCherry_pick_head) {
		cherry_pick_head = newCherry_pick_head;
	}
	public Object getRevert_head() {
		return revert_head;
	}
	public void setRevert_head(Object newRevert_head) {
		revert_head = newRevert_head;
	}
	public Object getSquash_msg() {
		return squash_msg;
	}
	public void setSquash_msg(Object newSquash_msg) {
		squash_msg = newSquash_msg;
	}
	public Object getMerge_msg() {
		return merge_msg;
	}
	public void setMerge_msg(Object newMerge_msg) {
		merge_msg = newMerge_msg;
	}
	public Object getMerge_rr() {
		return merge_rr;
	}
	public void setMerge_rr(Object newMerge_rr) {
		merge_rr = newMerge_rr;
	}
	public Object getMerge_mode() {
		return merge_mode;
	}
	public void setMerge_mode(Object newMerge_mode) {
		merge_mode = newMerge_mode;
	}
	public Object getMerge_head() {
		return merge_head;
	}
	public void setMerge_head(Object newMerge_head) {
		merge_head = newMerge_head;
	}
	public Object getFetch_head() {
		return fetch_head;
	}
	public void setFetch_head(Object newFetch_head) {
		fetch_head = newFetch_head;
	}
	public Object getShallow() {
		return shallow;
	}
	public void setShallow(Object newShallow) {
		shallow = newShallow;
	}
}
