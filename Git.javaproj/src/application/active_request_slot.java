package application;

/* Slot lifecycle functions */
public class active_request_slot {
	private Object curl;
	private int in_use;
	private Object curl_result;
	private long http_code;
	private int finished;
	private slot_results results;
	private Object callback_data;
	private Object callback_func;
	private active_request_slot next;
	
	public active_request_slot(Object curl, int in_use, Object curl_result, long http_code, int finished, slot_results results, Object callback_data, Object callback_func, active_request_slot next) {
		setCurl(curl);
		setIn_use(in_use);
		setCurl_result(curl_result);
		setHttp_code(http_code);
		setFinished(finished);
		setResults(results);
		setCallback_data(callback_data);
		setCallback_func(callback_func);
		setNext(next);
	}
	public active_request_slot() {
	}
	
	public void closedown_active_slot() {
		ModernizedCProgram.active_requests--;
		this.setIn_use(0);
	}
	public void finish_active_slot() {
		slot.closedown_active_slot();
		Object generatedCurl = this.getCurl();
		long generatedHttp_code = this.getHttp_code();
		.curl_easy_getinfo(generatedCurl, CURLINFO_HTTP_CODE, generatedHttp_code);
		int generatedFinished = this.getFinished();
		if (generatedFinished != ((Object)0)) {
			(generatedFinished) = 1;
		} 
		slot_results generatedResults = this.getResults();
		Object generatedCurl_result = this.getCurl_result();
		long generatedHttp_connectcode = generatedResults.getHttp_connectcode();
		if (generatedResults != ((Object)/* Store slot results so they can be read after the slot is reused */0)) {
			generatedResults.setCurl_result(generatedCurl_result);
			generatedResults.setHttp_code(generatedHttp_code);
			generatedResults.setAuth_avail(0);
			.curl_easy_getinfo(generatedCurl, CURLINFO_HTTP_CONNECTCODE, generatedHttp_connectcode);
		} 
		Object generatedCallback_func = this.getCallback_func();
		Object generatedCallback_data = this.getCallback_data();
		if (generatedCallback_func != ((Object)/* Run callback if appropriate */0)) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedCallback_data);
		} 
	}
	public void xmulti_remove_handle() {
	}
	public active_request_slot get_active_slot() {
		active_request_slot slot = ModernizedCProgram.active_queue_head;
		active_request_slot newslot = new active_request_slot();
		/* Wait for a slot to open up if the queue is full */
		int generatedIn_use = slot.getIn_use();
		active_request_slot generatedNext = slot.getNext();
		while (slot != ((Object)0) && generatedIn_use) {
			slot = generatedNext;
		}
		if (slot == ((Object)0)) {
			newslot = ModernizedCProgram.xmalloc();
			newslot.setCurl(((Object)0));
			newslot.setIn_use(0);
			newslot.setNext(((Object)0));
			slot = ModernizedCProgram.active_queue_head;
			if (slot == ((Object)0)) {
				ModernizedCProgram.active_queue_head = newslot;
			} else {
					while (generatedNext != ((Object)0)) {
						slot = generatedNext;
					}
					slot.setNext(newslot);
			} 
			slot = newslot;
		} 
		Object generatedCurl = slot.getCurl();
		if (generatedCurl == ((Object)0)) {
			slot.setCurl(ModernizedCProgram.get_curl_handle());
			ModernizedCProgram.curl_session_count++;
		} 
		ModernizedCProgram.active_requests++;
		slot.setIn_use(1);
		slot.setResults(((Object)0));
		slot.setFinished(((Object)0));
		slot.setCallback_data(((Object)0));
		slot.setCallback_func(((Object)0));
		.curl_easy_setopt(generatedCurl, CURLOPT_COOKIEFILE, ModernizedCProgram.curl_cookie_file);
		if (ModernizedCProgram.curl_save_cookies) {
			.curl_easy_setopt(generatedCurl, CURLOPT_COOKIEJAR, ModernizedCProgram.curl_cookie_file);
		} 
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, ModernizedCProgram.pragma_header);
		.curl_easy_setopt(generatedCurl, CURLOPT_ERRORBUFFER, ModernizedCProgram.curl_errorstr);
		.curl_easy_setopt(generatedCurl, CURLOPT_CUSTOMREQUEST, ((Object)0));
		.curl_easy_setopt(generatedCurl, CURLOPT_READFUNCTION, ((Object)0));
		.curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, ((Object)0));
		.curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDS, ((Object)0));
		.curl_easy_setopt(generatedCurl, CURLOPT_UPLOAD, 0);
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPGET, 1);
		.curl_easy_setopt(generatedCurl, CURLOPT_FAILONERROR, 1);
		.curl_easy_setopt(generatedCurl, CURLOPT_RANGE, ((Object)0/*
			 * Default following to off unless "ALWAYS" is configured; this gives
			 * callers a sane starting point, and they can tweak for individual
			 * HTTP_FOLLOW_* cases themselves.
			 */));
		if (http_follow_config.http_follow_config == http_follow_config.HTTP_FOLLOW_ALWAYS) {
			.curl_easy_setopt(generatedCurl, CURLOPT_FOLLOWLOCATION, 1);
		} else {
				.curl_easy_setopt(generatedCurl, CURLOPT_FOLLOWLOCATION, 0);
		} 
		if (ModernizedCProgram.http_auth.getPassword() || ModernizedCProgram.curl_empty_auth_enabled()) {
			ModernizedCProgram.init_curl_http_auth(generatedCurl);
		} 
		return slot;
	}
	public int start_active_slot() {
		return /*
			 * We know there must be something to do, since we just added
			 * something.
			 */1;
	}
	public void run_active_slot() {
		int generatedIn_use = this.getIn_use();
		Object generatedCurl = this.getCurl();
		/*
					 * It can happen that curl_multi_timeout returns a pathologically
					 * long timeout when curl_multi_fdset returns no file descriptors
					 * to read.  See commit message for more details.
					 */while (generatedIn_use) {
			this.setCurl_result(.curl_easy_perform(generatedCurl));
			slot.finish_active_slot();
		}
	}
	public void release_active_slot() {
		slot.closedown_active_slot();
		Object generatedCurl = this.getCurl();
		if (generatedCurl) {
			slot.xmulti_remove_handle();
			if (ModernizedCProgram.curl_session_count > ModernizedCProgram.min_curl_sessions) {
				.curl_easy_cleanup(generatedCurl);
				this.setCurl(((Object)0));
				ModernizedCProgram.curl_session_count--;
			} 
		} 
	}
	public Object getCurl() {
		return curl;
	}
	public void setCurl(Object newCurl) {
		curl = newCurl;
	}
	public int getIn_use() {
		return in_use;
	}
	public void setIn_use(int newIn_use) {
		in_use = newIn_use;
	}
	public Object getCurl_result() {
		return curl_result;
	}
	public void setCurl_result(Object newCurl_result) {
		curl_result = newCurl_result;
	}
	public long getHttp_code() {
		return http_code;
	}
	public void setHttp_code(long newHttp_code) {
		http_code = newHttp_code;
	}
	public int getFinished() {
		return finished;
	}
	public void setFinished(int newFinished) {
		finished = newFinished;
	}
	public slot_results getResults() {
		return results;
	}
	public void setResults(slot_results newResults) {
		results = newResults;
	}
	public Object getCallback_data() {
		return callback_data;
	}
	public void setCallback_data(Object newCallback_data) {
		callback_data = newCallback_data;
	}
	public Object getCallback_func() {
		return callback_func;
	}
	public void setCallback_func(Object newCallback_func) {
		callback_func = newCallback_func;
	}
	public active_request_slot getNext() {
		return next;
	}
	public void setNext(active_request_slot newNext) {
		next = newNext;
	}
}
