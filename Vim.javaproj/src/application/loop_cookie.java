package application;

public class loop_cookie {
	private growarray lines_gap;
	private int current_line;
	private int repeating;
	private Object getline;
	private Object cookie;
	
	public loop_cookie(growarray lines_gap, int current_line, int repeating, Object getline, Object cookie) {
		setLines_gap(lines_gap);
		setCurrent_line(current_line);
		setRepeating(repeating);
		setGetline(getline);
		setCookie(cookie);
	}
	public loop_cookie() {
	}
	
	public growarray getLines_gap() {
		return lines_gap;
	}
	public void setLines_gap(growarray newLines_gap) {
		lines_gap = newLines_gap;
	}
	public int getCurrent_line() {
		return current_line;
	}
	public void setCurrent_line(int newCurrent_line) {
		current_line = newCurrent_line;
	}
	public int getRepeating() {
		return repeating;
	}
	public void setRepeating(int newRepeating) {
		repeating = newRepeating;
	}
	public Object getGetline() {
		return getline;
	}
	public void setGetline(Object newGetline) {
		getline = newGetline;
	}
	public Object getCookie() {
		return cookie;
	}
	public void setCookie(Object newCookie) {
		cookie = newCookie;
	}
}
