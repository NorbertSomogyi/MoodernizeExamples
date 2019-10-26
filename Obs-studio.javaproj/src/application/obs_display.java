package application;

/* displays */
public class obs_display {
	private Object size_changed;
	private Object enabled;
	private Object cx;
	private Object cy;
	private Object background_color;
	private Object swap;
	private Object draw_callbacks_mutex;
	private Object draw_info_mutex;
	private Object ;
	private obs_display next;
	private obs_display prev_next;
	
	public obs_display(Object size_changed, Object enabled, Object cx, Object cy, Object background_color, Object swap, Object draw_callbacks_mutex, Object draw_info_mutex, Object,  obs_display next, obs_display prev_next) {
		setSize_changed(size_changed);
		setEnabled(enabled);
		setCx(cx);
		setCy(cy);
		setBackground_color(background_color);
		setSwap(swap);
		setDraw_callbacks_mutex(draw_callbacks_mutex);
		setDraw_info_mutex(draw_info_mutex);
		set();
		setNext(next);
		setPrev_next(prev_next);
	}
	public obs_display() {
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
	public Object obs_display_init(Object graphics_data) {
		Object generatedDraw_callbacks_mutex = this.getDraw_callbacks_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedDraw_callbacks_mutex);
		Object generatedDraw_info_mutex = this.getDraw_info_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedDraw_info_mutex);
		gs_swap_chain gs_swap_chain = new gs_swap_chain();
		Object generatedSwap = this.getSwap();
		if (graphics_data) {
			this.setSwap(gs_swap_chain.gs_swapchain_create(graphics_data));
			if (!generatedSwap) {
				ModernizedCProgram.blog(LOG_ERROR, "obs_display_init: Failed to create swap chain");
				return false;
			} 
			this.setCx(graphics_data.getCx());
			this.setCy(graphics_data.getCy());
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedDraw_callbacks_mutex, NULL) != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "obs_display_init: Failed to create mutex");
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedDraw_info_mutex, NULL) != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "obs_display_init: Failed to create mutex");
			return false;
		} 
		this.setEnabled(true);
		return true;
	}
	public obs_display obs_display_create(Object graphics_data, Object background_color) {
		obs_display display = ModernizedCProgram.bzalloc();
		ModernizedCProgram.obs.getVideo().getGraphics().gs_enter_context();
		display.setBackground_color(background_color);
		obs_display generatedNext = display.getNext();
		if (!display.obs_display_init(graphics_data)) {
			display.obs_display_destroy();
			display = NULL;
		} else {
				ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getData().getDisplays_mutex());
				display.setPrev_next(ModernizedCProgram.obs.getData().getFirst_display());
				display.setNext(ModernizedCProgram.obs.getData().getFirst_display());
				ModernizedCProgram.obs.getData().setFirst_display(display);
				if (generatedNext) {
					generatedNext.setPrev_next(generatedNext);
				} 
				ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getData().getDisplays_mutex());
		} 
		ModernizedCProgram.gs_leave_context();
		return display;
	}
	public void obs_display_free() {
		Object generatedDraw_callbacks_mutex = this.getDraw_callbacks_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedDraw_callbacks_mutex);
		Object generatedDraw_info_mutex = this.getDraw_info_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedDraw_info_mutex);
		Object generatedDraw_callbacks = this.getDraw_callbacks();
		.da_free(generatedDraw_callbacks);
		Object generatedSwap = this.getSwap();
		if (generatedSwap) {
			ModernizedCProgram.gs_swapchain_destroy(generatedSwap);
			this.setSwap(NULL);
		} 
	}
	public void obs_display_destroy() {
		obs_display generatedPrev_next = this.getPrev_next();
		obs_display generatedNext = this.getNext();
		if (display) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getData().getDisplays_mutex());
			if (generatedPrev_next) {
				generatedPrev_next = generatedNext;
			} 
			if (generatedNext) {
				generatedNext.setPrev_next(generatedPrev_next);
			} 
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getData().getDisplays_mutex());
			ModernizedCProgram.obs_enter_graphics();
			display.obs_display_free();
			ModernizedCProgram.obs_leave_graphics();
			ModernizedCProgram.bfree(display);
		} 
	}
	public void obs_display_resize(Object cx, Object cy) {
		if (!display) {
			return ;
		} 
		Object generatedDraw_info_mutex = this.getDraw_info_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDraw_info_mutex);
		this.setCx(cx);
		this.setCy(cy);
		this.setSize_changed(true);
		ModernizedCProgram.pthread_mutex_unlock(generatedDraw_info_mutex);
	}
	public void obs_display_add_draw_callback(Object draw, Object param) {
		if (!display) {
			return ;
		} 
		draw_callback data = new draw_callback(draw, param);
		Object generatedDraw_callbacks_mutex = this.getDraw_callbacks_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDraw_callbacks_mutex);
		Object generatedDraw_callbacks = this.getDraw_callbacks();
		.da_push_back(generatedDraw_callbacks, data);
		ModernizedCProgram.pthread_mutex_unlock(generatedDraw_callbacks_mutex);
	}
	public void obs_display_remove_draw_callback(Object draw, Object param) {
		if (!display) {
			return ;
		} 
		draw_callback data = new draw_callback(draw, param);
		Object generatedDraw_callbacks_mutex = this.getDraw_callbacks_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDraw_callbacks_mutex);
		Object generatedDraw_callbacks = this.getDraw_callbacks();
		.da_erase_item(generatedDraw_callbacks, data);
		ModernizedCProgram.pthread_mutex_unlock(generatedDraw_callbacks_mutex);
	}
	public void render_display_begin(Object cx, Object cy, Object size_changed) {
		vec4 clear_color = new vec4();
		Object generatedSwap = this.getSwap();
		generatedSwap.gs_load_swapchain();
		if (size_changed) {
			ModernizedCProgram.gs_resize(cx, cy);
		} 
		ModernizedCProgram.gs_begin_scene();
		Object generatedBackground_color = this.getBackground_color();
		clear_color.vec4_from_rgba(generatedBackground_color);
		clear_color.setVec4(1.0);
		ModernizedCProgram.gs_clear(GS_CLEAR_COLOR | GS_CLEAR_DEPTH | GS_CLEAR_STENCIL, clear_color, 1.0, 0);
		ModernizedCProgram.gs_enable_depth_test(false);
		ModernizedCProgram.gs_set_cull_mode(/* gs_enable_blending(false); */GS_NEITHER);
		ModernizedCProgram.gs_ortho(0.0, (double)cx, 0.0, (double)cy, -100.0, 100.0);
		ModernizedCProgram.gs_set_viewport(0, 0, cx, cy);
	}
	public void render_display() {
		 cx = new ();
		 cy = new ();
		 size_changed = new ();
		Object generatedEnabled = this.getEnabled();
		if (!display || !generatedEnabled) {
			return ;
		} 
		.GS_DEBUG_MARKER_BEGIN(GS_DEBUG_COLOR_DISPLAY, "obs_display");
		Object generatedDraw_info_mutex = this.getDraw_info_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDraw_info_mutex);
		Object generatedCx = this.getCx();
		cx = generatedCx;
		Object generatedCy = this.getCy();
		cy = generatedCy;
		Object generatedSize_changed = this.getSize_changed();
		size_changed = generatedSize_changed;
		if (size_changed) {
			this.setSize_changed(false);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedDraw_info_mutex);
		display.render_display_begin(cx, cy, /* -------------------------------------------- */size_changed);
		Object generatedDraw_callbacks_mutex = this.getDraw_callbacks_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDraw_callbacks_mutex);
		Object generatedDraw_callbacks = this.getDraw_callbacks();
		for ( i = 0;
		 i < generatedDraw_callbacks.getNum(); i++) {
			draw_callback callback = new draw_callback();
			ModernizedCProgram.callback = generatedDraw_callbacks.getArray() + i;
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.callback.getParam(), cx, cy);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedDraw_callbacks_mutex);
		ModernizedCProgram.render_display_end();
		.GS_DEBUG_MARKER_END();
		ModernizedCProgram.gs_present();
	}
	public void obs_display_set_enabled(Object enable) {
		if (display) {
			this.setEnabled(enable);
		} 
	}
	public Object obs_display_enabled() {
		Object generatedEnabled = this.getEnabled();
		return display ? generatedEnabled : false;
	}
	public void obs_display_set_background_color(Object color) {
		if (display) {
			this.setBackground_color(color);
		} 
	}
	public void obs_display_size(Object width, Object height) {
		width = 0;
		height = 0;
		Object generatedDraw_info_mutex = this.getDraw_info_mutex();
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		if (display) {
			ModernizedCProgram.pthread_mutex_lock(generatedDraw_info_mutex);
			width = generatedCx;
			height = generatedCy;
			ModernizedCProgram.pthread_mutex_unlock(generatedDraw_info_mutex);
		} 
	}
	public Object getSize_changed() {
		return size_changed;
	}
	public void setSize_changed(Object newSize_changed) {
		size_changed = newSize_changed;
	}
	public Object getEnabled() {
		return enabled;
	}
	public void setEnabled(Object newEnabled) {
		enabled = newEnabled;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getBackground_color() {
		return background_color;
	}
	public void setBackground_color(Object newBackground_color) {
		background_color = newBackground_color;
	}
	public Object getSwap() {
		return swap;
	}
	public void setSwap(Object newSwap) {
		swap = newSwap;
	}
	public Object getDraw_callbacks_mutex() {
		return draw_callbacks_mutex;
	}
	public void setDraw_callbacks_mutex(Object newDraw_callbacks_mutex) {
		draw_callbacks_mutex = newDraw_callbacks_mutex;
	}
	public Object getDraw_info_mutex() {
		return draw_info_mutex;
	}
	public void setDraw_info_mutex(Object newDraw_info_mutex) {
		draw_info_mutex = newDraw_info_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_display getNext() {
		return next;
	}
	public void setNext(obs_display newNext) {
		next = newNext;
	}
	public obs_display getPrev_next() {
		return prev_next;
	}
	public void setPrev_next(obs_display newPrev_next) {
		prev_next = newPrev_next;
	}
}
