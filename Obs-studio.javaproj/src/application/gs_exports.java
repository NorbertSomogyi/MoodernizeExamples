package application;

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
public class gs_exports {
	private Object device_get_name;
	private Object device_get_type;
	private Object device_enum_adapters;
	private Object device_preprocessor_name;
	private Object device_create;
	private Object device_destroy;
	private Object device_enter_context;
	private Object device_leave_context;
	private Object device_get_device_obj;
	private Object device_swapchain_create;
	private Object device_resize;
	private Object device_get_size;
	private Object device_get_width;
	private Object device_get_height;
	private Object device_texture_create;
	private Object device_cubetexture_create;
	private Object device_voltexture_create;
	private Object device_zstencil_create;
	private Object device_stagesurface_create;
	private Object device_samplerstate_create;
	private Object device_vertexshader_create;
	private Object device_pixelshader_create;
	private Object device_vertexbuffer_create;
	private Object device_indexbuffer_create;
	private Object device_timer_create;
	private Object device_timer_range_create;
	private Object device_get_texture_type;
	private Object device_load_vertexbuffer;
	private Object device_load_indexbuffer;
	private Object device_load_texture;
	private Object device_load_samplerstate;
	private Object device_load_vertexshader;
	private Object device_load_pixelshader;
	private Object device_load_default_samplerstate;
	private Object device_get_vertex_shader;
	private Object device_get_pixel_shader;
	private Object device_get_render_target;
	private Object device_get_zstencil_target;
	private Object device_set_render_target;
	private Object device_set_cube_render_target;
	private Object device_copy_texture;
	private Object device_copy_texture_region;
	private Object device_stage_texture;
	private Object device_begin_frame;
	private Object device_begin_scene;
	private Object device_draw;
	private Object device_end_scene;
	private Object device_load_swapchain;
	private Object device_clear;
	private Object device_present;
	private Object device_flush;
	private Object device_set_cull_mode;
	private Object device_get_cull_mode;
	private Object device_enable_blending;
	private Object device_enable_depth_test;
	private Object device_enable_stencil_test;
	private Object device_enable_stencil_write;
	private Object device_enable_color;
	private Object device_blend_function;
	private Object device_blend_function_separate;
	private Object device_depth_function;
	private Object device_stencil_function;
	private Object device_stencil_op;
	private Object device_set_viewport;
	private Object device_get_viewport;
	private Object device_set_scissor_rect;
	private Object device_ortho;
	private Object device_frustum;
	private Object device_projection_push;
	private Object device_projection_pop;
	private Object gs_swapchain_destroy;
	private Object gs_texture_destroy;
	private Object gs_texture_get_width;
	private Object gs_texture_get_height;
	private Object gs_texture_get_color_format;
	private Object gs_texture_map;
	private Object gs_texture_unmap;
	private Object gs_texture_is_rect;
	private Object gs_texture_get_obj;
	private Object gs_cubetexture_destroy;
	private Object gs_cubetexture_get_size;
	private Object gs_cubetexture_get_color_format;
	private Object gs_voltexture_destroy;
	private Object gs_voltexture_get_width;
	private Object gs_voltexture_get_height;
	private Object gs_voltexture_get_depth;
	private Object gs_voltexture_get_color_format;
	private Object gs_stagesurface_destroy;
	private Object gs_stagesurface_get_width;
	private Object gs_stagesurface_get_height;
	private Object gs_stagesurface_get_color_format;
	private Object gs_stagesurface_map;
	private Object gs_stagesurface_unmap;
	private Object gs_zstencil_destroy;
	private Object gs_samplerstate_destroy;
	private Object gs_vertexbuffer_destroy;
	private Object gs_vertexbuffer_flush;
	private Object gs_vertexbuffer_flush_direct;
	private Object gs_vertexbuffer_get_data;
	private Object gs_indexbuffer_destroy;
	private Object gs_indexbuffer_flush;
	private Object gs_indexbuffer_flush_direct;
	private Object gs_indexbuffer_get_data;
	private Object gs_indexbuffer_get_num_indices;
	private Object gs_indexbuffer_get_type;
	private Object gs_timer_destroy;
	private Object gs_timer_begin;
	private Object gs_timer_end;
	private Object gs_timer_get_data;
	private Object gs_timer_range_destroy;
	private Object gs_timer_range_begin;
	private Object gs_timer_range_end;
	private Object gs_timer_range_get_data;
	private Object gs_shader_destroy;
	private Object gs_shader_get_num_params;
	private Object gs_shader_get_param_by_idx;
	private Object gs_shader_get_param_by_name;
	private Object gs_shader_get_viewproj_matrix;
	private Object gs_shader_get_world_matrix;
	private Object gs_shader_get_param_info;
	private Object gs_shader_set_bool;
	private Object gs_shader_set_float;
	private Object gs_shader_set_int;
	private Object gs_shader_set_matrix3;
	private Object gs_shader_set_matrix4;
	private Object gs_shader_set_vec2;
	private Object gs_shader_set_vec3;
	private Object gs_shader_set_vec4;
	private Object gs_shader_set_texture;
	private Object gs_shader_set_val;
	private Object gs_shader_set_default;
	private Object gs_shader_set_next_sampler;
	private Object device_nv12_available;
	private Object device_debug_marker_begin;
	private Object device_debug_marker_end;
	private Object device_gdi_texture_available;
	private Object device_shared_texture_available;
	private Object device_get_duplicator_monitor_info;
	private Object device_duplicator_create;
	private Object gs_duplicator_destroy;
	private Object gs_duplicator_update_frame;
	private Object gs_duplicator_get_texture;
	private Object device_texture_create_gdi;
	private Object gs_texture_get_dc;
	private Object gs_texture_release_dc;
	private Object device_texture_open_shared;
	private Object device_texture_get_shared_handle;
	private Object device_texture_acquire_sync;
	private Object device_texture_release_sync;
	private Object device_texture_create_nv12;
	private Object device_stagesurface_create_nv12;
	
