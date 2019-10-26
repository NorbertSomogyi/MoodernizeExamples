package application;

public class git_var {
	private Object name;
	private Object read;
	
	public git_var(Object name, Object read) {
		setName(name);
		setRead(read);
	}
	public git_var() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getRead() {
		return read;
	}
	public void setRead(Object newRead) {
		read = newRead;
	}
}
