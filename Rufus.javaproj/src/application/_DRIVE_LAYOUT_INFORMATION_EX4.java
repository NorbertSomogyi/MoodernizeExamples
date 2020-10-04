package application;

/* MinGW is unhappy about accessing partitions beside the first unless we redef */
public class _DRIVE_LAYOUT_INFORMATION_EX4 {
	private Object PartitionStyle;
	private Object PartitionCount;
	private  Type;
	private Object[] PartitionEntry;
	
	public _DRIVE_LAYOUT_INFORMATION_EX4(Object PartitionStyle, Object PartitionCount,  Type, Object[] PartitionEntry) {
		setPartitionStyle(PartitionStyle);
		setPartitionCount(PartitionCount);
		setType(Type);
		setPartitionEntry(PartitionEntry);
	}
	public _DRIVE_LAYOUT_INFORMATION_EX4() {
	}
	
	public Object getPartitionStyle() {
		return PartitionStyle;
	}
	public void setPartitionStyle(Object newPartitionStyle) {
		PartitionStyle = newPartitionStyle;
	}
	public Object getPartitionCount() {
		return PartitionCount;
	}
	public void setPartitionCount(Object newPartitionCount) {
		PartitionCount = newPartitionCount;
	}
	public  getType() {
		return Type;
	}
	public void setType( newType) {
		Type = newType;
	}
	public Object[] getPartitionEntry() {
		return PartitionEntry;
	}
	public void setPartitionEntry(Object[] newPartitionEntry) {
		PartitionEntry = newPartitionEntry;
	}
}
