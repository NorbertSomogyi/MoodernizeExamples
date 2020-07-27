package application;

public class update_info {
	private Object error;
	private curl_slist header;
	private Byte user_agent;
	private Object curl;
	private Byte url;
	private Byte local;
	private Byte cache;
	private Byte temp;
	private Object remote_url;
	private obs_data local_package;
	private obs_data cache_package;
	private obs_data remote_package;
	private Byte etag_local;
	private Byte etag_remote;
	private Object callback;
	private Object param;
	private Object thread;
	private Object thread_created;
	private Byte log_prefix;
	
	public update_info(Object error, curl_slist header, Byte user_agent, Object curl, Byte url, Byte local, Byte cache, Byte temp, Object remote_url, obs_data local_package, obs_data cache_package, obs_data remote_package, Byte etag_local, Byte etag_remote, Object callback, Object param, Object thread, Object thread_created, Byte log_prefix) {
		setError(error);
		setHeader(header);
		setUser_agent(user_agent);
		setCurl(curl);
		setUrl(url);
		setLocal(local);
		setCache(cache);
		setTemp(temp);
		setRemote_url(remote_url);
		setLocal_package(local_package);
		setCache_package(cache_package);
		setRemote_package(remote_package);
		setEtag_local(etag_local);
		setEtag_remote(etag_remote);
		setCallback(callback);
		setParam(param);
		setThread(thread);
		setThread_created(thread_created);
		setLog_prefix(log_prefix);
	}
	public update_info() {
	}
	
