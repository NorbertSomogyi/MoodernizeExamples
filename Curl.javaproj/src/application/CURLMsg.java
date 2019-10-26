package application;

/* bitmask bits for CURLMOPT_PIPELINING */
/* first, not used */
/* This easy handle has completed. 'result' contains
                   the CURLcode of the transfer */
/* last, not used */
public class CURLMsg {
	private  msg;
	private Object easy_handle;
	private  data;
	
	public CURLMsg( msg, Object easy_handle,  data) {
		setMsg(msg);
		setEasy_handle(easy_handle);
		setData(data);
	}
	public CURLMsg() {
	}
	
	public  getMsg() {
		return msg;
	}
	public void setMsg( newMsg) {
		msg = newMsg;
	}
	public Object getEasy_handle() {
		return easy_handle;
	}
	public void setEasy_handle(Object newEasy_handle) {
		easy_handle = newEasy_handle;
	}
	public  getData() {
		return data;
	}
	public void setData( newData) {
		data = newData;
	}
}
/* Based on poll(2) structure and values.
 * We don't use pollfd and POLL* constants explicitly
 * to cover platforms without poll(). */
