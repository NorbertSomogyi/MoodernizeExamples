package application;

public class refresh_params {
	private int flags;
	private int has_errors;
	
	public refresh_params(int flags, int has_errors) {
		setFlags(flags);
		setHas_errors(has_errors);
	}
	public refresh_params() {
	}
	
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getHas_errors() {
		return has_errors;
	}
	public void setHas_errors(int newHas_errors) {
		has_errors = newHas_errors;
	}
}
