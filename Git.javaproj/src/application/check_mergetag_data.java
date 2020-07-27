package application;

public class check_mergetag_data {
	private int argc;
	private Object[][] argv;
	
	public check_mergetag_data(int argc, Object[][] argv) {
		setArgc(argc);
		setArgv(argv);
	}
	public check_mergetag_data() {
	}
	
	public int getArgc() {
		return argc;
	}
	public void setArgc(int newArgc) {
		argc = newArgc;
	}
	public Object[][] getArgv() {
		return argv;
	}
	public void setArgv(Object[][] newArgv) {
		argv = newArgv;
	}
}
