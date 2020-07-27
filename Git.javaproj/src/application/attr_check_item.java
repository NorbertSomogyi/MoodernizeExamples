package application;

/*
 * Send one or more git_attr_check to git_check_attrs(), and
 * each 'value' member tells what its value is.
 * Unset one is returned as NULL.
 */
public class attr_check_item {
	private Object attr;
	private Object value;
	
	public attr_check_item(Object attr, Object value) {
		setAttr(attr);
		setValue(value);
	}
	public attr_check_item() {
	}
	
	public Object git_path_check_encoding() {
		byte value = ModernizedCProgram.check.getValue();
		if (((value) == ((Object)0)) || !/*Error: Function owner not recognized*/strlen(value)) {
			return ((Object)0);
		} 
		if (((value) == ModernizedCProgram.git_attr__true) || ((value) == ModernizedCProgram.git_attr__false)) {
			ModernizedCProgram.die(ModernizedCProgram._("true/false are no valid working-tree-encodings"));
		} 
		if (ModernizedCProgram.same_encoding(value, /* Don't encode to the default encoding */ModernizedCProgram.default_encoding)) {
			return ((Object)0);
		} 
		return value;
	}
	public crlf_action git_path_check_crlf() {
		byte value = ModernizedCProgram.check.getValue();
		if (((value) == ModernizedCProgram.git_attr__true)) {
			return crlf_action.CRLF_TEXT;
		}  else if (((value) == ModernizedCProgram.git_attr__false)) {
			return crlf_action.CRLF_BINARY;
		}  else if (((value) == ((Object)0))) {
			;
		}  else if (!/*Error: Function owner not recognized*/strcmp(value, "input")) {
			return crlf_action.CRLF_TEXT_INPUT;
		}  else if (!/*Error: Function owner not recognized*/strcmp(value, "auto")) {
			return crlf_action.CRLF_AUTO;
		} 
		return crlf_action.CRLF_UNDEFINED;
	}
	public eol git_path_check_eol() {
		byte value = ModernizedCProgram.check.getValue();
		if (((value) == ((Object)0))) {
			;
		}  else if (!/*Error: Function owner not recognized*/strcmp(value, "lf")) {
			return eol.EOL_LF;
		}  else if (!/*Error: Function owner not recognized*/strcmp(value, "crlf")) {
			return eol.EOL_CRLF;
		} 
		return eol.EOL_UNSET;
	}
	public int git_path_check_ident() {
		byte value = ModernizedCProgram.check.getValue();
		return !!((value) == ModernizedCProgram.git_attr__true);
	}
	public attr_check_item attr_check_append(attr_check check, Object attr) {
		attr_check_item item = new attr_check_item();
		int generatedNr = check.getNr();
		int generatedAlloc = check.getAlloc();
		attr_check_item[] generatedItems = check.getItems();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					check.setAlloc((generatedNr + 1));
				} else {
						check.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedItems) = ModernizedCProgram.xrealloc((generatedItems), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
			} 
		} while (0);
		item = generatedItems[generatedNr++];
		item.setAttr(attr);
		return item;
	}
	public Object getAttr() {
		return attr;
	}
	public void setAttr(Object newAttr) {
		attr = newAttr;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