	public void update_info_destroy() {
		if (!info) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedThread_created = this.getThread_created();
		Object generatedThread = this.getThread();
		if (generatedThread_created) {
			ModernizedCProgram.pthread_join(generatedThread, NULL);
		} 
		Object generatedFile_data = this.getFile_data();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedFile_data);
		Byte generatedLog_prefix = this.getLog_prefix();
		ModernizedCProgram.bfree(generatedLog_prefix);
		Byte generatedUser_agent = this.getUser_agent();
		ModernizedCProgram.bfree(generatedUser_agent);
		Byte generatedTemp = this.getTemp();
		ModernizedCProgram.bfree(generatedTemp);
		Byte generatedCache = this.getCache();
		ModernizedCProgram.bfree(generatedCache);
		Byte generatedLocal = this.getLocal();
		ModernizedCProgram.bfree(generatedLocal);
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.bfree(generatedUrl);
		curl_slist generatedHeader = this.getHeader();
		if (generatedHeader) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_slist_free_all(generatedHeader);
		} 
		Object generatedCurl = this.getCurl();
		if (generatedCurl) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_cleanup(generatedCurl);
		} 
		obs_data generatedLocal_package = this.getLocal_package();
		if (generatedLocal_package) {
			generatedLocal_package.obs_data_release();
		} 
		obs_data generatedCache_package = this.getCache_package();
		if (generatedCache_package) {
			generatedCache_package.obs_data_release();
		} 
		obs_data generatedRemote_package = this.getRemote_package();
		if (generatedRemote_package) {
			generatedRemote_package.obs_data_release();
		} 
		ModernizedCProgram.bfree(info);
	}
	public Object http_write(Object ptr, Object size, Object nmemb) {
		 total = size * nmemb;
		Object generatedFile_data = this.getFile_data();
		if (total) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back_array(generatedFile_data, ptr, total);
		} 
		return total;
	}
	public Object http_header(Byte buffer, Object size, Object nitems) {
		if (!/*Error: Function owner not recognized*/strncmp(buffer, "ETag: ", 6)) {
			byte etag = buffer + 6;
			if (etag) {
				byte etag_clean;
				byte p;
				etag_clean = ModernizedCProgram.bstrdup(etag);
				p = /*Error: Function owner not recognized*/strchr(etag_clean, (byte)'\r');
				if (p) {
					p = 0;
				} 
				p = /*Error: Function owner not recognized*/strchr(etag_clean, (byte)'\n');
				if (p) {
					p = 0;
				} 
				this.setEtag_remote(etag_clean);
			} 
		} 
		return nitems * size;
	}
	public Object do_http_request(Object url, Long response_code) {
		 code = new ();
		 null_terminator = 0;
		Object generatedFile_data = this.getFile_data();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_resize(generatedFile_data, 0);
		Object generatedCurl = this.getCurl();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_URL, url);
		curl_slist generatedHeader = this.getHeader();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, generatedHeader);
		Object generatedError = this.getError();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_ERRORBUFFER, generatedError);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, http_write);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_WRITEDATA, info);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_FAILONERROR, true);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_NOSIGNAL, 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_ACCEPT_ENCODING, "");
		Object generatedRemote_url = this.getRemote_url();
		if (!generatedRemote_url) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_HEADERFUNCTION, http_header);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_HEADERDATA, info);
		} 
		// We only care about headers from the main package file
		code = /*Error: Function owner not recognized*/curl_easy_perform(generatedCurl);
		Byte generatedLog_prefix = this.getLog_prefix();
		if (code != CURLE_OK) {
			ModernizedCProgram.blog(LOG_WARNING, "%sRemote update of URL \"%s\" failed: %s", generatedLog_prefix, url, generatedError);
			return false;
		} 
		if (/*Error: Function owner not recognized*/curl_easy_getinfo(generatedCurl, CURLINFO_RESPONSE_CODE, response_code) != CURLE_OK) {
			return false;
		} 
		if (response_code >= 400) {
			ModernizedCProgram.blog(LOG_WARNING, "%sRemote update of URL \"%s\" failed: HTTP/%ld", generatedLog_prefix, url, response_code);
			return false;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedFile_data, null_terminator);
		return true;
	}
	public Object init_update() {
		dstr user_agent = new dstr(0);
		this.setCurl(/*Error: Function owner not recognized*/curl_easy_init());
		Object generatedCurl = this.getCurl();
		Byte generatedLog_prefix = this.getLog_prefix();
		if (!generatedCurl) {
			ModernizedCProgram.blog(LOG_WARNING, "%sCould not initialize Curl", generatedLog_prefix);
			return false;
		} 
		Byte generatedLocal = this.getLocal();
		obs_data obs_data = new obs_data();
		this.setLocal_package(obs_data.get_package(generatedLocal, "package.json"));
		Byte generatedCache = this.getCache();
		this.setCache_package(obs_data.get_package(generatedCache, "package.json"));
		obs_data_t metadata = obs_data.get_package(generatedCache, "meta.json");
		curl_slist generatedHeader = this.getHeader();
		Object generatedDstr = if_none_match.getDstr();
		if (metadata) {
			byte etag = metadata.obs_data_get_string("etag");
			if (etag) {
				dstr if_none_match = new dstr(0);
				if_none_match.dstr_copy("If-None-Match: ");
				if_none_match.dstr_cat(etag);
				this.setEtag_local(ModernizedCProgram.bstrdup(etag));
				this.setHeader(/*Error: Function owner not recognized*/curl_slist_append(generatedHeader, generatedDstr));
				if_none_match.dstr_free();
			} 
			metadata.obs_data_release();
		} 
		user_agent.dstr_copy("User-Agent: ");
		Byte generatedUser_agent = this.getUser_agent();
		user_agent.dstr_cat(generatedUser_agent);
		this.setHeader(/*Error: Function owner not recognized*/curl_slist_append(generatedHeader, generatedDstr));
		user_agent.dstr_free();
		return true;
	}
	public void copy_local_to_cache(Object file) {
		Byte generatedLocal = this.getLocal();
		byte local_file_path = ModernizedCProgram.get_path(generatedLocal, file);
		Byte generatedCache = this.getCache();
		byte cache_file_path = ModernizedCProgram.get_path(generatedCache, file);
		Byte generatedTemp = this.getTemp();
		byte temp_file_path = ModernizedCProgram.get_path(generatedTemp, file);
		ModernizedCProgram.os_copyfile(local_file_path, temp_file_path);
		ModernizedCProgram.os_unlink(cache_file_path);
		ModernizedCProgram.os_rename(temp_file_path, cache_file_path);
		ModernizedCProgram.bfree(local_file_path);
		ModernizedCProgram.bfree(cache_file_path);
		ModernizedCProgram.bfree(temp_file_path);
	}
	public int update_local_version() {
		int local_version;
		int cache_version = 0;
		obs_data generatedLocal_package = this.getLocal_package();
		local_version = (int)generatedLocal_package.obs_data_get_int("version");
		obs_data generatedCache_package = this.getCache_package();
		cache_version = (int)generatedCache_package.obs_data_get_int("version");
		if (cache_version < /* if local cached version is out of date, copy new version */local_version) {
			generatedLocal_package.enum_files(update_files_to_local, info);
			info.copy_local_to_cache("package.json");
			generatedCache_package.obs_data_release();
			generatedLocal_package.obs_data_addref();
			this.setCache_package(generatedLocal_package);
			return local_version;
		} 
		return cache_version;
	}
	public Object do_relative_http_request(Object url, Object file) {
		long response_code;
		byte full_url = ModernizedCProgram.get_path(url, file);
		 success = info.do_http_request(full_url, response_code);
		ModernizedCProgram.bfree(full_url);
		return success && response_code == 200;
	}
	public void write_file_data(Object base_path, Object file) {
		byte full_path = ModernizedCProgram.get_path(base_path, file);
		Object generatedFile_data = this.getFile_data();
		ModernizedCProgram.os_quick_write_utf8_file(full_path, (byte)generatedFile_data.getArray(), generatedFile_data.getNum() - 1, false);
		ModernizedCProgram.bfree(full_path);
	}
	public void update_save_metadata() {
		dstr path = new dstr(0);
		Byte generatedEtag_remote = this.getEtag_remote();
		if (!generatedEtag_remote) {
			return /*Error: Unsupported expression*/;
		} 
		Byte generatedCache = this.getCache();
		path.dstr_copy(generatedCache);
		path.dstr_cat("meta.json");
		obs_data_t data = new obs_data_t();
		obs_data obs_data = new obs_data();
		data = obs_data.obs_data_create();
		data.obs_data_set_string("etag", generatedEtag_remote);
		Object generatedDstr = path.getDstr();
		data.obs_data_save_json(generatedDstr);
		data.obs_data_release();
		path.dstr_free();
	}
	public void update_remote_version(int cur_version) {
		int remote_version;
		long response_code;
		Byte generatedUrl = this.getUrl();
		if (!info.do_http_request(generatedUrl, response_code)) {
			return /*Error: Unsupported expression*/;
		} 
		if (response_code == 304) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedFile_data = this.getFile_data();
		Byte generatedLog_prefix = this.getLog_prefix();
		if (!generatedFile_data.getArray() || generatedFile_data.getArray()[0] != (byte)'{') {
			ModernizedCProgram.blog(LOG_WARNING, "%sRemote package does not exist or is not valid json", generatedLog_prefix);
			return /*Error: Unsupported expression*/;
		} 
		info.update_save_metadata();
		obs_data obs_data = new obs_data();
		this.setRemote_package(obs_data.obs_data_create_from_json((byte)generatedFile_data.getArray()));
		obs_data generatedRemote_package = this.getRemote_package();
		if (!generatedRemote_package) {
			ModernizedCProgram.blog(LOG_WARNING, "%sFailed to initialize remote package json", generatedLog_prefix);
			return /*Error: Unsupported expression*/;
		} 
		remote_version = (int)generatedRemote_package.obs_data_get_int("version");
		if (remote_version <= cur_version) {
			return /*Error: Unsupported expression*/;
		} 
		Byte generatedTemp = this.getTemp();
		info.write_file_data(generatedTemp, "package.json");
		this.setRemote_url(generatedRemote_package.obs_data_get_string("url"));
		Object generatedRemote_url = this.getRemote_url();
		if (!generatedRemote_url) {
			ModernizedCProgram.blog(LOG_WARNING, "%sNo remote url in package file", generatedLog_prefix);
			return /*Error: Unsupported expression*/;
		} 
		generatedRemote_package.enum_files(update_remote_files, /* download new files */info);
		Byte generatedCache = this.getCache();
		ModernizedCProgram.replace_file(generatedTemp, generatedCache, "package.json");
		ModernizedCProgram.blog(LOG_WARNING, "%sSuccessfully updated package (version %d)", generatedLog_prefix, remote_version);
		return /*Error: Unsupported expression*/;
	}
	public update_info update_info_create(Object log_prefix, Object user_agent, Object update_url, Object local_dir, Object cache_dir, Object confirm_callback, Object param) {
		update_info info = new update_info();
		dstr dir = new dstr(0);
		if (!log_prefix) {
			log_prefix = "";
		} 
		if (ModernizedCProgram.os_mkdir(cache_dir) < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "%sCould not create cache directory %s", log_prefix, cache_dir);
			return NULL;
		} 
		dir.dstr_copy(cache_dir);
		if (ModernizedCProgram.dstr_end(dir) != (byte)'/' && ModernizedCProgram.dstr_end(dir) != (byte)'\\') {
			dir.dstr_cat_ch((byte)'/');
		} 
		dir.dstr_cat(".temp");
		Object generatedDstr = dir.getDstr();
		if (ModernizedCProgram.os_mkdir(generatedDstr) < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "%sCould not create temp directory %s", log_prefix, cache_dir);
			dir.dstr_free();
			return NULL;
		} 
		info = ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		info.setLog_prefix(ModernizedCProgram.bstrdup(log_prefix));
		info.setUser_agent(ModernizedCProgram.bstrdup(user_agent));
		info.setTemp(generatedDstr);
		info.setLocal(ModernizedCProgram.bstrdup(local_dir));
		info.setCache(ModernizedCProgram.bstrdup(cache_dir));
		info.setUrl(ModernizedCProgram.get_path(update_url, "package.json"));
		info.setCallback(confirm_callback);
		info.setParam(param);
		Object generatedThread = info.getThread();
		if (ModernizedCProgram.pthread_create(generatedThread, NULL, update_thread, info) == 0) {
			info.setThread_created(true);
		} 
		return info;
	}
	public update_info update_info_create_single(Object log_prefix, Object user_agent, Object file_url, Object confirm_callback, Object param) {
		update_info info = new update_info();
		if (!log_prefix) {
			log_prefix = "";
		} 
		info = ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		info.setLog_prefix(ModernizedCProgram.bstrdup(log_prefix));
		info.setUser_agent(ModernizedCProgram.bstrdup(user_agent));
		info.setUrl(ModernizedCProgram.bstrdup(file_url));
		info.setCallback(confirm_callback);
		info.setParam(param);
		Object generatedThread = info.getThread();
		if (ModernizedCProgram.pthread_create(generatedThread, NULL, single_file_thread, info) == 0) {
			info.setThread_created(true);
		} 
		return info;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object newError) {
		error = newError;
	}
	public curl_slist getHeader() {
		return header;
	}
	public void setHeader(curl_slist newHeader) {
		header = newHeader;
	}
	public Byte getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(Byte newUser_agent) {
		user_agent = newUser_agent;
	}
	public Object getCurl() {
		return curl;
	}
	public void setCurl(Object newCurl) {
		curl = newCurl;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getLocal() {
		return local;
	}
	public void setLocal(Byte newLocal) {
		local = newLocal;
	}
	public Byte getCache() {
		return cache;
	}
	public void setCache(Byte newCache) {
		cache = newCache;
	}
	public Byte getTemp() {
		return temp;
	}
	public void setTemp(Byte newTemp) {
		temp = newTemp;
	}
	public Object getRemote_url() {
		return remote_url;
	}
	public void setRemote_url(Object newRemote_url) {
		remote_url = newRemote_url;
	}
	public obs_data getLocal_package() {
		return local_package;
	}
	public void setLocal_package(obs_data newLocal_package) {
		local_package = newLocal_package;
	}
	public obs_data getCache_package() {
		return cache_package;
	}
	public void setCache_package(obs_data newCache_package) {
		cache_package = newCache_package;
	}
	public obs_data getRemote_package() {
		return remote_package;
	}
	public void setRemote_package(obs_data newRemote_package) {
		remote_package = newRemote_package;
	}
	public Byte getEtag_local() {
		return etag_local;
	}
	public void setEtag_local(Byte newEtag_local) {
		etag_local = newEtag_local;
	}
	public Byte getEtag_remote() {
		return etag_remote;
	}
	public void setEtag_remote(Byte newEtag_remote) {
		etag_remote = newEtag_remote;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getThread_created() {
		return thread_created;
	}
	public void setThread_created(Object newThread_created) {
		thread_created = newThread_created;
	}
	public Byte getLog_prefix() {
		return log_prefix;
	}
	public void setLog_prefix(Byte newLog_prefix) {
		log_prefix = newLog_prefix;
	}
}
