package application;

/* TerminalSettings for Windows */
public class TerminalSettings {
	private Object hStdOut;
	private Object dwOutputMode;
	
	public TerminalSettings(Object hStdOut, Object dwOutputMode) {
		setHStdOut(hStdOut);
		setDwOutputMode(dwOutputMode);
	}
	public TerminalSettings() {
	}
	
	public Object getHStdOut() {
		return hStdOut;
	}
	public void setHStdOut(Object newHStdOut) {
		hStdOut = newHStdOut;
	}
	public Object getDwOutputMode() {
		return dwOutputMode;
	}
	public void setDwOutputMode(Object newDwOutputMode) {
		dwOutputMode = newDwOutputMode;
	}
}
