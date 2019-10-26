package application;

public class obs_key_combination {
	private Object modifiers;
	private obs_key key;
	
	public obs_key_combination(Object modifiers, obs_key key) {
		setModifiers(modifiers);
		setKey(key);
	}
	public obs_key_combination() {
	}
	
	public obs_key_combination obs_hotkey_binding_get_key_combination(obs_hotkey_binding binding) {
		obs_key_combination generatedKey = binding.getKey();
		return generatedKey;
	}
	public void obs_hotkey_load_bindings(Object id, Object num) {
		 idx = new ();
		if (!ModernizedCProgram.lock()) {
			return ;
		} 
		if (ModernizedCProgram.find_id(id, idx)) {
			obs_hotkey_t hotkey = ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx];
			ModernizedCProgram.remove_bindings(id);
			for ( i = 0;
			 i < num; i++) {
				ModernizedCProgram.create_binding(hotkey, combinations[i]);
			}
			hotkey.hotkey_signal("hotkey_bindings_changed");
		} 
		ModernizedCProgram.unlock();
	}
	public void obs_hotkey_inject_event(Object pressed) {
		if (!ModernizedCProgram.lock()) {
			return ;
		} 
		Object generatedModifiers = this.getModifiers();
		obs_key generatedKey = this.getKey();
		obs_hotkey_internal_inject event = new obs_hotkey_internal_inject(new obs_hotkey_internal_inject(generatedModifiers, generatedKey), pressed, ModernizedCProgram.obs.getHotkeys().getStrict_modifiers());
		ModernizedCProgram.enum_bindings(inject_hotkey, event);
		ModernizedCProgram.unlock();
	}
	public Object obs_key_combination_is_empty() {
		Object generatedModifiers = this.getModifiers();
		obs_key generatedKey = this.getKey();
		return !generatedModifiers && generatedKey == obs_key.OBS_KEY_NONE;
	}
	public Object getModifiers() {
		return modifiers;
	}
	public void setModifiers(Object newModifiers) {
		modifiers = newModifiers;
	}
	public obs_key getKey() {
		return key;
	}
	public void setKey(obs_key newKey) {
		key = newKey;
	}
}
