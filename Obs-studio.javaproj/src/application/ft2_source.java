package application;

public class ft2_source {
	private Byte font_name;
	private Byte font_style;
	private Object font_size;
	private Object font_flags;
	private Object file_load_failed;
	private Object from_file;
	private Byte text_file;
	private Object text;
	private Object m_timestamp;
	private Object update_file;
	private Object last_checked;
	private Object cx;
	private Object cy;
	private Object max_h;
	private Object custom_width;
	private Object texbuf_x;
	private Object texbuf_y;
	private Object color;
	private Object colorbuf;
	private Object cur_scroll;
	private Object scroll_speed;
	private Object tex;
	private Object cacheglyphs;
	private Object font_face;
	private Object texbuf;
	private Object vbuf;
	private Object draw_effect;
	private Object outline_text;
	private Object drop_shadow;
	private Object log_mode;
	private Object word_wrap;
	private Object log_lines;
	private obs_source src;
	
	public ft2_source(Byte font_name, Byte font_style, Object font_size, Object font_flags, Object file_load_failed, Object from_file, Byte text_file, Object text, Object m_timestamp, Object update_file, Object last_checked, Object cx, Object cy, Object max_h, Object custom_width, Object texbuf_x, Object texbuf_y, Object color, Object colorbuf, Object cur_scroll, Object scroll_speed, Object tex, Object cacheglyphs, Object font_face, Object texbuf, Object vbuf, Object draw_effect, Object outline_text, Object drop_shadow, Object log_mode, Object word_wrap, Object log_lines, obs_source src) {
		setFont_name(font_name);
		setFont_style(font_style);
		setFont_size(font_size);
		setFont_flags(font_flags);
		setFile_load_failed(file_load_failed);
		setFrom_file(from_file);
		setText_file(text_file);
		setText(text);
		setM_timestamp(m_timestamp);
		setUpdate_file(update_file);
		setLast_checked(last_checked);
		setCx(cx);
		setCy(cy);
		setMax_h(max_h);
		setCustom_width(custom_width);
		setTexbuf_x(texbuf_x);
		setTexbuf_y(texbuf_y);
		setColor(color);
		setColorbuf(colorbuf);
		setCur_scroll(cur_scroll);
		setScroll_speed(scroll_speed);
		setTex(tex);
		setCacheglyphs(cacheglyphs);
		setFont_face(font_face);
		setTexbuf(texbuf);
		setVbuf(vbuf);
		setDraw_effect(draw_effect);
		setOutline_text(outline_text);
		setDrop_shadow(drop_shadow);
		setLog_mode(log_mode);
		setWord_wrap(word_wrap);
		setLog_lines(log_lines);
		setSrc(src);
	}
	public ft2_source() {
	}
	
