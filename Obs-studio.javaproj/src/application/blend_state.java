package application;

public class blend_state {
	private Object enabled;
	private gs_blend_type src_c;
	private gs_blend_type dest_c;
	private gs_blend_type src_a;
	private gs_blend_type dest_a;
	
	public blend_state(Object enabled, gs_blend_type src_c, gs_blend_type dest_c, gs_blend_type src_a, gs_blend_type dest_a) {
		setEnabled(enabled);
		setSrc_c(src_c);
		setDest_c(dest_c);
		setSrc_a(src_a);
		setDest_a(dest_a);
	}
	public blend_state() {
	}
	
	public Object getEnabled() {
		return enabled;
	}
	public void setEnabled(Object newEnabled) {
		enabled = newEnabled;
	}
	public gs_blend_type getSrc_c() {
		return src_c;
	}
	public void setSrc_c(gs_blend_type newSrc_c) {
		src_c = newSrc_c;
	}
	public gs_blend_type getDest_c() {
		return dest_c;
	}
	public void setDest_c(gs_blend_type newDest_c) {
		dest_c = newDest_c;
	}
	public gs_blend_type getSrc_a() {
		return src_a;
	}
	public void setSrc_a(gs_blend_type newSrc_a) {
		src_a = newSrc_a;
	}
	public gs_blend_type getDest_a() {
		return dest_a;
	}
	public void setDest_a(gs_blend_type newDest_a) {
		dest_a = newDest_a;
	}
}
