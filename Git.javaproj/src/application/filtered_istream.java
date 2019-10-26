package application;

public class filtered_istream {
	private git_istream upstream;
	private stream_filter filter;
	private Object ibuf;
	private Object obuf;
	private int i_end;
	private int i_ptr;
	private int o_end;
	private int o_ptr;
	private int input_finished;
	
	public filtered_istream(git_istream upstream, stream_filter filter, Object ibuf, Object obuf, int i_end, int i_ptr, int o_end, int o_ptr, int input_finished) {
		setUpstream(upstream);
		setFilter(filter);
		setIbuf(ibuf);
		setObuf(obuf);
		setI_end(i_end);
		setI_ptr(i_ptr);
		setO_end(o_end);
		setO_ptr(o_ptr);
		setInput_finished(input_finished);
	}
	public filtered_istream() {
	}
	
	public git_istream getUpstream() {
		return upstream;
	}
	public void setUpstream(git_istream newUpstream) {
		upstream = newUpstream;
	}
	public stream_filter getFilter() {
		return filter;
	}
	public void setFilter(stream_filter newFilter) {
		filter = newFilter;
	}
	public Object getIbuf() {
		return ibuf;
	}
	public void setIbuf(Object newIbuf) {
		ibuf = newIbuf;
	}
	public Object getObuf() {
		return obuf;
	}
	public void setObuf(Object newObuf) {
		obuf = newObuf;
	}
	public int getI_end() {
		return i_end;
	}
	public void setI_end(int newI_end) {
		i_end = newI_end;
	}
	public int getI_ptr() {
		return i_ptr;
	}
	public void setI_ptr(int newI_ptr) {
		i_ptr = newI_ptr;
	}
	public int getO_end() {
		return o_end;
	}
	public void setO_end(int newO_end) {
		o_end = newO_end;
	}
	public int getO_ptr() {
		return o_ptr;
	}
	public void setO_ptr(int newO_ptr) {
		o_ptr = newO_ptr;
	}
	public int getInput_finished() {
		return input_finished;
	}
	public void setInput_finished(int newInput_finished) {
		input_finished = newInput_finished;
	}
}
