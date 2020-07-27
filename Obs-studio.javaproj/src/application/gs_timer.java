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
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
	}
	public void gs_timer_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_timer_destroy")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!timer) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(timer);
		if (!timer) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glDeleteQueries(2, this.getQueries());
		ModernizedCProgram.gl_success("glDeleteQueries");
		ModernizedCProgram.bfree(timer);
	}
	public void gs_timer_begin() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_timer_begin")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!timer) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(timer);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glQueryCounter(this.getQueries()[0], GL_TIMESTAMP);
		ModernizedCProgram.gl_success("glQueryCounter");
	}
	public void gs_timer_end() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_timer_end")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!timer) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(timer);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glQueryCounter(this.getQueries()[1], GL_TIMESTAMP);
		ModernizedCProgram.gl_success("glQueryCounter");
	}
	public Object gs_timer_get_data(Object ticks) {
		if (!(ModernizedCProgram.gs_valid("gs_timer_get_data") && ModernizedCProgram.gs_obj_valid(timer, "gs_timer_get_data", "timer") && ModernizedCProgram.gs_obj_valid(ticks, "gs_timer_get_data", "ticks"))) {
			return false;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(timer, ticks);
		 available = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glGetQueryObjectiv(this.getQueries()[1], GL_QUERY_RESULT_AVAILABLE, available);
		 begin = new ();
		 end = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glGetQueryObjectui64v(this.getQueries()[0], GL_QUERY_RESULT, begin);
		ModernizedCProgram.gl_success("glGetQueryObjectui64v");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glGetQueryObjectui64v(this.getQueries()[1], GL_QUERY_RESULT, end);
		ModernizedCProgram.gl_success("glGetQueryObjectui64v");
		ticks = end - begin;
		return true;
	}
	public Object getQueries() {
		return queries;
	}
	public void setQueries(Object newQueries) {
		queries = newQueries;
	}
}
