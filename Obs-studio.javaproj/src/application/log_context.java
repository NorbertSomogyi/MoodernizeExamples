package application;

public class log_context {
	private Object context;
	private Object str;
	private int print_prefix;
	
	public log_context(Object context, Object str, int print_prefix) {
		setContext(context);
		setStr(str);
		setPrint_prefix(print_prefix);
	}
	public log_context() {
	}
	
	public log_context create_or_fetch_log_context(Object context) {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.log_contexts_mutex);
		for ( i = 0;
		 i < ModernizedCProgram.active_log_contexts.getNum(); i++) {
			if (context == ModernizedCProgram.active_log_contexts.getArray()[i].getContext()) {
				ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.log_contexts_mutex);
				return ModernizedCProgram.active_log_contexts.getArray()[i];
			} 
		}
		log_context new_log_context = NULL;
		 cnt = ModernizedCProgram.cached_log_contexts.getNum();
		if (!!cnt) {
			new_log_context = ModernizedCProgram.cached_log_contexts.getArray()[cnt - 1];
			.da_pop_back(ModernizedCProgram.cached_log_contexts);
		} 
		if (!new_log_context) {
			new_log_context = ModernizedCProgram.bzalloc();
		} 
		new_log_context.setLog_context(context);
		Object generatedLog_context = new_log_context.getLog_context();
		generatedLog_context[0] = (byte)'\0';
		new_log_context.setLog_context(1);
		.da_push_back(ModernizedCProgram.active_log_contexts, new_log_context);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.log_contexts_mutex);
		return new_log_context;
	}
	public void destroy_log_context() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.log_contexts_mutex);
		.da_erase_item(ModernizedCProgram.active_log_contexts, log_context);
		.da_push_back(ModernizedCProgram.cached_log_contexts, log_context);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.log_contexts_mutex);
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public int getPrint_prefix() {
		return print_prefix;
	}
	public void setPrint_prefix(int newPrint_prefix) {
		print_prefix = newPrint_prefix;
	}
}
