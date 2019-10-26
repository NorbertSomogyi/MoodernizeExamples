package application;

public class re_state_table_entry {
	private int num;
	private int alloc;
	private re_dfastate_t array;
	
	public re_state_table_entry(int num, int alloc, re_dfastate_t array) {
		setNum(num);
		setAlloc(alloc);
		setArray(array);
	}
	public re_state_table_entry() {
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int newNum) {
		num = newNum;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public re_dfastate_t getArray() {
		return array;
	}
	public void setArray(re_dfastate_t newArray) {
		array = newArray;
	}
}
