package application;

public class tftp_state_data {
	private  state;
	private  mode;
	private  error;
	private  event;
	private connectdata conn;
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
	
	public tftp_state_data( state,  mode,  error,  event, connectdata conn, Object sockfd, int retries, int retry_time, int retry_max, Object start_time, Object max_time, Object rx_time, int block, Curl_sockaddr_storage local_addr, Curl_sockaddr_storage remote_addr, Object remote_addrlen, int rbytes, int sbytes, int blksize, int requested_blksize, tftp_packet rpacket, tftp_packet spacket) {
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
	
	public Object tftp_set_timeouts() {
		time_t maxtime = new time_t();
		time_t timeout = new time_t();
		timediff_t timeout_ms = new timediff_t();
		 generatedState = this.getState();
		bool start = (generatedState == .TFTP_STATE_START) ? 1 : 0;
		Object generatedStart_time = this.getStart_time();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedStart_time);
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		timeout_ms = ModernizedCProgram.Curl_timeleft(generatedData, ((Object)0), /* Compute drop-dead time */start);
		if (timeout_ms < 0) {
			generatedData.Curl_failf(/* time-out, bail out, go home */"Connection time-out");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		int generatedRetry_max = this.getRetry_max();
		int generatedRetry_time = this.getRetry_time();
		if (start) {
			maxtime = (time_t)(timeout_ms + 500) / 1000;
			this.setMax_time(generatedStart_time + maxtime);
			timeout = /* Set per-block timeout to total */maxtime;
			this.setRetry_max((int)timeout / /* Average restart after 5 seconds */5);
			if (generatedRetry_max < 1) {
				this.setRetry_max(/* avoid division by zero below */1);
			} 
			this.setRetry_time((int)timeout / generatedRetry_max);
			if (generatedRetry_time < 1) {
				this.setRetry_time(1);
			} 
		} else {
				if (timeout_ms > 0) {
					maxtime = (time_t)(timeout_ms + 500) / 1000;
				} else {
						maxtime = 3600;
				} 
				this.setMax_time(generatedStart_time + maxtime);
				timeout = /* Set per-block timeout to total */maxtime;
				this.setRetry_max((int)timeout / /* Average reposting an ACK after 5 seconds */5);
		} 
		if (generatedRetry_max < /* But bound the total number */3) {
			this.setRetry_max(3);
		} 
		if (generatedRetry_max > 50) {
			this.setRetry_max(50);
		} 
		this.setRetry_time((int)(timeout / generatedRetry_max));
		if (generatedRetry_time < 1) {
			this.setRetry_time(1);
		} 
		Object generatedMax_time = this.getMax_time();
		generatedData.Curl_infof("set timeouts for state %d; Total %ld, retry %d maxtry %d\n", (int)generatedState, (long)(generatedMax_time - generatedStart_time), generatedRetry_time, generatedRetry_max);
		Object generatedRx_time = this.getRx_time();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedRx_time);
		return CURLE_OK/**********************************************************
		 *
		 * tftp_set_send_first
		 *
		 * Event handler for the START state
		 *
		 **********************************************************/;
	}
	public Object tftp_parse_option_ack(Object ptr, int len) {
		byte tmp = ptr;
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		this.setBlksize(/* if OACK doesn't contain blksize option, the default (512) must be used */512);
		int generatedRequested_blksize = this.getRequested_blksize();
		int generatedBlksize = this.getBlksize();
		UserDefined generatedSet = data.getSet();
		Object generatedUpload = generatedSet.getUpload();
		while (tmp < ptr + len) {
			byte option;
			byte value;
			tmp = ModernizedCProgram.tftp_option_get(tmp, ptr + len - tmp, option, value);
			if (tmp == ((Object)0)) {
				data.Curl_failf("Malformed ACK packet, rejecting");
				return CURLE_TFTP_ILLEGAL;
			} 
			data.Curl_infof("got option=(%s) value=(%s)\n", option, value);
			if (ModernizedCProgram.curl_strnequal(option, "blksize", /*Error: Function owner not recognized*/strlen(option))) {
				long blksize;
				blksize = /*Error: Function owner not recognized*/strtol(value, ((Object)0), 10);
				if (!blksize) {
					data.Curl_failf("invalid blocksize value in OACK packet");
					return CURLE_TFTP_ILLEGAL;
				} 
				if (blksize > 65464) {
					data.Curl_failf("%s (%d)", "blksize is larger than max supported", 65464);
					return CURLE_TFTP_ILLEGAL;
				}  else if (blksize < 8) {
					data.Curl_failf("%s (%d)", "blksize is smaller than min supported", 8);
					return CURLE_TFTP_ILLEGAL;
				}  else if (blksize > generatedRequested_blksize) {
					data.Curl_failf("%s (%ld)", "server requested blksize larger than allocated", blksize);
					return CURLE_TFTP_ILLEGAL;
				} 
				this.setBlksize((int)blksize);
				data.Curl_infof("%s (%d) %s (%d)\n", "blksize parsed from OACK", generatedBlksize, "requested", generatedRequested_blksize);
			}  else if (ModernizedCProgram.curl_strnequal(option, "tsize", /*Error: Function owner not recognized*/strlen(option))) {
				long tsize = 0;
				tsize = /*Error: Function owner not recognized*/strtol(value, ((Object)0), 10);
				data.Curl_infof("%s (%ld)\n", "tsize parsed from OACK", tsize);
				if (!generatedUpload) {
					if (!tsize) {
						data.Curl_failf("invalid tsize -:%s:- value in OACK packet", value);
						return CURLE_TFTP_ILLEGAL;
					} 
					data.Curl_pgrsSetDownloadSize(tsize);
				} 
			} 
		}
		return CURLE_OK;
	}
	public Object tftp_option_add(Object csize, Byte buf, Object option) {
		int generatedBlksize = this.getBlksize();
		if ((/*Error: Function owner not recognized*/strlen(option) + csize + 1) > (size_t)generatedBlksize) {
			return CURLE_TFTP_ILLEGAL;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(buf, option);
		csize += /*Error: Function owner not recognized*/strlen(option) + 1;
		return CURLE_OK;
	}
	public Object tftp_connect_for_tx( event) {
		 result = new ();
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		data.Curl_infof("%s\n", "Connected for transmit");
		this.setState(.TFTP_STATE_TX);
		result = state.tftp_set_timeouts();
		if (result) {
			return result;
		} 
		return state.tftp_tx(event);
	}
	public Object tftp_connect_for_rx( event) {
		 result = new ();
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		data.Curl_infof("%s\n", "Connected for receive");
		this.setState(.TFTP_STATE_RX);
		result = state.tftp_set_timeouts();
		if (result) {
			return result;
		} 
		return state.tftp_rx(event);
	}
	public Object tftp_send_first( event) {
		size_t sbytes = new size_t();
		ssize_t senddata = new ssize_t();
		byte mode = "octet";
		byte filename;
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		UserDefined generatedSet = data.getSet();
		Object generatedPrefer_ascii = generatedSet.getPrefer_ascii();
		if (generatedPrefer_ascii) {
			mode = "netascii";
		} 
		int generatedRetries = this.getRetries();
		int generatedRetry_max = this.getRetry_max();
		Object generatedUpload = generatedSet.getUpload();
		tftp_packet generatedSpacket = this.getSpacket();
		SingleRequest generatedReq = generatedData.getReq();
		UrlState generatedState = data.getState();
		Object generatedInfilesize = generatedState.getInfilesize();
		urlpieces generatedUp = generatedState.getUp();
		byte[] generatedPath = generatedUp.getPath();
		int generatedBlksize = this.getBlksize();
		Object generatedTftp_no_options = generatedSet.getTftp_no_options();
		return result/* the next blocknum is x + 1 but it needs to wrap at an unsigned 16bit
		   boundary */;
	}
	/* Forward declarations */
	/**********************************************************
	 *
	 * tftp_rx
	 *
	 * Event handler for the RX state
	 *
	 **********************************************************/
	public Object tftp_rx( event) {
		ssize_t sbytes = new ssize_t();
		int rblock;
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		byte[] buffer = new byte[128];
		tftp_packet generatedRpacket = this.getRpacket();
		int generatedBlock = this.getBlock();
		tftp_packet generatedSpacket = this.getSpacket();
		Object generatedSockfd = this.getSockfd();
		Curl_sockaddr_storage generatedRemote_addr = this.getRemote_addr();
		Object generatedRemote_addrlen = this.getRemote_addrlen();
		int generatedRbytes = this.getRbytes();
		int generatedBlksize = this.getBlksize();
		Object generatedRx_time = this.getRx_time();
		int generatedRetries = this.getRetries();
		int generatedRetry_max = this.getRetry_max();
		switch (event) {
		case .TFTP_EVENT_DATA:
				rblock = ModernizedCProgram.getrpacketblock(generatedRpacket);
				if ((((generatedBlock) + 1) & -1024) == rblock) {
					this.setRetries(/* This is the expected block.  Reset counters and ACK it. */0);
				}  else if (generatedBlock == rblock/* This is the last recently received block again. Log it and ACK it
				         again. */) {
					data.Curl_infof("Received last DATA packet block %d again.\n", rblock);
				} else {
						/* totally unexpected, just log it */data.Curl_infof("Received unexpected DATA packet block %d, expecting block %d\n", rblock, (((generatedBlock) + 1) & -1024));
						break;
				} 
				this.setBlock((int)/* ACK this block. */rblock);
				generatedSpacket.setpacketevent(.TFTP_EVENT_ACK);
				generatedSpacket.setpacketblock(generatedBlock);
				sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
				if (sbytes < 0) {
					data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
					return CURLE_SEND_ERROR;
				} 
				if (generatedRbytes < (ssize_t)generatedBlksize + /* Check if completed (That is, a less than full packet is received) */4) {
					this.setState(.TFTP_STATE_FIN);
				} else {
						this.setState(.TFTP_STATE_RX);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedRx_time);
				break;
		case .TFTP_EVENT_ERROR:
				generatedSpacket.setpacketevent(.TFTP_EVENT_ERROR);
				generatedSpacket.setpacketblock(generatedBlock);
				(Object)/*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
				this.setState(.TFTP_STATE_FIN);
				break;
		case .TFTP_EVENT_TIMEOUT:
				generatedRetries++;
				data.Curl_infof("Timeout waiting for block %d ACK.  Retries = %d\n", (((generatedBlock) + 1) & -1024), generatedRetries);
				if (generatedRetries > generatedRetry_max) {
					this.setError(.TFTP_ERR_TIMEOUT);
					this.setState(.TFTP_STATE_FIN);
				} else {
						sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
						if (sbytes < 0) {
							data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
							return CURLE_SEND_ERROR;
						} 
				} 
				break;
		case .TFTP_EVENT_OACK:
				this.setBlock(/* ACK option acknowledgement so we can move on to data */0);
				this.setRetries(0);
				generatedSpacket.setpacketevent(.TFTP_EVENT_ACK);
				generatedSpacket.setpacketblock(generatedBlock);
				sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
				if (sbytes < 0) {
					data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
					return CURLE_SEND_ERROR;
				} 
				this.setState(/* we're ready to RX data */.TFTP_STATE_RX);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedRx_time);
				break;
		default:
				data.Curl_failf("%s", "tftp_rx: internal error");
				return /* not really the perfect return code for
				                                  this */CURLE_TFTP_ILLEGAL;
		}
		return CURLE_OK/**********************************************************
		 *
		 * tftp_tx
		 *
		 * Event handler for the TX state
		 *
		 **********************************************************/;
	}
	public Object tftp_tx( event) {
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		ssize_t sbytes = new ssize_t();
		 result = CURLE_OK;
		SingleRequest generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		/* Bytes currently read */size_t cb = new size_t();
		byte[] buffer = new byte[128];
		tftp_packet generatedRpacket = this.getRpacket();
		int generatedBlock = this.getBlock();
		int generatedRetries = this.getRetries();
		int generatedRetry_max = this.getRetry_max();
		Object generatedSockfd = this.getSockfd();
		int generatedSbytes = this.getSbytes();
		Curl_sockaddr_storage generatedRemote_addr = this.getRemote_addr();
		Object generatedRemote_addrlen = this.getRemote_addrlen();
		Object generatedRx_time = this.getRx_time();
		tftp_packet generatedSpacket = this.getSpacket();
		int generatedBlksize = this.getBlksize();
		byte[] generatedUpload_fromhere = generatedReq.getUpload_fromhere();
		Object generatedWritebytecount = k.getWritebytecount();
		switch (event) {
		case .TFTP_EVENT_ERROR:
				this.setState(.TFTP_STATE_FIN);
				generatedSpacket.setpacketevent(.TFTP_EVENT_ERROR);
				generatedSpacket.setpacketblock(generatedBlock);
				(Object)/*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
				this.setState(.TFTP_STATE_FIN);
				break;
		case .TFTP_EVENT_OACK:
				if (event == .TFTP_EVENT_ACK) {
					int rblock = ModernizedCProgram.getrpacketblock(generatedRpacket);
					if (rblock != generatedBlock && !(generatedBlock == 0 && rblock == 65535)) {
						data.Curl_infof(/* This isn't the expected block.  Log it and up the retry counter */"Received ACK for block %d, expecting %d\n", rblock, generatedBlock);
						generatedRetries++;
						if (generatedRetries > generatedRetry_max) {
							data.Curl_failf("tftp_tx: giving up waiting for block %d ack", generatedBlock);
							result = CURLE_SEND_ERROR;
						} else {
								sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4 + generatedSbytes, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
								if (sbytes < /* Check all sbytes were sent */0) {
									data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
									result = CURLE_SEND_ERROR;
								} 
						} 
						return result;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedRx_time);
					generatedBlock++;
				} else {
						this.setBlock(/* first data block is 1 when using OACK */1);
				} 
				this.setRetries(0);
				generatedSpacket.setpacketevent(.TFTP_EVENT_DATA);
				generatedSpacket.setpacketblock(generatedBlock);
				if (generatedBlock > 1 && generatedSbytes < generatedBlksize) {
					this.setState(.TFTP_STATE_FIN);
					return CURLE_OK/* TFTP considers data block size < 512 bytes as an end of session. So
					     * in some cases we must wait for additional data to build full (512 bytes)
					     * data block.
					     * */;
				} 
				this.setSbytes(0);
				generatedReq.setUpload_fromhere((byte)generatedData + 4);
				do {
					result = generatedConn.Curl_fillreadbuffer(generatedBlksize - generatedSbytes, cb);
					if (result) {
						return result;
					} 
					generatedSbytes += (int)cb;
					generatedUpload_fromhere += cb;
				} while (generatedSbytes < generatedBlksize && cb != 0);
				sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4 + generatedSbytes, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
				if (sbytes < /* Check all sbytes were sent */0) {
					data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
					return CURLE_SEND_ERROR;
				} 
				generatedWritebytecount += generatedSbytes;
				data.Curl_pgrsSetUploadCounter(generatedWritebytecount);
				break;
		case .TFTP_EVENT_ACK:
		case .TFTP_EVENT_TIMEOUT:
				generatedRetries++;
				data.Curl_infof("Timeout waiting for block %d ACK.  Retries = %d\n", (((generatedBlock) + 1) & -1024), generatedRetries);
				if (generatedRetries > generatedRetry_max) {
					this.setError(.TFTP_ERR_TIMEOUT);
					this.setState(.TFTP_STATE_FIN);
				} else {
						sbytes = /*Error: Function owner not recognized*/sendto(generatedSockfd, (Object)generatedData, 4 + generatedSbytes, 0, (sockaddr)generatedRemote_addr, generatedRemote_addrlen);
						if (sbytes < /* Check all sbytes were sent */0) {
							data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(((int)/*Error: Function owner not recognized*/WSAGetLastError()), buffer, /*Error: sizeof expression not supported yet*/));
							return CURLE_SEND_ERROR;
						} 
						data.Curl_pgrsSetUploadCounter(generatedWritebytecount);
				} 
				break;
		default:
				data.Curl_failf("tftp_tx: internal error, event: %i", (int)(event));
				break;
		}
		return result/**********************************************************
		 *
		 * tftp_translate_code
		 *
		 * Translate internal error codes to CURL error codes
		 *
		 **********************************************************/;
	}
	public Object tftp_state_machine( event) {
		 result = CURLE_OK;
		connectdata generatedConn = this.getConn();
		Curl_easy generatedData = generatedConn.getData();
		Curl_easy data = generatedData;
		 generatedState = this.getState();
		switch (generatedState) {
		case .TFTP_STATE_TX:
				do {
				} while (0);
				result = state.tftp_tx(event);
				break;
		case .TFTP_STATE_RX:
				do {
				} while (0);
				result = state.tftp_rx(event);
				break;
		case .TFTP_STATE_START:
				do {
				} while (0);
				result = state.tftp_send_first(event);
				break;
		case .TFTP_STATE_FIN:
				data.Curl_infof("%s\n", "TFTP finished");
				break;
		default:
				do {
				} while (0);
				data.Curl_failf("%s", "Internal state machine error");
				result = CURLE_TFTP_ILLEGAL;
				break;
		}
		return result/**********************************************************
		 *
		 * tftp_disconnect
		 *
		 * The disconnect callback
		 *
		 **********************************************************/;
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
	public connectdata getConn() {
		return conn;
	}
	public void setConn(connectdata newConn) {
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
