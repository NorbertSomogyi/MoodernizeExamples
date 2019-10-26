package application;

public class test_data {
	private Object from;
	private Object to;
	private Object alternative;
	
	public test_data(Object from, Object to, Object alternative) {
		setFrom(from);
		setTo(to);
		setAlternative(alternative);
	}
	public test_data() {
	}
	
	public int test_function(Object func, Object funcname) {
		int failed = 0;
		int i;
		byte[] buffer = new byte[1024];
		byte to;
		for (i = 0; data[i].getTo(); i++) {
			if (!data[i].getFrom()) {
				to = .func(((Object)0));
			} else {
					ModernizedCProgram.xsnprintf(buffer, , "%s", data[i].getFrom());
					to = .func(buffer);
			} 
			if (!.strcmp(to, data[i].getTo())) {
				continue;
			} 
			if (!data[i].getAlternative()) {
				();
			}  else if (!.strcmp(to, data[i].getAlternative())) {
				continue;
			} else {
					();
			} 
			failed = 1;
		}
		return failed;
	}
	public Object getFrom() {
		return from;
	}
	public void setFrom(Object newFrom) {
		from = newFrom;
	}
	public Object getTo() {
		return to;
	}
	public void setTo(Object newTo) {
		to = newTo;
	}
	public Object getAlternative() {
		return alternative;
	}
	public void setAlternative(Object newAlternative) {
		alternative = newAlternative;
	}
}
