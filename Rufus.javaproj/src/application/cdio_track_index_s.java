package application;

/*! This struct is used by the CDROMPLAYTRKIND ioctl */
public class cdio_track_index_s {
	private Object i_start_track;
	private Object i_start_index;
	private Object i_end_track;
	private Object i_end_index;
	
	public cdio_track_index_s(Object i_start_track, Object i_start_index, Object i_end_track, Object i_end_index) {
		setI_start_track(i_start_track);
		setI_start_index(i_start_index);
		setI_end_track(i_end_track);
		setI_end_index(i_end_index);
	}
	public cdio_track_index_s() {
	}
	
	public Object getI_start_track() {
		return i_start_track;
	}
	public void setI_start_track(Object newI_start_track) {
		i_start_track = newI_start_track;
	}
	public Object getI_start_index() {
		return i_start_index;
	}
	public void setI_start_index(Object newI_start_index) {
		i_start_index = newI_start_index;
	}
	public Object getI_end_track() {
		return i_end_track;
	}
	public void setI_end_track(Object newI_end_track) {
		i_end_track = newI_end_track;
	}
	public Object getI_end_index() {
		return i_end_index;
	}
	public void setI_end_index(Object newI_end_index) {
		i_end_index = newI_end_index;
	}
}
