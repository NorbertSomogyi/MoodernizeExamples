package application;

public class cb_foreach {
	private int argc;
	private Object[][] argv;
	private Object prefix;
	private int quiet;
	private int recursive;
	
	public cb_foreach(int argc, Object[][] argv, Object prefix, int quiet, int recursive) {
		setArgc(argc);
		setArgv(argv);
		setPrefix(prefix);
		setQuiet(quiet);
		setRecursive(recursive);
	}
	public cb_foreach() {
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
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getRecursive() {
		return recursive;
	}
	public void setRecursive(int newRecursive) {
		recursive = newRecursive;
	}
}
