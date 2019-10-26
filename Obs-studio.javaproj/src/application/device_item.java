package application;

public class device_item {
	private dstr name;
	private dstr value;
	
	public device_item(dstr name, dstr value) {
		setName(name);
		setValue(value);
	}
	public device_item() {
	}
	
	public void device_item_free() {
		dstr generatedName = this.getName();
		generatedName.dstr_free();
		dstr generatedValue = this.getValue();
		generatedValue.dstr_free();
	}
	public dstr getName() {
		return name;
	}
	public void setName(dstr newName) {
		name = newName;
	}
	public dstr getValue() {
		return value;
	}
	public void setValue(dstr newValue) {
		value = newValue;
	}
}
