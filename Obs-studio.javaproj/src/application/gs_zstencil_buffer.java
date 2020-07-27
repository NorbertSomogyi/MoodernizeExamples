package application;

public class gs_zstencil_buffer {
	private Object device;
	private Object buffer;
	private Object attachment;
	private Object format;
	
	public gs_zstencil_buffer(Object device, Object buffer, Object attachment, Object format) {
		setDevice(device);
		setBuffer(buffer);
		setAttachment(attachment);
		setFormat(format);
	}
	public gs_zstencil_buffer() {
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
	public Object gl_init_zsbuffer(Object width, Object height) {
		Object generatedBuffer = this.getBuffer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glGenRenderbuffers(1, generatedBuffer);
		if (!ModernizedCProgram.gl_success("glGenRenderbuffers")) {
			return false;
		} 
		if (!ModernizedCProgram.gl_bind_renderbuffer(GL_RENDERBUFFER, generatedBuffer)) {
			return false;
		} 
		Object generatedFormat = this.getFormat();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glRenderbufferStorage(GL_RENDERBUFFER, generatedFormat, width, height);
		if (!ModernizedCProgram.gl_success("glRenderbufferStorage")) {
			return false;
		} 
		ModernizedCProgram.gl_bind_renderbuffer(GL_RENDERBUFFER, 0);
		return true;
	}
	public gs_zstencil_buffer gs_zstencil_create(Object width, Object height, gs_zstencil_format format) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_zstencil_create")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, width, height, gs_zstencil_format.format);
	}
	public gs_zstencil_buffer gs_get_zstencil_target() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_get_zstencil_target")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getAttachment() {
		return attachment;
	}
	public void setAttachment(Object newAttachment) {
		attachment = newAttachment;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
}
