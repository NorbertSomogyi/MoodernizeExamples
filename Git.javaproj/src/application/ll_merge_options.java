package application;

public class ll_merge_options {
	private int virtual_ancestor;
	private int variant;
	private int renormalize;
	private int extra_marker_size;
	private long xdl_opts;
	
	public ll_merge_options(int virtual_ancestor, int variant, int renormalize, int extra_marker_size, long xdl_opts) {
		setVirtual_ancestor(virtual_ancestor);
		setVariant(variant);
		setRenormalize(renormalize);
		setExtra_marker_size(extra_marker_size);
		setXdl_opts(xdl_opts);
	}
	public ll_merge_options() {
	}
	
	public int getVirtual_ancestor() {
		return virtual_ancestor;
	}
	public void setVirtual_ancestor(int newVirtual_ancestor) {
		virtual_ancestor = newVirtual_ancestor;
	}
	public int getVariant() {
		return variant;
	}
	public void setVariant(int newVariant) {
		variant = newVariant;
	}
	public int getRenormalize() {
		return renormalize;
	}
	public void setRenormalize(int newRenormalize) {
		renormalize = newRenormalize;
	}
	public int getExtra_marker_size() {
		return extra_marker_size;
	}
	public void setExtra_marker_size(int newExtra_marker_size) {
		extra_marker_size = newExtra_marker_size;
	}
	public long getXdl_opts() {
		return xdl_opts;
	}
	public void setXdl_opts(long newXdl_opts) {
		xdl_opts = newXdl_opts;
	}
}
