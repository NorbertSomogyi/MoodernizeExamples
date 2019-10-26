package application;

/* Options for http_get_*() */
public class http_get_options {
	private int no_cache;
	private int initial_request;
	private strbuf content_type;
	private strbuf charset;
	private strbuf effective_url;
	private strbuf base_url;
	private string_list extra_headers;
	
	public http_get_options(int no_cache, int initial_request, strbuf content_type, strbuf charset, strbuf effective_url, strbuf base_url, string_list extra_headers) {
		setNo_cache(no_cache);
		setInitial_request(initial_request);
		setContent_type(content_type);
		setCharset(charset);
		setEffective_url(effective_url);
		setBase_url(base_url);
		setExtra_headers(extra_headers);
	}
	public http_get_options() {
	}
	
	public int http_request_reauth(Object url, Object result, int target) {
		int ret = ModernizedCProgram.http_request(url, result, target, ModernizedCProgram.options);
		if (ret != 0 && ret != 4) {
			return ret;
		} 
		if (ModernizedCProgram.options && ModernizedCProgram.options.getEffective_url() && ModernizedCProgram.options.getBase_url()) {
			if (ModernizedCProgram.options.getBase_url().update_url_from_redirect(url, ModernizedCProgram.options.getEffective_url())) {
				.credential_from_url(ModernizedCProgram.http_auth, ModernizedCProgram.options.getBase_url().getBuf());
				url = ModernizedCProgram.options.getEffective_url().getBuf();
			} 
		} 
		if (ret != 4) {
			return ret/*
				 * The previous request may have put cruft into our output stream; we
				 * should clear it out before making our next request.
				 */;
		} 
		switch (target) {
		case 0:
				result.strbuf_setlen(0);
				break;
		case 1:
				if (.fflush(result)) {
					();
					return 3;
				} 
				.rewind(result);
				if (.ftruncate(((result).get_file()), 0) < 0) {
					();
					return 3;
				} 
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http.c", 2019, "Unknown http_request target");
		}
		.credential_fill(ModernizedCProgram.http_auth);
		return ModernizedCProgram.http_request(url, result, target, ModernizedCProgram.options);
	}
	public int http_get_file(Object url, Object filename) {
		int ret;
		strbuf tmpfile = new strbuf(, , );
		FILE result = new FILE();
		tmpfile.strbuf_addf("%s.temp", filename);
		byte generatedBuf = tmpfile.getBuf();
		result = .fopen(generatedBuf, "a");
		if (!result) {
			();
			ret = 2;
			;
		} 
		ret = ModernizedCProgram.options.http_request_reauth(url, result, 1);
		.fclose(result);
		if (ret == 0 && ModernizedCProgram.finalize_object_file(generatedBuf, filename)) {
			ret = 2;
		} 
		return ret;
	}
	public int getNo_cache() {
		return no_cache;
	}
	public void setNo_cache(int newNo_cache) {
		no_cache = newNo_cache;
	}
	public int getInitial_request() {
		return initial_request;
	}
	public void setInitial_request(int newInitial_request) {
		initial_request = newInitial_request;
	}
	public strbuf getContent_type() {
		return content_type;
	}
	public void setContent_type(strbuf newContent_type) {
		content_type = newContent_type;
	}
	public strbuf getCharset() {
		return charset;
	}
	public void setCharset(strbuf newCharset) {
		charset = newCharset;
	}
	public strbuf getEffective_url() {
		return effective_url;
	}
	public void setEffective_url(strbuf newEffective_url) {
		effective_url = newEffective_url;
	}
	public strbuf getBase_url() {
		return base_url;
	}
	public void setBase_url(strbuf newBase_url) {
		base_url = newBase_url;
	}
	public string_list getExtra_headers() {
		return extra_headers;
	}
	public void setExtra_headers(string_list newExtra_headers) {
		extra_headers = newExtra_headers;
	}
}
