package application;

public class pidfile_data {
	private Object pid;
	
	public pidfile_data(Object pid) {
		setPid(pid);
	}
	public pidfile_data() {
	}
	
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
}
