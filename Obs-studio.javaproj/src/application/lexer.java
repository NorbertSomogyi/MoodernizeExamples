package application;

/* ------------------------------------------------------------------------- */
public class lexer {
	private Byte text;
	private Object offset;
	
	public lexer(Byte text, Object offset) {
		setText(text);
		setOffset(offset);
	}
	public lexer() {
	}
	
	public boolean lookup_goto_nextline() {
		strref val = new strref();
		boolean success = true;
		val.strref_clear();
		Object generatedArray = val.getArray();
		while (1) {
			if (!ModernizedCProgram.lookup_gettoken(p, val)) {
				success = false;
				break;
			} 
			if (generatedArray == (byte)'\n') {
				break;
			} 
		}
		return success;
	}
	public void lexer_init() {
		.memset(lex, 0, );
	}
	public void lexer_free() {
		Byte generatedText = this.getText();
		ModernizedCProgram.bfree(generatedText);
		lex.lexer_init();
	}
	public void lexer_start(Object text) {
		lex.lexer_free();
		this.setText(ModernizedCProgram.bstrdup(text));
		Byte generatedText = this.getText();
		this.setOffset(generatedText);
	}
	public void lexer_start_move(Byte text) {
		lex.lexer_free();
		this.setText(text);
		Byte generatedText = this.getText();
		this.setOffset(generatedText);
	}
	public void lexer_reset() {
		Byte generatedText = this.getText();
		this.setOffset(generatedText);
	}
	public Byte getText() {
		return text;
	}
	public void setText(Byte newText) {
		text = newText;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
}
