package application;

public class re_fail_stack_t {
	private int num;
	private int alloc;
	private re_fail_stack_ent_t stack;
	
	public re_fail_stack_t(int num, int alloc, re_fail_stack_ent_t stack) {
		setNum(num);
		setAlloc(alloc);
		setStack(stack);
	}
	public re_fail_stack_t() {
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
	public re_fail_stack_ent_t getStack() {
		return stack;
	}
	public void setStack(re_fail_stack_ent_t newStack) {
		stack = newStack;
	}
}
