package application;

public class load_cache_entries_thread_data {
	private Object pthread;
	private index_state istate;
	private mem_pool ce_mem_pool;
	private int offset;
	private Object mmap;
	private index_entry_offset_table ieot;
	private int ieot_start;
	private int ieot_blocks;
	private long consumed;
	
	public load_cache_entries_thread_data(Object pthread, index_state istate, mem_pool ce_mem_pool, int offset, Object mmap, index_entry_offset_table ieot, int ieot_start, int ieot_blocks, long consumed) {
		setPthread(pthread);
		setIstate(istate);
		setCe_mem_pool(ce_mem_pool);
		setOffset(offset);
		setMmap(mmap);
		setIeot(ieot);
		setIeot_start(ieot_start);
		setIeot_blocks(ieot_blocks);
		setConsumed(consumed);
	}
	public load_cache_entries_thread_data() {
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
	public mem_pool getCe_mem_pool() {
		return ce_mem_pool;
	}
	public void setCe_mem_pool(mem_pool newCe_mem_pool) {
		ce_mem_pool = newCe_mem_pool;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public Object getMmap() {
		return mmap;
	}
	public void setMmap(Object newMmap) {
		mmap = newMmap;
	}
	public index_entry_offset_table getIeot() {
		return ieot;
	}
	public void setIeot(index_entry_offset_table newIeot) {
		ieot = newIeot;
	}
	public int getIeot_start() {
		return ieot_start;
	}
	public void setIeot_start(int newIeot_start) {
		ieot_start = newIeot_start;
	}
	public int getIeot_blocks() {
		return ieot_blocks;
	}
	public void setIeot_blocks(int newIeot_blocks) {
		ieot_blocks = newIeot_blocks;
	}
	public long getConsumed() {
		return consumed;
	}
	public void setConsumed(long newConsumed) {
		consumed = newConsumed;
	}
}
