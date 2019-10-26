package application;

public class d3d9_offsets {
	private Object present;
	private Object present_ex;
	private Object present_swap;
	private Object d3d9_clsoff;
	private Object is_d3d9ex_clsoff;
	
	public d3d9_offsets(Object present, Object present_ex, Object present_swap, Object d3d9_clsoff, Object is_d3d9ex_clsoff) {
		setPresent(present);
		setPresent_ex(present_ex);
		setPresent_swap(present_swap);
		setD3d9_clsoff(d3d9_clsoff);
		setIs_d3d9ex_clsoff(is_d3d9ex_clsoff);
	}
	public d3d9_offsets() {
	}
	
	public Object getPresent() {
		return present;
	}
	public void setPresent(Object newPresent) {
		present = newPresent;
	}
	public Object getPresent_ex() {
		return present_ex;
	}
	public void setPresent_ex(Object newPresent_ex) {
		present_ex = newPresent_ex;
	}
	public Object getPresent_swap() {
		return present_swap;
	}
	public void setPresent_swap(Object newPresent_swap) {
		present_swap = newPresent_swap;
	}
	public Object getD3d9_clsoff() {
		return d3d9_clsoff;
	}
	public void setD3d9_clsoff(Object newD3d9_clsoff) {
		d3d9_clsoff = newD3d9_clsoff;
	}
	public Object getIs_d3d9ex_clsoff() {
		return is_d3d9ex_clsoff;
	}
	public void setIs_d3d9ex_clsoff(Object newIs_d3d9ex_clsoff) {
		is_d3d9ex_clsoff = newIs_d3d9ex_clsoff;
	}
}
