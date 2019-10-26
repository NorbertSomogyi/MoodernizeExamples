package application;

public class gs_vertex_buffer {
	private Object vao;
	private Object vertex_buffer;
	private Object normal_buffer;
	private Object tangent_buffer;
	private Object color_buffer;
	private Object device;
	private Object num;
	private Object dynamic;
	private gs_vb_data data;
	
	public gs_vertex_buffer(Object vao, Object vertex_buffer, Object normal_buffer, Object tangent_buffer, Object color_buffer, Object device, Object num, Object dynamic, gs_vb_data data) {
		setVao(vao);
		setVertex_buffer(vertex_buffer);
		setNormal_buffer(normal_buffer);
		setTangent_buffer(tangent_buffer);
		setColor_buffer(color_buffer);
		setDevice(device);
		setNum(num);
		setDynamic(dynamic);
		setData(data);
	}
	public gs_vertex_buffer() {
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
	public Object create_buffers() {
		Object generatedDynamic = this.getDynamic();
		 usage = generatedDynamic ? GL_STREAM_DRAW : GL_STATIC_DRAW;
		 i = new ();
		Object generatedVertex_buffer = this.getVertex_buffer();
		gs_vb_data generatedData = this.getData();
		Object generatedGs_vb_data = generatedData.getGs_vb_data();
		if (!ModernizedCProgram.gl_create_buffer(GL_ARRAY_BUFFER, generatedVertex_buffer, generatedGs_vb_data * , generatedGs_vb_data, usage)) {
			return false;
		} 
		Object generatedNormal_buffer = this.getNormal_buffer();
		if (generatedGs_vb_data) {
			if (!ModernizedCProgram.gl_create_buffer(GL_ARRAY_BUFFER, generatedNormal_buffer, generatedGs_vb_data * , generatedGs_vb_data, usage)) {
				return false;
			} 
		} 
		Object generatedTangent_buffer = this.getTangent_buffer();
		if (generatedGs_vb_data) {
			if (!ModernizedCProgram.gl_create_buffer(GL_ARRAY_BUFFER, generatedTangent_buffer, generatedGs_vb_data * , generatedGs_vb_data, usage)) {
				return false;
			} 
		} 
		Object generatedColor_buffer = this.getColor_buffer();
		if (generatedGs_vb_data) {
			if (!ModernizedCProgram.gl_create_buffer(GL_ARRAY_BUFFER, generatedColor_buffer, generatedGs_vb_data * , generatedGs_vb_data, usage)) {
				return false;
			} 
		} 
		Object generatedUv_buffers = this.getUv_buffers();
		.da_reserve(generatedUv_buffers, generatedGs_vb_data);
		Object generatedUv_sizes = this.getUv_sizes();
		.da_reserve(generatedUv_sizes, generatedGs_vb_data);
		Object generatedGs_tvertarray = tv.getGs_tvertarray();
		for (i = 0; i < generatedGs_vb_data; i++) {
			 tex_buffer = new ();
			gs_tvertarray tv = generatedGs_vb_data + i;
			 size = generatedGs_vb_data *  * generatedGs_tvertarray;
			if (!ModernizedCProgram.gl_create_buffer(GL_ARRAY_BUFFER, tex_buffer, size, generatedGs_tvertarray, usage)) {
				return false;
			} 
			.da_push_back(generatedUv_buffers, tex_buffer);
			.da_push_back(generatedUv_sizes, generatedGs_tvertarray);
		}
		if (!generatedDynamic) {
			generatedData.gs_vbdata_destroy();
			this.setData(NULL);
		} 
		Object generatedVao = this.getVao();
		if (!ModernizedCProgram.gl_gen_vertex_arrays(1, generatedVao)) {
			return false;
		} 
		return true;
	}
	public Object get_vb_buffer(attrib_type type, Object index, Object width, Object gl_type) {
		gl_type = GL_FLOAT;
		width = 4;
		Object generatedVertex_buffer = this.getVertex_buffer();
		Object generatedNormal_buffer = this.getNormal_buffer();
		Object generatedTangent_buffer = this.getTangent_buffer();
		Object generatedColor_buffer = this.getColor_buffer();
		Object generatedUv_buffers = this.getUv_buffers();
		Object generatedUv_sizes = this.getUv_sizes();
		if (attrib_type.type == attrib_type.ATTRIB_POSITION) {
			return generatedVertex_buffer;
		}  else if (attrib_type.type == attrib_type.ATTRIB_NORMAL) {
			return generatedNormal_buffer;
		}  else if (attrib_type.type == attrib_type.ATTRIB_TANGENT) {
			return generatedTangent_buffer;
		}  else if (attrib_type.type == attrib_type.ATTRIB_COLOR) {
			gl_type = GL_UNSIGNED_BYTE;
			return generatedColor_buffer;
		}  else if (attrib_type.type == attrib_type.ATTRIB_TEXCOORD) {
			if (generatedUv_buffers.getNum() <= index) {
				return 0;
			} 
			width = ()generatedUv_sizes.getArray()[index];
			return generatedUv_buffers.getArray()[index];
		} 
		return 0;
	}
	public gs_vertex_buffer gs_render_save() {
		graphics_t graphics = thread_graphics;
		size_t num_tex = new size_t();
		size_t i = new size_t();
		if (!ModernizedCProgram.gs_valid("gs_render_save")) {
			return ((Object)0);
		} 
		Object generatedUsing_immediate = graphics.getUsing_immediate();
		if (generatedUsing_immediate) {
			return ((Object)0);
		} 
		Object generatedVerts = graphics.getVerts();
		gs_vb_data generatedVbd = graphics.getVbd();
		if (!generatedVerts.getNum()) {
			generatedVbd.gs_vbdata_destroy();
			return ((Object)0);
		} 
		Object generatedTexverts = graphics.getTexverts();
		for (num_tex = 0; num_tex < 16; num_tex++) {
			if (!generatedTexverts[num_tex].getNum()) {
				break;
			} 
		}
		generatedVbd.setPoints(generatedVerts.getArray());
		Object generatedNorms = graphics.getNorms();
		generatedVbd.setNormals(generatedNorms.getArray());
		Object generatedColors = graphics.getColors();
		generatedVbd.setColors(generatedColors.getArray());
		generatedVbd.setNum(generatedVerts.getNum());
		generatedVbd.setNum_tex(num_tex);
		Object generatedNum_tex = generatedVbd.getNum_tex();
		gs_tvertarray generatedTvarray = generatedVbd.getTvarray();
		if (generatedNum_tex) {
			generatedVbd.setTvarray(ModernizedCProgram.bmalloc( * num_tex));
			for (i = 0; i < num_tex; i++) {
				generatedTvarray[i].setWidth(2);
				generatedTvarray[i].setArray(generatedTexverts[i].getArray());
			}
		} 
		graphics.reset_immediate_arrays();
		gs_vertex_buffer gs_vertex_buffer = new gs_vertex_buffer();
		return gs_vertex_buffer.gs_vertexbuffer_create(generatedVbd, 0);
	}
	public gs_vertex_buffer gs_vertexbuffer_create(gs_vb_data data, Object flags) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_vertexbuffer_create")) {
			return ((Object)0);
		} 
		Object generatedNum = data.getNum();
		gs_vb_data gs_vb_data = new gs_vb_data();
		vec3 generatedPoints = data.getPoints();
		vec3 generatedNormals = data.getNormals();
		vec3 generatedTangents = data.getTangents();
		Object generatedColors = data.getColors();
		gs_tvertarray generatedTvarray = data.getTvarray();
		Object generatedNum_tex = data.getNum_tex();
		Object generatedWidth = tv.getWidth();
		Object generatedArray = tv.getArray();
		if (data && generatedNum && (flags & (1 << 4)) != 0) {
			gs_vb_data new_data = gs_vb_data.gs_vbdata_create();
			new_data.setNum(generatedNum);
			do {
				if (generatedPoints) {
					new_data.setPoints(ModernizedCProgram.bmemdup(generatedPoints,  * generatedNum));
				} 
			} while (false);
			do {
				if (generatedNormals) {
					new_data.setNormals(ModernizedCProgram.bmemdup(generatedNormals,  * generatedNum));
				} 
			} while (false);
			do {
				if (generatedTangents) {
					new_data.setTangents(ModernizedCProgram.bmemdup(generatedTangents,  * generatedNum));
				} 
			} while (false);
			do {
				if (generatedColors) {
					new_data.setColors(ModernizedCProgram.bmemdup(generatedColors,  * generatedNum));
				} 
			} while (false);
			if (generatedTvarray && generatedNum_tex) {
				new_data.setNum_tex(generatedNum_tex);
				new_data.setTvarray(ModernizedCProgram.bzalloc( * generatedNum_tex));
				for (size_t i = 0;
				 i < generatedNum_tex; i++) {
					gs_tvertarray tv = generatedTvarray[i];
					gs_tvertarray new_tv = generatedTvarray[i];
					size_t size = generatedWidth * ;
					new_tv.setWidth(generatedWidth);
					new_tv.setArray(ModernizedCProgram.bmemdup(generatedArray, size * generatedNum));
				}
			} 
			data = new_data;
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, data, flags);
	}
	public void gs_load_vertexbuffer() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_vertexbuffer")) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, vertbuffer);
	}
	public Object getVao() {
		return vao;
	}
	public void setVao(Object newVao) {
		vao = newVao;
	}
	public Object getVertex_buffer() {
		return vertex_buffer;
	}
	public void setVertex_buffer(Object newVertex_buffer) {
		vertex_buffer = newVertex_buffer;
	}
	public Object getNormal_buffer() {
		return normal_buffer;
	}
	public void setNormal_buffer(Object newNormal_buffer) {
		normal_buffer = newNormal_buffer;
	}
	public Object getTangent_buffer() {
		return tangent_buffer;
	}
	public void setTangent_buffer(Object newTangent_buffer) {
		tangent_buffer = newTangent_buffer;
	}
	public Object getColor_buffer() {
		return color_buffer;
	}
	public void setColor_buffer(Object newColor_buffer) {
		color_buffer = newColor_buffer;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getNum() {
		return num;
	}
	public void setNum(Object newNum) {
		num = newNum;
	}
	public Object getDynamic() {
		return dynamic;
	}
	public void setDynamic(Object newDynamic) {
		dynamic = newDynamic;
	}
	public gs_vb_data getData() {
		return data;
	}
	public void setData(gs_vb_data newData) {
		data = newData;
	}
}
