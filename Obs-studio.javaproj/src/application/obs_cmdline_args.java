package application;

/** Access to the argc/argv used to start OBS. What you see is what you get. */
public class obs_cmdline_args {
	private int argc;
	private Byte argv;
	
	public obs_cmdline_args(int argc, Byte argv) {
		setArgc(argc);
		setArgv(argv);
	}
	public obs_cmdline_args() {
	}
	
	public obs_cmdline_args obs_get_cmdline_args() {
		return ModernizedCProgram.cmdline_args;
	}
	public int getArgc() {
		return argc;
	}
	public void setArgc(int newArgc) {
		argc = newArgc;
	}
	public Byte getArgv() {
		return argv;
	}
	public void setArgv(Byte newArgv) {
		argv = newArgv;
	}
}
/**
 * Sets a new locale to use for modules.  This will call obs_module_set_locale
 * for each module with the new locale.
 *
 * @param  locale  The locale to use for modules
 */
