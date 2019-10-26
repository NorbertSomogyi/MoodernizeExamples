package application;

public class choice {
	private int active;
	private Byte text;
	private Object changefunc;
	private int arg;
	private Object installfunc;
	
	public choice(int active, Byte text, Object changefunc, int arg, Object installfunc) {
		setActive(active);
		setText(text);
		setChangefunc(changefunc);
		setArg(arg);
		setInstallfunc(installfunc);
	}
	public choice() {
	}
	
	public int getActive() {
		return active;
	}
	public void setActive(int newActive) {
		active = newActive;
	}
	public Byte getText() {
		return text;
	}
	public void setText(Byte newText) {
		text = newText;
	}
	public Object getChangefunc() {
		return changefunc;
	}
	public void setChangefunc(Object newChangefunc) {
		changefunc = newChangefunc;
	}
	public int getArg() {
		return arg;
	}
	public void setArg(int newArg) {
		arg = newArg;
	}
	public Object getInstallfunc() {
		return installfunc;
	}
	public void setInstallfunc(Object newInstallfunc) {
		installfunc = newInstallfunc;
	}
}
