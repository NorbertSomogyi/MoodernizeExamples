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
/* Dynamic circular buffer */
public class circlebuf {
	private Object data;
	private Object size;
	private Object start_pos;
	private Object end_pos;
	private Object capacity;
	
	public circlebuf(Object data, Object size, Object start_pos, Object end_pos, Object capacity) {
		setData(data);
		setSize(size);
		setStart_pos(start_pos);
		setEnd_pos(end_pos);
		setCapacity(capacity);
	}
	public circlebuf() {
	}
	
	public void clear_circlebuf() {
		Object generatedCirclebuf = this.getCirclebuf();
		buf.circlebuf_pop_front(NULL, generatedCirclebuf);
	}
	public Object num_frames() {
		Object generatedCirclebuf = this.getCirclebuf();
		return generatedCirclebuf / /*Error: Unsupported expression*/;
	}
	public void circlebuf_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.cb, 0, /*Error: Unsupported expression*/);
	}
	public void circlebuf_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.cb.getData());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.cb, 0, /*Error: Unsupported expression*/);
	}
	public void circlebuf_reorder_data(Object new_capacity) {
		size_t difference = new size_t();
		uint8_t data = new uint8_t();
		if (!ModernizedCProgram.cb.getSize() || !ModernizedCProgram.cb.getStart_pos() || ModernizedCProgram.cb.getEnd_pos() > ModernizedCProgram.cb.getStart_pos()) {
			return /*Error: Unsupported expression*/;
		} 
		difference = new_capacity - ModernizedCProgram.cb.getCapacity();
		data = (uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(data + difference, data, ModernizedCProgram.cb.getCapacity() - ModernizedCProgram.cb.getStart_pos());
		ModernizedCProgram.cb.getStart_pos() += difference;
	}
	public void circlebuf_ensure_capacity() {
		size_t new_capacity = new size_t();
		if (ModernizedCProgram.cb.getSize() <= ModernizedCProgram.cb.getCapacity()) {
			return /*Error: Unsupported expression*/;
		} 
		new_capacity = ModernizedCProgram.cb.getCapacity() * 2;
		if (ModernizedCProgram.cb.getSize() > new_capacity) {
			new_capacity = ModernizedCProgram.cb.getSize();
		} 
		ModernizedCProgram.cb.setData(ModernizedCProgram.brealloc(ModernizedCProgram.cb.getData(), new_capacity));
		ModernizedCProgram.cb.circlebuf_reorder_data(new_capacity);
		ModernizedCProgram.cb.setCapacity(new_capacity);
	}
	public void circlebuf_reserve(Object capacity) {
		if (capacity <= ModernizedCProgram.cb.getCapacity()) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.cb.setData(ModernizedCProgram.brealloc(ModernizedCProgram.cb.getData(), capacity));
		ModernizedCProgram.cb.circlebuf_reorder_data(capacity);
		ModernizedCProgram.cb.setCapacity(capacity);
	}
	public void circlebuf_upsize(Object size) {
		size_t add_size = size - ModernizedCProgram.cb.getSize();
		size_t new_end_pos = ModernizedCProgram.cb.getEnd_pos() + add_size;
		if (size <= ModernizedCProgram.cb.getSize()) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.cb.setSize(size);
		ModernizedCProgram.cb.circlebuf_ensure_capacity();
		if (new_end_pos > ModernizedCProgram.cb.getCapacity()) {
			size_t back_size = ModernizedCProgram.cb.getCapacity() - ModernizedCProgram.cb.getEnd_pos();
			size_t loop_size = add_size - back_size;
			if (back_size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), 0, back_size);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.cb.getData(), 0, loop_size);
			new_end_pos -= ModernizedCProgram.cb.getCapacity();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), 0, add_size);
		} 
		ModernizedCProgram.cb.setEnd_pos(new_end_pos);
	}
	/** Overwrites data at a specific point in the buffer (relative).  */
	public void circlebuf_place(Object position, Object data, Object size) {
		size_t end_point = position + size;
		size_t data_end_pos = new size_t();
		if (end_point > ModernizedCProgram.cb.getSize()) {
			ModernizedCProgram.cb.circlebuf_upsize(end_point);
		} 
		position += ModernizedCProgram.cb.getStart_pos();
		if (position >= ModernizedCProgram.cb.getCapacity()) {
			position -= ModernizedCProgram.cb.getCapacity();
		} 
		data_end_pos = position + size;
		if (data_end_pos > ModernizedCProgram.cb.getCapacity()) {
			size_t back_size = data_end_pos - ModernizedCProgram.cb.getCapacity();
			size_t loop_size = size - back_size;
			if (back_size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + position, data, loop_size);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.cb.getData(), (uint8_t)data + loop_size, back_size);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + position, data, size);
		} 
	}
	public void circlebuf_push_back(Object data, Object size) {
		size_t new_end_pos = ModernizedCProgram.cb.getEnd_pos() + size;
		ModernizedCProgram.cb.getSize() += size;
		ModernizedCProgram.cb.circlebuf_ensure_capacity();
		if (new_end_pos > ModernizedCProgram.cb.getCapacity()) {
			size_t back_size = ModernizedCProgram.cb.getCapacity() - ModernizedCProgram.cb.getEnd_pos();
			size_t loop_size = size - back_size;
			if (back_size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), data, back_size);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.cb.getData(), (uint8_t)data + back_size, loop_size);
			new_end_pos -= ModernizedCProgram.cb.getCapacity();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), data, size);
		} 
		ModernizedCProgram.cb.setEnd_pos(new_end_pos);
	}
	public void circlebuf_push_front(Object data, Object size) {
		ModernizedCProgram.cb.getSize() += size;
		ModernizedCProgram.cb.circlebuf_ensure_capacity();
		if (ModernizedCProgram.cb.getStart_pos() < size) {
			size_t back_size = size - ModernizedCProgram.cb.getStart_pos();
			if (ModernizedCProgram.cb.getStart_pos()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.cb.getData(), (uint8_t)data + back_size, ModernizedCProgram.cb.getStart_pos());
			} 
			ModernizedCProgram.cb.setStart_pos(ModernizedCProgram.cb.getCapacity() - back_size);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), data, back_size);
		} else {
				ModernizedCProgram.cb.getStart_pos() -= size;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), data, size);
		} 
	}
	public void circlebuf_push_back_zero(Object size) {
		size_t new_end_pos = ModernizedCProgram.cb.getEnd_pos() + size;
		ModernizedCProgram.cb.getSize() += size;
		ModernizedCProgram.cb.circlebuf_ensure_capacity();
		if (new_end_pos > ModernizedCProgram.cb.getCapacity()) {
			size_t back_size = ModernizedCProgram.cb.getCapacity() - ModernizedCProgram.cb.getEnd_pos();
			size_t loop_size = size - back_size;
			if (back_size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), 0, back_size);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.cb.getData(), 0, loop_size);
			new_end_pos -= ModernizedCProgram.cb.getCapacity();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos(), 0, size);
		} 
		ModernizedCProgram.cb.setEnd_pos(new_end_pos);
	}
	public void circlebuf_push_front_zero(Object size) {
		ModernizedCProgram.cb.getSize() += size;
		ModernizedCProgram.cb.circlebuf_ensure_capacity();
		if (ModernizedCProgram.cb.getStart_pos() < size) {
			size_t back_size = size - ModernizedCProgram.cb.getStart_pos();
			if (ModernizedCProgram.cb.getStart_pos()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.cb.getData(), 0, ModernizedCProgram.cb.getStart_pos());
			} 
			ModernizedCProgram.cb.setStart_pos(ModernizedCProgram.cb.getCapacity() - back_size);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), 0, back_size);
		} else {
				ModernizedCProgram.cb.getStart_pos() -= size;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), 0, size);
		} 
	}
	public void circlebuf_peek_front(Object data, Object size) {
		((size <= ModernizedCProgram.cb.getSize()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("size <= cb->size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\circlebuf.h", 237));
		if (data) {
			size_t start_size = ModernizedCProgram.cb.getCapacity() - ModernizedCProgram.cb.getStart_pos();
			if (start_size < size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, (uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), start_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)data + start_size, ModernizedCProgram.cb.getData(), size - start_size);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, (uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getStart_pos(), size);
			} 
		} 
	}
	public void circlebuf_peek_back(Object data, Object size) {
		((size <= ModernizedCProgram.cb.getSize()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("size <= cb->size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\circlebuf.h", 256));
		if (data) {
			size_t back_size = (ModernizedCProgram.cb.getEnd_pos() ? ModernizedCProgram.cb.getEnd_pos() : ModernizedCProgram.cb.getCapacity());
			if (back_size < size) {
				size_t front_size = size - back_size;
				size_t new_end_pos = ModernizedCProgram.cb.getCapacity() - front_size;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((uint8_t)data + (size - back_size), ModernizedCProgram.cb.getData(), back_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, (uint8_t)ModernizedCProgram.cb.getData() + new_end_pos, front_size);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, (uint8_t)ModernizedCProgram.cb.getData() + ModernizedCProgram.cb.getEnd_pos() - size, size);
			} 
		} 
	}
	public void circlebuf_pop_front(Object data, Object size) {
		ModernizedCProgram.cb.circlebuf_peek_front(data, size);
		ModernizedCProgram.cb.getSize() -= size;
		if (!ModernizedCProgram.cb.getSize()) {
			ModernizedCProgram.cb.setStart_pos(ModernizedCProgram.cb.setEnd_pos(0));
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.cb.getStart_pos() += size;
		if (ModernizedCProgram.cb.getStart_pos() >= ModernizedCProgram.cb.getCapacity()) {
			ModernizedCProgram.cb.getStart_pos() -= ModernizedCProgram.cb.getCapacity();
		} 
	}
	public void circlebuf_pop_back(Object data, Object size) {
		ModernizedCProgram.cb.circlebuf_peek_back(data, size);
		ModernizedCProgram.cb.getSize() -= size;
		if (!ModernizedCProgram.cb.getSize()) {
			ModernizedCProgram.cb.setStart_pos(ModernizedCProgram.cb.setEnd_pos(0));
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.cb.getEnd_pos() <= size) {
			ModernizedCProgram.cb.setEnd_pos(ModernizedCProgram.cb.getCapacity() - (size - ModernizedCProgram.cb.getEnd_pos()));
		} else {
				ModernizedCProgram.cb.getEnd_pos() -= size;
		} 
	}
	public Object circlebuf_data(Object idx) {
		uint8_t ptr = (uint8_t)ModernizedCProgram.cb.getData();
		size_t offset = ModernizedCProgram.cb.getStart_pos() + idx;
		if (idx >= ModernizedCProgram.cb.getSize()) {
			return ((Object)0);
		} 
		if (offset >= ModernizedCProgram.cb.getCapacity()) {
			offset -= ModernizedCProgram.cb.getCapacity();
		} 
		return ptr + offset;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getStart_pos() {
		return start_pos;
	}
	public void setStart_pos(Object newStart_pos) {
		start_pos = newStart_pos;
	}
	public Object getEnd_pos() {
		return end_pos;
	}
	public void setEnd_pos(Object newEnd_pos) {
		end_pos = newEnd_pos;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
}
