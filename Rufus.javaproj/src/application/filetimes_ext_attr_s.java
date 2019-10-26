package application;

/** File Times Extended Attribute (ECMA 167r3 4/14.10.5) */
public class filetimes_ext_attr_s {
	private Object attr_type;
	private Object attr_subtype;
	private Object reserved;
	private Object attrLength;
	private Object dataLength;
	private Object fileTimeExistence;
	private Object fileTimes;
	
	public filetimes_ext_attr_s(Object attr_type, Object attr_subtype, Object reserved, Object attrLength, Object dataLength, Object fileTimeExistence, Object fileTimes) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setDataLength(dataLength);
		setFileTimeExistence(fileTimeExistence);
		setFileTimes(fileTimes);
	}
	public filetimes_ext_attr_s() {
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
	public Object getDataLength() {
		return dataLength;
	}
	public void setDataLength(Object newDataLength) {
		dataLength = newDataLength;
	}
	public Object getFileTimeExistence() {
		return fileTimeExistence;
	}
	public void setFileTimeExistence(Object newFileTimeExistence) {
		fileTimeExistence = newFileTimeExistence;
	}
	public Object getFileTimes() {
		return fileTimes;
	}
	public void setFileTimes(Object newFileTimes) {
		fileTimes = newFileTimes;
	}
}
