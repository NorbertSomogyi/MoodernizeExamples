package application;

/** Generic Format (ECMA 167r3 4/14.10.2) */
public class generic_format_s {
	private Object attr_type;
	private Object attr_subtype;
	private Object reserved;
	private Object attrLength;
	private Object attrData;
	
	public generic_format_s(Object attr_type, Object attr_subtype, Object reserved, Object attrLength, Object attrData) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setAttrData(attrData);
	}
	public generic_format_s() {
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
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getAttrLength() {
		return attrLength;
	}
	public void setAttrLength(Object newAttrLength) {
		attrLength = newAttrLength;
	}
	public Object getAttrData() {
		return attrData;
	}
	public void setAttrData(Object newAttrData) {
		attrData = newAttrData;
	}
}
