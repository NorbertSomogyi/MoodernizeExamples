package application;

/* ------------------------------------------------------------------------- */
public class effect_parser {
	private gs_effect effect;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private gs_effect_pass cur_pass;
	private cf_parser cfp;
	
	public effect_parser(gs_effect effect, Object,  Object,  Object,  Object,  Object,  Object,  Object,  gs_effect_pass cur_pass, cf_parser cfp) {
		setEffect(effect);
		set();
		set();
		set();
		set();
		set();
		set();
		set();
		setCur_pass(cur_pass);
		setCfp(cfp);
	}
	public effect_parser() {
	}
	
	public void ep_init() {
		Object generatedParams = this.getParams();
		.da_init(generatedParams);
		Object generatedStructs = this.getStructs();
		.da_init(generatedStructs);
		Object generatedFuncs = this.getFuncs();
		.da_init(generatedFuncs);
		Object generatedSamplers = this.getSamplers();
		.da_init(generatedSamplers);
		Object generatedTechniques = this.getTechniques();
		.da_init(generatedTechniques);
		Object generatedFiles = this.getFiles();
		.da_init(generatedFiles);
		Object generatedTokens = this.getTokens();
		.da_init(generatedTokens);
		this.setCur_pass(NULL);
		cf_parser generatedCfp = this.getCfp();
		generatedCfp.cf_parser_init();
	}
	public void ep_free() {
		 i = new ();
		Object generatedParams = this.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			generatedParams.getArray() + i.ep_param_free();
		}
		Object generatedStructs = this.getStructs();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			generatedStructs.getArray() + i.ep_struct_free();
		}
		Object generatedFuncs = this.getFuncs();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			generatedFuncs.getArray() + i.ep_func_free();
		}
		Object generatedSamplers = this.getSamplers();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			generatedSamplers.getArray() + i.ep_sampler_free();
		}
		Object generatedTechniques = this.getTechniques();
		for (i = 0; i < generatedTechniques.getNum(); i++) {
			generatedTechniques.getArray() + i.ep_technique_free();
		}
		this.setCur_pass(NULL);
		cf_parser generatedCfp = this.getCfp();
		generatedCfp.cf_parser_free();
		.da_free(generatedParams);
		.da_free(generatedStructs);
		.da_free(generatedFuncs);
		.da_free(generatedSamplers);
		.da_free(generatedTechniques);
	}
	public void ep_parse_struct() {
		ep_struct eps = new ep_struct();
		eps.ep_struct_init();
		cf_parser generatedCfp = this.getCfp();
		Byte generatedName = eps.getName();
		if (generatedCfp.cf_next_name(generatedName, "name", ";") != PARSE_SUCCESS) {
			;
		} 
		if (generatedCfp.cf_next_token_should_be("{", ";", NULL) != PARSE_SUCCESS) {
			;
		} 
		Object generatedVars = eps.getVars();
		while (/* get structure variables */true) {
			 do_break = false;
			ep_var var = new ep_var();
			var.ep_var_init();
			switch (ModernizedCProgram.ep_parse_struct_var(ep, var)) {
			case PARSE_UNEXPECTED_CONTINUE:
					generatedCfp.cf_adderror_syntax_error();
			case /* Falls through. */PARSE_BREAK:
					var.ep_var_free();
					do_break = true;
					break;
			case /* Falls through. */PARSE_CONTINUE:
					var.ep_var_free();
					continue;
			case PARSE_UNEXPECTED_BREAK:
					generatedCfp.cf_adderror_syntax_error();
			case PARSE_EOF:
					var.ep_var_free();
					;
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
		.da_push_back(generatedStructs, eps);
		return ;
	}
	public int ep_parse_annotations(Object annotations) {
		cf_parser generatedCfp = this.getCfp();
		if (!generatedCfp.cf_token_is("<")) {
			generatedCfp.cf_adderror_expecting("<");
			;
		} 
		while (/* get annotation variables */true) {
			 do_break = false;
			ep_param var = new ep_param();
			var.ep_param_init(ModernizedCProgram.bstrdup(""), ModernizedCProgram.bstrdup(""), false, false, false);
			switch (ModernizedCProgram.ep_parse_param_annotation_var(ep, var)) {
			case /* Falls through. */PARSE_BREAK:
					var.ep_param_free();
					do_break = true;
					break;
			case PARSE_EOF:
					var.ep_param_free();
					;
			case PARSE_UNEXPECTED_BREAK:
					generatedCfp.cf_adderror_syntax_error();
			case /* Falls through. */PARSE_CONTINUE:
					var.ep_param_free();
					continue;
			case PARSE_UNEXPECTED_CONTINUE:
					generatedCfp.cf_adderror_syntax_error();
			}
			if (do_break) {
				break;
			} 
			annotations.darray_push_back(, var);
		}
		if (!generatedCfp.cf_token_is(">")) {
			generatedCfp.cf_adderror_expecting(">");
			;
		} 
		if (!generatedCfp.cf_next_valid_token()) {
			;
		} 
		return true;
	}
	public int ep_parse_pass_command_call(Object call) {
		cf_token end_token = new cf_token();
		end_token.cf_token_clear();
		cf_parser generatedCfp = this.getCfp();
		Object generatedCf_parser = generatedCfp.getCf_parser();
		while (!generatedCfp.cf_token_is(";")) {
			if (generatedCfp.cf_token_is("}")) {
				generatedCfp.cf_adderror_expecting(";");
				return PARSE_CONTINUE;
			} 
			call.darray_push_back(, generatedCf_parser);
			if (!generatedCfp.cf_next_valid_token()) {
				return PARSE_EOF;
			} 
		}
		call.darray_push_back(, generatedCf_parser);
		call.darray_push_back(, end_token);
		return PARSE_SUCCESS;
	}
	public void ep_parse_technique() {
		ep_technique ept = new ep_technique();
		ept.ep_technique_init();
		cf_parser generatedCfp = this.getCfp();
		Byte generatedName = ept.getName();
		if (generatedCfp.cf_next_name(generatedName, "name", ";") != PARSE_SUCCESS) {
			;
		} 
		if (!generatedCfp.cf_next_valid_token()) {
			return ;
		} 
		if (!generatedCfp.cf_token_is("{")) {
			if (!generatedCfp.cf_go_to_token(";", NULL)) {
				generatedCfp.cf_adderror_expecting(";");
				return ;
			} 
			generatedCfp.cf_adderror_expecting("{");
			;
		} 
		if (!generatedCfp.cf_next_valid_token()) {
			;
		} 
		Object generatedPasses = ept.getPasses();
		while (!generatedCfp.cf_token_is("}")) {
			ep_pass pass = new ep_pass();
			pass.ep_pass_init();
			switch (ModernizedCProgram.ep_parse_pass(ep, pass)) {
			case PARSE_UNEXPECTED_CONTINUE:
					pass.ep_pass_free();
					if (!generatedCfp.cf_go_to_token("}", NULL)) {
						;
					} 
					continue;
			case PARSE_EOF:
					pass.ep_pass_free();
					;
			}
			.da_push_back(generatedPasses, pass);
			if (!generatedCfp.cf_next_valid_token()) {
				;
			} 
		}
		generatedCfp.cf_next_token();
		Object generatedTechniques = this.getTechniques();
		.da_push_back(generatedTechniques, ept);
		return ;
		ept.ep_technique_free();
	}
	public void ep_parse_sampler_state() {
		ep_sampler eps = new ep_sampler();
		cf_token peek = new cf_token();
		eps.ep_sampler_init();
		cf_parser generatedCfp = this.getCfp();
		Byte generatedName = eps.getName();
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
			int ret = ModernizedCProgram.ep_parse_sampler_state_item(ep, eps);
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
		.da_push_back(generatedSamplers, eps);
		return ;
	}
	public int ep_check_for_keyword(Object keyword, Object val) {
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
	public void ep_parse_function(Byte type, Byte name) {
		ep_func func = new ep_func();
		int code;
		func.ep_func_init(type, name);
		ep_struct ep_struct = new ep_struct();
		Object generatedStruct_deps = func.getStruct_deps();
		Byte generatedRet_type = func.getRet_type();
		if (ep_struct.ep_getstruct(ep, type)) {
			.da_push_back(generatedStruct_deps, generatedRet_type);
		} 
		if (!ModernizedCProgram.ep_parse_func_params(ep, func)) {
			;
		} 
		cf_parser generatedCfp = this.getCfp();
		if (!generatedCfp.cf_next_valid_token()) {
			;
		} 
		Byte generatedMapping = func.getMapping();
		if (generatedCfp.cf_token_is(/* if function is mapped to something, for example COLOR */":")) {
			code = generatedCfp.cf_next_name(generatedMapping, "mapping specifier", "{");
			if (code == PARSE_EOF) {
				;
			}  else if (code != PARSE_CONTINUE) {
				if (!generatedCfp.cf_next_valid_token()) {
					;
				} 
			} 
		} 
		if (!generatedCfp.cf_token_is("{")) {
			generatedCfp.cf_adderror_expecting("{");
			;
		} 
		if (!ModernizedCProgram.ep_parse_func_contents(ep, func)) {
			;
		} 
		generatedCfp.cf_next_token();
		Object generatedFuncs = this.getFuncs();
		.da_push_back(generatedFuncs, func);
		return ;
	}
	public void ep_parse_param(Byte type, Byte name, Object is_property, Object is_const, Object is_uniform) {
		ep_param param = new ep_param();
		param.ep_param_init(type, name, is_property, is_const, is_uniform);
		cf_parser generatedCfp = this.getCfp();
		if (generatedCfp.cf_token_is(";")) {
			;
		} 
		if (generatedCfp.cf_token_is("[") && !ModernizedCProgram.ep_parse_param_array(ep, param)) {
			;
		} 
		if (generatedCfp.cf_token_is("<") && !ModernizedCProgram.ep_parse_param_annotations(ep, param)) {
			;
		} 
		if (generatedCfp.cf_token_is("=") && !ModernizedCProgram.ep_parse_param_assign(ep, param)) {
			;
		} 
		if (!generatedCfp.cf_token_is(";")) {
			;
		} 
		return ;
	}
	public Object ep_get_var_specifiers(Object is_property, Object is_const, Object is_uniform) {
		while (true) {
			int code;
			code = ep.ep_check_for_keyword("property", is_property);
			if (code == PARSE_EOF) {
				return false;
			}  else if (code == PARSE_CONTINUE) {
				continue;
			} 
			code = ep.ep_check_for_keyword("const", is_const);
			if (code == PARSE_EOF) {
				return false;
			}  else if (code == PARSE_CONTINUE) {
				continue;
			} 
			code = ep.ep_check_for_keyword("uniform", is_uniform);
			if (code == PARSE_EOF) {
				return false;
			}  else if (code == PARSE_CONTINUE) {
				continue;
			} 
			break;
		}
		return true;
	}
	public void ep_parse_other() {
		 is_property = false;
		 is_const = false;
		 is_uniform = false;
		byte type = NULL;
		byte name = NULL;
		if (!ep.ep_get_var_specifiers(is_property, is_const, is_uniform)) {
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
			ep.report_invalid_func_keyword("property", is_property);
			ep.report_invalid_func_keyword("const", is_const);
			ep.report_invalid_func_keyword("uniform", is_uniform);
			ep.ep_parse_function(type, name);
			return ;
		} else {
				ep.ep_parse_param(type, name, is_property, is_const, is_uniform);
				return ;
		} 
		ModernizedCProgram.bfree(name);
	}
	public void ep_reset_written() {
		 i = new ();
		Object generatedParams = this.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			generatedParams.getArray()[i].setWritten(false);
		}
		Object generatedStructs = this.getStructs();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			generatedStructs.getArray()[i].setWritten(false);
		}
		Object generatedFuncs = this.getFuncs();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			generatedFuncs.getArray()[i].setWritten(false);
		}
		Object generatedSamplers = this.getSamplers();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			generatedSamplers.getArray()[i].setWritten(false);
		}
	}
	public void ep_compile_param(Object idx) {
		gs_effect_param param = new gs_effect_param();
		ep_param param_in = new ep_param();
		gs_effect generatedEffect = this.getEffect();
		Object generatedParams = generatedEffect.getParams();
		param = generatedParams.getArray() + idx;
		param_in = generatedParams.getArray() + idx;
		param_in.setParam(param);
		Byte generatedName = param_in.getName();
		param.setName(ModernizedCProgram.bstrdup(generatedName));
		param.setSection(effect_section.EFFECT_PARAM);
		param.setEffect(generatedEffect);
		Object generatedDefault_val = param.getDefault_val();
		.da_move(generatedDefault_val, generatedDefault_val);
		Byte generatedType = param_in.getType();
		param.setType(ModernizedCProgram.get_effect_param_type(generatedType));
		if (.strcmp(generatedName, "ViewProj") == 0) {
			generatedEffect.setView_proj(param);
		}  else if (.strcmp(generatedName, "World") == 0) {
			generatedEffect.setWorld(param);
		} 
		ModernizedCProgram.ep_compile_param_annotations(param_in, param, ep);
	}
	public Object ep_compile_technique(Object idx) {
		gs_effect_technique tech = new gs_effect_technique();
		ep_technique tech_in = new ep_technique();
		 success = true;
		 i = new ();
		gs_effect generatedEffect = this.getEffect();
		Object generatedTechniques = generatedEffect.getTechniques();
		tech = generatedTechniques.getArray() + idx;
		tech_in = generatedTechniques.getArray() + idx;
		Byte generatedName = tech_in.getName();
		tech.setName(ModernizedCProgram.bstrdup(generatedName));
		tech.setSection(effect_section.EFFECT_TECHNIQUE);
		tech.setEffect(generatedEffect);
		Object generatedPasses = tech.getPasses();
		.da_resize(generatedPasses, generatedPasses.getNum());
		for (i = 0; i < generatedPasses.getNum(); i++) {
			if (!ModernizedCProgram.ep_compile_pass(ep, tech, tech_in, i)) {
				success = false;
			} 
		}
		return success;
	}
	public Object ep_compile() {
		 success = true;
		 i = new ();
		gs_effect generatedEffect = this.getEffect();
		((generatedEffect) ? (Object)0 : ._assert("ep->effect", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\effect-parser.c", 2066));
		Object generatedParams = generatedEffect.getParams();
		.da_resize(generatedParams, generatedParams.getNum());
		Object generatedTechniques = generatedEffect.getTechniques();
		.da_resize(generatedTechniques, generatedTechniques.getNum());
		for (i = 0; i < generatedParams.getNum(); i++) {
			ep.ep_compile_param(i);
		}
		for (i = 0; i < generatedTechniques.getNum(); i++) {
			if (!ep.ep_compile_technique(i)) {
				success = false;
			} 
		}
		return success;
	}
	public gs_effect getEffect() {
		return effect;
	}
	public void setEffect(gs_effect newEffect) {
		effect = newEffect;
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
	public gs_effect_pass getCur_pass() {
		return cur_pass;
	}
	public void setCur_pass(gs_effect_pass newCur_pass) {
		cur_pass = newCur_pass;
	}
	public cf_parser getCfp() {
		return cfp;
	}
	public void setCfp(cf_parser newCfp) {
		cfp = newCfp;
	}
}
