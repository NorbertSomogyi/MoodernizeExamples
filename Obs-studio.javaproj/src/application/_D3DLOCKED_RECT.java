package application;

/* Structure for LockRect */
public class _D3DLOCKED_RECT {
	private Object Pitch;
	private Object pBits;
	
	public _D3DLOCKED_RECT(Object Pitch, Object pBits) {
		setPitch(Pitch);
		setPBits(pBits);
	}
	public _D3DLOCKED_RECT() {
	}
	
	public Object getPitch() {
		return Pitch;
	}
	public void setPitch(Object newPitch) {
		Pitch = newPitch;
	}
	public Object getPBits() {
		return pBits;
	}
	public void setPBits(Object newPBits) {
		pBits = newPBits;
	}
}
