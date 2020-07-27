package application;

public class gs_index_buffer {
	private Object buffer;
	private gs_index_type type;
	private Object gl_type;
	private Object device;
	private Object data;
	private Object num;
	private Object width;
	private Object size;
	private Object dynamic;
	
	public gs_index_buffer(Object buffer, gs_index_type type, Object gl_type, Object device, Object data, Object num, Object width, Object size, Object dynamic) {
		setBuffer(buffer);
		setType(type);
		setGl_type(gl_type);
		setDevice(device);
		setData(data);
		setNum(num);
		setWidth(width);
		setSize(size);
		setDynamic(dynamic);
	}
	public gs_index_buffer() {
	}
	
	public gs_index_buffer gs_indexbuffer_create(gs_index_type type, Object indices, Object num, Object flags) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_indexbuffer_create")) {
			return ((Object)0);
		} 
		if (indices && num && (flags & (1 << 4)) != 0) {
			size_t size = gs_index_type.type == gs_index_type.GS_UNSIGNED_SHORT ? 2 : 4;
			indices = ModernizedCProgram.bmemdup(indices, size * num);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, gs_index_type.type, indices, num, flags);
	}
	public void gs_load_indexbuffer() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_indexbuffer")) {
			return /*Error: Unsupported expression*/;
		} 
		gs_device generatedDevice = graphics.getDevice();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, indexbuffer);
	}
	public void gs_indexbuffer_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_indexbuffer_destroy")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!indexbuffer) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(indexbuffer);
		if (ib) {
			if (ib.getBuffer()) {
				ModernizedCProgram.gl_delete_buffers(1, ib.getBuffer());
			} 
			ModernizedCProgram.bfree(ib.getData());
			ModernizedCProgram.bfree(ib);
		} 
	}
	public void gs_indexbuffer_flush() {
		if (!(ModernizedCProgram.gs_valid("gs_indexbuffer_flush") && ModernizedCProgram.gs_obj_valid(indexbuffer, "gs_indexbuffer_flush", "indexbuffer"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(indexbuffer);
		ModernizedCProgram.gs_indexbuffer_flush_internal(ib, ib.getData());
	}
	public void gs_indexbuffer_flush_direct(Object data) {
		if (!(ModernizedCProgram.gs_valid("gs_indexbuffer_flush_direct") && ModernizedCProgram.gs_obj_valid(indexbuffer, "gs_indexbuffer_flush_direct", "indexbuffer") && ModernizedCProgram.gs_obj_valid(data, "gs_indexbuffer_flush_direct", "data"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(indexbuffer, data);
		ModernizedCProgram.gs_indexbuffer_flush_internal(ib, data);
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public Object init_ib() {
		Object generatedDynamic = this.getDynamic();
		 usage = generatedDynamic ? GL_DYNAMIC_DRAW : GL_STATIC_DRAW;
		 success = new ();
		Object generatedBuffer = this.getBuffer();
		Object generatedSize = this.getSize();
		Object generatedData = this.getData();
		success = ModernizedCProgram.gl_create_buffer(GL_ELEMENT_ARRAY_BUFFER, generatedBuffer, generatedSize, generatedData, usage);
		if (!generatedDynamic) {
			ModernizedCProgram.bfree(generatedData);
			this.setData(NULL);
		} 
		return success;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public gs_index_type getType() {
		return type;
	}
	public void setType(gs_index_type newType) {
		type = newType;
	}
	public Object getGl_type() {
		return gl_type;
	}
	public void setGl_type(Object newGl_type) {
		gl_type = newGl_type;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
		num = newNum;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getDynamic() {
		return dynamic;
	}
	public void setDynamic(Object newDynamic) {
		dynamic = newDynamic;
	}
}
