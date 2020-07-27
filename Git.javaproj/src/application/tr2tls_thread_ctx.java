package application;

/*
 * Arbitry limit for thread names for column alignment.
 */
public class tr2tls_thread_ctx {
	private strbuf thread_name;
	private Object array_us_start;
	private int alloc;
	private int nr_open_regions;
	private int thread_id;
	
	public tr2tls_thread_ctx(strbuf thread_name, Object array_us_start, int alloc, int nr_open_regions, int thread_id) {
		setThread_name(thread_name);
		setArray_us_start(array_us_start);
		setAlloc(alloc);
		setNr_open_regions(nr_open_regions);
		setThread_id(thread_id);
	}
	public tr2tls_thread_ctx() {
	}
	
	public tr2tls_thread_ctx tr2tls_create_self(Object thread_name, Object us_thread_start) {
		tr2tls_thread_ctx ctx = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		ctx.setTr2tls_thread_ctx((true));
		Object generatedTr2tls_thread_ctx = ctx.getTr2tls_thread_ctx();
		ctx.setTr2tls_thread_ctx((uint64_t)ModernizedCProgram.xcalloc(generatedTr2tls_thread_ctx, /*Error: Unsupported expression*/));
		generatedTr2tls_thread_ctx[generatedTr2tls_thread_ctx++] = us_thread_start;
		ctx.setTr2tls_thread_ctx(ModernizedCProgram.tr2tls_locked_increment(ModernizedCProgram.tr2_next_thread_id));
		generatedTr2tls_thread_ctx.strbuf_init(0);
		if (generatedTr2tls_thread_ctx) {
			generatedTr2tls_thread_ctx.strbuf_addf("th%02d:", generatedTr2tls_thread_ctx);
		} 
		generatedTr2tls_thread_ctx.strbuf_addstr(thread_name);
		if (generatedTr2tls_thread_ctx.getLen() > TR2_MAX_THREAD_NAME) {
			generatedTr2tls_thread_ctx.strbuf_setlen(TR2_MAX_THREAD_NAME);
		} 
		ModernizedCProgram.pthread_setspecific(ModernizedCProgram.tr2tls_key, ctx);
		return ctx;
	}
	public tr2tls_thread_ctx tr2tls_get_self() {
		tr2tls_thread_ctx ctx = new tr2tls_thread_ctx();
		if (!true) {
			return ModernizedCProgram.tr2tls_thread_main;
		} 
		ctx = ModernizedCProgram.pthread_getspecific(ModernizedCProgram.tr2tls_key/*
			 * If the thread-proc did not call trace2_thread_start(), we won't
			 * have any TLS data associated with the current thread.  Fix it
			 * here and silently continue.
			 */);
		tr2tls_thread_ctx tr2tls_thread_ctx = new tr2tls_thread_ctx();
		if (!ctx) {
			ctx = tr2tls_thread_ctx.tr2tls_create_self("unknown", ModernizedCProgram.getnanotime() / 1000);
		} 
		return ctx;
	}
	public strbuf getThread_name() {
		return thread_name;
	}
	public void setThread_name(strbuf newThread_name) {
		thread_name = newThread_name;
	}
	public Object getArray_us_start() {
		return array_us_start;
	}
	public void setArray_us_start(Object newArray_us_start) {
		array_us_start = newArray_us_start;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr_open_regions() {
		return nr_open_regions;
	}
	public void setNr_open_regions(int newNr_open_regions) {
		nr_open_regions = newNr_open_regions;
	}
	public int getThread_id() {
		return thread_id;
	}
	public void setThread_id(int newThread_id) {
		thread_id = newThread_id;
	}
}
/*
 * Get our TLS data.
 */
/*
 * return true if the current thread is the main thread.
 */
