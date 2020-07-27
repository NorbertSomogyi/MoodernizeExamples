package application;

/******************************************************************************
    Copyright (C) 2016 by Hugh Bailey <obs.jim@gmail.com>

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
public class gs_image_file {
	private gs_texture texture;
	private gs_color_format format;
	private Object cx;
	private Object cy;
	private Object is_animated_gif;
	private Object frame_updated;
	private Object loaded;
	private Object gif;
	private Object gif_data;
	private Object[][] animation_frame_cache;
	private Object animation_frame_data;
	private Object cur_time;
	private int cur_frame;
	private int cur_loop;
	private int last_decoded_frame;
	private Object texture_data;
	private Object bitmap_callbacks;
	
	public gs_image_file(gs_texture texture, gs_color_format format, Object cx, Object cy, Object is_animated_gif, Object frame_updated, Object loaded, Object gif, Object gif_data, Object[][] animation_frame_cache, Object animation_frame_data, Object cur_time, int cur_frame, int cur_loop, int last_decoded_frame, Object texture_data, Object bitmap_callbacks) {
		setTexture(texture);
		setFormat(format);
		setCx(cx);
		setCy(cy);
		setIs_animated_gif(is_animated_gif);
		setFrame_updated(frame_updated);
		setLoaded(loaded);
		setGif(gif);
		setGif_data(gif_data);
		setAnimation_frame_cache(animation_frame_cache);
		setAnimation_frame_data(animation_frame_data);
		setCur_time(cur_time);
		setCur_frame(cur_frame);
		setCur_loop(cur_loop);
		setLast_decoded_frame(last_decoded_frame);
		setTexture_data(texture_data);
		setBitmap_callbacks(bitmap_callbacks);
	}
	public gs_image_file() {
	}
	
	public int get_full_decoded_gif_size() {
		Object generatedGif = this.getGif();
		return generatedGif.getWidth() * generatedGif.getHeight() * 4 * generatedGif.getFrame_count();
	}
	public Object alloc_mem(Object mem_usage, Object size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(image);
		if (mem_usage) {
			mem_usage += size;
		} 
		return ModernizedCProgram.bzalloc(size);
	}
	public Object init_animated_gif(Object path, Object mem_usage) {
		 is_animated_gif = true;
		 result = new ();
		 max_size = new ();
		 size = new ();
		 size_read = new ();
		 file = new ();
		Object generatedBitmap_callbacks = this.getBitmap_callbacks();
		generatedBitmap_callbacks.setBitmap_create(bi_def_bitmap_create);
		generatedBitmap_callbacks.setBitmap_destroy(bi_def_bitmap_destroy);
		generatedBitmap_callbacks.setBitmap_get_buffer(bi_def_bitmap_get_buffer);
		generatedBitmap_callbacks.setBitmap_modified(bi_def_bitmap_modified);
		generatedBitmap_callbacks.setBitmap_set_opaque(bi_def_bitmap_set_opaque);
		generatedBitmap_callbacks.setBitmap_test_opaque(bi_def_bitmap_test_opaque);
		Object generatedGif = this.getGif();
		ModernizedCProgram.gif_create(generatedGif, generatedBitmap_callbacks);
		file = ModernizedCProgram.os_fopen(path, "rb");
		if (!file) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: Failed to open file '%s'", __FUNCTION__, path);
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fseek(file, 0, SEEK_END);
		size = ()file.os_ftelli64();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fseek(file, 0, SEEK_SET);
		this.setGif_data(ModernizedCProgram.bmalloc(size));
		Object generatedGif_data = this.getGif_data();
		size_read = /*Error: Function owner not recognized*/fread(generatedGif_data, 1, size, file);
		if (size_read != size) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: Failed to fully read gif file '%s'.", __FUNCTION__, path);
			;
		} 
		do {
			result = generatedGif.gif_initialise(size, generatedGif_data);
			if (result < 0) {
				ModernizedCProgram.blog(LOG_WARNING, "%s: Failed to initialize gif '%s', possible file corruption", __FUNCTION__, path);
				;
			} 
		} while (result != GIF_OK);
		if (generatedGif.getWidth() > 4096 || generatedGif.getHeight() > 4096) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: Bad texture dimensions (%dx%d) in '%s'", __FUNCTION__, generatedGif.getWidth(), generatedGif.getHeight(), path);
			;
		} 
		max_size = ()generatedGif.getWidth() * ()generatedGif.getHeight() * ()generatedGif.getFrame_count() * -1024;
		if (()image.get_full_decoded_gif_size() != max_size) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: Gif '%s' overflowed maximum pointer size", __FUNCTION__, path);
			;
		} 
		this.setIs_animated_gif((generatedGif.getFrame_count() > 1 && result >= 0));
		Object generatedIs_animated_gif = this.getIs_animated_gif();
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		if (generatedIs_animated_gif) {
			generatedGif.gif_decode_frame(0);
			this.setAnimation_frame_cache(image.alloc_mem(mem_usage, generatedGif.getFrame_count() * /*Error: Unsupported expression*/));
			this.setAnimation_frame_data(image.alloc_mem(mem_usage, image.get_full_decoded_gif_size()));
			for (int i = 0;
			 i < generatedGif.getFrame_count(); i++) {
				if (generatedGif.gif_decode_frame(i) != GIF_OK) {
					ModernizedCProgram.blog(LOG_WARNING, "%s: Couldn't decode frame %u of '%s'", __FUNCTION__, i, path);
				} 
			}
			generatedGif.gif_decode_frame(0);
			this.setCx(()generatedGif.getWidth());
			this.setCy(()generatedGif.getHeight());
			this.setFormat(gs_color_format.GS_RGBA);
			if (mem_usage) {
				mem_usage += generatedCx * generatedCy * 4;
				mem_usage += size;
			} 
		} else {
				generatedGif.gif_finalise();
				ModernizedCProgram.bfree(generatedGif_data);
				this.setGif_data(NULL);
				is_animated_gif = false;
				;
		} 
		this.setLoaded(true);
		return is_animated_gif;
	}
	public void gs_image_file_init_internal(Object file, Object mem_usage) {
		 len = new ();
		if (!image) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(image, 0, /*Error: sizeof expression not supported yet*/);
		if (!file) {
			return /*Error: Unsupported expression*/;
		} 
		len = /*Error: Function owner not recognized*/strlen(file);
		if (len > 4 && /*Error: Function owner not recognized*/strcmp(file + len - 4, ".gif") == 0) {
			if (image.init_animated_gif(file, mem_usage)) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		gs_color_format generatedFormat = this.getFormat();
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		this.setTexture_data(ModernizedCProgram.gs_create_texture_file_data(file, generatedFormat, generatedCx, generatedCy));
		if (mem_usage) {
			mem_usage += generatedCx * generatedCy * ModernizedCProgram.gs_get_format_bpp(generatedFormat) / 8;
		} 
		Object generatedTexture_data = this.getTexture_data();
		this.setLoaded(!!generatedTexture_data);
		Object generatedLoaded = this.getLoaded();
		if (!generatedLoaded) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: Failed to load file '%s'", __FUNCTION__, file);
			image.gs_image_file_free();
		} 
	}
	public void gs_image_file_init(Object file) {
		image.gs_image_file_init_internal(file, NULL);
	}
	public void gs_image_file_free() {
		if (!image) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLoaded = this.getLoaded();
		Object generatedIs_animated_gif = this.getIs_animated_gif();
		Object generatedGif = this.getGif();
		Object[][] generatedAnimation_frame_cache = this.getAnimation_frame_cache();
		Object generatedAnimation_frame_data = this.getAnimation_frame_data();
		gs_texture generatedTexture = this.getTexture();
		if (generatedLoaded) {
			if (generatedIs_animated_gif) {
				generatedGif.gif_finalise();
				ModernizedCProgram.bfree(generatedAnimation_frame_cache);
				ModernizedCProgram.bfree(generatedAnimation_frame_data);
			} 
			ModernizedCProgram.gs_texture_destroy(generatedTexture);
		} 
		Object generatedTexture_data = this.getTexture_data();
		ModernizedCProgram.bfree(generatedTexture_data);
		Object generatedGif_data = this.getGif_data();
		ModernizedCProgram.bfree(generatedGif_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(image, 0, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_image_file_init_texture() {
		Object generatedLoaded = this.getLoaded();
		if (!generatedLoaded) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedIs_animated_gif = this.getIs_animated_gif();
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		gs_color_format generatedFormat = this.getFormat();
		Object generatedGif = this.getGif();
		gs_texture gs_texture = new gs_texture();
		Object generatedTexture_data = this.getTexture_data();
		if (generatedIs_animated_gif) {
			this.setTexture(gs_texture.gs_texture_create(generatedCx, generatedCy, generatedFormat, 1, ()generatedGif.getFrame_image(), (1 << 1)));
		} else {
				this.setTexture(gs_texture.gs_texture_create(generatedCx, generatedCy, generatedFormat, 1, ()generatedTexture_data, 0));
				ModernizedCProgram.bfree(generatedTexture_data);
				this.setTexture_data(NULL);
		} 
	}
	public Object get_time(int i) {
		Object generatedGif = this.getGif();
		 val = ()generatedGif.getFrames()[i].getFrame_delay() * -1024;
		if (!val) {
			val = 100000000;
		} 
		return val;
	}
	public int calculate_new_frame(Object elapsed_time_ns, int loops) {
		int generatedCur_frame = this.getCur_frame();
		int new_frame = generatedCur_frame;
		Object generatedCur_time = this.getCur_time();
		generatedCur_time += elapsed_time_ns;
		Object generatedGif = this.getGif();
		int generatedCur_loop = this.getCur_loop();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			 t = image.get_time(new_frame);
			if (generatedCur_time <= t) {
				break;
			} 
			generatedCur_time -= t;
			if ((int)++new_frame == generatedGif.getFrame_count()) {
				if (!loops || ++generatedCur_loop < loops) {
					new_frame = 0;
				}  else if (generatedCur_loop == loops) {
					new_frame--;
					break;
				} 
			} 
		}
		return new_frame;
	}
	public void decode_new_frame(int new_frame) {
		Object[][] generatedAnimation_frame_cache = this.getAnimation_frame_cache();
		int generatedLast_decoded_frame = this.getLast_decoded_frame();
		Object generatedGif = this.getGif();
		Object generatedAnimation_frame_data = this.getAnimation_frame_data();
		if (!generatedAnimation_frame_cache[new_frame]) {
			int last_frame;
			ModernizedCProgram.last_frame = (new_frame < generatedLast_decoded_frame) ? 0 : generatedLast_decoded_frame + 1;
			for (int i = ModernizedCProgram.last_frame;
			 i < new_frame; /* decode missed frames */i++) {
				if (generatedGif.gif_decode_frame(i) != GIF_OK) {
					return /*Error: Unsupported expression*/;
				} 
			}
			if (generatedGif.gif_decode_frame(new_frame) == /* decode actual desired frame */GIF_OK) {
				 pos = new_frame * generatedGif.getWidth() * generatedGif.getHeight() * 4;
				generatedAnimation_frame_cache[new_frame] = generatedAnimation_frame_data + pos;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedAnimation_frame_cache[new_frame], generatedGif.getFrame_image(), generatedGif.getWidth() * generatedGif.getHeight() * 4);
				this.setLast_decoded_frame(new_frame);
			} 
		} 
		this.setCur_frame(new_frame);
	}
	public Object gs_image_file_tick(Object elapsed_time_ns) {
		int loops;
		Object generatedIs_animated_gif = this.getIs_animated_gif();
		Object generatedLoaded = this.getLoaded();
		if (!generatedIs_animated_gif || !generatedLoaded) {
			return false;
		} 
		Object generatedGif = this.getGif();
		loops = generatedGif.getLoop_count();
		if (loops >= -1024) {
			loops = 0;
		} 
		int generatedCur_loop = this.getCur_loop();
		int generatedCur_frame = this.getCur_frame();
		if (!loops || generatedCur_loop < loops) {
			int new_frame = image.calculate_new_frame(elapsed_time_ns, loops);
			if (new_frame != generatedCur_frame) {
				image.decode_new_frame(new_frame);
				return true;
			} 
		} 
		return false;
	}
	public void gs_image_file_update_texture() {
		Object generatedIs_animated_gif = this.getIs_animated_gif();
		Object generatedLoaded = this.getLoaded();
		if (!generatedIs_animated_gif || !generatedLoaded) {
			return /*Error: Unsupported expression*/;
		} 
		Object[][] generatedAnimation_frame_cache = this.getAnimation_frame_cache();
		int generatedCur_frame = this.getCur_frame();
		if (!generatedAnimation_frame_cache[generatedCur_frame]) {
			image.decode_new_frame(generatedCur_frame);
		} 
		gs_texture generatedTexture = this.getTexture();
		Object generatedGif = this.getGif();
		generatedTexture.gs_texture_set_image(generatedAnimation_frame_cache[generatedCur_frame], generatedGif.getWidth() * 4, false);
	}
	public gs_texture getTexture() {
		return texture;
	}
	public void setTexture(gs_texture newTexture) {
		texture = newTexture;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
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
	public Object getIs_animated_gif() {
		return is_animated_gif;
	}
	public void setIs_animated_gif(Object newIs_animated_gif) {
		is_animated_gif = newIs_animated_gif;
	}
	public Object getFrame_updated() {
		return frame_updated;
	}
	public void setFrame_updated(Object newFrame_updated) {
		frame_updated = newFrame_updated;
	}
	public Object getLoaded() {
		return loaded;
	}
	public void setLoaded(Object newLoaded) {
		loaded = newLoaded;
	}
	public Object getGif() {
		return gif;
	}
	public void setGif(Object newGif) {
		gif = newGif;
	}
	public Object getGif_data() {
		return gif_data;
	}
	public void setGif_data(Object newGif_data) {
		gif_data = newGif_data;
	}
	public Object[][] getAnimation_frame_cache() {
		return animation_frame_cache;
	}
	public void setAnimation_frame_cache(Object[][] newAnimation_frame_cache) {
		animation_frame_cache = newAnimation_frame_cache;
	}
	public Object getAnimation_frame_data() {
		return animation_frame_data;
	}
	public void setAnimation_frame_data(Object newAnimation_frame_data) {
		animation_frame_data = newAnimation_frame_data;
	}
	public Object getCur_time() {
		return cur_time;
	}
	public void setCur_time(Object newCur_time) {
		cur_time = newCur_time;
	}
	public int getCur_frame() {
		return cur_frame;
	}
	public void setCur_frame(int newCur_frame) {
		cur_frame = newCur_frame;
	}
	public int getCur_loop() {
		return cur_loop;
	}
	public void setCur_loop(int newCur_loop) {
		cur_loop = newCur_loop;
	}
	public int getLast_decoded_frame() {
		return last_decoded_frame;
	}
	public void setLast_decoded_frame(int newLast_decoded_frame) {
		last_decoded_frame = newLast_decoded_frame;
	}
	public Object getTexture_data() {
		return texture_data;
	}
	public void setTexture_data(Object newTexture_data) {
		texture_data = newTexture_data;
	}
	public Object getBitmap_callbacks() {
		return bitmap_callbacks;
	}
	public void setBitmap_callbacks(Object newBitmap_callbacks) {
		bitmap_callbacks = newBitmap_callbacks;
	}
}
