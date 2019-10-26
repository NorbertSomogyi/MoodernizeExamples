package application;

public class menu_opts {
	private Object header;
	private Object prompt;
	private int flags;
	
	public menu_opts(Object header, Object prompt, int flags) {
		setHeader(header);
		setPrompt(prompt);
		setFlags(flags);
	}
	public menu_opts() {
	}
	
	public Object getHeader() {
		return header;
	}
	public void setHeader(Object newHeader) {
		header = newHeader;
	}
	public Object getPrompt() {
		return prompt;
	}
	public void setPrompt(Object newPrompt) {
		prompt = newPrompt;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
