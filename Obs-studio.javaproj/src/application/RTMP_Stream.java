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
	
	public void free_packets() {
		size_t num_packets = new size_t();
		Object generatedPackets_mutex = this.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		num_packets = stream.num_buffered_packets();
		Object generatedOutput = this.getOutput();
		if (num_packets) {
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Freeing %d remaining packets", ModernizedCProgram.obs_output_get_name(generatedOutput), (int)num_packets);
		} 
		Object generatedPackets = this.getPackets();
		while (generatedPackets.getCirclebuf()) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, /*Error: sizeof expression not supported yet*/);
			packet.obs_encoder_packet_release();
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
		Object generatedInterleaved_packets = output.getInterleaved_packets();
		for ( i = 0;
		 i < generatedInterleaved_packets.getNum(); i++) {
			generatedInterleaved_packets.getArray() + i.obs_encoder_packet_release();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedInterleaved_packets);
		size_t num_packets = new size_t();
		Object generatedPackets_mutex = this.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		num_packets = stream.num_buffered_packets();
		obs_output generatedOutput = this.getOutput();
		if (num_packets) {
			ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Freeing %d remaining packets", ModernizedCProgram.obs_output_get_name(generatedOutput), (int)num_packets);
		} 
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		while (generatedCirclebuf) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, /*Error: sizeof expression not supported yet*/);
			packet.obs_encoder_packet_release();
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
	}
	public Object stopping() {
		Object generatedStop_event = this.getStop_event();
		return generatedStop_event.os_event_try() != EAGAIN;
		Object generatedStopping = this.getStopping();
		return ModernizedCProgram.os_atomic_load_bool(generatedStopping);
		Object generatedStopping = this.getStopping();
		return ModernizedCProgram.os_atomic_load_bool(generatedStopping);
		return output.getStopping_event().os_event_try() == EAGAIN;
		Object generatedStop_event = this.getStop_event();
		return generatedStop_event.os_event_try() != EAGAIN;
		Object generatedStopping = output.getStopping();
		return ModernizedCProgram.os_atomic_load_bool(generatedStopping);
	}
	public Object connecting() {
		Object generatedConnecting = this.getConnecting();
		return ModernizedCProgram.os_atomic_load_bool(generatedConnecting);
		Object generatedConnecting = this.getConnecting();
		return ModernizedCProgram.os_atomic_load_bool(generatedConnecting);
	}
	public Object active() {
		Object generatedActive = this.getActive();
		return ModernizedCProgram.os_atomic_load_bool(generatedActive);
		Object generatedActive = this.getActive();
		return ModernizedCProgram.os_atomic_load_bool(generatedActive);
		Object generatedActive = this.getActive();
		return ModernizedCProgram.os_atomic_load_bool(generatedActive);
		return ModernizedCProgram.os_atomic_load_bool(output.getActive());
		Object generatedActive = this.getActive();
		return ModernizedCProgram.os_atomic_load_bool(generatedActive);
	}
	public Object disconnected() {
		Object generatedDisconnected = this.getDisconnected();
		return ModernizedCProgram.os_atomic_load_bool(generatedDisconnected);
		Object generatedDisconnected = this.getDisconnected();
		return ModernizedCProgram.os_atomic_load_bool(generatedDisconnected);
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
			ret = /*Error: Function owner not recognized*/recv(rtmp.getM_sb().getSb_socket(), buf, (int)bytes, 0);
			if (ret <= 0) {
				int error = /*Error: Function owner not recognized*/WSAGetLastError();
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
				msg = ModernizedCProgram.obs_module_text("NoData");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("HostNotFound");
				break;
		case -1024:
				msg = ModernizedCProgram.obs_module_text("ConnectionTimedOut");
				break;
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
		encoder_packet packet = new encoder_packet(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!aencoder) {
			next = false;
			return true;
		} 
		Object generatedSize = packet.getSize();
		ModernizedCProgram.obs_encoder_get_extra_data(aencoder, header, generatedSize);
		packet.setData(ModernizedCProgram.bmemdup(header, generatedSize));
		return ModernizedCProgram.send_packet(stream, packet, true, idx) >= 0;
	}
	public Object send_video_header() {
		Object generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		uint8_t header = new uint8_t();
		size_t size = new size_t();
		encoder_packet packet = new encoder_packet(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, header, size);
		Object generatedData = packet.getData();
		packet.setSize(ModernizedCProgram.obs_parse_avc_header(generatedData, header, size));
		return ModernizedCProgram.send_packet(stream, packet, true, 0) >= 0;
		obs_output generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		uint8_t header = new uint8_t();
		size_t size = new size_t();
		encoder_packet packet = new encoder_packet(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, header, size);
		Object generatedData = packet.getData();
		packet.setSize(ModernizedCProgram.obs_parse_avc_header(generatedData, header, size));
		return ModernizedCProgram.send_packet(stream, packet, true) >= 0;
	}
	public Object send_headers() {
		this.setSent_headers(true);
		size_t i = 0;
		 next = true;
		if (!stream.send_audio_header(i++, next)) {
			return false;
		} 
		if (!stream.send_video_header()) {
			return false;
		} 
		while (next) {
			if (!stream.send_audio_header(i++, next)) {
				return false;
			} 
		}
		return true;
		obs_encoder_t aencoder = new obs_encoder_t();
		 idx = 0;
		if (!stream.send_video_headers()) {
			return false;
		} 
		obs_output generatedOutput = this.getOutput();
		obs_encoder obs_encoder = new obs_encoder();
		do {
			aencoder = obs_encoder.obs_output_get_audio_encoder(generatedOutput, idx);
			if (aencoder) {
				if (!ModernizedCProgram.send_audio_headers(stream, aencoder, idx)) {
					return false;
				} 
				idx++;
			} 
		} while (aencoder);
		return true;
		this.setSent_headers(true);
		if (!stream.send_video_header(dts_usec)) {
			return false;
		} 
		return true;
	}
	public Object reset_semaphore() {
		Object generatedSend_sem = this.getSend_sem();
		generatedSend_sem.os_sem_destroy();
		return generatedSend_sem.os_sem_init(0) == 0;
		Object generatedSend_sem = this.getSend_sem();
		generatedSend_sem.os_sem_destroy();
		return generatedSend_sem.os_sem_init(0) == 0;
	}
	public void adjust_sndbuf_size(int new_size) {
		int cur_sendbuf_size = new_size;
		int int_size = /*Error: Unsupported expression*/;
		Object generatedRtmp = this.getRtmp();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_sendbuf_size, int_size);
		if (cur_sendbuf_size < new_size) {
			cur_sendbuf_size = new_size;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_sendbuf_size, int_size);
		} 
	}
	public int init_send() {
		int ret;
		size_t idx = 0;
		 next = true;
		stream.adjust_sndbuf_size(65535);
		stream.reset_semaphore();
		Object generatedSend_thread = this.getSend_thread();
		ret = ModernizedCProgram.pthread_create(generatedSend_thread, ((Object)0), send_thread, stream);
		Object generatedRtmp = this.getRtmp();
		Object generatedOutput = this.getOutput();
		if (ret != 0) {
			generatedRtmp.RTMP_Close();
			ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to create send thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -4;
		} 
		Object generatedNew_socket_loop = this.getNew_socket_loop();
		Object generatedSend_thread_signaled_exit = this.getSend_thread_signaled_exit();
		Object generatedLow_latency_mode = this.getLow_latency_mode();
		Object generatedWrite_buf = this.getWrite_buf();
		obs_encoder obs_encoder = new obs_encoder();
		obs_data obs_data = new obs_data();
		obs_encoder obs_encoder = new obs_encoder();
		Object generatedSocket_thread = this.getSocket_thread();
		if (generatedNew_socket_loop) {
			int one = 1;
			if (/*Error: Function owner not recognized*/ioctlsocket(generatedRtmp.getM_sb().getSb_socket(), (-1024 | (((long)/*Error: Unsupported expression*/ & -1024) << 16) | (((byte)'f') << 8) | (true)), ModernizedCProgram.one)) {
				generatedRtmp.setLast_error_code(/*Error: Function owner not recognized*/WSAGetLastError());
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to set non-blocking socket", ModernizedCProgram.obs_output_get_name(generatedOutput));
				return -4;
			} 
			generatedSend_thread_signaled_exit.os_event_reset();
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] New socket loop enabled by user", ModernizedCProgram.obs_output_get_name(generatedOutput));
			if (generatedLow_latency_mode) {
				ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Low latency mode enabled by user", ModernizedCProgram.obs_output_get_name(generatedOutput));
			} 
			if (generatedWrite_buf) {
				ModernizedCProgram.bfree(generatedWrite_buf);
			} 
			int total_bitrate = 0;
			obs_output_t context = generatedOutput;
			obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
			if (vencoder) {
				obs_data_t params = obs_data.obs_encoder_get_settings(vencoder);
				if (params) {
					int bitrate = params.obs_data_get_int("bitrate");
					if (!bitrate) {
						ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Video encoder didn't return a valid bitrate, new network code may function poorly. Low latency mode disabled.", ModernizedCProgram.obs_output_get_name(generatedOutput));
						this.setLow_latency_mode(false);
						bitrate = 10000;
					} 
					total_bitrate += bitrate;
					params.obs_data_release();
				} 
			} 
			obs_encoder_t aencoder = obs_encoder.obs_output_get_audio_encoder(context, 0);
			if (aencoder) {
				obs_data_t params = obs_data.obs_encoder_get_settings(aencoder);
				if (params) {
					int bitrate = params.obs_data_get_int("bitrate");
					if (!bitrate) {
						bitrate = 160;
					} 
					total_bitrate += bitrate;
					params.obs_data_release();
				} 
			} 
			int ideal_buffer_size = total_bitrate * 128;
			if (ideal_buffer_size < 131072) {
				ideal_buffer_size = 131072;
			} 
			this.setWrite_buf_size(ideal_buffer_size);
			this.setWrite_buf(ModernizedCProgram.bmalloc(ideal_buffer_size));
			ret = ModernizedCProgram.pthread_create(generatedSocket_thread, ((Object)0), ModernizedCProgram.socket_thread_windows, stream);
			if (ret != 0) {
				generatedRtmp.RTMP_Close();
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to create socket thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
				return -4;
			} 
			this.setSocket_thread_active(true);
			generatedRtmp.setM_bCustomSend(true);
			generatedRtmp.setM_customSendFunc(socket_queue_data);
			generatedRtmp.setM_customSendParam(stream);
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
		while (next) {
			if (!stream.send_meta_data(idx++, next)) {
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Disconnected while attempting to connect to server.", ModernizedCProgram.obs_output_get_name(generatedOutput));
				stream.set_output_error();
				return -5;
			} 
		}
		generatedOutput.obs_output_begin_data_capture(0);
		return 0;
		int ret;
		stream.reset_semaphore();
		Object generatedSend_thread = this.getSend_thread();
		ret = ModernizedCProgram.pthread_create(generatedSend_thread, ((Object)0), send_thread, stream);
		obs_output generatedOutput = this.getOutput();
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Failed to create send thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -4;
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
		generatedOutput.obs_output_begin_data_capture(0);
		return 0;
	}
	public void win32_log_interface_type() {
		Object generatedRtmp = this.getRtmp();
		 rtmp = generatedRtmp;
		MIB_IPFORWARDROW route = new MIB_IPFORWARDROW();
		uint32_t dest_addr = new uint32_t();
		uint32_t source_addr = new uint32_t();
		byte[] hostname = new byte[256];
		HOSTENT h = new HOSTENT();
		if (rtmp.getLink().getHostname().getAv_len() >= /*Error: sizeof expression not supported yet*/ - 1) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(hostname, rtmp.getLink().getHostname().getAv_val(), /*Error: sizeof expression not supported yet*/);
		hostname[rtmp.getLink().getHostname().getAv_len()] = 0;
		h = /*Error: Function owner not recognized*/gethostbyname(hostname);
		if (!h) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedH_addr_list = h.getH_addr_list();
		dest_addr = (uint32_t)generatedH_addr_list[0];
		if (rtmp.getM_bindIP().getAddrLen() == 0) {
			source_addr = 0;
		}  else if (rtmp.getM_bindIP().getAddr().getSs_family() == 2) {
			source_addr = ((sockaddr_in)rtmp.getM_bindIP().getAddr()).getSin_addr().getS_un().getS_addr();
		} else {
				return /*Error: Unsupported expression*/;
		} 
		Object generatedDwForwardIfIndex = route.getDwForwardIfIndex();
		Object generatedDwSpeed = row.getDwSpeed();
		Object generatedDwType = row.getDwType();
		Object generatedDstr = other.getDstr();
		Object generatedOutput = this.getOutput();
		Object generatedBDescr = row.getBDescr();
		if (!/*Error: Function owner not recognized*/GetBestRoute(dest_addr, source_addr, route)) {
			MIB_IFROW row = new MIB_IFROW();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(row, 0, /*Error: sizeof expression not supported yet*/);
			row.setDwIndex(generatedDwForwardIfIndex);
			if (!/*Error: Function owner not recognized*/GetIfEntry(row)) {
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
	public int try_connect() {
		Object generatedPath = this.getPath();
		Object generatedOutput = this.getOutput();
		if (ModernizedCProgram.dstr_is_empty(generatedPath)) {
			ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] URL is empty", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -1;
		} 
		ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Connecting to RTMP URL %s...", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedPath.getDstr());
		Object generatedRtmp = this.getRtmp();
		generatedRtmp.RTMP_Init();
		if (!generatedRtmp.RTMP_SetupURL(generatedPath.getDstr())) {
			return -1;
		} 
		generatedRtmp.RTMP_EnableWrite();
		Object generatedEncoder_name = this.getEncoder_name();
		generatedEncoder_name.dstr_copy("FMLE/3.0 (compatible; FMSc/1.0)");
		Object generatedUsername = this.getUsername();
		generatedUsername.set_rtmp_dstr(generatedRtmp.getLink().getPubUser());
		Object generatedPassword = this.getPassword();
		generatedPassword.set_rtmp_dstr(generatedRtmp.getLink().getPubPasswd());
		generatedEncoder_name.set_rtmp_dstr(generatedRtmp.getLink().getFlashVer());
		generatedRtmp.getLink().setSwfUrl(generatedRtmp.getLink().getTcUrl());
		Object generatedBind_ip = this.getBind_ip();
		if (ModernizedCProgram.dstr_is_empty(generatedBind_ip) || ModernizedCProgram.dstr_cmp(generatedBind_ip, "default") == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedRtmp.getM_bindIP(), 0, /*Error: sizeof expression not supported yet*/);
		} else {
				 success = generatedRtmp.getM_bindIP().getAddr().netif_str_to_addr(generatedRtmp.getM_bindIP().getAddrLen(), generatedBind_ip.getDstr());
				if (success) {
					int len = generatedRtmp.getM_bindIP().getAddrLen();
					 ipv6 = len == /*Error: Unsupported expression*/;
					ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Binding to IPv%d", ModernizedCProgram.obs_output_get_name(generatedOutput), ipv6 ? 6 : 4);
				} 
		} 
		Object generatedKey = this.getKey();
		generatedRtmp.RTMP_AddStream(generatedKey.getDstr());
		obs_encoder obs_encoder = new obs_encoder();
		for (size_t idx = 1;
		 /*Error: Unsupported expression*/; idx++) {
			obs_encoder_t encoder = obs_encoder.obs_output_get_audio_encoder(generatedOutput, idx);
			byte encoder_name;
			if (!encoder) {
				break;
			} 
			encoder_name = ModernizedCProgram.obs_encoder_get_name(encoder);
			generatedRtmp.RTMP_AddStream(encoder_name);
		}
		generatedRtmp.setM_outChunkSize(4096);
		generatedRtmp.setM_bSendChunkSizeInfo(true);
		generatedRtmp.setM_bUseNagle(true);
		stream.win32_log_interface_type();
		if (!ModernizedCProgram.RTMP_Connect(generatedRtmp, ((Object)0))) {
			stream.set_output_error();
			return -2;
		} 
		if (!generatedRtmp.RTMP_ConnectStream(0)) {
			return -3;
		} 
		ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Connection to %s successful", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedPath.getDstr());
		return stream.init_send();
		 status_code = new ();
		dstr generatedPath = this.getPath();
		obs_output generatedOutput = this.getOutput();
		if (ModernizedCProgram.dstr_is_empty(generatedPath)) {
			ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] URL is empty", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -1;
		} 
		Object generatedDstr = generatedPath.getDstr();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Connecting to FTL Ingest URL %s...", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
		this.setWidth((int)ModernizedCProgram.obs_output_get_width(generatedOutput));
		this.setHeight((int)ModernizedCProgram.obs_output_get_height(generatedOutput));
		Object generatedFtl_handle = this.getFtl_handle();
		status_code = /*Error: Function owner not recognized*/ftl_ingest_connect(generatedFtl_handle);
		if (status_code != FTL_SUCCESS) {
			if (status_code == FTL_BAD_OR_INVALID_STREAM_KEY) {
				ModernizedCProgram.blog(LOG_ERROR, "Invalid Key (%s)", /*Error: Function owner not recognized*/ftl_status_code_to_string(status_code));
				return -3;
			} else {
					ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Ingest connect failed with: %s (%d)", ModernizedCProgram.obs_output_get_name(generatedOutput), /*Error: Function owner not recognized*/ftl_status_code_to_string(status_code), status_code);
					return ModernizedCProgram._ftl_error_to_obs_error(status_code);
			} 
		} 
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Connection to %s successful", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
		// Always get the peak bitrate when we are starting.// Always get the peak bitrate when we are starting.stream.set_peak_bitrate();
		Object generatedStatus_thread = this.getStatus_thread();
		ModernizedCProgram.pthread_create(generatedStatus_thread, ((Object)0), ModernizedCProgram.status_thread, stream);
		return stream.init_send();
		obs_output generatedOutput = output.getOutput();
		 video = ModernizedCProgram.obs_output_video(generatedOutput);
		video_output_info voi = ModernizedCProgram.video_output_get_info(video);
		ffmpeg_cfg config = new ffmpeg_cfg();
		obs_data_t settings = new obs_data_t();
		 success = new ();
		int ret;
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		settings.obs_data_set_default_int("gop_size", 120);
		config.setUrl(settings.obs_data_get_string("url"));
		config.setFormat_name(settings.get_string_or_null("format_name"));
		config.setFormat_mime_type(settings.get_string_or_null("format_mime_type"));
		config.setMuxer_settings(settings.obs_data_get_string("muxer_settings"));
		config.setVideo_bitrate((int)settings.obs_data_get_int("video_bitrate"));
		config.setAudio_bitrate((int)settings.obs_data_get_int("audio_bitrate"));
		config.setGop_size((int)settings.obs_data_get_int("gop_size"));
		config.setVideo_encoder(settings.get_string_or_null("video_encoder"));
		config.setVideo_encoder_id((int)settings.obs_data_get_int("video_encoder_id"));
		config.setAudio_encoder(settings.get_string_or_null("audio_encoder"));
		config.setAudio_encoder_id((int)settings.obs_data_get_int("audio_encoder_id"));
		config.setVideo_settings(settings.obs_data_get_string("video_settings"));
		config.setAudio_settings(settings.obs_data_get_string("audio_settings"));
		config.setScale_width((int)settings.obs_data_get_int("scale_width"));
		config.setScale_height((int)settings.obs_data_get_int("scale_height"));
		config.setWidth((int)ModernizedCProgram.obs_output_get_width(generatedOutput));
		config.setHeight((int)ModernizedCProgram.obs_output_get_height(generatedOutput));
		config.setFormat(ModernizedCProgram.obs_to_ffmpeg_video_format(ModernizedCProgram.video_output_get_format(video)));
		config.setAudio_tracks((int)ModernizedCProgram.obs_output_get_mixers(generatedOutput));
		int generatedAudio_tracks = config.getAudio_tracks();
		config.setAudio_mix_count(ModernizedCProgram.get_audio_mix_count(generatedAudio_tracks));
		if (ModernizedCProgram.format_is_yuv(voi.getVideo_output_info())) {
			config.setColor_range(voi.getVideo_output_info() == VIDEO_RANGE_FULL ? AVCOL_RANGE_JPEG : AVCOL_RANGE_MPEG);
			config.setColor_space(voi.getVideo_output_info() == VIDEO_CS_709 ? AVCOL_SPC_BT709 : AVCOL_SPC_BT470BG);
		} else {
				config.setColor_range(AVCOL_RANGE_UNSPECIFIED);
				config.setColor_space(AVCOL_SPC_RGB);
		} 
		AVPixelFormat generatedFormat = config.getFormat();
		if (generatedFormat == AV_PIX_FMT_NONE) {
			ModernizedCProgram.blog(LOG_DEBUG, "invalid pixel format used for FFmpeg output");
			return false;
		} 
		int generatedScale_width = config.getScale_width();
		int generatedWidth = config.getWidth();
		if (!generatedScale_width) {
			config.setScale_width(generatedWidth);
		} 
		int generatedScale_height = config.getScale_height();
		int generatedHeight = config.getHeight();
		if (!generatedScale_height) {
			config.setScale_height(generatedHeight);
		} 
		ffmpeg_data generatedFf_data = output.getFf_data();
		success = ModernizedCProgram.ffmpeg_data_init(generatedFf_data, config);
		settings.obs_data_release();
		Byte generatedLast_error = generatedFf_data.getLast_error();
		if (!success) {
			if (generatedLast_error) {
				generatedOutput.obs_output_set_last_error(generatedLast_error);
			} 
			generatedFf_data.ffmpeg_data_free();
			return false;
		} 
		audio_convert_info aci = new audio_convert_info(/*Error: Invalid initializer*/);
		output.setActive(true);
		if (!ModernizedCProgram.obs_output_can_begin_data_capture(generatedOutput, 0)) {
			return false;
		} 
		Object generatedWrite_thread = output.getWrite_thread();
		ret = ModernizedCProgram.pthread_create(generatedWrite_thread, NULL, write_thread, output);
		if (ret != 0) {
			generatedFf_data.ffmpeg_log_error(LOG_WARNING, "ffmpeg_output_start: failed to create write thread.");
			ModernizedCProgram.ffmpeg_output_full_stop(output);
			return false;
		} 
		generatedOutput.obs_output_set_video_conversion(NULL);
		generatedOutput.obs_output_set_audio_conversion(aci);
		generatedOutput.obs_output_begin_data_capture(0);
		output.setWrite_thread_active(true);
		return true;
	}
	public Object init_connect() {
		obs_service_t service = new obs_service_t();
		obs_data_t settings = new obs_data_t();
		byte bind_ip;
		int64_t drop_p = new int64_t();
		int64_t drop_b = new int64_t();
		uint32_t caps = new uint32_t();
		Object generatedSend_thread = this.getSend_thread();
		if (stream.stopping()) {
			ModernizedCProgram.pthread_join(generatedSend_thread, ((Object)0));
		} 
		stream.free_packets();
		Object generatedOutput = this.getOutput();
		obs_service obs_service = new obs_service();
		service = obs_service.obs_output_get_service(generatedOutput);
		if (!service) {
			return false;
		} 
		Object generatedDisconnected = this.getDisconnected();
		ModernizedCProgram.os_atomic_set_bool(generatedDisconnected, false);
		Object generatedEncode_error = this.getEncode_error();
		ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, false);
		this.setTotal_bytes_sent(0);
		this.setDropped_frames(0);
		this.setMin_priority(0);
		this.setGot_first_video(false);
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		Object generatedPath = this.getPath();
		generatedPath.dstr_copy(ModernizedCProgram.obs_service_get_url(service));
		Object generatedKey = this.getKey();
		generatedKey.dstr_copy(ModernizedCProgram.obs_service_get_key(service));
		Object generatedUsername = this.getUsername();
		generatedUsername.dstr_copy(ModernizedCProgram.obs_service_get_username(service));
		Object generatedPassword = this.getPassword();
		generatedPassword.dstr_copy(ModernizedCProgram.obs_service_get_password(service));
		generatedPath.dstr_depad();
		generatedKey.dstr_depad();
		drop_b = (int64_t)settings.obs_data_get_int("drop_threshold_ms");
		drop_p = (int64_t)settings.obs_data_get_int("pframe_drop_threshold_ms");
		this.setMax_shutdown_time_sec((int)settings.obs_data_get_int("max_shutdown_time_sec"));
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t venc = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t aenc = obs_encoder.obs_output_get_audio_encoder(generatedOutput, 0);
		obs_data obs_data = new obs_data();
		obs_data_t vsettings = obs_data.obs_encoder_get_settings(venc);
		obs_data_t asettings = obs_data.obs_encoder_get_settings(aenc);
		Object generatedDbr_frames = this.getDbr_frames();
		generatedDbr_frames.circlebuf_free();
		this.setAudio_bitrate((long)asettings.obs_data_get_int("bitrate"));
		this.setDbr_data_size(0);
		this.setDbr_orig_bitrate((long)vsettings.obs_data_get_int("bitrate"));
		Object generatedDbr_orig_bitrate = this.getDbr_orig_bitrate();
		this.setDbr_cur_bitrate(generatedDbr_orig_bitrate);
		this.setDbr_est_bitrate(0);
		this.setDbr_inc_bitrate(generatedDbr_orig_bitrate / 10);
		this.setDbr_inc_timeout(0);
		this.setDbr_enabled(settings.obs_data_get_bool("dyn_bitrate"));
		caps = ModernizedCProgram.obs_encoder_get_caps(venc);
		if ((caps & (1 << 2)) == 0) {
			this.setDbr_enabled(false);
		} 
		if (ModernizedCProgram.obs_output_get_delay(generatedOutput) != 0) {
			this.setDbr_enabled(false);
		} 
		Object generatedDbr_enabled = this.getDbr_enabled();
		if (generatedDbr_enabled) {
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Dynamic bitrate enabled.  Dropped frames begone!", ModernizedCProgram.obs_output_get_name(generatedOutput));
		} 
		vsettings.obs_data_release();
		asettings.obs_data_release();
		if (drop_p < (drop_b + 200)) {
			drop_p = drop_b + 200;
		} 
		this.setDrop_threshold_usec(1000 * drop_b);
		this.setPframe_drop_threshold_usec(1000 * drop_p);
		bind_ip = settings.obs_data_get_string("bind_ip");
		Object generatedBind_ip = this.getBind_ip();
		generatedBind_ip.dstr_copy(bind_ip);
		this.setNew_socket_loop(settings.obs_data_get_bool("new_socket_loop_enabled"));
		this.setLow_latency_mode(settings.obs_data_get_bool("low_latency_mode_enabled"));
		settings.obs_data_release();
		return true;
		obs_service_t service = new obs_service_t();
		obs_data_t settings = new obs_data_t();
		byte bind_ip;
		byte key;
		 status_code = new ();
		obs_output generatedOutput = this.getOutput();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] init_connect", ModernizedCProgram.obs_output_get_name(generatedOutput));
		Object generatedSend_thread = this.getSend_thread();
		if (stream.stopping()) {
			ModernizedCProgram.pthread_join(generatedSend_thread, ((Object)0));
		} 
		stream.free_packets();
		obs_service obs_service = new obs_service();
		service = obs_service.obs_output_get_service(generatedOutput);
		if (!service) {
			return -4;
		} 
		Object generatedDisconnected = this.getDisconnected();
		ModernizedCProgram.os_atomic_set_bool(generatedDisconnected, false);
		Object generatedEncode_error = this.getEncode_error();
		ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, false);
		this.setTotal_bytes_sent(0);
		this.setDropped_frames(0);
		this.setMin_priority(0);
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t video_encoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_data obs_data = new obs_data();
		obs_data_t video_settings = obs_data.obs_encoder_get_settings(video_encoder);
		dstr generatedPath = this.getPath();
		generatedPath.dstr_copy(ModernizedCProgram.obs_service_get_url(service));
		key = ModernizedCProgram.obs_service_get_key(service);
		int target_bitrate = (int)video_settings.obs_data_get_int("bitrate");
		int peak_bitrate = (int)((double)target_bitrate * 1.1);
		//minimum overshoot tolerance of 10%if (peak_bitrate < target_bitrate) {
			peak_bitrate = target_bitrate;
		} 
		Object generatedParams = this.getParams();
		generatedParams.setStream_key((byte)key);
		generatedParams.setVideo_codec(FTL_VIDEO_H264);
		generatedParams.setAudio_codec(FTL_AUDIO_OPUS);
		Object generatedDstr = generatedPath.getDstr();
		generatedParams.setIngest_hostname(generatedDstr);
		generatedParams.setVendor_name("OBS Studio");
		generatedParams.setVendor_version("unknown");
		int generatedPeak_kbps = this.getPeak_kbps();
		generatedParams.setPeak_kbps(generatedPeak_kbps < 0 ? 0 : generatedPeak_kbps);
		//not required when using ftl_ingest_send_media_dts//not required when using ftl_ingest_send_media_dtsgeneratedParams.setFps_num(0);
		generatedParams.setFps_den(0);
		Object generatedFtl_handle = this.getFtl_handle();
		status_code = /*Error: Function owner not recognized*/ftl_ingest_create(generatedFtl_handle, generatedParams);
		if (status_code != FTL_SUCCESS) {
			if (status_code == FTL_BAD_OR_INVALID_STREAM_KEY) {
				ModernizedCProgram.blog(LOG_ERROR, "Invalid Key (%s)", /*Error: Function owner not recognized*/ftl_status_code_to_string(status_code));
				return -3;
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "Failed to create ingest handle (%s)", /*Error: Function owner not recognized*/ftl_status_code_to_string(status_code));
					return -4;
			} 
		} 
		dstr generatedUsername = this.getUsername();
		generatedUsername.dstr_copy(ModernizedCProgram.obs_service_get_username(service));
		dstr generatedPassword = this.getPassword();
		generatedPassword.dstr_copy(ModernizedCProgram.obs_service_get_password(service));
		generatedPath.dstr_depad();
		this.setDrop_threshold_usec((int64_t)settings.obs_data_get_int("drop_threshold_ms") * 1000);
		this.setMax_shutdown_time_sec((int)settings.obs_data_get_int("max_shutdown_time_sec"));
		bind_ip = settings.obs_data_get_string("bind_ip");
		dstr generatedBind_ip = this.getBind_ip();
		generatedBind_ip.dstr_copy(bind_ip);
		settings.obs_data_release();
		video_settings.obs_data_release();
		return 0;
	}
	public Object num_buffered_packets() {
		Object generatedPackets = this.getPackets();
		return generatedPackets.getCirclebuf() / /*Error: Unsupported expression*/;
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		return generatedCirclebuf / /*Error: Unsupported expression*/;
	}
	public void drop_frames(Object name, int highest_priority, Object pframes) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(pframes);
		circlebuf new_buf = new circlebuf(0);
		int num_frames_dropped = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(name);
		new_buf.circlebuf_reserve(/*Error: Unsupported expression*/ * 8);
		Object generatedPackets = this.getPackets();
		obs_encoder_type generatedType = packet.getType();
		int generatedDrop_priority = packet.getDrop_priority();
		while (generatedPackets.getCirclebuf()) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, /*Error: sizeof expression not supported yet*/);
			if (generatedType == /* do not drop audio data or video keyframes */obs_encoder_type.OBS_ENCODER_AUDIO || generatedDrop_priority >= highest_priority) {
				new_buf.circlebuf_push_back(packet, /*Error: sizeof expression not supported yet*/);
			} else {
					num_frames_dropped++;
					packet.obs_encoder_packet_release();
			} 
		}
		generatedPackets.circlebuf_free();
		this.setPackets(new_buf);
		Object generatedMin_priority = this.getMin_priority();
		if (generatedMin_priority < highest_priority) {
			this.setMin_priority(highest_priority);
		} 
		if (!num_frames_dropped) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedDropped_frames = this.getDropped_frames();
		generatedDropped_frames += num_frames_dropped;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(pframes);
		circlebuf new_buf = new circlebuf(0);
		int num_frames_dropped = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(name);
		new_buf.circlebuf_reserve(/*Error: Unsupported expression*/ * 8);
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		obs_encoder_type generatedType = packet.getType();
		int generatedDrop_priority = packet.getDrop_priority();
		while (generatedCirclebuf) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, /*Error: sizeof expression not supported yet*/);
			if (generatedType == /* do not drop audio data or video keyframes */obs_encoder_type.OBS_ENCODER_AUDIO || generatedDrop_priority >= highest_priority) {
				new_buf.circlebuf_push_back(packet, /*Error: sizeof expression not supported yet*/);
			} else {
					num_frames_dropped++;
					packet.obs_encoder_packet_release();
			} 
		}
		generatedPackets.circlebuf_free();
		this.setPackets(new_buf);
		int generatedMin_priority = this.getMin_priority();
		if (generatedMin_priority < highest_priority) {
			this.setMin_priority(highest_priority);
		} 
		if (!num_frames_dropped) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedDropped_frames = this.getDropped_frames();
		generatedDropped_frames += num_frames_dropped;
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
	public void check_to_drop_frames(Object pframes) {
		encoder_packet first = new encoder_packet();
		int64_t buffer_duration_usec = new int64_t();
		size_t num_packets = stream.num_buffered_packets();
		byte name = pframes ? "p-frames" : "b-frames";
		int priority = pframes ? .OBS_NAL_PRIORITY_HIGHEST : .OBS_NAL_PRIORITY_HIGH;
		Object generatedPframe_drop_threshold_usec = this.getPframe_drop_threshold_usec();
		Object generatedDrop_threshold_usec = this.getDrop_threshold_usec();
		int64_t drop_threshold = pframes ? generatedPframe_drop_threshold_usec : generatedDrop_threshold_usec;
		Object generatedDbr_enabled = this.getDbr_enabled();
		Object generatedDbr_inc_timeout = this.getDbr_inc_timeout();
		if (!pframes && generatedDbr_enabled) {
			if (generatedDbr_inc_timeout) {
				uint64_t t = ModernizedCProgram.os_gettime_ns();
				if (t >= generatedDbr_inc_timeout) {
					this.setDbr_inc_timeout(0);
					stream.dbr_inc_bitrate();
					stream.dbr_set_bitrate();
				} 
			} 
		} 
		if (num_packets < 5) {
			if (!pframes) {
				this.setCongestion(0.0);
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.find_first_video_packet(stream, first)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLast_dts_usec = this.getLast_dts_usec();
		Object generatedDts_usec = first.getDts_usec();
		buffer_duration_usec = generatedLast_dts_usec - generatedDts_usec;
		if (!pframes) {
			this.setCongestion((double)buffer_duration_usec / (double)drop_threshold/* alternatively, drop only pframes:
				 * (!pframes && stream->dbr_enabled)
				 * but let's test without dropping frames
				 * at all first */);
		} 
		Object generatedDbr_mutex = this.getDbr_mutex();
		Object generatedOutput = this.getOutput();
		if (generatedDbr_enabled) {
			 bitrate_changed = false;
			if (pframes) {
				return /*Error: Unsupported expression*/;
			} 
			if ((uint64_t)buffer_duration_usec >= (-1024 * -1024)) {
				ModernizedCProgram.pthread_mutex_lock(generatedDbr_mutex);
				bitrate_changed = stream.dbr_bitrate_lowered();
				ModernizedCProgram.pthread_mutex_unlock(generatedDbr_mutex);
			} 
			if (bitrate_changed) {
				ModernizedCProgram.blog(LOG_DEBUG, "[rtmp stream: '%s'] buffer_duration_msec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec / 1000);
				stream.dbr_set_bitrate();
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (buffer_duration_usec > drop_threshold) {
			ModernizedCProgram.blog(LOG_DEBUG, "[rtmp stream: '%s'] buffer_duration_usec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec);
			stream.drop_frames(name, priority, pframes);
		} 
		encoder_packet first = new encoder_packet();
		int64_t buffer_duration_usec = new int64_t();
		size_t num_packets = stream.num_buffered_packets();
		byte name = pframes ? "p-frames" : "b-frames";
		int priority = pframes ? .OBS_NAL_PRIORITY_HIGHEST : .OBS_NAL_PRIORITY_HIGH;
		Object generatedPframe_drop_threshold_usec = this.getPframe_drop_threshold_usec();
		Object generatedDrop_threshold_usec = this.getDrop_threshold_usec();
		int64_t drop_threshold = pframes ? generatedPframe_drop_threshold_usec : generatedDrop_threshold_usec;
		if (num_packets < 5) {
			if (!pframes) {
				this.setCongestion(0.0);
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.find_first_video_packet(stream, first)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLast_dts_usec = this.getLast_dts_usec();
		Object generatedDts_usec = first.getDts_usec();
		buffer_duration_usec = generatedLast_dts_usec - generatedDts_usec;
		if (!pframes) {
			this.setCongestion((double)buffer_duration_usec / (double)drop_threshold);
		} 
		obs_output generatedOutput = this.getOutput();
		if (buffer_duration_usec > drop_threshold) {
			ModernizedCProgram.blog(LOG_DEBUG, "[ftl stream: '%s'] buffer_duration_usec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec);
			stream.drop_frames(name, priority, pframes);
		} 
	}
	public void fatal_sock_shutdown() {
		Object generatedRtmp = this.getRtmp();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/closesocket(generatedRtmp.getM_sb().getSb_socket());
		generatedRtmp.getM_sb().setSb_socket(-1);
		this.setWrite_buf_len(0);
		Object generatedBuffer_space_available_event = this.getBuffer_space_available_event();
		generatedBuffer_space_available_event.os_event_signal();
	}
	public Object socket_event(Object can_write, Object last_send_time) {
		WSANETWORKEVENTS net_events = new WSANETWORKEVENTS();
		 success = new ();
		Object generatedRtmp = this.getRtmp();
		success = !/*Error: Function owner not recognized*/WSAEnumNetworkEvents(generatedRtmp.getM_sb().getSb_socket(), ((Object)0), net_events);
		if (!success) {
			ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Aborting due to WSAEnumNetworkEvents failure, %d", /*Error: Function owner not recognized*/WSAGetLastError());
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
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				int ret = /*Error: Function owner not recognized*/recv(generatedRtmp.getM_sb().getSb_socket(), discard, /*Error: sizeof expression not supported yet*/, 0);
				if (ret == -1) {
					err_code = /*Error: Function owner not recognized*/WSAGetLastError();
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
		ret = /*Error: Function owner not recognized*/idealsendbacklogquery(generatedRtmp.getM_sb().getSb_socket(), ideal_send_backlog);
		Object generatedWrite_buf_len = this.getWrite_buf_len();
		Object generatedWrite_buf_size = this.getWrite_buf_size();
		if (ret == 0) {
			int cur_tcp_bufsize;
			int size = /*Error: sizeof expression not supported yet*/;
			ret = /*Error: Function owner not recognized*/getsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)cur_tcp_bufsize, size);
			if (ret == 0) {
				if (cur_tcp_bufsize < (int)ideal_send_backlog) {
					int bufsize = (int)ideal_send_backlog;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setsockopt(generatedRtmp.getM_sb().getSb_socket(), -1024, -1024, (byte)bufsize, /*Error: sizeof expression not supported yet*/);
					ModernizedCProgram.blog(LOG_INFO, "socket_thread_windows: Increasing send buffer to ISB %d (buffer: %d / %d)", ideal_send_backlog, generatedWrite_buf_len, generatedWrite_buf_size);
				} 
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Got send_backlog_event but getsockopt() returned %d", /*Error: Function owner not recognized*/WSAGetLastError());
			} 
		} else {
				ModernizedCProgram.blog(LOG_ERROR, "socket_thread_windows: Got send_backlog_event but WSAIoctl() returned %d", /*Error: Function owner not recognized*/WSAGetLastError());
		} 
	}
	public void socket_thread_windows_internal() {
		 can_write = false;
		int delay_time;
		size_t latency_packet_size = new size_t();
		uint64_t last_send_time = 0;
		HANDLE send_backlog_event = new HANDLE();
		OVERLAPPED send_backlog_overlapped = new OVERLAPPED();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetThreadPriority(/*Error: Function owner not recognized*/GetCurrentThread(), 1);
		Object generatedRtmp = this.getRtmp();
		Object generatedSocket_available_event = this.getSocket_available_event();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WSAEventSelect(generatedRtmp.getM_sb().getSb_socket(), generatedSocket_available_event, (1 << 0) | (1 << 1) | (1 << 5));
		send_backlog_event = /*Error: Function owner not recognized*/CreateEventA(((Object)0), true, false, ((Object)0));
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
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(send_backlog_overlapped, 0, /*Error: sizeof expression not supported yet*/);
			send_backlog_overlapped.setHEvent(send_backlog_event);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/idealsendbacklognotify(generatedRtmp.getM_sb().getSb_socket(), send_backlog_overlapped, ((Object)0));
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
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WSAEventSelect(generatedRtmp.getM_sb().getSb_socket(), generatedSocket_available_event, 0);
		} 
		ModernizedCProgram.blog(LOG_INFO, "socket_thread_windows: Normal exit");
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
