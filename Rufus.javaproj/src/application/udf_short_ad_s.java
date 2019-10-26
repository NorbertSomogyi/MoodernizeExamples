package application;

/** Short Allocation Descriptor (ECMA 167r3 4/14.14.1) */
public class udf_short_ad_s {
	private Object len;
	private Object pos;
	
	public udf_short_ad_s(Object len, Object pos) {
		setLen(len);
		setPos(pos);
	}
	public udf_short_ad_s() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
}
