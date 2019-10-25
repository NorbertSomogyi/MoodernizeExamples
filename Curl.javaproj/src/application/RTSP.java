package application;

public class RTSP {
	private HTTP http_wrapper;
	private long CSeq_sent;
	private long CSeq_recv;
	
	public RTSP(HTTP http_wrapper, long CSeq_sent, long CSeq_recv) {
		setHttp_wrapper(http_wrapper);
		setCSeq_sent(CSeq_sent);
		setCSeq_recv(CSeq_recv);
	}
	public RTSP() {
	}
	
	public HTTP getHttp_wrapper() {
		return http_wrapper;
	}
	public void setHttp_wrapper(HTTP newHttp_wrapper) {
		http_wrapper = newHttp_wrapper;
	}
	public long getCSeq_sent() {
		return CSeq_sent;
	}
	public void setCSeq_sent(long newCSeq_sent) {
		CSeq_sent = newCSeq_sent;
	}
	public long getCSeq_recv() {
		return CSeq_recv;
	}
	public void setCSeq_recv(long newCSeq_recv) {
		CSeq_recv = newCSeq_recv;
	}
}
/*
   * http_wrapper MUST be the first element of this structure for the wrap
   * logic to work. In this way, we get a cheap polymorphism because
   * &(data->state.proto.rtsp) == &(data->state.proto.http) per the C spec
   *
   * HTTP functions can safely treat this as an HTTP struct, but RTSP aware
   * functions can also index into the later elements.
   */
