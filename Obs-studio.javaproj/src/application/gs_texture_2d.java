package application;

public class gs_texture_2d {
	private gs_texture base;
	private Object width;
	private Object height;
	private Object gen_mipmaps;
	private Object unpack_buffer;
	
	public gs_texture_2d(gs_texture base, Object width, Object height, Object gen_mipmaps, Object unpack_buffer) {
		setBase(base);
		setWidth(width);
		setHeight(height);
		setGen_mipmaps(gen_mipmaps);
		setUnpack_buffer(unpack_buffer);
	}
	public gs_texture_2d() {
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
	public Object upload_texture_2d(Object data) {
		Object generatedWidth = this.getWidth();
		gs_texture generatedBase = this.getBase();
		gs_color_format generatedFormat = generatedBase.getFormat();
		 row_size = generatedWidth * ModernizedCProgram.gs_get_format_bpp(generatedFormat);
		Object generatedHeight = this.getHeight();
		 tex_size = generatedHeight * row_size / 8;
		Object generatedLevels = generatedBase.getLevels();
		 num_levels = generatedLevels;
		 compressed = ModernizedCProgram.gs_is_compressed_format(generatedFormat);
		 success = new ();
		if (!num_levels) {
			num_levels = ModernizedCProgram.gs_get_total_levels(generatedWidth, generatedHeight);
		} 
		Object generatedTexture = generatedBase.getTexture();
		if (!ModernizedCProgram.gl_bind_texture(GL_TEXTURE_2D, generatedTexture)) {
			return false;
		} 
		Object generatedGl_type = generatedBase.getGl_type();
		Object generatedGl_format = generatedBase.getGl_format();
		Object generatedGl_internal_format = generatedBase.getGl_internal_format();
		success = ModernizedCProgram.gl_init_face(GL_TEXTURE_2D, generatedGl_type, num_levels, generatedGl_format, generatedGl_internal_format, compressed, generatedWidth, generatedHeight, tex_size, data);
		if (!ModernizedCProgram.gl_tex_param_i(GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, num_levels - 1)) {
			success = false;
		} 
		if (!ModernizedCProgram.gl_bind_texture(GL_TEXTURE_2D, 0)) {
			success = false;
		} 
		return success;
	}
	public Object create_pixel_unpack_buffer() {
		 size = new ();
		 success = true;
		Object generatedUnpack_buffer = this.getUnpack_buffer();
		if (!ModernizedCProgram.gl_gen_buffers(1, generatedUnpack_buffer)) {
			return false;
		} 
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_UNPACK_BUFFER, generatedUnpack_buffer)) {
			return false;
		} 
		Object generatedWidth = this.getWidth();
		gs_texture generatedBase = this.getBase();
		gs_color_format generatedFormat = generatedBase.getFormat();
		size = generatedWidth * ModernizedCProgram.gs_get_format_bpp(generatedFormat);
		Object generatedHeight = this.getHeight();
		if (!ModernizedCProgram.gs_is_compressed_format(generatedFormat)) {
			size /= 8;
			size = (size + 3) & -1024;
			size *= generatedHeight;
		} else {
				size *= generatedHeight;
				size /= 8;
		} 
		.glBufferData(GL_PIXEL_UNPACK_BUFFER, size, 0, GL_DYNAMIC_DRAW);
		if (!ModernizedCProgram.gl_success("glBufferData")) {
			success = false;
		} 
		if (!ModernizedCProgram.gl_bind_buffer(GL_PIXEL_UNPACK_BUFFER, 0)) {
			success = false;
		} 
		return success;
	}
	public gs_texture getBase() {
		return base;
	}
	public void setBase(gs_texture newBase) {
		base = newBase;
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
	public Object getGen_mipmaps() {
		return gen_mipmaps;
	}
	public void setGen_mipmaps(Object newGen_mipmaps) {
		gen_mipmaps = newGen_mipmaps;
	}
	public Object getUnpack_buffer() {
		return unpack_buffer;
	}
	public void setUnpack_buffer(Object newUnpack_buffer) {
		unpack_buffer = newUnpack_buffer;
	}
}
