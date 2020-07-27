package application;

public class gs_stage_surface {
	private Object device;
	private gs_color_format format;
	private Object width;
	private Object height;
	private Object bytes_per_pixel;
	private Object gl_format;
	private Object gl_internal_format;
	private Object gl_type;
	private Object pack_buffer;
	
	public gs_stage_surface(Object device, gs_color_format format, Object width, Object height, Object bytes_per_pixel, Object gl_format, Object gl_internal_format, Object gl_type, Object pack_buffer) {
		setDevice(device);
		setFormat(format);
		setWidth(width);
		setHeight(height);
		setBytes_per_pixel(bytes_per_pixel);
		setGl_format(gl_format);
		setGl_internal_format(gl_internal_format);
		setGl_type(gl_type);
		setPack_buffer(pack_buffer);
	}
	public gs_stage_surface() {
	}
	
	public gs_stage_surface gs_stagesurface_create(Object width, Object height, gs_color_format color_format) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_stagesurface_create")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, width, height, gs_color_format.color_format);
	}
	public void gs_stagesurface_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_stagesurface_destroy")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!stagesurf) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(stagesurf);
		if (stagesurf) {
			if (this.getPack_buffer()) {
				ModernizedCProgram.gl_delete_buffers(1, this.getPack_buffer());
			} 
			ModernizedCProgram.bfree(stagesurf);
		} 
	}
	public Object gs_stagesurface_map(Object data, Object linesize) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_stagesurface_map") && ModernizedCProgram.gs_obj_valid(stagesurf, "gs_stagesurface_map", "stagesurf") && ModernizedCProgram.gs_obj_valid(data, "gs_stagesurface_map", "data") && ModernizedCProgram.gs_obj_valid(linesize, "gs_stagesurface_map", "linesize"))) {
			return 0;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(stagesurf, data, linesize);
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, this.getPack_buffer())) {
			;
		} 
		data = /*Error: Function owner not recognized*/glMapBuffer(GL_PIXEL_PACK_BUFFER, GL_READ_ONLY);
		if (!ModernizedCProgram.gl_success("glMapBuffer")) {
			;
		} 
		ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, 0);
		linesize = this.getBytes_per_pixel() * this.getWidth();
		return true;
		return false;
	}
	public void gs_stagesurface_unmap() {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_stagesurface_unmap") && ModernizedCProgram.gs_obj_valid(stagesurf, "gs_stagesurface_unmap", "stagesurf"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(stagesurf);
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, this.getPack_buffer())) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glUnmapBuffer(GL_PIXEL_PACK_BUFFER);
		ModernizedCProgram.gl_success("glUnmapBuffer");
		ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, 0);
	}
	public gs_stage_surface gs_stagesurface_create_nv12(Object width, Object height) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_stagesurface_create_nv12")) {
			return ((Object)0);
		} 
		if ((width & 1) == 1 || (height & 1) == 1) {
			ModernizedCProgram.blog(LOG_ERROR, "NV12 textures must have dimensions divisible by 2.");
			return ((Object)0);
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_stagesurface_create_nv12 = generatedExports.getDevice_stagesurface_create_nv12();
		gs_device generatedDevice = graphics.getDevice();
		if (generatedDevice_stagesurface_create_nv12) {
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, width, height);
		} 
		return ((Object)0);
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
	public Object create_pixel_pack_buffer() {
		 size = new ();
		 success = true;
		Object generatedPack_buffer = this.getPack_buffer();
		if (!ModernizedCProgram.gl_gen_buffers(1, generatedPack_buffer)) {
			return false;
		} 
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, generatedPack_buffer)) {
			return false;
		} 
		Object generatedWidth = this.getWidth();
		Object generatedBytes_per_pixel = this.getBytes_per_pixel();
		size = generatedWidth * generatedBytes_per_pixel;
		size = (size + 3) & /* align width to 4-byte boundary */-1024;
		Object generatedHeight = this.getHeight();
		size *= generatedHeight;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glBufferData(GL_PIXEL_PACK_BUFFER, size, 0, GL_DYNAMIC_READ);
		if (!ModernizedCProgram.gl_success("glBufferData")) {
			success = false;
		} 
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_PACK_BUFFER, 0)) {
			success = false;
		} 
		return success;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public Object getBytes_per_pixel() {
		return bytes_per_pixel;
	}
	public void setBytes_per_pixel(Object newBytes_per_pixel) {
		bytes_per_pixel = newBytes_per_pixel;
	}
	public Object getGl_format() {
		return gl_format;
	}
	public void setGl_format(Object newGl_format) {
		gl_format = newGl_format;
	}
	public Object getGl_internal_format() {
		return gl_internal_format;
	}
	public void setGl_internal_format(Object newGl_internal_format) {
		gl_internal_format = newGl_internal_format;
	}
	public Object getGl_type() {
		return gl_type;
	}
	public void setGl_type(Object newGl_type) {
		gl_type = newGl_type;
	}
	public Object getPack_buffer() {
		return pack_buffer;
	}
	public void setPack_buffer(Object newPack_buffer) {
		pack_buffer = newPack_buffer;
	}
}
