package application;

public class tool_mime {
	private  kind;
	private tool_mime parent;
	private tool_mime prev;
	private Object data;
	private Object name;
	private Object filename;
	private Object type;
	private Object encoder;
	private curl_slist headers;
	private tool_mime subparts;
	private Object origin;
	private Object size;
	private Object curpos;
	private GlobalConfig config;
	
	public tool_mime( kind, tool_mime parent, tool_mime prev, Object data, Object name, Object filename, Object type, Object encoder, curl_slist headers, tool_mime subparts, Object origin, Object size, Object curpos, GlobalConfig config) {
		setKind(kind);
		setParent(parent);
		setPrev(prev);
		setData(data);
		setName(name);
		setFilename(filename);
		setType(type);
		setEncoder(encoder);
		setHeaders(headers);
		setSubparts(subparts);
		setOrigin(origin);
		setSize(size);
		setCurpos(curpos);
		setConfig(config);
	}
	public tool_mime() {
	}
	
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
	 *
	 * This software is licensed as described in the file COPYING, which
	 * you should have received as part of this distribution. The terms
	 * are also available at https://curl.haxx.se/docs/copyright.html.
	 *
	 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
	 * copies of the Software, and permit persons to whom the Software is
	 * furnished to do so, under the terms of the COPYING file.
	 *
	 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
	 * KIND, either express or implied.
	 *
	 ***************************************************************************/
	/* use our own printf() functions */
	/* keep this as LAST include */
	/* Macros to free const pointers. */
	/* tool_mime functions. */
	public tool_mime tool_mime_new( kind) {
		tool_mime m = (tool_mime).calloc(1, );
		tool_mime generatedSubparts = this.getSubparts();
		if (m) {
			m.setKind(kind);
			m.setParent(parent);
			if (parent) {
				m.setPrev(generatedSubparts);
				this.setSubparts(m);
			} 
		} 
		return m;
	}
	public tool_mime tool_mime_new_parts() {
		return parent.tool_mime_new(.TOOLMIME_PARTS);
	}
	public tool_mime tool_mime_new_data(Object data) {
		tool_mime m = ((Object)0);
		data = .strdup(data);
		if (data) {
			m = parent.tool_mime_new(.TOOLMIME_DATA);
			if (!m) {
				.free((Object)(data));
			} else {
					m.setData(data);
			} 
		} 
		return m;
	}
	public tool_mime tool_mime_new_filedata(Object filename,  isremotefile, Object errcode) {
		 result = CURLE_OK;
		tool_mime m = ((Object)0);
		errcode = CURLE_OUT_OF_MEMORY;
		Object generatedSt_mode = sbuf.getSt_mode();
		Object generatedSt_size = sbuf.getSt_size();
		if (.strcmp(filename, "-")) {
			filename = .strdup(/* This is a normal file. */filename);
			if (filename) {
				m = parent.tool_mime_new(.TOOLMIME_FILE);
				if (!m) {
					.free((Object)(filename));
				} else {
						m.setData(filename);
						if (!isremotefile) {
							m.setKind(.TOOLMIME_FILEDATA);
						} 
						errcode = CURLE_OK;
				} 
			} 
		} else {
				int fd = (((_iob[0])).get_file());
				byte data = ((Object)0);
				 size = new ();
				 origin = new ();
				_stati64 sbuf = new _stati64();
				(_iob[0]).set_binmode();
				origin = .ftell((_iob[0/* If stdin is a regular file, do not buffer data but read it
				       when needed. */]));
				if (fd >= 0 && origin >= 0 && !._fstati64(fd, sbuf) && (((generatedSt_mode) & -1024) == -1024)) {
					size = generatedSt_size - origin;
					if (size < 0) {
						size = 0;
					} 
				} else {
						size_t stdinsize = /* Not suitable for direct use, buffer stdin data. */0;
						if ((_iob[0]).file2memory(ModernizedCProgram.data, stdinsize) != .PARAM_OK) {
							return /* Out of memory. */m;
						} 
						if ((((_iob[0])).get_flag() & -1024)) {
							result = CURLE_READ_ERROR;
							do {
								.free((ModernizedCProgram.data));
								(ModernizedCProgram.data) = ((Object)0);
							} while (0);
							ModernizedCProgram.data = ((Object)0);
						}  else if (!stdinsize) {
							ModernizedCProgram.data = .strdup(/* Zero-length data has been freed. Re-create it. */"");
							if (!ModernizedCProgram.data) {
								return m;
							} 
						} 
						size = ModernizedCProgram.curlx_uztoso(stdinsize);
						origin = 0;
				} 
				m = parent.tool_mime_new(.TOOLMIME_STDIN);
				if (!m) {
					do {
						.free((ModernizedCProgram.data));
						(ModernizedCProgram.data) = ((Object)0);
					} while (0);
				} else {
						m.setData(ModernizedCProgram.data);
						m.setOrigin(origin);
						m.setSize(size);
						m.setCurpos(0);
						if (!isremotefile) {
							m.setKind(.TOOLMIME_STDINDATA);
						} 
						errcode = result;
				} 
		} 
		return m;
	}
	public void tool_mime_free() {
		tool_mime generatedSubparts = this.getSubparts();
		tool_mime generatedPrev = this.getPrev();
		Object generatedName = this.getName();
		Object generatedFilename = this.getFilename();
		Object generatedType = this.getType();
		Object generatedEncoder = this.getEncoder();
		Object generatedData = this.getData();
		curl_slist generatedHeaders = this.getHeaders();
		if (mime) {
			if (generatedSubparts) {
				generatedSubparts.tool_mime_free();
			} 
			if (generatedPrev) {
				generatedPrev.tool_mime_free();
			} 
			do {
				.free((((Object)(generatedName))));
				(((Object)(generatedName))) = ((Object)0);
			} while (0);
			do {
				.free((((Object)(generatedFilename))));
				(((Object)(generatedFilename))) = ((Object)0);
			} while (0);
			do {
				.free((((Object)(generatedType))));
				(((Object)(generatedType))) = ((Object)0);
			} while (0);
			do {
				.free((((Object)(generatedEncoder))));
				(((Object)(generatedEncoder))) = ((Object)0);
			} while (0);
			do {
				.free((((Object)(generatedData))));
				(((Object)(generatedData))) = ((Object)0);
			} while (0);
			generatedHeaders.curl_slist_free_all();
			.free(mime);
		} 
	}
	/* Translate an internal mime tree into a libcurl mime tree. */
	public Object tool2curlparts(Object curl, Object mime) {
		 ret = CURLE_OK;
		 part = ((Object)0);
		 submime = ((Object)0);
		byte filename = ((Object)0);
		tool_mime generatedPrev = this.getPrev();
		Object generatedFilename = this.getFilename();
		Object generatedData = this.getData();
		 generatedKind = this.getKind();
		Object generatedSize = this.getSize();
		Object generatedType = this.getType();
		curl_slist generatedHeaders = this.getHeaders();
		Object generatedEncoder = this.getEncoder();
		Object generatedName = this.getName();
		if (m) {
			ret = generatedPrev.tool2curlparts(curl, mime);
			if (!ret) {
				part = ModernizedCProgram.curl_mime_addpart(mime);
				if (!part) {
					ret = CURLE_OUT_OF_MEMORY;
				} 
			} 
			if (!ret) {
				filename = generatedFilename;
				switch (generatedKind) {
				case .TOOLMIME_DATA/* Our data is always textual: convert it to ASCII. */:
						ret = ModernizedCProgram.curl_mime_data(part, generatedData, CURL_ZERO_TERMINATED);
						break;
				case .TOOLMIME_FILEDATA:
						ret = ModernizedCProgram.curl_mime_filedata(part, generatedData);
						if (!ret && generatedKind == .TOOLMIME_FILEDATA && !filename) {
							ret = ModernizedCProgram.curl_mime_filename(part, ((Object)0));
						} 
						break;
				case .TOOLMIME_STDIN:
						if (!filename) {
							filename = "-";
						} 
				case .TOOLMIME_FILE:
				case /* FALLTHROUGH */.TOOLMIME_STDINDATA:
						ret = ModernizedCProgram.curl_mime_data_cb(part, generatedSize, ()ModernizedCProgram.tool_mime_stdin_read, ()ModernizedCProgram.tool_mime_stdin_seek, ((Object)0), m);
						break;
				case .TOOLMIME_PARTS:
						ret = m.tool2curlmime(curl, submime);
						if (!ret) {
							ret = ModernizedCProgram.curl_mime_subparts(part, submime);
							if (ret) {
								ModernizedCProgram.curl_mime_free(submime);
							} 
						} 
						break;
				default:
						break;
				}
			} 
			if (!ret && filename) {
				ret = ModernizedCProgram.curl_mime_filename(part, filename);
			} 
			if (!ret) {
				ret = ModernizedCProgram.curl_mime_type(part, generatedType);
			} 
			if (!ret) {
				ret = generatedHeaders.curl_mime_headers(part, 0);
			} 
			if (!ret) {
				ret = ModernizedCProgram.curl_mime_encoder(part, generatedEncoder);
			} 
			if (!ret) {
				ret = ModernizedCProgram.curl_mime_name(part, generatedName);
			} 
		} 
		return ret;
	}
	public Object tool2curlmime(Object curl, Object mime) {
		 ret = CURLE_OK;
		mime = curl.curl_mime_init();
		tool_mime generatedSubparts = this.getSubparts();
		if (!mime) {
			ret = CURLE_OUT_OF_MEMORY;
		} else {
				ret = generatedSubparts.tool2curlparts(curl, mime);
		} 
		if (ret) {
			ModernizedCProgram.curl_mime_free(mime);
			mime = ((Object)0);
		} 
		return ret/*
		 * helper function to get a word from form param
		 * after call get_parm_word, str either point to string end
		 * or point to any of end chars.
		 */;
	}
	public  getKind() {
		return kind;
	}
	public void setKind( newKind) {
		kind = newKind;
	}
	public tool_mime getParent() {
		return parent;
	}
	public void setParent(tool_mime newParent) {
		parent = newParent;
	}
	public tool_mime getPrev() {
		return prev;
	}
	public void setPrev(tool_mime newPrev) {
		prev = newPrev;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getEncoder() {
		return encoder;
	}
	public void setEncoder(Object newEncoder) {
		encoder = newEncoder;
	}
	public curl_slist getHeaders() {
		return headers;
	}
	public void setHeaders(curl_slist newHeaders) {
		headers = newHeaders;
	}
	public tool_mime getSubparts() {
		return subparts;
	}
	public void setSubparts(tool_mime newSubparts) {
		subparts = newSubparts;
	}
	public Object getOrigin() {
		return origin;
	}
	public void setOrigin(Object newOrigin) {
		origin = newOrigin;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getCurpos() {
		return curpos;
	}
	public void setCurpos(Object newCurpos) {
		curpos = newCurpos;
	}
	public GlobalConfig getConfig() {
		return config;
	}
	public void setConfig(GlobalConfig newConfig) {
		config = newConfig;
	}
}
/* Structural fields. */
