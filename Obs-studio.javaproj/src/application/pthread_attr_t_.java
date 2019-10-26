package application;

public class pthread_attr_t_ {
	private long valid;
	private Object stackaddr;
	private Object stacksize;
	private int detachstate;
	private sched_param param;
	private int inheritsched;
	private int contentionscope;
	
	public pthread_attr_t_(long valid, Object stackaddr, Object stacksize, int detachstate, sched_param param, int inheritsched, int contentionscope) {
		setValid(valid);
		setStackaddr(stackaddr);
		setStacksize(stacksize);
		setDetachstate(detachstate);
		setParam(param);
		setInheritsched(inheritsched);
		setContentionscope(contentionscope);
	}
	public pthread_attr_t_() {
	}
	
	public long getValid() {
		return valid;
	}
	public void setValid(long newValid) {
		valid = newValid;
	}
	public Object getStackaddr() {
		return stackaddr;
	}
	public void setStackaddr(Object newStackaddr) {
		stackaddr = newStackaddr;
	}
	public Object getStacksize() {
		return stacksize;
	}
	public void setStacksize(Object newStacksize) {
		stacksize = newStacksize;
	}
	public int getDetachstate() {
		return detachstate;
	}
	public void setDetachstate(int newDetachstate) {
		detachstate = newDetachstate;
	}
	public sched_param getParam() {
		return param;
	}
	public void setParam(sched_param newParam) {
		param = newParam;
	}
	public int getInheritsched() {
		return inheritsched;
	}
	public void setInheritsched(int newInheritsched) {
		inheritsched = newInheritsched;
	}
	public int getContentionscope() {
		return contentionscope;
	}
	public void setContentionscope(int newContentionscope) {
		contentionscope = newContentionscope;
	}
}
