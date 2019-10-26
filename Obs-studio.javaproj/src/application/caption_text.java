package application;

public class caption_text {
	private Object text;
	private double display_duration;
	private caption_text next;
	
	public caption_text(Object text, double display_duration, caption_text next) {
		setText(text);
		setDisplay_duration(display_duration);
		setNext(next);
	}
	public caption_text() {
	}
	
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
	public double getDisplay_duration() {
		return display_duration;
	}
	public void setDisplay_duration(double newDisplay_duration) {
		display_duration = newDisplay_duration;
	}
	public caption_text getNext() {
		return next;
	}
	public void setNext(caption_text newNext) {
		next = newNext;
	}
}
