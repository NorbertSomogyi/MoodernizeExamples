package application;

/** Device Specification (ECMA 167r3 4/14.10.7) */
public class deviceSpec {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object imp_useLength;
	private Object majorDevice_id;
	private Object minorDevice_id;
	private Object[] imp_use;
	
	public deviceSpec(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object imp_useLength, Object majorDevice_id, Object minorDevice_id, Object[] imp_use) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setImp_useLength(imp_useLength);
		setMajorDevice_id(majorDevice_id);
		setMinorDevice_id(minorDevice_id);
		setImp_use(imp_use);
	}
	public deviceSpec() {
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
	public Object getMajorDevice_id() {
		return majorDevice_id;
	}
	public void setMajorDevice_id(Object newMajorDevice_id) {
		majorDevice_id = newMajorDevice_id;
	}
	public Object getMinorDevice_id() {
		return minorDevice_id;
	}
	public void setMinorDevice_id(Object newMinorDevice_id) {
		minorDevice_id = newMinorDevice_id;
	}
	public Object[] getImp_use() {
		return imp_use;
	}
	public void setImp_use(Object[] newImp_use) {
		imp_use = newImp_use;
	}
}
