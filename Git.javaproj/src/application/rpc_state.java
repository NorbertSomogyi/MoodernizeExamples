package application;

public class rpc_state {
	private Object service_name;
	private Byte service_url;
	private Byte hdr_content_type;
	private Byte hdr_accept;
	private Byte protocol_header;
	private Byte buf;
	private Object alloc;
	private Object len;
	private Object pos;
	private int in;
	private int out;
	private int any_written;
	private int gzip_request;
	private int initial_buffer;
	private int write_line_lengths;
	private int flush_read_but_not_sent;
	
	public rpc_state(Object service_name, Byte service_url, Byte hdr_content_type, Byte hdr_accept, Byte protocol_header, Byte buf, Object alloc, Object len, Object pos, int in, int out, int any_written, int gzip_request, int initial_buffer, int write_line_lengths, int flush_read_but_not_sent) {
		setService_name(service_name);
		setService_url(service_url);
		setHdr_content_type(hdr_content_type);
		setHdr_accept(hdr_accept);
		setProtocol_header(protocol_header);
		setBuf(buf);
		setAlloc(alloc);
		setLen(len);
		setPos(pos);
		setIn(in);
		setOut(out);
		setAny_written(any_written);
		setGzip_request(gzip_request);
		setInitial_buffer(initial_buffer);
		setWrite_line_lengths(write_line_lengths);
		setFlush_read_but_not_sent(flush_read_but_not_sent);
	}
	public rpc_state() {
	}
	
