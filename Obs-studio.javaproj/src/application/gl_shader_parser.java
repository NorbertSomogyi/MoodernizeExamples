package application;

public class gl_shader_parser {
	private gs_shader_type type;
	private Object input_prefix;
	private Object output_prefix;
	private shader_parser parser;
	private dstr gl_string;
	private Object ;
	
	public gl_shader_parser(gs_shader_type type, Object input_prefix, Object output_prefix, shader_parser parser, dstr gl_string, Object ) {
		setType(type);
		setInput_prefix(input_prefix);
		setOutput_prefix(output_prefix);
		setParser(parser);
		setGl_string(gl_string);
		set();
	}
	public gl_shader_parser() {
	}
	
	public void gl_shader_parser_init(gs_shader_type type) {
		this.setType(gs_shader_type.type);
		if (gs_shader_type.type == GS_SHADER_VERTEX) {
			this.setInput_prefix("_input_attrib");
			this.setOutput_prefix("_vertex_shader_attrib");
		}  else if (gs_shader_type.type == GS_SHADER_PIXEL) {
			this.setInput_prefix("_vertex_shader_attrib");
			this.setOutput_prefix("_pixel_shader_attrib");
		} 
		shader_parser generatedParser = this.getParser();
		generatedParser.shader_parser_init();
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_init();
		Object generatedTexture_samplers = this.getTexture_samplers();
		.da_init(generatedTexture_samplers);
		Object generatedAttribs = this.getAttribs();
		.da_init(generatedAttribs);
	}
	public void gl_shader_parser_free() {
		 i = new ();
		Object generatedAttribs = this.getAttribs();
		for (i = 0; i < generatedAttribs.getNum(); i++) {
			generatedAttribs.getArray() + i.gl_parser_attrib_free();
		}
		.da_free(generatedAttribs);
		Object generatedTexture_samplers = this.getTexture_samplers();
		.da_free(generatedTexture_samplers);
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_free();
		shader_parser generatedParser = this.getParser();
		generatedParser.shader_parser_free();
	}
	public Object sp_getsampler(Object token) {
		 i = new ();
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		Object generatedShader_sampler = sampler.getShader_sampler();
		for (i = 0; i < generatedShader_parser.getNum(); i++) {
			shader_sampler sampler = generatedShader_parser.getArray() + i;
			if (ModernizedCProgram.strref_cmp(token.getStr(), generatedShader_sampler) == 0) {
				return i;
			} 
		}
		return -1;
	}
	public Object gl_write_type_n(Object type, Object len) {
		dstr generatedGl_string = this.getGl_string();
		if (ModernizedCProgram.cmp_type(type, len, "float2", 6) == 0) {
			generatedGl_string.dstr_cat("vec2");
		}  else if (ModernizedCProgram.cmp_type(type, len, "float3", 6) == 0) {
			generatedGl_string.dstr_cat("vec3");
		}  else if (ModernizedCProgram.cmp_type(type, len, "float4", 6) == 0) {
			generatedGl_string.dstr_cat("vec4");
		}  else if (ModernizedCProgram.cmp_type(type, len, "int2", 4) == 0) {
			generatedGl_string.dstr_cat("ivec2");
		}  else if (ModernizedCProgram.cmp_type(type, len, "int3", 4) == 0) {
			generatedGl_string.dstr_cat("ivec3");
		}  else if (ModernizedCProgram.cmp_type(type, len, "int4", 4) == 0) {
			generatedGl_string.dstr_cat("ivec4");
		}  else if (ModernizedCProgram.cmp_type(type, len, "float3x3", 8) == 0) {
			generatedGl_string.dstr_cat("mat3x3");
		}  else if (ModernizedCProgram.cmp_type(type, len, "float3x4", 8) == 0) {
			generatedGl_string.dstr_cat("mat3x4");
		}  else if (ModernizedCProgram.cmp_type(type, len, "float4x4", 8) == 0) {
			generatedGl_string.dstr_cat("mat4x4");
		}  else if (ModernizedCProgram.cmp_type(type, len, "texture2d", 9) == 0) {
			generatedGl_string.dstr_cat("sampler2D");
		}  else if (ModernizedCProgram.cmp_type(type, len, "texture3d", 9) == 0) {
			generatedGl_string.dstr_cat("sampler3D");
		}  else if (ModernizedCProgram.cmp_type(type, len, "texture_cube", 12) == 0) {
			generatedGl_string.dstr_cat("samplerCube");
		}  else if (ModernizedCProgram.cmp_type(type, len, "texture_rect", 12) == 0) {
			generatedGl_string.dstr_cat("sampler2DRect");
		} else {
				return false;
		} 
		return true;
	}
	public void gl_write_type(Object type) {
		dstr generatedGl_string = this.getGl_string();
		if (!glsp.gl_write_type_n(type, .strlen(type))) {
			generatedGl_string.dstr_cat(type);
		} 
	}
	public Object gl_write_type_token(Object token) {
		return glsp.gl_write_type_n(token.getStr().getArray(), token.getStr().getLen());
	}
	public void gl_write_params() {
		 i = new ();
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		dstr generatedGl_string = this.getGl_string();
		for (i = 0; i < generatedShader_parser.getNum(); i++) {
			shader_var var = generatedShader_parser.getArray() + i;
			ModernizedCProgram.gl_write_var(glsp, var);
			generatedGl_string.dstr_cat(";\n");
		}
		generatedGl_string.dstr_cat("\n");
	}
	/* unwraps a structure that's used for input/output */
	public void gl_unwrap_storage_struct(Object st, Object name, Object input, Object prefix) {
		dstr prefix_str = new dstr();
		 i = new ();
		prefix_str.dstr_init();
		if (prefix) {
			prefix_str.dstr_copy(prefix);
		} 
		prefix_str.dstr_cat(name);
		prefix_str.dstr_cat("_");
		Object generatedDstr = prefix_str.getDstr();
		for (i = 0; i < st.getVars().getNum(); i++) {
			shader_var st_var = st.getVars().getArray() + i;
			ModernizedCProgram.gl_write_storage_var(glsp, st_var, input, generatedDstr);
		}
		prefix_str.dstr_free();
	}
	public void gl_write_inputs(Object main) {
		 i = new ();
		for (i = 0; i < main.getParams().getNum(); i++) {
			ModernizedCProgram.gl_write_storage_var(glsp, main.getParams().getArray() + i, true, "inputval_");
		}
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat("\n");
	}
	public void gl_write_outputs(Object main) {
		shader_var var = new shader_var(0);
		var.setShader_var(main.getReturn_type());
		var.setShader_var("outputval");
		if (main.getMapping()) {
			var.setShader_var(main.getMapping());
		} 
		ModernizedCProgram.gl_write_storage_var(glsp, var, false, NULL);
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat("\n");
	}
	public void gl_write_struct(Object st) {
		 i = new ();
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat("struct ");
		generatedGl_string.dstr_cat(st.getName());
		generatedGl_string.dstr_cat(" {\n");
		for (i = 0; i < st.getVars().getNum(); i++) {
			shader_var var = st.getVars().getArray() + i;
			generatedGl_string.dstr_cat("\t");
			ModernizedCProgram.gl_write_var(glsp, var);
			generatedGl_string.dstr_cat(";\n");
		}
		generatedGl_string.dstr_cat("};\n\n");
	}
	public void gl_write_interface_block() {
		gs_shader_type generatedType = this.getType();
		dstr generatedGl_string = this.getGl_string();
		if (generatedType == GS_SHADER_VERTEX) {
			generatedGl_string.dstr_cat("out gl_PerVertex {\n\tvec4 gl_Position;\n};\n\n");
		} 
	}
	public void gl_write_structs() {
		 i = new ();
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		for (i = 0; i < generatedShader_parser.getNum(); i++) {
			shader_struct st = generatedShader_parser.getArray() + i;
			glsp.gl_write_struct(st/*
			 * NOTE: HLSL-> GLSL intrinsic conversions
			 *   atan2    -> atan
			 *   clip     -> (unsupported)
			 *   ddx      -> dFdx
			 *   ddy      -> dFdy
			 *   fmod     -> mod (XXX: these are different if sign is negative)
			 *   frac     -> fract
			 *   lerp     -> mix
			 *   lit      -> (unsupported)
			 *   log10    -> (unsupported)
			 *   mul      -> (change to operator)
			 *   rsqrt    -> inversesqrt
			 *   saturate -> (use clamp)
			 *   tex*     -> texture
			 *   tex*grad -> textureGrad
			 *   tex*lod  -> textureLod
			 *   tex*bias -> (use optional 'bias' value)
			 *   tex*proj -> textureProj
			 *
			 *   All else can be left as-is
			 */);
		}
	}
	public Object gl_write_mul(Object p_token) {
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		cf_parser cfp = generatedShader_parser;
		cfp.setCf_parser(p_token);
		if (!cfp.cf_next_token()) {
			return false;
		} 
		if (!cfp.cf_token_is("(")) {
			return false;
		} 
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat("(");
		Object generatedCf_parser = cfp.getCf_parser();
		glsp.gl_write_function_contents(generatedCf_parser, ",");
		generatedGl_string.dstr_cat(") * (");
		cfp.cf_next_token();
		glsp.gl_write_function_contents(generatedCf_parser, ")");
		generatedGl_string.dstr_cat("))");
		p_token = generatedCf_parser;
		return true;
	}
	public Object gl_write_saturate(Object p_token) {
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		cf_parser cfp = generatedShader_parser;
		cfp.setCf_parser(p_token);
		if (!cfp.cf_next_token()) {
			return false;
		} 
		if (!cfp.cf_token_is("(")) {
			return false;
		} 
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat("clamp");
		Object generatedCf_parser = cfp.getCf_parser();
		glsp.gl_write_function_contents(generatedCf_parser, ")");
		generatedGl_string.dstr_cat(", 0.0, 1.0)");
		p_token = generatedCf_parser;
		return true;
	}
	public Object gl_write_intrinsic(Object p_token) {
		cf_token token = p_token;
		 written = true;
		Object generatedCf_token = token.getCf_token();
		dstr generatedGl_string = this.getGl_string();
		shader_var shader_var = new shader_var();
		Object generatedShader_var = var.getShader_var();
		if (ModernizedCProgram.strref_cmp(generatedCf_token, "atan2") == 0) {
			generatedGl_string.dstr_cat("atan2");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "ddx") == 0) {
			generatedGl_string.dstr_cat("dFdx");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "ddy") == 0) {
			generatedGl_string.dstr_cat("dFdy");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "frac") == 0) {
			generatedGl_string.dstr_cat("fract");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "lerp") == 0) {
			generatedGl_string.dstr_cat("mix");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "fmod") == 0) {
			generatedGl_string.dstr_cat("mod");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "rsqrt") == 0) {
			generatedGl_string.dstr_cat("inversesqrt");
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "saturate") == 0) {
			written = glsp.gl_write_saturate(token);
		}  else if (ModernizedCProgram.strref_cmp(generatedCf_token, "mul") == 0) {
			written = glsp.gl_write_mul(token);
		} else {
				shader_var var = shader_var.sp_getparam(glsp, token);
				if (var && ModernizedCProgram.astrcmp_n(generatedShader_var, "texture", 7) == 0) {
					written = ModernizedCProgram.gl_write_texture_code(glsp, token, var);
				} else {
						written = false;
				} 
		} 
		if (written) {
			p_token = token;
		} 
		return written;
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public void gl_write_function_contents(Object p_token, Object end) {
		cf_token token = p_token;
		Object generatedCf_token = token.getCf_token();
		dstr generatedGl_string = this.getGl_string();
		if (generatedCf_token != CFTOKEN_NAME || (!glsp.gl_write_type_token(token) && !glsp.gl_write_intrinsic(token))) {
			generatedGl_string.dstr_cat_strref(generatedCf_token);
		} 
		while (generatedCf_token != CFTOKEN_NONE) {
			token++;
			if (end && ModernizedCProgram.strref_cmp(generatedCf_token, end) == 0) {
				break;
			} 
			if (generatedCf_token == CFTOKEN_NAME) {
				if (!glsp.gl_write_type_token(token) && !glsp.gl_write_intrinsic(token)) {
					generatedGl_string.dstr_cat_strref(generatedCf_token);
				} 
			}  else if (generatedCf_token == CFTOKEN_OTHER) {
				if (generatedCf_token.getArray() == (byte)'{') {
					glsp.gl_write_function_contents(token, "}");
				}  else if (generatedCf_token.getArray() == (byte)'(') {
					glsp.gl_write_function_contents(token, ")");
				} 
				generatedGl_string.dstr_cat_strref(generatedCf_token);
			} else {
					generatedGl_string.dstr_cat_strref(generatedCf_token);
			} 
		}
		p_token = token;
	}
	public void gl_write_function(Object func) {
		 i = new ();
		cf_token token = new cf_token();
		glsp.gl_write_type(func.getReturn_type());
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_cat(" ");
		if (.strcmp(func.getName(), "main") == 0) {
			generatedGl_string.dstr_cat("_main_wrap");
		} else {
				generatedGl_string.dstr_cat(func.getName());
		} 
		generatedGl_string.dstr_cat("(");
		for (i = 0; i < func.getParams().getNum(); i++) {
			shader_var param = func.getParams().getArray() + i;
			if (i > 0) {
				generatedGl_string.dstr_cat(", ");
			} 
			ModernizedCProgram.gl_write_var(glsp, ModernizedCProgram.param);
		}
		generatedGl_string.dstr_cat(")\n");
		token = func.getStart();
		glsp.gl_write_function_contents(token, "}");
		generatedGl_string.dstr_cat("}\n\n");
	}
	public void gl_write_functions() {
		 i = new ();
		shader_parser generatedParser = this.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		for (i = 0; i < generatedShader_parser.getNum(); i++) {
			shader_func func = generatedShader_parser.getArray() + i;
			glsp.gl_write_function(func);
		}
	}
	public void gl_write_main_storage_outputs(Object main) {
		dstr generatedGl_string = this.getGl_string();
		if (!main.getMapping()) {
			shader_var var = new shader_var(0);
			var.setShader_var("outputval");
			var.setShader_var(main.getReturn_type());
			generatedGl_string.dstr_cat("\n");
			ModernizedCProgram.gl_write_main_storage_assign(glsp, var, NULL, NULL, false);
		} 
	}
	/* ugh, don't ask.  I'll probably get rid of the need for this function later */
	public void gl_rename_attributes() {
		 i = 0;
		 input_idx = 0;
		 output_idx = 0;
		Object generatedAttribs = this.getAttribs();
		Object generatedInput = attrib.getInput();
		Object generatedInput_prefix = this.getInput_prefix();
		Object generatedOutput_prefix = this.getOutput_prefix();
		dstr generatedGl_string = this.getGl_string();
		dstr generatedName = attrib.getName();
		Object generatedDstr = generatedName.getDstr();
		for (i = 0; i < generatedAttribs.getNum(); i++) {
			gl_parser_attrib attrib = generatedAttribs.getArray() + i;
			dstr new_name = new dstr(0);
			byte prefix;
			 val = new ();
			if (generatedInput) {
				prefix = generatedInput_prefix;
				val = input_idx++;
			} else {
					prefix = generatedOutput_prefix;
					val = output_idx++;
			} 
			new_name.dstr_printf("%s%u", prefix, (int)val);
			generatedGl_string.dstr_replace(generatedDstr, generatedDstr);
			generatedName.dstr_move(new_name);
		}
	}
	public Object gl_shader_buildstring() {
		shader_func main_func = new shader_func();
		shader_parser generatedParser = this.getParser();
		shader_func shader_func = new shader_func();
		main_func = shader_func.shader_parser_getfunc(generatedParser, "main");
		if (!main_func) {
			ModernizedCProgram.blog(LOG_ERROR, "function 'main' not found");
			return false;
		} 
		dstr generatedGl_string = this.getGl_string();
		generatedGl_string.dstr_copy("#version 330\n\n");
		generatedGl_string.dstr_cat("const bool obs_glsl_compile = true;\n\n");
		glsp.gl_write_params();
		glsp.gl_write_inputs(main_func);
		glsp.gl_write_outputs(main_func);
		glsp.gl_write_interface_block();
		glsp.gl_write_structs();
		glsp.gl_write_functions();
		ModernizedCProgram.gl_write_main(glsp, main_func);
		glsp.gl_rename_attributes();
		return true;
	}
	public Object gl_shader_parse(Object shader_str, Object file) {
		shader_parser generatedParser = this.getParser();
		 success = generatedParser.shader_parse(shader_str, file);
		byte str = generatedParser.shader_parser_geterrors();
		if (str) {
			ModernizedCProgram.blog(LOG_WARNING, "Shader parser errors/warnings:\n%s\n", str);
			ModernizedCProgram.bfree(str);
		} 
		if (success) {
			success = glsp.gl_shader_buildstring();
		} 
		return success;
	}
	public gs_shader_type getType() {
		return type;
	}
	public void setType(gs_shader_type newType) {
		type = newType;
	}
	public Object getInput_prefix() {
		return input_prefix;
	}
	public void setInput_prefix(Object newInput_prefix) {
		input_prefix = newInput_prefix;
	}
	public Object getOutput_prefix() {
		return output_prefix;
	}
	public void setOutput_prefix(Object newOutput_prefix) {
		output_prefix = newOutput_prefix;
	}
	public shader_parser getParser() {
		return parser;
	}
	public void setParser(shader_parser newParser) {
		parser = newParser;
	}
	public dstr getGl_string() {
		return gl_string;
	}
	public void setGl_string(dstr newGl_string) {
		gl_string = newGl_string;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
