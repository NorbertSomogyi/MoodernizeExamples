package application;

public class ext2fs_struct_generic_bitmap_base {
	private Object magic;
	private Object fs;
	
	public ext2fs_struct_generic_bitmap_base(Object magic, Object fs) {
		setMagic(magic);
		setFs(fs);
	}
	public ext2fs_struct_generic_bitmap_base() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
}
