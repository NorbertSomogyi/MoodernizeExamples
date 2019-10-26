package application;

/*
 * Copyright (c) 2009-2016 Petri Lehtinen <petri@digip.org>
 *
 * Jansson is free software; you can redistribute it and/or modify
 * it under the terms of the MIT license. See LICENSE for details.
 */
public class my_sink {
	private Byte buf;
	private Object off;
	private Object cap;
	
	public my_sink(Byte buf, Object off, Object cap) {
		setBuf(buf);
		setOff(off);
		setCap(cap);
	}
	public my_sink() {
	}
	
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Object getOff() {
		return off;
	}
	public void setOff(Object newOff) {
		off = newOff;
	}
	public Object getCap() {
		return cap;
	}
	public void setCap(Object newCap) {
		cap = newCap;
	}
}
