package application;

public class syl_item_S {
	private Object sy_chars;
	private int sy_len;
	
	public syl_item_S(Object sy_chars, int sy_len) {
		setSy_chars(sy_chars);
		setSy_len(sy_len);
	}
	public syl_item_S() {
	}
	
	public Object getSy_chars() {
		return sy_chars;
	}
	public void setSy_chars(Object newSy_chars) {
		sy_chars = newSy_chars;
	}
	public int getSy_len() {
		return sy_len;
	}
	public void setSy_len(int newSy_len) {
		sy_len = newSy_len;
	}
}
