package application;

public class mp_media_info {
	private Object opaque;
	private Object v_cb;
	private Object v_preload_cb;
	private Object a_cb;
	private Object stop_cb;
	private Object path;
	private Object format;
	private int buffering;
	private int speed;
	private video_range_type force_range;
	private Object hardware_decoding;
	private Object is_local_file;
	
	public mp_media_info(Object opaque, Object v_cb, Object v_preload_cb, Object a_cb, Object stop_cb, Object path, Object format, int buffering, int speed, video_range_type force_range, Object hardware_decoding, Object is_local_file) {
		setOpaque(opaque);
		setV_cb(v_cb);
		setV_preload_cb(v_preload_cb);
		setA_cb(a_cb);
		setStop_cb(stop_cb);
		setPath(path);
		setFormat(format);
		setBuffering(buffering);
		setSpeed(speed);
		setForce_range(force_range);
		setHardware_decoding(hardware_decoding);
		setIs_local_file(is_local_file);
	}
	public mp_media_info() {
	}
	
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
	public Object getV_cb() {
		return v_cb;
	}
	public void setV_cb(Object newV_cb) {
		v_cb = newV_cb;
	}
	public Object getV_preload_cb() {
		return v_preload_cb;
	}
	public void setV_preload_cb(Object newV_preload_cb) {
		v_preload_cb = newV_preload_cb;
	}
	public Object getA_cb() {
		return a_cb;
	}
	public void setA_cb(Object newA_cb) {
		a_cb = newA_cb;
	}
	public Object getStop_cb() {
		return stop_cb;
	}
	public void setStop_cb(Object newStop_cb) {
		stop_cb = newStop_cb;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public int getBuffering() {
		return buffering;
	}
	public void setBuffering(int newBuffering) {
		buffering = newBuffering;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	public video_range_type getForce_range() {
		return force_range;
	}
	public void setForce_range(video_range_type newForce_range) {
		force_range = newForce_range;
	}
	public Object getHardware_decoding() {
		return hardware_decoding;
	}
	public void setHardware_decoding(Object newHardware_decoding) {
		hardware_decoding = newHardware_decoding;
	}
	public Object getIs_local_file() {
		return is_local_file;
	}
	public void setIs_local_file(Object newIs_local_file) {
		is_local_file = newIs_local_file;
	}
}
