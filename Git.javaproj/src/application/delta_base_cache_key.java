package application;

public class delta_base_cache_key {
	private packed_git p;
	private Object base_offset;
	
	public delta_base_cache_key(packed_git p, Object base_offset) {
		setP(p);
		setBase_offset(base_offset);
	}
	public delta_base_cache_key() {
	}
	
	public packed_git getP() {
		return p;
	}
	public void setP(packed_git newP) {
		p = newP;
	}
	public Object getBase_offset() {
		return base_offset;
	}
	public void setBase_offset(Object newBase_offset) {
		base_offset = newBase_offset;
	}
}
