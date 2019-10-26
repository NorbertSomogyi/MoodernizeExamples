package application;

/** Extent Descriptor (ECMA 167r3 3/7.1) */
public class udf_extent_ad_s {
	private Object len;
	private Object loc;
	
	public udf_extent_ad_s(Object len, Object loc) {
		setLen(len);
		setLoc(loc);
	}
	public udf_extent_ad_s() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getLoc() {
		return loc;
	}
	public void setLoc(Object newLoc) {
		loc = newLoc;
	}
}
