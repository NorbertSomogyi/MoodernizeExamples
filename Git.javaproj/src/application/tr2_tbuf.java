package application;

/*
 * A simple wrapper around a fixed buffer to avoid C syntax
 * quirks and the need to pass around an additional size_t
 * argument.
 */
public class tr2_tbuf {
	private Object buf;
	
	public tr2_tbuf(Object buf) {
		setBuf(buf);
	}
	public tr2_tbuf() {
	}
	
	public void tr2_tbuf_local_time() {
		timeval tv = new timeval();
		tm tm = new tm();
		time_t secs = new time_t();
		tv.gettimeofday(((Object)0));
		Object generatedTv_sec = tv.getTv_sec();
		secs = generatedTv_sec;
		tm.localtime_r(secs);
		Object generatedBuf = this.getBuf();
		Object generatedTm_hour = tm.getTm_hour();
		Object generatedTm_min = tm.getTm_min();
		Object generatedTm_sec = tm.getTm_sec();
		Object generatedTv_usec = tv.getTv_usec();
		ModernizedCProgram.xsnprintf(generatedBuf, , "%02d:%02d:%02d.%06ld", generatedTm_hour, generatedTm_min, generatedTm_sec, (long)generatedTv_usec);
	}
	public void tr2_tbuf_utc_datetime_extended() {
		timeval tv = new timeval();
		tm tm = new tm();
		time_t secs = new time_t();
		tv.gettimeofday(((Object)0));
		Object generatedTv_sec = tv.getTv_sec();
		secs = generatedTv_sec;
		tm.gmtime_r(secs);
		Object generatedBuf = this.getBuf();
		Object generatedTm_year = tm.getTm_year();
		Object generatedTm_mon = tm.getTm_mon();
		Object generatedTm_mday = tm.getTm_mday();
		Object generatedTm_hour = tm.getTm_hour();
		Object generatedTm_min = tm.getTm_min();
		Object generatedTm_sec = tm.getTm_sec();
		Object generatedTv_usec = tv.getTv_usec();
		ModernizedCProgram.xsnprintf(generatedBuf, , "%4d-%02d-%02dT%02d:%02d:%02d.%06ldZ", generatedTm_year + 1900, generatedTm_mon + 1, generatedTm_mday, generatedTm_hour, generatedTm_min, generatedTm_sec, (long)generatedTv_usec);
	}
	public void tr2_tbuf_utc_datetime() {
		timeval tv = new timeval();
		tm tm = new tm();
		time_t secs = new time_t();
		tv.gettimeofday(((Object)0));
		Object generatedTv_sec = tv.getTv_sec();
		secs = generatedTv_sec;
		tm.gmtime_r(secs);
		Object generatedBuf = this.getBuf();
		Object generatedTm_year = tm.getTm_year();
		Object generatedTm_mon = tm.getTm_mon();
		Object generatedTm_mday = tm.getTm_mday();
		Object generatedTm_hour = tm.getTm_hour();
		Object generatedTm_min = tm.getTm_min();
		Object generatedTm_sec = tm.getTm_sec();
		Object generatedTv_usec = tv.getTv_usec();
		ModernizedCProgram.xsnprintf(generatedBuf, , "%4d%02d%02dT%02d%02d%02d.%06ldZ", generatedTm_year + 1900, generatedTm_mon + 1, generatedTm_mday, generatedTm_hour, generatedTm_min, generatedTm_sec, (long)generatedTv_usec);
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
