package application;

public class gs_sampler_info {
	private gs_sample_filter filter;
	private gs_address_mode address_u;
	private gs_address_mode address_v;
	private gs_address_mode address_w;
	private int max_anisotropy;
	private Object border_color;
	
	public gs_sampler_info(gs_sample_filter filter, gs_address_mode address_u, gs_address_mode address_v, gs_address_mode address_w, int max_anisotropy, Object border_color) {
		setFilter(filter);
		setAddress_u(address_u);
		setAddress_v(address_v);
		setAddress_w(address_w);
		setMax_anisotropy(max_anisotropy);
		setBorder_color(border_color);
	}
	public gs_sampler_info() {
	}
	
	public gs_sample_filter getFilter() {
		return filter;
	}
	public void setFilter(gs_sample_filter newFilter) {
		filter = newFilter;
	}
	public gs_address_mode getAddress_u() {
		return address_u;
	}
	public void setAddress_u(gs_address_mode newAddress_u) {
		address_u = newAddress_u;
	}
	public gs_address_mode getAddress_v() {
		return address_v;
	}
	public void setAddress_v(gs_address_mode newAddress_v) {
		address_v = newAddress_v;
	}
	public gs_address_mode getAddress_w() {
		return address_w;
	}
	public void setAddress_w(gs_address_mode newAddress_w) {
		address_w = newAddress_w;
	}
	public int getMax_anisotropy() {
		return max_anisotropy;
	}
	public void setMax_anisotropy(int newMax_anisotropy) {
		max_anisotropy = newMax_anisotropy;
	}
	public Object getBorder_color() {
		return border_color;
	}
	public void setBorder_color(Object newBorder_color) {
		border_color = newBorder_color;
	}
}
