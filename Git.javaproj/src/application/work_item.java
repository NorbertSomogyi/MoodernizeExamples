package application;

/* We use one producer thread and THREADS consumer
 * threads. The producer adds struct work_items to 'todo' and the
 * consumers pick work items from the same array.
 */
public class work_item {
	private grep_source source;
	private byte done;
	private strbuf out;
	
	public work_item(grep_source source, byte done, strbuf out) {
		setSource(source);
		setDone(done);
		setOut(out);
	}
	public work_item() {
	}
	
	public work_item get_work() {
		work_item ret = new work_item();
		ModernizedCProgram.grep_lock();
		while (ModernizedCProgram.todo_start == ModernizedCProgram.todo_end && !ModernizedCProgram.all_work_added) {
			.pthread_cond_wait(ModernizedCProgram.cond_add, ModernizedCProgram.grep_mutex);
		}
		if (ModernizedCProgram.todo_start == ModernizedCProgram.todo_end && ModernizedCProgram.all_work_added) {
			ret = ((Object)0);
		} else {
				ret = ModernizedCProgram.todo[ModernizedCProgram.todo_start];
				ModernizedCProgram.todo_start = (ModernizedCProgram.todo_start + 1) % ( /  + ( - 1));
		} 
		ModernizedCProgram.grep_unlock();
		return ret;
	}
	public void work_done() {
		int old_done;
		ModernizedCProgram.grep_lock();
		this.setDone(1);
		old_done = ModernizedCProgram.todo_done;
		strbuf generatedOut = this.getOut();
		Object generatedLen = generatedOut.getLen();
		byte generatedBuf = generatedOut.getBuf();
		grep_source generatedSource = this.getSource();
		for (; ModernizedCProgram.todo[ModernizedCProgram.todo_done].getDone() && ModernizedCProgram.todo_done != ModernizedCProgram.todo_start; ModernizedCProgram.todo_done = (ModernizedCProgram.todo_done + 1) % ( /  + ( - 1))) {
			w = ModernizedCProgram.todo[ModernizedCProgram.todo_done];
			if (generatedLen) {
				byte p = generatedBuf;
				size_t len = generatedLen;
				if (/* Skip the leading hunk mark of the first file. */ModernizedCProgram.skip_first_line) {
					while (ModernizedCProgram.len) {
						ModernizedCProgram.len--;
						if (p++ == (byte)'\n') {
							break;
						} 
					}
					ModernizedCProgram.skip_first_line = 0;
				} 
				ModernizedCProgram.write_or_die(1, p, ModernizedCProgram.len);
			} 
			.grep_source_clear(generatedSource);
		}
		if (old_done != ModernizedCProgram.todo_done) {
			.pthread_cond_signal(ModernizedCProgram.cond_write);
		} 
		if (ModernizedCProgram.all_work_added && ModernizedCProgram.todo_done == ModernizedCProgram.todo_end) {
			.pthread_cond_signal(ModernizedCProgram.cond_result);
		} 
		ModernizedCProgram.grep_unlock();
	}
	public grep_source getSource() {
		return source;
	}
	public void setSource(grep_source newSource) {
		source = newSource;
	}
	public byte getDone() {
		return done;
	}
	public void setDone(byte newDone) {
		done = newDone;
	}
	public strbuf getOut() {
		return out;
	}
	public void setOut(strbuf newOut) {
		out = newOut;
	}
}
