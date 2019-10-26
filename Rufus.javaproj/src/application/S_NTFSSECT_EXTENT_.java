package application;

/* -------------------------------------------------------------------------- *
 *
 *   Copyright 2011 Shao Miller - All Rights Reserved
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, Inc., 53 Temple Place Ste 330,
 *   Boston MA 02111-1307, USA; either version 2 of the License, or
 *   (at your option) any later version; incorporated herein by reference.
 *
 * ------------------------------------------------------------------------- */
/****
 * ntfssect.h
 *
 * Fetch NTFS file cluster & sector information via Windows
 *
 * With special thanks to Mark Roddy for his article:
 *   http://www.wd-3.com/archive/luserland.htm
 */
/*** Macros */
/****
 * ntfssect.h
 *
 * Fetch NTFS file cluster & sector information via Windows
 *
 * With special thanks to Mark Roddy for his article:
 *   http://www.wd-3.com/archive/luserland.htm
 */
/*** Macros */
/*** Object types */
/* An "extent;" a contiguous range of file data */
/*** Struct/union definitions */
public class S_NTFSSECT_EXTENT_ {
	private Object FirstVcn;
	private Object NextVcn;
	private Object FirstLcn;
	
	public S_NTFSSECT_EXTENT_(Object FirstVcn, Object NextVcn, Object FirstLcn) {
		setFirstVcn(FirstVcn);
		setNextVcn(NextVcn);
		setFirstLcn(FirstLcn);
	}
	public S_NTFSSECT_EXTENT_() {
	}
	
	public Object getFirstVcn() {
		return FirstVcn;
	}
	public void setFirstVcn(Object newFirstVcn) {
		FirstVcn = newFirstVcn;
	}
	public Object getNextVcn() {
		return NextVcn;
	}
	public void setNextVcn(Object newNextVcn) {
		NextVcn = newNextVcn;
	}
	public Object getFirstLcn() {
		return FirstLcn;
	}
	public void setFirstLcn(Object newFirstLcn) {
		FirstLcn = newFirstLcn;
	}
}
