package application;

/** Application Use Extended Attribute (ECMA 167r3 4/14.10.9) */
public class appUseExtAttr {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object appUseLength;
	private udf_regid_s app_id;
	private Object[] appUse;
	
	public appUseExtAttr(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object appUseLength, udf_regid_s app_id, Object[] appUse) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setAppUseLength(appUseLength);
		setApp_id(app_id);
		setAppUse(appUse);
	}
	public appUseExtAttr() {
	}
	
	public Object getAttr_type() {
		return attr_type;
	}
	public void setAttr_type(Object newAttr_type) {
		attr_type = newAttr_type;
	}
	public Object getAttr_subtype() {
		return attr_subtype;
	}
	public void setAttr_subtype(Object newAttr_subtype) {
		attr_subtype = newAttr_subtype;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
	public Object getAttrLength() {
		return attrLength;
	}
	public void setAttrLength(Object newAttrLength) {
		attrLength = newAttrLength;
	}
	public Object getAppUseLength() {
		return appUseLength;
	}
	public void setAppUseLength(Object newAppUseLength) {
		appUseLength = newAppUseLength;
	}
	public udf_regid_s getApp_id() {
		return app_id;
	}
	public void setApp_id(udf_regid_s newApp_id) {
		app_id = newApp_id;
	}
	public Object[] getAppUse() {
		return appUse;
	}
	public void setAppUse(Object[] newAppUse) {
		appUse = newAppUse;
	}
}
