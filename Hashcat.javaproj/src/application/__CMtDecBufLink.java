package application;

public class __CMtDecBufLink {
	private __CMtDecBufLink next;
	private Object[] pad;
	
	public __CMtDecBufLink(__CMtDecBufLink next, Object[] pad) {
		setNext(next);
		setPad(pad);
	}
	public __CMtDecBufLink() {
	}
	
	public __CMtDecBufLink getNext() {
		return next;
	}
	public void setNext(__CMtDecBufLink newNext) {
		next = newNext;
	}
	public Object[] getPad() {
		return pad;
	}
	public void setPad(Object[] newPad) {
		pad = newPad;
	}
}
