package application;

public class urlmatch_current_candidate_value {
	private byte value_is_null;
	private strbuf value;
	
	public urlmatch_current_candidate_value(byte value_is_null, strbuf value) {
		setValue_is_null(value_is_null);
		setValue(value);
	}
	public urlmatch_current_candidate_value() {
	}
	
	public byte getValue_is_null() {
		return value_is_null;
	}
	public void setValue_is_null(byte newValue_is_null) {
		value_is_null = newValue_is_null;
	}
	public strbuf getValue() {
		return value;
	}
	public void setValue(strbuf newValue) {
		value = newValue;
	}
}
