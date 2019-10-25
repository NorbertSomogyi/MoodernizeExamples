package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* USE_METALINK */
/*
 * OutStruct variables keep track of information relative to curl's
 * output writing, which may take place to a standard stream or a file.
 *
 * 'filename' member is either a pointer to a file name string or NULL
 * when dealing with a standard stream.
 *
 * 'alloc_filename' member is TRUE when string pointed by 'filename' has been
 * dynamically allocated and 'belongs' to this OutStruct, otherwise FALSE.
 *
 * 'is_cd_filename' member is TRUE when string pointed by 'filename' has been
 * set using a server-specified Content-Disposition filename, otherwise FALSE.
 *
 * 's_isreg' member is TRUE when output goes to a regular file, this also
 * implies that output is 'seekable' and 'appendable' and also that member
 * 'filename' points to file name's string. For any standard stream member
 * 's_isreg' will be FALSE.
 *
 * 'fopened' member is TRUE when output goes to a regular file and it
 * has been fopen'ed, requiring it to be closed later on. In any other
 * case this is FALSE.
 *
 * 'stream' member is a pointer to a stream controlling object as returned
 * from a 'fopen' call or a standard stream.
 *
 * 'config' member is a pointer to associated 'OperationConfig' struct.
 *
 * 'bytes' member represents amount written so far.
 *
 * 'init' member holds original file size or offset at which truncation is
 * taking place. Always zero unless appending to a non-empty regular file.
 *
 * 'metalink_parser' member is a pointer to Metalink XML parser
 * context.
 */
public class OutStruct {
	private Object filename;
	private  alloc_filename;
	private  is_cd_filename;
	private  s_isreg;
	private  fopened;
	private Object stream;
	private Object config;
	private Object bytes;
	private Object init;
	
	public OutStruct(Object filename,  alloc_filename,  is_cd_filename,  s_isreg,  fopened, Object stream, Object config, Object bytes, Object init) {
		setFilename(filename);
		setAlloc_filename(alloc_filename);
		setIs_cd_filename(is_cd_filename);
		setS_isreg(s_isreg);
		setFopened(fopened);
		setStream(stream);
		setConfig(config);
		setBytes(bytes);
		setInit(init);
	}
	public OutStruct() {
	}
	
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public  getAlloc_filename() {
		return alloc_filename;
	}
	public void setAlloc_filename( newAlloc_filename) {
		alloc_filename = newAlloc_filename;
	}
	public  getIs_cd_filename() {
		return is_cd_filename;
	}
	public void setIs_cd_filename( newIs_cd_filename) {
		is_cd_filename = newIs_cd_filename;
	}
	public  getS_isreg() {
		return s_isreg;
	}
	public void setS_isreg( newS_isreg) {
		s_isreg = newS_isreg;
	}
	public  getFopened() {
		return fopened;
	}
	public void setFopened( newFopened) {
		fopened = newFopened;
	}
	public Object getStream() {
		return stream;
	}
	public void setStream(Object newStream) {
		stream = newStream;
	}
	public Object getConfig() {
		return config;
	}
	public void setConfig(Object newConfig) {
		config = newConfig;
	}
	public Object getBytes() {
		return bytes;
	}
	public void setBytes(Object newBytes) {
		bytes = newBytes;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
}
