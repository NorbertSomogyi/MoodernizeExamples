package application;

public class EventData {
	private Object oldEvent;
	private int count;
	
	public EventData(Object oldEvent, int count) {
		setOldEvent(oldEvent);
		setCount(count);
	}
	public EventData() {
	}
	
	public Object getOldEvent() {
		return oldEvent;
	}
	public void setOldEvent(Object newOldEvent) {
		oldEvent = newOldEvent;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
