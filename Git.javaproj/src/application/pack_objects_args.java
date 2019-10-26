package application;

public class pack_objects_args {
	private Object window;
	private Object window_memory;
	private Object depth;
	private Object threads;
	private Object max_pack_size;
	private int no_reuse_delta;
	private int no_reuse_object;
	private int quiet;
	private int local;
	
	public pack_objects_args(Object window, Object window_memory, Object depth, Object threads, Object max_pack_size, int no_reuse_delta, int no_reuse_object, int quiet, int local) {
		setWindow(window);
		setWindow_memory(window_memory);
		setDepth(depth);
		setThreads(threads);
		setMax_pack_size(max_pack_size);
		setNo_reuse_delta(no_reuse_delta);
		setNo_reuse_object(no_reuse_object);
		setQuiet(quiet);
		setLocal(local);
	}
	public pack_objects_args() {
	}
	
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public Object getWindow_memory() {
		return window_memory;
	}
	public void setWindow_memory(Object newWindow_memory) {
		window_memory = newWindow_memory;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
	public Object getThreads() {
		return threads;
	}
	public void setThreads(Object newThreads) {
		threads = newThreads;
	}
	public Object getMax_pack_size() {
		return max_pack_size;
	}
	public void setMax_pack_size(Object newMax_pack_size) {
		max_pack_size = newMax_pack_size;
	}
	public int getNo_reuse_delta() {
		return no_reuse_delta;
	}
	public void setNo_reuse_delta(int newNo_reuse_delta) {
		no_reuse_delta = newNo_reuse_delta;
	}
	public int getNo_reuse_object() {
		return no_reuse_object;
	}
	public void setNo_reuse_object(int newNo_reuse_object) {
		no_reuse_object = newNo_reuse_object;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int newLocal) {
		local = newLocal;
	}
}
