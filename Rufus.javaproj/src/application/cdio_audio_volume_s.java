package application;

/*! This struct is used by cdio_audio_get_volume and cdio_audio_set_volume */
public class cdio_audio_volume_s {
	private Object level;
	
	public cdio_audio_volume_s(Object level) {
		setLevel(level);
	}
	public cdio_audio_volume_s() {
	}
	
	public Object getLevel() {
		return level;
	}
	public void setLevel(Object newLevel) {
		level = newLevel;
	}
}
