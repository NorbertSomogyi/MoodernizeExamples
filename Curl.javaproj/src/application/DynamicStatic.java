package application;

/* possibly modified userdefined data */
public class DynamicStatic {
	private Object url;
	private Object referer;
	private Object cookielist;
	private Object resolve;
	private Object url_alloc;
	private Object referer_alloc;
	private Object wildcard_resolve;
	
	public DynamicStatic(Object url, Object referer, Object cookielist, Object resolve, Object url_alloc, Object referer_alloc, Object wildcard_resolve) {
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
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public Object getReferer() {
		return referer;
	}
	public void setReferer(Object newReferer) {
		referer = newReferer;
	}
	public Object getCookielist() {
		return cookielist;
	}
	public void setCookielist(Object newCookielist) {
		cookielist = newCookielist;
	}
	public Object getResolve() {
		return resolve;
	}
	public void setResolve(Object newResolve) {
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
