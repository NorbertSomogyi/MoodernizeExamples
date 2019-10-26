package application;

/* ------------------------------------------------------------------------- */
public class shader_parser {
	private cf_parser cfp;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	
	public shader_parser(cf_parser cfp, Object,  Object,  Object,  Object ) {
		setCfp(cfp);
		set();
		set();
		set();
		set();
	}
	public shader_parser() {
	}
	
	public void sp_parse_sampler_state() {
		shader_sampler ss = new shader_sampler();
		cf_token peek = new cf_token();
		ss.shader_sampler_init();
		cf_parser generatedCfp = this.getCfp();
		Byte generatedName = ss.getName();
		if (generatedCfp.cf_next_name(generatedName, "name", ";") != PARSE_SUCCESS) {
			;
		} 
		if (generatedCfp.cf_next_token_should_be("{", ";", NULL) != PARSE_SUCCESS) {
			;
		} 
		if (!ModernizedCProgram.cf_peek_valid_token(generatedCfp, peek)) {
			;
		} 
		Object generatedCf_token = peek.getCf_token();
		while (ModernizedCProgram.strref_cmp(generatedCf_token, "}") != 0) {
			int ret = ModernizedCProgram.sp_parse_sampler_state_item(sp, ss);
			if (ret == PARSE_EOF) {
				;
			} 
			if (!ModernizedCProgram.cf_peek_valid_token(generatedCfp, peek)) {
				;
			} 
		}
		if (generatedCfp.cf_next_token_should_be("}", ";", NULL) != PARSE_SUCCESS) {
			;
		} 
		if (generatedCfp.cf_next_token_should_be(";", NULL, NULL) != PARSE_SUCCESS) {
			;
		} 
		Object generatedSamplers = this.getSamplers();
		.da_push_back(generatedSamplers, ss);
		return ;
	}
	public void sp_parse_struct() {
		shader_struct ss = new shader_struct();
		ss.shader_struct_init();
		cf_parser generatedCfp = this.getCfp();
		Byte generatedName = ss.getName();
		if (generatedCfp.cf_next_name(generatedName, "name", ";") != PARSE_SUCCESS) {
			;
		} 
		if (generatedCfp.cf_next_token_should_be("{", ";", NULL) != PARSE_SUCCESS) {
			;
		} 
		Object generatedVars = ss.getVars();
		while (/* get structure variables */true) {
			 do_break = false;
			shader_var var = new shader_var();
			var.shader_var_init();
			switch (ModernizedCProgram.sp_parse_struct_var(sp, var)) {
			case PARSE_UNEXPECTED_BREAK:
					generatedCfp.cf_adderror_syntax_error();
			case PARSE_UNEXPECTED_CONTINUE:
					generatedCfp.cf_adderror_syntax_error();
			case /* Falls through. */PARSE_CONTINUE:
					var.shader_var_free();
					continue;
			case PARSE_EOF:
					var.shader_var_free();
					;
			case /* Falls through. */PARSE_BREAK:
					var.shader_var_free();
					do_break = true;
					break;
			}
			if (do_break) {
				break;
			} 
			.da_push_back(generatedVars, var);
		}
		if (generatedCfp.cf_next_token_should_be(";", NULL, NULL) != PARSE_SUCCESS) {
			;
		} 
		Object generatedStructs = this.getStructs();
		.da_push_back(generatedStructs, ss);
		return ;
	}
	public int sp_check_for_keyword(Object keyword, Object val) {
		cf_parser generatedCfp = this.getCfp();
		 new_val = generatedCfp.cf_token_is(keyword);
		if (new_val) {
			if (!generatedCfp.cf_next_valid_token()) {
				return PARSE_EOF;
			} 
			if (new_val && val) {
				generatedCfp.cf_adderror("'$1' keyword already specified", LEX_WARNING, keyword, NULL, NULL);
			} 
			val = new_val;
			return PARSE_CONTINUE;
		} 
		return PARSE_SUCCESS;
	}
	public void sp_parse_function(Byte type, Byte name) {
		shader_func func = new shader_func();
		func.shader_func_init(type, name);
		if (!ModernizedCProgram.sp_parse_func_params(sp, func)) {
			;
		} 
		cf_parser generatedCfp = this.getCfp();
		if (!generatedCfp.cf_next_valid_token()) {
			;
		} 
		if (generatedCfp.cf_token_is(/* if function is mapped to something, for example COLOR */":")) {
			byte mapping = NULL;
			int errorcode = generatedCfp.cf_next_name(mapping, "mapping", "{");
			if (errorcode != PARSE_SUCCESS) {
				;
			} 
			func.setMapping(mapping);
			if (!generatedCfp.cf_next_valid_token()) {
				;
			} 
		} 
		if (!generatedCfp.cf_token_is("{")) {
			generatedCfp.cf_adderror_expecting("{");
			;
		} 
		Object generatedCf_parser = generatedCfp.getCf_parser();
		func.setStart(generatedCf_parser);
		if (!generatedCfp.cf_pass_pair((byte)'{', (byte)'}')) {
			;
		} 
		generatedCfp.cf_next_token();
		func.setEnd(generatedCf_parser);
		Object generatedFuncs = this.getFuncs();
		.da_push_back(generatedFuncs, func);
		return ;
	}
	public void sp_parse_param(Byte type, Byte name, Object is_const, Object is_uniform) {
		shader_var param = new shader_var();
		param.shader_var_init_param(type, name, is_uniform, is_const);
		cf_parser generatedCfp = this.getCfp();
		if (generatedCfp.cf_token_is(";")) {
			;
		} 
		if (generatedCfp.cf_token_is("[") && !ModernizedCProgram.sp_parse_param_array(sp, param)) {
			;
		} 
		if (generatedCfp.cf_token_is("=") && !ModernizedCProgram.sp_parse_param_assign(sp, param)) {
			;
		} 
		if (!generatedCfp.cf_token_is(";")) {
			;
		} 
		return ;
	}
	public Object sp_get_var_specifiers(Object is_const, Object is_uniform) {
		while (true) {
			int code = sp.sp_check_for_keyword("const", is_const);
			if (code == PARSE_EOF) {
				return false;
			}  else if (code == PARSE_CONTINUE) {
				continue;
			} 
			code = sp.sp_check_for_keyword("uniform", is_uniform);
			if (code == PARSE_EOF) {
				return false;
			}  else if (code == PARSE_CONTINUE) {
				continue;
			} 
			break;
		}
		return true;
	}
	public void report_invalid_func_keyword(Object name, Object val) {
		cf_parser generatedCfp = this.getCfp();
		if (val) {
			generatedCfp.cf_adderror("'$1' keyword cannot be used with a function", LEX_ERROR, name, NULL, NULL);
		} 
		cf_parser generatedCfp = ep.getCfp();
		if (val) {
			generatedCfp.cf_adderror("'$1' keyword cannot be used with a function", LEX_ERROR, name, NULL, NULL);
		} 
	}
	public void sp_parse_other() {
		 is_const = false;
		 is_uniform = false;
		byte type = NULL;
		byte name = NULL;
		if (!sp.sp_get_var_specifiers(is_const, is_uniform)) {
			;
		} 
		cf_parser generatedCfp = this.getCfp();
		if (generatedCfp.cf_get_name(type, "type", ";") != PARSE_SUCCESS) {
			;
		} 
		if (generatedCfp.cf_next_name(name, "name", ";") != PARSE_SUCCESS) {
			;
		} 
		if (!generatedCfp.cf_next_valid_token()) {
			;
		} 
		if (generatedCfp.cf_token_is("(")) {
			sp.report_invalid_func_keyword("const", is_const);
			sp.report_invalid_func_keyword("uniform", is_uniform);
			sp.sp_parse_function(type, name);
			return ;
		} else {
				sp.sp_parse_param(type, name, is_const, is_uniform);
				return ;
		} 
		ModernizedCProgram.bfree(name);
	}
	public Object shader_parse(Object shader, Object file) {
		cf_parser generatedCfp = this.getCfp();
		if (!generatedCfp.cf_parser_parse(shader, file)) {
			return false;
		} 
		Object generatedCf_parser = generatedCfp.getCf_parser();
		while (generatedCf_parser && generatedCf_parser.getType() != CFTOKEN_NONE) {
			if (generatedCfp.cf_token_is(";") || ModernizedCProgram.is_whitespace(generatedCf_parser.getStr().getArray())) {
				generatedCf_parser++;
			}  else if (generatedCfp.cf_token_is("struct")) {
				sp.sp_parse_struct();
			}  else if (generatedCfp.cf_token_is("sampler_state")) {
				sp.sp_parse_sampler_state();
			}  else if (generatedCfp.cf_token_is("{")) {
				generatedCfp.cf_adderror("Unexpected code segment", LEX_ERROR, NULL, NULL, NULL);
				generatedCfp.cf_pass_pair((byte)'{', (byte)'}');
			} else {
					/* parameters and functions */sp.sp_parse_other();
			} 
		}
		return !generatedCf_parser.error_data_has_errors();
	}
	public void shader_parser_init() {
		cf_parser generatedCfp = this.getCfp();
		generatedCfp.cf_parser_init();
		Object generatedParams = this.getParams();
		.da_init(generatedParams);
		Object generatedStructs = this.getStructs();
		.da_init(generatedStructs);
		Object generatedSamplers = this.getSamplers();
		.da_init(generatedSamplers);
		Object generatedFuncs = this.getFuncs();
		.da_init(generatedFuncs);
	}
	public void shader_parser_free() {
		 i = new ();
		Object generatedParams = this.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			generatedParams.getArray() + i.shader_var_free();
		}
		Object generatedStructs = this.getStructs();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			generatedStructs.getArray() + i.shader_struct_free();
		}
		Object generatedSamplers = this.getSamplers();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			generatedSamplers.getArray() + i.shader_sampler_free();
		}
		Object generatedFuncs = this.getFuncs();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			generatedFuncs.getArray() + i.shader_func_free();
		}
		cf_parser generatedCfp = this.getCfp();
		generatedCfp.cf_parser_free();
		.da_free(generatedParams);
		.da_free(generatedStructs);
		.da_free(generatedSamplers);
		.da_free(generatedFuncs);
	}
	public Byte shader_parser_geterrors() {
		cf_parser generatedCfp = this.getCfp();
		Object generatedCf_parser = generatedCfp.getCf_parser();
		return generatedCf_parser.error_data_buildstring();
	}
	public cf_parser getCfp() {
		return cfp;
	}
	public void setCfp(cf_parser newCfp) {
		cfp = newCfp;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
