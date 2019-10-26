package application;

public class child_to_clean {
	private Object pid;
	private child_process process;
	private child_to_clean next;
	
	public child_to_clean(Object pid, child_process process, child_to_clean next) {
		setPid(pid);
		setProcess(process);
		setNext(next);
	}
	public child_to_clean() {
	}
	
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public child_process getProcess() {
		return process;
	}
	public void setProcess(child_process newProcess) {
		process = newProcess;
	}
	public child_to_clean getNext() {
		return next;
	}
	public void setNext(child_to_clean newNext) {
		next = newNext;
	}
}
