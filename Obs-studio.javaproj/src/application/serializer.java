package application;

public class serializer {
	private Object data;
	private Object read;
	private Object write;
	private Object seek;
	private Object get_pos;
	
	public serializer(Object data, Object read, Object write, Object seek, Object get_pos) {
		setData(data);
		setRead(read);
		setWrite(write);
		setSeek(seek);
		setGet_pos(get_pos);
	}
	public serializer() {
	}
	
	public Object s_read(Object data, Object size) {
		if (ModernizedCProgram.s && ModernizedCProgram.s.getRead() && data && size) {
			return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData(), (Object)data, size);
		} 
		return 0;
	}
	public Object s_write(Object data, Object size) {
		if (ModernizedCProgram.s && ModernizedCProgram.s.getWrite() && data && size) {
			return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData(), (Object)data, size);
		} 
		return 0;
	}
	public Object serialize(Object data, Object len) {
		if (ModernizedCProgram.s) {
			if (ModernizedCProgram.s.getWrite()) {
				return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData(), data, len);
			}  else if (ModernizedCProgram.s.getRead()) {
				return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData(), data, len);
			} 
		} 
		return 0;
	}
	public Object serializer_seek(Object offset, serialize_seek_type seek_type) {
		if (ModernizedCProgram.s && ModernizedCProgram.s.getSeek()) {
			return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData(), offset, serialize_seek_type.seek_type);
		} 
		return -1;
	}
	public Object serializer_get_pos() {
		if (ModernizedCProgram.s && ModernizedCProgram.s.getGet_pos()) {
			return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.s.getData());
		} 
		return -1;
	}
	/* formatted this to be similar to the AVIO layout that ffmpeg uses */
	public void s_w8(Object u8) {
		ModernizedCProgram.s.s_write(u8, );
	}
	public void s_wl16(Object u16) {
		ModernizedCProgram.s.s_w8((uint8_t)u16);
		ModernizedCProgram.s.s_w8(u16 >> 8);
	}
	public void s_wl24(Object u24) {
		ModernizedCProgram.s.s_w8((uint8_t)u24);
		ModernizedCProgram.s.s_wl16((uint16_t)(u24 >> 8));
	}
	public void s_wl32(Object u32) {
		ModernizedCProgram.s.s_wl16((uint16_t)u32);
		ModernizedCProgram.s.s_wl16((uint16_t)(u32 >> 16));
	}
	public void s_wl64(Object u64) {
		ModernizedCProgram.s.s_wl32((uint32_t)u64);
		ModernizedCProgram.s.s_wl32((uint32_t)(u64 >> 32));
	}
	public void s_wlf(double f) {
		ModernizedCProgram.s.s_wl32((uint32_t)f);
	}
	public void s_wld(double d) {
		ModernizedCProgram.s.s_wl64((uint64_t)d);
	}
	public void s_wb16(Object u16) {
		ModernizedCProgram.s.s_w8(u16 >> 8);
		ModernizedCProgram.s.s_w8((uint8_t)u16);
	}
	public void s_wb24(Object u24) {
		ModernizedCProgram.s.s_wb16((uint16_t)(u24 >> 8));
		ModernizedCProgram.s.s_w8((uint8_t)u24);
	}
	public void s_wb32(Object u32) {
		ModernizedCProgram.s.s_wb16((uint16_t)(u32 >> 16));
		ModernizedCProgram.s.s_wb16((uint16_t)u32);
	}
	public void s_wb64(Object u64) {
		ModernizedCProgram.s.s_wb32((uint32_t)(u64 >> 32));
		ModernizedCProgram.s.s_wb32((uint32_t)u64);
	}
	public void s_wbf(double f) {
		ModernizedCProgram.s.s_wb32((uint32_t)f);
	}
	public void s_wbd(double d) {
		ModernizedCProgram.s.s_wb64((uint64_t)d);
	}
	public boolean file_input_serializer_init(Object path) {
		ModernizedCProgram.s.setData(ModernizedCProgram.os_fopen(path, "rb"));
		if (!ModernizedCProgram.s.getData()) {
			return 0;
		} 
		ModernizedCProgram.s.setRead(file_input_read);
		ModernizedCProgram.s.setWrite(((Object)0));
		ModernizedCProgram.s.setSeek(file_input_seek);
		ModernizedCProgram.s.setGet_pos(file_input_get_pos);
		return 1;
	}
	public void file_input_serializer_free() {
		if (ModernizedCProgram.s.getData()) {
			.fclose(ModernizedCProgram.s.getData());
		} 
	}
	public boolean file_output_serializer_init(Object path) {
		FILE file = ModernizedCProgram.os_fopen(path, "wb");
		file_output_data out = new file_output_data();
		if (!file) {
			return 0;
		} 
		out = ModernizedCProgram.bzalloc();
		out.setFile(file);
		ModernizedCProgram.s.setData(out);
		ModernizedCProgram.s.setRead(((Object)0));
		ModernizedCProgram.s.setWrite(file_output_write);
		ModernizedCProgram.s.setSeek(file_output_seek);
		ModernizedCProgram.s.setGet_pos(file_output_get_pos);
		return 1;
	}
	public boolean file_output_serializer_init_safe(Object path, Object temp_ext) {
		dstr temp_name = new dstr(0);
		file_output_data out = new file_output_data();
		FILE file = new FILE();
		if (!temp_ext || !temp_ext) {
			return 0;
		} 
		temp_name.dstr_copy(path);
		if (temp_ext != (byte)'.') {
			temp_name.dstr_cat_ch((byte)'.');
		} 
		temp_name.dstr_cat(temp_ext);
		byte generatedArray = temp_name.getArray();
		file = ModernizedCProgram.os_fopen(generatedArray, "wb");
		if (!file) {
			temp_name.dstr_free();
			return 0;
		} 
		out = ModernizedCProgram.bzalloc();
		out.setFile_name(ModernizedCProgram.bstrdup(path));
		out.setTemp_name(generatedArray);
		out.setFile(file);
		ModernizedCProgram.s.setData(out);
		ModernizedCProgram.s.setRead(((Object)0));
		ModernizedCProgram.s.setWrite(file_output_write);
		ModernizedCProgram.s.setSeek(file_output_seek);
		ModernizedCProgram.s.setGet_pos(file_output_get_pos);
		return 1;
	}
	public void file_output_serializer_free() {
		file_output_data out = ModernizedCProgram.s.getData();
		_iobuf generatedFile = out.getFile();
		Byte generatedTemp_name = out.getTemp_name();
		Byte generatedFile_name = out.getFile_name();
		if (out) {
			.fclose(generatedFile);
			if (generatedTemp_name) {
				ModernizedCProgram.os_unlink(generatedFile_name);
				ModernizedCProgram.os_rename(generatedTemp_name, generatedFile_name);
			} 
			ModernizedCProgram.bfree(generatedFile_name);
			ModernizedCProgram.bfree(generatedTemp_name);
			ModernizedCProgram.bfree(out);
		} 
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getRead() {
		return read;
	}
	public void setRead(Object newRead) {
		read = newRead;
	}
	public Object getWrite() {
		return write;
	}
	public void setWrite(Object newWrite) {
		write = newWrite;
	}
	public Object getSeek() {
		return seek;
	}
	public void setSeek(Object newSeek) {
		seek = newSeek;
	}
	public Object getGet_pos() {
		return get_pos;
	}
	public void setGet_pos(Object newGet_pos) {
		get_pos = newGet_pos;
	}
}
