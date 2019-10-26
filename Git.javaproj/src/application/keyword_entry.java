package application;

public class keyword_entry {
	private Object keyword;
	private Object color;
	
	public keyword_entry(Object keyword, Object color) {
		setKeyword(keyword);
		setColor(color);
	}
	public keyword_entry() {
	}
	
	public Object getKeyword() {
		return keyword;
	}
	public void setKeyword(Object newKeyword) {
		keyword = newKeyword;
	}
	public Object getColor() {
		return color;
	}
	public void setColor(Object newColor) {
		color = newColor;
	}
}
/*
	 * We use keyword as config key so it should be a single alphanumeric word.
	 */
