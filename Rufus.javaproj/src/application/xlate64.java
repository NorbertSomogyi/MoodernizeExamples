package application;

public class xlate64 {
	private Object func;
	private Object real_private;
	
	public xlate64(Object func, Object real_private) {
		setFunc(func);
		setReal_private(real_private);
	}
	public xlate64() {
	}
	
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public Object getReal_private() {
		return real_private;
	}
	public void setReal_private(Object newReal_private) {
		real_private = newReal_private;
	}
}
