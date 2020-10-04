package application;

public class _LONG_FILE_NAME_ENTRY {
	private Object SeqNum;
	private Object[] NameA;
	private Object Attributes;
	private Object Type;
	private Object Checksum;
	private Object[] NameB;
	private Object Reserved;
	private Object[] NameC;
	
	public _LONG_FILE_NAME_ENTRY(Object SeqNum, Object[] NameA, Object Attributes, Object Type, Object Checksum, Object[] NameB, Object Reserved, Object[] NameC) {
		setSeqNum(SeqNum);
		setNameA(NameA);
		setAttributes(Attributes);
		setType(Type);
		setChecksum(Checksum);
		setNameB(NameB);
		setReserved(Reserved);
		setNameC(NameC);
	}
	public _LONG_FILE_NAME_ENTRY() {
	}
	
	public Object getSeqNum() {
		return SeqNum;
	}
	public void setSeqNum(Object newSeqNum) {
		SeqNum = newSeqNum;
	}
	public Object[] getNameA() {
		return NameA;
	}
	public void setNameA(Object[] newNameA) {
		NameA = newNameA;
	}
	public Object getAttributes() {
		return Attributes;
	}
	public void setAttributes(Object newAttributes) {
		Attributes = newAttributes;
	}
	public Object getType() {
		return Type;
	}
	public void setType(Object newType) {
		Type = newType;
	}
	public Object getChecksum() {
		return Checksum;
	}
	public void setChecksum(Object newChecksum) {
		Checksum = newChecksum;
	}
	public Object[] getNameB() {
		return NameB;
	}
	public void setNameB(Object[] newNameB) {
		NameB = newNameB;
	}
	public Object getReserved() {
		return Reserved;
	}
	public void setReserved(Object newReserved) {
		Reserved = newReserved;
	}
	public Object[] getNameC() {
		return NameC;
	}
	public void setNameC(Object[] newNameC) {
		NameC = newNameC;
	}
}
