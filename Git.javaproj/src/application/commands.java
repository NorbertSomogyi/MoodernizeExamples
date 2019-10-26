package application;

public class commands {
	private Object name;
	private Object exec;
	
	public commands(Object name, Object exec) {
		setName(name);
		setExec(exec);
	}
	public commands() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getExec() {
		return exec;
	}
	public void setExec(Object newExec) {
		exec = newExec;
	}
}
