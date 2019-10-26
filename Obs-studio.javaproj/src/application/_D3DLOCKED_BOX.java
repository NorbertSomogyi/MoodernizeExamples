package application;

public class _D3DLOCKED_BOX {
	private Object RowPitch;
	private Object SlicePitch;
	private Object pBits;
	
	public _D3DLOCKED_BOX(Object RowPitch, Object SlicePitch, Object pBits) {
		setRowPitch(RowPitch);
		setSlicePitch(SlicePitch);
		setPBits(pBits);
	}
	public _D3DLOCKED_BOX() {
	}
	
	public Object getRowPitch() {
		return RowPitch;
	}
	public void setRowPitch(Object newRowPitch) {
		RowPitch = newRowPitch;
	}
	public Object getSlicePitch() {
		return SlicePitch;
	}
	public void setSlicePitch(Object newSlicePitch) {
		SlicePitch = newSlicePitch;
	}
	public Object getPBits() {
		return pBits;
	}
	public void setPBits(Object newPBits) {
		pBits = newPBits;
	}
}
