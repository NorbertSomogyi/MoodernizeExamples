package application;

/*
 * RTSP Connection data
 *
 * Currently, only used for tracking incomplete RTP data reads
 */
public class rtsp_conn {
	private Byte rtp_buf;
	private Object rtp_bufsize;
	private int rtp_channel;
	
	public rtsp_conn(Byte rtp_buf, Object rtp_bufsize, int rtp_channel) {
		setRtp_buf(rtp_buf);
		setRtp_bufsize(rtp_bufsize);
		setRtp_channel(rtp_channel);
	}
	public rtsp_conn() {
	}
	
	public Byte getRtp_buf() {
		return rtp_buf;
	}
	public void setRtp_buf(Byte newRtp_buf) {
		rtp_buf = newRtp_buf;
	}
	public Object getRtp_bufsize() {
		return rtp_bufsize;
	}
	public void setRtp_bufsize(Object newRtp_bufsize) {
		rtp_bufsize = newRtp_bufsize;
	}
	public int getRtp_channel() {
		return rtp_channel;
	}
	public void setRtp_channel(int newRtp_channel) {
		rtp_channel = newRtp_channel;
	}
}
