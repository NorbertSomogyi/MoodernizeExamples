package application;

/* ------------------------------------------------------------------------- */
public class gs_effect {
	private Object processing;
	private Object cached;
	private Byte effect_path;
	private Byte effect_dir;
	private Object ;
	private Object ;
	private gs_effect_technique cur_technique;
	private gs_effect_pass cur_pass;
	private gs_effect_param view_proj;
	private gs_effect_param world;
	private gs_effect_param scale;
	private graphics_subsystem graphics;
	private gs_effect next;
	private Object loop_pass;
	private Object looping;
	
	public gs_effect(Object processing, Object cached, Byte effect_path, Byte effect_dir, Object,  Object,  gs_effect_technique cur_technique, gs_effect_pass cur_pass, gs_effect_param view_proj, gs_effect_param world, gs_effect_param scale, graphics_subsystem graphics, gs_effect next, Object loop_pass, Object looping) {
		setProcessing(processing);
		setCached(cached);
		setEffect_path(effect_path);
		setEffect_dir(effect_dir);
		set();
		set();
		setCur_technique(cur_technique);
		setCur_pass(cur_pass);
		setView_proj(view_proj);
		setWorld(world);
		setScale(scale);
		setGraphics(graphics);
		setNext(next);
		setLoop_pass(loop_pass);
		setLooping(looping);
	}
	public gs_effect() {
	}
	
