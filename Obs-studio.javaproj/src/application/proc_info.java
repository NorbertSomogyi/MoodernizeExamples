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
public class proc_info {
	private decl_info func;
	private Object data;
	private Object callback;
	
	public proc_info(decl_info func, Object data, Object callback) {
		setFunc(func);
		setData(data);
		setCallback(callback);
	}
	public proc_info() {
	}
	
	public void proc_info_free() {
		decl_info generatedFunc = this.getFunc();
		generatedFunc.decl_info_free();
	}
	public decl_info getFunc() {
		return func;
	}
	public void setFunc(decl_info newFunc) {
		func = newFunc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
}
