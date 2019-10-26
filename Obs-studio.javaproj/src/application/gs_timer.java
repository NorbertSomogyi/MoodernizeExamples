package application;

public class gs_timer {
	private Object queries;
	
	public gs_timer(Object queries) {
		setQueries(queries);
	}
	public gs_timer() {
	}
	
	public gs_timer gs_timer_create() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_timer_create")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice);
	}
	public Object getQueries() {
		return queries;
	}
	public void setQueries(Object newQueries) {
		queries = newQueries;
	}
}
