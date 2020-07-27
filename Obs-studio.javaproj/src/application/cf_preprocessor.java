package application;

public class cf_preprocessor {
	private cf_lexer lex;
	private error_data ed;
	private  defines;
	private  sys_include_dirs;
	private  dependencies;
	private  tokens;
	private boolean ignore_state;
	
	public cf_preprocessor(cf_lexer lex, error_data ed,  defines,  sys_include_dirs,  dependencies,  tokens, boolean ignore_state) {
		setLex(lex);
		setEd(ed);
		setDefines(defines);
		setSys_include_dirs(sys_include_dirs);
		setDependencies(dependencies);
		setTokens(tokens);
		setIgnore_state(ignore_state);
	}
	public cf_preprocessor() {
	}
	
	public void cf_preprocessor_add_sys_include_dir(Object include_dir) {
		 generatedSys_include_dirs = this.getSys_include_dirs();
		Object generatedArray = generatedSys_include_dirs.getArray();
		Object generatedDa = generatedSys_include_dirs.getDa();
		if (include_dir) {
			generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, ModernizedCProgram.bstrdup(include_dir));
		} 
	}
	public void cf_gettokenoffset(Object token, Object row, Object col) {
		cf_lexer generatedLex = this.getLex();
		lexer generatedBase_lexer = generatedLex.getBase_lexer();
		ModernizedCProgram.lexer_getstroffset(generatedBase_lexer, token.getUnmerged_str().getArray(), row, col);
	}
	public void cf_addew(Object token, Object message, int error_level, Object val1, Object val2, Object val3) {
		uint32_t row = new uint32_t();
		uint32_t col = new uint32_t();
		pp.cf_gettokenoffset(token, row, col);
		error_data generatedEd = this.getEd();
		byte[] generatedArray = formatted.getArray();
		if (!val1 && !val2 && !val3) {
			generatedEd.error_data_add(token.getLex().getFile(), row, col, message, error_level);
		} else {
				dstr formatted = new dstr();
				formatted.dstr_init();
				formatted.dstr_safe_printf(message, val1, val2, val3, ((Object)0));
				generatedEd.error_data_add(token.getLex().getFile(), row, col, generatedArray, error_level);
				formatted.dstr_free();
		} 
	}
	public void cf_adderror(Object token, Object error, Object val1, Object val2, Object val3) {
		pp.cf_addew(token, error, 0, val1, val2, val3);
		uint32_t row = new uint32_t();
		uint32_t col = new uint32_t();
		cf_token generatedCur_token = p.getCur_token();
		Object generatedLex = generatedCur_token.getLex();
		strref generatedUnmerged_str = generatedCur_token.getUnmerged_str();
		Object[] generatedArray = generatedUnmerged_str.getArray();
		ModernizedCProgram.lexer_getstroffset(generatedLex.getCf_lexer(), generatedArray, row, col);
		error_data generatedError_list = p.getError_list();
		if (!val1 && !val2 && !val3) {
			generatedError_list.error_data_add(generatedLex.getCf_lexer(), row, col, error, level);
		} else {
				dstr formatted = new dstr();
				formatted.dstr_init();
				formatted.dstr_safe_printf(error, val1, val2, val3, ((Object)0));
				generatedError_list.error_data_add(generatedLex.getCf_lexer(), row, col, generatedArray, level);
				formatted.dstr_free();
		} 
	}
	public void cf_addwarning(Object token, Object warning, Object val1, Object val2, Object val3) {
		pp.cf_addew(token, warning, 1, val1, val2, val3);
	}
	public void cf_adderror_expected_newline(Object token) {
		pp.cf_adderror(token, "Unexpected token after preprocessor, expected newline", ((Object)0), ((Object)0), ((Object)0));
	}
	public void cf_adderror_unexpected_endif_eof(Object token) {
		pp.cf_adderror(token, "Unexpected end of file before #endif", ((Object)0), ((Object)0), ((Object)0));
	}
	public void cf_include_file(Object file_token) {
		cf_lexer new_lex = new cf_lexer();
		dstr str_file = new dstr();
		FILE file = new FILE();
		byte file_data;
		cf_token tokens = new cf_token();
		size_t i = new size_t();
		str_file.dstr_init();
		str_file.dstr_copy_strref(file_token.getStr());
		Object generatedLen = str_file.getLen();
		str_file.dstr_mid(str_file, 1, generatedLen - 2);
		ModernizedCProgram.insert_path(pp, str_file);
		 generatedDependencies = this.getDependencies();
		Object generatedNum = generatedDependencies.getNum();
		Object generatedArray = generatedDependencies.getArray();
		Byte generatedFile = dep.getFile();
		cf_token cf_token = new cf_token();
		for (i = 0; i < generatedNum; /* if dependency already exists, run preprocessor on it */i++) {
			cf_lexer dep = generatedArray + i;
			if (/*Error: Function owner not recognized*/strcmp(generatedFile, generatedArray) == 0) {
				tokens = cf_token.cf_lexer_get_tokens(dep);
				ModernizedCProgram.cf_preprocess_tokens(pp, 0, tokens);
				;
			} 
		}
		file = ModernizedCProgram.os_fopen(generatedArray, "rb");
		if (!file) {
			pp.cf_adderror(file_token, "Could not open file '$1'", generatedArray, ((Object)0), ((Object)0));
			;
		} 
		file.os_fread_utf8(file_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(file);
		new_lex.cf_lexer_init();
		new_lex.cf_lexer_lex(file_data, generatedArray);
		tokens = cf_token.cf_lexer_get_tokens(new_lex);
		ModernizedCProgram.cf_preprocess_tokens(pp, 0, tokens);
		ModernizedCProgram.bfree(file_data);
		Object generatedDa = generatedDependencies.getDa();
		generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, new_lex);
	}
	public Object cf_preprocess_get_def_idx(Object def_name) {
		 generatedDefines = this.getDefines();
		Object generatedArray = generatedDefines.getArray();
		cf_def array = generatedArray;
		size_t i = new size_t();
		Object generatedNum = generatedDefines.getNum();
		cf_token generatedName = cur_def.getName();
		strref generatedStr = generatedName.getStr();
		for (i = 0; i < generatedNum; i++) {
			cf_def cur_def = array + i;
			if (ModernizedCProgram.strref_cmp_strref(generatedStr, def_name) == 0) {
				return i;
			} 
		}
		return ((size_t)-1);
	}
	public void cf_preprocess_remove_def_strref(Object ref) {
		size_t def_idx = pp.cf_preprocess_get_def_idx(ref);
		 generatedDefines = this.getDefines();
		Object generatedArray = generatedDefines.getArray();
		Object generatedDa = generatedDefines.getDa();
		if (def_idx != ((size_t)-1)) {
			cf_def array = generatedArray;
			array + def_idx.cf_def_free();
			generatedDa.darray_erase(/*Error: sizeof expression not supported yet*/, def_idx);
		} 
	}
	public void cf_preprocessor_init() {
		 generatedDefines = this.getDefines();
		Object generatedDa = generatedDefines.getDa();
		generatedDa.darray_init();
		generatedDa.darray_init();
		generatedDa.darray_init();
		generatedDa.darray_init();
		this.setLex(((Object)0));
		this.setEd(((Object)0));
		this.setIgnore_state(0);
	}
	public void cf_preprocessor_free() {
		 generatedDependencies = this.getDependencies();
		Object generatedArray = generatedDependencies.getArray();
		cf_lexer dependencies = generatedArray;
		byte sys_include_dirs = generatedArray;
		cf_def defs = generatedArray;
		size_t i = new size_t();
		 generatedDefines = this.getDefines();
		Object generatedNum = generatedDefines.getNum();
		for (i = 0; i < generatedNum; i++) {
			defs + i.cf_def_free();
		}
		for (i = 0; i < generatedNum; i++) {
			ModernizedCProgram.bfree(sys_include_dirs[i]);
		}
		for (i = 0; i < generatedNum; i++) {
			dependencies + i.cf_lexer_free();
		}
		Object generatedDa = generatedDefines.getDa();
		generatedDa.darray_free();
		generatedDa.darray_free();
		generatedDa.darray_free();
		generatedDa.darray_free();
		this.setLex(((Object)0));
		this.setEd(((Object)0));
		this.setIgnore_state(0);
	}
	public void cf_preprocessor_remove_def(Object def_name) {
		strref ref = new strref();
		ref.setArray(def_name);
		ref.setLen(/*Error: Function owner not recognized*/strlen(def_name));
		pp.cf_preprocess_remove_def_strref(ref);
	}
	public cf_lexer getLex() {
		return lex;
	}
	public void setLex(cf_lexer newLex) {
		lex = newLex;
	}
	public error_data getEd() {
		return ed;
	}
	public void setEd(error_data newEd) {
		ed = newEd;
	}
	public  getDefines() {
		return defines;
	}
	public void setDefines( newDefines) {
		defines = newDefines;
	}
	public  getSys_include_dirs() {
		return sys_include_dirs;
	}
	public void setSys_include_dirs( newSys_include_dirs) {
		sys_include_dirs = newSys_include_dirs;
	}
	public  getDependencies() {
		return dependencies;
	}
	public void setDependencies( newDependencies) {
		dependencies = newDependencies;
	}
	public  getTokens() {
		return tokens;
	}
	public void setTokens( newTokens) {
		tokens = newTokens;
	}
	public boolean getIgnore_state() {
		return ignore_state;
	}
	public void setIgnore_state(boolean newIgnore_state) {
		ignore_state = newIgnore_state;
	}
}
