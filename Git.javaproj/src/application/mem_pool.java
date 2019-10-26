package application;

public class mem_pool {
	private mp_block mp_block;
	private Object block_alloc;
	private Object pool_alloc;
	
	public mem_pool(mp_block mp_block, Object block_alloc, Object pool_alloc) {
		setMp_block(mp_block);
		setBlock_alloc(block_alloc);
		setPool_alloc(pool_alloc);
	}
	public mem_pool() {
	}
	
	public void mem_pool_init(Object initial_size) {
		mem_pool pool = new mem_pool();
		if (mem_pool) {
			return ;
		} 
		pool = ModernizedCProgram.xcalloc(1, );
		pool.setBlock_alloc(1024 * 1024 - );
		;
		if (initial_size > 0) {
			((Object)0).mem_pool_alloc_block(pool, initial_size);
		} 
		mem_pool = pool;
	}
	public void mem_pool_discard(int invalidate_memory) {
		mp_block block = new mp_block();
		mp_block block_to_free = new mp_block();
		mp_block generatedMp_block = this.getMp_block();
		block = generatedMp_block;
		mp_block generatedNext_block = block.getNext_block();
		Object generatedSpace = block_to_free.getSpace();
		Byte generatedEnd = block_to_free.getEnd();
		while (block) {
			block_to_free = block;
			block = generatedNext_block;
			if (invalidate_memory) {
				.memset(generatedSpace, -1024, ((byte)generatedEnd) - ((byte)generatedSpace));
			} 
			ModernizedCProgram.free(block_to_free);
		}
		ModernizedCProgram.free(mem_pool);
	}
	public Object mem_pool_alloc(Object len) {
		mp_block p = ((Object)0);
		Object r;
		if (len & ( - /* round up to a 'uintmax_t' alignment */1)) {
			len +=  - (len & ( - 1));
		} 
		mp_block generatedMp_block = this.getMp_block();
		Byte generatedEnd = generatedMp_block.getEnd();
		Byte generatedNext_free = generatedMp_block.getNext_free();
		if (generatedMp_block && generatedEnd - generatedNext_free >= len) {
			p = generatedMp_block;
		} 
		Object generatedBlock_alloc = this.getBlock_alloc();
		if (!p) {
			if (len >= (generatedBlock_alloc / 2)) {
				return generatedMp_block.mem_pool_alloc_block(mem_pool, len);
			} 
			p = ((Object)0).mem_pool_alloc_block(mem_pool, generatedBlock_alloc);
		} 
		r = generatedNext_free;
		generatedNext_free += len;
		return r;
	}
	public Object mem_pool_calloc(Object count, Object size) {
		size_t len = ModernizedCProgram.st_mult(count, size);
		Object r = mem_pool.mem_pool_alloc(len);
		.memset(r, 0, len);
		return r;
	}
	public int mem_pool_contains(Object mem) {
		mp_block p = new mp_block();
		Object generatedSpace = p.getSpace();
		Byte generatedEnd = p.getEnd();
		mp_block generatedNext_block = p.getNext_block();
		mp_block generatedMp_block = this.getMp_block();
		for (p = generatedMp_block; p; p = generatedNext_block) {
			if ((mem >= ((Object)generatedSpace)) && (mem < ((Object)generatedEnd))) {
				return 1;
			} 
		}
		return 0;
	}
	public void mem_pool_combine(mem_pool src) {
		mp_block p = new mp_block();
		mp_block generatedMp_block = this.getMp_block();
		mp_block generatedNext_block = p.getNext_block();
		if (generatedMp_block && generatedMp_block) {
			p = generatedMp_block;
			while (generatedNext_block) {
				p = generatedNext_block;
			}
			p.setNext_block(generatedMp_block);
		}  else if (generatedMp_block) {
			this.setMp_block(generatedMp_block);
		} 
		Object generatedPool_alloc = this.getPool_alloc();
		generatedPool_alloc += generatedPool_alloc;
		src.setPool_alloc(0);
		src.setMp_block(((Object)0));
	}
	public mem_pool find_mem_pool(index_state istate) {
		mem_pool pool_ptr = new mem_pool();
		split_index generatedSplit_index = istate.getSplit_index();
		index_state generatedBase = generatedSplit_index.getBase();
		mem_pool generatedCe_mem_pool = generatedBase.getCe_mem_pool();
		if (generatedSplit_index && generatedBase) {
			pool_ptr = generatedCe_mem_pool;
		} else {
				pool_ptr = generatedCe_mem_pool;
		} 
		if (!pool_ptr) {
			pool_ptr.mem_pool_init(0);
		} 
		return pool_ptr;
	}
	public mp_block getMp_block() {
		return mp_block;
	}
	public void setMp_block(mp_block newMp_block) {
		mp_block = newMp_block;
	}
	public Object getBlock_alloc() {
		return block_alloc;
	}
	public void setBlock_alloc(Object newBlock_alloc) {
		block_alloc = newBlock_alloc;
	}
	public Object getPool_alloc() {
		return pool_alloc;
	}
	public void setPool_alloc(Object newPool_alloc) {
		pool_alloc = newPool_alloc;
	}
}
