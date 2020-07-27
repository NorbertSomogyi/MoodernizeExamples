package application;

/* ioapi.h -- IO base function header for compress/uncompress .zip
   part of the MiniZip project - ( http://www.winimage.com/zLibDll/minizip.html )

         Copyright (C) 1998-2010 Gilles Vollant (minizip) ( http://www.winimage.com/zLibDll/minizip.html )

         Modifications for Zip64 support
         Copyright (C) 2009-2010 Mathias Svensson ( http://result42.com )

         For more info read MiniZip_info.txt

         Changes

    Oct-2009 - Defined ZPOS64_T to fpos_t on windows and u_int64_t on linux. (might need to find a better why for this)
    Oct-2009 - Change to fseeko64, ftello64 and fopen64 so large files would work on linux.
               More if/def section may be needed to support other platforms
    Oct-2009 - Defined fxxxx64 calls to normal fopen/ftell/fseek so they would compile on windows.
                          (but you should use iowin32.c for windows instead)

*/
// Linux needs this to support file operation on files larger then 4+GB
// But might need better if/def to select just the platforms that needs them.
// old MSC
/*
#ifndef ZPOS64_T
  #ifdef _WIN32
                #define ZPOS64_T fpos_t
  #else
    #include <stdint.h>
    #define ZPOS64_T uint64_t
  #endif
#endif
*/
/* a type choosen by DEFINE */
/* Maximum unsigned 32-bit value used as placeholder for zip64 */
/* here is the "old" 32 bits structure structure */
public class zlib_filefunc_def_s {
	private Object zopen_file;
	private Object zread_file;
	private Object zwrite_file;
	private Object ztell_file;
	private Object zseek_file;
	private Object zclose_file;
	private Object zerror_file;
	private Object opaque;
	
	public zlib_filefunc_def_s(Object zopen_file, Object zread_file, Object zwrite_file, Object ztell_file, Object zseek_file, Object zclose_file, Object zerror_file, Object opaque) {
		setZopen_file(zopen_file);
		setZread_file(zread_file);
		setZwrite_file(zwrite_file);
		setZtell_file(ztell_file);
		setZseek_file(zseek_file);
		setZclose_file(zclose_file);
		setZerror_file(zerror_file);
		setOpaque(opaque);
	}
	public zlib_filefunc_def_s() {
	}
	
	public Object zipOpen2(Object pathname, int append, Object globalcomment) {
		if (pzlib_filefunc32_def != ((Object)0)) {
			zlib_filefunc64_32_def zlib_filefunc64_32_def_fill = new zlib_filefunc64_32_def();
			zlib_filefunc64_32_def_fill.fill_zlib_filefunc64_32_def_from_filefunc32(pzlib_filefunc32_def);
			return zlib_filefunc64_32_def_fill.zipOpen3(pathname, append, globalcomment);
		} else {
				return ((Object)0).zipOpen3(pathname, append, globalcomment);
		} 
	}
	public void fill_fopen_filefunc() {
		this.setZopen_file(ModernizedCProgram.fopen_file_func);
		this.setZread_file(ModernizedCProgram.fread_file_func);
		this.setZwrite_file(ModernizedCProgram.fwrite_file_func);
		this.setZtell_file(ftell_file_func);
		this.setZseek_file(fseek_file_func);
		this.setZclose_file(ModernizedCProgram.fclose_file_func);
		this.setZerror_file(ModernizedCProgram.ferror_file_func);
		this.setOpaque(((Object)0));
	}
	public void fill_win32_filefunc() {
		this.setZopen_file(ModernizedCProgram.win32_open_file_func);
		this.setZread_file(ModernizedCProgram.win32_read_file_func);
		this.setZwrite_file(ModernizedCProgram.win32_write_file_func);
		this.setZtell_file(win32_tell_file_func);
		this.setZseek_file(win32_seek_file_func);
		this.setZclose_file(ModernizedCProgram.win32_close_file_func);
		this.setZerror_file(ModernizedCProgram.win32_error_file_func);
		this.setOpaque(((Object)0));
	}
	public Object unzOpen2(Object path) {
		if (pzlib_filefunc32_def != ((Object)0)) {
			zlib_filefunc64_32_def zlib_filefunc64_32_def_fill = new zlib_filefunc64_32_def();
			zlib_filefunc64_32_def_fill.fill_zlib_filefunc64_32_def_from_filefunc32(pzlib_filefunc32_def);
			return zlib_filefunc64_32_def_fill.unzOpenInternal(path, 0);
		} else {
				return ((Object)0).unzOpenInternal(path, 0);
		} 
	}
	public Object getZopen_file() {
		return zopen_file;
	}
	public void setZopen_file(Object newZopen_file) {
		zopen_file = newZopen_file;
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
	public Object getZtell_file() {
		return ztell_file;
	}
	public void setZtell_file(Object newZtell_file) {
		ztell_file = newZtell_file;
	}
	public Object getZseek_file() {
		return zseek_file;
	}
	public void setZseek_file(Object newZseek_file) {
		zseek_file = newZseek_file;
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
