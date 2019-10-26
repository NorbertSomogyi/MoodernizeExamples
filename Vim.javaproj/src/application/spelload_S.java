package application;

/*
 * Structure used for the cookie argument of do_in_runtimepath().
 */
public class spelload_S {
	private Object sl_lang;
	private slang_S sl_slang;
	private int sl_nobreak;
	
	public spelload_S(Object sl_lang, slang_S sl_slang, int sl_nobreak) {
		setSl_lang(sl_lang);
		setSl_slang(sl_slang);
		setSl_nobreak(sl_nobreak);
	}
	public spelload_S() {
	}
	
	public Object getSl_lang() {
		return sl_lang;
	}
	public void setSl_lang(Object newSl_lang) {
		sl_lang = newSl_lang;
	}
	public slang_S getSl_slang() {
		return sl_slang;
	}
	public void setSl_slang(slang_S newSl_slang) {
		sl_slang = newSl_slang;
	}
	public int getSl_nobreak() {
		return sl_nobreak;
	}
	public void setSl_nobreak(int newSl_nobreak) {
		sl_nobreak = newSl_nobreak;
	}
}
