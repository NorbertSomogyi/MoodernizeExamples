package application;

public class contains_cache {
	private int slab_size;
	private int stride;
	private int slab_count;
	private contains_result slab;
	
	public contains_cache(int slab_size, int stride, int slab_count, contains_result slab) {
		setSlab_size(slab_size);
		setStride(stride);
		setSlab_count(slab_count);
		setSlab(slab);
	}
	public contains_cache() {
	}
	
	public void init_contains_cache_with_stride(int stride) {
		int elem_size;
		if (!stride) {
			stride = 1;
		} 
		this.setStride(stride);
		elem_size =  * stride;
		this.setSlab_size((512 * 1024 - 32) / elem_size);
		this.setSlab_count(0);
		this.setSlab(((Object)0));
	}
	public void init_contains_cache() {
		s.init_contains_cache_with_stride(1);
	}
	public void clear_contains_cache() {
		int i;
		int generatedSlab_count = this.getSlab_count();
		contains_result generatedSlab = this.getSlab();
		for (i = 0; i < generatedSlab_count; i++) {
			ModernizedCProgram.free(generatedSlab[i]);
		}
		this.setSlab_count(0);
		do {
			ModernizedCProgram.free(generatedSlab);
			(generatedSlab) = ((Object)0);
		} while (0);
	}
	public contains_result contains_cache_at_peek(Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = this.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = this.getSlab_count();
		contains_result generatedSlab = this.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			this.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = this.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size,  * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public contains_result contains_cache_at(Object c) {
		return s.contains_cache_at_peek(c, 1);
	}
	public contains_result contains_cache_peek(Object c) {
		return s.contains_cache_at_peek(c, 0);
	}
	public int getSlab_size() {
		return slab_size;
	}
	public void setSlab_size(int newSlab_size) {
		slab_size = newSlab_size;
	}
	public int getStride() {
		return stride;
	}
	public void setStride(int newStride) {
		stride = newStride;
	}
	public int getSlab_count() {
		return slab_count;
	}
	public void setSlab_count(int newSlab_count) {
		slab_count = newSlab_count;
	}
	public contains_result getSlab() {
		return slab;
	}
	public void setSlab(contains_result newSlab) {
		slab = newSlab;
	}
}
