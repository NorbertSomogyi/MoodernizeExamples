package application;

// abbreviation
/*
 * Default mappings for some often used keys.
 */
// Missing: CTRL-C (cancel) and CTRL-V (block selection)
// Use the Windows (CUA) keybindings. (Console)
public class initmap {
	private Object arg;
	private int mode;
	
	public initmap(Object arg, int mode) {
		setArg(arg);
		setMode(mode);
	}
	public initmap() {
	}
	
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
}
// paste, copy and cut
// SHIFT-Insert is "*P
// SHIFT-Insert is "-d"*P
// SHIFT-Insert is ^R^O*
// CTRL-Insert is "*y
// SHIFT-Del is "*d
// CTRL-Del is "*d
// CTRL-X is "*d
// SHIFT-Insert is P
// SHIFT-Insert is "-dP
// SHIFT-Insert is ^R^O"
// CTRL-Insert is y
// SHIFT-Del is d
// CTRL-Del is d
