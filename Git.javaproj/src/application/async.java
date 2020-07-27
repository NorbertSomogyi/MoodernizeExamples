package application;

public class async {
	private Object proc;
	private Object data;
	private int in;
	private int out;
	private Object tid;
	private int proc_in;
	private int proc_out;
	private int isolate_sigpipe;
	
	public async(Object proc, Object data, int in, int out, Object tid, int proc_in, int proc_out, int isolate_sigpipe) {
		setProc(proc);
		setData(data);
		setIn(in);
		setOut(out);
		setTid(tid);
		setProc_in(proc_in);
		setProc_out(proc_out);
		setIsolate_sigpipe(isolate_sigpipe);
	}
	public async() {
	}
	
	public int start_async() {
		int need_in;
		int need_out;
		int[] fdin = new int[2];
		int[] fdout = new int[2];
		int proc_in;
		int proc_out;
		int generatedIn = this.getIn();
		need_in = generatedIn < 0;
		int generatedOut = this.getOut();
		if (need_in) {
			if (ModernizedCProgram.pipe(fdin) < 0) {
				if (generatedOut > 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedOut);
				} 
				return ();
			} 
			this.setIn(fdin[1]);
		} 
		need_out = generatedOut < 0;
		if (need_out) {
			if (ModernizedCProgram.pipe(fdout) < 0) {
				if (need_in) {
					ModernizedCProgram.close_pair(fdin);
				}  else if (generatedIn) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedIn);
				} 
				return ();
			} 
			this.setOut(fdout[0]);
		} 
		if (need_in) {
			proc_in = fdin[0];
		}  else if (generatedIn) {
			proc_in = generatedIn;
		} else {
				proc_in = -1;
		} 
		if (need_out) {
			proc_out = fdout[1];
		}  else if (generatedOut) {
			proc_out = generatedOut;
		} else {
				proc_out = -1/* Flush stdio before fork() to avoid cloning buffers */;
		} 
		if (!ModernizedCProgram.main_thread_set/*
				 * We assume that the first time that start_async is called
				 * it is from the main thread.
				 */) {
			ModernizedCProgram.main_thread_set = 1;
			ModernizedCProgram.main_thread = ModernizedCProgram.pthread_self();
			ModernizedCProgram.pthread_key_create(ModernizedCProgram.async_key, ((Object)0));
			ModernizedCProgram.pthread_key_create(ModernizedCProgram.async_die_counter, ((Object)0));
			ModernizedCProgram.set_die_routine(die_async);
			ModernizedCProgram.set_die_is_recursing_routine(async_die_is_recursing);
		} 
		if (proc_in >= 0) {
			ModernizedCProgram.set_cloexec(proc_in);
		} 
		if (proc_out >= 0) {
			ModernizedCProgram.set_cloexec(proc_out);
		} 
		this.setProc_in(proc_in);
		this.setProc_out(proc_out);
		Object generatedTid = this.getTid();
		{ 
			int err = generatedTid.pthread_create(((Object)0), run_thread, async);
			if (ModernizedCProgram.err) {
				();
				;
			} 
		}
		return 0;
		if (need_out) {
			ModernizedCProgram.close_pair(fdout);
		}  else if (generatedOut) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedOut);
		} 
		return -1;
	}
	public int finish_async() {
		Object ret = (Object)(intptr_t)(true);
		Object generatedTid = this.getTid();
		if (/*Error: Function owner not recognized*/pthread_join(generatedTid, ret)) {
			();
		} 
		return (int)(intptr_t)ret;
	}
	public Object getProc() {
		return proc;
	}
	public void setProc(Object newProc) {
		proc = newProc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int newIn) {
		in = newIn;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int newOut) {
		out = newOut;
	}
	public Object getTid() {
		return tid;
	}
	public void setTid(Object newTid) {
		tid = newTid;
	}
	public int getProc_in() {
		return proc_in;
	}
	public void setProc_in(int newProc_in) {
		proc_in = newProc_in;
	}
	public int getProc_out() {
		return proc_out;
	}
	public void setProc_out(int newProc_out) {
		proc_out = newProc_out;
	}
	public int getIsolate_sigpipe() {
		return isolate_sigpipe;
	}
	public void setIsolate_sigpipe(int newIsolate_sigpipe) {
		isolate_sigpipe = newIsolate_sigpipe;
	}
}
/*
	 * proc reads from in; closes it before return
	 * proc writes to out; closes it before return
	 * returns 0 on success, non-zero on failure
	 */
