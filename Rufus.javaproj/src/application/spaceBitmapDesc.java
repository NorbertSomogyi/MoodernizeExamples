package application;

/** Space Bitmap Descriptor (ECMA 167r3 4/14.12) */
public class spaceBitmapDesc {
	private udf_tag_s tag;
	private Object i_bits;
	private Object i_bytes;
	private Object[] bitmap;
	
	public spaceBitmapDesc(udf_tag_s tag, Object i_bits, Object i_bytes, Object[] bitmap) {
		setTag(tag);
		setI_bits(i_bits);
		setI_bytes(i_bytes);
		setBitmap(bitmap);
	}
	public spaceBitmapDesc() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getI_bits() {
		return i_bits;
	}
	public void setI_bits(Object newI_bits) {
		i_bits = newI_bits;
	}
	public Object getI_bytes() {
		return i_bytes;
	}
	public void setI_bytes(Object newI_bytes) {
		i_bytes = newI_bytes;
	}
	public Object[] getBitmap() {
		return bitmap;
	}
	public void setBitmap(Object[] newBitmap) {
		bitmap = newBitmap;
	}
}
