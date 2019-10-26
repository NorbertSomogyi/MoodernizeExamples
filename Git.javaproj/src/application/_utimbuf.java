package application;

/*
 * UTIME.H
 * This file has no copyright assigned and is placed in the Public Domain.
 * This file is a part of the mingw-runtime package.
 *
 * The mingw-runtime package and its code is distributed in the hope that it
 * will be useful but WITHOUT ANY WARRANTY.  ALL WARRANTIES, EXPRESSED OR
 * IMPLIED ARE HEREBY DISCLAIMED.  This includes but is not limited to
 * warranties of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You are free to use this package and its code without limitation.
 */
/*
 * Structure used by _utime function.
 */
public class _utimbuf {
	private Object actime;
	private Object modtime;
	
	public _utimbuf(Object actime, Object modtime) {
		setActime(actime);
		setModtime(modtime);
	}
	public _utimbuf() {
	}
	
	public Object getActime() {
		return actime;
	}
	public void setActime(Object newActime) {
		actime = newActime;
	}
	public Object getModtime() {
		return modtime;
	}
	public void setModtime(Object newModtime) {
		modtime = newModtime;
	}
}
