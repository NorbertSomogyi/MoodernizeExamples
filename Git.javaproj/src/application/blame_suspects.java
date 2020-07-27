package application;

public class blame_suspects {
	private int slab_size;
	private int stride;
	private int slab_count;
	private blame_origin[][][] slab;
	
	public blame_suspects(int slab_size, int stride, int slab_count, blame_origin[][][] slab) {
		setSlab_size(slab_size);
		setStride(stride);
		setSlab_count(slab_count);
		setSlab(slab);
	}
	public blame_suspects() {
	}
	
	public void init_blame_suspects_with_stride(int stride) {
		int elem_size;
		if (!stride) {
			stride = 1;
		} 
		this.setStride(stride);
		elem_size = /*Error: Unsupported expression*/ * stride;
		this.setSlab_size((512 * 1024 - 32) / elem_size);
		this.setSlab_count(0);
		this.setSlab(((Object)0));
	}
	public void init_blame_suspects() {
		s.init_blame_suspects_with_stride(1);
	}
	public void clear_blame_suspects() {
		int i;
		int generatedSlab_count = this.getSlab_count();
		blame_origin[][][] generatedSlab = this.getSlab();
		for (i = 0; i < generatedSlab_count; i++) {
			ModernizedCProgram.free(generatedSlab[i]);
		}
		this.setSlab_count(0);
		do {
			ModernizedCProgram.free(generatedSlab);
			(generatedSlab) = ((Object)0);
		} while (0);
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
	public blame_origin[][][] getSlab() {
		return slab;
	}
	public void setSlab(blame_origin[][][] newSlab) {
		slab = newSlab;
	}
}
