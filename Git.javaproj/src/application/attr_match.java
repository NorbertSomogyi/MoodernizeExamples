package application;

public class attr_match {
	private Byte value;
	private attr_match_mode match_mode;
	
	public attr_match(Byte value, attr_match_mode match_mode) {
		setValue(value);
		setMatch_mode(match_mode);
	}
	public attr_match() {
	}
	
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public attr_match_mode getMatch_mode() {
		return match_mode;
	}
	public void setMatch_mode(attr_match_mode newMatch_mode) {
		match_mode = newMatch_mode;
	}
}
