package application;

public class show_data {
	private Object pattern;
	private replace_format format;
	
	public show_data(Object pattern, replace_format format) {
		setPattern(pattern);
		setFormat(format);
	}
	public show_data() {
	}
	
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public replace_format getFormat() {
		return format;
	}
	public void setFormat(replace_format newFormat) {
		format = newFormat;
	}
}
