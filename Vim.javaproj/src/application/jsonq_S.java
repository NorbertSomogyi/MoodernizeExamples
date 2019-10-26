package application;

public class jsonq_S {
	private  jq_value;
	private jsonq_S jq_next;
	private jsonq_S jq_prev;
	private int jq_no_callback;
	
	public jsonq_S( jq_value, jsonq_S jq_next, jsonq_S jq_prev, int jq_no_callback) {
		setJq_value(jq_value);
		setJq_next(jq_next);
		setJq_prev(jq_prev);
		setJq_no_callback(jq_no_callback);
	}
	public jsonq_S() {
	}
	
	public  getJq_value() {
		return jq_value;
	}
	public void setJq_value( newJq_value) {
		jq_value = newJq_value;
	}
	public jsonq_S getJq_next() {
		return jq_next;
	}
	public void setJq_next(jsonq_S newJq_next) {
		jq_next = newJq_next;
	}
	public jsonq_S getJq_prev() {
		return jq_prev;
	}
	public void setJq_prev(jsonq_S newJq_prev) {
		jq_prev = newJq_prev;
	}
	public int getJq_no_callback() {
		return jq_no_callback;
	}
	public void setJq_no_callback(int newJq_no_callback) {
		jq_no_callback = newJq_no_callback;
	}
}
