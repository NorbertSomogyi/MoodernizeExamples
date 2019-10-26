package application;

/* user hotkeys */
public class obs_core_hotkeys {
	private Object mutex;
	private Object next_id;
	private Object next_pair_id;
	private Object hotkey_thread;
	private Object hotkey_thread_initialized;
	private Object stop_event;
	private Object thread_disable_press;
	private Object strict_modifiers;
	private Object reroute_hotkeys;
	private Object router_func;
	private Object router_func_data;
	private obs_hotkeys_platform platform_context;
	private Object name_map_init_token;
	private obs_hotkey_name_map name_map;
	private Object signals;
	private Object translations;
	private Byte mute;
	private Byte unmute;
	private Byte push_to_mute;
	private Byte push_to_talk;
	private Byte sceneitem_show;
	private Byte sceneitem_hide;
	
	public obs_core_hotkeys(Object mutex, Object next_id, Object next_pair_id, Object hotkey_thread, Object hotkey_thread_initialized, Object stop_event, Object thread_disable_press, Object strict_modifiers, Object reroute_hotkeys, Object router_func, Object router_func_data, obs_hotkeys_platform platform_context, Object name_map_init_token, obs_hotkey_name_map name_map, Object signals, Object translations, Byte mute, Byte unmute, Byte push_to_mute, Byte push_to_talk, Byte sceneitem_show, Byte sceneitem_hide) {
		setMutex(mutex);
		setNext_id(next_id);
		setNext_pair_id(next_pair_id);
		setHotkey_thread(hotkey_thread);
		setHotkey_thread_initialized(hotkey_thread_initialized);
		setStop_event(stop_event);
		setThread_disable_press(thread_disable_press);
		setStrict_modifiers(strict_modifiers);
		setReroute_hotkeys(reroute_hotkeys);
		setRouter_func(router_func);
		setRouter_func_data(router_func_data);
		setPlatform_context(platform_context);
		setName_map_init_token(name_map_init_token);
		setName_map(name_map);
		setSignals(signals);
		setTranslations(translations);
		setMute(mute);
		setUnmute(unmute);
		setPush_to_mute(push_to_mute);
		setPush_to_talk(push_to_talk);
		setSceneitem_show(sceneitem_show);
		setSceneitem_hide(sceneitem_hide);
	}
	public obs_core_hotkeys() {
	}
	
