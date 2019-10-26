package application;

public class ThreadParms {
	private Object tid;
	private Object arg;
	
	public ThreadParms(Object tid, Object arg) {
		setTid(tid);
		setArg(arg);
	}
	public ThreadParms() {
	}
	
	public Object getTid() {
		return tid;
	}
	public void setTid(Object newTid) {
		tid = newTid;
	}
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
}
