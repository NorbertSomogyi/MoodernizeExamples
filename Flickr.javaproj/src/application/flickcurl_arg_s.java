package application;

public class flickcurl_arg_s {
	private Object name;
	private int optional;
	private Object description;
	
	public flickcurl_arg_s(Object name, int optional, Object description) {
		setName(name);
		setOptional(optional);
		setDescription(description);
	}
	public flickcurl_arg_s() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getOptional() {
		return optional;
	}
	public void setOptional(int newOptional) {
		optional = newOptional;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
}
