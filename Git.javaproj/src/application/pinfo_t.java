package application;

public class pinfo_t {
	private pinfo_t next;
	private Object pid;
	private Object proc;
	
	public pinfo_t(pinfo_t next, Object pid, Object proc) {
		setNext(next);
		setPid(pid);
		setProc(proc);
	}
	public pinfo_t() {
	}
	
	public pinfo_t getNext() {
		return next;
	}
	public void setNext(pinfo_t newNext) {
		next = newNext;
	}
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public Object getProc() {
		return proc;
	}
	public void setProc(Object newProc) {
		proc = newProc;
	}
}
