package application;

public class fcurl_data {
	private fcurl_type_e type;
	private  handle;
	private Byte buffer;
	private Object buffer_len;
	private Object buffer_pos;
	private int still_running;
	
	public fcurl_data(fcurl_type_e type,  handle, Byte buffer, Object buffer_len, Object buffer_pos, int still_running) {
		setType(type);
		setHandle(handle);
		setBuffer(buffer);
		setBuffer_len(buffer_len);
		setBuffer_pos(buffer_pos);
		setStill_running(still_running);
	}
	public fcurl_data() {
	}
	
	/* use to attempt to fill the read buffer up to requested number of bytes */
	public int fill_buffer(Object want) {
		 fdread = new ();
		 fdwrite = new ();
		 fdexcep = new ();
		timeval timeout = new timeval();
		int rc;
		/* curl_multi_fdset() return code */ mc = new ();
		/* only attempt to fill buffer if transactions still running and buffer
		   * doesn't exceed required size already
		   */
		int generatedStill_running = this.getStill_running();
		Object generatedBuffer_pos = this.getBuffer_pos();
		if ((!generatedStill_running) || (generatedBuffer_pos > want)) {
			return 0;
		} 
		Object generatedTimeval = timeout.getTimeval();
		/* attempt to fill buffer */do {
			int maxfd = -1;
			long curl_timeo = -1;
			.FD_ZERO(fdread);
			.FD_ZERO(fdwrite);
			.FD_ZERO(fdexcep);
			timeout.setTimeval(/* set a suitable timeout to fail on *//* 1 minute */60);
			timeout.setTimeval(0);
			ModernizedCProgram.multi_handle.curl_multi_timeout(curl_timeo);
			if (curl_timeo >= 0) {
				timeout.setTimeval(curl_timeo / 1000);
				if (generatedTimeval > 1) {
					timeout.setTimeval(1);
				} else {
						timeout.setTimeval((curl_timeo % 1000) * 1000);
				} 
			} 
			mc = ModernizedCProgram.curl_multi_fdset(ModernizedCProgram.multi_handle, fdread, fdwrite, fdexcep, /* get file descriptors from the transfers */maxfd);
			if (mc != CURLM_OK) {
				.fprintf((_iob[2]), "curl_multi_fdset() failed, code %d.\n", mc);
				break;
			} 
			if (maxfd == -1) {
				.Sleep(100);
				rc = 0/* Portable sleep for platforms other than Windows. *//* 100ms */;
			} else {
					rc = .select(maxfd + 1, fdread, fdwrite, fdexcep, /* Note that on some platforms 'timeout' may be modified by select().
					         If you need access to the original value save a copy beforehand. */timeout);
			} 
			switch (rc) {
			case -1/* select error */:
					break;
			case 0:
			default:
					ModernizedCProgram.multi_handle.curl_multi_perform(generatedStill_running);
					break;
			}
		} while (generatedStill_running && (generatedBuffer_pos < want));
		return 1;
	}
	/* use to remove want bytes from the front of a files buffer */
	public int use_buffer(Object want) {
		Object generatedBuffer_pos = this.getBuffer_pos();
		Byte generatedBuffer = this.getBuffer();
		if (generatedBuffer_pos <= /* sort out buffer */want) {
			.free(generatedBuffer);
			this.setBuffer(((Object)0));
			this.setBuffer_pos(0);
			this.setBuffer_len(0);
		} else {
				.memmove(generatedBuffer, generatedBuffer[want], (generatedBuffer_pos - want));
				generatedBuffer_pos -= want;
		} 
		return 0;
	}
	/* exported functions */
	public fcurl_data url_fopen(Object url, Object operation) {
		URL_FILE file = new URL_FILE();
		(Object)operation;
		file = .calloc(1, );
		if (!file) {
			return ((Object)0);
		} 
		 generatedHandle = file.getHandle();
		generatedHandle.setFile(.fopen(url, operation));
		Object generatedFile = generatedHandle.getFile();
		Curl_easy curl_easy = new Curl_easy();
		Object generatedCurl = generatedHandle.getCurl();
		Curl_multi curl_multi = new Curl_multi();
		int generatedStill_running = file.getStill_running();
		Object generatedBuffer_pos = file.getBuffer_pos();
		if (generatedFile) {
			file.setType(/* marked as URL */fcurl_type_e.CFTYPE_FILE);
		} else {
				file.setType(/* marked as URL */fcurl_type_e.CFTYPE_CURL);
				generatedHandle.setCurl(curl_easy.curl_easy_init());
				generatedCurl.curl_easy_setopt(CURLOPT_URL, url);
				generatedCurl.curl_easy_setopt(CURLOPT_WRITEDATA, file);
				generatedCurl.curl_easy_setopt(CURLOPT_VERBOSE, -1024);
				generatedCurl.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_callback);
				if (!ModernizedCProgram.multi_handle) {
					ModernizedCProgram.multi_handle = curl_multi.curl_multi_init();
				} 
				ModernizedCProgram.curl_multi_add_handle(ModernizedCProgram.multi_handle, generatedCurl);
				ModernizedCProgram.multi_handle.curl_multi_perform(generatedStill_running);
				if ((generatedBuffer_pos == 0) && (!generatedStill_running)) {
					ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.multi_handle, generatedCurl);
					generatedCurl.curl_easy_cleanup();
					.free(file);
					file = ((Object)0);
				} 
		} 
		return file;
	}
	/* this code could check for URLs or types in the 'url' and
	     basically use the real fopen() for standard files */
	public int url_fclose() {
		int ret = /* default is good return */0;
		 generatedHandle = this.getHandle();
		Object generatedFile = generatedHandle.getFile();
		Object generatedCurl = generatedHandle.getCurl();
		fcurl_type_e generatedType = this.getType();
		switch (generatedType) {
		case fcurl_type_e.CFTYPE_CURL:
				ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.multi_handle, generatedCurl);
				generatedCurl.curl_easy_cleanup();
				break;
		case fcurl_type_e.CFTYPE_FILE:
				ret = .fclose(generatedFile);
				break;
		default:
				ret = (true);
				(._errno()) = 9;
				break;
		}
		Byte generatedBuffer = this.getBuffer();
		.free(generatedBuffer);
		.free(file);
		return ret;
	}
	public int url_feof() {
		int ret = 0;
		 generatedHandle = this.getHandle();
		Object generatedFile = generatedHandle.getFile();
		Object generatedBuffer_pos = this.getBuffer_pos();
		int generatedStill_running = this.getStill_running();
		fcurl_type_e generatedType = this.getType();
		switch (generatedType) {
		case fcurl_type_e.CFTYPE_FILE:
				ret = ((generatedFile).get_flag() & -1024);
				break;
		case fcurl_type_e.CFTYPE_CURL:
				if ((generatedBuffer_pos == 0) && (!generatedStill_running)) {
					ret = 1;
				} 
				break;
		default:
				ret = -1;
				(._errno()) = 9;
				break;
		}
		return ret;
	}
	public Object url_fread(Object ptr, Object size, Object nmemb) {
		size_t want = new size_t();
		 generatedHandle = this.getHandle();
		Object generatedFile = generatedHandle.getFile();
		Object generatedBuffer_pos = this.getBuffer_pos();
		Byte generatedBuffer = this.getBuffer();
		fcurl_type_e generatedType = this.getType();
		switch (generatedType) {
		case fcurl_type_e.CFTYPE_CURL:
				want = nmemb * size;
				file.fill_buffer(want);
				if (!generatedBuffer_pos) {
					return 0;
				} 
				if (generatedBuffer_pos < /* ensure only available data is considered */want) {
					want = generatedBuffer_pos;
				} 
				.memcpy(ptr, generatedBuffer, /* xfer data to caller */want);
				file.use_buffer(want);
				want = want / /* number of items */size;
				break;
		case fcurl_type_e.CFTYPE_FILE:
				want = .fread(ptr, size, nmemb, generatedFile);
				break;
		default:
				want = 0;
				(._errno()) = 9;
				break;
		}
		return want;
	}
	public Byte url_fgets(Byte ptr, Object size) {
		size_t want = size - /* always need to leave room for zero termination */1;
		size_t loop = new size_t();
		 generatedHandle = this.getHandle();
		Object generatedFile = generatedHandle.getFile();
		Object generatedBuffer_pos = this.getBuffer_pos();
		Byte generatedBuffer = this.getBuffer();
		fcurl_type_e generatedType = this.getType();
		switch (generatedType) {
		case fcurl_type_e.CFTYPE_CURL:
				file.fill_buffer(want);
				if (!generatedBuffer_pos) {
					return ((Object)0);
				} 
				if (generatedBuffer_pos < /* ensure only available data is considered */want) {
					want = generatedBuffer_pos;
				} 
				for (loop = 0; loop < want; /*buffer contains data *//* look for newline or eof */loop++) {
					if (generatedBuffer[loop] == (byte)'\n') {
						want = loop + /* include newline */1;
						break;
					} 
				}
				.memcpy(ptr, generatedBuffer, /* xfer data to caller */want);
				ptr[want] = /* always null terminate */0;
				file.use_buffer(want);
				break;
		case fcurl_type_e.CFTYPE_FILE:
				ptr = .fgets(ptr, (int)size, generatedFile);
				break;
		default:
				ptr = ((Object)0);
				(._errno()) = 9;
				break;
		}
		return /*success */ptr;
	}
	public void url_rewind() {
		 generatedHandle = this.getHandle();
		Object generatedFile = generatedHandle.getFile();
		Object generatedCurl = generatedHandle.getCurl();
		Byte generatedBuffer = this.getBuffer();
		fcurl_type_e generatedType = this.getType();
		switch (generatedType) {
		case fcurl_type_e.CFTYPE_FILE:
				.rewind(generatedFile);
				break;
		case fcurl_type_e.CFTYPE_CURL:
				ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.multi_handle, generatedCurl);
				ModernizedCProgram.curl_multi_add_handle(ModernizedCProgram.multi_handle, generatedCurl);
				.free(generatedBuffer);
				this.setBuffer(((Object)0));
				this.setBuffer_pos(0);
				this.setBuffer_len(0);
				break;
		default:
				break;
		}
	}
	/* we use a global one for convenience */
	public fcurl_type_e getType() {
		return type;
	}
	public void setType(fcurl_type_e newType) {
		type = newType;
	}
	public  getHandle() {
		return handle;
	}
	public void setHandle( newHandle) {
		handle = newHandle;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getBuffer_len() {
		return buffer_len;
	}
	public void setBuffer_len(Object newBuffer_len) {
		buffer_len = newBuffer_len;
	}
	public Object getBuffer_pos() {
		return buffer_pos;
	}
	public void setBuffer_pos(Object newBuffer_pos) {
		buffer_pos = newBuffer_pos;
	}
	public int getStill_running() {
		return still_running;
	}
	public void setStill_running(int newStill_running) {
		still_running = newStill_running;
	}
}
