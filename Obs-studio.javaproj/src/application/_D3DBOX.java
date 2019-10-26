package application;

/* Structures for LockBox */
public class _D3DBOX {
	private Object Left;
	private Object Top;
	private Object Right;
	private Object Bottom;
	private Object Front;
	private Object Back;
	
	public _D3DBOX(Object Left, Object Top, Object Right, Object Bottom, Object Front, Object Back) {
		setLeft(Left);
		setTop(Top);
		setRight(Right);
		setBottom(Bottom);
		setFront(Front);
		setBack(Back);
	}
	public _D3DBOX() {
	}
	
	public Object getLeft() {
		return Left;
	}
	public void setLeft(Object newLeft) {
		Left = newLeft;
	}
	public Object getTop() {
		return Top;
	}
	public void setTop(Object newTop) {
		Top = newTop;
	}
	public Object getRight() {
		return Right;
	}
	public void setRight(Object newRight) {
		Right = newRight;
	}
	public Object getBottom() {
		return Bottom;
	}
	public void setBottom(Object newBottom) {
		Bottom = newBottom;
	}
	public Object getFront() {
		return Front;
	}
	public void setFront(Object newFront) {
		Front = newFront;
	}
	public Object getBack() {
		return Back;
	}
	public void setBack(Object newBack) {
		Back = newBack;
	}
}
