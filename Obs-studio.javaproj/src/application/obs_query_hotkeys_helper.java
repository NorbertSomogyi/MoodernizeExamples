package application;

public class obs_query_hotkeys_helper {
	private Object modifiers;
	private Object no_press;
	private Object strict_modifiers;
	
	public obs_query_hotkeys_helper(Object modifiers, Object no_press, Object strict_modifiers) {
		setModifiers(modifiers);
		setNo_press(no_press);
		setStrict_modifiers(strict_modifiers);
	}
	public obs_query_hotkeys_helper() {
	}
	
	public Object getModifiers() {
		return modifiers;
	}
	public void setModifiers(Object newModifiers) {
		modifiers = newModifiers;
	}
	public Object getNo_press() {
		return no_press;
	}
	public void setNo_press(Object newNo_press) {
		no_press = newNo_press;
	}
	public Object getStrict_modifiers() {
		return strict_modifiers;
	}
	public void setStrict_modifiers(Object newStrict_modifiers) {
		strict_modifiers = newStrict_modifiers;
	}
}
