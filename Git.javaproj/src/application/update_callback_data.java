package application;

public class update_callback_data {
	private int flags;
	private int add_errors;
	
	public update_callback_data(int flags, int add_errors) {
		setFlags(flags);
		setAdd_errors(add_errors);
	}
	public update_callback_data() {
	}
	
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getAdd_errors() {
		return add_errors;
	}
	public void setAdd_errors(int newAdd_errors) {
		add_errors = newAdd_errors;
	}
}
