package application;

/*
 * Copyright (c) 2013 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
/*
 * C-family parser
 *
 *   Handles preprocessing/lexing/errors when parsing a file, and provides a
 * set of parsing functions to be able to go through all the resulting tokens
 * more easily.
 */
public class cf_parser {
	private cf_lexer lex;
	private cf_preprocessor pp;
	private error_data error_list;
	private cf_token cur_token;
	
	public cf_parser(cf_lexer lex, cf_preprocessor pp, error_data error_list, cf_token cur_token) {
		setLex(lex);
		setPp(pp);
		setError_list(error_list);
		setCur_token(cur_token);
	}
	public cf_parser() {
	}
	
	public void cf_parser_init() {
		cf_lexer generatedLex = this.getLex();
		generatedLex.cf_lexer_init();
		cf_preprocessor generatedPp = this.getPp();
		generatedPp.cf_preprocessor_init();
		error_data generatedError_list = this.getError_list();
		generatedError_list.error_data_init();
		this.setCur_token(((Object)0));
	}
	public void cf_parser_free() {
		cf_lexer generatedLex = this.getLex();
		generatedLex.cf_lexer_free();
		cf_preprocessor generatedPp = this.getPp();
		generatedPp.cf_preprocessor_free();
		error_data generatedError_list = this.getError_list();
		generatedError_list.error_data_free();
		this.setCur_token(((Object)0));
	}
	public boolean cf_parser_parse(Object str, Object file) {
		cf_lexer generatedLex = this.getLex();
		if (!generatedLex.cf_lexer_lex(str, file)) {
			return 0;
		} 
		cf_preprocessor generatedPp = this.getPp();
		error_data generatedError_list = this.getError_list();
		if (!ModernizedCProgram.cf_preprocess(generatedPp, generatedLex, generatedError_list)) {
			return 0;
		} 
		cf_token cf_token = new cf_token();
		this.setCur_token(cf_token.cf_preprocessor_get_tokens(generatedPp));
		return 1;
	}
	public void cf_adderror_syntax_error() {
		p.cf_adderror("Syntax error", 0, ((Object)0), ((Object)0), ((Object)0));
	}
	public boolean cf_next_token() {
		cf_token generatedCur_token = this.getCur_token();
		cf_token_type generatedType = generatedCur_token.getType();
		if (generatedType != cf_token_type.CFTOKEN_SPACETAB && generatedType != cf_token_type.CFTOKEN_NEWLINE && generatedType != cf_token_type.CFTOKEN_NONE) {
			generatedCur_token++;
		} 
		while (generatedType == cf_token_type.CFTOKEN_SPACETAB || generatedType == cf_token_type.CFTOKEN_NEWLINE) {
			generatedCur_token++;
		}
		return generatedType != cf_token_type.CFTOKEN_NONE;
	}
	public boolean cf_next_valid_token() {
		if (!p.cf_next_token()) {
			p.cf_adderror_unexpected_eof();
			return 0;
		} 
		return 1;
	}
	public boolean cf_go_to_token(Object str1, Object str2) {
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		Object generatedArray = generatedStr.getArray();
		while (p.cf_next_token()) {
			if (ModernizedCProgram.strref_cmp(generatedStr, str1) == 0) {
				return 1;
			}  else if (str2 && ModernizedCProgram.strref_cmp(generatedStr, str2) == 0) {
				return 1;
			}  else if (generatedArray == (byte)'{') {
				if (!p.cf_pass_pair((byte)'{', (byte)'}')) {
					break;
				} 
			} 
		}
		return 0;
	}
	public boolean cf_go_to_valid_token(Object str1, Object str2) {
		if (!p.cf_go_to_token(str1, str2)) {
			p.cf_adderror_unexpected_eof();
			return 0;
		} 
		return 1;
	}
	public boolean cf_go_to_token_type(cf_token_type type) {
		cf_token generatedCur_token = this.getCur_token();
		cf_token_type generatedType = generatedCur_token.getType();
		while (generatedType != cf_token_type.CFTOKEN_NONE && generatedType != cf_token_type.type) {
			generatedCur_token++;
		}
		return generatedType != cf_token_type.CFTOKEN_NONE;
	}
	public int cf_token_should_be(Object str, Object goto1, Object goto2) {
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		if (ModernizedCProgram.strref_cmp(generatedStr, str) == 0) {
			return 0;
		} 
		if (goto1) {
			if (!p.cf_go_to_token(goto1, goto2)) {
				return -5;
			} 
		} 
		p.cf_adderror_expecting(str);
		return -1;
	}
	public int cf_next_token_should_be(Object str, Object goto1, Object goto2) {
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		if (!p.cf_next_token()) {
			p.cf_adderror_unexpected_eof();
			return -5;
		}  else if (ModernizedCProgram.strref_cmp(generatedStr, str) == 0) {
			return 0;
		} 
		if (goto1) {
			if (!p.cf_go_to_token(goto1, goto2)) {
				return -5;
			} 
		} 
		p.cf_adderror_expecting(str);
		return -1;
	}
	public boolean cf_token_is(Object val) {
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		return ModernizedCProgram.strref_cmp(generatedStr, val) == 0;
	}
	public int cf_token_is_type(cf_token_type type, Object type_expected, Object goto_token) {
		cf_token generatedCur_token = this.getCur_token();
		cf_token_type generatedType = generatedCur_token.getType();
		if (generatedType != cf_token_type.type) {
			p.cf_adderror_expecting(type_expected);
			if (goto_token) {
				if (!p.cf_go_to_valid_token(goto_token, ((Object)0))) {
					return -5;
				} 
			} 
			return -1;
		} 
		return 0;
	}
	public void cf_copy_token(byte dst) {
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		Object generatedArray = generatedStr.getArray();
		Object generatedLen = generatedStr.getLen();
		dst = ModernizedCProgram.bstrdup_n(generatedArray, generatedLen);
	}
	public int cf_get_name(byte dst, Object name, Object goto_token) {
		int errcode;
		errcode = p.cf_token_is_type(cf_token_type.CFTOKEN_NAME, name, goto_token);
		if (errcode != 0) {
			return errcode;
		} 
		cf_token generatedCur_token = this.getCur_token();
		strref generatedStr = generatedCur_token.getStr();
		Object generatedArray = generatedStr.getArray();
		Object generatedLen = generatedStr.getLen();
		dst = ModernizedCProgram.bstrdup_n(generatedArray, generatedLen);
		return 0;
	}
	public int cf_next_name(Byte dst, Object name, Object goto_token) {
		if (!p.cf_next_valid_token()) {
			return -5;
		} 
		return p.cf_get_name(dst, name, goto_token);
	}
	public int cf_next_token_copy(Byte dst) {
		if (!p.cf_next_valid_token()) {
			return -5;
		} 
		p.cf_copy_token(dst);
		return 0;
	}
	public boolean cf_pass_pair(byte in, byte out) {
		cf_token generatedCur_token = this.getCur_token();
		cf_token_type generatedType = generatedCur_token.getType();
		strref generatedStr = generatedCur_token.getStr();
		Object generatedArray = generatedStr.getArray();
		if (generatedType != cf_token_type.CFTOKEN_OTHER || generatedArray != in) {
			return generatedType != cf_token_type.CFTOKEN_NONE;
		} 
		generatedCur_token++;
		while (generatedType != cf_token_type.CFTOKEN_NONE) {
			if (generatedArray == in) {
				if (!p.cf_pass_pair(in, out)) {
					break;
				} 
				continue;
			}  else if (generatedArray == out) {
				generatedCur_token++;
				return 1;
			} 
			generatedCur_token++;
		}
		return 0;
	}
	public cf_lexer getLex() {
		return lex;
	}
	public void setLex(cf_lexer newLex) {
		lex = newLex;
	}
	public cf_preprocessor getPp() {
		return pp;
	}
	public void setPp(cf_preprocessor newPp) {
		pp = newPp;
	}
	public error_data getError_list() {
		return error_list;
	}
	public void setError_list(error_data newError_list) {
		error_list = newError_list;
	}
	public cf_token getCur_token() {
		return cur_token;
	}
	public void setCur_token(cf_token newCur_token) {
		cur_token = newCur_token;
	}
}
