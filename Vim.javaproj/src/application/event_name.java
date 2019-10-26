package application;

public class event_name {
	private Byte name;
	private auto_event event;
	
	public event_name(Byte name, auto_event event) {
		setName(name);
		setEvent(event);
	}
	public event_name() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public auto_event getEvent() {
		return event;
	}
	public void setEvent(auto_event newEvent) {
		event = newEvent;
	}
}
