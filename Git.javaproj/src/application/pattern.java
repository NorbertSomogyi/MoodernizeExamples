package application;

public class pattern {
	private Object pattern;
	private int patternlen;
	private int nowildcardlen;
	private int flags;
	
	public pattern(Object pattern, int patternlen, int nowildcardlen, int flags) {
		setPattern(pattern);
		setPatternlen(patternlen);
		setNowildcardlen(nowildcardlen);
		setFlags(flags);
	}
	public pattern() {
	}
	
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public int getPatternlen() {
		return patternlen;
	}
	public void setPatternlen(int newPatternlen) {
		patternlen = newPatternlen;
	}
	public int getNowildcardlen() {
		return nowildcardlen;
	}
	public void setNowildcardlen(int newNowildcardlen) {
		nowildcardlen = newNowildcardlen;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
