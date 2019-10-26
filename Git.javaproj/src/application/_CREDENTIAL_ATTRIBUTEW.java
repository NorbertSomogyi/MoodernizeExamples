package application;

/* MinGW doesn't have wincred.h, so we need to define stuff */
public class _CREDENTIAL_ATTRIBUTEW {
	private Object Keyword;
	private Object Flags;
	private Object ValueSize;
	private Object Value;
	
	public _CREDENTIAL_ATTRIBUTEW(Object Keyword, Object Flags, Object ValueSize, Object Value) {
		setKeyword(Keyword);
		setFlags(Flags);
		setValueSize(ValueSize);
		setValue(Value);
	}
	public _CREDENTIAL_ATTRIBUTEW() {
	}
	
	public Object getKeyword() {
		return Keyword;
	}
	public void setKeyword(Object newKeyword) {
		Keyword = newKeyword;
	}
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public Object getValueSize() {
		return ValueSize;
	}
	public void setValueSize(Object newValueSize) {
		ValueSize = newValueSize;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object newValue) {
		Value = newValue;
	}
}
