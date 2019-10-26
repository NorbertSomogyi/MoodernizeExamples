package application;

public class mailmap_info {
	private Byte name;
	private Byte email;
	
	public mailmap_info(Byte name, Byte email) {
		setName(name);
		setEmail(email);
	}
	public mailmap_info() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getEmail() {
		return email;
	}
	public void setEmail(Byte newEmail) {
		email = newEmail;
	}
}
