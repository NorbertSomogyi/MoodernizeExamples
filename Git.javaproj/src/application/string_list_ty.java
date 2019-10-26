package application;

/* Type describing list of immutable strings,
   implemented using a dynamic array.  */
public class string_list_ty {
	private Object item;
	private Object nitems;
	private Object nitems_max;
	
	public string_list_ty(Object item, Object nitems, Object nitems_max) {
		setItem(item);
		setNitems(nitems);
		setNitems_max(nitems_max);
	}
	public string_list_ty() {
	}
	
	/* Initialize an empty list of strings.  */
	public void string_list_init() {
		this.setItem(((Object)0));
		this.setNitems(0);
		this.setNitems_max(0);
		.memset(ModernizedCProgram.list, 0, );
		ModernizedCProgram.list.setStrdup_strings(strdup_strings);
	}
	/* Append a single string to the end of a list of strings.  */
	public void string_list_append(Object s) {
		Object generatedNitems = this.getNitems();
		Object generatedNitems_max = this.getNitems_max();
		Object generatedItem = this.getItem();
		if (generatedNitems >= generatedNitems_max) {
			this.setNitems_max(generatedNitems_max * 2 + 4);
			(generatedItem) = ModernizedCProgram.xrealloc((generatedItem), ModernizedCProgram.st_mult(, (generatedNitems_max)));
		} 
		generatedItem[generatedNitems++] = /* Add the string to the end of the list.  */s;
		string_list_item string_list_item = new string_list_item();
		return string_list_item.string_list_append_nodup(ModernizedCProgram.list, ModernizedCProgram.list.getStrdup_strings() ? ModernizedCProgram.xstrdup(ModernizedCProgram.string) : (byte)ModernizedCProgram.string/*
		 * Encapsulate the compare function pointer because ISO C99 forbids
		 * casting from void * to a function pointer and vice versa.
		 */);
	}
	/* Sort a list of strings.  */
	public void string_list_sort() {
		Object generatedItem = this.getItem();
		Object generatedNitems = this.getNitems();
		ModernizedCProgram.sane_qsort((generatedItem), (generatedNitems), , cmp_string);
		string_list_sort_ctx sort_ctx = new string_list_sort_ctx(ModernizedCProgram.list.getCmp() ? ModernizedCProgram.list.getCmp() : strcmp);
		do {
			if (ModernizedCProgram.git_qsort_s((ModernizedCProgram.list.getItems()), (ModernizedCProgram.list.getNr()), , cmp_items, sort_ctx)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\string-list.c", 239, "qsort_s() failed");
			} 
		} while (0);
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object newItem) {
		item = newItem;
	}
	public Object getNitems() {
		return nitems;
	}
	public void setNitems(Object newNitems) {
		nitems = newNitems;
	}
	public Object getNitems_max() {
		return nitems_max;
	}
	public void setNitems_max(Object newNitems_max) {
		nitems_max = newNitems_max;
	}
}
