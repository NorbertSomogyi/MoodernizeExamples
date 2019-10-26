package application;

/* EXPECT_100_THRESHOLD is the request body size limit for when libcurl will
 * automatically add an "Expect: 100-continue" header in HTTP requests. When
 * the size is unknown, it will always add it.
 *
 */
/* CURL_DISABLE_HTTP */
/* see ngtcp2 */
/****************************************************************************
 * HTTP unique setup
 ***************************************************************************/
public class HTTP {
	private Object sendit;
	private Object postsize;
	private Object postdata;
	private Object p_pragma;
	private Object p_accept;
	private Object form;
	private back backup;
	private  sending;
	private Curl_send_buffer send_buffer;
	
	public HTTP(Object sendit, Object postsize, Object postdata, Object p_pragma, Object p_accept, Object form, back backup,  sending, Curl_send_buffer send_buffer) {
		setSendit(sendit);
		setPostsize(postsize);
		setPostdata(postdata);
		setP_pragma(p_pragma);
		setP_accept(p_accept);
		setForm(form);
		setBackup(backup);
		setSending(sending);
		setSend_buffer(send_buffer);
	}
	public HTTP() {
	}
	
	public Object getSendit() {
		return sendit;
	}
	public void setSendit(Object newSendit) {
		sendit = newSendit;
	}
	public Object getPostsize() {
		return postsize;
	}
	public void setPostsize(Object newPostsize) {
		postsize = newPostsize;
	}
	public Object getPostdata() {
		return postdata;
	}
	public void setPostdata(Object newPostdata) {
		postdata = newPostdata;
	}
	public Object getP_pragma() {
		return p_pragma;
	}
	public void setP_pragma(Object newP_pragma) {
		p_pragma = newP_pragma;
	}
	public Object getP_accept() {
		return p_accept;
	}
	public void setP_accept(Object newP_accept) {
		p_accept = newP_accept;
	}
	public Object getForm() {
		return form;
	}
	public void setForm(Object newForm) {
		form = newForm;
	}
	public back getBackup() {
		return backup;
	}
	public void setBackup(back newBackup) {
		backup = newBackup;
	}
	public  getSending() {
		return sending;
	}
	public void setSending( newSending) {
		sending = newSending;
	}
	public Curl_send_buffer getSend_buffer() {
		return send_buffer;
	}
	public void setSend_buffer(Curl_send_buffer newSend_buffer) {
		send_buffer = newSend_buffer;
	}
}
