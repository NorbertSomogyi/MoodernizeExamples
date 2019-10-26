package application;

public class gs_texture_cube {
	private gs_texture base;
	private Object size;
	
	public gs_texture_cube(gs_texture base, Object size) {
		setBase(base);
		setSize(size);
	}
	public gs_texture_cube() {
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
	public Object upload_texture_cube(Object data) {
		Object generatedSize = this.getSize();
		gs_texture generatedBase = this.getBase();
		gs_color_format generatedFormat = generatedBase.getFormat();
		 row_size = generatedSize * ModernizedCProgram.gs_get_format_bpp(generatedFormat);
		 tex_size = generatedSize * row_size / 8;
		Object generatedLevels = generatedBase.getLevels();
		 num_levels = generatedLevels;
		 compressed = ModernizedCProgram.gs_is_compressed_format(generatedFormat);
		 gl_type = ModernizedCProgram.get_gl_format_type(generatedFormat);
		 success = true;
		 i = new ();
		if (!num_levels) {
			num_levels = ModernizedCProgram.gs_get_total_levels(generatedSize, generatedSize);
		} 
		Object generatedTexture = generatedBase.getTexture();
		Object generatedGl_format = generatedBase.getGl_format();
		Object generatedGl_internal_format = generatedBase.getGl_internal_format();
		for (i = 0; i < 6; i++) {
			 target = GL_TEXTURE_CUBE_MAP_POSITIVE_X + i;
			if (!ModernizedCProgram.gl_bind_texture(target, generatedTexture)) {
				success = false;
			} 
			if (!ModernizedCProgram.gl_init_face(target, gl_type, num_levels, generatedGl_format, generatedGl_internal_format, compressed, generatedSize, generatedSize, tex_size, data)) {
				success = false;
			} 
			if (!ModernizedCProgram.gl_bind_texture(target, 0)) {
				success = false;
			} 
			if (data) {
				data++;
			} 
		}
		.glTexParameteri(GL_TEXTURE_CUBE_MAP, GL_TEXTURE_MAX_LEVEL, num_levels);
		if (!ModernizedCProgram.gl_success("glTexParameteri")) {
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
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