	public gs_effect gs_get_effect() {
		if (!ModernizedCProgram.gs_valid("gs_get_effect")) {
			return ((Object)0);
		} 
		return thread_graphics ? thread_graphics.getCur_effect() : ((Object)0);
	}
	public gs_effect find_cached_effect(Object filename) {
		gs_effect effect = thread_graphics.getFirst_effect();
		Byte generatedEffect_path = effect.getEffect_path();
		gs_effect generatedNext = effect.getNext();
		while (effect) {
			if (/*Error: Function owner not recognized*/strcmp(generatedEffect_path, filename) == 0) {
				break;
			} 
			effect = generatedNext;
		}
		return effect;
	}
	public gs_effect gs_effect_create_from_file(Object file, Byte error_string) {
		byte file_string;
		gs_effect_t effect = ((Object)0);
		if (!(ModernizedCProgram.gs_valid("gs_effect_create_from_file") && ModernizedCProgram.gs_obj_valid(file, "gs_effect_create_from_file", "file"))) {
			return ((Object)0);
		} 
		gs_effect gs_effect = new gs_effect();
		effect = gs_effect.find_cached_effect(file);
		if (effect) {
			return effect;
		} 
		file_string = ModernizedCProgram.os_quick_read_utf8_file(file);
		if (!file_string) {
			ModernizedCProgram.blog(LOG_ERROR, "Could not load effect file '%s'", file);
			return ((Object)0);
		} 
		gs_effect gs_effect = new gs_effect();
		effect = gs_effect.gs_effect_create(file_string, file, error_string);
		ModernizedCProgram.bfree(file_string);
		return effect;
	}
	public gs_effect gs_effect_create(Object effect_string, Object filename, Byte error_string) {
		if (!(ModernizedCProgram.gs_valid("gs_effect_create") && ModernizedCProgram.gs_obj_valid(effect_string, "gs_effect_create", "effect_string"))) {
			return ((Object)0);
		} 
		gs_effect effect = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		effect_parser parser = new effect_parser();
		 success = new ();
		effect.setGraphics(thread_graphics);
		effect.setEffect_path(ModernizedCProgram.bstrdup(filename));
		parser.ep_init();
		success = ModernizedCProgram.ep_parse(parser, effect, effect_string, filename);
		cf_parser generatedCfp = parser.getCfp();
		Object generatedCf_parser = generatedCfp.getCf_parser();
		if (!success) {
			if (error_string) {
				error_string = generatedCf_parser.error_data_buildstring();
			} 
			effect.gs_effect_destroy();
			effect = ((Object)0);
		} 
		Byte generatedEffect_path = effect.getEffect_path();
		if (effect) {
			ModernizedCProgram.pthread_mutex_lock(thread_graphics.getEffect_mutex());
			if (generatedEffect_path) {
				effect.setCached(true);
				effect.setNext(thread_graphics.getFirst_effect());
				thread_graphics.setFirst_effect(effect);
			} 
			ModernizedCProgram.pthread_mutex_unlock(thread_graphics.getEffect_mutex());
		} 
		parser.ep_free();
		return effect;
	}
	public void effect_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(effect, 0, /*Error: Unsupported expression*/);
	}
	public void effect_free() {
		 i = new ();
		Object generatedParams = this.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			generatedParams.getArray() + i.effect_param_free();
		}
		Object generatedTechniques = this.getTechniques();
		for (i = 0; i < generatedTechniques.getNum(); i++) {
			generatedTechniques.getArray() + i.effect_technique_free();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedParams);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedTechniques);
		Byte generatedEffect_path = this.getEffect_path();
		ModernizedCProgram.bfree(generatedEffect_path);
		Byte generatedEffect_dir = this.getEffect_dir();
		ModernizedCProgram.bfree(generatedEffect_dir);
		this.setEffect_path(NULL);
		this.setEffect_dir(NULL);
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
	public void gs_effect_actually_destroy() {
		effect.effect_free();
		ModernizedCProgram.bfree(effect);
	}
	public void gs_effect_destroy() {
		Object generatedCached = this.getCached();
		if (effect) {
			if (!generatedCached) {
				effect.gs_effect_actually_destroy();
			} 
		} 
	}
	public Object gs_effect_loop(Object name) {
		if (!effect) {
			return false;
		} 
		Object generatedLooping = this.getLooping();
		gs_effect gs_effect = new gs_effect();
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		gs_effect_technique generatedCur_technique = this.getCur_technique();
		if (!generatedLooping) {
			gs_technique_t tech = new gs_technique_t();
			if (!!gs_effect.gs_get_effect()) {
				ModernizedCProgram.blog(LOG_WARNING, "gs_effect_loop: An effect is already active");
				return false;
			} 
			tech = gs_effect_technique.gs_effect_get_technique(effect, name);
			if (!tech) {
				ModernizedCProgram.blog(LOG_WARNING, "gs_effect_loop: Technique '%s' not found.", name);
				return false;
			} 
			tech.gs_technique_begin();
			this.setLooping(true);
		} else {
				generatedCur_technique.gs_technique_end_pass();
		} 
		Object generatedLoop_pass = this.getLoop_pass();
		if (!generatedCur_technique.gs_technique_begin_pass(generatedLoop_pass++)) {
			generatedCur_technique.gs_technique_end();
			this.setLooping(false);
			this.setLoop_pass(0);
			return false;
		} 
		return true;
	}
	public void upload_parameters(Object changed_only) {
		darray vshader_params = new darray();
		darray pshader_params = new darray();
		gs_effect_pass generatedCur_pass = this.getCur_pass();
		if (!generatedCur_pass) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedVertshader_params = generatedCur_pass.getVertshader_params();
		vshader_params = generatedVertshader_params.getDa();
		Object generatedPixelshader_params = generatedCur_pass.getPixelshader_params();
		pshader_params = generatedPixelshader_params.getDa();
		ModernizedCProgram.upload_shader_params(vshader_params, changed_only);
		ModernizedCProgram.upload_shader_params(pshader_params, changed_only);
		ModernizedCProgram.reset_params(vshader_params);
		ModernizedCProgram.reset_params(pshader_params);
	}
	public void gs_effect_update_params() {
		if (effect) {
			effect.upload_parameters(true);
		} 
	}
	public Object getProcessing() {
		return processing;
	}
	public void setProcessing(Object newProcessing) {
		processing = newProcessing;
	}
	public Object getCached() {
		return cached;
	}
	public void setCached(Object newCached) {
		cached = newCached;
	}
	public Byte getEffect_path() {
		return effect_path;
	}
	public void setEffect_path(Byte newEffect_path) {
		effect_path = newEffect_path;
	}
	public Byte getEffect_dir() {
		return effect_dir;
	}
	public void setEffect_dir(Byte newEffect_dir) {
		effect_dir = newEffect_dir;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public gs_effect_technique getCur_technique() {
		return cur_technique;
	}
	public void setCur_technique(gs_effect_technique newCur_technique) {
		cur_technique = newCur_technique;
	}
	public gs_effect_pass getCur_pass() {
		return cur_pass;
	}
	public void setCur_pass(gs_effect_pass newCur_pass) {
		cur_pass = newCur_pass;
	}
	public gs_effect_param getView_proj() {
		return view_proj;
	}
	public void setView_proj(gs_effect_param newView_proj) {
		view_proj = newView_proj;
	}
	public gs_effect_param getWorld() {
		return world;
	}
	public void setWorld(gs_effect_param newWorld) {
		world = newWorld;
	}
	public gs_effect_param getScale() {
		return scale;
	}
	public void setScale(gs_effect_param newScale) {
		scale = newScale;
	}
	public graphics_subsystem getGraphics() {
		return graphics;
	}
	public void setGraphics(graphics_subsystem newGraphics) {
		graphics = newGraphics;
	}
	public gs_effect getNext() {
		return next;
	}
	public void setNext(gs_effect newNext) {
		next = newNext;
	}
	public Object getLoop_pass() {
		return loop_pass;
	}
	public void setLoop_pass(Object newLoop_pass) {
		loop_pass = newLoop_pass;
	}
	public Object getLooping() {
		return looping;
	}
	public void setLooping(Object newLooping) {
		looping = newLooping;
	}
}
