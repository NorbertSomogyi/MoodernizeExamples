package application;

public class cf_lexer {
	private Byte file;
	private lexer base_lexer;
	private byte[] reformatted;
	private byte[] write_offset;
	private  tokens;
	private boolean unexpected_eof;
	
	public cf_lexer(Byte file, lexer base_lexer, byte[] reformatted, byte[] write_offset,  tokens, boolean unexpected_eof) {
		setFile(file);
		setBase_lexer(base_lexer);
		setReformatted(reformatted);
		setWrite_offset(write_offset);
		setTokens(tokens);
		setUnexpected_eof(unexpected_eof);
	}
	public cf_lexer() {
	}
	
	public void cf_lexer_write_strref(Object ref) {
		byte[] generatedWrite_offset = this.getWrite_offset();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(generatedWrite_offset, ref.getArray(), ref.getLen());
		generatedWrite_offset[ref.getLen()] = 0;
		generatedWrite_offset += ref.getLen();
	}
	public boolean cf_lexer_is_include() {
		boolean found_include_import = false;
		boolean found_preprocessor = false;
		size_t i = new size_t();
		 generatedTokens = this.getTokens();
		Object generatedArray = generatedTokens.getArray();
		strref generatedStr = token.getStr();
		Object generatedNum = generatedTokens.getNum();
		for (i = generatedNum; i > 0; i--) {
			cf_token token = generatedArray + (i - 1);
			if (ModernizedCProgram.is_space_or_tab(generatedArray)) {
				continue;
			} 
			if (!found_include_import) {
				if (ModernizedCProgram.strref_cmp(generatedStr, "include") != 0 && ModernizedCProgram.strref_cmp(generatedStr, "import") != 0) {
					break;
				} 
				found_include_import = true;
			}  else if (!found_preprocessor) {
				if (generatedArray != (byte)'#') {
					break;
				} 
				found_preprocessor = true;
			} else {
					return ModernizedCProgram.is_newline(generatedArray);
			} 
		}
		return found_preprocessor && /* if starting line */found_include_import;
	}
	public void cf_lexer_init() {
		lexer generatedBase_lexer = this.getBase_lexer();
		generatedBase_lexer.lexer_init();
		 generatedTokens = this.getTokens();
		Object generatedDa = generatedTokens.getDa();
		generatedDa.darray_init();
		this.setFile(((Object)0));
		this.setReformatted(((Object)0));
		this.setWrite_offset(((Object)0));
		this.setUnexpected_eof(0);
	}
	public void cf_lexer_free() {
		Byte generatedFile = this.getFile();
		ModernizedCProgram.bfree(generatedFile);
		byte[] generatedReformatted = this.getReformatted();
		ModernizedCProgram.bfree(generatedReformatted);
		lexer generatedBase_lexer = this.getBase_lexer();
		generatedBase_lexer.lexer_free();
		 generatedTokens = this.getTokens();
		Object generatedDa = generatedTokens.getDa();
		generatedDa.darray_free();
		this.setFile(((Object)0));
		this.setReformatted(((Object)0));
		this.setWrite_offset(((Object)0));
		this.setUnexpected_eof(0);
	}
	public boolean cf_lexer_lex(Object str, Object file) {
		cf_token token = new cf_token();
		cf_token last_token = ((Object)0);
		lex.cf_lexer_free();
		if (!str || !str) {
			return 0;
		} 
		if (file) {
			this.setFile(ModernizedCProgram.bstrdup(file));
		} 
		lexer generatedBase_lexer = this.getBase_lexer();
		generatedBase_lexer.lexer_start(str);
		token.cf_token_clear();
		this.setReformatted(ModernizedCProgram.bmalloc(/*Error: Function owner not recognized*/strlen(str) + 1));
		byte[] generatedReformatted = this.getReformatted();
		generatedReformatted[0] = 0;
		this.setWrite_offset(generatedReformatted);
		strref generatedStr = last_token.getStr();
		Object[] generatedArray = generatedStr.getArray();
		 generatedTokens = this.getTokens();
		Object generatedDa = generatedTokens.getDa();
		while (ModernizedCProgram.cf_lexer_nexttoken(lex, token)) {
			if (last_token && ModernizedCProgram.is_space_or_tab(generatedArray) && ModernizedCProgram.is_space_or_tab(generatedArray)) {
				last_token.cf_token_add(token);
				continue;
			} 
			token.setLex(lex);
			last_token = generatedDa.darray_push_back_new(/*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(last_token, token, /*Error: Unsupported expression*/);
		}
		token.cf_token_clear();
		byte[] generatedWrite_offset = this.getWrite_offset();
		generatedStr.setArray(generatedWrite_offset);
		Object generatedOffset = generatedBase_lexer.getOffset();
		strref generatedUnmerged_str = token.getUnmerged_str();
		generatedUnmerged_str.setArray(generatedOffset);
		token.setLex(lex);
		generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, token);
		boolean generatedUnexpected_eof = this.getUnexpected_eof();
		return !generatedUnexpected_eof;
	}
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte newFile) {
		file = newFile;
	}
	public lexer getBase_lexer() {
		return base_lexer;
	}
	public void setBase_lexer(lexer newBase_lexer) {
		base_lexer = newBase_lexer;
	}
	public byte[] getReformatted() {
		return reformatted;
	}
	public void setReformatted(byte[] newReformatted) {
		reformatted = newReformatted;
	}
	public byte[] getWrite_offset() {
		return write_offset;
	}
	public void setWrite_offset(byte[] newWrite_offset) {
		write_offset = newWrite_offset;
	}
	public  getTokens() {
		return tokens;
	}
	public void setTokens( newTokens) {
		tokens = newTokens;
	}
	public boolean getUnexpected_eof() {
		return unexpected_eof;
	}
	public void setUnexpected_eof(boolean newUnexpected_eof) {
		unexpected_eof = newUnexpected_eof;
	}
}