	public Object obs_hotkeys_platform_init() {
		.CFNotificationCenterAddObserver(.CFNotificationCenterGetDistributedCenter(), hotkeys, input_method_changed, kTISNotifySelectedKeyboardInputSourceChanged, NULL, CFNotificationSuspensionBehaviorDeliverImmediately);
		ModernizedCProgram.input_method_changed(NULL, hotkeys, NULL, NULL, NULL);
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		return generatedPlatform_context != NULL;
		this.setPlatform_context(ModernizedCProgram.bzalloc());
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		Object generatedVk_codes = generatedPlatform_context.getVk_codes();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			generatedVk_codes[i] = ModernizedCProgram.get_virtual_key(i);
		}
		return true;
		 display = .XOpenDisplay(((Object)0));
		if (!display) {
			return false;
		} 
		this.setPlatform_context(ModernizedCProgram.bzalloc());
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		generatedPlatform_context.setDisplay(display);
		hotkeys.fill_base_keysyms();
		hotkeys.fill_keycodes();
		return true;
	}
	public void obs_hotkeys_platform_free() {
		.CFNotificationCenterRemoveEveryObserver(.CFNotificationCenterGetDistributedCenter(), hotkeys);
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		generatedPlatform_context.hotkeys_release();
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		ModernizedCProgram.bfree(generatedPlatform_context);
		this.setPlatform_context(((Object)0));
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		obs_hotkeys_platform_t context = generatedPlatform_context;
		Object generatedKeycodes = context.getKeycodes();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			.da_free(generatedKeycodes[i].getList());
		}
		Object generatedDisplay = context.getDisplay();
		.XCloseDisplay(generatedDisplay);
		Object generatedKeysyms = context.getKeysyms();
		ModernizedCProgram.bfree(generatedKeysyms);
		ModernizedCProgram.bfree(context);
		this.setPlatform_context(((Object)0));
	}
	public void fill_base_keysyms() {
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		Object generatedBase_keysyms = generatedPlatform_context.getBase_keysyms();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			generatedBase_keysyms[i] = ModernizedCProgram.get_keysym(i);
		}
	}
	public Object fill_keycodes() {
		obs_hotkeys_platform generatedPlatform_context = this.getPlatform_context();
		obs_hotkeys_platform_t context = generatedPlatform_context;
		Object generatedDisplay = context.getDisplay();
		 connection = .XGetXCBConnection(generatedDisplay);
		xcb_setup_t setup = .xcb_get_setup(connection);
		 cookie = new ();
		 reply = new ();
		 error = ((Object)0);
		int code;
		int mincode = setup.getXcb_setup_t();
		int maxcode = setup.getXcb_setup_t();
		context.setMin_keycode(setup.getXcb_setup_t());
		cookie = .xcb_get_keyboard_mapping(connection, mincode, maxcode - mincode + 1);
		reply = .xcb_get_keyboard_mapping_reply(connection, cookie, error);
		if (error || !reply) {
			ModernizedCProgram.blog(LOG_WARNING, "xcb_get_keyboard_mapping_reply failed");
			;
		} 
		 keysyms = .xcb_get_keyboard_mapping_keysyms(reply);
		int syms_per_code = (int)reply.getKeysyms_per_keycode();
		context.setNum_keysyms((maxcode - mincode + 1) * syms_per_code);
		context.setSyms_per_code(syms_per_code);
		Object generatedNum_keysyms = context.getNum_keysyms();
		context.setKeysyms(ModernizedCProgram.bmemdup(keysyms,  * generatedNum_keysyms));
		for (code = mincode; code <= maxcode; code++) {
			 sym = new ();
			obs_key_t key = new obs_key_t();
			sym = keysyms[(code - mincode) * syms_per_code];
			for (int i = 0;
			 i < syms_per_code; i++) {
				if (!sym[i]) {
					break;
				} 
				if (sym[i] == XK_Super_L) {
					context.setSuper_l_code(code);
					break;
				}  else if (sym[i] == XK_Super_R) {
					context.setSuper_r_code(code);
					break;
				} else {
						ModernizedCProgram.key = context.key_from_base_keysym(sym[i]);
						if (ModernizedCProgram.key != obs_key.OBS_KEY_NONE) {
							context.add_key(ModernizedCProgram.key, code);
							break;
						} 
				} 
			}
		}
		.free(error);
		return error != ((Object)0) || reply == ((Object)0);
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getNext_id() {
		return next_id;
	}
	public void setNext_id(Object newNext_id) {
		next_id = newNext_id;
	}
	public Object getNext_pair_id() {
		return next_pair_id;
	}
	public void setNext_pair_id(Object newNext_pair_id) {
		next_pair_id = newNext_pair_id;
	}
	public Object getHotkey_thread() {
		return hotkey_thread;
	}
	public void setHotkey_thread(Object newHotkey_thread) {
		hotkey_thread = newHotkey_thread;
	}
	public Object getHotkey_thread_initialized() {
		return hotkey_thread_initialized;
	}
	public void setHotkey_thread_initialized(Object newHotkey_thread_initialized) {
		hotkey_thread_initialized = newHotkey_thread_initialized;
	}
	public Object getStop_event() {
		return stop_event;
	}
	public void setStop_event(Object newStop_event) {
		stop_event = newStop_event;
	}
	public Object getThread_disable_press() {
		return thread_disable_press;
	}
	public void setThread_disable_press(Object newThread_disable_press) {
		thread_disable_press = newThread_disable_press;
	}
	public Object getStrict_modifiers() {
		return strict_modifiers;
	}
	public void setStrict_modifiers(Object newStrict_modifiers) {
		strict_modifiers = newStrict_modifiers;
	}
	public Object getReroute_hotkeys() {
		return reroute_hotkeys;
	}
	public void setReroute_hotkeys(Object newReroute_hotkeys) {
		reroute_hotkeys = newReroute_hotkeys;
	}
	public Object getRouter_func() {
		return router_func;
	}
	public void setRouter_func(Object newRouter_func) {
		router_func = newRouter_func;
	}
	public Object getRouter_func_data() {
		return router_func_data;
	}
	public void setRouter_func_data(Object newRouter_func_data) {
		router_func_data = newRouter_func_data;
	}
	public obs_hotkeys_platform getPlatform_context() {
		return platform_context;
	}
	public void setPlatform_context(obs_hotkeys_platform newPlatform_context) {
		platform_context = newPlatform_context;
	}
	public Object getName_map_init_token() {
		return name_map_init_token;
	}
	public void setName_map_init_token(Object newName_map_init_token) {
		name_map_init_token = newName_map_init_token;
	}
	public obs_hotkey_name_map getName_map() {
		return name_map;
	}
	public void setName_map(obs_hotkey_name_map newName_map) {
		name_map = newName_map;
	}
	public Object getSignals() {
		return signals;
	}
	public void setSignals(Object newSignals) {
		signals = newSignals;
	}
	public Object getTranslations() {
		return translations;
	}
	public void setTranslations(Object newTranslations) {
		translations = newTranslations;
	}
	public Byte getMute() {
		return mute;
	}
	public void setMute(Byte newMute) {
		mute = newMute;
	}
	public Byte getUnmute() {
		return unmute;
	}
	public void setUnmute(Byte newUnmute) {
		unmute = newUnmute;
	}
	public Byte getPush_to_mute() {
		return push_to_mute;
	}
	public void setPush_to_mute(Byte newPush_to_mute) {
		push_to_mute = newPush_to_mute;
	}
	public Byte getPush_to_talk() {
		return push_to_talk;
	}
	public void setPush_to_talk(Byte newPush_to_talk) {
		push_to_talk = newPush_to_talk;
	}
	public Byte getSceneitem_show() {
		return sceneitem_show;
	}
	public void setSceneitem_show(Byte newSceneitem_show) {
		sceneitem_show = newSceneitem_show;
	}
	public Byte getSceneitem_hide() {
		return sceneitem_hide;
	}
	public void setSceneitem_hide(Byte newSceneitem_hide) {
		sceneitem_hide = newSceneitem_hide;
	}
}
