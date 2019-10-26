package application;

public class line_opt_callback_data {
	private rev_info rev;
	private Object prefix;
	private string_list args;
	
	public line_opt_callback_data(rev_info rev, Object prefix, string_list args) {
		setRev(rev);
		setPrefix(prefix);
		setArgs(args);
	}
	public line_opt_callback_data() {
	}
	
	public rev_info getRev() {
		return rev;
	}
	public void setRev(rev_info newRev) {
		rev = newRev;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public string_list getArgs() {
		return args;
	}
	public void setArgs(string_list newArgs) {
		args = newArgs;
	}
}
