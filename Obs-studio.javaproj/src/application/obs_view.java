package application;

/* views */
public class obs_view {
	private Object channels_mutex;
	private Object channels;
	
	public obs_view(Object channels_mutex, Object channels) {
		setChannels_mutex(channels_mutex);
		setChannels(channels);
	}
	public obs_view() {
	}
	
	/******************************************************************************
	    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>
	
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
	public Object obs_view_init() {
		if (!view) {
			return false;
		} 
		Object generatedChannels_mutex = this.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedChannels_mutex);
		if (ModernizedCProgram.pthread_mutex_init(generatedChannels_mutex, NULL) != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "obs_view_init: Failed to create mutex");
			return false;
		} 
		return true;
	}
	public obs_view obs_view_create() {
		obs_view view = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		if (!view.obs_view_init()) {
			ModernizedCProgram.bfree(view);
			view = NULL;
		} 
		return view;
	}
	public void obs_view_free() {
		if (!view) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedChannels = this.getChannels();
		for ( i = 0;
		 i < 64; i++) {
			obs_source source = generatedChannels[i];
			if (source) {
				source.obs_source_deactivate(view_type.AUX_VIEW);
				source.obs_source_release();
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedChannels, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedChannels_mutex = this.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedChannels_mutex);
	}
	public void obs_view_destroy() {
		if (view) {
			view.obs_view_free();
			ModernizedCProgram.bfree(view);
		} 
	}
	public void obs_view_render() {
		if (!view) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedChannels_mutex = this.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedChannels_mutex);
		Object generatedChannels = this.getChannels();
		Object generatedRemoved = source.getRemoved();
		for ( i = 0;
		 i < 64; i++) {
			obs_source source = new obs_source();
			source = generatedChannels[i];
			if (source) {
				if (generatedRemoved) {
					source.obs_source_release();
					generatedChannels[i] = NULL;
				} else {
						source.obs_source_video_render();
				} 
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedChannels_mutex);
	}
	public void obs_main_view_free() {
		if (!view) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedChannels = this.getChannels();
		for ( i = 0;
		 i < 64; i++) {
			generatedChannels[i].obs_source_release();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedChannels, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedChannels_mutex = this.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedChannels_mutex);
	}
	public Object getChannels_mutex() {
		return channels_mutex;
	}
	public void setChannels_mutex(Object newChannels_mutex) {
		channels_mutex = newChannels_mutex;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
}
