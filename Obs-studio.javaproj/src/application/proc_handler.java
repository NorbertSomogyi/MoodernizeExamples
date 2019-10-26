package application;

public class proc_handler {
	private Object ;
	
	public proc_handler(Object ) {
		set();
	}
	public proc_handler() {
	}
	
	public proc_handler proc_handler_create() {
		proc_handler handler = ModernizedCProgram.bmalloc();
		Object generatedProcs = handler.getProcs();
		.da_init(generatedProcs);
		return handler;
	}
	public void proc_handler_destroy() {
		Object generatedProcs = this.getProcs();
		if (handler) {
			for (size_t i = 0;
			 i < generatedProcs.getNum(); i++) {
				generatedProcs.getArray() + i.proc_info_free();
			}
			.da_free(generatedProcs);
			ModernizedCProgram.bfree(handler);
		} 
	}
	public void proc_handler_add(Object decl_string, Object proc, Object data) {
		if (!handler) {
			return ;
		} 
		proc_info pi = new proc_info();
		.memset(pi, 0, );
		decl_info generatedFunc = pi.getFunc();
		if (!generatedFunc.parse_decl_string(decl_string)) {
			ModernizedCProgram.blog(LOG_ERROR, "Function declaration invalid: %s", decl_string);
			return ;
		} 
		pi.setCallback(proc);
		pi.setData(data);
		Object generatedProcs = this.getProcs();
		.da_push_back(generatedProcs, pi);
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
/* TODO: replace with hash table lookup? */
