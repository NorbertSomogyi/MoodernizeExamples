package application;

public class RTMP_Stream {
	private int id;
	private AVal playpath;
	
	public RTMP_Stream(int id, AVal playpath) {
		setId(id);
		setPlaypath(playpath);
	}
	public RTMP_Stream() {
	}
	
	public void fatal_sock_shutdown() {
		Object generatedRtmp = this.getRtmp();
		.closesocket(generatedRtmp.getM_sb().getSb_socket());
		generatedRtmp.getM_sb().setSb_socket(-1);
		this.setWrite_buf_len(0);
		Object generatedBuffer_space_available_event = this.getBuffer_space_available_event();
		generatedBuffer_space_available_event.os_event_signal();
	}
	public Object socket_event(Object can_write, Object last_send_time) {
		WSANETWORKEVENTS net_events = new WSANETWORKEVENTS();
		 success = new ();
		Object generatedRtmp = this.getRtmp();
		success = !.WSAEnumNetworkEvents(generatedRtmp.getM_sb().getSb_socket(), ((Object)0), net_events);
		if (!success) {
			ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Aborting due to WSAEnumNetworkEvents failure, %d", .WSAGetLastError());
			stream.fatal_sock_shutdown();
			return false;
		} 
		Object generatedLNetworkEvents = net_events.getLNetworkEvents();
		if (generatedLNetworkEvents & (1 << 1)) {
			can_write = true;
		} 
		Object generatedWrite_buf_len = this.getWrite_buf_len();
		Object generatedWrite_buf_size = this.getWrite_buf_size();
		Object generatedStop_event = this.getStop_event();
		Object generatedIErrorCode = net_events.getIErrorCode();
		if (generatedLNetworkEvents & (1 << 5)) {
			if (last_send_time) {
				uint32_t diff = (ModernizedCProgram.os_gettime_ns() / 1000000) - last_send_time;
				ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Received FD_CLOSE, %u ms since last send (buffer: %d / %d)", diff, generatedWrite_buf_len, generatedWrite_buf_size);
			} 
			if (generatedStop_event.os_event_try() != EAGAIN) {
				ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Aborting due to FD_CLOSE during shutdown, %d bytes lost, error %d", generatedWrite_buf_len, generatedIErrorCode[5]);
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Aborting due to FD_CLOSE, error %d", generatedIErrorCode[5]);
			} 
			stream.fatal_sock_shutdown();
			return false;
		} 
		if (generatedLNetworkEvents & (1 << 0)) {
			byte[] discard = new byte[16384];
			int err_code;
			 fatal = false;
			for (; ; ) {
				int ret = .recv(generatedRtmp.getM_sb().getSb_socket(), discard, , 0);
				if (ret == -1) {
					err_code = .WSAGetLastError();
					if (err_code == -1024) {
						break;
					} 
					fatal = true;
				}  else if (ret == 0) {
					err_code = 0;
					fatal = true;
				} 
				if (fatal) {
					ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Socket error, recv() returned %d, GetLastError() %d", ret, err_code);
					generatedRtmp.setLast_error_code(err_code);
					stream.fatal_sock_shutdown();
					return false;
				} 
			}
		} 
		return true;
	}
	public void ideal_send_backlog_event(Object can_write) {
		ULONG ideal_send_backlog = new ULONG();
		int ret;
		Object generatedRtmp = this.getRtmp();
		ret = .idealsendbacklogquery(generatedRtmp.getM_sb().getSb_socket(), ideal_send_backlog);
		Object generatedWrite_buf_len = this.getWrite_buf_len();
		Object generatedWrite_buf_size = this.getWrite_buf_size();
		if (ret == 0) {
			int cur_tcp_bufsize;
			int size = ;
			ret = .getsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_tcp_bufsize, size);
			if (ret == 0) {
				if (cur_tcp_bufsize < (int)ideal_send_backlog) {
					int bufsize = (int)ideal_send_backlog;
					.setsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)bufsize, );
					ModernizedCProgram.blog(LOG_INFO, "socket_thread_windows: Increasing send buffer to ISB %d (buffer: %d / %d)", ideal_send_backlog, generatedWrite_buf_len, generatedWrite_buf_size);
				} 
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Got send_backlog_event but getsockopt() returned %d", .WSAGetLastError());
			} 
		} else {
				ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Got send_backlog_event but WSAIoctl() returned %d", .WSAGetLastError());
		} 
	}
	public void socket_thread_windows_internal() {
		 can_write = false;
		int delay_time;
		size_t latency_packet_size = new size_t();
		uint64_t last_send_time = 0;
		HANDLE send_backlog_event = new HANDLE();
		OVERLAPPED send_backlog_overlapped = new OVERLAPPED();
		.SetThreadPriority(.GetCurrentThread(), 1);
		Object generatedRtmp = this.getRtmp();
		Object generatedSocket_available_event = this.getSocket_available_event();
		.WSAEventSelect(generatedRtmp.getM_sb().getSb_socket(), generatedSocket_available_event, (1 << 0) | (1 << 1) | (1 << 5));
		send_backlog_event = .CreateEventA(((Object)0), true, false, ((Object)0));
		Object generatedLow_latency_mode = this.getLow_latency_mode();
		Object generatedWrite_buf_size = this.getWrite_buf_size();
		if (generatedLow_latency_mode) {
			delay_time = 1000 / 20;
			latency_packet_size = generatedWrite_buf_size / (20 - 2);
		} else {
				latency_packet_size = generatedWrite_buf_size;
				delay_time = 0;
		} 
		Object generatedDisable_send_window_optimization = this.getDisable_send_window_optimization();
		if (!generatedDisable_send_window_optimization) {
			.memset(send_backlog_overlapped, 0, );
			send_backlog_overlapped.setHEvent(send_backlog_event);
			.idealsendbacklognotify(generatedRtmp.getM_sb().getSb_socket(), send_backlog_overlapped, ((Object)0));
		} else {
				ModernizedCProgram.blog(LOG_INFO, "socket_thread_windows: Send window optimization disabled by user.");
		} 
		HANDLE[] objs = new HANDLE();
		objs[0] = generatedSocket_available_event;
		Object generatedBuffer_has_data_event = this.getBuffer_has_data_event();
		objs[1] = generatedBuffer_has_data_event;
		objs[2] = send_backlog_event;
		Object generatedSend_thread_signaled_exit = this.getSend_thread_signaled_exit();
		Object generatedWrite_buf_mutex = this.getWrite_buf_mutex();
		Object generatedWrite_buf_len = this.getWrite_buf_len();
		if (generatedRtmp.getM_sb().getSb_socket() != (SOCKET)(~0)) {
			.WSAEventSelect(generatedRtmp.getM_sb().getSb_socket(), generatedSocket_available_event, 0);
		} 
		ModernizedCProgram.blog(LOG_INFO, "socket_thread_windows: Normal exit");
	}
	public Object discard_recv_data(Object size) {
		Object generatedRtmp = this.getRtmp();
		 rtmp = generatedRtmp;
		uint8_t[] buf = new uint8_t();
		int ret;
		Object generatedOutput = this.getOutput();
		do {
			size_t bytes = size > 512 ? 512 : size;
			size -= bytes;
			ret = .recv(rtmp.getM_sb().getSb_socket(), buf, (int)bytes, 0);
			if (ret <= 0) {
				int error = .WSAGetLastError();
				if (ret < 0) {
					ModernizedCProgram.blog(LOG_ERROR, "[rtmp stream: '%s'] recv error: %d (%d bytes)", ModernizedCProgram.obs_output_get_name(generatedOutput), error, (int)size);
				} 
				return false;
			} 
		} while (size > 0);
		return true;
	}
	public void set_output_error() {
		byte msg = ((Object)0);
		Object generatedRtmp = this.getRtmp();
		switch (generatedRtmp.getLast_error_code()) {
		case -1024:
				msg = ModernizedCProgram.obs_module_text("AddressNotAvailable");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("PermissionDenied");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("ConnectionAborted");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("ConnectionReset");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("HostNotFound");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("NoData");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("ConnectionTimedOut");
				break;
		}
		// non platform-specific errorsif (!msg) {
			switch (generatedRtmp.getLast_error_code()) {
			case --1024:
					msg = ModernizedCProgram.obs_module_text("SSLCertVerifyFailed");
					break;
			}
		} 
		Object generatedOutput = this.getOutput();
		generatedOutput.obs_output_set_last_error(msg);
	}
	public Object send_meta_data(Object idx, Object next) {
		uint8_t meta_data = new uint8_t();
		size_t meta_data_size = new size_t();
		 success = true;
		Object generatedOutput = this.getOutput();
		next = generatedOutput.flv_meta_data(meta_data, meta_data_size, false, idx);
		Object generatedRtmp = this.getRtmp();
		if (next) {
			success = generatedRtmp.RTMP_Write((byte)meta_data, (int)meta_data_size, (int)idx) >= 0;
			ModernizedCProgram.bfree(meta_data);
		} 
		return success;
	}
	public Object send_audio_header(Object idx, Object next) {
		Object generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t aencoder = obs_encoder.obs_output_get_audio_encoder(context, idx);
		uint8_t header = new uint8_t();
		encoder_packet packet = new encoder_packet(, );
		if (!aencoder) {
			next = false;
			return true;
		} 
		Object generatedSize = packet.getSize();
		ModernizedCProgram.obs_encoder_get_extra_data(aencoder, header, generatedSize);
		packet.setData(ModernizedCProgram.bmemdup(header, generatedSize));
		return ModernizedCProgram.send_packet(stream, packet, true, idx) >= 0;
	}
	public void adjust_sndbuf_size(int new_size) {
		int cur_sendbuf_size = new_size;
		int int_size = ;
		Object generatedRtmp = this.getRtmp();
		.getsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_sendbuf_size, int_size);
		if (cur_sendbuf_size < new_size) {
			cur_sendbuf_size = new_size;
			.setsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_sendbuf_size, int_size);
		} 
	}
	public void win32_log_interface_type() {
		Object generatedRtmp = this.getRtmp();
		 rtmp = generatedRtmp;
		MIB_IPFORWARDROW route = new MIB_IPFORWARDROW();
		uint32_t dest_addr = new uint32_t();
		uint32_t source_addr = new uint32_t();
		byte[] hostname = new byte[256];
		HOSTENT h = new HOSTENT();
		if (rtmp.getLink().getHostname().getAv_len() >=  - 1) {
			return ;
		} 
		.strncpy(hostname, rtmp.getLink().getHostname().getAv_val(), );
		hostname[rtmp.getLink().getHostname().getAv_len()] = 0;
		h = .gethostbyname(hostname);
		if (!h) {
			return ;
		} 
		Object generatedH_addr_list = h.getH_addr_list();
		dest_addr = (uint32_t)generatedH_addr_list[0];
		if (rtmp.getM_bindIP().getAddrLen() == 0) {
			source_addr = 0;
		}  else if (rtmp.getM_bindIP().getAddr().getSs_family() == 2) {
			source_addr = ((sockaddr_in)rtmp.getM_bindIP().getAddr()).getSin_addr().getS_un().getS_addr();
		} else {
				return ;
		} 
		Object generatedDwForwardIfIndex = route.getDwForwardIfIndex();
		Object generatedDwSpeed = row.getDwSpeed();
		Object generatedDwType = row.getDwType();
		Object generatedDstr = other.getDstr();
		Object generatedOutput = this.getOutput();
		Object generatedBDescr = row.getBDescr();
		if (!.GetBestRoute(dest_addr, source_addr, route)) {
			MIB_IFROW row = new MIB_IFROW();
			.memset(row, 0, );
			row.setDwIndex(generatedDwForwardIfIndex);
			if (!.GetIfEntry(row)) {
				uint32_t speed = generatedDwSpeed / 1000000;
				byte type;
				dstr other = new dstr(0);
				if (generatedDwType == 6) {
					type = "ethernet";
				}  else if (generatedDwType == 71) {
					type = "802.11";
				} else {
						other.dstr_printf("type %lu", generatedDwType);
						type = generatedDstr;
				} 
				ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Interface: %s (%s, %lu mbps)", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedBDescr, type, speed);
				other.dstr_free();
			} 
		} 
	}
	public Object dbr_bitrate_lowered() {
		Object generatedDbr_prev_bitrate = this.getDbr_prev_bitrate();
		long prev_bitrate = generatedDbr_prev_bitrate;
		long est_bitrate = 0;
		long new_bitrate;
		Object generatedDbr_est_bitrate = this.getDbr_est_bitrate();
		Object generatedDbr_cur_bitrate = this.getDbr_cur_bitrate();
		Object generatedDbr_frames = this.getDbr_frames();
		if (generatedDbr_est_bitrate && generatedDbr_est_bitrate < generatedDbr_cur_bitrate) {
			this.setDbr_data_size(0);
			generatedDbr_frames.circlebuf_pop_front(((Object)0), generatedDbr_frames.getCirclebuf());
			est_bitrate = generatedDbr_est_bitrate / 100 * 100;
			if (est_bitrate < 50) {
				est_bitrate = 50;
			} 
		} 
		Object generatedOutput = this.getOutput();
		if (est_bitrate) {
			new_bitrate = est_bitrate;
		}  else if (prev_bitrate) {
			new_bitrate = prev_bitrate;
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] going back to prev bitrate", ModernizedCProgram.obs_output_get_name(generatedOutput));
		} else {
				return false;
		} 
		if (new_bitrate == generatedDbr_cur_bitrate) {
			return false;
		} 
		this.setDbr_prev_bitrate(0);
		this.setDbr_cur_bitrate(new_bitrate);
		this.setDbr_inc_timeout(ModernizedCProgram.os_gettime_ns() + (-1024 * -1024));
		ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] bitrate decreased to: %ld", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDbr_cur_bitrate);
		return true;
	}
	public void dbr_set_bitrate() {
		Object generatedOutput = this.getOutput();
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_encoder_get_settings(vencoder);
		Object generatedDbr_cur_bitrate = this.getDbr_cur_bitrate();
		settings.obs_data_set_int("bitrate", generatedDbr_cur_bitrate);
		ModernizedCProgram.obs_encoder_update(vencoder, settings);
		settings.obs_data_release();
	}
	public void dbr_inc_bitrate() {
		Object generatedDbr_cur_bitrate = this.getDbr_cur_bitrate();
		this.setDbr_prev_bitrate(generatedDbr_cur_bitrate);
		Object generatedDbr_inc_bitrate = this.getDbr_inc_bitrate();
		generatedDbr_cur_bitrate += generatedDbr_inc_bitrate;
		Object generatedDbr_orig_bitrate = this.getDbr_orig_bitrate();
		Object generatedOutput = this.getOutput();
		if (generatedDbr_cur_bitrate >= generatedDbr_orig_bitrate) {
			this.setDbr_cur_bitrate(generatedDbr_orig_bitrate);
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] bitrate increased to: %ld, done", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDbr_cur_bitrate);
		}  else if (generatedDbr_cur_bitrate < generatedDbr_orig_bitrate) {
			this.setDbr_inc_timeout(ModernizedCProgram.os_gettime_ns() + (-1024 * -1024));
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] bitrate increased to: %ld, waiting", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDbr_cur_bitrate);
		} 
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public AVal getPlaypath() {
		return playpath;
	}
	public void setPlaypath(AVal newPlaypath) {
		playpath = newPlaypath;
	}
}
