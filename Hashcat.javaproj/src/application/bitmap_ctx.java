package application;

public class bitmap_ctx {
	private boolean enabled;
	private Object bitmap_bits;
	private Object bitmap_nums;
	private Object bitmap_size;
	private Object bitmap_mask;
	private Object bitmap_shift1;
	private Object bitmap_shift2;
	private Object bitmap_s1_a;
	private Object bitmap_s1_b;
	private Object bitmap_s1_c;
	private Object bitmap_s1_d;
	private Object bitmap_s2_a;
	private Object bitmap_s2_b;
	private Object bitmap_s2_c;
	private Object bitmap_s2_d;
	
	public bitmap_ctx(boolean enabled, Object bitmap_bits, Object bitmap_nums, Object bitmap_size, Object bitmap_mask, Object bitmap_shift1, Object bitmap_shift2, Object bitmap_s1_a, Object bitmap_s1_b, Object bitmap_s1_c, Object bitmap_s1_d, Object bitmap_s2_a, Object bitmap_s2_b, Object bitmap_s2_c, Object bitmap_s2_d) {
		setEnabled(enabled);
		setBitmap_bits(bitmap_bits);
		setBitmap_nums(bitmap_nums);
		setBitmap_size(bitmap_size);
		setBitmap_mask(bitmap_mask);
		setBitmap_shift1(bitmap_shift1);
		setBitmap_shift2(bitmap_shift2);
		setBitmap_s1_a(bitmap_s1_a);
		setBitmap_s1_b(bitmap_s1_b);
		setBitmap_s1_c(bitmap_s1_c);
		setBitmap_s1_d(bitmap_s1_d);
		setBitmap_s2_a(bitmap_s2_a);
		setBitmap_s2_b(bitmap_s2_b);
		setBitmap_s2_c(bitmap_s2_c);
		setBitmap_s2_d(bitmap_s2_d);
	}
	public bitmap_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Object getBitmap_bits() {
		return bitmap_bits;
	}
	public void setBitmap_bits(Object newBitmap_bits) {
		bitmap_bits = newBitmap_bits;
	}
	public Object getBitmap_nums() {
		return bitmap_nums;
	}
	public void setBitmap_nums(Object newBitmap_nums) {
		bitmap_nums = newBitmap_nums;
	}
	public Object getBitmap_size() {
		return bitmap_size;
	}
	public void setBitmap_size(Object newBitmap_size) {
		bitmap_size = newBitmap_size;
	}
	public Object getBitmap_mask() {
		return bitmap_mask;
	}
	public void setBitmap_mask(Object newBitmap_mask) {
		bitmap_mask = newBitmap_mask;
	}
	public Object getBitmap_shift1() {
		return bitmap_shift1;
	}
	public void setBitmap_shift1(Object newBitmap_shift1) {
		bitmap_shift1 = newBitmap_shift1;
	}
	public Object getBitmap_shift2() {
		return bitmap_shift2;
	}
	public void setBitmap_shift2(Object newBitmap_shift2) {
		bitmap_shift2 = newBitmap_shift2;
	}
	public Object getBitmap_s1_a() {
		return bitmap_s1_a;
	}
	public void setBitmap_s1_a(Object newBitmap_s1_a) {
		bitmap_s1_a = newBitmap_s1_a;
	}
	public Object getBitmap_s1_b() {
		return bitmap_s1_b;
	}
	public void setBitmap_s1_b(Object newBitmap_s1_b) {
		bitmap_s1_b = newBitmap_s1_b;
	}
	public Object getBitmap_s1_c() {
		return bitmap_s1_c;
	}
	public void setBitmap_s1_c(Object newBitmap_s1_c) {
		bitmap_s1_c = newBitmap_s1_c;
	}
	public Object getBitmap_s1_d() {
		return bitmap_s1_d;
	}
	public void setBitmap_s1_d(Object newBitmap_s1_d) {
		bitmap_s1_d = newBitmap_s1_d;
	}
	public Object getBitmap_s2_a() {
		return bitmap_s2_a;
	}
	public void setBitmap_s2_a(Object newBitmap_s2_a) {
		bitmap_s2_a = newBitmap_s2_a;
	}
	public Object getBitmap_s2_b() {
		return bitmap_s2_b;
	}
	public void setBitmap_s2_b(Object newBitmap_s2_b) {
		bitmap_s2_b = newBitmap_s2_b;
	}
	public Object getBitmap_s2_c() {
		return bitmap_s2_c;
	}
	public void setBitmap_s2_c(Object newBitmap_s2_c) {
		bitmap_s2_c = newBitmap_s2_c;
	}
	public Object getBitmap_s2_d() {
		return bitmap_s2_d;
	}
	public void setBitmap_s2_d(Object newBitmap_s2_d) {
		bitmap_s2_d = newBitmap_s2_d;
	}
}
