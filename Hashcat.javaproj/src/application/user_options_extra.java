package application;

public class user_options_extra {
	private Object attack_kern;
	private Object rule_len_r;
	private Object rule_len_l;
	private Object wordlist_mode;
	private Byte hc_hash;
	private int hc_workc;
	private byte[][] hc_workv;
	
	public user_options_extra(Object attack_kern, Object rule_len_r, Object rule_len_l, Object wordlist_mode, Byte hc_hash, int hc_workc, byte[][] hc_workv) {
		setAttack_kern(attack_kern);
		setRule_len_r(rule_len_r);
		setRule_len_l(rule_len_l);
		setWordlist_mode(wordlist_mode);
		setHc_hash(hc_hash);
		setHc_workc(hc_workc);
		setHc_workv(hc_workv);
	}
	public user_options_extra() {
	}
	
	public Object getAttack_kern() {
		return attack_kern;
	}
	public void setAttack_kern(Object newAttack_kern) {
		attack_kern = newAttack_kern;
	}
	public Object getRule_len_r() {
		return rule_len_r;
	}
	public void setRule_len_r(Object newRule_len_r) {
		rule_len_r = newRule_len_r;
	}
	public Object getRule_len_l() {
		return rule_len_l;
	}
	public void setRule_len_l(Object newRule_len_l) {
		rule_len_l = newRule_len_l;
	}
	public Object getWordlist_mode() {
		return wordlist_mode;
	}
	public void setWordlist_mode(Object newWordlist_mode) {
		wordlist_mode = newWordlist_mode;
	}
	public Byte getHc_hash() {
		return hc_hash;
	}
	public void setHc_hash(Byte newHc_hash) {
		hc_hash = newHc_hash;
	}
	public int getHc_workc() {
		return hc_workc;
	}
	public void setHc_workc(int newHc_workc) {
		hc_workc = newHc_workc;
	}
	public byte[][] getHc_workv() {
		return hc_workv;
	}
	public void setHc_workv(byte[][] newHc_workv) {
		hc_workv = newHc_workv;
	}
}
