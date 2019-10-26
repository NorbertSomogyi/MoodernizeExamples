package application;

public class lzma_index_hash_s {
	private  sequence;
	private  blocks;
	private  records;
	private Object remaining;
	private Object unpadded_size;
	private Object uncompressed_size;
	private Object pos;
	private Object crc32;
	
	public lzma_index_hash_s( sequence,  blocks,  records, Object remaining, Object unpadded_size, Object uncompressed_size, Object pos, Object crc32) {
		setSequence(sequence);
		setBlocks(blocks);
		setRecords(records);
		setRemaining(remaining);
		setUnpadded_size(unpadded_size);
		setUncompressed_size(uncompressed_size);
		setPos(pos);
		setCrc32(crc32);
	}
	public lzma_index_hash_s() {
	}
	
	public  getSequence() {
		return sequence;
	}
	public void setSequence( newSequence) {
		sequence = newSequence;
	}
	public  getBlocks() {
		return blocks;
	}
	public void setBlocks( newBlocks) {
		blocks = newBlocks;
	}
	public  getRecords() {
		return records;
	}
	public void setRecords( newRecords) {
		records = newRecords;
	}
	public Object getRemaining() {
		return remaining;
	}
	public void setRemaining(Object newRemaining) {
		remaining = newRemaining;
	}
	public Object getUnpadded_size() {
		return unpadded_size;
	}
	public void setUnpadded_size(Object newUnpadded_size) {
		unpadded_size = newUnpadded_size;
	}
	public Object getUncompressed_size() {
		return uncompressed_size;
	}
	public void setUncompressed_size(Object newUncompressed_size) {
		uncompressed_size = newUncompressed_size;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
}
