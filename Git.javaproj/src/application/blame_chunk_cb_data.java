package application;

public class blame_chunk_cb_data {
	private blame_origin parent;
	private blame_origin target;
	private long offset;
	private int ignore_diffs;
	private blame_entry dstq;
	private blame_entry srcq;
	
	public blame_chunk_cb_data(blame_origin parent, blame_origin target, long offset, int ignore_diffs, blame_entry dstq, blame_entry srcq) {
		setParent(parent);
		setTarget(target);
		setOffset(offset);
		setIgnore_diffs(ignore_diffs);
		setDstq(dstq);
		setSrcq(srcq);
	}
	public blame_chunk_cb_data() {
	}
	
	public blame_origin getParent() {
		return parent;
	}
	public void setParent(blame_origin newParent) {
		parent = newParent;
	}
	public blame_origin getTarget() {
		return target;
	}
	public void setTarget(blame_origin newTarget) {
		target = newTarget;
	}
	public long getOffset() {
		return offset;
	}
	public void setOffset(long newOffset) {
		offset = newOffset;
	}
	public int getIgnore_diffs() {
		return ignore_diffs;
	}
	public void setIgnore_diffs(int newIgnore_diffs) {
		ignore_diffs = newIgnore_diffs;
	}
	public blame_entry getDstq() {
		return dstq;
	}
	public void setDstq(blame_entry newDstq) {
		dstq = newDstq;
	}
	public blame_entry getSrcq() {
		return srcq;
	}
	public void setSrcq(blame_entry newSrcq) {
		srcq = newSrcq;
	}
}
