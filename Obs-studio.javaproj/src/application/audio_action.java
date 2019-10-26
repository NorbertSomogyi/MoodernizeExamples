package application;

public class audio_action {
	private Object timestamp;
	private audio_action_type type;
	private double vol;
	private Object set;
	
	public audio_action(Object timestamp, audio_action_type type, double vol, Object set) {
		setTimestamp(timestamp);
		setType(type);
		setVol(vol);
		setSet(set);
	}
	public audio_action() {
	}
	
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public audio_action_type getType() {
		return type;
	}
	public void setType(audio_action_type newType) {
		type = newType;
	}
	public double getVol() {
		return vol;
	}
	public void setVol(double newVol) {
		vol = newVol;
	}
	public Object getSet() {
		return set;
	}
	public void setSet(Object newSet) {
		set = newSet;
	}
}
