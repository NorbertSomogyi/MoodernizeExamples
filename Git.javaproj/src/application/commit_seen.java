package application;

public class commit_seen {
	private int slab_size;
	private int stride;
	private int slab_count;
	private byte slab;
	
	public commit_seen(int slab_size, int stride, int slab_count, byte slab) {
		setSlab_size(slab_size);
		setStride(stride);
		setSlab_count(slab_count);
		setSlab(slab);
	}
	public commit_seen() {
	}
	
	public void init_commit_seen_with_stride(int stride) {
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
	public void init_commit_seen() {
		s.init_commit_seen_with_stride(1);
	}
	public void clear_commit_seen() {
		int i;
		int generatedSlab_count = this.getSlab_count();
		byte generatedSlab = this.getSlab();
		for (i = 0; i < generatedSlab_count; i++) {
			ModernizedCProgram.free(generatedSlab[i]);
		}
		this.setSlab_count(0);
		do {
			ModernizedCProgram.free(generatedSlab);
			(generatedSlab) = ((Object)0);
		} while (0);
	}
	public Byte commit_seen_at_peek(Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = this.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = this.getSlab_count();
		byte generatedSlab = this.getSlab();
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
	public Byte commit_seen_at(Object c) {
		return s.commit_seen_at_peek(c, 1);
	}
	public Byte commit_seen_peek(Object c) {
		return s.commit_seen_at_peek(c, 0/*
		 * Check if the user dropped some commits by mistake
		 * Behaviour determined by rebase.missingCommitsCheck.
		 * Check if there is an unrecognized command or a
		 * bad SHA-1 in a command.
		 */);
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
	public byte getSlab() {
		return slab;
	}
	public void setSlab(byte newSlab) {
		slab = newSlab;
	}
}
