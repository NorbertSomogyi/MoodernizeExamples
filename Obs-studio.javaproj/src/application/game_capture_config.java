package application;

public class game_capture_config {
	private Byte title;
	private Byte class;
	private Byte executable;
	private window_priority priority;
	private capture_mode mode;
	private Object scale_cx;
	private Object scale_cy;
	private boolean cursor;
	private boolean force_shmem;
	private boolean force_scaling;
	private boolean allow_transparency;
	private boolean limit_framerate;
	private boolean capture_overlays;
	private boolean anticheat_hook;
	private hook_rate hook_rate;
	
	public game_capture_config(Byte title, Byte class, Byte executable, window_priority priority, capture_mode mode, Object scale_cx, Object scale_cy, boolean cursor, boolean force_shmem, boolean force_scaling, boolean allow_transparency, boolean limit_framerate, boolean capture_overlays, boolean anticheat_hook, hook_rate hook_rate) {
		setTitle(title);
		setClass(class);
		setExecutable(executable);
		setPriority(priority);
		setMode(mode);
		setScale_cx(scale_cx);
		setScale_cy(scale_cy);
		setCursor(cursor);
		setForce_shmem(force_shmem);
		setForce_scaling(force_scaling);
		setAllow_transparency(allow_transparency);
		setLimit_framerate(limit_framerate);
		setCapture_overlays(capture_overlays);
		setAnticheat_hook(anticheat_hook);
		setHook_rate(hook_rate);
	}
	public game_capture_config() {
	}
	
	public void free_config() {
		Byte generatedTitle = this.getTitle();
		ModernizedCProgram.bfree(generatedTitle);
		Byte generatedClass = this.getClass();
		ModernizedCProgram.bfree(generatedClass);
		Byte generatedExecutable = this.getExecutable();
		ModernizedCProgram.bfree(generatedExecutable);
		.memset(config, 0, );
	}
	public boolean capture_needs_reset(game_capture_config cfg2) {
		capture_mode generatedMode = this.getMode();
		Byte generatedClass = this.getClass();
		Byte generatedTitle = this.getTitle();
		Byte generatedExecutable = this.getExecutable();
		window_priority generatedPriority = this.getPriority();
		boolean generatedForce_scaling = this.getForce_scaling();
		Object generatedScale_cx = this.getScale_cx();
		Object generatedScale_cy = this.getScale_cy();
		boolean generatedForce_shmem = this.getForce_shmem();
		boolean generatedLimit_framerate = this.getLimit_framerate();
		boolean generatedCapture_overlays = this.getCapture_overlays();
		if (generatedMode != generatedMode) {
			return 1;
		}  else if (generatedMode == capture_mode.CAPTURE_MODE_WINDOW && (ModernizedCProgram.s_cmp(generatedClass, generatedClass) != 0 || ModernizedCProgram.s_cmp(generatedTitle, generatedTitle) != 0 || ModernizedCProgram.s_cmp(generatedExecutable, generatedExecutable) != 0 || generatedPriority != generatedPriority)) {
			return 1;
		}  else if (generatedForce_scaling != generatedForce_scaling) {
			return 1;
		}  else if (generatedForce_scaling && (generatedScale_cx != generatedScale_cx || generatedScale_cy != generatedScale_cy)) {
			return 1;
		}  else if (generatedForce_shmem != generatedForce_shmem) {
			return 1;
		}  else if (generatedLimit_framerate != generatedLimit_framerate) {
			return 1;
		}  else if (generatedCapture_overlays != generatedCapture_overlays) {
			return 1;
		} 
		return 0;
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
	public capture_mode getMode() {
		return mode;
	}
	public void setMode(capture_mode newMode) {
		mode = newMode;
	}
	public Object getScale_cx() {
		return scale_cx;
	}
	public void setScale_cx(Object newScale_cx) {
		scale_cx = newScale_cx;
	}
	public Object getScale_cy() {
		return scale_cy;
	}
	public void setScale_cy(Object newScale_cy) {
		scale_cy = newScale_cy;
	}
	public boolean getCursor() {
		return cursor;
	}
	public void setCursor(boolean newCursor) {
		cursor = newCursor;
	}
	public boolean getForce_shmem() {
		return force_shmem;
	}
	public void setForce_shmem(boolean newForce_shmem) {
		force_shmem = newForce_shmem;
	}
	public boolean getForce_scaling() {
		return force_scaling;
	}
	public void setForce_scaling(boolean newForce_scaling) {
		force_scaling = newForce_scaling;
	}
	public boolean getAllow_transparency() {
		return allow_transparency;
	}
	public void setAllow_transparency(boolean newAllow_transparency) {
		allow_transparency = newAllow_transparency;
	}
	public boolean getLimit_framerate() {
		return limit_framerate;
	}
	public void setLimit_framerate(boolean newLimit_framerate) {
		limit_framerate = newLimit_framerate;
	}
	public boolean getCapture_overlays() {
		return capture_overlays;
	}
	public void setCapture_overlays(boolean newCapture_overlays) {
		capture_overlays = newCapture_overlays;
	}
	public boolean getAnticheat_hook() {
		return anticheat_hook;
	}
	public void setAnticheat_hook(boolean newAnticheat_hook) {
		anticheat_hook = newAnticheat_hook;
	}
	public hook_rate getHook_rate() {
		return hook_rate;
	}
	public void setHook_rate(hook_rate newHook_rate) {
		hook_rate = newHook_rate;
	}
}
