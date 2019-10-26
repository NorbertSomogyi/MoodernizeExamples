package application;

public class urlmatch_item {
	private Object hostmatch_len;
	private Object pathmatch_len;
	private byte user_matched;
	
	public urlmatch_item(Object hostmatch_len, Object pathmatch_len, byte user_matched) {
		setHostmatch_len(hostmatch_len);
		setPathmatch_len(pathmatch_len);
		setUser_matched(user_matched);
	}
	public urlmatch_item() {
	}
	
	public int match_urls(Object url, Object url_prefix) {
		byte usermatched = 0;
		size_t pathmatchlen = new size_t();
		if (!url || !url_prefix || !url.getUrl() || !url_prefix.getUrl()) {
			return 0;
		} 
		if (url_prefix.getScheme_len() != url.getScheme_len() || .strncmp(url.getUrl(), url_prefix.getUrl(), url.getScheme_len())) {
			return /* schemes do not match */0;
		} 
		if (url_prefix.getUser_off()) {
			if (!url.getUser_off() || url.getUser_len() != url_prefix.getUser_len() || .strncmp(url.getUrl() + url.getUser_off(), url_prefix.getUrl() + url_prefix.getUser_off(), url.getUser_len())) {
				return /* url_prefix has a user but it's not a match */0;
			} 
			usermatched = 1;
		} 
		if (!ModernizedCProgram.match_host(url, /* check the host */url_prefix)) {
			return /* host names do not match */0;
		} 
		if (url_prefix.getPort_len() != url.getPort_len() || .strncmp(url.getUrl() + url.getPort_off(), url_prefix.getUrl() + url_prefix.getPort_off(), url.getPort_len())) {
			return /* ports do not match */0;
		} 
		pathmatchlen = ModernizedCProgram.url_match_prefix(url.getUrl() + url.getPath_off(), url_prefix.getUrl() + url_prefix.getPath_off(), url_prefix.getUrl_len() - url_prefix.getPath_off());
		if (!pathmatchlen) {
			return /* paths do not match */0;
		} 
		if (match) {
			this.setHostmatch_len(url_prefix.getHost_len());
			this.setPathmatch_len(pathmatchlen);
			this.setUser_matched(usermatched);
		} 
		return 1;
	}
	public Object getHostmatch_len() {
		return hostmatch_len;
	}
	public void setHostmatch_len(Object newHostmatch_len) {
		hostmatch_len = newHostmatch_len;
	}
	public Object getPathmatch_len() {
		return pathmatch_len;
	}
	public void setPathmatch_len(Object newPathmatch_len) {
		pathmatch_len = newPathmatch_len;
	}
	public byte getUser_matched() {
		return user_matched;
	}
	public void setUser_matched(byte newUser_matched) {
		user_matched = newUser_matched;
	}
}
