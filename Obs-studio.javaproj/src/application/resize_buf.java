package application;

/*
 * Copyright (c) 2015 Hugh Bailey <obs.jim@gmail.com>
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
public class resize_buf {
	private Object buf;
	private Object size;
	private Object capacity;
	
	public resize_buf(Object buf, Object size, Object capacity) {
		setBuf(buf);
		setSize(size);
		setCapacity(capacity);
	}
	public resize_buf() {
	}
	
	public void resize_buf_resize(Object size) {
		Object generatedBuf = this.getBuf();
		Object generatedCapacity = this.getCapacity();
		if (!generatedBuf) {
			this.setBuf(.malloc(size));
			this.setSize(size);
			this.setCapacity(size);
		} else {
				if (generatedCapacity < size) {
					size_t capx2 = generatedCapacity * 2;
					size_t new_cap = capx2 > size ? capx2 : size;
					this.setBuf(.realloc(generatedBuf, new_cap));
					this.setCapacity(new_cap);
				} 
				this.setSize(size);
		} 
	}
	public void resize_buf_free() {
		Object generatedBuf = this.getBuf();
		.free(generatedBuf);
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
}
