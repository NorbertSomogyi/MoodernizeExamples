package application;

public class specialkey {
	private Object key_sym;
	private Object vim_code0;
	private Object vim_code1;
	
	public specialkey(Object key_sym, Object vim_code0, Object vim_code1) {
		setKey_sym(key_sym);
		setVim_code0(vim_code0);
		setVim_code1(vim_code1);
	}
	public specialkey() {
	}
	
	public Object getKey_sym() {
		return key_sym;
	}
	public void setKey_sym(Object newKey_sym) {
		key_sym = newKey_sym;
	}
	public Object getVim_code0() {
		return vim_code0;
	}
	public void setVim_code0(Object newVim_code0) {
		vim_code0 = newVim_code0;
	}
	public Object getVim_code1() {
		return vim_code1;
	}
	public void setVim_code1(Object newVim_code1) {
		vim_code1 = newVim_code1;
	}
}
