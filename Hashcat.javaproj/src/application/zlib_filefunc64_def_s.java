package application;

public class zlib_filefunc64_def_s {
	private Object zopen64_file;
	private Object zread_file;
	private Object zwrite_file;
	private Object ztell64_file;
	private Object zseek64_file;
	private Object zclose_file;
	private Object zerror_file;
	private Object opaque;
	
	public zlib_filefunc64_def_s(Object zopen64_file, Object zread_file, Object zwrite_file, Object ztell64_file, Object zseek64_file, Object zclose_file, Object zerror_file, Object opaque) {
		setZopen64_file(zopen64_file);
		setZread_file(zread_file);
		setZwrite_file(zwrite_file);
		setZtell64_file(ztell64_file);
		setZseek64_file(zseek64_file);
		setZclose_file(zclose_file);
		setZerror_file(zerror_file);
		setOpaque(opaque);
	}
	public zlib_filefunc64_def_s() {
	}
	
	public void fill_fopen64_filefunc() {
		this.setZopen64_file(fopen64_file_func);
		this.setZread_file(ModernizedCProgram.fread_file_func);
		this.setZwrite_file(ModernizedCProgram.fwrite_file_func);
		this.setZtell64_file(ModernizedCProgram.ftell64_file_func);
		this.setZseek64_file(ModernizedCProgram.fseek64_file_func);
		this.setZclose_file(ModernizedCProgram.fclose_file_func);
		this.setZerror_file(ModernizedCProgram.ferror_file_func);
		this.setOpaque(((Object)0));
	}
	public Object unzOpen2_64(Object path) {
		if (pzlib_filefunc_def != ((Object)0)) {
			zlib_filefunc64_32_def zlib_filefunc64_32_def_fill = new zlib_filefunc64_32_def();
			zlib_filefunc64_32_def_fill.setZfile_func64(pzlib_filefunc_def);
			zlib_filefunc64_32_def_fill.setZtell32_file(((Object)0));
			zlib_filefunc64_32_def_fill.setZseek32_file(((Object)0));
			return zlib_filefunc64_32_def_fill.unzOpenInternal(path, 1);
		} else {
				return ((Object)0).unzOpenInternal(path, 1);
		} 
	}
	public Object zipOpen2_64(Object pathname, int append, Object globalcomment) {
		if (pzlib_filefunc_def != ((Object)0)) {
			zlib_filefunc64_32_def zlib_filefunc64_32_def_fill = new zlib_filefunc64_32_def();
			zlib_filefunc64_32_def_fill.setZfile_func64(pzlib_filefunc_def);
			zlib_filefunc64_32_def_fill.setZtell32_file(((Object)0));
			zlib_filefunc64_32_def_fill.setZseek32_file(((Object)0));
			return zlib_filefunc64_32_def_fill.zipOpen3(pathname, append, globalcomment);
		} else {
				return ((Object)0).zipOpen3(pathname, append, globalcomment);
		} 
	}
	public void fill_win32_filefunc64() {
		this.setZopen64_file(win32_open64_file_func);
		this.setZread_file(ModernizedCProgram.win32_read_file_func);
		this.setZwrite_file(ModernizedCProgram.win32_write_file_func);
		this.setZtell64_file(ModernizedCProgram.win32_tell64_file_func);
		this.setZseek64_file(ModernizedCProgram.win32_seek64_file_func);
		this.setZclose_file(ModernizedCProgram.win32_close_file_func);
		this.setZerror_file(ModernizedCProgram.win32_error_file_func);
		this.setOpaque(((Object)0));
	}
	public void fill_win32_filefunc64A() {
		this.setZopen64_file(win32_open64_file_funcA);
		this.setZread_file(ModernizedCProgram.win32_read_file_func);
		this.setZwrite_file(ModernizedCProgram.win32_write_file_func);
		this.setZtell64_file(ModernizedCProgram.win32_tell64_file_func);
		this.setZseek64_file(ModernizedCProgram.win32_seek64_file_func);
		this.setZclose_file(ModernizedCProgram.win32_close_file_func);
		this.setZerror_file(ModernizedCProgram.win32_error_file_func);
		this.setOpaque(((Object)0));
	}
	public void fill_win32_filefunc64W() {
		this.setZopen64_file(win32_open64_file_funcW);
		this.setZread_file(ModernizedCProgram.win32_read_file_func);
		this.setZwrite_file(ModernizedCProgram.win32_write_file_func);
		this.setZtell64_file(ModernizedCProgram.win32_tell64_file_func);
		this.setZseek64_file(ModernizedCProgram.win32_seek64_file_func);
		this.setZclose_file(ModernizedCProgram.win32_close_file_func);
		this.setZerror_file(ModernizedCProgram.win32_error_file_func);
		this.setOpaque(((Object)0));
	}
	public Object getZopen64_file() {
		return zopen64_file;
	}
	public void setZopen64_file(Object newZopen64_file) {
		zopen64_file = newZopen64_file;
	}
	public Object getZread_file() {
		return zread_file;
	}
	public void setZread_file(Object newZread_file) {
		zread_file = newZread_file;
	}
	public Object getZwrite_file() {
		return zwrite_file;
	}
	public void setZwrite_file(Object newZwrite_file) {
		zwrite_file = newZwrite_file;
	}
	public Object getZtell64_file() {
		return ztell64_file;
	}
	public void setZtell64_file(Object newZtell64_file) {
		ztell64_file = newZtell64_file;
	}
	public Object getZseek64_file() {
		return zseek64_file;
	}
	public void setZseek64_file(Object newZseek64_file) {
		zseek64_file = newZseek64_file;
	}
	public Object getZclose_file() {
		return zclose_file;
	}
	public void setZclose_file(Object newZclose_file) {
		zclose_file = newZclose_file;
	}
	public Object getZerror_file() {
		return zerror_file;
	}
	public void setZerror_file(Object newZerror_file) {
		zerror_file = newZerror_file;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
}
