package application;

/** Character Set Information (ECMA 167r3 4/14.10.3) */
public class charSet_info_s {
	private Object attr_type;
	private Object attr_subtype;
	private Object[] reserved;
	private Object attrLength;
	private Object escapeSeqLength;
	private Object charSetType;
	private Object[] escapeSeq;
	
	public charSet_info_s(Object attr_type, Object attr_subtype, Object[] reserved, Object attrLength, Object escapeSeqLength, Object charSetType, Object[] escapeSeq) {
		setAttr_type(attr_type);
		setAttr_subtype(attr_subtype);
		setReserved(reserved);
		setAttrLength(attrLength);
		setEscapeSeqLength(escapeSeqLength);
		setCharSetType(charSetType);
		setEscapeSeq(escapeSeq);
	}
	public charSet_info_s() {
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
	public Object getEscapeSeqLength() {
		return escapeSeqLength;
	}
	public void setEscapeSeqLength(Object newEscapeSeqLength) {
		escapeSeqLength = newEscapeSeqLength;
	}
	public Object getCharSetType() {
		return charSetType;
	}
	public void setCharSetType(Object newCharSetType) {
		charSetType = newCharSetType;
	}
	public Object[] getEscapeSeq() {
		return escapeSeq;
	}
	public void setEscapeSeq(Object[] newEscapeSeq) {
		escapeSeq = newEscapeSeq;
	}
}
