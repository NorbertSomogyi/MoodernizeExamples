package application;

public class _NV_ENC_H264_MV_DATA {
	private Object mv;
	private Object mbType;
	private Object partitionType;
	private Object reserved;
	private Object mbCost;
	
	public _NV_ENC_H264_MV_DATA(Object mv, Object mbType, Object partitionType, Object reserved, Object mbCost) {
		setMv(mv);
		setMbType(mbType);
		setPartitionType(partitionType);
		setReserved(reserved);
		setMbCost(mbCost);
	}
	public _NV_ENC_H264_MV_DATA() {
	}
	
	public Object getMv() {
		return mv;
	}
	public void setMv(Object newMv) {
		mv = newMv;
	}
	public Object getMbType() {
		return mbType;
	}
	public void setMbType(Object newMbType) {
		mbType = newMbType;
	}
	public Object getPartitionType() {
		return partitionType;
	}
	public void setPartitionType(Object newPartitionType) {
		partitionType = newPartitionType;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getMbCost() {
		return mbCost;
	}
	public void setMbCost(Object newMbCost) {
		mbCost = newMbCost;
	}
}
