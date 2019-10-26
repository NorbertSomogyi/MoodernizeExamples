package application;

public class grab_nth_branch_switch_cbdata {
	private int remaining;
	private strbuf sb;
	
	public grab_nth_branch_switch_cbdata(int remaining, strbuf sb) {
		setRemaining(remaining);
		setSb(sb);
	}
	public grab_nth_branch_switch_cbdata() {
	}
	
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int newRemaining) {
		remaining = newRemaining;
	}
	public strbuf getSb() {
		return sb;
	}
	public void setSb(strbuf newSb) {
		sb = newSb;
	}
}
