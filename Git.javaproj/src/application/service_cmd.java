package application;

public class service_cmd {
	private Object method;
	private Object pattern;
	private Object imp;
	
	public service_cmd(Object method, Object pattern, Object imp) {
		setMethod(method);
		setPattern(pattern);
		setImp(imp);
	}
	public service_cmd() {
	}
	
	public Object getMethod() {
		return method;
	}
	public void setMethod(Object newMethod) {
		method = newMethod;
	}
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public Object getImp() {
		return imp;
	}
	public void setImp(Object newImp) {
		imp = newImp;
	}
}
