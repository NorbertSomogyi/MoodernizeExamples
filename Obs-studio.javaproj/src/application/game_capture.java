package application;

public class game_capture {
	private obs_source source;
	private cursor_data cursor_data;
	private Object injector_process;
	private Object cx;
	private Object cy;
	private Object pitch;
	private Object process_id;
	private Object thread_id;
	private Object next_window;
	private Object window;
	private double retry_time;
	private double fps_reset_time;
	private double retry_interval;
	private dstr title;
	private dstr class;
	private dstr executable;
	private window_priority priority;
	private Object hotkey_pair;
	private Object hotkey_window;
	private Object deactivate_hook;
	private Object activate_hook_now;
	private boolean wait_for_target_startup;
	private boolean showing;
	private boolean active;
	private boolean capturing;
	private boolean activate_hook;
	private boolean process_is_64bit;
	private boolean error_acquiring;
	private boolean dwm_capture;
	private boolean initial_config;
	private boolean convert_16bit;
	private boolean is_app;
	private boolean cursor_hidden;
	private game_capture_config config;
	private Object pipe;
	private Object texture;
	private hook_info global_hook_info;
	private Object keepalive_mutex;
	private Object hook_init;
	private Object hook_restart;
	private Object hook_stop;
	private Object hook_ready;
	private Object hook_exit;
	private Object hook_data_map;
	private Object global_hook_info_map;
	private Object target_process;
	private Object texture_mutexes;
	private Object app_sid;
	private int retrying;
	private double cursor_check_time;
	private shmem_data shmem_data;
	private Object texture_buffers;
	private shtex_data shtex_data;
	private Object data;
	private Object copy_texture;
	
	public game_capture(obs_source source, cursor_data cursor_data, Object injector_process, Object cx, Object cy, Object pitch, Object process_id, Object thread_id, Object next_window, Object window, double retry_time, double fps_reset_time, double retry_interval, dstr title, dstr class, dstr executable, window_priority priority, Object hotkey_pair, Object hotkey_window, Object deactivate_hook, Object activate_hook_now, boolean wait_for_target_startup, boolean showing, boolean active, boolean capturing, boolean activate_hook, boolean process_is_64bit, boolean error_acquiring, boolean dwm_capture, boolean initial_config, boolean convert_16bit, boolean is_app, boolean cursor_hidden, game_capture_config config, Object pipe, Object texture, hook_info global_hook_info, Object keepalive_mutex, Object hook_init, Object hook_restart, Object hook_stop, Object hook_ready, Object hook_exit, Object hook_data_map, Object global_hook_info_map, Object target_process, Object texture_mutexes, Object app_sid, int retrying, double cursor_check_time, shmem_data shmem_data, Object texture_buffers, shtex_data shtex_data, Object data, Object copy_texture) {
		setSource(source);
		setCursor_data(cursor_data);
		setInjector_process(injector_process);
		setCx(cx);
		setCy(cy);
		setPitch(pitch);
		setProcess_id(process_id);
		setThread_id(thread_id);
		setNext_window(next_window);
		setWindow(window);
		setRetry_time(retry_time);
		setFps_reset_time(fps_reset_time);
		setRetry_interval(retry_interval);
		setTitle(title);
		setClass(class);
		setExecutable(executable);
		setPriority(priority);
		setHotkey_pair(hotkey_pair);
		setHotkey_window(hotkey_window);
		setDeactivate_hook(deactivate_hook);
		setActivate_hook_now(activate_hook_now);
		setWait_for_target_startup(wait_for_target_startup);
		setShowing(showing);
		setActive(active);
		setCapturing(capturing);
		setActivate_hook(activate_hook);
		setProcess_is_64bit(process_is_64bit);
		setError_acquiring(error_acquiring);
		setDwm_capture(dwm_capture);
		setInitial_config(initial_config);
		setConvert_16bit(convert_16bit);
		setIs_app(is_app);
		setCursor_hidden(cursor_hidden);
		setConfig(config);
		setPipe(pipe);
		setTexture(texture);
		setGlobal_hook_info(global_hook_info);
		setKeepalive_mutex(keepalive_mutex);
		setHook_init(hook_init);
		setHook_restart(hook_restart);
		setHook_stop(hook_stop);
		setHook_ready(hook_ready);
		setHook_exit(hook_exit);
		setHook_data_map(hook_data_map);
		setGlobal_hook_info_map(global_hook_info_map);
		setTarget_process(target_process);
		setTexture_mutexes(texture_mutexes);
		setApp_sid(app_sid);
		setRetrying(retrying);
		setCursor_check_time(cursor_check_time);
		setShmem_data(shmem_data);
		setTexture_buffers(texture_buffers);
		setShtex_data(shtex_data);
		setData(data);
		setCopy_texture(copy_texture);
	}
	public game_capture() {
	}
	
