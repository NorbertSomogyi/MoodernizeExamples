package application;

public class flickcurl_s {
	private int total_bytes;
	private int failed;
	private int error_code;
	private Byte error_msg;
	private int status_code;
	private Byte param_fields;
	private Byte param_values;
	private int parameter_count;
	private Byte upload_field;
	private Byte upload_value;
	private Byte uri;
	private Object curl_handle;
	private Object error_buffer;
	private int curl_init_here;
	private Byte user_agent;
	private Byte proxy;
	private Object error_data;
	private Object error_handler;
	private Byte http_accept;
	private Object xc;
	private Byte secret;
	private Byte api_key;
	private Byte auth_token;
	private int sign;
	private Byte method;
	private Object tag_handler;
	private Object tag_data;
	private Object licenses;
	private timeval last_request_time;
	private long request_delay;
	private int is_write;
	private Object data;
	private Object data_length;
	private int data_is_xml;
	private int xml_parse_content;
	private int save_content;
	private flickcurl_chunk_s chunks;
	private int chunks_count;
	private Byte service_uri;
	private Byte upload_service_uri;
	private Byte replace_service_uri;
	private int uri_len;
	private Object curl_setopt_handler;
	private Object curl_setopt_handler_data;
	private Byte oauth_request_token_uri;
	private Byte oauth_authorize_uri;
	private Byte oauth_access_token_uri;
	private Object mt;
	private  od;
	private Object parameters;
	private int count;
	
	public flickcurl_s(int total_bytes, int failed, int error_code, Byte error_msg, int status_code, Byte param_fields, Byte param_values, int parameter_count, Byte upload_field, Byte upload_value, Byte uri, Object curl_handle, Object error_buffer, int curl_init_here, Byte user_agent, Byte proxy, Object error_data, Object error_handler, Byte http_accept, Object xc, Byte secret, Byte api_key, Byte auth_token, int sign, Byte method, Object tag_handler, Object tag_data, Object licenses, timeval last_request_time, long request_delay, int is_write, Object data, Object data_length, int data_is_xml, int xml_parse_content, int save_content, flickcurl_chunk_s chunks, int chunks_count, Byte service_uri, Byte upload_service_uri, Byte replace_service_uri, int uri_len, Object curl_setopt_handler, Object curl_setopt_handler_data, Byte oauth_request_token_uri, Byte oauth_authorize_uri, Byte oauth_access_token_uri, Object mt,  od, Object parameters, int count) {
		setTotal_bytes(total_bytes);
		setFailed(failed);
		setError_code(error_code);
		setError_msg(error_msg);
		setStatus_code(status_code);
		setParam_fields(param_fields);
		setParam_values(param_values);
		setParameter_count(parameter_count);
		setUpload_field(upload_field);
		setUpload_value(upload_value);
		setUri(uri);
		setCurl_handle(curl_handle);
		setError_buffer(error_buffer);
		setCurl_init_here(curl_init_here);
		setUser_agent(user_agent);
		setProxy(proxy);
		setError_data(error_data);
		setError_handler(error_handler);
		setHttp_accept(http_accept);
		setXc(xc);
		setSecret(secret);
		setApi_key(api_key);
		setAuth_token(auth_token);
		setSign(sign);
		setMethod(method);
		setTag_handler(tag_handler);
		setTag_data(tag_data);
		setLicenses(licenses);
		setLast_request_time(last_request_time);
		setRequest_delay(request_delay);
		setIs_write(is_write);
		setData(data);
		setData_length(data_length);
		setData_is_xml(data_is_xml);
		setXml_parse_content(xml_parse_content);
		setSave_content(save_content);
		setChunks(chunks);
		setChunks_count(chunks_count);
		setService_uri(service_uri);
		setUpload_service_uri(upload_service_uri);
		setReplace_service_uri(replace_service_uri);
		setUri_len(uri_len);
		setCurl_setopt_handler(curl_setopt_handler);
		setCurl_setopt_handler_data(curl_setopt_handler_data);
		setOauth_request_token_uri(oauth_request_token_uri);
		setOauth_authorize_uri(oauth_authorize_uri);
		setOauth_access_token_uri(oauth_access_token_uri);
		setMt(mt);
		setOd(od);
		setParameters(parameters);
		setCount(count);
	}
	public flickcurl_s() {
	}
	
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * commons-api.c - Flickr flickr.commons.* API calls
	 *
	 * Commons API announced 2009-01-29
	 * http://flickr.com/groups/api/discuss/72157613093793775/
	 *
	 * Copyright (C) 2009-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_commons_getInstitutions:
	 * @fc: flickcurl context
	 * 
	 * Retrieves a list of the current Commons institutions.
	 *
	 * Implements flickr.commons.getInstitutions (1.8)
	 * 
	 * Return value: non-0 on failure
	 **/
	public  flickcurl_commons_getInstitutions() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_institution institutions = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.commons.getInstitutions")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		institutions = fc.flickcurl_build_institutions(xpathCtx, ()"/rsp/institutions/institution", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (institutions) {
				institutions.flickcurl_free_institutions();
			} 
			institutions = ((Object)0);
		} 
		return institutions;
	}
	public void flickcurl_error_varargs(Object message, Object arguments) {
		Object generatedError_handler = this.getError_handler();
		Object generatedError_data = this.getError_data();
		if (fc && generatedError_handler) {
			byte buffer = ModernizedCProgram.my_vsnprintf(message, arguments);
			if (!buffer) {
				.fprintf((_iob[2]), "flickcurl: Out of memory\n");
				return ;
			} 
			.UNRECOGNIZEDFUNCTIONNAME(generatedError_data, buffer);
			.free(buffer);
		} else {
				.fprintf((_iob[2]), "flickcurl error - ");
				.vfprintf((_iob[2]), message, arguments);
				.fputc((byte)'\n', (_iob[2]));
		} 
	}
	public void flickcurl_error(Object message) {
		va_list arguments = new va_list();
		.__builtin_va_start(arguments, message);
		fc.flickcurl_error_varargs(message, arguments);
		.__builtin_va_end(arguments);
	}
	/**
	 * flickcurl_new_with_handle:
	 * @curl_handle: CURL* handle
	 *
	 * Create a Flickcurl sesssion from an existing CURL* handler
	 *
	 * This allows setting up or re-using an existing CURL handle with
	 * Flickcurl, however the library will call curl_easy_setopt to set
	 * options based on the operation being performed.  If these need to
	 * be over-ridden, use flickcurl_set_curl_setopt_handler() to adjust
	 * the options.
	 *
	 * NOTE: The type of @handle is void* so that curl headers are
	 * optional when compiling against flickcurl.
	 *
	 * Return value: new #flickcurl object or NULL on fialure
	 */
	public flickcurl_s flickcurl_new_with_handle(Object curl_handle) {
		flickcurl fc = new flickcurl();
		size_t len = new size_t();
		fc = (flickcurl).calloc(1, );
		if (!fc) {
			return ((Object)0);
		} 
		len = .strlen(ModernizedCProgram.flickcurl_flickr_service_uri);
		fc.setService_uri((byte).malloc(len + 1));
		Byte generatedService_uri = fc.getService_uri();
		.memcpy(generatedService_uri, ModernizedCProgram.flickcurl_flickr_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_upload_service_uri);
		fc.setUpload_service_uri((byte).malloc(len + 1));
		Byte generatedUpload_service_uri = fc.getUpload_service_uri();
		.memcpy(generatedUpload_service_uri, ModernizedCProgram.flickcurl_flickr_upload_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_replace_service_uri);
		fc.setReplace_service_uri((byte).malloc(len + 1));
		Byte generatedReplace_service_uri = fc.getReplace_service_uri();
		.memcpy(generatedReplace_service_uri, ModernizedCProgram.flickcurl_flickr_replace_service_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_request_token_uri);
		fc.setOauth_request_token_uri((byte).malloc(len + 1));
		Byte generatedOauth_request_token_uri = fc.getOauth_request_token_uri();
		.memcpy(generatedOauth_request_token_uri, ModernizedCProgram.flickcurl_flickr_oauth_request_token_uri, len + 1);
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_access_token_uri);
		fc.setOauth_access_token_uri((byte).malloc(len + 1));
		Byte generatedOauth_access_token_uri = fc.getOauth_access_token_uri();
		.memcpy(generatedOauth_access_token_uri, ModernizedCProgram.flickcurl_flickr_oauth_access_token_uri, len + 1);
		fc.setRequest_delay(/* DEFAULT delay between requests is 1000ms i.e 1 request/second max */1000);
		fc.setMt(.flickcurl_mtwist_new());
		Object generatedMt = fc.getMt();
		if (!generatedMt) {
			.free(fc);
			return ((Object)0);
		} 
		.flickcurl_mtwist_init(generatedMt, .flickcurl_mtwist_seed_from_system(generatedMt));
		fc.setCurl_handle(()curl_handle);
		Object generatedCurl_handle = fc.getCurl_handle();
		if (!generatedCurl_handle) {
			fc.setCurl_handle(.curl_easy_init());
			fc.setCurl_init_here(1);
		} 
		.curl_easy_setopt(generatedCurl_handle, /* send all data to this function  */CURLOPT_WRITEFUNCTION, flickcurl_write_callback);
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_FILE, /* ... using this data pointer */fc);
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_FOLLOWLOCATION, /* Make it follow Location: headers */1);
		Object generatedError_buffer = fc.getError_buffer();
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_ERRORBUFFER, generatedError_buffer);
		return fc/**
		 * flickcurl_new:
		 *
		 * Create a Flickcurl sesssion
		 *
		 * Return value: new #flickcurl object or NULL on fialure
		 */;
	}
	public flickcurl_s flickcurl_new() {
		flickcurl_s flickcurl_s = new flickcurl_s();
		return flickcurl_s.flickcurl_new_with_handle(((Object)0/**
		 * flickcurl_free:
		 * @fc: flickcurl object
		 * 
		 * Destroy flickcurl session
		 *
		 */));
	}
	public void flickcurl_free() {
		Object generatedXc = this.getXc();
		if (generatedXc) {
			if (generatedXc.getMyDoc()) {
				.xmlFreeDoc(generatedXc.getMyDoc());
				generatedXc.setMyDoc(((Object)0));
			} 
			.xmlFreeParserCtxt(generatedXc);
		} 
		Byte generatedSecret = this.getSecret();
		if (generatedSecret) {
			.free(generatedSecret);
		} 
		Byte generatedAuth_token = this.getAuth_token();
		if (generatedAuth_token) {
			.free(generatedAuth_token);
		} 
		Byte generatedMethod = this.getMethod();
		if (generatedMethod) {
			.free(generatedMethod);
		} 
		int generatedCurl_init_here = this.getCurl_init_here();
		Object generatedCurl_handle = this.getCurl_handle();
		if (generatedCurl_init_here && generatedCurl_handle) {
			.curl_easy_cleanup(generatedCurl_handle);
			this.setCurl_handle(((Object)0));
		} 
		Byte generatedError_msg = this.getError_msg();
		if (generatedError_msg) {
			.free(generatedError_msg);
		} 
		Object generatedLicenses = this.getLicenses();
		Object generatedName = license.getName();
		Object generatedUrl = license.getUrl();
		if (generatedLicenses) {
			int i;
			flickcurl_license license = new flickcurl_license();
			for (i = 0; (license = generatedLicenses[i]); i++) {
				.free(generatedName);
				if (generatedUrl) {
					.free(generatedUrl);
				} 
				.free(license);
			}
			.free(generatedLicenses);
		} 
		Object generatedData = this.getData();
		int generatedData_is_xml = this.getData_is_xml();
		if (generatedData) {
			if (generatedData_is_xml) {
				.xmlFree(generatedData);
			} 
		} 
		Byte generatedParam_fields = this.getParam_fields();
		Byte generatedParam_values = this.getParam_values();
		if (generatedParam_fields) {
			int i;
			for (i = 0; generatedParam_fields[i]; i++) {
				.free(generatedParam_fields[i]);
				.free(generatedParam_values[i]);
			}
			.free(generatedParam_fields);
			.free(generatedParam_values);
			this.setParam_fields(((Object)0));
			this.setParam_values(((Object)0));
			this.setParameter_count(0);
		} 
		Byte generatedUpload_field = this.getUpload_field();
		if (generatedUpload_field) {
			.free(generatedUpload_field);
		} 
		Byte generatedUpload_value = this.getUpload_value();
		if (generatedUpload_value) {
			.free(generatedUpload_value);
		} 
		Byte generatedService_uri = this.getService_uri();
		if (generatedService_uri) {
			.free(generatedService_uri);
		} 
		Byte generatedUpload_service_uri = this.getUpload_service_uri();
		if (generatedUpload_service_uri) {
			.free(generatedUpload_service_uri);
		} 
		Byte generatedReplace_service_uri = this.getReplace_service_uri();
		if (generatedReplace_service_uri) {
			.free(generatedReplace_service_uri);
		} 
		Byte generatedOauth_request_token_uri = this.getOauth_request_token_uri();
		if (generatedOauth_request_token_uri) {
			.free(generatedOauth_request_token_uri);
		} 
		Byte generatedOauth_access_token_uri = this.getOauth_access_token_uri();
		if (generatedOauth_access_token_uri) {
			.free(generatedOauth_access_token_uri);
		} 
		Byte generatedUser_agent = this.getUser_agent();
		if (generatedUser_agent) {
			.free(generatedUser_agent);
		} 
		Byte generatedUri = this.getUri();
		if (generatedUri) {
			.free(generatedUri);
		} 
		Object generatedMt = this.getMt();
		if (generatedMt) {
			.flickcurl_mtwist_free(generatedMt);
		} 
		 generatedOd = this.getOd();
		generatedOd.flickcurl_oauth_free();
		.free(fc/**
		 * flickcurl_init:
		 *
		 * Initialise Flickcurl library.
		 *
		 * Return value: non-0 on failure
		 */);
	}
	public void flickcurl_set_error_handler(Object error_handler, Object error_data) {
		this.setError_handler(error_handler);
		this.setError_data(error_data/**
		 * flickcurl_set_tag_handler:
		 * @fc: flickcurl object
		 * @tag_handler: tag handler function
		 * @tag_data: tag handler data
		 *
		 * Set Flickcurl tag handler.
		 */);
	}
	public void flickcurl_set_tag_handler(Object tag_handler, Object tag_data) {
		this.setTag_handler(tag_handler);
		this.setTag_data(tag_data/**
		 * flickcurl_set_user_agent:
		 * @fc: flickcurl object
		 * @user_agent: user agent string
		 *
		 * Set Flickcurl HTTP user agent string
		 */);
	}
	public void flickcurl_set_user_agent(Object user_agent) {
		size_t len = .strlen(user_agent);
		byte ua_copy = (byte).malloc(len + 1);
		if (!ua_copy) {
			return ;
		} 
		.memcpy(ua_copy, user_agent, len + 1);
		this.setUser_agent(ua_copy/**
		 * flickcurl_set_proxy:
		 * @fc: flickcurl object
		 * @proxy: HTTP proxy string
		 *
		 * Set HTTP proxy for flickcurl requests
		 */);
	}
	public void flickcurl_set_proxy(Object proxy) {
		size_t len = .strlen(proxy);
		byte proxy_copy = (byte).malloc(len + 1);
		if (!proxy_copy) {
			return ;
		} 
		.memcpy(proxy_copy, proxy, len + 1);
		this.setProxy(proxy_copy/**
		 * flickcurl_set_http_accept:
		 * @fc: flickcurl object
		 * @value: HTTP Accept header value
		 *
		 * Set HTTP accept header value for flickcurl requests
		 */);
	}
	public void flickcurl_set_http_accept(Object value) {
		byte value_copy;
		size_t len = /* strlen("Accept:") */7;
		if (value) {
			len += 1 + .strlen(/* " "+value */value);
		} 
		value_copy = (byte).malloc(len + 1);
		if (!value_copy) {
			return ;
		} 
		this.setHttp_accept(value_copy);
		.memcpy(value_copy, "Accept:", /* copy NUL */8);
		value_copy += 7;
		if (value) {
			value_copy++ = (byte)' ';
			.memcpy(value_copy, value, (len - 8) + 1);
		} 
	}
	public void flickcurl_set_service_uri(Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_service_uri;
		} 
		Byte generatedService_uri = this.getService_uri();
		if (generatedService_uri) {
			.free(generatedService_uri);
		} 
		len = .strlen(uri);
		this.setService_uri((byte).malloc(len + 1));
		.memcpy(generatedService_uri, uri, len + 1/**
		 * flickcurl_set_upload_service_uri:
		 * @fc: flickcurl object
		 * @uri: Upload Service URI (or NULL)
		 *
		 * Set Web Upload Service URI for flickcurl requests
		 *
		 * Sets the upload service to the default (Flickr API web
		 * upload_service) if @uri is NULL.
		 */);
	}
	public void flickcurl_set_upload_service_uri(Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_upload_service_uri;
		} 
		Byte generatedUpload_service_uri = this.getUpload_service_uri();
		if (generatedUpload_service_uri) {
			.free(generatedUpload_service_uri);
		} 
		len = .strlen(uri);
		this.setUpload_service_uri((byte).malloc(len + 1));
		.memcpy(generatedUpload_service_uri, uri, len + 1/**
		 * flickcurl_set_replace_service_uri:
		 * @fc: flickcurl object
		 * @uri: Replace Service URI (or NULL)
		 *
		 * Set Web Replace Service URI for flickcurl requests
		 *
		 * Sets the replace service to the default (Flickr API web
		 * replace_service) if @uri is NULL.
		 */);
	}
	public void flickcurl_set_replace_service_uri(Object uri) {
		size_t len = new size_t();
		if (!uri) {
			uri = ModernizedCProgram.flickcurl_flickr_replace_service_uri;
		} 
		Byte generatedReplace_service_uri = this.getReplace_service_uri();
		if (generatedReplace_service_uri) {
			.free(generatedReplace_service_uri);
		} 
		len = .strlen(uri);
		this.setReplace_service_uri((byte).malloc(len + 1));
		.memcpy(generatedReplace_service_uri, uri, len + 1/**
		 * flickcurl_set_api_key:
		 * @fc: flickcurl object
		 * @api_key: API Key
		 *
		 * Set legacy Flickr auth application API Key (OAuth Client key)
		 *
		 * For OAuth this is not sufficient and
		 * flickcurl_set_oauth_client_key() and
		 * flickcurl_set_oauth_client_secret() be used
		 * to pass both the client key and client secret.
		 */);
	}
	public void flickcurl_set_api_key(Object api_key) {
		size_t len = new size_t();
		 generatedOd = this.getOd();
		Object generatedClient_key = generatedOd.getClient_key();
		if (generatedClient_key) {
			.free(generatedClient_key);
		} 
		len = .strlen(api_key);
		generatedOd.setClient_key((byte).malloc(len + 1));
		.memcpy(generatedClient_key, api_key, len + 1);
		generatedOd.setClient_key_len(len/* Mainly for flickcurl_auth_oauth_getAccessToken() to sign the call
		   * exchanging tokens 
		   */);
		this.setApi_key(generatedClient_key);
	}
	public Object flickcurl_get_api_key() {
		Byte generatedApi_key = this.getApi_key();
		return generatedApi_key;
	}
	public void flickcurl_set_shared_secret(Object secret) {
		size_t len = new size_t();
		Byte generatedSecret = this.getSecret();
		if (generatedSecret) {
			.free(generatedSecret);
		} 
		len = .strlen(secret);
		this.setSecret((byte).malloc(len + 1));
		.memcpy(generatedSecret, secret, len + 1/**
		 * flickcurl_get_shared_secret:
		 * @fc: flickcurl object
		 *
		 * Get legacy Flickr auth Secret
		 *
		 * Return value: shared secret or NULL if none set
		 */);
	}
	public Object flickcurl_get_shared_secret() {
		Byte generatedSecret = this.getSecret();
		return generatedSecret;
	}
	public void flickcurl_set_auth_token(Object auth_token) {
		size_t len = new size_t();
		Byte generatedAuth_token = this.getAuth_token();
		if (generatedAuth_token) {
			.free(generatedAuth_token);
		} 
		len = .strlen(auth_token);
		this.setAuth_token((byte).malloc(len + 1));
		.memcpy(generatedAuth_token, auth_token, len + 1/**
		 * flickcurl_get_auth_token:
		 * @fc: flickcurl object
		 *
		 * Get legacy Flickr auth Token
		 *
		 * Return value: auth token or NULL if none set
		 */);
	}
	public Object flickcurl_get_auth_token() {
		Byte generatedAuth_token = this.getAuth_token();
		return generatedAuth_token;
	}
	public void flickcurl_set_sign() {
		this.setSign(1/**
		 * flickcurl_set_request_delay:
		 * @fc: flickcurl object
		 * @delay_msec: web service delay in milliseconds
		 *
		 * Set web service request delay
		 */);
	}
	public void flickcurl_set_request_delay(long delay_msec) {
		if (delay_msec >= 0) {
			this.setRequest_delay(delay_msec/*
			 * INTERNAL: initialise parameter array
			 */);
		} 
	}
	public void flickcurl_init_params(int is_write) {
		this.setCount(0);
		Object generatedParameters = this.getParameters();
		int generatedCount = this.getCount();
		generatedParameters[generatedCount][0] = ((Object)0);
		this.setIs_write(/* Default is read only */is_write);
		Object generatedData = this.getData();
		int generatedData_is_xml = this.getData_is_xml();
		if (generatedData) {
			if (generatedData_is_xml) {
				.xmlFree(generatedData);
			} 
			this.setData(((Object)0));
			this.setData_length(0);
			this.setData_is_xml(0);
		} 
		if (is_write) {
			fc.flickcurl_set_data((Object)"", 0/*
			 * INTERNAL: add a new (key, value) to array of parameters
			 */);
		} 
	}
	public void flickcurl_add_param(Object key, Object value) {
		Object generatedParameters = this.getParameters();
		int generatedCount = this.getCount();
		generatedParameters[generatedCount][0] = key;
		generatedParameters[generatedCount][1] = value;
		generatedCount++;
	}
	public void flickcurl_end_params() {
		Object generatedParameters = this.getParameters();
		int generatedCount = this.getCount();
		generatedParameters[generatedCount][0] = ((Object)0);
	}
	public int flickcurl_prepare_common(Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		int rc = 1;
		Byte generatedApi_key = this.getApi_key();
		Byte generatedSecret = this.getSecret();
		 generatedOd = this.getOd();
		Object generatedToken = generatedOd.getToken();
		Object generatedToken_secret = generatedOd.getToken_secret();
		if (generatedApi_key && generatedSecret) {
			rc = fc.flickcurl_legacy_prepare_common(service_uri, /* Call with legacy Flickr auth */method, upload_field, upload_value, parameters_in_url, need_auth);
		}  else if (generatedToken && generatedToken_secret) {
			rc = fc.flickcurl_oauth_prepare_common(service_uri, /* Call with OAuth */method, upload_field, upload_value, parameters_in_url, need_auth);
		} else {
				fc.flickcurl_error("No legacy or OAuth authentication tokens or secrets");
		} 
		return rc;
	}
	public int flickcurl_prepare_noauth(Object method) {
		if (!method) {
			fc.flickcurl_error("No method to prepare");
			return 1;
		} 
		Byte generatedService_uri = this.getService_uri();
		return fc.flickcurl_prepare_common(generatedService_uri, method, ((Object)0), ((Object)0), /* parameters_in_url */1, /* need_auth */0);
	}
	public int flickcurl_prepare(Object method) {
		if (!method) {
			fc.flickcurl_error("No method to prepare");
			return 1;
		} 
		Byte generatedService_uri = this.getService_uri();
		return fc.flickcurl_prepare_common(generatedService_uri, method, ((Object)0), ((Object)0), /* parameters_in_url */1, /* need_auth */1);
	}
	public int flickcurl_prepare_upload(Object url, Object upload_field, Object upload_value) {
		return fc.flickcurl_prepare_common(url, ((Object)0), upload_field, upload_value, /* parameters_in_url */0, /* need_auth */1/* Need gettimeofday() which is a BSD function not POSIX so may not
		 * be in standard C libraries
		 */);
	}
	public int flickcurl_get_current_request_wait() {
		int wait_usec = 0;
		timeval now = new timeval();
		timeval uwait = new timeval();
		timeval generatedLast_request_time = this.getLast_request_time();
		Object generatedTv_sec = generatedLast_request_time.getTv_sec();
		if (!generatedTv_sec) {
			return 0;
		} 
		now.gettimeofday(((Object)0));
		.memcpy(uwait, generatedLast_request_time, );
		Object generatedTv_usec = uwait.getTv_usec();
		long generatedRequest_delay = this.getRequest_delay();
		generatedTv_usec += 1000 * generatedRequest_delay;
		if (generatedTv_usec >= 1000000) {
			generatedTv_sec += generatedTv_usec / 1000000;
			uwait.setTv_usec(generatedTv_usec % 1000000);
		} 
		if (generatedTv_sec > generatedTv_sec || (generatedTv_sec == generatedTv_sec && generatedTv_usec > generatedTv_usec)) {
			wait_usec = /* No need to delay */0;
		} else {
				uwait.setTv_sec((generatedTv_sec - generatedTv_sec));
				uwait.setTv_usec((generatedTv_usec - generatedTv_usec));
				if (generatedTv_usec < 0) {
					generatedTv_sec--;
					generatedTv_usec += 1000000;
				} 
				if (generatedTv_sec > 247) {
					wait_usec = -/* 'infinity' */1;
				} else {
						wait_usec = generatedTv_sec * 1000000 + generatedTv_usec;
				} 
		} 
		return wait_usec;
	}
	public int flickcurl_invoke_common(byte content_p, Object size_p, Object docptr_p) {
		curl_slist slist = ((Object)0);
		 doc = ((Object)0);
		timeval now = new timeval();
		int rc = 0;
		/* skip "flickr." */
		Byte generatedUri = this.getUri();
		if (!generatedUri) {
			fc.flickcurl_error("No Flickr URI prepared to invoke");
			return 1;
		} 
		if (content_p) {
			this.setSave_content(1);
		} else {
				this.setXml_parse_content(1);
		} 
		now.gettimeofday(((Object)0));
		timeval generatedLast_request_time = this.getLast_request_time();
		Object generatedTv_sec = generatedLast_request_time.getTv_sec();
		Object generatedTv_usec = uwait.getTv_usec();
		long generatedRequest_delay = this.getRequest_delay();
		long generatedTv_nsec = nwait.getTv_nsec();
		if (generatedTv_sec) {
			timeval uwait = new timeval();
			.memcpy(uwait, generatedLast_request_time, );
			generatedTv_usec += 1000 * generatedRequest_delay;
			if (generatedTv_usec >= 1000000) {
				generatedTv_sec += generatedTv_usec / 1000000;
				uwait.setTv_usec(generatedTv_usec % 1000000);
			} 
			if (generatedTv_sec > generatedTv_sec || (generatedTv_sec == generatedTv_sec && generatedTv_usec > generatedTv_usec)) {
			} else {
					timespec nwait = new timespec();
					nwait.setTv_sec(generatedTv_sec - generatedTv_sec);
					nwait.setTv_nsec(1000 * (generatedTv_usec - generatedTv_usec));
					if (generatedTv_nsec < 0) {
						generatedTv_sec--;
						generatedTv_nsec += 1000000000/* Wait until timeval 'wait' happens */;
					} 
					while (1) {
						timespec rem = new timespec();
						if (rem.nanosleep(nwait) < 0 && (._errno()) == EINTR) {
							.memcpy(nwait, rem, );
							continue;
						} 
						break;
					}
			} 
		} 
		.memcpy(generatedLast_request_time, now, );
		Object generatedXc = this.getXc();
		if (generatedXc) {
			if (generatedXc.getMyDoc()) {
				.xmlFreeDoc(generatedXc.getMyDoc());
				generatedXc.setMyDoc(((Object)0));
			} 
			.xmlFreeParserCtxt(generatedXc);
			this.setXc(((Object)0));
		} 
		Byte generatedProxy = this.getProxy();
		Object generatedCurl_handle = this.getCurl_handle();
		if (generatedProxy) {
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_PROXY, generatedProxy);
		} 
		Byte generatedUser_agent = this.getUser_agent();
		if (generatedUser_agent) {
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_USERAGENT, generatedUser_agent);
		} 
		Byte generatedHttp_accept = this.getHttp_accept();
		if (generatedHttp_accept) {
			slist = .curl_slist_append(slist, (byte)generatedHttp_accept);
		} 
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_URL, generatedUri);
		this.setTotal_bytes(0);
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_NOBODY, /* default: read with no data: GET */1);
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_HTTPGET, 1);
		Object generatedData = this.getData();
		Object generatedData_length = this.getData_length();
		int generatedIs_write = this.getIs_write();
		if (generatedData) {
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_NOBODY, /* CURLOPT_NOBODY = 0 sets http request to HEAD - do it first to override */0);
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_POST, /* this function only resets no-body flag for curl >= 7.14.1 */1);
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_POSTFIELDS, generatedData);
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_POSTFIELDSIZE, generatedData_length);
		}  else if (generatedIs_write) {
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_NOBODY, /* CURLOPT_NOBODY = 0 sets http request to HEAD - do it first to override */0);
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_POST, /* this function only resets no-body flag for curl >= 7.14.1 */1);
		} 
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_HTTPHEADER, /* set slist always - either a list of headers or none (NULL) */slist);
		.curl_easy_setopt(generatedCurl_handle, /* send all headers to this function */CURLOPT_HEADERFUNCTION, flickcurl_curl_header_callback);
		.curl_easy_setopt(generatedCurl_handle, CURLOPT_WRITEHEADER, /* ... using this data pointer */fc);
		Byte generatedUpload_field = this.getUpload_field();
		Byte generatedParam_fields = this.getParam_fields();
		Byte generatedParam_values = this.getParam_values();
		Byte generatedUpload_value = this.getUpload_value();
		if (generatedUpload_field) {
			curl_httppost post = ((Object)0);
			curl_httppost last = ((Object)0);
			int i;
			for (i = 0; generatedParam_fields[i]; /* Main parameters */i++) {
				.curl_formadd(post, last, CURLFORM_PTRNAME, generatedParam_fields[i], CURLFORM_PTRCONTENTS, generatedParam_values[i], CURLFORM_END/* Upload parameter */);
			}
			.curl_formadd(post, last, CURLFORM_PTRNAME, generatedUpload_field, CURLFORM_FILE, generatedUpload_value, CURLFORM_END);
			.curl_easy_setopt(generatedCurl_handle, CURLOPT_HTTPPOST, /* Set the form info */post);
		} 
		Object generatedCurl_setopt_handler = this.getCurl_setopt_handler();
		Object generatedCurl_setopt_handler_data = this.getCurl_setopt_handler_data();
		if (generatedCurl_setopt_handler) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedCurl_handle, generatedCurl_setopt_handler_data);
		} 
		Byte generatedMethod = this.getMethod();
		Object generatedError_buffer = this.getError_buffer();
		int generatedStatus_code = this.getStatus_code();
		int generatedError_code = this.getError_code();
		Byte generatedError_msg = this.getError_msg();
		if (.curl_easy_perform(generatedCurl_handle)) {
			this.setFailed(/* failed */1);
			fc.flickcurl_error("Method %s failed with CURL error %s", generatedMethod, generatedError_buffer);
		} else {
				long lstatus;
				this.setStatus_code(0);
				if (/* Requires pointer to a long */CURLE_OK == .curl_easy_getinfo(generatedCurl_handle, CURLINFO_HTTP_CODE, lstatus)) {
					this.setStatus_code(lstatus);
				} 
				if (generatedStatus_code != 200) {
					if (generatedMethod) {
						fc.flickcurl_error("Method %s failed with error %d - %s (HTTP %d)", generatedMethod, generatedError_code, generatedError_msg, generatedStatus_code);
					} else {
							fc.flickcurl_error("Call failed with error %d - %s (HTTP %d)", generatedError_code, generatedError_msg, generatedStatus_code);
					} 
					this.setFailed(1);
				} 
		} 
		if (slist) {
			.curl_slist_free_all(slist);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			;
		} 
		int generatedSave_content = this.getSave_content();
		int generatedTotal_bytes = this.getTotal_bytes();
		int generatedChunks_count = this.getChunks_count();
		flickcurl_chunk_s generatedChunks = this.getChunks();
		flickcurl_chunk_s generatedPrev = chunk.getPrev();
		if (generatedSave_content) {
			byte c;
			flickcurl_chunk chunks = new flickcurl_chunk();
			c = (byte).malloc(generatedTotal_bytes + /* +1 for NUL */1);
			chunks = (flickcurl_chunk).malloc( * generatedChunks_count);
			if (c && chunks) {
				flickcurl_chunk chunk = generatedChunks;
				int i;
				byte p;
				for (i = generatedChunks_count - 1; i >= 0; /* create the ordered list of chunks */i--) {
					chunks[i] = chunk;
					chunk = generatedPrev;
				}
				p = c;
				for (i = 0; i < generatedChunks_count; i++) {
					.memcpy(p, chunks[i].getContent(), chunks[i].getSize());
					p += chunks[i].getSize();
					.free(chunks[i].getContent());
					.free(chunks[i]);
				}
				.free(chunks);
				this.setChunks(((Object)/* saved chunks list is now freed */0));
				this.setChunks_count(0);
				p = (byte)'\0';
				if (content_p) {
					content_p = c;
				} else {
						.free(c);
				} 
				if (size_p) {
					size_p = generatedTotal_bytes;
				} 
			} else {
					if (c) {
						.free(c);
					} 
					if (chunks) {
						.free(chunks);
					} 
					fc.flickcurl_error("Out of memory");
			} 
		} 
		int generatedXml_parse_content = this.getXml_parse_content();
		if (generatedXml_parse_content) {
			 xnp = new ();
			 attr = new ();
			int failed = 0;
			.xmlParseChunk(generatedXc, ((Object)0), 0, 1);
			doc = generatedXc.getMyDoc();
			if (!doc) {
				fc.flickcurl_error("Failed to create XML DOM for document");
				this.setFailed(1);
				;
			} 
			xnp = .xmlDocGetRootElement(doc);
			if (!xnp) {
				fc.flickcurl_error("Failed to parse XML");
				this.setFailed(1);
				;
			} 
			for (attr = xnp.getProperties(); attr; attr = attr.getNext()) {
				if (!.strcmp((byte)attr.getName(), "stat")) {
					byte attr_value = (byte)attr.getChildren().getContent();
					if (.strcmp(attr_value, "ok")) {
						failed = 1;
					} 
					break;
				} 
			}
			if (failed) {
				 err = xnp.getChildren().getNext();
				for (attr = err.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					byte attr_value = (byte)attr.getChildren().getContent();
					if (!.strcmp(attr_name, "code")) {
						this.setError_code(.atoi(attr_value));
					}  else if (!.strcmp(attr_name, "msg")) {
						size_t attr_len = .strlen(attr_value);
						this.setError_msg((byte).malloc(attr_len + 1));
						.memcpy(generatedError_msg, attr_value, attr_len + 1);
					} 
				}
				if (generatedMethod) {
					fc.flickcurl_error("Method %s failed with error %d - %s", generatedMethod, generatedError_code, generatedError_msg);
				} else {
						fc.flickcurl_error("Call failed with error %d - %s", generatedError_code, generatedError_msg);
				} 
				this.setFailed(1);
			} else {
					if (/* pass DOM as an output parameter */docptr_p) {
						docptr_p = doc;
					} 
			} 
		} 
		this.setSign(/* reset special flags */0);
		return rc;
	}
	public Object flickcurl_invoke() {
		 docptr = ((Object)0);
		if (!fc.flickcurl_invoke_common(((Object)0), ((Object)0), docptr)) {
			return docptr;
		} 
		return ((Object)0);
	}
	public Byte flickcurl_invoke_get_content(Object size_p) {
		byte content = ((Object)0);
		if (!fc.flickcurl_invoke_common(content, size_p, ((Object)0))) {
			return content;
		} 
		return ((Object)0/*
		 * INTERNAL - free a form.
		 */);
	}
	public Byte flickcurl_invoke_get_form_content(int count_p) {
		byte content = ((Object)0);
		byte form = ((Object)0);
		byte p;
		int count = 0;
		int i;
		if (fc.flickcurl_invoke_common(content, ((Object)0), ((Object)0))) {
			return ((Object)0);
		} 
		if (content) {
			for (p = content; p; p++) {
				if (p == (byte)'&') {
					count++;
				} 
			}
			/* counting separators so need +1 for number of contents */count/* Allocate 1+ count + 1 sized array of char* (key, value) pointers
			   * The last pair are always (NULL, NULL).
			   *
			   * The pointers are into the 'content' buffer which is kept around
			   * and owned by this array and stored in form[0].
			   */++;
		} 
		form = (byte).calloc(1 + 2 * (count + 1), );
		if (!form) {
			if (content) {
				.free(content);
			} 
			return ((Object)0);
		} 
		form[0] = /* the form owns the content array */content;
		if (content) {
			for (; p; p++) {
				byte start = p;
				while (p && p != (byte)'&' && p != (byte)'=') {
					p++;
				}
				form[i++] = start;
				if (!p) {
					break;
				} 
				p = (byte)'\0';
			}
			form[i++] = ((Object)0);
			form[i] = ((Object)0);
		} 
		if (count_p) {
			count_p = count;
		} 
		return form;
	}
	public Byte flickcurl_xpath_eval(Object xpathCtx, Object xpathExpr) {
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		byte value = ((Object)0);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		if (.xmlXPathNodeSetIsEmpty(nodes)) {
			;
		} 
		for (i = 0; i < .xmlXPathNodeSetGetLength(nodes); i++) {
			 node = nodes.getNodeTab()[i];
			if (node.getType() != XML_ATTRIBUTE_NODE && node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			if (node.getChildren()) {
				size_t len = .strlen((byte)node.getChildren().getContent());
				value = (byte).malloc(len + 1);
				.memcpy(value, node.getChildren().getContent(), len + 1);
			} 
			break;
		}
		return value;
	}
	public Byte flickcurl_xpath_eval_to_tree_string(Object xpathNodeCtx, Object xpathExpr, Object length_p) {
		 xpathObj = ((Object)0);
		 sd_node = new ();
		 buffer = ((Object)0);
		 save_ctxt = ((Object)0);
		byte value = ((Object)0);
		size_t value_len = 0;
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathNodeCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		if (.xmlXPathNodeSetIsEmpty(nodes)) {
			;
		} 
		sd_node = nodes.getNodeTab()[0];
		buffer = .xmlBufferCreate();
		if (!buffer) {
			;
		} 
		save_ctxt = .xmlSaveToBuffer(buffer, ((Object)0), /* encoding *//* opts */0);
		.xmlSaveTree(save_ctxt, sd_node);
		.xmlSaveFlush(save_ctxt);
		value_len = .xmlBufferLength(buffer);
		if (!value_len) {
			;
		} 
		value = (byte).malloc(value_len + 1);
		if (!value) {
			;
		} 
		.memcpy(value, .xmlBufferContent(buffer), value_len + 1);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		if (value && length_p) {
			length_p = value_len;
		} 
		return value/**
		 * flickcurl_set_write:
		 * @fc: flickcurl object
		 * @is_write: writeable flag
		 *
		 * Set writeable flag.
		 */;
	}
	public void flickcurl_set_write(int is_write) {
		this.setIs_write(is_write/**
		 * flickcurl_set_data:
		 * @fc: flickcurl object
		 * @data: data pointer
		 * @data_length: data length
		 *
		 * Set web service request content data.
		 */);
	}
	public void flickcurl_set_data(Object data, Object data_length) {
		Object generatedData = this.getData();
		int generatedData_is_xml = this.getData_is_xml();
		if (generatedData) {
			if (generatedData_is_xml) {
				.xmlFree(generatedData);
			} 
		} 
		this.setData(data);
		this.setData_length(data_length);
		this.setData_is_xml(0/**
		 * flickcurl_set_xml_data:
		 * @fc: flickcurl object
		 * @doc: XML dom
		 *
		 * Set web service request content data from XML DOM.
		 */);
	}
	public void flickcurl_set_xml_data(Object doc) {
		 mem = new ();
		int size;
		Object generatedData = this.getData();
		int generatedData_is_xml = this.getData_is_xml();
		if (generatedData) {
			if (generatedData_is_xml) {
				.xmlFree(generatedData);
			} 
		} 
		.xmlDocDumpFormatMemory(doc, mem, size, /* format 1 means indent */1);
		this.setData(mem);
		this.setData_length((size_t)size);
		this.setData_is_xml(1);
	}
	public Byte flickcurl_call_get_one_string_field(Object key, Object value, Object method, Object xpathExpr) {
		byte result = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		if (key && value) {
			fc.flickcurl_add_param(key, value);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare(method)) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			result = fc.flickcurl_xpath_eval(xpathCtx, xpathExpr);
		} 
		.xmlXPathFreeContext(xpathCtx);
	}
	public void flickcurl_set_curl_setopt_handler(Object curl_handler, Object curl_handler_data) {
		this.setCurl_setopt_handler(curl_handler);
		this.setCurl_setopt_handler_data(curl_handler_data);
	}
	public  flickcurl_build_groups(Object xpathCtx, Object xpathExpr, int group_count_p) {
		flickcurl_group groups = ((Object)0);
		int nodes_count;
		int group_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		groups = (flickcurl_group).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_group g = new flickcurl_group();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			g = (flickcurl_group).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "nsid") || !.strcmp(attr_name, "id")) {
					g.setNsid(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					g.setName(attr_value);
				}  else if (!.strcmp(attr_name, "lang")) {
					g.setLang(attr_value);
				}  else if (!.strcmp(attr_name, "is_admin")) {
					g.setIs_admin(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "is_moderator")) {
					g.setIs_moderator(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "is_member")) {
					g.setIs_member(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "privacy")) {
					g.setPrivacy(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					g.setPhotos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconserver")) {
					g.setIconserver(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "ispoolmoderated")) {
					g.setIs_pool_moderated(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconfarm")) {
					g.setIconfarm(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				byte value;
				size_t value_len = new size_t();
				if (chnode.getType() != XML_ELEMENT_NODE) {
					continue;
				} 
				if (!.strcmp(chnode_name, "throttle")) {
					for (attr = chnode.getProperties(); attr; attr = attr.getNext()) {
						size_t attr_len = .strlen((byte)attr.getChildren().getContent());
						byte attr_name = (byte)attr.getName();
						byte attr_value;
						attr_value = (byte).malloc(attr_len + 1);
						.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
						if (!.strcmp(attr_name, "count")) {
							g.setThrottle_count(.atoi(attr_value));
							.free(attr_value);
						}  else if (!.strcmp(attr_name, "mode")) {
							g.setThrottle_mode(attr_value);
						}  else if (!.strcmp(attr_name, "remaining")) {
							g.setThrottle_remaining(.atoi(attr_value));
							.free(attr_value);
						} else {
								.free(attr_value);
						} 
					}
					continue;
				} 
				if (!.strcmp(chnode_name, "restrictions")) {
					for (attr = chnode.getProperties(); attr; attr = attr.getNext()) {
						byte attr_name = (byte)attr.getName();
						byte attr_value = (byte)attr.getChildren().getContent();
						if (!.strcmp(attr_name, "photos_ok")) {
							g.setPhotos_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "videos_ok")) {
							g.setVideos_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "images_ok")) {
							g.setImages_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "screens_ok")) {
							g.setScreens_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "art_ok")) {
							g.setArt_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "safe_ok")) {
							g.setSafe_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "moderate_ok")) {
							g.setModerate_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "restricted_ok")) {
							g.setRestricted_ok(.atoi(attr_value));
						}  else if (!.strcmp(attr_name, "has_geo")) {
							g.setHas_geo(.atoi(attr_value));
						} 
					}
				} 
				if (!chnode.getChildren()) {
					continue;
				} 
				value_len = .strlen((byte)chnode.getChildren().getContent());
				value = (byte).malloc(value_len + 1);
				.memcpy(value, chnode.getChildren().getContent(), value_len + 1);
				if (!.strcmp(chnode_name, "name")) {
					g.setName(value);
				}  else if (!.strcmp(chnode_name, "description")) {
					g.setDescription(value);
				}  else if (!.strcmp(chnode_name, "members")) {
					g.setMembers(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "privacy")) {
					g.setPrivacy(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "rules")) {
					g.setRules(value);
				}  else if (!.strcmp(chnode_name, "pool_count")) {
					g.setPool_count(.atoi(value));
					.free(value);
				}  else if (!.strcmp(chnode_name, "topic_count")) {
					g.setTopic_count(.atoi(value));
					.free(value);
				} else {
						.free(value);
				} 
			}
			groups[group_count++] = g/* for nodes */;
		}
		if (group_count_p) {
			group_count_p = group_count;
		} 
		return groups;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.prefs-api.c - Flickr flickr.prefs.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_prefs_getContentType:
	 * @fc: flickcurl context
	 * 
	 * Returns the default content type preference for the user.
	 *
	 * Implements flickr.prefs.getContentType (1.3)
	 * 
	 * Return value: content type or <0 on failure
	 **/
	public int flickcurl_prefs_getContentType() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte content_type_str = ((Object)0);
		int content_type = -1;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.prefs.getContentType")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		content_type_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/person/@content_type");
		if (content_type_str) {
			content_type = .atoi(content_type_str);
			.free(content_type_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			content_type = -1;
		} 
		return content_type/**
		 * flickcurl_prefs_getGeoPerms:
		 * @fc: flickcurl context
		 * 
		 * Returns the default privacy level for geographic information attached to the user's photos. 
		 *
		 * Possible values are: 0: no default, 1: public, 2: contacts only, 3: friends
		 * and family only, 4: friends only, 5: family only, 6: private.
		 *
		 * Implements flickr.prefs.getGeoPerms (1.4)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_prefs_getGeoPerms() {
		byte v;
		int r = -1;
		v = fc.flickcurl_call_get_one_string_field(((Object)0), ((Object)0), "flickr.prefs.getGeoPerms", ()"/rsp/person/@geoperms");
		if (v) {
			r = .atoi(v);
			.free(v);
		} 
		return r/**
		 * flickcurl_prefs_getHidden:
		 * @fc: flickcurl context
		 * 
		 * Returns the default hidden preference for the user.
		 *
		 * Implements flickr.prefs.getHidden (1.3)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_prefs_getHidden() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte hidden_str = ((Object)0);
		int hidden = -1;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.prefs.getHidden")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		hidden_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/person/@hidden");
		if (hidden_str) {
			hidden = .atoi(hidden_str);
			.free(hidden_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			hidden = -1;
		} 
		return hidden/**
		 * flickcurl_prefs_getPrivacy:
		 * @fc: flickcurl context
		 * 
		 * Returns the default privacy level preference for the user.
		 * 
		 * Possible values are: Public (1), Friends only (2),  Family only (3)
		 * Friends and Family (4) and Private (5)
		 *
		 * Implements flickr.prefs.getPrivacy (1.3)
		 * 
		 * Return value: privacy level or <0 on failure
		 **/;
	}
	public int flickcurl_prefs_getPrivacy() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte privacy_level_str = ((Object)0);
		int privacy_level = -1;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.prefs.getPrivacy")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		privacy_level_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/person/@privacy");
		if (privacy_level_str) {
			privacy_level = .atoi(privacy_level_str);
			.free(privacy_level_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			privacy_level = -1;
		} 
		return privacy_level/**
		 * flickcurl_prefs_getSafetyLevel:
		 * @fc: flickcurl context
		 * 
		 * Returns the default safety level preference for the user.
		 *
		 * Implements flickr.prefs.getSafetyLevel (1.3)
		 * 
		 * Return value: safety level or <0 on failure
		 **/;
	}
	public int flickcurl_prefs_getSafetyLevel() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte safety_level_str = ((Object)0);
		int safety_level = -1;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.prefs.getSafetyLevel")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		safety_level_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/person/@safety_level");
		if (safety_level_str) {
			safety_level = .atoi(safety_level_str);
			.free(safety_level_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			safety_level = -1;
		} 
		return safety_level;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * groups-members-api.c - Flickr flickr.groups.members.* API calls
	 *
	 * Copyright (C) 2009-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_groups_members_getList:
	 * @fc: flickcurl context
	 * @group_id: Return a list of members for this group.  The group must be viewable by the Flickr member on whose behalf the API call is made.
	 * @membertypes: Comma separated list of member types:  2: member, 3: moderator 4: admin.  By default returns all types.  (Returning super rare member type "1: narwhal" isn't supported by this API method) (or NULL)
	 * @per_page: Number of members to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or < 0)
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or < 0)
	 * 
	 * Get a list of the members of a group.
	 *
	 * The call must be signed on behalf of a Flickr member, and the
	 * ability to see the group membership will be determined by the
	 * Flickr member's group privileges.
	 *
	 * Implements flickr.groups.members.getList (1.9)
	 * as announced as an experimental API on 2009-02-24:
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/4749
	 * 
	 * Return value: list of members or NULL on failure
	 **/
	public  flickcurl_groups_members_getList(Object group_id, Object membertypes, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_member members = ((Object)0);
		int members_count = 0;
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		fc.flickcurl_init_params(0);
		if (!group_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("group_id", group_id);
		if (membertypes) {
			fc.flickcurl_add_param("membertypes", membertypes);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_s, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_s);
		} 
		if (page >= 0) {
			.sprintf(page_s, "%d", page);
			fc.flickcurl_add_param("page", page_s);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.members.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		members = fc.flickcurl_build_members(xpathCtx, ()"/rsp/members/member", members_count);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (members) {
				members.flickcurl_free_members();
			} 
			members = ((Object)0);
		} 
		return members;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * favorites-api.c - Flickr flickr.favorites.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_favorites_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add to the user's favorites.
	 * 
	 * Adds a photo to a user's favorites list.
	 *
	 * Implements flickr.favorites.add (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_favorites_add(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.favorites.add")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		return generatedFailed;
	}
	public  flickcurl_favorites_getContext(Object photo_id, Object user_id, int num_prev, int num_next, Object extras) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photos_list photos_lists = ((Object)0);
		byte[] num_prev_str = new byte[10];
		byte[] num_next_str = new byte[10];
		int i;
		fc.flickcurl_init_params(0);
		if (!photo_id || !user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("user_id", user_id);
		if (num_prev >= 0) {
			.sprintf(num_prev_str, "%d", num_prev);
			fc.flickcurl_add_param("num_prev", num_prev_str);
		} 
		if (num_next >= 0) {
			.sprintf(num_next_str, "%d", num_next);
			fc.flickcurl_add_param("num_next", num_next_str/* this is the only standard photos response parameter supported 
			   * so using flickcurl_append_photos_list_params() is not really needed
			   */);
		} 
		if (extras) {
			fc.flickcurl_add_param("extras", extras);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.favorites.getContext")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		photos_lists = (flickcurl_photos_list).calloc(, /* 3 lists of photo lists: prev, next and NULL to end the list */3);
		Object generatedPhotos_count = photos_list.getPhotos_count();
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		for (i = 0; i < 2; /* Decode the prev and next into photo lists */i++) {
			 xpathExpr = (i == 0) ? ()"/rsp/prevphoto" : ()"/rsp/nextphoto";
			flickcurl_photos_list photos_list = new flickcurl_photos_list();
			 xpathObj = ((Object)0);
			xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
			if (!xpathObj) {
				fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
				this.setFailed(1);
				;
			} 
			if (!xpathObj.getNodesetval() || !xpathObj.getNodesetval().getNodeTab()) {
				.xmlXPathFreeObject(/* No elements found in content - probably not a failure */xpathObj);
				continue;
			} 
			photos_list = fc.flickcurl_new_photos_list();
			if (!photos_list) {
				this.setFailed(1);
				;
			} 
			photos_list.setPage(-1);
			photos_list.setPer_page(-1);
			photos_list.setTotal_count(-1);
			photos_list.setPhotos(flickcurl_photo_s.flickcurl_build_photos(fc, xpathCtx, xpathExpr, generatedPhotos_count));
			.xmlXPathFreeObject(xpathObj);
			photos_lists[i] = photos_list;
		}
		photos_lists[2] = ((Object)0);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (photos_lists) {
				.free(photos_lists);
			} 
			photos_lists = ((Object)0);
		} 
		return photos_lists/**
		 * flickcurl_favorites_getList_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch the favorites list for. If this argument is omitted, the favorites list for the calling user is returned. (or NULL)
		 * @min_fave_date: Minimum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_fave_date: Maximum date that a photo was favorited on. The date should be in the form of a unix timestamp. (or NULL)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of the user's favorite photos.
		 *
		 * Flickcurl 1.6: Added @list_params beyond flickcurl_favorites_getList()
		 * to allow returning raw content if @list_params is present and
		 * field @format is not NULL as announced 2008-08-25
		 * http://code.flickr.com/blog/2008/08/25/api-responses-as-feeds/
		 *
		 * Only photos which the calling user has permission to see are returned.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Parameters @min_fave_date and @max_fave_date were added some time
		 * after 2008.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_favorites_remove(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.favorites.remove")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		return generatedFailed;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-people-api.c - Flickr flickr.photos.people.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_people_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a person to.
	 * @user_id: The NSID of the user to add to the photo.
	 * @person_x: The left-most pixel co-ordinate of the box around the person. (or < 0)
	 * @person_y: The top-most pixel co-ordinate of the box around the person. (or < 0)
	 * @person_w: The width (in pixels) of the box around the person. (or < 0)
	 * @person_h: The height (in pixels) of the box around the person. (or < 0)
	 * 
	 * Add a person to a photo. Coordinates and sizes of boxes are optional; they are measured in pixels, based on the 500px image size shown on individual photo pages.
	 *
	 * Implements flickr.photos.people.add (1.17)
	 * 
	 * Announced 2010-01-21
	 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
	 *
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_photos_people_add(Object photo_id, Object user_id, int person_x, int person_y, int person_w, int person_h) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		byte[] person_x_str = new byte[10];
		byte[] person_y_str = new byte[10];
		byte[] person_w_str = new byte[10];
		byte[] person_h_str = new byte[10];
		fc.flickcurl_init_params(1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("user_id", user_id);
		if (person_x >= 0) {
			.sprintf(person_x_str, "%d", person_x);
			fc.flickcurl_add_param("person_x", person_x_str);
		} 
		if (person_y >= 0) {
			.sprintf(person_y_str, "%d", person_y);
			fc.flickcurl_add_param("person_y", person_y_str);
		} 
		if (person_w >= 0) {
			.sprintf(person_w_str, "%d", person_w);
			fc.flickcurl_add_param("person_w", person_w_str);
		} 
		if (person_h >= 0) {
			.sprintf(person_h_str, "%d", person_h);
			fc.flickcurl_add_param("person_h", person_h_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.people.add")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			rc = 1;
		} 
		return rc/**
		 * flickcurl_photos_people_delete:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to remove a person from.
		 * @user_id: The NSID of the person to remove from the photo.
		 * 
		 * Remove a person from a photo.
		 *
		 * Implements flickr.photos.people.delete (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_people_delete(Object photo_id, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("user_id", user_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.people.delete")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_people_deleteCoords:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit a person in.
		 * @user_id: The NSID of the person whose bounding box you want to remove.
		 * 
		 * Remove the bounding box from a person in a photo
		 *
		 * Implements flickr.photos.people.deleteCoords (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/));
	}
	public int flickcurl_photos_people_deleteCoords(Object photo_id, Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || !user_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("user_id", user_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.people.deleteCoords")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_people_editCoords:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit a person in.
		 * @user_id: The NSID of the person to edit in a photo.
		 * @person_x: The left-most pixel co-ordinate of the box around the person.
		 * @person_y: The top-most pixel co-ordinate of the box around the person.
		 * @person_w: The width (in pixels) of the box around the person.
		 * @person_h: The height (in pixels) of the box around the person.
		 * 
		 * Edit the bounding box of an existing person on a photo.
		 *
		 * Implements flickr.photos.people.editCoords (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: non-0 on failure
		 **/));
	}
	public int flickcurl_photos_people_editCoords(Object photo_id, Object user_id, int person_x, int person_y, int person_w, int person_h) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		byte[] person_x_str = new byte[10];
		byte[] person_y_str = new byte[10];
		byte[] person_w_str = new byte[10];
		byte[] person_h_str = new byte[10];
		fc.flickcurl_init_params(1);
		if (!photo_id || !user_id || person_x < 0 || person_y < 0 || person_w < 0 || person_h < 0) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("user_id", user_id);
		.sprintf(person_x_str, "%d", person_x);
		fc.flickcurl_add_param("person_x", person_x_str);
		.sprintf(person_y_str, "%d", person_y);
		fc.flickcurl_add_param("person_y", person_y_str);
		.sprintf(person_w_str, "%d", person_w);
		fc.flickcurl_add_param("person_w", person_w_str);
		.sprintf(person_h_str, "%d", person_h);
		fc.flickcurl_add_param("person_h", person_h_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.people.editCoords")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			rc = 1;
		} 
		return rc/**
		 * flickcurl_photos_people_getList:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get a list of people for.
		 * 
		 * Get a list of people in a given photo.
		 *
		 * Implements flickr.photos.people.getList (1.17)
		 * 
		 * Announced 2010-01-21
		 * http://code.flickr.com/blog/2010/01/21/people-in-photos-the-api-methods/
		 *
		 * Return value: list of persons or NULL on failure
		 **/;
	}
	public  flickcurl_photos_people_getList(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person people = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.people.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		people = fc.flickcurl_build_persons(xpathCtx, ()"/rsp/people/person", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (people) {
				people.flickcurl_free_persons();
			} 
			people = ((Object)0);
		} 
		return people;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * places-api.c - Flickr flickr.places.* API calls
	 *
	 * Places API announced 2008-01-11
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/3688
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_places_find:
	 * @fc: flickcurl context
	 * @query: The query string to use for place ID lookups
	 * 
	 * Return a list of place IDs for a query string.
	 *
	 * The flickr.places.find method is NOT a geocoder. It will round up
	 * to the nearest place type to which place IDs apply. For example,
	 * if you pass it a street level address it will return the city that
	 * contains the address rather than the street, or building, itself.
	 *
	 * This API announced 2008-01-18
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/3716
	 *
	 * Implements flickr.places.find (1.1)
	 * 
	 * Return value: array of places or NULL on failure
	 **/
	public  flickcurl_places_find(Object query) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!query) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("query", query);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.find")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_findByLatLon:
		 * @fc: flickcurl context
		 * @lat: The latitude whose valid range is -90 to 90. Anything more than 4 decimal places will be truncated.
		 * @lon: The longitude whose valid range is -180 to 180. Anything more than 4 decimal places will be truncated.
		 * @accuracy: Recorded accuracy level of the location information. World level is 1, Country is ~3, Region ~6, City ~11, Street ~16. Current range is 1-16. The default is 16.
		 * 
		 * Return a place ID for a latitude, longitude and accuracy triple.
		 *
		 * The flickr.places.findByLatLon method is not meant to be a
		 * (reverse) geocoder in the traditional sense. It is designed to
		 * allow users to find photos for "places" and will round up to the
		 * nearest place type to which corresponding place IDs apply.
		 *
		 * This API announced 2008-01-23
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/3735
		 *
		 * Implements flickr.places.findByLatLon (1.1)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_findByLatLon(double lat, double lon, int accuracy) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		byte[] lat_str = new byte[20];
		byte[] lon_str = new byte[20];
		byte[] accuracy_str = new byte[4];
		fc.flickcurl_init_params(0);
		if (accuracy < 0 || accuracy > 16) {
			accuracy = 16;
		} 
		.sprintf(lat_str, "%f", lat);
		fc.flickcurl_add_param("lat", lat_str);
		.sprintf(lon_str, "%f", lon);
		fc.flickcurl_add_param("lon", lon_str);
		.sprintf(accuracy_str, "%d", accuracy);
		fc.flickcurl_add_param("accuracy", accuracy_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.findByLatLon")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place = fc.flickcurl_build_place(xpathCtx, ()"/rsp/places/place");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place) {
				place.flickcurl_free_place();
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getChildrenWithPhotosPublic:
		 * @fc: flickcurl context
		 * @place_id: A Places ID. (While optional, you must pass either a valid Places ID or a WOE ID.) (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID. (While optional, you must pass either a valid Places ID or a WOE ID.) (or NULL)
		 * 
		 * Return a list of locations with public photos that are parented by a Where on Earth (WOE) or Places ID.
		 *
		 * Implements flickr.places.getChildrenWithPhotosPublic (1.7)
		 * 
		 * @deprecated: Replaced by flickcurl_places_getChildrenWithPhotosPublic2() with integer woe_id argument.
		 *
		 * Return value: array of places or NULL on failure
		 **/;
	}
	public  flickcurl_places_getChildrenWithPhotosPublic(Object place_id, Object woe_id) {
		int woe_id_i = -1;
		if (woe_id) {
			woe_id_i = .atoi(woe_id);
		} 
		return fc.flickcurl_places_getChildrenWithPhotosPublic2(place_id, woe_id_i/**
		 * flickcurl_places_getChildrenWithPhotosPublic2:
		 * @fc: flickcurl context
		 * @place_id: A Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Return a list of locations with public photos that are parented by a Where on Earth (WOE) or Places ID.
		 *
		 * You must pass either a valid Places ID or a WOE ID.
		 *
		 * Replaces flickcurl_places_getChildrenWithPhotosPublic() with integer @woe_id arg.
		 * 
		 * Return value: array of places or NULL on failure
		 **/);
	}
	public  flickcurl_places_getChildrenWithPhotosPublic2(Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] woe_id_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		}  else if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} else {
				return ((Object)0);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.getChildrenWithPhotosPublic")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_getInfo:
		 * @fc: flickcurl context
		 * @place_id: A Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID. (or NULL)
		 * 
		 * Get information about a place.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Implements flickr.places.getInfo (1.7)
		 * 
		 * Announced 2008-10-30
		 * http://code.flickr.com/blog/2008/10/30/the-shape-of-alpha/
		 * and in detail 2008-11-05
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4510
		 * 
		 * @deprecated: Replaced by flickcurl_places_getInfo2() with integer woe_id argument.
		 *
		 * Return value: new place object or NULL on failure
		 **/;
	}
	public  flickcurl_places_getInfo(Object place_id, Object woe_id) {
		int woe_id_i = -1;
		if (woe_id) {
			woe_id_i = .atoi(woe_id);
		} 
		return fc.flickcurl_places_getInfo2(place_id, woe_id_i/**
		 * flickcurl_places_getInfo2:
		 * @fc: flickcurl context
		 * @place_id: A Places ID. (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Get information about a place.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Replaces flickcurl_places_getInfo() with integer woe_id argument.
		 *
		 * Return value: new place object or NULL on failure
		 **/);
	}
	public  flickcurl_places_getInfo2(Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		byte[] woe_id_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		}  else if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} else {
				return ((Object)0);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare_noauth("flickr.places.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place = fc.flickcurl_build_place(xpathCtx, ()"/rsp/place");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place) {
				place.flickcurl_free_place();
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getInfoByUrl:
		 * @fc: flickcurl context
		 * @url: A flickr.com/places URL in the form of /country/region/city. For example: /Canada/Quebec/Montreal
		 * 
		 * Lookup information about a place, by its flickr.com/places URL.
		 *
		 * Implements flickr.places.getInfoByUrl (1.7)
		 *
		 * Announced 2008-10-30
		 * http://code.flickr.com/blog/2008/10/30/the-shape-of-alpha/
		 * and in detail 2008-11-05
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4510
		 * 
		 * Return value: new place object or NULL on failure
		 **/;
	}
	public  flickcurl_places_getInfoByUrl(Object url) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!url) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("url", url);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.getInfoByUrl")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place = fc.flickcurl_build_place(xpathCtx, ()"/rsp/place");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place) {
				place.flickcurl_free_place();
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_getPlaceTypes:
		 * @fc: flickcurl context
		 * 
		 * Get a list of available place types
		 *
		 * Implements flickr.places.getPlaceTypes (1.8)
		 * 
		 * Return value: array of #flickcurl_place_type_info or NULL on failure
		 **/;
	}
	public  flickcurl_places_getPlaceTypes() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place_type_info place_types = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.getPlaceTypes")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place_types = fc.flickcurl_build_place_types(xpathCtx, ()"/rsp/place_types/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place_types) {
				place_types.flickcurl_free_place_type_infos();
			} 
			place_types = ((Object)0);
		} 
		return place_types/**
		 * flickcurl_places_getShapeHistory:
		 * @fc: flickcurl context
		 * @place_id: A Flickr Places ID (or NULL)
		 * @woe_id: A Where On Earth (WOE) ID (or <0)
		 * 
		 * Return an historical list of all the shape data generated for a
		 * Places or Where on Earth (WOE) ID.
		 *
		 * While optional, you must pass either a valid Places ID or a WOE ID.
		 *
		 * Implements flickr.places.getShapeHistory (1.8)
		 * 
		 * Announced 2009-01-12 in
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4669
		 * 
		 * Addition of donut holes announced 2009-05-06
		 * http://code.flickr.com/blog/2009/05/06/the-absence-and-the-anchor/
		 *
		 * Return value: NULL on failure
		 **/;
	}
	public  flickcurl_places_getTopPlacesList( place_type, Object date, int woe_id, Object place_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] woe_id_str = new byte[10];
		int place_type_id;
		byte[] place_type_id_str = new byte[3];
		fc.flickcurl_init_params(0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0);
		} 
		.sprintf(place_type_id_str, "%d", place_type_id);
		fc.flickcurl_add_param("place_type_id", place_type_id_str);
		if (date) {
			fc.flickcurl_add_param("date", date);
		} 
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		}  else if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.getTopPlacesList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForBoundingBox:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by
		 * @minimum_longitude: Bound Box bottom-left corner longitude
		 * @minimum_latitude: Bound Box bottom-left corner latitude
		 * @maximum_longitude: Bound Box top-right corner longitude
		 * @maximum_latitude: Bound Box top-right corner latitude
		 * 
		 * Return all the locations of a matching place type for a bounding box.
		 *
		 * The maximum allowable size of a bounding box (the distance between
		 * the SW and NE corners) is governed by the place type you are
		 * requesting. Allowable sizes are as follows:
		 * neighbourhood: 3km (1.8mi), locality: 7km (4.3mi), county: 50km (31mi),
		 * region: 200km (124mi), country: 500km (310mi), continent: 1500km (932mi)
		 *
		 * Implements flickr.places.placesForBoundingBox (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_placesForBoundingBox( place_type, double minimum_longitude, double minimum_latitude, double maximum_longitude, double maximum_latitude) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id = -1;
		byte[] bbox = new byte[255];
		fc.flickcurl_init_params(0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0);
		} 
		.sprintf(bbox, "%f,%f,%f,%f", minimum_longitude, minimum_latitude, maximum_longitude, maximum_latitude);
		fc.flickcurl_add_param("bbox", bbox/* deliberately not using deprecated parameter place_type *//*
		  flickcurl_add_param(fc, "place_type", place_type);
		*/);
		.sprintf(place_type_id_str, "%d", place_type_id);
		fc.flickcurl_add_param("place_type_id", place_type_id_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.placesForBoundingBox")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForContacts:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.
		 * @woe_id: A Where on Earth ID to use to filter photo clusters (or NULL)
		 * @place_id: A Places ID to use to filter photo clusters (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used.
		 * @contacts: Search your contacts. Either 'all' or 'ff' for just friends and family. (Default is 'all') (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned (or <0)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned (or <0)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned (or <0)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given
		 * placetype for a user's contacts.
		 *
		 * One of @woe_id or @place_id must be given.
		 *
		 * Implements flickr.places.placesForContacts (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_placesForContacts( place_type, int woe_id, Object place_id, int threshold, Object contacts, int min_upload_date, int max_upload_date, int min_taken_date, int max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id;
		byte[] min_upload_date_s = new byte[20];
		byte[] max_upload_date_s = new byte[20];
		byte[] min_taken_date_s = new byte[20];
		byte[] max_taken_date_s = new byte[20];
		byte[] woe_id_str = new byte[10];
		byte[] threshold_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!woe_id && !place_id) {
			return ((Object)0);
		} 
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return ((Object)0/* deliberately not using deprecated parameter place_type */);
		} 
		.sprintf(place_type_id_str, "%d", /*  
		  flickcurl_add_param(fc, "place_type", place_type);
		*/place_type_id);
		fc.flickcurl_add_param("place_type_id", place_type_id_str);
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} 
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		} 
		.sprintf(threshold_str, "%d", threshold);
		fc.flickcurl_add_param("threshold", threshold_str);
		if (contacts) {
			fc.flickcurl_add_param("contacts", contacts);
		} 
		if (min_upload_date >= 0) {
			.sprintf(min_upload_date_s, "%d", min_upload_date);
			fc.flickcurl_add_param("min_upload_date", min_upload_date_s);
		} 
		if (max_upload_date >= 0) {
			.sprintf(max_upload_date_s, "%d", max_upload_date);
			fc.flickcurl_add_param("max_upload_date", max_upload_date_s);
		} 
		if (min_taken_date >= 0) {
			.sprintf(min_taken_date_s, "%d", min_taken_date);
			fc.flickcurl_add_param("min_taken_date", min_taken_date_s);
		} 
		if (max_taken_date >= 0) {
			.sprintf(max_taken_date_s, "%d", max_taken_date);
			fc.flickcurl_add_param("max_taken_date", max_taken_date_s);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.placesForContacts")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_placesForTags:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by
		 * @woe_id: A Where on Earth ID to use to filter photo clusters (or NULL)
		 * @place_id: A Places ID to use to filter photo clusters (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used.
		 * @tags: A comma-delimited list of tags. Photos with one or more of the tags listed will be returned. (or NULL)
		 * @tag_mode: Either 'any' for an OR combination of tags, or 'all' for an AND combination. Defaults to 'any' if not specified. (or NULL)
		 * @machine_tags: Multiple machine tags may be queried by passing a comma-separated list. The number of machine tags you can pass in a single query depends on the tag mode (AND or OR) that you are querying with. "AND" queries are limited to (16) machine tags. "OR" queries are limited to (8). See below. (or NULL)
		 * @machine_tag_mode: Either 'any' for an OR combination of tags, or 'all' for an AND combination. Defaults to 'any' if not specified. (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned (or NULL)
		 * 
		 * Return a list of the top 100 unique places clustered by a given
		 * placetype for set of tags or machine tags.
		 *
		 * Machine tags extra information.  Aside from passing in a fully
		 * formed machine tag, there is a special syntax for searching on
		 * specific properties :
		 *
		 * <itemizedlist>
		 *   <listitem>Find photos using the 'dc' namespace : <literal>"machine_tags" => "dc:"</literal></listitem>
		 *   <listitem> Find photos with a title in the 'dc' namespace : <literal>"machine_tags" => "dc:title = "</literal></listitem>
		 *   <listitem>Find photos titled "mr. camera" in the 'dc' namespace : <literal>"machine_tags" => "dc:title = \"mr. camera\"</literal></listitem>
		 *   <listitem>Find photos whose value is "mr. camera" : <literal>"machine_tags" => "*:* = \"mr. camera\""</literal></listitem>
		 *   <listitem>Find photos that have a title, in any namespace : <literal>"machine_tags" => "*:title = "</literal></listitem>
		 *   <listitem>Find photos that have a title, in any namespace, whose value is "mr. camera" : <literal>"machine_tags" => "*:title = \"mr. camera\""</literal></listitem>
		 *   <listitem>Find photos, in the 'dc' namespace whose value is "mr. camera" : <literal>"machine_tags" => "dc:* = \"mr. camera\""</literal></listitem>
		 *  </itemizedlist>
		 * 
		 * Implements flickr.places.placesForTags (1.8)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_places_placesForTags( place_type, int woe_id, Object place_id, Object threshold, Object tags, Object tag_mode, Object machine_tags, Object machine_tag_mode, Object min_upload_date, Object max_upload_date, Object min_taken_date, Object max_taken_date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		byte[] place_type_id_str = new byte[3];
		int place_type_id;
		byte[] woe_id_str = new byte[10];
		fc.flickcurl_init_params(0);
		place_type_id = ModernizedCProgram.flickcurl_place_type_to_id(place_type);
		if (place_type_id < 0) {
			return 1;
		} 
		.sprintf(place_type_id_str, "%d", place_type_id);
		fc.flickcurl_add_param("place_type_id", place_type_id_str);
		.sprintf(woe_id_str, "%d", woe_id);
		fc.flickcurl_add_param("woe_id", woe_id_str);
		fc.flickcurl_add_param("place_id", place_id);
		fc.flickcurl_add_param("threshold", threshold);
		fc.flickcurl_add_param("tags", tags);
		fc.flickcurl_add_param("tag_mode", tag_mode);
		fc.flickcurl_add_param("machine_tags", machine_tags);
		fc.flickcurl_add_param("machine_tag_mode", machine_tag_mode);
		fc.flickcurl_add_param("min_upload_date", min_upload_date);
		fc.flickcurl_add_param("max_upload_date", max_upload_date);
		fc.flickcurl_add_param("min_taken_date", min_taken_date);
		fc.flickcurl_add_param("max_taken_date", max_taken_date);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.placesForTags")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_places_resolvePlaceId:
		 * @fc: flickcurl context
		 * @place_id: A Places ID
		 * 
		 * Find places information by Place ID
		 *
		 * Implements flickr.places.resolvePlaceId (1.0)
		 * 
		 * Return value: new place object or NULL on failure
		 **/));
	}
	public  flickcurl_places_resolvePlaceId(Object place_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!place_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("place_id", place_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare_noauth("flickr.places.resolvePlaceId")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place = fc.flickcurl_build_place(xpathCtx, ()"/rsp/location");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place) {
				place.flickcurl_free_place();
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_resolvePlaceURL:
		 * @fc: flickcurl context
		 * @url: A Places URL.  Place URLs are of the form /country/region/city
		 * 
		 * Find Places information by Place URL
		 *
		 * Implements flickr.places.resolvePlaceURL (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_resolvePlaceURL(Object url) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place place = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!url) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("url", url);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare_noauth("flickr.places.resolvePlaceURL")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		place = fc.flickcurl_build_place(xpathCtx, ()"/rsp/location");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (place) {
				place.flickcurl_free_place();
			} 
			place = ((Object)0);
		} 
		return place/**
		 * flickcurl_places_placesForUser:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.  Valid places types are neighbourhood, locality, region or country
		 * @woe_id: A Where on Earth ID to use to filter photo clusters. (or <0)
		 * @place_id: A Places ID to use to filter photo clusters. (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used. (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given place type for a user.
		 *
		 * This API added 2008-09-04 as announced in
		 * http://code.flickr.com/blog/2008/09/04/whos-on-first/
		 *
		 * Implements flickr.places.placesForUser (1.6)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_placesForUser( place_type, int woe_id, Object place_id, int threshold) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_place places = ((Object)0);
		byte place_type_str;
		byte[] woe_id_str = new byte[20];
		byte[] threshold_str = new byte[4];
		fc.flickcurl_init_params(0);
		place_type_str = ModernizedCProgram.flickcurl_get_place_type_label(place_type);
		if (!place_type_str) {
			fc.flickcurl_error("Invalid place type %d", place_type);
			return ((Object)0);
		} 
		if (place_type != .FLICKCURL_PLACE_NEIGHBOURHOOD && place_type != .FLICKCURL_PLACE_LOCALITY && place_type != .FLICKCURL_PLACE_REGION && place_type != .FLICKCURL_PLACE_COUNTRY) {
			fc.flickcurl_error("Place type '%s' (%d) is not valid for places.forUser", place_type_str, place_type);
			return ((Object)0);
		} 
		fc.flickcurl_add_param("place_type", place_type_str);
		if (woe_id >= 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} 
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		} 
		if (threshold >= 0) {
			.sprintf(threshold_str, "%d", threshold);
			fc.flickcurl_add_param("threshold", threshold_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.placesForUser")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		places = fc.flickcurl_build_places(xpathCtx, ()"/rsp/places/place", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places/**
		 * flickcurl_places_forUser:
		 * @fc: flickcurl context
		 * @place_type: A specific place type to cluster photos by.  Valid places types are neighbourhood, locality, region or country
		 * @woe_id: A Where on Earth ID to use to filter photo clusters. (or <0)
		 * @place_id: A Places ID to use to filter photo clusters. (or NULL)
		 * @threshold: The minimum number of photos that a place type must have to be included. If the number of photos is lowered then the parent place type for that place will be used. (or <0)
		 * 
		 * Return a list of the top 100 unique places clustered by a given place type for a user.
		 *
		 * @deprecated: Use flickcurl_places_placesForUser()
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_places_forUser( place_type, int woe_id, Object place_id, int threshold) {
		return fc.flickcurl_places_placesForUser(place_type, woe_id, place_id, threshold/**
		 * flickcurl_places_tagsForPlace:
		 * @fc: flickcurl context
		 * @woe_id: A Where on Earth identifier to use to filter photo clusters (or <0)
		 * @place_id: A Flickr Places identifier to use to filter photo clusters (or NULL)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * 
		 * Return a list of the top 100 unique tags for a Flickr Places or
		 * Where on Earth (WOE) ID
		 *
		 * (While optional, you must pass either a valid Places ID or a WOE ID.)
		*
		 * Implements flickr.places.tagsForPlace (1.8)
		 * 
		 * Return value: NULL on failure
		 **/);
	}
	public  flickcurl_photos_upload(Object photo_file, Object title, Object description, Object tags, int is_public, int is_friend, int is_family) {
		flickcurl_upload_params params = new flickcurl_upload_params();
		.memset(params, (byte)'\0', );
		params.setPhoto_file(photo_file);
		params.setTitle(title);
		params.setDescription(description);
		params.setTags(tags);
		params.setIs_public(is_public);
		params.setIs_friend(is_friend);
		params.setIs_family(is_family);
		params.setSafety_level(-1);
		params.setContent_type(-1);
		params.setHidden(-1);
		return ModernizedCProgram.flickcurl_photos_upload_params(fc, params/**
		 * flickcurl_photos_replace:
		 * @fc: flickcurl context
		 * @photo_file: photo filename
		 * @photo_id: photo ID to replace
		 * @async: upload asynchronously boolean (non-0 true)
		 * 
		 * Replace a photo with a new file.
		 *
		 * Implements Replacing Photos (0.10)
		 * Implements Asynchronous Uploading (0.10)
		 * 
		 * Return value: #flickcurl_upload_status or NULL on failure
		 **/);
	}
	public  flickcurl_photos_replace(Object photo_file, Object photo_id, int async) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		byte[] async_s = new byte[2];
		fc.flickcurl_init_params(1);
		if (!photo_file || !photo_id) {
			return ((Object)0);
		} 
		if (._access((byte)photo_file, 4)) {
			fc.flickcurl_error("Photo file %s cannot be read: %s", photo_file, .strerror((._errno())));
			return ((Object)0);
		} 
		async_s[0] = async ? (byte)'1' : (byte)'0';
		async_s[1] = (byte)'\0';
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("async", async_s);
		fc.flickcurl_end_params();
		Byte generatedReplace_service_uri = this.getReplace_service_uri();
		if (fc.flickcurl_prepare_upload(generatedReplace_service_uri, "photo", photo_file)) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		status = (flickcurl_upload_status).calloc(1, );
		status.setSecret(fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/photoid/@secret"));
		status.setOriginalsecret(fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/photoid/@originalsecret"));
		status.setTicketid(fc.flickcurl_xpath_eval(/* when async is true */xpathCtx, ()"/rsp/ticketid"));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (status) {
				.free(status);
			} 
			status = ((Object)0);
		} 
		return status/**
		 * flickcurl_free_upload_status:
		 * @status: status object
		 * 
		 * Destructor - free a #flickcurl_upload_status
		 **/;
	}
	public  flickcurl_build_tickets(Object xpathCtx, Object xpathExpr, int ticket_count_p) {
		flickcurl_ticket tickets = ((Object)0);
		int nodes_count;
		int ticket_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max ticket - it can include nodes that are CDATA */nodes);
		tickets = (flickcurl_ticket).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_ticket t = new flickcurl_ticket();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			t = (flickcurl_ticket).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					t.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "complete")) {
					t.setComplete(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photoid")) {
					t.setPhotoid(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "invalid")) {
					t.setInvalid(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			tickets[ticket_count++] = t/* for nodes */;
		}
		if (ticket_count_p) {
			ticket_count_p = ticket_count;
		} 
		return tickets;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.panda-api.c - Flickr flickr.panda.* API calls
	 *
	 * Copyright (C) 2009-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	public Byte flickcurl_build_pandas(Object xpathCtx, Object xpathExpr, int panda_count_p) {
		byte pandas = ((Object)0);
		int nodes_count;
		int panda_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		pandas = (byte).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			byte panda = ((Object)0);
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					panda = (byte).malloc(len + 1);
					.memcpy(panda, chnode.getContent(), len + 1);
					break;
				} 
			}
			if (panda) {
				pandas[panda_count++] = panda;
			} 
		}
		if (/* for nodes */panda_count_p) {
			panda_count_p = panda_count;
		} 
		return pandas/**
		 * flickcurl_panda_getList:
		 * @fc: flickcurl context
		 * 
		 * Get the current list of Flickr Pandas
		 *
		 * Can be used with flickcurl_panda_getPhotos() to get photos for the
		 * given <ulink url="https://www.flickr.com/explore/panda">Flickr Panda</ulink>
		 *
		 * Announced 2009-03-03
		 * http://code.flickr.com/blog/2009/03/03/panda-tuesday-the-history-of-the-panda-new-apis-explore-and-you/
		 *
		 * Implements flickr.panda.getList (1.9)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public Byte flickcurl_panda_getList() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte pandas = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.panda.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		pandas = fc.flickcurl_build_pandas(xpathCtx, ()"/rsp/pandas/panda", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (pandas) {
				.free(pandas);
			} 
			pandas = ((Object)0);
		} 
		return pandas/**
		 * flickcurl_panda_getPhotos:
		 * @fc: flickcurl context
		 * @panda_name: The name of the panda to ask for photos from.
		 * 
		 * Ask the Flickr Pandas for a list of recent public (and "safe") photos.
		 *
		 * Use flickcurl_panda_getList() to get the list of
		 * <ulink url="https://www.flickr.com/explore/panda">Flickr Pandas</ulink>
		 *
		 * Announced 2009-03-03
		 * http://code.flickr.com/blog/2009/03/03/panda-tuesday-the-history-of-the-panda-new-apis-explore-and-you/
		 *
		 * Only "supports the following extras: ownername, license,
		 * date_upload, date_taken, tags, machine_tags, views, media" -
		 * Sergey M., Flickr staff 2011-09-16
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/7203
		 *
		 * Implements flickr.panda.getPhotos (1.9)
		 * 
		 * Return value: photos array or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * people-api.c - Flickr flickr.people.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_people_findByEmail:
	 * @fc: flickcurl context
	 * @email: user email address
	 * 
	 * Get a user's NSID, given their email address
	 *
	 * Implements flickr.people.findByEmail (0.8)
	 * 
	 * Return value: NSID or NULL on failure
	 **/
	public Byte flickcurl_people_findByEmail(Object email) {
		return fc.flickcurl_call_get_one_string_field("find_email", email, "flickr.people.findByEmail", ()"/rsp/user/@nsid"/**
		 * flickcurl_people_findByUsername:
		 * @fc: flickcurl context
		 * @username: username
		 * 
		 * Get a user's NSID, given their username address
		 *
		 * Implements flickr.people.findByUsername (0.8)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public Byte flickcurl_people_findByUsername(Object username) {
		return fc.flickcurl_call_get_one_string_field("username", username, "flickr.people.findByUsername", ()"/rsp/user/@nsid"/**
		 * flickcurl_people_getGroups:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch groups for.
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: privacy, throttle, restrictions (or NULL)
		 * 
		 * Returns the list of groups a user is a member of.
		 *
		 * Implements flickr.people.getGroups (1.25)
		 * 
		 * Return value: list of groups or NULL on failure
		 **/);
	}
	public  flickcurl_people_getGroups(Object user_id, Object extras) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", user_id);
		if (extras) {
			fc.flickcurl_add_param("extras", extras);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getGroups")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		groups = fc.flickcurl_build_groups(xpathCtx, ()"/rsp/groups/group", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (groups) {
				groups.flickcurl_free_groups();
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_people_getInfo:
		 * @fc: flickcurl context
		 * @user_id: user NSID
		 * 
		 * Get information about a person
		 *
		 * Implements flickr.people.getInfo (0.6)
		 *
		 * NSID can be found by flickcurl_people_findByEmail() or
		 * flickcurl_people_findByUsername().
		 * 
		 * Return value: #flickcurl_person object or NULL on failure
		 **/;
	}
	public  flickcurl_people_getInfo(Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person person = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("user_id", user_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		person = fc.flickcurl_build_person(xpathCtx, ()"/rsp/person");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (person) {
				person.flickcurl_free_person();
			} 
			person = ((Object)0);
		} 
		return person/**
		 * flickcurl_people_getPublicGroups:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to fetch groups for.
		 * 
		 * Returns the list of public groups a user is a member of.
		 *
		 * Implements flickr.people.getPublicGroups (0.13)
		 * 
		 * Return value: list of groups or NULL on failure
		 **/;
	}
	public  flickcurl_people_getPublicGroups(Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", user_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getPublicGroups")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		groups = fc.flickcurl_build_groups(xpathCtx, ()"/rsp/groups/group", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (groups) {
				groups.flickcurl_free_groups();
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_people_getPublicPhotos_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get a list of public photos for the given user.
		 *
		 * Currently supported extras fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: list of people public photos or NULL on failure
		 **/;
	}
	public  flickcurl_people_getUploadStatus() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_user_upload_status status = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.people.getUploadStatus")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		status = fc.flickcurl_build_user_upload_status(xpathCtx, ()"/rsp/user/*");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (status) {
				status.flickcurl_free_user_upload_status();
			} 
			status = ((Object)0);
		} 
		return status/**
		 * flickcurl_people_getPhotos_params:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user who's photos to return. A value of "me" will return the calling user's photos.
		 * @safe_search: Safe search setting: 1 for safe, 2 for moderate, 3 for restricted. (Please note: Un-authed calls can only see Safe content.) (or < 0)
		 * @min_upload_date: Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @max_upload_date: Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date should be in the form of a unix timestamp. (or NULL)
		 * @min_taken_date: Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @max_taken_date: Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date should be in the form of a mysql datetime. (or NULL)
		 * @content_type: Content Type setting: 1 for photos only, 2 for screenshots only, 3 for 'other' only, 4 for photos and screenshots, 5 for screenshots and 'other', 6 for photos and 'other', 7 for photos, screenshots, and 'other' (all) (or < 0)
		 * @privacy_filter: Return photos only matching a certain privacy level. This only applies when making an authenticated call to view photos you own. Valid values are: 1 public photos, 2 private photos visible to friends, 3 private photos visible to family, 4 private photos visible to friends & family, 5 completely private photos (or < 0)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get photos from the given user's photostream.
		 *
		 * Only photos visible to the calling user will be returned. This
		 * method must be authenticated; to return public photos for a user,
		 * use flickcurl_people_getPublicPhotos().
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_build_persons(Object xpathCtx, Object xpathExpr, int person_count_p) {
		flickcurl_person persons = ((Object)0);
		int nodes_count;
		int person_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		[] full_xpath = new ();
		size_t xpathExpr_len = new size_t();
		int i;
		xpathExpr_len = .strlen((byte)xpathExpr);
		.memcpy(full_xpath, xpathExpr, xpathExpr_len + 1);
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		persons = (flickcurl_person).calloc(, nodes_count + 1);
		Object generatedFields = person.getFields();
		int generatedFailed = this.getFailed();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			flickcurl_person person = ((Object)0);
			int expri;
			 xpathNodeCtx = ((Object)0);
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			person = (flickcurl_person).calloc(, 1);
			xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
			xpathNodeCtx.setNode(node);
			for (expri = 0; expri <= .PERSON_FIELD_LAST; expri++) {
				if (generatedFields[expri].getString()) {
					.free(generatedFields[expri].getString());
				} 
				generatedFields[expri].setString(((Object)0));
				generatedFields[expri].setInteger((flickcurl_person_field_type)-1);
				generatedFields[expri].setType(.VALUE_TYPE_NONE);
			}
			for (expri = 0; person_fields_table[expri].getXpath(); expri++) {
				flickcurl_person_field_type field = person_fields_table[expri].getField();
				flickcurl_field_value_type datatype = person_fields_table[expri].getType();
				byte string_value;
				int int_value = -1;
				time_t unix_time = new time_t();
				string_value = fc.flickcurl_xpath_eval(xpathNodeCtx, person_fields_table[expri].getXpath());
				if (!string_value) {
					continue;
				} 
				switch (datatype) {
				case .VALUE_TYPE_UNIXTIME:
				case .VALUE_TYPE_STRING:
				case .VALUE_TYPE_NONE:
				case .VALUE_TYPE_BOOLEAN:
						int_value = .atoi(string_value);
						break;
				case .VALUE_TYPE_URI:
						break;
				case .VALUE_TYPE_TAG_STRING:
				case .VALUE_TYPE_PERSON_ID:
						person.setNsid(string_value);
						string_value = ((Object)0);
						datatype = .VALUE_TYPE_NONE;
						break;
				case .VALUE_TYPE_INTEGER:
				case .VALUE_TYPE_PHOTO_URI:
				case .VALUE_TYPE_COLLECTION_ID:
				case .VALUE_TYPE_PHOTO_ID:
				case .VALUE_TYPE_DATETIME:
						if (datatype == .VALUE_TYPE_UNIXTIME) {
							unix_time = .atoi(string_value);
						} else {
								unix_time = .curl_getdate((byte)string_value, ((Object)0));
						} 
						if (unix_time >= 0) {
							byte new_value = ModernizedCProgram.flickcurl_unixtime_to_isotime(unix_time);
							.free(string_value);
							string_value = new_value;
							int_value = (int)unix_time;
							datatype = .VALUE_TYPE_DATETIME;
						} else {
								datatype = /* failed to convert, make it a string */.VALUE_TYPE_STRING;
						} 
						break;
				case .VALUE_TYPE_MEDIA_TYPE:
				case .VALUE_TYPE_FLOAT:
				case .VALUE_TYPE_ICON_PHOTOS:
						.abort();
				}
				generatedFields[field].setString(string_value);
				generatedFields[field].setInteger((flickcurl_person_field_type)int_value);
				generatedFields[field].setType(datatype);
				if (generatedFailed) {
					break;
				} 
			}
			if (generatedFailed) {
				if (person) {
					person.flickcurl_free_person();
				} 
			} else {
					persons[person_count++] = person;
			} 
			.xmlXPathFreeContext(xpathNodeCtx);
			if (generatedFailed) {
				;
			} 
		}
		if (/* for persons */person_count_p) {
			person_count_p = person_count;
		} 
		if (generatedFailed) {
			if (persons) {
				persons.flickcurl_free_persons();
			} 
			persons = ((Object)0);
		} 
		return persons;
	}
	public  flickcurl_build_person(Object xpathCtx, Object root_xpathExpr) {
		flickcurl_person persons = new flickcurl_person();
		flickcurl_person result = ((Object)0);
		persons = fc.flickcurl_build_persons(xpathCtx, root_xpathExpr, ((Object)0));
		if (persons) {
			result = persons[0];
			.free(persons);
		} 
		return result/**
		 * flickcurl_free_persons:
		 * @persons: person object array
		 *
		 * Destructor for array of person object
		 */;
	}
	public  flickcurl_build_stats(Object xpathCtx, Object xpathExpr, int stat_count_p) {
		flickcurl_stat stats = ((Object)0);
		int nodes_count;
		int stat_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		stats = (flickcurl_stat).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_stat s = new flickcurl_stat();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			s = (flickcurl_stat).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "views")) {
					s.setViews(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "comments")) {
					s.setComments(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "favorites")) {
					s.setFavorites(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					s.setName(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					s.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "searchterms")) {
					s.setSearchterms(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			stats[stat_count++] = s/* for nodes */;
		}
		if (stat_count_p) {
			stat_count_p = stat_count;
		} 
		return stats;
	}
	public  flickcurl_build_tag_namespaces(Object xpathCtx, Object xpathExpr, int namespace_count_p) {
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		int nodes_count;
		int tag_namespace_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do namespaces */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tag_namespaces = (flickcurl_tag_namespace).calloc(, nodes_count + 1);
		Object generatedName = tn.getName();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_tag_namespace tn = new flickcurl_tag_namespace();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			tn = (flickcurl_tag_namespace).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, (byte)attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "usage")) {
					tn.setUsage_count(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "predicates")) {
					tn.setPredicates_count(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					tn.setName((byte).malloc(len + 1));
					.memcpy(generatedName, chnode.getContent(), len + 1);
				} 
			}
			tag_namespaces[tag_namespace_count++] = tn/* for nodes */;
		}
		if (namespace_count_p) {
			namespace_count_p = tag_namespace_count;
		} 
		return tag_namespaces;
	}
	public  flickcurl_build_tag_namespace(Object xpathCtx, Object root_xpathExpr) {
		flickcurl_tag_namespace tag_namespaces = new flickcurl_tag_namespace();
		flickcurl_tag_namespace result = ((Object)0);
		tag_namespaces = fc.flickcurl_build_tag_namespaces(xpathCtx, root_xpathExpr, ((Object)0));
		if (tag_namespaces) {
			int i;
			result = tag_namespaces[0];
			for (i = 1; tag_namespaces[i]; i++) {
				tag_namespaces[i].flickcurl_free_tag_namespace();
			}
			.free(tag_namespaces);
		} 
		return result/**
		 * flickcurl_free_tag_namespaces:
		 * @tag_nspaces: namespace object array
		 *
		 * Destructor for array of namespace object
		 */;
	}
	public  flickcurl_build_tag_predicate_values(Object xpathCtx, Object xpathExpr, int content_mode, int predicate_value_count_p) {
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		int nodes_count;
		int tag_predicate_value_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do predicate_values */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tag_pvs = (flickcurl_tag_predicate_value).calloc(, nodes_count + 1);
		Object generatedPredicate = tpv.getPredicate();
		Object generatedValue = tpv.getValue();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_tag_predicate_value tpv = new flickcurl_tag_predicate_value();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			tpv = (flickcurl_tag_predicate_value).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "usage")) {
					tpv.setUsage_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "namespaces")) {
					tpv.setUsed_in_namespace_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "predicate")) {
					tpv.setPredicate(attr_value);
				}  else if (!.strcmp(attr_name, "value")) {
					tpv.setValue(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			if (content_mode >= 1 && content_mode <= 2) {
				for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
					if (chnode.getType() == XML_TEXT_NODE) {
						size_t len = .strlen((byte)chnode.getContent());
						byte ptr = (content_mode == 1) ? generatedPredicate : generatedValue;
						ptr = (byte).malloc(len + 1);
						.memcpy(ptr, chnode.getContent(), len + 1);
					} 
				}
			} 
			tag_pvs[tag_predicate_value_count++] = tpv/* for nodes */;
		}
		if (predicate_value_count_p) {
			predicate_value_count_p = tag_predicate_value_count;
		} 
		return tag_pvs/**
		 * flickcurl_free_tag_predicate_values:
		 * @tag_pvs: predicate_value object array
		 *
		 * Destructor for array of predicate_value object
		 */;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * urls-api.c - Flickr flickr.urls.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_urls_getGroup:
	 * @fc: flickcurl context
	 * @group_id: group ID
	 *
	 * Get the url to a group's page.
	 *
	 * Implements flickr.urls.getGroup (0.9)
	 * 
	 * Return value: NSID or NULL on failure
	 **/
	public Byte flickcurl_urls_getGroup(Object group_id) {
		return fc.flickcurl_call_get_one_string_field("group_id", group_id, "flickr.urls.getGroup", ()"/rsp/group/@url"/**
		 * flickcurl_urls_getUserPhotos:
		 * @fc: flickcurl context
		 * @user_id: user ID
		 *
		 * Get the url to a user's photos.
		 *
		 * Implements flickr.urls.getUserPhotos (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public Byte flickcurl_urls_getUserPhotos(Object user_id) {
		return fc.flickcurl_call_get_one_string_field("user_id", user_id, "flickr.urls.getUserPhotos", ()"/rsp/user/@url"/**
		 * flickcurl_urls_getUserProfile:
		 * @fc: flickcurl context
		 * @user_id: user ID
		 *
		 * Get the url to a user's profile.
		 *
		 * Implements flickr.urls.getUserProfile (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public Byte flickcurl_urls_getUserProfile(Object user_id) {
		return fc.flickcurl_call_get_one_string_field("user_id", user_id, "flickr.urls.getUserProfile", ()"/rsp/user/@url"/**
		 * flickcurl_urls_lookupGallery:
		 * @fc: flickcurl context
		 * @url: The gallery's URL.
		 * 
		 * Get a gallery ID by url.
		 *
		 * Implements flickr.urls.lookupGallery (1.18)
		 *
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: gallery ID or NULL on failure
		 **/);
	}
	public Byte flickcurl_urls_lookupGallery(Object url) {
		return fc.flickcurl_call_get_one_string_field("url", url, "flickr.urls.lookupGallery", ()"/rsp/gallery/@id"/**
		 * flickcurl_urls_lookupGroup:
		 * @fc: flickcurl context
		 * @url: URL of group's page or photo pool
		 *
		 * Get a group NSID, given the url to a group's page or photo pool.
		 *
		 * Implements flickr.urls.lookupGroup (0.9)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public Byte flickcurl_urls_lookupGroup(Object url) {
		return fc.flickcurl_call_get_one_string_field("url", url, "flickr.urls.lookupGroup", ()"/rsp/group/@id"/**
		 * flickcurl_urls_lookupUser:
		 * @fc: flickcurl context
		 * @url: URL of user's photo or user's profile
		 * 
		 * Get a user NSID, given the url to a user's photos or profile.
		 *
		 * Implements flickr.urls.lookupUser (0.6)
		 * 
		 * Return value: NSID or NULL on failure
		 **/);
	}
	public Byte flickcurl_urls_lookupUser(Object url) {
		return fc.flickcurl_call_get_one_string_field("url", url, "flickr.urls.lookupUser", ()"/rsp/user/@id");
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-transform-api.c - Flickr flickr.photos.transform.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_transform_rotate:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to rotate.
	 * @degrees: The amount of degrees by which to rotate the photo (clockwise) from it's current orientation. Valid values are 90, 180 and 270.
	 * 
	 * Rotate a photo.
	 *
	 * Implements flickr.photos.transform.rotate (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_photos_transform_rotate(Object photo_id, int degrees) {
		 doc = ((Object)0);
		byte[] degrees_str = new byte[4];
		int result = 0;
		fc.flickcurl_init_params(0);
		if (!photo_id || !(degrees == 90 || degrees == 180 || degrees == 270)) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(degrees_str, "%d", degrees);
		fc.flickcurl_add_param("degrees", degrees_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.transform.rotate")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* get shapedata from value */
	public  flickcurl_build_institutions(Object xpathCtx, Object xpathExpr, int institution_count_p) {
		flickcurl_institution institutions = ((Object)0);
		int nodes_count;
		int institution_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		institutions = (flickcurl_institution).calloc(, nodes_count + 1);
		Object generatedUrls = institution.getUrls();
		int generatedFailed = this.getFailed();
		if (institution_count_p) {
			institution_count_p = institution_count;
		} 
		if (generatedFailed) {
			if (institutions) {
				institutions.flickcurl_free_institutions();
			} 
			institutions = ((Object)0);
		} 
		return institutions;
	}
	public  flickcurl_build_institution(Object xpathCtx, Object xpathExpr) {
		flickcurl_institution institutions = new flickcurl_institution();
		flickcurl_institution result = ((Object)0);
		institutions = fc.flickcurl_build_institutions(xpathCtx, xpathExpr, ((Object)0));
		if (institutions) {
			result = institutions[0];
			.free(institutions);
		} 
		return result;
	}
	public  flickcurl_build_video(Object xpathCtx, Object xpathExpr) {
		flickcurl_video v = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int count = 0;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do video */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		v = (flickcurl_video).calloc(1, );
		if (!v) {
			fc.flickcurl_error("Unable to allocate the memory needed for video.");
			this.setFailed(1);
			;
		} 
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			byte node_name = (byte)node.getName();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			if (.strcmp(node_name, "video")) {
				continue;
			} 
			count++;
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				int attr_value = .atoi((byte)attr.getChildren().getContent());
				if (!.strcmp(attr_name, "ready")) {
					v.setReady(attr_value);
				}  else if (!.strcmp(attr_name, "failed")) {
					v.setFailed(attr_value);
				}  else if (!.strcmp(attr_name, "pending")) {
					v.setPending(attr_value);
				}  else if (!.strcmp(attr_name, "duration")) {
					v.setDuration(attr_value);
				}  else if (!.strcmp(attr_name, "width")) {
					v.setWidth(attr_value);
				}  else if (!.strcmp(attr_name, "height")) {
					v.setHeight(attr_value);
				} 
			}
		}
		if (!/* for nodes */count) {
			v.flickcurl_free_video();
			v = ((Object)0);
		} 
		return v;
	}
	public  flickcurl_build_activity_event(Object node) {
		flickcurl_activity_event ae = new flickcurl_activity_event();
		 attr = new ();
		 chnode = new ();
		ae = (flickcurl_activity_event).calloc(, 1);
		if (!ae) {
			return ((Object)0);
		} 
		for (attr = node.getProperties(); attr; attr = attr.getNext()) {
			size_t attr_len = .strlen((byte)attr.getChildren().getContent());
			byte attr_name = (byte)attr.getName();
			byte attr_value;
			attr_value = (byte).malloc(attr_len + 1);
			.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
			if (!.strcmp(attr_name, "type")) {
				ae.setType(attr_value);
			}  else if (!.strcmp(attr_name, "commentid")) {
				ae.setId(attr_value);
			}  else if (!.strcmp(attr_name, "user")) {
				ae.setUser(attr_value);
			}  else if (!.strcmp(attr_name, "username")) {
				ae.setUsername(attr_value);
			}  else if (!.strcmp(attr_name, "dateadded")) {
				ae.setDate_added(.atoi(attr_value));
				.free(attr_value);
			} else {
					.free(attr_value/* end attributes */);
			} 
		}
		Object generatedValue = ae.getValue();
		for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
			if (chnode.getType() == XML_TEXT_NODE) {
				size_t len = .strlen((byte)chnode.getContent());
				ae.setValue((byte).malloc(len + 1));
				.memcpy(generatedValue, chnode.getContent(), len + 1);
				break;
			} 
		}
		return ae;
	}
	public  flickcurl_build_activities(Object xpathCtx, Object xpathExpr, int activity_count_p) {
		flickcurl_activity activities = ((Object)0);
		int nodes_count;
		int activity_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		activities = (flickcurl_activity).calloc(, nodes_count + 1);
		Object generatedTitle = a.getTitle();
		Object generatedEvents = a.getEvents();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_activity a = new flickcurl_activity();
			 chnode = new ();
			int events_count = 0;
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			a = (flickcurl_activity).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "type")) {
					a.setType(attr_value);
				}  else if (!.strcmp(attr_name, "id")) {
					a.setId(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					a.setOwner(attr_value);
				}  else if (!.strcmp(attr_name, "ownername")) {
					a.setOwner_name(attr_value);
				}  else if (!.strcmp(attr_name, "primary")) {
					a.setPrimary(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					a.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					a.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					a.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "commentsold")) {
					a.setComments_old(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "commentsnew")) {
					a.setComments_new(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "notesold")) {
					a.setNotes_old(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "notesnew")) {
					a.setNotes_new(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "views")) {
					a.setViews(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					a.setPhotos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "faves")) {
					a.setFaves(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "comments")) {
					a.setComments(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "more")) {
					a.setMore(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						a.setTitle((byte).malloc(len + 1));
						.memcpy(generatedTitle, chnode.getChildren().getContent(), len + 1);
					}  else if (!.strcmp(chnode_name, "activity")) {
						 chnode2 = new ();
						for (chnode2 = chnode.getChildren(); chnode2; chnode2 = chnode2.getNext()) {
							byte chnode2_name = (byte)chnode2.getName();
							if (chnode2.getType() == XML_ELEMENT_NODE && !.strcmp(chnode2_name, "event")) {
								if (events_count < 20) {
									flickcurl_activity_event ae = ((Object)0);
									ae = fc.flickcurl_build_activity_event(chnode2);
									if (ae) {
										generatedEvents[events_count++] = ae/* end for children of <activity> */;
									} 
								} 
							} 
						}
					} 
				} 
			}
			generatedEvents[events_count] = /* end for children of <item> */0;
			activities[activity_count++] = a/* for nodes */;
		}
		if (activity_count_p) {
			activity_count_p = activity_count;
		} 
		return activities;
	}
	public  flickcurl_build_sizes(Object xpathCtx, Object xpathExpr, int size_count_p) {
		flickcurl_size sizes = ((Object)0);
		int nodes_count;
		int size_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		sizes = (flickcurl_size).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_size s = new flickcurl_size();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			s = (flickcurl_size).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "label")) {
					s.setLabel(attr_value);
				}  else if (!.strcmp(attr_name, "width")) {
					s.setWidth(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "height")) {
					s.setHeight(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "source")) {
					s.setSource(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					s.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "media")) {
					s.setMedia(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			sizes[size_count++] = s/* for nodes */;
		}
		if (size_count_p) {
			size_count_p = size_count;
		} 
		return sizes;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * auth-api.c - Flickr flickr.auth.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_auth_checkToken:
	 * @fc: flickcurl context
	 * @token: token string
	 * 
	 * Get the credentials attached to an authentication token.
	 *
	 * Implements flickr.auth.checkToken (0.9)
	 * Must be signed.
	 * 
	 * FIXME: Cannot confirm this works, get intermittent results.
	 *
	 * Return value: permissions string or NULL on failure
	 **/
	public Byte flickcurl_auth_checkToken(Object token) {
		byte perms = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!token) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("auth_token", (byte)token);
		fc.flickcurl_end_params();
		fc.flickcurl_set_sign();
		if (fc.flickcurl_prepare("flickr.auth.checkToken")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			perms = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/auth/perms");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public Byte flickcurl_auth_getFrob() {
		byte frob = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		fc.flickcurl_set_sign();
		if (fc.flickcurl_prepare("flickr.auth.getFrob")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			frob = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/frob");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public Byte flickcurl_auth_getFullToken(Object frob) {
		byte auth_token = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("mini_token", (byte)frob);
		fc.flickcurl_end_params();
		fc.flickcurl_set_sign();
		if (fc.flickcurl_prepare("flickr.auth.getFullToken")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			auth_token = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/auth/token");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public Byte flickcurl_auth_getToken(Object frob) {
		byte auth_token = ((Object)0);
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("frob", (byte)frob);
		fc.flickcurl_end_params();
		fc.flickcurl_set_sign();
		if (fc.flickcurl_prepare("flickr.auth.getToken")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (xpathCtx) {
			auth_token = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/auth/token");
			.xmlXPathFreeContext(xpathCtx);
		} 
	}
	public int flickcurl_auth_oauth_getAccessToken() {
		 generatedOd = this.getOd();
		flickcurl_oauth_data od = generatedOd;
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int rc = 0;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		fc.flickcurl_set_sign();
		if (fc.flickcurl_prepare("flickr.auth.oauth.getAccessToken")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		Byte generatedSecret = this.getSecret();
		Byte generatedAuth_token = this.getAuth_token();
		if (xpathCtx) {
			byte auth_token;
			byte auth_token_secret;
			auth_token = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/auth/access_token[@oauth_token]");
			auth_token_secret = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/auth/access_token[@oauth_token_secret]");
			od.setClient_secret(generatedSecret);
			this.setSecret(((Object)0));
			if (generatedAuth_token) {
				.free(generatedAuth_token);
				this.setAuth_token(((Object)0));
			} 
			od.setToken(/* Store OAuth token and token secret in the oauth structure */auth_token);
			od.setToken_len(.strlen(auth_token));
			od.setToken_secret(auth_token_secret);
			od.setToken_secret_len(.strlen(auth_token_secret));
			.xmlXPathFreeContext(xpathCtx);
			xpathCtx = ((Object)0);
		} 
		return rc;
	}
	public  flickcurl_build_perms(Object xpathCtx, Object xpathExpr) {
		flickcurl_perms perms = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do perms */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			perms = (flickcurl_perms).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					;
				}  else if (!.strcmp(attr_name, "ispublic")) {
					perms.setIs_public(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "iscontact")) {
					perms.setIs_contact(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "isfriend")) {
					perms.setIs_friend(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "isfamily")) {
					perms.setIs_family(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "permcomment")) {
					perms.setPerm_comment(.atoi(attr_value));
				}  else if (!.strcmp(attr_name, "permaddmeta")) {
					perms.setPerm_addmeta(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			break;
		}
		return perms;
	}
	public  flickcurl_build_galleries(Object xpathCtx, Object xpathExpr, int gallery_count_p) {
		flickcurl_gallery galleries = ((Object)0);
		int nodes_count;
		int gallery_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		galleries = (flickcurl_gallery).calloc(, nodes_count + 1);
		Object generatedPrimary_photo = g.getPrimary_photo();
		Object generatedTitle = g.getTitle();
		Object generatedDescription = g.getDescription();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_gallery g = new flickcurl_gallery();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			g = (flickcurl_gallery).calloc(, 1);
			g.setPrimary_photo((flickcurl_photo).calloc(, /* initialise primary photo object */1/* assumes it is a photo */));
			generatedPrimary_photo.setMedia_type((byte).malloc(5 + 1));
			.memcpy(generatedPrimary_photo.getMedia_type(), "photo", 5 + 1);
			generatedPrimary_photo.setTags((flickcurl_tag).calloc(, /* empty list of tags (1 NULL pointer) */1));
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					g.setId(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					g.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					g.setOwner(attr_value);
				}  else if (!.strcmp(attr_name, "date_create")) {
					g.setDate_create(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "date_update")) {
					g.setDate_update(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_id")) {
					generatedPrimary_photo.setId(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_server")) {
					generatedPrimary_photo.getFields()[.PHOTO_FIELD_server].setInteger((flickcurl_photo_field_type).atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_farm")) {
					generatedPrimary_photo.getFields()[.PHOTO_FIELD_farm].setInteger((flickcurl_photo_field_type).atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "primary_photo_secret")) {
					generatedPrimary_photo.getFields()[.PHOTO_FIELD_secret].setString(attr_value);
				}  else if (!.strcmp(attr_name, "count_photos")) {
					g.setCount_photos(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "count_videos")) {
					g.setCount_videos(.atoi(attr_value));
					.free(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							g.setTitle((byte).malloc(len + 1));
							.memcpy(generatedTitle, chnode.getChildren().getContent(), len + 1);
						} 
					}  else if (!.strcmp(chnode_name, "description")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							g.setDescription((byte).malloc(len + 1));
							.memcpy(generatedDescription, chnode.getChildren().getContent(), len + 1/* end for children of <item> */);
						} 
					} 
				} 
			}
			galleries[gallery_count++] = g/* for nodes */;
		}
		if (gallery_count_p) {
			gallery_count_p = gallery_count;
		} 
		return galleries;
	}
	public  flickcurl_build_contexts(Object doc) {
		flickcurl_context contexts = ((Object)0);
		 xnp = new ();
		 node = new ();
		int i;
		int count = 0;
		int nodes_count = 0;
		xnp = .xmlDocGetRootElement(doc);
		for (node = xnp.getChildren(); node; node = node.getNext()) {
			if (node.getType() == XML_ELEMENT_NODE) {
				nodes_count++;
			} 
		}
		contexts = (flickcurl_context).calloc(, nodes_count + 1);
		xnp = .xmlDocGetRootElement(/* walk children elements of root element */doc);
		for (; node; ) {
			 attr = new ();
			flickcurl_context context = new flickcurl_context();
			flickcurl_context_type type = .FLICKCURL_CONTEXT_NONE;
			int j;
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			for (j = 0; j <= .FLICKCURL_CONTEXT_LAST; j++) {
				if (!.strcmp((byte)node.getName(), ModernizedCProgram.flickcurl_context_type_element[j])) {
					type = (flickcurl_context_type)j;
					break;
				} 
			}
			if (type == .FLICKCURL_CONTEXT_NONE) {
				continue;
			} 
			context = (flickcurl_context).calloc(, 1);
			context.setType(type);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					context.setId(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					context.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					context.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					context.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "title")) {
					context.setTitle(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					context.setUrl(attr_value);
				}  else if (!.strcmp(attr_name, "thumb")) {
					context.setThumb(attr_value);
				} else {
						.free(attr_value/* for attributes */);
				} 
			}
			contexts[count++] = context/* for nodes */;
		}
		contexts[count] = ((Object)0);
		return contexts;
	}
	public  flickcurl_build_exifs(Object xpathCtx, Object xpathExpr, int exif_count_p) {
		flickcurl_exif exifs = ((Object)0);
		int nodes_count;
		int exif_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do exifs */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		exifs = (flickcurl_exif).calloc(, nodes_count + 1);
		Object generatedRaw = e.getRaw();
		Object generatedClean = e.getClean();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_exif e = new flickcurl_exif();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			e = (flickcurl_exif).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "tagspace")) {
					e.setTagspace(attr_value);
				}  else if (!.strcmp(attr_name, "tagspaceid")) {
					e.setTagspaceid(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "tag")) {
					e.setTag(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "label")) {
					e.setLabel(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "raw")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						e.setRaw((byte).malloc(len + 1));
						.memcpy(generatedRaw, chnode.getChildren().getContent(), len + 1);
					}  else if (!.strcmp(chnode_name, "clean")) {
						size_t len = .strlen((byte)chnode.getChildren().getContent());
						e.setClean((byte).malloc(len + 1));
						.memcpy(generatedClean, chnode.getChildren().getContent(), len + 1);
					} 
				} 
			}
			exifs[exif_count++] = e/* for nodes */;
		}
		if (exif_count_p) {
			exif_count_p = exif_count;
		} 
		return exifs;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-api.c - Flickr flickr.photos.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_addTags:
	 * @fc: flickcurl context
	 * @photo_id: photo ID
	 * @tags: tags to add as a space-separated list
	 *
	 * Add tags to a photo.
	 *
	 * Implements flickr.photos.addTags (0.9)
	 *
	 * Return value: non-0 on failure
	 */
	public int flickcurl_photos_addTags(Object photo_id, Object tags) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || !tags) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("tags", tags);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.addTags")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public int flickcurl_photos_delete(Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.delete")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_getAllContexts:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * 
		 * Get all visible sets and pools the photo belongs to.
		 *
		 * Implements flickr.photos.getAllContexts (0.7)
		 *
		 * Returns an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 * 
		 * Return value: prev, next contexts or NULL
		 **/;
	}
	public  flickcurl_photos_getAllContexts(Object photo_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getAllContexts")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		contexts = fc.flickcurl_build_contexts(doc);
		return contexts/**
		 * flickcurl_photos_getContactsPhotos_params:
		 * @fc: flickcurl context
		 * @contact_count: Number of photos to return (Default 10, maximum 50)
		 * @just_friends: Set to non-0 to only show photos from friends and family (excluding regular contacts).
		 * @single_photo: Set to non-0 to only fetch one photo (the latest) per contact, instead of all photos in chronological order.
		 * @include_self: Set to non-0 to include photos from the calling user.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Fetch a list of recent photos from the calling users' contacts.
		 *
		 * Currently supported extras fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format, last_update
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photos_getContext(Object photo_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getContext")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		contexts = fc.flickcurl_build_contexts(doc);
		return contexts;
	}
	public Integer flickcurl_build_photocounts(Object xpathCtx, Object xpathExpr, int photocount_count_p) {
		int photocounts = ((Object)0);
		int nodes_count;
		int photocount_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int row_size = 3;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photocounts = (int).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			int row;
			int j;
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			row = (int).calloc(, row_size);
			for (j = 0; j < row_size; j++) {
				row[j] = -1;
			}
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "count")) {
					row[0] = .atoi(attr_value);
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "fromdate")) {
					row[1] = .atoi(attr_value);
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "todate")) {
					row[2] = .atoi(attr_value);
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			photocounts[photocount_count++] = row/* for nodes */;
		}
		if (photocount_count_p) {
			photocount_count_p = photocount_count;
		} 
		return photocounts/**
		 * flickcurl_photos_getCounts:
		 * @fc: flickcurl context
		 * @dates_array: A comma delimited list of unix timestamps, denoting the periods to return counts for. They should be specified smallest first. (or NULL)
		 * @taken_dates_array: A comma delimited list of mysql datetimes, denoting the periods to return counts for. They should be specified mallest first. (or NULL)
		 * 
		 * Gets a list of photo counts for the given date ranges for the calling user.
		 *
		 * Implements flickr.photos.getCounts (0.13)
		 * 
		 * The return array fields are:
		 *   [0] count
		 *   [1] fromdate as unixtime
		 *   [2] todate as unixtime
		 *
		 * Return value: array of int[3] or NULL on failure
		 */;
	}
	public Integer flickcurl_photos_getCounts(Object dates_array, Object taken_dates_array) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int counts = ((Object)0);
		byte dates = ((Object)0);
		byte taken_dates = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!dates_array && !/* one must be not empty */taken_dates_array) {
			return ((Object)0);
		} 
		if (dates_array) {
			dates = ModernizedCProgram.flickcurl_array_join(dates_array, (byte)',');
			fc.flickcurl_add_param("dates", dates);
		} 
		if (taken_dates_array) {
			taken_dates = ModernizedCProgram.flickcurl_array_join(taken_dates_array, (byte)',');
			fc.flickcurl_add_param("taken_dates", taken_dates);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getCounts")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		counts = fc.flickcurl_build_photocounts(xpathCtx, ()"/rsp/photocounts/photocount", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (counts) {
				.free(counts);
			} 
			counts = ((Object)0);
		} 
		if (dates) {
			.free(dates);
		} 
		if (taken_dates) {
			.free(taken_dates);
		} 
		return counts/**
		 * flickcurl_photos_getExif:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to fetch information for.
		 * @secret: The secret for the photo (or NULL)
		 *   If the correct secret is passed then permissions checking is
		 *   skipped. This enables the 'sharing' of individual photos by
		 *   passing around the id and secret.
		 *
		 * Retrieves a list of EXIF/TIFF/GPS tags for a given photo.
		 *
		 * Implements flickr.photos.getExif (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photos_getExif(Object photo_id, Object secret) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_exif exifs = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		if (secret) {
			fc.flickcurl_add_param("secret", secret);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getExif")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		exifs = fc.flickcurl_build_exifs(xpathCtx, ()"/rsp/photo/exif", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (exifs) {
				exifs.flickcurl_free_exifs();
			} 
			exifs = ((Object)0);
		} 
		return exifs/**
		 * flickcurl_photos_getFavorites:
		 * @fc: flickcurl context
		 * @photo_id: The ID of the photo to fetch the favoriters list for.
		 * @page: The page of results to return (default 1)
		 * @per_page: Number of users to return per page (default 10, max 50)
		 * 
		 * Returns the list of people who have favorited a given photo.
		 *
		 * Implements flickr.photos.getFavorites (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photos_getFavorites(Object photo_id, int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_person persons = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getFavorites")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		persons = fc.flickcurl_build_persons(xpathCtx, ()"/rsp/photo/person", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (persons) {
				persons.flickcurl_free_persons();
			} 
			persons = ((Object)0);
		} 
		return persons/**
		 * flickcurl_photos_getInfo2:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @secret: secret (or NULL)
		 * 
		 * Get information about a photo
		 *
		 * Implements flickr.photos.getInfo (0.5)
		 * 
		 * Return value: #flickcurl_photo or NULL on failure
		 **/;
	}
	public  flickcurl_photos_getPerms(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_perms perms = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getPerms")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		perms = fc.flickcurl_build_perms(xpathCtx, ()"/rsp/perms");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (perms) {
				perms.flickcurl_free_perms();
			} 
			perms = ((Object)0);
		} 
		return perms/**
		 * flickcurl_photos_getRecent_params:
		 * @fc: flickcurl context
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of the latest public photos uploaded to flickr.
		 *
		 * Currently supported extras fields are: license, date_upload, date_taken,
		 * owner_name, icon_server, original_format, last_update, geo, tags,
		 * machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photos_getSizes(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_size sizes = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.getSizes")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		sizes = fc.flickcurl_build_sizes(xpathCtx, ()"/rsp/sizes/size", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (sizes) {
				sizes.flickcurl_free_sizes();
			} 
			sizes = ((Object)0);
		} 
		return sizes/**
		 * flickcurl_photos_getUntagged_params:
		 * @fc: flickcurl context
		 * @min_upload_date: Minimum upload date.
		 * @max_upload_date: Maximum upload date.
		 * @min_taken_date: Minimum taken date (or NULL)
		 * @max_taken_date: Maximum taken date (or NULL)
		 * @privacy_filter: Return photos only matching a certain privacy level.
		 * Valid privacy values are: 1 public, 2 friends, 3 family, 4 friends and
		 * family, 5 private
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of your photos with no tags.
		 *
		 * Currently supported extras fields are: license, date_upload, date_taken,
		 * owner_name, icon_server, original_format, last_update, geo, tags,
		 * machine_tags.
		 *
		 * Return value: a list of photos or NULL on failure
		 **/;
	}
	public int flickcurl_photos_removeTag(Object tag_id) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!tag_id) {
			return 1;
		} 
		fc.flickcurl_add_param("tag_id", tag_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.removeTag")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public int flickcurl_photos_setContentType(Object photo_id, int content_type) {
		 doc = ((Object)0);
		int result = 1;
		byte[] content_type_str = new byte[2];
		fc.flickcurl_init_params(1);
		if (!photo_id || !content_type) {
			return 1;
		} 
		if (content_type < 1 || content_type > 3) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(content_type_str, "%d", content_type);
		fc.flickcurl_add_param("content_type", content_type_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setContentType")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_setDates:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to edit dates for.
		 * @date_posted: The date the photo was uploaded to flickr as a unix time (or -1)
		 * @date_taken: The date the photo was taken as a unix time (or -1)
		 * @date_taken_granularity: The granularity of the date the photo was taken: 0 second, 4 month, 6 year (or -1)
		 * 
		 * Set one or both of the dates for a photo.
		 *
		 * Implements flickr.photos.setDates (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_setDates(Object photo_id, int date_posted, int date_taken, int date_taken_granularity) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] date_posted_str = new byte[20];
		byte date_taken_str = ((Object)0);
		byte[] date_taken_granularity_str = new byte[3];
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		if (date_posted < 0 && date_taken < 0 && date_taken_granularity < /* Nothing to do */0) {
			return 0;
		} 
		if (date_taken_granularity > 10) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		if (date_posted >= 0) {
			.sprintf(date_posted_str, "%d", /* posted date is always a unix time */date_posted);
			fc.flickcurl_add_param("date_posted", date_posted_str);
		} 
		if (date_taken >= 0) {
			date_taken_str = ModernizedCProgram.flickcurl_unixtime_to_sqltimestamp(/* taken date is always a SQL timestamp */date_taken);
			fc.flickcurl_add_param("date_taken", date_taken_str);
		} 
		if (date_taken_granularity >= 0) {
			.sprintf(date_taken_granularity_str, "%d", date_taken_granularity);
			fc.flickcurl_add_param("date_taken_granularity", date_taken_granularity_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setDates")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		if (date_taken_str) {
			.free(date_taken_str);
		} 
		return result/**
		 * flickcurl_photos_setMeta:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set information for.
		 * @title: The title for the photo.
		 * @description: The description for the photo.
		 * 
		 * Set the meta information for a photo.
		 *
		 * Implements flickr.photos.setMeta (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_setMeta(Object photo_id, Object title, Object description) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id || !title || !description) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("title", title);
		fc.flickcurl_add_param("description", description);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setMeta")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photos_setPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set permissions for.
		 * @perms: The #flickcurl_perms photo permissions
		 * 
		 * Set permissions for a photo.
		 *
		 * Implements flickr.photos.setPerms (0.11)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_setSafetyLevel(Object photo_id, int safety_level, int hidden) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		int result = 1;
		byte[] safety_level_str = new byte[2];
		byte[] hidden_str = new byte[2];
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		if (safety_level <= 0 && hidden < 0) {
			return 0;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		if (safety_level > 0) {
			.sprintf(safety_level_str, "%d", safety_level);
			fc.flickcurl_add_param("safety_level", safety_level_str);
		} 
		if (hidden >= 0) {
			.sprintf(hidden_str, "%d", hidden ? 1 : 0);
			fc.flickcurl_add_param("hidden", hidden_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setSafetyLevel")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photos_setTags:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @tags: all tags for the photo as a space-separated list
		 *
		 * Set the tags for a photo.
		 *
		 * Note that this replaces all existing tags with the @tags here.
		 *
		 * Implements flickr.photos.setTags (0.9)
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public int flickcurl_photos_setTags(Object photo_id, Object tags) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || !tags) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("tags", tags);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.setTags")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public  flickcurl_build_tag_clusters(Object xpathCtx, Object xpathExpr) {
		flickcurl_tag_clusters tcs = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		tcs = (flickcurl_tag_clusters).calloc(, 1);
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		tcs.setClusters((flickcurl_tag_cluster).calloc(, nodes_count + 1));
		Object generatedTags = tc.getTags();
		Object generatedCount = tc.getCount();
		Object generatedClusters = tcs.getClusters();
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			 chnode = new ();
			flickcurl_tag_cluster tc = ((Object)0);
			int tags_count = -1;
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			tc = (flickcurl_tag_cluster).calloc(, 1);
			if (!tc) {
				this.setFailed(1);
				break;
			} 
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				byte attr_value = (byte)attr.getChildren().getContent();
				if (!.strcmp(attr_name, "total")) {
					tags_count = .atoi(attr_value);
				} 
			}
			if (tags_count <= 0) {
				.free(tc);
				continue;
			} 
			tc.setTags((byte).calloc(, tags_count + 1));
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE && !.strcmp(chnode_name, "tag")) {
					size_t len = .strlen((byte)chnode.getChildren().getContent());
					byte tag_name = (byte).malloc(len + 1);
					.memcpy(tag_name, (byte)chnode.getChildren().getContent(), len + 1);
					generatedTags[generatedCount++] = tag_name;
				} 
			}
			generatedTags[generatedCount] = ((Object)0);
			generatedClusters[generatedCount++] = tc/* for <cluster> nodes */;
		}
		generatedClusters[generatedCount] = ((Object)0);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		return tcs;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photosets-comments-api.c - Flickr flickr.photosets.comments.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photosets_comments_addComment:
	 * @fc: flickcurl context
	 * @photoset_id: The id of the photoset to add a comment to.
	 * @comment_text: Text of the comment
	 * 
	 * Add a comment to a photoset.
	 *
	 * Implements flickr.photosets.comments.addComment (0.10)
	 * 
	 * Return value: new comment ID or non-NULL on failure
	 **/
	public Byte flickcurl_photosets_comments_addComment(Object photoset_id, Object comment_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photoset_id || !comment_text) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("comment_text", comment_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.comments.addComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		id = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/comment/@id");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photosets_comments_deleteComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to delete from a photoset.
		 * 
		 * Delete a photoset comment as the currently authenticated user.
		 *
		 * Implements flickr.photosets.comments.deleteComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_comments_deleteComment(Object comment_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!comment_id) {
			return 1;
		} 
		fc.flickcurl_add_param("comment_id", comment_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.comments.deleteComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_comments_editComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * @comment_text: Update the comment to this text.
		 * 
		 * Edit the text of a comment as the currently authenticated user.
		 *
		 * Implements flickr.photosets.comments.editComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_comments_editComment(Object comment_id, Object comment_text) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!comment_id || !comment_text) {
			return 1;
		} 
		fc.flickcurl_add_param("comment_id", comment_id);
		fc.flickcurl_add_param("comment_text", comment_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.comments.editComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_comments_getList:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to fetch comments for.
		 * 
		 * Returns the comments for a photoset.
		 *
		 * Implements flickr.photosets.comments.getList (0.10)
		 * 
		 * Return value: array of comments or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * activity-api.c - Flickr flickr.activity.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_activity_userComments:
	 * @fc: flickcurl context
	 * @per_page: Number of items to return per page. If this argument is omitted, it defaults to 10. The maximum allowed value is 50.
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1.
	 * 
	 * Returns a list of recent activity on photos commented on by the calling user. 
	 *
	 * Implements flickr.activity.userComments (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public  flickcurl_activity_userComments(int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_activity activities = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.activity.userComments")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		activities = fc.flickcurl_build_activities(xpathCtx, ()"/rsp/items/item", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (activities) {
				activities.flickcurl_free_activities();
			} 
			activities = ((Object)0);
		} 
		return activities/**
		 * flickcurl_activity_userPhotos:
		 * @fc: flickcurl context
		 * @timeframe: The timeframe in which to return updates for. This can be specified in days (<code>'2d'</code>) or hours (<code>'4h'</code>). The default behavoir is to return changes since the beginning of the previous user session. (or NULL)
		 * @per_page: Number of items to return per page. If this argument is omitted, it defaults to 10. The maximum allowed value is 50. (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or NULL)
		 * 
		 * Returns a list of recent activity on photos belonging to the calling user. Do not poll this method more than once an hour.
		 *
		 * Implements flickr.activity.userPhotos (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_activity_userPhotos(Object timeframe, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_activity activities = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (timeframe) {
			fc.flickcurl_add_param("timeframe", timeframe);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.activity.userPhotos")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		activities = fc.flickcurl_build_activities(xpathCtx, ()"/rsp/items/item", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (activities) {
				activities.flickcurl_free_activities();
			} 
			activities = ((Object)0);
		} 
		return activities;
	}
	public  flickcurl_invoke_photos_list(Object xpathExpr, Object format) {
		flickcurl_photos_list photos_list = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 xpathNodeCtx = ((Object)0);
		byte nformat;
		size_t format_len = new size_t();
		photos_list = fc.flickcurl_new_photos_list();
		if (!photos_list) {
			return ((Object)0);
		} 
		Object generatedContent_length = photos_list.getContent_length();
		Object generatedContent = photos_list.getContent();
		Object generatedPhotos_count = photos_list.getPhotos_count();
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		Object generatedPhotos = photos_list.getPhotos();
		if (format) {
			nformat = format;
			format_len = .strlen(format);
			photos_list.setContent(fc.flickcurl_invoke_get_content(generatedContent_length));
			if (!generatedContent) {
				this.setFailed(1);
				;
			} 
		} else {
				 doc = ((Object)0);
				 photos_node = new ();
				size_t xpathExprLen = .strlen((byte)xpathExpr);
				byte value;
				 photosXpathExpr = new ();
				nformat = "xml";
				format_len = 3;
				doc = fc.flickcurl_invoke();
				if (!doc) {
					;
				} 
				xpathCtx = .xmlXPathNewContext(doc);
				if (!xpathCtx) {
					fc.flickcurl_error("Failed to create XPath context for document");
					this.setFailed(1);
					;
				} 
				xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
				if (!xpathObj) {
					fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
					this.setFailed(1);
					;
				} 
				if (!xpathObj.getNodesetval() || !xpathObj.getNodesetval().getNodeTab()) {
					;
				} 
				photos_node = xpathObj.getNodesetval().getNodeTab()[0];
				xpathNodeCtx = .xmlXPathNewContext(xpathCtx.getDoc());
				if (!xpathNodeCtx) {
					fc.flickcurl_error("Unable to create XPath context for XPath \"%s\"", xpathExpr);
					this.setFailed(1);
					;
				} 
				xpathNodeCtx.setNode(photos_node);
				value = fc.flickcurl_xpath_eval(xpathNodeCtx, ()"./@page");
				if (value) {
					photos_list.setPage(.atoi(value));
					.free(value);
				} 
				value = fc.flickcurl_xpath_eval(xpathNodeCtx, ()"./@perpage");
				if (value) {
					photos_list.setPer_page(.atoi(value));
					.free(value);
				} 
				value = fc.flickcurl_xpath_eval(xpathNodeCtx, ()"./@total");
				if (value) {
					photos_list.setTotal_count(.atoi(value));
					.free(value);
				} 
				.xmlXPathFreeContext(/* finished with these */xpathNodeCtx);
				xpathNodeCtx = ((Object)0);
				.xmlXPathFreeObject(xpathObj);
				xpathObj = ((Object)0);
				photosXpathExpr = ().malloc(xpathExprLen + 6 + 1);
				.memcpy(photosXpathExpr, xpathExpr, xpathExprLen);
				.memcpy(photosXpathExpr + xpathExprLen, "/photo", 6 + 1);
				photos_list.setPhotos(flickcurl_photo_s.flickcurl_build_photos(fc, xpathCtx, photosXpathExpr, generatedPhotos_count));
				.free(photosXpathExpr);
				if (!generatedPhotos) {
					this.setFailed(1);
					;
				} 
		} 
		photos_list.setFormat((byte).malloc(format_len + 1));
		Object generatedFormat = photos_list.getFormat();
		if (!generatedFormat) {
			this.setFailed(1);
			;
		} 
		.memcpy(generatedFormat, nformat, format_len + 1);
		if (xpathCtx) {
			.xmlXPathFreeContext(xpathCtx);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (photos_list) {
				photos_list.flickcurl_free_photos_list();
			} 
			photos_list = ((Object)0);
		} 
		return photos_list/*
		 * flickcurl_new_photos_list:
		 * @fc: Flickcurl context
		 *
		 * INTERNAL - constructor for photos list
		 */;
	}
	public  flickcurl_new_photos_list() {
		flickcurl_photos_list photos_list = new flickcurl_photos_list();
		photos_list = (flickcurl_photos_list).calloc(1, );
		if (!photos_list) {
			return ((Object)0);
		} 
		photos_list.setPage(-1);
		photos_list.setPer_page(-1);
		photos_list.setTotal_count(-1);
		return photos_list/**
		 * flickcurl_free_photos_list:
		 * @photos_list: photos list object
		 *
		 * Destructor for photos list
		 */;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickr.photos.upload-api.c - Flickr flickr.photos.upload.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_upload_checkTickets:
	 * @fc: flickcurl context
	 * @tickets_ids: Array of ticket ids
	 * 
	 * Checks the status of one or more asynchronous photo upload tickets.
	 *
	 * Implements flickr.photos.upload.checkTickets (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public  flickcurl_photos_upload_checkTickets(Object tickets_ids) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_ticket tickets = ((Object)0);
		byte tickets_ids_string = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!tickets_ids) {
			return ((Object)0);
		} 
		tickets_ids_string = ModernizedCProgram.flickcurl_array_join(tickets_ids, (byte)',');
		fc.flickcurl_add_param("tickets", tickets_ids_string);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.upload.checkTickets")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tickets = fc.flickcurl_build_tickets(xpathCtx, ()"/rsp/uploader/ticket", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tickets) {
				tickets.flickcurl_free_tickets();
			} 
			tickets = ((Object)0);
		} 
		if (tickets_ids_string) {
			.free(tickets_ids_string);
		} 
		return tickets;
	}
	/* get shapedata from value */
	public  flickcurl_build_places(Object xpathCtx, Object xpathExpr, int place_count_p) {
		flickcurl_place places = ((Object)0);
		int nodes_count;
		int place_count;
		 xpathObj = ((Object)0);
		 nodes = new ();
		int i;
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		places = (flickcurl_place).calloc(, nodes_count + 1);
		Object generatedNames = place.getNames();
		Object generatedIds = place.getIds();
		Object generatedUrls = place.getUrls();
		flickcurl_shapedata_s flickcurl_shapedata_s = new flickcurl_shapedata_s();
		Object generatedShape = place.getShape();
		Object generatedWoe_ids = place.getWoe_ids();
		Object generatedLocation = place.getLocation();
		int generatedFailed = this.getFailed();
		if (place_count_p) {
			place_count_p = place_count;
		} 
		if (generatedFailed) {
			if (places) {
				places.flickcurl_free_places();
			} 
			places = ((Object)0);
		} 
		return places;
	}
	public  flickcurl_build_place(Object xpathCtx, Object xpathExpr) {
		flickcurl_place places = new flickcurl_place();
		flickcurl_place result = ((Object)0);
		places = fc.flickcurl_build_places(xpathCtx, xpathExpr, ((Object)0));
		if (places) {
			result = places[0];
			.free(places);
		} 
		return result/**
		 * flickcurl_place_type_to_id:
		 * @place_type: place type
		 *
		 * Turn a place type into a place ID
		 *
		 * Return value: place ID for type or <0 on failure
		 */;
	}
	public  flickcurl_build_place_types(Object xpathCtx, Object xpathExpr, int place_type_count_p) {
		flickcurl_place_type_info place_types = ((Object)0);
		int nodes_count;
		int place_type_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do place_types */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		place_types = (flickcurl_place_type_info).calloc(nodes_count + 1, );
		Object generatedId = pt.getId();
		Object generatedName = pt.getName();
		Object generatedType = pt.getType();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_place_type_info pt = new flickcurl_place_type_info();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			pt = (flickcurl_place_type_info).calloc(1, );
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					pt.setId(.atoi(attr_value));
					.free(attr_value);
					pt.setType(ModernizedCProgram.flickcurl_place_id_to_type(generatedId));
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					pt.setName((byte).malloc(len + 1));
					.memcpy(generatedName, chnode.getContent(), len + 1);
				} 
			}
			.fprintf((_iob[2]), "place_type: id %d  type %d  name %s\n", generatedId, generatedType, generatedName);
			place_types[place_type_count++] = pt/* for nodes */;
		}
		if (place_type_count_p) {
			place_type_count_p = place_type_count;
		} 
		return place_types/**
		 * flickcurl_free_place_type_infos:
		 * @ptis_object: list of place type info
		 *
		 * Destructor for place type info list
		 */;
	}
	public  flickcurl_build_photosets(Object xpathCtx, Object xpathExpr, int photoset_count_p) {
		flickcurl_photoset photosets = ((Object)0);
		int nodes_count;
		int photoset_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		photosets = (flickcurl_photoset).calloc(, nodes_count + 1);
		Object generatedTitle = ps.getTitle();
		Object generatedDescription = ps.getDescription();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_photoset ps = new flickcurl_photoset();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			ps = (flickcurl_photoset).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					ps.setId(attr_value);
				}  else if (!.strcmp(attr_name, "primary")) {
					ps.setPrimary(attr_value);
				}  else if (!.strcmp(attr_name, "secret")) {
					ps.setSecret(attr_value);
				}  else if (!.strcmp(attr_name, "server")) {
					ps.setServer(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "farm")) {
					ps.setFarm(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "photos")) {
					ps.setPhotos_count(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "owner")) {
					ps.setOwner(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				byte chnode_name = (byte)chnode.getName();
				if (chnode.getType() == XML_ELEMENT_NODE) {
					if (!.strcmp(chnode_name, "title")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							ps.setTitle((byte).malloc(len + 1));
							.memcpy(generatedTitle, chnode.getChildren().getContent(), len + 1);
						} 
					}  else if (!.strcmp(chnode_name, "description")) {
						if (chnode.getChildren()) {
							size_t len = .strlen((byte)chnode.getChildren().getContent());
							ps.setDescription((byte).malloc(len + 1));
							.memcpy(generatedDescription, chnode.getChildren().getContent(), len + 1);
						} 
					} 
				} 
			}
			photosets[photoset_count++] = ps/* for nodes */;
		}
		if (photoset_count_p) {
			photoset_count_p = photoset_count;
		} 
		return photosets;
	}
	public  flickcurl_build_photoset(Object xpathCtx) {
		flickcurl_photoset photosets = new flickcurl_photoset();
		flickcurl_photoset result = ((Object)0);
		photosets = fc.flickcurl_build_photosets(xpathCtx, ()"/rsp/photoset", ((Object)0));
		if (photosets) {
			result = photosets[0];
			.free(photosets);
		} 
		return result;
	}
	public  flickcurl_tags_getClusters(Object tag) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag_clusters clusters = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!tag) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("tag", tag);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.tags.getClusters")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		clusters = fc.flickcurl_build_tag_clusters(xpathCtx, ()"/rsp/clusters/cluster");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (clusters) {
				clusters.flickcurl_free_tag_clusters();
			} 
			clusters = ((Object)0);
		} 
		return clusters/**
		 * flickcurl_tags_getHotList:
		 * @fc: flickcurl context
		 * @period: The period for which to fetch hot tags. Valid values are day and
		 *   week (defaults to day).
		 * @tag_count: The number of tags to return. Defaults to 20. Maximum allowed
		 *   value is 200 (or -1 to leave as default)
		 *
		 * Returns a list of hot tags for the given period.
		 *
		 * Implements flickr.tags.getHotList (0.9)
		 * 
		 * Return value: array of #flickcurl_tag or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * flickcurl utility commands
	 *
	 * Copyright (C) 2007-2014, David Beckett http://www.dajobe.org/
	 *
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 *
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 *
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 *
	 */
	public int command_test_echo(int argc, Byte argv) {
		return fc.flickcurl_test_echo(argv[1], argv[2]);
	}
	public int command_test_login(int argc, Byte argv) {
		byte username;
		username = fc.flickcurl_test_login();
		if (username) {
			.fprintf((_iob[1]), "%s: Returned username '%s'\n", ModernizedCProgram.program, username);
			.free(username);
		} 
		return (username == ((Object)0));
	}
	public int command_test_null(int argc, Byte argv) {
		return fc.flickcurl_test_null();
	}
	public int command_people_findByEmail(int argc, Byte argv) {
		byte nsid = ((Object)0);
		byte email = argv[1];
		nsid = fc.flickcurl_people_findByEmail(email);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for user email %s\n", ModernizedCProgram.program, nsid, email);
		} 
		return (nsid == ((Object)0));
	}
	public int command_people_findByUsername(int argc, Byte argv) {
		byte nsid = ((Object)0);
		byte user_name = argv[1];
		nsid = fc.flickcurl_people_findByUsername(user_name);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for username %s\n", ModernizedCProgram.program, nsid, user_name);
		} 
		return (nsid == ((Object)0));
	}
	public int command_people_getInfo(int argc, Byte argv) {
		flickcurl_person person = new flickcurl_person();
		person = fc.flickcurl_people_getInfo(argv[1]);
		if (!person) {
			return 1;
		} 
		person.command_print_person();
		person.flickcurl_free_person();
		return 0;
	}
	public int command_photos_getInfo(int argc, Byte argv) {
		flickcurl_photo photo = new flickcurl_photo();
		byte secret = ((Object)0);
		if (argv[2]) {
			secret = argv[2];
		} 
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photo = flickcurl_photo_s.flickcurl_photos_getInfo2(fc, argv[1], secret);
		if (photo) {
			.fprintf((_iob[1]), "%s: ", ModernizedCProgram.program);
			photo.command_print_photo();
			photo.flickcurl_free_photo();
		} 
		return (photo == ((Object)0));
	}
	public int command_photos_licenses_getInfo(int argc, Byte argv) {
		flickcurl_license licenses = new flickcurl_license();
		int i;
		licenses = fc.flickcurl_photos_licenses_getInfo();
		Object generatedId = license.getId();
		Object generatedName = license.getName();
		Object generatedUrl = license.getUrl();
		if (licenses) {
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Found licenses\n", ModernizedCProgram.program);
			} 
			for (i = 0; licenses[i]; i++) {
				flickcurl_license license = licenses[i];
				.fprintf((_iob[1]), "%d) license: id %d name '%s' url %s\n", i, generatedId, generatedName, generatedUrl ? generatedUrl : "(none)");
			}
		} 
		return (licenses == ((Object)0));
	}
	public int command_urls_lookupUser(int argc, Byte argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = fc.flickcurl_urls_lookupUser(url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for user profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (nsid == ((Object)0));
	}
	public int command_groups_pools_getContext(int argc, Byte argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = fc.flickcurl_groups_pools_getContext(argv[1], argv[2]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Pool context of photo %s in pool %s:\n", ModernizedCProgram.program, argv[1], argv[2]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		contexts.flickcurl_free_contexts();
		return 0;
	}
	public int command_photos_getAllContexts(int argc, Byte argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = fc.flickcurl_photos_getAllContexts(argv[1]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos %s all contexts:\n", ModernizedCProgram.program, argv[1]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		contexts.flickcurl_free_contexts();
		return 0;
	}
	public int command_photos_getContext(int argc, Byte argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = fc.flickcurl_photos_getContext(argv[1]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos %s context:\n", ModernizedCProgram.program, argv[1]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		contexts.flickcurl_free_contexts();
		return 0;
	}
	public int command_photos_getCounts(int argc, Byte argv) {
		byte dates_array = ((Object)0);
		byte taken_dates_array = ((Object)0);
		int counts;
		if (argv[1]) {
			dates_array = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
			if (argv[2]) {
				taken_dates_array = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
			} 
		} 
		counts = fc.flickcurl_photos_getCounts((byte)dates_array, (byte)taken_dates_array);
		if (counts) {
			int i;
			for (i = 0; counts[i]; i++) {
				.fprintf((_iob[1]), "%s: photocount %i: count %d  fromdate %d  todate %d\n", ModernizedCProgram.program, i, counts[i][0], counts[i][1], counts[i][2]);
			}
			.free(counts);
		} 
		if (dates_array) {
			ModernizedCProgram.flickcurl_array_free(dates_array);
		} 
		if (taken_dates_array) {
			ModernizedCProgram.flickcurl_array_free(taken_dates_array);
		} 
		return (counts == ((Object)0));
	}
	public int command_photosets_getContext(int argc, Byte argv) {
		flickcurl_context contexts = new flickcurl_context();
		contexts = fc.flickcurl_photosets_getContext(argv[1], argv[2]);
		if (!contexts) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo %s in photoset %s context:\n", ModernizedCProgram.program, argv[1], argv[2]);
		} 
		ModernizedCProgram.command_contexts_print((_iob[1]), contexts);
		contexts.flickcurl_free_contexts();
		return 0;
	}
	public int command_auth_getFrob(int argc, Byte argv) {
		byte frob;
		frob = fc.flickcurl_auth_getFrob();
		if (!frob) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got frob: %s\n", ModernizedCProgram.program, frob);
		.free(frob);
		return 0;
	}
	public int command_auth_checkToken(int argc, Byte argv) {
		byte perms;
		perms = fc.flickcurl_auth_checkToken(argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Checked token %s and got perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public int command_auth_getToken(int argc, Byte argv) {
		byte perms;
		perms = fc.flickcurl_auth_getToken(argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got token %s perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public int command_auth_getFullToken(int argc, Byte argv) {
		byte perms;
		perms = fc.flickcurl_auth_getFullToken(argv[1]);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Got full token %s perms: %s\n", ModernizedCProgram.program, argv[1], perms);
		.free(perms);
		return 0;
	}
	public int command_tags_getListPhoto(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte photo_id = argv[1];
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getListPhoto(fc, photo_id);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("Photo ID", photo_id);
		.free(tags);
		return 0;
	}
	public int command_tags_getListUser(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte user_id = argv[1];
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getListUser(fc, user_id);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("User ID", user_id);
		.free(tags);
		return 0;
	}
	public int command_tags_getListUserPopular(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte user_id = ((Object)0);
		int pop_count = -1;
		if (argv[1]) {
			user_id = argv[1];
			if (argv[2]) {
				pop_count = .atoi(argv[2]);
			} 
		} 
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getListUserPopular(fc, user_id, pop_count);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("User ID", user_id);
		.free(tags);
		return 0;
	}
	public int command_tags_getListUserRaw(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte tag = argv[1];
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getListUserRaw(fc, tag);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("Tag", tag);
		.free(tags);
		return 0;
	}
	public int command_tags_getRelated(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte tag = argv[1];
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getRelated(fc, tag);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("Related to Tag", tag);
		.free(tags);
		return 0;
	}
	public int command_urls_getGroup(int argc, Byte argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = fc.flickcurl_urls_getGroup(url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for group profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (nsid == ((Object)0));
	}
	public int command_urls_getUserPhotos(int argc, Byte argv) {
		byte url = ((Object)0);
		byte user = argv[1];
		url = fc.flickcurl_urls_getUserPhotos(user);
		if (url) {
			.fprintf((_iob[1]), "%s: photo URL %s for user %s\n", ModernizedCProgram.program, url, user);
		} 
		return (url == ((Object)0));
	}
	public int command_urls_getUserProfile(int argc, Byte argv) {
		byte url = ((Object)0);
		byte user = argv[1];
		url = fc.flickcurl_urls_getUserProfile(user);
		if (url) {
			.fprintf((_iob[1]), "%s: photo URL %s for user %s\n", ModernizedCProgram.program, url, user);
		} 
		return (url == ((Object)0));
	}
	public int command_urls_lookupGroup(int argc, Byte argv) {
		byte nsid = ((Object)0);
		byte url = argv[1];
		nsid = fc.flickcurl_urls_lookupGroup(url);
		if (nsid) {
			.fprintf((_iob[1]), "%s: NSID %s for group profile/photo URL %s\n", ModernizedCProgram.program, nsid, url);
		} 
		return (url == ((Object)0));
	}
	public int command_tags_getHotList(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		byte period = ((Object)0);
		int count = -1;
		if (argv[1]) {
			period = argv[1];
			if (argv[2]) {
				count = .atoi(argv[2]);
			} 
		} 
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getHotList(fc, period, count);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags("Hot tags for period", (period ? period : "day"));
		.free(tags);
		return 0;
	}
	public int command_photos_addTags(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte tags = argv[2];
		return fc.flickcurl_photos_addTags(photo_id, tags);
	}
	public int command_photos_delete(int argc, Byte argv) {
		byte photo_id = argv[1];
		return fc.flickcurl_photos_delete(photo_id);
	}
	public int command_photos_removeTag(int argc, Byte argv) {
		byte tag_id = argv[1];
		return fc.flickcurl_photos_removeTag(tag_id);
	}
	public int command_photos_setTags(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte tags = argv[2];
		return fc.flickcurl_photos_setTags(photo_id, tags);
	}
	public int command_reflection_getMethodInfo(int argc, Byte argv) {
		flickcurl_method method = new flickcurl_method();
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		method = flickcurl_method_s.flickcurl_reflection_getMethodInfo(fc, argv[1]);
		Byte generatedName = method.getName();
		int generatedNeedslogin = method.getNeedslogin();
		Byte generatedDescription = method.getDescription();
		Byte generatedResponse = method.getResponse();
		Byte generatedExplanation = method.getExplanation();
		int generatedArgs_count = method.getArgs_count();
		flickcurl_arg_s generatedArgs = method.getArgs();
		int generatedOptional = arg.getOptional();
		if (method) {
			.fprintf((_iob[1]), "%s: Found method %s\n", ModernizedCProgram.program, generatedName);
			.fprintf((_iob[1]), "  Needs Login? %s\n", (generatedNeedslogin ? "yes" : "no"));
			.fprintf((_iob[1]), "  Description: %s\n", generatedDescription);
			.fprintf((_iob[1]), "  Response: '%s'\n", generatedResponse);
			.fprintf((_iob[1]), "  Explanation of Response: %s\n", generatedExplanation ? generatedExplanation : "(None)");
			if (generatedArgs_count) {
				int i;
				.fprintf((_iob[1]), "%s: %d argument%s:\n", ModernizedCProgram.program, generatedArgs_count, ((generatedArgs_count != 1) ? "s" : ""));
				for (i = 0; generatedArgs[i]; i++) {
					flickcurl_arg arg = generatedArgs[i];
					.fprintf((_iob[1]), "%d) argument '%s' %s description: '%s'\n", i, generatedName, (generatedOptional ? "" : "(required)"), generatedDescription);
				}
			} else {
					.fprintf((_iob[1]), "%s: No arguments\n", ModernizedCProgram.program);
			} 
			method.flickcurl_free_method();
		} 
		return (method == ((Object)0));
	}
	public int command_reflection_getMethods(int argc, Byte argv) {
		byte methods;
		methods = fc.flickcurl_reflection_getMethods();
		if (methods) {
			int i;
			.fprintf((_iob[1]), "%s: Found methods:\n", ModernizedCProgram.program);
			for (i = 0; methods[i]; i++) {
				.printf("%d) %s\n", i, methods[i]);
			}
			for (i = 0; methods[i]; i++) {
				.free(methods[i]);
			}
			.free(methods);
		} 
		return (methods == ((Object)0));
	}
	public int command_photos_comments_addComment(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte comment_text = argv[2];
		byte id;
		id = fc.flickcurl_photos_comments_addComment(photo_id, comment_text);
		if (id) {
			.fprintf((_iob[1]), "%s: Added comment '%s' to photo %s giving comment ID %s\n", ModernizedCProgram.program, photo_id, comment_text, id);
		} 
		return (id == ((Object)0));
	}
	public int command_photos_comments_deleteComment(int argc, Byte argv) {
		byte comment_id = argv[1];
		return fc.flickcurl_photos_comments_deleteComment(comment_id);
	}
	public int command_photos_comments_editComment(int argc, Byte argv) {
		byte comment_id = argv[1];
		byte comment_text = argv[2];
		return fc.flickcurl_photos_comments_editComment(comment_id, comment_text);
	}
	public int command_photos_comments_getList(int argc, Byte argv) {
		byte photo_id = argv[1];
		flickcurl_comment comments = new flickcurl_comment();
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_photos_comments_getList(fc, photo_id);
		if (!comments) {
			return 1;
		} 
		comments.command_print_comments("Photo ID", photo_id);
		comments.flickcurl_free_comments();
		return 0;
	}
	public int command_photosets_comments_addComment(int argc, Byte argv) {
		byte photoset_id = argv[1];
		byte comment_text = argv[2];
		byte id;
		id = fc.flickcurl_photosets_comments_addComment(photoset_id, comment_text);
		if (id) {
			.fprintf((_iob[1]), "%s: Added comment '%s' to photoset %s giving comment ID %s\n", ModernizedCProgram.program, photoset_id, comment_text, id);
			.free(id);
		} 
		return (id == ((Object)0));
	}
	public int command_photosets_comments_deleteComment(int argc, Byte argv) {
		byte comment_id = argv[1];
		return fc.flickcurl_photosets_comments_deleteComment(comment_id);
	}
	public int command_photosets_comments_editComment(int argc, Byte argv) {
		byte comment_id = argv[1];
		byte comment_text = argv[2];
		return fc.flickcurl_photosets_comments_editComment(comment_id, comment_text);
	}
	public int command_photosets_comments_getList(int argc, Byte argv) {
		byte photoset_id = argv[1];
		flickcurl_comment comments = new flickcurl_comment();
		flickcurl_comment_s flickcurl_comment_s = new flickcurl_comment_s();
		comments = flickcurl_comment_s.flickcurl_photosets_comments_getList(fc, photoset_id);
		if (!comments) {
			return 1;
		} 
		comments.command_print_comments("Photoset ID", photoset_id);
		comments.flickcurl_free_comments();
		return 0;
	}
	public int command_upload(int argc, byte argv) {
		byte tags_string = ((Object)0);
		flickcurl_upload_status status = ((Object)0);
		int usage = 0;
		flickcurl_upload_params params = new flickcurl_upload_params();
		.memset(params, (byte)'\0', );
		params.setSafety_level(/* default safe */1);
		params.setContent_type(/* default photo */1);
		params.setHidden(/* default public */1);
		argv++;
		argc--;
		params.setPhoto_file(argv[0]);
		Object generatedPhoto_file = params.getPhoto_file();
		if (.access((byte)generatedPhoto_file, R_OK)) {
			.fprintf((_iob[2]), "%s: Failed to read image filename '%s': %s\n", ModernizedCProgram.program, generatedPhoto_file, .strerror(errno));
			status = ((Object)0);
			;
		} 
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "description")) {
				params.setDescription(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "title")) {
				params.setTitle(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "safety_level")) {
				params.setSafety_level(ModernizedCProgram.flickcurl_get_safety_level_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "content_type")) {
				params.setContent_type(ModernizedCProgram.flickcurl_get_content_type_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "hidden")) {
				params.setHidden(ModernizedCProgram.flickcurl_get_hidden_from_string(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "friend")) {
				params.setIs_friend(1);
			}  else if (!.strcmp(field, "family")) {
				params.setIs_family(1);
			}  else if (!.strcmp(field, "public")) {
				params.setIs_public(1);
			}  else if (!.strcmp(field, "tags")) {
				size_t tags_len = 0;
				int i;
				byte p;
				for (i = 0; i < argc; /* tags absorb all remaining parameters */i++) {
					tags_len += .strlen(argv[i]) + 1;
				}
				tags_string = (byte).malloc(tags_len);
				p = tags_string;
				for (i = 0; i < argc; i++) {
					size_t tag_len = .strlen(argv[i]);
					.strncpy(p, argv[i], tag_len);
					p += tag_len;
					p++ = (byte)' ';
				}
				(--p) = (byte)'\0';
				params.setTags(tags_string);
				break;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, field);
					usage = 1;
			} 
		}
		if (usage) {
			status = ((Object)0);
			;
		} 
		if (ModernizedCProgram.verbose == 1) {
			.fprintf((_iob[1]), "%s: Uploading file %s\n", ModernizedCProgram.program, generatedPhoto_file);
		}  else if (ModernizedCProgram.verbose > 1) {
			ModernizedCProgram.print_upload_params((_iob[1]), params, "Photo upload");
		} 
		status = ModernizedCProgram.flickcurl_photos_upload_params(fc, params);
		if (status) {
			ModernizedCProgram.print_upload_status((_iob[1]), status, "Photo upload");
			status.flickcurl_free_upload_status();
		} 
		return (status == ((Object)0));
	}
	public int command_replace(int argc, Byte argv) {
		byte file = argv[1];
		byte photo_id = argv[2];
		int async = 0;
		flickcurl_upload_status status = ((Object)0);
		if (.access((byte)file, R_OK)) {
			.fprintf((_iob[2]), "%s: Failed to read image filename '%s': %s\n", ModernizedCProgram.program, file, .strerror(errno));
			status = ((Object)0);
			;
		} 
		if (argc > 3 && !.strcmp(argv[3], "async")) {
			async = 1;
		} 
		status = fc.flickcurl_photos_replace(file, photo_id, async);
		if (status) {
			ModernizedCProgram.print_upload_status((_iob[1]), status, "Photo replace");
			status.flickcurl_free_upload_status();
		} 
	}
	public int command_photos_setContentType(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte content_type_str = argv[2];
		int content_type;
		content_type = ModernizedCProgram.flickcurl_get_content_type_from_string(content_type_str);
		if (content_type < 0) {
			.fprintf((_iob[2]), "%s: Bad content type '%s'\n", ModernizedCProgram.program, content_type_str);
			return 1;
		} 
		content_type_str = ModernizedCProgram.flickcurl_get_content_type_label(content_type);
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Setting photo %s to content type %d (%s)\n", ModernizedCProgram.program, photo_id, content_type, content_type_str);
		} 
		return fc.flickcurl_photos_setContentType(photo_id, content_type);
	}
	public int command_photos_setDates(int argc, Byte argv) {
		byte photo_id = argv[1];
		int date_posted = -1;
		int date_taken = -1;
		int date_taken_granularity = -1;
		date_posted = .curl_getdate(argv[2], ((Object)0));
		date_taken = .curl_getdate(argv[3], ((Object)0));
		date_taken_granularity = .atoi(argv[4]);
		return fc.flickcurl_photos_setDates(photo_id, date_posted, date_taken, date_taken_granularity);
	}
	public int command_photos_setMeta(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte title = argv[2];
		byte description = argv[3];
		return fc.flickcurl_photos_setMeta(photo_id, title, description);
	}
	public int command_photos_setPerms(int argc, Byte argv) {
		byte photo_id = argv[1];
		int is_public = ModernizedCProgram.parse_bool_param(argv[2]);
		int is_friend = ModernizedCProgram.parse_bool_param(argv[3]);
		int is_family = ModernizedCProgram.parse_bool_param(argv[4]);
		int perm_comment = .atoi(argv[5]);
		int perm_addmeta = .atoi(argv[6]);
		flickcurl_perms perms = new flickcurl_perms();
		.memset(perms, (byte)'\0', );
		perms.setIs_public(is_public);
		perms.setIs_friend(is_friend);
		perms.setIs_family(is_family);
		perms.setPerm_comment(perm_comment);
		perms.setPerm_addmeta(perm_addmeta);
		return ModernizedCProgram.flickcurl_photos_setPerms(fc, photo_id, perms);
	}
	public int command_photos_setSafetyLevel(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte safety_level_str = argv[2];
		int hidden = ModernizedCProgram.parse_bool_param(argv[3]);
		int safety_level;
		safety_level = ModernizedCProgram.flickcurl_get_safety_level_from_string(safety_level_str);
		if (safety_level < 0) {
			.fprintf((_iob[2]), "%s: Bad safety level '%s'\n", ModernizedCProgram.program, safety_level_str);
			return 1;
		} 
		safety_level_str = ModernizedCProgram.flickcurl_get_safety_level_label(safety_level);
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Setting photo %s safety level to %d (%s), hidden %d\n", ModernizedCProgram.program, photo_id, safety_level, safety_level_str, hidden);
		} 
		return fc.flickcurl_photos_setSafetyLevel(photo_id, safety_level, hidden);
	}
	public int command_photos_getPerms(int argc, Byte argv) {
		byte photo_id = argv[1];
		flickcurl_perms perms = new flickcurl_perms();
		perms = fc.flickcurl_photos_getPerms(photo_id);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s permissions\n", ModernizedCProgram.program, photo_id);
		perms.command_print_perms(1);
		perms.flickcurl_free_perms();
		return 0;
	}
	public int command_photos_getContactsPhotos(int argc, Byte argv) {
		int contact_count = 10;
		int just_friends = 0;
		int single_photo = 1;
		int include_self = 0;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 1) {
			list_params.setExtras(argv[1]);
			if (argc > 2) {
				list_params.setFormat(argv[2]);
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPhotos_params(fc, contact_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Contact photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photos_search(int argc, byte argv) {
		byte tags_string = ((Object)0);
		int usage = 0;
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_search_params params = new flickcurl_search_params();
		flickcurl_photos_list photos_list = ((Object)0);
		list_params.flickcurl_photos_list_params_init();
		params.flickcurl_search_params_init();
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "user")) {
				params.setUser_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "tag-mode")) {
				params.setTag_mode(argv[/* "any" or "all" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "text")) {
				params.setText(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload-date")) {
				params.setMin_upload_date(.curl_getdate(argv[0], ((Object)/* timestamp */0)));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload-date")) {
				params.setMax_upload_date(.curl_getdate(argv[0], ((Object)/* timestamp */0)));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken-date")) {
				params.setMin_taken_date(argv[/* MYSQL datetime */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken-date")) {
				params.setMax_taken_date(argv[/* MYSQL datetime */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "license")) {
				params.setLicense(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "sort"/* date-posted-asc, date-posted-desc (default), date-taken-asc,
			       * date-taken-desc, interestingness-desc, interestingness-asc,
			       * and relevance
			       */)) {
				params.setSort(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "privacy")) {
				params.setPrivacy_filter(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "bbox")) {
				params.setBbox(argv[/* "a,b,c,d" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "accuracy")) {
				params.setAccuracy(.atoi(argv[/* int 1-16 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "safe-search")) {
				params.setSafe_search(.atoi(argv[/* int Safe search setting: 1 safe, 2 moderate, 3 restricted. */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "type"/* int Content Type setting: 1 for photos only, 2 for screenshots
			       * only, 3 for 'other' only, 4 for all types. */)) {
				params.setContent_type(.atoi(argv[0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "machine-tags")) {
				params.setMachine_tags(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "machine-tag-mode")) {
				params.setMachine_tag_mode(argv[/* any (default) or all */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "group-id")) {
				params.setGroup_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "extras")) {
				list_params.setExtras(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "place-id")) {
				params.setPlace_id(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "media")) {
				params.setMedia(argv[/* "all" (default if missing) or "photos" or "video" */0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "has-geo")) {
				params.setHas_geo(1);
			}  else if (!.strcmp(field, "lat")) {
				params.setLat(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "lon")) {
				params.setLon(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "radius")) {
				params.setRadius(.atoi(argv[/* double: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "radius-units")) {
				params.setRadius_units(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "contacts")) {
				params.setContacts(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "woeid")) {
				params.setWoe_id(.atoi(argv[/* int: */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "geo-context")) {
				params.setGeo_context(.atoi(argv[/* int: 0 (not defined)  1 (indoors)  2(outdoors) default 0 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "is-commons")) {
				params.setIs_commons(1);
			}  else if (!.strcmp(field, "in-gallery")) {
				params.setIn_gallery(1);
			}  else if (!.strcmp(field, "tags")) {
				size_t tags_len = 0;
				int j;
				byte p;
				for (j = 0; j < argc; /* tags absorb all remaining parameters */j++) {
					tags_len += .strlen(argv[j]) + 1;
				}
				tags_string = (byte).malloc(tags_len);
				p = tags_string;
				for (j = 0; j < argc; j++) {
					size_t tag_len = .strlen(argv[j]);
					.strncpy(p, argv[j], tag_len);
					p += tag_len;
					p++ = (byte)',';
				}
				(--p) = (byte)'\0';
				params.setTags(tags_string);
				break;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			photos_list = ((Object)0);
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_search_params(fc, params, list_params);
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Searching failed\n", ModernizedCProgram.program);
		} else {
				int rc;
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Search result");
				photos_list.flickcurl_free_photos_list();
				if (rc) {
					photos_list = ((Object)0);
				} 
		} 
		return (photos_list == ((Object)0));
	}
	public int command_photos_geo_getLocation(int argc, Byte argv) {
		byte photo_id = argv[1];
		flickcurl_location location = new flickcurl_location();
		location = fc.flickcurl_photos_geo_getLocation(photo_id);
		if (!location) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s location\n  ", ModernizedCProgram.program, photo_id);
		location.command_print_location();
		location.flickcurl_free_location();
		return 0;
	}
	public int command_photos_geo_getPerms(int argc, Byte argv) {
		byte photo_id = argv[1];
		flickcurl_perms perms = new flickcurl_perms();
		perms = fc.flickcurl_photos_geo_getPerms(photo_id);
		if (!perms) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID %s geo permissions:\n", ModernizedCProgram.program, photo_id);
		perms.command_print_perms(0);
		perms.flickcurl_free_perms();
		return 0;
	}
	public int command_photos_geo_removeLocation(int argc, Byte argv) {
		byte photo_id = argv[1];
		return fc.flickcurl_photos_geo_removeLocation(photo_id);
	}
	public int command_photos_geo_setLocation(int argc, Byte argv) {
		byte photo_id = argv[1];
		double latitude = .atof(argv[2]);
		double longitude = .atof(argv[3]);
		int accuracy = .atoi(argv[4]);
		flickcurl_location location = new flickcurl_location();
		.memset(location, (byte)'\0', );
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setAccuracy(accuracy);
		return ModernizedCProgram.flickcurl_photos_geo_setLocation(fc, photo_id, location);
	}
	public int command_photos_geo_setPerms(int argc, Byte argv) {
		byte photo_id = argv[1];
		int is_public = ModernizedCProgram.parse_bool_param(argv[2]);
		int is_contact = ModernizedCProgram.parse_bool_param(argv[3]);
		int is_friend = ModernizedCProgram.parse_bool_param(argv[4]);
		int is_family = ModernizedCProgram.parse_bool_param(argv[5]);
		flickcurl_perms perms = new flickcurl_perms();
		.memset(perms, (byte)'\0', );
		perms.setIs_public(is_public);
		perms.setIs_contact(is_contact);
		perms.setIs_friend(is_friend);
		perms.setIs_family(is_family);
		return ModernizedCProgram.flickcurl_photos_geo_setPerms(fc, photo_id, perms);
	}
	public int command_photos_notes_add(int argc, Byte argv) {
		byte photo_id = argv[1];
		int note_x = .atoi(argv[2]);
		int note_y = .atoi(argv[3]);
		int note_w = .atoi(argv[4]);
		int note_h = .atoi(argv[5]);
		byte note_text = argv[6];
		byte id;
		id = fc.flickcurl_photos_notes_add(photo_id, note_x, note_y, note_w, note_h, note_text);
		if (id) {
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Added note '%s' (x:%d y:%d w:%d h:%d) to photo ID %s giving note ID %s\n", ModernizedCProgram.program, note_text, note_x, note_y, note_w, note_h, photo_id, id);
			} 
			.free(id);
		} 
		return (id == ((Object)0));
	}
	public int command_photos_notes_delete(int argc, Byte argv) {
		byte note_id = argv[1];
		return fc.flickcurl_photos_notes_delete(note_id);
	}
	public int command_photos_notes_edit(int argc, Byte argv) {
		byte note_id = argv[1];
		int note_x = .atoi(argv[2]);
		int note_y = .atoi(argv[3]);
		int note_w = .atoi(argv[4]);
		int note_h = .atoi(argv[5]);
		byte note_text = argv[6];
		return fc.flickcurl_photos_notes_edit(note_id, note_x, note_y, note_w, note_h, note_text);
	}
	public int command_photos_licenses_setLicense(int argc, Byte argv) {
		byte photo_id = argv[1];
		int license_id = .atoi(argv[2]);
		return fc.flickcurl_photos_licenses_setLicense(photo_id, license_id);
	}
	public int command_people_getPublicPhotos(int argc, Byte argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPublicPhotos_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: User %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_groups_pools_add(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte group_id = argv[2];
		return fc.flickcurl_groups_pools_add(photo_id, group_id);
	}
	public int command_groups_pools_getGroups(int argc, Byte argv) {
		int per_page = 10;
		int page = 0;
		flickcurl_group groups = ((Object)0);
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
			} 
		} 
		groups = fc.flickcurl_groups_pools_getGroups(page, per_page);
		if (groups) {
			int i;
			if (ModernizedCProgram.verbose) {
				.fprintf((_iob[1]), "%s: Groups (page %d, per page %d)\n", ModernizedCProgram.program, page, per_page);
			} 
			for (i = 0; groups[i]; i++) {
				groups[i].command_print_group();
			}
			groups.flickcurl_free_groups();
		} 
		return (groups == ((Object)0));
	}
	public int command_groups_pools_getPhotos(int argc, Byte argv) {
		byte group_id = argv[1];
		byte tags = ((Object)0);
		byte user_id = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_groups_pools_getPhotos_params(fc, group_id, tags, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Group %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, group_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_groups_pools_remove(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte group_id = argv[2];
		return fc.flickcurl_groups_pools_remove(photo_id, group_id);
	}
	public int command_photos_getContactsPublicPhotos(int argc, Byte argv) {
		byte user_id = argv[1];
		int contact_count = 10;
		int just_friends = 0;
		int single_photo = 1;
		int include_self = 0;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setFormat(argv[2]);
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getContactsPublicPhotos_params(fc, user_id, contact_count, just_friends, single_photo, include_self, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Contact Public Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photos_getExif(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte secret = ((Object)0);
		flickcurl_exif exifs = new flickcurl_exif();
		int i;
		exifs = fc.flickcurl_photos_getExif(photo_id, secret);
		if (!exifs) {
			return 1;
		} 
		for (i = 0; exifs[i]; i++) {
			exifs[i].command_print_exif();
		}
		exifs.flickcurl_free_exifs();
		return 0;
	}
	public int command_photos_getFavorites(int argc, Byte argv) {
		byte photo_id = argv[1];
		int i;
		int per_page = 10;
		int page = 0;
		flickcurl_person persons = new flickcurl_person();
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		persons = fc.flickcurl_photos_getFavorites(photo_id, page, per_page);
		if (!persons) {
			return 1;
		} 
		for (i = 0; persons[i]; i++) {
			persons[i].command_print_person();
		}
		persons.flickcurl_free_persons();
		return 0;
	}
	public int command_photoslist(int argc, Byte argv, Object api_fn, Object label) {
		int min_upload_date = -1;
		int max_upload_date = -1;
		byte min_taken_date = ((Object)0);
		byte max_taken_date = ((Object)0);
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[1]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[2]));
				if (argc > 3) {
					list_params.setFormat(argv[3]);
				} 
			} 
		} 
		photos_list = .api_fn(fc, min_upload_date, max_upload_date, min_taken_date, max_taken_date, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photos_getNotInSet(int argc, Byte argv) {
		return fc.command_photoslist(argc, argv, ModernizedCProgram.flickcurl_photos_getNotInSet_params, "Photo not in set");
	}
	public int command_photos_getSizes(int argc, Byte argv) {
		flickcurl_size sizes = ((Object)0);
		byte photo_id = argv[1];
		int i;
		sizes = fc.flickcurl_photos_getSizes(photo_id);
		if (!sizes) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Sizes for photo/video %s\n", ModernizedCProgram.program, photo_id);
		} 
		for (i = 0; sizes[i]; i++) {
			.fprintf((_iob[1]), "%d: type '%s' label '%s' width %d height %d\n  source %s\n  url %s\n", i, sizes[i].getMedia(), sizes[i].getLabel(), sizes[i].getWidth(), sizes[i].getHeight(), sizes[i].getSource(), sizes[i].getUrl());
		}
		sizes.flickcurl_free_sizes();
		return 0;
	}
	public int command_photos_getRecent(int argc, Byte argv) {
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[1]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[2]));
				if (argc > 3) {
					list_params.setFormat(argv[3]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_getRecent_params(fc, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recent Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photos_getUntagged(int argc, Byte argv) {
		return fc.command_photoslist(argc, argv, ModernizedCProgram.flickcurl_photos_getUntagged_params, "Untagged photo");
	}
	public int command_photos_getWithGeoData(int argc, Byte argv) {
		return fc.command_photoslist(argc, argv, ModernizedCProgram.flickcurl_photos_getWithGeoData_params, "Photo with geo data");
	}
	public int command_photos_getWithoutGeoData(int argc, Byte argv) {
		return fc.command_photoslist(argc, argv, ModernizedCProgram.flickcurl_photos_getWithoutGeoData_params, "Photo without geo data");
	}
	public int command_photos_recentlyUpdated(int argc, Byte argv) {
		int min_date = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		min_date = .atoi(argv[1]);
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_recentlyUpdated_params(fc, min_date, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recently Updated Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photosets_getInfo(int argc, Byte argv) {
		flickcurl_photoset photoset = ((Object)0);
		byte photoset_id = argv[1];
		photoset = fc.flickcurl_photosets_getInfo(photoset_id);
		if (photoset) {
			photoset.command_print_photoset();
			photoset.flickcurl_free_photoset();
		} 
		return (photoset == ((Object)0));
	}
	public int command_photosets_getList(int argc, Byte argv) {
		flickcurl_photoset photoset_list = ((Object)0);
		byte user_id = argv[1];
		int i;
		photoset_list = fc.flickcurl_photosets_getList(user_id);
		if (!photoset_list) {
			return 1;
		} 
		for (i = 0; photoset_list[i]; i++) {
			.fprintf((_iob[1]), "%s: Photoset %d\n", ModernizedCProgram.program, i);
			photoset_list[i].command_print_photoset();
		}
		photoset_list.flickcurl_free_photosets();
		return 0;
	}
	public int command_photosets_getPhotos(int argc, Byte argv) {
		byte photoset_id = argv[1];
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setExtras(argv[2]);
			if (argc > 3) {
				privacy_filter = .atoi(argv[3]);
				if (argc > 4) {
					list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setPage(ModernizedCProgram.parse_page_param(argv[5]));
						if (argc > 6) {
							list_params.setFormat(argv[6]);
						} 
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_photosets_getPhotos_params(fc, photoset_id, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, photoset_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photosets_addPhoto(int argc, Byte argv) {
		return fc.flickcurl_photosets_addPhoto(argv[1], argv[2]);
	}
	public int command_photosets_create(int argc, Byte argv) {
		byte title = argv[1];
		byte description = argv[2];
		byte primary_photo_id = argv[3];
		byte url = ((Object)0);
		byte id;
		id = fc.flickcurl_photosets_create(title, description, primary_photo_id, url);
		if (!id) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photoset %s created with URL %s\n", ModernizedCProgram.program, id, url);
		.free(url);
		.free(id);
		return 0;
	}
	public int command_photosets_delete(int argc, Byte argv) {
		return fc.flickcurl_photosets_delete(argv[1]);
	}
	public int command_photosets_editMeta(int argc, Byte argv) {
		return fc.flickcurl_photosets_editMeta(argv[1], argv[2], argv[3]);
	}
	public int command_photosets_editPhotos(int argc, Byte argv) {
		byte photoset_id = argv[1];
		byte primary_photo_id = argv[2];
		byte photo_ids = ModernizedCProgram.flickcurl_array_split(argv[3], (byte)',');
		int rc;
		rc = fc.flickcurl_photosets_editPhotos(photoset_id, primary_photo_id, (byte)photo_ids);
		ModernizedCProgram.flickcurl_array_free(photo_ids);
		return rc;
	}
	public int command_photosets_orderSets(int argc, Byte argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
		int rc;
		rc = fc.flickcurl_photosets_orderSets((byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public int command_photosets_removePhoto(int argc, Byte argv) {
		return fc.flickcurl_photosets_removePhoto(argv[1], argv[2]);
	}
	public int command_photos_upload_checkTickets(int argc, Byte argv) {
		flickcurl_ticket tickets = ((Object)0);
		byte tickets_ids = ModernizedCProgram.flickcurl_array_split(argv[1], (byte)',');
		tickets = fc.flickcurl_photos_upload_checkTickets((byte)tickets_ids);
		if (tickets) {
			int i;
			for (i = 0; tickets[i]; i++) {
				.fprintf((_iob[1]), "%s: %d) ticket ID %d  photoID %d  complete %d  invalid %d\n", ModernizedCProgram.program, i, tickets[i].getId(), tickets[i].getPhotoid(), tickets[i].getComplete(), tickets[i].getInvalid());
			}
			tickets.flickcurl_free_tickets();
		} 
		if (tickets_ids) {
			ModernizedCProgram.flickcurl_array_free(tickets_ids);
		} 
		return (tickets != ((Object)0));
	}
	public int command_groups_browse(int argc, Byte argv) {
		int cat_id = -1;
		flickcurl_category category = ((Object)0);
		if (argv[1]) {
			cat_id = .atoi(argv[1]);
		} 
		flickcurl_category_s flickcurl_category_s = new flickcurl_category_s();
		category = flickcurl_category_s.flickcurl_groups_browse(fc, cat_id);
		if (category) {
			category.command_print_category();
			category.flickcurl_free_category();
		} 
		return (category == ((Object)0));
	}
	public int command_groups_getInfo(int argc, Byte argv) {
		flickcurl_group group = ((Object)0);
		byte group_id = argv[1];
		byte lang = argv[2];
		group = fc.flickcurl_groups_getInfo(group_id, lang);
		if (group) {
			group.command_print_group();
			group.flickcurl_free_group();
		} 
		return (group == ((Object)0));
	}
	public int command_groups_search(int argc, Byte argv) {
		byte text = argv[1];
		int per_page = -1;
		int page = -1;
		flickcurl_group groups = ((Object)0);
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		groups = fc.flickcurl_groups_search(text, per_page, page);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			groups[i].command_print_group();
		}
		groups.flickcurl_free_groups();
		return 0;
	}
	public int command_people_getPublicGroups(int argc, Byte argv) {
		byte user_id = argv[1];
		flickcurl_group groups = ((Object)0);
		int i;
		groups = fc.flickcurl_people_getPublicGroups(user_id);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			groups[i].command_print_group();
		}
		groups.flickcurl_free_groups();
		return 0;
	}
	public int command_people_getUploadStatus(int argc, Byte argv) {
		flickcurl_user_upload_status u = new flickcurl_user_upload_status();
		u = fc.flickcurl_people_getUploadStatus();
		if (!u) {
			return 1;
		} 
		Object generatedUsername = u.getUsername();
		Object generatedBandwidth_maxbytes = u.getBandwidth_maxbytes();
		Object generatedBandwidth_maxkb = u.getBandwidth_maxkb();
		Object generatedBandwidth_usedbytes = u.getBandwidth_usedbytes();
		Object generatedBandwidth_usedkb = u.getBandwidth_usedkb();
		Object generatedBandwidth_remainingbytes = u.getBandwidth_remainingbytes();
		Object generatedBandwidth_remainingkb = u.getBandwidth_remainingkb();
		Object generatedFilesize_maxbytes = u.getFilesize_maxbytes();
		Object generatedFilesize_maxkb = u.getFilesize_maxkb();
		Object generatedSets_created = u.getSets_created();
		Object generatedSets_remaining = u.getSets_remaining();
		.fprintf((_iob[1]), "user upload status for %s:\n  bandwidth max %d/%d K  used %d/%d K  remaining %d/%d K\n  max filesize %d/%d K  sets created %d remaining %s\n", generatedUsername, generatedBandwidth_maxbytes, generatedBandwidth_maxkb, generatedBandwidth_usedbytes, generatedBandwidth_usedkb, generatedBandwidth_remainingbytes, generatedBandwidth_remainingkb, generatedFilesize_maxbytes, generatedFilesize_maxkb, generatedSets_created, (generatedSets_remaining ? generatedSets_remaining : ""));
		u.flickcurl_free_user_upload_status();
		return 0;
	}
	public int command_photos_transform_rotate(int argc, Byte argv) {
		byte photo_id = argv[1];
		int degrees = .atoi(argv[2]);
		return fc.flickcurl_photos_transform_rotate(photo_id, degrees);
	}
	public int command_interestingness_getList(int argc, byte argv) {
		int usage = 0;
		byte date = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "date")) {
				date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "extras")) {
				list_params.setExtras(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, field);
					usage = 1;
			} 
		}
		if (usage) {
			photos_list = ((Object)0);
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_interestingness_getList_params(fc, date, list_params);
		if (!photos_list) {
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		if (rc) {
			photos_list = ((Object)0);
		} 
	}
	public int command_places_resolvePlaceId(int argc, Byte argv) {
		flickcurl_place place = ((Object)0);
		byte place_id = argv[1];
		place = fc.flickcurl_places_resolvePlaceId(place_id);
		if (place) {
			place.command_print_place(((Object)0), ((Object)0), 1);
			place.flickcurl_free_place();
		} 
		return (place == ((Object)0));
	}
	public int command_places_resolvePlaceURL(int argc, Byte argv) {
		flickcurl_place place = ((Object)0);
		byte place_url = argv[1];
		place = fc.flickcurl_places_resolvePlaceURL(place_url);
		if (place) {
			place.command_print_place(((Object)0), ((Object)0), 1);
			place.flickcurl_free_place();
		} 
		return (place == ((Object)0));
	}
	public int command_favorites_add(int argc, Byte argv) {
		byte photo_id = argv[1];
		return fc.flickcurl_favorites_add(photo_id);
	}
	public int command_favorites_getList(int argc, Byte argv) {
		byte user_id = argv[1];
		byte min_fave_date = ((Object)0);
		byte max_fave_date = ((Object)0);
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				min_fave_date = argv[2];
			} 
			if (argc > 3) {
				if (.strcmp(argv[3], "-")) {
					max_fave_date = argv[3];
				} 
				if (argc > 4) {
					list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setPage(ModernizedCProgram.parse_page_param(argv[5]));
						if (argc > 6) {
							list_params.setFormat(argv[6]);
						} 
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_favorites_getList2_params(fc, user_id, min_fave_date, max_fave_date, list_params);
		Object generatedPhotos_count = photos_list.getPhotos_count();
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Getting favorites failed\n", ModernizedCProgram.program);
		} else {
				int rc;
				if (ModernizedCProgram.verbose) {
					.fprintf((_iob[1]), "%s: User %s has %d favorite photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPhotos_count, generatedPer_page, generatedPage);
				} 
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Favorite photos");
				photos_list.flickcurl_free_photos_list();
				if (rc) {
					photos_list = ((Object)0);
				} 
		} 
		return (photos_list == ((Object)0));
	}
	public int command_favorites_getPublicList(int argc, Byte argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 3) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_favorites_getPublicList_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: User %s public favorite photos (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_favorites_remove(int argc, Byte argv) {
		byte photo_id = argv[1];
		return fc.flickcurl_favorites_remove(photo_id);
	}
	public int command_blogs_getList(int argc, Byte argv) {
		flickcurl_blog blogs = ((Object)0);
		blogs = fc.flickcurl_blogs_getList();
		if (blogs) {
			int i;
			for (i = 0; blogs[i]; i++) {
				.fprintf((_iob[1]), "Blog %d) id %s  name '%s'  needs password '%d'  url '%s'\n", i, blogs[i].getId(), blogs[i].getName(), blogs[i].getNeeds_password(), blogs[i].getUrl());
			}
			blogs.flickcurl_free_blogs();
		} 
		return (blogs == ((Object)0));
	}
	public int command_blogs_postPhoto(int argc, Byte argv) {
		byte blog_id = argv[1];
		byte photo_id = argv[2];
		byte title = argv[3];
		byte description = argv[4];
		byte blog_password = argv[5];
		return fc.flickcurl_blogs_postPhoto(blog_id, photo_id, title, description, blog_password);
	}
	public int command_activity_userComments(int argc, Byte argv) {
		int per_page = 10;
		int page = 0;
		flickcurl_activity activities = ((Object)0);
		int i;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
			} 
		} 
		activities = fc.flickcurl_activity_userComments(per_page, page);
		if (!activities) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Comments on the caller's photos (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		for (i = 0; activities[i]; i++) {
			.fprintf((_iob[1]), "%s: Activity %d\n", ModernizedCProgram.program, i);
			activities[i].command_print_activity();
		}
		activities.flickcurl_free_activities();
		return 0;
	}
	public int command_activity_userPhotos(int argc, Byte argv) {
		byte timeframe = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_activity activities = ((Object)0);
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		activities = fc.flickcurl_activity_userPhotos(timeframe, per_page, page);
		if (!activities) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Recent activity on the caller's photos (timeframe %s  per_page %d  page %d):\n", ModernizedCProgram.program, timeframe, per_page, page);
		} 
		for (i = 0; activities[i]; i++) {
			.fprintf((_iob[1]), "%s: Activity %d\n", ModernizedCProgram.program, i);
			activities[i].command_print_activity();
		}
		activities.flickcurl_free_activities();
		return 0;
	}
	public int command_places_find(int argc, Byte argv) {
		flickcurl_place places = ((Object)0);
		byte query = argv[1];
		places = fc.flickcurl_places_find(query);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 1);
			}
			places.flickcurl_free_places();
		} 
		return (places == ((Object)0));
	}
	public int command_places_findByLatLon(int argc, Byte argv) {
		flickcurl_place place = ((Object)0);
		double lat = .atof(argv[1]);
		double lon = .atof(argv[2]);
		int accuracy = .atoi(argv[3]);
		place = fc.flickcurl_places_findByLatLon(lat, lon, accuracy);
		if (place) {
			place.command_print_place(((Object)0), ((Object)0), 1);
			place.flickcurl_free_place();
		} 
		return (place == ((Object)0));
	}
	public int command_prefs_getContentType(int argc, Byte argv) {
		int content_type;
		content_type = fc.flickcurl_prefs_getContentType();
		if (content_type) {
			.fprintf((_iob[1]), "%s: Content type preference is %d\n", ModernizedCProgram.program, content_type);
		} 
		return (content_type < 0);
	}
	public int command_prefs_getHidden(int argc, Byte argv) {
		int hidden;
		hidden = fc.flickcurl_prefs_getHidden();
		if (hidden >= 0) {
			.fprintf((_iob[1]), "%s: Hidden preference is %d\n", ModernizedCProgram.program, hidden);
		} 
		return (hidden < 0);
	}
	public int command_prefs_getPrivacy(int argc, Byte argv) {
		int privacy;
		privacy = fc.flickcurl_prefs_getPrivacy();
		if (privacy >= 0) {
			.fprintf((_iob[1]), "%s: Privacy preference is %d\n", ModernizedCProgram.program, privacy);
		} 
		return (privacy < 0);
	}
	public int command_prefs_getSafetyLevel(int argc, Byte argv) {
		int safety_level;
		safety_level = fc.flickcurl_prefs_getSafetyLevel();
		if (safety_level >= 0) {
			.fprintf((_iob[1]), "%s: Safety level preference is %d\n", ModernizedCProgram.program, safety_level);
		} 
		return (safety_level < 0);
	}
	public int command_prefs_getGeoPerms(int argc, Byte argv) {
		int geo_perms;
		geo_perms = fc.flickcurl_prefs_getGeoPerms();
		if (geo_perms >= 0) {
			.fprintf((_iob[1]), "%s: Geographic information preference is %d\n", ModernizedCProgram.program, geo_perms);
		} 
		return (geo_perms < 0);
	}
	public int command_tags_getClusters(int argc, Byte argv) {
		flickcurl_tag_clusters clusters = new flickcurl_tag_clusters();
		flickcurl_tag_cluster cluster = new flickcurl_tag_cluster();
		byte tag = argv[1];
		int clusteri;
		clusters = fc.flickcurl_tags_getClusters(tag);
		if (!clusters) {
			return 1;
		} 
		Object generatedCount = clusters.getCount();
		.fprintf((_iob[1]), "%s: Tag %s returned %d clusters\n", ModernizedCProgram.program, tag, generatedCount);
		Object generatedClusters = clusters.getClusters();
		Object generatedTags = cluster.getTags();
		for (clusteri = 0; (cluster = generatedClusters[clusteri]); clusteri++) {
			byte tag_name;
			int tagi;
			.fprintf((_iob[1]), "%s: Cluster #%d - %d tags\n", ModernizedCProgram.program, clusteri, generatedCount);
			for (tagi = 0; (tag_name = generatedTags[tagi]); tagi++) {
				.fprintf((_iob[1]), "  %s\n", tag_name);
			}
		}
		clusters.flickcurl_free_tag_clusters();
		return 0;
	}
	public int command_places_placesForUser(int argc, Byte argv) {
		flickcurl_place places = ((Object)0);
		int woe_id = -1;
		int threshold = -1;
		byte place_id = ((Object)0);
		flickcurl_place_type place_type = new flickcurl_place_type();
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
			if (argc > 3) {
				place_id = argv[3];
				if (argc > 4) {
					threshold = .atoi(argv[4]);
				} 
			} 
		} 
		places = fc.flickcurl_places_placesForUser(place_type, woe_id, place_id, threshold);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 0);
			}
			places.flickcurl_free_places();
		} 
		return (places == ((Object)0));
	}
	public int command_places_getInfo(int argc, Byte argv) {
		flickcurl_place place = ((Object)0);
		byte place_id = ((Object)0);
		int woe_id = -1;
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (!place_id && !woe_id) {
			return 1;
		} 
		place = fc.flickcurl_places_getInfo2(place_id, woe_id);
		if (place) {
			place.command_print_place(((Object)0), ((Object)0), 1);
			place.flickcurl_free_place();
		} 
		return (place == ((Object)0));
	}
	public int command_places_getInfoByUrl(int argc, Byte argv) {
		flickcurl_place place = ((Object)0);
		byte url = argv[1];
		place = fc.flickcurl_places_getInfoByUrl(url);
		if (place) {
			place.command_print_place(((Object)0), ((Object)0), 1);
			place.flickcurl_free_place();
		} 
		return (place == ((Object)0));
	}
	public int command_places_getChildrenWithPhotosPublic(int argc, Byte argv) {
		flickcurl_place places = ((Object)0);
		byte place_id = ((Object)0);
		int woe_id = -1;
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (!place_id && !woe_id) {
			return 1;
		} 
		places = fc.flickcurl_places_getChildrenWithPhotosPublic2(place_id, woe_id);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 0);
			}
			places.flickcurl_free_places();
		} 
		return (places == ((Object)0));
	}
	public int command_machinetags_getNamespaces(int argc, Byte argv) {
		byte predicate = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		if (argc > 1) {
			predicate = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		tag_namespaces = fc.flickcurl_machinetags_getNamespaces(predicate, per_page, page);
		Object generatedName = tn.getName();
		Object generatedUsage_count = tn.getUsage_count();
		Object generatedPredicates_count = tn.getPredicates_count();
		if (tag_namespaces) {
			int i;
			for (i = 0; tag_namespaces[i]; i++) {
				flickcurl_tag_namespace tn = tag_namespaces[i];
				.fprintf((_iob[1]), "Namespace #%d: name %s usage %d predicates count %d\n", i, generatedName, generatedUsage_count, generatedPredicates_count);
			}
			tag_namespaces.flickcurl_free_tag_namespaces();
		} 
		return (tag_namespaces != ((Object)0));
	}
	public int command_machinetags_getPairs(int argc, Byte argv) {
		byte nspace = ((Object)0);
		byte predicate = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			nspace = argv[1];
			if (argc > 2) {
				predicate = argv[2];
				if (argc > 3) {
					per_page = ModernizedCProgram.parse_page_param(argv[3]);
					if (argc > 4) {
						page = ModernizedCProgram.parse_page_param(argv[4]);
					} 
				} 
			} 
		} 
		tag_pvs = fc.flickcurl_machinetags_getPairs(nspace, predicate, per_page, page);
		if (tag_pvs) {
			tag_pvs.command_print_predicate_values("getPairs returned");
			tag_pvs.flickcurl_free_tag_predicate_values();
		} 
		return (tag_pvs == ((Object)0));
	}
	public int command_machinetags_getPredicates(int argc, Byte argv) {
		byte nspace = ((Object)0);
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			nspace = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		tag_pvs = fc.flickcurl_machinetags_getPredicates(nspace, per_page, page);
		if (tag_pvs) {
			tag_pvs.command_print_predicate_values("getPredicates returned");
			tag_pvs.flickcurl_free_tag_predicate_values();
		} 
		return (tag_pvs == ((Object)0));
	}
	public int command_machinetags_getValues(int argc, Byte argv) {
		byte nspace = argv[1];
		byte predicate = argv[2];
		int per_page = 10;
		int page = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 3) {
			per_page = ModernizedCProgram.parse_page_param(argv[3]);
			if (argc > 4) {
				page = ModernizedCProgram.parse_page_param(argv[4]);
			} 
		} 
		tag_pvs = fc.flickcurl_machinetags_getValues(nspace, predicate, per_page, page);
		if (tag_pvs) {
			tag_pvs.command_print_predicate_values("getValues returned");
			tag_pvs.flickcurl_free_tag_predicate_values();
		} 
		return (tag_pvs == ((Object)0));
	}
	public int command_places_getPlaceTypes(int argc, Byte argv) {
		flickcurl_place_type_info place_types = new flickcurl_place_type_info();
		place_types = fc.flickcurl_places_getPlaceTypes();
		Object generatedId = pt.getId();
		Object generatedType = pt.getType();
		Object generatedName = pt.getName();
		if (place_types) {
			int i;
			for (i = 0; place_types[i]; i++) {
				flickcurl_place_type_info pt = place_types[i];
				.fprintf((_iob[1]), "place type %d): id %d  type %d  name %s\n", i, generatedId, generatedType, generatedName);
			}
			place_types.flickcurl_free_place_type_infos();
		} 
		return (place_types == ((Object)0));
	}
	public int command_places_placesForBoundingBox(int argc, Byte argv) {
		flickcurl_place places = ((Object)0);
		double minimum_longitude;
		double minimum_latitude;
		double maximum_longitude;
		double maximum_latitude;
		flickcurl_place_type place_type = .FLICKCURL_PLACE_LOCATION;
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		minimum_longitude = .atof(argv[2]);
		minimum_latitude = .atof(argv[3]);
		maximum_longitude = .atof(argv[4]);
		maximum_latitude = .atof(argv[5]);
		places = fc.flickcurl_places_placesForBoundingBox(place_type, minimum_longitude, minimum_latitude, maximum_longitude, maximum_latitude);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 0);
			}
			places.flickcurl_free_places();
		} 
		return (places == ((Object)0));
	}
	public int command_places_placesForContacts(int argc, byte argv) {
		int usage = 0;
		flickcurl_place places = ((Object)0);
		flickcurl_place_type place_type = .FLICKCURL_PLACE_LOCATION;
		int woe_id = -1;
		byte place_id = ((Object)0);
		int threshold = -1;
		byte contacts = ((Object)0);
		int min_upload_date = -1;
		int max_upload_date = -1;
		int min_taken_date = -1;
		int max_taken_date = -1;
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		if (.strcmp(argv[2], "-")) {
			woe_id = .atoi(argv[2]);
		} 
		if (.strcmp(argv[3], "-")) {
			place_id = argv[3];
		} 
		threshold = .atoi(argv[4]);
		argv += 5;
		argc -= 5;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "contacts")) {
				contacts = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload")) {
				min_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload")) {
				max_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken")) {
				min_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken")) {
				max_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			places = ((Object)0);
			;
		} 
		places = fc.flickcurl_places_placesForContacts(place_type, woe_id, place_id, threshold, contacts, min_upload_date, max_upload_date, min_taken_date, max_taken_date);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 0);
			}
			places.flickcurl_free_places();
		} 
	}
	public int command_contacts_getList(int argc, Byte argv) {
		flickcurl_contact contacts = ((Object)0);
		byte filter = ((Object)0);
		int page = -1;
		int per_page = -1;
		if (argc > 1) {
			filter = argv[1];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[3]);
				} 
			} 
		} 
		flickcurl_contact_s flickcurl_contact_s = new flickcurl_contact_s();
		contacts = flickcurl_contact_s.flickcurl_contacts_getList(fc, filter, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				contacts[i].command_print_contact(i);
			}
			contacts.flickcurl_free_contacts();
		} 
		return (contacts == ((Object)0));
	}
	public int command_contacts_getListRecentlyUploaded(int argc, Byte argv) {
		flickcurl_contact contacts = ((Object)0);
		int date_lastupload = 1;
		byte filter = ((Object)0);
		if (argc > 1) {
			date_lastupload = .atoi(argv[1]);
			if (argc > 2) {
				filter = argv[2];
			} 
		} 
		flickcurl_contact_s flickcurl_contact_s = new flickcurl_contact_s();
		contacts = flickcurl_contact_s.flickcurl_contacts_getListRecentlyUploaded(fc, date_lastupload, filter);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				contacts[i].command_print_contact(i);
			}
			contacts.flickcurl_free_contacts();
		} 
		return (contacts == ((Object)0));
	}
	public int command_contacts_getPublicList(int argc, Byte argv) {
		flickcurl_contact contacts = ((Object)0);
		byte user_id = ((Object)0);
		int page = -1;
		int per_page = -1;
		user_id = argv[1];
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		flickcurl_contact_s flickcurl_contact_s = new flickcurl_contact_s();
		contacts = flickcurl_contact_s.flickcurl_contacts_getPublicList(fc, user_id, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				contacts[i].command_print_contact(i);
			}
			contacts.flickcurl_free_contacts();
		} 
		return (contacts == ((Object)0));
	}
	public int command_places_getShapeHistory(int argc, Byte argv) {
		flickcurl_shapedata shapes = ((Object)0);
		int woe_id = -1;
		byte place_id = ((Object)0);
		if (.strcmp(argv[1], "-")) {
			place_id = argv[1];
		} 
		if (argc > 2) {
			if (.strcmp(argv[2], "-")) {
				woe_id = .atoi(argv[2]);
			} 
		} 
		if (woe_id < 0 && !place_id) {
			return 1;
		} 
		flickcurl_shapedata_s flickcurl_shapedata_s = new flickcurl_shapedata_s();
		shapes = flickcurl_shapedata_s.flickcurl_places_getShapeHistory(fc, place_id, woe_id);
		if (shapes) {
			int i;
			for (i = 0; shapes[i]; i++) {
				.fprintf((_iob[1]), "Shape %d: ", i);
				shapes[i].command_print_shape();
				.fputc((byte)'\n', (_iob[1]));
			}
			shapes.flickcurl_free_shapes();
		} 
		return (shapes == ((Object)0));
	}
	public int command_places_tagsForPlace(int argc, byte argv) {
		int usage = 0;
		flickcurl_tag tags = ((Object)0);
		int woe_id = -1;
		byte place_id = ((Object)0);
		int min_upload_date = -1;
		int max_upload_date = -1;
		int min_taken_date = -1;
		int max_taken_date = -1;
		argv++;
		argc--;
		if (.strcmp(argv[0], "-")) {
			place_id = argv[0];
		} 
		argv++;
		argc--;
		if (argc) {
			if (.strcmp(argv[0], "-")) {
				woe_id = .atoi(argv[0]);
			} 
		} 
		while (!usage && argc > 0) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "min-upload")) {
				min_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload")) {
				max_upload_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken")) {
				min_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken")) {
				max_taken_date = .atoi(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			tags = ((Object)0);
			;
		} 
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_places_tagsForPlace(fc, woe_id, place_id, min_upload_date, max_upload_date, min_taken_date, max_taken_date);
		if (tags) {
			.fprintf((_iob[1]), "%s: Tags for WOE ID %d / place ID %s\n", ModernizedCProgram.program, woe_id, place_id);
			tags.command_print_tags(((Object)0), ((Object)0));
			.free(tags);
		} 
	}
	public int command_commons_getInstitutions(int argc, Byte argv) {
		flickcurl_institution institutions = ((Object)0);
		institutions = fc.flickcurl_commons_getInstitutions();
		if (institutions) {
			int i;
			for (i = 0; institutions[i]; i++) {
				institutions[i].command_print_institution(i);
			}
			institutions.flickcurl_free_institutions();
		} 
		return (institutions == ((Object)0));
	}
	public int command_groups_members_getList(int argc, Byte argv) {
		byte group_id = argv[1];
		byte membertypes = ((Object)0);
		int per_page = -1;
		int page = -1;
		flickcurl_member members = new flickcurl_member();
		if (argc > 1) {
			membertypes = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		members = fc.flickcurl_groups_members_getList(group_id, membertypes, per_page, page);
		if (members) {
			int i;
			for (i = 0; members[i]; i++) {
				members[i].command_print_member(i);
			}
			members.flickcurl_free_members();
		} 
		return (members == ((Object)0));
	}
	public int command_panda_getList(int argc, Byte argv) {
		int i;
		byte pandas;
		pandas = fc.flickcurl_panda_getList();
		if (!pandas) {
			return 1;
		} 
		for (i = 0; pandas[i]; i++) {
			.fprintf((_iob[1]), "%s: panda %d: %s\n", ModernizedCProgram.program, i, pandas[i]);
		}
		.free(pandas);
		return 0;
	}
	public int command_panda_getPhotos(int argc, Byte argv) {
		byte panda = argv[1];
		flickcurl_photo photos = ((Object)0);
		int i;
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photos = flickcurl_photo_s.flickcurl_panda_getPhotos(fc, panda);
		if (!photos) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Panda %s returned photos!\n", ModernizedCProgram.program, panda);
		for (i = 0; photos[i]; i++) {
			.fprintf((_iob[1]), "%s: %s photo %d\n", ModernizedCProgram.program, panda, i);
			photos[i].command_print_photo();
		}
		photos.flickcurl_free_photos();
		return 0;
	}
	public int command_collections_getInfo(int argc, Byte argv) {
		byte collection_id = argv[1];
		flickcurl_collection collection = ((Object)0);
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		collection = flickcurl_collection_s.flickcurl_collections_getInfo(fc, collection_id);
		if (collection) {
			collection.command_print_collection();
			collection.flickcurl_free_collection();
		} 
		return (collection == ((Object)0));
	}
	public int command_collections_getTree(int argc, Byte argv) {
		byte collection_id = ((Object)0);
		byte user_id = ((Object)0);
		flickcurl_collection collection = ((Object)0);
		if (argc > 1) {
			if (.strcmp(argv[1], "-")) {
				collection_id = argv[1];
			} 
			if (argc > 2) {
				if (.strcmp(argv[2], "-")) {
					user_id = argv[2];
				} 
			} 
		} 
		flickcurl_collection_s flickcurl_collection_s = new flickcurl_collection_s();
		collection = flickcurl_collection_s.flickcurl_collections_getTree(fc, collection_id, user_id);
		if (collection) {
			collection.command_print_collection();
			collection.flickcurl_free_collection();
		} 
		return (collection == ((Object)0));
	}
	public int command_machinetags_getRecentValues(int argc, Byte argv) {
		byte nspace = ((Object)0);
		byte predicate = ((Object)0);
		int added_since = 0;
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		if (argc > 1) {
			if (.strcmp("-", argv[1])) {
				nspace = argv[1];
			} 
			if (argc > 2) {
				if (.strcmp("-", argv[2])) {
					nspace = argv[2];
				} 
				if (argc > 3) {
					added_since = .atoi(argv[3]);
				} 
			} 
		} 
		tag_pvs = fc.flickcurl_machinetags_getRecentValues(nspace, predicate, added_since);
		if (tag_pvs) {
			tag_pvs.command_print_predicate_values("getRecentValues returned");
			tag_pvs.flickcurl_free_tag_predicate_values();
		} 
		return (tag_pvs == ((Object)0));
	}
	public int command_comments_getRecentForContacts(int argc, byte argv) {
		int usage = 0;
		int date_lastcomment = -1;
		byte filter = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		flickcurl_photos_list photos_list = ((Object)0);
		int rc = 0;
		list_params.flickcurl_photos_list_params_init();
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "since")) {
				date_lastcomment = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "filter")) {
				filter = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_photos_comments_getRecentForContacts_params(fc, date_lastcomment, filter, list_params);
		if (!photos_list) {
			.fprintf((_iob[2]), "%s: Getting recent comments for contacts failed\n", ModernizedCProgram.program);
			return 1;
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Recent content photos");
		photos_list.flickcurl_free_photos_list();
	}
	public int command_short_uri(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte uri;
		uri = ModernizedCProgram.flickcurl_photo_id_as_short_uri(photo_id);
		if (uri) {
			.fprintf((_iob[1]), "%s: Short URI for photo ID %s is %s\n", ModernizedCProgram.program, photo_id, uri);
			.free(uri);
		} else {
				.fprintf((_iob[2]), "%s: Failed to get short URI for photo ID %s\n", ModernizedCProgram.program, photo_id);
				return 1;
		} 
		return 0;
	}
	public int command_blogs_getServices(int argc, Byte argv) {
		flickcurl_blog_service blog_services = new flickcurl_blog_service();
		blog_services = fc.flickcurl_blogs_getServices();
		Object generatedId = blog_service.getId();
		Object generatedName = blog_service.getName();
		if (blog_services) {
			int i;
			for (i = 0; blog_services[i]; i++) {
				flickcurl_blog_service blog_service = blog_services[i];
				.fprintf((_iob[1]), "%d) blog service: id %s  name '%s'\n", i, generatedId, generatedName);
			}
			blog_services.flickcurl_free_blog_services();
		} 
		return 0;
	}
	public int command_places_getTopPlacesList(int argc, Byte argv) {
		flickcurl_place places = ((Object)0);
		flickcurl_place_type place_type = new flickcurl_place_type();
		byte date;
		int woe_id = -1;
		byte place_id = ((Object)0);
		place_type = ModernizedCProgram.flickcurl_get_place_type_by_label(argv[1]);
		date = argv[2];
		if (argc > 3) {
			if (.strcmp(argv[3], "-")) {
				woe_id = .atoi(argv[3]);
			} 
			if (argc > 4) {
				place_id = argv[4];
			} 
		} 
		places = fc.flickcurl_places_getTopPlacesList(place_type, date, woe_id, place_id);
		if (places) {
			int i;
			for (i = 0; places[i]; i++) {
				.fprintf((_iob[1]), "Place Result #%d\n", i);
				places[i].command_print_place(((Object)0), ((Object)0), 1);
			}
			places.flickcurl_free_places();
		} 
		return (places == ((Object)0));
	}
	public int command_source_uri_to_photoid(int argc, Byte argv) {
		byte uri = argv[1];
		byte photo_id;
		photo_id = ModernizedCProgram.flickcurl_source_uri_as_photo_id(uri);
		if (!photo_id) {
			.fprintf((_iob[2]), "%s: Failed to get photo ID for source URI %s\n", ModernizedCProgram.program, uri);
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo ID for source URI %s is %s\n", ModernizedCProgram.program, uri, photo_id);
		.free(photo_id);
		return 0;
	}
	public int command_people_getPhotosOf(int argc, Byte argv) {
		byte user_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 1) {
			list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[2]));
			if (argc > 2) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 3) {
					list_params.setFormat(argv[4]);
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPhotosOf_params(fc, user_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos of user %s (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photos_people_add(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int person_x = .atoi(argv[3]);
		int person_y = .atoi(argv[4]);
		int person_w = .atoi(argv[5]);
		int person_h = .atoi(argv[6]);
		return fc.flickcurl_photos_people_add(photo_id, user_id, person_x, person_y, person_w, person_h);
	}
	public int command_photos_people_delete(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		return fc.flickcurl_photos_people_delete(photo_id, user_id);
	}
	public int command_photos_people_deleteCoords(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		return fc.flickcurl_photos_people_deleteCoords(photo_id, user_id);
	}
	public int command_photos_people_editCoords(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int person_x = .atoi(argv[3]);
		int person_y = .atoi(argv[4]);
		int person_w = .atoi(argv[5]);
		int person_h = .atoi(argv[6]);
		return fc.flickcurl_photos_people_editCoords(photo_id, user_id, person_x, person_y, person_w, person_h);
	}
	public int command_photos_people_getList(int argc, Byte argv) {
		byte photo_id = argv[1];
		int i;
		flickcurl_person persons = new flickcurl_person();
		persons = fc.flickcurl_photos_people_getList(photo_id);
		if (!persons) {
			return 1;
		} 
		for (i = 0; persons[i]; i++) {
			persons[i].command_print_person();
		}
		persons.flickcurl_free_persons();
		return 0;
	}
	public int command_galleries_addPhoto(int argc, Byte argv) {
		byte gallery_id = argv[1];
		byte photo_id = argv[2];
		byte comment_text = argv[3];
		return fc.flickcurl_galleries_addPhoto(gallery_id, photo_id, comment_text);
	}
	public int command_galleries_getList(int argc, Byte argv) {
		byte user_id = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_gallery galleries = new flickcurl_gallery();
		int i;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		galleries = fc.flickcurl_galleries_getList(user_id, per_page, page);
		if (!galleries) {
			return 1;
		} 
		for (i = 0; galleries[i]; i++) {
			.fprintf((_iob[1]), "%s: Gallery %d\n", ModernizedCProgram.program, i);
			galleries[i].command_print_gallery();
		}
		galleries.flickcurl_free_galleries();
		return 0;
	}
	public int command_galleries_getListForPhoto(int argc, Byte argv) {
		byte photo_id = argv[1];
		int per_page = 10;
		int page = 0;
		flickcurl_gallery galleries = new flickcurl_gallery();
		int i;
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		galleries = fc.flickcurl_galleries_getListForPhoto(photo_id, per_page, page);
		if (!galleries) {
			return 1;
		} 
		for (i = 0; galleries[i]; i++) {
			.fprintf((_iob[1]), "%s: Gallery %d\n", ModernizedCProgram.program, i);
			galleries[i].command_print_gallery();
		}
		galleries.flickcurl_free_galleries();
		return 0;
	}
	public int command_stats_getCollectionDomains(int argc, Byte argv) {
		byte date = argv[1];
		byte collection_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			collection_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getCollectionDomains(date, collection_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Collection domain stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getCollectionReferrers(int argc, Byte argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte collection_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			collection_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getCollectionReferrers(date, domain, collection_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Collection referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getCollectionStats(int argc, Byte argv) {
		byte date = argv[1];
		byte collection_id = argv[2];
		int views;
		views = fc.flickcurl_stats_getCollectionStats(date, collection_id);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Collection view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public int command_stats_getPhotoDomains(int argc, Byte argv) {
		byte date = argv[1];
		byte photo_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			photo_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getPhotoDomains(date, photo_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotoReferrers(int argc, Byte argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte photo_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			photo_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getPhotoReferrers(date, domain, photo_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photo referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotoStats(int argc, Byte argv) {
		byte date = argv[1];
		byte photo_id = argv[2];
		flickcurl_stat stat1 = new flickcurl_stat();
		stat1 = fc.flickcurl_stats_getPhotoStats(date, photo_id);
		if (!stat1) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photo %s on date %s statistics:\n", ModernizedCProgram.program, photo_id, date);
		stat1.command_print_stat();
		stat1.flickcurl_free_stat();
		return 0;
	}
	public int command_stats_getPhotosetDomains(int argc, Byte argv) {
		byte date = argv[1];
		byte photoset_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			photoset_id = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getPhotosetDomains(date, photoset_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotosetReferrers(int argc, Byte argv) {
		byte date = argv[1];
		byte domain = argv[2];
		byte photoset_id = ((Object)0);
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			photoset_id = argv[3];
			if (argc > 3) {
				per_page = ModernizedCProgram.parse_page_param(argv[4]);
				if (argc > 4) {
					page = ModernizedCProgram.parse_page_param(argv[5]);
				} 
			} 
		} 
		stats = fc.flickcurl_stats_getPhotosetReferrers(date, domain, photoset_id, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photoset referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotosetStats(int argc, Byte argv) {
		byte date = argv[1];
		byte photoset_id = argv[2];
		int views;
		views = fc.flickcurl_stats_getPhotosetStats(date, photoset_id);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photoset view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public int command_stats_getPhotostreamDomains(int argc, Byte argv) {
		byte date = argv[1];
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[2]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[3]);
			} 
		} 
		stats = fc.flickcurl_stats_getPhotostreamDomains(date, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photostream domains stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotostreamReferrers(int argc, Byte argv) {
		byte date = argv[1];
		byte domain = argv[2];
		int per_page = -1;
		int page = 0;
		flickcurl_stat stats = new flickcurl_stat();
		if (argc > 2) {
			per_page = ModernizedCProgram.parse_page_param(argv[3]);
			if (argc > 3) {
				page = ModernizedCProgram.parse_page_param(argv[4]);
			} 
		} 
		stats = fc.flickcurl_stats_getPhotostreamReferrers(date, domain, per_page, page);
		if (!stats) {
			return 1;
		} 
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photostream referrers stats (per_page %d  page %d):\n", ModernizedCProgram.program, per_page, page);
		} 
		stats.command_print_stats();
		stats.flickcurl_free_stats();
		return 0;
	}
	public int command_stats_getPhotostreamStats(int argc, Byte argv) {
		byte date = argv[1];
		int views;
		views = fc.flickcurl_stats_getPhotostreamStats(date);
		if (views < 0) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Photostream view stats: %d\n", ModernizedCProgram.program, views);
		return 0;
	}
	public int command_stats_getPopularPhotos(int argc, Byte argv) {
		byte date = argv[1];
		byte sort = ((Object)0);
		int per_page = -1;
		int page = 0;
		byte extras = ((Object)0);
		flickcurl_photo photos = new flickcurl_photo();
		int i;
		if (argc > 1) {
			sort = argv[2];
			if (argc > 2) {
				per_page = ModernizedCProgram.parse_page_param(argv[3]);
				if (argc > 3) {
					page = ModernizedCProgram.parse_page_param(argv[4]);
					if (argc > 4) {
						extras = argv[5];
					} 
				} 
			} 
		} 
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photos = flickcurl_photo_s.flickcurl_stats_getPopularPhotos(fc, date, sort, per_page, page, extras);
		if (!photos) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Popular photos:\n", ModernizedCProgram.program);
		for (i = 0; photos[i]; i++) {
			.fprintf((_iob[1]), "%s: popular photo %d\n", ModernizedCProgram.program, i);
			photos[i].command_print_photo();
		}
		photos.flickcurl_free_photos();
		return 0;
	}
	public int command_stats_getTotalViews(int argc, Byte argv) {
		byte date = ((Object)0);
		flickcurl_view_stats view_stats = new flickcurl_view_stats();
		if (argc > 0) {
			date = argv[1];
		} 
		view_stats = fc.flickcurl_stats_getTotalViews(date);
		if (!view_stats) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Total view stats\n", ModernizedCProgram.program);
		Object generatedTotal = view_stats.getTotal();
		Object generatedPhotos = view_stats.getPhotos();
		Object generatedPhotostreams = view_stats.getPhotostreams();
		Object generatedSets = view_stats.getSets();
		Object generatedCollections = view_stats.getCollections();
		.fprintf((_iob[1]), "  Total: %d\n  Photos: %d\n  Photostreams: %d\n  Sets: %d\n  Collections: %d\n", generatedTotal, generatedPhotos, generatedPhotostreams, generatedSets, generatedCollections);
		view_stats.flickcurl_free_view_stats();
		return 0;
	}
	public int command_people_getPhotos(int argc, byte argv) {
		int usage = 0;
		byte user_id;
		int safe_search = -1;
		byte min_upload_date = ((Object)0);
		byte max_upload_date = ((Object)0);
		byte min_taken_date = ((Object)0);
		byte max_taken_date = ((Object)0);
		int content_type = -1;
		int privacy_filter = -1;
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc = 0;
		list_params.flickcurl_photos_list_params_init();
		argv++;
		argc--;
		user_id = argv[0];
		argv++;
		argc--;
		while (!usage && argc) {
			byte field = argv[0];
			argv++;
			argc--;
			if (!.strcmp(field, "safe-search")) {
				safe_search = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-upload-date")) {
				min_upload_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-upload-date")) {
				max_upload_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "min-taken-date")) {
				min_taken_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "max-taken-date")) {
				max_taken_date = argv[0];
				argv++;
				argc--;
			}  else if (!.strcmp(field, "content-type")) {
				content_type = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "privacy-filter")) {
				privacy_filter = .atoi(argv[0]);
				argv++;
				argc--;
			}  else if (!.strcmp(field, "per-page")) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[/* int: default 100, max 500 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "page")) {
				list_params.setPage(ModernizedCProgram.parse_page_param(argv[/* int: default 1 */0]));
				argv++;
				argc--;
			}  else if (!.strcmp(field, "format")) {
				list_params.setFormat(argv[0]);
				argv++;
				argc--;
			} else {
					.fprintf((_iob[2]), "%s: Unknown parameter: '%s'\n", ModernizedCProgram.program, argv[0]);
					usage = 1;
			} 
		}
		if (usage) {
			;
		} 
		photos_list = ModernizedCProgram.flickcurl_people_getPhotos_params(fc, user_id, safe_search, min_upload_date, max_upload_date, min_taken_date, max_taken_date, content_type, privacy_filter, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Photos of user %s (per_page %d  page %d):\n", ModernizedCProgram.program, user_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
	}
	public int command_galleries_create(int argc, Byte argv) {
		byte title = argv[1];
		byte description = ((Object)0);
		byte primary_photo_id = ((Object)0);
		byte url = ((Object)0);
		byte id;
		if (argc > 1) {
			description = argv[2];
			if (argc > 2) {
				primary_photo_id = argv[3];
			} 
		} 
		id = fc.flickcurl_galleries_create(title, description, primary_photo_id, url);
		if (!id) {
			return 1;
		} 
		.fprintf((_iob[1]), "%s: Gallery %s created with URL %s\n", ModernizedCProgram.program, id, url);
		.free(url);
		.free(id);
		return 0;
	}
	public int command_galleries_editMeta(int argc, Byte argv) {
		return fc.flickcurl_galleries_editMeta(argv[1], argv[2], argv[3]);
	}
	public int command_galleries_editPhoto(int argc, Byte argv) {
		byte gallery_id = argv[1];
		byte primary_photo_id = argv[2];
		byte new_comment = argv[3];
		return fc.flickcurl_galleries_editPhoto(gallery_id, primary_photo_id, new_comment);
	}
	public int command_galleries_editPhotos(int argc, Byte argv) {
		byte photoset_id = argv[1];
		byte primary_photo_id = argv[2];
		byte photo_ids = ModernizedCProgram.flickcurl_array_split(argv[3], (byte)',');
		int rc;
		rc = fc.flickcurl_galleries_editPhotos(photoset_id, primary_photo_id, (byte)photo_ids);
		ModernizedCProgram.flickcurl_array_free(photo_ids);
		return rc;
	}
	public int command_galleries_getInfo(int argc, Byte argv) {
		flickcurl_gallery gallery = ((Object)0);
		byte gallery_id = argv[1];
		gallery = fc.flickcurl_galleries_getInfo(gallery_id);
		if (gallery) {
			gallery.command_print_gallery();
			gallery.flickcurl_free_gallery();
		} 
		return (gallery == ((Object)0));
	}
	public int command_galleries_getPhotos(int argc, Byte argv) {
		byte gallery_id = argv[1];
		flickcurl_photos_list photos_list = ((Object)0);
		flickcurl_photos_list_params list_params = new flickcurl_photos_list_params();
		int rc;
		list_params.flickcurl_photos_list_params_init();
		if (argc > 2) {
			list_params.setExtras(argv[2]);
			if (argc > 3) {
				list_params.setPer_page(ModernizedCProgram.parse_page_param(argv[3]));
				if (argc > 4) {
					list_params.setPage(ModernizedCProgram.parse_page_param(argv[4]));
					if (argc > 5) {
						list_params.setFormat(argv[5]);
					} 
				} 
			} 
		} 
		photos_list = ModernizedCProgram.flickcurl_galleries_getPhotos_params(fc, gallery_id, list_params);
		if (!photos_list) {
			return 1;
		} 
		Object generatedPer_page = list_params.getPer_page();
		Object generatedPage = list_params.getPage();
		if (ModernizedCProgram.verbose) {
			.fprintf((_iob[1]), "%s: Gallery %s photos (per_page %d  page %d):\n", ModernizedCProgram.program, gallery_id, generatedPer_page, generatedPage);
		} 
		rc = ModernizedCProgram.command_print_photos_list(fc, photos_list, ModernizedCProgram.output_fh, "Photo");
		photos_list.flickcurl_free_photos_list();
		return rc;
	}
	public int command_photosets_removePhotos(int argc, Byte argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
		int rc;
		rc = fc.flickcurl_photosets_removePhotos(argv[1], (byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public int command_photosets_reorderPhotos(int argc, Byte argv) {
		byte photoset_ids = ModernizedCProgram.flickcurl_array_split(argv[2], (byte)',');
		int rc;
		rc = fc.flickcurl_photosets_reorderPhotos(argv[1], (byte)photoset_ids);
		ModernizedCProgram.flickcurl_array_free(photoset_ids);
		return rc;
	}
	public int command_photosets_setPrimaryPhoto(int argc, Byte argv) {
		return fc.flickcurl_photosets_setPrimaryPhoto(argv[1], argv[2]);
	}
	public int command_favorites_getContext(int argc, Byte argv) {
		byte photo_id = argv[1];
		byte user_id = argv[2];
		int num_prev = -1;
		int num_next = -1;
		byte extras = ((Object)0);
		flickcurl_photos_list photos_lists = ((Object)0);
		if (argc > 3) {
			if (.strcmp(argv[3], "-")) {
				num_prev = .atoi(argv[3]);
			} 
			if (argc > 4) {
				if (.strcmp(argv[4], "-")) {
					num_next = .atoi(argv[4]);
				} 
				if (argc > 5) {
					extras = argv[5];
				} 
			} 
		} 
		photos_lists = fc.flickcurl_favorites_getContext(photo_id, user_id, num_prev, num_next, extras);
		if (!photos_lists) {
			.fprintf((_iob[2]), "%s: Getting user %s favorite photo %s context failed\n", ModernizedCProgram.program, user_id, photo_id);
		} else {
				int rc;
				if (ModernizedCProgram.verbose) {
					.fprintf((_iob[1]), "%s: Context around user %s favorite photo %s:\n", ModernizedCProgram.program, user_id, photo_id);
				} 
				rc = ModernizedCProgram.command_print_photos_list(fc, photos_lists[0], ModernizedCProgram.output_fh, "Previous photos");
				if (!rc) {
					rc = ModernizedCProgram.command_print_photos_list(fc, photos_lists[1], ModernizedCProgram.output_fh, "Next photos");
				} 
				photos_lists[0].flickcurl_free_photos_list();
				photos_lists[1].flickcurl_free_photos_list();
				.free(photos_lists);
				if (rc) {
					photos_lists = ((Object)0);
				} 
		} 
		return (photos_lists == ((Object)0));
	}
	public int command_oauth_create(int argc, Byte argv) {
		byte callback = ((Object)0);
		byte uri;
		int rc;
		if (argc > 1) {
			callback = argv[1];
		} 
		rc = fc.flickcurl_oauth_create_request_token(callback);
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to create OAuth Request token/secret\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: OAuth request token details:\n  Request Token: '%s'\n  Request Token Secret: '%s'\n", ModernizedCProgram.program, fc.flickcurl_get_oauth_request_token(), fc.flickcurl_get_oauth_request_token_secret());
		uri = fc.flickcurl_oauth_get_authorize_uri();
		if (uri) {
			.fprintf((_iob[2]), "%s: OAuth Authentication URL: %s\n", ModernizedCProgram.program, uri);
			.fprintf((_iob[2]), "%s: Visit this, approve the request, get the <Verifier> and run:\n", ModernizedCProgram.program);
			.fprintf((_iob[2]), "  $ %s oauth.verify '%s' '%s' '<Verifier>'\n", ModernizedCProgram.program, fc.flickcurl_get_oauth_request_token(), fc.flickcurl_get_oauth_request_token_secret());
			.free(uri);
		} 
		return 0;
	}
	public int command_oauth_verify(int argc, Byte argv) {
		int rc;
		byte request_token = argv[1];
		byte request_token_secret = argv[2];
		byte verifier = argv[3];
		fc.flickcurl_set_oauth_request_token(request_token);
		fc.flickcurl_set_oauth_request_token_secret(request_token_secret);
		rc = fc.flickcurl_oauth_create_access_token(verifier);
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to verify OAuth Request\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: Returned OAuth token '%s' and token secret '%s'\n", ModernizedCProgram.program, fc.flickcurl_get_oauth_token(), fc.flickcurl_get_oauth_token_secret());
		rc = fc.flickcurl_config_write_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
		if (!rc) {
			.fprintf((_iob[1]), "%s: Updated configuration file %s with OAuth tokens\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
		return 0;
	}
	public int command_oauth_upgrade(int argc, Byte argv) {
		int rc;
		rc = fc.flickcurl_auth_oauth_getAccessToken();
		if (rc) {
			.fprintf((_iob[2]), "%s: Failed to upgrade to OAuth\n", ModernizedCProgram.program);
			return 1;
		} 
		.fprintf((_iob[2]), "%s: Upgraded to OAuth token '%s' and token secret '%s'\n", ModernizedCProgram.program, fc.flickcurl_get_oauth_token(), fc.flickcurl_get_oauth_token_secret());
		rc = fc.flickcurl_config_write_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
		if (!rc) {
			.fprintf((_iob[1]), "%s: Updated configuration file %s with OAuth tokens\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
		return 0;
	}
	public int command_groups_join(int argc, Byte argv) {
		byte group_id = argv[1];
		byte accept_rules = ((Object)0);
		if (argv[2]) {
			accept_rules = argv[2];
		} 
		return fc.flickcurl_groups_join(group_id, accept_rules);
	}
	public int command_groups_joinRequest(int argc, Byte argv) {
		byte group_id = argv[1];
		byte message = argv[2];
		byte accept_rules = argv[3];
		return fc.flickcurl_groups_joinRequest(group_id, message, accept_rules);
	}
	public int command_groups_leave(int argc, Byte argv) {
		byte group_id = argv[1];
		byte delete_photos = ((Object)0);
		if (argv[2]) {
			delete_photos = argv[2];
		} 
		return fc.flickcurl_groups_leave(group_id, delete_photos);
	}
	public int command_contacts_getTaggingSuggestions(int argc, Byte argv) {
		flickcurl_contact contacts = ((Object)0);
		byte include_self = ((Object)0);
		byte include_address_book = ((Object)0);
		int page = -1;
		int per_page = -1;
		if (argc > 1) {
			per_page = ModernizedCProgram.parse_page_param(argv[1]);
			if (argc > 2) {
				page = ModernizedCProgram.parse_page_param(argv[2]);
				if (argc > 3) {
					include_self = argv[3];
					if (argc > 4) {
						include_address_book = argv[4];
					} 
				} 
			} 
		} 
		flickcurl_contact_s flickcurl_contact_s = new flickcurl_contact_s();
		contacts = flickcurl_contact_s.flickcurl_contacts_getTaggingSuggestions(fc, include_self, include_address_book, page, per_page);
		if (contacts) {
			int i;
			for (i = 0; contacts[i]; i++) {
				contacts[i].command_print_contact(i);
			}
			contacts.flickcurl_free_contacts();
		} 
		return (contacts == ((Object)0));
	}
	public int command_people_getGroups(int argc, Byte argv) {
		byte user_id = argv[1];
		flickcurl_group groups = ((Object)0);
		byte extras = ((Object)0);
		int i;
		groups = fc.flickcurl_people_getGroups(user_id, extras);
		if (!groups) {
			return 1;
		} 
		for (i = 0; groups[i]; i++) {
			.fprintf((_iob[1]), "%s: Group %d\n", ModernizedCProgram.program, i);
			groups[i].command_print_group();
		}
		groups.flickcurl_free_groups();
		return 0;
	}
	public int command_tags_getMostFrequentlyUsed(int argc, Byte argv) {
		flickcurl_tag tags = new flickcurl_tag();
		flickcurl_tag_s flickcurl_tag_s = new flickcurl_tag_s();
		tags = flickcurl_tag_s.flickcurl_tags_getMostFrequentlyUsed(fc);
		if (!tags) {
			return 1;
		} 
		tags.command_print_tags(((Object)0), ((Object)0));
		.free(tags);
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * blogs-api.c - Flickr flickr.blogs.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_blogs_getList:
	 * @fc: flickcurl context
	 * 
	 * Get a list of configured blogs for the calling user.
	 *
	 * Implements flickr.blogs.getList (1.0)
	 * 
	 * Return value: non-0 on failure
	 **/
	public  flickcurl_blogs_getList() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_blog blogs = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.blogs.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		blogs = fc.flickcurl_build_blogs(xpathCtx, ()"/rsp/blogs/blog", ((Object)0));
		return blogs/**
		 * flickcurl_blogs_getServices:
		 * @fc: flickcurl context
		 * 
		 * Return a list of Flickr supported blogging services
		 *
		 * Implements flickr.blogs.getServices (1.12)
		 * 
		 * Return value: list of services or NULL on failure
		 **/;
	}
	public  flickcurl_blogs_getServices() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_blog_service services = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.blogs.getServices")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		services = fc.flickcurl_build_blog_services(xpathCtx, ()"/rsp/services/service", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (services) {
				services.flickcurl_free_blog_services();
			} 
			services = ((Object)0);
		} 
		return services/**
		 * flickcurl_blogs_postPhoto:
		 * @fc: flickcurl context
		 * @blog_id: The id of the blog to post to
		 * @photo_id: The id of the photo to blog
		 * @title: The blog post title
		 * @description: The blog post body
		 * @blog_password: The password for the blog (used when the blog does not have a stored password) (or NULL)
		 *
		 * Post a photo to a blog/
		 *
		 * Implements flickr.blogs.postPhoto (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_blogs_postPhoto(Object blog_id, Object photo_id, Object title, Object description, Object blog_password) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!blog_id || !photo_id || !title || !description) {
			return 1;
		} 
		fc.flickcurl_add_param("blog_id", blog_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("title", title);
		fc.flickcurl_add_param("description", description);
		if (blog_password) {
			fc.flickcurl_add_param("blog_password", blog_password);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.blogs.postPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		return generatedFailed;
	}
	public void flickcurl_sort_args() {
		Object generatedParameters = this.getParameters();
		int generatedCount = this.getCount();
		.qsort((Object)generatedParameters, generatedCount, , compare_args);
		Object generatedParameters = this.getParameters();
		int generatedCount = this.getCount();
		.qsort((Object)generatedParameters, generatedCount, , compare_args/*
		 * flickcurl_oauth_prepare_common:
		 * ...
		 *
		 * INTERNAL - prepare an oauth request
		 */);
	}
	public int flickcurl_legacy_prepare_common(Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		int i;
		byte md5_string = ((Object)0);
		size_t values_len = ((Object)0);
		int fc_uri_len = 0;
		int full_uri_len = 0;
		if (!service_uri) {
			return 1;
		} 
		if ((upload_field || upload_value) && (!upload_field || !/* If one is given, both are required */upload_value)) {
			return 1;
		} 
		this.setFailed(0);
		this.setError_code(0);
		Byte generatedError_msg = this.getError_msg();
		if (generatedError_msg) {
			.free(generatedError_msg);
			this.setError_msg(((Object)0));
		} 
		Byte generatedParam_fields = this.getParam_fields();
		Byte generatedParam_values = this.getParam_values();
		if (generatedParam_fields) {
			for (i = 0; generatedParam_fields[i]; i++) {
				.free(generatedParam_fields[i]);
				.free(generatedParam_values[i]);
			}
			.free(generatedParam_fields);
			.free(generatedParam_values);
			this.setParam_fields(((Object)0));
			this.setParam_values(((Object)0));
			this.setParameter_count(0);
		} 
		Byte generatedUpload_field = this.getUpload_field();
		if (generatedUpload_field) {
			.free(generatedUpload_field);
			this.setUpload_field(((Object)0));
		} 
		Byte generatedUpload_value = this.getUpload_value();
		if (generatedUpload_value) {
			.free(generatedUpload_value);
			this.setUpload_value(((Object)0));
		} 
		Byte generatedSecret = this.getSecret();
		if (!generatedSecret) {
			fc.flickcurl_error("No legacy Flickr auth secret");
			return 1;
		} 
		Byte generatedApi_key = this.getApi_key();
		if (!generatedApi_key) {
			fc.flickcurl_error("No API Key (OAuth Client Key)");
			return 1;
		} 
		Byte generatedMethod = this.getMethod();
		if (generatedMethod) {
			.free(generatedMethod);
		} 
		if (method) {
			size_t len = .strlen(method);
			this.setMethod((byte).malloc(len + 1));
			.memcpy(generatedMethod, method, len + 1);
		} else {
				this.setMethod(((Object)0));
		} 
		if (generatedMethod) {
			fc.flickcurl_add_param("method", generatedMethod);
		} 
		fc.flickcurl_add_param("api_key", generatedApi_key);
		Byte generatedAuth_token = this.getAuth_token();
		if (need_auth && generatedAuth_token) {
			fc.flickcurl_add_param("auth_token", generatedAuth_token);
		} 
		fc.flickcurl_end_params();
		int generatedCount = this.getCount();
		this.setParam_fields((byte).calloc(generatedCount + 2, /* +1 for api_sig +1 for NULL terminating pointer */));
		this.setParam_values((byte).calloc(generatedCount + 2, ));
		values_len = (size_t).calloc(generatedCount + 2, );
		int generatedSign = this.getSign();
		if ((need_auth && generatedAuth_token) || generatedSign) {
			fc.flickcurl_sort_args();
		} 
		fc_uri_len = .strlen(service_uri);
		full_uri_len = fc_uri_len;
		if (parameters_in_url) {
			/* for ? */full_uri_len++;
		} 
		Object generatedParameters = this.getParameters();
		for (i = 0; generatedParameters[i][0]; /* Save away the parameters and calculate the value lengths */i++) {
			size_t param_len = .strlen(generatedParameters[i][0]);
			if (generatedParameters[i][1]) {
				values_len[i] = .strlen(generatedParameters[i][1]);
			} else {
					values_len[i] = 0;
					generatedParameters[i][1] = "";
			} 
			generatedParam_fields[i] = (byte).malloc(param_len + 1);
			.memcpy(generatedParam_fields[i], generatedParameters[i][0], param_len + 1);
			generatedParam_values[i] = (byte).malloc(values_len[i] + 1);
			.memcpy(generatedParam_values[i], generatedParameters[i][1], values_len[i] + 1);
			full_uri_len += param_len + 1 + 3 * values_len[/* 3x value len is conservative URI %XX escaping on every char *//* = */i];
		}
		if (upload_field) {
			size_t len = .strlen(upload_field);
			this.setUpload_field((byte).malloc(len + 1));
			.memcpy(generatedUpload_field, upload_field, len + 1);
			len = .strlen(upload_value);
			this.setUpload_value((byte).malloc(len + 1));
			.memcpy(generatedUpload_value, upload_value, len + 1);
		} 
		if ((need_auth && generatedAuth_token) || generatedSign) {
			size_t secret_len = new size_t();
			size_t buf_len = 0;
			byte buf;
			byte p;
			secret_len = .strlen(generatedSecret);
			buf_len = secret_len;
			for (i = 0; generatedParameters[i][0]; i++) {
				buf_len += .strlen(generatedParameters[i][0]) + values_len[i];
			}
			buf = (byte).malloc(buf_len + 1);
			p = buf;
			.memcpy(p, generatedSecret, secret_len);
			p += secret_len;
			for (i = 0; generatedParameters[i][0]; i++) {
				size_t len = .strlen(generatedParameters[i][0]);
				.memcpy(p, generatedParameters[i][0], len);
				p += len;
				.memcpy(p, generatedParameters[i][1], values_len[i]);
				p += values_len[i];
			}
			p = (byte)'\0';
			md5_string = ModernizedCProgram.MD5_string(buf);
			fc.flickcurl_add_param("api_sig", md5_string);
			generatedCount--;
			values_len[generatedCount] = /* Add a new parameter pair *//* MD5 is always 32 */32;
			generatedParam_fields[generatedCount] = (byte).malloc(7 + /* 7 = strlen(api_sig) */1);
			.memcpy(generatedParam_fields[generatedCount], generatedParameters[generatedCount][0], 7 + 1);
			generatedParam_values[generatedCount] = (byte).malloc(32 + /* 32 = MD5 */1);
			.memcpy(generatedParam_values[generatedCount], generatedParameters[generatedCount][1], 32 + 1);
			full_uri_len += 7 + 1 + /* "api_sig" *//* = *//* MD5 value: never escaped */32;
			generatedCount++;
			.free(buf);
			fc.flickcurl_end_params();
		} 
		full_uri_len += generatedCount - /* add &s between parameters */1;
		int generatedUri_len = this.getUri_len();
		Byte generatedUri = this.getUri();
		if (generatedUri_len < /* reuse or grow uri buffer */full_uri_len) {
			.free(generatedUri);
			this.setUri((byte).malloc(full_uri_len + 1));
			this.setUri_len(full_uri_len);
		} 
		.memcpy(generatedUri, service_uri, fc_uri_len);
		generatedUri[fc_uri_len] = (byte)'\0';
		if (parameters_in_url) {
			byte p = generatedUri + fc_uri_len;
			p++ = (byte)'?';
			for (i = 0; generatedParameters[i][0]; i++) {
				byte value = (byte)generatedParameters[i][1];
				int value_is_escaped = 0;
				size_t len = new size_t();
				if (!generatedParameters[i][1]) {
					continue;
				} 
				len = .strlen(generatedParameters[i][0]);
				.memcpy(p, generatedParameters[i][0], len);
				p += len;
				p++ = (byte)'=';
				len = values_len[i];
				if (!.strcmp(generatedParameters[i][0], "method"/* do not touch method name */)) {
				} else {
						value = .curl_escape(value, len);
						len = .strlen(value);
						value_is_escaped = 1;
				} 
				.memcpy(p, value, len);
				p += len;
				if (value_is_escaped) {
					.curl_free(value);
				} 
				p++ = (byte)'&';
			}
			--p = /* zap last & and terminate fc->url */(byte)'\0';
		} 
		if (md5_string) {
			.free(md5_string);
		} 
		if (values_len) {
			.free(values_len);
		} 
		return 0;
	}
	public  flickcurl_build_location(Object xpathCtx, Object xpathExpr) {
		flickcurl_location location = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do location */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				continue;
			} 
			location = (flickcurl_location).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				size_t attr_value_len = .strlen((byte)attr.getChildren().getContent());
				attr_value = (byte).malloc(attr_value_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_value_len + 1);
				if (!.strcmp(attr_name, "latitude")) {
					location.setLatitude(.atof(attr_value));
				}  else if (!.strcmp(attr_name, "longitude")) {
					location.setLongitude(.atof(attr_value));
				}  else if (!.strcmp(attr_name, "accuracy")) {
					location.setAccuracy(.atoi(attr_value));
				} 
				.free(attr_value);
			}
			break;
		}
		return location;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * galleries-api.c - Flickr flickr.galleries.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_galleries_addPhoto:
	 * @fc: flickcurl context
	 * @gallery_id: The ID of the gallery to add a photo to as returned by flickcurl_galleries_getList() and flickcurl_galleries_getListForPhoto().
	 * @photo_id: The photo ID to add to the gallery.
	 * @comment_text: A short comment or story to accompany the photo (or NULL).
	 * 
	 * Add a photo to a gallery.
	 *
	 * Implements flickr.galleries.addPhoto (1.17)
	 * 
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_galleries_addPhoto(Object gallery_id, Object photo_id, Object comment_text) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!gallery_id || !photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("gallery_id", gallery_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		if (comment_text) {
			fc.flickcurl_add_param("comment", comment_text);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.addPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public Byte flickcurl_galleries_create(Object title, Object description, Object primary_photo_id, byte gallery_url_p) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte gallery_id = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!title || !description) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("title", title);
		fc.flickcurl_add_param("description", description);
		if (primary_photo_id) {
			fc.flickcurl_add_param("primary_photo_id", primary_photo_id);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.create")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		gallery_id = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/gallery/@id");
		if (gallery_url_p) {
			gallery_url_p = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/gallery/@url");
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (gallery_id) {
				.free(gallery_id);
			} 
			gallery_id = ((Object)0);
		} 
		return gallery_id/**
		 * flickcurl_galleries_editMeta:
		 * @fc: flickcurl context
		 * @gallery_id: The gallery ID to update.
		 * @title: The new title for the gallery.
		 * @description: The new description for the gallery. (or NULL)
		 * 
		 * Modify the meta-data for a gallery.
		 *
		 * Implements flickr.galleries.editMeta (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_galleries_editMeta(Object gallery_id, Object title, Object description) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!gallery_id || !title) {
			return 1;
		} 
		fc.flickcurl_add_param("gallery_id", gallery_id);
		fc.flickcurl_add_param("title", title);
		if (description) {
			fc.flickcurl_add_param("description", description);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.editMeta")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_galleries_editPhoto:
		 * @fc: flickcurl context
		 * @gallery_id: The ID of the gallery to add a photo to. Note: this is the compound ID returned in methods like flickr.galleries.getList, and flickr.galleries.getListForPhoto.
		 * @photo_id: The photo ID to add to the gallery.
		 * @new_comment: The updated comment the photo.
		 * 
		 * Edit the comment for a gallery photo.
		 *
		 * Implements flickr.galleries.editPhoto (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_galleries_editPhoto(Object gallery_id, Object photo_id, Object new_comment) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!gallery_id || !photo_id || !new_comment) {
			return 1;
		} 
		fc.flickcurl_add_param("gallery_id", gallery_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("comment", new_comment);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.editPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_galleries_editPhotos:
		 * @fc: flickcurl context
		 * @gallery_id: The id of the gallery to modify. The gallery must belong to the calling user.
		 * @primary_photo_id: The id of the photo to use as the 'primary' photo for the gallery. This id must also be passed along in photo_ids list argument.
		 * @photo_ids_array: Array of photo ids to include in the gallery. They will appear in the set in the order sent. This list MUST contain the primary photo id. This list of photos replaces the existing list.
		 * 
		 * Modify the photos in a gallery. Use this method to add, remove and re-order photos.
		 *
		 * Implements flickr.galleries.editPhotos (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_galleries_editPhotos(Object gallery_id, Object primary_photo_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!gallery_id || !primary_photo_id || !photo_ids_array) {
			return 1;
		} 
		fc.flickcurl_add_param("gallery_id", gallery_id);
		fc.flickcurl_add_param("primary_photo_id", primary_photo_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		fc.flickcurl_add_param("photo_ids", photo_ids);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.editPhotos")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_galleries_getInfo:
		 * @fc: flickcurl context
		 * @gallery_id: The gallery ID you are requesting information for.
		 * 
		 * Get information for a gallery.
		 *
		 * Implements flickr.galleries.getInfo (1.18)
		 * 
		 * Announced 2010-04-08
		 * http://code.flickr.com/blog/2010/04/08/galleries-apis/
		 *
		 * Return value: gallery or NULL on failure
		 **/;
	}
	public  flickcurl_galleries_getInfo(Object gallery_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery gallery = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!gallery_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("gallery_id", gallery_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		galleries = fc.flickcurl_build_galleries(xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		if (galleries) {
			gallery = galleries[0];
			galleries[0] = ((Object)0);
			galleries.flickcurl_free_galleries();
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			gallery = ((Object)0);
		} 
		return gallery/**
		 * flickcurl_galleries_getList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to get a galleries list for. If none is specified, the calling user is assumed.
		 * @per_page: Number of galleries to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Return the list of galleries created by a user.
		 *
		 * Galleries are returned sorted from newest to oldest.
		 *
		 * Implements flickr.galleries.getList (1.17)
		 * 
		 * Return value: array of galleries or NULL on failure
		 **/;
	}
	public  flickcurl_galleries_getList(Object user_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!user_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("user_id", user_id);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		galleries = fc.flickcurl_build_galleries(xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (galleries) {
				galleries.flickcurl_free_galleries();
			} 
			galleries = ((Object)0);
		} 
		return galleries/**
		 * flickcurl_galleries_getListForPhoto:
		 * @fc: flickcurl context
		 * @photo_id: The ID of the photo to fetch a list of galleries for.
		 * @per_page: Number of galleries to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Return the list of galleries to which a photo has been added.
		 *
		 * Galleries are returned sorted by date which the photo was added to
		 * the gallery.
		 *
		 * Implements flickr.galleries.getListForPhoto (1.17)
		 * 
		 * Return value: array of galleries or NULL on failure
		 **/;
	}
	public  flickcurl_galleries_getListForPhoto(Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_gallery galleries = ((Object)0);
		byte[] page_str = new byte[10];
		byte[] per_page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.galleries.getListForPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		galleries = fc.flickcurl_build_galleries(xpathCtx, ()"/rsp/galleries/gallery", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (galleries) {
				galleries.flickcurl_free_galleries();
			} 
			galleries = ((Object)0);
		} 
		return galleries/**
		 * flickcurl_galleries_getPhotos_params:
		 * @fc: flickcurl context
		 * @gallery_id: The ID of the gallery of photos to return
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 *
		 * Return the list of photos for a gallery
		 * 
		 * Currently supported extras fields are: description, license,
		 * date_upload, date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags, o_dims, views, media,
		 * path_alias, url_sq, url_t, url_s, url_m, url_o
		 *
		 * Return value: list of people public photos or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * machinetags-api.c - Flickr flickr.machinetags.* API calls
	 *
	 * Copyright (C) 2008-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_machinetags_getNamespaces:
	 * @fc: flickcurl context
	 * @predicate: Limit the list of namespaces returned to those that have the following predicate (or NULL)
	 * @per_page: Number of namespaces to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
	 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
	 * 
	 * Return a list of unique namespaces, optionally limited by a given predicate, in alphabetical order.
	 *
	 * Implements flickr.machinetags.getNamespaces (1.7)
	 *
	 * As announced 2008-11-18
	 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
	 * and
	 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
	 *
	 * Return value: array of namespaces or NULL on failure
	 **/
	public  flickcurl_machinetags_getNamespaces(Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_namespace tag_namespaces = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.machinetags.getNamespaces")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tag_namespaces = fc.flickcurl_build_tag_namespaces(xpathCtx, ()"/rsp/namespaces/namespace", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tag_namespaces) {
				tag_namespaces.flickcurl_free_tag_namespaces();
			} 
			tag_namespaces = ((Object)0);
		} 
		return tag_namespaces/**
		 * flickcurl_machinetags_getPairs:
		 * @fc: flickcurl context
		 * @nspace: Limit the list of pairs returned to those that have the following namespace (or NULL)
		 * @predicate: Limit the list of pairs returned to those that have the following predicate (or NULL)
		 * @per_page: Number of pairs to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique namespace and predicate pairs, optionally limited by predicate or namespace, in alphabetical order.
		 *
		 * Implements flickr.machinetags.getPairs (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of pairs or NULL on failure
		 **/;
	}
	public  flickcurl_machinetags_getPairs(Object nspace, Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("namespace", nspace);
		fc.flickcurl_add_param("predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.machinetags.getPairs")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tag_pvs = fc.flickcurl_build_tag_predicate_values(xpathCtx, ()"/rsp/pairs/pair", /* content not used */0, ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tag_pvs) {
				tag_pvs.flickcurl_free_tag_predicate_values();
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getPredicates:
		 * @fc: flickcurl context
		 * @nspace: Limit the list of predicates returned to those that have the following namespace (or NULL)
		 * @per_page: Number of predicates to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique predicates, optionally limited by a given namespace.
		 *
		 * Implements flickr.machinetags.getPredicates (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of predicates or NULL on failure
		 **/;
	}
	public  flickcurl_machinetags_getPredicates(Object nspace, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param("namespace", nspace);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.machinetags.getPredicates")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tag_pvs = fc.flickcurl_build_tag_predicate_values(xpathCtx, ()"/rsp/predicates/predicate", /* content is predicate */1, ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tag_pvs) {
				tag_pvs.flickcurl_free_tag_predicate_values();
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getValues:
		 * @fc: flickcurl context
		 * @nspace: The namespace that all values should be restricted to.
		 * @predicate: The predicate that all values should be restricted to.
		 * @per_page: Number of values to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500 (or NULL)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1 (or NULL)
		 * 
		 * Return a list of unique values for a namespace and predicate.
		 *
		 * Implements flickr.machinetags.getValues (1.7)
		 * 
		 * As announced 2008-11-18
		 * http://tech.groups.yahoo.com/group/yws-flickr/message/4545
		 * and
		 * http://code.flickr.com/blog/2008/12/15/machine-tag-hierarchies/
		 *
		 * Return value: array of values or NULL on failure
		 **/;
	}
	public  flickcurl_machinetags_getValues(Object nspace, Object predicate, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] per_page_s = new byte[4];
		byte[] page_s = new byte[4];
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!nspace || !predicate) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("namespace", nspace);
		fc.flickcurl_add_param("predicate", predicate);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.machinetags.getValues")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tag_pvs = fc.flickcurl_build_tag_predicate_values(xpathCtx, ()"/rsp/values/value", /* content is value */2, ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tag_pvs) {
				tag_pvs.flickcurl_free_tag_predicate_values();
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs/**
		 * flickcurl_machinetags_getRecentValues:
		 * @fc: flickcurl context
		 * @nspace: A namespace that all values should be restricted to (or NULL)
		 * @predicate: A predicate that all values should be restricted to (or NULL)
		 * @added_since: Only return machine tags values that have been added since this timestamp, in epoch seconds (or <0)
		 * 
		 * Fetch recently used machine tags values.
		 *
		 * Implements flickr.machinetags.getRecentValues (1.12)
		 * 
		 * Return value: array of values or NULL on failure
		 **/;
	}
	public  flickcurl_machinetags_getRecentValues(Object nspace, Object predicate, int added_since) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_tag_predicate_value tag_pvs = ((Object)0);
		byte[] added_since_s = new byte[20];
		fc.flickcurl_init_params(0);
		if (nspace) {
			fc.flickcurl_add_param("namespace", nspace);
		} 
		if (predicate) {
			fc.flickcurl_add_param("predicate", predicate);
		} 
		if (added_since >= 0) {
			.sprintf(added_since_s, "%d", added_since);
			fc.flickcurl_add_param("added_since", added_since_s);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.machinetags.getRecentValues")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		tag_pvs = fc.flickcurl_build_tag_predicate_values(xpathCtx, ()"/rsp/values/value", /* content is value */2, ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (tag_pvs) {
				tag_pvs.flickcurl_free_tag_predicate_values();
			} 
			tag_pvs = ((Object)0);
		} 
		return tag_pvs;
	}
	public  flickcurl_build_members(Object xpathCtx, Object xpathExpr, int member_count_p) {
		flickcurl_member members = ((Object)0);
		int nodes_count;
		int member_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do members */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		members = (flickcurl_member).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_member member_object = new flickcurl_member();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			member_object = (flickcurl_member).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "nsid")) {
					member_object.setNsid(attr_value);
				}  else if (!.strcmp(attr_name, "username")) {
					member_object.setUsername(attr_value);
				}  else if (!.strcmp(attr_name, "iconserver")) {
					member_object.setIconserver(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "iconfarm")) {
					member_object.setIconserver(.atoi((byte)attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "membertype")) {
					member_object.setMember_type(.atoi((byte)attr_value));
					.free(attr_value);
				} else {
						.free(attr_value);
				} 
			}
			members[member_count++] = member_object/* for nodes */;
		}
		if (member_count_p) {
			member_count_p = member_count;
		} 
		return members;
	}
	public int flickcurl_oauth_prepare_common(Object service_uri, Object method, Object upload_field, Object upload_value, int parameters_in_url, int need_auth) {
		 generatedOd = this.getOd();
		flickcurl_oauth_data od = generatedOd;
		int i;
		byte signature_string = ((Object)0);
		size_t values_len = ((Object)0);
		int fc_uri_len = /* length of URI path */0;
		int full_uri_len = /* includes ? and paramters */0;
		byte nonce = ((Object)0);
		int free_nonce = 0;
		byte timestamp = ((Object)0);
		int rc = 1;
		int is_oauth_method = 0;
		byte p;
		if (!service_uri) {
			return 1;
		} 
		if ((upload_field || upload_value) && (!upload_field || !/* If one is given, both are required */upload_value)) {
			return 1;
		} 
		this.setFailed(0);
		this.setError_code(0);
		Byte generatedError_msg = this.getError_msg();
		if (generatedError_msg) {
			.free(generatedError_msg);
			this.setError_msg(((Object)0));
		} 
		Byte generatedParam_fields = this.getParam_fields();
		Byte generatedParam_values = this.getParam_values();
		if (generatedParam_fields) {
			for (i = 0; generatedParam_fields[i]; i++) {
				.free(generatedParam_fields[i]);
				.free(generatedParam_values[i]);
			}
			.free(generatedParam_fields);
			.free(generatedParam_values);
			this.setParam_fields(((Object)0));
			this.setParam_values(((Object)0));
			this.setParameter_count(0);
		} 
		Byte generatedUpload_field = this.getUpload_field();
		if (generatedUpload_field) {
			.free(generatedUpload_field);
			this.setUpload_field(((Object)0));
		} 
		Byte generatedUpload_value = this.getUpload_value();
		if (generatedUpload_value) {
			.free(generatedUpload_value);
			this.setUpload_value(((Object)0));
		} 
		Byte generatedMethod = this.getMethod();
		if (generatedMethod) {
			.free(generatedMethod);
		} 
		if (method) {
			size_t len = .strlen(method);
			this.setMethod((byte).malloc(len + 1));
			if (!generatedMethod) {
				;
			} 
			.memcpy(generatedMethod, method, len + 1);
			is_oauth_method = !.strncmp(method, "flickr.oauth.", 13);
		} else {
				this.setMethod(((Object)0/* OAuth parameters
				   *
				   * oauth_callback         <URL> or "oob" [request token request]
				   * oauth_consumer_key     API key
				   * oauth_nonce            <random value - different each time>
				   * oauth_signature        [ADDED AFTER COMPUTING]
				   * oauth_signature_method "HMAC-SHA1"
				   * oauth_timestamp        <value of gettimeofday()>
				   * oauth_version          "1.0"
				   *
				   * oauth_verifier         verifier [access token request]
				   * oauth_token            access token or request token
				   */));
		} 
		if (generatedMethod && !is_oauth_method) {
			fc.flickcurl_add_param("method", generatedMethod);
		} 
		Object generatedCallback = od.getCallback();
		if (generatedCallback) {
			fc.flickcurl_add_param("oauth_callback", generatedCallback);
		} 
		Object generatedClient_key = od.getClient_key();
		fc.flickcurl_add_param("oauth_consumer_key", generatedClient_key);
		Object generatedNonce = od.getNonce();
		nonce = (byte)generatedNonce;
		Object generatedMt = this.getMt();
		if (!nonce) {
			nonce = (byte).malloc(20);
			if (!nonce) {
				;
			} 
			free_nonce = 1;
			.sprintf(nonce, "%ld", .flickcurl_mtwist_u32rand(generatedMt));
		} 
		fc.flickcurl_add_param("oauth_nonce", nonce);
		fc.flickcurl_add_param("oauth_signature_method", /* oauth_signature - computed over these fields */"HMAC-SHA1");
		timestamp = (byte).malloc(20);
		if (!timestamp) {
			;
		} 
		Object generatedTimestamp = od.getTimestamp();
		Object generatedTimeval = tp.getTimeval();
		if (generatedTimestamp) {
			.sprintf(timestamp, "%ld", (long)generatedTimestamp);
		} else {
				timeval tp = new timeval();
				(Object)tp.gettimeofday(((Object)0));
				.sprintf(timestamp, "%ld", (long)generatedTimeval);
		} 
		fc.flickcurl_add_param("oauth_timestamp", timestamp);
		fc.flickcurl_add_param("oauth_version", "1.0");
		Object generatedToken = od.getToken();
		Object generatedRequest_token = od.getRequest_token();
		if (generatedToken) {
			fc.flickcurl_add_param("oauth_token", generatedToken);
		}  else if (generatedRequest_token) {
			fc.flickcurl_add_param("oauth_token", generatedRequest_token);
		} 
		Object generatedVerifier = od.getVerifier();
		if (generatedVerifier) {
			fc.flickcurl_add_param("oauth_verifier", generatedVerifier);
		} 
		fc.flickcurl_end_params();
		int generatedCount = this.getCount();
		this.setParam_fields((byte).calloc(generatedCount + 8 + 1, /* +FLICKCURL_FLICKCURL_MAX_OAUTH_PARAM_COUNT for oauth fields +1 for NULL terminating pointer */));
		if (!generatedParam_fields) {
			;
		} 
		this.setParam_values((byte).calloc(generatedCount + 8 + 1, ));
		if (!generatedParam_values) {
			;
		} 
		values_len = (size_t).calloc(generatedCount + 8 + 1, );
		if (!values_len) {
			;
		} 
		Object generatedClient_secret = od.getClient_secret();
		Object generatedToken_secret = od.getToken_secret();
		int generatedSign = this.getSign();
		if ((need_auth && (generatedClient_secret || generatedToken_secret)) || generatedSign) {
			fc.flickcurl_sort_args();
		} 
		fc_uri_len = .strlen(service_uri);
		full_uri_len = fc_uri_len;
		if (parameters_in_url) {
			full_uri_len++;
		} 
		Object generatedParameters = this.getParameters();
		for (i = 0; generatedParameters[i][0]; /* Save away the parameters and calculate the value lengths */i++) {
			size_t param_len = .strlen(generatedParameters[i][0]);
			if (generatedParameters[i][1]) {
				values_len[i] = .strlen(generatedParameters[i][1]);
			} else {
					values_len[i] = 0;
					generatedParameters[i][1] = "";
			} 
			generatedParam_fields[i] = (byte).malloc(param_len + 1);
			if (!generatedParam_fields[i]) {
				;
			} 
			.memcpy(generatedParam_fields[i], generatedParameters[i][0], param_len + 1);
			generatedParam_values[i] = (byte).malloc(values_len[i] + 1);
			if (!generatedParam_values[i]) {
				;
			} 
			.memcpy(generatedParam_values[i], generatedParameters[i][1], values_len[i] + 1);
			full_uri_len += param_len + 1 + 3 * values_len[/* 3x value len is conservative URI %XX escaping on every char *//* = */i];
		}
		if (upload_field) {
			size_t len = .strlen(upload_field);
			this.setUpload_field((byte).malloc(len + 1));
			if (!generatedUpload_field) {
				;
			} 
			.memcpy(generatedUpload_field, upload_field, len + 1);
			len = .strlen(upload_value);
			this.setUpload_value((byte).malloc(len + 1));
			if (!generatedUpload_value) {
				;
			} 
			.memcpy(generatedUpload_value, upload_value, len + 1);
		} 
		int generatedIs_write = this.getIs_write();
		Object generatedData = od.getData();
		Object generatedKey = od.getKey();
		if (((need_auth && (generatedClient_secret || generatedToken_secret))) || generatedSign) {
			byte buf = ((Object)0);
			size_t buf_len = 0;
			byte param_buf = ((Object)0);
			size_t param_buf_len = 0;
			size_t vlen = 0;
			byte escaped_value = ((Object)0);
			byte http_method;
			size_t http_method_len = new size_t();
			size_t escaped_value_len = new size_t();
			for (i = 0; generatedParameters[i][0]; i++) {
				param_buf_len += .strlen(generatedParameters[i][0]) + 3 + (3 * values_len[i]) + 3;
			}
			param_buf = (byte).malloc(param_buf_len + 1);
			if (!param_buf) {
				;
			} 
			param_buf = (byte)'\0';
			p = param_buf;
			for (i = 0; generatedParameters[i][0]; i++) {
				size_t len = .strlen(generatedParameters[i][0]);
				if (i > 0) {
					p++ = (byte)'&';
				} 
				.memcpy(p, generatedParameters[i][0], len);
				p += len;
				p++ = (byte)'=';
				escaped_value = .curl_escape(generatedParameters[i][1], 0);
				escaped_value_len = .strlen(escaped_value);
				.memcpy(p, escaped_value, escaped_value_len);
				p += escaped_value_len;
				.curl_free(escaped_value);
			}
			p = (byte)'\0';
			http_method = (upload_field || generatedIs_write) ? "POST" : "GET";
			http_method_len = (upload_field || generatedIs_write) ? 4 : 3;
			buf_len = http_method_len;
			buf_len += /* & */1;
			buf_len += (3 * .strlen(service_uri));
			buf_len += /* & */1;
			buf_len += param_buf_len * 3;
			buf = (byte).malloc(buf_len + 1);
			if (!buf) {
				.free(param_buf);
				;
			} 
			p = buf;
			.memcpy(p, http_method, http_method_len);
			p += http_method_len;
			p++ = (byte)'&';
			escaped_value = .curl_escape(service_uri, 0);
			escaped_value_len = .strlen(escaped_value);
			.memcpy(p, escaped_value, escaped_value_len);
			p += escaped_value_len;
			.curl_free(escaped_value);
			p++ = (byte)'&';
			escaped_value = .curl_escape(param_buf, 0);
			escaped_value_len = .strlen(escaped_value);
			.memcpy(p, escaped_value, escaped_value_len);
			p += escaped_value_len;
			.curl_free(escaped_value);
			p = (byte)'\0';
			.free(param_buf);
			if (od.flickcurl_oauth_build_key()) {
				.free(buf);
				;
			} 
			od.setData((byte)/* build data */buf);
			od.setData_len(.strlen((byte)generatedData));
			signature_string = od.flickcurl_oauth_compute_signature(vlen);
			.free(generatedKey);
			od.setKey(((Object)0));
			fc.flickcurl_add_param("oauth_signature", signature_string);
			generatedCount--;
			values_len[generatedCount] = /* Add a new parameter pair */vlen;
			generatedParam_fields[generatedCount] = (byte).malloc(15 + /* 15 = strlen(oauth_signature) */1);
			if (!generatedParam_fields[generatedCount]) {
				;
			} 
			.memcpy(generatedParam_fields[generatedCount], generatedParameters[generatedCount][0], 15 + 1);
			generatedParam_values[generatedCount] = (byte).malloc(vlen + 1);
			if (!generatedParam_values[generatedCount]) {
				;
			} 
			.memcpy(generatedParam_values[generatedCount], generatedParameters[generatedCount][1], vlen + 1);
			full_uri_len += 15 + 1 + /* "oauth_signature" *//* = */vlen;
			generatedCount++;
			.free(generatedData);
			od.setData(((Object)0));
			od.setData_len(0);
			fc.flickcurl_end_params();
		} 
		full_uri_len += generatedCount - /* add &s between fc->parameters */1;
		int generatedUri_len = this.getUri_len();
		Byte generatedUri = this.getUri();
		if (generatedUri_len < /* reuse or grow uri buffer */full_uri_len) {
			.free(generatedUri);
			this.setUri((byte).malloc(full_uri_len + 1));
			if (!generatedUri) {
				;
			} 
			this.setUri_len(full_uri_len);
		} 
		.memcpy(generatedUri, service_uri, /* fc_uri_len is strlen(service_uri) at this point */fc_uri_len);
		p = generatedUri + fc_uri_len;
		p = (byte)'\0';
		if (parameters_in_url) {
			p++ = (byte)'?';
			for (i = 0; generatedParameters[i][0]; i++) {
				byte value = (byte)generatedParameters[i][1];
				size_t len = new size_t();
				if (!generatedParameters[i][1]) {
					continue;
				} 
				len = .strlen(generatedParameters[i][0]);
				.memcpy(p, generatedParameters[i][0], len);
				p += len;
				p++ = (byte)'=';
				value = .curl_escape(value, values_len[i]);
				len = .strlen(value);
				.memcpy(p, value, len);
				p += len;
				.curl_free(value);
				p++ = (byte)'&';
			}
			--p = /* zap last & and terminate fc->url */(byte)'\0';
		} 
		rc = 0;
		if (values_len) {
			.free(values_len);
		} 
		if (free_nonce) {
			.free(nonce);
		} 
		if (timestamp) {
			.free(timestamp);
		} 
		return rc/**
		 * flickcurl_oauth_create_request_token:
		 * @fc: flickcurl object
		 * @callback: callback URL or NULL for out of band
		 *
		 * Request an OAuth request token from Flickr for the application API Key/secret
		 *
		 * Requires the OAuth Client key (API key) and Client secret to have
		 * been set with flickcurl_set_oauth_client_key() and
		 * flickcurl_set_oauth_client_secret() respectively.
		 * 
		 * Calls the Flickr OAuth endpoint to get a request token for the
		 * given callback or uses out-of-band if @callback is NULL.
		 *
		 * On success, stores the request token in the @fc structure.
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public int flickcurl_oauth_create_request_token(Object callback) {
		 generatedOd = this.getOd();
		flickcurl_oauth_data od = generatedOd;
		byte request_token = ((Object)0);
		byte request_token_secret = ((Object)0);
		byte form = ((Object)0);
		int rc = 0;
		Byte generatedOauth_request_token_uri = this.getOauth_request_token_uri();
		byte uri = generatedOauth_request_token_uri;
		int i;
		int count;
		fc.flickcurl_init_params(0);
		/* Require signature */fc.flickcurl_set_sign();
		if (!callback || !callback) {
			callback = "oob";
		} 
		od.setCallback(callback);
		rc = fc.flickcurl_oauth_prepare_common(uri, /* method */"flickr.oauth.request_token", ((Object)/* upload_field */0), ((Object)/* upload_value */0), /* parameters_in_url */1, /* need_auth */1);
		od.setCallback(((Object)0));
		if (rc) {
			;
		} 
		form = fc.flickcurl_invoke_get_form_content(count);
		if (!form) {
			rc = 1;
			;
		} 
		for (i = 0; i < count; i++) {
			int offset = 1 + (2 * i);
			if (!.strcmp(form[offset], "oauth_token")) {
				request_token = form[offset + 1];
			}  else if (!.strcmp(form[offset], "oauth_token_secret")) {
				request_token_secret = form[offset + 1];
			} 
		}
		Object generatedRequest_token = od.getRequest_token();
		Object generatedRequest_token_secret = od.getRequest_token_secret();
		if (request_token && request_token_secret) {
			size_t len = .strlen(/* Take copies that are owned by od */request_token);
			od.setRequest_token((byte).malloc(len + 1));
			.memcpy(generatedRequest_token, request_token, len + 1);
			od.setRequest_token_len(len);
			len = .strlen(request_token_secret);
			od.setRequest_token_secret((byte).malloc(len + 1));
			.memcpy(generatedRequest_token_secret, request_token_secret, len + 1);
			od.setRequest_token_secret_len(len);
		} else {
				rc = 1;
		} 
		return rc/**
		 * flickcurl_oauth_get_authorize_uri:
		 * @fc: flickcurl object
		 *
		 * Get the URL for the user to authorize Flickr OAuth of an application
		 *
		 * Forms the URL the user needs to start at to authorize the
		 * application.
		 *
		 * This function requires flickcurl_oauth_create_request_token() to have
		 * been called to build a request token / secret pair.
		 *
		 * After this function, the application should pass the verifier to
		 * flickcurl_oauth_create_access_token() for the final step in OAuth along
		 * with the request token and request token secret.
		 *
		 * Return value: authorize URI or NULL on failure
		 */;
	}
	public Byte flickcurl_oauth_get_authorize_uri() {
		 generatedOd = this.getOd();
		flickcurl_oauth_data od = generatedOd;
		byte param = "?oauth_token=";
		size_t len = new size_t();
		byte uri;
		byte p;
		Object generatedRequest_token = od.getRequest_token();
		if (!generatedRequest_token) {
			return ((Object)0);
		} 
		len = .strlen(ModernizedCProgram.flickcurl_flickr_oauth_authorize_uri);
		Object generatedRequest_token_len = od.getRequest_token_len();
		uri = (byte).malloc(len + 13 + generatedRequest_token_len + 1);
		if (!uri) {
			return ((Object)0);
		} 
		p = uri;
		.memcpy(p, ModernizedCProgram.flickcurl_flickr_oauth_authorize_uri, len);
		p += len;
		.memcpy(p, param, 13);
		p += 13;
		.memcpy(p, generatedRequest_token, generatedRequest_token_len);
		p += generatedRequest_token_len;
		p = (byte)'\0';
		return uri/**
		 * flickcurl_oauth_create_access_token:
		 * @fc: flickcurl object
		 * @verifier: verifier from OOB authentication
		 *
		 * Get a Flickr OAuth access token from request token credentials and verifier
		 *
		 * Calls the Flickr OAuth access token endpoint using the verifier
		 * from out of band authentication to get an access token to enable
		 * authenticated calls to the Flickr API.
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public int flickcurl_oauth_create_access_token(Object verifier) {
		 generatedOd = this.getOd();
		flickcurl_oauth_data od = generatedOd;
		byte access_token = ((Object)0);
		byte access_token_secret = ((Object)0);
		byte username = ((Object)0);
		byte user_nsid = ((Object)0);
		byte form = ((Object)0);
		int rc = 0;
		Byte generatedOauth_access_token_uri = this.getOauth_access_token_uri();
		byte uri = generatedOauth_access_token_uri;
		int i;
		int count;
		if (!verifier) {
			return 1;
		} 
		fc.flickcurl_init_params(0);
		/* Require signature */fc.flickcurl_set_sign();
		od.setVerifier(verifier);
		od.setVerifier_len(.strlen(verifier));
		rc = fc.flickcurl_oauth_prepare_common(uri, /* method */"flickr.oauth.access_token", ((Object)/* upload_field */0), ((Object)/* upload_value */0), /* parameters_in_url */1, /* need_auth */1);
		od.setVerifier(((Object)0));
		od.setVerifier_len(0);
		if (rc) {
			;
		} 
		form = fc.flickcurl_invoke_get_form_content(count);
		if (!form) {
			rc = 1;
			;
		} 
		for (i = 0; i < count; i++) {
			int offset = 1 + (2 * i);
			if (!.strcmp(form[offset], "oauth_token")) {
				access_token = form[offset + 1];
			}  else if (!.strcmp(form[offset], "oauth_token_secret")) {
				access_token_secret = form[offset + 1];
			}  else if (!.strcmp(form[offset], "username")) {
				username = form[offset + 1];
			}  else if (!.strcmp(form[offset], "user_nsid")) {
				user_nsid = form[offset + 1/* ignoring: fullname */];
			} 
		}
		Object generatedToken = od.getToken();
		Object generatedToken_secret = od.getToken_secret();
		Object generatedUsername = od.getUsername();
		Object generatedUser_nsid = od.getUser_nsid();
		Object generatedRequest_token = od.getRequest_token();
		Object generatedRequest_token_secret = od.getRequest_token_secret();
		if (access_token && access_token_secret) {
			size_t len = .strlen(/* Take copies that are owned by od */access_token);
			od.setToken((byte).malloc(len + 1));
			.memcpy(generatedToken, access_token, len + 1);
			od.setToken_len(len);
			len = .strlen(access_token_secret);
			od.setToken_secret((byte).malloc(len + 1));
			.memcpy(generatedToken_secret, access_token_secret, len + 1);
			od.setToken_secret_len(len);
			if (username) {
				len = .strlen(username);
				od.setUsername((byte).malloc(len + 1));
				.memcpy(generatedUsername, username, len + 1);
				od.setUsername_len(len);
			} else {
					od.setUsername(((Object)0));
					od.setUsername_len(0);
			} 
			if (user_nsid) {
				len = .strlen(user_nsid);
				od.setUser_nsid((byte).malloc(len + 1));
				.memcpy(generatedUser_nsid, user_nsid, len + 1);
				od.setUser_nsid_len(len);
			} else {
					od.setUser_nsid(((Object)0));
					od.setUser_nsid_len(0);
			} 
			.free(generatedRequest_token);
			od.setRequest_token(((Object)0));
			od.setRequest_token_len(0);
			.free(generatedRequest_token_secret);
			od.setRequest_token_secret(((Object)0));
			od.setRequest_token_secret_len(0);
		} else {
				rc = 1;
		} 
		return rc/**
		 * flickcurl_get_oauth_client_key:
		 * @fc: flickcurl object
		 *
		 * Get OAuth Client Key (aka Consumer key, API Key)
		 *
		 * See also flickcurl_get_oauth_client_secret()
		 *
		 * Return value: client key or NULL if none set
		 */;
	}
	public Object flickcurl_get_oauth_client_key() {
		 generatedOd = this.getOd();
		Object generatedClient_key = generatedOd.getClient_key();
		return generatedClient_key;
	}
	public Object flickcurl_get_oauth_client_secret() {
		 generatedOd = this.getOd();
		Object generatedClient_secret = generatedOd.getClient_secret();
		return generatedClient_secret;
	}
	public void flickcurl_set_oauth_client_key(Object client_key) {
		 generatedOd = this.getOd();
		Object generatedClient_key = generatedOd.getClient_key();
		if (generatedClient_key) {
			.free(generatedClient_key);
			generatedOd.setClient_key(((Object)0));
			generatedOd.setClient_key_len(0);
		} 
		if (client_key) {
			size_t len = .strlen(client_key);
			generatedOd.setClient_key((byte).malloc(len + 1));
			.memcpy(generatedClient_key, client_key, len + 1);
			generatedOd.setClient_key_len(len/**
			 * flickcurl_set_oauth_client_secret:
			 * @fc: flickcurl object
			 * @client_secret: client key (shared key)
			 *
			 * Set OAuth client key (aka shared secret)
			 *
			 * See also flickcurl_set_oauth_client_secret()
			 */);
		} 
	}
	public void flickcurl_set_oauth_client_secret(Object client_secret) {
		 generatedOd = this.getOd();
		Object generatedClient_secret = generatedOd.getClient_secret();
		if (generatedClient_secret) {
			.free(generatedClient_secret);
			generatedOd.setClient_secret(((Object)0));
			generatedOd.setClient_secret_len(0);
		} 
		if (client_secret) {
			size_t len = .strlen(client_secret);
			generatedOd.setClient_secret((byte).malloc(len + 1));
			.memcpy(generatedClient_secret, client_secret, len + 1);
			generatedOd.setClient_secret_len(len/**
			 * flickcurl_get_oauth_token:
			 * @fc: flickcurl object
			 *
			 * Get OAuth Token
			 *
			 * Return value: auth token or NULL if none set
			 */);
		} 
	}
	public Object flickcurl_get_oauth_token() {
		 generatedOd = this.getOd();
		Object generatedToken = generatedOd.getToken();
		return generatedToken;
	}
	public void flickcurl_set_oauth_token(Object token) {
		 generatedOd = this.getOd();
		Object generatedToken = generatedOd.getToken();
		if (generatedToken) {
			.free(generatedToken);
			generatedOd.setToken(((Object)0));
			generatedOd.setToken_len(0);
		} 
		if (token) {
			size_t len = .strlen(token);
			generatedOd.setToken((byte).malloc(len + 1));
			.memcpy(generatedToken, token, len + 1);
			generatedOd.setToken_len(len/**
			 * flickcurl_get_oauth_token_secret:
			 * @fc: flickcurl object
			 *
			 * Get OAuth token secret
			 *
			 * Return value: secret or NULL if none set
			 */);
		} 
	}
	public Object flickcurl_get_oauth_token_secret() {
		 generatedOd = this.getOd();
		Object generatedToken_secret = generatedOd.getToken_secret();
		return generatedToken_secret;
	}
	public Object flickcurl_get_oauth_username() {
		 generatedOd = this.getOd();
		Object generatedUsername = generatedOd.getUsername();
		return generatedUsername;
	}
	public Object flickcurl_get_oauth_user_nsid() {
		 generatedOd = this.getOd();
		Object generatedUser_nsid = generatedOd.getUser_nsid();
		return generatedUser_nsid;
	}
	public void flickcurl_set_oauth_token_secret(Object secret) {
		 generatedOd = this.getOd();
		Object generatedToken_secret = generatedOd.getToken_secret();
		if (generatedToken_secret) {
			.free(generatedToken_secret);
			generatedOd.setToken_secret(((Object)0));
			generatedOd.setToken_secret_len(0);
		} 
		if (secret) {
			size_t len = .strlen(secret);
			generatedOd.setToken_secret((byte).malloc(len + 1));
			.memcpy(generatedToken_secret, secret, len + 1);
			generatedOd.setToken_secret_len(len/**
			 * flickcurl_get_oauth_request_token:
			 * @fc: flickcurl object
			 *
			 * Get OAuth request token
			 *
			 * Return value: request token or NULL if none set
			 */);
		} 
	}
	public Object flickcurl_get_oauth_request_token() {
		 generatedOd = this.getOd();
		Object generatedRequest_token = generatedOd.getRequest_token();
		return generatedRequest_token;
	}
	public Object flickcurl_get_oauth_request_token_secret() {
		 generatedOd = this.getOd();
		Object generatedRequest_token_secret = generatedOd.getRequest_token_secret();
		return generatedRequest_token_secret;
	}
	public void flickcurl_set_oauth_request_token(Object token) {
		 generatedOd = this.getOd();
		Object generatedRequest_token = generatedOd.getRequest_token();
		if (generatedRequest_token) {
			.free(generatedRequest_token);
			generatedOd.setRequest_token(((Object)0));
			generatedOd.setRequest_token_len(0);
		} 
		if (token) {
			size_t len = .strlen(token);
			generatedOd.setRequest_token((byte).malloc(len + 1));
			.memcpy(generatedRequest_token, token, len + 1);
			generatedOd.setRequest_token_len(len/**
			 * flickcurl_set_oauth_request_token_secret:
			 * @fc: flickcurl object
			 * @secret: request token secret
			 *
			 * Set OAuth request token secret credentials
			 *
			 * See also flickcurl_get_oauth_request_token_secret()
			 */);
		} 
	}
	public void flickcurl_set_oauth_request_token_secret(Object secret) {
		 generatedOd = this.getOd();
		Object generatedRequest_token_secret = generatedOd.getRequest_token_secret();
		if (generatedRequest_token_secret) {
			.free(generatedRequest_token_secret);
			generatedOd.setRequest_token_secret(((Object)0));
			generatedOd.setRequest_token_secret(0);
		} 
		if (secret) {
			size_t len = .strlen(secret);
			generatedOd.setRequest_token_secret((byte).malloc(len + 1));
			.memcpy(generatedRequest_token_secret, secret, len + 1);
			generatedOd.setRequest_token_secret_len(len);
		} 
	}
	/* Test KEY fields */
	/* Test DATA fields */
	/* Expected results */
	/* Set up test data */
	/* PESSIMAL; every char %-escaped */
	/* PESSIMAL */
	/* for NUL */
	/* Prepare data */
	/* Not part of HMAC-SHA1 data */
	/* calculate actual data len */
	/* No raptor_basename */
	/* Initialise the Flickcurl library */
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photosets-api.c - Flickr flickr.photosets.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photosets_addPhoto:
	 * @fc: flickcurl context
	 * @photoset_id: The id of the photoset to add a photo to.
	 * @photo_id: The id of the photo to add to the set.
	 * 
	 * Add a photo to the end of an existing photoset.
	 *
	 * Implements flickr.photosets.addPhoto (0.13)
	 * 
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_photosets_addPhoto(Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.addPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_create:
		 * @fc: flickcurl context
		 * @title: A title for the photoset.
		 * @description: A description of the photoset which may contain limited html (or NULL)
		 * @primary_photo_id: The id of the photo to represent this set. The photo must belong to the calling user.
		 * @photoset_url_p: pointer to variable to store new photoset URL (or NULL)
		 * 
		 * Create a new photoset for the calling user.
		 *
		 * Implements flickr.photosets.create (0.13)
		 * 
		 * Return value: photoset ID or NULL on failure
		 **/;
	}
	public Byte flickcurl_photosets_create(Object title, Object description, Object primary_photo_id, byte photoset_url_p) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte photoset_id = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!title || !primary_photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("title", title);
		if (description) {
			fc.flickcurl_add_param("description", description);
		} 
		fc.flickcurl_add_param("primary_photo_id", primary_photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.create")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		photoset_id = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/photoset/@id");
		if (photoset_url_p) {
			photoset_url_p = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/photoset/@url");
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (photoset_id) {
				.free(photoset_id);
			} 
			photoset_id = ((Object)0);
		} 
		return photoset_id/**
		 * flickcurl_photosets_delete:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to delete. Must be owned by the calling user.
		 * 
		 * Delete a photoset.
		 *
		 * Implements flickr.photosets.delete (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_delete(Object photoset_id) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photoset_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.delete")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public int flickcurl_photosets_editMeta(Object photoset_id, Object title, Object description) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photoset_id || !title) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("title", title);
		if (description) {
			fc.flickcurl_add_param("description", description);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.editMeta")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_editPhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to modify. Must belong to the calling user.
		 * @primary_photo_id: The id of the photo to use as the 'primary' photo for the set. This id must also be passed along in photo_ids list argument.
		 * @photo_ids_array: Array of photo ids to include in the set. They will appear in the set in the order sent. This list MUST contain the primary photo id. All photos must belong to the owner of the set. This list of photos replaces the existing list. Call flickr.photosets.addPhoto to append a photo to a set.
		 * 
		 * Modify the photos in a photoset.
		 *
		 * Use this method to add, remove and re-order photos.
		 *
		 * Implements flickr.photosets.editPhotos (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_editPhotos(Object photoset_id, Object primary_photo_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photoset_id || !primary_photo_id || !photo_ids_array) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("primary_photo_id", primary_photo_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		fc.flickcurl_add_param("photo_ids", photo_ids);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.editPhotos")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		if (photo_ids) {
			.free(photo_ids);
		} 
		return result/**
		 * flickcurl_photosets_getContext:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @photoset_id: photoset ID
		 *
		 * Get next and previous photos for a photo in a set.
		 * 
		 * Implements flickr.photosets.getContext (0.7)
		 *
		 * Return value: an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 **/;
	}
	public  flickcurl_photosets_getContext(Object photo_id, Object photoset_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id || !photoset_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.getContext")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		contexts = fc.flickcurl_build_contexts(doc);
		return contexts/**
		 * flickcurl_photosets_getInfo:
		 * @fc: flickcurl context
		 * @photoset_id: The ID of the photoset to fetch information for.
		 * 
		 * Gets information about a photoset.
		 *
		 * Implements flickr.photosets.getInfo (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photosets_getInfo(Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photoset photoset = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photoset_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		photoset = fc.flickcurl_build_photoset(xpathCtx);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (photoset) {
				photoset.flickcurl_free_photoset();
			} 
			photoset = ((Object)0);
		} 
		return photoset/**
		 * flickcurl_photosets_getList:
		 * @fc: flickcurl context
		 * @user_id: The NSID of the user to get a photoset list for. If none is specified, the calling user is assumed (or NULL)
		 * 
		 * Returns the photosets belonging to the specified user.
		 *
		 * Implements flickr.photosets.getList (0.13)
		 * 
		 * Return value: array of photoset IDs or NULL on failure
		 **/;
	}
	public  flickcurl_photosets_getList(Object user_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_photoset photoset_list = ((Object)0);
		fc.flickcurl_init_params(0);
		if (user_id) {
			fc.flickcurl_add_param("user_id", user_id);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.getList")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		photoset_list = fc.flickcurl_build_photosets(xpathCtx, ()"/rsp/photosets/photoset", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (photoset_list) {
				photoset_list.flickcurl_free_photosets();
			} 
			photoset_list = ((Object)0);
		} 
		return photoset_list/**
		 * flickcurl_photosets_getPhotos_params:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to return the photos for.
		 * @privacy_filter: Return photos only matching a certain privacy level 1-5 (or <0)
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get the list of photos in a set.
		 *
		 * Currently supported extra fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public int flickcurl_photosets_orderSets(Object photoset_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photoset_ids;
		fc.flickcurl_init_params(0);
		if (!photoset_ids_array) {
			return 1;
		} 
		photoset_ids = ModernizedCProgram.flickcurl_array_join(photoset_ids_array, (byte)',');
		fc.flickcurl_add_param("photoset_ids", photoset_ids);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.orderSets")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		if (photoset_ids) {
			.free(photoset_ids);
		} 
		return result/**
		 * flickcurl_photosets_removePhoto:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to remove a photo from.
		 * @photo_id: The id of the photo to remove from the set.
		 * 
		 * Remove a photo from a photoset.
		 *
		 * Implements flickr.photosets.removePhoto (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_removePhoto(Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.removePhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photosets_removePhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to remove photos from.
		 * @photo_ids_array: Array of photo ids to remove from the photoset.
		 * 
		 * Remove multiple photos from a photoset.
		 *
		 * Implements flickr.photosets.removePhotos (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_removePhotos(Object photoset_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photoset_id || !photo_ids_array) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		fc.flickcurl_add_param("photo_ids", photo_ids);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.removePhotos")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photosets_reorderPhotos:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to reorder. The photoset must belong to the calling user.
		 * @photo_ids_array: Array of Ordered list of photo ids.  Photos that are not in the list will keep their original order
		 * 
		 * (null)
		 *
		 * Implements flickr.photosets.reorderPhotos (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_reorderPhotos(Object photoset_id, Object photo_ids_array) {
		 doc = ((Object)0);
		int result = 1;
		byte photo_ids = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photoset_id || !photo_ids_array) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		photo_ids = ModernizedCProgram.flickcurl_array_join(photo_ids_array, (byte)',');
		fc.flickcurl_add_param("photo_ids", photo_ids);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.reorderPhotos")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = 1;
		} 
		return result/**
		 * flickcurl_photosets_setPrimaryPhoto:
		 * @fc: flickcurl context
		 * @photoset_id: The id of the photoset to set primary photo to.
		 * @photo_id: The id of the photo to set as primary.
		 * 
		 * Set photoset primary photo
		 *
		 * Implements flickr.photosets.setPrimaryPhoto (1.19)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photosets_setPrimaryPhoto(Object photoset_id, Object photo_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photoset_id || !photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photosets.setPrimaryPhoto")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * config.c - INI configuration file handling
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_config_read_ini:
	 * @fc: flickcurl config
	 * @filename: filename
	 * @section: section name to use
	 * @user_data: user data pointer for handler (usually the @fc )
	 * @handler: config variable handler function (usually flickcurl_config_var_handler() )
	 *
	 * Read flickcurl library configuration in .INI format from a filename
	 *
	 * Return value: non-0 on failure
	 */
	public int flickcurl_config_read_ini(Object filename, Object section, Object user_data, Object handler) {
		FILE fh = new FILE();
		byte[] buf = new byte[255 + 1];
		int in_section = 0;
		int lineno = 1;
		size_t section_len = new size_t();
		if (!fc || !filename || !section || !handler) {
			return 1;
		} 
		fh = .fopen(filename, "r");
		if (!fh) {
			fc.flickcurl_error("Failed to open %s for reading - %s", filename, .strerror((._errno())));
			return 1;
		} 
		section_len = .strlen(section);
		Object generated_flag = (fh).get_flag();
		while (!(generated_flag & -1024)) {
			size_t len = new size_t();
			byte line;
			byte p;
			int warned = 0;
			int c = -1;
			int lastch = -1;
			for (; !(generated_flag & -1024); lastch = c) {
				c = .fgetc(fh);
				if (c == (byte)'\n') {
					/* Line endings: \n or \r\n (\r is removed after this loop) */lineno++;
					break;
				}  else if (lastch == (byte)'\r') {
					.ungetc(c, /* Line ending: \r - need to put back this character */fh);
					line--;
					len--;
					lineno++;
					break;
				} 
				if (len > 255) {
					if (!warned++) {
						.fprintf((_iob[2]), "flickcurl_config_read_ini(): line %d too long - truncated\n", lineno);
					} 
					continue;
				} 
				line++ = c;
				len++;
			}
			line = (byte)'\0';
			if (!len) {
				continue;
			} 
			for (line = /* remove leading spaces */buf; line && (line == (byte)' ' || line == (byte)'\t'); ) {
				;
			}
			if (line[len - 1] == /* remove trailing \r, \n or \r\n */(byte)'\n') {
				line[(len--) - 1] = (byte)'\0';
			} 
			if (line[len - 1] == (byte)'\r') {
				line[(len--) - 1] = (byte)'\0';
			} 
			if (!line || line == /* skip if empty line or all white space OR starts with a comment */(byte)'#') {
				continue;
			} 
			if (!/* Wait for a line '['application']' */in_section) {
				if (line == (byte)'[' && line[len - 1] == (byte)']' && (len - 2) == section_len && !.strncmp(line + 1, section, len - 2)) {
					in_section = 1;
				} 
				continue;
			} 
			if (line == /* End at a line starting with '[' */(byte)'[') {
				break;
			} 
			p = .strchr(line, (byte)'=');
			if (p) {
				byte kchar;
				p = (byte)'\0';
				kchar = (p - /* remove trailing spaces at end of key */1);
				while (kchar >= line && .isspace(kchar)) {
					kchar-- = (byte)'\0';
				}
				/* remove leading spaces at start of value */p++;
				while (p && .isspace(p)) {
					p++;
				}
				if (handler) {
					.handler(user_data, line, p);
				} 
			} 
		}
		.fclose(fh);
		return 0/**
		 * read_ini_config:
		 * @filename: filename
		 * @section: section name to use
		 * @user_data: user data pointer for handler
		 * @handler: config variable handler function
		 *
		 * @Deprecated for flickcurl_config_read_ini()
		 * 
		 * Read .INI config
		 *
		 * Return value: non-0 on failure
		 */;
	}
	public int flickcurl_config_write_ini(Object filename, Object section) {
		byte s;
		FILE fh = new FILE();
		if (!fc || !filename || !section) {
			return 1;
		} 
		fh = .fopen(filename, "w");
		if (!fh) {
			fc.flickcurl_error("Failed to write to configuration file %s - %s", filename, .strerror((._errno())));
			return 1;
		} 
		.fputc((byte)'[', fh);
		.fputs(section, fh);
		.fputc((byte)']', fh);
		s = fc.flickcurl_get_oauth_token();
		if (s) {
			.fputs("\noauth_token=", /* OAuth token and secret */fh);
			.fputs(s, fh);
			s = fc.flickcurl_get_oauth_token_secret();
			if (s) {
				.fputs("\noauth_token_secret=", fh);
				.fputs(s, fh);
			} 
			s = fc.flickcurl_get_oauth_client_key();
			if (s) {
				.fputs("\noauth_client_key=", fh);
				.fputs(s, fh);
			} 
			s = fc.flickcurl_get_oauth_client_secret();
			if (s) {
				.fputs("\noauth_client_secret=", fh);
				.fputs(s, fh);
			} 
		} else {
				s = /* Legacy Flickr auth */fc.flickcurl_get_auth_token();
				if (s) {
					.fputs("\noauth_token=", fh);
					.fputs(s, fh);
				} 
				s = fc.flickcurl_get_shared_secret();
				if (s) {
					.fputs("\noauth_secret=", fh);
					.fputs(s, fh);
				} 
				s = fc.flickcurl_get_api_key();
				if (s) {
					.fputs("\napi_key=", fh);
					.fputs(s, fh);
				} 
		} 
		.fputs("\n", fh);
		.fclose(fh);
		return 0;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-comments-api.c - Flickr flickr.photos.comments.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_comments_addComment:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a comment to.
	 * @comment_text: Text of the comment
	 * 
	 * Add comment to a photo as the currently authenticated user.
	 *
	 * Implements flickr.photos.comments.addComment (0.10)
	 * 
	 * Return value: new comment ID or non-NULL on failure
	 **/
	public Byte flickcurl_photos_comments_addComment(Object photo_id, Object comment_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || !comment_text) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("comment_text", comment_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.comments.addComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		id = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/comment/@id");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photos_comments_deleteComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * 
		 * Delete a comment as the currently authenticated user.
		 *
		 * Implements flickr.photos.comments.deleteComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_comments_deleteComment(Object comment_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!comment_id) {
			return 1;
		} 
		fc.flickcurl_add_param("comment_id", comment_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.comments.deleteComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_comments_editComment:
		 * @fc: flickcurl context
		 * @comment_id: The id of the comment to edit.
		 * @comment_text: Update the comment to this text.
		 * 
		 * Edit the text of a comment as the currently authenticated user.
		 *
		 * Implements flickr.photos.comments.editComment (0.10)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_comments_editComment(Object comment_id, Object comment_text) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!comment_id || !comment_text) {
			return 1;
		} 
		fc.flickcurl_add_param("comment_id", comment_id);
		fc.flickcurl_add_param("comment_text", comment_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.comments.editComment")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_comments_getList:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to fetch comments for.
		 * 
		 * Returns the comments for a photo
		 *
		 * Implements flickr.photos.comments.getList (0.10)
		 * 
		 * Return value: array of comments or NULL on failure
		 **/;
	}
	public  flickcurl_groups_getInfo(Object group_id, Object lang) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		flickcurl_group group = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!group_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("group_id", group_id);
		if (lang) {
			fc.flickcurl_add_param("lang", lang);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		groups = fc.flickcurl_build_groups(xpathCtx, ()"/rsp/group", ((Object)0));
		if (groups) {
			group = groups[0];
			.free(groups);
			groups = ((Object)0);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (group) {
				group.flickcurl_free_group();
			} 
			group = ((Object)0);
		} 
		return group/**
		 * flickcurl_groups_join:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the Group in question
		 * @accept_rules: If the group has rules, they must be displayed to the user prior to joining. Passing a true value for this argument specifies that the application has displayed the group rules to the user, and that the user has agreed to them. (See flickr.groups.getInfo). Probably takes a '1' or '0' value (or NULL)
		 * 
		 * Join a public group as a member.
		 *
		 * Implements flickr.groups.join (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_groups_join(Object group_id, Object accept_rules) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(0);
		if (!group_id) {
			return 1;
		} 
		fc.flickcurl_add_param("group_id", group_id);
		if (accept_rules) {
			fc.flickcurl_add_param("accept_rules", accept_rules);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.join")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_joinRequest:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the group to request joining.
		 * @message: Message to the administrators.
		 * @accept_rules: If the group has rules, they must be displayed to the user prior to joining. Passing a true value for this argument specifies that the application has displayed the group rules to the user, and that the user has agreed to them. (See flickr.groups.getInfo).  Probably takes a '1' or '0' value.
		 * 
		 * Request to join a group that is invitation-only.
		 *
		 * Implements flickr.groups.joinRequest (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_groups_joinRequest(Object group_id, Object message, Object accept_rules) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(0);
		if (!group_id || !message || !accept_rules) {
			return 1;
		} 
		fc.flickcurl_add_param("group_id", group_id);
		fc.flickcurl_add_param("message", message);
		fc.flickcurl_add_param("accept_rules", accept_rules);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.joinRequest")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_leave:
		 * @fc: flickcurl context
		 * @group_id: The NSID of the Group to leave
		 * @delete_photos: Delete all photos by this user from the group.  Probably takes a '1' or '0' value (or NULL)
		 * 
		 * Leave a group.
		 *
		 * If the user is the only administrator left, and there are other
		 * members, the oldest member will be promoted to administrator.
		 * 
		 * If the user is the last person in the group, the group will be deleted.
		 *
		 * Implements flickr.groups.leave (1.25)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_groups_leave(Object group_id, Object delete_photos) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(0);
		if (!group_id) {
			return 1;
		} 
		fc.flickcurl_add_param("group_id", group_id);
		if (delete_photos) {
			fc.flickcurl_add_param("delete_photos", delete_photos);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.leave")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_search:
		 * @fc: flickcurl context
		 * @text: The text to search for.
		 * @per_page: Number of groups to return per page, default 100, max 500 (or NULL)
		 * @page: The page of results to return, default 1 (or NULL)
		 * 
		 * Search for groups. 18+ groups will only be returned for
		 * authenticated calls where the authenticated user is over 18.
		 *
		 * Implements flickr.groups.search (0.13)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_groups_search(Object text, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		fc.flickcurl_init_params(0);
		if (!text) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("text", text);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.search")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		groups = fc.flickcurl_build_groups(xpathCtx, ()"/rsp/groups/group", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (groups) {
				groups.flickcurl_free_groups();
			} 
			groups = ((Object)0);
		} 
		return groups;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * groups-pools-api.c - Flickr flickr.groups.pool.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_groups_pools_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add to the group pool.
	 * @group_id: The NSID of the group who's pool the photo is to be added to.
	 * 
	 * Add a photo to a group's pool.
	 *
	 * Implements flickr.groups.pools.add (0.12)
	 * 
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_groups_pools_add(Object photo_id, Object group_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id || !group_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("group_id", group_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.pools.add")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_groups_pools_getContext:
		 * @fc: flickcurl context
		 * @photo_id: photo ID
		 * @group_id: group ID
		 * 
		 * Get next and previous photos for a photo in a group pool.
		 * 
		 * Implements flickr.groups.pools.getContext (0.7)
		 *
		 * Return value: an array of size 3 [prev, next, NULL] flickcurl_context*
		 * or NULL on error
		 **/;
	}
	public  flickcurl_groups_pools_getContext(Object photo_id, Object group_id) {
		 doc = ((Object)0);
		flickcurl_context contexts = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id || !group_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("group_id", group_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.pools.getContext")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		contexts = fc.flickcurl_build_contexts(doc);
		return contexts/**
		 * flickcurl_groups_pools_getGroups:
		 * @fc: flickcurl context
		 * @per_page: Number of groups to return per page (default 400, max 400)
		 * @page: The page of results to return (default 1)
		 * 
		 * Returns a list of groups to which you can add photos.
		 *
		 * Implements flickr.groups.pools.getGroups (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_groups_pools_getGroups(int page, int per_page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_group groups = ((Object)0);
		byte[] per_page_s = new byte[10];
		byte[] page_s = new byte[10];
		fc.flickcurl_init_params(0);
		.sprintf(page_s, "%d", page);
		fc.flickcurl_add_param("page", page_s);
		.sprintf(per_page_s, "%d", per_page);
		fc.flickcurl_add_param("per_page", per_page_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.pools.getGroups")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		groups = fc.flickcurl_build_groups(xpathCtx, ()"/rsp/groups/group", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (groups) {
				groups.flickcurl_free_groups();
			} 
			groups = ((Object)0);
		} 
		return groups/**
		 * flickcurl_groups_pools_getPhotos_params:
		 * @fc: flickcurl context
		 * @group_id: The id of the group who's pool you which to get the photo list for.
		 * @tags: A tag to filter the pool with. At the moment only one tag at a time is supported. (or NULL)
		 * @user_id: The nsid of a user (or NULL).  If given, retrieves only photos that the user has contributed to the group pool.
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Returns a list of pool photos for a given group.
		 *
		 * Currently supported extra fields are: license, date_upload,
		 * date_taken, owner_name, icon_server, original_format,
		 * last_update, geo, tags, machine_tags.
		 *
		 * Optional extra type 'media' that will return an extra media = VALUE
		 * for VALUE "photo" or "video".  API addition 2008-04-07.
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_groups_pools_remove(Object photo_id, Object group_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!photo_id || !group_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("group_id", group_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.groups.pools.remove")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * reflection-api.c - Flickr flickr.reflection.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_reflection_getMethods:
	 * @fc: flickcurl context
	 * 
	 * Get the list of available API method names
	 *
	 * Implements flickr.reflection.getMethods (0.10)
	 * 
	 * Return value: arry of names or NULL on failure
	 **/
	public Byte flickcurl_reflection_getMethods() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 nodes = new ();
		 xpathExpr = ((Object)0);
		int i;
		int size;
		byte methods = ((Object)0);
		int count;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare_noauth("flickr.reflection.getMethods")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		xpathExpr = ()"/rsp/methods/method";
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		size = .xmlXPathNodeSetGetLength(nodes);
		methods = (byte).calloc(1 + size, );
		count = 0;
		for (i = 0; i < size; i++) {
			 node = nodes.getNodeTab()[i];
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					methods[count] = (byte).malloc(len + 1);
					.memcpy(methods[count], chnode.getContent(), len + 1);
					count++;
					break;
				} 
			}
		}
		methods[count] = ((Object)/* for nodes */0);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj);
		} 
		return methods/**
		 * flickcurl_reflection_getMethodInfo:
		 * @fc: flickcurl context
		 * @name: method name
		 * 
		 * Get information about an API method
		 *
		 * Implements flickr.reflection.getMethodInfo (0.10)
		 * 
		 * Return value: #flickcurl_method or NULL on failure
		 **/;
	}
	public void flickcurl_read_licenses() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		 xpathObj = ((Object)0);
		 nodes = new ();
		 xpathExpr = ((Object)0);
		int i;
		int size;
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.licenses.getInfo")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		xpathExpr = ()"/rsp/licenses/license";
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		size = .xmlXPathNodeSetGetLength(nodes);
		this.setLicenses((flickcurl_license).calloc(1 + size, ));
		Object generatedLicenses = this.getLicenses();
		for (i = 0; i < size; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_license l = new flickcurl_license();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			l = (flickcurl_license).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					l.setId(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					l.setName(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					if (.strlen(attr_value)) {
						l.setUrl(attr_value);
					} else {
							.free(attr_value);
					} 
				} else {
						.free(attr_value);
				} 
			}
			generatedLicenses[i] = l/* for nodes */;
		}
		.qsort(generatedLicenses, size, , compare_licenses);
		if (xpathObj) {
			.xmlXPathFreeObject(xpathObj/**
			 * flickcurl_photos_licenses_getInfo:
			 * @fc: flickcurl context
			 * 
			 * Get a list of available photo licenses for Flickr.
			 *
			 * Implements flickr.photos.licenses.getInfo (0.6)
			 * 
			 * Return value: an array of #flickcurl_license or NULL on failure
			 **/);
		} 
	}
	public  flickcurl_photos_licenses_getInfo() {
		Object generatedLicenses = this.getLicenses();
		if (!generatedLicenses) {
			fc.flickcurl_read_licenses();
		} 
		return generatedLicenses;
	}
	public  flickcurl_photos_licenses_getInfo_by_id(int id) {
		int i;
		Object generatedLicenses = this.getLicenses();
		if (!generatedLicenses) {
			fc.flickcurl_read_licenses();
		} 
		if (!generatedLicenses) {
			return ((Object)0);
		} 
		for (i = 0; generatedLicenses[i]; i++) {
			if (generatedLicenses[i].getId() == id) {
				return generatedLicenses[i];
			} 
			if (generatedLicenses[i].getId() > id) {
				break;
			} 
		}
		return ((Object)0/**
		 * flickcurl_photos_licenses_setLicense:
		 * @fc: flickcurl context
		 * @photo_id: The photo to update the license for.
		 * @license_id: The license to apply, or 0 (zero) to remove the current license.
		 * 
		 * Sets the license for a photo.
		 *
		 * Implements flickr.photos.licenses.setLicense (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/);
	}
	public int flickcurl_photos_licenses_setLicense(Object photo_id, int license_id) {
		 doc = ((Object)0);
		int result = 1;
		byte[] license_id_s = new byte[5];
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(license_id_s, "%d", license_id);
		fc.flickcurl_add_param("license_id", license_id_s);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.licenses.setLicense")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	public int flickcurl_photos_geo_correctLocation(Object photo_id, Object place_id, int woe_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		Object result = ((Object)0);
		byte[] woe_id_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_add_param("place_id", place_id);
		if (woe_id > 0) {
			.sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.correctLocation")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_geo_getLocation:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo you want to retrieve location data for.
		 * 
		 * Get the geo data (latitude and longitude and the accuracy level) for a photo.
		 *
		 * Implements flickr.photos.geo.getLocation (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/));
	}
	public  flickcurl_photos_geo_getLocation(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_location location = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.getLocation")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		location = fc.flickcurl_build_location(xpathCtx, ()"/rsp/photo/location");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (location) {
				location.flickcurl_free_location();
			} 
			location = ((Object)0);
		} 
		return location/**
		 * flickcurl_photos_geo_getPerms:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to get permissions for.
		 * 
		 * Get permissions for who may view geo data for a photo.
		 *
		 * Implements flickr.photos.geo.getPerms (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_photos_geo_getPerms(Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_perms perms = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.getPerms")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		perms = fc.flickcurl_build_perms(xpathCtx, ()"/rsp/perms");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (perms) {
				perms.flickcurl_free_perms();
			} 
			perms = ((Object)0);
		} 
		return perms/**
		 * flickcurl_photos_geo_photosForLocation_params:
		 * @fc: flickcurl context
		 * @location: The location (lat, long, accuracy) of the photos
		 * @list_params: #flickcurl_photos_list_params result parameters (or NULL)
		 * 
		 * Get a list of photos for a user at a specific location (latitude, longitude
		 * and accuracy)
		 *
		 * Return value: list of photos or NULL on failure
		 **/;
	}
	public int flickcurl_photos_geo_removeLocation(Object photo_id) {
		 doc = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.removeLocation")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
	}
	public int flickcurl_photos_geo_setContext(Object photo_id, int context) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte[] context_str = new byte[3];
		Object result = ((Object)0);
		fc.flickcurl_init_params(1);
		if (!photo_id || context < 0 || context > 2) {
			return 1;
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(context_str, "%d", context);
		fc.flickcurl_add_param("context", context_str);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.geo.setContext")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		result = ((Object)/* your code here */0);
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			result = ((Object)0);
		} 
		return (result == ((Object)0/**
		 * flickcurl_photos_geo_setLocation:
		 * @fc: flickcurl context
		 * @photo_id: The id of the photo to set location data for.
		 * @location: The location
		 * 
		 * Sets the geo data (latitude and longitude and, optionally, the
		 * accuracy level) for a photo.
		 *
		 * Implements flickr.photos.geo.setLocation (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/));
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * photos-notes-api.c - Flickr flickr.photos.notes.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_photos_notes_add:
	 * @fc: flickcurl context
	 * @photo_id: The id of the photo to add a note to
	 * @note_x: The left coordinate of the note
	 * @note_y: The top coordinate of the note
	 * @note_w: The width of the note
	 * @note_h: The height of the note
	 * @note_text: The description of the note
	 * 
	 * Add a note to a photo.
	 *
	 * Coordinates and sizes are in pixels, based on the 500px image size
	 * shown on individual photo pages.
	 *
	 * Implements flickr.photos.notes.add (0.12)
	 * 
	 * Return value: note ID or NULL on failure
	 **/
	public Byte flickcurl_photos_notes_add(Object photo_id, int note_x, int note_y, int note_w, int note_h, Object note_text) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte id = ((Object)0);
		byte[] note_x_s = new byte[10];
		byte[] note_y_s = new byte[10];
		byte[] note_w_s = new byte[10];
		byte[] note_h_s = new byte[10];
		fc.flickcurl_init_params(1);
		if (!photo_id || !note_text) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("photo_id", photo_id);
		.sprintf(note_x_s, "%d", note_x);
		fc.flickcurl_add_param("note_x", note_x_s);
		.sprintf(note_y_s, "%d", note_y);
		fc.flickcurl_add_param("note_y", note_y_s);
		.sprintf(note_w_s, "%d", note_w);
		fc.flickcurl_add_param("note_w", note_w_s);
		.sprintf(note_h_s, "%d", note_h);
		fc.flickcurl_add_param("note_h", note_h_s);
		fc.flickcurl_add_param("note_text", note_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.notes.add")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		id = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/note/@id");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (id) {
				.free(id);
			} 
			id = ((Object)0);
		} 
		return id/**
		 * flickcurl_photos_notes_delete:
		 * @fc: flickcurl context
		 * @note_id: The id of the note to delete
		 * 
		 * Delete a note from a photo.
		 *
		 * Implements flickr.photos.notes.delete (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_notes_delete(Object note_id) {
		 doc = ((Object)0);
		int result = 1;
		fc.flickcurl_init_params(1);
		if (!note_id) {
			return 1;
		} 
		fc.flickcurl_add_param("note_id", note_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.notes.delete")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result/**
		 * flickcurl_photos_notes_edit:
		 * @fc: flickcurl context
		 * @note_id: The id of the note to edit
		 * @note_x: The left coordinate of the note
		 * @note_y: The top coordinate of the note
		 * @note_w: The width of the note
		 * @note_h: The height of the note
		 * @note_text: The description of the note
		 * 
		 * Edit a note on a photo. Coordinates and sizes are in pixels, based on the 500px image size shown on individual photo pages.
		
		 *
		 * Implements flickr.photos.notes.edit (0.12)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_photos_notes_edit(Object note_id, int note_x, int note_y, int note_w, int note_h, Object note_text) {
		 doc = ((Object)0);
		int result = 1;
		byte[] note_x_s = new byte[10];
		byte[] note_y_s = new byte[10];
		byte[] note_w_s = new byte[10];
		byte[] note_h_s = new byte[10];
		fc.flickcurl_init_params(1);
		if (!note_id || !note_text) {
			return 1;
		} 
		fc.flickcurl_add_param("note_id", note_id);
		.sprintf(note_x_s, "%d", note_x);
		fc.flickcurl_add_param("note_x", note_x_s);
		.sprintf(note_y_s, "%d", note_y);
		fc.flickcurl_add_param("note_y", note_y_s);
		.sprintf(note_w_s, "%d", note_w);
		fc.flickcurl_add_param("note_w", note_w_s);
		.sprintf(note_h_s, "%d", note_h);
		fc.flickcurl_add_param("note_h", note_h_s);
		fc.flickcurl_add_param("note_text", note_text);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.photos.notes.edit")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		result = 0;
		return result;
	}
	public  flickcurl_build_user_upload_status(Object xpathCtx, Object xpathExpr) {
		flickcurl_user_upload_status u = ((Object)0);
		int nodes_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, /* Now do user_upload_status */xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		u = (flickcurl_user_upload_status).calloc(, 1);
		Object generatedUsername = u.getUsername();
		for (i = 0; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			byte node_name = (byte)node.getName();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			if (!.strcmp(node_name, "username")) {
				 chnode = new ();
				for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
					size_t len = .strlen((byte)chnode.getContent());
					if (chnode.getType() != XML_TEXT_NODE) {
						continue;
					} 
					u.setUsername((byte).malloc(len + 1));
					.memcpy(generatedUsername, chnode.getContent(), len + 1);
					break;
				}
			}  else if (!.strcmp(node_name, "bandwidth")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					int attr_value = .atoi((byte)attr.getChildren().getContent());
					if (!.strcmp(attr_name, "maxbytes")) {
						u.setBandwidth_maxbytes(attr_value);
					}  else if (!.strcmp(attr_name, "maxkb")) {
						u.setBandwidth_maxkb(attr_value);
					}  else if (!.strcmp(attr_name, "usedbytes")) {
						u.setBandwidth_usedbytes(attr_value);
					}  else if (!.strcmp(attr_name, "usedkb")) {
						u.setBandwidth_usedkb(attr_value);
					}  else if (!.strcmp(attr_name, "remainingbytes")) {
						u.setBandwidth_remainingbytes(attr_value);
					}  else if (!.strcmp(attr_name, "remainingkb")) {
						u.setBandwidth_remainingkb(attr_value);
					} 
				}
			}  else if (!.strcmp(node_name, "filesize")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					byte attr_name = (byte)attr.getName();
					int attr_value = .atoi((byte)attr.getChildren().getContent());
					if (!.strcmp(attr_name, "maxbytes")) {
						u.setFilesize_maxbytes(attr_value);
					}  else if (!.strcmp(attr_name, "maxkb")) {
						u.setFilesize_maxkb(attr_value);
					} 
				}
			}  else if (!.strcmp(node_name, "sets")) {
				for (attr = node.getProperties(); attr; attr = attr.getNext()) {
					size_t attr_len = .strlen((byte)attr.getChildren().getContent());
					byte attr_name = (byte)attr.getName();
					byte attr_value;
					attr_value = (byte).malloc(attr_len + 1);
					.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
					if (!.strcmp(attr_name, "created")) {
						u.setSets_created(.atoi(attr_value));
						.free(attr_value);
					}  else if (!.strcmp(attr_name, "remaining")) {
						u.setSets_remaining(attr_value);
					} else {
							.free(attr_value/* for nodes */);
					} 
				}
			} 
		}
		return u;
	}
	public  flickcurl_build_blogs(Object xpathCtx, Object xpathExpr, int blog_count_p) {
		flickcurl_blog blogs = ((Object)0);
		int nodes_count;
		int blog_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		blogs = (flickcurl_blog).calloc(, nodes_count + 1);
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_blog b = new flickcurl_blog();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			b = (flickcurl_blog).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					b.setId(attr_value);
				}  else if (!.strcmp(attr_name, "name")) {
					b.setName(attr_value);
				}  else if (!.strcmp(attr_name, "needspassword")) {
					b.setNeeds_password(.atoi(attr_value));
					.free(attr_value);
				}  else if (!.strcmp(attr_name, "url")) {
					b.setUrl(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			blogs[blog_count++] = b/* for nodes */;
		}
		if (blog_count_p) {
			blog_count_p = blog_count;
		} 
		return blogs;
	}
	public  flickcurl_build_blog_services(Object xpathCtx, Object xpathExpr, int blog_services_count_p) {
		flickcurl_blog_service blog_services = ((Object)0);
		int nodes_count;
		int blog_services_count;
		int i;
		 xpathObj = ((Object)0);
		 nodes = new ();
		xpathObj = .xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			this.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = .xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		blog_services = (flickcurl_blog_service).calloc(, nodes_count + 1);
		Object generatedName = b.getName();
		for (; i < nodes_count; i++) {
			 node = nodes.getNodeTab()[i];
			 attr = new ();
			flickcurl_blog_service b = new flickcurl_blog_service();
			 chnode = new ();
			if (node.getType() != XML_ELEMENT_NODE) {
				fc.flickcurl_error("Got unexpected node type %d", node.getType());
				this.setFailed(1);
				break;
			} 
			b = (flickcurl_blog_service).calloc(, 1);
			for (attr = node.getProperties(); attr; attr = attr.getNext()) {
				size_t attr_len = .strlen((byte)attr.getChildren().getContent());
				byte attr_name = (byte)attr.getName();
				byte attr_value;
				attr_value = (byte).malloc(attr_len + 1);
				.memcpy(attr_value, attr.getChildren().getContent(), attr_len + 1);
				if (!.strcmp(attr_name, "id")) {
					b.setId(attr_value);
				} else {
						.free(attr_value/* end attributes */);
				} 
			}
			for (chnode = node.getChildren(); chnode; chnode = chnode.getNext()) {
				if (chnode.getType() == XML_TEXT_NODE) {
					size_t len = .strlen((byte)chnode.getContent());
					b.setName((byte).malloc(len + 1));
					.memcpy(generatedName, chnode.getContent(), len + 1);
				} 
			}
			blog_services[blog_services_count++] = b/* for nodes */;
		}
		if (blog_services_count_p) {
			blog_services_count_p = blog_services_count;
		} 
		return blog_services;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * stats-api.c - Flickr flickr.stats.* API calls
	 *
	 * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_stats_getCSVFiles:
	 * @fc: flickcurl context
	 * 
	 * Returns a list of URLs for text files containing historic stats data (from November 26th 2007 to 1 June 2010) for the current user.
	 *
	 * Not implemented since the files that this API call points to stop
	 * working after June 1 2010.
	 *
	 * Implements flickr.stats.getCSVFiles (1.19)
	 *
	 * Announced http://code.flickr.com/blog/2010/05/13/stats-api-redux/
	 * 
	 * Return value: always returns non-0 to signify failure
	 **/
	public int flickcurl_stats_getCSVFiles() {
		return 1/**
		 * flickcurl_stats_getCollectionDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @collection_id: The id of the collection to get stats for. If not provided, stats for all collections will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a collection
		 *
		 * Implements flickr.stats.getCollectionDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getCollectionDomains(Object date, Object collection_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		if (collection_id) {
			fc.flickcurl_add_param("collection_id", collection_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getCollectionDomains")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getCollectionReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @collection_id: The id of the collection to get stats for. If not provided, stats for all collections will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a collection
		 *
		 * Implements flickr.stats.getCollectionReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getCollectionReferrers(Object date, Object domain, Object collection_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("domain", domain);
		if (collection_id) {
			fc.flickcurl_add_param("collection_id", collection_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getCollectionReferrers")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getCollectionStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according to
		 * Flickr Stats starts at midnight GMT for all users, and timestamps
		 * will automatically be rounded down to the start of the day.
		 * @collection_id: The id of the collection to get stats for.
		 * 
		 * Get the number of views on a collection for a given date.
		 *
		 * Implements flickr.stats.getCollectionStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: views count or <0 on failure
		 **/;
	}
	public int flickcurl_stats_getCollectionStats(Object date, Object collection_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		fc.flickcurl_init_params(0);
		if (!date || !collection_id) {
			return -1;
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("collection_id", collection_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getCollectionStats")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPhotoDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photo_id: The id of the photo to get stats for. If not provided, stats for all photos will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photo
		 *
		 * Implements flickr.stats.getPhotoDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotoDomains(Object date, Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		if (photo_id) {
			fc.flickcurl_add_param("photo_id", photo_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotoDomains")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotoReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @photo_id: The id of the photo to get stats for. If not provided, stats for all photos will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a photo
		 *
		 * Implements flickr.stats.getPhotoReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotoReferrers(Object date, Object domain, Object photo_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("domain", domain);
		if (photo_id) {
			fc.flickcurl_add_param("photo_id", photo_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotoReferrers")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photoset_id: The id of the photoset to get stats for. If not provided, stats for all sets will be returned. (or NULL)
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photoset
		 *
		 * Implements flickr.stats.getPhotosetDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotosetDomains(Object date, Object photoset_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		if (photoset_id) {
			fc.flickcurl_add_param("photoset_id", photoset_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotosetDomains")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @photoset_id: The id of the photoset to get stats for. If not provided, stats for all sets will be returned. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a photoset
		 *
		 * Implements flickr.stats.getPhotosetReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotosetReferrers(Object date, Object domain, Object photoset_id, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("domain", domain);
		if (photoset_id) {
			fc.flickcurl_add_param("photoset_id", photoset_id);
		} 
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotosetReferrers")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotosetStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photoset_id: The id of the photoset to get stats for.
		 * 
		 * Get the number of views on a photoset for a given date.
		 *
		 * Implements flickr.stats.getPhotosetStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: number of views or <0 on failure
		 **/;
	}
	public int flickcurl_stats_getPhotosetStats(Object date, Object photoset_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		fc.flickcurl_init_params(0);
		if (!date || !photoset_id) {
			return -1;
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("photoset_id", photoset_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotosetStats")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPhotoStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @photo_id: The id of the photo to get stats for.
		 * 
		 * Get the number of views, comments and favorites on a photo for a given date.
		 *
		 * Implements flickr.stats.getPhotoStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotoStats(Object date, Object photo_id) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		flickcurl_stat stat1 = ((Object)0);
		fc.flickcurl_init_params(0);
		if (!date || !photo_id) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("photo_id", photo_id);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotoStats")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/stats", ((Object)0));
		if (stats) {
			stat1 = stats[0];
			stats[0] = ((Object)0);
			stats.flickcurl_free_stats();
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stat1) {
				stat1.flickcurl_free_stat();
			} 
			stat1 = ((Object)0);
		} 
		return stat1/**
		 * flickcurl_stats_getPhotostreamDomains:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @per_page: Number of domains to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100 (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referring domains for a photostream
		 *
		 * Implements flickr.stats.getPhotostreamDomains (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotostreamDomains(Object date, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotostreamDomains")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/domain", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotostreamReferrers:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * @domain: The domain to return referrers for. This should be a hostname (eg: "flickr.com") with no protocol or pathname.
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * 
		 * Get a list of referrers from a given domain to a user's photostream
		 *
		 * Implements flickr.stats.getPhotostreamReferrers (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getPhotostreamReferrers(Object date, Object domain, int per_page, int page) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_stat stats = ((Object)0);
		byte[] per_page_str = new byte[10];
		byte[] page_str = new byte[10];
		fc.flickcurl_init_params(0);
		if (!date || !domain) {
			return ((Object)0);
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_add_param("domain", domain);
		if (per_page >= 0) {
			.sprintf(per_page_str, "%d", per_page);
			fc.flickcurl_add_param("per_page", per_page_str);
		} 
		if (page >= 0) {
			.sprintf(page_str, "%d", page);
			fc.flickcurl_add_param("page", page_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotostreamReferrers")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		stats = fc.flickcurl_build_stats(xpathCtx, ()"/rsp/domains/referrer", ((Object)0));
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (stats) {
				stats.flickcurl_free_stats();
			} 
			stats = ((Object)0);
		} 
		return stats/**
		 * flickcurl_stats_getPhotostreamStats:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.
		 * 
		 * Get the number of views on a user's photostream for a given date.
		 *
		 * Implements flickr.stats.getPhotostreamStats (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: number of views or <0 on failure
		 **/;
	}
	public int flickcurl_stats_getPhotostreamStats(Object date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte count_str;
		int count = -1;
		fc.flickcurl_init_params(0);
		if (!date) {
			return -1;
		} 
		fc.flickcurl_add_param("date", date);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getPhotostreamStats")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/@views");
		if (count_str) {
			count = .atoi(count_str);
			.free(count_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			count = -1;
		} 
		return count/**
		 * flickcurl_stats_getPopularPhotos:
		 * @fc: flickcurl context
		 * @date: Stats will be returned for this date. This should be in
		 * either be in YYYY-MM-DD or unix timestamp format.  A day according
		 * to Flickr Stats starts at midnight GMT for all users, and
		 * timestamps will automatically be rounded down to the start of the
		 * day.  If no date is provided, all time view counts will be
		 * returned. (or NULL)
		 * @sort: The order in which to sort returned photos. Defaults to views. The possible values are views, comments and favorites.  Other sort options are available through search. (or NULL)
		 * @per_page: Number of referrers to return per page. If this argument is omitted, it defaults to 25. The maximum allowed value is 100. (or < 0)
		 * @page: The page of results to return. If this argument is omitted, it defaults to 1. (or < 0)
		 * @extras: A comma-delimited list of extra information to fetch for each returned record. Currently supported fields are: <code>description</code>, <code>license</code>, <code>date_upload</code>, <code>date_taken</code>, <code>owner_name</code>, <code>icon_server</code>, <code>original_format</code>, <code>last_update</code>, <code>geo</code>, <code>tags</code>, <code>machine_tags</code>, <code>o_dims</code>, <code>views</code>, <code>media</code>, <code>path_alias</code>, <code>url_sq</code>, <code>url_t</code>, <code>url_s</code>, <code>url_m</code>, <code>url_o</code> (or NULL)
		 * 
		 * Get stats for popular photos
		 *
		 * Implements flickr.stats.getPopularPhotos (1.17)
		 * 
		 * Announced 2010-03-03
		 * http://code.flickr.com/blog/2010/03/03/flickr-stats-api/
		 *
		 * Return value: non-0 on failure
		 **/;
	}
	public  flickcurl_stats_getTotalViews(Object date) {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		flickcurl_view_stats views = ((Object)0);
		byte count_str;
		fc.flickcurl_init_params(0);
		if (date) {
			fc.flickcurl_add_param("date", date);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.stats.getTotalViews")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		views = (flickcurl_view_stats).calloc(, 1);
		if (!views) {
			this.setFailed(1);
			;
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/total/@views");
		if (count_str) {
			views.setTotal(.atoi(count_str));
			.free(count_str);
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/photos/@views");
		if (count_str) {
			views.setPhotos(.atoi(count_str));
			.free(count_str);
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/photostream/@views");
		if (count_str) {
			views.setPhotostreams(.atoi(count_str));
			.free(count_str);
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/sets/@views");
		if (count_str) {
			views.setSets(.atoi(count_str));
			.free(count_str);
		} 
		count_str = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/stats/collections/@views");
		if (count_str) {
			views.setCollections(.atoi(count_str));
			.free(count_str);
		} 
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (views) {
				views.flickcurl_free_view_stats();
			} 
			views = ((Object)0);
		} 
		return views;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * test-api.c - Flickr flickr.test.* API calls
	 *
	 * Copyright (C) 2007-2012, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_test_echo:
	 * @fc: flickcurl context
	 * @key: test key
	 * @value: test value
	 * 
	 * A testing method which echo's all parameters back in the response.
	 *
	 * Actually prints the returned byte count to stderr.
	 *
	 * Implements flickr.test.echo (0.5)
	 *
	 * Return value: non-0 on failure
	 **/
	public int flickcurl_test_echo(Object key, Object value) {
		 doc = ((Object)0);
		int rc = 0;
		fc.flickcurl_init_params(0);
		fc.flickcurl_add_param(key, value);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.test.echo")) {
			rc = 1;
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			rc = 1;
			;
		} 
		int generatedTotal_bytes = this.getTotal_bytes();
		.fprintf((_iob[2]), "Flickr echo returned %d bytes\n", generatedTotal_bytes);
	}
	public Byte flickcurl_test_login() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		byte username = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.test.login")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		username = fc.flickcurl_xpath_eval(xpathCtx, ()"/rsp/user/username");
		int generatedFailed = this.getFailed();
		if (generatedFailed) {
			if (username) {
				.free(username);
			} 
			username = ((Object)0);
		} 
		return username/**
		 * flickcurl_test_null:
		 * @fc: flickcurl context
		 * 
		 * Null test
		 *
		 * Implements flickr.test.null (1.0)
		 * 
		 * Return value: non-0 on failure
		 **/;
	}
	public int flickcurl_test_null() {
		 doc = ((Object)0);
		 xpathCtx = ((Object)0);
		fc.flickcurl_init_params(0);
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.test.null")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = .xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			this.setFailed(1);
			;
		} 
		int generatedFailed = this.getFailed();
		return generatedFailed;
	}
	public int getTotal_bytes() {
		return total_bytes;
	}
	public void setTotal_bytes(int newTotal_bytes) {
		total_bytes = newTotal_bytes;
	}
	public int getFailed() {
		return failed;
	}
	public void setFailed(int newFailed) {
		failed = newFailed;
	}
	public int getError_code() {
		return error_code;
	}
	public void setError_code(int newError_code) {
		error_code = newError_code;
	}
	public Byte getError_msg() {
		return error_msg;
	}
	public void setError_msg(Byte newError_msg) {
		error_msg = newError_msg;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int newStatus_code) {
		status_code = newStatus_code;
	}
	public Byte getParam_fields() {
		return param_fields;
	}
	public void setParam_fields(Byte newParam_fields) {
		param_fields = newParam_fields;
	}
	public Byte getParam_values() {
		return param_values;
	}
	public void setParam_values(Byte newParam_values) {
		param_values = newParam_values;
	}
	public int getParameter_count() {
		return parameter_count;
	}
	public void setParameter_count(int newParameter_count) {
		parameter_count = newParameter_count;
	}
	public Byte getUpload_field() {
		return upload_field;
	}
	public void setUpload_field(Byte newUpload_field) {
		upload_field = newUpload_field;
	}
	public Byte getUpload_value() {
		return upload_value;
	}
	public void setUpload_value(Byte newUpload_value) {
		upload_value = newUpload_value;
	}
	public Byte getUri() {
		return uri;
	}
	public void setUri(Byte newUri) {
		uri = newUri;
	}
	public Object getCurl_handle() {
		return curl_handle;
	}
	public void setCurl_handle(Object newCurl_handle) {
		curl_handle = newCurl_handle;
	}
	public Object getError_buffer() {
		return error_buffer;
	}
	public void setError_buffer(Object newError_buffer) {
		error_buffer = newError_buffer;
	}
	public int getCurl_init_here() {
		return curl_init_here;
	}
	public void setCurl_init_here(int newCurl_init_here) {
		curl_init_here = newCurl_init_here;
	}
	public Byte getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(Byte newUser_agent) {
		user_agent = newUser_agent;
	}
	public Byte getProxy() {
		return proxy;
	}
	public void setProxy(Byte newProxy) {
		proxy = newProxy;
	}
	public Object getError_data() {
		return error_data;
	}
	public void setError_data(Object newError_data) {
		error_data = newError_data;
	}
	public Object getError_handler() {
		return error_handler;
	}
	public void setError_handler(Object newError_handler) {
		error_handler = newError_handler;
	}
	public Byte getHttp_accept() {
		return http_accept;
	}
	public void setHttp_accept(Byte newHttp_accept) {
		http_accept = newHttp_accept;
	}
	public Object getXc() {
		return xc;
	}
	public void setXc(Object newXc) {
		xc = newXc;
	}
	public Byte getSecret() {
		return secret;
	}
	public void setSecret(Byte newSecret) {
		secret = newSecret;
	}
	public Byte getApi_key() {
		return api_key;
	}
	public void setApi_key(Byte newApi_key) {
		api_key = newApi_key;
	}
	public Byte getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(Byte newAuth_token) {
		auth_token = newAuth_token;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int newSign) {
		sign = newSign;
	}
	public Byte getMethod() {
		return method;
	}
	public void setMethod(Byte newMethod) {
		method = newMethod;
	}
	public Object getTag_handler() {
		return tag_handler;
	}
	public void setTag_handler(Object newTag_handler) {
		tag_handler = newTag_handler;
	}
	public Object getTag_data() {
		return tag_data;
	}
	public void setTag_data(Object newTag_data) {
		tag_data = newTag_data;
	}
	public Object getLicenses() {
		return licenses;
	}
	public void setLicenses(Object newLicenses) {
		licenses = newLicenses;
	}
	public timeval getLast_request_time() {
		return last_request_time;
	}
	public void setLast_request_time(timeval newLast_request_time) {
		last_request_time = newLast_request_time;
	}
	public long getRequest_delay() {
		return request_delay;
	}
	public void setRequest_delay(long newRequest_delay) {
		request_delay = newRequest_delay;
	}
	public int getIs_write() {
		return is_write;
	}
	public void setIs_write(int newIs_write) {
		is_write = newIs_write;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getData_length() {
		return data_length;
	}
	public void setData_length(Object newData_length) {
		data_length = newData_length;
	}
	public int getData_is_xml() {
		return data_is_xml;
	}
	public void setData_is_xml(int newData_is_xml) {
		data_is_xml = newData_is_xml;
	}
	public int getXml_parse_content() {
		return xml_parse_content;
	}
	public void setXml_parse_content(int newXml_parse_content) {
		xml_parse_content = newXml_parse_content;
	}
	public int getSave_content() {
		return save_content;
	}
	public void setSave_content(int newSave_content) {
		save_content = newSave_content;
	}
	public flickcurl_chunk_s getChunks() {
		return chunks;
	}
	public void setChunks(flickcurl_chunk_s newChunks) {
		chunks = newChunks;
	}
	public int getChunks_count() {
		return chunks_count;
	}
	public void setChunks_count(int newChunks_count) {
		chunks_count = newChunks_count;
	}
	public Byte getService_uri() {
		return service_uri;
	}
	public void setService_uri(Byte newService_uri) {
		service_uri = newService_uri;
	}
	public Byte getUpload_service_uri() {
		return upload_service_uri;
	}
	public void setUpload_service_uri(Byte newUpload_service_uri) {
		upload_service_uri = newUpload_service_uri;
	}
	public Byte getReplace_service_uri() {
		return replace_service_uri;
	}
	public void setReplace_service_uri(Byte newReplace_service_uri) {
		replace_service_uri = newReplace_service_uri;
	}
	public int getUri_len() {
		return uri_len;
	}
	public void setUri_len(int newUri_len) {
		uri_len = newUri_len;
	}
	public Object getCurl_setopt_handler() {
		return curl_setopt_handler;
	}
	public void setCurl_setopt_handler(Object newCurl_setopt_handler) {
		curl_setopt_handler = newCurl_setopt_handler;
	}
	public Object getCurl_setopt_handler_data() {
		return curl_setopt_handler_data;
	}
	public void setCurl_setopt_handler_data(Object newCurl_setopt_handler_data) {
		curl_setopt_handler_data = newCurl_setopt_handler_data;
	}
	public Byte getOauth_request_token_uri() {
		return oauth_request_token_uri;
	}
	public void setOauth_request_token_uri(Byte newOauth_request_token_uri) {
		oauth_request_token_uri = newOauth_request_token_uri;
	}
	public Byte getOauth_authorize_uri() {
		return oauth_authorize_uri;
	}
	public void setOauth_authorize_uri(Byte newOauth_authorize_uri) {
		oauth_authorize_uri = newOauth_authorize_uri;
	}
	public Byte getOauth_access_token_uri() {
		return oauth_access_token_uri;
	}
	public void setOauth_access_token_uri(Byte newOauth_access_token_uri) {
		oauth_access_token_uri = newOauth_access_token_uri;
	}
	public Object getMt() {
		return mt;
	}
	public void setMt(Object newMt) {
		mt = newMt;
	}
	public  getOd() {
		return od;
	}
	public void setOd( newOd) {
		od = newOd;
	}
	public Object getParameters() {
		return parameters;
	}
	public void setParameters(Object newParameters) {
		parameters = newParameters;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
