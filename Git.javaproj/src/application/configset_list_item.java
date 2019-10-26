package application;

public class configset_list_item {
	private config_set_element e;
	private int value_index;
	
	public configset_list_item(config_set_element e, int value_index) {
		setE(e);
		setValue_index(value_index);
	}
	public configset_list_item() {
	}
	
	public config_set_element getE() {
		return e;
	}
	public void setE(config_set_element newE) {
		e = newE;
	}
	public int getValue_index() {
		return value_index;
	}
	public void setValue_index(int newValue_index) {
		value_index = newValue_index;
	}
}
