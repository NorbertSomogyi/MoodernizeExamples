package application;

public class fmtpattern {
	private Object convchar;
	private Byte pattern;
	
	public fmtpattern(Object convchar, Byte pattern) {
		setConvchar(convchar);
		setPattern(pattern);
	}
	public fmtpattern() {
	}
	
	public Object getConvchar() {
		return convchar;
	}
	public void setConvchar(Object newConvchar) {
		convchar = newConvchar;
	}
	public Byte getPattern() {
		return pattern;
	}
	public void setPattern(Byte newPattern) {
		pattern = newPattern;
	}
}
