package application;

/*
 * Copyright (c) 2013, 2014 Christian Couder <chriscool@tuxfamily.org>
 */
public class conf_info {
	private Byte name;
	private Byte key;
	private Byte command;
	private trailer_where where;
	private trailer_if_exists if_exists;
	private trailer_if_missing if_missing;
	
	public conf_info(Byte name, Byte key, Byte command, trailer_where where, trailer_if_exists if_exists, trailer_if_missing if_missing) {
		setName(name);
		setKey(key);
		setCommand(command);
		setWhere(where);
		setIf_exists(if_exists);
		setIf_missing(if_missing);
	}
	public conf_info() {
	}
	
	public void duplicate_conf(Object src) {
		dst = src;
		this.setName(ModernizedCProgram.xstrdup_or_null(src.getName()));
		this.setKey(ModernizedCProgram.xstrdup_or_null(src.getKey()));
		this.setCommand(ModernizedCProgram.xstrdup_or_null(src.getCommand()));
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getCommand() {
		return command;
	}
	public void setCommand(Byte newCommand) {
		command = newCommand;
	}
	public trailer_where getWhere() {
		return where;
	}
	public void setWhere(trailer_where newWhere) {
		where = newWhere;
	}
	public trailer_if_exists getIf_exists() {
		return if_exists;
	}
	public void setIf_exists(trailer_if_exists newIf_exists) {
		if_exists = newIf_exists;
	}
	public trailer_if_missing getIf_missing() {
		return if_missing;
	}
	public void setIf_missing(trailer_if_missing newIf_missing) {
		if_missing = newIf_missing;
	}
}
