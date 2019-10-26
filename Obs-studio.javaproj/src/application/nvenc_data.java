package application;

/* Main Implementation Structure                                             */
public class nvenc_data {
	private obs_encoder encoder;
	private Object session;
	private Object params;
	private Object config;
	private Object buf_count;
	private Object output_delay;
	private Object buffers_queued;
	private Object next_bitstream;
	private Object cur_bitstream;
	private Object encode_started;
	private Object first_packet;
	private Object can_change_bitrate;
	private Object bframes;
	private Object ;
	private Object ;
	private Object ;
	private circlebuf dts_list;
	private Object packet_pts;
	private Object packet_keyframe;
	private Object device;
	private Object context;
	private Object cx;
	private Object cy;
	private Object header;
	private Object header_size;
	private Object sei;
	private Object sei_size;
	
	public nvenc_data(obs_encoder encoder, Object session, Object params, Object config, Object buf_count, Object output_delay, Object buffers_queued, Object next_bitstream, Object cur_bitstream, Object encode_started, Object first_packet, Object can_change_bitrate, Object bframes, Object,  Object,  Object,  circlebuf dts_list, Object packet_pts, Object packet_keyframe, Object device, Object context, Object cx, Object cy, Object header, Object header_size, Object sei, Object sei_size) {
		setEncoder(encoder);
		setSession(session);
		setParams(params);
		setConfig(config);
		setBuf_count(buf_count);
		setOutput_delay(output_delay);
		setBuffers_queued(buffers_queued);
		setNext_bitstream(next_bitstream);
		setCur_bitstream(cur_bitstream);
		setEncode_started(encode_started);
		setFirst_packet(first_packet);
		setCan_change_bitrate(can_change_bitrate);
		setBframes(bframes);
		set();
		set();
		set();
		setDts_list(dts_list);
		setPacket_pts(packet_pts);
		setPacket_keyframe(packet_keyframe);
		setDevice(device);
		setContext(context);
		setCx(cx);
		setCy(cy);
		setHeader(header);
		setHeader_size(header_size);
		setSei(sei);
		setSei_size(sei_size);
	}
	public nvenc_data() {
	}
	
