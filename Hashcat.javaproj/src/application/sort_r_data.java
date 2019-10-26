package application;

/* !NESTED_QSORT */
/* Declare structs and functions */
/* Ensure qsort_r is defined */
/* BSD (qsort_r), Windows (qsort_s) require argument swap */
public class sort_r_data {
	private Object arg;
	private Object compar;
	
	public sort_r_data(Object arg, Object compar) {
		setArg(arg);
		setCompar(compar);
	}
	public sort_r_data() {
	}
	
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
	public Object getCompar() {
		return compar;
	}
	public void setCompar(Object newCompar) {
		compar = newCompar;
	}
}
