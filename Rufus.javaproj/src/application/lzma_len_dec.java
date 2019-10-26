package application;

/* Probabilities for a length decoder. */
/* Length of a normal match */
/* Length of a repeated match */
public class lzma_len_dec {
	private Object choice;
	private Object choice2;
	private Object low;
	private Object mid;
	private Object high;
	
	public lzma_len_dec(Object choice, Object choice2, Object low, Object mid, Object high) {
		setChoice(choice);
		setChoice2(choice2);
		setLow(low);
		setMid(mid);
		setHigh(high);
	}
	public lzma_len_dec() {
	}
	
	public Object getChoice() {
		return choice;
	}
	public void setChoice(Object newChoice) {
		choice = newChoice;
	}
	public Object getChoice2() {
		return choice2;
	}
	public void setChoice2(Object newChoice2) {
		choice2 = newChoice2;
	}
	public Object getLow() {
		return low;
	}
	public void setLow(Object newLow) {
		low = newLow;
	}
	public Object getMid() {
		return mid;
	}
	public void setMid(Object newMid) {
		mid = newMid;
	}
	public Object getHigh() {
		return high;
	}
	public void setHigh(Object newHigh) {
		high = newHigh;
	}
}
/* Probability of match length being at least 10 */
