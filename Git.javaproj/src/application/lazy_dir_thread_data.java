package application;

public class lazy_dir_thread_data {
	private Object pthread;
	private index_state istate;
	private lazy_entry lazy_entries;
	private int k_start;
	private int k_end;
	
	public lazy_dir_thread_data(Object pthread, index_state istate, lazy_entry lazy_entries, int k_start, int k_end) {
		setPthread(pthread);
		setIstate(istate);
		setLazy_entries(lazy_entries);
		setK_start(k_start);
		setK_end(k_end);
	}
	public lazy_dir_thread_data() {
	}
	
	public Object getPthread() {
		return pthread;
	}
	public void setPthread(Object newPthread) {
		pthread = newPthread;
	}
	public index_state getIstate() {
		return istate;
	}
	public void setIstate(index_state newIstate) {
		istate = newIstate;
	}
	public lazy_entry getLazy_entries() {
		return lazy_entries;
	}
	public void setLazy_entries(lazy_entry newLazy_entries) {
		lazy_entries = newLazy_entries;
	}
	public int getK_start() {
		return k_start;
	}
	public void setK_start(int newK_start) {
		k_start = newK_start;
	}
	public int getK_end() {
		return k_end;
	}
	public void setK_end(int newK_end) {
		k_end = newK_end;
	}
}
