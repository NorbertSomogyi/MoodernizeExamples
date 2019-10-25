package application;

public class GlobalConfig {
	private int showerror;
	private  mute;
	private  noprogress;
	private  isatty;
	private Object errors;
	private  errors_fopened;
	private Object trace_dump;
	private Object trace_stream;
	private  trace_fopened;
	private  tracetype;
	private  tracetime;
	private int progressmode;
	private Object libcurl;
	private  fail_early;
	private  styled_output;
	private  parallel;
	private long parallel_max;
	private Object first;
	private Object current;
	private Object last;
	
	public GlobalConfig(int showerror,  mute,  noprogress,  isatty, Object errors,  errors_fopened, Object trace_dump, Object trace_stream,  trace_fopened,  tracetype,  tracetime, int progressmode, Object libcurl,  fail_early,  styled_output,  parallel, long parallel_max, Object first, Object current, Object last) {
		setShowerror(showerror);
		setMute(mute);
		setNoprogress(noprogress);
		setIsatty(isatty);
		setErrors(errors);
		setErrors_fopened(errors_fopened);
		setTrace_dump(trace_dump);
		setTrace_stream(trace_stream);
		setTrace_fopened(trace_fopened);
		setTracetype(tracetype);
		setTracetime(tracetime);
		setProgressmode(progressmode);
		setLibcurl(libcurl);
		setFail_early(fail_early);
		setStyled_output(styled_output);
		setParallel(parallel);
		setParallel_max(parallel_max);
		setFirst(first);
		setCurrent(current);
		setLast(last);
	}
	public GlobalConfig() {
	}
	
	public int getShowerror() {
		return showerror;
	}
	public void setShowerror(int newShowerror) {
		showerror = newShowerror;
	}
	public  getMute() {
		return mute;
	}
	public void setMute( newMute) {
		mute = newMute;
	}
	public  getNoprogress() {
		return noprogress;
	}
	public void setNoprogress( newNoprogress) {
		noprogress = newNoprogress;
	}
	public  getIsatty() {
		return isatty;
	}
	public void setIsatty( newIsatty) {
		isatty = newIsatty;
	}
	public Object getErrors() {
		return errors;
	}
	public void setErrors(Object newErrors) {
		errors = newErrors;
	}
	public  getErrors_fopened() {
		return errors_fopened;
	}
	public void setErrors_fopened( newErrors_fopened) {
		errors_fopened = newErrors_fopened;
	}
	public Object getTrace_dump() {
		return trace_dump;
	}
	public void setTrace_dump(Object newTrace_dump) {
		trace_dump = newTrace_dump;
	}
	public Object getTrace_stream() {
		return trace_stream;
	}
	public void setTrace_stream(Object newTrace_stream) {
		trace_stream = newTrace_stream;
	}
	public  getTrace_fopened() {
		return trace_fopened;
	}
	public void setTrace_fopened( newTrace_fopened) {
		trace_fopened = newTrace_fopened;
	}
	public  getTracetype() {
		return tracetype;
	}
	public void setTracetype( newTracetype) {
		tracetype = newTracetype;
	}
	public  getTracetime() {
		return tracetime;
	}
	public void setTracetime( newTracetime) {
		tracetime = newTracetime;
	}
	public int getProgressmode() {
		return progressmode;
	}
	public void setProgressmode(int newProgressmode) {
		progressmode = newProgressmode;
	}
	public Object getLibcurl() {
		return libcurl;
	}
	public void setLibcurl(Object newLibcurl) {
		libcurl = newLibcurl;
	}
	public  getFail_early() {
		return fail_early;
	}
	public void setFail_early( newFail_early) {
		fail_early = newFail_early;
	}
	public  getStyled_output() {
		return styled_output;
	}
	public void setStyled_output( newStyled_output) {
		styled_output = newStyled_output;
	}
	public  getParallel() {
		return parallel;
	}
	public void setParallel( newParallel) {
		parallel = newParallel;
	}
	public long getParallel_max() {
		return parallel_max;
	}
	public void setParallel_max(long newParallel_max) {
		parallel_max = newParallel_max;
	}
	public Object getFirst() {
		return first;
	}
	public void setFirst(Object newFirst) {
		first = newFirst;
	}
	public Object getCurrent() {
		return current;
	}
	public void setCurrent(Object newCurrent) {
		current = newCurrent;
	}
	public Object getLast() {
		return last;
	}
	public void setLast(Object newLast) {
		last = newLast;
	}
}
