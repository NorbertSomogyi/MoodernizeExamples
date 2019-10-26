package application;

public class mailmap_entry {
	private Byte name;
	private Byte email;
	private string_list namemap;
	
	public mailmap_entry(Byte name, Byte email, string_list namemap) {
		setName(name);
		setEmail(email);
		setNamemap(namemap);
	}
	public mailmap_entry() {
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
	public string_list getNamemap() {
		return namemap;
	}
	public void setNamemap(string_list newNamemap) {
		namemap = newNamemap;
	}
}
/* name and email for the simple mail-only case */
