package application;

public class RTMPSockBuf {
	private Object sb_socket;
	private int sb_size;
	private byte sb_start;
	private Object sb_buf;
	private int sb_timedout;
	private Object sb_ssl;
	
	public RTMPSockBuf(Object sb_socket, int sb_size, byte sb_start, Object sb_buf, int sb_timedout, Object sb_ssl) {
		setSb_socket(sb_socket);
		setSb_size(sb_size);
		setSb_start(sb_start);
		setSb_buf(sb_buf);
		setSb_timedout(sb_timedout);
		setSb_ssl(sb_ssl);
	}
	public RTMPSockBuf() {
	}
	
	public int RTMPSockBuf_Fill() {
		int nBytes;
		int generatedSb_size = this.getSb_size();
		Object generatedSb_buf = this.getSb_buf();
		if (!generatedSb_size) {
			this.setSb_start(generatedSb_buf);
		} 
		byte generatedSb_start = this.getSb_start();
		Object generatedSb_ssl = this.getSb_ssl();
		Object generatedSb_socket = this.getSb_socket();
		while (1) {
			nBytes = (int) - 1 - generatedSb_size - (generatedSb_start - generatedSb_buf);
			if (generatedSb_ssl) {
				nBytes = .TLS_read(generatedSb_ssl, generatedSb_start + generatedSb_size, nBytes);
			} else {
					nBytes = .recv(generatedSb_socket, generatedSb_start + generatedSb_size, nBytes, 0);
			} 
			if (nBytes > 0) {
				generatedSb_size += nBytes;
			}  else if (nBytes == 0) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, remote host closed connection", __FUNCTION__);
			} else {
					int level;
					int sockerr = .WSAGetLastError();
					if (sockerr == -1024 || sockerr == 11) {
						level = .RTMP_LOGDEBUG;
					} else {
							level = .RTMP_LOGERROR;
					} 
					ModernizedCProgram.RTMP_Log(level, "%s, recv returned %d. GetSockError(): %d (%s)", __FUNCTION__, nBytes, sockerr, ModernizedCProgram.socketerror(sockerr));
					if (sockerr == 4 && !ModernizedCProgram.RTMP_ctrlC) {
						continue;
					} 
					if (sockerr == -1024 || sockerr == 11) {
						this.setSb_timedout(1);
						nBytes = 0;
					} 
			} 
			break;
		}
		return nBytes;
	}
	public int RTMPSockBuf_Send(Object buf, int len) {
		int rc;
		Object generatedSb_ssl = this.getSb_ssl();
		Object generatedSb_socket = this.getSb_socket();
		if (generatedSb_ssl) {
			rc = .TLS_write(generatedSb_ssl, buf, len);
		} else {
				rc = .send(generatedSb_socket, buf, len, 0);
		} 
		return rc;
	}
	public int RTMPSockBuf_Close() {
		Object generatedSb_ssl = this.getSb_ssl();
		if (generatedSb_ssl) {
			.TLS_shutdown(generatedSb_ssl);
			.TLS_close(generatedSb_ssl);
			this.setSb_ssl(((Object)0));
		} 
		Object generatedSb_socket = this.getSb_socket();
		if (generatedSb_socket != (SOCKET)(~0)) {
			return .closesocket(generatedSb_socket);
		} 
		return 0;
	}
	public Object getSb_socket() {
		return sb_socket;
	}
	public void setSb_socket(Object newSb_socket) {
		sb_socket = newSb_socket;
	}
	public int getSb_size() {
		return sb_size;
	}
	public void setSb_size(int newSb_size) {
		sb_size = newSb_size;
	}
	public byte getSb_start() {
		return sb_start;
	}
	public void setSb_start(byte newSb_start) {
		sb_start = newSb_start;
	}
	public Object getSb_buf() {
		return sb_buf;
	}
	public void setSb_buf(Object newSb_buf) {
		sb_buf = newSb_buf;
	}
	public int getSb_timedout() {
		return sb_timedout;
	}
	public void setSb_timedout(int newSb_timedout) {
		sb_timedout = newSb_timedout;
	}
	public Object getSb_ssl() {
		return sb_ssl;
	}
	public void setSb_ssl(Object newSb_ssl) {
		sb_ssl = newSb_ssl;
	}
}
