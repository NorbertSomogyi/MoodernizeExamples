package application;

public class thread_data {
	private Object mutexes;
	private _CRITICAL_SECTION data_mutex;
	private Object cur_data;
	private Object shmem_textures;
	private Object copy_thread;
	private Object copy_event;
	private Object stop_event;
	private Object cur_tex;
	private int pitch;
	private int cy;
	private Object locked_textures;
	
	public thread_data(Object mutexes, _CRITICAL_SECTION data_mutex, Object cur_data, Object shmem_textures, Object copy_thread, Object copy_event, Object stop_event, Object cur_tex, int pitch, int cy, Object locked_textures) {
		setMutexes(mutexes);
		setData_mutex(data_mutex);
		setCur_data(cur_data);
		setShmem_textures(shmem_textures);
		setCopy_thread(copy_thread);
		setCopy_event(copy_event);
		setStop_event(stop_event);
		setCur_tex(cur_tex);
		setPitch(pitch);
		setCy(cy);
		setLocked_textures(locked_textures);
	}
	public thread_data() {
	}
	
	public Object getMutexes() {
		return mutexes;
	}
	public void setMutexes(Object newMutexes) {
		mutexes = newMutexes;
	}
	public _CRITICAL_SECTION getData_mutex() {
		return data_mutex;
	}
	public void setData_mutex(_CRITICAL_SECTION newData_mutex) {
		data_mutex = newData_mutex;
	}
	public Object getCur_data() {
		return cur_data;
	}
	public void setCur_data(Object newCur_data) {
		cur_data = newCur_data;
	}
	public Object getShmem_textures() {
		return shmem_textures;
	}
	public void setShmem_textures(Object newShmem_textures) {
		shmem_textures = newShmem_textures;
	}
	public Object getCopy_thread() {
		return copy_thread;
	}
	public void setCopy_thread(Object newCopy_thread) {
		copy_thread = newCopy_thread;
	}
	public Object getCopy_event() {
		return copy_event;
	}
	public void setCopy_event(Object newCopy_event) {
		copy_event = newCopy_event;
	}
	public Object getStop_event() {
		return stop_event;
	}
	public void setStop_event(Object newStop_event) {
		stop_event = newStop_event;
	}
	public Object getCur_tex() {
		return cur_tex;
	}
	public void setCur_tex(Object newCur_tex) {
		cur_tex = newCur_tex;
	}
	public int getPitch() {
		return pitch;
	}
	public void setPitch(int newPitch) {
		pitch = newPitch;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int newCy) {
		cy = newCy;
	}
	public Object getLocked_textures() {
		return locked_textures;
	}
	public void setLocked_textures(Object newLocked_textures) {
		locked_textures = newLocked_textures;
	}
}
