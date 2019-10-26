package application;

public class obs_hotkeys_platform {
	private Object refs;
	private Object tis;
	private Object layout_data;
	private Object layout;
	private Object manager;
	
	public obs_hotkeys_platform(Object refs, Object tis, Object layout_data, Object layout, Object manager) {
		setRefs(refs);
		setTis(tis);
		setLayout_data(layout_data);
		setLayout(layout);
		setManager(manager);
	}
	public obs_hotkeys_platform() {
	}
	
	public void hotkeys_retain() {
		Object generatedRefs = this.getRefs();
		ModernizedCProgram.os_atomic_inc_long(generatedRefs);
	}
	public void hotkeys_release() {
		Object generatedRefs = this.getRefs();
		if (ModernizedCProgram.os_atomic_dec_long(generatedRefs) == -1) {
			plat.free_hotkeys_platform();
		} 
	}
	public Object copy_devices(Object page, Object usage) {
		 mask = ModernizedCProgram.copy_device_mask(page, usage);
		Object generatedManager = this.getManager();
		.IOHIDManagerSetDeviceMatching(generatedManager, mask);
		.CFRelease(mask);
		 devices = .IOHIDManagerCopyDevices(generatedManager);
		if (!devices) {
			return NULL;
		} 
		if (.CFSetGetCount(devices) < 1) {
			.CFRelease(devices);
			return NULL;
		} 
		return devices;
	}
	public void load_key(Object key) {
		 usage_code = .IOHIDElementGetUsage(key);
		 carbon_code = ModernizedCProgram.usage_to_carbon(usage_code);
		if (carbon_code == -1024) {
			return ;
		} 
		obs_key_t obs_key = ModernizedCProgram.obs_key_from_virtual_key(carbon_code);
		if (obs_key == obs_key.OBS_KEY_NONE) {
			return ;
		} 
		Object generatedKeys = this.getKeys();
		.da_push_back(generatedKeys[obs_key], key);
		.CFRetain(().da_end(generatedKeys[obs_key]));
	}
	public void load_keyboard(Object keyboard) {
		 keys = .IOHIDDeviceCopyMatchingElements(keyboard, NULL, kIOHIDOptionsTypeNone);
		if (!keys) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Getting keyboard keys failed");
			return ;
		} 
		 count = .CFArrayGetCount(keys);
		if (!count) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Keyboard has no keys");
			.CFRelease(keys);
			return ;
		} 
		for ( i = 0;
		 i < count; i++) {
			 key = ().CFArrayGetValueAtIndex(keys, i);
			if (.IOHIDElementGetUsagePage(ModernizedCProgram.key) != kHIDPage_KeyboardOrKeypad) {
				continue;
			} 
			plat.load_key(ModernizedCProgram.key);
		}
		.CFRelease(keys);
	}
	public Object init_keyboard() {
		 keyboards = plat.copy_devices(kHIDPage_GenericDesktop, kHIDUsage_GD_Keyboard);
		if (!keyboards) {
			return false;
		} 
		 count = .CFSetGetCount(keyboards);
		[] devices = new ();
		.CFSetGetValues(keyboards, devices);
		for ( i = 0;
		 i < count; i++) {
			plat.load_keyboard(()devices[i]);
		}
		.CFRelease(keyboards);
		return true;
	}
	public void free_hotkeys_platform() {
		if (!plat) {
			return ;
		} 
		Object generatedTis = this.getTis();
		if (generatedTis) {
			.CFRelease(generatedTis);
			this.setTis(NULL);
		} 
		Object generatedLayout_data = this.getLayout_data();
		if (generatedLayout_data) {
			.CFRelease(generatedLayout_data);
			this.setLayout_data(NULL);
		} 
		Object generatedManager = this.getManager();
		if (generatedManager) {
			.CFRelease(generatedManager);
			this.setManager(NULL);
		} 
		Object generatedKeys = this.getKeys();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			for (size_t j = 0;
			 j < generatedKeys[i].getNum(); j++) {
				.CFRelease(generatedKeys[i].getArray()[j]);
			}
			.da_free(generatedKeys[i]);
		}
		ModernizedCProgram.bfree(plat);
	}
	public Object init_hotkeys_platform() {
		if (!plat_) {
			return false;
		} 
		plat_ = ModernizedCProgram.bzalloc();
		obs_hotkeys_platform_t plat = plat_;
		if (!plat) {
			plat_ = NULL;
			return false;
		} 
		plat.setTis(.TISCopyCurrentKeyboardLayoutInputSource());
		Object generatedTis = plat.getTis();
		plat.setLayout_data(().TISGetInputSourceProperty(generatedTis, kTISPropertyUnicodeKeyLayoutData));
		Object generatedLayout_data = plat.getLayout_data();
		if (!generatedLayout_data) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Failed getting LayoutData");
			;
		} 
		.CFRetain(generatedLayout_data);
		plat.setLayout(().CFDataGetBytePtr(generatedLayout_data));
		plat.setManager(.IOHIDManagerCreate(kCFAllocatorDefault, kIOHIDOptionsTypeNone));
		Object generatedManager = plat.getManager();
		 openStatus = .IOHIDManagerOpen(generatedManager, kIOHIDOptionsTypeNone);
		if (openStatus != kIOReturnSuccess) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Failed opening HIDManager");
			;
		} 
		plat.init_keyboard();
		return true;
		plat_ = NULL;
		return false;
	}
	public Object obs_hotkeys_platform_is_pressed(obs_key key) {
		 mouse_pressed = false;
		if (ModernizedCProgram.mouse_button_pressed(key, mouse_pressed)) {
			return mouse_pressed;
		} 
		if (!plat) {
			return false;
		} 
		if (key >= obs_key.OBS_KEY_LAST_VALUE) {
			return false;
		} 
		Object generatedKeys = this.getKeys();
		for (size_t i = 0;
		 i < generatedKeys[key].getNum(); ) {
			 element = generatedKeys[key].getArray()[i];
			 value = 0;
			 device = .IOHIDElementGetDevice(element);
			if (.IOHIDDeviceGetValue(device, element, value) != kIOReturnSuccess) {
				i += 1;
				continue;
			} 
			if (!value) {
				.CFRelease(element);
				.da_erase(generatedKeys[key], i);
				continue;
			} 
			if (.IOHIDValueGetIntegerValue(value) == 1) {
				return true;
			} 
			i += 1;
		}
		return false;
		if (key == obs_key.OBS_KEY_META) {
			return ModernizedCProgram.vk_down(-1024) || ModernizedCProgram.vk_down(-1024);
		} 
		.UNUSED_PARAMETER(context);
		return ModernizedCProgram.vk_down(ModernizedCProgram.obs_key_to_virtual_key(key));
		Object generatedDisplay = context.getDisplay();
		 conn = .XGetXCBConnection(generatedDisplay);
		if (key >= obs_key.OBS_KEY_MOUSE1 && key <= obs_key.OBS_KEY_MOUSE29) {
			return ModernizedCProgram.mouse_button_pressed(conn, context, key);
		} else {
				return context.key_pressed(conn, key);
		} 
	}
	public obs_key key_from_base_keysym(Object code) {
		Object generatedBase_keysyms = this.getBase_keysyms();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			if (generatedBase_keysyms[i] == ()code) {
				return (obs_key_t)i;
			} 
		}
		return obs_key.OBS_KEY_NONE;
	}
	public void add_key(obs_key key, int code) {
		 kc = ()code;
		Object generatedKeycodes = this.getKeycodes();
		.da_push_back(generatedKeycodes[key].getList(), kc);
		if (generatedKeycodes[key].getList().getNum() > 1) {
			ModernizedCProgram.blog(LOG_DEBUG, "found alternate keycode %d for %s which already has keycode %d", code, ModernizedCProgram.obs_key_to_name(key), (int)generatedKeycodes[key].getList().getArray()[0]);
		} 
	}
	public Object default_screen(Object connection) {
		Object generatedDisplay = this.getDisplay();
		int def_screen_idx = .XDefaultScreen(generatedDisplay);
		 iter = new ();
		iter = .xcb_setup_roots_iterator(.xcb_get_setup(connection));
		while (iter.getRem()) {
			if (def_screen_idx-- == 0) {
				return iter.getData();
			} 
			.xcb_screen_next(iter);
		}
		return ((Object)0);
	}
	public Object root_window(Object connection) {
		 screen = context.default_screen(connection);
		if (screen) {
			return screen.getRoot();
		} 
		return 0;
	}
	public Object key_pressed(Object connection, obs_key key) {
		Object generatedKeycodes = this.getKeycodes();
		keycode_list codes = generatedKeycodes[key];
		 error = ((Object)0);
		 reply = new ();
		 pressed = false;
		reply = .xcb_query_keymap_reply(connection, .xcb_query_keymap(connection), error);
		Object generatedSuper_l_code = this.getSuper_l_code();
		Object generatedSuper_r_code = this.getSuper_r_code();
		Object generatedList = codes.getList();
		if (error) {
			ModernizedCProgram.blog(LOG_WARNING, "xcb_query_keymap failed");
		}  else if (key == obs_key.OBS_KEY_META) {
			pressed = ModernizedCProgram.keycode_pressed(reply, generatedSuper_l_code) || ModernizedCProgram.keycode_pressed(reply, generatedSuper_r_code);
		} else {
				for (size_t i = 0;
				 i < generatedList.getNum(); i++) {
					if (ModernizedCProgram.keycode_pressed(reply, generatedList.getArray()[i])) {
						pressed = true;
						break;
					} 
				}
		} 
		.free(reply);
		.free(error);
		return pressed;
	}
	public obs_key key_from_keycode(Object code) {
		Object generatedKeycodes = this.getKeycodes();
		Object generatedList = codes.getList();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			keycode_list codes = generatedKeycodes[i];
			for (size_t j = 0;
			 j < generatedList.getNum(); j++) {
				if (generatedList.getArray()[j] == code) {
					return (obs_key_t)i;
				} 
			}
		}
		return obs_key.OBS_KEY_NONE;
	}
	public Object getRefs() {
		return refs;
	}
	public void setRefs(Object newRefs) {
		refs = newRefs;
	}
	public Object getTis() {
		return tis;
	}
	public void setTis(Object newTis) {
		tis = newTis;
	}
	public Object getLayout_data() {
		return layout_data;
	}
	public void setLayout_data(Object newLayout_data) {
		layout_data = newLayout_data;
	}
	public Object getLayout() {
		return layout;
	}
	public void setLayout(Object newLayout) {
		layout = newLayout;
	}
	public Object getManager() {
		return manager;
	}
	public void setManager(Object newManager) {
		manager = newManager;
	}
}
