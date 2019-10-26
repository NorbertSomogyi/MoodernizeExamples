package application;

public class obs_hotkey_binding {
	private obs_key_combination key;
	private Object pressed;
	private Object modifiers_match;
	private Object hotkey_id;
	private obs_hotkey hotkey;
	
	public obs_hotkey_binding(obs_key_combination key, Object pressed, Object modifiers_match, Object hotkey_id, obs_hotkey hotkey) {
		setKey(key);
		setPressed(pressed);
		setModifiers_match(modifiers_match);
		setHotkey_id(hotkey_id);
		setHotkey(hotkey);
	}
	public obs_hotkey_binding() {
	}
	
	public Object obs_hotkey_binding_get_hotkey_id() {
		Object generatedHotkey_id = this.getHotkey_id();
		return generatedHotkey_id;
	}
	public Object pointer_fixup_func(Object data, Object idx) {
		.UNUSED_PARAMETER(idx);
		.UNUSED_PARAMETER(data);
		 idx_ = new ();
		Object generatedHotkey_id = this.getHotkey_id();
		obs_key_combination generatedKey = this.getKey();
		obs_key generatedKey = generatedKey.getKey();
		Object generatedModifiers = generatedKey.getModifiers();
		if (!ModernizedCProgram.find_id(generatedHotkey_id, idx_)) {
			ModernizedCProgram.bcrash("obs-hotkey: Could not find hotkey id '%I64u' for binding '%s' (modifiers 0x%x)", (uintmax_t)generatedHotkey_id, ModernizedCProgram.obs_key_to_name(generatedKey), generatedModifiers);
			this.setHotkey(NULL);
			return true;
		} 
		this.setHotkey(ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx_]);
		return true;
	}
	public Object save_bindings_helper(Object data, Object idx) {
		.UNUSED_PARAMETER(idx);
		save_bindings_helper_t h = data;
		obs_hotkey generatedHotkey = h.getHotkey();
		Object generatedId = generatedHotkey.getId();
		Object generatedHotkey_id = this.getHotkey_id();
		if (generatedId != generatedHotkey_id) {
			return true;
		} 
		obs_data obs_data = new obs_data();
		obs_data_t hotkey = obs_data.obs_data_create();
		obs_key_combination generatedKey = this.getKey();
		Object generatedModifiers = generatedKey.getModifiers();
		uint32_t modifiers = generatedModifiers;
		hotkey.save_modifier(modifiers, "shift", obs_interaction_flags.INTERACT_SHIFT_KEY);
		hotkey.save_modifier(modifiers, "control", obs_interaction_flags.INTERACT_CONTROL_KEY);
		hotkey.save_modifier(modifiers, "alt", obs_interaction_flags.INTERACT_ALT_KEY);
		hotkey.save_modifier(modifiers, "command", obs_interaction_flags.INTERACT_COMMAND_KEY);
		hotkey.obs_data_set_string("key", ModernizedCProgram.obs_key_to_name(generatedKey));
		obs_data_array generatedArray = h.getArray();
		ModernizedCProgram.obs_data_array_push_back(generatedArray, hotkey);
		hotkey.obs_data_release();
		return true;
	}
	public Object binding_finder(Object data, Object idx) {
		binding_find_data find = data;
		Object generatedHotkey_id = this.getHotkey_id();
		Object generatedId = find.getId();
		if (generatedHotkey_id != generatedId) {
			return true;
		} 
		Object generatedIdx = find.getIdx();
		generatedIdx = idx;
		find.setFound(true);
		return false;
	}
	public Object modifiers_match(Object modifiers_, Object strict_modifiers) {
		obs_key_combination generatedKey = this.getKey();
		Object generatedModifiers = generatedKey.getModifiers();
		uint32_t modifiers = generatedModifiers;
		return !modifiers || (!strict_modifiers && (modifiers & modifiers_) == modifiers) || (strict_modifiers && modifiers == modifiers_);
	}
	public void press_released_binding() {
		this.setPressed(true);
		obs_hotkey generatedHotkey = this.getHotkey();
		obs_hotkey_t hotkey = generatedHotkey;
		int generatedPressed = hotkey.getPressed();
		if (generatedPressed++) {
			return ;
		} 
		Object generatedData = hotkey.getData();
		Object generatedId = hotkey.getId();
		if (!ModernizedCProgram.obs.getHotkeys().getReroute_hotkeys()) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedId, hotkey, true);
		}  else if (ModernizedCProgram.obs.getHotkeys().getRouter_func()) {
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.obs.getHotkeys().getRouter_func_data(), generatedId, true);
		} 
	}
	public void release_pressed_binding() {
		this.setPressed(false);
		obs_hotkey generatedHotkey = this.getHotkey();
		obs_hotkey_t hotkey = generatedHotkey;
		int generatedPressed = hotkey.getPressed();
		if (--generatedPressed) {
			return ;
		} 
		Object generatedData = hotkey.getData();
		Object generatedId = hotkey.getId();
		if (!ModernizedCProgram.obs.getHotkeys().getReroute_hotkeys()) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedId, hotkey, false);
		}  else if (ModernizedCProgram.obs.getHotkeys().getRouter_func()) {
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.obs.getHotkeys().getRouter_func_data(), generatedId, false);
		} 
	}
	public void handle_binding(Object modifiers, Object no_press, Object strict_modifiers, Object pressed) {
		 modifiers_match_ = binding.modifiers_match(modifiers, strict_modifiers);
		obs_key_combination generatedKey = this.getKey();
		obs_key generatedKey = generatedKey.getKey();
		 modifiers_only = generatedKey == obs_key.OBS_KEY_NONE;
		Object generatedModifiers = generatedKey.getModifiers();
		if (!generatedModifiers) {
			this.setModifiers_match(true);
		} 
		if (modifiers_only) {
			pressed = modifiers_only;
		} 
		if (!generatedModifiers && modifiers_only) {
			;
		} 
		Object generatedModifiers_match = this.getModifiers_match();
		if ((!generatedModifiers_match && !modifiers_only) || !modifiers_match_) {
			;
		} 
		if ((pressed && !pressed) || (!pressed && !ModernizedCProgram.is_pressed(generatedKey))) {
			;
		} 
		Object generatedPressed = this.getPressed();
		if (generatedPressed || no_press) {
			return ;
		} 
		binding.press_released_binding();
		return ;
		if (!generatedPressed) {
			return ;
		} 
		binding.release_pressed_binding();
	}
	public Object inject_hotkey(Object data, Object idx) {
		.UNUSED_PARAMETER(idx);
		obs_hotkey_internal_inject event = data;
		obs_key_combination generatedHotkey = event.getHotkey();
		Object generatedModifiers = generatedHotkey.getModifiers();
		Object generatedStrict_modifiers = event.getStrict_modifiers();
		obs_key_combination generatedKey = this.getKey();
		obs_key generatedKey = generatedKey.getKey();
		Object generatedPressed = event.getPressed();
		if (binding.modifiers_match(generatedModifiers, generatedStrict_modifiers)) {
			 pressed = generatedKey == generatedKey && generatedPressed;
			binding.handle_binding(generatedModifiers, false, generatedStrict_modifiers, pressed);
		} 
		return true;
	}
	public Object query_hotkey(Object data, Object idx) {
		.UNUSED_PARAMETER(idx);
		obs_query_hotkeys_helper param = (obs_query_hotkeys_helper)data;
		Object generatedModifiers = param.getModifiers();
		Object generatedNo_press = param.getNo_press();
		Object generatedStrict_modifiers = param.getStrict_modifiers();
		binding.handle_binding(generatedModifiers, generatedNo_press, generatedStrict_modifiers, NULL);
		return true;
	}
	public obs_key_combination getKey() {
		return key;
	}
	public void setKey(obs_key_combination newKey) {
		key = newKey;
	}
	public Object getPressed() {
		return pressed;
	}
	public void setPressed(Object newPressed) {
		pressed = newPressed;
	}
	public Object getModifiers_match() {
		return modifiers_match;
	}
	public void setModifiers_match(Object newModifiers_match) {
		modifiers_match = newModifiers_match;
	}
	public Object getHotkey_id() {
		return hotkey_id;
	}
	public void setHotkey_id(Object newHotkey_id) {
		hotkey_id = newHotkey_id;
	}
	public obs_hotkey getHotkey() {
		return hotkey;
	}
	public void setHotkey(obs_hotkey newHotkey) {
		hotkey = newHotkey;
	}
}
