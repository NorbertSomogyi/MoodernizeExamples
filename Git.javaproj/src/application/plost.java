package application;

/* Lines lost from current parent (before coalescing) */
public class plost {
	private lline lost_head;
	private lline lost_tail;
	private int len;
	
	public plost(lline lost_head, lline lost_tail, int len) {
		setLost_head(lost_head);
		setLost_tail(lost_tail);
		setLen(len);
	}
	public plost() {
	}
	
	public lline getLost_head() {
		return lost_head;
	}
	public void setLost_head(lline newLost_head) {
		lost_head = newLost_head;
	}
	public lline getLost_tail() {
		return lost_tail;
	}
	public void setLost_tail(lline newLost_tail) {
		lost_tail = newLost_tail;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
}
