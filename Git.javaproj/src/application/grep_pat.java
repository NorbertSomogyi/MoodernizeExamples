package application;

public class grep_pat {
	private grep_pat next;
	private Object origin;
	private int no;
	private grep_pat_token token;
	private Byte pattern;
	private Object patternlen;
	private grep_header_field field;
	private Object regexp;
	private Object pcre1_regexp;
	private Object pcre1_extra_info;
	private Object pcre1_tables;
	private int pcre1_jit_on;
	private Object pcre2_pattern;
	private Object pcre2_match_data;
	private Object pcre2_compile_context;
	private Object pcre2_tables;
	private Object pcre2_jit_on;
	private int fixed;
	private int is_fixed;
	private int ignore_case;
	private int word_regexp;
	
	public grep_pat(grep_pat next, Object origin, int no, grep_pat_token token, Byte pattern, Object patternlen, grep_header_field field, Object regexp, Object pcre1_regexp, Object pcre1_extra_info, Object pcre1_tables, int pcre1_jit_on, Object pcre2_pattern, Object pcre2_match_data, Object pcre2_compile_context, Object pcre2_tables, Object pcre2_jit_on, int fixed, int is_fixed, int ignore_case, int word_regexp) {
		setNext(next);
		setOrigin(origin);
		setNo(no);
		setToken(token);
		setPattern(pattern);
		setPatternlen(patternlen);
		setField(field);
		setRegexp(regexp);
		setPcre1_regexp(pcre1_regexp);
		setPcre1_extra_info(pcre1_extra_info);
		setPcre1_tables(pcre1_tables);
		setPcre1_jit_on(pcre1_jit_on);
		setPcre2_pattern(pcre2_pattern);
		setPcre2_match_data(pcre2_match_data);
		setPcre2_compile_context(pcre2_compile_context);
		setPcre2_tables(pcre2_tables);
		setPcre2_jit_on(pcre2_jit_on);
		setFixed(fixed);
		setIs_fixed(is_fixed);
		setIgnore_case(ignore_case);
		setWord_regexp(word_regexp);
	}
	public grep_pat() {
	}
	
	public grep_pat getNext() {
		return next;
	}
	public void setNext(grep_pat newNext) {
		next = newNext;
	}
	public Object getOrigin() {
		return origin;
	}
	public void setOrigin(Object newOrigin) {
		origin = newOrigin;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int newNo) {
		no = newNo;
	}
	public grep_pat_token getToken() {
		return token;
	}
	public void setToken(grep_pat_token newToken) {
		token = newToken;
	}
	public Byte getPattern() {
		return pattern;
	}
	public void setPattern(Byte newPattern) {
		pattern = newPattern;
	}
	public Object getPatternlen() {
		return patternlen;
	}
	public void setPatternlen(Object newPatternlen) {
		patternlen = newPatternlen;
	}
	public grep_header_field getField() {
		return field;
	}
	public void setField(grep_header_field newField) {
		field = newField;
	}
	public Object getRegexp() {
		return regexp;
	}
	public void setRegexp(Object newRegexp) {
		regexp = newRegexp;
	}
	public Object getPcre1_regexp() {
		return pcre1_regexp;
	}
	public void setPcre1_regexp(Object newPcre1_regexp) {
		pcre1_regexp = newPcre1_regexp;
	}
	public Object getPcre1_extra_info() {
		return pcre1_extra_info;
	}
	public void setPcre1_extra_info(Object newPcre1_extra_info) {
		pcre1_extra_info = newPcre1_extra_info;
	}
	public Object getPcre1_tables() {
		return pcre1_tables;
	}
	public void setPcre1_tables(Object newPcre1_tables) {
		pcre1_tables = newPcre1_tables;
	}
	public int getPcre1_jit_on() {
		return pcre1_jit_on;
	}
	public void setPcre1_jit_on(int newPcre1_jit_on) {
		pcre1_jit_on = newPcre1_jit_on;
	}
	public Object getPcre2_pattern() {
		return pcre2_pattern;
	}
	public void setPcre2_pattern(Object newPcre2_pattern) {
		pcre2_pattern = newPcre2_pattern;
	}
	public Object getPcre2_match_data() {
		return pcre2_match_data;
	}
	public void setPcre2_match_data(Object newPcre2_match_data) {
		pcre2_match_data = newPcre2_match_data;
	}
	public Object getPcre2_compile_context() {
		return pcre2_compile_context;
	}
	public void setPcre2_compile_context(Object newPcre2_compile_context) {
		pcre2_compile_context = newPcre2_compile_context;
	}
	public Object getPcre2_tables() {
		return pcre2_tables;
	}
	public void setPcre2_tables(Object newPcre2_tables) {
		pcre2_tables = newPcre2_tables;
	}
	public Object getPcre2_jit_on() {
		return pcre2_jit_on;
	}
	public void setPcre2_jit_on(Object newPcre2_jit_on) {
		pcre2_jit_on = newPcre2_jit_on;
	}
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int newFixed) {
		fixed = newFixed;
	}
	public int getIs_fixed() {
		return is_fixed;
	}
	public void setIs_fixed(int newIs_fixed) {
		is_fixed = newIs_fixed;
	}
	public int getIgnore_case() {
		return ignore_case;
	}
	public void setIgnore_case(int newIgnore_case) {
		ignore_case = newIgnore_case;
	}
	public int getWord_regexp() {
		return word_regexp;
	}
	public void setWord_regexp(int newWord_regexp) {
		word_regexp = newWord_regexp;
	}
}
