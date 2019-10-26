package application;

/* clang-format off */
/* clang-format on */
public class monitor_capture {
	private obs_source source;
	private int monitor;
	private Object capture_cursor;
	private Object compatibility;
	private dc_capture data;
	
	public monitor_capture(obs_source source, int monitor, Object capture_cursor, Object compatibility, dc_capture data) {
		setSource(source);
		setMonitor(monitor);
		setCapture_cursor(capture_cursor);
		setCompatibility(compatibility);
		setData(data);
	}
	public monitor_capture() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public int getMonitor() {
		return monitor;
	}
	public void setMonitor(int newMonitor) {
		monitor = newMonitor;
	}
	public Object getCapture_cursor() {
		return capture_cursor;
	}
	public void setCapture_cursor(Object newCapture_cursor) {
		capture_cursor = newCapture_cursor;
	}
	public Object getCompatibility() {
		return compatibility;
	}
	public void setCompatibility(Object newCompatibility) {
		compatibility = newCompatibility;
	}
	public dc_capture getData() {
		return data;
	}
	public void setData(dc_capture newData) {
		data = newData;
	}
}
