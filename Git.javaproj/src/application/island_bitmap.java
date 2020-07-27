package application;

/*
 * Allocate a new bitmap; if "old" is not NULL, the new bitmap will be a copy
 * of "old". Otherwise, the new bitmap is empty.
 */
public class island_bitmap {
	private Object refcount;
	private Object bits;
	
	public island_bitmap(Object refcount, Object bits) {
		setRefcount(refcount);
		setBits(bits);
	}
	public island_bitmap() {
	}
	
	public island_bitmap island_bitmap_new(Object old) {
		size_t size = /*Error: Unsupported expression*/ + (ModernizedCProgram.island_bitmap_size * 4);
		island_bitmap b = ModernizedCProgram.xcalloc(1, size);
		if (old) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(b, old, size);
		} 
		b.setRefcount(1);
		return b;
	}
	public void island_bitmap_or(Object b) {
		uint32_t i = new uint32_t();
		Object generatedBits = this.getBits();
		for (i = 0; i < ModernizedCProgram.island_bitmap_size; ++i) {
			generatedBits[i] |=  generatedBits[i];
		}
	}
	public int island_bitmap_is_subset(island_bitmap super) {
		uint32_t i = new uint32_t();
		if (self == super) {
			return 1;
		} 
		Object generatedBits = this.getBits();
		for (i = 0; i < ModernizedCProgram.island_bitmap_size; ++i) {
			if ((generatedBits[i] & generatedBits[i]) != generatedBits[i]) {
				return 0;
			} 
		}
		return 1;
	}
	public void island_bitmap_set(Object i) {
		Object generatedBits = this.getBits();
		generatedBits[(i / 32)] |=  (1 << (i % 32));
	}
	public int island_bitmap_get(Object i) {
		Object generatedBits = this.getBits();
		return (generatedBits[(i / 32)] & (1 << (i % 32))) != 0;
	}
	public island_bitmap create_or_get_island_marks(object obj) {
		khiter_t pos = new khiter_t();
		int hash_ret;
		object_id generatedOid = obj.getOid();
		pos = ModernizedCProgram.kh_put_oid_map(ModernizedCProgram.island_marks, generatedOid, hash_ret);
		island_bitmap island_bitmap = new island_bitmap();
		if (hash_ret) {
			((ModernizedCProgram.island_marks).getVals()[pos]) = island_bitmap.island_bitmap_new(((Object)0));
		} 
		return ((ModernizedCProgram.island_marks).getVals()[pos]);
	}
	public Object getRefcount() {
		return refcount;
	}
	public void setRefcount(Object newRefcount) {
		refcount = newRefcount;
	}
	public Object getBits() {
		return bits;
	}
	public void setBits(Object newBits) {
		bits = newBits;
	}
}
