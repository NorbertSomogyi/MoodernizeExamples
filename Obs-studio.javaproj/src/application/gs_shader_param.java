package application;

public class gs_shader_param {
	private gs_shader_param_type type;
	private Byte name;
	private Object shader;
	private Object next_sampler;
	private Object texture_id;
	private Object sampler_id;
	private int array_count;
	private gs_texture texture;
	private Object changed;
	
	public gs_shader_param(gs_shader_param_type type, Byte name, Object shader, Object next_sampler, Object texture_id, Object sampler_id, int array_count, gs_texture texture, Object changed) {
		setType(type);
		setName(name);
		setShader(shader);
		setNext_sampler(next_sampler);
		setTexture_id(texture_id);
		setSampler_id(sampler_id);
		setArray_count(array_count);
		setTexture(texture);
		setChanged(changed);
	}
	public gs_shader_param() {
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
	public void shader_param_init() {
		.memset(ModernizedCProgram.param, 0, );
	}
	public void shader_param_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.param.getName());
		.da_free(ModernizedCProgram.param.getCur_value());
		.da_free(ModernizedCProgram.param.getDef_value());
	}
	public gs_shader_param get_texture_param(Object device, int unit) {
		gs_shader shader = device.getCur_pixel_shader();
		 i = new ();
		Object generatedParams = shader.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			gs_shader_param param = generatedParams.getArray() + i;
			if (ModernizedCProgram.param.getType() == GS_SHADER_PARAM_TEXTURE) {
				if (ModernizedCProgram.param.getTexture_id() == unit) {
					return ModernizedCProgram.param;
				} 
			} 
		}
		return NULL;
	}
	public gs_shader_param_type getType() {
		return type;
	}
	public void setType(gs_shader_param_type newType) {
		type = newType;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getShader() {
		return shader;
	}
	public void setShader(Object newShader) {
		shader = newShader;
	}
	public Object getNext_sampler() {
		return next_sampler;
	}
	public void setNext_sampler(Object newNext_sampler) {
		next_sampler = newNext_sampler;
	}
	public Object getTexture_id() {
		return texture_id;
	}
	public void setTexture_id(Object newTexture_id) {
		texture_id = newTexture_id;
	}
	public Object getSampler_id() {
		return sampler_id;
	}
	public void setSampler_id(Object newSampler_id) {
		sampler_id = newSampler_id;
	}
	public int getArray_count() {
		return array_count;
	}
	public void setArray_count(int newArray_count) {
		array_count = newArray_count;
	}
	public gs_texture getTexture() {
		return texture;
	}
	public void setTexture(gs_texture newTexture) {
		texture = newTexture;
	}
	public Object getChanged() {
		return changed;
	}
	public void setChanged(Object newChanged) {
		changed = newChanged;
	}
}
