package application;

public class _D3DCLIPSTATUS8 {
	private Object ClipUnion;
	private Object ClipIntersection;
	
	public _D3DCLIPSTATUS8(Object ClipUnion, Object ClipIntersection) {
		setClipUnion(ClipUnion);
		setClipIntersection(ClipIntersection);
	}
	public _D3DCLIPSTATUS8() {
	}
	
	public Object getClipUnion() {
		return ClipUnion;
	}
	public void setClipUnion(Object newClipUnion) {
		ClipUnion = newClipUnion;
	}
	public Object getClipIntersection() {
		return ClipIntersection;
	}
	public void setClipIntersection(Object newClipIntersection) {
		ClipIntersection = newClipIntersection;
	}
}
