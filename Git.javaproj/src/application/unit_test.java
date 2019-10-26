package application;

/* clang-format off */
public class unit_test {
	private Object ut_fn;
	private Object ut_name;
	private Object ut_usage;
	
	public unit_test(Object ut_fn, Object ut_name, Object ut_usage) {
		setUt_fn(ut_fn);
		setUt_name(ut_name);
		setUt_usage(ut_usage);
	}
	public unit_test() {
	}
	
	public Object getUt_fn() {
		return ut_fn;
	}
	public void setUt_fn(Object newUt_fn) {
		ut_fn = newUt_fn;
	}
	public Object getUt_name() {
		return ut_name;
	}
	public void setUt_name(Object newUt_name) {
		ut_name = newUt_name;
	}
	public Object getUt_usage() {
		return ut_usage;
	}
	public void setUt_usage(Object newUt_usage) {
		ut_usage = newUt_usage;
	}
}
