package application;

public class ext3_extent_header {
	private Object eh_magic;
	private Object eh_entries;
	private Object eh_max;
	private Object eh_depth;
	private Object eh_generation;
	
	public ext3_extent_header(Object eh_magic, Object eh_entries, Object eh_max, Object eh_depth, Object eh_generation) {
		setEh_magic(eh_magic);
		setEh_entries(eh_entries);
		setEh_max(eh_max);
		setEh_depth(eh_depth);
		setEh_generation(eh_generation);
	}
	public ext3_extent_header() {
	}
	
	public Object getEh_magic() {
		return eh_magic;
	}
	public void setEh_magic(Object newEh_magic) {
		eh_magic = newEh_magic;
	}
	public Object getEh_entries() {
		return eh_entries;
	}
	public void setEh_entries(Object newEh_entries) {
		eh_entries = newEh_entries;
	}
	public Object getEh_max() {
		return eh_max;
	}
	public void setEh_max(Object newEh_max) {
		eh_max = newEh_max;
	}
	public Object getEh_depth() {
		return eh_depth;
	}
	public void setEh_depth(Object newEh_depth) {
		eh_depth = newEh_depth;
	}
	public Object getEh_generation() {
		return eh_generation;
	}
	public void setEh_generation(Object newEh_generation) {
		eh_generation = newEh_generation;
	}
}
