package application;

/* ----------------------------------------------------------------------- *
 *
 *   Copyright 2004-2008 H. Peter Anvin - All Rights Reserved
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
 *   Boston MA 02111-1307, USA; either version 2 of the License, or
 *   (at your option) any later version; incorporated herein by reference.
 *
 * ----------------------------------------------------------------------- */
/*
 * libfatint.h
 *
 * Internals for the libfat filesystem
 */
/* Next in list */
public class libfat_sector {
	private Object n;
	private libfat_sector next;
	private Object[] data;
	
	public libfat_sector(Object n, libfat_sector next, Object[] data) {
		setN(n);
		setNext(next);
		setData(data);
	}
	public libfat_sector() {
	}
	
	public Object getN() {
		return n;
	}
	public void setN(Object newN) {
		n = newN;
	}
	public libfat_sector getNext() {
		return next;
	}
	public void setNext(libfat_sector newNext) {
		next = newNext;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] newData) {
		data = newData;
	}
}
/* LIBFATINT_H */
