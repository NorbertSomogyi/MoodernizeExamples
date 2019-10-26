package application;

public class bb_struct_u64_iterate {
	private int magic;
	private Object bb;
	private int ptr;
	
	public bb_struct_u64_iterate(int magic, Object bb, int ptr) {
		setMagic(magic);
		setBb(bb);
		setPtr(ptr);
	}
	public bb_struct_u64_iterate() {
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public Object getBb() {
		return bb;
	}
	public void setBb(Object newBb) {
		bb = newBb;
	}
	public int getPtr() {
		return ptr;
	}
	public void setPtr(int newPtr) {
		ptr = newPtr;
	}
}
