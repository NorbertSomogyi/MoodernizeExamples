package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* USE_METALINK */
/*
 * OutStruct variables keep track of information relative to curl's
 * output writing, which may take place to a standard stream or a file.
 *
 * 'filename' member is either a pointer to a file name string or NULL
 * when dealing with a standard stream.
 *
 * 'alloc_filename' member is TRUE when string pointed by 'filename' has been
 * dynamically allocated and 'belongs' to this OutStruct, otherwise FALSE.
 *
 * 'is_cd_filename' member is TRUE when string pointed by 'filename' has been
 * set using a server-specified Content-Disposition filename, otherwise FALSE.
 *
 * 's_isreg' member is TRUE when output goes to a regular file, this also
 * implies that output is 'seekable' and 'appendable' and also that member
 * 'filename' points to file name's string. For any standard stream member
 * 's_isreg' will be FALSE.
 *
 * 'fopened' member is TRUE when output goes to a regular file and it
 * has been fopen'ed, requiring it to be closed later on. In any other
 * case this is FALSE.
 *
 * 'stream' member is a pointer to a stream controlling object as returned
 * from a 'fopen' call or a standard stream.
 *
 * 'config' member is a pointer to associated 'OperationConfig' struct.
 *
 * 'bytes' member represents amount written so far.
 *
 * 'init' member holds original file size or offset at which truncation is
 * taking place. Always zero unless appending to a non-empty regular file.
 *
 * 'metalink_parser' member is a pointer to Metalink XML parser
 * context.
 */
public class OutStruct {
	private Byte filename;
	private  alloc_filename;
	private  is_cd_filename;
	private  s_isreg;
	private  fopened;
	private _iobuf stream;
	private OperationConfig config;
	private Object bytes;
	private Object init;
	
	public OutStruct(Byte filename,  alloc_filename,  is_cd_filename,  s_isreg,  fopened, _iobuf stream, OperationConfig config, Object bytes, Object init) {
		setFilename(filename);
		setAlloc_filename(alloc_filename);
		setIs_cd_filename(is_cd_filename);
		setS_isreg(s_isreg);
		setFopened(fopened);
		setStream(stream);
		setConfig(config);
		setBytes(bytes);
		setInit(init);
	}
	public OutStruct() {
	}
	
