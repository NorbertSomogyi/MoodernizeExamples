package application;

public class cache_ref_iterator {
	private ref_iterator base;
	private Object levels_nr;
	private Object levels_alloc;
	private Object prefix;
	private cache_ref_iterator_level levels;
	
	public cache_ref_iterator(ref_iterator base, Object levels_nr, Object levels_alloc, Object prefix, cache_ref_iterator_level levels) {
		setBase(base);
		setLevels_nr(levels_nr);
		setLevels_alloc(levels_alloc);
		setPrefix(prefix);
		setLevels(levels);
	}
	public cache_ref_iterator() {
	}
	
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
	public Object getLevels_nr() {
		return levels_nr;
	}
	public void setLevels_nr(Object newLevels_nr) {
		levels_nr = newLevels_nr;
	}
	public Object getLevels_alloc() {
		return levels_alloc;
	}
	public void setLevels_alloc(Object newLevels_alloc) {
		levels_alloc = newLevels_alloc;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public cache_ref_iterator_level getLevels() {
		return levels;
	}
	public void setLevels(cache_ref_iterator_level newLevels) {
		levels = newLevels;
	}
}
