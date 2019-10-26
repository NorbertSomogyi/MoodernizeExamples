package application;

public class frame_rate_option {
	private Byte name;
	private Byte description;
	
	public frame_rate_option(Byte name, Byte description) {
		setName(name);
		setDescription(description);
	}
	public frame_rate_option() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
}
