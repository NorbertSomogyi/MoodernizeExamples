package application;

public class ref_msg {
	private Object gone;
	private Object ahead;
	private Object behind;
	private Object ahead_behind;
	
	public ref_msg(Object gone, Object ahead, Object behind, Object ahead_behind) {
		setGone(gone);
		setAhead(ahead);
		setBehind(behind);
		setAhead_behind(ahead_behind);
	}
	public ref_msg() {
	}
	
	public Object getGone() {
		return gone;
	}
	public void setGone(Object newGone) {
		gone = newGone;
	}
	public Object getAhead() {
		return ahead;
	}
	public void setAhead(Object newAhead) {
		ahead = newAhead;
	}
	public Object getBehind() {
		return behind;
	}
	public void setBehind(Object newBehind) {
		behind = newBehind;
	}
	public Object getAhead_behind() {
		return ahead_behind;
	}
	public void setAhead_behind(Object newAhead_behind) {
		ahead_behind = newAhead_behind;
	}
}
