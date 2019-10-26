package application;

// detected job done
// job done and cleanup done
/*
 * Structure to hold info about a Job.
 */
public class jobvar_S {
	private jobvar_S jv_next;
	private jobvar_S jv_prev;
	private Object jv_tty_in;
	private Object jv_tty_out;
	private  jv_status;
	private Object jv_stoponexit;
	private int jv_exitval;
	private  jv_exit_cb;
	private file_buffer jv_in_buf;
	private int jv_refcount;
	private int jv_copyID;
	private channel_S jv_channel;
	private Byte jv_argv;
	
	public jobvar_S(jobvar_S jv_next, jobvar_S jv_prev, Object jv_tty_in, Object jv_tty_out,  jv_status, Object jv_stoponexit, int jv_exitval,  jv_exit_cb, file_buffer jv_in_buf, int jv_refcount, int jv_copyID, channel_S jv_channel, Byte jv_argv) {
		setJv_next(jv_next);
		setJv_prev(jv_prev);
		setJv_tty_in(jv_tty_in);
		setJv_tty_out(jv_tty_out);
		setJv_status(jv_status);
		setJv_stoponexit(jv_stoponexit);
		setJv_exitval(jv_exitval);
		setJv_exit_cb(jv_exit_cb);
		setJv_in_buf(jv_in_buf);
		setJv_refcount(jv_refcount);
		setJv_copyID(jv_copyID);
		setJv_channel(jv_channel);
		setJv_argv(jv_argv);
	}
	public jobvar_S() {
	}
	
	public jobvar_S getJv_next() {
		return jv_next;
	}
	public void setJv_next(jobvar_S newJv_next) {
		jv_next = newJv_next;
	}
	public jobvar_S getJv_prev() {
		return jv_prev;
	}
	public void setJv_prev(jobvar_S newJv_prev) {
		jv_prev = newJv_prev;
	}
	public Object getJv_tty_in() {
		return jv_tty_in;
	}
	public void setJv_tty_in(Object newJv_tty_in) {
		jv_tty_in = newJv_tty_in;
	}
	public Object getJv_tty_out() {
		return jv_tty_out;
	}
	public void setJv_tty_out(Object newJv_tty_out) {
		jv_tty_out = newJv_tty_out;
	}
	public  getJv_status() {
		return jv_status;
	}
	public void setJv_status( newJv_status) {
		jv_status = newJv_status;
	}
	public Object getJv_stoponexit() {
		return jv_stoponexit;
	}
	public void setJv_stoponexit(Object newJv_stoponexit) {
		jv_stoponexit = newJv_stoponexit;
	}
	public int getJv_exitval() {
		return jv_exitval;
	}
	public void setJv_exitval(int newJv_exitval) {
		jv_exitval = newJv_exitval;
	}
	public  getJv_exit_cb() {
		return jv_exit_cb;
	}
	public void setJv_exit_cb( newJv_exit_cb) {
		jv_exit_cb = newJv_exit_cb;
	}
	public file_buffer getJv_in_buf() {
		return jv_in_buf;
	}
	public void setJv_in_buf(file_buffer newJv_in_buf) {
		jv_in_buf = newJv_in_buf;
	}
	public int getJv_refcount() {
		return jv_refcount;
	}
	public void setJv_refcount(int newJv_refcount) {
		jv_refcount = newJv_refcount;
	}
	public int getJv_copyID() {
		return jv_copyID;
	}
	public void setJv_copyID(int newJv_copyID) {
		jv_copyID = newJv_copyID;
	}
	public channel_S getJv_channel() {
		return jv_channel;
	}
	public void setJv_channel(channel_S newJv_channel) {
		jv_channel = newJv_channel;
	}
	public Byte getJv_argv() {
		return jv_argv;
	}
	public void setJv_argv(Byte newJv_argv) {
		jv_argv = newJv_argv;
	}
}
