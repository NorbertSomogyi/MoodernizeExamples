package application;

public class strbuf_expand_dict_entry {
	private Object placeholder;
	private Object value;
	
	public strbuf_expand_dict_entry(Object placeholder, Object value) {
		setPlaceholder(placeholder);
		setValue(value);
	}
	public strbuf_expand_dict_entry() {
	}
	
	public Object getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(Object newPlaceholder) {
		placeholder = newPlaceholder;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
