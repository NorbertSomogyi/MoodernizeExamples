package application;

/* fields used by both HTTP/2 and HTTP/3 */
/* points to a buffer to read from */
/* size of the buffer 'upload_mem' points to */
/* number of bytes left to upload */
/*********** for HTTP/3 we store stream-local data here *************/
/* stream we are interested in */
/* FALSE until body arrives */
/* FALSE until request is issued */
/* per-stream buffers for upload */
/* h2 settings for this connection */
public class http_conn {
	private int unused;
	
	public http_conn(int unused) {
		setUnused(unused);
	}
	public http_conn() {
	}
	
	public int getUnused() {
		return unused;
	}
	public void setUnused(int newUnused) {
		unused = newUnused;
	}
}
/* length of the binsettings data */
/* underlying send Curl_send callback */
/* underlying recv Curl_recv callback */
/* buffer to receive data from underlying socket */
/* number of bytes filled in inbuf */
/* number of bytes read from in inbuf */
/* We need separate buffer for transmission and reception because we
     may call nghttp2_session_send() after the
     nghttp2_session_mem_recv() but mem buffer is still not full. In
     this case, we wrongly sends the content of mem buffer if we share
     them for both cases. */
