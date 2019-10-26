package application;

public class channel_S {
	private channel_S ch_next;
	private channel_S ch_prev;
	private int ch_id;
	private int ch_last_msg_id;
	private Object ch_part;
	private int ch_write_text_mode;
	private Byte ch_hostname;
	private int ch_port;
	private int ch_to_be_closed;
	private int ch_to_be_freed;
	private int ch_error;
	private Object ch_nb_close_cb;
	private  ch_callback;
	private  ch_close_cb;
	private int ch_drop_never;
	private int ch_keep_open;
	private int ch_nonblock;
	private jobvar_S ch_job;
	private int ch_job_killed;
	private int ch_anonymous_pipe;
	private int ch_killing;
	private int ch_refcount;
	private int ch_copyID;
	
	public channel_S(channel_S ch_next, channel_S ch_prev, int ch_id, int ch_last_msg_id, Object ch_part, int ch_write_text_mode, Byte ch_hostname, int ch_port, int ch_to_be_closed, int ch_to_be_freed, int ch_error, Object ch_nb_close_cb,  ch_callback,  ch_close_cb, int ch_drop_never, int ch_keep_open, int ch_nonblock, jobvar_S ch_job, int ch_job_killed, int ch_anonymous_pipe, int ch_killing, int ch_refcount, int ch_copyID) {
		setCh_next(ch_next);
		setCh_prev(ch_prev);
		setCh_id(ch_id);
		setCh_last_msg_id(ch_last_msg_id);
		setCh_part(ch_part);
		setCh_write_text_mode(ch_write_text_mode);
		setCh_hostname(ch_hostname);
		setCh_port(ch_port);
		setCh_to_be_closed(ch_to_be_closed);
		setCh_to_be_freed(ch_to_be_freed);
		setCh_error(ch_error);
		setCh_nb_close_cb(ch_nb_close_cb);
		setCh_callback(ch_callback);
		setCh_close_cb(ch_close_cb);
		setCh_drop_never(ch_drop_never);
		setCh_keep_open(ch_keep_open);
		setCh_nonblock(ch_nonblock);
		setCh_job(ch_job);
		setCh_job_killed(ch_job_killed);
		setCh_anonymous_pipe(ch_anonymous_pipe);
		setCh_killing(ch_killing);
		setCh_refcount(ch_refcount);
		setCh_copyID(ch_copyID);
	}
	public channel_S() {
	}
	
	public channel_S getCh_next() {
		return ch_next;
	}
	public void setCh_next(channel_S newCh_next) {
		ch_next = newCh_next;
	}
	public channel_S getCh_prev() {
		return ch_prev;
	}
	public void setCh_prev(channel_S newCh_prev) {
		ch_prev = newCh_prev;
	}
	public int getCh_id() {
		return ch_id;
	}
	public void setCh_id(int newCh_id) {
		ch_id = newCh_id;
	}
	public int getCh_last_msg_id() {
		return ch_last_msg_id;
	}
	public void setCh_last_msg_id(int newCh_last_msg_id) {
		ch_last_msg_id = newCh_last_msg_id;
	}
	public Object getCh_part() {
		return ch_part;
	}
	public void setCh_part(Object newCh_part) {
		ch_part = newCh_part;
	}
	public int getCh_write_text_mode() {
		return ch_write_text_mode;
	}
	public void setCh_write_text_mode(int newCh_write_text_mode) {
		ch_write_text_mode = newCh_write_text_mode;
	}
	public Byte getCh_hostname() {
		return ch_hostname;
	}
	public void setCh_hostname(Byte newCh_hostname) {
		ch_hostname = newCh_hostname;
	}
	public int getCh_port() {
		return ch_port;
	}
	public void setCh_port(int newCh_port) {
		ch_port = newCh_port;
	}
	public int getCh_to_be_closed() {
		return ch_to_be_closed;
	}
	public void setCh_to_be_closed(int newCh_to_be_closed) {
		ch_to_be_closed = newCh_to_be_closed;
	}
	public int getCh_to_be_freed() {
		return ch_to_be_freed;
	}
	public void setCh_to_be_freed(int newCh_to_be_freed) {
		ch_to_be_freed = newCh_to_be_freed;
	}
	public int getCh_error() {
		return ch_error;
	}
	public void setCh_error(int newCh_error) {
		ch_error = newCh_error;
	}
	public Object getCh_nb_close_cb() {
		return ch_nb_close_cb;
	}
	public void setCh_nb_close_cb(Object newCh_nb_close_cb) {
		ch_nb_close_cb = newCh_nb_close_cb;
	}
	public  getCh_callback() {
		return ch_callback;
	}
	public void setCh_callback( newCh_callback) {
		ch_callback = newCh_callback;
	}
	public  getCh_close_cb() {
		return ch_close_cb;
	}
	public void setCh_close_cb( newCh_close_cb) {
		ch_close_cb = newCh_close_cb;
	}
	public int getCh_drop_never() {
		return ch_drop_never;
	}
	public void setCh_drop_never(int newCh_drop_never) {
		ch_drop_never = newCh_drop_never;
	}
	public int getCh_keep_open() {
		return ch_keep_open;
	}
	public void setCh_keep_open(int newCh_keep_open) {
		ch_keep_open = newCh_keep_open;
	}
	public int getCh_nonblock() {
		return ch_nonblock;
	}
	public void setCh_nonblock(int newCh_nonblock) {
		ch_nonblock = newCh_nonblock;
	}
	public jobvar_S getCh_job() {
		return ch_job;
	}
	public void setCh_job(jobvar_S newCh_job) {
		ch_job = newCh_job;
	}
	public int getCh_job_killed() {
		return ch_job_killed;
	}
	public void setCh_job_killed(int newCh_job_killed) {
		ch_job_killed = newCh_job_killed;
	}
	public int getCh_anonymous_pipe() {
		return ch_anonymous_pipe;
	}
	public void setCh_anonymous_pipe(int newCh_anonymous_pipe) {
		ch_anonymous_pipe = newCh_anonymous_pipe;
	}
	public int getCh_killing() {
		return ch_killing;
	}
	public void setCh_killing(int newCh_killing) {
		ch_killing = newCh_killing;
	}
	public int getCh_refcount() {
		return ch_refcount;
	}
	public void setCh_refcount(int newCh_refcount) {
		ch_refcount = newCh_refcount;
	}
	public int getCh_copyID() {
		return ch_copyID;
	}
	public void setCh_copyID(int newCh_copyID) {
		ch_copyID = newCh_copyID;
	}
}
// "v_number" is used
// "v_string" is used
// "v_string" is function name
// "v_partial" is used
// "v_list" is used
// "v_dict" is used
// "v_float" is used
