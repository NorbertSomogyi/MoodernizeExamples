package application;

public class obs_hotkey_internal_inject {
	private obs_key_combination hotkey;
	private Object pressed;
	private Object strict_modifiers;
	
	public obs_hotkey_internal_inject(obs_key_combination hotkey, Object pressed, Object strict_modifiers) {
		setHotkey(hotkey);
		setPressed(pressed);
		setStrict_modifiers(strict_modifiers);
	}
	public obs_hotkey_internal_inject() {
	}
	
	public obs_key_combination getHotkey() {
		return hotkey;
	}
	public void setHotkey(obs_key_combination newHotkey) {
		hotkey = newHotkey;
	}
	public Object getPressed() {
		return pressed;
	}
	public void setPressed(Object newPressed) {
		pressed = newPressed;
	}
	public Object getStrict_modifiers() {
		return strict_modifiers;
	}
	public void setStrict_modifiers(Object newStrict_modifiers) {
		strict_modifiers = newStrict_modifiers;
	}
}
