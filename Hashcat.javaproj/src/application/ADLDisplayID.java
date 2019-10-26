package application;

public class ADLDisplayID {
	private int iDisplayLogicalIndex;
	private int iDisplayPhysicalIndex;
	private int iDisplayLogicalAdapterIndex;
	private int iDisplayPhysicalAdapterIndex;
	
	public ADLDisplayID(int iDisplayLogicalIndex, int iDisplayPhysicalIndex, int iDisplayLogicalAdapterIndex, int iDisplayPhysicalAdapterIndex) {
		setIDisplayLogicalIndex(iDisplayLogicalIndex);
		setIDisplayPhysicalIndex(iDisplayPhysicalIndex);
		setIDisplayLogicalAdapterIndex(iDisplayLogicalAdapterIndex);
		setIDisplayPhysicalAdapterIndex(iDisplayPhysicalAdapterIndex);
	}
	public ADLDisplayID() {
	}
	
	public int getIDisplayLogicalIndex() {
		return iDisplayLogicalIndex;
	}
	public void setIDisplayLogicalIndex(int newIDisplayLogicalIndex) {
		iDisplayLogicalIndex = newIDisplayLogicalIndex;
	}
	public int getIDisplayPhysicalIndex() {
		return iDisplayPhysicalIndex;
	}
	public void setIDisplayPhysicalIndex(int newIDisplayPhysicalIndex) {
		iDisplayPhysicalIndex = newIDisplayPhysicalIndex;
	}
	public int getIDisplayLogicalAdapterIndex() {
		return iDisplayLogicalAdapterIndex;
	}
	public void setIDisplayLogicalAdapterIndex(int newIDisplayLogicalAdapterIndex) {
		iDisplayLogicalAdapterIndex = newIDisplayLogicalAdapterIndex;
	}
	public int getIDisplayPhysicalAdapterIndex() {
		return iDisplayPhysicalAdapterIndex;
	}
	public void setIDisplayPhysicalAdapterIndex(int newIDisplayPhysicalAdapterIndex) {
		iDisplayPhysicalAdapterIndex = newIDisplayPhysicalAdapterIndex;
	}
}
