package application;

/* clang-format off */
/* clang-format on */
public class window_capture {
	private obs_source source;
	private Byte title;
	private Byte class;
	private Byte executable;
	private window_priority priority;
	private Object cursor;
	private Object compatibility;
	private Object use_wildcards;
	private dc_capture capture;
	private double resize_timer;
	private double check_window_timer;
	private double cursor_check_time;
	private Object window;
	private tagRECT last_rect;
	
	public window_capture(obs_source source, Byte title, Byte class, Byte executable, window_priority priority, Object cursor, Object compatibility, Object use_wildcards, dc_capture capture, double resize_timer, double check_window_timer, double cursor_check_time, Object window, tagRECT last_rect) {
		setSource(source);
		setTitle(title);
		setClass(class);
		setExecutable(executable);
		setPriority(priority);
		setCursor(cursor);
		setCompatibility(compatibility);
		setUse_wildcards(use_wildcards);
		setCapture(capture);
		setResize_timer(resize_timer);
		setCheck_window_timer(check_window_timer);
		setCursor_check_time(cursor_check_time);
		setWindow(window);
		setLast_rect(last_rect);
	}
	public window_capture() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Byte getTitle() {
		return title;
	}
	public void setTitle(Byte newTitle) {
		title = newTitle;
	}
	public Byte getClass() {
		return class;
	}
	public void setClass(Byte newClass) {
		class = newClass;
	}
	public Byte getExecutable() {
		return executable;
	}
	public void setExecutable(Byte newExecutable) {
		executable = newExecutable;
	}
	public window_priority getPriority() {
		return priority;
	}
	public void setPriority(window_priority newPriority) {
		priority = newPriority;
	}
	public Object getCursor() {
		return cursor;
	}
	public void setCursor(Object newCursor) {
		cursor = newCursor;
	}
	public Object getCompatibility() {
		return compatibility;
	}
	public void setCompatibility(Object newCompatibility) {
		compatibility = newCompatibility;
	}
	public Object getUse_wildcards() {
		return use_wildcards;
	}
	public void setUse_wildcards(Object newUse_wildcards) {
		use_wildcards = newUse_wildcards;
	}
	public dc_capture getCapture() {
		return capture;
	}
	public void setCapture(dc_capture newCapture) {
		capture = newCapture;
	}
	public double getResize_timer() {
		return resize_timer;
	}
	public void setResize_timer(double newResize_timer) {
		resize_timer = newResize_timer;
	}
	public double getCheck_window_timer() {
		return check_window_timer;
	}
	public void setCheck_window_timer(double newCheck_window_timer) {
		check_window_timer = newCheck_window_timer;
	}
	public double getCursor_check_time() {
		return cursor_check_time;
	}
	public void setCursor_check_time(double newCursor_check_time) {
		cursor_check_time = newCursor_check_time;
	}
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public tagRECT getLast_rect() {
		return last_rect;
	}
	public void setLast_rect(tagRECT newLast_rect) {
		last_rect = newLast_rect;
	}
}
