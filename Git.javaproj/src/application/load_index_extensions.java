package application;

public class load_index_extensions {
	private Object pthread;
	private index_state istate;
	private Object mmap;
	private Object mmap_size;
	private long src_offset;
	
	public load_index_extensions(Object pthread, index_state istate, Object mmap, Object mmap_size, long src_offset) {
		setPthread(pthread);
		setIstate(istate);
		setMmap(mmap);
		setMmap_size(mmap_size);
		setSrc_offset(src_offset);
	}
	public load_index_extensions() {
	}
	
	public Object getPthread() {
		return pthread;
	}
	public void setPthread(Object newPthread) {
		pthread = newPthread;
	}
	public index_state getIstate() {
		return istate;
	}
	public void setIstate(index_state newIstate) {
		istate = newIstate;
	}
	public Object getMmap() {
		return mmap;
	}
	public void setMmap(Object newMmap) {
		mmap = newMmap;
	}
	public Object getMmap_size() {
		return mmap_size;
	}
	public void setMmap_size(Object newMmap_size) {
		mmap_size = newMmap_size;
	}
	public long getSrc_offset() {
		return src_offset;
	}
	public void setSrc_offset(long newSrc_offset) {
		src_offset = newSrc_offset;
	}
}
