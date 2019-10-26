package application;

public class userdata {
	private Object text;
	private int counter;
	
	public userdata(Object text, int counter) {
		setText(text);
		setCounter(counter);
	}
	public userdata() {
	}
	
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int newCounter) {
		counter = newCounter;
	}
}
