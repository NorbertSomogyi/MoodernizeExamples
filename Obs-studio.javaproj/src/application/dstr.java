package application;

public class dstr {
	private byte array;
	private Object len;
	private Object capacity;
	
	public dstr(byte array, Object len, Object capacity) {
		setArray(array);
		setLen(len);
		setCapacity(capacity);
	}
	public dstr() {
	}
	
	public void replace_text(Object pos, Object len, Object new_text) {
		dstr front = new dstr(0);
		dstr back = new dstr(0);
		front.dstr_left(str, pos);
		back.dstr_right(str, pos + len);
		str.dstr_copy_dstr(front);
		str.dstr_cat(new_text);
		str.dstr_cat_dstr(back);
		front.dstr_free();
		back.dstr_free();
	}
	public void erase_ch(Object pos) {
		dstr new_str = new dstr(0);
		new_str.dstr_left(str, pos);
		byte generatedArray = this.getArray();
		new_str.dstr_cat(generatedArray + pos + 1);
		str.dstr_free();
		str = new_str;
	}
	public Object dstr_from_cfstring(Object ref) {
		 length = .CFStringGetLength(ref);
		 max_size = .CFStringGetMaximumSizeForEncoding(length, kCFStringEncodingUTF8);
		str.dstr_reserve(max_size);
		Object generatedDstr = this.getDstr();
		if (!.CFStringGetCString(ref, generatedDstr, max_size, kCFStringEncodingUTF8)) {
			return false;
		} 
		this.setDstr(.strlen(generatedDstr));
		return true;
	}
	public Object localized_key_to_str(obs_key key) {
		switch (key) {
		case obs_key.OBS_KEY_NUM9:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM9, "9 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_NUMEQUAL:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMEQUAL, "= (Keypad)"));
				return true;
		case obs_key.OBS_KEY_NUM3:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM3, "3 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE28:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 28"));
				return true;
		case obs_key.OBS_KEY_MOUSE19:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 19"));
				return true;
		case obs_key.OBS_KEY_NUMSLASH:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMSLASH, "/ (Keypad)"));
				return true;
		case obs_key.OBS_KEY_NUM1:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM1, "1 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_NUM6:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM6, "6 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE5:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 5"));
				return true;
		case obs_key.OBS_KEY_MOUSE18:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 18"));
				return true;
		case obs_key.OBS_KEY_MOUSE13:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 13"));
				return true;
		case obs_key.OBS_KEY_MOUSE2:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 2"));
				return true;
		case obs_key.OBS_KEY_MOUSE12:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 12"));
				return true;
		case obs_key.OBS_KEY_MOUSE4:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 4"));
				return true;
		case obs_key.OBS_KEY_MOUSE22:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 22"));
				return true;
		case obs_key.OBS_KEY_NUM5:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM5, "5 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_NUM8:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM8, "8 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE3:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 3"));
				return true;
		case obs_key.OBS_KEY_NUMMINUS:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMMINUS, "- (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE11:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 11"));
				return true;
		case obs_key.OBS_KEY_MOUSE14:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 14"));
				return true;
		case obs_key.OBS_KEY_MOUSE7:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 7"));
				return true;
		case obs_key.OBS_KEY_MOUSE27:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 27"));
				return true;
		case obs_key.OBS_KEY_NUM2:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM2, "2 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE25:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 25"));
				return true;
		case obs_key.OBS_KEY_NUM0:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM0, "0 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE10:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 10"));
				return true;
		case obs_key.OBS_KEY_MOUSE17:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 17"));
				return true;
		case obs_key.OBS_KEY_NUMASTERISK:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMASTERISK, "* (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE16:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 16"));
				return true;
		case obs_key.OBS_KEY_MOUSE26:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 26"));
				return true;
		case obs_key.OBS_KEY_MOUSE15:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 15"));
				return true;
		case obs_key.OBS_KEY_NUMPERIOD:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMPERIOD, ". (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE1:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 1"));
				return true;
		case obs_key.OBS_KEY_MOUSE8:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 8"));
				return true;
		case obs_key.OBS_KEY_MOUSE9:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 9"));
				return true;
		case obs_key.OBS_KEY_MOUSE23:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 23"));
				return true;
		case obs_key.OBS_KEY_NUM7:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM7, "7 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE20:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 20"));
				return true;
		case obs_key.OBS_KEY_MOUSE21:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 21"));
				return true;
		case obs_key.OBS_KEY_MOUSE24:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 24"));
				return true;
		case obs_key.OBS_KEY_SPACE:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_SPACE, "Space"));
				return true;
		case obs_key.OBS_KEY_MOUSE6:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 6"));
				return true;
		case obs_key.OBS_KEY_NUM4:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUM4, "4 (Keypad)"));
				return true;
		case obs_key.OBS_KEY_MOUSE29:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Mouse 29"));
				return true;
		case obs_key.OBS_KEY_NUMPLUS:
				str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(obs_key.OBS_KEY_NUMPLUS, "+ (Keypad)"));
				return true;
		default:
				break;
		}
		return false;
	}
	public Object code_to_str(int code) {
		switch (code) {
		case kVK_Delete:
				str.dstr_from_wcs();
				return true;
		case kVK_Control:
				str.dstr_from_wcs();
				return true;
		case kVK_Home:
				str.dstr_from_wcs();
				return true;
		case kVK_Command:
				str.dstr_from_wcs();
				return true;
		case kVK_F17:
				str.dstr_copy("F17");
				return true;
		case kVK_F9:
				str.dstr_copy("F9");
				return true;
		case kVK_F12:
				str.dstr_copy("F12");
				return true;
		case kVK_Tab:
				str.dstr_from_wcs();
				return true;
		case kVK_RightShift:
				str.dstr_from_wcs();
				return true;
		case kVK_F1:
				str.dstr_copy("F1");
				return true;
		case kVK_End:
				str.dstr_from_wcs();
				return true;
		case kVK_Escape:
				str.dstr_from_wcs();
				return true;
		case kVK_F13:
				str.dstr_copy("F13");
				return true;
		case kVK_LeftArrow:
				str.dstr_from_wcs();
				return true;
		case kVK_Option:
				str.dstr_from_wcs();
				return true;
		case kVK_F15:
				str.dstr_copy("F15");
				return true;
		case kVK_ForwardDelete:
				str.dstr_from_wcs();
				return true;
		case kVK_CapsLock:
				str.dstr_from_wcs();
				return true;
		case kVK_F2:
				str.dstr_copy("F2");
				return true;
		case kVK_F11:
				str.dstr_copy("F11");
				return true;
		case kVK_F4:
				str.dstr_copy("F4");
				return true;
		case kVK_F8:
				str.dstr_copy("F8");
				return true;
		case kVK_Shift:
				str.dstr_from_wcs();
				return true;
		case kVK_ANSI_KeypadClear:
				str.dstr_from_wcs();
				return true;
		case kVK_PageUp:
				str.dstr_from_wcs();
				return true;
		case kVK_F3:
				str.dstr_copy("F3");
				return true;
		case kVK_F5:
				str.dstr_copy("F5");
				return true;
		case kVK_Return:
				str.dstr_from_wcs();
				return true;
		case kVK_PageDown:
				str.dstr_from_wcs();
				return true;
		case kVK_F7:
				str.dstr_copy("F7");
				return true;
		case kVK_F16:
				str.dstr_copy("F16");
				return true;
		case kVK_ANSI_KeypadEnter:
				str.dstr_from_wcs();
				return true;
		case kVK_DownArrow:
				str.dstr_from_wcs();
				return true;
		case kVK_F14:
				str.dstr_copy("F14");
				return true;
		case kVK_Help:
				str.dstr_from_wcs();
				return true;
		case kVK_UpArrow:
				str.dstr_from_wcs();
				return true;
		case kVK_F6:
				str.dstr_copy("F6");
				return true;
		case kVK_F18:
				str.dstr_copy("F18");
				return true;
		case kVK_RightControl:
				str.dstr_from_wcs();
				return true;
		case kVK_F10:
				str.dstr_copy("F10");
				return true;
		case kVK_F20:
				str.dstr_copy("F20");
				return true;
		case kVK_RightArrow:
				str.dstr_from_wcs();
				return true;
		case kVK_F19:
				str.dstr_copy("F19");
				return true;
		case kVK_RightOption:
				str.dstr_from_wcs();
				return true;
		}
		return false;
	}
	public void obs_key_to_str(obs_key key) {
		if (str.localized_key_to_str(key)) {
			return ;
		} 
		int code = ModernizedCProgram.obs_key_to_virtual_key(key);
		if (str.code_to_str(code)) {
			return ;
		} 
		if (code == -1024) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Got invalid key while translating key '%d' (%s)", key, ModernizedCProgram.obs_key_to_name(key));
			;
		} 
		obs_hotkeys_platform plat = NULL;
		if (ModernizedCProgram.obs) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getHotkeys().getMutex());
			plat = ModernizedCProgram.obs.getHotkeys().getPlatform_context();
			plat.hotkeys_retain();
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getHotkeys().getMutex());
		} 
		if (!plat) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Could not get hotkey platform while translating key '%d' (%s)", key, ModernizedCProgram.obs_key_to_name(key));
			;
		} 
		 max_length = 16;
		 dead_key_state = 0;
		[] buffer = new ();
		 len = 0;
		Object generatedLayout = plat.getLayout();
		 err = .UCKeyTranslate(generatedLayout, code, kUCKeyActionDown, -1024, .LMGetKbdType(), kUCKeyTranslateNoDeadKeysBit, dead_key_state, max_length, len, buffer);
		if (err == noErr && len <= 0 && dead_key_state) {
			err = .UCKeyTranslate(generatedLayout, kVK_Space, kUCKeyActionDown, -1024, .LMGetKbdType(), kUCKeyTranslateNoDeadKeysBit, dead_key_state, max_length, len, buffer);
		} 
		plat.hotkeys_release();
		if (err != noErr) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Error while translating key '%d' (0x%x, %s) to string: %d", key, code, ModernizedCProgram.obs_key_to_name(key), err);
			;
		} 
		if (len == 0) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Got 0 length string while translating '%d' (0x%x, %s) to string", key, code, ModernizedCProgram.obs_key_to_name(key));
			;
		} 
		 string = .CFStringCreateWithCharactersNoCopy(NULL, buffer, len, kCFAllocatorNull);
		if (!string) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Could not create CFStringRef while translating '%d' (0x%x, %s) to string", key, code, ModernizedCProgram.obs_key_to_name(key));
			;
		} 
		if (!str.dstr_from_cfstring(string)) {
			ModernizedCProgram.blog(LOG_ERROR, "hotkey-cocoa: Could not translate CFStringRef to CString while translating '%d' (0x%x, %s)", key, code, ModernizedCProgram.obs_key_to_name(key));
			;
		} 
		.CFRelease(string);
		return ;
		wchar_t[] name = L"";
		UINT scan_code = new UINT();
		int vk;
		if (key == obs_key.OBS_KEY_NONE) {
			return ;
		}  else if (key >= obs_key.OBS_KEY_MOUSE1 && key <= obs_key.OBS_KEY_MOUSE29) {
			if (ModernizedCProgram.obs.getHotkeys().getTranslations()[key]) {
				str.dstr_copy(ModernizedCProgram.obs.getHotkeys().getTranslations()[key]);
			} else {
					str.dstr_printf("Mouse %d", (int)(key - obs_key.OBS_KEY_MOUSE1 + 1));
			} 
			return ;
		} 
		if (key == obs_key.OBS_KEY_PAUSE) {
			str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Pause"));
			return ;
		}  else if (key == obs_key.OBS_KEY_META) {
			str.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Windows"));
			return ;
		} 
		vk = ModernizedCProgram.obs_key_to_virtual_key(key);
		scan_code = .MapVirtualKeyA(vk, 0) << 16;
		switch (vk) {
		case 39:
		case 34:
		case 33:
		case 37:
		case 46:
		case 38:
		case 36:
		case 35:
		case -1024:
				scan_code |=  -1024;
		case 40:
		case 45:
		}
		if (scan_code != 0 && .GetKeyNameTextW(scan_code, name, 128) != 0) {
			str.dstr_from_wcs(name);
		}  else if (key != obs_key.OBS_KEY_NONE) {
			str.dstr_copy(ModernizedCProgram.obs_key_to_name(key));
		} 
		if (key >= obs_key.OBS_KEY_MOUSE1 && key <= obs_key.OBS_KEY_MOUSE29) {
			if (ModernizedCProgram.obs.getHotkeys().getTranslations()[key]) {
				dstr.dstr_copy(ModernizedCProgram.obs.getHotkeys().getTranslations()[key]);
			} else {
					dstr.dstr_printf("Mouse %d", (int)(key - obs_key.OBS_KEY_MOUSE1 + 1));
			} 
			return ;
		} 
		if (key >= obs_key.OBS_KEY_NUM0 && key <= obs_key.OBS_KEY_NUM9) {
			if (ModernizedCProgram.obs.getHotkeys().getTranslations()[key]) {
				dstr.dstr_copy(ModernizedCProgram.obs.getHotkeys().getTranslations()[key]);
			} else {
					dstr.dstr_printf("Numpad %d", (int)(key - obs_key.OBS_KEY_NUM0));
			} 
			return ;
		} 
		switch (key) {
		case obs_key.OBS_KEY_TAB:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Tab"));
		case obs_key.OBS_KEY_PAGEDOWN:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Page Down"));
		case obs_key.OBS_KEY_DOWN:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Down"));
		case obs_key.OBS_KEY_ALT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Alt"));
		case obs_key.OBS_KEY_ESCAPE:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Escape"));
		case obs_key.OBS_KEY_CAPSLOCK:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Caps Lock"));
		case obs_key.OBS_KEY_NUMLOCK:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Num Lock"));
		case obs_key.OBS_KEY_BACKSPACE:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Backspace"));
		case obs_key.OBS_KEY_LEFT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Left"));
		case obs_key.OBS_KEY_UP:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Up"));
		case obs_key.OBS_KEY_PAUSE:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Pause"));
		case obs_key.OBS_KEY_PAGEUP:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Page Up"));
		case obs_key.OBS_KEY_RIGHT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Right"));
		case obs_key.OBS_KEY_CONTROL:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Control"));
		case obs_key.OBS_KEY_NUMPERIOD:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Numpad ."));
		case obs_key.OBS_KEY_NUMCOMMA:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Numpad ,"));
		case obs_key.OBS_KEY_DELETE:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Delete"));
		case obs_key.OBS_KEY_META:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Super"));
		case obs_key.OBS_KEY_NUMSLASH:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Numpad /"));
		case obs_key.OBS_KEY_HOME:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Home"));
		case obs_key.OBS_KEY_SHIFT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Shift"));
		case obs_key.OBS_KEY_NUMASTERISK:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Numpad *"));
		case obs_key.OBS_KEY_NUMPLUS:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Numpad +"));
		case obs_key.OBS_KEY_SCROLLLOCK:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Scroll Lock"));
		case obs_key.OBS_KEY_PRINT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Print"));
		case obs_key.OBS_KEY_MENU:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Menu"));
		case obs_key.OBS_KEY_INSERT:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Insert"));
		case obs_key.OBS_KEY_END:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "End"));
		case obs_key.OBS_KEY_SPACE:
				return dstr.dstr_copy(ModernizedCProgram.obs_get_hotkey_translation(key, "Space"));
		default:
				;
		}
		if (key >= obs_key.OBS_KEY_F1 && key <= obs_key.OBS_KEY_F35) {
			dstr.dstr_printf("F%d", (int)(key - obs_key.OBS_KEY_F1 + 1));
			return ;
		} 
		obs_hotkeys_platform_t context = ModernizedCProgram.obs.getHotkeys().getPlatform_context();
		Object generatedKeycodes = context.getKeycodes();
		keycode_list keycodes = generatedKeycodes[key];
		Object generatedList = keycodes.getList();
		for (size_t i = 0;
		 i < generatedList.getNum(); i++) {
			if (dstr.get_key_translation(generatedList.getArray()[i])) {
				break;
			} 
		}
		if (key != obs_key.OBS_KEY_NONE && ModernizedCProgram.dstr_is_empty(dstr)) {
			dstr.dstr_copy(ModernizedCProgram.obs_key_to_name(key));
		} 
	}
	public Object check_path(Object data, Object path) {
		output.dstr_copy(path);
		output.dstr_cat(data);
		Object generatedDstr = this.getDstr();
		return ModernizedCProgram.os_file_exists(generatedDstr);
	}
	public void encode_dstr() {
		str.dstr_replace("#", "#22");
		str.dstr_replace(":", "#3A");
	}
	public Object get_window_exe(Object window) {
		wchar_t[] wname = new wchar_t();
		dstr temp = new dstr(0);
		 success = false;
		HANDLE process = ((Object)0);
		byte slash;
		DWORD id = new DWORD();
		.GetWindowThreadProcessId(window, id);
		if (id == .GetCurrentProcessId()) {
			return false;
		} 
		process = ModernizedCProgram.open_process(PROCESS_QUERY_LIMITED_INFORMATION, false, id);
		if (!process) {
			;
		} 
		if (!.GetProcessImageFileNameW(process, wname, 260)) {
			;
		} 
		temp.dstr_from_wcs(wname);
		Object generatedDstr = temp.getDstr();
		slash = .strrchr(generatedDstr, (byte)'\\');
		if (!slash) {
			;
		} 
		name.dstr_copy(slash + 1);
		success = true;
		temp.dstr_free();
		.CloseHandle(process);
		return true;
	}
	public void get_window_title(Object hwnd) {
		wchar_t temp = new wchar_t();
		int len;
		len = .GetWindowTextLengthW(hwnd);
		if (!len) {
			return ;
		} 
		temp = .malloc( * (len + 1));
		if (.GetWindowTextW(hwnd, temp, len + 1)) {
			name.dstr_from_wcs(temp);
		} 
		.free(temp);
	}
	public void get_window_class(Object hwnd) {
		wchar_t[] temp = new wchar_t();
		temp[0] = 0;
		if (.GetClassNameW(hwnd, temp,  / )) {
			class.dstr_from_wcs(temp);
		} 
	}
	public void dstr_init_copy_strref(Object src) {
		dst.dstr_init();
		dst.dstr_copy_strref(src);
	}
	public void dstr_copy(Object array) {
		size_t len = new size_t();
		if (!array || !array) {
			dst.dstr_free();
			return ;
		} 
		len = .strlen(array);
		dst.dstr_ensure_capacity(len + 1);
		byte generatedArray = this.getArray();
		.memcpy(generatedArray, array, len + 1);
		this.setLen(len);
	}
	public void dstr_copy_strref(Object src) {
		byte generatedArray = this.getArray();
		if (generatedArray) {
			dst.dstr_free();
		} 
		dst.dstr_ncopy(generatedArray, src.getLen());
	}
	public void dstr_ncopy(Object array, Object len) {
		byte generatedArray = this.getArray();
		if (generatedArray) {
			dst.dstr_free();
		} 
		if (!len) {
			return ;
		} 
		this.setArray(ModernizedCProgram.bmemdup(array, len + 1));
		this.setLen(len);
		this.setCapacity(len + 1);
		generatedArray[len] = 0;
	}
	public void dstr_ncopy_dstr(Object str, Object len) {
		size_t newlen = new size_t();
		byte generatedArray = this.getArray();
		if (generatedArray) {
			dst.dstr_free();
		} 
		if (!len) {
			return ;
		} 
		newlen = ModernizedCProgram.size_min(len, str.getLen());
		this.setArray(ModernizedCProgram.bmemdup(generatedArray, newlen + 1));
		this.setLen(newlen);
		this.setCapacity(newlen + 1);
		generatedArray[newlen] = 0;
	}
	public void dstr_cat_dstr(Object str) {
		size_t new_len = new size_t();
		if (!str.getLen()) {
			return ;
		} 
		Object generatedLen = this.getLen();
		new_len = generatedLen + generatedLen;
		dst.dstr_ensure_capacity(new_len + 1);
		byte generatedArray = this.getArray();
		.memcpy(generatedArray + generatedLen, generatedArray, generatedLen + 1);
		this.setLen(new_len);
	}
	public void dstr_cat_strref(Object str) {
		dst.dstr_ncat(str.getArray(), str.getLen());
	}
	public void dstr_ncat(Object array, Object len) {
		size_t new_len = new size_t();
		if (!array || !array || !len) {
			return ;
		} 
		Object generatedLen = this.getLen();
		new_len = generatedLen + len;
		dst.dstr_ensure_capacity(new_len + 1);
		byte generatedArray = this.getArray();
		.memcpy(generatedArray + generatedLen, array, len);
		this.setLen(new_len);
		generatedArray[new_len] = 0;
	}
	public void dstr_ncat_dstr(Object str, Object len) {
		size_t new_len = new size_t();
		size_t in_len = new size_t();
		if (!str.getArray() || !str.getArray() || !len) {
			return ;
		} 
		in_len = ModernizedCProgram.size_min(len, str.getLen());
		Object generatedLen = this.getLen();
		new_len = generatedLen + in_len;
		dst.dstr_ensure_capacity(new_len + 1);
		byte generatedArray = this.getArray();
		.memcpy(generatedArray + generatedLen, generatedArray, in_len);
		this.setLen(new_len);
		generatedArray[new_len] = 0;
	}
	public void dstr_insert(Object idx, Object array) {
		size_t new_len = new size_t();
		size_t len = new size_t();
		if (!array || !array) {
			return ;
		} 
		Object generatedLen = this.getLen();
		if (idx == generatedLen) {
			dst.dstr_cat(array);
			return ;
		} 
		len = .strlen(array);
		new_len = generatedLen + len;
		dst.dstr_ensure_capacity(new_len + 1);
		byte generatedArray = this.getArray();
		.memmove(generatedArray + idx + len, generatedArray + idx, generatedLen - idx + 1);
		.memcpy(generatedArray + idx, array, len);
		this.setLen(new_len);
	}
	public void dstr_insert_dstr(Object idx, Object str) {
		size_t new_len = new size_t();
		if (!str.getLen()) {
			return ;
		} 
		Object generatedLen = this.getLen();
		if (idx == generatedLen) {
			dst.dstr_cat_dstr(str);
			return ;
		} 
		new_len = generatedLen + generatedLen;
		dst.dstr_ensure_capacity((new_len + 1));
		byte generatedArray = this.getArray();
		.memmove(generatedArray + idx + generatedLen, generatedArray + idx, generatedLen - idx + 1);
		.memcpy(generatedArray + idx, generatedArray, generatedLen);
		this.setLen(new_len);
	}
	public void dstr_insert_ch(Object idx, Object ch) {
		Object generatedLen = this.getLen();
		if (idx == generatedLen) {
			dst.dstr_cat_ch(ch);
			return ;
		} 
		dst.dstr_ensure_capacity((++generatedLen + 1));
		byte generatedArray = this.getArray();
		.memmove(generatedArray + idx + 1, generatedArray + idx, generatedLen - idx + 1);
		generatedArray[idx] = ch;
	}
	public void dstr_remove(Object idx, Object count) {
		size_t end = new size_t();
		if (!count) {
			return ;
		} 
		Object generatedLen = this.getLen();
		if (count == generatedLen) {
			dst.dstr_free();
			return ;
		} 
		end = idx + count;
		byte generatedArray = this.getArray();
		if (end == generatedLen) {
			generatedArray[idx] = 0;
		} else {
				.memmove(generatedArray + idx, generatedArray + end, generatedLen - end + 1);
		} 
		generatedLen -= count;
	}
	public void dstr_printf(Object format) {
		va_list args = new va_list();
		.__builtin_va_start(args, format);
		dst.dstr_vprintf(format, args);
		.__builtin_va_end(args);
	}
	public void dstr_catf(Object format) {
		va_list args = new va_list();
		.__builtin_va_start(args, format);
		dst.dstr_vcatf(format, args);
		.__builtin_va_end(args);
	}
	public void dstr_vprintf(Object format, Object args) {
		va_list args_cp = new va_list();
		.__builtin_va_copy(args_cp, args);
		int len = .vsnprintf(((Object)0), 0, format, args_cp);
		.__builtin_va_end(args_cp);
		if (len < 0) {
			len = 4095;
		} 
		dst.dstr_ensure_capacity(((size_t)len) + 1);
		byte generatedArray = this.getArray();
		len = .vsnprintf(generatedArray, ((size_t)len) + 1, format, args);
		if (!generatedArray) {
			dst.dstr_free();
			return ;
		} 
		this.setLen(len < 0 ? .strlen(generatedArray) : (size_t)len);
	}
	public void dstr_vcatf(Object format, Object args) {
		va_list args_cp = new va_list();
		.__builtin_va_copy(args_cp, args);
		int len = .vsnprintf(((Object)0), 0, format, args_cp);
		.__builtin_va_end(args_cp);
		if (len < 0) {
			len = 4095;
		} 
		Object generatedLen = this.getLen();
		dst.dstr_ensure_capacity(generatedLen + ((size_t)len) + 1);
		byte generatedArray = this.getArray();
		len = .vsnprintf(generatedArray + generatedLen, ((size_t)len) + 1, format, args);
		if (!generatedArray) {
			dst.dstr_free();
			return ;
		} 
		generatedLen += len < 0 ? .strlen(generatedArray + generatedLen) : (size_t)len;
	}
	public void dstr_safe_printf(Object format, Object val1, Object val2, Object val3, Object val4) {
		dst.dstr_copy(format);
		if (val1) {
			dst.dstr_replace("$1", val1);
		} 
		if (val2) {
			dst.dstr_replace("$2", val2);
		} 
		if (val3) {
			dst.dstr_replace("$3", val3);
		} 
		if (val4) {
			dst.dstr_replace("$4", val4);
		} 
	}
	public void dstr_replace(Object find, Object replace) {
		size_t find_len = new size_t();
		size_t replace_len = new size_t();
		byte temp;
		if (ModernizedCProgram.dstr_is_empty(str)) {
			return ;
		} 
		if (!replace) {
			replace = "";
		} 
		find_len = .strlen(find);
		replace_len = .strlen(replace);
		byte generatedArray = this.getArray();
		temp = generatedArray;
		Object generatedLen = this.getLen();
		if (replace_len < find_len) {
			long count = 0;
			while ((temp = .strstr(temp, find)) != ((Object)0)) {
				byte end = temp + find_len;
				size_t end_len = .strlen(end);
				if (end_len) {
					.memmove(temp + replace_len, end, end_len + 1);
					if (replace_len) {
						.memcpy(temp, replace, replace_len);
					} 
				} else {
						.strcpy(temp, replace);
				} 
				temp += replace_len;
				++count;
			}
			if (count) {
				generatedLen += (replace_len - find_len) * count;
			} 
		}  else if (replace_len > find_len) {
			long count = 0;
			while ((temp = .strstr(temp, find)) != ((Object)0)) {
				temp += find_len;
				++count;
			}
			if (!count) {
				return ;
			} 
			generatedLen += (replace_len - find_len) * count;
			str.dstr_ensure_capacity(generatedLen + 1);
			temp = generatedArray;
			while ((temp = .strstr(temp, find)) != ((Object)0)) {
				byte end = temp + find_len;
				size_t end_len = .strlen(end);
				if (end_len) {
					.memmove(temp + replace_len, end, end_len + 1);
					.memcpy(temp, replace, replace_len);
				} else {
						.strcpy(temp, replace);
				} 
				temp += replace_len;
			}
		} else {
				while ((temp = .strstr(temp, find)) != ((Object)0)) {
					.memcpy(temp, replace, replace_len);
					temp += replace_len;
				}
		} 
	}
	public void dstr_depad() {
		byte generatedArray = this.getArray();
		if (generatedArray) {
			this.setArray(ModernizedCProgram.strdepad(generatedArray));
			if (generatedArray) {
				this.setLen(.strlen(generatedArray));
			} else {
					str.dstr_free();
			} 
		} 
	}
	public void dstr_left(Object str, Object pos) {
		dst.dstr_resize(pos);
		byte generatedArray = this.getArray();
		if (dst != str) {
			.memcpy(generatedArray, generatedArray, pos);
		} 
	}
	public void dstr_mid(Object str, Object start, Object count) {
		dstr temp = new dstr();
		temp.dstr_init();
		temp.dstr_copy_dstr(str);
		byte generatedArray = temp.getArray();
		dst.dstr_ncopy(generatedArray + start, count);
		temp.dstr_free();
	}
	public void dstr_right(Object str, Object pos) {
		dstr temp = new dstr();
		temp.dstr_init();
		temp.dstr_ncopy(str.getArray() + pos, str.getLen() - pos);
		dst.dstr_copy_dstr(temp);
		temp.dstr_free();
	}
	public void dstr_from_mbs(Object mbstr) {
		dst.dstr_free();
		byte generatedArray = this.getArray();
		this.setLen(ModernizedCProgram.os_mbs_to_utf8_ptr(mbstr, 0, generatedArray));
	}
	public void dstr_from_wcs(Object wstr) {
		size_t len = .wchar_to_utf8(wstr, 0, ((Object)0), 0, 0);
		byte generatedArray = this.getArray();
		if (len) {
			dst.dstr_resize(len);
			.wchar_to_utf8(wstr, 0, generatedArray, len + 1, 0);
		} else {
				dst.dstr_free();
		} 
	}
	public void dstr_to_upper() {
		wchar_t wstr = new wchar_t();
		wchar_t temp = new wchar_t();
		if (ModernizedCProgram.dstr_is_empty(str)) {
			return ;
		} 
		wstr = ModernizedCProgram.dstr_to_wcs(str);
		temp = wstr;
		if (!wstr) {
			return ;
		} 
		while (temp) {
			temp = (wchar_t).towupper(temp);
			temp++;
		}
		str.dstr_from_wcs(wstr);
		ModernizedCProgram.bfree(wstr);
	}
	public void dstr_to_lower() {
		wchar_t wstr = new wchar_t();
		wchar_t temp = new wchar_t();
		if (ModernizedCProgram.dstr_is_empty(str)) {
			return ;
		} 
		wstr = ModernizedCProgram.dstr_to_wcs(str);
		temp = wstr;
		if (!wstr) {
			return ;
		} 
		while (temp) {
			temp = (wchar_t).towlower(temp);
			temp++;
		}
		str.dstr_from_wcs(wstr);
		ModernizedCProgram.bfree(wstr);
	}
	public void make_indent_string(int indent, Object active) {
		this.setLen(0);
		if (!indent) {
			indent_buffer.dstr_cat_ch(0);
			return ;
		} 
		for (size_t i = 0;
		 i < indent; i++) {
			byte fragment = "";
			boolean last = i + 1 == indent;
			if (active & ((uint64_t)1 << i)) {
				fragment = last ? " \xe2\x94\xa3" : " \xe2\x94\x83";
			} else {
					fragment = last ? " \xe2\x94\x97" : "  ";
			} 
			indent_buffer.dstr_cat(fragment);
		}
	}
	public void entry_dump_csv(Object parent, Object entry, Object func, Object data) {
		byte parent_name = parent ? parent.getName() : ((Object)0);
		for (size_t i = 0;
		 i < entry.getTimes().getNum(); i++) {
			buffer.dstr_printf("%p,%p,%p,%p,%s,0,%I64u,%I64u\n", entry, parent, entry.getName(), parent_name, entry.getName(), entry.getTimes().getArray()[i].getTime_delta(), entry.getTimes().getArray()[i].getCount());
			ModernizedCProgram.func(data, buffer);
		}
		for (size_t i = 0;
		 i < entry.getTimes_between_calls().getNum(); i++) {
			buffer.dstr_printf("%p,%p,%p,%p,%s,%I64u,%I64u,%I64u\n", entry, parent, entry.getName(), parent_name, entry.getName(), entry.getExpected_time_between_calls(), entry.getTimes_between_calls().getArray()[i].getTime_delta(), entry.getTimes_between_calls().getArray()[i].getCount());
			ModernizedCProgram.func(data, buffer);
		}
		for (size_t i = 0;
		 i < entry.getChildren().getNum(); i++) {
			buffer.entry_dump_csv(entry, entry.getChildren().getArray()[i], func, data);
		}
	}
	public void dump_csv_fwrite(Object data) {
		byte generatedArray = this.getArray();
		Object generatedLen = this.getLen();
		.fwrite(generatedArray, 1, generatedLen, data);
	}
	public void dump_csv_gzwrite(Object data) {
		byte generatedArray = this.getArray();
		Object generatedLen = this.getLen();
		.gzwrite(data, generatedArray, (int)generatedLen);
	}
	public void unescape() {
		byte generatedArray = this.getArray();
		byte read = generatedArray;
		byte write = generatedArray;
		for (; read; ) {
			byte cur = read;
			if (cur == (byte)'\\') {
				byte next = read[1];
				if (next == (byte)'\\') {
					read++;
				}  else if (next == (byte)'r') {
					cur = (byte)'\r';
					read++;
				}  else if (next == (byte)'n') {
					cur = (byte)'\n';
					read++;
				} 
			} 
			if (read != write) {
				write = cur;
			} 
		}
		if (read != write) {
			write = (byte)'\0';
		} 
	}
	public void add_combo_key(obs_key key) {
		dstr key_str = new dstr(0);
		key_str.obs_key_to_str(key);
		if (!ModernizedCProgram.dstr_is_empty(key_str)) {
			if (!ModernizedCProgram.dstr_is_empty(str)) {
				str.dstr_cat(" + ");
			} 
			str.dstr_cat_dstr(key_str);
		} 
		key_str.dstr_free();
		dstr key_str = new dstr(0);
		key_str.obs_key_to_str(key);
		if (!ModernizedCProgram.dstr_is_empty(key_str)) {
			if (!ModernizedCProgram.dstr_is_empty(str)) {
				str.dstr_cat(" + ");
			} 
			str.dstr_cat_dstr(key_str);
		} 
		key_str.dstr_free();
	}
	public Object get_key_translation(Object keycode) {
		 connection = new ();
		byte[] name = new byte[128];
		connection = .XGetXCBConnection(ModernizedCProgram.obs.getHotkeys().getPlatform_context().getDisplay());
		 event = new (0);
		event.setType(KeyPress);
		event.setDisplay(ModernizedCProgram.obs.getHotkeys().getPlatform_context().getDisplay());
		event.setKeycode(keycode);
		event.setRoot(ModernizedCProgram.obs.getHotkeys().getPlatform_context().root_window(connection));
		event.setWindow(event.getRoot());
		if (keycode) {
			int len = .XLookupString(event, name, 128, ((Object)0), ((Object)0));
			if (len) {
				dstr.dstr_ncopy(name, len);
				dstr.dstr_to_upper();
				return true;
			} 
		} 
		return false;
	}
	public void make_data_dir(Object data_dir, Object name) {
		parsed_data_dir.dstr_copy(data_dir);
		parsed_data_dir.dstr_replace("%module%", name);
		Object generatedDstr = this.getDstr();
		if (ModernizedCProgram.dstr_end(parsed_data_dir) == (byte)'/') {
			parsed_data_dir.dstr_resize(generatedDstr - 1);
		} 
	}
	public Object parse_binary_from_directory(Object bin_path, Object file) {
		dstr directory = new dstr(0);
		 found = true;
		directory.dstr_copy(bin_path);
		directory.dstr_replace("%module%", file);
		if (ModernizedCProgram.dstr_end(directory) != (byte)'/') {
			directory.dstr_cat_ch((byte)'/');
		} 
		parsed_bin_path.dstr_copy_dstr(directory);
		parsed_bin_path.dstr_cat(file);
		parsed_bin_path.dstr_cat(ModernizedCProgram.get_module_extension());
		Object generatedDstr = this.getDstr();
		if (!ModernizedCProgram.os_file_exists(generatedDstr)) {
			parsed_bin_path.dstr_copy_dstr(/* if the file doesn't exist, check with 'lib' prefix */directory);
			parsed_bin_path.dstr_cat("lib");
			parsed_bin_path.dstr_cat(file);
			parsed_bin_path.dstr_cat(ModernizedCProgram.get_module_extension());
			if (!ModernizedCProgram.os_file_exists(generatedDstr)) {
				parsed_bin_path.dstr_free();
				found = false;
			} 
		} 
		directory.dstr_free();
		return found;
	}
	public void set_rtmp_dstr(Object val) {
		 valid = !ModernizedCProgram.dstr_is_empty(str);
		Object generatedDstr = this.getDstr();
		val.setAv_val(valid ? generatedDstr : ((Object)0));
		val.setAv_len(valid ? (int)generatedDstr : 0);
	}
	/* ------------------------------------------------------------------------- */
	public void dstr_init() {
		this.setArray(((Object)0));
		this.setLen(0);
		this.setCapacity(0);
	}
	public void dstr_init_move_array(Byte str) {
		this.setArray(str);
		this.setLen((!str) ? 0 : .strlen(str));
		Object generatedLen = this.getLen();
		this.setCapacity(generatedLen + 1);
	}
	public void dstr_init_move(dstr src) {
		dst = src;
		src.dstr_init();
	}
	public void dstr_init_copy(Object str) {
		dst.dstr_init();
		dst.dstr_copy(str);
	}
	public void dstr_init_copy_dstr(Object src) {
		dst.dstr_init();
		dst.dstr_copy_dstr(src);
	}
	public void dstr_free() {
		byte generatedArray = this.getArray();
		ModernizedCProgram.bfree(generatedArray);
		this.setArray(((Object)0));
		this.setLen(0);
		this.setCapacity(0);
	}
	public void dstr_array_free(Object count) {
		size_t i = new size_t();
		for (i = 0; i < count; i++) {
			array + i.dstr_free();
		}
	}
	public void dstr_move_array(Byte str) {
		dst.dstr_free();
		this.setArray(str);
		this.setLen((!str) ? 0 : .strlen(str));
		Object generatedLen = this.getLen();
		this.setCapacity(generatedLen + 1);
	}
	public void dstr_move(dstr src) {
		dst.dstr_free();
		dst.dstr_init_move(src);
	}
	public void dstr_ensure_capacity(Object new_size) {
		size_t new_cap = new size_t();
		Object generatedCapacity = this.getCapacity();
		if (new_size <= generatedCapacity) {
			return ;
		} 
		new_cap = (!generatedCapacity) ? new_size : generatedCapacity * 2;
		if (new_size > new_cap) {
			new_cap = new_size;
		} 
		byte generatedArray = this.getArray();
		this.setArray((byte)ModernizedCProgram.brealloc(generatedArray, new_cap));
		this.setCapacity(new_cap);
	}
	public void dstr_copy_dstr(Object src) {
		byte generatedArray = this.getArray();
		if (generatedArray) {
			dst.dstr_free();
		} 
		if (src.getLen()) {
			dst.dstr_ensure_capacity(src.getLen() + 1);
			.memcpy(generatedArray, generatedArray, src.getLen() + 1);
			this.setLen(src.getLen());
		} 
	}
	public void dstr_reserve(Object capacity) {
		Object generatedLen = this.getLen();
		if (capacity == 0 || capacity <= generatedLen) {
			return ;
		} 
		byte generatedArray = this.getArray();
		this.setArray((byte)ModernizedCProgram.brealloc(generatedArray, capacity));
		this.setCapacity(capacity);
	}
	public void dstr_resize(Object num) {
		if (!num) {
			dst.dstr_free();
			return ;
		} 
		dst.dstr_ensure_capacity(num + 1);
		byte generatedArray = this.getArray();
		generatedArray[num] = 0;
		this.setLen(num);
	}
	public void dstr_cat(Object array) {
		size_t len = new size_t();
		if (!array || !array) {
			return ;
		} 
		len = .strlen(array);
		dst.dstr_ncat(array, len);
	}
	public void dstr_cat_ch(byte ch) {
		Object generatedLen = this.getLen();
		dst.dstr_ensure_capacity(++generatedLen + 1);
		byte generatedArray = this.getArray();
		generatedArray[generatedLen - 1] = ch;
		generatedArray[generatedLen] = 0;
	}
	public byte getArray() {
		return array;
	}
	public void setArray(byte newArray) {
		array = newArray;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
}
