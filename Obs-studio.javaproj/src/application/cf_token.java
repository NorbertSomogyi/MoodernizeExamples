package application;

public class cf_token {
	private Object lex;
	private strref str;
	private strref unmerged_str;
	private cf_token_type type;
	
	public cf_token(Object lex, strref str, strref unmerged_str, cf_token_type type) {
		setLex(lex);
		setStr(str);
		setUnmerged_str(unmerged_str);
		setType(type);
	}
	public cf_token() {
	}
	
	public boolean go_to_newline() {
		cf_token cur_token = p_cur_token;
		cf_token_type generatedType = cur_token.getType();
		while (generatedType != cf_token_type.CFTOKEN_NEWLINE && generatedType != cf_token_type.CFTOKEN_NONE) {
			cur_token++;
		}
		p_cur_token = cur_token;
		return generatedType != cf_token_type.CFTOKEN_NONE;
	}
	public void cf_token_clear() {
		.memset(t, 0, );
	}
	public void cf_token_copy(Object src) {
		.memcpy(dst, src, );
	}
	public void cf_token_add(Object add) {
		strref generatedStr = this.getStr();
		generatedStr.strref_add(generatedStr);
		strref generatedUnmerged_str = this.getUnmerged_str();
		generatedUnmerged_str.strref_add(generatedUnmerged_str);
	}
	public cf_token cf_lexer_get_tokens(cf_lexer lex) {
		 generatedTokens = lex.getTokens();
		Object generatedArray = generatedTokens.getArray();
		return generatedArray;
	}
	public cf_token cf_def_getparam(Object cfd, Object idx) {
		return cfd.getParams().getArray() + idx;
	}
	public cf_token cf_preprocessor_get_tokens(cf_preprocessor pp) {
		 generatedTokens = pp.getTokens();
		Object generatedArray = generatedTokens.getArray();
		return generatedArray;
	}
	public Object getLex() {
		return lex;
	}
	public void setLex(Object newLex) {
		lex = newLex;
	}
	public strref getStr() {
		return str;
	}
	public void setStr(strref newStr) {
		str = newStr;
	}
	public strref getUnmerged_str() {
		return unmerged_str;
	}
	public void setUnmerged_str(strref newUnmerged_str) {
		unmerged_str = newUnmerged_str;
	}
	public cf_token_type getType() {
		return type;
	}
	public void setType(cf_token_type newType) {
		type = newType;
	}
}
