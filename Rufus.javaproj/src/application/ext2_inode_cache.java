package application;

public class ext2_inode_cache {
	private Object buffer;
	private Object buffer_blk;
	private int cache_last;
	private int cache_size;
	private int refcount;
	private ext2_inode_cache_ent cache;
	
	public ext2_inode_cache(Object buffer, Object buffer_blk, int cache_last, int cache_size, int refcount, ext2_inode_cache_ent cache) {
		setBuffer(buffer);
		setBuffer_blk(buffer_blk);
		setCache_last(cache_last);
		setCache_size(cache_size);
		setRefcount(refcount);
		setCache(cache);
	}
	public ext2_inode_cache() {
	}
	
	public void ext2fs_free_inode_cache() {
		int i;
		int generatedRefcount = this.getRefcount();
		if (--generatedRefcount) {
			return ;
		} 
		Object generatedBuffer = this.getBuffer();
		if (generatedBuffer) {
			ModernizedCProgram.ext2fs_free_mem(generatedBuffer);
		} 
		int generatedCache_size = this.getCache_size();
		ext2_inode_cache_ent generatedCache = this.getCache();
		for (i = 0; i < generatedCache_size; i++) {
			ModernizedCProgram.ext2fs_free_mem(generatedCache[i].getExt2_inode_cache_ent());
		}
		if (generatedCache) {
			ModernizedCProgram.ext2fs_free_mem(generatedCache);
		} 
		this.setBuffer_blk(0);
		ModernizedCProgram.ext2fs_free_mem(icache);
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getBuffer_blk() {
		return buffer_blk;
	}
	public void setBuffer_blk(Object newBuffer_blk) {
		buffer_blk = newBuffer_blk;
	}
	public int getCache_last() {
		return cache_last;
	}
	public void setCache_last(int newCache_last) {
		cache_last = newCache_last;
	}
	public int getCache_size() {
		return cache_size;
	}
	public void setCache_size(int newCache_size) {
		cache_size = newCache_size;
	}
	public int getRefcount() {
		return refcount;
	}
	public void setRefcount(int newRefcount) {
		refcount = newRefcount;
	}
	public ext2_inode_cache_ent getCache() {
		return cache;
	}
	public void setCache(ext2_inode_cache_ent newCache) {
		cache = newCache;
	}
}
