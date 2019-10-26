package application;

public class obs_key_event {
	private Object modifiers;
	private Byte text;
	private Object native_modifiers;
	private Object native_scancode;
	private Object native_vkey;
	
	public obs_key_event(Object modifiers, Byte text, Object native_modifiers, Object native_scancode, Object native_vkey) {
		setModifiers(modifiers);
		setText(text);
		setNative_modifiers(native_modifiers);
		setNative_scancode(native_scancode);
		setNative_vkey(native_vkey);
	}
	public obs_key_event() {
	}
	
	public Object getModifiers() {
		return modifiers;
	}
	public void setModifiers(Object newModifiers) {
		modifiers = newModifiers;
	}
	public Byte getText() {
		return text;
	}
	public void setText(Byte newText) {
		text = newText;
	}
	public Object getNative_modifiers() {
		return native_modifiers;
	}
	public void setNative_modifiers(Object newNative_modifiers) {
		native_modifiers = newNative_modifiers;
	}
	public Object getNative_scancode() {
		return native_scancode;
	}
	public void setNative_scancode(Object newNative_scancode) {
		native_scancode = newNative_scancode;
	}
	public Object getNative_vkey() {
		return native_vkey;
	}
	public void setNative_vkey(Object newNative_vkey) {
		native_vkey = newNative_vkey;
	}
}
