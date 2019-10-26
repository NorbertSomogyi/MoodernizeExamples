package application;

public class lf_to_crlf_filter {
	private stream_filter filter;
	private int has_held;
	private byte held;
	
	public lf_to_crlf_filter(stream_filter filter, int has_held, byte held) {
		setFilter(filter);
		setHas_held(has_held);
		setHeld(held);
	}
	public lf_to_crlf_filter() {
	}
	
	public stream_filter getFilter() {
		return filter;
	}
	public void setFilter(stream_filter newFilter) {
		filter = newFilter;
	}
	public int getHas_held() {
		return has_held;
	}
	public void setHas_held(int newHas_held) {
		has_held = newHas_held;
	}
	public byte getHeld() {
		return held;
	}
	public void setHeld(byte newHeld) {
		held = newHeld;
	}
}
