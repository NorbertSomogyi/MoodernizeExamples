package application;

/* added in 7.46.0, provide a curl_off_t length */
/* the last unused */
/* done */
/* structure to be used as parameter for CURLFORM_ARRAY */
public class curl_forms {
	private  option;
	private Object value;
	
	public curl_forms( option, Object value) {
		setOption(option);
		setValue(value);
	}
	public curl_forms() {
	}
	
	public void Curl_formadd_release_local(int nargs, int skip) {
		while (nargs--) {
			if (nargs != skip) {
				if (ModernizedCProgram.Curl_is_formadd_string(forms[nargs].getOption())) {
					if (forms[nargs].getValue()) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((byte)forms[nargs].getValue());
					} 
				} 
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((byte)forms);
	}
	public int Curl_formadd_convert(int formx, int lengthx, int ccsid) {
		int l;
		byte cp;
		byte cp2;
		if (formx < 0 || !forms[formx].getValue()) {
			return 0;
		} 
		if (lengthx >= 0) {
			l = (int)forms[lengthx].getValue();
		} else {
				l = /*Error: Function owner not recognized*/strlen(forms[formx].getValue()) + 1;
		} 
		cp = /*Error: Function owner not recognized*/malloc(4 * l);
		if (!cp) {
			return -1;
		} 
		l = ModernizedCProgram.convert(cp, 4 * l, 819, forms[formx].getValue(), l, ccsid);
		if (l < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cp);
			return -1;
		} 
		cp2 = /*Error: Function owner not recognized*/realloc(cp, /* Shorten buffer to the string size. */l);
		if (cp2) {
			cp = cp2;
		} 
		forms[formx].setValue(cp);
		if (lengthx >= 0) {
			forms[lengthx].setValue((byte)/* Update length after conversion. */l);
		} 
		return l;
	}
	public  getOption() {
		return option;
	}
	public void setOption( newOption) {
		option = newOption;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
