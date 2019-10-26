package application;

/*    The Bitmap callbacks function table
*/
public class gif_bitmap_callback_vt {
	private Object bitmap_create;
	private Object bitmap_destroy;
	private Object bitmap_get_buffer;
	private Object bitmap_set_opaque;
	private Object bitmap_test_opaque;
	private Object bitmap_modified;
	
	public gif_bitmap_callback_vt(Object bitmap_create, Object bitmap_destroy, Object bitmap_get_buffer, Object bitmap_set_opaque, Object bitmap_test_opaque, Object bitmap_modified) {
		setBitmap_create(bitmap_create);
		setBitmap_destroy(bitmap_destroy);
		setBitmap_get_buffer(bitmap_get_buffer);
		setBitmap_set_opaque(bitmap_set_opaque);
		setBitmap_test_opaque(bitmap_test_opaque);
		setBitmap_modified(bitmap_modified);
	}
	public gif_bitmap_callback_vt() {
	}
	
	public Object getBitmap_create() {
		return bitmap_create;
	}
	public void setBitmap_create(Object newBitmap_create) {
		bitmap_create = newBitmap_create;
	}
	public Object getBitmap_destroy() {
		return bitmap_destroy;
	}
	public void setBitmap_destroy(Object newBitmap_destroy) {
		bitmap_destroy = newBitmap_destroy;
	}
	public Object getBitmap_get_buffer() {
		return bitmap_get_buffer;
	}
	public void setBitmap_get_buffer(Object newBitmap_get_buffer) {
		bitmap_get_buffer = newBitmap_get_buffer;
	}
	public Object getBitmap_set_opaque() {
		return bitmap_set_opaque;
	}
	public void setBitmap_set_opaque(Object newBitmap_set_opaque) {
		bitmap_set_opaque = newBitmap_set_opaque;
	}
	public Object getBitmap_test_opaque() {
		return bitmap_test_opaque;
	}
	public void setBitmap_test_opaque(Object newBitmap_test_opaque) {
		bitmap_test_opaque = newBitmap_test_opaque;
	}
	public Object getBitmap_modified() {
		return bitmap_modified;
	}
	public void setBitmap_modified(Object newBitmap_modified) {
		bitmap_modified = newBitmap_modified;
	}
}
