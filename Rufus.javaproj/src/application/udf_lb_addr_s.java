package application;

/** Access Type (ECMA 167r3 3/10.5.7) */
/** Recorded Address (ECMA 167r3 4/7.1) */
public class udf_lb_addr_s {
	private Object lba;
	private Object partitionReferenceNum;
	
	public udf_lb_addr_s(Object lba, Object partitionReferenceNum) {
		setLba(lba);
		setPartitionReferenceNum(partitionReferenceNum);
	}
	public udf_lb_addr_s() {
	}
	
	public Object getLba() {
		return lba;
	}
	public void setLba(Object newLba) {
		lba = newLba;
	}
	public Object getPartitionReferenceNum() {
		return partitionReferenceNum;
	}
	public void setPartitionReferenceNum(Object newPartitionReferenceNum) {
		partitionReferenceNum = newPartitionReferenceNum;
	}
}