	public int rpc_read_from_out(int options, Object appended, packet_read_status status) {
		size_t left = new size_t();
		byte buf;
		int pktlen_raw;
		int generatedWrite_line_lengths = this.getWrite_line_lengths();
		Object generatedAlloc = this.getAlloc();
		Object generatedLen = this.getLen();
		Byte generatedBuf = this.getBuf();
		if (generatedWrite_line_lengths) {
			left = generatedAlloc - generatedLen - 4;
			buf = generatedBuf + generatedLen + 4;
		} else {
				left = generatedAlloc - generatedLen;
				buf = generatedBuf + generatedLen;
		} 
		if (left < 65520) {
			return 0;
		} 
		int generatedOut = this.getOut();
		status = ModernizedCProgram.packet_read_with_status(generatedOut, ((Object)0), ((Object)0), buf, left, pktlen_raw, options);
		if (status != packet_read_status.PACKET_READ_EOF) {
			appended = pktlen_raw + (generatedWrite_line_lengths ? 4 : 0);
			generatedLen += appended;
		} 
		if (generatedWrite_line_lengths) {
			switch (status) {
			case packet_read_status.PACKET_READ_FLUSH:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf - 4, "0000", 4);
					break;
			case packet_read_status.PACKET_READ_DELIM:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf - 4, "0001", 4);
					break;
			case packet_read_status.PACKET_READ_EOF:
					if (!(options & (-1024 << 0))) {
						ModernizedCProgram.die(ModernizedCProgram._("shouldn't have EOF when not gentle on EOF"));
					} 
					break;
			case packet_read_status.PACKET_READ_NORMAL:
					ModernizedCProgram.set_packet_header(buf - 4, appended);
					break;
			}
		} 
		return 1;
	}
	public int post_rpc(int flush_received) {
		active_request_slot slot = new active_request_slot();
		curl_slist headers = ModernizedCProgram.http_copy_default_headers();
		int generatedGzip_request = this.getGzip_request();
		int use_gzip = generatedGzip_request;
		byte gzip_body = ((Object)0);
		size_t gzip_size = 0;
		int err;
		int large_request = 0;
		int needs_100_continue = 0;
		rpc_in_data rpc_in_data = new rpc_in_data();
		/* Try to load the entire request, if we can fit it into the
			 * allocated buffer space we can use HTTP/1.0 and avoid the
			 * chunked encoding mess.
			 */
		if (!flush_received) {
			while (1) {
				size_t n = new size_t();
				packet_read_status status;
				if (!rpc.rpc_read_from_out(0, n, packet_read_status.status)) {
					large_request = 1;
					use_gzip = 0;
					break;
				} 
				if (packet_read_status.status == packet_read_status.PACKET_READ_FLUSH) {
					break;
				} 
			}
		} 
		long generatedAuth_avail = results.getAuth_avail();
		if (large_request) {
			slot_results results = new slot_results();
			do {
				err = ModernizedCProgram.probe_rpc(rpc, results);
				if (err == 4) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/credential_fill(ModernizedCProgram.http_auth);
				} 
			} while (err == 4);
			if (err != 0) {
				return -1;
			} 
			if (generatedAuth_avail & CURLAUTH_GSSNEGOTIATE) {
				needs_100_continue = 1;
			} 
		} 
		Byte generatedHdr_content_type = this.getHdr_content_type();
		headers = /*Error: Function owner not recognized*/curl_slist_append(headers, generatedHdr_content_type);
		Byte generatedHdr_accept = this.getHdr_accept();
		headers = /*Error: Function owner not recognized*/curl_slist_append(headers, generatedHdr_accept);
		headers = /*Error: Function owner not recognized*/curl_slist_append(headers, needs_100_continue ? "Expect: 100-continue" : "Expect:");
		Byte generatedProtocol_header = this.getProtocol_header();
		if (generatedProtocol_header) {
			headers = /*Error: Function owner not recognized*/curl_slist_append(headers, generatedProtocol_header);
		} 
		Object generatedCurl = slot.getCurl();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_NOBODY, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POST, 1);
		Byte generatedService_url = this.getService_url();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_URL, generatedService_url);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_ENCODING, "");
		Object generatedService_name = this.getService_name();
		Object generatedLen = this.getLen();
		Byte generatedBuf = this.getBuf();
		long generatedTotal_out = stream.getTotal_out();
		if (large_request/* The request body is large and the size cannot be predicted.
				 * We must use chunked encoding to send it.
				 */) {
			headers = /*Error: Function owner not recognized*/curl_slist_append(headers, "Transfer-Encoding: chunked");
			this.setInitial_buffer(1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_READFUNCTION, rpc_out);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_INFILE, rpc);
			if (ModernizedCProgram.options.getVerbosity() > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "POST %s (chunked)\n", generatedService_name);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fflush((_iob[2]));
			} 
		}  else if (gzip_body/*
				 * If we are looping to retry authentication, then the previous
				 * run will have set up the headers and gzip buffer already,
				 * and we just need to send it.
				 */) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDS, gzip_body);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDSIZE_LARGE, ModernizedCProgram.xcurl_off_t(gzip_size));
		}  else if (use_gzip && 1024 < generatedLen) {
			git_zstream stream = new git_zstream();
			int ret;
			stream.git_deflate_init_gzip(Z_BEST_COMPRESSION);
			gzip_size = stream.git_deflate_bound(generatedLen);
			gzip_body = ModernizedCProgram.xmalloc(gzip_size);
			stream.setNext_in((byte)generatedBuf);
			stream.setAvail_in(generatedLen);
			stream.setNext_out((byte)gzip_body);
			stream.setAvail_out(gzip_size);
			ret = stream.git_deflate(Z_FINISH);
			if (ret != Z_STREAM_END) {
				ModernizedCProgram.die(ModernizedCProgram._("cannot deflate request; zlib deflate error %d"), ret);
			} 
			ret = stream.git_deflate_end_gently();
			if (ret != Z_OK) {
				ModernizedCProgram.die(ModernizedCProgram._("cannot deflate request; zlib end error %d"), ret);
			} 
			gzip_size = generatedTotal_out;
			headers = /*Error: Function owner not recognized*/curl_slist_append(headers, "Content-Encoding: gzip");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDS, gzip_body);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDSIZE_LARGE, ModernizedCProgram.xcurl_off_t(gzip_size));
			if (ModernizedCProgram.options.getVerbosity() > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "POST %s (gzip %lu to %lu bytes)\n", generatedService_name, (long)generatedLen, (long)gzip_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fflush((_iob[2]));
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDS, generatedBuf);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_POSTFIELDSIZE_LARGE, ModernizedCProgram.xcurl_off_t(generatedLen));
				if (ModernizedCProgram.options.getVerbosity() > 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "POST %s (%lu bytes)\n", generatedService_name, (long)generatedLen);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fflush((_iob[2]));
				} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, headers);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, rpc_in);
		rpc_in_data.setRpc(rpc);
		rpc_in_data.setSlot(slot);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_FILE, rpc_in_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_FAILONERROR, 0);
		this.setAny_written(0);
		err = ModernizedCProgram.run_slot(slot, ((Object)0));
		if (err == 4 && !large_request) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/credential_fill(ModernizedCProgram.http_auth);
			;
		} 
		if (err != 0) {
			err = -1;
		} 
		int generatedAny_written = this.getAny_written();
		if (!generatedAny_written) {
			err = -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_slist_free_all(headers);
		ModernizedCProgram.free(gzip_body);
		return err;
	}
	public Object getService_name() {
		return service_name;
	}
	public void setService_name(Object newService_name) {
		service_name = newService_name;
	}
	public Byte getService_url() {
		return service_url;
	}
	public void setService_url(Byte newService_url) {
		service_url = newService_url;
	}
	public Byte getHdr_content_type() {
		return hdr_content_type;
	}
	public void setHdr_content_type(Byte newHdr_content_type) {
		hdr_content_type = newHdr_content_type;
	}
	public Byte getHdr_accept() {
		return hdr_accept;
	}
	public void setHdr_accept(Byte newHdr_accept) {
		hdr_accept = newHdr_accept;
	}
	public Byte getProtocol_header() {
		return protocol_header;
	}
	public void setProtocol_header(Byte newProtocol_header) {
		protocol_header = newProtocol_header;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int newIn) {
		in = newIn;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int newOut) {
		out = newOut;
	}
	public int getAny_written() {
		return any_written;
	}
	public void setAny_written(int newAny_written) {
		any_written = newAny_written;
	}
	public int getGzip_request() {
		return gzip_request;
	}
	public void setGzip_request(int newGzip_request) {
		gzip_request = newGzip_request;
	}
	public int getInitial_buffer() {
		return initial_buffer;
	}
	public void setInitial_buffer(int newInitial_buffer) {
		initial_buffer = newInitial_buffer;
	}
	public int getWrite_line_lengths() {
		return write_line_lengths;
	}
	public void setWrite_line_lengths(int newWrite_line_lengths) {
		write_line_lengths = newWrite_line_lengths;
	}
	public int getFlush_read_but_not_sent() {
		return flush_read_but_not_sent;
	}
	public void setFlush_read_but_not_sent(int newFlush_read_but_not_sent) {
		flush_read_but_not_sent = newFlush_read_but_not_sent;
	}
}
