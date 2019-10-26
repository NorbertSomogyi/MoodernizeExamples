package application;

/* set ALPN and/or NPN for this */
/* a protocol with individual logical streams */
/* allow options part in the userinfo field
                                      of the URL */
/* allow this non-HTTP scheme over a
                                         HTTP proxy as HTTP proxies may know
                                         this protocol and act as a gateway */
/* protocol supports wildcard matching */
/* No checks */
/* Check if the connection is dead. */
/* Perform any keepalive function. */
/* No extra information. */
/* The connection is dead. */
public class postponed_data {
	private Byte buffer;
	private Object allocated_size;
	private Object recv_size;
	private Object recv_processed;
	
	public postponed_data(Byte buffer, Object allocated_size, Object recv_size, Object recv_processed) {
		setBuffer(buffer);
		setAllocated_size(allocated_size);
		setRecv_size(recv_size);
		setRecv_processed(recv_processed);
	}
	public postponed_data() {
	}
	
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getAllocated_size() {
		return allocated_size;
	}
	public void setAllocated_size(Object newAllocated_size) {
		allocated_size = newAllocated_size;
	}
	public Object getRecv_size() {
		return recv_size;
	}
	public void setRecv_size(Object newRecv_size) {
		recv_size = newRecv_size;
	}
	public Object getRecv_processed() {
		return recv_processed;
	}
	public void setRecv_processed(Object newRecv_processed) {
		recv_processed = newRecv_processed;
	}
}
