package application;

public class remote_group_data {
	private Object name;
	private string_list list;
	
	public remote_group_data(Object name, string_list list) {
		setName(name);
		setList(list);
	}
	public remote_group_data() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public string_list getList() {
		return list;
	}
	public void setList(string_list newList) {
		list = newList;
	}
}
