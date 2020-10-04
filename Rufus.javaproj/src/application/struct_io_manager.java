package application;

public class struct_io_manager {
	private Object magic;
	private Object name;
	private Object open;
	private Object close;
	private Object set_blksize;
	private Object read_blk;
	private Object write_blk;
	private Object flush;
	private Object write_byte;
	private Object set_option;
	private Object get_stats;
	private Object read_blk64;
	private Object write_blk64;
	private Object discard;
	private Object cache_readahead;
	private Object zeroout;
	private Object[] reserved;
	
	public struct_io_manager(Object magic, Object name, Object open, Object close, Object set_blksize, Object read_blk, Object write_blk, Object flush, Object write_byte, Object set_option, Object get_stats, Object read_blk64, Object write_blk64, Object discard, Object cache_readahead, Object zeroout, Object[] reserved) {
		setMagic(magic);
		setName(name);
		setOpen(open);
		setClose(close);
		setSet_blksize(set_blksize);
		setRead_blk(read_blk);
		setWrite_blk(write_blk);
		setFlush(flush);
		setWrite_byte(write_byte);
		setSet_option(set_option);
		setGet_stats(get_stats);
		setRead_blk64(read_blk64);
		setWrite_blk64(write_blk64);
		setDiscard(discard);
		setCache_readahead(cache_readahead);
		setZeroout(zeroout);
		setReserved(reserved);
	}
	public struct_io_manager() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getOpen() {
		return open;
	}
	public void setOpen(Object newOpen) {
		open = newOpen;
	}
	public Object getClose() {
		return close;
	}
	public void setClose(Object newClose) {
		close = newClose;
	}
	public Object getSet_blksize() {
		return set_blksize;
	}
	public void setSet_blksize(Object newSet_blksize) {
		set_blksize = newSet_blksize;
	}
	public Object getRead_blk() {
		return read_blk;
	}
	public void setRead_blk(Object newRead_blk) {
		read_blk = newRead_blk;
	}
	public Object getWrite_blk() {
		return write_blk;
	}
	public void setWrite_blk(Object newWrite_blk) {
		write_blk = newWrite_blk;
	}
	public Object getFlush() {
		return flush;
	}
	public void setFlush(Object newFlush) {
		flush = newFlush;
	}
	public Object getWrite_byte() {
		return write_byte;
	}
	public void setWrite_byte(Object newWrite_byte) {
		write_byte = newWrite_byte;
	}
	public Object getSet_option() {
		return set_option;
	}
	public void setSet_option(Object newSet_option) {
		set_option = newSet_option;
	}
	public Object getGet_stats() {
		return get_stats;
	}
	public void setGet_stats(Object newGet_stats) {
		get_stats = newGet_stats;
	}
	public Object getRead_blk64() {
		return read_blk64;
	}
	public void setRead_blk64(Object newRead_blk64) {
		read_blk64 = newRead_blk64;
	}
	public Object getWrite_blk64() {
		return write_blk64;
	}
	public void setWrite_blk64(Object newWrite_blk64) {
		write_blk64 = newWrite_blk64;
	}
	public Object getDiscard() {
		return discard;
	}
	public void setDiscard(Object newDiscard) {
		discard = newDiscard;
	}
	public Object getCache_readahead() {
		return cache_readahead;
	}
	public void setCache_readahead(Object newCache_readahead) {
		cache_readahead = newCache_readahead;
	}
	public Object getZeroout() {
		return zeroout;
	}
	public void setZeroout(Object newZeroout) {
		zeroout = newZeroout;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
}
