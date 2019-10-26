package application;

/// Internal data for lzma_strm_init, lzma_code, and lzma_end. A pointer to
/// this is stored in lzma_stream.
public class lzma_internal_s {
	private lzma_next_coder_s next;
	private  sequence;
	private Object avail_in;
	private Object supported_actions;
	private boolean allow_buf_error;
	
	public lzma_internal_s(lzma_next_coder_s next,  sequence, Object avail_in, Object supported_actions, boolean allow_buf_error) {
		setNext(next);
		setSequence(sequence);
		setAvail_in(avail_in);
		setSupported_actions(supported_actions);
		setAllow_buf_error(allow_buf_error);
	}
	public lzma_internal_s() {
	}
	
	public lzma_next_coder_s getNext() {
		return next;
	}
	public void setNext(lzma_next_coder_s newNext) {
		next = newNext;
	}
	public  getSequence() {
		return sequence;
	}
	public void setSequence( newSequence) {
		sequence = newSequence;
	}
	public Object getAvail_in() {
		return avail_in;
	}
	public void setAvail_in(Object newAvail_in) {
		avail_in = newAvail_in;
	}
	public Object getSupported_actions() {
		return supported_actions;
	}
	public void setSupported_actions(Object newSupported_actions) {
		supported_actions = newSupported_actions;
	}
	public boolean getAllow_buf_error() {
		return allow_buf_error;
	}
	public void setAllow_buf_error(boolean newAllow_buf_error) {
		allow_buf_error = newAllow_buf_error;
	}
}
/// The actual coder that should do something useful
