package application;

public class malloc_params {
	private Object magic;
	private Object page_size;
	private Object granularity;
	private Object mmap_threshold;
	private Object trim_threshold;
	private Object default_mflags;
	
	public malloc_params(Object magic, Object page_size, Object granularity, Object mmap_threshold, Object trim_threshold, Object default_mflags) {
		setMagic(magic);
		setPage_size(page_size);
		setGranularity(granularity);
		setMmap_threshold(mmap_threshold);
		setTrim_threshold(trim_threshold);
		setDefault_mflags(default_mflags);
	}
	public malloc_params() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getPage_size() {
		return page_size;
	}
	public void setPage_size(Object newPage_size) {
		page_size = newPage_size;
	}
	public Object getGranularity() {
		return granularity;
	}
	public void setGranularity(Object newGranularity) {
		granularity = newGranularity;
	}
	public Object getMmap_threshold() {
		return mmap_threshold;
	}
	public void setMmap_threshold(Object newMmap_threshold) {
		mmap_threshold = newMmap_threshold;
	}
	public Object getTrim_threshold() {
		return trim_threshold;
	}
	public void setTrim_threshold(Object newTrim_threshold) {
		trim_threshold = newTrim_threshold;
	}
	public Object getDefault_mflags() {
		return default_mflags;
	}
	public void setDefault_mflags(Object newDefault_mflags) {
		default_mflags = newDefault_mflags;
	}
}
/* Ensure mparams initialized */
