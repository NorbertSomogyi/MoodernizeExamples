package application;

public class Curl_send_buffer {
	private Byte buffer;
	private Object size_max;
	private Object size_used;
	
	public Curl_send_buffer(Byte buffer, Object size_max, Object size_used) {
		setBuffer(buffer);
		setSize_max(size_max);
		setSize_used(size_used);
	}
	public Curl_send_buffer() {
	}
	
	/*
	 * Curl_add_buffer_init() sets up and returns a fine buffer struct
	 */
	public Curl_send_buffer Curl_add_buffer_init() {
		return .Curl_ccalloc(1, /*
		 * Curl_add_buffer_free() frees all associated resources.
		 */);
	}
	public void Curl_add_buffer_free() {
		Curl_send_buffer in = new Curl_send_buffer();
		if (!inp) {
			return ;
		} 
		in = inp;
		Byte generatedBuffer = in.getBuffer();
		if (/* deal with NULL input */in) {
			.Curl_cfree(generatedBuffer);
			.Curl_cfree(in);
		} 
		inp = ((Object)0/*
		 * Curl_add_buffer_send() sends a header buffer and frees all associated
		 * memory.  Body data may be appended to the header data if desired.
		 *
		 * Returns CURLcode
		 */);
	}
	/*
	 * add_bufferf() add the formatted input to the buffer.
	 */
	public Object Curl_add_bufferf(Object fmt) {
		byte s;
		va_list ap = new va_list();
		Curl_send_buffer in = inp;
		.__builtin_va_start(ap, fmt);
		s = ModernizedCProgram.curl_mvaprintf(fmt, /* this allocs a new string to append */ap);
		.__builtin_va_end(ap);
		if (s) {
			 result = inp.Curl_add_buffer(s, .strlen(s));
			.Curl_cfree(s);
			return ModernizedCProgram.result;
		} 
		Byte generatedBuffer = in.getBuffer();
		.Curl_cfree(generatedBuffer);
		.Curl_cfree(in);
		inp = ((Object)0);
		return CURLE_OUT_OF_MEMORY/*
		 * Curl_add_buffer() appends a memory chunk to the existing buffer
		 */;
	}
	public Object Curl_add_buffer(Object inptr, Object size) {
		byte new_rb;
		Curl_send_buffer in = inp;
		Object generatedSize_used = in.getSize_used();
		Byte generatedBuffer = in.getBuffer();
		if (~size < generatedSize_used) {
			do {
				.Curl_cfree((generatedBuffer));
				(generatedBuffer) = ((Object)0);
			} while (0);
			.Curl_cfree(in);
			inp = ((Object)0);
			return CURLE_OUT_OF_MEMORY;
		} 
		Object generatedSize_max = in.getSize_max();
		if (!generatedBuffer || ((generatedSize_used + size) > (generatedSize_max - 1/* If current buffer size isn't enough to hold the result, use a
		       buffer size that doubles the required size. If this new size
		       would wrap size_t, then just use the largest possible one */))) {
			size_t new_size = new size_t();
			if ((size > (size_t)-1 / 2) || (generatedSize_used > (size_t)-1 / 2) || (~(size * 2) < (generatedSize_used * 2))) {
				new_size = (size_t)-1;
			} else {
					new_size = (generatedSize_used + size) * 2;
			} 
			if (generatedBuffer) {
				new_rb = ModernizedCProgram.Curl_saferealloc(generatedBuffer, /* we have a buffer, enlarge the existing one */new_size);
			} else {
					new_rb = .Curl_cmalloc(/* create a new buffer */new_size);
			} 
			if (!new_rb) {
				.Curl_cfree(/* If we failed, we cleanup the whole buffer and return error */in);
				inp = ((Object)0);
				return CURLE_OUT_OF_MEMORY;
			} 
			in.setBuffer(new_rb);
			in.setSize_max(new_size);
		} 
		.memcpy(generatedBuffer[generatedSize_used], inptr, size);
		generatedSize_used += size;
		return CURLE_OK/* end of the add_buffer functions *//* ------------------------------------------------------------------------- */;
	}
	public Object Curl_add_timecondition(Object conn) {
		Curl_easy data = conn.getData();
		tm tm = new tm();
		tm keeptime = new tm();
		 result = new ();
		byte[] datestr = new byte[80];
		byte condp;
		Object generatedSet = data.getSet();
		if (generatedSet.getTimecondition() == CURL_TIMECOND_NONE) {
			return /* no condition was asked for */CURLE_OK;
		} 
		result = keeptime.Curl_gmtime(generatedSet.getTimevalue());
		if (result) {
			data.Curl_failf("Invalid TIMEVALUE");
			return result;
		} 
		tm = keeptime;
		switch (generatedSet.getTimecondition()) {
		case CURL_TIMECOND_IFMODSINCE:
				condp = "If-Modified-Since";
				break;
		case CURL_TIMECOND_IFUNMODSINCE:
				condp = "If-Unmodified-Since";
				break;
		case CURL_TIMECOND_LASTMOD:
				condp = "Last-Modified";
				break;
		default:
				return CURLE_BAD_FUNCTION_ARGUMENT;
		}
		if (ModernizedCProgram.Curl_checkheaders(conn, condp)) {
			return /* A custom header was specified; it will be sent instead. */CURLE_OK/* The If-Modified-Since header family should have their times set in
			   * GMT as RFC2616 defines: "All HTTP date/time stamps MUST be
			   * represented in Greenwich Mean Time (GMT), without exception. For the
			   * purposes of HTTP, GMT is exactly equal to UTC (Coordinated Universal
			   * Time)." (see page 20 of RFC2616).
			   */;
		} 
		ModernizedCProgram.curl_msnprintf(datestr, , "%s: %s, %02d %s %4d %02d:%02d:%02d GMT\r\n", condp, ModernizedCProgram.Curl_wkday[tm.getTm_wday() ? tm.getTm_wday() - 1 : 6], tm.getTm_mday(), ModernizedCProgram.Curl_month[tm.getTm_mon()], tm.getTm_year() + 1900, tm.getTm_hour(), tm.getTm_min(), tm.getTm_sec());
		result = req_buffer.Curl_add_buffer(datestr, .strlen(datestr));
		return result/* disabled */;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getSize_max() {
		return size_max;
	}
	public void setSize_max(Object newSize_max) {
		size_max = newSize_max;
	}
	public Object getSize_used() {
		return size_used;
	}
	public void setSize_used(Object newSize_used) {
		size_used = newSize_used;
	}
}
