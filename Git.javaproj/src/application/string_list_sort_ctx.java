package application;

public class string_list_sort_ctx {
	private Object cmp;
	
	public string_list_sort_ctx(Object cmp) {
		setCmp(cmp);
	}
	public string_list_sort_ctx() {
	}
	
	public Object getCmp() {
		return cmp;
	}
	public void setCmp(Object newCmp) {
		cmp = newCmp;
	}
}
