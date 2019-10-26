package application;

/* ------------------------------------------------------------------------- */
public class text_lookup {
	private dstr language;
	private text_node top;
	
	public text_lookup(dstr language, text_node top) {
		setLanguage(language);
		setTop(top);
	}
	public text_lookup() {
	}
	
	public void lookup_addfiledata(Object file_data) {
		lexer lex = new lexer();
		strref name = new strref();
		strref value = new strref();
		lex.lexer_init();
		lex.lexer_start(file_data);
		name.strref_clear();
		value.strref_clear();
		Object generatedArray = name.getArray();
		lex.lexer_free();
	}
	/* ------------------------------------------------------------------------- */
	public text_lookup text_lookup_create(Object path) {
		text_lookup lookup = ModernizedCProgram.bzalloc();
		if (!lookup.text_lookup_add(path)) {
			ModernizedCProgram.bfree(lookup);
			lookup = ((Object)0);
		} 
		return lookup;
	}
	public boolean text_lookup_add(Object path) {
		dstr file_str = new dstr();
		byte temp = ((Object)0);
		FILE file = new FILE();
		file = ModernizedCProgram.os_fopen(path, "rb");
		if (!file) {
			return 0;
		} 
		file.os_fread_utf8(temp);
		file_str.dstr_init_move_array(temp);
		.fclose(file);
		byte generatedArray = file_str.getArray();
		if (!generatedArray) {
			return 0;
		} 
		text_node generatedTop = this.getTop();
		if (!generatedTop) {
			this.setTop(ModernizedCProgram.bzalloc());
		} 
		file_str.dstr_replace("\r", " ");
		lookup.lookup_addfiledata(generatedArray);
		file_str.dstr_free();
		return 1;
	}
	public void text_lookup_destroy() {
		dstr generatedLanguage = this.getLanguage();
		text_node generatedTop = this.getTop();
		if (lookup) {
			generatedLanguage.dstr_free();
			generatedTop.text_node_destroy();
			ModernizedCProgram.bfree(lookup);
		} 
	}
	public boolean text_lookup_getstr(Object lookup_val, Object out) {
		text_node generatedTop = this.getTop();
		if (lookup) {
			return generatedTop.lookup_getstring(lookup_val, out);
		} 
		return 0;
	}
	public dstr getLanguage() {
		return language;
	}
	public void setLanguage(dstr newLanguage) {
		language = newLanguage;
	}
	public text_node getTop() {
		return top;
	}
	public void setTop(text_node newTop) {
		top = newTop;
	}
}
