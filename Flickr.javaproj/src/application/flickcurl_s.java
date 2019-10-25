package application;

public class flickcurl_s {
	private int total_bytes;
	private int failed;
	private int error_code;
	private Object error_msg;
	private int status_code;
	private Object param_fields;
	private Object param_values;
	private int parameter_count;
	private Object upload_field;
	private Object upload_value;
	private Object uri;
	private Object curl_handle;
	private Object error_buffer;
	private int curl_init_here;
	private Object user_agent;
	private Object proxy;
	private Object error_data;
	private Object error_handler;
	private Object http_accept;
	private Object xc;
	private Object secret;
	private Object api_key;
	private Object auth_token;
	private int sign;
	private Object method;
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
	private Object chunks;
	private int chunks_count;
	private Object service_uri;
	private Object upload_service_uri;
	private Object replace_service_uri;
	private int uri_len;
	private Object curl_setopt_handler;
	private Object curl_setopt_handler_data;
	private Object oauth_request_token_uri;
	private Object oauth_authorize_uri;
	private Object oauth_access_token_uri;
	private Object mt;
	private  od;
	private Object parameters;
	private int count;
	
	public flickcurl_s(int total_bytes, int failed, int error_code, Object error_msg, int status_code, Object param_fields, Object param_values, int parameter_count, Object upload_field, Object upload_value, Object uri, Object curl_handle, Object error_buffer, int curl_init_here, Object user_agent, Object proxy, Object error_data, Object error_handler, Object http_accept, Object xc, Object secret, Object api_key, Object auth_token, int sign, Object method, Object tag_handler, Object tag_data, Object licenses, timeval last_request_time, long request_delay, int is_write, Object data, Object data_length, int data_is_xml, int xml_parse_content, int save_content, Object chunks, int chunks_count, Object service_uri, Object upload_service_uri, Object replace_service_uri, int uri_len, Object curl_setopt_handler, Object curl_setopt_handler_data, Object oauth_request_token_uri, Object oauth_authorize_uri, Object oauth_access_token_uri, Object mt,  od, Object parameters, int count) {
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
	public Object getError_msg() {
		return error_msg;
	}
	public void setError_msg(Object newError_msg) {
		error_msg = newError_msg;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int newStatus_code) {
		status_code = newStatus_code;
	}
	public Object getParam_fields() {
		return param_fields;
	}
	public void setParam_fields(Object newParam_fields) {
		param_fields = newParam_fields;
	}
	public Object getParam_values() {
		return param_values;
	}
	public void setParam_values(Object newParam_values) {
		param_values = newParam_values;
	}
	public int getParameter_count() {
		return parameter_count;
	}
	public void setParameter_count(int newParameter_count) {
		parameter_count = newParameter_count;
	}
	public Object getUpload_field() {
		return upload_field;
	}
	public void setUpload_field(Object newUpload_field) {
		upload_field = newUpload_field;
	}
	public Object getUpload_value() {
		return upload_value;
	}
	public void setUpload_value(Object newUpload_value) {
		upload_value = newUpload_value;
	}
	public Object getUri() {
		return uri;
	}
	public void setUri(Object newUri) {
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
	public Object getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(Object newUser_agent) {
		user_agent = newUser_agent;
	}
	public Object getProxy() {
		return proxy;
	}
	public void setProxy(Object newProxy) {
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
	public Object getHttp_accept() {
		return http_accept;
	}
	public void setHttp_accept(Object newHttp_accept) {
		http_accept = newHttp_accept;
	}
	public Object getXc() {
		return xc;
	}
	public void setXc(Object newXc) {
		xc = newXc;
	}
	public Object getSecret() {
		return secret;
	}
	public void setSecret(Object newSecret) {
		secret = newSecret;
	}
	public Object getApi_key() {
		return api_key;
	}
	public void setApi_key(Object newApi_key) {
		api_key = newApi_key;
	}
	public Object getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(Object newAuth_token) {
		auth_token = newAuth_token;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int newSign) {
		sign = newSign;
	}
	public Object getMethod() {
		return method;
	}
	public void setMethod(Object newMethod) {
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
	public Object getChunks() {
		return chunks;
	}
	public void setChunks(Object newChunks) {
		chunks = newChunks;
	}
	public int getChunks_count() {
		return chunks_count;
	}
	public void setChunks_count(int newChunks_count) {
		chunks_count = newChunks_count;
	}
	public Object getService_uri() {
		return service_uri;
	}
	public void setService_uri(Object newService_uri) {
		service_uri = newService_uri;
	}
	public Object getUpload_service_uri() {
		return upload_service_uri;
	}
	public void setUpload_service_uri(Object newUpload_service_uri) {
		upload_service_uri = newUpload_service_uri;
	}
	public Object getReplace_service_uri() {
		return replace_service_uri;
	}
	public void setReplace_service_uri(Object newReplace_service_uri) {
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
	public Object getOauth_request_token_uri() {
		return oauth_request_token_uri;
	}
	public void setOauth_request_token_uri(Object newOauth_request_token_uri) {
		oauth_request_token_uri = newOauth_request_token_uri;
	}
	public Object getOauth_authorize_uri() {
		return oauth_authorize_uri;
	}
	public void setOauth_authorize_uri(Object newOauth_authorize_uri) {
		oauth_authorize_uri = newOauth_authorize_uri;
	}
	public Object getOauth_access_token_uri() {
		return oauth_access_token_uri;
	}
	public void setOauth_access_token_uri(Object newOauth_access_token_uri) {
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
