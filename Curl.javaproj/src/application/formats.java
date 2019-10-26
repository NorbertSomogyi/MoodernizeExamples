package application;

public class formats {
	private Object f_mode;
	private int f_convert;
	
	public formats(Object f_mode, int f_convert) {
		setF_mode(f_mode);
		setF_convert(f_convert);
	}
	public formats() {
	}
	
	public Object getF_mode() {
		return f_mode;
	}
	public void setF_mode(Object newF_mode) {
		f_mode = newF_mode;
	}
	public int getF_convert() {
		return f_convert;
	}
	public void setF_convert(int newF_convert) {
		f_convert = newF_convert;
	}
}
