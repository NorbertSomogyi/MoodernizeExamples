package application;

/*
 * Simple text-based progress display module for GIT
 *
 * Copyright (c) 2007 by Nicolas Pitre <nico@fluxnic.net>
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 */
public class throughput {
	private Object curr_total;
	private Object prev_total;
	private Object prev_ns;
	private int avg_bytes;
	private int avg_misecs;
	private Object last_bytes;
	private Object last_misecs;
	private int idx;
	private strbuf display;
	
	public throughput(Object curr_total, Object prev_total, Object prev_ns, int avg_bytes, int avg_misecs, Object last_bytes, Object last_misecs, int idx, strbuf display) {
		setCurr_total(curr_total);
		setPrev_total(prev_total);
		setPrev_ns(prev_ns);
		setAvg_bytes(avg_bytes);
		setAvg_misecs(avg_misecs);
		setLast_bytes(last_bytes);
		setLast_misecs(last_misecs);
		setIdx(idx);
		setDisplay(display);
	}
	public throughput() {
	}
	
	public Object getCurr_total() {
		return curr_total;
	}
	public void setCurr_total(Object newCurr_total) {
		curr_total = newCurr_total;
	}
	public Object getPrev_total() {
		return prev_total;
	}
	public void setPrev_total(Object newPrev_total) {
		prev_total = newPrev_total;
	}
	public Object getPrev_ns() {
		return prev_ns;
	}
	public void setPrev_ns(Object newPrev_ns) {
		prev_ns = newPrev_ns;
	}
	public int getAvg_bytes() {
		return avg_bytes;
	}
	public void setAvg_bytes(int newAvg_bytes) {
		avg_bytes = newAvg_bytes;
	}
	public int getAvg_misecs() {
		return avg_misecs;
	}
	public void setAvg_misecs(int newAvg_misecs) {
		avg_misecs = newAvg_misecs;
	}
	public Object getLast_bytes() {
		return last_bytes;
	}
	public void setLast_bytes(Object newLast_bytes) {
		last_bytes = newLast_bytes;
	}
	public Object getLast_misecs() {
		return last_misecs;
	}
	public void setLast_misecs(Object newLast_misecs) {
		last_misecs = newLast_misecs;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int newIdx) {
		idx = newIdx;
	}
	public strbuf getDisplay() {
		return display;
	}
	public void setDisplay(strbuf newDisplay) {
		display = newDisplay;
	}
}
