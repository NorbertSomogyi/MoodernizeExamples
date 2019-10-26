package application;

public class rename_cb {
	private Object tmp_renamed_log;
	private int true_errno;
	
	public rename_cb(Object tmp_renamed_log, int true_errno) {
		setTmp_renamed_log(tmp_renamed_log);
		setTrue_errno(true_errno);
	}
	public rename_cb() {
	}
	
	public Object getTmp_renamed_log() {
		return tmp_renamed_log;
	}
	public void setTmp_renamed_log(Object newTmp_renamed_log) {
		tmp_renamed_log = newTmp_renamed_log;
	}
	public int getTrue_errno() {
		return true_errno;
	}
	public void setTrue_errno(int newTrue_errno) {
		true_errno = newTrue_errno;
	}
}
