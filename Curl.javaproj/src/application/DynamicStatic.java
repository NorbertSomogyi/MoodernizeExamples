package application;

/* possibly modified userdefined data */
public class DynamicStatic {
	private Byte url;
	private Byte referer;
	private curl_slist cookielist;
	private curl_slist resolve;
	private Object url_alloc;
	private Object referer_alloc;
	private Object wildcard_resolve;
	
	public DynamicStatic(Byte url, Byte referer, curl_slist cookielist, curl_slist resolve, Object url_alloc, Object referer_alloc, Object wildcard_resolve) {
		setUrl(url);
		setReferer(referer);
		setCookielist(cookielist);
		setResolve(resolve);
		setUrl_alloc(url_alloc);
		setReferer_alloc(referer_alloc);
		setWildcard_resolve(wildcard_resolve);
	}
	public DynamicStatic() {
	}
	
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getReferer() {
		return referer;
	}
	public void setReferer(Byte newReferer) {
		referer = newReferer;
	}
	public curl_slist getCookielist() {
		return cookielist;
	}
	public void setCookielist(curl_slist newCookielist) {
		cookielist = newCookielist;
	}
	public curl_slist getResolve() {
		return resolve;
	}
	public void setResolve(curl_slist newResolve) {
		resolve = newResolve;
	}
	public Object getUrl_alloc() {
		return url_alloc;
	}
	public void setUrl_alloc(Object newUrl_alloc) {
		url_alloc = newUrl_alloc;
	}
	public Object getReferer_alloc() {
		return referer_alloc;
	}
	public void setReferer_alloc(Object newReferer_alloc) {
		referer_alloc = newReferer_alloc;
	}
	public Object getWildcard_resolve() {
		return wildcard_resolve;
	}
	public void setWildcard_resolve(Object newWildcard_resolve) {
		wildcard_resolve = newWildcard_resolve;
	}
}
