package application;

public class mp_block {
	private mp_block next_block;
	private Byte next_free;
	private Byte end;
	private Object space;
	
	public mp_block(mp_block next_block, Byte next_free, Byte end, Object space) {
		setNext_block(next_block);
		setNext_free(next_free);
		setEnd(end);
		setSpace(space);
	}
	public mp_block() {
	}
	
	public mp_block mem_pool_alloc_block(mem_pool mem_pool, Object block_alloc) {
		mp_block p = new mp_block();
		Object generatedPool_alloc = mem_pool.getPool_alloc();
		generatedPool_alloc +=  + block_alloc;
		p = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(, block_alloc));
		Object generatedSpace = p.getSpace();
		p.setNext_free((byte)generatedSpace);
		Byte generatedNext_free = p.getNext_free();
		p.setEnd(generatedNext_free + block_alloc);
		mp_block generatedNext_block = this.getNext_block();
		mp_block generatedMp_block = mem_pool.getMp_block();
		if (insert_after) {
			p.setNext_block(generatedNext_block);
			this.setNext_block(p);
		} else {
				p.setNext_block(generatedMp_block);
				mem_pool.setMp_block(p);
		} 
		return p;
	}
	public mp_block getNext_block() {
		return next_block;
	}
	public void setNext_block(mp_block newNext_block) {
		next_block = newNext_block;
	}
	public Byte getNext_free() {
		return next_free;
	}
	public void setNext_free(Byte newNext_free) {
		next_free = newNext_free;
	}
	public Byte getEnd() {
		return end;
	}
	public void setEnd(Byte newEnd) {
		end = newEnd;
	}
	public Object getSpace() {
		return space;
	}
	public void setSpace(Object newSpace) {
		space = newSpace;
	}
}
/*
	 * The amount of available memory to grow the pool by.
	 * This size does not include the overhead for the mp_block.
	 */
