package application;

public class obs_hotkeys_platform {
	private Object display;
	private Object base_keysyms;
	private Object keycodes;
	private Object min_keycode;
	private Object super_l_code;
	private Object super_r_code;
	private Object keysyms;
	private int num_keysyms;
	private int syms_per_code;
	
	public obs_hotkeys_platform(Object display, Object base_keysyms, Object keycodes, Object min_keycode, Object super_l_code, Object super_r_code, Object keysyms, int num_keysyms, int syms_per_code) {
		setDisplay(display);
		setBase_keysyms(base_keysyms);
		setKeycodes(keycodes);
		setMin_keycode(min_keycode);
		setSuper_l_code(super_l_code);
		setSuper_r_code(super_r_code);
		setKeysyms(keysyms);
		setNum_keysyms(num_keysyms);
		setSyms_per_code(syms_per_code);
	}
	public obs_hotkeys_platform() {
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
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedKeycodes[key].getList(), kc);
		if (generatedKeycodes[key].getList().getNum() > 1) {
			ModernizedCProgram.blog(LOG_DEBUG, "found alternate keycode %d for %s which already has keycode %d", code, ModernizedCProgram.obs_key_to_name(key), (int)generatedKeycodes[key].getList().getArray()[0]);
		} 
	}
	public Object default_screen(Object connection) {
		Object generatedDisplay = this.getDisplay();
		int def_screen_idx = /*Error: Function owner not recognized*/XDefaultScreen(generatedDisplay);
		 iter = new ();
		iter = /*Error: Function owner not recognized*/xcb_setup_roots_iterator(/*Error: Function owner not recognized*/xcb_get_setup(connection));
		while (iter.getRem()) {
			if (def_screen_idx-- == 0) {
				return iter.getData();
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xcb_screen_next(iter);
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
	public Object mouse_button_pressed(Object connection, obs_key key) {
		 ret = false;
		// Mouse 2 for OBS is Right Click and Mouse 3 is Wheel Click.// Mouse Wheel axis clicks (xinput mot->detail 4 5 6 7) are ignored.
		 error = ((Object)0);
		 qpc = new ();
		 reply = new ();
		qpc = /*Error: Function owner not recognized*/xcb_query_pointer(connection, context.root_window(connection));
		reply = /*Error: Function owner not recognized*/xcb_query_pointer_reply(connection, qpc, error);
		if (error) {
			ModernizedCProgram.blog(LOG_WARNING, "xcb_query_pointer_reply failed");
		} else {
				uint16_t buttons = reply.getMask();
				switch (key) {
				case obs_key.OBS_KEY_MOUSE3:
						ret = buttons & XCB_BUTTON_MASK_2;
						break;
				case obs_key.OBS_KEY_MOUSE2:
						ret = buttons & XCB_BUTTON_MASK_3;
						break;
				case obs_key.OBS_KEY_MOUSE1:
						ret = buttons & XCB_BUTTON_MASK_1;
						break;
				default:
						;
				}
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(reply);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(error);
		return ret;
		int button = 0;
		switch (key) {
		case obs_key.OBS_KEY_MOUSE28:
				button = 28 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE1:
				button = 1 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE13:
				button = 13 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE7:
				button = 7 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE24:
				button = 24 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE11:
				button = 11 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE18:
				button = 18 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE12:
				button = 12 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE23:
				button = 23 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE9:
				button = 9 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE5:
				button = 5 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE19:
				button = 19 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE21:
				button = 21 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE16:
				button = 16 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE10:
				button = 10 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE14:
				button = 14 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE15:
				button = 15 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE6:
				button = 6 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE2:
				button = 2 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE27:
				button = 27 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE17:
				button = 17 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE20:
				button = 20 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE25:
				button = 25 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE22:
				button = 22 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE3:
				button = 3 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE26:
				button = 26 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE8:
				button = 8 - 1;
				break;
		case obs_key.OBS_KEY_MOUSE29:
				button = 29 - 1;
				break;
				break;
		case obs_key.OBS_KEY_MOUSE4:
				button = 4 - 1;
				break;
		default:
				return false;
		}
		 NSEvent = /*Error: Function owner not recognized*/objc_getClass("NSEvent");
		 pressedMouseButtonsSel = /*Error: Function owner not recognized*/sel_registerName("pressedMouseButtons");
		int func;
		func pressedMouseButtons = (func)objc_msgSend;
		NSUInteger buttons = (NSUInteger)/*Error: Function owner not recognized*/pressedMouseButtons(()NSEvent, pressedMouseButtonsSel);
		pressed = (buttons & (1 << button)) != 0;
		return true;
	}
	public Object key_pressed(Object connection, obs_key key) {
		Object generatedKeycodes = this.getKeycodes();
		keycode_list codes = generatedKeycodes[key];
		 error = ((Object)0);
		 reply = new ();
		 pressed = false;
		reply = /*Error: Function owner not recognized*/xcb_query_keymap_reply(connection, /*Error: Function owner not recognized*/xcb_query_keymap(connection), error);
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
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(reply);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(error);
		return pressed;
	}
	public Object obs_hotkeys_platform_is_pressed(obs_key key) {
		Object generatedDisplay = this.getDisplay();
		 conn = /*Error: Function owner not recognized*/XGetXCBConnection(generatedDisplay);
		if (key >= obs_key.OBS_KEY_MOUSE1 && key <= obs_key.OBS_KEY_MOUSE29) {
			return context.mouse_button_pressed(conn, key);
		} else {
				return context.key_pressed(conn, key);
		} 
		 mouse_pressed = false;
		if (mouse_pressed.mouse_button_pressed(key)) {
			return mouse_pressed;
		} 
		if (!plat) {
			return false;
		} 
		if (key >= obs_key.OBS_KEY_LAST_VALUE) {
			return false;
		} 
		Object generatedKeys = plat.getKeys();
		for (size_t i = 0;
		 i < generatedKeys[key].getNum(); /*Error: Unsupported expression*/) {
			 element = generatedKeys[key].getArray()[i];
			 value = 0;
			 device = /*Error: Function owner not recognized*/IOHIDElementGetDevice(element);
			if (/*Error: Function owner not recognized*/IOHIDDeviceGetValue(device, element, value) != kIOReturnSuccess) {
				i += 1;
				continue;
			} 
			if (!value) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(element);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase(generatedKeys[key], i);
				continue;
			} 
			if (/*Error: Function owner not recognized*/IOHIDValueGetIntegerValue(value) == 1) {
				return true;
			} 
			i += 1;
		}
		return false;
		if (key == obs_key.OBS_KEY_META) {
			return ModernizedCProgram.vk_down(-1024) || ModernizedCProgram.vk_down(-1024);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(context);
		return ModernizedCProgram.vk_down(ModernizedCProgram.obs_key_to_virtual_key(key));
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
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/IOHIDManagerSetDeviceMatching(generatedManager, mask);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(mask);
		 devices = /*Error: Function owner not recognized*/IOHIDManagerCopyDevices(generatedManager);
		if (!devices) {
			return NULL;
		} 
		if (/*Error: Function owner not recognized*/CFSetGetCount(devices) < 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(devices);
			return NULL;
		} 
		return devices;
	}
	public void load_key(Object key) {
		 usage_code = /*Error: Function owner not recognized*/IOHIDElementGetUsage(key);
		 carbon_code = ModernizedCProgram.usage_to_carbon(usage_code);
		if (carbon_code == -1024) {
			return /*Error: Unsupported expression*/;
		} 
		obs_key_t obs_key = ModernizedCProgram.obs_key_from_virtual_key(carbon_code);
		if (obs_key == obs_key.OBS_KEY_NONE) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedKeys = this.getKeys();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedKeys[obs_key], key);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRetain(()/*Error: Function owner not recognized*/da_end(generatedKeys[obs_key]));
	}
	public void load_keyboard(Object keyboard) {
		 keys = /*Error: Function owner not recognized*/IOHIDDeviceCopyMatchingElements(keyboard, NULL, kIOHIDOptionsTypeNone);
		if (!keys) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Getting keyboard keys failed");
			return /*Error: Unsupported expression*/;
		} 
		 count = /*Error: Function owner not recognized*/CFArrayGetCount(keys);
		if (!count) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Keyboard has no keys");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(keys);
			return /*Error: Unsupported expression*/;
		} 
		for ( i = 0;
		 i < count; i++) {
			 key = ()/*Error: Function owner not recognized*/CFArrayGetValueAtIndex(keys, i);
			if (/*Error: Function owner not recognized*/IOHIDElementGetUsagePage(ModernizedCProgram.key) != kHIDPage_KeyboardOrKeypad) {
				continue;
			} 
			plat.load_key(ModernizedCProgram.key);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(keys);
	}
	public Object init_keyboard() {
		 keyboards = plat.copy_devices(kHIDPage_GenericDesktop, kHIDUsage_GD_Keyboard);
		if (!keyboards) {
			return false;
		} 
		 count = /*Error: Function owner not recognized*/CFSetGetCount(keyboards);
		[] devices = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFSetGetValues(keyboards, devices);
		for ( i = 0;
		 i < count; i++) {
			plat.load_keyboard(()devices[i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(keyboards);
		return true;
	}
	public void free_hotkeys_platform() {
		if (!plat) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedTis = this.getTis();
		if (generatedTis) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(generatedTis);
			this.setTis(NULL);
		} 
		Object generatedLayout_data = this.getLayout_data();
		if (generatedLayout_data) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(generatedLayout_data);
			this.setLayout_data(NULL);
		} 
		Object generatedManager = this.getManager();
		if (generatedManager) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(generatedManager);
			this.setManager(NULL);
		} 
		Object generatedKeys = this.getKeys();
		for (size_t i = 0;
		 i < obs_key.OBS_KEY_LAST_VALUE; i++) {
			for (size_t j = 0;
			 j < generatedKeys[i].getNum(); j++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(generatedKeys[i].getArray()[j]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedKeys[i]);
		}
		ModernizedCProgram.bfree(plat);
	}
	public Object init_hotkeys_platform() {
		if (!plat_) {
			return false;
		} 
		plat_ = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		obs_hotkeys_platform_t plat = plat_;
		if (!plat) {
			plat_ = NULL;
			return false;
		} 
		plat.setTis(/*Error: Function owner not recognized*/TISCopyCurrentKeyboardLayoutInputSource());
		Object generatedTis = plat.getTis();
		plat.setLayout_data(()/*Error: Function owner not recognized*/TISGetInputSourceProperty(generatedTis, kTISPropertyUnicodeKeyLayoutData));
		Object generatedLayout_data = plat.getLayout_data();
		if (!generatedLayout_data) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Failed getting LayoutData");
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRetain(generatedLayout_data);
		plat.setLayout(()/*Error: Function owner not recognized*/CFDataGetBytePtr(generatedLayout_data));
		plat.setManager(/*Error: Function owner not recognized*/IOHIDManagerCreate(kCFAllocatorDefault, kIOHIDOptionsTypeNone));
		Object generatedManager = plat.getManager();
		 openStatus = /*Error: Function owner not recognized*/IOHIDManagerOpen(generatedManager, kIOHIDOptionsTypeNone);
		if (openStatus != kIOReturnSuccess) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkeys-cocoa: Failed opening HIDManager");
			;
		} 
		plat.init_keyboard();
		return true;
		plat_ = NULL;
		return false;
	}
	public Object getDisplay() {
		return display;
	}
	public void setDisplay(Object newDisplay) {
		display = newDisplay;
	}
	public Object getBase_keysyms() {
		return base_keysyms;
	}
	public void setBase_keysyms(Object newBase_keysyms) {
		base_keysyms = newBase_keysyms;
	}
	public Object getKeycodes() {
		return keycodes;
	}
	public void setKeycodes(Object newKeycodes) {
		keycodes = newKeycodes;
	}
	public Object getMin_keycode() {
		return min_keycode;
	}
	public void setMin_keycode(Object newMin_keycode) {
		min_keycode = newMin_keycode;
	}
	public Object getSuper_l_code() {
		return super_l_code;
	}
	public void setSuper_l_code(Object newSuper_l_code) {
		super_l_code = newSuper_l_code;
	}
	public Object getSuper_r_code() {
		return super_r_code;
	}
	public void setSuper_r_code(Object newSuper_r_code) {
		super_r_code = newSuper_r_code;
	}
	public Object getKeysyms() {
		return keysyms;
	}
	public void setKeysyms(Object newKeysyms) {
		keysyms = newKeysyms;
	}
	public int getNum_keysyms() {
		return num_keysyms;
	}
	public void setNum_keysyms(int newNum_keysyms) {
		num_keysyms = newNum_keysyms;
	}
	public int getSyms_per_code() {
		return syms_per_code;
	}
	public void setSyms_per_code(int newSyms_per_code) {
		syms_per_code = newSyms_per_code;
	}
}
