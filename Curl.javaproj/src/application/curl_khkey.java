package application;

/* easy handle */
/* known */
/* found */
public class curl_khkey {
	private Object key;
	private Object len;
	private curl_khtype keytype;
	
	public curl_khkey(Object key, Object len, curl_khtype keytype) {
		setKey(key);
		setLen(len);
		setKeytype(keytype);
	}
	public curl_khkey() {
	}
	
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public curl_khtype getKeytype() {
		return keytype;
	}
	public void setKeytype(curl_khtype newKeytype) {
		keytype = newKeytype;
	}
}
