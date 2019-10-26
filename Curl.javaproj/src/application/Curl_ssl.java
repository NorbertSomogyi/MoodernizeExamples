package application;

/* supports CURLOPT_SSL_CTX */
/* supports access via HTTPS proxies */
/* supports TLS 1.3 ciphersuites */
public class Curl_ssl {
	private Object info;
	private int supports;
	private Object sizeof_ssl_backend_data;
	private Object init;
	private Object cleanup;
	private Object version;
	private Object check_cxn;
	private Object shut_down;
	private Object data_pending;
	private Object random;
	private Object cert_status_request;
	private Object connect_blocking;
	private Object connect_nonblocking;
	private Object get_internals;
	private Object close_one;
	private Object close_all;
	private Object session_free;
	private Object set_engine;
	private Object set_engine_default;
	private Object engines_list;
	private Object false_start;
	private Object md5sum;
	private Object sha256sum;
	
	public Curl_ssl(Object info, int supports, Object sizeof_ssl_backend_data, Object init, Object cleanup, Object version, Object check_cxn, Object shut_down, Object data_pending, Object random, Object cert_status_request, Object connect_blocking, Object connect_nonblocking, Object get_internals, Object close_one, Object close_all, Object session_free, Object set_engine, Object set_engine_default, Object engines_list, Object false_start, Object md5sum, Object sha256sum) {
		setInfo(info);
		setSupports(supports);
		setSizeof_ssl_backend_data(sizeof_ssl_backend_data);
		setInit(init);
		setCleanup(cleanup);
		setVersion(version);
		setCheck_cxn(check_cxn);
		setShut_down(shut_down);
		setData_pending(data_pending);
		setRandom(random);
		setCert_status_request(cert_status_request);
		setConnect_blocking(connect_blocking);
		setConnect_nonblocking(connect_nonblocking);
		setGet_internals(get_internals);
		setClose_one(close_one);
		setClose_all(close_all);
		setSession_free(session_free);
		setSet_engine(set_engine);
		setSet_engine_default(set_engine_default);
		setEngines_list(engines_list);
		setFalse_start(false_start);
		setMd5sum(md5sum);
		setSha256sum(sha256sum);
	}
	public Curl_ssl() {
	}
	
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object newInfo) {
		info = newInfo;
	}
	public int getSupports() {
		return supports;
	}
	public void setSupports(int newSupports) {
		supports = newSupports;
	}
	public Object getSizeof_ssl_backend_data() {
		return sizeof_ssl_backend_data;
	}
	public void setSizeof_ssl_backend_data(Object newSizeof_ssl_backend_data) {
		sizeof_ssl_backend_data = newSizeof_ssl_backend_data;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getCleanup() {
		return cleanup;
	}
	public void setCleanup(Object newCleanup) {
		cleanup = newCleanup;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getCheck_cxn() {
		return check_cxn;
	}
	public void setCheck_cxn(Object newCheck_cxn) {
		check_cxn = newCheck_cxn;
	}
	public Object getShut_down() {
		return shut_down;
	}
	public void setShut_down(Object newShut_down) {
		shut_down = newShut_down;
	}
	public Object getData_pending() {
		return data_pending;
	}
	public void setData_pending(Object newData_pending) {
		data_pending = newData_pending;
	}
	public Object getRandom() {
		return random;
	}
	public void setRandom(Object newRandom) {
		random = newRandom;
	}
	public Object getCert_status_request() {
		return cert_status_request;
	}
	public void setCert_status_request(Object newCert_status_request) {
		cert_status_request = newCert_status_request;
	}
	public Object getConnect_blocking() {
		return connect_blocking;
	}
	public void setConnect_blocking(Object newConnect_blocking) {
		connect_blocking = newConnect_blocking;
	}
	public Object getConnect_nonblocking() {
		return connect_nonblocking;
	}
	public void setConnect_nonblocking(Object newConnect_nonblocking) {
		connect_nonblocking = newConnect_nonblocking;
	}
	public Object getGet_internals() {
		return get_internals;
	}
	public void setGet_internals(Object newGet_internals) {
		get_internals = newGet_internals;
	}
	public Object getClose_one() {
		return close_one;
	}
	public void setClose_one(Object newClose_one) {
		close_one = newClose_one;
	}
	public Object getClose_all() {
		return close_all;
	}
	public void setClose_all(Object newClose_all) {
		close_all = newClose_all;
	}
	public Object getSession_free() {
		return session_free;
	}
	public void setSession_free(Object newSession_free) {
		session_free = newSession_free;
	}
	public Object getSet_engine() {
		return set_engine;
	}
	public void setSet_engine(Object newSet_engine) {
		set_engine = newSet_engine;
	}
	public Object getSet_engine_default() {
		return set_engine_default;
	}
	public void setSet_engine_default(Object newSet_engine_default) {
		set_engine_default = newSet_engine_default;
	}
	public Object getEngines_list() {
		return engines_list;
	}
	public void setEngines_list(Object newEngines_list) {
		engines_list = newEngines_list;
	}
	public Object getFalse_start() {
		return false_start;
	}
	public void setFalse_start(Object newFalse_start) {
		false_start = newFalse_start;
	}
	public Object getMd5sum() {
		return md5sum;
	}
	public void setMd5sum(Object newMd5sum) {
		md5sum = newMd5sum;
	}
	public Object getSha256sum() {
		return sha256sum;
	}
	public void setSha256sum(Object newSha256sum) {
		sha256sum = newSha256sum;
	}
}
/*
   * This *must* be the first entry to allow returning the list of available
   * backends in curl_global_sslset().
   */
