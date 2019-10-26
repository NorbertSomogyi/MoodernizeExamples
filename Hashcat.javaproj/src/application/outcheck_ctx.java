package application;

public class outcheck_ctx {
	private boolean enabled;
	private Byte root_directory;
	
	public outcheck_ctx(boolean enabled, Byte root_directory) {
		setEnabled(enabled);
		setRoot_directory(root_directory);
	}
	public outcheck_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getRoot_directory() {
		return root_directory;
	}
	public void setRoot_directory(Byte newRoot_directory) {
		root_directory = newRoot_directory;
	}
}
