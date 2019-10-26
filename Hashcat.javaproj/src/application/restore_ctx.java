package application;

public class restore_ctx {
	private boolean enabled;
	private boolean restore_execute;
	private int argc;
	private Byte argv;
	private Byte eff_restore_file;
	private Byte new_restore_file;
	private restore_data rd;
	
	public restore_ctx(boolean enabled, boolean restore_execute, int argc, Byte argv, Byte eff_restore_file, Byte new_restore_file, restore_data rd) {
		setEnabled(enabled);
		setRestore_execute(restore_execute);
		setArgc(argc);
		setArgv(argv);
		setEff_restore_file(eff_restore_file);
		setNew_restore_file(new_restore_file);
		setRd(rd);
	}
	public restore_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public boolean getRestore_execute() {
		return restore_execute;
	}
	public void setRestore_execute(boolean newRestore_execute) {
		restore_execute = newRestore_execute;
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
	public Byte getEff_restore_file() {
		return eff_restore_file;
	}
	public void setEff_restore_file(Byte newEff_restore_file) {
		eff_restore_file = newEff_restore_file;
	}
	public Byte getNew_restore_file() {
		return new_restore_file;
	}
	public void setNew_restore_file(Byte newNew_restore_file) {
		new_restore_file = newNew_restore_file;
	}
	public restore_data getRd() {
		return rd;
	}
	public void setRd(restore_data newRd) {
		rd = newRd;
	}
}
