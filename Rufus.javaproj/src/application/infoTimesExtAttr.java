package application;

/** Information Times Extended Attribute (ECMA 167r3 4/14.10.6) */
public class infoTimesExtAttr {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object dataLength;
	private Object infoTimeExistence;
	private Object[] infoTimes;
	
	public infoTimesExtAttr(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object dataLength, Object infoTimeExistence, Object[] infoTimes) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setDataLength(dataLength);
		setInfoTimeExistence(infoTimeExistence);
		setInfoTimes(infoTimes);
	}
	public infoTimesExtAttr() {
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
	public Object getDataLength() {
		return dataLength;
	}
	public void setDataLength(Object newDataLength) {
		dataLength = newDataLength;
	}
	public Object getInfoTimeExistence() {
		return infoTimeExistence;
	}
	public void setInfoTimeExistence(Object newInfoTimeExistence) {
		infoTimeExistence = newInfoTimeExistence;
	}
	public Object[] getInfoTimes() {
		return infoTimes;
	}
	public void setInfoTimes(Object[] newInfoTimes) {
		infoTimes = newInfoTimes;
	}
}
