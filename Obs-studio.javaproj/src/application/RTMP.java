package application;

public class RTMP {
	private int m_inChunkSize;
	private int m_outChunkSize;
	private int m_nBWCheckCounter;
	private int m_nBytesIn;
	private int m_nBytesInSent;
	private int m_nBufferMS;
	private int m_stream_id;
	private int m_mediaChannel;
	private Object m_mediaStamp;
	private Object m_pauseStamp;
	private int m_pausing;
	private int m_nServerBW;
	private int m_nClientBW;
	private Object m_nClientBW2;
	private Object m_bPlaying;
	private Object m_bSendEncoding;
	private Object m_bSendCounter;
	private Object m_bUseNagle;
	private Object m_bCustomSend;
	private Object m_customSendParam;
	private Object m_customSendFunc;
	private RTMP_BINDINFO m_bindIP;
	private Object m_bSendChunkSizeInfo;
	private int m_numInvokes;
	private int m_numCalls;
	private RTMP_METHOD m_methodCalls;
	private int m_channelsAllocatedIn;
	private int m_channelsAllocatedOut;
	private RTMPPacket m_vecChannelsIn;
	private RTMPPacket m_vecChannelsOut;
	private Integer m_channelTimestamp;
	private double m_fAudioCodecs;
	private double m_fVideoCodecs;
	private double m_fEncoding;
	private double m_fDuration;
	private int m_msgCounter;
	private int m_polling;
	private int m_resplen;
	private int m_unackd;
	private AVal m_clientID;
	private RTMP_READ m_read;
	private RTMPPacket m_write;
	private RTMPSockBuf m_sb;
	private RTMP_LNK Link;
	private int connect_time_ms;
	private int last_error_code;
	
	public RTMP(int m_inChunkSize, int m_outChunkSize, int m_nBWCheckCounter, int m_nBytesIn, int m_nBytesInSent, int m_nBufferMS, int m_stream_id, int m_mediaChannel, Object m_mediaStamp, Object m_pauseStamp, int m_pausing, int m_nServerBW, int m_nClientBW, Object m_nClientBW2, Object m_bPlaying, Object m_bSendEncoding, Object m_bSendCounter, Object m_bUseNagle, Object m_bCustomSend, Object m_customSendParam, Object m_customSendFunc, RTMP_BINDINFO m_bindIP, Object m_bSendChunkSizeInfo, int m_numInvokes, int m_numCalls, RTMP_METHOD m_methodCalls, int m_channelsAllocatedIn, int m_channelsAllocatedOut, RTMPPacket m_vecChannelsIn, RTMPPacket m_vecChannelsOut, Integer m_channelTimestamp, double m_fAudioCodecs, double m_fVideoCodecs, double m_fEncoding, double m_fDuration, int m_msgCounter, int m_polling, int m_resplen, int m_unackd, AVal m_clientID, RTMP_READ m_read, RTMPPacket m_write, RTMPSockBuf m_sb, RTMP_LNK Link, int connect_time_ms, int last_error_code) {
		setM_inChunkSize(m_inChunkSize);
		setM_outChunkSize(m_outChunkSize);
		setM_nBWCheckCounter(m_nBWCheckCounter);
		setM_nBytesIn(m_nBytesIn);
		setM_nBytesInSent(m_nBytesInSent);
		setM_nBufferMS(m_nBufferMS);
		setM_stream_id(m_stream_id);
		setM_mediaChannel(m_mediaChannel);
		setM_mediaStamp(m_mediaStamp);
		setM_pauseStamp(m_pauseStamp);
		setM_pausing(m_pausing);
		setM_nServerBW(m_nServerBW);
		setM_nClientBW(m_nClientBW);
		setM_nClientBW2(m_nClientBW2);
		setM_bPlaying(m_bPlaying);
		setM_bSendEncoding(m_bSendEncoding);
		setM_bSendCounter(m_bSendCounter);
		setM_bUseNagle(m_bUseNagle);
		setM_bCustomSend(m_bCustomSend);
		setM_customSendParam(m_customSendParam);
		setM_customSendFunc(m_customSendFunc);
		setM_bindIP(m_bindIP);
		setM_bSendChunkSizeInfo(m_bSendChunkSizeInfo);
		setM_numInvokes(m_numInvokes);
		setM_numCalls(m_numCalls);
		setM_methodCalls(m_methodCalls);
		setM_channelsAllocatedIn(m_channelsAllocatedIn);
		setM_channelsAllocatedOut(m_channelsAllocatedOut);
		setM_vecChannelsIn(m_vecChannelsIn);
		setM_vecChannelsOut(m_vecChannelsOut);
		setM_channelTimestamp(m_channelTimestamp);
		setM_fAudioCodecs(m_fAudioCodecs);
		setM_fVideoCodecs(m_fVideoCodecs);
		setM_fEncoding(m_fEncoding);
		setM_fDuration(m_fDuration);
		setM_msgCounter(m_msgCounter);
		setM_polling(m_polling);
		setM_resplen(m_resplen);
		setM_unackd(m_unackd);
		setM_clientID(m_clientID);
		setM_read(m_read);
		setM_write(m_write);
		setM_sb(m_sb);
		setLink(Link);
		setConnect_time_ms(connect_time_ms);
		setLast_error_code(last_error_code);
	}
	public RTMP() {
	}
	