	public Object nv_failed(Object err, Object func, Object call) {
		if (err == NV_ENC_SUCCESS) {
			return false;
		} 
		obs_encoder generatedEncoder = this.getEncoder();
		ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc: '%s'] %s: %s failed: %d (%s)", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), func, call, (int)err, ModernizedCProgram.nv_error_name(err));
		return true;
		if (err == NV_ENC_SUCCESS) {
			return false;
		} 
		ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc] %s: %s failed: %d (%s)", func, call, (int)err, ModernizedCProgram.nv_error_name(err));
		return true;
	}
	public int nv_get_cap(Object cap) {
		Object generatedSession = this.getSession();
		if (!generatedSession) {
			return 0;
		} 
		 param = new (NV_ENC_CAPS_PARAM_VER);
		int v;
		param.setCapsToQuery(cap);
		.UNRECOGNIZEDFUNCTIONNAME(generatedSession, ModernizedCProgram.NV_ENC_CODEC_H264_GUID, param, v);
		return v;
	}
	public Object get_lib(Object lib) {
		HMODULE mod = .GetModuleHandleA(lib);
		if (mod) {
			return mod;
		} 
		mod = .LoadLibraryA(lib);
		obs_encoder generatedEncoder = this.getEncoder();
		if (!mod) {
			ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc: '%s'] Failed to load %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), lib);
		} 
		return mod;
	}
	public Object init_session() {
		 params = new (NV_ENC_OPEN_ENCODE_SESSION_EX_PARAMS_VER);
		Object generatedDevice = this.getDevice();
		params.setDevice(generatedDevice);
		params.setDeviceType(NV_ENC_DEVICE_TYPE_DIRECTX);
		params.setApiVersion(NVENCAPI_VERSION);
		Object generatedSession = this.getSession();
		if (enc.nv_failed(.UNRECOGNIZEDFUNCTIONNAME(params, generatedSession), __FUNCTION__, "nv.nvEncOpenEncodeSessionEx(&params, &enc->session)")) {
			return false;
		} 
		return true;
	}
	public Object init_bitstreams() {
		Object generatedBitstreams = this.getBitstreams();
		Object generatedBuf_count = this.getBuf_count();
		.da_reserve(generatedBitstreams, generatedBuf_count);
		for (size_t i = 0;
		 i < generatedBuf_count; i++) {
			nv_bitstream bitstream = new nv_bitstream();
			if (!ModernizedCProgram.nv_bitstream_init(enc, bitstream)) {
				return false;
			} 
			.da_push_back(generatedBitstreams, bitstream);
		}
		return true;
	}
	public Object init_textures() {
		Object generatedBitstreams = this.getBitstreams();
		Object generatedBuf_count = this.getBuf_count();
		.da_reserve(generatedBitstreams, generatedBuf_count);
		Object generatedTextures = this.getTextures();
		for (size_t i = 0;
		 i < generatedBuf_count; i++) {
			nv_texture texture = new nv_texture();
			if (!ModernizedCProgram.nv_texture_init(enc, texture)) {
				return false;
			} 
			.da_push_back(generatedTextures, texture);
		}
		return true;
		Object generatedCompatibility = capture.getCompatibility();
		Object generatedWidth = capture.getWidth();
		Object generatedHeight = capture.getHeight();
		gs_texture gs_texture = new gs_texture();
		gs_texture gs_texture = new gs_texture();
		if (generatedCompatibility) {
			capture.setTexture(gs_texture.gs_texture_create(generatedWidth, generatedHeight, GS_BGRA, 1, ((Object)0), GS_DYNAMIC));
		} else {
				capture.setTexture(gs_texture.gs_texture_create_gdi(generatedWidth, generatedHeight));
		} 
		Object generatedTexture = capture.getTexture();
		if (!generatedTexture) {
			ModernizedCProgram.blog(LOG_WARNING, "[dc_capture_init] Failed to create textures");
			return ;
		} 
		capture.setValid(true);
	}
	public Object get_tex_from_handle(Object handle, Object km_out) {
		Object generatedDevice = this.getDevice();
		 device = generatedDevice;
		 km = new ();
		 input_tex = new ();
		HRESULT hr = new HRESULT();
		Object generatedInput_textures = this.getInput_textures();
		Object generatedHandle = ht.getHandle();
		Object generatedKm = ht.getKm();
		Object generatedTex = ht.getTex();
		for (size_t i = 0;
		 i < generatedInput_textures.getNum(); i++) {
			handle_tex ht = generatedInput_textures.getArray()[i];
			if (generatedHandle == handle) {
				km_out = generatedKm;
				return generatedTex;
			} 
		}
		hr = .UNRECOGNIZEDFUNCTIONNAME(device, (HANDLE)()handle, IID_ID3D11Texture2D, input_tex);
		obs_encoder generatedEncoder = this.getEncoder();
		if (((HRESULT)(hr) < 0)) {
			ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc: '%s'] %s: %s: 0x%08lX", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), __FUNCTION__, "OpenSharedResource failed", ()hr);
			;
			return ((Object)0);
		} 
		hr = .UNRECOGNIZEDFUNCTIONNAME(input_tex, IID_IDXGIKeyedMutex, km);
		if (((HRESULT)(hr) < 0)) {
			ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc: '%s'] %s: %s: 0x%08lX", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), __FUNCTION__, "QueryInterface(IDXGIKeyedMutex) failed", ()hr);
			;
			.UNRECOGNIZEDFUNCTIONNAME(input_tex);
			return ((Object)0);
		} 
		.UNRECOGNIZEDFUNCTIONNAME(input_tex, DXGI_RESOURCE_PRIORITY_MAXIMUM);
		km_out = km;
		handle_tex new_ht = new handle_tex(handle, input_tex, km);
		.da_push_back(generatedInput_textures, new_ht);
		return input_tex;
	}
	public Object get_encoded_packet(Object finalize) {
		Object generatedSession = this.getSession();
		Object s = generatedSession;
		Object generatedPacket_data = this.getPacket_data();
		.da_resize(generatedPacket_data, 0);
		Object generatedBuffers_queued = this.getBuffers_queued();
		if (!generatedBuffers_queued) {
			return true;
		} 
		Object generatedOutput_delay = this.getOutput_delay();
		if (!finalize && generatedBuffers_queued < generatedOutput_delay) {
			return true;
		} 
		size_t count = finalize ? generatedBuffers_queued : 1;
		Object generatedCur_bitstream = this.getCur_bitstream();
		Object generatedBitstreams = this.getBitstreams();
		Object generatedTextures = this.getTextures();
		Object generatedPtr = bs.getPtr();
		Object generatedFirst_packet = this.getFirst_packet();
		Object generatedHeader = this.getHeader();
		Object generatedHeader_size = this.getHeader_size();
		Object generatedSei = this.getSei();
		Object generatedSei_size = this.getSei_size();
		Object generatedMapped_res = nvtex.getMapped_res();
		Object generatedBuf_count = this.getBuf_count();
		for (size_t i = 0;
		 i < count; i++) {
			size_t cur_bs_idx = generatedCur_bitstream;
			nv_bitstream bs = generatedBitstreams.getArray()[cur_bs_idx];
			nv_texture nvtex = generatedTextures.getArray()[cur_bs_idx];
			 lock = new (/* ---------------- */NV_ENC_LOCK_BITSTREAM_VER);
			ModernizedCProgram.lock.setOutputBitstream(generatedPtr);
			ModernizedCProgram.lock.setDoNotWait(false);
			if (enc.nv_failed(.UNRECOGNIZEDFUNCTIONNAME(s, ModernizedCProgram.lock), __FUNCTION__, "nv.nvEncLockBitstream(s, &lock)")) {
				return false;
			} 
			if (generatedFirst_packet) {
				 new_packet = new ();
				size_t size = new size_t();
				this.setFirst_packet(false);
				ModernizedCProgram.obs_extract_avc_headers(ModernizedCProgram.lock.getBitstreamBufferPtr(), ModernizedCProgram.lock.getBitstreamSizeInBytes(), new_packet, size, generatedHeader, generatedHeader_size, generatedSei, generatedSei_size);
				.da_copy_array(generatedPacket_data, new_packet, size);
				ModernizedCProgram.bfree(new_packet);
			} else {
					.da_copy_array(generatedPacket_data, ModernizedCProgram.lock.getBitstreamBufferPtr(), ModernizedCProgram.lock.getBitstreamSizeInBytes());
			} 
			this.setPacket_pts(()ModernizedCProgram.lock.getOutputTimeStamp());
			this.setPacket_keyframe(ModernizedCProgram.lock.getPictureType() == NV_ENC_PIC_TYPE_IDR);
			if (enc.nv_failed(.UNRECOGNIZEDFUNCTIONNAME(s, generatedPtr), __FUNCTION__, "nv.nvEncUnlockBitstream(s, bs->ptr)")) {
				return false;
			} 
			if (generatedMapped_res) {
				NVENCSTATUS err = new NVENCSTATUS();
				err = .UNRECOGNIZEDFUNCTIONNAME(s, generatedMapped_res);
				if (enc.nv_failed(err, __FUNCTION__, "unmap")) {
					return false;
				} 
				nvtex.setMapped_res(((Object)0));
			} 
			if (++generatedCur_bitstream == generatedBuf_count) {
				this.setCur_bitstream(0);
			} 
			generatedBuffers_queued--;
		}
		return true;
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public Object getSession() {
		return session;
	}
	public void setSession(Object newSession) {
		session = newSession;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
	public Object getConfig() {
		return config;
	}
	public void setConfig(Object newConfig) {
		config = newConfig;
	}
	public Object getBuf_count() {
		return buf_count;
	}
	public void setBuf_count(Object newBuf_count) {
		buf_count = newBuf_count;
	}
	public Object getOutput_delay() {
		return output_delay;
	}
	public void setOutput_delay(Object newOutput_delay) {
		output_delay = newOutput_delay;
	}
	public Object getBuffers_queued() {
		return buffers_queued;
	}
	public void setBuffers_queued(Object newBuffers_queued) {
		buffers_queued = newBuffers_queued;
	}
	public Object getNext_bitstream() {
		return next_bitstream;
	}
	public void setNext_bitstream(Object newNext_bitstream) {
		next_bitstream = newNext_bitstream;
	}
	public Object getCur_bitstream() {
		return cur_bitstream;
	}
	public void setCur_bitstream(Object newCur_bitstream) {
		cur_bitstream = newCur_bitstream;
	}
	public Object getEncode_started() {
		return encode_started;
	}
	public void setEncode_started(Object newEncode_started) {
		encode_started = newEncode_started;
	}
	public Object getFirst_packet() {
		return first_packet;
	}
	public void setFirst_packet(Object newFirst_packet) {
		first_packet = newFirst_packet;
	}
	public Object getCan_change_bitrate() {
		return can_change_bitrate;
	}
	public void setCan_change_bitrate(Object newCan_change_bitrate) {
		can_change_bitrate = newCan_change_bitrate;
	}
	public Object getBframes() {
		return bframes;
	}
	public void setBframes(Object newBframes) {
		bframes = newBframes;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public circlebuf getDts_list() {
		return dts_list;
	}
	public void setDts_list(circlebuf newDts_list) {
		dts_list = newDts_list;
	}
	public Object getPacket_pts() {
		return packet_pts;
	}
	public void setPacket_pts(Object newPacket_pts) {
		packet_pts = newPacket_pts;
	}
	public Object getPacket_keyframe() {
		return packet_keyframe;
	}
	public void setPacket_keyframe(Object newPacket_keyframe) {
		packet_keyframe = newPacket_keyframe;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getHeader() {
		return header;
	}
	public void setHeader(Object newHeader) {
		header = newHeader;
	}
	public Object getHeader_size() {
		return header_size;
	}
	public void setHeader_size(Object newHeader_size) {
		header_size = newHeader_size;
	}
	public Object getSei() {
		return sei;
	}
	public void setSei(Object newSei) {
		sei = newSei;
	}
	public Object getSei_size() {
		return sei_size;
	}
	public void setSei_size(Object newSei_size) {
		sei_size = newSei_size;
	}
}
