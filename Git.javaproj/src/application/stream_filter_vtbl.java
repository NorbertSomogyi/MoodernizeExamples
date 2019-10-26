package application;

public class stream_filter_vtbl {
	private Object filter;
	private Object free;
	
	public stream_filter_vtbl(Object filter, Object free) {
		setFilter(filter);
		setFree(free);
	}
	public stream_filter_vtbl() {
	}
	
	public Object getFilter() {
		return filter;
	}
	public void setFilter(Object newFilter) {
		filter = newFilter;
	}
	public Object getFree() {
		return free;
	}
	public void setFree(Object newFree) {
		free = newFree;
	}
}
