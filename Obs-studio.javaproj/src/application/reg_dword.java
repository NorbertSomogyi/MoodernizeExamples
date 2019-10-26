package application;

/*
 * Copyright (c) 2015 Hugh Bailey <obs.jim@gmail.com>
 * Copyright (c) 2017 Ryan Foster <RytoEX@gmail.com>
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
public class reg_dword {
	private Object status;
	private Object size;
	private Object return_value;
	
	public reg_dword(Object status, Object size, Object return_value) {
		setStatus(status);
		setSize(size);
		setReturn_value(return_value);
	}
	public reg_dword() {
	}
	
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object newStatus) {
		status = newStatus;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getReturn_value() {
		return return_value;
	}
	public void setReturn_value(Object newReturn_value) {
		return_value = newReturn_value;
	}
}
