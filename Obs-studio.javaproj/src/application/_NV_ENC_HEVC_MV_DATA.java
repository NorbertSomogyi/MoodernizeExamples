package application;

public class _NV_ENC_HEVC_MV_DATA {
	private Object mv;
	private Object cuType;
	private Object cuSize;
	private Object partitionMode;
	private Object lastCUInCTB;
	
	public _NV_ENC_HEVC_MV_DATA(Object mv, Object cuType, Object cuSize, Object partitionMode, Object lastCUInCTB) {
		setMv(mv);
		setCuType(cuType);
		setCuSize(cuSize);
		setPartitionMode(partitionMode);
		setLastCUInCTB(lastCUInCTB);
	}
	public _NV_ENC_HEVC_MV_DATA() {
	}
	
	public Object getMv() {
		return mv;
	}
	public void setMv(Object newMv) {
		mv = newMv;
	}
	public Object getCuType() {
		return cuType;
	}
	public void setCuType(Object newCuType) {
		cuType = newCuType;
	}
	public Object getCuSize() {
		return cuSize;
	}
	public void setCuSize(Object newCuSize) {
		cuSize = newCuSize;
	}
	public Object getPartitionMode() {
		return partitionMode;
	}
	public void setPartitionMode(Object newPartitionMode) {
		partitionMode = newPartitionMode;
	}
	public Object getLastCUInCTB() {
		return lastCUInCTB;
	}
	public void setLastCUInCTB(Object newLastCUInCTB) {
		lastCUInCTB = newLastCUInCTB;
	}
}
