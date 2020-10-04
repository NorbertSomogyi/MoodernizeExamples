package application;

public class restore_data {
	private int version;
	private Object[] cwd;
	private Object dicts_pos;
	private Object masks_pos;
	private Object words_cur;
	private Object argc;
	private byte[][] argv;
	
	public restore_data(int version, Object[] cwd, Object dicts_pos, Object masks_pos, Object words_cur, Object argc, byte[][] argv) {
		setVersion(version);
		setCwd(cwd);
		setDicts_pos(dicts_pos);
		setMasks_pos(masks_pos);
		setWords_cur(words_cur);
		setArgc(argc);
		setArgv(argv);
	}
	public restore_data() {
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
	public Object[] getCwd() {
		return cwd;
	}
	public void setCwd(Object[] newCwd) {
		cwd = newCwd;
	}
	public Object getDicts_pos() {
		return dicts_pos;
	}
	public void setDicts_pos(Object newDicts_pos) {
		dicts_pos = newDicts_pos;
	}
	public Object getMasks_pos() {
		return masks_pos;
	}
	public void setMasks_pos(Object newMasks_pos) {
		masks_pos = newMasks_pos;
	}
	public Object getWords_cur() {
		return words_cur;
	}
	public void setWords_cur(Object newWords_cur) {
		words_cur = newWords_cur;
	}
	public Object getArgc() {
		return argc;
	}
	public void setArgc(Object newArgc) {
		argc = newArgc;
	}
	public byte[][] getArgv() {
		return argv;
	}
	public void setArgv(byte[][] newArgv) {
		argv = newArgv;
	}
}
