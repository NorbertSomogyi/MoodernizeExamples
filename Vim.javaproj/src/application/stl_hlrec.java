package application;

/*
 * Used for highlighting in the status line.
 */
public class stl_hlrec {
	private Object start;
	private int userhl;
	
	public stl_hlrec(Object start, int userhl) {
		setStart(start);
		setUserhl(userhl);
	}
	public stl_hlrec() {
	}
	
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public int getUserhl() {
		return userhl;
	}
	public void setUserhl(int newUserhl) {
		userhl = newUserhl;
	}
}
