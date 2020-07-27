package application;

/*
  Copyright (C) 2005, 2006, 2008, 2011, 2016 Rocky Bernstein <rocky@gnu.org>
  Copyright (C) 2000, 2004, 2005 Herbert Valerio Riedel <hvr@gnu.org>

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/* #define STREAM_DEBUG  */
/*
 * DataSource implementations
 */
public class _CdioDataSource {
	private Object user_data;
	private  op;
	private int is_open;
	private Object position;
	
	public _CdioDataSource(Object user_data,  op, int is_open, Object position) {
		setUser_data(user_data);
		setOp(op);
		setIs_open(is_open);
		setPosition(position);
	}
	public _CdioDataSource() {
	}
	
	public void cdio_stream_close() {
		if (!p_obj) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedIs_open = this.getIs_open();
		Object generatedUser_data = this.getUser_data();
		if (generatedIs_open) {
			ModernizedCProgram.cdio_debug("closed source...");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data);
			this.setIs_open(0);
			this.setPosition(0);
		} 
	}
	public void cdio_stream_destroy() {
		if (!p_obj) {
			return /*Error: Unsupported expression*/;
		} 
		p_obj.cdio_stream_close();
		Object generatedUser_data = this.getUser_data();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data);
		this.setUser_data(NULL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(p_obj/**
		  Like 3 fgetpos.
		
		  This function gets the current file position indicator for the stream
		  pointed to by stream.
		
		  @return unpon successful completion, return value is positive, else,
		  the global variable errno is set to indicate the error.
		*/);
	}
	/*out*/
	public Object cdio_stream_getpos(Object i_offset) {
		int generatedIs_open = this.getIs_open();
		if (!p_obj || !generatedIs_open) {
			return DRIVER_OP_UNINIT;
		} 
		Object generatedPosition = this.getPosition();
		return i_offset = generatedPosition;
	}
	public _CdioDataSource cdio_stream_new(Object user_data, Object funcs) {
		CdioDataSource_t new_obj = new CdioDataSource_t();
		new_obj = /*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		((new_obj != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("new_obj != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\_cdio_stream.c", 102));
		new_obj.setUser_data(user_data);
		 generatedOp = new_obj.getOp();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((generatedOp), funcs, /*Error: Unsupported expression*/);
		return new_obj/*
		   Open if not already open.
		   Return false if we hit an error. Errno should be set for that error.
		*/;
	}
	public Object _cdio_stream_open_if_necessary() {
		if (!p_obj) {
			return false;
		} 
		int generatedIs_open = this.getIs_open();
		Object generatedUser_data = this.getUser_data();
		if (!generatedIs_open) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data)) {
				ModernizedCProgram.cdio_warn("could not open input stream...");
				return false;
			} else {
					ModernizedCProgram.cdio_debug("opened source...");
					this.setIs_open(1);
					this.setPosition(0);
			} 
		} 
		return true/**
		  Like fread(3) and in fact may be the same.
		
		  DESCRIPTION:
		  The function fread reads nmemb elements of data, each size bytes long,
		  from the stream pointed to by stream, storing them at the location
		  given by ptr.
		
		  RETURN VALUE:
		  return the number of items successfully read or written (i.e.,
		  not the number of characters).  If an error occurs, or the
		  end-of-file is reached, the return value is a short item count
		  (or zero).
		
		  We do not distinguish between end-of-file and error, and callers
		  must use feof(3) and ferror(3) to determine which occurred.
		*/;
	}
	public Object cdio_stream_read(Object ptr, Object size, Object nmemb) {
		long read_bytes;
		if (!p_obj) {
			return 0;
		} 
		if (!p_obj._cdio_stream_open_if_necessary()) {
			return 0;
		} 
		Object generatedUser_data = this.getUser_data();
		read_bytes = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data, ptr, size * nmemb);
		Object generatedPosition = this.getPosition();
		generatedPosition += read_bytes;
		return read_bytes/**
		  Like 3 fseek and in fact may be the same.
		
		  This  function sets the file position indicator for the stream
		  pointed to by stream.  The new position, measured in bytes, is obtained
		  by  adding offset bytes to the position specified by whence.  If whence
		  is set to SEEK_SET, SEEK_CUR, or SEEK_END, the offset  is  relative  to
		  the  start of the file, the current position indicator, or end-of-file,
		  respectively.  A successful call to the fseek function clears the end-
		  of-file indicator for the stream and undoes any effects of the
		  ungetc(3) function on the same stream.
		
		  @return unpon successful completion, return value is positive, else,
		  the global variable errno is set to indicate the error.
		*/;
	}
	public int cdio_stream_seek(Object offset, int whence) {
		if (!p_obj) {
			return DRIVER_OP_UNINIT;
		} 
		if (!p_obj._cdio_stream_open_if_necessary()) {
			return /* errno is set by _cdio_stream_open_if necessary. */DRIVER_OP_ERROR;
		} 
		if (offset < 0) {
			return DRIVER_OP_ERROR;
		} 
		Object generatedPosition = this.getPosition();
		if (generatedPosition < 0) {
			return DRIVER_OP_ERROR;
		} 
		Object generatedUser_data = this.getUser_data();
		if (generatedPosition != offset) {
			this.setPosition(offset);
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data, offset, whence);
		} 
		return 0/**
		  Return whatever size of stream reports, I guess unit size is bytes.
		  On error return -1;
		 */;
	}
	public Object cdio_stream_stat() {
		if (!p_obj) {
			return -1;
		} 
		if (!p_obj._cdio_stream_open_if_necessary()) {
			return -1;
		} 
		Object generatedUser_data = this.getUser_data();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUser_data);
	}
	public void cdio_stdio_destroy() {
		p_obj.cdio_stream_destroy();
	}
	public _CdioDataSource cdio_stdio_new(Object pathname) {
		CdioDataSource_t new_obj = NULL;
		cdio_stream_io_functions funcs = new cdio_stream_io_functions(NULL, NULL, NULL, NULL, NULL, NULL);
		_UserData ud = NULL;
		stat statbuf = new stat();
		byte pathdup;
		if (pathname == NULL) {
			return NULL;
		} 
		pathdup = ModernizedCProgram._cdio_strdup_fixpath(/* MinGW may require a translated path */pathname);
		if (pathdup == NULL) {
			return NULL;
		} 
		if (/*Error: Function owner not recognized*/stat(pathdup, statbuf) == -1) {
			ModernizedCProgram.cdio_warn("could not retrieve file info for `%s': %s", pathdup, /*Error: Function owner not recognized*/strerror(errno));
			ModernizedCProgram.cdio_free(pathdup);
			return NULL;
		} 
		ud = /*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		((ud != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("ud != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\_cdio_stdio.c", 269));
		ud.setPathname(pathdup);
		Object generatedStat = statbuf.getStat();
		ud.setSt_size(generatedStat);
		funcs.setOpen(_stdio_open);
		funcs.setSeek(_stdio_seek);
		funcs.setStat(_stdio_stat);
		funcs.setRead(_stdio_read);
		funcs.setClose(_stdio_close);
		funcs.setFree(_stdio_free);
		_CdioDataSource _CdioDataSource = new _CdioDataSource();
		new_obj = _CdioDataSource.cdio_stream_new(ud, funcs);
		return new_obj/*
		 * Local variables:
		 *  c-file-style: "gnu"
		 *  tab-width: 8
		 *  indent-tabs-mode: nil
		 * End:
		 */;
	}
	public Object getUser_data() {
		return user_data;
	}
	public void setUser_data(Object newUser_data) {
		user_data = newUser_data;
	}
	public  getOp() {
		return op;
	}
	public void setOp( newOp) {
		op = newOp;
	}
	public int getIs_open() {
		return is_open;
	}
	public void setIs_open(int newIs_open) {
		is_open = newIs_open;
	}
	public Object getPosition() {
		return position;
	}
	public void setPosition(Object newPosition) {
		position = newPosition;
	}
}