	public boolean use_anticheat() {
		game_capture_config generatedConfig = this.getConfig();
		boolean generatedAnticheat_hook = generatedConfig.getAnticheat_hook();
		boolean generatedIs_app = this.getIs_app();
		return generatedAnticheat_hook && !generatedIs_app;
	}
	public Object open_mutex_plus_id(Object name, Object id) {
		wchar_t[] new_name = new wchar_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snwprintf(new_name, 64, L"%s%lu", name, id);
		boolean generatedIs_app = this.getIs_app();
		Object generatedApp_sid = this.getApp_sid();
		return generatedIs_app ? ModernizedCProgram.open_app_mutex(generatedApp_sid, new_name) : ModernizedCProgram.open_mutex(new_name);
	}
	public Object open_mutex_gc(Object name) {
		Object generatedProcess_id = this.getProcess_id();
		return gc.open_mutex_plus_id(name, generatedProcess_id);
	}
	public Object open_event_plus_id(Object name, Object id) {
		wchar_t[] new_name = new wchar_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snwprintf(new_name, 64, L"%s%lu", name, id);
		boolean generatedIs_app = this.getIs_app();
		Object generatedApp_sid = this.getApp_sid();
		return generatedIs_app ? ModernizedCProgram.open_app_event(generatedApp_sid, new_name) : ModernizedCProgram.open_event(new_name);
	}
	public Object open_event_gc(Object name) {
		Object generatedProcess_id = this.getProcess_id();
		return gc.open_event_plus_id(name, generatedProcess_id);
	}
	public Object open_map_plus_id(Object name, Object id) {
		wchar_t[] new_name = new wchar_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snwprintf(new_name, 64, L"%s%lu", name, id);
		obs_source generatedSource = this.getSource();
		ModernizedCProgram.blog(LOG_DEBUG, "[game-capture: '%s'] map id: %S", ModernizedCProgram.obs_source_get_name(generatedSource), new_name);
		boolean generatedIs_app = this.getIs_app();
		Object generatedApp_sid = this.getApp_sid();
		return generatedIs_app ? ModernizedCProgram.open_app_map(generatedApp_sid, new_name) : /*Error: Function owner not recognized*/OpenFileMappingW((4 | 2), 0, new_name);
	}
	public Object open_hook_info() {
		Object generatedProcess_id = this.getProcess_id();
		return gc.open_map_plus_id(L"CaptureHook_HookInfo", generatedProcess_id);
	}
	public void stop_capture() {
		Object generatedPipe = this.getPipe();
		generatedPipe.ipc_pipe_server_free();
		Object generatedHook_stop = this.getHook_stop();
		if (generatedHook_stop) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetEvent(generatedHook_stop);
		} 
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		if (generatedGlobal_hook_info) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UnmapViewOfFile(generatedGlobal_hook_info);
			this.setGlobal_hook_info(((Object)0));
		} 
		Object generatedData = this.getData();
		if (generatedData) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UnmapViewOfFile(generatedData);
			this.setData(((Object)0));
		} 
		Object generatedApp_sid = this.getApp_sid();
		if (generatedApp_sid) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LocalFree(generatedApp_sid);
			this.setApp_sid(((Object)0));
		} 
		Object generatedHook_restart = this.getHook_restart();
		ModernizedCProgram.close_handle(generatedHook_restart);
		ModernizedCProgram.close_handle(generatedHook_stop);
		Object generatedHook_ready = this.getHook_ready();
		ModernizedCProgram.close_handle(generatedHook_ready);
		Object generatedHook_exit = this.getHook_exit();
		ModernizedCProgram.close_handle(generatedHook_exit);
		Object generatedHook_init = this.getHook_init();
		ModernizedCProgram.close_handle(generatedHook_init);
		Object generatedHook_data_map = this.getHook_data_map();
		ModernizedCProgram.close_handle(generatedHook_data_map);
		Object generatedKeepalive_mutex = this.getKeepalive_mutex();
		ModernizedCProgram.close_handle(generatedKeepalive_mutex);
		Object generatedGlobal_hook_info_map = this.getGlobal_hook_info_map();
		ModernizedCProgram.close_handle(generatedGlobal_hook_info_map);
		Object generatedTarget_process = this.getTarget_process();
		ModernizedCProgram.close_handle(generatedTarget_process);
		Object generatedTexture_mutexes = this.getTexture_mutexes();
		ModernizedCProgram.close_handle(generatedTexture_mutexes[0]);
		ModernizedCProgram.close_handle(generatedTexture_mutexes[1]);
		Object generatedTexture = this.getTexture();
		if (generatedTexture) {
			ModernizedCProgram.obs_enter_graphics();
			ModernizedCProgram.gs_texture_destroy(generatedTexture);
			ModernizedCProgram.obs_leave_graphics();
			this.setTexture(((Object)0));
		} 
		boolean generatedActive = this.getActive();
		obs_source generatedSource = this.getSource();
		if (generatedActive) {
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] capture stopped", ModernizedCProgram.obs_source_get_name(generatedSource));
		} 
		this.setCopy_texture(((Object)0));
		this.setWait_for_target_startup(0);
		this.setActive(0);
		this.setCapturing(0);
		int generatedRetrying = this.getRetrying();
		if (generatedRetrying) {
			generatedRetrying--;
		} 
	}
	public boolean check_file_integrity(Object file, Object name) {
		DWORD error = new DWORD();
		HANDLE handle = new HANDLE();
		wchar_t w_file = ((Object)0);
		obs_source generatedSource = this.getSource();
		if (!file || !file) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Game capture %s not found.  This is most likely due to security software. Please make sure that the OBS installation folder is excluded/ignored in the settings of the security software you are using.", ModernizedCProgram.obs_source_get_name(generatedSource), name);
			return 0;
		} 
		if (!ModernizedCProgram.os_utf8_to_wcs_ptr(file, 0, w_file)) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Could not convert file name to wide string", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		handle = /*Error: Function owner not recognized*/CreateFileW(w_file, -1024 | -1024, -1024, ((Object)0), 3, 0, ((Object)0));
		ModernizedCProgram.bfree(w_file);
		if (handle != (HANDLE)(true)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(handle);
			return 1;
		} 
		error = /*Error: Function owner not recognized*/GetLastError();
		if (error == -1024) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Game capture file '%s' not found.  This is most likely due to security software. Please make sure that the OBS installation folder is excluded/ignored in the settings of the security software you are using.", ModernizedCProgram.obs_source_get_name(generatedSource), file);
		}  else if (error == -1024) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Game capture file '%s' could not be loaded.  This is most likely due to security software. Please make sure that the OBS installation folder is excluded/ignored in the settings of the security software you are using.", ModernizedCProgram.obs_source_get_name(generatedSource), file);
		} else {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Game capture file '%s' could not be loaded: %lu.  This is most likely due to security software. Please make sure that the OBS installation folder is excluded/ignored in the settings of the security software you are using.", ModernizedCProgram.obs_source_get_name(generatedSource), file, error);
		} 
		return 0;
	}
	public boolean open_target_process() {
		Object generatedProcess_id = this.getProcess_id();
		this.setTarget_process(ModernizedCProgram.open_process(1024 | -1024, 0, generatedProcess_id));
		Object generatedTarget_process = this.getTarget_process();
		obs_source generatedSource = this.getSource();
		game_capture_config generatedConfig = this.getConfig();
		Byte generatedExecutable = generatedConfig.getExecutable();
		if (!generatedTarget_process) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] could not open process: %s", ModernizedCProgram.obs_source_get_name(generatedSource), generatedExecutable);
			return 0;
		} 
		this.setProcess_is_64bit(ModernizedCProgram.is_64bit_process(generatedTarget_process));
		this.setIs_app(ModernizedCProgram.is_app(generatedTarget_process));
		boolean generatedIs_app = this.getIs_app();
		if (generatedIs_app) {
			this.setApp_sid(ModernizedCProgram.get_app_sid(generatedTarget_process));
		} 
		return 1;
	}
	public boolean init_keepalive() {
		wchar_t[] new_name = new wchar_t();
		Object generatedProcess_id = this.getProcess_id();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snwprintf(new_name, 64, L"%s%lu", L"CaptureHook_KeepAlive", generatedProcess_id);
		this.setKeepalive_mutex(/*Error: Function owner not recognized*/CreateMutexW(((Object)0), 0, new_name));
		Object generatedKeepalive_mutex = this.getKeepalive_mutex();
		obs_source generatedSource = this.getSource();
		if (!generatedKeepalive_mutex) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Failed to create keepalive mutex: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		return 1;
	}
	public boolean init_texture_mutexes() {
		Object generatedTexture_mutexes = this.getTexture_mutexes();
		generatedTexture_mutexes[0] = gc.open_mutex_gc(L"CaptureHook_TextureMutex1");
		generatedTexture_mutexes[1] = gc.open_mutex_gc(L"CaptureHook_TextureMutex2");
		int generatedRetrying = this.getRetrying();
		obs_source generatedSource = this.getSource();
		if (!generatedTexture_mutexes[0] || !generatedTexture_mutexes[1]) {
			DWORD error = /*Error: Function owner not recognized*/GetLastError();
			if (error == 2) {
				if (!generatedRetrying) {
					this.setRetrying(2);
					ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] hook not loaded yet, retrying..", ModernizedCProgram.obs_source_get_name(generatedSource));
				} 
			} else {
					ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] failed to open texture mutexes: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
			} 
			return 0;
		} 
		return 1;
	}
	/* if there's already a hook in the process, then signal and start */
	public boolean attempt_existing_hook() {
		this.setHook_restart(gc.open_event_gc(L"CaptureHook_Restart"));
		Object generatedHook_restart = this.getHook_restart();
		obs_source generatedSource = this.getSource();
		game_capture_config generatedConfig = this.getConfig();
		Byte generatedExecutable = generatedConfig.getExecutable();
		if (generatedHook_restart) {
			ModernizedCProgram.blog(LOG_DEBUG, "[game-capture: '%s'] existing hook found, signaling process: %s", ModernizedCProgram.obs_source_get_name(generatedSource), generatedExecutable);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetEvent(generatedHook_restart);
			return 1;
		} 
		return 0;
	}
	public void reset_frame_interval() {
		obs_video_info ovi = new obs_video_info();
		uint64_t interval = 0;
		Object generatedFps_den = ovi.getFps_den();
		Object generatedFps_num = ovi.getFps_num();
		game_capture_config generatedConfig = this.getConfig();
		boolean generatedLimit_framerate = generatedConfig.getLimit_framerate();
		if (ovi.obs_get_video_info()) {
			interval = generatedFps_den * -1024 / generatedFps_num;
			if (!generatedLimit_framerate) {
				interval /= 2;
			} 
		} 
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		generatedGlobal_hook_info.setFrame_interval(interval);
	}
	public boolean init_hook_info() {
		this.setGlobal_hook_info_map(gc.open_hook_info());
		Object generatedGlobal_hook_info_map = this.getGlobal_hook_info_map();
		obs_source generatedSource = this.getSource();
		if (!generatedGlobal_hook_info_map) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_hook_info: get_hook_info failed: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		this.setGlobal_hook_info(/*Error: Function owner not recognized*/MapViewOfFile(generatedGlobal_hook_info_map, -1024, 0, 0, /*Error: sizeof expression not supported yet*/));
		if (!generatedGlobal_hook_info) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_hook_info: failed to map data view: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		game_capture_config generatedConfig = this.getConfig();
		boolean generatedForce_shmem = generatedConfig.getForce_shmem();
		if (generatedForce_shmem) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_hook_info: user is forcing shared memory (multi-adapter compatibility mode)", ModernizedCProgram.obs_source_get_name(generatedSource));
		} 
		boolean generatedProcess_is_64bit = this.getProcess_is_64bit();
		generatedGlobal_hook_info.setOffsets(generatedProcess_is_64bit ? ModernizedCProgram.offsets64 : ModernizedCProgram.offsets32);
		boolean generatedCapture_overlays = generatedConfig.getCapture_overlays();
		generatedGlobal_hook_info.setCapture_overlay(generatedCapture_overlays);
		generatedGlobal_hook_info.setForce_shmem(generatedForce_shmem);
		boolean generatedForce_scaling = generatedConfig.getForce_scaling();
		generatedGlobal_hook_info.setUse_scale(generatedForce_scaling);
		Object generatedScale_cx = generatedConfig.getScale_cx();
		if (generatedScale_cx) {
			generatedGlobal_hook_info.setCx(generatedScale_cx);
		} 
		Object generatedScale_cy = generatedConfig.getScale_cy();
		if (generatedScale_cy) {
			generatedGlobal_hook_info.setCy(generatedScale_cy);
		} 
		gc.reset_frame_interval();
		ModernizedCProgram.obs_enter_graphics();
		if (!ModernizedCProgram.gs_shared_texture_available()) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_hook_info: shared texture capture unavailable", ModernizedCProgram.obs_source_get_name(generatedSource));
			generatedGlobal_hook_info.setForce_shmem(1);
		} 
		ModernizedCProgram.obs_leave_graphics();
		return 1;
		ModernizedCProgram.filemap_hook_info = ModernizedCProgram.create_hook_info(/*Error: Function owner not recognized*/GetCurrentProcessId());
		if (!ModernizedCProgram.filemap_hook_info) {
			ModernizedCProgram.hlog("Failed to create hook info file mapping: %lu", /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		ModernizedCProgram.global_hook_info = /*Error: Function owner not recognized*/MapViewOfFile(ModernizedCProgram.filemap_hook_info, -1024, 0, 0, /*Error: Unsupported expression*/);
		if (!ModernizedCProgram.global_hook_info) {
			ModernizedCProgram.hlog("Failed to map the hook info file mapping: %lu", /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		return 1;
	}
	public boolean init_pipe() {
		byte[] name = new byte[64];
		Object generatedProcess_id = this.getProcess_id();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(name, "%s%lu", "CaptureHook_Pipe", generatedProcess_id);
		Object generatedPipe = this.getPipe();
		obs_source generatedSource = this.getSource();
		if (!generatedPipe.ipc_pipe_server_start(name, pipe_log, gc)) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_pipe: failed to start pipe", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		return 1;
		byte[] new_name = new byte[64];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(new_name, "%s%lu", "CaptureHook_Pipe", /*Error: Function owner not recognized*/GetCurrentProcessId());
		if (!ModernizedCProgram.pipe.ipc_pipe_client_open(new_name)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/OutputDebugStringA("Failed to open pipe\n");
			return 0;
		} 
		return 1;
	}
	public boolean hook_direct(Object hook_path_rel) {
		wchar_t[] hook_path_abs_w = new wchar_t();
		wchar_t hook_path_rel_w = new wchar_t();
		wchar_t path_ret = new wchar_t();
		HANDLE process = new HANDLE();
		int ret;
		ModernizedCProgram.os_utf8_to_wcs_ptr(hook_path_rel, 0, hook_path_rel_w);
		obs_source generatedSource = this.getSource();
		if (!hook_path_rel_w) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] hook_direct: could not convert string", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		path_ret = /*Error: Function owner not recognized*/_wfullpath(hook_path_abs_w, hook_path_rel_w, 260);
		ModernizedCProgram.bfree(hook_path_rel_w);
		if (path_ret == ((Object)0)) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] hook_direct: could not make absolute path", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		Object generatedProcess_id = this.getProcess_id();
		process = ModernizedCProgram.open_process((-1024 | -1024 | -1024), 0, generatedProcess_id);
		game_capture_config generatedConfig = this.getConfig();
		Byte generatedExecutable = generatedConfig.getExecutable();
		if (!process) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] hook_direct: could not open process: %s (%lu)", ModernizedCProgram.obs_source_get_name(generatedSource), generatedExecutable, /*Error: Function owner not recognized*/GetLastError());
			return 0;
		} 
		ret = ModernizedCProgram.inject_library(process, hook_path_abs_w);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(process);
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] hook_direct: inject failed: %d", ModernizedCProgram.obs_source_get_name(generatedSource), ret);
			return 0;
		} 
		return 1;
	}
	public boolean create_inject_process(Object inject_path, Object hook_dll) {
		wchar_t command_line_w = /*Error: Function owner not recognized*/malloc(4096 * /*Error: Unsupported expression*/);
		wchar_t inject_path_w = new wchar_t();
		wchar_t hook_dll_w = new wchar_t();
		boolean anti_cheat = gc.use_anticheat();
		PROCESS_INFORMATION pi = new PROCESS_INFORMATION(0);
		STARTUPINFO si = new STARTUPINFO(0);
		boolean success = false;
		ModernizedCProgram.os_utf8_to_wcs_ptr(inject_path, 0, inject_path_w);
		ModernizedCProgram.os_utf8_to_wcs_ptr(hook_dll, 0, hook_dll_w);
		si.setCb(/*Error: sizeof expression not supported yet*/);
		Object generatedThread_id = this.getThread_id();
		Object generatedProcess_id = this.getProcess_id();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/swprintf(command_line_w, 4096, L"\"%s\" \"%s\" %lu %lu", inject_path_w, hook_dll_w, (long)anti_cheat, anti_cheat ? generatedThread_id : generatedProcess_id);
		success = !!/*Error: Function owner not recognized*/CreateProcessW(inject_path_w, command_line_w, ((Object)0), ((Object)0), 0, -1024, ((Object)0), ((Object)0), si, pi);
		Object generatedHThread = pi.getHThread();
		Object generatedHProcess = pi.getHProcess();
		obs_source generatedSource = this.getSource();
		if (success) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(generatedHThread);
			this.setInjector_process(generatedHProcess);
		} else {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] Failed to create inject helper process: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(command_line_w);
		ModernizedCProgram.bfree(inject_path_w);
		ModernizedCProgram.bfree(hook_dll_w);
		return success;
	}
	public boolean inject_hook() {
		boolean matching_architecture;
		boolean success = false;
		byte hook_dll;
		byte inject_path;
		byte hook_path;
		boolean generatedProcess_is_64bit = this.getProcess_is_64bit();
		obs_module obs_module = new obs_module();
		if (generatedProcess_is_64bit) {
			hook_dll = "graphics-hook64.dll";
			inject_path = obs_module.obs_current_module().obs_find_module_file("inject-helper64.exe");
		} else {
				hook_dll = "graphics-hook32.dll";
				inject_path = obs_module.obs_current_module().obs_find_module_file("inject-helper32.exe");
		} 
		hook_path = obs_module.obs_current_module().obs_find_module_file(hook_dll);
		if (!gc.check_file_integrity(inject_path, "inject helper")) {
			;
		} 
		if (!gc.check_file_integrity(hook_path, "graphics hook")) {
			;
		} 
		matching_architecture = !generatedProcess_is_64bit;
		obs_source generatedSource = this.getSource();
		if (matching_architecture && !gc.use_anticheat()) {
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] using direct hook", ModernizedCProgram.obs_source_get_name(generatedSource));
			success = gc.hook_direct(hook_path);
		} else {
				ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] using helper (%s hook)", ModernizedCProgram.obs_source_get_name(generatedSource), gc.use_anticheat() ? "compatibility" : "direct");
				success = gc.create_inject_process(inject_path, hook_dll);
		} 
		ModernizedCProgram.bfree(hook_path);
		return success;
	}
	public boolean target_suspended() {
		Object generatedProcess_id = this.getProcess_id();
		Object generatedThread_id = this.getThread_id();
		return ModernizedCProgram.thread_is_suspended(generatedProcess_id, generatedThread_id);
	}
	public boolean init_hook() {
		dstr exe = new dstr(0);
		boolean blacklisted_process = false;
		game_capture_config generatedConfig = this.getConfig();
		capture_mode generatedMode = generatedConfig.getMode();
		Object generatedNext_window = this.getNext_window();
		obs_source generatedSource = this.getSource();
		Object generatedDstr = exe.getDstr();
		if (generatedMode == capture_mode.CAPTURE_MODE_ANY) {
			if (exe.get_window_exe(generatedNext_window)) {
				ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] attempting to hook fullscreen process: %s", ModernizedCProgram.obs_source_get_name(generatedSource), generatedDstr);
			} 
		} else {
				if (exe.get_window_exe(generatedNext_window)) {
					ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] attempting to hook process: %s", ModernizedCProgram.obs_source_get_name(generatedSource), generatedDstr);
				} 
		} 
		blacklisted_process = ModernizedCProgram.is_blacklisted_exe(generatedDstr);
		if (blacklisted_process) {
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] cannot capture %s due to being blacklisted", ModernizedCProgram.obs_source_get_name(generatedSource), generatedDstr);
		} 
		exe.dstr_free();
		if (blacklisted_process) {
			return 0;
		} 
		if (gc.target_suspended()) {
			return 0;
		} 
		if (!gc.open_target_process()) {
			return 0;
		} 
		if (!gc.init_keepalive()) {
			return 0;
		} 
		if (!gc.init_pipe()) {
			return 0;
		} 
		if (!gc.attempt_existing_hook()) {
			if (!gc.inject_hook()) {
				return 0;
			} 
		} 
		if (!gc.init_texture_mutexes()) {
			return 0;
		} 
		if (!gc.init_hook_info()) {
			return 0;
		} 
		if (!gc.init_events()) {
			return 0;
		} 
		Object generatedHook_init = this.getHook_init();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetEvent(generatedHook_init);
		this.setWindow(generatedNext_window);
		this.setNext_window(((Object)0));
		this.setActive(1);
		this.setRetrying(0);
		return 1;
		ModernizedCProgram.wait_for_dll_main_finish(thread_handle);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_snwprintf(ModernizedCProgram.keepalive_name, /*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/, L"%s%lu", L"CaptureHook_KeepAlive", /*Error: Function owner not recognized*/GetCurrentProcessId());
		game_capture game_capture = new game_capture();
		game_capture.init_pipe();
		ModernizedCProgram.init_dummy_window_thread();
		ModernizedCProgram.log_current_process();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetEvent(ModernizedCProgram.signal_restart);
		return 1;
	}
	public void setup_window(Object window) {
		HANDLE hook_restart = new HANDLE();
		HANDLE process = new HANDLE();
		Object generatedProcess_id = this.getProcess_id();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowThreadProcessId(window, generatedProcess_id);
		boolean generatedIs_app = this.getIs_app();
		if (generatedProcess_id) {
			process = ModernizedCProgram.open_process(1024, 0, generatedProcess_id);
			if (process) {
				this.setIs_app(ModernizedCProgram.is_app(process));
				if (generatedIs_app) {
					this.setApp_sid(ModernizedCProgram.get_app_sid(process));
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(process);
			} 
		} 
		hook_restart = gc.open_event_gc(/* do not wait if we're re-hooking a process */L"CaptureHook_Restart");
		if (hook_restart) {
			this.setWait_for_target_startup(0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hook_restart/* otherwise if it's an unhooked process, always wait a bit for the
				 * target process to start up before starting the hook process;
				 * sometimes they have important modules to load first or other hooks
				 * (such as steam) need a little bit of time to load.  ultimately this
				 * helps prevent crashes */);
		} 
		boolean generatedWait_for_target_startup = this.getWait_for_target_startup();
		game_capture_config generatedConfig = this.getConfig();
		hook_rate generatedHook_rate = generatedConfig.getHook_rate();
		if (generatedWait_for_target_startup) {
			this.setRetry_interval(3.0 * ModernizedCProgram.hook_rate_to_float(generatedHook_rate));
			this.setWait_for_target_startup(0);
		} else {
				this.setNext_window(window);
		} 
	}
	public void get_fullscreen_window() {
		HWND window = /*Error: Function owner not recognized*/GetForegroundWindow();
		MONITORINFO mi = new MONITORINFO(0);
		HMONITOR monitor = new HMONITOR();
		DWORD styles = new DWORD();
		RECT rect = new RECT();
		this.setNext_window(((Object)0));
		if (!window) {
			return /*Error: Unsupported expression*/;
		} 
		if (!/*Error: Function owner not recognized*/GetWindowRect(window, rect)) {
			return /*Error: Unsupported expression*/;
		} 
		styles = (DWORD)/*Error: Function owner not recognized*/GetWindowLongA(window, (/* ignore regular maximized windows */true));
		if ((styles & -1024) != 0 && (styles & -1024) != 0) {
			return /*Error: Unsupported expression*/;
		} 
		monitor = /*Error: Function owner not recognized*/MonitorFromRect(rect, MONITOR_DEFAULTTONEAREST);
		if (!monitor) {
			return /*Error: Unsupported expression*/;
		} 
		mi.setCbSize(/*Error: sizeof expression not supported yet*/);
		if (!/*Error: Function owner not recognized*/GetMonitorInfoA(monitor, mi)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLeft = rect.getLeft();
		Object generatedRight = rect.getRight();
		Object generatedBottom = rect.getBottom();
		Object generatedTop = rect.getTop();
		if (generatedLeft == generatedLeft && generatedRight == generatedRight && generatedBottom == generatedBottom && generatedTop == generatedTop) {
			gc.setup_window(window);
		} else {
				this.setWait_for_target_startup(1);
		} 
	}
	public void get_selected_window() {
		HWND window = new HWND();
		dstr generatedClass = this.getClass();
		Object generatedDstr = generatedClass.getDstr();
		window_priority generatedPriority = this.getPriority();
		if (ModernizedCProgram.dstr_cmpi(generatedClass, "dwm") == 0) {
			wchar_t[] class_w = new wchar_t();
			ModernizedCProgram.os_utf8_to_wcs(generatedDstr, 0, class_w, 512);
			window = /*Error: Function owner not recognized*/FindWindowW(class_w, ((Object)0));
		} else {
				window = ModernizedCProgram.find_window(window_search_mode.INCLUDE_MINIMIZED, generatedPriority, generatedDstr, generatedDstr, generatedDstr);
		} 
		if (window) {
			gc.setup_window(window);
		} else {
				this.setWait_for_target_startup(1);
		} 
	}
	public void try_hook() {
		game_capture_config generatedConfig = this.getConfig();
		capture_mode generatedMode = generatedConfig.getMode();
		if (generatedMode == capture_mode.CAPTURE_MODE_ANY) {
			gc.get_fullscreen_window();
		} else {
				gc.get_selected_window();
		} 
		Object generatedNext_window = this.getNext_window();
		Object generatedProcess_id = this.getProcess_id();
		Object generatedThread_id = this.getThread_id();
		obs_source generatedSource = this.getSource();
		if (generatedNext_window) {
			this.setThread_id(/*Error: Function owner not recognized*/GetWindowThreadProcessId(generatedNext_window, generatedProcess_id));
			if (generatedProcess_id == /*Error: Function owner not recognized*/GetCurrentProcessId()) {
				return /*Error: Unsupported expression*/;
			} 
			if (!generatedThread_id && generatedProcess_id) {
				return /*Error: Unsupported expression*/;
			} 
			if (!generatedProcess_id) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] error acquiring, failed to get window thread/process ids: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				this.setError_acquiring(1);
				return /*Error: Unsupported expression*/;
			} 
			if (!gc.init_hook()) {
				gc.stop_capture();
			} 
		} else {
				this.setActive(0);
		} 
	}
	public boolean init_events() {
		Object generatedHook_restart = this.getHook_restart();
		obs_source generatedSource = this.getSource();
		if (!generatedHook_restart) {
			this.setHook_restart(gc.open_event_gc(L"CaptureHook_Restart"));
			if (!generatedHook_restart) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_events: failed to get hook_restart event: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				return 0;
			} 
		} 
		Object generatedHook_stop = this.getHook_stop();
		if (!generatedHook_stop) {
			this.setHook_stop(gc.open_event_gc(L"CaptureHook_Stop"));
			if (!generatedHook_stop) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_events: failed to get hook_stop event: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				return 0;
			} 
		} 
		Object generatedHook_init = this.getHook_init();
		if (!generatedHook_init) {
			this.setHook_init(gc.open_event_gc(L"CaptureHook_Initialize"));
			if (!generatedHook_init) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_events: failed to get hook_init event: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				return 0;
			} 
		} 
		Object generatedHook_ready = this.getHook_ready();
		if (!generatedHook_ready) {
			this.setHook_ready(gc.open_event_gc(L"CaptureHook_HookReady"));
			if (!generatedHook_ready) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_events: failed to get hook_ready event: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				return 0;
			} 
		} 
		Object generatedHook_exit = this.getHook_exit();
		if (!generatedHook_exit) {
			this.setHook_exit(gc.open_event_gc(L"CaptureHook_Exit"));
			if (!generatedHook_exit) {
				ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_events: failed to get hook_exit event: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
				return 0;
			} 
		} 
		return 1;
	}
	public capture_result init_capture_data() {
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		Object generatedCx = generatedGlobal_hook_info.getCx();
		this.setCx(generatedCx);
		Object generatedCy = generatedGlobal_hook_info.getCy();
		this.setCy(generatedCy);
		Object generatedPitch = generatedGlobal_hook_info.getPitch();
		this.setPitch(generatedPitch);
		Object generatedData = this.getData();
		if (generatedData) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UnmapViewOfFile(generatedData);
			this.setData(((Object)0));
		} 
		Object generatedHook_data_map = this.getHook_data_map();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(generatedHook_data_map);
		Object generatedMap_id = generatedGlobal_hook_info.getMap_id();
		this.setHook_data_map(gc.open_map_plus_id(L"CaptureHook_Texture", generatedMap_id));
		obs_source generatedSource = this.getSource();
		if (!generatedHook_data_map) {
			DWORD error = /*Error: Function owner not recognized*/GetLastError();
			if (error == 2) {
				return capture_result.CAPTURE_RETRY;
			} else {
					ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_capture_data: failed to open file mapping: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), error);
			} 
			return capture_result.CAPTURE_FAIL;
		} 
		Object generatedMap_size = generatedGlobal_hook_info.getMap_size();
		this.setData(/*Error: Function owner not recognized*/MapViewOfFile(generatedHook_data_map, -1024, 0, 0, generatedMap_size));
		if (!generatedData) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_capture_data: failed to map data view: %lu", ModernizedCProgram.obs_source_get_name(generatedSource), /*Error: Function owner not recognized*/GetLastError());
			return capture_result.CAPTURE_FAIL;
		} 
		return capture_result.CAPTURE_SUCCESS;
	}
	public void copy_b5g6r5_tex(int cur_texture, Object data, Object pitch) {
		Object generatedTexture_buffers = this.getTexture_buffers();
		uint8_t input = generatedTexture_buffers[cur_texture];
		Object generatedCx = this.getCx();
		uint32_t gc_cx = generatedCx;
		Object generatedCy = this.getCy();
		uint32_t gc_cy = generatedCy;
		Object generatedPitch = this.getPitch();
		uint32_t gc_pitch = generatedPitch;
		for (uint32_t y = 0;
		 y < gc_cy; y++) {
			uint8_t row = input + (gc_pitch * y);
			uint8_t out = data + (pitch * y);
			for (uint32_t x = 0;
			 x < gc_cx; x += 8) {
				__m128i pixels_blue = new __m128i();
				__m128i pixels_green = new __m128i();
				__m128i pixels_red = new __m128i();
				__m128i pixels_result = new __m128i();
				__m128i pixels_dest = new __m128i();
				__m128i pixels_src = (__m128i)(row + x * /*Error: Unsupported expression*/);
				__m128i pixels = /*Error: Function owner not recognized*/_mm_load_si128(pixels_src);
				__m128i zero = /*Error: Function owner not recognized*/_mm_setzero_si128();
				__m128i pixels_low = /*Error: Function owner not recognized*/_mm_unpacklo_epi16(pixels, ModernizedCProgram.zero);
				__m128i pixels_high = /*Error: Function owner not recognized*/_mm_unpackhi_epi16(pixels, ModernizedCProgram.zero);
				__m128i blue_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i blue_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i green_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i green_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i red_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i red_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				pixels_blue = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, blue_channel_mask);
				pixels_blue = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_blue, 3);
				pixels_blue = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_blue, blue_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, green_channel_mask);
				pixels_green = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_green, green_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_green, 5);
				pixels_red = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, red_channel_mask);
				pixels_red = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_red, red_offset);
				pixels_red = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_red, 8);
				pixels_result = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_blue);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_green);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_red);
				pixels_dest = (__m128i)(out + x * /*Error: Unsupported expression*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_store_si128(pixels_dest, pixels_result);
				pixels_blue = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, blue_channel_mask);
				pixels_blue = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_blue, 3);
				pixels_blue = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_blue, blue_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, green_channel_mask);
				pixels_green = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_green, green_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_green, 5);
				pixels_red = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, red_channel_mask);
				pixels_red = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_red, red_offset);
				pixels_red = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_red, 8);
				pixels_result = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_blue);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_green);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_red);
				pixels_dest = (__m128i)(out + (x + 4) * /*Error: Unsupported expression*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_store_si128(pixels_dest, pixels_result);
			}
		}
	}
	public void copy_b5g5r5a1_tex(int cur_texture, Object data, Object pitch) {
		Object generatedTexture_buffers = this.getTexture_buffers();
		uint8_t input = generatedTexture_buffers[cur_texture];
		Object generatedCx = this.getCx();
		uint32_t gc_cx = generatedCx;
		Object generatedCy = this.getCy();
		uint32_t gc_cy = generatedCy;
		Object generatedPitch = this.getPitch();
		uint32_t gc_pitch = generatedPitch;
		for (uint32_t y = 0;
		 y < gc_cy; y++) {
			uint8_t row = input + (gc_pitch * y);
			uint8_t out = data + (pitch * y);
			for (uint32_t x = 0;
			 x < gc_cx; x += 8) {
				__m128i pixels_blue = new __m128i();
				__m128i pixels_green = new __m128i();
				__m128i pixels_red = new __m128i();
				__m128i pixels_alpha = new __m128i();
				__m128i pixels_result = new __m128i();
				__m128i pixels_dest = new __m128i();
				__m128i pixels_src = (__m128i)(row + x * /*Error: Unsupported expression*/);
				__m128i pixels = /*Error: Function owner not recognized*/_mm_load_si128(pixels_src);
				__m128i zero = /*Error: Function owner not recognized*/_mm_setzero_si128();
				__m128i pixels_low = /*Error: Function owner not recognized*/_mm_unpacklo_epi16(pixels, ModernizedCProgram.zero);
				__m128i pixels_high = /*Error: Function owner not recognized*/_mm_unpackhi_epi16(pixels, ModernizedCProgram.zero);
				__m128i blue_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i blue_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i green_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i green_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i red_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i red_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i alpha_channel_mask = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i alpha_offset = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				__m128i alpha_mask32 = /*Error: Function owner not recognized*/_mm_set1_epi32(-1024);
				pixels_blue = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, blue_channel_mask);
				pixels_blue = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_blue, 3);
				pixels_blue = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_blue, blue_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, green_channel_mask);
				pixels_green = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_green, green_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_green, 6);
				pixels_red = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, red_channel_mask);
				pixels_red = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_red, red_offset);
				pixels_red = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_red, 9);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_and_si128(pixels_low, alpha_channel_mask);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_srli_epi32(pixels_alpha, 15);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_sub_epi32(pixels_alpha, alpha_offset);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_andnot_si128(pixels_alpha, alpha_mask32);
				pixels_result = pixels_red;
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_alpha);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_blue);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_green);
				pixels_dest = (__m128i)(out + x * /*Error: Unsupported expression*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_store_si128(pixels_dest, pixels_result);
				pixels_blue = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, blue_channel_mask);
				pixels_blue = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_blue, 3);
				pixels_blue = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_blue, blue_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, green_channel_mask);
				pixels_green = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_green, green_offset);
				pixels_green = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_green, 6);
				pixels_red = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, red_channel_mask);
				pixels_red = /*Error: Function owner not recognized*/_mm_add_epi32(pixels_red, red_offset);
				pixels_red = /*Error: Function owner not recognized*/_mm_slli_epi32(pixels_red, 9);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_and_si128(pixels_high, alpha_channel_mask);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_srli_epi32(pixels_alpha, 15);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_sub_epi32(pixels_alpha, alpha_offset);
				pixels_alpha = /*Error: Function owner not recognized*/_mm_andnot_si128(pixels_alpha, alpha_mask32);
				pixels_result = pixels_red;
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_alpha);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_blue);
				pixels_result = /*Error: Function owner not recognized*/_mm_or_si128(pixels_result, pixels_green);
				pixels_dest = (__m128i)(out + (x + 4) * /*Error: Unsupported expression*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_store_si128(pixels_dest, pixels_result);
			}
		}
	}
	public void copy_16bit_tex(int cur_texture, Object data, Object pitch) {
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		Object generatedFormat = generatedGlobal_hook_info.getFormat();
		if (generatedFormat == DXGI_FORMAT_B5G5R5A1_UNORM) {
			gc.copy_b5g5r5a1_tex(cur_texture, data, pitch);
		}  else if (generatedFormat == DXGI_FORMAT_B5G6R5_UNORM) {
			gc.copy_b5g6r5_tex(cur_texture, data, pitch);
		} 
	}
	public void copy_shmem_tex() {
		int cur_texture;
		HANDLE mutex = ((Object)0);
		uint32_t pitch = new uint32_t();
		int next_texture;
		uint8_t data = new uint8_t();
		shmem_data generatedShmem_data = this.getShmem_data();
		if (!generatedShmem_data) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLast_tex = generatedShmem_data.getLast_tex();
		cur_texture = generatedLast_tex;
		if (cur_texture < 0 || cur_texture > 1) {
			return /*Error: Unsupported expression*/;
		} 
		next_texture = cur_texture == 1 ? 0 : 1;
		Object generatedTexture_mutexes = this.getTexture_mutexes();
		if (ModernizedCProgram.object_signalled(generatedTexture_mutexes[cur_texture])) {
			mutex = generatedTexture_mutexes[cur_texture];
		}  else if (ModernizedCProgram.object_signalled(generatedTexture_mutexes[next_texture])) {
			mutex = generatedTexture_mutexes[next_texture];
			cur_texture = next_texture;
		} else {
				return /*Error: Unsupported expression*/;
		} 
		Object generatedTexture = this.getTexture();
		boolean generatedConvert_16bit = this.getConvert_16bit();
		Object generatedPitch = this.getPitch();
		Object generatedTexture_buffers = this.getTexture_buffers();
		Object generatedCy = this.getCy();
		if (ModernizedCProgram.gs_texture_map(generatedTexture, data, pitch)) {
			if (generatedConvert_16bit) {
				gc.copy_16bit_tex(cur_texture, data, pitch);
			}  else if (pitch == generatedPitch) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, generatedTexture_buffers[cur_texture], pitch * generatedCy);
			} else {
					uint8_t input = generatedTexture_buffers[cur_texture];
					uint32_t best_pitch = pitch < generatedPitch ? pitch : generatedPitch;
					for (uint32_t y = 0;
					 y < generatedCy; y++) {
						uint8_t line_in = input + generatedPitch * y;
						uint8_t line_out = data + pitch * y;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(line_out, line_in, best_pitch);
					}
			} 
			ModernizedCProgram.gs_texture_unmap(generatedTexture);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(mutex);
	}
	public boolean init_shmem_capture() {
		gs_color_format format;
		Object generatedTexture_buffers = this.getTexture_buffers();
		Object generatedData = this.getData();
		shmem_data generatedShmem_data = this.getShmem_data();
		Object generatedTex1_offset = generatedShmem_data.getTex1_offset();
		generatedTexture_buffers[0] = (uint8_t)generatedData + generatedTex1_offset;
		Object generatedTex2_offset = generatedShmem_data.getTex2_offset();
		generatedTexture_buffers[1] = (uint8_t)generatedData + generatedTex2_offset;
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		Object generatedFormat = generatedGlobal_hook_info.getFormat();
		this.setConvert_16bit(ModernizedCProgram.is_16bit_format(generatedFormat));
		boolean generatedConvert_16bit = this.getConvert_16bit();
		gs_color_format.format = generatedConvert_16bit ? GS_BGRA : ModernizedCProgram.convert_format(generatedFormat);
		ModernizedCProgram.obs_enter_graphics();
		Object generatedTexture = this.getTexture();
		ModernizedCProgram.gs_texture_destroy(generatedTexture);
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		gs_texture gs_texture = new gs_texture();
		this.setTexture(gs_texture.gs_texture_create(generatedCx, generatedCy, gs_color_format.format, 1, ((Object)0), GS_DYNAMIC));
		ModernizedCProgram.obs_leave_graphics();
		obs_source generatedSource = this.getSource();
		if (!generatedTexture) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_shmem_capture: failed to create texture", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		this.setCopy_texture(copy_shmem_tex);
		return 1;
	}
	public boolean init_shtex_capture() {
		ModernizedCProgram.obs_enter_graphics();
		Object generatedTexture = this.getTexture();
		ModernizedCProgram.gs_texture_destroy(generatedTexture);
		shtex_data generatedShtex_data = this.getShtex_data();
		Object generatedTex_handle = generatedShtex_data.getTex_handle();
		gs_texture gs_texture = new gs_texture();
		this.setTexture(gs_texture.gs_texture_open_shared(generatedTex_handle));
		ModernizedCProgram.obs_leave_graphics();
		obs_source generatedSource = this.getSource();
		if (!generatedTexture) {
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] init_shtex_capture: failed to open shared handle", ModernizedCProgram.obs_source_get_name(generatedSource));
			return 0;
		} 
		return 1;
	}
	public boolean start_capture() {
		obs_source generatedSource = this.getSource();
		ModernizedCProgram.blog(LOG_DEBUG, "[game-capture: '%s'] Starting capture", ModernizedCProgram.obs_source_get_name(generatedSource));
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		capture_type generatedType = generatedGlobal_hook_info.getType();
		if (generatedType == capture_type.CAPTURE_TYPE_MEMORY) {
			if (!gc.init_shmem_capture()) {
				return 0;
			} 
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] memory capture successful", ModernizedCProgram.obs_source_get_name(generatedSource));
		} else {
				if (!gc.init_shtex_capture()) {
					return 0;
				} 
				ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] shared texture capture successful", ModernizedCProgram.obs_source_get_name(generatedSource));
		} 
		return 1;
	}
	public boolean capture_valid() {
		boolean generatedDwm_capture = this.getDwm_capture();
		Object generatedWindow = this.getWindow();
		if (!generatedDwm_capture && !/*Error: Function owner not recognized*/IsWindow(generatedWindow)) {
			return 0;
		} 
		Object generatedTarget_process = this.getTarget_process();
		return !ModernizedCProgram.object_signalled(generatedTarget_process);
	}
	public void check_foreground_window(double seconds) {
		double generatedCursor_check_time = this.getCursor_check_time();
		// Hides the cursor if the user isn't actively in the game// Hides the cursor if the user isn't actively in the gamegeneratedCursor_check_time += seconds;
		Object generatedProcess_id = this.getProcess_id();
		if (generatedCursor_check_time >= 0.1) {
			DWORD foreground_process_id = new DWORD();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetWindowThreadProcessId(/*Error: Function owner not recognized*/GetForegroundWindow(), foreground_process_id);
			if (generatedProcess_id != foreground_process_id) {
				this.setCursor_hidden(1);
			} else {
					this.setCursor_hidden(0);
			} 
			this.setCursor_check_time(0.0);
		} 
	}
	public void game_capture_render_cursor() {
		POINT p = new POINT(0);
		HWND window = new HWND();
		hook_info generatedGlobal_hook_info = this.getGlobal_hook_info();
		Object generatedBase_cx = generatedGlobal_hook_info.getBase_cx();
		Object generatedBase_cy = generatedGlobal_hook_info.getBase_cy();
		if (!generatedBase_cx || !generatedBase_cy) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedWindow = generatedGlobal_hook_info.getWindow();
		window = !!generatedWindow ? (HWND)(uintptr_t)generatedWindow : generatedWindow;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ClientToScreen(window, p);
		Object generatedCx = generatedGlobal_hook_info.getCx();
		double x_scale = (double)generatedCx / (double)generatedBase_cx;
		Object generatedCy = generatedGlobal_hook_info.getCy();
		double y_scale = (double)generatedCy / (double)generatedBase_cy;
		cursor_data generatedCursor_data = this.getCursor_data();
		Object generatedX = p.getX();
		Object generatedY = p.getY();
		generatedCursor_data.cursor_draw(-generatedX, -generatedY, x_scale, y_scale, generatedBase_cx, generatedBase_cy);
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public cursor_data getCursor_data() {
		return cursor_data;
	}
	public void setCursor_data(cursor_data newCursor_data) {
		cursor_data = newCursor_data;
	}
	public Object getInjector_process() {
		return injector_process;
	}
	public void setInjector_process(Object newInjector_process) {
		injector_process = newInjector_process;
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
	public Object getPitch() {
		return pitch;
	}
	public void setPitch(Object newPitch) {
		pitch = newPitch;
	}
	public Object getProcess_id() {
		return process_id;
	}
	public void setProcess_id(Object newProcess_id) {
		process_id = newProcess_id;
	}
	public Object getThread_id() {
		return thread_id;
	}
	public void setThread_id(Object newThread_id) {
		thread_id = newThread_id;
	}
	public Object getNext_window() {
		return next_window;
	}
	public void setNext_window(Object newNext_window) {
		next_window = newNext_window;
	}
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public double getRetry_time() {
		return retry_time;
	}
	public void setRetry_time(double newRetry_time) {
		retry_time = newRetry_time;
	}
	public double getFps_reset_time() {
		return fps_reset_time;
	}
	public void setFps_reset_time(double newFps_reset_time) {
		fps_reset_time = newFps_reset_time;
	}
	public double getRetry_interval() {
		return retry_interval;
	}
	public void setRetry_interval(double newRetry_interval) {
		retry_interval = newRetry_interval;
	}
	public dstr getTitle() {
		return title;
	}
	public void setTitle(dstr newTitle) {
		title = newTitle;
	}
	public dstr getClass() {
		return class;
	}
	public void setClass(dstr newClass) {
		class = newClass;
	}
	public dstr getExecutable() {
		return executable;
	}
	public void setExecutable(dstr newExecutable) {
		executable = newExecutable;
	}
	public window_priority getPriority() {
		return priority;
	}
	public void setPriority(window_priority newPriority) {
		priority = newPriority;
	}
	public Object getHotkey_pair() {
		return hotkey_pair;
	}
	public void setHotkey_pair(Object newHotkey_pair) {
		hotkey_pair = newHotkey_pair;
	}
	public Object getHotkey_window() {
		return hotkey_window;
	}
	public void setHotkey_window(Object newHotkey_window) {
		hotkey_window = newHotkey_window;
	}
	public Object getDeactivate_hook() {
		return deactivate_hook;
	}
	public void setDeactivate_hook(Object newDeactivate_hook) {
		deactivate_hook = newDeactivate_hook;
	}
	public Object getActivate_hook_now() {
		return activate_hook_now;
	}
	public void setActivate_hook_now(Object newActivate_hook_now) {
		activate_hook_now = newActivate_hook_now;
	}
	public boolean getWait_for_target_startup() {
		return wait_for_target_startup;
	}
	public void setWait_for_target_startup(boolean newWait_for_target_startup) {
		wait_for_target_startup = newWait_for_target_startup;
	}
	public boolean getShowing() {
		return showing;
	}
	public void setShowing(boolean newShowing) {
		showing = newShowing;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean newActive) {
		active = newActive;
	}
	public boolean getCapturing() {
		return capturing;
	}
	public void setCapturing(boolean newCapturing) {
		capturing = newCapturing;
	}
	public boolean getActivate_hook() {
		return activate_hook;
	}
	public void setActivate_hook(boolean newActivate_hook) {
		activate_hook = newActivate_hook;
	}
	public boolean getProcess_is_64bit() {
		return process_is_64bit;
	}
	public void setProcess_is_64bit(boolean newProcess_is_64bit) {
		process_is_64bit = newProcess_is_64bit;
	}
	public boolean getError_acquiring() {
		return error_acquiring;
	}
	public void setError_acquiring(boolean newError_acquiring) {
		error_acquiring = newError_acquiring;
	}
	public boolean getDwm_capture() {
		return dwm_capture;
	}
	public void setDwm_capture(boolean newDwm_capture) {
		dwm_capture = newDwm_capture;
	}
	public boolean getInitial_config() {
		return initial_config;
	}
	public void setInitial_config(boolean newInitial_config) {
		initial_config = newInitial_config;
	}
	public boolean getConvert_16bit() {
		return convert_16bit;
	}
	public void setConvert_16bit(boolean newConvert_16bit) {
		convert_16bit = newConvert_16bit;
	}
	public boolean getIs_app() {
		return is_app;
	}
	public void setIs_app(boolean newIs_app) {
		is_app = newIs_app;
	}
	public boolean getCursor_hidden() {
		return cursor_hidden;
	}
	public void setCursor_hidden(boolean newCursor_hidden) {
		cursor_hidden = newCursor_hidden;
	}
	public game_capture_config getConfig() {
		return config;
	}
	public void setConfig(game_capture_config newConfig) {
		config = newConfig;
	}
	public Object getPipe() {
		return pipe;
	}
	public void setPipe(Object newPipe) {
		pipe = newPipe;
	}
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public hook_info getGlobal_hook_info() {
		return global_hook_info;
	}
	public void setGlobal_hook_info(hook_info newGlobal_hook_info) {
		global_hook_info = newGlobal_hook_info;
	}
	public Object getKeepalive_mutex() {
		return keepalive_mutex;
	}
	public void setKeepalive_mutex(Object newKeepalive_mutex) {
		keepalive_mutex = newKeepalive_mutex;
	}
	public Object getHook_init() {
		return hook_init;
	}
	public void setHook_init(Object newHook_init) {
		hook_init = newHook_init;
	}
	public Object getHook_restart() {
		return hook_restart;
	}
	public void setHook_restart(Object newHook_restart) {
		hook_restart = newHook_restart;
	}
	public Object getHook_stop() {
		return hook_stop;
	}
	public void setHook_stop(Object newHook_stop) {
		hook_stop = newHook_stop;
	}
	public Object getHook_ready() {
		return hook_ready;
	}
	public void setHook_ready(Object newHook_ready) {
		hook_ready = newHook_ready;
	}
	public Object getHook_exit() {
		return hook_exit;
	}
	public void setHook_exit(Object newHook_exit) {
		hook_exit = newHook_exit;
	}
	public Object getHook_data_map() {
		return hook_data_map;
	}
	public void setHook_data_map(Object newHook_data_map) {
		hook_data_map = newHook_data_map;
	}
	public Object getGlobal_hook_info_map() {
		return global_hook_info_map;
	}
	public void setGlobal_hook_info_map(Object newGlobal_hook_info_map) {
		global_hook_info_map = newGlobal_hook_info_map;
	}
	public Object getTarget_process() {
		return target_process;
	}
	public void setTarget_process(Object newTarget_process) {
		target_process = newTarget_process;
	}
	public Object getTexture_mutexes() {
		return texture_mutexes;
	}
	public void setTexture_mutexes(Object newTexture_mutexes) {
		texture_mutexes = newTexture_mutexes;
	}
	public Object getApp_sid() {
		return app_sid;
	}
	public void setApp_sid(Object newApp_sid) {
		app_sid = newApp_sid;
	}
	public int getRetrying() {
		return retrying;
	}
	public void setRetrying(int newRetrying) {
		retrying = newRetrying;
	}
	public double getCursor_check_time() {
		return cursor_check_time;
	}
	public void setCursor_check_time(double newCursor_check_time) {
		cursor_check_time = newCursor_check_time;
	}
	public shmem_data getShmem_data() {
		return shmem_data;
	}
	public void setShmem_data(shmem_data newShmem_data) {
		shmem_data = newShmem_data;
	}
	public Object getTexture_buffers() {
		return texture_buffers;
	}
	public void setTexture_buffers(Object newTexture_buffers) {
		texture_buffers = newTexture_buffers;
	}
	public shtex_data getShtex_data() {
		return shtex_data;
	}
	public void setShtex_data(shtex_data newShtex_data) {
		shtex_data = newShtex_data;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getCopy_texture() {
		return copy_texture;
	}
	public void setCopy_texture(Object newCopy_texture) {
		copy_texture = newCopy_texture;
	}
}
