package application;

/** Implementation Use Extended Attr (ECMA 167r3 4/14.10.8) */
public class impUseExtAttr {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object imp_useLength;
	private udf_regid_s imp_id;
	private Object[] imp_use;
	
	public impUseExtAttr(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object imp_useLength, udf_regid_s imp_id, Object[] imp_use) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setImp_useLength(imp_useLength);
		setImp_id(imp_id);
		setImp_use(imp_use);
	}
	public impUseExtAttr() {
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
	public Object getImp_useLength() {
		return imp_useLength;
	}
	public void setImp_useLength(Object newImp_useLength) {
		imp_useLength = newImp_useLength;
	}
	public udf_regid_s getImp_id() {
		return imp_id;
	}
	public void setImp_id(udf_regid_s newImp_id) {
		imp_id = newImp_id;
	}
	public Object[] getImp_use() {
		return imp_use;
	}
	public void setImp_use(Object[] newImp_use) {
		imp_use = newImp_use;
	}
}
