package application;

/* ENABLE_BMAP_STATS_OPS */
public class ext2fs_struct_generic_bitmap_64 {
	private Object magic;
	private Object fs;
	private ext2_bitmap_ops bitmap_ops;
	private int flags;
	private Object start;
	private Object end;
	private Object real_end;
	private int cluster_bits;
	private Byte description;
	private Object private;
	private Object base_error_code;
	
	public ext2fs_struct_generic_bitmap_64(Object magic, Object fs, ext2_bitmap_ops bitmap_ops, int flags, Object start, Object end, Object real_end, int cluster_bits, Byte description, Object private, Object base_error_code) {
		setMagic(magic);
		setFs(fs);
		setBitmap_ops(bitmap_ops);
		setFlags(flags);
		setStart(start);
		setEnd(end);
		setReal_end(real_end);
		setCluster_bits(cluster_bits);
		setDescription(description);
		setPrivate(private);
		setBase_error_code(base_error_code);
	}
	public ext2fs_struct_generic_bitmap_64() {
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
	public ext2_bitmap_ops getBitmap_ops() {
		return bitmap_ops;
	}
	public void setBitmap_ops(ext2_bitmap_ops newBitmap_ops) {
		bitmap_ops = newBitmap_ops;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public Object getReal_end() {
		return real_end;
	}
	public void setReal_end(Object newReal_end) {
		real_end = newReal_end;
	}
	public int getCluster_bits() {
		return cluster_bits;
	}
	public void setCluster_bits(int newCluster_bits) {
		cluster_bits = newCluster_bits;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
	public Object getPrivate() {
		return private;
	}
	public void setPrivate(Object newPrivate) {
		private = newPrivate;
	}
	public Object getBase_error_code() {
		return base_error_code;
	}
	public void setBase_error_code(Object newBase_error_code) {
		base_error_code = newBase_error_code;
	}
}
