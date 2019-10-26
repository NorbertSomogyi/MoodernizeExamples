package application;

public class obs_core_audio {
	private Object audio;
	private Object ;
	private Object ;
	private Object buffered_ts;
	private circlebuf buffered_timestamps;
	private int buffering_wait_ticks;
	private int total_buffering_ticks;
	private double user_volume;
	private Object monitoring_mutex;
	private Object ;
	private Byte monitoring_device_name;
	private Byte monitoring_device_id;
	
	public obs_core_audio(Object audio, Object,  Object,  Object buffered_ts, circlebuf buffered_timestamps, int buffering_wait_ticks, int total_buffering_ticks, double user_volume, Object monitoring_mutex, Object,  Byte monitoring_device_name, Byte monitoring_device_id) {
		setAudio(audio);
		set();
		set();
		setBuffered_ts(buffered_ts);
		setBuffered_timestamps(buffered_timestamps);
		setBuffering_wait_ticks(buffering_wait_ticks);
		setTotal_buffering_ticks(total_buffering_ticks);
		setUser_volume(user_volume);
		setMonitoring_mutex(monitoring_mutex);
		set();
		setMonitoring_device_name(monitoring_device_name);
		setMonitoring_device_id(monitoring_device_id);
	}
	public obs_core_audio() {
	}
	
	public void release_audio_sources() {
		Object generatedRender_order = this.getRender_order();
		for ( i = 0;
		 i < generatedRender_order.getNum(); i++) {
			generatedRender_order.getArray()[i].obs_source_release();
		}
	}
	public Object getAudio() {
		return audio;
	}
	public void setAudio(Object newAudio) {
		audio = newAudio;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getBuffered_ts() {
		return buffered_ts;
	}
	public void setBuffered_ts(Object newBuffered_ts) {
		buffered_ts = newBuffered_ts;
	}
	public circlebuf getBuffered_timestamps() {
		return buffered_timestamps;
	}
	public void setBuffered_timestamps(circlebuf newBuffered_timestamps) {
		buffered_timestamps = newBuffered_timestamps;
	}
	public int getBuffering_wait_ticks() {
		return buffering_wait_ticks;
	}
	public void setBuffering_wait_ticks(int newBuffering_wait_ticks) {
		buffering_wait_ticks = newBuffering_wait_ticks;
	}
	public int getTotal_buffering_ticks() {
		return total_buffering_ticks;
	}
	public void setTotal_buffering_ticks(int newTotal_buffering_ticks) {
		total_buffering_ticks = newTotal_buffering_ticks;
	}
	public double getUser_volume() {
		return user_volume;
	}
	public void setUser_volume(double newUser_volume) {
		user_volume = newUser_volume;
	}
	public Object getMonitoring_mutex() {
		return monitoring_mutex;
	}
	public void setMonitoring_mutex(Object newMonitoring_mutex) {
		monitoring_mutex = newMonitoring_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Byte getMonitoring_device_name() {
		return monitoring_device_name;
	}
	public void setMonitoring_device_name(Byte newMonitoring_device_name) {
		monitoring_device_name = newMonitoring_device_name;
	}
	public Byte getMonitoring_device_id() {
		return monitoring_device_id;
	}
	public void setMonitoring_device_id(Byte newMonitoring_device_id) {
		monitoring_device_id = newMonitoring_device_id;
	}
}
