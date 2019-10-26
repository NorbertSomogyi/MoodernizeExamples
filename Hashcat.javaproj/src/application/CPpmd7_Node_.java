package application;

public class CPpmd7_Node_ {
	private Object Stamp;
	private Object NU;
	private Object Next;
	private Object Prev;
	
	public CPpmd7_Node_(Object Stamp, Object NU, Object Next, Object Prev) {
		setStamp(Stamp);
		setNU(NU);
		setNext(Next);
		setPrev(Prev);
	}
	public CPpmd7_Node_() {
	}
	
	public Object getStamp() {
		return Stamp;
	}
	public void setStamp(Object newStamp) {
		Stamp = newStamp;
	}
	public Object getNU() {
		return NU;
	}
	public void setNU(Object newNU) {
		NU = newNU;
	}
	public Object getNext() {
		return Next;
	}
	public void setNext(Object newNext) {
		Next = newNext;
	}
	public Object getPrev() {
		return Prev;
	}
	public void setPrev(Object newPrev) {
		Prev = newPrev;
	}
}
