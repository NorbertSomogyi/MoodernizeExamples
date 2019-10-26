package application;

public class add_data {
	private device_list list;
	private Object input;
	
	public add_data(device_list list, Object input) {
		setList(list);
		setInput(input);
	}
	public add_data() {
	}
	
	public device_list getList() {
		return list;
	}
	public void setList(device_list newList) {
		list = newList;
	}
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
}
