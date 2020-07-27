package application;

// VTT files are a collection of REGION, STYLE and CUE blocks.
// XXX: Comments (NOTE blocks) are ignored
public class _vtt_t {
	private _vtt_block_t region_head;
	private _vtt_block_t region_tail;
	private _vtt_block_t style_head;
	private _vtt_block_t style_tail;
	private _vtt_block_t cue_head;
	private _vtt_block_t cue_tail;
	
	public _vtt_t(_vtt_block_t region_head, _vtt_block_t region_tail, _vtt_block_t style_head, _vtt_block_t style_tail, _vtt_block_t cue_head, _vtt_block_t cue_tail) {
		setRegion_head(region_head);
		setRegion_tail(region_tail);
		setStyle_head(style_head);
		setStyle_tail(style_tail);
		setCue_head(cue_head);
		setCue_tail(cue_tail);
	}
	public _vtt_t() {
	}
	
	public _vtt_t vtt_new() {
		vtt_t vtt = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(vtt, 0, /*Error: Unsupported expression*/);
		return vtt;
	}
	public void vtt_free() {
		_vtt_block_t generatedRegion_head = this.getRegion_head();
		while (generatedRegion_head != ((Object)0)) {
			this.setRegion_head(generatedRegion_head.vtt_block_free_head());
		}
		_vtt_block_t generatedStyle_head = this.getStyle_head();
		while (generatedStyle_head != ((Object)0)) {
			this.setStyle_head(generatedStyle_head.vtt_block_free_head());
		}
		_vtt_block_t generatedCue_head = this.getCue_head();
		while (generatedCue_head != ((Object)0)) {
			this.setCue_head(generatedCue_head.vtt_block_free_head());
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(vtt);
	}
	public void vtt_cue_free_head() {
		_vtt_block_t generatedCue_head = this.getCue_head();
		this.setCue_head(generatedCue_head.vtt_block_free_head());
		if (generatedCue_head == ((Object)0)) {
			this.setCue_tail(((Object)0));
		} 
	}
	public void vtt_style_free_head() {
		_vtt_block_t generatedStyle_head = this.getStyle_head();
		this.setStyle_head(generatedStyle_head.vtt_block_free_head());
		if (generatedStyle_head == ((Object)0)) {
			this.setStyle_tail(((Object)0));
		} 
	}
	public void vtt_region_free_head() {
		_vtt_block_t generatedRegion_head = this.getRegion_head();
		this.setRegion_head(generatedRegion_head.vtt_block_free_head());
		if (generatedRegion_head == ((Object)0)) {
			this.setRegion_tail(((Object)0));
		} 
	}
	public _vtt_t vtt_parse(Object data, Object size) {
		_vtt_t _vtt_t = new _vtt_t();
		return _vtt_t._vtt_parse(data, size, 0);
	}
	public _vtt_t _vtt_parse(Object data, Object size, int srt_mode) {
		vtt_t vtt = ((Object)0);
		double str_pts = 0;
		double end_pts = 0;
		size_t line_length = 0;
		size_t trimmed_length = 0;
		byte cue_settings;
		VTT_BLOCK_TYPE block_type;
		size_t cue_id_length = 0;
		utf8_char_t cue_id = ((Object)0);
		if (!data || !size || size < 6) {
			return ((Object)0);
		} 
		// TODO: Support UTF-8 BOM?if (!srt_mode && /*Error: Function owner not recognized*/strncmp(data, "WEBVTT", 6) != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Invalid webvtt header: %.*s\n", 6, data);
			return ((Object)0);
		} 
		// WebVTT files must start with WEBVTT
		data += 6;
		size -= 6;
		_vtt_t _vtt_t = new _vtt_t();
		vtt = _vtt_t.vtt_new();
		_vtt_block_t _vtt_block_t = new _vtt_block_t();
		byte[] generatedCue_id = block.getCue_id();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			line_length = 0;
			do {
				data += line_length;
				size -= line_length;
				line_length = ModernizedCProgram.utf8_line_length(data);
				trimmed_length = ModernizedCProgram.utf8_trimmed_length(data, line_length);
			} while (0 < line_length && 0 == trimmed_length);
			if (0 == line_length) {
				break;
			} 
			if (ModernizedCProgram.strnstr(data, "REGION", line_length) != ((Object)0)) {
				VTT_BLOCK_TYPE.block_type = VTT_BLOCK_TYPE.VTT_REGION;
			}  else if (ModernizedCProgram.strnstr(data, "STYLE", line_length) != ((Object)0)) {
				VTT_BLOCK_TYPE.block_type = VTT_BLOCK_TYPE.VTT_STYLE;
			}  else if (ModernizedCProgram.strnstr(data, "NOTE", line_length) != ((Object)0)) {
				VTT_BLOCK_TYPE.block_type = VTT_BLOCK_TYPE.VTT_NOTE;
			}  else if (ModernizedCProgram.strnstr(data, "-->", line_length) != ((Object)0)) {
				VTT_BLOCK_TYPE.block_type = VTT_BLOCK_TYPE.VTT_CUE;
				ModernizedCProgram.parse_timestamps(data, str_pts, end_pts, cue_settings);
				if (str_pts == -1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Bad timestamp: %.*s\n", (int)line_length, data);
					return ((Object)0);
				} 
			} else {
					if (cue_id != ((Object)0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "ERR: Unrecognized block\n");
						return ((Object)0);
					} 
					cue_id = data;
					cue_id_length = line_length;
					data += line_length;
					size -= line_length;
					continue;
			} 
			data += line_length;
			size -= line_length;
			utf8_char_t text = data;
			size_t text_size = 0;
			line_length = 0;
			do {
				text_size += line_length;
				line_length = ModernizedCProgram.utf8_line_length(data);
				trimmed_length = ModernizedCProgram.utf8_trimmed_length(data, line_length);
				data += line_length;
				size -= line_length;
			} while (trimmed_length);
			vtt_block_t block = _vtt_block_t.vtt_block_new(vtt, text, text_size, VTT_BLOCK_TYPE.block_type);
			if (VTT_BLOCK_TYPE.block_type == VTT_BLOCK_TYPE.VTT_CUE) {
				block.setTimestamp(str_pts);
				block.setDuration(end_pts - str_pts);
				block.setCue_settings(cue_settings);
				if (cue_id != ((Object)0)) {
					block.setCue_id(/*Error: Function owner not recognized*/malloc(cue_id_length + 1));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedCue_id, cue_id, cue_id_length);
					generatedCue_id[cue_id_length] = (byte)'\0';
				} 
			} 
			cue_id = ((Object)0);
		}
		return vtt;
	}
	public void _dump() {
		vtt_block_t block = new vtt_block_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("WEBVTT\r\n\r\n");
		_vtt_block_t generatedRegion_head = this.getRegion_head();
		block = generatedRegion_head;
		_vtt_block_t generatedNext = block.getNext();
		while (block != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("REGION\r\n%s\r\n", block.vtt_block_data());
			block = generatedNext;
		}
		_vtt_block_t generatedStyle_head = this.getStyle_head();
		block = generatedStyle_head;
		while (block != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("STYLE\r\n%s\r\n", block.vtt_block_data());
			block = generatedNext;
		}
		_vtt_block_t generatedCue_head = this.getCue_head();
		block = generatedCue_head;
		double generatedTimestamp = block.getTimestamp();
		double generatedDuration = block.getDuration();
		byte[] generatedCue_id = block.getCue_id();
		Byte generatedCue_settings = block.getCue_settings();
		while (block != ((Object)0)) {
			int hh1;
			int hh2;
			int mm1;
			int mm2;
			int ss1;
			int ss2;
			int ms1;
			int ms2;
			ModernizedCProgram.vtt_crack_time(generatedTimestamp, hh1, mm1, ss1, ms1);
			ModernizedCProgram.vtt_crack_time(generatedTimestamp + generatedDuration, hh2, mm2, ss2, ms2);
			if (generatedCue_id != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", generatedCue_id);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%02d:%02d:%02d.%03d --> %02d:%02d:%02d.%03d", hh1, mm1, ss1, ms1, hh2, mm2, ss2, ms2);
			if (generatedCue_settings != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" %s", generatedCue_settings);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\r\n%s\r\n", block.vtt_block_data());
		}
	}
	public void vtt_dump() {
		head._dump();
	}
	public _vtt_t srt_parse(Object data, Object size) {
		_vtt_t _vtt_t = new _vtt_t();
		return _vtt_t._vtt_parse(data, size, 1);
	}
	public _vtt_block_t getRegion_head() {
		return region_head;
	}
	public void setRegion_head(_vtt_block_t newRegion_head) {
		region_head = newRegion_head;
	}
	public _vtt_block_t getRegion_tail() {
		return region_tail;
	}
	public void setRegion_tail(_vtt_block_t newRegion_tail) {
		region_tail = newRegion_tail;
	}
	public _vtt_block_t getStyle_head() {
		return style_head;
	}
	public void setStyle_head(_vtt_block_t newStyle_head) {
		style_head = newStyle_head;
	}
	public _vtt_block_t getStyle_tail() {
		return style_tail;
	}
	public void setStyle_tail(_vtt_block_t newStyle_tail) {
		style_tail = newStyle_tail;
	}
	public _vtt_block_t getCue_head() {
		return cue_head;
	}
	public void setCue_head(_vtt_block_t newCue_head) {
		cue_head = newCue_head;
	}
	public _vtt_block_t getCue_tail() {
		return cue_tail;
	}
	public void setCue_tail(_vtt_block_t newCue_tail) {
		cue_tail = newCue_tail;
	}
}
