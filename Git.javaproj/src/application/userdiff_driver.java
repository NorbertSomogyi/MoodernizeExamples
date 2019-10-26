package application;

public class userdiff_driver {
	private Object name;
	private Object external;
	private int binary;
	private userdiff_funcname funcname;
	private Object word_regex;
	private Object textconv;
	private notes_cache textconv_cache;
	private int textconv_want_cache;
	
	public userdiff_driver(Object name, Object external, int binary, userdiff_funcname funcname, Object word_regex, Object textconv, notes_cache textconv_cache, int textconv_want_cache) {
		setName(name);
		setExternal(external);
		setBinary(binary);
		setFuncname(funcname);
		setWord_regex(word_regex);
		setTextconv(textconv);
		setTextconv_cache(textconv_cache);
		setTextconv_want_cache(textconv_want_cache);
	}
	public userdiff_driver() {
	}
	
	public userdiff_driver userdiff_find_by_namelen(Object k, int len) {
		int i;
		Object generatedName = drv.getName();
		for (i = 0; i < ModernizedCProgram.ndrivers; i++) {
			userdiff_driver drv = ModernizedCProgram.drivers + i;
			if (!.strncmp(generatedName, k, len) && !generatedName[len]) {
				return drv;
			} 
		}
		for (i = 0; i < ( /  + ( - 1)); i++) {
			userdiff_driver drv = ModernizedCProgram.builtin_drivers + i;
			if (!.strncmp(generatedName, k, len) && !generatedName[len]) {
				return drv;
			} 
		}
		return ((Object)0);
	}
	public userdiff_driver userdiff_find_by_name(Object name) {
		int len = .strlen(name);
		userdiff_driver userdiff_driver = new userdiff_driver();
		return userdiff_driver.userdiff_find_by_namelen(name, len);
	}
	public userdiff_driver userdiff_find_by_path(index_state istate, Object path) {
		attr_check check = new attr_check();
		attr_check attr_check = new attr_check();
		if (!check) {
			check = attr_check.attr_check_initl("diff", ((Object)0));
		} 
		if (!path) {
			return ((Object)0);
		} 
		check.git_check_attr(istate, path);
		attr_check_item generatedItems = check.getItems();
		if (((generatedItems[0].getValue()) == ModernizedCProgram.git_attr__true)) {
			return ModernizedCProgram.driver_true;
		} 
		if (((generatedItems[0].getValue()) == ModernizedCProgram.git_attr__false)) {
			return ModernizedCProgram.driver_false;
		} 
		if (((generatedItems[0].getValue()) == ((Object)0))) {
			return ((Object)0);
		} 
		userdiff_driver userdiff_driver = new userdiff_driver();
		return userdiff_driver.userdiff_find_by_name(generatedItems[0].getValue());
	}
	public userdiff_driver userdiff_get_textconv(repository r) {
		Object generatedTextconv = this.getTextconv();
		if (!generatedTextconv) {
			return ((Object)0);
		} 
		int generatedTextconv_want_cache = this.getTextconv_want_cache();
		notes_cache generatedTextconv_cache = this.getTextconv_cache();
		Object generatedName = this.getName();
		byte generatedBuf = name.getBuf();
		if (generatedTextconv_want_cache && !generatedTextconv_cache) {
			notes_cache c = ModernizedCProgram.xmalloc();
			strbuf name = new strbuf(, , );
			name.strbuf_addf("textconv/%s", generatedName);
			ModernizedCProgram.notes_cache_init(r, c, generatedBuf, generatedTextconv);
			this.setTextconv_cache(c);
			name.strbuf_release();
		} 
		return driver;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getExternal() {
		return external;
	}
	public void setExternal(Object newExternal) {
		external = newExternal;
	}
	public int getBinary() {
		return binary;
	}
	public void setBinary(int newBinary) {
		binary = newBinary;
	}
	public userdiff_funcname getFuncname() {
		return funcname;
	}
	public void setFuncname(userdiff_funcname newFuncname) {
		funcname = newFuncname;
	}
	public Object getWord_regex() {
		return word_regex;
	}
	public void setWord_regex(Object newWord_regex) {
		word_regex = newWord_regex;
	}
	public Object getTextconv() {
		return textconv;
	}
	public void setTextconv(Object newTextconv) {
		textconv = newTextconv;
	}
	public notes_cache getTextconv_cache() {
		return textconv_cache;
	}
	public void setTextconv_cache(notes_cache newTextconv_cache) {
		textconv_cache = newTextconv_cache;
	}
	public int getTextconv_want_cache() {
		return textconv_want_cache;
	}
	public void setTextconv_want_cache(int newTextconv_want_cache) {
		textconv_want_cache = newTextconv_want_cache;
	}
}
/*
 * Initialize any textconv-related fields in the driver and return it, or NULL
 * if it does not have textconv enabled at all.
 */
/* USERDIFF */
