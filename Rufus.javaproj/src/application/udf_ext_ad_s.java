package application;

/** Extended Allocation Descriptor (ECMA 167r3 4/14.14.3) */
public class udf_ext_ad_s {
	private Object len;
	private Object recorded_len;
	private Object information_len;
	private udf_lb_addr_s ext_loc;
	
	public udf_ext_ad_s(Object len, Object recorded_len, Object information_len, udf_lb_addr_s ext_loc) {
		setLen(len);
		setRecorded_len(recorded_len);
		setInformation_len(information_len);
		setExt_loc(ext_loc);
	}
	public udf_ext_ad_s() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getRecorded_len() {
		return recorded_len;
	}
	public void setRecorded_len(Object newRecorded_len) {
		recorded_len = newRecorded_len;
	}
	public Object getInformation_len() {
		return information_len;
	}
	public void setInformation_len(Object newInformation_len) {
		information_len = newInformation_len;
	}
	public udf_lb_addr_s getExt_loc() {
		return ext_loc;
	}
	public void setExt_loc(udf_lb_addr_s newExt_loc) {
		ext_loc = newExt_loc;
	}
}
/** Descriptor Tag (ECMA 167r3 4/7.2 - See 3/7.2) */
