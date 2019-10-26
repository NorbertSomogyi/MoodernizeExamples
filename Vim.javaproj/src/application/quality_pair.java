package application;

public class quality_pair {
	private Byte name;
	private Object quality;
	
	public quality_pair(Byte name, Object quality) {
		setName(name);
		setQuality(quality);
	}
	public quality_pair() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getQuality() {
		return quality;
	}
	public void setQuality(Object newQuality) {
		quality = newQuality;
	}
}
