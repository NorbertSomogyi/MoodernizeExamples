package application;

public class thread_params {
	private Object thread;
	private object_entry list;
	private int list_size;
	private int remaining;
	private int window;
	private int depth;
	private int working;
	private int data_ready;
	private Object mutex;
	private Object cond;
	private Integer processed;
	
	public thread_params(Object thread, object_entry list, int list_size, int remaining, int window, int depth, int working, int data_ready, Object mutex, Object cond, Integer processed) {
		setThread(thread);
		setList(list);
		setList_size(list_size);
		setRemaining(remaining);
		setWindow(window);
		setDepth(depth);
		setWorking(working);
		setData_ready(data_ready);
		setMutex(mutex);
		setCond(cond);
		setProcessed(processed);
	}
	public thread_params() {
	}
	
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public object_entry getList() {
		return list;
	}
	public void setList(object_entry newList) {
		list = newList;
	}
	public int getList_size() {
		return list_size;
	}
	public void setList_size(int newList_size) {
		list_size = newList_size;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int newRemaining) {
		remaining = newRemaining;
	}
	public int getWindow() {
		return window;
	}
	public void setWindow(int newWindow) {
		window = newWindow;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public int getWorking() {
		return working;
	}
	public void setWorking(int newWorking) {
		working = newWorking;
	}
	public int getData_ready() {
		return data_ready;
	}
	public void setData_ready(int newData_ready) {
		data_ready = newData_ready;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getCond() {
		return cond;
	}
	public void setCond(Object newCond) {
		cond = newCond;
	}
	public Integer getProcessed() {
		return processed;
	}
	public void setProcessed(Integer newProcessed) {
		processed = newProcessed;
	}
}
