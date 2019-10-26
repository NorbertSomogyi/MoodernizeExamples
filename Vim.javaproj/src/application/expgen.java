package application;

public class expgen {
	private int context;
	private Object func;
	private int ic;
	private int escaped;
	
	public expgen(int context, Object func, int ic, int escaped) {
		setContext(context);
		setFunc(func);
		setIc(ic);
		setEscaped(escaped);
	}
	public expgen() {
	}
	
	public int getContext() {
		return context;
	}
	public void setContext(int newContext) {
		context = newContext;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public int getIc() {
		return ic;
	}
	public void setIc(int newIc) {
		ic = newIc;
	}
	public int getEscaped() {
		return escaped;
	}
	public void setEscaped(int newEscaped) {
		escaped = newEscaped;
	}
}
