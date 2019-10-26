package application;

public class buffer {
	private strbuf buf;
	private Object posn;
	
	public buffer(strbuf buf, Object posn) {
		setBuf(buf);
		setPosn(posn);
	}
	public buffer() {
	}
	
	public void curl_setup_http(Object curl, Object url, Object custom_req, Object write_fn) {
		.curl_easy_setopt(curl, CURLOPT_PUT, 1);
		.curl_easy_setopt(curl, CURLOPT_URL, url);
		.curl_easy_setopt(curl, CURLOPT_INFILE, ModernizedCProgram.buffer);
		.curl_easy_setopt(curl, CURLOPT_INFILESIZE, ModernizedCProgram.buffer.getBuf().getLen());
		.curl_easy_setopt(curl, CURLOPT_READFUNCTION, ModernizedCProgram.fread_buffer);
		.curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_fn);
		.curl_easy_setopt(curl, CURLOPT_NOBODY, 0);
		.curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, custom_req);
		.curl_easy_setopt(curl, CURLOPT_UPLOAD, 1);
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
	public Object getPosn() {
		return posn;
	}
	public void setPosn(Object newPosn) {
		posn = newPosn;
	}
}
