package application;

public class tftp_state_data {
	private  state;
	private  mode;
	private  error;
	private  event;
	private Object conn;
	private Object sockfd;
	private int retries;
	private int retry_time;
	private int retry_max;
	private Object start_time;
	private Object max_time;
	private Object rx_time;
	private int block;
	private Curl_sockaddr_storage local_addr;
	private Curl_sockaddr_storage remote_addr;
	private Object remote_addrlen;
	private int rbytes;
	private int sbytes;
	private int blksize;
	private int requested_blksize;
	private tftp_packet rpacket;
	private tftp_packet spacket;
	
	public tftp_state_data( state,  mode,  error,  event, Object conn, Object sockfd, int retries, int retry_time, int retry_max, Object start_time, Object max_time, Object rx_time, int block, Curl_sockaddr_storage local_addr, Curl_sockaddr_storage remote_addr, Object remote_addrlen, int rbytes, int sbytes, int blksize, int requested_blksize, tftp_packet rpacket, tftp_packet spacket) {
		setState(state);
		setMode(mode);
		setError(error);
		setEvent(event);
		setConn(conn);
		setSockfd(sockfd);
		setRetries(retries);
		setRetry_time(retry_time);
		setRetry_max(retry_max);
		setStart_time(start_time);
		setMax_time(max_time);
		setRx_time(rx_time);
		setBlock(block);
		setLocal_addr(local_addr);
		setRemote_addr(remote_addr);
		setRemote_addrlen(remote_addrlen);
		setRbytes(rbytes);
		setSbytes(sbytes);
		setBlksize(blksize);
		setRequested_blksize(requested_blksize);
		setRpacket(rpacket);
		setSpacket(spacket);
	}
	public tftp_state_data() {
	}
	
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getMode() {
		return mode;
	}
	public void setMode( newMode) {
		mode = newMode;
	}
	public  getError() {
		return error;
	}
	public void setError( newError) {
		error = newError;
	}
	public  getEvent() {
		return event;
	}
	public void setEvent( newEvent) {
		event = newEvent;
	}
	public Object getConn() {
		return conn;
	}
	public void setConn(Object newConn) {
		conn = newConn;
	}
	public Object getSockfd() {
		return sockfd;
	}
	public void setSockfd(Object newSockfd) {
		sockfd = newSockfd;
	}
	public int getRetries() {
		return retries;
	}
	public void setRetries(int newRetries) {
		retries = newRetries;
	}
	public int getRetry_time() {
		return retry_time;
	}
	public void setRetry_time(int newRetry_time) {
		retry_time = newRetry_time;
	}
	public int getRetry_max() {
		return retry_max;
	}
	public void setRetry_max(int newRetry_max) {
		retry_max = newRetry_max;
	}
	public Object getStart_time() {
		return start_time;
	}
	public void setStart_time(Object newStart_time) {
		start_time = newStart_time;
	}
	public Object getMax_time() {
		return max_time;
	}
	public void setMax_time(Object newMax_time) {
		max_time = newMax_time;
	}
	public Object getRx_time() {
		return rx_time;
	}
	public void setRx_time(Object newRx_time) {
		rx_time = newRx_time;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int newBlock) {
		block = newBlock;
	}
	public Curl_sockaddr_storage getLocal_addr() {
		return local_addr;
	}
	public void setLocal_addr(Curl_sockaddr_storage newLocal_addr) {
		local_addr = newLocal_addr;
	}
	public Curl_sockaddr_storage getRemote_addr() {
		return remote_addr;
	}
	public void setRemote_addr(Curl_sockaddr_storage newRemote_addr) {
		remote_addr = newRemote_addr;
	}
	public Object getRemote_addrlen() {
		return remote_addrlen;
	}
	public void setRemote_addrlen(Object newRemote_addrlen) {
		remote_addrlen = newRemote_addrlen;
	}
	public int getRbytes() {
		return rbytes;
	}
	public void setRbytes(int newRbytes) {
		rbytes = newRbytes;
	}
	public int getSbytes() {
		return sbytes;
	}
	public void setSbytes(int newSbytes) {
		sbytes = newSbytes;
	}
	public int getBlksize() {
		return blksize;
	}
	public void setBlksize(int newBlksize) {
		blksize = newBlksize;
	}
	public int getRequested_blksize() {
		return requested_blksize;
	}
	public void setRequested_blksize(int newRequested_blksize) {
		requested_blksize = newRequested_blksize;
	}
	public tftp_packet getRpacket() {
		return rpacket;
	}
	public void setRpacket(tftp_packet newRpacket) {
		rpacket = newRpacket;
	}
	public tftp_packet getSpacket() {
		return spacket;
	}
	public void setSpacket(tftp_packet newSpacket) {
		spacket = newSpacket;
	}
}
