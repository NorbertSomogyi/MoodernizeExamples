package application;

public class tag_search_info {
	private Object low_offset;
	private Object high_offset;
	private Object curr_offset;
	private Object curr_offset_used;
	private Object match_offset;
	private int low_char;
	private int high_char;
	
	public tag_search_info(Object low_offset, Object high_offset, Object curr_offset, Object curr_offset_used, Object match_offset, int low_char, int high_char) {
		setLow_offset(low_offset);
		setHigh_offset(high_offset);
		setCurr_offset(curr_offset);
		setCurr_offset_used(curr_offset_used);
		setMatch_offset(match_offset);
		setLow_char(low_char);
		setHigh_char(high_char);
	}
	public tag_search_info() {
	}
	
	public Object getLow_offset() {
		return low_offset;
	}
	public void setLow_offset(Object newLow_offset) {
		low_offset = newLow_offset;
	}
	public Object getHigh_offset() {
		return high_offset;
	}
	public void setHigh_offset(Object newHigh_offset) {
		high_offset = newHigh_offset;
	}
	public Object getCurr_offset() {
		return curr_offset;
	}
	public void setCurr_offset(Object newCurr_offset) {
		curr_offset = newCurr_offset;
	}
	public Object getCurr_offset_used() {
		return curr_offset_used;
	}
	public void setCurr_offset_used(Object newCurr_offset_used) {
		curr_offset_used = newCurr_offset_used;
	}
	public Object getMatch_offset() {
		return match_offset;
	}
	public void setMatch_offset(Object newMatch_offset) {
		match_offset = newMatch_offset;
	}
	public int getLow_char() {
		return low_char;
	}
	public void setLow_char(int newLow_char) {
		low_char = newLow_char;
	}
	public int getHigh_char() {
		return high_char;
	}
	public void setHigh_char(int newHigh_char) {
		high_char = newHigh_char;
	}
}