	public gs_exports(Object device_get_name, Object device_get_type, Object device_enum_adapters, Object device_preprocessor_name, Object device_create, Object device_destroy, Object device_enter_context, Object device_leave_context, Object device_get_device_obj, Object device_swapchain_create, Object device_resize, Object device_get_size, Object device_get_width, Object device_get_height, Object device_texture_create, Object device_cubetexture_create, Object device_voltexture_create, Object device_zstencil_create, Object device_stagesurface_create, Object device_samplerstate_create, Object device_vertexshader_create, Object device_pixelshader_create, Object device_vertexbuffer_create, Object device_indexbuffer_create, Object device_timer_create, Object device_timer_range_create, Object device_get_texture_type, Object device_load_vertexbuffer, Object device_load_indexbuffer, Object device_load_texture, Object device_load_samplerstate, Object device_load_vertexshader, Object device_load_pixelshader, Object device_load_default_samplerstate, Object device_get_vertex_shader, Object device_get_pixel_shader, Object device_get_render_target, Object device_get_zstencil_target, Object device_set_render_target, Object device_set_cube_render_target, Object device_copy_texture, Object device_copy_texture_region, Object device_stage_texture, Object device_begin_frame, Object device_begin_scene, Object device_draw, Object device_end_scene, Object device_load_swapchain, Object device_clear, Object device_present, Object device_flush, Object device_set_cull_mode, Object device_get_cull_mode, Object device_enable_blending, Object device_enable_depth_test, Object device_enable_stencil_test, Object device_enable_stencil_write, Object device_enable_color, Object device_blend_function, Object device_blend_function_separate, Object device_depth_function, Object device_stencil_function, Object device_stencil_op, Object device_set_viewport, Object device_get_viewport, Object device_set_scissor_rect, Object device_ortho, Object device_frustum, Object device_projection_push, Object device_projection_pop, Object gs_swapchain_destroy, Object gs_texture_destroy, Object gs_texture_get_width, Object gs_texture_get_height, Object gs_texture_get_color_format, Object gs_texture_map, Object gs_texture_unmap, Object gs_texture_is_rect, Object gs_texture_get_obj, Object gs_cubetexture_destroy, Object gs_cubetexture_get_size, Object gs_cubetexture_get_color_format, Object gs_voltexture_destroy, Object gs_voltexture_get_width, Object gs_voltexture_get_height, Object gs_voltexture_get_depth, Object gs_voltexture_get_color_format, Object gs_stagesurface_destroy, Object gs_stagesurface_get_width, Object gs_stagesurface_get_height, Object gs_stagesurface_get_color_format, Object gs_stagesurface_map, Object gs_stagesurface_unmap, Object gs_zstencil_destroy, Object gs_samplerstate_destroy, Object gs_vertexbuffer_destroy, Object gs_vertexbuffer_flush, Object gs_vertexbuffer_flush_direct, Object gs_vertexbuffer_get_data, Object gs_indexbuffer_destroy, Object gs_indexbuffer_flush, Object gs_indexbuffer_flush_direct, Object gs_indexbuffer_get_data, Object gs_indexbuffer_get_num_indices, Object gs_indexbuffer_get_type, Object gs_timer_destroy, Object gs_timer_begin, Object gs_timer_end, Object gs_timer_get_data, Object gs_timer_range_destroy, Object gs_timer_range_begin, Object gs_timer_range_end, Object gs_timer_range_get_data, Object gs_shader_destroy, Object gs_shader_get_num_params, Object gs_shader_get_param_by_idx, Object gs_shader_get_param_by_name, Object gs_shader_get_viewproj_matrix, Object gs_shader_get_world_matrix, Object gs_shader_get_param_info, Object gs_shader_set_bool, Object gs_shader_set_float, Object gs_shader_set_int, Object gs_shader_set_matrix3, Object gs_shader_set_matrix4, Object gs_shader_set_vec2, Object gs_shader_set_vec3, Object gs_shader_set_vec4, Object gs_shader_set_texture, Object gs_shader_set_val, Object gs_shader_set_default, Object gs_shader_set_next_sampler, Object device_nv12_available, Object device_debug_marker_begin, Object device_debug_marker_end, Object device_gdi_texture_available, Object device_shared_texture_available, Object device_get_duplicator_monitor_info, Object device_duplicator_create, Object gs_duplicator_destroy, Object gs_duplicator_update_frame, Object gs_duplicator_get_texture, Object device_texture_create_gdi, Object gs_texture_get_dc, Object gs_texture_release_dc, Object device_texture_open_shared, Object device_texture_get_shared_handle, Object device_texture_acquire_sync, Object device_texture_release_sync, Object device_texture_create_nv12, Object device_stagesurface_create_nv12) {
		setDevice_get_name(device_get_name);
		setDevice_get_type(device_get_type);
		setDevice_enum_adapters(device_enum_adapters);
		setDevice_preprocessor_name(device_preprocessor_name);
		setDevice_create(device_create);
		setDevice_destroy(device_destroy);
		setDevice_enter_context(device_enter_context);
		setDevice_leave_context(device_leave_context);
		setDevice_get_device_obj(device_get_device_obj);
		setDevice_swapchain_create(device_swapchain_create);
		setDevice_resize(device_resize);
		setDevice_get_size(device_get_size);
		setDevice_get_width(device_get_width);
		setDevice_get_height(device_get_height);
		setDevice_texture_create(device_texture_create);
		setDevice_cubetexture_create(device_cubetexture_create);
		setDevice_voltexture_create(device_voltexture_create);
		setDevice_zstencil_create(device_zstencil_create);
		setDevice_stagesurface_create(device_stagesurface_create);
		setDevice_samplerstate_create(device_samplerstate_create);
		setDevice_vertexshader_create(device_vertexshader_create);
		setDevice_pixelshader_create(device_pixelshader_create);
		setDevice_vertexbuffer_create(device_vertexbuffer_create);
		setDevice_indexbuffer_create(device_indexbuffer_create);
		setDevice_timer_create(device_timer_create);
		setDevice_timer_range_create(device_timer_range_create);
		setDevice_get_texture_type(device_get_texture_type);
		setDevice_load_vertexbuffer(device_load_vertexbuffer);
		setDevice_load_indexbuffer(device_load_indexbuffer);
		setDevice_load_texture(device_load_texture);
		setDevice_load_samplerstate(device_load_samplerstate);
		setDevice_load_vertexshader(device_load_vertexshader);
		setDevice_load_pixelshader(device_load_pixelshader);
		setDevice_load_default_samplerstate(device_load_default_samplerstate);
		setDevice_get_vertex_shader(device_get_vertex_shader);
		setDevice_get_pixel_shader(device_get_pixel_shader);
		setDevice_get_render_target(device_get_render_target);
		setDevice_get_zstencil_target(device_get_zstencil_target);
		setDevice_set_render_target(device_set_render_target);
		setDevice_set_cube_render_target(device_set_cube_render_target);
		setDevice_copy_texture(device_copy_texture);
		setDevice_copy_texture_region(device_copy_texture_region);
		setDevice_stage_texture(device_stage_texture);
		setDevice_begin_frame(device_begin_frame);
		setDevice_begin_scene(device_begin_scene);
		setDevice_draw(device_draw);
		setDevice_end_scene(device_end_scene);
		setDevice_load_swapchain(device_load_swapchain);
		setDevice_clear(device_clear);
		setDevice_present(device_present);
		setDevice_flush(device_flush);
		setDevice_set_cull_mode(device_set_cull_mode);
		setDevice_get_cull_mode(device_get_cull_mode);
		setDevice_enable_blending(device_enable_blending);
		setDevice_enable_depth_test(device_enable_depth_test);
		setDevice_enable_stencil_test(device_enable_stencil_test);
		setDevice_enable_stencil_write(device_enable_stencil_write);
		setDevice_enable_color(device_enable_color);
		setDevice_blend_function(device_blend_function);
		setDevice_blend_function_separate(device_blend_function_separate);
		setDevice_depth_function(device_depth_function);
		setDevice_stencil_function(device_stencil_function);
		setDevice_stencil_op(device_stencil_op);
		setDevice_set_viewport(device_set_viewport);
		setDevice_get_viewport(device_get_viewport);
		setDevice_set_scissor_rect(device_set_scissor_rect);
		setDevice_ortho(device_ortho);
		setDevice_frustum(device_frustum);
		setDevice_projection_push(device_projection_push);
		setDevice_projection_pop(device_projection_pop);
		setGs_swapchain_destroy(gs_swapchain_destroy);
		setGs_texture_destroy(gs_texture_destroy);
		setGs_texture_get_width(gs_texture_get_width);
		setGs_texture_get_height(gs_texture_get_height);
		setGs_texture_get_color_format(gs_texture_get_color_format);
		setGs_texture_map(gs_texture_map);
		setGs_texture_unmap(gs_texture_unmap);
		setGs_texture_is_rect(gs_texture_is_rect);
		setGs_texture_get_obj(gs_texture_get_obj);
		setGs_cubetexture_destroy(gs_cubetexture_destroy);
		setGs_cubetexture_get_size(gs_cubetexture_get_size);
		setGs_cubetexture_get_color_format(gs_cubetexture_get_color_format);
		setGs_voltexture_destroy(gs_voltexture_destroy);
		setGs_voltexture_get_width(gs_voltexture_get_width);
		setGs_voltexture_get_height(gs_voltexture_get_height);
		setGs_voltexture_get_depth(gs_voltexture_get_depth);
		setGs_voltexture_get_color_format(gs_voltexture_get_color_format);
		setGs_stagesurface_destroy(gs_stagesurface_destroy);
		setGs_stagesurface_get_width(gs_stagesurface_get_width);
		setGs_stagesurface_get_height(gs_stagesurface_get_height);
		setGs_stagesurface_get_color_format(gs_stagesurface_get_color_format);
		setGs_stagesurface_map(gs_stagesurface_map);
		setGs_stagesurface_unmap(gs_stagesurface_unmap);
		setGs_zstencil_destroy(gs_zstencil_destroy);
		setGs_samplerstate_destroy(gs_samplerstate_destroy);
		setGs_vertexbuffer_destroy(gs_vertexbuffer_destroy);
		setGs_vertexbuffer_flush(gs_vertexbuffer_flush);
		setGs_vertexbuffer_flush_direct(gs_vertexbuffer_flush_direct);
		setGs_vertexbuffer_get_data(gs_vertexbuffer_get_data);
		setGs_indexbuffer_destroy(gs_indexbuffer_destroy);
		setGs_indexbuffer_flush(gs_indexbuffer_flush);
		setGs_indexbuffer_flush_direct(gs_indexbuffer_flush_direct);
		setGs_indexbuffer_get_data(gs_indexbuffer_get_data);
		setGs_indexbuffer_get_num_indices(gs_indexbuffer_get_num_indices);
		setGs_indexbuffer_get_type(gs_indexbuffer_get_type);
		setGs_timer_destroy(gs_timer_destroy);
		setGs_timer_begin(gs_timer_begin);
		setGs_timer_end(gs_timer_end);
		setGs_timer_get_data(gs_timer_get_data);
		setGs_timer_range_destroy(gs_timer_range_destroy);
		setGs_timer_range_begin(gs_timer_range_begin);
		setGs_timer_range_end(gs_timer_range_end);
		setGs_timer_range_get_data(gs_timer_range_get_data);
		setGs_shader_destroy(gs_shader_destroy);
		setGs_shader_get_num_params(gs_shader_get_num_params);
		setGs_shader_get_param_by_idx(gs_shader_get_param_by_idx);
		setGs_shader_get_param_by_name(gs_shader_get_param_by_name);
		setGs_shader_get_viewproj_matrix(gs_shader_get_viewproj_matrix);
		setGs_shader_get_world_matrix(gs_shader_get_world_matrix);
		setGs_shader_get_param_info(gs_shader_get_param_info);
		setGs_shader_set_bool(gs_shader_set_bool);
		setGs_shader_set_float(gs_shader_set_float);
		setGs_shader_set_int(gs_shader_set_int);
		setGs_shader_set_matrix3(gs_shader_set_matrix3);
		setGs_shader_set_matrix4(gs_shader_set_matrix4);
		setGs_shader_set_vec2(gs_shader_set_vec2);
		setGs_shader_set_vec3(gs_shader_set_vec3);
		setGs_shader_set_vec4(gs_shader_set_vec4);
		setGs_shader_set_texture(gs_shader_set_texture);
		setGs_shader_set_val(gs_shader_set_val);
		setGs_shader_set_default(gs_shader_set_default);
		setGs_shader_set_next_sampler(gs_shader_set_next_sampler);
		setDevice_nv12_available(device_nv12_available);
		setDevice_debug_marker_begin(device_debug_marker_begin);
		setDevice_debug_marker_end(device_debug_marker_end);
		setDevice_gdi_texture_available(device_gdi_texture_available);
		setDevice_shared_texture_available(device_shared_texture_available);
		setDevice_get_duplicator_monitor_info(device_get_duplicator_monitor_info);
		setDevice_duplicator_create(device_duplicator_create);
		setGs_duplicator_destroy(gs_duplicator_destroy);
		setGs_duplicator_update_frame(gs_duplicator_update_frame);
		setGs_duplicator_get_texture(gs_duplicator_get_texture);
		setDevice_texture_create_gdi(device_texture_create_gdi);
		setGs_texture_get_dc(gs_texture_get_dc);
		setGs_texture_release_dc(gs_texture_release_dc);
		setDevice_texture_open_shared(device_texture_open_shared);
		setDevice_texture_get_shared_handle(device_texture_get_shared_handle);
		setDevice_texture_acquire_sync(device_texture_acquire_sync);
		setDevice_texture_release_sync(device_texture_release_sync);
		setDevice_texture_create_nv12(device_texture_create_nv12);
		setDevice_stagesurface_create_nv12(device_stagesurface_create_nv12);
	}
	public gs_exports() {
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
	public Object load_graphics_imports(Object module, Object module_name) {
		 success = true;
		Object generatedDevice_get_name = this.getDevice_get_name();
		do {
			this.setDevice_get_name(ModernizedCProgram.os_dlsym(module, "device_get_name"));
			if (!generatedDevice_get_name) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_name", module_name);
			} 
		} while (false);
		Object generatedDevice_get_type = this.getDevice_get_type();
		do {
			this.setDevice_get_type(ModernizedCProgram.os_dlsym(module, "device_get_type"));
			if (!generatedDevice_get_type) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_type", module_name);
			} 
		} while (false);
		do {
			this.setDevice_enum_adapters(ModernizedCProgram.os_dlsym(module, "device_enum_adapters"));
		} while (false);
		Object generatedDevice_preprocessor_name = this.getDevice_preprocessor_name();
		do {
			this.setDevice_preprocessor_name(ModernizedCProgram.os_dlsym(module, "device_preprocessor_name"));
			if (!generatedDevice_preprocessor_name) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_preprocessor_name", module_name);
			} 
		} while (false);
		Object generatedDevice_create = this.getDevice_create();
		do {
			this.setDevice_create(ModernizedCProgram.os_dlsym(module, "device_create"));
			if (!generatedDevice_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_create", module_name);
			} 
		} while (false);
		Object generatedDevice_destroy = this.getDevice_destroy();
		do {
			this.setDevice_destroy(ModernizedCProgram.os_dlsym(module, "device_destroy"));
			if (!generatedDevice_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_destroy", module_name);
			} 
		} while (false);
		Object generatedDevice_enter_context = this.getDevice_enter_context();
		do {
			this.setDevice_enter_context(ModernizedCProgram.os_dlsym(module, "device_enter_context"));
			if (!generatedDevice_enter_context) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enter_context", module_name);
			} 
		} while (false);
		Object generatedDevice_leave_context = this.getDevice_leave_context();
		do {
			this.setDevice_leave_context(ModernizedCProgram.os_dlsym(module, "device_leave_context"));
			if (!generatedDevice_leave_context) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_leave_context", module_name);
			} 
		} while (false);
		Object generatedDevice_get_device_obj = this.getDevice_get_device_obj();
		do {
			this.setDevice_get_device_obj(ModernizedCProgram.os_dlsym(module, "device_get_device_obj"));
			if (!generatedDevice_get_device_obj) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_device_obj", module_name);
			} 
		} while (false);
		Object generatedDevice_swapchain_create = this.getDevice_swapchain_create();
		do {
			this.setDevice_swapchain_create(ModernizedCProgram.os_dlsym(module, "device_swapchain_create"));
			if (!generatedDevice_swapchain_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_swapchain_create", module_name);
			} 
		} while (false);
		Object generatedDevice_resize = this.getDevice_resize();
		do {
			this.setDevice_resize(ModernizedCProgram.os_dlsym(module, "device_resize"));
			if (!generatedDevice_resize) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_resize", module_name);
			} 
		} while (false);
		Object generatedDevice_get_size = this.getDevice_get_size();
		do {
			this.setDevice_get_size(ModernizedCProgram.os_dlsym(module, "device_get_size"));
			if (!generatedDevice_get_size) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_size", module_name);
			} 
		} while (false);
		Object generatedDevice_get_width = this.getDevice_get_width();
		do {
			this.setDevice_get_width(ModernizedCProgram.os_dlsym(module, "device_get_width"));
			if (!generatedDevice_get_width) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_width", module_name);
			} 
		} while (false);
		Object generatedDevice_get_height = this.getDevice_get_height();
		do {
			this.setDevice_get_height(ModernizedCProgram.os_dlsym(module, "device_get_height"));
			if (!generatedDevice_get_height) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_height", module_name);
			} 
		} while (false);
		Object generatedDevice_texture_create = this.getDevice_texture_create();
		do {
			this.setDevice_texture_create(ModernizedCProgram.os_dlsym(module, "device_texture_create"));
			if (!generatedDevice_texture_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_texture_create", module_name);
			} 
		} while (false);
		Object generatedDevice_cubetexture_create = this.getDevice_cubetexture_create();
		do {
			this.setDevice_cubetexture_create(ModernizedCProgram.os_dlsym(module, "device_cubetexture_create"));
			if (!generatedDevice_cubetexture_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_cubetexture_create", module_name);
			} 
		} while (false);
		Object generatedDevice_voltexture_create = this.getDevice_voltexture_create();
		do {
			this.setDevice_voltexture_create(ModernizedCProgram.os_dlsym(module, "device_voltexture_create"));
			if (!generatedDevice_voltexture_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_voltexture_create", module_name);
			} 
		} while (false);
		Object generatedDevice_zstencil_create = this.getDevice_zstencil_create();
		do {
			this.setDevice_zstencil_create(ModernizedCProgram.os_dlsym(module, "device_zstencil_create"));
			if (!generatedDevice_zstencil_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_zstencil_create", module_name);
			} 
		} while (false);
		Object generatedDevice_stagesurface_create = this.getDevice_stagesurface_create();
		do {
			this.setDevice_stagesurface_create(ModernizedCProgram.os_dlsym(module, "device_stagesurface_create"));
			if (!generatedDevice_stagesurface_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_stagesurface_create", module_name);
			} 
		} while (false);
		Object generatedDevice_samplerstate_create = this.getDevice_samplerstate_create();
		do {
			this.setDevice_samplerstate_create(ModernizedCProgram.os_dlsym(module, "device_samplerstate_create"));
			if (!generatedDevice_samplerstate_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_samplerstate_create", module_name);
			} 
		} while (false);
		Object generatedDevice_vertexshader_create = this.getDevice_vertexshader_create();
		do {
			this.setDevice_vertexshader_create(ModernizedCProgram.os_dlsym(module, "device_vertexshader_create"));
			if (!generatedDevice_vertexshader_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_vertexshader_create", module_name);
			} 
		} while (false);
		Object generatedDevice_pixelshader_create = this.getDevice_pixelshader_create();
		do {
			this.setDevice_pixelshader_create(ModernizedCProgram.os_dlsym(module, "device_pixelshader_create"));
			if (!generatedDevice_pixelshader_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_pixelshader_create", module_name);
			} 
		} while (false);
		Object generatedDevice_vertexbuffer_create = this.getDevice_vertexbuffer_create();
		do {
			this.setDevice_vertexbuffer_create(ModernizedCProgram.os_dlsym(module, "device_vertexbuffer_create"));
			if (!generatedDevice_vertexbuffer_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_vertexbuffer_create", module_name);
			} 
		} while (false);
		Object generatedDevice_indexbuffer_create = this.getDevice_indexbuffer_create();
		do {
			this.setDevice_indexbuffer_create(ModernizedCProgram.os_dlsym(module, "device_indexbuffer_create"));
			if (!generatedDevice_indexbuffer_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_indexbuffer_create", module_name);
			} 
		} while (false);
		Object generatedDevice_timer_create = this.getDevice_timer_create();
		do {
			this.setDevice_timer_create(ModernizedCProgram.os_dlsym(module, "device_timer_create"));
			if (!generatedDevice_timer_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_timer_create", module_name);
			} 
		} while (false);
		Object generatedDevice_timer_range_create = this.getDevice_timer_range_create();
		do {
			this.setDevice_timer_range_create(ModernizedCProgram.os_dlsym(module, "device_timer_range_create"));
			if (!generatedDevice_timer_range_create) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_timer_range_create", module_name);
			} 
		} while (false);
		Object generatedDevice_get_texture_type = this.getDevice_get_texture_type();
		do {
			this.setDevice_get_texture_type(ModernizedCProgram.os_dlsym(module, "device_get_texture_type"));
			if (!generatedDevice_get_texture_type) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_texture_type", module_name);
			} 
		} while (false);
		Object generatedDevice_load_vertexbuffer = this.getDevice_load_vertexbuffer();
		do {
			this.setDevice_load_vertexbuffer(ModernizedCProgram.os_dlsym(module, "device_load_vertexbuffer"));
			if (!generatedDevice_load_vertexbuffer) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_vertexbuffer", module_name);
			} 
		} while (false);
		Object generatedDevice_load_indexbuffer = this.getDevice_load_indexbuffer();
		do {
			this.setDevice_load_indexbuffer(ModernizedCProgram.os_dlsym(module, "device_load_indexbuffer"));
			if (!generatedDevice_load_indexbuffer) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_indexbuffer", module_name);
			} 
		} while (false);
		Object generatedDevice_load_texture = this.getDevice_load_texture();
		do {
			this.setDevice_load_texture(ModernizedCProgram.os_dlsym(module, "device_load_texture"));
			if (!generatedDevice_load_texture) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_texture", module_name);
			} 
		} while (false);
		Object generatedDevice_load_samplerstate = this.getDevice_load_samplerstate();
		do {
			this.setDevice_load_samplerstate(ModernizedCProgram.os_dlsym(module, "device_load_samplerstate"));
			if (!generatedDevice_load_samplerstate) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_samplerstate", module_name);
			} 
		} while (false);
		Object generatedDevice_load_vertexshader = this.getDevice_load_vertexshader();
		do {
			this.setDevice_load_vertexshader(ModernizedCProgram.os_dlsym(module, "device_load_vertexshader"));
			if (!generatedDevice_load_vertexshader) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_vertexshader", module_name);
			} 
		} while (false);
		Object generatedDevice_load_pixelshader = this.getDevice_load_pixelshader();
		do {
			this.setDevice_load_pixelshader(ModernizedCProgram.os_dlsym(module, "device_load_pixelshader"));
			if (!generatedDevice_load_pixelshader) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_pixelshader", module_name);
			} 
		} while (false);
		Object generatedDevice_load_default_samplerstate = this.getDevice_load_default_samplerstate();
		do {
			this.setDevice_load_default_samplerstate(ModernizedCProgram.os_dlsym(module, "device_load_default_samplerstate"));
			if (!generatedDevice_load_default_samplerstate) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_default_samplerstate", module_name);
			} 
		} while (false);
		Object generatedDevice_get_vertex_shader = this.getDevice_get_vertex_shader();
		do {
			this.setDevice_get_vertex_shader(ModernizedCProgram.os_dlsym(module, "device_get_vertex_shader"));
			if (!generatedDevice_get_vertex_shader) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_vertex_shader", module_name);
			} 
		} while (false);
		Object generatedDevice_get_pixel_shader = this.getDevice_get_pixel_shader();
		do {
			this.setDevice_get_pixel_shader(ModernizedCProgram.os_dlsym(module, "device_get_pixel_shader"));
			if (!generatedDevice_get_pixel_shader) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_pixel_shader", module_name);
			} 
		} while (false);
		Object generatedDevice_get_render_target = this.getDevice_get_render_target();
		do {
			this.setDevice_get_render_target(ModernizedCProgram.os_dlsym(module, "device_get_render_target"));
			if (!generatedDevice_get_render_target) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_render_target", module_name);
			} 
		} while (false);
		Object generatedDevice_get_zstencil_target = this.getDevice_get_zstencil_target();
		do {
			this.setDevice_get_zstencil_target(ModernizedCProgram.os_dlsym(module, "device_get_zstencil_target"));
			if (!generatedDevice_get_zstencil_target) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_zstencil_target", module_name);
			} 
		} while (false);
		Object generatedDevice_set_render_target = this.getDevice_set_render_target();
		do {
			this.setDevice_set_render_target(ModernizedCProgram.os_dlsym(module, "device_set_render_target"));
			if (!generatedDevice_set_render_target) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_set_render_target", module_name);
			} 
		} while (false);
		Object generatedDevice_set_cube_render_target = this.getDevice_set_cube_render_target();
		do {
			this.setDevice_set_cube_render_target(ModernizedCProgram.os_dlsym(module, "device_set_cube_render_target"));
			if (!generatedDevice_set_cube_render_target) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_set_cube_render_target", module_name);
			} 
		} while (false);
		Object generatedDevice_copy_texture_region = this.getDevice_copy_texture_region();
		do {
			this.setDevice_copy_texture_region(ModernizedCProgram.os_dlsym(module, "device_copy_texture_region"));
			if (!generatedDevice_copy_texture_region) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_copy_texture_region", module_name);
			} 
		} while (false);
		Object generatedDevice_copy_texture = this.getDevice_copy_texture();
		do {
			this.setDevice_copy_texture(ModernizedCProgram.os_dlsym(module, "device_copy_texture"));
			if (!generatedDevice_copy_texture) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_copy_texture", module_name);
			} 
		} while (false);
		Object generatedDevice_stage_texture = this.getDevice_stage_texture();
		do {
			this.setDevice_stage_texture(ModernizedCProgram.os_dlsym(module, "device_stage_texture"));
			if (!generatedDevice_stage_texture) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_stage_texture", module_name);
			} 
		} while (false);
		Object generatedDevice_begin_frame = this.getDevice_begin_frame();
		do {
			this.setDevice_begin_frame(ModernizedCProgram.os_dlsym(module, "device_begin_frame"));
			if (!generatedDevice_begin_frame) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_begin_frame", module_name);
			} 
		} while (false);
		Object generatedDevice_begin_scene = this.getDevice_begin_scene();
		do {
			this.setDevice_begin_scene(ModernizedCProgram.os_dlsym(module, "device_begin_scene"));
			if (!generatedDevice_begin_scene) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_begin_scene", module_name);
			} 
		} while (false);
		Object generatedDevice_draw = this.getDevice_draw();
		do {
			this.setDevice_draw(ModernizedCProgram.os_dlsym(module, "device_draw"));
			if (!generatedDevice_draw) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_draw", module_name);
			} 
		} while (false);
		Object generatedDevice_load_swapchain = this.getDevice_load_swapchain();
		do {
			this.setDevice_load_swapchain(ModernizedCProgram.os_dlsym(module, "device_load_swapchain"));
			if (!generatedDevice_load_swapchain) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_load_swapchain", module_name);
			} 
		} while (false);
		Object generatedDevice_end_scene = this.getDevice_end_scene();
		do {
			this.setDevice_end_scene(ModernizedCProgram.os_dlsym(module, "device_end_scene"));
			if (!generatedDevice_end_scene) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_end_scene", module_name);
			} 
		} while (false);
		Object generatedDevice_clear = this.getDevice_clear();
		do {
			this.setDevice_clear(ModernizedCProgram.os_dlsym(module, "device_clear"));
			if (!generatedDevice_clear) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_clear", module_name);
			} 
		} while (false);
		Object generatedDevice_present = this.getDevice_present();
		do {
			this.setDevice_present(ModernizedCProgram.os_dlsym(module, "device_present"));
			if (!generatedDevice_present) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_present", module_name);
			} 
		} while (false);
		Object generatedDevice_flush = this.getDevice_flush();
		do {
			this.setDevice_flush(ModernizedCProgram.os_dlsym(module, "device_flush"));
			if (!generatedDevice_flush) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_flush", module_name);
			} 
		} while (false);
		Object generatedDevice_set_cull_mode = this.getDevice_set_cull_mode();
		do {
			this.setDevice_set_cull_mode(ModernizedCProgram.os_dlsym(module, "device_set_cull_mode"));
			if (!generatedDevice_set_cull_mode) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_set_cull_mode", module_name);
			} 
		} while (false);
		Object generatedDevice_get_cull_mode = this.getDevice_get_cull_mode();
		do {
			this.setDevice_get_cull_mode(ModernizedCProgram.os_dlsym(module, "device_get_cull_mode"));
			if (!generatedDevice_get_cull_mode) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_cull_mode", module_name);
			} 
		} while (false);
		Object generatedDevice_enable_blending = this.getDevice_enable_blending();
		do {
			this.setDevice_enable_blending(ModernizedCProgram.os_dlsym(module, "device_enable_blending"));
			if (!generatedDevice_enable_blending) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enable_blending", module_name);
			} 
		} while (false);
		Object generatedDevice_enable_depth_test = this.getDevice_enable_depth_test();
		do {
			this.setDevice_enable_depth_test(ModernizedCProgram.os_dlsym(module, "device_enable_depth_test"));
			if (!generatedDevice_enable_depth_test) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enable_depth_test", module_name);
			} 
		} while (false);
		Object generatedDevice_enable_stencil_test = this.getDevice_enable_stencil_test();
		do {
			this.setDevice_enable_stencil_test(ModernizedCProgram.os_dlsym(module, "device_enable_stencil_test"));
			if (!generatedDevice_enable_stencil_test) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enable_stencil_test", module_name);
			} 
		} while (false);
		Object generatedDevice_enable_stencil_write = this.getDevice_enable_stencil_write();
		do {
			this.setDevice_enable_stencil_write(ModernizedCProgram.os_dlsym(module, "device_enable_stencil_write"));
			if (!generatedDevice_enable_stencil_write) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enable_stencil_write", module_name);
			} 
		} while (false);
		Object generatedDevice_enable_color = this.getDevice_enable_color();
		do {
			this.setDevice_enable_color(ModernizedCProgram.os_dlsym(module, "device_enable_color"));
			if (!generatedDevice_enable_color) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_enable_color", module_name);
			} 
		} while (false);
		Object generatedDevice_blend_function = this.getDevice_blend_function();
		do {
			this.setDevice_blend_function(ModernizedCProgram.os_dlsym(module, "device_blend_function"));
			if (!generatedDevice_blend_function) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_blend_function", module_name);
			} 
		} while (false);
		Object generatedDevice_blend_function_separate = this.getDevice_blend_function_separate();
		do {
			this.setDevice_blend_function_separate(ModernizedCProgram.os_dlsym(module, "device_blend_function_separate"));
			if (!generatedDevice_blend_function_separate) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_blend_function_separate", module_name);
			} 
		} while (false);
		Object generatedDevice_depth_function = this.getDevice_depth_function();
		do {
			this.setDevice_depth_function(ModernizedCProgram.os_dlsym(module, "device_depth_function"));
			if (!generatedDevice_depth_function) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_depth_function", module_name);
			} 
		} while (false);
		Object generatedDevice_stencil_function = this.getDevice_stencil_function();
		do {
			this.setDevice_stencil_function(ModernizedCProgram.os_dlsym(module, "device_stencil_function"));
			if (!generatedDevice_stencil_function) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_stencil_function", module_name);
			} 
		} while (false);
		Object generatedDevice_stencil_op = this.getDevice_stencil_op();
		do {
			this.setDevice_stencil_op(ModernizedCProgram.os_dlsym(module, "device_stencil_op"));
			if (!generatedDevice_stencil_op) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_stencil_op", module_name);
			} 
		} while (false);
		Object generatedDevice_set_viewport = this.getDevice_set_viewport();
		do {
			this.setDevice_set_viewport(ModernizedCProgram.os_dlsym(module, "device_set_viewport"));
			if (!generatedDevice_set_viewport) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_set_viewport", module_name);
			} 
		} while (false);
		Object generatedDevice_get_viewport = this.getDevice_get_viewport();
		do {
			this.setDevice_get_viewport(ModernizedCProgram.os_dlsym(module, "device_get_viewport"));
			if (!generatedDevice_get_viewport) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_get_viewport", module_name);
			} 
		} while (false);
		Object generatedDevice_set_scissor_rect = this.getDevice_set_scissor_rect();
		do {
			this.setDevice_set_scissor_rect(ModernizedCProgram.os_dlsym(module, "device_set_scissor_rect"));
			if (!generatedDevice_set_scissor_rect) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_set_scissor_rect", module_name);
			} 
		} while (false);
		Object generatedDevice_ortho = this.getDevice_ortho();
		do {
			this.setDevice_ortho(ModernizedCProgram.os_dlsym(module, "device_ortho"));
			if (!generatedDevice_ortho) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_ortho", module_name);
			} 
		} while (false);
		Object generatedDevice_frustum = this.getDevice_frustum();
		do {
			this.setDevice_frustum(ModernizedCProgram.os_dlsym(module, "device_frustum"));
			if (!generatedDevice_frustum) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_frustum", module_name);
			} 
		} while (false);
		Object generatedDevice_projection_push = this.getDevice_projection_push();
		do {
			this.setDevice_projection_push(ModernizedCProgram.os_dlsym(module, "device_projection_push"));
			if (!generatedDevice_projection_push) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_projection_push", module_name);
			} 
		} while (false);
		Object generatedDevice_projection_pop = this.getDevice_projection_pop();
		do {
			this.setDevice_projection_pop(ModernizedCProgram.os_dlsym(module, "device_projection_pop"));
			if (!generatedDevice_projection_pop) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_projection_pop", module_name);
			} 
		} while (false);
		Object generatedGs_swapchain_destroy = this.getGs_swapchain_destroy();
		do {
			this.setGs_swapchain_destroy(ModernizedCProgram.os_dlsym(module, "gs_swapchain_destroy"));
			if (!generatedGs_swapchain_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_swapchain_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_texture_destroy = this.getGs_texture_destroy();
		do {
			this.setGs_texture_destroy(ModernizedCProgram.os_dlsym(module, "gs_texture_destroy"));
			if (!generatedGs_texture_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_texture_get_width = this.getGs_texture_get_width();
		do {
			this.setGs_texture_get_width(ModernizedCProgram.os_dlsym(module, "gs_texture_get_width"));
			if (!generatedGs_texture_get_width) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_get_width", module_name);
			} 
		} while (false);
		Object generatedGs_texture_get_height = this.getGs_texture_get_height();
		do {
			this.setGs_texture_get_height(ModernizedCProgram.os_dlsym(module, "gs_texture_get_height"));
			if (!generatedGs_texture_get_height) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_get_height", module_name);
			} 
		} while (false);
		Object generatedGs_texture_get_color_format = this.getGs_texture_get_color_format();
		do {
			this.setGs_texture_get_color_format(ModernizedCProgram.os_dlsym(module, "gs_texture_get_color_format"));
			if (!generatedGs_texture_get_color_format) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_get_color_format", module_name);
			} 
		} while (false);
		Object generatedGs_texture_map = this.getGs_texture_map();
		do {
			this.setGs_texture_map(ModernizedCProgram.os_dlsym(module, "gs_texture_map"));
			if (!generatedGs_texture_map) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_map", module_name);
			} 
		} while (false);
		Object generatedGs_texture_unmap = this.getGs_texture_unmap();
		do {
			this.setGs_texture_unmap(ModernizedCProgram.os_dlsym(module, "gs_texture_unmap"));
			if (!generatedGs_texture_unmap) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_unmap", module_name);
			} 
		} while (false);
		do {
			this.setGs_texture_is_rect(ModernizedCProgram.os_dlsym(module, "gs_texture_is_rect"));
		} while (false);
		Object generatedGs_texture_get_obj = this.getGs_texture_get_obj();
		do {
			this.setGs_texture_get_obj(ModernizedCProgram.os_dlsym(module, "gs_texture_get_obj"));
			if (!generatedGs_texture_get_obj) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_texture_get_obj", module_name);
			} 
		} while (false);
		Object generatedGs_cubetexture_destroy = this.getGs_cubetexture_destroy();
		do {
			this.setGs_cubetexture_destroy(ModernizedCProgram.os_dlsym(module, "gs_cubetexture_destroy"));
			if (!generatedGs_cubetexture_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_cubetexture_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_cubetexture_get_size = this.getGs_cubetexture_get_size();
		do {
			this.setGs_cubetexture_get_size(ModernizedCProgram.os_dlsym(module, "gs_cubetexture_get_size"));
			if (!generatedGs_cubetexture_get_size) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_cubetexture_get_size", module_name);
			} 
		} while (false);
		Object generatedGs_cubetexture_get_color_format = this.getGs_cubetexture_get_color_format();
		do {
			this.setGs_cubetexture_get_color_format(ModernizedCProgram.os_dlsym(module, "gs_cubetexture_get_color_format"));
			if (!generatedGs_cubetexture_get_color_format) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_cubetexture_get_color_format", module_name);
			} 
		} while (false);
		Object generatedGs_voltexture_destroy = this.getGs_voltexture_destroy();
		do {
			this.setGs_voltexture_destroy(ModernizedCProgram.os_dlsym(module, "gs_voltexture_destroy"));
			if (!generatedGs_voltexture_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_voltexture_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_voltexture_get_width = this.getGs_voltexture_get_width();
		do {
			this.setGs_voltexture_get_width(ModernizedCProgram.os_dlsym(module, "gs_voltexture_get_width"));
			if (!generatedGs_voltexture_get_width) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_voltexture_get_width", module_name);
			} 
		} while (false);
		Object generatedGs_voltexture_get_height = this.getGs_voltexture_get_height();
		do {
			this.setGs_voltexture_get_height(ModernizedCProgram.os_dlsym(module, "gs_voltexture_get_height"));
			if (!generatedGs_voltexture_get_height) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_voltexture_get_height", module_name);
			} 
		} while (false);
		Object generatedGs_voltexture_get_depth = this.getGs_voltexture_get_depth();
		do {
			this.setGs_voltexture_get_depth(ModernizedCProgram.os_dlsym(module, "gs_voltexture_get_depth"));
			if (!generatedGs_voltexture_get_depth) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_voltexture_get_depth", module_name);
			} 
		} while (false);
		Object generatedGs_voltexture_get_color_format = this.getGs_voltexture_get_color_format();
		do {
			this.setGs_voltexture_get_color_format(ModernizedCProgram.os_dlsym(module, "gs_voltexture_get_color_format"));
			if (!generatedGs_voltexture_get_color_format) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_voltexture_get_color_format", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_destroy = this.getGs_stagesurface_destroy();
		do {
			this.setGs_stagesurface_destroy(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_destroy"));
			if (!generatedGs_stagesurface_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_get_width = this.getGs_stagesurface_get_width();
		do {
			this.setGs_stagesurface_get_width(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_get_width"));
			if (!generatedGs_stagesurface_get_width) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_get_width", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_get_height = this.getGs_stagesurface_get_height();
		do {
			this.setGs_stagesurface_get_height(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_get_height"));
			if (!generatedGs_stagesurface_get_height) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_get_height", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_get_color_format = this.getGs_stagesurface_get_color_format();
		do {
			this.setGs_stagesurface_get_color_format(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_get_color_format"));
			if (!generatedGs_stagesurface_get_color_format) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_get_color_format", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_map = this.getGs_stagesurface_map();
		do {
			this.setGs_stagesurface_map(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_map"));
			if (!generatedGs_stagesurface_map) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_map", module_name);
			} 
		} while (false);
		Object generatedGs_stagesurface_unmap = this.getGs_stagesurface_unmap();
		do {
			this.setGs_stagesurface_unmap(ModernizedCProgram.os_dlsym(module, "gs_stagesurface_unmap"));
			if (!generatedGs_stagesurface_unmap) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_stagesurface_unmap", module_name);
			} 
		} while (false);
		Object generatedGs_zstencil_destroy = this.getGs_zstencil_destroy();
		do {
			this.setGs_zstencil_destroy(ModernizedCProgram.os_dlsym(module, "gs_zstencil_destroy"));
			if (!generatedGs_zstencil_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_zstencil_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_samplerstate_destroy = this.getGs_samplerstate_destroy();
		do {
			this.setGs_samplerstate_destroy(ModernizedCProgram.os_dlsym(module, "gs_samplerstate_destroy"));
			if (!generatedGs_samplerstate_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_samplerstate_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_vertexbuffer_destroy = this.getGs_vertexbuffer_destroy();
		do {
			this.setGs_vertexbuffer_destroy(ModernizedCProgram.os_dlsym(module, "gs_vertexbuffer_destroy"));
			if (!generatedGs_vertexbuffer_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_vertexbuffer_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_vertexbuffer_flush = this.getGs_vertexbuffer_flush();
		do {
			this.setGs_vertexbuffer_flush(ModernizedCProgram.os_dlsym(module, "gs_vertexbuffer_flush"));
			if (!generatedGs_vertexbuffer_flush) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_vertexbuffer_flush", module_name);
			} 
		} while (false);
		Object generatedGs_vertexbuffer_flush_direct = this.getGs_vertexbuffer_flush_direct();
		do {
			this.setGs_vertexbuffer_flush_direct(ModernizedCProgram.os_dlsym(module, "gs_vertexbuffer_flush_direct"));
			if (!generatedGs_vertexbuffer_flush_direct) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_vertexbuffer_flush_direct", module_name);
			} 
		} while (false);
		Object generatedGs_vertexbuffer_get_data = this.getGs_vertexbuffer_get_data();
		do {
			this.setGs_vertexbuffer_get_data(ModernizedCProgram.os_dlsym(module, "gs_vertexbuffer_get_data"));
			if (!generatedGs_vertexbuffer_get_data) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_vertexbuffer_get_data", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_destroy = this.getGs_indexbuffer_destroy();
		do {
			this.setGs_indexbuffer_destroy(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_destroy"));
			if (!generatedGs_indexbuffer_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_flush = this.getGs_indexbuffer_flush();
		do {
			this.setGs_indexbuffer_flush(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_flush"));
			if (!generatedGs_indexbuffer_flush) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_flush", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_flush_direct = this.getGs_indexbuffer_flush_direct();
		do {
			this.setGs_indexbuffer_flush_direct(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_flush_direct"));
			if (!generatedGs_indexbuffer_flush_direct) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_flush_direct", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_get_data = this.getGs_indexbuffer_get_data();
		do {
			this.setGs_indexbuffer_get_data(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_get_data"));
			if (!generatedGs_indexbuffer_get_data) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_get_data", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_get_num_indices = this.getGs_indexbuffer_get_num_indices();
		do {
			this.setGs_indexbuffer_get_num_indices(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_get_num_indices"));
			if (!generatedGs_indexbuffer_get_num_indices) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_get_num_indices", module_name);
			} 
		} while (false);
		Object generatedGs_indexbuffer_get_type = this.getGs_indexbuffer_get_type();
		do {
			this.setGs_indexbuffer_get_type(ModernizedCProgram.os_dlsym(module, "gs_indexbuffer_get_type"));
			if (!generatedGs_indexbuffer_get_type) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_indexbuffer_get_type", module_name);
			} 
		} while (false);
		Object generatedGs_timer_destroy = this.getGs_timer_destroy();
		do {
			this.setGs_timer_destroy(ModernizedCProgram.os_dlsym(module, "gs_timer_destroy"));
			if (!generatedGs_timer_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_timer_begin = this.getGs_timer_begin();
		do {
			this.setGs_timer_begin(ModernizedCProgram.os_dlsym(module, "gs_timer_begin"));
			if (!generatedGs_timer_begin) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_begin", module_name);
			} 
		} while (false);
		Object generatedGs_timer_end = this.getGs_timer_end();
		do {
			this.setGs_timer_end(ModernizedCProgram.os_dlsym(module, "gs_timer_end"));
			if (!generatedGs_timer_end) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_end", module_name);
			} 
		} while (false);
		Object generatedGs_timer_get_data = this.getGs_timer_get_data();
		do {
			this.setGs_timer_get_data(ModernizedCProgram.os_dlsym(module, "gs_timer_get_data"));
			if (!generatedGs_timer_get_data) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_get_data", module_name);
			} 
		} while (false);
		Object generatedGs_timer_range_destroy = this.getGs_timer_range_destroy();
		do {
			this.setGs_timer_range_destroy(ModernizedCProgram.os_dlsym(module, "gs_timer_range_destroy"));
			if (!generatedGs_timer_range_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_range_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_timer_range_begin = this.getGs_timer_range_begin();
		do {
			this.setGs_timer_range_begin(ModernizedCProgram.os_dlsym(module, "gs_timer_range_begin"));
			if (!generatedGs_timer_range_begin) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_range_begin", module_name);
			} 
		} while (false);
		Object generatedGs_timer_range_end = this.getGs_timer_range_end();
		do {
			this.setGs_timer_range_end(ModernizedCProgram.os_dlsym(module, "gs_timer_range_end"));
			if (!generatedGs_timer_range_end) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_range_end", module_name);
			} 
		} while (false);
		Object generatedGs_timer_range_get_data = this.getGs_timer_range_get_data();
		do {
			this.setGs_timer_range_get_data(ModernizedCProgram.os_dlsym(module, "gs_timer_range_get_data"));
			if (!generatedGs_timer_range_get_data) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_timer_range_get_data", module_name);
			} 
		} while (false);
		Object generatedGs_shader_destroy = this.getGs_shader_destroy();
		do {
			this.setGs_shader_destroy(ModernizedCProgram.os_dlsym(module, "gs_shader_destroy"));
			if (!generatedGs_shader_destroy) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_destroy", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_num_params = this.getGs_shader_get_num_params();
		do {
			this.setGs_shader_get_num_params(ModernizedCProgram.os_dlsym(module, "gs_shader_get_num_params"));
			if (!generatedGs_shader_get_num_params) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_num_params", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_param_by_idx = this.getGs_shader_get_param_by_idx();
		do {
			this.setGs_shader_get_param_by_idx(ModernizedCProgram.os_dlsym(module, "gs_shader_get_param_by_idx"));
			if (!generatedGs_shader_get_param_by_idx) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_param_by_idx", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_param_by_name = this.getGs_shader_get_param_by_name();
		do {
			this.setGs_shader_get_param_by_name(ModernizedCProgram.os_dlsym(module, "gs_shader_get_param_by_name"));
			if (!generatedGs_shader_get_param_by_name) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_param_by_name", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_viewproj_matrix = this.getGs_shader_get_viewproj_matrix();
		do {
			this.setGs_shader_get_viewproj_matrix(ModernizedCProgram.os_dlsym(module, "gs_shader_get_viewproj_matrix"));
			if (!generatedGs_shader_get_viewproj_matrix) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_viewproj_matrix", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_world_matrix = this.getGs_shader_get_world_matrix();
		do {
			this.setGs_shader_get_world_matrix(ModernizedCProgram.os_dlsym(module, "gs_shader_get_world_matrix"));
			if (!generatedGs_shader_get_world_matrix) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_world_matrix", module_name);
			} 
		} while (false);
		Object generatedGs_shader_get_param_info = this.getGs_shader_get_param_info();
		do {
			this.setGs_shader_get_param_info(ModernizedCProgram.os_dlsym(module, "gs_shader_get_param_info"));
			if (!generatedGs_shader_get_param_info) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_get_param_info", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_bool = this.getGs_shader_set_bool();
		do {
			this.setGs_shader_set_bool(ModernizedCProgram.os_dlsym(module, "gs_shader_set_bool"));
			if (!generatedGs_shader_set_bool) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_bool", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_float = this.getGs_shader_set_float();
		do {
			this.setGs_shader_set_float(ModernizedCProgram.os_dlsym(module, "gs_shader_set_float"));
			if (!generatedGs_shader_set_float) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_float", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_int = this.getGs_shader_set_int();
		do {
			this.setGs_shader_set_int(ModernizedCProgram.os_dlsym(module, "gs_shader_set_int"));
			if (!generatedGs_shader_set_int) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_int", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_matrix3 = this.getGs_shader_set_matrix3();
		do {
			this.setGs_shader_set_matrix3(ModernizedCProgram.os_dlsym(module, "gs_shader_set_matrix3"));
			if (!generatedGs_shader_set_matrix3) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_matrix3", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_matrix4 = this.getGs_shader_set_matrix4();
		do {
			this.setGs_shader_set_matrix4(ModernizedCProgram.os_dlsym(module, "gs_shader_set_matrix4"));
			if (!generatedGs_shader_set_matrix4) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_matrix4", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_vec2 = this.getGs_shader_set_vec2();
		do {
			this.setGs_shader_set_vec2(ModernizedCProgram.os_dlsym(module, "gs_shader_set_vec2"));
			if (!generatedGs_shader_set_vec2) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_vec2", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_vec3 = this.getGs_shader_set_vec3();
		do {
			this.setGs_shader_set_vec3(ModernizedCProgram.os_dlsym(module, "gs_shader_set_vec3"));
			if (!generatedGs_shader_set_vec3) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_vec3", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_vec4 = this.getGs_shader_set_vec4();
		do {
			this.setGs_shader_set_vec4(ModernizedCProgram.os_dlsym(module, "gs_shader_set_vec4"));
			if (!generatedGs_shader_set_vec4) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_vec4", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_texture = this.getGs_shader_set_texture();
		do {
			this.setGs_shader_set_texture(ModernizedCProgram.os_dlsym(module, "gs_shader_set_texture"));
			if (!generatedGs_shader_set_texture) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_texture", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_val = this.getGs_shader_set_val();
		do {
			this.setGs_shader_set_val(ModernizedCProgram.os_dlsym(module, "gs_shader_set_val"));
			if (!generatedGs_shader_set_val) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_val", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_default = this.getGs_shader_set_default();
		do {
			this.setGs_shader_set_default(ModernizedCProgram.os_dlsym(module, "gs_shader_set_default"));
			if (!generatedGs_shader_set_default) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_default", module_name);
			} 
		} while (false);
		Object generatedGs_shader_set_next_sampler = this.getGs_shader_set_next_sampler();
		do {
			this.setGs_shader_set_next_sampler(ModernizedCProgram.os_dlsym(module, "gs_shader_set_next_sampler"));
			if (!generatedGs_shader_set_next_sampler) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "gs_shader_set_next_sampler", module_name);
			} 
		} while (false);
		do {
			this.setDevice_nv12_available(ModernizedCProgram.os_dlsym(module, "device_nv12_available"));
		} while (false);
		Object generatedDevice_debug_marker_begin = this.getDevice_debug_marker_begin();
		do {
			this.setDevice_debug_marker_begin(ModernizedCProgram.os_dlsym(module, "device_debug_marker_begin"));
			if (!generatedDevice_debug_marker_begin) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_debug_marker_begin", module_name);
			} 
		} while (false);
		Object generatedDevice_debug_marker_end = this.getDevice_debug_marker_end();
		do {
			this.setDevice_debug_marker_end(ModernizedCProgram.os_dlsym(module, "device_debug_marker_end"));
			if (!generatedDevice_debug_marker_end) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_debug_marker_end", module_name);
			} 
		} while (false/* OSX/Cocoa specific functions */);
		Object generatedDevice_gdi_texture_available = this.getDevice_gdi_texture_available();
		do {
			this.setDevice_gdi_texture_available(ModernizedCProgram.os_dlsym(module, "device_gdi_texture_available"));
			if (!generatedDevice_gdi_texture_available) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_gdi_texture_available", module_name);
			} 
		} while (/* win32 specific functions */false);
		Object generatedDevice_shared_texture_available = this.getDevice_shared_texture_available();
		do {
			this.setDevice_shared_texture_available(ModernizedCProgram.os_dlsym(module, "device_shared_texture_available"));
			if (!generatedDevice_shared_texture_available) {
				success = false;
				ModernizedCProgram.blog(LOG_ERROR, "Could not load function '%s' from module '%s'", "device_shared_texture_available", module_name);
			} 
		} while (false);
		do {
			this.setDevice_get_duplicator_monitor_info(ModernizedCProgram.os_dlsym(module, "device_get_duplicator_monitor_info"));
		} while (false);
		do {
			this.setDevice_duplicator_create(ModernizedCProgram.os_dlsym(module, "device_duplicator_create"));
		} while (false);
		do {
			this.setGs_duplicator_destroy(ModernizedCProgram.os_dlsym(module, "gs_duplicator_destroy"));
		} while (false);
		do {
			this.setGs_duplicator_update_frame(ModernizedCProgram.os_dlsym(module, "gs_duplicator_update_frame"));
		} while (false);
		do {
			this.setGs_duplicator_get_texture(ModernizedCProgram.os_dlsym(module, "gs_duplicator_get_texture"));
		} while (false);
		do {
			this.setDevice_texture_create_gdi(ModernizedCProgram.os_dlsym(module, "device_texture_create_gdi"));
		} while (false);
		do {
			this.setGs_texture_get_dc(ModernizedCProgram.os_dlsym(module, "gs_texture_get_dc"));
		} while (false);
		do {
			this.setGs_texture_release_dc(ModernizedCProgram.os_dlsym(module, "gs_texture_release_dc"));
		} while (false);
		do {
			this.setDevice_texture_open_shared(ModernizedCProgram.os_dlsym(module, "device_texture_open_shared"));
		} while (false);
		do {
			this.setDevice_texture_get_shared_handle(ModernizedCProgram.os_dlsym(module, "device_texture_get_shared_handle"));
		} while (false);
		do {
			this.setDevice_texture_acquire_sync(ModernizedCProgram.os_dlsym(module, "device_texture_acquire_sync"));
		} while (false);
		do {
			this.setDevice_texture_release_sync(ModernizedCProgram.os_dlsym(module, "device_texture_release_sync"));
		} while (false);
		do {
			this.setDevice_texture_create_nv12(ModernizedCProgram.os_dlsym(module, "device_texture_create_nv12"));
		} while (false);
		do {
			this.setDevice_stagesurface_create_nv12(ModernizedCProgram.os_dlsym(module, "device_stagesurface_create_nv12"));
		} while (false);
		return success;
	}
	public Object getDevice_get_name() {
		return device_get_name;
	}
	public void setDevice_get_name(Object newDevice_get_name) {
		device_get_name = newDevice_get_name;
	}
	public Object getDevice_get_type() {
		return device_get_type;
	}
	public void setDevice_get_type(Object newDevice_get_type) {
		device_get_type = newDevice_get_type;
	}
	public Object getDevice_enum_adapters() {
		return device_enum_adapters;
	}
	public void setDevice_enum_adapters(Object newDevice_enum_adapters) {
		device_enum_adapters = newDevice_enum_adapters;
	}
	public Object getDevice_preprocessor_name() {
		return device_preprocessor_name;
	}
	public void setDevice_preprocessor_name(Object newDevice_preprocessor_name) {
		device_preprocessor_name = newDevice_preprocessor_name;
	}
	public Object getDevice_create() {
		return device_create;
	}
	public void setDevice_create(Object newDevice_create) {
		device_create = newDevice_create;
	}
	public Object getDevice_destroy() {
		return device_destroy;
	}
	public void setDevice_destroy(Object newDevice_destroy) {
		device_destroy = newDevice_destroy;
	}
	public Object getDevice_enter_context() {
		return device_enter_context;
	}
	public void setDevice_enter_context(Object newDevice_enter_context) {
		device_enter_context = newDevice_enter_context;
	}
	public Object getDevice_leave_context() {
		return device_leave_context;
	}
	public void setDevice_leave_context(Object newDevice_leave_context) {
		device_leave_context = newDevice_leave_context;
	}
	public Object getDevice_get_device_obj() {
		return device_get_device_obj;
	}
	public void setDevice_get_device_obj(Object newDevice_get_device_obj) {
		device_get_device_obj = newDevice_get_device_obj;
	}
	public Object getDevice_swapchain_create() {
		return device_swapchain_create;
	}
	public void setDevice_swapchain_create(Object newDevice_swapchain_create) {
		device_swapchain_create = newDevice_swapchain_create;
	}
	public Object getDevice_resize() {
		return device_resize;
	}
	public void setDevice_resize(Object newDevice_resize) {
		device_resize = newDevice_resize;
	}
	public Object getDevice_get_size() {
		return device_get_size;
	}
	public void setDevice_get_size(Object newDevice_get_size) {
		device_get_size = newDevice_get_size;
	}
	public Object getDevice_get_width() {
		return device_get_width;
	}
	public void setDevice_get_width(Object newDevice_get_width) {
		device_get_width = newDevice_get_width;
	}
	public Object getDevice_get_height() {
		return device_get_height;
	}
	public void setDevice_get_height(Object newDevice_get_height) {
		device_get_height = newDevice_get_height;
	}
	public Object getDevice_texture_create() {
		return device_texture_create;
	}
	public void setDevice_texture_create(Object newDevice_texture_create) {
		device_texture_create = newDevice_texture_create;
	}
	public Object getDevice_cubetexture_create() {
		return device_cubetexture_create;
	}
	public void setDevice_cubetexture_create(Object newDevice_cubetexture_create) {
		device_cubetexture_create = newDevice_cubetexture_create;
	}
	public Object getDevice_voltexture_create() {
		return device_voltexture_create;
	}
	public void setDevice_voltexture_create(Object newDevice_voltexture_create) {
		device_voltexture_create = newDevice_voltexture_create;
	}
	public Object getDevice_zstencil_create() {
		return device_zstencil_create;
	}
	public void setDevice_zstencil_create(Object newDevice_zstencil_create) {
		device_zstencil_create = newDevice_zstencil_create;
	}
	public Object getDevice_stagesurface_create() {
		return device_stagesurface_create;
	}
	public void setDevice_stagesurface_create(Object newDevice_stagesurface_create) {
		device_stagesurface_create = newDevice_stagesurface_create;
	}
	public Object getDevice_samplerstate_create() {
		return device_samplerstate_create;
	}
	public void setDevice_samplerstate_create(Object newDevice_samplerstate_create) {
		device_samplerstate_create = newDevice_samplerstate_create;
	}
	public Object getDevice_vertexshader_create() {
		return device_vertexshader_create;
	}
	public void setDevice_vertexshader_create(Object newDevice_vertexshader_create) {
		device_vertexshader_create = newDevice_vertexshader_create;
	}
	public Object getDevice_pixelshader_create() {
		return device_pixelshader_create;
	}
	public void setDevice_pixelshader_create(Object newDevice_pixelshader_create) {
		device_pixelshader_create = newDevice_pixelshader_create;
	}
	public Object getDevice_vertexbuffer_create() {
		return device_vertexbuffer_create;
	}
	public void setDevice_vertexbuffer_create(Object newDevice_vertexbuffer_create) {
		device_vertexbuffer_create = newDevice_vertexbuffer_create;
	}
	public Object getDevice_indexbuffer_create() {
		return device_indexbuffer_create;
	}
	public void setDevice_indexbuffer_create(Object newDevice_indexbuffer_create) {
		device_indexbuffer_create = newDevice_indexbuffer_create;
	}
	public Object getDevice_timer_create() {
		return device_timer_create;
	}
	public void setDevice_timer_create(Object newDevice_timer_create) {
		device_timer_create = newDevice_timer_create;
	}
	public Object getDevice_timer_range_create() {
		return device_timer_range_create;
	}
	public void setDevice_timer_range_create(Object newDevice_timer_range_create) {
		device_timer_range_create = newDevice_timer_range_create;
	}
	public Object getDevice_get_texture_type() {
		return device_get_texture_type;
	}
	public void setDevice_get_texture_type(Object newDevice_get_texture_type) {
		device_get_texture_type = newDevice_get_texture_type;
	}
	public Object getDevice_load_vertexbuffer() {
		return device_load_vertexbuffer;
	}
	public void setDevice_load_vertexbuffer(Object newDevice_load_vertexbuffer) {
		device_load_vertexbuffer = newDevice_load_vertexbuffer;
	}
	public Object getDevice_load_indexbuffer() {
		return device_load_indexbuffer;
	}
	public void setDevice_load_indexbuffer(Object newDevice_load_indexbuffer) {
		device_load_indexbuffer = newDevice_load_indexbuffer;
	}
	public Object getDevice_load_texture() {
		return device_load_texture;
	}
	public void setDevice_load_texture(Object newDevice_load_texture) {
		device_load_texture = newDevice_load_texture;
	}
	public Object getDevice_load_samplerstate() {
		return device_load_samplerstate;
	}
	public void setDevice_load_samplerstate(Object newDevice_load_samplerstate) {
		device_load_samplerstate = newDevice_load_samplerstate;
	}
	public Object getDevice_load_vertexshader() {
		return device_load_vertexshader;
	}
	public void setDevice_load_vertexshader(Object newDevice_load_vertexshader) {
		device_load_vertexshader = newDevice_load_vertexshader;
	}
	public Object getDevice_load_pixelshader() {
		return device_load_pixelshader;
	}
	public void setDevice_load_pixelshader(Object newDevice_load_pixelshader) {
		device_load_pixelshader = newDevice_load_pixelshader;
	}
	public Object getDevice_load_default_samplerstate() {
		return device_load_default_samplerstate;
	}
	public void setDevice_load_default_samplerstate(Object newDevice_load_default_samplerstate) {
		device_load_default_samplerstate = newDevice_load_default_samplerstate;
	}
	public Object getDevice_get_vertex_shader() {
		return device_get_vertex_shader;
	}
	public void setDevice_get_vertex_shader(Object newDevice_get_vertex_shader) {
		device_get_vertex_shader = newDevice_get_vertex_shader;
	}
	public Object getDevice_get_pixel_shader() {
		return device_get_pixel_shader;
	}
	public void setDevice_get_pixel_shader(Object newDevice_get_pixel_shader) {
		device_get_pixel_shader = newDevice_get_pixel_shader;
	}
	public Object getDevice_get_render_target() {
		return device_get_render_target;
	}
	public void setDevice_get_render_target(Object newDevice_get_render_target) {
		device_get_render_target = newDevice_get_render_target;
	}
	public Object getDevice_get_zstencil_target() {
		return device_get_zstencil_target;
	}
	public void setDevice_get_zstencil_target(Object newDevice_get_zstencil_target) {
		device_get_zstencil_target = newDevice_get_zstencil_target;
	}
	public Object getDevice_set_render_target() {
		return device_set_render_target;
	}
	public void setDevice_set_render_target(Object newDevice_set_render_target) {
		device_set_render_target = newDevice_set_render_target;
	}
	public Object getDevice_set_cube_render_target() {
		return device_set_cube_render_target;
	}
	public void setDevice_set_cube_render_target(Object newDevice_set_cube_render_target) {
		device_set_cube_render_target = newDevice_set_cube_render_target;
	}
	public Object getDevice_copy_texture() {
		return device_copy_texture;
	}
	public void setDevice_copy_texture(Object newDevice_copy_texture) {
		device_copy_texture = newDevice_copy_texture;
	}
	public Object getDevice_copy_texture_region() {
		return device_copy_texture_region;
	}
	public void setDevice_copy_texture_region(Object newDevice_copy_texture_region) {
		device_copy_texture_region = newDevice_copy_texture_region;
	}
	public Object getDevice_stage_texture() {
		return device_stage_texture;
	}
	public void setDevice_stage_texture(Object newDevice_stage_texture) {
		device_stage_texture = newDevice_stage_texture;
	}
	public Object getDevice_begin_frame() {
		return device_begin_frame;
	}
	public void setDevice_begin_frame(Object newDevice_begin_frame) {
		device_begin_frame = newDevice_begin_frame;
	}
	public Object getDevice_begin_scene() {
		return device_begin_scene;
	}
	public void setDevice_begin_scene(Object newDevice_begin_scene) {
		device_begin_scene = newDevice_begin_scene;
	}
	public Object getDevice_draw() {
		return device_draw;
	}
	public void setDevice_draw(Object newDevice_draw) {
		device_draw = newDevice_draw;
	}
	public Object getDevice_end_scene() {
		return device_end_scene;
	}
	public void setDevice_end_scene(Object newDevice_end_scene) {
		device_end_scene = newDevice_end_scene;
	}
	public Object getDevice_load_swapchain() {
		return device_load_swapchain;
	}
	public void setDevice_load_swapchain(Object newDevice_load_swapchain) {
		device_load_swapchain = newDevice_load_swapchain;
	}
	public Object getDevice_clear() {
		return device_clear;
	}
	public void setDevice_clear(Object newDevice_clear) {
		device_clear = newDevice_clear;
	}
	public Object getDevice_present() {
		return device_present;
	}
	public void setDevice_present(Object newDevice_present) {
		device_present = newDevice_present;
	}
	public Object getDevice_flush() {
		return device_flush;
	}
	public void setDevice_flush(Object newDevice_flush) {
		device_flush = newDevice_flush;
	}
	public Object getDevice_set_cull_mode() {
		return device_set_cull_mode;
	}
	public void setDevice_set_cull_mode(Object newDevice_set_cull_mode) {
		device_set_cull_mode = newDevice_set_cull_mode;
	}
	public Object getDevice_get_cull_mode() {
		return device_get_cull_mode;
	}
	public void setDevice_get_cull_mode(Object newDevice_get_cull_mode) {
		device_get_cull_mode = newDevice_get_cull_mode;
	}
	public Object getDevice_enable_blending() {
		return device_enable_blending;
	}
	public void setDevice_enable_blending(Object newDevice_enable_blending) {
		device_enable_blending = newDevice_enable_blending;
	}
	public Object getDevice_enable_depth_test() {
		return device_enable_depth_test;
	}
	public void setDevice_enable_depth_test(Object newDevice_enable_depth_test) {
		device_enable_depth_test = newDevice_enable_depth_test;
	}
	public Object getDevice_enable_stencil_test() {
		return device_enable_stencil_test;
	}
	public void setDevice_enable_stencil_test(Object newDevice_enable_stencil_test) {
		device_enable_stencil_test = newDevice_enable_stencil_test;
	}
	public Object getDevice_enable_stencil_write() {
		return device_enable_stencil_write;
	}
	public void setDevice_enable_stencil_write(Object newDevice_enable_stencil_write) {
		device_enable_stencil_write = newDevice_enable_stencil_write;
	}
	public Object getDevice_enable_color() {
		return device_enable_color;
	}
	public void setDevice_enable_color(Object newDevice_enable_color) {
		device_enable_color = newDevice_enable_color;
	}
	public Object getDevice_blend_function() {
		return device_blend_function;
	}
	public void setDevice_blend_function(Object newDevice_blend_function) {
		device_blend_function = newDevice_blend_function;
	}
	public Object getDevice_blend_function_separate() {
		return device_blend_function_separate;
	}
	public void setDevice_blend_function_separate(Object newDevice_blend_function_separate) {
		device_blend_function_separate = newDevice_blend_function_separate;
	}
	public Object getDevice_depth_function() {
		return device_depth_function;
	}
	public void setDevice_depth_function(Object newDevice_depth_function) {
		device_depth_function = newDevice_depth_function;
	}
	public Object getDevice_stencil_function() {
		return device_stencil_function;
	}
	public void setDevice_stencil_function(Object newDevice_stencil_function) {
		device_stencil_function = newDevice_stencil_function;
	}
	public Object getDevice_stencil_op() {
		return device_stencil_op;
	}
	public void setDevice_stencil_op(Object newDevice_stencil_op) {
		device_stencil_op = newDevice_stencil_op;
	}
	public Object getDevice_set_viewport() {
		return device_set_viewport;
	}
	public void setDevice_set_viewport(Object newDevice_set_viewport) {
		device_set_viewport = newDevice_set_viewport;
	}
	public Object getDevice_get_viewport() {
		return device_get_viewport;
	}
	public void setDevice_get_viewport(Object newDevice_get_viewport) {
		device_get_viewport = newDevice_get_viewport;
	}
	public Object getDevice_set_scissor_rect() {
		return device_set_scissor_rect;
	}
	public void setDevice_set_scissor_rect(Object newDevice_set_scissor_rect) {
		device_set_scissor_rect = newDevice_set_scissor_rect;
	}
	public Object getDevice_ortho() {
		return device_ortho;
	}
	public void setDevice_ortho(Object newDevice_ortho) {
		device_ortho = newDevice_ortho;
	}
	public Object getDevice_frustum() {
		return device_frustum;
	}
	public void setDevice_frustum(Object newDevice_frustum) {
		device_frustum = newDevice_frustum;
	}
	public Object getDevice_projection_push() {
		return device_projection_push;
	}
	public void setDevice_projection_push(Object newDevice_projection_push) {
		device_projection_push = newDevice_projection_push;
	}
	public Object getDevice_projection_pop() {
		return device_projection_pop;
	}
	public void setDevice_projection_pop(Object newDevice_projection_pop) {
		device_projection_pop = newDevice_projection_pop;
	}
	public Object getGs_swapchain_destroy() {
		return gs_swapchain_destroy;
	}
	public void setGs_swapchain_destroy(Object newGs_swapchain_destroy) {
		gs_swapchain_destroy = newGs_swapchain_destroy;
	}
	public Object getGs_texture_destroy() {
		return gs_texture_destroy;
	}
	public void setGs_texture_destroy(Object newGs_texture_destroy) {
		gs_texture_destroy = newGs_texture_destroy;
	}
	public Object getGs_texture_get_width() {
		return gs_texture_get_width;
	}
	public void setGs_texture_get_width(Object newGs_texture_get_width) {
		gs_texture_get_width = newGs_texture_get_width;
	}
	public Object getGs_texture_get_height() {
		return gs_texture_get_height;
	}
	public void setGs_texture_get_height(Object newGs_texture_get_height) {
		gs_texture_get_height = newGs_texture_get_height;
	}
	public Object getGs_texture_get_color_format() {
		return gs_texture_get_color_format;
	}
	public void setGs_texture_get_color_format(Object newGs_texture_get_color_format) {
		gs_texture_get_color_format = newGs_texture_get_color_format;
	}
	public Object getGs_texture_map() {
		return gs_texture_map;
	}
	public void setGs_texture_map(Object newGs_texture_map) {
		gs_texture_map = newGs_texture_map;
	}
	public Object getGs_texture_unmap() {
		return gs_texture_unmap;
	}
	public void setGs_texture_unmap(Object newGs_texture_unmap) {
		gs_texture_unmap = newGs_texture_unmap;
	}
	public Object getGs_texture_is_rect() {
		return gs_texture_is_rect;
	}
	public void setGs_texture_is_rect(Object newGs_texture_is_rect) {
		gs_texture_is_rect = newGs_texture_is_rect;
	}
	public Object getGs_texture_get_obj() {
		return gs_texture_get_obj;
	}
	public void setGs_texture_get_obj(Object newGs_texture_get_obj) {
		gs_texture_get_obj = newGs_texture_get_obj;
	}
	public Object getGs_cubetexture_destroy() {
		return gs_cubetexture_destroy;
	}
	public void setGs_cubetexture_destroy(Object newGs_cubetexture_destroy) {
		gs_cubetexture_destroy = newGs_cubetexture_destroy;
	}
	public Object getGs_cubetexture_get_size() {
		return gs_cubetexture_get_size;
	}
	public void setGs_cubetexture_get_size(Object newGs_cubetexture_get_size) {
		gs_cubetexture_get_size = newGs_cubetexture_get_size;
	}
	public Object getGs_cubetexture_get_color_format() {
		return gs_cubetexture_get_color_format;
	}
	public void setGs_cubetexture_get_color_format(Object newGs_cubetexture_get_color_format) {
		gs_cubetexture_get_color_format = newGs_cubetexture_get_color_format;
	}
	public Object getGs_voltexture_destroy() {
		return gs_voltexture_destroy;
	}
	public void setGs_voltexture_destroy(Object newGs_voltexture_destroy) {
		gs_voltexture_destroy = newGs_voltexture_destroy;
	}
	public Object getGs_voltexture_get_width() {
		return gs_voltexture_get_width;
	}
	public void setGs_voltexture_get_width(Object newGs_voltexture_get_width) {
		gs_voltexture_get_width = newGs_voltexture_get_width;
	}
	public Object getGs_voltexture_get_height() {
		return gs_voltexture_get_height;
	}
	public void setGs_voltexture_get_height(Object newGs_voltexture_get_height) {
		gs_voltexture_get_height = newGs_voltexture_get_height;
	}
	public Object getGs_voltexture_get_depth() {
		return gs_voltexture_get_depth;
	}
	public void setGs_voltexture_get_depth(Object newGs_voltexture_get_depth) {
		gs_voltexture_get_depth = newGs_voltexture_get_depth;
	}
	public Object getGs_voltexture_get_color_format() {
		return gs_voltexture_get_color_format;
	}
	public void setGs_voltexture_get_color_format(Object newGs_voltexture_get_color_format) {
		gs_voltexture_get_color_format = newGs_voltexture_get_color_format;
	}
	public Object getGs_stagesurface_destroy() {
		return gs_stagesurface_destroy;
	}
	public void setGs_stagesurface_destroy(Object newGs_stagesurface_destroy) {
		gs_stagesurface_destroy = newGs_stagesurface_destroy;
	}
	public Object getGs_stagesurface_get_width() {
		return gs_stagesurface_get_width;
	}
	public void setGs_stagesurface_get_width(Object newGs_stagesurface_get_width) {
		gs_stagesurface_get_width = newGs_stagesurface_get_width;
	}
	public Object getGs_stagesurface_get_height() {
		return gs_stagesurface_get_height;
	}
	public void setGs_stagesurface_get_height(Object newGs_stagesurface_get_height) {
		gs_stagesurface_get_height = newGs_stagesurface_get_height;
	}
	public Object getGs_stagesurface_get_color_format() {
		return gs_stagesurface_get_color_format;
	}
	public void setGs_stagesurface_get_color_format(Object newGs_stagesurface_get_color_format) {
		gs_stagesurface_get_color_format = newGs_stagesurface_get_color_format;
	}
	public Object getGs_stagesurface_map() {
		return gs_stagesurface_map;
	}
	public void setGs_stagesurface_map(Object newGs_stagesurface_map) {
		gs_stagesurface_map = newGs_stagesurface_map;
	}
	public Object getGs_stagesurface_unmap() {
		return gs_stagesurface_unmap;
	}
	public void setGs_stagesurface_unmap(Object newGs_stagesurface_unmap) {
		gs_stagesurface_unmap = newGs_stagesurface_unmap;
	}
	public Object getGs_zstencil_destroy() {
		return gs_zstencil_destroy;
	}
	public void setGs_zstencil_destroy(Object newGs_zstencil_destroy) {
		gs_zstencil_destroy = newGs_zstencil_destroy;
	}
	public Object getGs_samplerstate_destroy() {
		return gs_samplerstate_destroy;
	}
	public void setGs_samplerstate_destroy(Object newGs_samplerstate_destroy) {
		gs_samplerstate_destroy = newGs_samplerstate_destroy;
	}
	public Object getGs_vertexbuffer_destroy() {
		return gs_vertexbuffer_destroy;
	}
	public void setGs_vertexbuffer_destroy(Object newGs_vertexbuffer_destroy) {
		gs_vertexbuffer_destroy = newGs_vertexbuffer_destroy;
	}
	public Object getGs_vertexbuffer_flush() {
		return gs_vertexbuffer_flush;
	}
	public void setGs_vertexbuffer_flush(Object newGs_vertexbuffer_flush) {
		gs_vertexbuffer_flush = newGs_vertexbuffer_flush;
	}
	public Object getGs_vertexbuffer_flush_direct() {
		return gs_vertexbuffer_flush_direct;
	}
	public void setGs_vertexbuffer_flush_direct(Object newGs_vertexbuffer_flush_direct) {
		gs_vertexbuffer_flush_direct = newGs_vertexbuffer_flush_direct;
	}
	public Object getGs_vertexbuffer_get_data() {
		return gs_vertexbuffer_get_data;
	}
	public void setGs_vertexbuffer_get_data(Object newGs_vertexbuffer_get_data) {
		gs_vertexbuffer_get_data = newGs_vertexbuffer_get_data;
	}
	public Object getGs_indexbuffer_destroy() {
		return gs_indexbuffer_destroy;
	}
	public void setGs_indexbuffer_destroy(Object newGs_indexbuffer_destroy) {
		gs_indexbuffer_destroy = newGs_indexbuffer_destroy;
	}
	public Object getGs_indexbuffer_flush() {
		return gs_indexbuffer_flush;
	}
	public void setGs_indexbuffer_flush(Object newGs_indexbuffer_flush) {
		gs_indexbuffer_flush = newGs_indexbuffer_flush;
	}
	public Object getGs_indexbuffer_flush_direct() {
		return gs_indexbuffer_flush_direct;
	}
	public void setGs_indexbuffer_flush_direct(Object newGs_indexbuffer_flush_direct) {
		gs_indexbuffer_flush_direct = newGs_indexbuffer_flush_direct;
	}
	public Object getGs_indexbuffer_get_data() {
		return gs_indexbuffer_get_data;
	}
	public void setGs_indexbuffer_get_data(Object newGs_indexbuffer_get_data) {
		gs_indexbuffer_get_data = newGs_indexbuffer_get_data;
	}
	public Object getGs_indexbuffer_get_num_indices() {
		return gs_indexbuffer_get_num_indices;
	}
	public void setGs_indexbuffer_get_num_indices(Object newGs_indexbuffer_get_num_indices) {
		gs_indexbuffer_get_num_indices = newGs_indexbuffer_get_num_indices;
	}
	public Object getGs_indexbuffer_get_type() {
		return gs_indexbuffer_get_type;
	}
	public void setGs_indexbuffer_get_type(Object newGs_indexbuffer_get_type) {
		gs_indexbuffer_get_type = newGs_indexbuffer_get_type;
	}
	public Object getGs_timer_destroy() {
		return gs_timer_destroy;
	}
	public void setGs_timer_destroy(Object newGs_timer_destroy) {
		gs_timer_destroy = newGs_timer_destroy;
	}
	public Object getGs_timer_begin() {
		return gs_timer_begin;
	}
	public void setGs_timer_begin(Object newGs_timer_begin) {
		gs_timer_begin = newGs_timer_begin;
	}
	public Object getGs_timer_end() {
		return gs_timer_end;
	}
	public void setGs_timer_end(Object newGs_timer_end) {
		gs_timer_end = newGs_timer_end;
	}
	public Object getGs_timer_get_data() {
		return gs_timer_get_data;
	}
	public void setGs_timer_get_data(Object newGs_timer_get_data) {
		gs_timer_get_data = newGs_timer_get_data;
	}
	public Object getGs_timer_range_destroy() {
		return gs_timer_range_destroy;
	}
	public void setGs_timer_range_destroy(Object newGs_timer_range_destroy) {
		gs_timer_range_destroy = newGs_timer_range_destroy;
	}
	public Object getGs_timer_range_begin() {
		return gs_timer_range_begin;
	}
	public void setGs_timer_range_begin(Object newGs_timer_range_begin) {
		gs_timer_range_begin = newGs_timer_range_begin;
	}
	public Object getGs_timer_range_end() {
		return gs_timer_range_end;
	}
	public void setGs_timer_range_end(Object newGs_timer_range_end) {
		gs_timer_range_end = newGs_timer_range_end;
	}
	public Object getGs_timer_range_get_data() {
		return gs_timer_range_get_data;
	}
	public void setGs_timer_range_get_data(Object newGs_timer_range_get_data) {
		gs_timer_range_get_data = newGs_timer_range_get_data;
	}
	public Object getGs_shader_destroy() {
		return gs_shader_destroy;
	}
	public void setGs_shader_destroy(Object newGs_shader_destroy) {
		gs_shader_destroy = newGs_shader_destroy;
	}
	public Object getGs_shader_get_num_params() {
		return gs_shader_get_num_params;
	}
	public void setGs_shader_get_num_params(Object newGs_shader_get_num_params) {
		gs_shader_get_num_params = newGs_shader_get_num_params;
	}
	public Object getGs_shader_get_param_by_idx() {
		return gs_shader_get_param_by_idx;
	}
	public void setGs_shader_get_param_by_idx(Object newGs_shader_get_param_by_idx) {
		gs_shader_get_param_by_idx = newGs_shader_get_param_by_idx;
	}
	public Object getGs_shader_get_param_by_name() {
		return gs_shader_get_param_by_name;
	}
	public void setGs_shader_get_param_by_name(Object newGs_shader_get_param_by_name) {
		gs_shader_get_param_by_name = newGs_shader_get_param_by_name;
	}
	public Object getGs_shader_get_viewproj_matrix() {
		return gs_shader_get_viewproj_matrix;
	}
	public void setGs_shader_get_viewproj_matrix(Object newGs_shader_get_viewproj_matrix) {
		gs_shader_get_viewproj_matrix = newGs_shader_get_viewproj_matrix;
	}
	public Object getGs_shader_get_world_matrix() {
		return gs_shader_get_world_matrix;
	}
	public void setGs_shader_get_world_matrix(Object newGs_shader_get_world_matrix) {
		gs_shader_get_world_matrix = newGs_shader_get_world_matrix;
	}
	public Object getGs_shader_get_param_info() {
		return gs_shader_get_param_info;
	}
	public void setGs_shader_get_param_info(Object newGs_shader_get_param_info) {
		gs_shader_get_param_info = newGs_shader_get_param_info;
	}
	public Object getGs_shader_set_bool() {
		return gs_shader_set_bool;
	}
	public void setGs_shader_set_bool(Object newGs_shader_set_bool) {
		gs_shader_set_bool = newGs_shader_set_bool;
	}
	public Object getGs_shader_set_float() {
		return gs_shader_set_float;
	}
	public void setGs_shader_set_float(Object newGs_shader_set_float) {
		gs_shader_set_float = newGs_shader_set_float;
	}
	public Object getGs_shader_set_int() {
		return gs_shader_set_int;
	}
	public void setGs_shader_set_int(Object newGs_shader_set_int) {
		gs_shader_set_int = newGs_shader_set_int;
	}
	public Object getGs_shader_set_matrix3() {
		return gs_shader_set_matrix3;
	}
	public void setGs_shader_set_matrix3(Object newGs_shader_set_matrix3) {
		gs_shader_set_matrix3 = newGs_shader_set_matrix3;
	}
	public Object getGs_shader_set_matrix4() {
		return gs_shader_set_matrix4;
	}
	public void setGs_shader_set_matrix4(Object newGs_shader_set_matrix4) {
		gs_shader_set_matrix4 = newGs_shader_set_matrix4;
	}
	public Object getGs_shader_set_vec2() {
		return gs_shader_set_vec2;
	}
	public void setGs_shader_set_vec2(Object newGs_shader_set_vec2) {
		gs_shader_set_vec2 = newGs_shader_set_vec2;
	}
	public Object getGs_shader_set_vec3() {
		return gs_shader_set_vec3;
	}
	public void setGs_shader_set_vec3(Object newGs_shader_set_vec3) {
		gs_shader_set_vec3 = newGs_shader_set_vec3;
	}
	public Object getGs_shader_set_vec4() {
		return gs_shader_set_vec4;
	}
	public void setGs_shader_set_vec4(Object newGs_shader_set_vec4) {
		gs_shader_set_vec4 = newGs_shader_set_vec4;
	}
	public Object getGs_shader_set_texture() {
		return gs_shader_set_texture;
	}
	public void setGs_shader_set_texture(Object newGs_shader_set_texture) {
		gs_shader_set_texture = newGs_shader_set_texture;
	}
	public Object getGs_shader_set_val() {
		return gs_shader_set_val;
	}
	public void setGs_shader_set_val(Object newGs_shader_set_val) {
		gs_shader_set_val = newGs_shader_set_val;
	}
	public Object getGs_shader_set_default() {
		return gs_shader_set_default;
	}
	public void setGs_shader_set_default(Object newGs_shader_set_default) {
		gs_shader_set_default = newGs_shader_set_default;
	}
	public Object getGs_shader_set_next_sampler() {
		return gs_shader_set_next_sampler;
	}
	public void setGs_shader_set_next_sampler(Object newGs_shader_set_next_sampler) {
		gs_shader_set_next_sampler = newGs_shader_set_next_sampler;
	}
	public Object getDevice_nv12_available() {
		return device_nv12_available;
	}
	public void setDevice_nv12_available(Object newDevice_nv12_available) {
		device_nv12_available = newDevice_nv12_available;
	}
	public Object getDevice_debug_marker_begin() {
		return device_debug_marker_begin;
	}
	public void setDevice_debug_marker_begin(Object newDevice_debug_marker_begin) {
		device_debug_marker_begin = newDevice_debug_marker_begin;
	}
	public Object getDevice_debug_marker_end() {
		return device_debug_marker_end;
	}
	public void setDevice_debug_marker_end(Object newDevice_debug_marker_end) {
		device_debug_marker_end = newDevice_debug_marker_end;
	}
	public Object getDevice_gdi_texture_available() {
		return device_gdi_texture_available;
	}
	public void setDevice_gdi_texture_available(Object newDevice_gdi_texture_available) {
		device_gdi_texture_available = newDevice_gdi_texture_available;
	}
	public Object getDevice_shared_texture_available() {
		return device_shared_texture_available;
	}
	public void setDevice_shared_texture_available(Object newDevice_shared_texture_available) {
		device_shared_texture_available = newDevice_shared_texture_available;
	}
	public Object getDevice_get_duplicator_monitor_info() {
		return device_get_duplicator_monitor_info;
	}
	public void setDevice_get_duplicator_monitor_info(Object newDevice_get_duplicator_monitor_info) {
		device_get_duplicator_monitor_info = newDevice_get_duplicator_monitor_info;
	}
	public Object getDevice_duplicator_create() {
		return device_duplicator_create;
	}
	public void setDevice_duplicator_create(Object newDevice_duplicator_create) {
		device_duplicator_create = newDevice_duplicator_create;
	}
	public Object getGs_duplicator_destroy() {
		return gs_duplicator_destroy;
	}
	public void setGs_duplicator_destroy(Object newGs_duplicator_destroy) {
		gs_duplicator_destroy = newGs_duplicator_destroy;
	}
	public Object getGs_duplicator_update_frame() {
		return gs_duplicator_update_frame;
	}
	public void setGs_duplicator_update_frame(Object newGs_duplicator_update_frame) {
		gs_duplicator_update_frame = newGs_duplicator_update_frame;
	}
	public Object getGs_duplicator_get_texture() {
		return gs_duplicator_get_texture;
	}
	public void setGs_duplicator_get_texture(Object newGs_duplicator_get_texture) {
		gs_duplicator_get_texture = newGs_duplicator_get_texture;
	}
	public Object getDevice_texture_create_gdi() {
		return device_texture_create_gdi;
	}
	public void setDevice_texture_create_gdi(Object newDevice_texture_create_gdi) {
		device_texture_create_gdi = newDevice_texture_create_gdi;
	}
	public Object getGs_texture_get_dc() {
		return gs_texture_get_dc;
	}
	public void setGs_texture_get_dc(Object newGs_texture_get_dc) {
		gs_texture_get_dc = newGs_texture_get_dc;
	}
	public Object getGs_texture_release_dc() {
		return gs_texture_release_dc;
	}
	public void setGs_texture_release_dc(Object newGs_texture_release_dc) {
		gs_texture_release_dc = newGs_texture_release_dc;
	}
	public Object getDevice_texture_open_shared() {
		return device_texture_open_shared;
	}
	public void setDevice_texture_open_shared(Object newDevice_texture_open_shared) {
		device_texture_open_shared = newDevice_texture_open_shared;
	}
	public Object getDevice_texture_get_shared_handle() {
		return device_texture_get_shared_handle;
	}
	public void setDevice_texture_get_shared_handle(Object newDevice_texture_get_shared_handle) {
		device_texture_get_shared_handle = newDevice_texture_get_shared_handle;
	}
	public Object getDevice_texture_acquire_sync() {
		return device_texture_acquire_sync;
	}
	public void setDevice_texture_acquire_sync(Object newDevice_texture_acquire_sync) {
		device_texture_acquire_sync = newDevice_texture_acquire_sync;
	}
	public Object getDevice_texture_release_sync() {
		return device_texture_release_sync;
	}
	public void setDevice_texture_release_sync(Object newDevice_texture_release_sync) {
		device_texture_release_sync = newDevice_texture_release_sync;
	}
	public Object getDevice_texture_create_nv12() {
		return device_texture_create_nv12;
	}
	public void setDevice_texture_create_nv12(Object newDevice_texture_create_nv12) {
		device_texture_create_nv12 = newDevice_texture_create_nv12;
	}
	public Object getDevice_stagesurface_create_nv12() {
		return device_stagesurface_create_nv12;
	}
	public void setDevice_stagesurface_create_nv12(Object newDevice_stagesurface_create_nv12) {
		device_stagesurface_create_nv12 = newDevice_stagesurface_create_nv12;
	}
}
