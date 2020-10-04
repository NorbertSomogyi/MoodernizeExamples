package application;

/** Long Allocation Descriptor (ECMA 167r3 4/14.14.2) */
public class udf_long_ad_s {
	private Object len;
	private udf_lb_addr_s loc;
	private Object[] imp_use;
	
	public udf_long_ad_s(Object len, udf_lb_addr_s loc, Object[] imp_use) {
		setLen(len);
		setLoc(loc);
		setImp_use(imp_use);
	}
	public udf_long_ad_s() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public udf_lb_addr_s getLoc() {
		return loc;
	}
	public void setLoc(udf_lb_addr_s newLoc) {
		loc = newLoc;
	}
	public Object[] getImp_use() {
		return imp_use;
	}
	public void setImp_use(Object[] newImp_use) {
		imp_use = newImp_use;
	}
}
