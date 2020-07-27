package application;

public class reflog_walk_info {
	private commit_reflog[][] logs;
	private Object nr;
	private Object alloc;
	private string_list complete_reflogs;
	private commit_reflog last_commit_reflog;
	
	public reflog_walk_info(commit_reflog[][] logs, Object nr, Object alloc, string_list complete_reflogs, commit_reflog last_commit_reflog) {
		setLogs(logs);
		setNr(nr);
		setAlloc(alloc);
		setComplete_reflogs(complete_reflogs);
		setLast_commit_reflog(last_commit_reflog);
	}
	public reflog_walk_info() {
	}
	
	public void init_reflog_walk() {
		info = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		string_list generatedComplete_reflogs = (info).getComplete_reflogs();
		generatedComplete_reflogs.setStrdup_strings(1);
	}
	public Object get_reflog_ident() {
		commit_reflog generatedLast_commit_reflog = this.getLast_commit_reflog();
		commit_reflog commit_reflog = generatedLast_commit_reflog;
		reflog_info info = new reflog_info();
		if (!commit_reflog) {
			return ((Object)0);
		} 
		complete_reflogs generatedReflogs = commit_reflog.getReflogs();
		reflog_info[] generatedItems = generatedReflogs.getItems();
		int generatedRecno = commit_reflog.getRecno();
		info = generatedItems[generatedRecno + 1];
		Byte generatedEmail = info.getEmail();
		return generatedEmail;
	}
	public Object get_reflog_timestamp() {
		commit_reflog generatedLast_commit_reflog = this.getLast_commit_reflog();
		commit_reflog commit_reflog = generatedLast_commit_reflog;
		reflog_info info = new reflog_info();
		if (!commit_reflog) {
			return 0;
		} 
		complete_reflogs generatedReflogs = commit_reflog.getReflogs();
		reflog_info[] generatedItems = generatedReflogs.getItems();
		int generatedRecno = commit_reflog.getRecno();
		info = generatedItems[generatedRecno + 1];
		Object generatedTimestamp = info.getTimestamp();
		return generatedTimestamp;
	}
	public void show_reflog_message(int oneline, Object dmode, int force_date) {
		commit_reflog generatedLast_commit_reflog = this.getLast_commit_reflog();
		complete_reflogs generatedReflogs = commit_reflog.getReflogs();
		reflog_info[] generatedItems = generatedReflogs.getItems();
		int generatedRecno = commit_reflog.getRecno();
		byte[] generatedBuf = selector.getBuf();
		Byte generatedMessage = info.getMessage();
		Byte generatedEmail = info.getEmail();
		if (reflog_info && generatedLast_commit_reflog) {
			commit_reflog commit_reflog = generatedLast_commit_reflog;
			reflog_info info = new reflog_info();
			strbuf selector = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			info = generatedItems[generatedRecno + 1];
			ModernizedCProgram.get_reflog_selector(selector, reflog_info, dmode, force_date, 0);
			if (oneline) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s: %s", generatedBuf, generatedMessage);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Reflog: %s (%s)\nReflog message: %s", generatedBuf, generatedEmail, generatedMessage);
			} 
			selector.strbuf_release();
		} 
	}
	public int reflog_walk_empty() {
		Object generatedNr = this.getNr();
		return !info || !generatedNr;
	}
	public commit_reflog[][] getLogs() {
		return logs;
	}
	public void setLogs(commit_reflog[][] newLogs) {
		logs = newLogs;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public string_list getComplete_reflogs() {
		return complete_reflogs;
	}
	public void setComplete_reflogs(string_list newComplete_reflogs) {
		complete_reflogs = newComplete_reflogs;
	}
	public commit_reflog getLast_commit_reflog() {
		return last_commit_reflog;
	}
	public void setLast_commit_reflog(commit_reflog newLast_commit_reflog) {
		last_commit_reflog = newLast_commit_reflog;
	}
}
