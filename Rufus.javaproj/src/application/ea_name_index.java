package application;

/* Keep these names sorted in order of decreasing specificity. */
public class ea_name_index {
	private int index;
	private Object name;
	
	public ea_name_index(int index, Object name) {
		setIndex(index);
		setName(name);
	}
	public ea_name_index() {
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
