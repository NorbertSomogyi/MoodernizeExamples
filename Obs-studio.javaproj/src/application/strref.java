package application;

/*
 * Copyright (c) 2013 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
/* ------------------------------------------------------------------------- */
/* string reference (string segment within an already existing array) */
public class strref {
	private Object[] array;
	private Object len;
	
	public strref(Object[] array, Object len) {
		setArray(array);
		setLen(len);
	}
	public strref() {
	}
	
	public void strref_clear() {
		this.setArray(((Object)0));
		this.setLen(0);
	}
	public void strref_set(Object array, Object len) {
		this.setArray(array);
		this.setLen(len);
	}
	public void strref_copy(Object src) {
		this.setArray(src.getArray());
		this.setLen(src.getLen());
	}
	public void strref_add(Object t) {
		Object[] generatedArray = this.getArray();
		Object generatedLen = this.getLen();
		if (!generatedArray) {
			dst.strref_copy(t);
		} else {
				generatedLen += generatedLen;
		} 
	}
	public void remove_ref_whitespace() {
		Object[] generatedArray = this.getArray();
		Object generatedLen = this.getLen();
		if (generatedArray) {
			while (ModernizedCProgram.is_whitespace(generatedArray)) {
				generatedArray++;
				generatedLen--;
			}
			while (generatedLen && ModernizedCProgram.is_whitespace(generatedArray[generatedLen - 1])) {
				generatedLen--;
			}
		} 
	}
	public boolean is_sys_include() {
		Object generatedLen = this.getLen();
		Object[] generatedArray = this.getArray();
		return generatedLen >= 2 && generatedArray[0] == (byte)'<' && generatedArray[generatedLen - 1] == (byte)'>';
	}
	public boolean is_loc_include() {
		Object generatedLen = this.getLen();
		Object[] generatedArray = this.getArray();
		return generatedLen >= 2 && generatedArray[0] == (byte)'"' && generatedArray[generatedLen - 1] == (byte)'"';
	}
	public Object[] getArray() {
		return array;
	}
	public void setArray(Object[] newArray) {
		array = newArray;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
/* ------------------------------------------------------------------------- */
