package application;

public class cpt {
	private Object cracked;
	private Object timestamp;
	
	public cpt(Object cracked, Object timestamp) {
		setCracked(cracked);
		setTimestamp(timestamp);
	}
	public cpt() {
	}
	
	public Object getCracked() {
		return cracked;
	}
	public void setCracked(Object newCracked) {
		cracked = newCracked;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
