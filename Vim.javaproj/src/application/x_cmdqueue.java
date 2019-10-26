package application;

public class x_cmdqueue {
	private Object propInfo;
	private Object len;
	private x_cmdqueue next;
	private x_cmdqueue prev;
	
	public x_cmdqueue(Object propInfo, Object len, x_cmdqueue next, x_cmdqueue prev) {
		setPropInfo(propInfo);
		setLen(len);
		setNext(next);
		setPrev(prev);
	}
	public x_cmdqueue() {
	}
	
	public Object getPropInfo() {
		return propInfo;
	}
	public void setPropInfo(Object newPropInfo) {
		propInfo = newPropInfo;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public x_cmdqueue getNext() {
		return next;
	}
	public void setNext(x_cmdqueue newNext) {
		next = newNext;
	}
	public x_cmdqueue getPrev() {
		return prev;
	}
	public void setPrev(x_cmdqueue newPrev) {
		prev = newPrev;
	}
}
