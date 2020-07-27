package application;

public class coreaudio_data {
	private Byte device_name;
	private Byte device_uid;
	private Object unit;
	private Object device_id;
	private Object buf_list;
	private Object au_initialized;
	private Object active;
	private Object default_device;
	private Object input;
	private Object no_devices;
	private Object sample_rate;
	private audio_format format;
	private speaker_layout speakers;
	private Object reconnect_thread;
	private Object exit_event;
	private Object reconnecting;
	private long retry_time;
	private obs_source source;
	
	public coreaudio_data(Byte device_name, Byte device_uid, Object unit, Object device_id, Object buf_list, Object au_initialized, Object active, Object default_device, Object input, Object no_devices, Object sample_rate, audio_format format, speaker_layout speakers, Object reconnect_thread, Object exit_event, Object reconnecting, long retry_time, obs_source source) {
		setDevice_name(device_name);
		setDevice_uid(device_uid);
		setUnit(unit);
		setDevice_id(device_id);
		setBuf_list(buf_list);
		setAu_initialized(au_initialized);
		setActive(active);
		setDefault_device(default_device);
		setInput(input);
		setNo_devices(no_devices);
		setSample_rate(sample_rate);
		setFormat(format);
		setSpeakers(speakers);
		setReconnect_thread(reconnect_thread);
		setExit_event(exit_event);
		setReconnecting(reconnecting);
		setRetry_time(retry_time);
		setSource(source);
	}
	public coreaudio_data() {
	}
	
