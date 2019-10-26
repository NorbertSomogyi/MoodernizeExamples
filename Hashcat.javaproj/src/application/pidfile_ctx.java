package application;

public class pidfile_ctx {
	private Object pid;
	private Byte filename;
	private pidfile_data pd;
	private boolean pidfile_written;
	
	public pidfile_ctx(Object pid, Byte filename, pidfile_data pd, boolean pidfile_written) {
		setPid(pid);
		setFilename(filename);
		setPd(pd);
		setPidfile_written(pidfile_written);
	}
	public pidfile_ctx() {
	}
	
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public pidfile_data getPd() {
		return pd;
	}
	public void setPd(pidfile_data newPd) {
		pd = newPd;
	}
	public boolean getPidfile_written() {
		return pidfile_written;
	}
	public void setPidfile_written(boolean newPidfile_written) {
		pidfile_written = newPidfile_written;
	}
}
