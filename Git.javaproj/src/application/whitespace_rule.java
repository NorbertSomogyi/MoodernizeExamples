package application;

/*
 * Whitespace rules
 *
 * Copyright (c) 2007 Junio C Hamano
 */
public class whitespace_rule {
	private Object rule_name;
	private int rule_bits;
	private int loosens_error;
	private int exclude_default;
	
	public whitespace_rule(Object rule_name, int rule_bits, int loosens_error, int exclude_default) {
		setRule_name(rule_name);
		setRule_bits(rule_bits);
		setLoosens_error(loosens_error);
		setExclude_default(exclude_default);
	}
	public whitespace_rule() {
	}
	
	public Object getRule_name() {
		return rule_name;
	}
	public void setRule_name(Object newRule_name) {
		rule_name = newRule_name;
	}
	public int getRule_bits() {
		return rule_bits;
	}
	public void setRule_bits(int newRule_bits) {
		rule_bits = newRule_bits;
	}
	public int getLoosens_error() {
		return loosens_error;
	}
	public void setLoosens_error(int newLoosens_error) {
		loosens_error = newLoosens_error;
	}
	public int getExclude_default() {
		return exclude_default;
	}
	public void setExclude_default(int newExclude_default) {
		exclude_default = newExclude_default;
	}
}