	public void draw_outlines() {
		// Horrible (hopefully temporary) solution for outlines. tmp = new ();
		Object generatedVbuf = this.getVbuf();
		gs_vb_data gs_vb_data = new gs_vb_data();
		gs_vb_data vdata = gs_vb_data.gs_vertexbuffer_get_data(generatedVbuf);
		Object generatedText = this.getText();
		if (!generatedText) {
			return ;
		} 
		Object generatedGs_vb_data = vdata.getGs_vb_data();
		tmp = generatedGs_vb_data;
		Object generatedColorbuf = this.getColorbuf();
		vdata.setGs_vb_data(generatedColorbuf);
		ModernizedCProgram.gs_matrix_push();
		Object generatedTex = this.getTex();
		Object generatedDraw_effect = this.getDraw_effect();
		for ( i = 0;
		 i < 8; i++) {
			ModernizedCProgram.gs_matrix_translate3f(ModernizedCProgram.offsets[i * 2], ModernizedCProgram.offsets[(i * 2) + 1], 0.0);
			ModernizedCProgram.draw_uv_vbuffer(generatedVbuf, generatedTex, generatedDraw_effect, ().wcslen(generatedText) * 6);
		}
		ModernizedCProgram.gs_matrix_identity();
		ModernizedCProgram.gs_matrix_pop();
		vdata.setGs_vb_data(tmp);
	}
	public void draw_drop_shadow() {
		// Horrible (hopefully temporary) solution for drop shadow. tmp = new ();
		Object generatedVbuf = this.getVbuf();
		gs_vb_data gs_vb_data = new gs_vb_data();
		gs_vb_data vdata = gs_vb_data.gs_vertexbuffer_get_data(generatedVbuf);
		Object generatedText = this.getText();
		if (!generatedText) {
			return ;
		} 
		Object generatedGs_vb_data = vdata.getGs_vb_data();
		tmp = generatedGs_vb_data;
		Object generatedColorbuf = this.getColorbuf();
		vdata.setGs_vb_data(generatedColorbuf);
		ModernizedCProgram.gs_matrix_push();
		ModernizedCProgram.gs_matrix_translate3f(4.0, 4.0, 0.0);
		Object generatedTex = this.getTex();
		Object generatedDraw_effect = this.getDraw_effect();
		ModernizedCProgram.draw_uv_vbuffer(generatedVbuf, generatedTex, generatedDraw_effect, ().wcslen(generatedText) * 6);
		ModernizedCProgram.gs_matrix_identity();
		ModernizedCProgram.gs_matrix_pop();
		vdata.setGs_vb_data(tmp);
	}
	public void set_up_vertex_buffer() {
		 glyph_index = 0;
		 x = 0;
		 space_pos = 0;
		 word_width = 0;
		 len = new ();
		Object generatedText = this.getText();
		if (!generatedText) {
			return ;
		} 
		Object generatedCustom_width = this.getCustom_width();
		if (generatedCustom_width >= 100) {
			this.setCx(generatedCustom_width);
		} else {
				this.setCx(srcdata.get_ft2_text_width(generatedText));
		} 
		Object generatedMax_h = this.getMax_h();
		this.setCy(generatedMax_h);
		ModernizedCProgram.obs_enter_graphics();
		Object generatedVbuf = this.getVbuf();
		if (generatedVbuf != NULL) {
			 tmpvbuf = generatedVbuf;
			this.setVbuf(NULL);
			ModernizedCProgram.gs_vertexbuffer_destroy(tmpvbuf);
		} 
		if (generatedText == 0) {
			ModernizedCProgram.obs_leave_graphics();
			return ;
		} 
		this.setVbuf(ModernizedCProgram.create_uv_vbuffer(().wcslen(generatedText) * 6, true));
		if (generatedCustom_width <= 100) {
			;
		} 
		Object generatedWord_wrap = this.getWord_wrap();
		if (!generatedWord_wrap) {
			;
		} 
		len = .wcslen(generatedText);
		srcdata.fill_vertex_buffer();
		ModernizedCProgram.obs_leave_graphics();
	}
	public void fill_vertex_buffer() {
		Object generatedVbuf = this.getVbuf();
		gs_vb_data gs_vb_data = new gs_vb_data();
		gs_vb_data vdata = gs_vb_data.gs_vertexbuffer_get_data(generatedVbuf);
		Object generatedText = this.getText();
		if (vdata == NULL || !generatedText) {
			return ;
		} 
		Object generatedGs_vb_data = vdata.getGs_vb_data();
		vec2 tvarray = (vec2)generatedGs_vb_data[0].getArray();
		 col = ()generatedGs_vb_data;
		 glyph_index = 0;
		Object generatedMax_h = this.getMax_h();
		 dx = 0;
		 dy = generatedMax_h;
		 max_y = dy;
		 cur_glyph = 0;
		 len = .wcslen(generatedText);
		Object generatedColorbuf = this.getColorbuf();
		if (generatedColorbuf != NULL) {
			ModernizedCProgram.bfree(generatedColorbuf);
			this.setColorbuf(NULL);
		} 
		this.setColorbuf(ModernizedCProgram.bzalloc( * .wcslen(generatedText) * 6));
		for ( i = 0;
		 i < len * 6; i++) {
			generatedColorbuf[i] = -1024;
		}
		this.setCy(max_y);
	}
	public void cache_standard_glyphs() {
		Object generatedCacheglyphs = this.getCacheglyphs();
		for ( i = 0;
		 i < 65535; i++) {
			if (generatedCacheglyphs[i] != NULL) {
				ModernizedCProgram.bfree(generatedCacheglyphs[i]);
				generatedCacheglyphs[i] = NULL;
			} 
		}
		this.setTexbuf_x(0);
		this.setTexbuf_y(0);
		srcdata.cache_glyphs(L"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-_=+,<.>/?\\|[]{}`~ \'\"\0");
	}
	public void cache_glyphs(Object cache_glyphs) {
		 slot = new ();
		 glyph_index = 0;
		Object generatedFont_face = this.getFont_face();
		if (!generatedFont_face || !cache_glyphs) {
			return ;
		} 
		slot = generatedFont_face.getGlyph();
		Object generatedTexbuf_x = this.getTexbuf_x();
		Object generatedTexbuf_y = this.getTexbuf_y();
		 dx = generatedTexbuf_x;
		 dy = generatedTexbuf_y;
		 cached_glyphs = 0;
		 len = .wcslen(cache_glyphs);
		Object generatedCacheglyphs = this.getCacheglyphs();
		Object generatedMax_h = this.getMax_h();
		Object generatedTexbuf = this.getTexbuf();
		this.setTexbuf_x(dx);
		this.setTexbuf_y(dy);
		Object generatedTex = this.getTex();
		gs_texture gs_texture = new gs_texture();
		if (cached_glyphs > 0) {
			ModernizedCProgram.obs_enter_graphics();
			if (generatedTex != NULL) {
				 tmp_texture = NULL;
				tmp_texture = generatedTex;
				this.setTex(NULL);
				ModernizedCProgram.gs_texture_destroy(tmp_texture);
			} 
			this.setTex(gs_texture.gs_texture_create(ModernizedCProgram.texbuf_w, ModernizedCProgram.texbuf_h, GS_A8, 1, ()generatedTexbuf, 0));
			ModernizedCProgram.obs_leave_graphics();
		} 
	}
	public void load_text_from_file(Object filename) {
		 tmp_file = NULL;
		 filesize = 0;
		byte tmp_read = NULL;
		 header = 0;
		 bytes_read = new ();
		tmp_file = ModernizedCProgram.os_fopen(filename, "rb");
		Object generatedFile_load_failed = this.getFile_load_failed();
		if (tmp_file == NULL) {
			if (!generatedFile_load_failed) {
				ModernizedCProgram.blog(LOG_WARNING, "Failed to open file %s", filename);
				this.setFile_load_failed(true);
			} 
			return ;
		} 
		.fseek(tmp_file, 0, SEEK_END);
		filesize = ().ftell(tmp_file);
		.fseek(tmp_file, 0, SEEK_SET);
		bytes_read = .fread(header, 2, 1, tmp_file);
		Object generatedText = this.getText();
		if (bytes_read == 2 && header == -1024) {
			if (generatedText != NULL) {
				ModernizedCProgram.bfree(generatedText);
				this.setText(NULL);
			} 
			this.setText(ModernizedCProgram.bzalloc(filesize));
			bytes_read = .fread(generatedText, filesize - 2, 1, tmp_file);
			ModernizedCProgram.bfree(tmp_read);
			.fclose(tmp_file);
			return ;
		} 
		// File is already in UTF-16 format
		.fseek(tmp_file, 0, SEEK_SET);
		tmp_read = ModernizedCProgram.bzalloc(filesize + 1);
		bytes_read = .fread(tmp_read, filesize, 1, tmp_file);
		.fclose(tmp_file);
		if (generatedText != NULL) {
			ModernizedCProgram.bfree(generatedText);
			this.setText(NULL);
		} 
		this.setText(ModernizedCProgram.bzalloc((.strlen(tmp_read) + 1) * ));
		ModernizedCProgram.os_utf8_to_wcs(tmp_read, .strlen(tmp_read), generatedText, (.strlen(tmp_read) + 1));
		ModernizedCProgram.remove_cr(generatedText);
		ModernizedCProgram.bfree(tmp_read);
	}
	public void read_from_end(Object filename) {
		 tmp_file = NULL;
		 filesize = 0;
		 cur_pos = 0;
		 log_lines = 0;
		byte tmp_read = NULL;
		 value = 0;
		 line_breaks = 0;
		 bytes_read = new ();
		byte bvalue;
		 utf16 = false;
		tmp_file = .fopen(filename, "rb");
		Object generatedFile_load_failed = this.getFile_load_failed();
		if (tmp_file == NULL) {
			if (!generatedFile_load_failed) {
				ModernizedCProgram.blog(LOG_WARNING, "Failed to open file %s", filename);
				this.setFile_load_failed(true);
			} 
			return ;
		} 
		bytes_read = .fread(value, 2, 1, tmp_file);
		if (bytes_read == 2 && value == -1024) {
			utf16 = true;
		} 
		.fseek(tmp_file, 0, SEEK_END);
		filesize = ().ftell(tmp_file);
		cur_pos = filesize;
		Object generatedLog_lines = this.getLog_lines();
		log_lines = generatedLog_lines;
		while (line_breaks <= log_lines && cur_pos != 0) {
			if (!utf16) {
				cur_pos--;
			} else {
					cur_pos -= 2;
			} 
			.fseek(tmp_file, cur_pos, SEEK_SET);
			if (!utf16) {
				bytes_read = .fread(bvalue, 1, 1, tmp_file);
				if (bytes_read == 1 && bvalue == (byte)'\n') {
					line_breaks++;
				} 
			} else {
					bytes_read = .fread(value, 2, 1, tmp_file);
					if (bytes_read == 2 && value == (byte)L'\n') {
						line_breaks++;
					} 
			} 
		}
		if (cur_pos != 0) {
			cur_pos += (utf16) ? 2 : 1;
		} 
		.fseek(tmp_file, cur_pos, SEEK_SET);
		Object generatedText = this.getText();
		if (utf16) {
			if (generatedText != NULL) {
				ModernizedCProgram.bfree(generatedText);
				this.setText(NULL);
			} 
			this.setText(ModernizedCProgram.bzalloc(filesize - cur_pos));
			bytes_read = .fread(generatedText, (filesize - cur_pos), 1, tmp_file);
			ModernizedCProgram.remove_cr(generatedText);
			ModernizedCProgram.bfree(tmp_read);
			.fclose(tmp_file);
			return ;
		} 
		tmp_read = ModernizedCProgram.bzalloc((filesize - cur_pos) + 1);
		bytes_read = .fread(tmp_read, filesize - cur_pos, 1, tmp_file);
		.fclose(tmp_file);
		if (generatedText != NULL) {
			ModernizedCProgram.bfree(generatedText);
			this.setText(NULL);
		} 
		this.setText(ModernizedCProgram.bzalloc((.strlen(tmp_read) + 1) * ));
		ModernizedCProgram.os_utf8_to_wcs(tmp_read, .strlen(tmp_read), generatedText, (.strlen(tmp_read) + 1));
		ModernizedCProgram.remove_cr(generatedText);
		ModernizedCProgram.bfree(tmp_read);
	}
	public Object get_ft2_text_width(Object text) {
		Object generatedFont_face = this.getFont_face();
		 slot = generatedFont_face.getGlyph();
		 glyph_index = 0;
		 w = 0;
		 max_w = 0;
		 len = new ();
		if (!text) {
			return 0;
		} 
		len = .wcslen(text);
		for ( i = 0;
		 i < len; i++) {
			glyph_index = .FT_Get_Char_Index(generatedFont_face, text[i]);
			.FT_Load_Glyph(generatedFont_face, glyph_index, FT_LOAD_DEFAULT);
			if (text[i] == (byte)L'\n') {
				w = 0;
			} else {
					w += slot.getAdvance().getX() >> 6;
					if (w > max_w) {
						max_w = w;
					} 
			} 
		}
		return max_w;
	}
	public Object init_font() {
		 index = new ();
		Byte generatedFont_name = this.getFont_name();
		Object generatedFont_size = this.getFont_size();
		Byte generatedFont_style = this.getFont_style();
		Object generatedFont_flags = this.getFont_flags();
		byte path = ModernizedCProgram.get_font_path(generatedFont_name, generatedFont_size, generatedFont_style, generatedFont_flags, index);
		if (!path) {
			return false;
		} 
		Object generatedFont_face = this.getFont_face();
		if (generatedFont_face != NULL) {
			.FT_Done_Face(generatedFont_face);
			this.setFont_face(NULL);
		} 
		return .FT_New_Face(ModernizedCProgram.ft2_lib, path, index, generatedFont_face) == 0;
	}
	public Byte getFont_name() {
		return font_name;
	}
	public void setFont_name(Byte newFont_name) {
		font_name = newFont_name;
	}
	public Byte getFont_style() {
		return font_style;
	}
	public void setFont_style(Byte newFont_style) {
		font_style = newFont_style;
	}
	public Object getFont_size() {
		return font_size;
	}
	public void setFont_size(Object newFont_size) {
		font_size = newFont_size;
	}
	public Object getFont_flags() {
		return font_flags;
	}
	public void setFont_flags(Object newFont_flags) {
		font_flags = newFont_flags;
	}
	public Object getFile_load_failed() {
		return file_load_failed;
	}
	public void setFile_load_failed(Object newFile_load_failed) {
		file_load_failed = newFile_load_failed;
	}
	public Object getFrom_file() {
		return from_file;
	}
	public void setFrom_file(Object newFrom_file) {
		from_file = newFrom_file;
	}
	public Byte getText_file() {
		return text_file;
	}
	public void setText_file(Byte newText_file) {
		text_file = newText_file;
	}
	public Object getText() {
		return text;
	}
	public void setText(Object newText) {
		text = newText;
	}
	public Object getM_timestamp() {
		return m_timestamp;
	}
	public void setM_timestamp(Object newM_timestamp) {
		m_timestamp = newM_timestamp;
	}
	public Object getUpdate_file() {
		return update_file;
	}
	public void setUpdate_file(Object newUpdate_file) {
		update_file = newUpdate_file;
	}
	public Object getLast_checked() {
		return last_checked;
	}
	public void setLast_checked(Object newLast_checked) {
		last_checked = newLast_checked;
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
	public Object getMax_h() {
		return max_h;
	}
	public void setMax_h(Object newMax_h) {
		max_h = newMax_h;
	}
	public Object getCustom_width() {
		return custom_width;
	}
	public void setCustom_width(Object newCustom_width) {
		custom_width = newCustom_width;
	}
	public Object getTexbuf_x() {
		return texbuf_x;
	}
	public void setTexbuf_x(Object newTexbuf_x) {
		texbuf_x = newTexbuf_x;
	}
	public Object getTexbuf_y() {
		return texbuf_y;
	}
	public void setTexbuf_y(Object newTexbuf_y) {
		texbuf_y = newTexbuf_y;
	}
	public Object getColor() {
		return color;
	}
	public void setColor(Object newColor) {
		color = newColor;
	}
	public Object getColorbuf() {
		return colorbuf;
	}
	public void setColorbuf(Object newColorbuf) {
		colorbuf = newColorbuf;
	}
	public Object getCur_scroll() {
		return cur_scroll;
	}
	public void setCur_scroll(Object newCur_scroll) {
		cur_scroll = newCur_scroll;
	}
	public Object getScroll_speed() {
		return scroll_speed;
	}
	public void setScroll_speed(Object newScroll_speed) {
		scroll_speed = newScroll_speed;
	}
	public Object getTex() {
		return tex;
	}
	public void setTex(Object newTex) {
		tex = newTex;
	}
	public Object getCacheglyphs() {
		return cacheglyphs;
	}
	public void setCacheglyphs(Object newCacheglyphs) {
		cacheglyphs = newCacheglyphs;
	}
	public Object getFont_face() {
		return font_face;
	}
	public void setFont_face(Object newFont_face) {
		font_face = newFont_face;
	}
	public Object getTexbuf() {
		return texbuf;
	}
	public void setTexbuf(Object newTexbuf) {
		texbuf = newTexbuf;
	}
	public Object getVbuf() {
		return vbuf;
	}
	public void setVbuf(Object newVbuf) {
		vbuf = newVbuf;
	}
	public Object getDraw_effect() {
		return draw_effect;
	}
	public void setDraw_effect(Object newDraw_effect) {
		draw_effect = newDraw_effect;
	}
	public Object getOutline_text() {
		return outline_text;
	}
	public void setOutline_text(Object newOutline_text) {
		outline_text = newOutline_text;
	}
	public Object getDrop_shadow() {
		return drop_shadow;
	}
	public void setDrop_shadow(Object newDrop_shadow) {
		drop_shadow = newDrop_shadow;
	}
	public Object getLog_mode() {
		return log_mode;
	}
	public void setLog_mode(Object newLog_mode) {
		log_mode = newLog_mode;
	}
	public Object getWord_wrap() {
		return word_wrap;
	}
	public void setWord_wrap(Object newWord_wrap) {
		word_wrap = newWord_wrap;
	}
	public Object getLog_lines() {
		return log_lines;
	}
	public void setLog_lines(Object newLog_lines) {
		log_lines = newLog_lines;
	}
	public obs_source getSrc() {
		return src;
	}
	public void setSrc(obs_source newSrc) {
		src = newSrc;
	}
}
