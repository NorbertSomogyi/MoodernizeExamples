package application;

public class trace_key {
	private Object key;
	private int fd;
	private int initialized;
	private int need_close;
	
	public trace_key(Object key, int fd, int initialized, int need_close) {
		setKey(key);
		setFd(fd);
		setInitialized(initialized);
		setNeed_close(need_close);
	}
	public trace_key() {
	}
	
	public int trace_pass_fl() {
		return ModernizedCProgram.key.getFd() || !ModernizedCProgram.key.getInitialized();
	}
	/* Get a trace file descriptor from "key" env variable. */
	public int get_trace_fd() {
		byte trace;
		if (ModernizedCProgram.key.getInitialized()) {
			return ModernizedCProgram.key.getFd();
		} 
		trace = /*Error: Function owner not recognized*/getenv(ModernizedCProgram.key.getKey());
		if (!trace || !/*Error: Function owner not recognized*/strcmp(trace, "") || !/*Error: Function owner not recognized*/strcmp(trace, "0") || !/*Error: Function owner not recognized*/strcasecmp(trace, "false")) {
			ModernizedCProgram.key.setFd(0);
		}  else if (!/*Error: Function owner not recognized*/strcmp(trace, "1") || !/*Error: Function owner not recognized*/strcasecmp(trace, "true")) {
			ModernizedCProgram.key.setFd(2);
		}  else if (/*Error: Function owner not recognized*/strlen(trace) == 1 && ((ModernizedCProgram.sane_ctype[(byte)(trace)] & (true)) != 0)) {
			ModernizedCProgram.key.setFd(/*Error: Function owner not recognized*/atoi(trace));
		}  else if (ModernizedCProgram.is_absolute_path(trace)) {
			int fd = /*Error: Function owner not recognized*/open(trace, 1 | -1024 | -1024, 666);
			if (fd == -1) {
				ModernizedCProgram.warning("could not open '%s' for tracing: %s", trace, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				ModernizedCProgram.key.trace_disable();
			} else {
					ModernizedCProgram.key.setFd(fd);
					ModernizedCProgram.key.setNeed_close(1);
			} 
		} else {
				ModernizedCProgram.warning("unknown trace value for '%s': %s\n         If you want to trace into a file, then please set %s\n         to an absolute pathname (starting with /)", ModernizedCProgram.key.getKey(), trace, ModernizedCProgram.key.getKey());
				ModernizedCProgram.key.trace_disable();
		} 
		ModernizedCProgram.key.setInitialized(1);
		return ModernizedCProgram.key.getFd();
	}
	public void trace_disable() {
		if (ModernizedCProgram.key.getNeed_close()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(ModernizedCProgram.key.getFd());
		} 
		ModernizedCProgram.key.setFd(0);
		ModernizedCProgram.key.setInitialized(1);
		ModernizedCProgram.key.setNeed_close(0);
	}
	public void trace_write(Object buf, int len) {
		if (ModernizedCProgram.write_in_full(ModernizedCProgram.key.get_trace_fd(), buf, len) < 0) {
			ModernizedCProgram.warning("unable to write trace for %s: %s", ModernizedCProgram.key.getKey(), /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			ModernizedCProgram.key.trace_disable();
		} 
	}
	public void trace_verbatim(Object buf, int len) {
		if (!ModernizedCProgram.key.trace_want()) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.key.trace_write(buf, len);
	}
	public void trace_vprintf_fl(Object file, int line, Object format, Object ap) {
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!ModernizedCProgram.prepare_trace_line(file, line, ModernizedCProgram.key, buf)) {
			return /*Error: Unsupported expression*/;
		} 
		buf.strbuf_vaddf(format, ap);
		ModernizedCProgram.print_trace_line(ModernizedCProgram.key, buf);
		buf.strbuf_release();
	}
	public void trace_strbuf_fl(Object file, int line, Object data) {
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!ModernizedCProgram.prepare_trace_line(file, line, ModernizedCProgram.key, buf)) {
			return /*Error: Unsupported expression*/;
		} 
		buf.strbuf_addbuf(data);
		ModernizedCProgram.print_trace_line(ModernizedCProgram.key, buf);
		buf.strbuf_release();
	}
	/* Allow callers to leave without tracing anything */
	public void trace_printf_key_fl(Object file, int line, Object format) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, format);
		ModernizedCProgram.key.trace_vprintf_fl(file, line, format, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
	}
	public int trace_want() {
		return !!ModernizedCProgram.key.get_trace_fd();
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getNeed_close() {
		return need_close;
	}
	public void setNeed_close(int newNeed_close) {
		need_close = newNeed_close;
	}
}