	public RTMP RTMP_Alloc() {
		return .calloc(1, );
	}
	public void RTMP_Free() {
		.free(r);
	}
	public void RTMP_Init() {
		if (!ModernizedCProgram.RTMP_TLS_ctx) {
			ModernizedCProgram.RTMP_TLS_Init();
		} 
		.memset(r, 0, );
		RTMPSockBuf generatedM_sb = this.getM_sb();
		generatedM_sb.setSb_socket(-1);
		this.setM_inChunkSize(128);
		this.setM_outChunkSize(128);
		this.setM_bSendChunkSizeInfo(1);
		this.setM_nBufferMS(30000);
		this.setM_nClientBW(2500000);
		this.setM_nClientBW2(2);
		this.setM_nServerBW(2500000);
		this.setM_fAudioCodecs(3191.0);
		this.setM_fVideoCodecs(252.0);
		RTMP_LNK generatedLink = this.getLink();
		generatedLink.setCurStreamIdx(0);
		generatedLink.setNStreams(0);
		generatedLink.setTimeout(30);
		generatedLink.setSwfAge(30);
	}
	public void RTMP_EnableWrite() {
		RTMP_LNK generatedLink = this.getLink();
		int generatedProtocol = generatedLink.getProtocol();
		generatedProtocol |=  -1024;
	}
	public double RTMP_GetDuration() {
		double generatedM_fDuration = this.getM_fDuration();
		return generatedM_fDuration;
	}
	public int RTMP_IsConnected() {
		RTMPSockBuf generatedM_sb = this.getM_sb();
		Object generatedSb_socket = generatedM_sb.getSb_socket();
		return generatedSb_socket != (SOCKET)(~0);
	}
	public Object RTMP_Socket() {
		RTMPSockBuf generatedM_sb = this.getM_sb();
		Object generatedSb_socket = generatedM_sb.getSb_socket();
		return generatedSb_socket;
	}
	public int RTMP_IsTimedout() {
		RTMPSockBuf generatedM_sb = this.getM_sb();
		int generatedSb_timedout = generatedM_sb.getSb_timedout();
		return generatedSb_timedout;
	}
	public void RTMP_SetBufferMS(int size) {
		this.setM_nBufferMS(size);
	}
	public void RTMP_UpdateBufferMS() {
		int generatedM_stream_id = this.getM_stream_id();
		int generatedM_nBufferMS = this.getM_nBufferMS();
		r.RTMP_SendCtrl(3, generatedM_stream_id, generatedM_nBufferMS);
	}
	public int RTMP_SetupURL(Byte url) {
		int ret;
		int len;
		int port = 0;
		len = (int).strlen(url);
		RTMP_LNK generatedLink = this.getLink();
		int generatedProtocol = generatedLink.getProtocol();
		AVal generatedHostname = generatedLink.getHostname();
		AVal generatedApp = generatedLink.getApp();
		ret = generatedHostname.RTMP_ParseURL(url, generatedProtocol, port, generatedApp);
		if (!ret) {
			return ret;
		} 
		generatedLink.setPort(port);
		AVal generatedTcUrl = generatedLink.getTcUrl();
		int generatedAv_len = generatedTcUrl.getAv_len();
		Byte generatedAv_val = generatedApp.getAv_val();
		int generatedPort = generatedLink.getPort();
		int generatedLFlags = generatedLink.getLFlags();
		if (!generatedAv_len) {
			generatedTcUrl.setAv_val(url);
			if (generatedAv_len) {
				if (generatedAv_val < url + len) {
					generatedTcUrl.setAv_len(generatedAv_len + (generatedAv_val - /* if app is part of original url, just use it */url));
				} else {
						len = generatedAv_len + generatedAv_len + ;
						generatedTcUrl.setAv_val(.malloc(len));
						generatedTcUrl.setAv_len(.snprintf(generatedAv_val, len, "%s://%.*s:%d/%.*s", ModernizedCProgram.RTMPProtocolStringsLower[generatedProtocol], generatedAv_len, generatedAv_val, generatedPort, generatedAv_len, generatedAv_val));
						generatedLFlags |=  -1024;
				} 
			} else {
					generatedTcUrl.setAv_len((int).strlen(url));
			} 
		} 
		Object generatedSWFSize = generatedLink.getSWFSize();
		Object generatedSWFHash = generatedLink.getSWFHash();
		int generatedSwfAge = generatedLink.getSwfAge();
		if ((generatedLFlags & -1024) && generatedAv_len) {
			ModernizedCProgram.RTMP_HashSWF(generatedAv_val, generatedSWFSize, (byte)generatedSWFHash, generatedSwfAge);
		} 
		AVal generatedSockshost = generatedLink.getSockshost();
		ModernizedCProgram.SocksSetup(r, generatedSockshost);
		if (generatedPort == 0) {
			if (generatedProtocol & -1024) {
				generatedLink.setPort(443);
			}  else if (generatedProtocol & -1024) {
				generatedLink.setPort(80);
			} else {
					generatedLink.setPort(1935);
			} 
		} 
		return 1;
	}
	public int RTMP_AddStream(Object playpath) {
		int idx = -1;
		AVal pp = new AVal((byte)playpath, playpath ? (int).strlen(playpath) : 0);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		int generatedNStreams = generatedLink.getNStreams();
		pp.RTMP_ParsePlaypath(generatedStreams[generatedNStreams].getPlaypath());
		generatedStreams[generatedNStreams].setId(-1);
		idx = generatedNStreams;
		generatedNStreams++;
		return idx;
	}
	public int RTMP_TLS_Accept(Object ctx) {
		 srv_ctx = ctx;
		RTMPSockBuf generatedM_sb = this.getM_sb();
		Object generatedSb_ssl = generatedM_sb.getSb_ssl();
		.TLS_server(srv_ctx, generatedSb_ssl);
		Object generatedSb_socket = generatedM_sb.getSb_socket();
		.TLS_setfd(generatedSb_ssl, generatedSb_socket);
		int connect_return = .TLS_connect(generatedSb_ssl);
		if (connect_return < 0) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, TLS_Connect failed", __FUNCTION__);
			return 0;
		} 
		return 1;
	}
	public int SocksNegotiate() {
		long addr;
		sockaddr_storage service = new sockaddr_storage();
		socklen_t addrlen = 0;
		int socket_error = 0;
		.memset(service, 0, );
		RTMP_LNK generatedLink = this.getLink();
		AVal generatedHostname = generatedLink.getHostname();
		int generatedPort = generatedLink.getPort();
		ModernizedCProgram.add_addr_info(service, addrlen, generatedHostname, generatedPort, 0, socket_error);
		Object generatedSs_family = service.getSs_family();
		// not doing IPv6 socksif (generatedSs_family == 23) {
			return 0;
		} 
		addr = .htonl(((sockaddr_in)service).getSin_addr().getS_un().getS_addr());
		{ 
			byte[] packet = new byte[]{4, /* SOCKS 4, connect */1, (generatedPort >> 8) & -1024, (generatedPort) & -1024, (byte)(addr >> 24) & -1024, (byte)(addr >> 16) & -1024, (byte)(addr >> 8) & -1024, (byte)addr & -1024, 0/* NULL terminate */};
			r.WriteN(packet, );
			if (r.ReadN(packet, 8) != 8) {
				return 0;
			} 
			if (packet[0] == 0 && packet[1] == 90) {
				return 1;
			} else {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, SOCKS returned error code %d", __FUNCTION__, packet[1]);
					return 0;
			} 
		}
	}
	public int RTMP_ConnectStream(int seekTime) {
		RTMPPacket packet = new RTMPPacket(0/* seekTime was already set by SetupStream / SetupURL.
		     * This is only needed by ReconnectStream.
		     */);
		RTMP_LNK generatedLink = this.getLink();
		if (seekTime > 0) {
			generatedLink.setSeekTime(seekTime);
		} 
		this.setM_mediaChannel(0);
		Object generatedM_bPlaying = this.getM_bPlaying();
		Object generatedM_nBytesRead = (packet).getM_nBytesRead();
		Object generatedM_nBodySize = (packet).getM_nBodySize();
		Object generatedM_packetType = packet.getM_packetType();
		while (!generatedM_bPlaying && r.RTMP_IsConnected() && ModernizedCProgram.RTMP_ReadPacket(r, packet)) {
			if ((generatedM_nBytesRead == generatedM_nBodySize)) {
				if (!generatedM_nBodySize) {
					continue;
				} 
				if ((generatedM_packetType == -1024) || (generatedM_packetType == -1024) || (generatedM_packetType == -1024)) {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "Received FLV packet before play()! Ignoring.");
					packet.RTMPPacket_Free();
					continue;
				} 
				ModernizedCProgram.RTMP_ClientPacket(r, packet);
				packet.RTMPPacket_Free();
			} 
		}
		return generatedM_bPlaying;
	}
	public int RTMP_ReconnectStream(int seekTime, int streamIdx) {
		r.RTMP_DeleteStream(streamIdx);
		r.RTMP_SendCreateStream();
		return r.RTMP_ConnectStream(seekTime);
	}
	public int RTMP_ToggleStream() {
		int res;
		int generatedM_pausing = this.getM_pausing();
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedStatus = generatedM_read.getStatus();
		Object generatedM_pauseStamp = this.getM_pauseStamp();
		if (!generatedM_pausing) {
			if (r.RTMP_IsTimedout() && generatedStatus == -1) {
				generatedM_read.setStatus(0);
			} 
			res = r.RTMP_SendPause(1, generatedM_pauseStamp);
			if (!res) {
				return res;
			} 
			this.setM_pausing(1);
			.Sleep(1 * 1000);
		} 
		res = r.RTMP_SendPause(0, generatedM_pauseStamp);
		this.setM_pausing(3);
		return res;
	}
	public void RTMP_DeleteStream(int streamIdx) {
		int generatedM_stream_id = this.getM_stream_id();
		if (generatedM_stream_id < 0) {
			return ;
		} 
		this.setM_bPlaying(0);
		RTMP_LNK generatedLink = this.getLink();
		int generatedProtocol = generatedLink.getProtocol();
		if ((generatedProtocol & -1024)) {
			r.SendFCUnpublish(streamIdx);
		} 
		r.SendDeleteStream(generatedM_stream_id);
		this.setM_stream_id(-1);
	}
	public int ReadN(Byte buffer, int n) {
		int nOriginalSize = n;
		int avail;
		byte ptr;
		RTMPSockBuf generatedM_sb = this.getM_sb();
		generatedM_sb.setSb_timedout(0);
		ptr = buffer;
		RTMP_LNK generatedLink = this.getLink();
		int generatedProtocol = generatedLink.getProtocol();
		int generatedM_resplen = this.getM_resplen();
		int generatedSb_size = generatedM_sb.getSb_size();
		int generatedM_unackd = this.getM_unackd();
		int generatedSb_timedout = generatedM_sb.getSb_timedout();
		byte generatedSb_start = generatedM_sb.getSb_start();
		int generatedM_nBytesIn = this.getM_nBytesIn();
		Object generatedM_bSendCounter = this.getM_bSendCounter();
		int generatedM_nBytesInSent = this.getM_nBytesInSent();
		int generatedM_nClientBW = this.getM_nClientBW();
		Object generatedRc4keyIn = generatedLink.getRc4keyIn();
		while (n > 0) {
			int nBytes = 0;
			int nRead;
			if (generatedProtocol & -1024) {
				int refill = 0;
				while (!generatedM_resplen) {
					int ret;
					if (generatedSb_size < 13 || refill) {
						if (!generatedM_unackd) {
							r.HTTP_Post(.RTMPT_IDLE, "", 1);
						} 
						if (generatedM_sb.RTMPSockBuf_Fill() < 1) {
							if (!generatedSb_timedout) {
								r.RTMP_Close();
							} 
							return 0;
						} 
					} 
					if ((ret = r.HTTP_read(0)) == -1) {
						ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, No valid HTTP response found", __FUNCTION__);
						r.RTMP_Close();
						return 0;
					}  else if (ret == -2) {
						refill = 1;
					} else {
							refill = 0;
					} 
				}
				if (generatedM_resplen && !generatedSb_size) {
					generatedM_sb.RTMPSockBuf_Fill();
				} 
				avail = generatedSb_size;
				if (avail > generatedM_resplen) {
					avail = generatedM_resplen;
				} 
			} else {
					avail = generatedSb_size;
					if (avail == 0) {
						if (generatedM_sb.RTMPSockBuf_Fill() < 1) {
							if (!generatedSb_timedout) {
								r.RTMP_Close();
							} 
							return 0;
						} 
						avail = generatedSb_size;
					} 
			} 
			nRead = ((n < avail) ? n : avail);
			if (nRead > 0) {
				.memcpy(ptr, generatedSb_start, nRead);
				generatedSb_start += nRead;
				generatedSb_size -= nRead;
				nBytes = nRead;
				generatedM_nBytesIn += nRead;
				if (generatedM_bSendCounter && generatedM_nBytesIn > (generatedM_nBytesInSent + generatedM_nClientBW / 10)) {
					if (!r.SendBytesReceived()) {
						return 0/*RTMP_Log(RTMP_LOGDEBUG, "%s: %d bytes\n", __FUNCTION__, nBytes); */;
					} 
				} 
			} 
			if (nBytes == 0) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, RTMP socket closed by peer", __FUNCTION__);
				/*goto again; */r.RTMP_Close();
				break;
			} 
			if (generatedProtocol & -1024) {
				generatedM_resplen -= nBytes;
			} 
			if (generatedRc4keyIn) {
				.RC4(generatedRc4keyIn, nBytes, (uint8_t)ptr, (uint8_t)ptr);
			} 
			n -= nBytes;
			ptr += nBytes;
		}
		return nOriginalSize - n;
	}
	public int WriteN(Object buffer, int n) {
		byte ptr = buffer;
		byte encrypted = 0;
		byte[] buf = new byte[(16 * 1024)];
		RTMP_LNK generatedLink = this.getLink();
		Object generatedRc4keyOut = generatedLink.getRc4keyOut();
		if (generatedRc4keyOut) {
			if (n > (int)) {
				encrypted = (byte).malloc(n);
			} else {
					encrypted = (byte)buf;
			} 
			ptr = encrypted;
			.RC4(generatedRc4keyOut, n, (uint8_t)buffer, (uint8_t)ptr);
		} 
		int generatedProtocol = generatedLink.getProtocol();
		Object generatedM_bCustomSend = this.getM_bCustomSend();
		Object generatedM_customSendFunc = this.getM_customSendFunc();
		RTMPSockBuf generatedM_sb = this.getM_sb();
		Object generatedM_customSendParam = this.getM_customSendParam();
		while (n > 0) {
			int nBytes;
			if (generatedProtocol & -1024) {
				nBytes = r.HTTP_Post(.RTMPT_SEND, ptr, n);
			}  else if (generatedM_bCustomSend && generatedM_customSendFunc) {
				nBytes = .UNRECOGNIZEDFUNCTIONNAME(generatedM_sb, ptr, n, generatedM_customSendParam);
			} else {
					nBytes = generatedM_sb.RTMPSockBuf_Send(ptr, n/*RTMP_Log(RTMP_LOGDEBUG, "%s: %d\n", __FUNCTION__, nBytes); */);
			} 
			if (nBytes < 0) {
				int sockerr = .WSAGetLastError();
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, RTMP send error %d (%d bytes)", __FUNCTION__, sockerr, n);
				if (sockerr == 4 && !ModernizedCProgram.RTMP_ctrlC) {
					continue;
				} 
				this.setLast_error_code(sockerr);
				r.RTMP_Close();
				n = 1;
				break;
			} 
			if (nBytes == 0) {
				break;
			} 
			n -= nBytes;
			ptr += nBytes;
		}
		if (encrypted && encrypted != buf) {
			.free(encrypted);
		} 
		return n == 0;
	}
	public int RTMP_SendCreateStream() {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_createStream);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = /* NULL */.AMF_NULL;
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int SendReleaseStream(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_releaseStream);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0;
		} 
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int SendFCPublish(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_FCPublish);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0;
		} 
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int SendFCUnpublish(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_FCUnpublish);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0;
		} 
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	/* unused */
	/* unused */
	public int SendPublish(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* source channel (invoke) */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		packet.setM_nInfoField2(generatedStreams[streamIdx].getId());
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_publish);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0;
		} 
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, /* FIXME: should we choose live based on Link.lFlags & RTMP_LF_LIVE? */ModernizedCProgram.av_live);
		if (!enc) {
			return 0;
		} 
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int SendDeleteStream(double dStreamId) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_deleteStream);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, dStreamId);
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, /* no response expected */0);
	}
	public int RTMP_SendPause(int DoPause, int iTime) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* video channel */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_pause);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		enc = ModernizedCProgram.AMF_EncodeBoolean(enc, pend, DoPause);
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, (double)iTime);
		packet.setM_nBodySize(enc - generatedM_body);
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, %d, pauseTime=%d", __FUNCTION__, DoPause, iTime);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int RTMP_Pause(int DoPause) {
		int generatedM_mediaChannel = this.getM_mediaChannel();
		int generatedM_channelsAllocatedIn = this.getM_channelsAllocatedIn();
		Integer generatedM_channelTimestamp = this.getM_channelTimestamp();
		if (DoPause) {
			this.setM_pauseStamp(generatedM_mediaChannel < generatedM_channelsAllocatedIn ? generatedM_channelTimestamp[generatedM_mediaChannel] : 0);
		} 
		Object generatedM_pauseStamp = this.getM_pauseStamp();
		return r.RTMP_SendPause(DoPause, generatedM_pauseStamp);
	}
	public int RTMP_SendSeek(int iTime) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* video channel */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_seek);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, (double)iTime);
		packet.setM_nBodySize(enc - generatedM_body);
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedFlags = generatedM_read.getFlags();
		generatedFlags |=  -1024;
		generatedM_read.setNResumeTS(0);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int RTMP_SendServerBW() {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		packet.setM_nBodySize(4);
		Byte generatedM_body = packet.getM_body();
		int generatedM_nServerBW = this.getM_nServerBW();
		ModernizedCProgram.AMF_EncodeInt32(generatedM_body, pend, generatedM_nServerBW);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int RTMP_SendClientBW() {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		packet.setM_nBodySize(5);
		Byte generatedM_body = packet.getM_body();
		int generatedM_nClientBW = this.getM_nClientBW();
		ModernizedCProgram.AMF_EncodeInt32(generatedM_body, pend, generatedM_nClientBW);
		Object generatedM_nClientBW2 = this.getM_nClientBW2();
		generatedM_body[4] = generatedM_nClientBW2;
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int SendBytesReceived() {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		packet.setM_nBodySize(4);
		Byte generatedM_body = packet.getM_body();
		int generatedM_nBytesIn = this.getM_nBytesIn();
		ModernizedCProgram.AMF_EncodeInt32(generatedM_body, pend, generatedM_nBytesIn);
		this.setM_nBytesInSent(generatedM_nBytesIn);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, /*RTMP_Log(RTMP_LOGDEBUG, "Send bytes report. 0x%x (%d bytes)", (unsigned int)m_nBytesIn, m_nBytesIn); */0);
	}
	public int SendCheckBW() {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(/* RTMP_GetTime(); */0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av__checkbw);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, /* triggers _onbwcheck and eventually results in _onbwdone */0);
	}
	public int SendCheckBWResult(double txn) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		int generatedM_nBWCheckCounter = this.getM_nBWCheckCounter();
		packet.setM_nTimeStamp(-1024 * generatedM_nBWCheckCounter);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av__result);
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, txn);
		enc++ = .AMF_NULL;
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, (double)generatedM_nBWCheckCounter++);
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int SendPong(double txn) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* control channel (invoke) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		int generatedM_nBWCheckCounter = this.getM_nBWCheckCounter();
		packet.setM_nTimeStamp(-1024 * generatedM_nBWCheckCounter);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_pong);
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, txn);
		enc++ = .AMF_NULL;
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public int SendPlay(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* we make 8 our stream channel */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		packet.setM_nInfoField2(generatedStreams[streamIdx].getId());
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_play);
		int generatedM_numInvokes = this.getM_numInvokes();
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, ++generatedM_numInvokes);
		enc++ = .AMF_NULL;
		int generatedSeekTime = generatedLink.getSeekTime();
		int generatedStopTime = generatedLink.getStopTime();
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, seekTime=%d, stopTime=%d, sending play: %s", __FUNCTION__, generatedSeekTime, generatedStopTime, generatedStreams[streamIdx].getPlaypath().getAv_val());
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0/* Optional parameters start and len.
			     *
			     * start: -2, -1, 0, positive number
			     *  -2: looks for a live stream, then a recorded stream,
			     *      if not found any open a live stream
			     *  -1: plays a live stream
			     * >=0: plays a recorded streams from 'start' milliseconds
			     */;
		} 
		int generatedLFlags = generatedLink.getLFlags();
		if (generatedLFlags & -1024) {
			enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, -1000.0);
		} else {
				if (generatedSeekTime > 0.0) {
					enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, generatedSeekTime);
				} else {
						enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, /*-2000.0);*//* recorded as default, -2000.0 is not reliable since that freezes the player if the stream is not found */0.0);
				} 
		} 
		if (!enc) {
			return 0/* len: -1, 0, positive number
			     *  -1: plays live or recorded stream to the end (default)
			     *   0: plays a frame 'start' ms away from the beginning
			     *  >0: plays a live or recoded stream for 'len' milliseconds
			     */;
		} 
		if (generatedStopTime) {
			enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, generatedStopTime - generatedSeekTime);
			if (!enc) {
				return 0;
			} 
		} 
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int SendPlaylist(int streamIdx) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[1024];
		byte pend = pbuf + ;
		byte enc;
		packet.setM_nChannel(/* we make 8 our stream channel */-1024);
		packet.setM_headerType(0);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(0);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		packet.setM_nInfoField2(generatedStreams[streamIdx].getId());
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		Byte generatedM_body = packet.getM_body();
		enc = generatedM_body;
		enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_set_playlist);
		enc = ModernizedCProgram.AMF_EncodeNumber(enc, pend, 0);
		enc++ = .AMF_NULL;
		enc++ = .AMF_ECMA_ARRAY;
		enc++ = 0;
		enc++ = 0;
		enc++ = 0;
		enc++ = .AMF_OBJECT;
		enc = ModernizedCProgram.AMF_EncodeNamedString(enc, pend, ModernizedCProgram.av_0, generatedStreams[streamIdx].getPlaypath());
		if (!enc) {
			return 0;
		} 
		if (enc + 3 >= pend) {
			return 0;
		} 
		enc++ = 0;
		enc++ = 0;
		enc++ = .AMF_OBJECT_END;
		packet.setM_nBodySize(enc - generatedM_body);
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 1);
	}
	public int RTMP_SendCtrl(int nType, int nObject, int nTime) {
		RTMPPacket packet = new RTMPPacket();
		byte[] pbuf = new byte[256];
		byte pend = pbuf + ;
		int nSize;
		byte buf;
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "sending ctrl. type: 0x%04x", (int)nType);
		packet.setM_nChannel(/* control channel (ping) */-1024);
		packet.setM_headerType(1);
		packet.setM_packetType(-1024);
		packet.setM_nTimeStamp(/* RTMP_GetTime(); */0);
		packet.setM_nInfoField2(0);
		packet.setM_hasAbsTimestamp(0);
		packet.setM_body(pbuf + 18);
		switch (nType) {
		case -1024:
				nSize = 44;
				break;
		case -1024:
				nSize = 3;
				break;
		case -1024:
				nSize = 10;
				break;
		default:
				nSize = 6;
				break;
		}
		packet.setM_nBodySize(nSize);
		Byte generatedM_body = packet.getM_body();
		buf = generatedM_body;
		buf = ModernizedCProgram.AMF_EncodeInt16(buf, pend, nType);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedSWFVerificationResponse = generatedLink.getSWFVerificationResponse();
		Object generatedM_nBodySize = packet.getM_nBodySize();
		if (nType == -1024) {
			.memcpy(buf, generatedSWFVerificationResponse, 42);
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Sending SWFVerification response: ");
			ModernizedCProgram.RTMP_LogHex(.RTMP_LOGDEBUG, (uint8_t)generatedM_body, generatedM_nBodySize);
		}  else if (nType == -1024) {
			buf = nObject & -1024;
		} else {
				if (nSize > 2) {
					buf = ModernizedCProgram.AMF_EncodeInt32(buf, pend, nObject);
				} 
				if (nSize > 6) {
					buf = ModernizedCProgram.AMF_EncodeInt32(buf, pend, nTime);
				} 
		} 
		return ModernizedCProgram.RTMP_SendPacket(r, packet, 0);
	}
	public void RTMP_DropRequest(int i, int freeit) {
		RTMP_METHOD generatedM_methodCalls = this.getM_methodCalls();
		int generatedM_numCalls = this.getM_numCalls();
		generatedM_methodCalls.AV_erase(generatedM_numCalls, i, freeit);
	}
	public int HandleInvoke(Object body, int nBodySize) {
		AMFObject obj = new AMFObject();
		AVal method = new AVal();
		double txn;
		int ret = 0;
		int nRes;
		if (body[0] != /* make sure it is a string method name we start with */-1024) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "%s, Sanity failed. no string method in invoke packet", __FUNCTION__);
			return 0;
		} 
		nRes = obj.AMF_Decode(body, nBodySize, 0);
		if (nRes < 0) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, error decoding invoke packet", __FUNCTION__);
			return 0;
		} 
		obj.AMF_Dump();
		AMFObjectProperty aMFObjectProperty = new AMFObjectProperty();
		ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 0), method);
		txn = aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 1).AMFProp_GetNumber();
		Byte generatedAv_val = method.getAv_val();
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, server invoking <%s>", __FUNCTION__, generatedAv_val);
		int generatedAv_len = (method).getAv_len();
		int generatedM_numCalls = this.getM_numCalls();
		RTMP_METHOD generatedM_methodCalls = this.getM_methodCalls();
		RTMP_LNK generatedLink = this.getLink();
		AVal generatedToken = generatedLink.getToken();
		 generatedP_vu = p.getP_vu();
		Object generatedP_aval = generatedP_vu.getP_aval();
		int generatedProtocol = generatedLink.getProtocol();
		int generatedNStreams = generatedLink.getNStreams();
		AVal generatedUsherToken = generatedLink.getUsherToken();
		AVal generatedSubscribepath = generatedLink.getSubscribepath();
		int generatedLFlags = generatedLink.getLFlags();
		Object generatedStreams = generatedLink.getStreams();
		int generatedCurStreamIdx = generatedLink.getCurStreamIdx();
		int generatedM_nBufferMS = this.getM_nBufferMS();
		int generatedPlayingStreams = generatedLink.getPlayingStreams();
		int generatedM_nBWCheckCounter = this.getM_nBWCheckCounter();
		int generatedPFlags = generatedLink.getPFlags();
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedFlags = generatedM_read.getFlags();
		int generatedM_pausing = this.getM_pausing();
		Object generatedM_pauseStamp = this.getM_pauseStamp();
		if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			AVal methodInvoked = new AVal(0);
			int i;
			for (i = 0; i < generatedM_numCalls; i++) {
				if (generatedM_methodCalls[i].getNum() == (int)txn) {
					methodInvoked = generatedM_methodCalls[i].getName();
					generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 0);
					break;
				} 
			}
			if (!generatedAv_val) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received result id %f without matching request", __FUNCTION__, txn);
				;
			} 
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received result for method call <%s>", __FUNCTION__, generatedAv_val);
			if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				if (generatedAv_len) {
					AMFObjectProperty p = new AMFObjectProperty();
					if (ModernizedCProgram.RTMP_FindFirstMatchingProperty(obj, ModernizedCProgram.av_secureToken, p)) {
						generatedToken.DecodeTEA(generatedP_aval);
						ModernizedCProgram.SendSecureTokenResponse(r, generatedP_aval);
					} 
				} 
				if (generatedProtocol & -1024) {
					for (int i = 0;
					 i < generatedNStreams; i++) {
						r.SendReleaseStream(i);
					}
					for (int i = 0;
					 i < generatedNStreams; i++) {
						r.SendFCPublish(i);
					}
				} else {
						r.RTMP_SendServerBW();
						r.RTMP_SendCtrl(3, 0, 300);
				} 
				for (int i = 0;
				 i < generatedNStreams; i++) {
					r.RTMP_SendCreateStream();
				}
				if (!(generatedProtocol & -1024)) {
					if (generatedAv_len) {
						ModernizedCProgram.SendUsherToken(r, generatedUsherToken);
					} 
					if (generatedAv_len) {
						ModernizedCProgram.SendFCSubscribe(r, generatedSubscribepath);
					}  else if (generatedLFlags & -1024) {
						for (int i = 0;
						 i < generatedNStreams; i++) {
							ModernizedCProgram.SendFCSubscribe(r, generatedStreams[i].getPlaypath());
						}
					} 
				} 
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				int id = (int)aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 3).AMFProp_GetNumber();
				generatedStreams[generatedCurStreamIdx].setId(id);
				if (generatedProtocol & -1024) {
					r.SendPublish(generatedCurStreamIdx);
				} else {
						if (generatedLFlags & -1024) {
							r.SendPlaylist(generatedCurStreamIdx);
						} 
						r.SendPlay(generatedCurStreamIdx);
						r.RTMP_SendCtrl(3, id, generatedM_nBufferMS);
				} 
				generatedCurStreamIdx++;
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				this.setM_bPlaying(1);
				generatedPlayingStreams++;
			} 
			.free(generatedAv_val);
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			if (!generatedM_nBWCheckCounter) {
				r.SendCheckBW();
			} 
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			r.RTMP_Close();
			ret = 1;
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			r.SendPong(txn);
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			r.SendCheckBWResult(txn);
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			int i;
			for (i = 0; i < generatedM_numCalls; i++) {
				if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
					generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 1);
					break;
				} 
			}
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			AVal methodInvoked = new AVal(0);
			int i;
			if (generatedProtocol & -1024) {
				for (i = 0; i < generatedM_numCalls; i++) {
					if (generatedM_methodCalls[i].getNum() == txn) {
						methodInvoked = generatedM_methodCalls[i].getName();
						generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 0);
						break;
					} 
				}
				if (!generatedAv_val) {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received result id %f without matching request", __FUNCTION__, txn);
					;
				} 
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received error for method call <%s>", __FUNCTION__, generatedAv_val);
				if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
					AMFObject obj2 = new AMFObject();
					AVal code = new AVal();
					AVal level = new AVal();
					AVal description = new AVal();
					ModernizedCProgram.AMFProp_GetObject(aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 3), obj2);
					ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_code, -1), code);
					ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_level, -1), level);
					ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_description, -1), description);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, error description: %s", __FUNCTION__, generatedAv_val);
					if (ModernizedCProgram.PublisherAuth(r, description) == /* if PublisherAuth returns 1, then reconnect */1) {
						r.RTMP_Close();
						if (generatedPFlags & -1024) {
							generatedPFlags |=  -1024;
						} 
						if (!ModernizedCProgram.RTMP_Connect(r, ((Object)0)) || !r.RTMP_ConnectStream(0)) {
							;
						} 
					} 
				} 
			} else {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "rtmp server sent error");
			} 
			.free(generatedAv_val);
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "rtmp server requested close");
			r.RTMP_Close();
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			AMFObject obj2 = new AMFObject();
			AVal code = new AVal();
			AVal level = new AVal();
			AVal description = new AVal();
			ModernizedCProgram.AMFProp_GetObject(aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 3), obj2);
			ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_code, -1), code);
			ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_level, -1), level);
			ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj2, ModernizedCProgram.av_description, -1), description);
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, onStatus: %s", __FUNCTION__, generatedAv_val);
			if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				this.setM_stream_id(-1);
				r.RTMP_Close();
				if (generatedAv_len) {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s:\n%s (%s)", generatedAv_val, generatedAv_val, generatedAv_val);
				} else {
						ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s:\n%s", generatedAv_val, generatedAv_val);
				} 
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				int i;
				this.setM_bPlaying(1);
				for (i = 0; i < generatedM_numCalls; i++) {
					if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
						generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 1);
						break;
					} 
				}
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				int i;
				this.setM_bPlaying(1);
				for (i = 0; i < generatedM_numCalls; i++) {
					if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
						generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 1);
						break;
					} 
				}
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len)) || (generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				r.RTMP_Close();
				ret = 1;
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				generatedFlags &=  ~-1024;
			}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
				if (generatedM_pausing == 1 || generatedM_pausing == 2) {
					r.RTMP_SendPause(0, generatedM_pauseStamp);
					this.setM_pausing(3);
				} 
			} 
		}  else if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			int i;
			for (i = 0; i < generatedM_numCalls; i++) {
				if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
					generatedM_methodCalls.AV_erase(generatedM_numCalls, i, 1);
					break;
				} 
			}
		} 
		return ret;
	}
	public int HandleMetadata(Byte body, int len) {
		/* also keep duration or filesize to make a nice progress bar */AMFObject obj = new AMFObject();
		AVal metastring = new AVal();
		int ret = 0;
		int nRes = obj.AMF_Decode(body, len, 0);
		if (nRes < 0) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, error decoding meta data packet", __FUNCTION__);
			return 0;
		} 
		obj.AMF_Dump();
		AMFObjectProperty aMFObjectProperty = new AMFObjectProperty();
		ModernizedCProgram.AMFProp_GetString(aMFObjectProperty.AMF_GetProp(obj, ((Object)0), 0), metastring);
		int generatedAv_len = (metastring).getAv_len();
		Byte generatedAv_val = (metastring).getAv_val();
		 generatedP_vu = prop.getP_vu();
		Object generatedP_number = generatedP_vu.getP_number();
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedDataType = generatedM_read.getDataType();
		if ((generatedAv_len == generatedAv_len && !.memcmp(generatedAv_val, generatedAv_val, generatedAv_len))) {
			AMFObjectProperty prop = new AMFObjectProperty();
			ModernizedCProgram.RTMP_Log(.RTMP_LOGINFO, /* Show metadata */"Metadata:");
			obj.DumpMetaData();
			if (ModernizedCProgram.RTMP_FindFirstMatchingProperty(obj, ModernizedCProgram.av_duration, prop)) {
				this.setM_fDuration(generatedP_number);
			} 
			if (ModernizedCProgram.RTMP_FindPrefixProperty(obj, ModernizedCProgram.av_video, /* Search for audio or video tags */prop)) {
				generatedDataType |=  1;
			} 
			if (ModernizedCProgram.RTMP_FindPrefixProperty(obj, ModernizedCProgram.av_audio, prop)) {
				generatedDataType |=  4;
			} 
			ret = 1;
		} 
		obj.AMF_Reset();
		return ret;
	}
	/* allright we get some info here, so parse it and print it */
	public void HandleChangeChunkSize(Object packet) {
		int generatedM_inChunkSize = this.getM_inChunkSize();
		if (packet.getM_nBodySize() >= 4) {
			this.setM_inChunkSize(ModernizedCProgram.AMF_DecodeInt32(packet.getM_body()));
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received: chunk size change to %d", __FUNCTION__, generatedM_inChunkSize);
		} 
	}
	public void HandleAudio(Object packet) {
		(Object)r;
		(Object)packet;
	}
	public void HandleVideo(Object packet) {
		(Object)r;
		(Object)packet;
	}
	public void HandleCtrl(Object packet) {
		int nType = -1;
		int tmp;
		if (packet.getM_body() && packet.getM_nBodySize() >= 2) {
			nType = ModernizedCProgram.AMF_DecodeInt16(packet.getM_body());
		} 
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, received ctrl. type: %d, len: %d", __FUNCTION__, nType, packet.getM_nBodySize());
		int generatedM_pausing = this.getM_pausing();
		RTMP_LNK generatedLink = this.getLink();
		int generatedLFlags = generatedLink.getLFlags();
		int generatedM_mediaChannel = this.getM_mediaChannel();
		int generatedM_channelsAllocatedIn = this.getM_channelsAllocatedIn();
		Integer generatedM_channelTimestamp = this.getM_channelTimestamp();
		Object generatedM_pauseStamp = this.getM_pauseStamp();
		if (packet.getM_nBodySize() >= 6) {
			switch (nType) {
			case 2:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream Dry %d", __FUNCTION__, tmp);
					break;
			case 32:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream BufferReady %d", __FUNCTION__, tmp);
					break;
			case 1:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream EOF %d", __FUNCTION__, tmp);
					if (generatedM_pausing == 1) {
						this.setM_pausing(2);
					} 
					break;
			case 31:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream BufferEmpty %d", __FUNCTION__, tmp);
					if (!(generatedLFlags & -1024)) {
						break;
					} 
					if (!generatedM_pausing) {
						this.setM_pauseStamp(generatedM_mediaChannel < generatedM_channelsAllocatedIn ? generatedM_channelTimestamp[generatedM_mediaChannel] : 0);
						r.RTMP_SendPause(1, generatedM_pauseStamp);
						this.setM_pausing(1);
					}  else if (generatedM_pausing == 2) {
						r.RTMP_SendPause(0, generatedM_pauseStamp);
						this.setM_pausing(3);
					} 
					break;
			case 4:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream IsRecorded %d", __FUNCTION__, tmp);
					break;
			case 0:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream Begin %d", __FUNCTION__, tmp);
					break;
			case /* server ping. reply with pong. */6:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Ping %d", __FUNCTION__, tmp);
					r.RTMP_SendCtrl(-1024, tmp, 0);
					break;
			default:
					tmp = ModernizedCProgram.AMF_DecodeInt32(packet.getM_body() + 2);
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, Stream xx %d", __FUNCTION__, tmp);
					break;
			}
		} 
		Object generatedSWFSize = generatedLink.getSWFSize();
		if (nType == -1024) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, SWFVerification ping received: ", __FUNCTION__);
			if (packet.getM_nBodySize() > 2 && packet.getM_body()[2] > -1024) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s: SWFVerification Type %d request not supported! Patches welcome...", __FUNCTION__, packet.getM_body()[2]);
			}  else if (generatedSWFSize) {
				r.RTMP_SendCtrl(-1024, 0, 0);
			} else {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s: Ignoring SWFVerification request, use --swfVfy!", __FUNCTION__);
			} 
		} 
	}
	public void HandleServerBW(Object packet) {
		this.setM_nServerBW(ModernizedCProgram.AMF_DecodeInt32(packet.getM_body()));
		int generatedM_nServerBW = this.getM_nServerBW();
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s: server BW = %d", __FUNCTION__, generatedM_nServerBW);
	}
	public void HandleClientBW(Object packet) {
		this.setM_nClientBW(ModernizedCProgram.AMF_DecodeInt32(packet.getM_body()));
		if (packet.getM_nBodySize() > 4) {
			this.setM_nClientBW2(packet.getM_body()[4]);
		} else {
				this.setM_nClientBW2(-1);
		} 
		int generatedM_nClientBW = this.getM_nClientBW();
		Object generatedM_nClientBW2 = this.getM_nClientBW2();
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s: client BW = %d %d", __FUNCTION__, generatedM_nClientBW, generatedM_nClientBW2);
	}
	public int RTMP_Serve() {
		return ModernizedCProgram.SHandShake(r);
	}
	public void RTMP_Close() {
		int i;
		RTMP_LNK generatedLink = this.getLink();
		int generatedNStreams = generatedLink.getNStreams();
		Object generatedStreams = generatedLink.getStreams();
		int generatedProtocol = generatedLink.getProtocol();
		AVal generatedM_clientID = this.getM_clientID();
		Byte generatedAv_val = generatedM_clientID.getAv_val();
		RTMPSockBuf generatedM_sb = this.getM_sb();
		if (r.RTMP_IsConnected()) {
			for (int idx = 0;
			 idx < generatedNStreams; idx++) {
				if (generatedStreams[idx].getId() > 0) {
					i = generatedStreams[idx].getId();
					generatedStreams[idx].setId(0);
					if ((generatedProtocol & -1024)) {
						r.SendFCUnpublish(idx);
					} 
					r.SendDeleteStream((double)i);
				} 
			}
			if (generatedAv_val) {
				r.HTTP_Post(.RTMPT_CLOSE, "", 1);
				.free(generatedAv_val);
				generatedM_clientID.setAv_val(((Object)0));
				generatedM_clientID.setAv_len(0);
			} 
			generatedM_sb.RTMPSockBuf_Close();
		} 
		for (int idx = 0;
		 idx < generatedNStreams; idx++) {
			generatedStreams[idx].setId(-1);
		}
		this.setM_stream_id(-1);
		generatedM_sb.setSb_socket(-1);
		this.setM_nBWCheckCounter(0);
		this.setM_nBytesIn(0);
		this.setM_nBytesInSent(0);
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedFlags = generatedM_read.getFlags();
		Byte generatedBuf = generatedM_read.getBuf();
		if (generatedFlags & -1024) {
			.free(generatedBuf);
			generatedM_read.setBuf(((Object)0));
		} 
		generatedM_read.setDataType(0);
		generatedM_read.setFlags(0);
		generatedM_read.setStatus(0);
		generatedM_read.setNResumeTS(0);
		generatedM_read.setNIgnoredFrameCounter(0);
		generatedM_read.setNIgnoredFlvFrameCounter(0);
		RTMPPacket generatedM_write = this.getM_write();
		generatedM_write.setM_nBytesRead(0);
		generatedM_write.RTMPPacket_Free();
		int generatedM_channelsAllocatedIn = this.getM_channelsAllocatedIn();
		RTMPPacket generatedM_vecChannelsIn = this.getM_vecChannelsIn();
		for (i = 0; i < generatedM_channelsAllocatedIn; i++) {
			if (generatedM_vecChannelsIn[i]) {
				generatedM_vecChannelsIn[i].RTMPPacket_Free();
				.free(generatedM_vecChannelsIn[i]);
				generatedM_vecChannelsIn[i] = ((Object)0);
			} 
		}
		.free(generatedM_vecChannelsIn);
		this.setM_vecChannelsIn(((Object)0));
		Integer generatedM_channelTimestamp = this.getM_channelTimestamp();
		.free(generatedM_channelTimestamp);
		this.setM_channelTimestamp(((Object)0));
		this.setM_channelsAllocatedIn(0);
		int generatedM_channelsAllocatedOut = this.getM_channelsAllocatedOut();
		RTMPPacket generatedM_vecChannelsOut = this.getM_vecChannelsOut();
		for (i = 0; i < generatedM_channelsAllocatedOut; i++) {
			if (generatedM_vecChannelsOut[i]) {
				.free(generatedM_vecChannelsOut[i]);
				generatedM_vecChannelsOut[i] = ((Object)0);
			} 
		}
		.free(generatedM_vecChannelsOut);
		this.setM_vecChannelsOut(((Object)0));
		this.setM_channelsAllocatedOut(0);
		RTMP_METHOD generatedM_methodCalls = this.getM_methodCalls();
		int generatedM_numCalls = this.getM_numCalls();
		generatedM_methodCalls.AV_clear(generatedM_numCalls);
		this.setM_methodCalls(((Object)0));
		this.setM_numCalls(0);
		this.setM_numInvokes(0);
		this.setM_bPlaying(0);
		generatedLink.setPlayingStreams(0);
		generatedM_sb.setSb_size(0);
		this.setM_msgCounter(0);
		this.setM_resplen(0);
		this.setM_unackd(0);
		int generatedLFlags = generatedLink.getLFlags();
		AVal generatedTcUrl = generatedLink.getTcUrl();
		if (generatedLFlags & -1024) {
			.free(generatedAv_val);
			generatedTcUrl.setAv_val(((Object)0));
			generatedLFlags ^=  -1024;
		} 
		RTMP_BINDINFO generatedM_bindIP = this.getM_bindIP();
		.memset(generatedM_bindIP, 0, );
		this.setM_bCustomSend(0);
		this.setM_customSendFunc(((Object)0));
		this.setM_customSendParam(((Object)0));
		int generatedPFlags = generatedLink.getPFlags();
		if (!(generatedProtocol & -1024) || (generatedPFlags & -1024)) {
			for (int idx = 0;
			 idx < generatedNStreams; idx++) {
				.free(generatedAv_val);
				generatedStreams[idx].getPlaypath().setAv_val(((Object)0));
			}
			generatedLink.setCurStreamIdx(0);
			generatedLink.setNStreams(0);
		} 
		AVal generatedApp = generatedLink.getApp();
		if ((generatedProtocol & -1024) && (generatedPFlags & -1024) && (generatedPFlags & -1024)) {
			.free(generatedAv_val);
			generatedApp.setAv_val(((Object)0));
			.free(generatedAv_val);
			generatedTcUrl.setAv_val(((Object)0));
		} 
	}
	public int HTTP_Post( cmd, Object buf, int len) {
		byte[] hbuf = new byte[512];
		AVal generatedM_clientID = this.getM_clientID();
		Byte generatedAv_val = generatedM_clientID.getAv_val();
		int generatedM_msgCounter = this.getM_msgCounter();
		RTMP_LNK generatedLink = this.getLink();
		AVal generatedHostname = generatedLink.getHostname();
		int generatedAv_len = generatedHostname.getAv_len();
		int generatedPort = generatedLink.getPort();
		int hlen = .snprintf(hbuf, , "POST /%s%s/%d HTTP/1.1\r\nHost: %.*s:%d\r\nAccept: */*\r\nUser-Agent: Shockwave Flash\r\nConnection: Keep-Alive\r\nCache-Control: no-cache\r\nContent-type: application/x-fcs\r\nContent-length: %d\r\n\r\n", ModernizedCProgram.RTMPT_cmds[cmd], generatedAv_val ? generatedAv_val : "", generatedM_msgCounter, generatedAv_len, generatedAv_val, generatedPort, len);
		RTMPSockBuf generatedM_sb = this.getM_sb();
		generatedM_sb.RTMPSockBuf_Send(hbuf, hlen);
		hlen = generatedM_sb.RTMPSockBuf_Send(buf, len);
		generatedM_msgCounter++;
		int generatedM_unackd = this.getM_unackd();
		generatedM_unackd++;
		return hlen;
	}
	public int HTTP_read(int fill) {
		byte ptr;
		int hlen;
		RTMPSockBuf generatedM_sb = this.getM_sb();
		int generatedSb_size = generatedM_sb.getSb_size();
		if (generatedSb_size < 13) {
			if (fill) {
				;
			} 
			return -2;
		} 
		byte generatedSb_start = generatedM_sb.getSb_start();
		if (.strncmp(generatedSb_start, "HTTP/1.1 200 ", 13)) {
			return -1;
		} 
		generatedSb_start[generatedSb_size] = (byte)'\0';
		if (!.strstr(generatedSb_start, "\r\n\r\n")) {
			if (fill) {
				;
			} 
			return -2;
		} 
		ptr = generatedSb_start + ;
		while ((ptr = .strstr(ptr, "Content-"))) {
			if (!.strncasecmp(ptr + 8, "length:", 7)) {
				break;
			} 
			ptr += 8;
		}
		if (!ptr) {
			return -1;
		} 
		hlen = .atoi(ptr + 16);
		ptr = .strstr(ptr + 16, "\r\n\r\n");
		if (!ptr) {
			return -1;
		} 
		ptr += 4;
		AVal generatedM_clientID = this.getM_clientID();
		Byte generatedAv_val = generatedM_clientID.getAv_val();
		if (ptr + (generatedAv_val ? 1 : hlen) > generatedSb_start + generatedSb_size) {
			if (fill) {
				;
			} 
			return -2;
		} 
		generatedSb_size -= ptr - generatedSb_start;
		generatedM_sb.setSb_start(ptr);
		int generatedM_unackd = this.getM_unackd();
		generatedM_unackd--;
		if (!generatedAv_val) {
			generatedM_clientID.setAv_len(hlen);
			generatedM_clientID.setAv_val(.malloc(hlen + 1));
			if (!generatedAv_val) {
				return -1;
			} 
			generatedAv_val[0] = (byte)'/';
			.memcpy(generatedAv_val + 1, ptr, hlen - 1);
			generatedAv_val[hlen] = 0;
			generatedM_sb.setSb_size(0);
		} else {
				this.setM_polling(ptr++);
				this.setM_resplen(hlen - 1);
				generatedSb_start++;
				generatedSb_size--;
		} 
		return 0/* Read from the stream until we get a media packet.
		 * Returns -3 if Play.Close/Stop, -2 if fatal error, -1 if no more media
		 * packets, 0 if ignorable error, >0 if there is a media packet
		 */;
	}
	public int Read_1_Packet(Byte buf, int buflen) {
		uint32_t prevTagSize = 0;
		int rtnGetNextMediaPacket = 0;
		int ret = -1;
		RTMPPacket packet = new RTMPPacket(0);
		int recopy = 0;
		int size;
		byte ptr;
		byte pend;
		uint32_t nTimeStamp = 0;
		int len;
		rtnGetNextMediaPacket = ModernizedCProgram.RTMP_GetNextMediaPacket(r, packet);
		Byte generatedM_body = packet.getM_body();
		Object generatedM_nBodySize = packet.getM_nBodySize();
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedDataType = generatedM_read.getDataType();
		Object generatedM_packetType = packet.getM_packetType();
		Object generatedFlags = generatedM_read.getFlags();
		Object generatedM_nTimeStamp = packet.getM_nTimeStamp();
		Object generatedNMetaHeaderSize = generatedM_read.getNMetaHeaderSize();
		AMFObjectProperty aMFObjectProperty = new AMFObjectProperty();
		int generatedAv_len = (metastring).getAv_len();
		Byte generatedAv_val = (metastring).getAv_val();
		Byte generatedMetaHeader = generatedM_read.getMetaHeader();
		Object generatedNInitialFrameSize = generatedM_read.getNInitialFrameSize();
		Object generatedInitialFrameType = generatedM_read.getInitialFrameType();
		Byte generatedInitialFrame = generatedM_read.getInitialFrame();
		Object generatedNResumeTS = generatedM_read.getNResumeTS();
		if (rtnGetNextMediaPacket) {
			packet.RTMPPacket_Free();
		} 
		Byte generatedBuf = generatedM_read.getBuf();
		if (recopy) {
			len = ret > (int)(buflen) ? buflen : (int)(ret);
			.memcpy(buf, generatedBuf, len);
			generatedM_read.setBufpos(generatedBuf + len);
			generatedM_read.setBuflen(ret - len);
		} 
		return ret;
	}
	public int RTMP_Read(Byte buf, int size) {
		int nRead = 0;
		int total = 0;
		RTMP_READ generatedM_read = this.getM_read();
		Object generatedFlags = generatedM_read.getFlags();
		Byte generatedBuf = generatedM_read.getBuf();
		int generatedBuflen = generatedM_read.getBuflen();
		Object generatedTimestamp = generatedM_read.getTimestamp();
		Object generatedDataType = generatedM_read.getDataType();
		if (!(generatedFlags & /* first time thru */-1024)) {
			if (!(generatedFlags & -1024)) {
				byte mybuf = .malloc((128 * 1024));
				byte end = mybuf + (128 * 1024);
				int cnt = 0;
				generatedM_read.setBuf(mybuf);
				generatedM_read.setBuflen((128 * 1024));
				.memcpy(mybuf, ModernizedCProgram.flvHeader, );
				generatedBuf += ;
				generatedBuflen -= ;
				cnt += ;
				while (generatedTimestamp == 0) {
					nRead = r.Read_1_Packet(generatedBuf, generatedBuflen);
					if (nRead < 0) {
						.free(mybuf);
						generatedM_read.setBuf(((Object)0));
						generatedM_read.setBuflen(0);
						generatedM_read.setStatus(nRead);
						;
					} 
					if (generatedBuf < mybuf || generatedBuf > /* buffer overflow, fix buffer and give up */end) {
						mybuf = .realloc(mybuf, cnt + nRead);
						.memcpy(mybuf + cnt, generatedBuf, nRead);
						.free(generatedBuf);
						generatedM_read.setBuf(mybuf + cnt + nRead);
						break;
					} 
					cnt += nRead;
					generatedBuf += nRead;
					generatedBuflen -= nRead;
					if (generatedDataType == 5) {
						break;
					} 
				}
				mybuf[4] = generatedDataType;
				generatedM_read.setBuflen(generatedBuf - mybuf);
				generatedM_read.setBuf(mybuf);
				generatedM_read.setBufpos(mybuf);
			} 
			generatedFlags |=  -1024;
		} 
		if ((generatedFlags & -1024) && generatedBuf) {
			.free(generatedBuf);
			generatedM_read.setBuf(((Object)0));
			generatedM_read.setBufpos(((Object)0));
			generatedM_read.setBuflen(0);
		} 
		Byte generatedBufpos = generatedM_read.getBufpos();
		if (generatedBuf) {
			nRead = generatedBuflen;
			if (nRead > size) {
				nRead = size;
			} 
			.memcpy(buf, generatedBufpos, nRead);
			generatedBuflen -= nRead;
			if (!generatedBuflen) {
				.free(generatedBuf);
				generatedM_read.setBuf(((Object)0));
				generatedM_read.setBufpos(((Object)0));
			} else {
					generatedBufpos += nRead;
			} 
			buf += nRead;
			total += nRead;
			size -= nRead;
		} 
		while (size > 0 && (nRead = r.Read_1_Packet(buf, size)) >= 0) {
			if (!nRead) {
				continue;
			} 
			buf += nRead;
			total += nRead;
			size -= nRead;
			break;
		}
		if (nRead < 0) {
			generatedM_read.setStatus(nRead);
		} 
		if (size < 0) {
			total += size;
		} 
		return total;
	}
	public int RTMP_Write(Object buf, int size, int streamIdx) {
		RTMPPacket generatedM_write = this.getM_write();
		RTMPPacket pkt = generatedM_write;
		byte pend;
		byte enc;
		int s2 = size;
		int ret;
		int num;
		pkt.setM_nChannel(/* source channel */-1024);
		RTMP_LNK generatedLink = this.getLink();
		Object generatedStreams = generatedLink.getStreams();
		pkt.setM_nInfoField2(generatedStreams[streamIdx].getId());
		Object generatedM_nBytesRead = pkt.getM_nBytesRead();
		Object generatedM_nTimeStamp = pkt.getM_nTimeStamp();
		Object generatedM_packetType = pkt.getM_packetType();
		Object generatedM_nBodySize = pkt.getM_nBodySize();
		Byte generatedM_body = pkt.getM_body();
		while (s2) {
			if (!generatedM_nBytesRead) {
				if (size < 11) {
					return /* FLV pkt too small */0;
				} 
				if (buf[0] == (byte)'F' && buf[1] == (byte)'L' && buf[2] == (byte)'V') {
					buf += 13;
					s2 -= 13;
				} 
				pkt.setM_packetType(buf++);
				pkt.setM_nBodySize(ModernizedCProgram.AMF_DecodeInt24(buf));
				buf += 3;
				pkt.setM_nTimeStamp(ModernizedCProgram.AMF_DecodeInt24(buf));
				buf += 3;
				generatedM_nTimeStamp |=  buf++ << 24;
				buf += 3;
				s2 -= 11;
				if (((generatedM_packetType == -1024 || generatedM_packetType == -1024) && !generatedM_nTimeStamp) || generatedM_packetType == -1024) {
					pkt.setM_headerType(0);
					if (generatedM_packetType == -1024) {
						generatedM_nBodySize += 16;
					} 
				} else {
						pkt.setM_headerType(1);
				} 
				if (!pkt.RTMPPacket_Alloc(generatedM_nBodySize)) {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, failed to allocate packet", __FUNCTION__);
					return 0;
				} 
				enc = generatedM_body;
				pend = enc + generatedM_nBodySize;
				if (generatedM_packetType == -1024) {
					enc = ModernizedCProgram.AMF_EncodeString(enc, pend, ModernizedCProgram.av_setDataFrame);
					pkt.setM_nBytesRead(enc - generatedM_body);
				} 
			} else {
					enc = generatedM_body + generatedM_nBytesRead;
			} 
			num = generatedM_nBodySize - generatedM_nBytesRead;
			if (num > s2) {
				num = s2;
			} 
			.memcpy(enc, buf, num);
			generatedM_nBytesRead += num;
			s2 -= num;
			buf += num;
			if (generatedM_nBytesRead == generatedM_nBodySize) {
				ret = ModernizedCProgram.RTMP_SendPacket(r, pkt, 0);
				pkt.RTMPPacket_Free();
				pkt.setM_nBytesRead(0);
				if (!ret) {
					return -1;
				} 
				buf += 4;
				s2 -= 4;
				if (s2 < 0) {
					break;
				} 
			} 
		}
		return size + s2;
	}
	public int getM_inChunkSize() {
		return m_inChunkSize;
	}
	public void setM_inChunkSize(int newM_inChunkSize) {
		m_inChunkSize = newM_inChunkSize;
	}
	public int getM_outChunkSize() {
		return m_outChunkSize;
	}
	public void setM_outChunkSize(int newM_outChunkSize) {
		m_outChunkSize = newM_outChunkSize;
	}
	public int getM_nBWCheckCounter() {
		return m_nBWCheckCounter;
	}
	public void setM_nBWCheckCounter(int newM_nBWCheckCounter) {
		m_nBWCheckCounter = newM_nBWCheckCounter;
	}
	public int getM_nBytesIn() {
		return m_nBytesIn;
	}
	public void setM_nBytesIn(int newM_nBytesIn) {
		m_nBytesIn = newM_nBytesIn;
	}
	public int getM_nBytesInSent() {
		return m_nBytesInSent;
	}
	public void setM_nBytesInSent(int newM_nBytesInSent) {
		m_nBytesInSent = newM_nBytesInSent;
	}
	public int getM_nBufferMS() {
		return m_nBufferMS;
	}
	public void setM_nBufferMS(int newM_nBufferMS) {
		m_nBufferMS = newM_nBufferMS;
	}
	public int getM_stream_id() {
		return m_stream_id;
	}
	public void setM_stream_id(int newM_stream_id) {
		m_stream_id = newM_stream_id;
	}
	public int getM_mediaChannel() {
		return m_mediaChannel;
	}
	public void setM_mediaChannel(int newM_mediaChannel) {
		m_mediaChannel = newM_mediaChannel;
	}
	public Object getM_mediaStamp() {
		return m_mediaStamp;
	}
	public void setM_mediaStamp(Object newM_mediaStamp) {
		m_mediaStamp = newM_mediaStamp;
	}
	public Object getM_pauseStamp() {
		return m_pauseStamp;
	}
	public void setM_pauseStamp(Object newM_pauseStamp) {
		m_pauseStamp = newM_pauseStamp;
	}
	public int getM_pausing() {
		return m_pausing;
	}
	public void setM_pausing(int newM_pausing) {
		m_pausing = newM_pausing;
	}
	public int getM_nServerBW() {
		return m_nServerBW;
	}
	public void setM_nServerBW(int newM_nServerBW) {
		m_nServerBW = newM_nServerBW;
	}
	public int getM_nClientBW() {
		return m_nClientBW;
	}
	public void setM_nClientBW(int newM_nClientBW) {
		m_nClientBW = newM_nClientBW;
	}
	public Object getM_nClientBW2() {
		return m_nClientBW2;
	}
	public void setM_nClientBW2(Object newM_nClientBW2) {
		m_nClientBW2 = newM_nClientBW2;
	}
	public Object getM_bPlaying() {
		return m_bPlaying;
	}
	public void setM_bPlaying(Object newM_bPlaying) {
		m_bPlaying = newM_bPlaying;
	}
	public Object getM_bSendEncoding() {
		return m_bSendEncoding;
	}
	public void setM_bSendEncoding(Object newM_bSendEncoding) {
		m_bSendEncoding = newM_bSendEncoding;
	}
	public Object getM_bSendCounter() {
		return m_bSendCounter;
	}
	public void setM_bSendCounter(Object newM_bSendCounter) {
		m_bSendCounter = newM_bSendCounter;
	}
	public Object getM_bUseNagle() {
		return m_bUseNagle;
	}
	public void setM_bUseNagle(Object newM_bUseNagle) {
		m_bUseNagle = newM_bUseNagle;
	}
	public Object getM_bCustomSend() {
		return m_bCustomSend;
	}
	public void setM_bCustomSend(Object newM_bCustomSend) {
		m_bCustomSend = newM_bCustomSend;
	}
	public Object getM_customSendParam() {
		return m_customSendParam;
	}
	public void setM_customSendParam(Object newM_customSendParam) {
		m_customSendParam = newM_customSendParam;
	}
	public Object getM_customSendFunc() {
		return m_customSendFunc;
	}
	public void setM_customSendFunc(Object newM_customSendFunc) {
		m_customSendFunc = newM_customSendFunc;
	}
	public RTMP_BINDINFO getM_bindIP() {
		return m_bindIP;
	}
	public void setM_bindIP(RTMP_BINDINFO newM_bindIP) {
		m_bindIP = newM_bindIP;
	}
	public Object getM_bSendChunkSizeInfo() {
		return m_bSendChunkSizeInfo;
	}
	public void setM_bSendChunkSizeInfo(Object newM_bSendChunkSizeInfo) {
		m_bSendChunkSizeInfo = newM_bSendChunkSizeInfo;
	}
	public int getM_numInvokes() {
		return m_numInvokes;
	}
	public void setM_numInvokes(int newM_numInvokes) {
		m_numInvokes = newM_numInvokes;
	}
	public int getM_numCalls() {
		return m_numCalls;
	}
	public void setM_numCalls(int newM_numCalls) {
		m_numCalls = newM_numCalls;
	}
	public RTMP_METHOD getM_methodCalls() {
		return m_methodCalls;
	}
	public void setM_methodCalls(RTMP_METHOD newM_methodCalls) {
		m_methodCalls = newM_methodCalls;
	}
	public int getM_channelsAllocatedIn() {
		return m_channelsAllocatedIn;
	}
	public void setM_channelsAllocatedIn(int newM_channelsAllocatedIn) {
		m_channelsAllocatedIn = newM_channelsAllocatedIn;
	}
	public int getM_channelsAllocatedOut() {
		return m_channelsAllocatedOut;
	}
	public void setM_channelsAllocatedOut(int newM_channelsAllocatedOut) {
		m_channelsAllocatedOut = newM_channelsAllocatedOut;
	}
	public RTMPPacket getM_vecChannelsIn() {
		return m_vecChannelsIn;
	}
	public void setM_vecChannelsIn(RTMPPacket newM_vecChannelsIn) {
		m_vecChannelsIn = newM_vecChannelsIn;
	}
	public RTMPPacket getM_vecChannelsOut() {
		return m_vecChannelsOut;
	}
	public void setM_vecChannelsOut(RTMPPacket newM_vecChannelsOut) {
		m_vecChannelsOut = newM_vecChannelsOut;
	}
	public Integer getM_channelTimestamp() {
		return m_channelTimestamp;
	}
	public void setM_channelTimestamp(Integer newM_channelTimestamp) {
		m_channelTimestamp = newM_channelTimestamp;
	}
	public double getM_fAudioCodecs() {
		return m_fAudioCodecs;
	}
	public void setM_fAudioCodecs(double newM_fAudioCodecs) {
		m_fAudioCodecs = newM_fAudioCodecs;
	}
	public double getM_fVideoCodecs() {
		return m_fVideoCodecs;
	}
	public void setM_fVideoCodecs(double newM_fVideoCodecs) {
		m_fVideoCodecs = newM_fVideoCodecs;
	}
	public double getM_fEncoding() {
		return m_fEncoding;
	}
	public void setM_fEncoding(double newM_fEncoding) {
		m_fEncoding = newM_fEncoding;
	}
	public double getM_fDuration() {
		return m_fDuration;
	}
	public void setM_fDuration(double newM_fDuration) {
		m_fDuration = newM_fDuration;
	}
	public int getM_msgCounter() {
		return m_msgCounter;
	}
	public void setM_msgCounter(int newM_msgCounter) {
		m_msgCounter = newM_msgCounter;
	}
	public int getM_polling() {
		return m_polling;
	}
	public void setM_polling(int newM_polling) {
		m_polling = newM_polling;
	}
	public int getM_resplen() {
		return m_resplen;
	}
	public void setM_resplen(int newM_resplen) {
		m_resplen = newM_resplen;
	}
	public int getM_unackd() {
		return m_unackd;
	}
	public void setM_unackd(int newM_unackd) {
		m_unackd = newM_unackd;
	}
	public AVal getM_clientID() {
		return m_clientID;
	}
	public void setM_clientID(AVal newM_clientID) {
		m_clientID = newM_clientID;
	}
	public RTMP_READ getM_read() {
		return m_read;
	}
	public void setM_read(RTMP_READ newM_read) {
		m_read = newM_read;
	}
	public RTMPPacket getM_write() {
		return m_write;
	}
	public void setM_write(RTMPPacket newM_write) {
		m_write = newM_write;
	}
	public RTMPSockBuf getM_sb() {
		return m_sb;
	}
	public void setM_sb(RTMPSockBuf newM_sb) {
		m_sb = newM_sb;
	}
	public RTMP_LNK getLink() {
		return Link;
	}
	public void setLink(RTMP_LNK newLink) {
		Link = newLink;
	}
	public int getConnect_time_ms() {
		return connect_time_ms;
	}
	public void setConnect_time_ms(int newConnect_time_ms) {
		connect_time_ms = newConnect_time_ms;
	}
	public int getLast_error_code() {
		return last_error_code;
	}
	public void setLast_error_code(int newLast_error_code) {
		last_error_code = newLast_error_code;
	}
}
