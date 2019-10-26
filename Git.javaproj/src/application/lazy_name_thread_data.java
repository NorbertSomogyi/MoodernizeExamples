package application;

public class lazy_name_thread_data {
	private Object pthread;
	private index_state istate;
	private lazy_entry lazy_entries;
	
	public lazy_name_thread_data(Object pthread, index_state istate, lazy_entry lazy_entries) {
		setPthread(pthread);
		setIstate(istate);
		setLazy_entries(lazy_entries);
	}
	public lazy_name_thread_data() {
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
}
