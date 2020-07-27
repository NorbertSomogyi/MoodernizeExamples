package application;

public class base_token {
	private strref text;
	private base_token_type type;
	private boolean passed_whitespace;
	
	public base_token(strref text, base_token_type type, boolean passed_whitespace) {
		setText(text);
		setType(type);
		setPassed_whitespace(passed_whitespace);
	}
	public base_token() {
	}
	
	public void base_token_clear() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(t, 0, /*Error: Unsupported expression*/);
	}
	public void base_token_copy(base_token src) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, src, /*Error: Unsupported expression*//* ------------------------------------------------------------------------- */);
	}
	public boolean cf_is_token_break(Object token) {
		strref generatedText = this.getText();
		Object[] generatedArray = generatedText.getArray();
		base_token_type generatedType = this.getType();
		switch (generatedType) {
		case /* Falls through. */base_token_type.BASETOKEN_NONE:
				return 1;
		case base_token_type.BASETOKEN_OTHER:
				if (generatedArray == (byte)'.' && token.getType() == base_token_type.BASETOKEN_DIGIT) {
					this.setType(base_token_type.BASETOKEN_DIGIT);
					break;
				} 
		case base_token_type.BASETOKEN_ALPHA:
				if (token.getType() == base_token_type.BASETOKEN_OTHER || token.getType() == base_token_type.BASETOKEN_WHITESPACE) {
					return 1;
				} 
				break;
		case base_token_type.BASETOKEN_DIGIT:
				if (token.getType() == base_token_type.BASETOKEN_WHITESPACE || (token.getType() == base_token_type.BASETOKEN_OTHER && token.getText().getArray() != (byte)'.')) {
					return 1;
				} 
				break;
		case base_token_type.BASETOKEN_WHITESPACE:
				if (ModernizedCProgram.is_space_or_tab(generatedArray) && ModernizedCProgram.is_space_or_tab(generatedArray)) {
					break;
				} 
				return 1;
		}
		return 0;
	}
	public strref getText() {
		return text;
	}
	public void setText(strref newText) {
		text = newText;
	}
	public base_token_type getType() {
		return type;
	}
	public void setType(base_token_type newType) {
		type = newType;
	}
	public boolean getPassed_whitespace() {
		return passed_whitespace;
	}
	public void setPassed_whitespace(boolean newPassed_whitespace) {
		passed_whitespace = newPassed_whitespace;
	}
}
