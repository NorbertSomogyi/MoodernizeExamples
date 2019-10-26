package application;

public class commit_names {
	private int slab_size;
	private int stride;
	private int slab_count;
	private commit_name slab;
	
	public commit_names(int slab_size, int stride, int slab_count, commit_name slab) {
		setSlab_size(slab_size);
		setStride(stride);
		setSlab_count(slab_count);
		setSlab(slab);
	}
	public commit_names() {
	}
	
	public void init_commit_names_with_stride(int stride) {
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
	public void init_commit_names() {
		s.init_commit_names_with_stride(1);
	}
	public void clear_commit_names() {
		int i;
		int generatedSlab_count = this.getSlab_count();
		commit_name generatedSlab = this.getSlab();
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
	public commit_name getSlab() {
		return slab;
	}
	public void setSlab(commit_name newSlab) {
		slab = newSlab;
	}
}
