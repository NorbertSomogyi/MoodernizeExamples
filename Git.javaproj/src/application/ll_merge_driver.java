package application;

/*
 * Low level 3-way in-core file merge.
 *
 * Copyright (c) 2007 Junio C Hamano
 */
public class ll_merge_driver {
	private Object[] name;
	private Object description;
	private Object fn;
	private Object recursive;
	private ll_merge_driver next;
	private Byte cmdline;
	
	public ll_merge_driver(Object[] name, Object description, Object fn, Object recursive, ll_merge_driver next, Byte cmdline) {
		setName(name);
		setDescription(description);
		setFn(fn);
		setRecursive(recursive);
		setNext(next);
		setCmdline(cmdline);
	}
	public ll_merge_driver() {
	}
	
	public Object[] getName() {
		return name;
	}
	public void setName(Object[] newName) {
		name = newName;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getRecursive() {
		return recursive;
	}
	public void setRecursive(Object newRecursive) {
		recursive = newRecursive;
	}
	public ll_merge_driver getNext() {
		return next;
	}
	public void setNext(ll_merge_driver newNext) {
		next = newNext;
	}
	public Byte getCmdline() {
		return cmdline;
	}
	public void setCmdline(Byte newCmdline) {
		cmdline = newCmdline;
	}
}
