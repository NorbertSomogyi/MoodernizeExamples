package application;

public class subcommand {
	private Byte name;
	private Object func;
	
	public subcommand(Byte name, Object func) {
		setName(name);
		setFunc(func);
	}
	public subcommand() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
}
