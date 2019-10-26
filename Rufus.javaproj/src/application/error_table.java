package application;

/*
 * Header file for common error description library.
 *
 * Copyright 1988, Student Information Processing Board of the
 * Massachusetts Institute of Technology.
 *
 * For copyright and distribution info, see the documentation supplied
 * with this package.
 */
public class error_table {
	private Object msgs;
	private long base;
	private int n_msgs;
	
	public error_table(Object msgs, long base, int n_msgs) {
		setMsgs(msgs);
		setBase(base);
		setN_msgs(n_msgs);
	}
	public error_table() {
	}
	
	public Object getMsgs() {
		return msgs;
	}
	public void setMsgs(Object newMsgs) {
		msgs = newMsgs;
	}
	public long getBase() {
		return base;
	}
	public void setBase(long newBase) {
		base = newBase;
	}
	public int getN_msgs() {
		return n_msgs;
	}
	public void setN_msgs(int newN_msgs) {
		n_msgs = newN_msgs;
	}
}
