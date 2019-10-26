package application;

public class os_inhibit_info {
	private boolean active;
	
	public os_inhibit_info(boolean active) {
		setActive(active);
	}
	public os_inhibit_info() {
	}
	
	public os_inhibit_info os_inhibit_sleep_create(Object reason) {
		(Object)reason;
		return ModernizedCProgram.bzalloc();
		os_inhibit_info info = ModernizedCProgram.bzalloc();
		sigset_t set = new sigset_t();
		Object generatedStop_event = info.getStop_event();
		generatedStop_event.os_event_init(os_event_type.OS_EVENT_TYPE_AUTO);
		Object generatedAttr = info.getAttr();
		.posix_spawnattr_init(generatedAttr);
		.sigemptyset(set);
		.posix_spawnattr_setsigmask(generatedAttr, set);
		.sigaddset(set, SIGPIPE);
		.posix_spawnattr_setsigdefault(generatedAttr, set);
		.posix_spawnattr_setflags(generatedAttr, POSIX_SPAWN_SETSIGDEF | POSIX_SPAWN_SETSIGMASK);
		info.setReason(ModernizedCProgram.bstrdup(reason));
		return info;
	}
	public boolean os_inhibit_sleep_set_active(boolean active) {
		if (!info) {
			return 0;
		} 
		boolean generatedActive = this.getActive();
		if (generatedActive == active) {
			return 0;
		} 
		if (active) {
			.SetThreadExecutionState(-1024 | -1024 | ES_AWAYMODE_REQUIRED | -1024);
		} else {
				.SetThreadExecutionState(-1024);
		} 
		this.setActive(active);
		return 1;
		int ret;
		if (!info) {
			return 0;
		} 
		boolean generatedActive = this.getActive();
		if (generatedActive == active) {
			return 0;
		} 
		Object generatedStop_event = this.getStop_event();
		if (!generatedStop_event) {
			return 1;
		} 
		Object generatedScreensaver_thread = this.getScreensaver_thread();
		if (active) {
			ret = ModernizedCProgram.pthread_create(generatedScreensaver_thread, ((Object)0), screensaver_thread, info);
			if (ret < 0) {
				ModernizedCProgram.blog(LOG_ERROR, "Failed to create screensaver inhibitor thread");
				return 0;
			} 
		} else {
				generatedStop_event.os_event_signal();
				ModernizedCProgram.pthread_join(generatedScreensaver_thread, ((Object)0));
		} 
		this.setActive(active);
		return 1;
	}
	public void os_inhibit_sleep_destroy() {
		if (info) {
			info.os_inhibit_sleep_set_active(0);
			ModernizedCProgram.bfree(info);
		} 
		Object generatedStop_event = this.getStop_event();
		Object generatedAttr = this.getAttr();
		Object generatedReason = this.getReason();
		if (info) {
			info.os_inhibit_sleep_set_active(0);
			generatedStop_event.os_event_destroy();
			.posix_spawnattr_destroy(generatedAttr);
			ModernizedCProgram.bfree(generatedReason);
			ModernizedCProgram.bfree(info);
		} 
	}
	public void reset_screensaver() {
		byte[] argv = new byte[]{(byte)"xdg-screensaver", (byte)"reset", ((Object)0)};
		pid_t pid = new pid_t();
		Object generatedAttr = this.getAttr();
		int err = .posix_spawnp(pid, "xdg-screensaver", ((Object)0), generatedAttr, argv, (.__p__environ()));
		if (err == 0) {
			int status;
			while (.waitpid(pid, status, 0) == -1) {
				;
			}
		} else {
				ModernizedCProgram.blog(LOG_WARNING, "Failed to create xdg-screensaver: %d", err);
		} 
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean newActive) {
		active = newActive;
	}
}
