package application;

public class userdiff_funcname {
	private Object pattern;
	private int cflags;
	
	public userdiff_funcname(Object pattern, int cflags) {
		setPattern(pattern);
		setCflags(cflags);
	}
	public userdiff_funcname() {
	}
	
	public int parse_funcname(Object k, Object v, int cflags) {
		Object generatedPattern = this.getPattern();
		if (/*Error: Function owner not recognized*/git_config_string(generatedPattern, k, v) < 0) {
			return -1;
		} 
		this.setCflags(cflags);
		return 0;
	}
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public int getCflags() {
		return cflags;
	}
	public void setCflags(int newCflags) {
		cflags = newCflags;
	}
}
