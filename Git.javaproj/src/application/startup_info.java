package application;

/* setup.c */
public class startup_info {
	private int have_repository;
	private Object prefix;
	
	public startup_info(int have_repository, Object prefix) {
		setHave_repository(have_repository);
		setPrefix(prefix);
	}
	public startup_info() {
	}
	
	public int getHave_repository() {
		return have_repository;
	}
	public void setHave_repository(int newHave_repository) {
		have_repository = newHave_repository;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
}