	public void ourWriteOut(Object curl, Object writeinfo) {
		FILE stream = (_iob[1]);
		byte ptr = writeinfo;
		byte stringp = ((Object)0);
		long longinfo;
		double doubleinfo;
		Byte generatedFilename = this.getFilename();
		while (ptr && ptr) {
			if ((byte)'%' == ptr && ptr[1]) {
				if ((byte)'%' == ptr[1]) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'%', /* an escaped %-letter */stream);
					ptr += 2;
				} else {
						byte end;
						if ((byte)'{' == ptr[1]) {
							byte keepit;
							int i;
							bool match = 0;
							end = /*Error: Function owner not recognized*/strchr(ptr, (byte)'}');
							ptr += /* pass the % and the { */2;
							if (!end) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("%{", stream);
								continue;
							} 
							keepit = end;
							end = /* zero terminate */0;
							for (i = 0; ModernizedCProgram.replacements[i].getName(); i++) {
								if (ModernizedCProgram.curl_strequal(ptr, ModernizedCProgram.replacements[i].getName())) {
									match = 1;
									switch (ModernizedCProgram.replacements[i].getId()) {
									case .VAR_HTTP_VERSION:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_HTTP_VERSION, longinfo)) {
												byte version = "0";
												switch (longinfo) {
												case CURL_HTTP_VERSION_1_0:
														version = "1.0";
														break;
												case CURL_HTTP_VERSION_3:
														version = "3";
														break;
												case CURL_HTTP_VERSION_2_0:
														version = "2";
														break;
												case CURL_HTTP_VERSION_1_1:
														version = "1.1";
														break;
												}
												stream.curl_mfprintf(version);
											} 
											break;
									case .VAR_PRETRANSFER_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_PRETRANSFER_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_LOCAL_IP:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_LOCAL_IP, stringp)) {
												stream.curl_mfprintf("%s", stringp);
											} 
											break;
									case .VAR_REQUEST_SIZE:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_REQUEST_SIZE, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_EFFECTIVE_URL:
											if ((CURLE_OK == curl.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, stringp)) && stringp) {
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(stringp, stream);
											} 
											break;
									case .VAR_NAMELOOKUP_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_NAMELOOKUP_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_SSL_VERIFY_RESULT:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SSL_VERIFYRESULT, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_HEADER_SIZE:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_HEADER_SIZE, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_REDIRECT_COUNT:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_REDIRECT_COUNT, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_STDOUT:
											stream = (_iob[1]);
											break;
									case .VAR_SCHEME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SCHEME, stringp)) {
												stream.curl_mfprintf("%s", stringp);
											} 
											break;
									case .VAR_SPEED_DOWNLOAD:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SPEED_DOWNLOAD, doubleinfo)) {
												stream.curl_mfprintf("%.3f", doubleinfo);
											} 
											break;
									case .VAR_LOCAL_PORT:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_LOCAL_PORT, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_CONNECT_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_CONNECT_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_STARTTRANSFER_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_STARTTRANSFER_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_SIZE_DOWNLOAD:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SIZE_DOWNLOAD, doubleinfo)) {
												stream.curl_mfprintf("%.0f", doubleinfo);
											} 
											break;
									case .VAR_FTP_ENTRY_PATH:
											if ((CURLE_OK == curl.curl_easy_getinfo(CURLINFO_FTP_ENTRY_PATH, stringp)) && stringp) {
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(stringp, stream);
											} 
											break;
									case .VAR_REDIRECT_URL:
											if ((CURLE_OK == curl.curl_easy_getinfo(CURLINFO_REDIRECT_URL, stringp)) && stringp) {
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(stringp, stream);
											} 
											break;
									case .VAR_HTTP_CODE_PROXY:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_HTTP_CONNECTCODE, longinfo)) {
												stream.curl_mfprintf("%03ld", longinfo);
											} 
											break;
									case .VAR_REDIRECT_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_REDIRECT_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_TOTAL_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_TOTAL_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_SIZE_UPLOAD:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SIZE_UPLOAD, doubleinfo)) {
												stream.curl_mfprintf("%.0f", doubleinfo);
											} 
											break;
									case .VAR_PROXY_SSL_VERIFY_RESULT:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_PROXY_SSL_VERIFYRESULT, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_STDERR:
											stream = (_iob[2]);
											break;
									case .VAR_PRIMARY_PORT:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_PRIMARY_PORT, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_PRIMARY_IP:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_PRIMARY_IP, stringp)) {
												stream.curl_mfprintf("%s", stringp);
											} 
											break;
									case .VAR_HTTP_CODE:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_RESPONSE_CODE, longinfo)) {
												stream.curl_mfprintf("%03ld", longinfo);
											} 
											break;
									case .VAR_NUM_CONNECTS:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_NUM_CONNECTS, longinfo)) {
												stream.curl_mfprintf("%ld", longinfo);
											} 
											break;
									case .VAR_EFFECTIVE_FILENAME:
											if (generatedFilename) {
												stream.curl_mfprintf("%s", generatedFilename);
											} 
											break;
									case .VAR_APPCONNECT_TIME:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_APPCONNECT_TIME, doubleinfo)) {
												stream.curl_mfprintf("%.6f", doubleinfo);
											} 
											break;
									case .VAR_CONTENT_TYPE:
											if ((CURLE_OK == curl.curl_easy_getinfo(CURLINFO_CONTENT_TYPE, stringp)) && stringp) {
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(stringp, stream);
											} 
											break;
									case .VAR_SPEED_UPLOAD:
											if (CURLE_OK == curl.curl_easy_getinfo(CURLINFO_SPEED_UPLOAD, doubleinfo)) {
												stream.curl_mfprintf("%.3f", doubleinfo);
											} 
											break;
									default:
											break;
									}
									break;
								} 
							}
							if (!match) {
								(_iob[2]).curl_mfprintf("curl: unknown --write-out variable: '%s'\n", ptr);
							} 
							ptr = end + /* pass the end */1;
							end = keepit;
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'%', /* illegal syntax, then just output the characters that are used */stream);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(ptr[1], stream);
								ptr += 2;
						} 
				} 
			}  else if ((byte)'\\' == ptr && ptr[1]) {
				switch (ptr[1]) {
				case (byte)'r':
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\r', stream);
						break;
				case (byte)'t':
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\t', stream);
						break;
				case (byte)'n':
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', stream);
						break;
				default:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(ptr, /* unknown, just output this */stream);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(ptr[1], stream);
						break;
				}
				ptr += 2;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(ptr, stream);
					ptr++;
			} 
		}
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
	/* create a local file for writing, return TRUE on success */
	public  tool_create_output_file() {
		OperationConfig generatedConfig = this.getConfig();
		Object generatedOperationConfig = generatedConfig.getOperationConfig();
		GlobalConfig global = generatedOperationConfig;
		FILE file = new FILE();
		Byte generatedFilename = this.getFilename();
		if (!generatedFilename || !generatedFilename) {
			global.warnf("Remote filename has no length!\n");
			return 0;
		} 
		 generatedIs_cd_filename = this.getIs_cd_filename();
		if (generatedIs_cd_filename) {
			file = /*Error: Function owner not recognized*/fopen(generatedFilename, /* don't overwrite existing files */"rb");
			if (file) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(file);
				global.warnf("Refusing to overwrite %s: %s\n", generatedFilename, /*Error: Function owner not recognized*/strerror(17));
				return 0;
			} 
		} 
		file = /*Error: Function owner not recognized*/fopen(generatedFilename, /* open file for writing */"wb");
		if (!file) {
			global.warnf("Failed to create the file %s: %s\n", generatedFilename, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		this.setS_isreg(1);
		this.setFopened(1);
		this.setStream(file);
		this.setBytes(0);
		this.setInit(0);
		return 1/*
		** callback for CURLOPT_WRITEFUNCTION
		*/;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public  getAlloc_filename() {
		return alloc_filename;
	}
	public void setAlloc_filename( newAlloc_filename) {
		alloc_filename = newAlloc_filename;
	}
	public  getIs_cd_filename() {
		return is_cd_filename;
	}
	public void setIs_cd_filename( newIs_cd_filename) {
		is_cd_filename = newIs_cd_filename;
	}
	public  getS_isreg() {
		return s_isreg;
	}
	public void setS_isreg( newS_isreg) {
		s_isreg = newS_isreg;
	}
	public  getFopened() {
		return fopened;
	}
	public void setFopened( newFopened) {
		fopened = newFopened;
	}
	public _iobuf getStream() {
		return stream;
	}
	public void setStream(_iobuf newStream) {
		stream = newStream;
	}
	public OperationConfig getConfig() {
		return config;
	}
	public void setConfig(OperationConfig newConfig) {
		config = newConfig;
	}
	public Object getBytes() {
		return bytes;
	}
	public void setBytes(Object newBytes) {
		bytes = newBytes;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
}
