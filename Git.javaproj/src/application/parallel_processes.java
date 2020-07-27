package application;

public class parallel_processes {
	private Object data;
	private int max_processes;
	private int nr_processes;
	private Object get_next_task;
	private Object start_failure;
	private Object task_finished;
	private [] children;
	private compat_pollfd[] pfd;
	private int shutdown;
	private int output_owner;
	private strbuf buffered_output;
	
	public parallel_processes(Object data, int max_processes, int nr_processes, Object get_next_task, Object start_failure, Object task_finished, [] children, compat_pollfd[] pfd, int shutdown, int output_owner, strbuf buffered_output) {
		setData(data);
		setMax_processes(max_processes);
		setNr_processes(nr_processes);
		setGet_next_task(get_next_task);
		setStart_failure(start_failure);
		setTask_finished(task_finished);
		setChildren(children);
		setPfd(pfd);
		setShutdown(shutdown);
		setOutput_owner(output_owner);
		setBuffered_output(buffered_output);
	}
	public parallel_processes() {
	}
	
	public void kill_children(int signo) {
		int generatedMax_processes = this.getMax_processes();
		int i;
		int n = generatedMax_processes;
		[] generatedChildren = this.getChildren();
		for (i = 0; i < n; i++) {
			if (generatedChildren[i].getState() == child_state.GIT_CP_WORKING) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/kill(generatedChildren[i].getProcess().getPid(), signo);
			} 
		}
	}
	public void pp_init(int n, Object get_next_task, Object start_failure, Object task_finished, Object data) {
		int i;
		if (n < 1) {
			n = ModernizedCProgram.online_cpus();
		} 
		this.setMax_processes(n);
		do {
			if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
				ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 1616, "run_processes_parallel: preparing to run up to %d tasks", n);
			} 
		} while (0);
		this.setData(data);
		if (!get_next_task) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 1620, "you need to specify a get_next_task function");
		} 
		this.setGet_next_task(get_next_task);
		this.setStart_failure(start_failure ? start_failure : default_start_failure);
		this.setTask_finished(task_finished ? task_finished : default_task_finished);
		this.setNr_processes(0);
		this.setOutput_owner(0);
		this.setShutdown(0);
		[] generatedChildren = this.getChildren();
		this.setChildren(ModernizedCProgram.xcalloc(n, /*Error: sizeof expression not supported yet*/));
		compat_pollfd[] generatedPfd = this.getPfd();
		this.setPfd(ModernizedCProgram.xcalloc(n, /*Error: sizeof expression not supported yet*/));
		strbuf generatedBuffered_output = this.getBuffered_output();
		generatedBuffered_output.strbuf_init(0);
		for (i = 0; i < n; i++) {
			generatedChildren[i].getErr().strbuf_init(0);
			generatedChildren[i].getProcess().child_process_init();
			generatedPfd[i].setEvents(-1024 | -1024);
			generatedPfd[i].setFd(-1);
		}
		ModernizedCProgram.pp_for_signal = pp;
		ModernizedCProgram.sigchain_push_common(handle_children_on_signal);
	}
	public void pp_cleanup() {
		int i;
		do {
			if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
				ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 1648, "run_processes_parallel: done");
			} 
		} while (0);
		int generatedMax_processes = this.getMax_processes();
		[] generatedChildren = this.getChildren();
		for (i = 0; i < generatedMax_processes; i++) {
			generatedChildren[i].getErr().strbuf_release();
			generatedChildren[i].getProcess().child_process_clear();
		}
		ModernizedCProgram.free(generatedChildren);
		compat_pollfd[] generatedPfd = this.getPfd();
		ModernizedCProgram.free(generatedPfd);
		strbuf generatedBuffered_output = this.getBuffered_output();
		ModernizedCProgram.strbuf_write(generatedBuffered_output, (_iob[2]));
		generatedBuffered_output.strbuf_release();
		ModernizedCProgram.sigchain_pop_common();
	}
	public int pp_start_one() {
		int i;
		int code;
		int generatedMax_processes = this.getMax_processes();
		[] generatedChildren = this.getChildren();
		for (i = 0; i < generatedMax_processes; i++) {
			if (generatedChildren[i].getState() == child_state.GIT_CP_FREE) {
				break;
			} 
		}
		if (i == generatedMax_processes) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 1682, "bookkeeping is hard");
		} 
		Object generatedData = this.getData();
		code = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedChildren[i].getProcess(), generatedChildren[i].getErr(), generatedData, generatedData);
		strbuf generatedBuffered_output = this.getBuffered_output();
		if (!code) {
			generatedBuffered_output.strbuf_addbuf(generatedChildren[i].getErr());
			generatedChildren[i].getErr().strbuf_setlen(0);
			return 1;
		} 
		generatedChildren[i].getProcess().setErr(-1);
		generatedChildren[i].getProcess().setStdout_to_stderr(1);
		generatedChildren[i].getProcess().setNo_stdin(1);
		if (generatedChildren[i].getProcess().start_command()) {
			code = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedChildren[i].getErr(), generatedData, generatedData);
			generatedBuffered_output.strbuf_addbuf(generatedChildren[i].getErr());
			generatedChildren[i].getErr().strbuf_setlen(0);
			if (code) {
				this.setShutdown(1);
			} 
			return code;
		} 
		int generatedNr_processes = this.getNr_processes();
		generatedNr_processes++;
		generatedChildren[i].setState(child_state.GIT_CP_WORKING);
		compat_pollfd[] generatedPfd = this.getPfd();
		generatedPfd[i].setFd(generatedChildren[i].getProcess().getErr());
		return 0;
	}
	public void pp_buffer_stderr(int output_timeout) {
		int i;
		compat_pollfd[] generatedPfd = this.getPfd();
		int generatedMax_processes = this.getMax_processes();
		while ((i = generatedPfd.poll(generatedMax_processes, output_timeout)) < 0) {
			if ((/*Error: Function owner not recognized*/_errno()) == 4) {
				continue;
			} 
			pp.pp_cleanup();
			ModernizedCProgram.die_errno("poll");
		}
		[] generatedChildren = this.getChildren();
		for (i = 0; i < generatedMax_processes; /* Buffer output from all pipes. */i++) {
			if (generatedChildren[i].getState() == child_state.GIT_CP_WORKING && generatedPfd[i].getRevents() & (-1024 | -1024)) {
				int n = generatedChildren[i].getErr().strbuf_read_once(generatedChildren[i].getProcess().getErr(), 0);
				if (n == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedChildren[i].getProcess().getErr());
					generatedChildren[i].setState(child_state.GIT_CP_WAIT_CLEANUP);
				}  else if (n < 0) {
					if ((/*Error: Function owner not recognized*/_errno()) != 11) {
						ModernizedCProgram.die_errno("read");
					} 
				} 
			} 
		}
	}
	public void pp_output() {
		int generatedOutput_owner = this.getOutput_owner();
		int i = generatedOutput_owner;
		[] generatedChildren = this.getChildren();
		if (generatedChildren[i].getState() == child_state.GIT_CP_WORKING && generatedChildren[i].getErr().getLen()) {
			ModernizedCProgram.strbuf_write(generatedChildren[i].getErr(), (_iob[2]));
			generatedChildren[i].getErr().strbuf_setlen(0);
		} 
	}
	public int pp_collect_finished() {
		int i;
		int code;
		int generatedMax_processes = this.getMax_processes();
		int n = generatedMax_processes;
		int result = 0;
		int generatedNr_processes = this.getNr_processes();
		[] generatedChildren = this.getChildren();
		Object generatedData = this.getData();
		compat_pollfd[] generatedPfd = this.getPfd();
		int generatedOutput_owner = this.getOutput_owner();
		strbuf generatedBuffered_output = this.getBuffered_output();
		while (generatedNr_processes > 0) {
			for (i = 0; i < generatedMax_processes; i++) {
				if (generatedChildren[i].getState() == child_state.GIT_CP_WAIT_CLEANUP) {
					break;
				} 
			}
			if (i == generatedMax_processes) {
				break;
			} 
			code = generatedChildren[i].getProcess().finish_command();
			code = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(code, generatedChildren[i].getErr(), generatedData, generatedData);
			if (code) {
				result = code;
			} 
			if (code < 0) {
				break;
			} 
			generatedNr_processes--;
			generatedChildren[i].setState(child_state.GIT_CP_FREE);
			generatedPfd[i].setFd(-1);
			generatedChildren[i].getProcess().child_process_init();
			if (i != generatedOutput_owner) {
				generatedBuffered_output.strbuf_addbuf(generatedChildren[i].getErr());
				generatedChildren[i].getErr().strbuf_setlen(0);
			} else {
					ModernizedCProgram.strbuf_write(generatedChildren[i].getErr(), (_iob[2]));
					generatedChildren[i].getErr().strbuf_setlen(0);
					ModernizedCProgram.strbuf_write(generatedBuffered_output, (_iob[/* Output all other finished child processes */2]));
					generatedBuffered_output.strbuf_setlen(0/*
								 * Pick next process to output live.
								 * NEEDSWORK:
								 * For now we pick it randomly by doing a round
								 * robin. Later we may want to pick the one with
								 * the most output or the longest or shortest
								 * running process time.
								 */);
					for (i = 0; i < n; i++) {
						if (generatedChildren[(generatedOutput_owner + i) % n].getState() == child_state.GIT_CP_WORKING) {
							break;
						} 
					}
					this.setOutput_owner((generatedOutput_owner + i) % n);
			} 
		}
		return result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getMax_processes() {
		return max_processes;
	}
	public void setMax_processes(int newMax_processes) {
		max_processes = newMax_processes;
	}
	public int getNr_processes() {
		return nr_processes;
	}
	public void setNr_processes(int newNr_processes) {
		nr_processes = newNr_processes;
	}
	public Object getGet_next_task() {
		return get_next_task;
	}
	public void setGet_next_task(Object newGet_next_task) {
		get_next_task = newGet_next_task;
	}
	public Object getStart_failure() {
		return start_failure;
	}
	public void setStart_failure(Object newStart_failure) {
		start_failure = newStart_failure;
	}
	public Object getTask_finished() {
		return task_finished;
	}
	public void setTask_finished(Object newTask_finished) {
		task_finished = newTask_finished;
	}
	public [] getChildren() {
		return children;
	}
	public void setChildren([] newChildren) {
		children = newChildren;
	}
	public compat_pollfd[] getPfd() {
		return pfd;
	}
	public void setPfd(compat_pollfd[] newPfd) {
		pfd = newPfd;
	}
	public int getShutdown() {
		return shutdown;
	}
	public void setShutdown(int newShutdown) {
		shutdown = newShutdown;
	}
	public int getOutput_owner() {
		return output_owner;
	}
	public void setOutput_owner(int newOutput_owner) {
		output_owner = newOutput_owner;
	}
	public strbuf getBuffered_output() {
		return buffered_output;
	}
	public void setBuffered_output(strbuf newBuffered_output) {
		buffered_output = newBuffered_output;
	}
}