	public Object get_default_output_device() {
		device_list list = new device_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(list, 0, /*Error: Unsupported expression*/);
		list.coreaudio_enum_devices(false);
		Object generatedItems = list.getItems();
		if (!generatedItems.getNum()) {
			return false;
		} 
		Byte generatedDevice_uid = this.getDevice_uid();
		ModernizedCProgram.bfree(generatedDevice_uid);
		this.setDevice_uid(ModernizedCProgram.bstrdup(generatedItems.getArray()[0].getValue().getArray()));
		list.device_list_free();
		return true;
	}
	public Object find_device_id_by_uid() {
		 size = /*Error: Unsupported expression*/;
		 cf_uid = NULL;
		 qual = NULL;
		 qual_size = 0;
		 stat = new ();
		 success = new ();
		 addr = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Byte generatedDevice_uid = this.getDevice_uid();
		if (!generatedDevice_uid) {
			this.setDevice_uid(ModernizedCProgram.bstrdup("default"));
		} 
		this.setDefault_device(false);
		this.setNo_devices(false);
		Object generatedInput = this.getInput();
		if (ModernizedCProgram.astrcmpi(generatedDevice_uid, "default") == /* have to do this because mac output devices don't actually exist */0) {
			if (generatedInput) {
				this.setDefault_device(true);
			} else {
					if (!ca.get_default_output_device()) {
						this.setNo_devices(true);
						return false;
					} 
			} 
		} 
		cf_uid = /*Error: Function owner not recognized*/CFStringCreateWithCString(NULL, generatedDevice_uid, kCFStringEncodingUTF8);
		Object generatedDefault_device = this.getDefault_device();
		Object generatedDevice_id = this.getDevice_id();
		if (generatedDefault_device) {
			addr.setMSelector(kAudioHardwarePropertyDefaultInputDevice);
			stat = /*Error: Function owner not recognized*/AudioObjectGetPropertyData(kAudioObjectSystemObject, addr, qual_size, qual, size, generatedDevice_id);
			success = (stat == noErr);
		} else {
				success = ModernizedCProgram.coreaudio_get_device_id(cf_uid, generatedDevice_id);
		} 
		if (cf_uid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(cf_uid);
		} 
		return success;
	}
	public void ca_warn(Object func, Object format) {
		 args = new ();
		dstr str = new dstr(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/va_start(args, format);
		Byte generatedDevice_name = this.getDevice_name();
		str.dstr_printf("[%s]:[device '%s'] ", func, generatedDevice_name);
		str.dstr_vcatf(format, args);
		Object generatedDstr = str.getDstr();
		ModernizedCProgram.blog(LOG_WARNING, "%s", generatedDstr);
		str.dstr_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/va_end(args);
	}
	public Object ca_success(Object stat, Object func, Object action) {
		Byte generatedDevice_name = this.getDevice_name();
		if (stat != noErr) {
			ModernizedCProgram.blog(LOG_WARNING, "[%s]:[device '%s'] %s failed: %d", func, generatedDevice_name, action, (int)stat);
			return false;
		} 
		return true;
	}
	public Object enable_io(coreaudio_io_type type, Object enable) {
		 enable_int = enable;
		Object generatedUnit = this.getUnit();
		return /*Error: Function owner not recognized*/AudioUnitSetProperty(generatedUnit, kAudioOutputUnitProperty_EnableIO, (coreaudio_io_type.type == coreaudio_io_type.IO_TYPE_INPUT) ? kAudioUnitScope_Input : kAudioUnitScope_Output, (coreaudio_io_type.type == coreaudio_io_type.IO_TYPE_INPUT) ? 1 : 0, enable_int, /*Error: sizeof expression not supported yet*/);
	}
	public Object coreaudio_init_format() {
		 desc = new ();
		 stat = new ();
		 size = /*Error: sizeof expression not supported yet*/;
		obs_audio_info aoi = new obs_audio_info();
		int channels;
		if (!aoi.obs_get_audio_info()) {
			ModernizedCProgram.blog(LOG_WARNING, "No active audio");
			return false;
		} 
		speaker_layout generatedSpeakers = aoi.getSpeakers();
		channels = ModernizedCProgram.get_audio_channels(generatedSpeakers);
		Object generatedUnit = this.getUnit();
		stat = /*Error: Function owner not recognized*/AudioUnitGetProperty(generatedUnit, kAudioUnitProperty_StreamFormat, kAudioUnitScope_Input, 1, desc, size);
		if (!ca.ca_success(stat, "coreaudio_init_format", "get input format")) {
			return false/* Certain types of devices have no limit on channel count, and
				 * there's no way to know the actual number of channels it's using,
				 * so if we encounter this situation just force to what is defined in output */;
		} 
		if (desc.getMChannelsPerFrame() > 8) {
			desc.setMChannelsPerFrame(channels);
			desc.setMBytesPerFrame(channels * desc.getMBitsPerChannel() / 8);
			desc.setMBytesPerPacket(desc.getMFramesPerPacket() * desc.getMBytesPerFrame());
		} 
		stat = /*Error: Function owner not recognized*/AudioUnitSetProperty(generatedUnit, kAudioUnitProperty_StreamFormat, kAudioUnitScope_Output, 1, desc, size);
		if (!ca.ca_success(stat, "coreaudio_init_format", "set output format")) {
			return false;
		} 
		if (desc.getMFormatID() != kAudioFormatLinearPCM) {
			ca.ca_warn("coreaudio_init_format", "format is not PCM");
			return false;
		} 
		this.setFormat(ModernizedCProgram.convert_ca_format(desc.getMFormatFlags(), desc.getMBitsPerChannel()));
		audio_format generatedFormat = this.getFormat();
		if (generatedFormat == AUDIO_FORMAT_UNKNOWN) {
			ca.ca_warn("coreaudio_init_format", "unknown format flags: %u, bits: %u", (int)desc.getMFormatFlags(), (int)desc.getMBitsPerChannel());
			return false;
		} 
		this.setSample_rate((uint32_t)desc.getMSampleRate());
		this.setSpeakers(ModernizedCProgram.convert_ca_speaker_layout(desc.getMChannelsPerFrame()));
		if (generatedSpeakers == SPEAKERS_UNKNOWN) {
			ca.ca_warn("coreaudio_init_format", "unknown speaker layout: %u channels", (int)desc.getMChannelsPerFrame());
			return false;
		} 
		return true;
	}
	public Object coreaudio_init_buffer() {
		 buf_size = 0;
		 size = 0;
		 frames = 0;
		 stat = new ();
		 addr = new (kAudioDevicePropertyStreamConfiguration, kAudioDevicePropertyScopeInput, kAudioObjectPropertyElementMaster);
		Object generatedDevice_id = this.getDevice_id();
		stat = /*Error: Function owner not recognized*/AudioObjectGetPropertyDataSize(generatedDevice_id, addr, 0, NULL, buf_size);
		if (!ca.ca_success(stat, "coreaudio_init_buffer", "get list size")) {
			return false;
		} 
		size = /*Error: sizeof expression not supported yet*/;
		Object generatedUnit = this.getUnit();
		stat = /*Error: Function owner not recognized*/AudioUnitGetProperty(generatedUnit, kAudioDevicePropertyBufferFrameSize, kAudioUnitScope_Global, 0, frames, size);
		if (!ca.ca_success(stat, "coreaudio_init_buffer", "get frame size")) {
			return false;
		} 
		this.setBuf_list(ModernizedCProgram.bmalloc(/* ---------------------- */buf_size));
		Object generatedBuf_list = this.getBuf_list();
		stat = /*Error: Function owner not recognized*/AudioObjectGetPropertyData(generatedDevice_id, addr, 0, NULL, buf_size, generatedBuf_list);
		if (!ca.ca_success(stat, "coreaudio_init_buffer", "allocate")) {
			ModernizedCProgram.bfree(generatedBuf_list);
			this.setBuf_list(NULL);
			return false;
		} 
		for ( i = 0;
		 i < generatedBuf_list.getMNumberBuffers(); i++) {
			size = generatedBuf_list.getMBuffers()[i].getMDataByteSize();
			generatedBuf_list.getMBuffers()[i].setMData(ModernizedCProgram.bmalloc(size));
		}
		return true;
	}
	public void coreaudio_begin_reconnect() {
		int ret;
		Object generatedReconnecting = this.getReconnecting();
		if (generatedReconnecting) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedReconnect_thread = this.getReconnect_thread();
		ret = ModernizedCProgram.pthread_create(generatedReconnect_thread, NULL, reconnect_thread, ca);
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[coreaudio_begin_reconnect] failed to create thread, error code: %d", ret);
		} 
	}
	public Object add_listener(Object property) {
		 addr = new (property, kAudioObjectPropertyScopeGlobal, kAudioObjectPropertyElementMaster);
		Object generatedDevice_id = this.getDevice_id();
		return /*Error: Function owner not recognized*/AudioObjectAddPropertyListener(generatedDevice_id, addr, notification_callback, ca);
	}
	public Object coreaudio_init_hooks() {
		 stat = new ();
		 callback_info = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		stat = ca.add_listener(kAudioDevicePropertyDeviceIsAlive);
		if (!ca.ca_success(stat, "coreaudio_init_hooks", "set disconnect callback")) {
			return false;
		} 
		stat = ca.add_listener(kAudioStreamPropertyAvailablePhysicalFormats);
		if (!ca.ca_success(stat, "coreaudio_init_hooks", "set format change callback")) {
			return false;
		} 
		Object generatedDefault_device = this.getDefault_device();
		if (generatedDefault_device) {
			 addr = new (kAudioHardwarePropertyDefaultInputDevice, kAudioObjectPropertyScopeGlobal, kAudioObjectPropertyElementMaster);
			stat = /*Error: Function owner not recognized*/AudioObjectAddPropertyListener(kAudioObjectSystemObject, addr, notification_callback, ca);
			if (!ca.ca_success(stat, "coreaudio_init_hooks", "set device change callback")) {
				return false;
			} 
		} 
		Object generatedUnit = this.getUnit();
		stat = /*Error: Function owner not recognized*/AudioUnitSetProperty(generatedUnit, kAudioOutputUnitProperty_SetInputCallback, kAudioUnitScope_Global, 0, callback_info, /*Error: sizeof expression not supported yet*/);
		if (!ca.ca_success(stat, "coreaudio_init_hooks", "set input callback")) {
			return false;
		} 
		return true;
	}
	public void coreaudio_remove_hooks() {
		 callback_info = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		 addr = new (kAudioDevicePropertyDeviceIsAlive, kAudioObjectPropertyScopeGlobal, kAudioObjectPropertyElementMaster);
		Object generatedDevice_id = this.getDevice_id();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioObjectRemovePropertyListener(generatedDevice_id, addr, notification_callback, ca);
		addr.setMSelector(kAudioStreamPropertyAvailablePhysicalFormats);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioObjectRemovePropertyListener(generatedDevice_id, addr, notification_callback, ca);
		Object generatedDefault_device = this.getDefault_device();
		if (generatedDefault_device) {
			addr.setMSelector(kAudioHardwarePropertyDefaultInputDevice);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioObjectRemovePropertyListener(kAudioObjectSystemObject, addr, notification_callback, ca);
		} 
		Object generatedUnit = this.getUnit();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioUnitSetProperty(generatedUnit, kAudioOutputUnitProperty_SetInputCallback, kAudioUnitScope_Global, 0, callback_info, /*Error: sizeof expression not supported yet*/);
	}
	public Object coreaudio_get_device_name() {
		 cf_name = NULL;
		 size = /*Error: Unsupported expression*/;
		byte name = NULL;
		 addr = new (kAudioDevicePropertyDeviceNameCFString, kAudioObjectPropertyScopeInput, kAudioObjectPropertyElementMaster);
		Object generatedDevice_id = this.getDevice_id();
		 stat = /*Error: Function owner not recognized*/AudioObjectGetPropertyData(generatedDevice_id, addr, 0, NULL, size, cf_name);
		if (stat != noErr) {
			ModernizedCProgram.blog(LOG_WARNING, "[coreaudio_get_device_name] failed to get name: %d", (int)stat);
			return false;
		} 
		name = /*Error: Function owner not recognized*/cfstr_copy_cstr(cf_name, kCFStringEncodingUTF8);
		if (!name) {
			ModernizedCProgram.blog(LOG_WARNING, "[coreaudio_get_device_name] failed to convert name to cstr for some reason");
			return false;
		} 
		Byte generatedDevice_name = this.getDevice_name();
		ModernizedCProgram.bfree(generatedDevice_name);
		this.setDevice_name(name);
		if (cf_name) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(cf_name);
		} 
		return true;
	}
	public Object coreaudio_start() {
		 stat = new ();
		Object generatedActive = this.getActive();
		if (generatedActive) {
			return true;
		} 
		Object generatedUnit = this.getUnit();
		stat = /*Error: Function owner not recognized*/AudioOutputUnitStart(generatedUnit);
		return ca.ca_success(stat, "coreaudio_start", "start audio");
	}
	public void coreaudio_stop() {
		 stat = new ();
		Object generatedActive = this.getActive();
		if (!generatedActive) {
			return /*Error: Unsupported expression*/;
		} 
		this.setActive(false);
		Object generatedUnit = this.getUnit();
		stat = /*Error: Function owner not recognized*/AudioOutputUnitStop(generatedUnit);
		ca.ca_success(stat, "coreaudio_stop", "stop audio");
	}
	public Object coreaudio_init_unit() {
		 desc = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		 component = /*Error: Function owner not recognized*/AudioComponentFindNext(NULL, desc);
		if (!component) {
			ca.ca_warn("coreaudio_init_unit", "find component failed");
			return false;
		} 
		Object generatedUnit = this.getUnit();
		 stat = /*Error: Function owner not recognized*/AudioComponentInstanceNew(component, generatedUnit);
		if (!ca.ca_success(stat, "coreaudio_init_unit", "instance unit")) {
			return false;
		} 
		this.setAu_initialized(true);
		return true;
	}
	public Object coreaudio_init() {
		 stat = new ();
		Object generatedAu_initialized = this.getAu_initialized();
		if (generatedAu_initialized) {
			return true;
		} 
		if (!ca.find_device_id_by_uid()) {
			return false;
		} 
		if (!ca.coreaudio_get_device_name()) {
			return false;
		} 
		if (!ca.coreaudio_init_unit()) {
			return false;
		} 
		stat = ca.enable_io(coreaudio_io_type.IO_TYPE_INPUT, true);
		if (!ca.ca_success(stat, "coreaudio_init", "enable input io")) {
			;
		} 
		stat = ca.enable_io(coreaudio_io_type.IO_TYPE_OUTPUT, false);
		if (!ca.ca_success(stat, "coreaudio_init", "disable output io")) {
			;
		} 
		Object generatedUnit = this.getUnit();
		Object generatedDevice_id = this.getDevice_id();
		stat = /*Error: Function owner not recognized*/AudioUnitSetProperty(generatedUnit, kAudioOutputUnitProperty_CurrentDevice, kAudioUnitScope_Global, 0, generatedDevice_id, /*Error: sizeof expression not supported yet*/);
		if (!ca.ca_success(stat, "coreaudio_init", "set current device")) {
			;
		} 
		if (!ca.coreaudio_init_format()) {
			;
		} 
		if (!ca.coreaudio_init_buffer()) {
			;
		} 
		if (!ca.coreaudio_init_hooks()) {
			;
		} 
		stat = /*Error: Function owner not recognized*/AudioUnitInitialize(generatedUnit);
		if (!ca.ca_success(stat, "coreaudio_initialize", "initialize")) {
			;
		} 
		if (!ca.coreaudio_start()) {
			;
		} 
		Byte generatedDevice_name = this.getDevice_name();
		ModernizedCProgram.blog(LOG_INFO, "coreaudio: device '%s' initialized", generatedDevice_name);
		return generatedAu_initialized;
		return false;
	}
	public void coreaudio_try_init() {
		Byte generatedDevice_uid = this.getDevice_uid();
		Object generatedNo_devices = this.getNo_devices();
		if (!ca.coreaudio_init()) {
			ModernizedCProgram.blog(LOG_INFO, "coreaudio: failed to find device uid: %s, waiting for connection", generatedDevice_uid);
			this.setRetry_time(2000);
			if (generatedNo_devices) {
				ModernizedCProgram.blog(LOG_INFO, "coreaudio: no device found");
			} else {
					ca.coreaudio_begin_reconnect();
			} 
		} 
	}
	public void coreaudio_uninit() {
		Object generatedAu_initialized = this.getAu_initialized();
		if (!generatedAu_initialized) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedUnit = this.getUnit();
		if (generatedUnit) {
			ca.coreaudio_stop();
			 stat = /*Error: Function owner not recognized*/AudioUnitUninitialize(generatedUnit);
			ca.ca_success(stat, "coreaudio_uninit", "uninitialize");
			ca.coreaudio_remove_hooks();
			stat = /*Error: Function owner not recognized*/AudioComponentInstanceDispose(generatedUnit);
			ca.ca_success(stat, "coreaudio_uninit", "dispose");
			this.setUnit(NULL);
		} 
		this.setAu_initialized(false);
		Object generatedBuf_list = this.getBuf_list();
		ModernizedCProgram.buf_list_free(generatedBuf_list);
		this.setBuf_list(NULL);
	}
	public void coreaudio_shutdown() {
		Object generatedReconnecting = this.getReconnecting();
		Object generatedExit_event = this.getExit_event();
		Object generatedReconnect_thread = this.getReconnect_thread();
		if (generatedReconnecting) {
			generatedExit_event.os_event_signal();
			ModernizedCProgram.pthread_join(generatedReconnect_thread, NULL);
			generatedExit_event.os_event_reset();
		} 
		ca.coreaudio_uninit();
		Object generatedUnit = this.getUnit();
		if (generatedUnit) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioComponentInstanceDispose(generatedUnit);
		} 
	}
	public Byte getDevice_name() {
		return device_name;
	}
	public void setDevice_name(Byte newDevice_name) {
		device_name = newDevice_name;
	}
	public Byte getDevice_uid() {
		return device_uid;
	}
	public void setDevice_uid(Byte newDevice_uid) {
		device_uid = newDevice_uid;
	}
	public Object getUnit() {
		return unit;
	}
	public void setUnit(Object newUnit) {
		unit = newUnit;
	}
	public Object getDevice_id() {
		return device_id;
	}
	public void setDevice_id(Object newDevice_id) {
		device_id = newDevice_id;
	}
	public Object getBuf_list() {
		return buf_list;
	}
	public void setBuf_list(Object newBuf_list) {
		buf_list = newBuf_list;
	}
	public Object getAu_initialized() {
		return au_initialized;
	}
	public void setAu_initialized(Object newAu_initialized) {
		au_initialized = newAu_initialized;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getDefault_device() {
		return default_device;
	}
	public void setDefault_device(Object newDefault_device) {
		default_device = newDefault_device;
	}
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
	public Object getNo_devices() {
		return no_devices;
	}
	public void setNo_devices(Object newNo_devices) {
		no_devices = newNo_devices;
	}
	public Object getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(Object newSample_rate) {
		sample_rate = newSample_rate;
	}
	public audio_format getFormat() {
		return format;
	}
	public void setFormat(audio_format newFormat) {
		format = newFormat;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
	}
	public Object getReconnect_thread() {
		return reconnect_thread;
	}
	public void setReconnect_thread(Object newReconnect_thread) {
		reconnect_thread = newReconnect_thread;
	}
	public Object getExit_event() {
		return exit_event;
	}
	public void setExit_event(Object newExit_event) {
		exit_event = newExit_event;
	}
	public Object getReconnecting() {
		return reconnecting;
	}
	public void setReconnecting(Object newReconnecting) {
		reconnecting = newReconnecting;
	}
	public long getRetry_time() {
		return retry_time;
	}
	public void setRetry_time(long newRetry_time) {
		retry_time = newRetry_time;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
}
