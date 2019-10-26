package application;

public class delayed_checkout {
	private ce_delay_state state;
	private string_list filters;
	private string_list paths;
	
	public delayed_checkout(ce_delay_state state, string_list filters, string_list paths) {
		setState(state);
		setFilters(filters);
		setPaths(paths);
	}
	public delayed_checkout() {
	}
	
	public ce_delay_state getState() {
		return state;
	}
	public void setState(ce_delay_state newState) {
		state = newState;
	}
	public string_list getFilters() {
		return filters;
	}
	public void setFilters(string_list newFilters) {
		filters = newFilters;
	}
	public string_list getPaths() {
		return paths;
	}
	public void setPaths(string_list newPaths) {
		paths = newPaths;
	}
}
/*
	 * State of the currently processed cache entry. If the state is
	 * CE_CAN_DELAY, then the filter can delay the current cache entry.
	 * If the state is CE_RETRY, then this signals the filter that the
	 * cache entry was requested before.
	 */
