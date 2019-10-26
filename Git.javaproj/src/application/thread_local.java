package application;

public class thread_local {
	private Object thread;
	private base_data base_cache;
	private Object base_cache_used;
	private int pack_fd;
	
	public thread_local(Object thread, base_data base_cache, Object base_cache_used, int pack_fd) {
		setThread(thread);
		setBase_cache(base_cache);
		setBase_cache_used(base_cache_used);
		setPack_fd(pack_fd);
	}
	public thread_local() {
	}
	
	public thread_local get_thread_data() {
		if (1) {
			if (ModernizedCProgram.threads_active) {
				return ModernizedCProgram.pthread_getspecific(ModernizedCProgram.key);
			} 
			((!ModernizedCProgram.threads_active && "This should only be reached when all threads are gone") ? (Object)0 : ._assert("!threads_active && \"This should only be reached when all threads are gone\"", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\index-pack.c", 356));
		} 
		return ModernizedCProgram.nothread_data;
	}
	public void set_thread_data() {
		if (ModernizedCProgram.threads_active) {
			ModernizedCProgram.pthread_setspecific(ModernizedCProgram.key, data);
		} 
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public base_data getBase_cache() {
		return base_cache;
	}
	public void setBase_cache(base_data newBase_cache) {
		base_cache = newBase_cache;
	}
	public Object getBase_cache_used() {
		return base_cache_used;
	}
	public void setBase_cache_used(Object newBase_cache_used) {
		base_cache_used = newBase_cache_used;
	}
	public int getPack_fd() {
		return pack_fd;
	}
	public void setPack_fd(int newPack_fd) {
		pack_fd = newPack_fd;
	}
}
