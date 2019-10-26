package application;

public class induct_ctx {
	private boolean enabled;
	private Byte root_directory;
	private Byte induction_dictionaries;
	private int induction_dictionaries_cnt;
	private int induction_dictionaries_pos;
	
	public induct_ctx(boolean enabled, Byte root_directory, Byte induction_dictionaries, int induction_dictionaries_cnt, int induction_dictionaries_pos) {
		setEnabled(enabled);
		setRoot_directory(root_directory);
		setInduction_dictionaries(induction_dictionaries);
		setInduction_dictionaries_cnt(induction_dictionaries_cnt);
		setInduction_dictionaries_pos(induction_dictionaries_pos);
	}
	public induct_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getRoot_directory() {
		return root_directory;
	}
	public void setRoot_directory(Byte newRoot_directory) {
		root_directory = newRoot_directory;
	}
	public Byte getInduction_dictionaries() {
		return induction_dictionaries;
	}
	public void setInduction_dictionaries(Byte newInduction_dictionaries) {
		induction_dictionaries = newInduction_dictionaries;
	}
	public int getInduction_dictionaries_cnt() {
		return induction_dictionaries_cnt;
	}
	public void setInduction_dictionaries_cnt(int newInduction_dictionaries_cnt) {
		induction_dictionaries_cnt = newInduction_dictionaries_cnt;
	}
	public int getInduction_dictionaries_pos() {
		return induction_dictionaries_pos;
	}
	public void setInduction_dictionaries_pos(int newInduction_dictionaries_pos) {
		induction_dictionaries_pos = newInduction_dictionaries_pos;
	}
}
