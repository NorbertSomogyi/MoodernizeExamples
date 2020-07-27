package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* <DESC>
 * Gets a file using an SFTP URL.
 * </DESC>
 */
/* define this to switch off the use of ssh-agent in this program */
/*
 * This is an example showing how to get a single file from an SFTP server.
 * It delays the actual destination file creation until the first write
 * callback so that it won't create an empty file in case the remote file
 * doesn't exist or something else fails.
 */
public class FtpFile {
	private Object filename;
	private _iobuf stream;
	
	public FtpFile(Object filename, _iobuf stream) {
		setFilename(filename);
		setStream(stream);
	}
	public FtpFile() {
	}
	
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public _iobuf getStream() {
		return stream;
	}
	public void setStream(_iobuf newStream) {
		stream = newStream;
	}
}
