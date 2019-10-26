package application;

public class alt_base {
	private Byte base;
	private int got_indices;
	private packed_git packs;
	private alt_base next;
	
	public alt_base(Byte base, int got_indices, packed_git packs, alt_base next) {
		setBase(base);
		setGot_indices(got_indices);
		setPacks(packs);
		setNext(next);
	}
	public alt_base() {
	}
	
	public Byte getBase() {
		return base;
	}
	public void setBase(Byte newBase) {
		base = newBase;
	}
	public int getGot_indices() {
		return got_indices;
	}
	public void setGot_indices(int newGot_indices) {
		got_indices = newGot_indices;
	}
	public packed_git getPacks() {
		return packs;
	}
	public void setPacks(packed_git newPacks) {
		packs = newPacks;
	}
	public alt_base getNext() {
		return next;
	}
	public void setNext(alt_base newNext) {
		next = newNext;
	}
}
