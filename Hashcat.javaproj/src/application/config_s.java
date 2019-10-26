package application;

/* Tail of hash chains */
/* Matches of length 3 are discarded if their distance exceeds TOO_FAR */
/* Values for max_lazy_match, good_match and max_chain_length, depending on
 * the desired pack level (0..9). The values given below have been tuned to
 * exclude worst case performance for pathological files. Better values may be
 * found for specific files.
 */
public class config_s {
	private Object good_length;
	private Object max_lazy;
	private Object nice_length;
	private Object max_chain;
	private Object func;
	
	public config_s(Object good_length, Object max_lazy, Object nice_length, Object max_chain, Object func) {
		setGood_length(good_length);
		setMax_lazy(max_lazy);
		setNice_length(nice_length);
		setMax_chain(max_chain);
		setFunc(func);
	}
	public config_s() {
	}
	
	public Object getGood_length() {
		return good_length;
	}
	public void setGood_length(Object newGood_length) {
		good_length = newGood_length;
	}
	public Object getMax_lazy() {
		return max_lazy;
	}
	public void setMax_lazy(Object newMax_lazy) {
		max_lazy = newMax_lazy;
	}
	public Object getNice_length() {
		return nice_length;
	}
	public void setNice_length(Object newNice_length) {
		nice_length = newNice_length;
	}
	public Object getMax_chain() {
		return max_chain;
	}
	public void setMax_chain(Object newMax_chain) {
		max_chain = newMax_chain;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
}
